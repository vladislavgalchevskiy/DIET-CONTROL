package com.eatingdiary.zwjnevw.data.food;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodDatabase_Impl extends FoodDatabase {
  private volatile BreakfastDao _breakfastDao;

  private volatile LunchDao _lunchDao;

  private volatile DinnerDao _dinnerDao;

  private volatile SnackDao _snackDao;

  private volatile TotalDao _totalDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `breakfast` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL, `foodBreakfast` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `lunch` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL, `foodLunch` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `dinner` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL, `foodDinner` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `snack` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL, `foodSnack` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `total` (`date` TEXT NOT NULL, `proteins` INTEGER NOT NULL, `fats` INTEGER NOT NULL, `carbs` INTEGER NOT NULL, `calories` INTEGER NOT NULL, PRIMARY KEY(`date`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '53549cf08fa1f384f564a4500fc909c4')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `breakfast`");
        _db.execSQL("DROP TABLE IF EXISTS `lunch`");
        _db.execSQL("DROP TABLE IF EXISTS `dinner`");
        _db.execSQL("DROP TABLE IF EXISTS `snack`");
        _db.execSQL("DROP TABLE IF EXISTS `total`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBreakfast = new HashMap<String, TableInfo.Column>(3);
        _columnsBreakfast.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBreakfast.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBreakfast.put("foodBreakfast", new TableInfo.Column("foodBreakfast", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBreakfast = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBreakfast = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBreakfast = new TableInfo("breakfast", _columnsBreakfast, _foreignKeysBreakfast, _indicesBreakfast);
        final TableInfo _existingBreakfast = TableInfo.read(_db, "breakfast");
        if (! _infoBreakfast.equals(_existingBreakfast)) {
          return new RoomOpenHelper.ValidationResult(false, "breakfast(com.eatingdiary.zwjnevw.data.food.Breakfast).\n"
                  + " Expected:\n" + _infoBreakfast + "\n"
                  + " Found:\n" + _existingBreakfast);
        }
        final HashMap<String, TableInfo.Column> _columnsLunch = new HashMap<String, TableInfo.Column>(3);
        _columnsLunch.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLunch.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLunch.put("foodLunch", new TableInfo.Column("foodLunch", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLunch = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLunch = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLunch = new TableInfo("lunch", _columnsLunch, _foreignKeysLunch, _indicesLunch);
        final TableInfo _existingLunch = TableInfo.read(_db, "lunch");
        if (! _infoLunch.equals(_existingLunch)) {
          return new RoomOpenHelper.ValidationResult(false, "lunch(com.eatingdiary.zwjnevw.data.food.Lunch).\n"
                  + " Expected:\n" + _infoLunch + "\n"
                  + " Found:\n" + _existingLunch);
        }
        final HashMap<String, TableInfo.Column> _columnsDinner = new HashMap<String, TableInfo.Column>(3);
        _columnsDinner.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDinner.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDinner.put("foodDinner", new TableInfo.Column("foodDinner", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDinner = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDinner = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDinner = new TableInfo("dinner", _columnsDinner, _foreignKeysDinner, _indicesDinner);
        final TableInfo _existingDinner = TableInfo.read(_db, "dinner");
        if (! _infoDinner.equals(_existingDinner)) {
          return new RoomOpenHelper.ValidationResult(false, "dinner(com.eatingdiary.zwjnevw.data.food.Dinner).\n"
                  + " Expected:\n" + _infoDinner + "\n"
                  + " Found:\n" + _existingDinner);
        }
        final HashMap<String, TableInfo.Column> _columnsSnack = new HashMap<String, TableInfo.Column>(3);
        _columnsSnack.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSnack.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSnack.put("foodSnack", new TableInfo.Column("foodSnack", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSnack = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSnack = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSnack = new TableInfo("snack", _columnsSnack, _foreignKeysSnack, _indicesSnack);
        final TableInfo _existingSnack = TableInfo.read(_db, "snack");
        if (! _infoSnack.equals(_existingSnack)) {
          return new RoomOpenHelper.ValidationResult(false, "snack(com.eatingdiary.zwjnevw.data.food.Snack).\n"
                  + " Expected:\n" + _infoSnack + "\n"
                  + " Found:\n" + _existingSnack);
        }
        final HashMap<String, TableInfo.Column> _columnsTotal = new HashMap<String, TableInfo.Column>(5);
        _columnsTotal.put("date", new TableInfo.Column("date", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTotal.put("proteins", new TableInfo.Column("proteins", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTotal.put("fats", new TableInfo.Column("fats", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTotal.put("carbs", new TableInfo.Column("carbs", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTotal.put("calories", new TableInfo.Column("calories", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTotal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTotal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTotal = new TableInfo("total", _columnsTotal, _foreignKeysTotal, _indicesTotal);
        final TableInfo _existingTotal = TableInfo.read(_db, "total");
        if (! _infoTotal.equals(_existingTotal)) {
          return new RoomOpenHelper.ValidationResult(false, "total(com.eatingdiary.zwjnevw.data.food.Total).\n"
                  + " Expected:\n" + _infoTotal + "\n"
                  + " Found:\n" + _existingTotal);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "53549cf08fa1f384f564a4500fc909c4", "b311ee8d76a899bbbaf62040a1f6f778");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "breakfast","lunch","dinner","snack","total");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `breakfast`");
      _db.execSQL("DELETE FROM `lunch`");
      _db.execSQL("DELETE FROM `dinner`");
      _db.execSQL("DELETE FROM `snack`");
      _db.execSQL("DELETE FROM `total`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(BreakfastDao.class, BreakfastDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LunchDao.class, LunchDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DinnerDao.class, DinnerDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SnackDao.class, SnackDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TotalDao.class, TotalDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public BreakfastDao breakfastDao() {
    if (_breakfastDao != null) {
      return _breakfastDao;
    } else {
      synchronized(this) {
        if(_breakfastDao == null) {
          _breakfastDao = new BreakfastDao_Impl(this);
        }
        return _breakfastDao;
      }
    }
  }

  @Override
  public LunchDao lunchDao() {
    if (_lunchDao != null) {
      return _lunchDao;
    } else {
      synchronized(this) {
        if(_lunchDao == null) {
          _lunchDao = new LunchDao_Impl(this);
        }
        return _lunchDao;
      }
    }
  }

  @Override
  public DinnerDao dinnerDao() {
    if (_dinnerDao != null) {
      return _dinnerDao;
    } else {
      synchronized(this) {
        if(_dinnerDao == null) {
          _dinnerDao = new DinnerDao_Impl(this);
        }
        return _dinnerDao;
      }
    }
  }

  @Override
  public SnackDao snackDao() {
    if (_snackDao != null) {
      return _snackDao;
    } else {
      synchronized(this) {
        if(_snackDao == null) {
          _snackDao = new SnackDao_Impl(this);
        }
        return _snackDao;
      }
    }
  }

  @Override
  public TotalDao totalDao() {
    if (_totalDao != null) {
      return _totalDao;
    } else {
      synchronized(this) {
        if(_totalDao == null) {
          _totalDao = new TotalDao_Impl(this);
        }
        return _totalDao;
      }
    }
  }
}
