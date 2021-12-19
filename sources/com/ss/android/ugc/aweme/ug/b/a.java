package com.ss.android.ugc.aweme.ug.b;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;

public class a extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    private static a f141743c;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f141744a = getWritableDatabase();

    /* renamed from: b  reason: collision with root package name */
    public SQLiteDatabase f141745b = getReadableDatabase();

    static {
        Covode.recordClassIndex(92648);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    private a() {
        super(d.a(), "TIKTOK.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static a a() {
        MethodCollector.i(3548);
        if (f141743c == null) {
            synchronized (a.class) {
                try {
                    if (f141743c == null) {
                        f141743c = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3548);
                    throw th;
                }
            }
        }
        a aVar = f141743c;
        MethodCollector.o(3548);
        return aVar;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(3793);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `app_open` (\n\t`open_time`\tINTEGER UNIQUE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `like_dialog_open` (\n\t`open_time`\tINTEGER,\n\t`version`\tINTEGER\n);");
        MethodCollector.o(3793);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        try {
            super.onDowngrade(sQLiteDatabase, i2, i3);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            System.exit(0);
        }
    }
}
