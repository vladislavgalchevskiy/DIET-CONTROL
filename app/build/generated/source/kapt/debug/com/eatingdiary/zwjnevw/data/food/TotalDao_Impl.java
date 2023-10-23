package com.eatingdiary.zwjnevw.data.food;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.eatingdiary.zwjnevw.data.DateConverter;
import com.eatingdiary.zwjnevw.data.FoodTypeConverters;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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
public final class TotalDao_Impl implements TotalDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Total> __insertionAdapterOfTotal;

  private final DateConverter __dateConverter = new DateConverter();

  private final SharedSQLiteStatement __preparedStmtOfUpdateNutrients;

  private final SharedSQLiteStatement __preparedStmtOfDelNutrients;

  private final FoodTypeConverters __foodTypeConverters = new FoodTypeConverters();

  public TotalDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTotal = new EntityInsertionAdapter<Total>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `total` (`date`,`proteins`,`fats`,`carbs`,`calories`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Total value) {
        final String _tmp = __dateConverter.fromLocalDate(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        stmt.bindLong(2, value.getProteins());
        stmt.bindLong(3, value.getFats());
        stmt.bindLong(4, value.getCarbs());
        stmt.bindLong(5, value.getCalories());
      }
    };
    this.__preparedStmtOfUpdateNutrients = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE total SET proteins = proteins + ?, fats = fats + ?, carbs = carbs + ?, calories = calories + ? WHERE date = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDelNutrients = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE total SET proteins = proteins - ?, fats = fats - ?, carbs = carbs - ?, calories = calories - ? WHERE date = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertTotal(final Total total, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTotal.insert(total);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object upOrInNutrients(final Total item, final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> TotalDao.DefaultImpls.upOrInNutrients(TotalDao_Impl.this, item, __cont), continuation);
  }

  @Override
  public Object updateNutrients(final LocalDate date, final int addProteins, final int addFats,
      final int addCarbs, final int addCalories, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateNutrients.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, addProteins);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, addFats);
        _argIndex = 3;
        _stmt.bindLong(_argIndex, addCarbs);
        _argIndex = 4;
        _stmt.bindLong(_argIndex, addCalories);
        _argIndex = 5;
        final String _tmp = __dateConverter.fromLocalDate(date);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, _tmp);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateNutrients.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object delNutrients(final LocalDate date, final int delProteins, final int delFats,
      final int delCarbs, final int delCalories, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelNutrients.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, delProteins);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, delFats);
        _argIndex = 3;
        _stmt.bindLong(_argIndex, delCarbs);
        _argIndex = 4;
        _stmt.bindLong(_argIndex, delCalories);
        _argIndex = 5;
        final String _tmp = __dateConverter.fromLocalDate(date);
        if (_tmp == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, _tmp);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelNutrients.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Total getTotal(final LocalDate date) {
    final String _sql = "SELECT * FROM total WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __dateConverter.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfProteins = CursorUtil.getColumnIndexOrThrow(_cursor, "proteins");
      final int _cursorIndexOfFats = CursorUtil.getColumnIndexOrThrow(_cursor, "fats");
      final int _cursorIndexOfCarbs = CursorUtil.getColumnIndexOrThrow(_cursor, "carbs");
      final int _cursorIndexOfCalories = CursorUtil.getColumnIndexOrThrow(_cursor, "calories");
      final Total _result;
      if(_cursor.moveToFirst()) {
        final LocalDate _tmpDate;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfDate);
        }
        _tmpDate = __dateConverter.toLocalDate(_tmp_1);
        final int _tmpProteins;
        _tmpProteins = _cursor.getInt(_cursorIndexOfProteins);
        final int _tmpFats;
        _tmpFats = _cursor.getInt(_cursorIndexOfFats);
        final int _tmpCarbs;
        _tmpCarbs = _cursor.getInt(_cursorIndexOfCarbs);
        final int _tmpCalories;
        _tmpCalories = _cursor.getInt(_cursorIndexOfCalories);
        _result = new Total(_tmpDate,_tmpProteins,_tmpFats,_tmpCarbs,_tmpCalories);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flow<List<LocalDate>> getLastTenDates() {
    final String _sql = "SELECT DISTINCT date FROM total WHERE calories > 0 ORDER BY date DESC LIMIT 10";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"total"}, new Callable<List<LocalDate>>() {
      @Override
      public List<LocalDate> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<LocalDate> _result = new ArrayList<LocalDate>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final LocalDate _item;
            final String _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(0);
            }
            _item = __dateConverter.toLocalDate(_tmp);
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

  @Override
  public Flow<Integer> getAverageCalories() {
    final String _sql = "SELECT AVG(calories) FROM total";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"total"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
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

  @Override
  public Flow<Integer> getProteins(final LocalDate date) {
    final String _sql = "SELECT proteins FROM total WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __dateConverter.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"total"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getInt(0);
            }
          } else {
            _result = null;
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

  @Override
  public Flow<Integer> getFats(final LocalDate date) {
    final String _sql = "SELECT fats FROM total WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __dateConverter.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"total"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getInt(0);
            }
          } else {
            _result = null;
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

  @Override
  public Flow<Integer> getCarbs(final LocalDate date) {
    final String _sql = "SELECT carbs FROM total WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __dateConverter.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"total"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getInt(0);
            }
          } else {
            _result = null;
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

  @Override
  public Flow<Integer> getCalories(final LocalDate date) {
    final String _sql = "SELECT calories FROM total WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __dateConverter.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"total"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getInt(0);
            }
          } else {
            _result = null;
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

  @Override
  public Flow<FoodCount> getPop() {
    final String _sql = "SELECT food, COUNT(food) AS count FROM (SELECT foodLunch AS food FROM lunch UNION ALL SELECT foodBreakfast AS food FROM breakfast UNION ALL SELECT foodDinner AS food FROM dinner UNION ALL SELECT foodSnack AS food FROM snack ) AS food GROUP BY food ORDER BY food ASC, count DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"lunch","breakfast","dinner","snack"}, new Callable<FoodCount>() {
      @Override
      public FoodCount call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFood = 0;
          final int _cursorIndexOfCount = 1;
          final FoodCount _result;
          if(_cursor.moveToFirst()) {
            final FoodData _tmpFood;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfFood)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfFood);
            }
            _tmpFood = __foodTypeConverters.toFoodData(_tmp);
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            _result = new FoodCount(_tmpFood,_tmpCount);
          } else {
            _result = null;
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
