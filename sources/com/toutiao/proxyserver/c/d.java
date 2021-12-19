package com.toutiao.proxyserver.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class d extends SQLiteOpenHelper {
    static {
        Covode.recordClassIndex(103116);
    }

    public d(Context context) {
        super(context, "video.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(12793);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video_http_header_t(_id INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT,mime TEXT,contentLength INTEGER,flag INTEGER,extra TEXT)");
        MethodCollector.o(12793);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        MethodCollector.i(12897);
        if (i2 == 1) {
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN flag INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
            MethodCollector.o(12897);
        } else if (i2 == 2) {
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
            MethodCollector.o(12897);
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS video_http_header_t");
            onCreate(sQLiteDatabase);
            MethodCollector.o(12897);
        }
    }
}
