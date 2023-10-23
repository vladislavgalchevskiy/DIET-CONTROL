package com.eatingdiary.zwjnevw.data.food;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.eatingdiary.zwjnevw.data.DateConverter;
import com.eatingdiary.zwjnevw.data.FoodTypeConverters;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LunchDao_Impl implements LunchDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Lunch> __insertionAdapterOfLunch;

  private final DateConverter __dateConverter = new DateConverter();

  private final FoodTypeConverters __foodTypeConverters = new FoodTypeConverters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteFoodById;

  public LunchDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLunch = new EntityInsertionAdapter<Lunch>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `lunch` (`id`,`date`,`foodLunch`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lunch value) {
        stmt.bindLong(1, value.getId());
        final String _tmp = __dateConverter.fromLocalDate(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final String _tmp_1 = __foodTypeConverters.fromFoodData(value.getFoodLunch());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
      }
    };
    this.__preparedStmtOfDeleteFoodById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM lunch WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertFood(final Lunch food, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfLunch.insert(food);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFoodById(final long id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFoodById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteFoodById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Lunch>> getFood(final LocalDate date) {
    final String _sql = "SELECT * FROM lunch WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __dateConverter.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"lunch"}, new Callable<List<Lunch>>() {
      @Override
      public List<Lunch> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfFoodLunch = CursorUtil.getColumnIndexOrThrow(_cursor, "foodLunch");
          final List<Lunch> _result = new ArrayList<Lunch>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Lunch _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final LocalDate _tmpDate;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toLocalDate(_tmp_1);
            final FoodData _tmpFoodLunch;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfFoodLunch)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfFoodLunch);
            }
            _tmpFoodLunch = __foodTypeConverters.toFoodData(_tmp_2);
            _item = new Lunch(_tmpId,_tmpDate,_tmpFoodLunch);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
