package com.ss.android.message.log;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f59830a = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json"};

    /* renamed from: b  reason: collision with root package name */
    private static final Object f59831b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static a f59832c;

    /* renamed from: d  reason: collision with root package name */
    private SQLiteDatabase f59833d;

    static {
        Covode.recordClassIndex(36980);
    }

    /* renamed from: com.ss.android.message.log.a$a  reason: collision with other inner class name */
    static class C1304a extends SQLiteOpenHelper {
        static {
            Covode.recordClassIndex(36981);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }

        public C1304a(Context context) {
            super(context, "ss_push_log.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            MethodCollector.i(13419);
            try {
                sQLiteDatabase.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT )");
                MethodCollector.o(13419);
            } catch (Exception unused) {
                MethodCollector.o(13419);
            }
        }
    }

    private a(Context context) {
        this.f59833d = new C1304a(context).getWritableDatabase();
    }

    private static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static a a(Context context) {
        MethodCollector.i(13714);
        synchronized (f59831b) {
            try {
                if (f59832c == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                    }
                    f59832c = new a(applicationContext);
                }
            } catch (Throwable th) {
                MethodCollector.o(13714);
                throw th;
            }
        }
        a aVar = f59832c;
        MethodCollector.o(13714);
        return aVar;
    }

    public final synchronized long a(b bVar) {
        MethodCollector.i(13769);
        SQLiteDatabase sQLiteDatabase = this.f59833d;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("category", bVar.f59834a);
                contentValues.put("tag", bVar.f59835b);
                if (!m.a(bVar.f59836c)) {
                    contentValues.put("label", bVar.f59836c);
                }
                contentValues.put("value", Long.valueOf(bVar.f59837d));
                contentValues.put("ext_value", Long.valueOf(bVar.f59838e));
                if (!m.a(bVar.f59839f)) {
                    contentValues.put("ext_json", bVar.f59839f);
                }
                long insert = this.f59833d.insert("event", null, contentValues);
                MethodCollector.o(13769);
                return insert;
            }
        }
        MethodCollector.o(13769);
        return -1;
    }

    public final synchronized boolean a(long j2) {
        MethodCollector.i(13821);
        SQLiteDatabase sQLiteDatabase = this.f59833d;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.o(13821);
            return false;
        }
        if (this.f59833d.delete("event", "_id = ?", new String[]{String.valueOf(j2)}) > 0) {
            MethodCollector.o(13821);
            return true;
        }
        MethodCollector.o(13821);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONArray b(long r18) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.log.a.b(long):org.json.JSONArray");
    }
}
