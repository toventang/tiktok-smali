package com.bytedance.bdturing.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final C0563a f26403a = new C0563a((byte) 0);

    static {
        Covode.recordClassIndex(15535);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        l.c(sQLiteDatabase, "");
    }

    /* renamed from: com.bytedance.bdturing.b.a$a  reason: collision with other inner class name */
    public static final class C0563a {
        static {
            Covode.recordClassIndex(15536);
        }

        private C0563a() {
        }

        public /* synthetic */ C0563a(byte b2) {
            this();
        }
    }

    public a(Context context) {
        super(context, "verifystorage.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(10552);
        l.c(sQLiteDatabase, "");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS h5_storage (\n    id INTEGER PRIMARY KEY AUTOINCREMENT,\n    primary_key TEXT,\n    time_stamp LONG, \n    content TEXT\n    )");
        MethodCollector.o(10552);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        MethodCollector.i(10709);
        l.c(sQLiteDatabase, "");
        sQLiteDatabase.execSQL("DROP TABLE h5_storage");
        onCreate(sQLiteDatabase);
        MethodCollector.o(10709);
    }
}
