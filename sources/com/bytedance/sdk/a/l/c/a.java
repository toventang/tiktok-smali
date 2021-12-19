package com.bytedance.sdk.a.l.c;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends SQLiteOpenHelper {
    static {
        Covode.recordClassIndex(26599);
    }

    public a(Context context) {
        super(context, "account_db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(12312);
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS login_info (time integer primary key , type integer , info text , uid integer , avatar_url text , screen_name text , platform_avatar_url text, platform_screen_name text,sec_uid text,ext text);");
            MethodCollector.o(12312);
        } catch (SQLException e2) {
            e2.printStackTrace();
            MethodCollector.o(12312);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        MethodCollector.i(12450);
        if (i2 < 2) {
            sQLiteDatabase.execSQL("alter TABLE login_info add COLUMN sec_uid text ");
            sQLiteDatabase.execSQL("alter TABLE login_info add COLUMN ext text ");
        }
        MethodCollector.o(12450);
    }
}
