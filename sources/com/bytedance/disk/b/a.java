package com.bytedance.disk.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f28529a;

    static {
        Covode.recordClassIndex(16771);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(1970);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS migration_items_table");
        sQLiteDatabase.execSQL("CREATE TABLE migration_items_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, mig_opt_dir TEXT, mig_opt_reason TEXT NOT NULL, mig_opt_file_len INTEGER NOT NULL DEFAULT -1, mig_opt_from TEXT NOT NULL, mig_opt_to TEXT NOT NULL , mig_opt_policy INTEGER NOT NULL DEFAULT 0, mig_opt_type INTEGER NOT NULL DEFAULT -1, mig_event INTEGER NOT NULL, mig_event_time LONG NOT NULL DEFAULT 0, mig_event_elapsed TEXT, mig_deleted INTEGER NOT NULL DEFAULT 0);");
        MethodCollector.o(1970);
    }

    public static a a(Context context) {
        MethodCollector.i(1969);
        if (f28529a == null) {
            synchronized (a.class) {
                try {
                    if (f28529a == null) {
                        f28529a = new a(context, "migration.db");
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1969);
                    throw th;
                }
            }
        }
        a aVar = f28529a;
        MethodCollector.o(1969);
        return aVar;
    }

    private a(Context context, String str) {
        this(context, str, (byte) 0);
    }

    private a(Context context, String str, byte b2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
