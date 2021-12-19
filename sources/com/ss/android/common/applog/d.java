package com.ss.android.common.applog;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.common.applog.AppLog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    static volatile String f59241a = "ss_app_log.db";

    /* renamed from: b  reason: collision with root package name */
    static final String[] f59242b = {"_id", StringSet.name, "duration", "session_id"};

    /* renamed from: c  reason: collision with root package name */
    static final String[] f59243c = {"_id", "value", "is_crash", "timestamp", "retry_count", "retry_time", "log_type"};

    /* renamed from: d  reason: collision with root package name */
    static final String[] f59244d = {"_id", "value", "timestamp", "duration", "non_page", "app_version", "version_code", "pausetime", "launch_sent", "event_index"};

    /* renamed from: e  reason: collision with root package name */
    static final String[] f59245e = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json", "user_id", "timestamp", "session_id", "event_index"};

    /* renamed from: f  reason: collision with root package name */
    static final String[] f59246f = {"_id", "log_type", "value", "session_id"};

    /* renamed from: g  reason: collision with root package name */
    static final String[] f59247g = {"_id", "log_type", "value"};

    /* renamed from: h  reason: collision with root package name */
    static final Object f59248h = new Object();

    /* renamed from: i  reason: collision with root package name */
    static d f59249i;

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f59250j = {"event", "page", "session", "misc_log", "succ_rate", "queue"};

    /* renamed from: k  reason: collision with root package name */
    private SQLiteDatabase f59251k;

    /* renamed from: l  reason: collision with root package name */
    private final Context f59252l;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(com.ss.android.common.applog.j r7, long r8) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.d.a(com.ss.android.common.applog.j, long):long");
    }

    public final synchronized long a(p pVar) {
        MethodCollector.i(6077);
        SQLiteDatabase sQLiteDatabase = this.f59251k;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                boolean z = pVar.f59320i;
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", pVar.f59313b);
                contentValues.put("timestamp", Long.valueOf(pVar.f59314c));
                contentValues.put("duration", Integer.valueOf(pVar.f59316e));
                contentValues.put("non_page", Integer.valueOf(z ? 1 : 0));
                contentValues.put("app_version", pVar.f59317f);
                contentValues.put("version_code", Integer.valueOf(pVar.f59318g));
                contentValues.put("event_index", Long.valueOf(pVar.f59315d));
                long insert = this.f59251k.insert("session", null, contentValues);
                MethodCollector.o(6077);
                return insert;
            }
        }
        MethodCollector.o(6077);
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(String str) {
        long insert;
        MethodCollector.i(6083);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str);
        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        contentValues.put("retry_time", (Long) 0L);
        contentValues.put("log_type", (Integer) 0);
        insert = this.f59251k.insert("queue", null, contentValues);
        MethodCollector.o(6083);
        return insert;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j2, String str) {
        MethodCollector.i(6086);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str);
        this.f59251k.update("queue", contentValues, "_id = ?", new String[]{String.valueOf(j2)});
        MethodCollector.o(6086);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (1 != 0) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        if (r21 == false) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(long r19, boolean r21, java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.d.a(long, boolean, java.lang.String):boolean");
    }

    public final synchronized void a() {
        MethodCollector.i(6111);
        SQLiteDatabase sQLiteDatabase = this.f59251k;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.o(6111);
            return;
        }
        try {
            this.f59251k.delete("queue", "timestamp <= ? OR retry_count > 10", new String[]{String.valueOf(System.currentTimeMillis() - 432000000)});
            MethodCollector.o(6111);
        } catch (Exception unused) {
            MethodCollector.o(6111);
        }
    }

    public final synchronized i a(long j2) {
        Cursor cursor;
        Throwable th;
        MethodCollector.i(6178);
        SQLiteDatabase sQLiteDatabase = this.f59251k;
        Cursor cursor2 = null;
        i iVar = null;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.o(6178);
            return null;
        }
        try {
            cursor = this.f59251k.query("queue", f59243c, "_id > ?", new String[]{String.valueOf(j2)}, null, null, "_id ASC", "1");
            try {
                if (cursor.moveToNext()) {
                    i iVar2 = new i();
                    iVar2.f59284a = (long) cursor.getInt(0);
                    iVar2.f59285b = cursor.getString(1);
                    iVar2.f59286c = cursor.getLong(3);
                    iVar2.f59287d = cursor.getInt(4);
                    iVar2.f59288e = cursor.getLong(5);
                    iVar2.f59289f = cursor.getInt(6);
                    iVar = iVar2;
                }
                a(cursor);
                MethodCollector.o(6178);
                return iVar;
            } catch (Exception unused) {
                a(cursor);
                MethodCollector.o(6178);
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                a(cursor2);
                MethodCollector.o(6178);
                throw th;
            }
        } catch (Exception unused2) {
            cursor = null;
            a(cursor);
            MethodCollector.o(6178);
            return null;
        } catch (Throwable th3) {
            th = th3;
            a(cursor2);
            MethodCollector.o(6178);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0592, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0594, code lost:
        r1 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0209 */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0389 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03c9 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03d9 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03e8 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0428 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0437 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0447 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0469 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x049d A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04e2 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04e3 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0592 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:141:0x0361] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0594 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:88:0x0211] */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[ExcHandler: Exception (unused java.lang.Exception), PHI: r2 
      PHI: (r2v3 com.ss.android.common.applog.d) = (r2v4 com.ss.android.common.applog.d), (r2v0 com.ss.android.common.applog.d) binds: [B:141:0x0361, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:22:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0203 A[SYNTHETIC, Splitter:B:83:0x0203] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(com.ss.android.common.applog.p r47, com.ss.android.common.applog.p r48, org.json.JSONObject r49, boolean r50, long[] r51, java.lang.String[] r52, java.util.List<com.ss.android.common.applog.AppLog.h> r53, boolean r54, org.json.JSONObject r55) {
        /*
        // Method dump skipped, instructions count: 1479
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.d.a(com.ss.android.common.applog.p, com.ss.android.common.applog.p, org.json.JSONObject, boolean, long[], java.lang.String[], java.util.List, boolean, org.json.JSONObject):long");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        MethodCollector.i(6366);
        SQLiteDatabase sQLiteDatabase = this.f59251k;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.o(6366);
            return;
        }
        for (String str : f59250j) {
            try {
                this.f59251k.delete(str, null, null);
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(6366);
    }

    static {
        Covode.recordClassIndex(36616);
    }

    static class a extends SQLiteOpenHelper {
        static {
            Covode.recordClassIndex(36617);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }

        public a(Context context) {
            super(context, d.f59241a, (SQLiteDatabase.CursorFactory) null, 10);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            MethodCollector.i(6952);
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value VARCHAR NOT NULL, timestamp INTEGER, duration INTEGER, non_page INTEGER, app_version VARCHAR, version_code INTEGER, pausetime INTEGER,launch_sent INTEGER NOT NULL DEFAULT 0, event_index INTEGER NOT NULL DEFAULT 0  )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT, user_id INTEGER, timestamp INTEGER, session_id INTEGER, event_index INTEGER NOT NULL DEFAULT 0 )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS page ( _id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, duration INTEGER, session_id INTEGER )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value TEXT, is_crash INTEGER NOT NULL DEFAULT 0, log_type INTEGER NOT NULL DEFAULT 0, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS succ_rate ( _id INTEGER PRIMARY KEY AUTOINCREMENT, event_name VARCHAR, event_fail_reason INTEGER, event_fail_cnt INTEGER NOT NULL DEFAULT 0, event_date INTEGER )");
                MethodCollector.o(6952);
            } catch (Exception unused) {
                MethodCollector.o(6952);
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            MethodCollector.i(7032);
            if (i2 < 2) {
                sQLiteDatabase.execSQL("ALTER TABLE event ADD COLUMN user_id INTEGER");
            }
            if (i2 < 3) {
                sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN launch_sent INTEGER NOT NULL DEFAULT 0");
            }
            if (i2 < 4) {
                sQLiteDatabase.execSQL("ALTER TABLE queue ADD COLUMN is_crash INTEGER NOT NULL DEFAULT 0");
            }
            if (i2 < 5) {
                sQLiteDatabase.execSQL("ALTER TABLE event ADD COLUMN ext_json TEXT");
            }
            if (i2 < 6) {
                sQLiteDatabase.execSQL("ALTER TABLE queue ADD COLUMN log_type INTEGER NOT NULL DEFAULT 0");
            }
            if (i2 < 7) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )");
            }
            if (i2 < 8) {
                sQLiteDatabase.execSQL("ALTER TABLE event ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0");
            }
            if (i2 < 9) {
                sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0");
            }
            if (i2 < 10) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS succ_rate ( _id INTEGER PRIMARY KEY AUTOINCREMENT, event_name VARCHAR, event_fail_reason INTEGER, event_fail_cnt INTEGER NOT NULL DEFAULT 0, event_date INTEGER )");
            }
            MethodCollector.o(7032);
        }
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

    private d(Context context) {
        this.f59251k = new a(context).getWritableDatabase();
        this.f59252l = context;
    }

    public static d a(Context context) {
        MethodCollector.i(5864);
        synchronized (f59248h) {
            try {
                if (f59249i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                    }
                    f59249i = new d(applicationContext);
                }
            } catch (Throwable th) {
                MethodCollector.o(5864);
                throw th;
            }
        }
        d dVar = f59249i;
        MethodCollector.o(5864);
        return dVar;
    }

    public final synchronized void c(long j2) {
        MethodCollector.i(6190);
        SQLiteDatabase sQLiteDatabase = this.f59251k;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.o(6190);
            return;
        }
        try {
            String[] strArr = {String.valueOf(j2)};
            ContentValues contentValues = new ContentValues();
            contentValues.put("launch_sent", (Integer) 1);
            this.f59251k.update("session", contentValues, "_id=?", strArr);
            MethodCollector.o(6190);
        } catch (Exception unused) {
            MethodCollector.o(6190);
        }
    }

    public final synchronized p b(long j2) {
        Cursor cursor;
        Throwable th;
        String str;
        String[] strArr;
        boolean z;
        MethodCollector.i(6187);
        SQLiteDatabase sQLiteDatabase = this.f59251k;
        p pVar = null;
        Cursor cursor2 = null;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.o(6187);
            return null;
        }
        boolean z2 = true;
        if (j2 > 0) {
            str = "_id < ?";
            try {
                strArr = new String[]{String.valueOf(j2)};
            } catch (Exception unused) {
                cursor = null;
                a(cursor);
                MethodCollector.o(6187);
                return null;
            } catch (Throwable th2) {
                th = th2;
                a(cursor2);
                MethodCollector.o(6187);
                throw th;
            }
        } else {
            str = null;
            strArr = null;
        }
        cursor = this.f59251k.query("session", f59244d, str, strArr, null, null, "_id DESC", "1");
        try {
            if (cursor.moveToNext()) {
                p pVar2 = new p();
                pVar2.f59312a = (long) cursor.getInt(0);
                pVar2.f59313b = cursor.getString(1);
                pVar2.f59314c = cursor.getLong(2);
                if (cursor.getInt(4) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                pVar2.f59320i = z;
                pVar2.f59317f = cursor.getString(5);
                pVar2.f59318g = cursor.getInt(6);
                pVar2.f59319h = (long) cursor.getInt(7);
                if (cursor.getInt(8) <= 0) {
                    z2 = false;
                }
                pVar2.f59321j = z2;
                pVar2.f59315d = cursor.getLong(9);
                pVar2.f59322k = false;
                pVar = pVar2;
            }
            a(cursor);
            MethodCollector.o(6187);
            return pVar;
        } catch (Exception unused2) {
            a(cursor);
            MethodCollector.o(6187);
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            a(cursor2);
            MethodCollector.o(6187);
            throw th;
        }
    }

    public final synchronized long a(h hVar) {
        MethodCollector.i(6000);
        SQLiteDatabase sQLiteDatabase = this.f59251k;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("category", hVar.f59272b);
                contentValues.put("tag", hVar.f59273c);
                if (!m.a(hVar.f59274d)) {
                    contentValues.put("label", hVar.f59274d);
                }
                contentValues.put("value", Long.valueOf(hVar.f59275e));
                contentValues.put("ext_value", Long.valueOf(hVar.f59276f));
                if (!m.a(hVar.f59280j)) {
                    contentValues.put("ext_json", hVar.f59280j);
                }
                contentValues.put("user_id", Long.valueOf(hVar.f59277g));
                contentValues.put("timestamp", Long.valueOf(hVar.f59278h));
                contentValues.put("session_id", Long.valueOf(hVar.f59279i));
                contentValues.put("event_index", Long.valueOf(hVar.f59283m));
                long insert = this.f59251k.insert("event", null, contentValues);
                MethodCollector.o(6000);
                return insert;
            }
        }
        MethodCollector.o(6000);
        return -1;
    }

    private static void a(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(5933);
        a(cursor);
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Exception unused) {
                MethodCollector.o(5933);
                return;
            }
        }
        MethodCollector.o(5933);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0103, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0106, code lost:
        a(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6363);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010e, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:4:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0103 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x002a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONArray a(long r29, org.json.JSONObject r31, org.json.JSONObject r32) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.d.a(long, org.json.JSONObject, org.json.JSONObject):org.json.JSONArray");
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(long j2, String str, String str2) {
        long insert;
        MethodCollector.i(6089);
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_type", str);
        contentValues.put("value", str2);
        contentValues.put("session_id", Long.valueOf(j2));
        insert = this.f59251k.insert("misc_log", null, contentValues);
        MethodCollector.o(6089);
        return insert;
    }

    private static void b(List<AppLog.h> list, long j2, String str, JSONObject jSONObject) {
        MethodCollector.i(6343);
        if (list == null) {
            MethodCollector.o(6343);
            return;
        }
        synchronized (list) {
            try {
                for (AppLog.h hVar : list) {
                    try {
                        hVar.b(j2, str, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            } finally {
                MethodCollector.o(6343);
            }
        }
    }

    private static void a(List<AppLog.h> list, long j2, String str, JSONObject jSONObject) {
        MethodCollector.i(6339);
        if (list == null) {
            MethodCollector.o(6339);
            return;
        }
        synchronized (list) {
            try {
                for (AppLog.h hVar : list) {
                    try {
                        hVar.a(j2, str, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            } finally {
                MethodCollector.o(6339);
            }
        }
    }

    private static void a(long j2, String str, String str2, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("db_id", j2);
            jSONObject.put("fail_cause", str);
            if (th != null) {
                jSONObject.put("exception", th.toString());
            }
            JSONArray optJSONArray = new JSONObject(str2).optJSONArray("event_v3");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                long j3 = Long.MIN_VALUE;
                long j4 = Long.MAX_VALUE;
                long j5 = Long.MAX_VALUE;
                String str3 = null;
                String str4 = null;
                long j6 = Long.MIN_VALUE;
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    if (jSONObject2 != null) {
                        long optLong = jSONObject2.optLong("tea_event_index");
                        long optLong2 = jSONObject2.optLong("local_time_ms");
                        if (optLong > j3) {
                            str4 = jSONObject2.optString("event");
                            j3 = optLong;
                            j6 = optLong2;
                        }
                        if (optLong < j4) {
                            str3 = jSONObject2.optString("event");
                            j4 = optLong;
                            j5 = optLong2;
                        }
                    }
                }
                jSONObject.put("session_id", (Object) null);
                jSONObject.put("min_event_index", j4);
                jSONObject.put("min_event_time", j5);
                jSONObject.put("min_event_name", str3);
                jSONObject.put("max_event_index", j3);
                jSONObject.put("max_event_time", j6);
                jSONObject.put("max_event_name", str4);
            }
        } catch (JSONException unused) {
        }
        com.ss.android.common.c.a.a("monitor_delete_failed", jSONObject);
    }
}
