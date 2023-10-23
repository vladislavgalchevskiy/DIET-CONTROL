package com.eatingdiary.zwjnevw.data.workout;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WorkoutCategoryDao_Impl implements WorkoutCategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WorkoutCategory> __insertionAdapterOfWorkoutCategory;

  private final ExerciseConverter __exerciseConverter = new ExerciseConverter();

  private final EntityDeletionOrUpdateAdapter<WorkoutCategory> __deletionAdapterOfWorkoutCategory;

  private final EntityDeletionOrUpdateAdapter<WorkoutCategory> __updateAdapterOfWorkoutCategory;

  public WorkoutCategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWorkoutCategory = new EntityInsertionAdapter<WorkoutCategory>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `workout_categories` (`id`,`name`,`exercises`,`icon`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WorkoutCategory value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp = __exerciseConverter.toString(value.getExercises());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        stmt.bindLong(4, value.getIcon());
      }
    };
    this.__deletionAdapterOfWorkoutCategory = new EntityDeletionOrUpdateAdapter<WorkoutCategory>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `workout_categories` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WorkoutCategory value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfWorkoutCategory = new EntityDeletionOrUpdateAdapter<WorkoutCategory>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `workout_categories` SET `id` = ?,`name` = ?,`exercises` = ?,`icon` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WorkoutCategory value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp = __exerciseConverter.toString(value.getExercises());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        stmt.bindLong(4, value.getIcon());
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object insert(final WorkoutCategory item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWorkoutCategory.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final WorkoutCategory item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfWorkoutCategory.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final WorkoutCategory item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfWorkoutCategory.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<WorkoutCategory> getItem(final int id) {
    final String _sql = "SELECT * from workout_categories WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_categories"}, new Callable<WorkoutCategory>() {
      @Override
      public WorkoutCategory call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfExercises = CursorUtil.getColumnIndexOrThrow(_cursor, "exercises");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final WorkoutCategory _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final List<Exercise> _tmpExercises;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfExercises)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfExercises);
            }
            _tmpExercises = __exerciseConverter.fromString(_tmp);
            final int _tmpIcon;
            _tmpIcon = _cursor.getInt(_cursorIndexOfIcon);
            _result = new WorkoutCategory(_tmpId,_tmpName,_tmpExercises,_tmpIcon);
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
  public Flow<List<WorkoutCategory>> getAllItems() {
    final String _sql = "SELECT * from workout_categories ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_categories"}, new Callable<List<WorkoutCategory>>() {
      @Override
      public List<WorkoutCategory> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfExercises = CursorUtil.getColumnIndexOrThrow(_cursor, "exercises");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final List<WorkoutCategory> _result = new ArrayList<WorkoutCategory>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WorkoutCategory _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final List<Exercise> _tmpExercises;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfExercises)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfExercises);
            }
            _tmpExercises = __exerciseConverter.fromString(_tmp);
            final int _tmpIcon;
            _tmpIcon = _cursor.getInt(_cursorIndexOfIcon);
            _item = new WorkoutCategory(_tmpId,_tmpName,_tmpExercises,_tmpIcon);
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
