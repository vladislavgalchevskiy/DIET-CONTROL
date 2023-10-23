package com.eatingdiary.zwjnevw.data.workout;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Float;
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
public final class WorkoutItemsDao_Impl implements WorkoutItemsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WorkoutEntity> __insertionAdapterOfWorkoutEntity;

  private final ExerciseConverter __exerciseConverter = new ExerciseConverter();

  private final LocalDateConverter __localDateConverter = new LocalDateConverter();

  private final EntityDeletionOrUpdateAdapter<WorkoutEntity> __updateAdapterOfWorkoutEntity;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public WorkoutItemsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWorkoutEntity = new EntityInsertionAdapter<WorkoutEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `workout_items` (`id`,`name`,`exercise`,`category`,`date`,`completed`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WorkoutEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp = __exerciseConverter.fromExercise(value.getExercise());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        final String _tmp_1 = __exerciseConverter.fromWorkoutCategory(value.getCategory());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
        final String _tmp_2 = __localDateConverter.fromLocalDate(value.getDate());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        final int _tmp_3 = value.getCompleted() ? 1 : 0;
        stmt.bindLong(6, _tmp_3);
      }
    };
    this.__updateAdapterOfWorkoutEntity = new EntityDeletionOrUpdateAdapter<WorkoutEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `workout_items` SET `id` = ?,`name` = ?,`exercise` = ?,`category` = ?,`date` = ?,`completed` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WorkoutEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp = __exerciseConverter.fromExercise(value.getExercise());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        final String _tmp_1 = __exerciseConverter.fromWorkoutCategory(value.getCategory());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
        final String _tmp_2 = __localDateConverter.fromLocalDate(value.getDate());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        final int _tmp_3 = value.getCompleted() ? 1 : 0;
        stmt.bindLong(6, _tmp_3);
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM workout_items WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final WorkoutEntity item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWorkoutEntity.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final WorkoutEntity item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfWorkoutEntity.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final int id, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<WorkoutEntity> getItem(final int id) {
    final String _sql = "SELECT * from workout_items WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_items"}, new Callable<WorkoutEntity>() {
      @Override
      public WorkoutEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfExercise = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "completed");
          final WorkoutEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final Exercise _tmpExercise;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfExercise)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfExercise);
            }
            _tmpExercise = __exerciseConverter.toExercise(_tmp);
            final WorkoutCategory _tmpCategory;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfCategory);
            }
            _tmpCategory = __exerciseConverter.toWorkoutCategory(_tmp_1);
            final LocalDate _tmpDate;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __localDateConverter.toLocalDate(_tmp_2);
            final boolean _tmpCompleted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfCompleted);
            _tmpCompleted = _tmp_3 != 0;
            _result = new WorkoutEntity(_tmpId,_tmpName,_tmpExercise,_tmpCategory,_tmpDate,_tmpCompleted);
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
  public Flow<List<WorkoutEntity>> getItemsOnDate(final LocalDate date) {
    final String _sql = "SELECT * from workout_items WHERE date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __localDateConverter.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_items"}, new Callable<List<WorkoutEntity>>() {
      @Override
      public List<WorkoutEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfExercise = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "completed");
          final List<WorkoutEntity> _result = new ArrayList<WorkoutEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WorkoutEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final Exercise _tmpExercise;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfExercise)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfExercise);
            }
            _tmpExercise = __exerciseConverter.toExercise(_tmp_1);
            final WorkoutCategory _tmpCategory;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfCategory);
            }
            _tmpCategory = __exerciseConverter.toWorkoutCategory(_tmp_2);
            final LocalDate _tmpDate;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __localDateConverter.toLocalDate(_tmp_3);
            final boolean _tmpCompleted;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfCompleted);
            _tmpCompleted = _tmp_4 != 0;
            _item = new WorkoutEntity(_tmpId,_tmpName,_tmpExercise,_tmpCategory,_tmpDate,_tmpCompleted);
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
  public Flow<List<WorkoutEntity>> getAllItems() {
    final String _sql = "SELECT * from workout_items ORDER BY name DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_items"}, new Callable<List<WorkoutEntity>>() {
      @Override
      public List<WorkoutEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfExercise = CursorUtil.getColumnIndexOrThrow(_cursor, "exercise");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "completed");
          final List<WorkoutEntity> _result = new ArrayList<WorkoutEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WorkoutEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final Exercise _tmpExercise;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfExercise)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfExercise);
            }
            _tmpExercise = __exerciseConverter.toExercise(_tmp);
            final WorkoutCategory _tmpCategory;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfCategory);
            }
            _tmpCategory = __exerciseConverter.toWorkoutCategory(_tmp_1);
            final LocalDate _tmpDate;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfDate);
            }
            _tmpDate = __localDateConverter.toLocalDate(_tmp_2);
            final boolean _tmpCompleted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfCompleted);
            _tmpCompleted = _tmp_3 != 0;
            _item = new WorkoutEntity(_tmpId,_tmpName,_tmpExercise,_tmpCategory,_tmpDate,_tmpCompleted);
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
  public Flow<Integer> getCompletedItemCountOnDate(final LocalDate date) {
    final String _sql = "SELECT COUNT(*) from workout_items WHERE date = ? AND completed = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp = __localDateConverter.fromLocalDate(date);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_items"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(0);
            }
            _result = _tmp_1;
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
  public Flow<List<LocalDate>> getLastTenDatesWithCompletedExercise() {
    final String _sql = "SELECT DISTINCT date FROM workout_items WHERE completed = 1 ORDER BY date DESC LIMIT 10";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_items"}, new Callable<List<LocalDate>>() {
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
            _item = __localDateConverter.toLocalDate(_tmp);
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
  public Flow<List<LocalDate>> getLastSeriesOfDaysWithCompletedWorkout() {
    final String _sql = "SELECT DISTINCT date FROM workout_items WHERE completed = 1 ORDER BY date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_items"}, new Callable<List<LocalDate>>() {
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
            _item = __localDateConverter.toLocalDate(_tmp);
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
  public Flow<Float> getAverageExercisesPerDay() {
    final String _sql = "SELECT AVG(exerciseCount) FROM (SELECT COUNT(*) as exerciseCount FROM workout_items WHERE completed = 1 GROUP BY date) as counts";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_items"}, new Callable<Float>() {
      @Override
      public Float call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Float _result;
          if(_cursor.moveToFirst()) {
            final Float _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getFloat(0);
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
  public Flow<CategoryCount> getMostPopularCategory() {
    final String _sql = "SELECT category, COUNT(*) as count FROM workout_items WHERE completed = 1 GROUP BY category ORDER BY count DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_items"}, new Callable<CategoryCount>() {
      @Override
      public CategoryCount call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategory = 0;
          final int _cursorIndexOfCount = 1;
          final CategoryCount _result;
          if(_cursor.moveToFirst()) {
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            _result = new CategoryCount(_tmpCategory,_tmpCount);
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
  public Flow<ExerciseCount> getMostPopularExercise() {
    final String _sql = "SELECT exercise, COUNT(*) as count FROM workout_items WHERE completed = 1 GROUP BY exercise ORDER BY count DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"workout_items"}, new Callable<ExerciseCount>() {
      @Override
      public ExerciseCount call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfExercise = 0;
          final int _cursorIndexOfCount = 1;
          final ExerciseCount _result;
          if(_cursor.moveToFirst()) {
            final String _tmpExercise;
            if (_cursor.isNull(_cursorIndexOfExercise)) {
              _tmpExercise = null;
            } else {
              _tmpExercise = _cursor.getString(_cursorIndexOfExercise);
            }
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            _result = new ExerciseCount(_tmpExercise,_tmpCount);
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
