package com.bytedance.framwork.core.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.b.b.a;
import com.bytedance.framwork.core.b.e.b;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static boolean f29409a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f29410b;

    /* renamed from: c  reason: collision with root package name */
    static long f29411c = 5000;

    /* renamed from: d  reason: collision with root package name */
    static final String[] f29412d = {"_id", "data"};

    /* renamed from: j  reason: collision with root package name */
    private static c f29413j;

    /* renamed from: k  reason: collision with root package name */
    private static String f29414k = "SELECT count(*) FROM monitor_log WHERE aid = ?";

    /* renamed from: l  reason: collision with root package name */
    private static String f29415l = "SELECT count(*) FROM monitor_log";

    /* renamed from: e  reason: collision with root package name */
    String f29416e = "INSERT INTO monitor_log(aid,type,type2,time,data) VALUES ( ?, ?, ?, ?, ?)";

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Integer> f29417f = new HashMap(2);

    /* renamed from: g  reason: collision with root package name */
    private int f29418g = 0;

    /* renamed from: h  reason: collision with root package name */
    private Context f29419h;

    /* renamed from: i  reason: collision with root package name */
    private SQLiteDatabase f29420i;

    public final synchronized void a(String str, List<a> list) {
        MethodCollector.i(11223);
        if (this.f29420i == null || b.a(list)) {
            MethodCollector.o(11223);
            return;
        }
        b();
        this.f29420i.beginTransaction();
        try {
            SQLiteStatement compileStatement = this.f29420i.compileStatement(this.f29416e);
            for (a aVar : list) {
                compileStatement.bindString(1, String.valueOf(aVar.f29404b));
                compileStatement.bindString(2, aVar.f29405c == null ? "" : aVar.f29405c);
                compileStatement.bindString(3, aVar.f29406d == null ? "" : aVar.f29406d);
                compileStatement.bindLong(4, aVar.f29408f);
                compileStatement.bindString(5, aVar.f29407e == null ? "" : aVar.f29407e);
                compileStatement.executeInsert();
            }
            this.f29420i.setTransactionSuccessful();
            a(str, list.size());
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            this.f29420i.endTransaction();
            MethodCollector.o(11223);
        }
    }

    public final List<a> a(int i2, int i3) {
        MethodCollector.i(11375);
        Cursor cursor = null;
        try {
            Cursor query = this.f29420i.query("monitor_log", f29412d, "aid= ?", new String[]{String.valueOf(i2)}, null, null, "_id ASC ", String.valueOf(i3));
            try {
                if (query.getCount() == 0) {
                    a(query);
                    MethodCollector.o(11375);
                    return null;
                }
                LinkedList linkedList = new LinkedList();
                while (query.moveToNext()) {
                    linkedList.add(new a(query.getLong(query.getColumnIndex("_id")), query.getString(query.getColumnIndex("data"))));
                }
                a(query);
                MethodCollector.o(11375);
                return linkedList;
            } catch (Throwable unused) {
                cursor = query;
                a(cursor);
                List<a> emptyList = Collections.emptyList();
                MethodCollector.o(11375);
                return emptyList;
            }
        } catch (Throwable unused2) {
            a(cursor);
            List<a> emptyList2 = Collections.emptyList();
            MethodCollector.o(11375);
            return emptyList2;
        }
    }

    static {
        Covode.recordClassIndex(17143);
    }

    private synchronized int a() {
        MethodCollector.i(11545);
        SQLiteDatabase sQLiteDatabase = this.f29420i;
        int i2 = -1;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.o(11545);
            return -1;
        }
        Cursor cursor = null;
        try {
            cursor = this.f29420i.rawQuery(f29415l, null);
            if (cursor.moveToNext()) {
                i2 = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            a((Cursor) null);
            MethodCollector.o(11545);
            throw th;
        }
        a(cursor);
        MethodCollector.o(11545);
        return i2;
    }

    private synchronized void c() {
        MethodCollector.i(12026);
        if (this.f29420i != null) {
            try {
                this.f29420i.execSQL(new StringBuilder(" DELETE FROM monitor_log WHERE _id IN (SELECT _id FROM monitor_log ORDER BY _id ASC LIMIT 500)").toString());
                MethodCollector.o(12026);
            } catch (Exception e2) {
                e2.printStackTrace();
                MethodCollector.o(12026);
            }
        } else {
            MethodCollector.o(12026);
        }
    }

    private synchronized void b() {
        MethodCollector.i(11870);
        if (!f29410b) {
            f29410b = true;
            if (((long) a()) >= f29411c) {
                c();
            }
        }
        if (!f29409a) {
            f29409a = true;
            try {
                File databasePath = this.f29419h.getDatabasePath("psdkmon" + ".db");
                if (databasePath.exists()) {
                    a(databasePath);
                }
                MethodCollector.o(11870);
                return;
            } catch (Exception unused) {
            }
        }
        MethodCollector.o(11870);
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

    private c(Context context) {
        this.f29419h = context;
        this.f29420i = a.a(context).getWritableDatabase();
    }

    public static c a(Context context) {
        MethodCollector.i(11069);
        if (f29413j == null) {
            synchronized (a.class) {
                try {
                    if (f29413j == null) {
                        f29413j = new c(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11069);
                    throw th;
                }
            }
        }
        c cVar = f29413j;
        MethodCollector.o(11069);
        return cVar;
    }

    private synchronized int b(String str) {
        MethodCollector.i(11544);
        SQLiteDatabase sQLiteDatabase = this.f29420i;
        int i2 = -1;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.o(11544);
            return -1;
        }
        Cursor cursor = null;
        try {
            cursor = this.f29420i.rawQuery(f29414k, new String[]{str});
            if (cursor.moveToNext()) {
                i2 = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            a((Cursor) null);
            MethodCollector.o(11544);
            throw th;
        }
        a(cursor);
        MethodCollector.o(11544);
        return i2;
    }

    private static boolean a(File file) {
        MethodCollector.i(12028);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(12028);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12028);
        return delete;
    }

    public final synchronized int a(String str) {
        int i2;
        MethodCollector.i(11714);
        if (this.f29418g > 10 || !this.f29417f.containsKey(str)) {
            i2 = b(str);
            this.f29417f.put(str, Integer.valueOf(i2));
            this.f29418g = 0;
        } else {
            i2 = this.f29417f.get(str).intValue();
            this.f29418g++;
        }
        MethodCollector.o(11714);
        return i2;
    }

    private void a(String str, int i2) {
        if (this.f29417f.containsKey(str) || i2 <= 0) {
            this.f29417f.put(str, Integer.valueOf(Math.max(0, i2 + this.f29417f.get(str).intValue())));
            return;
        }
        this.f29417f.put(str, Integer.valueOf(i2));
    }

    public final synchronized int a(String str, long j2) {
        MethodCollector.i(11376);
        if (this.f29420i != null) {
            if (j2 >= 0) {
                int delete = this.f29420i.delete("monitor_log", "aid = ? AND _id<= ? ", new String[]{str, String.valueOf(j2)});
                a(str, delete * -1);
                MethodCollector.o(11376);
                return delete;
            }
        }
        MethodCollector.o(11376);
        return -1;
    }
}
