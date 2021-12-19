package com.bytedance.apm.battery.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;

public final class b extends SQLiteOpenHelper {
    static {
        Covode.recordClassIndex(14457);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE t_battery ( _id INTEGER PRIMARY KEY AUTOINCREMENT, version_id Integer, front Integer, timestamp Integer, type TEXT, status Integer, scene TEXT, accumulation Integer, source TEXT, delete_flag Integer DEFAULT 0, process TEXT, main_process Integer, sid TEXT, extra1 TEXT, extra2 TEXT, extra3 TEXT, extra4 TEXT  )");
        } catch (Exception unused) {
        }
    }

    public b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 < 2) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS local_monitor_log");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS t_apiall");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS local_monitor_version");
            } catch (Exception unused) {
            }
        }
    }
}
