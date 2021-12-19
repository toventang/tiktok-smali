package com.bytedance.framwork.core.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.b.a;
import com.kakao.usermgmt.StringSet;

/* access modifiers changed from: package-private */
public class e {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f29497a = {"_id", "value", StringSet.type, "timestamp", "retry_count", "retry_time"};

    /* renamed from: b  reason: collision with root package name */
    private static e f29498b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f29499c;

    static {
        Covode.recordClassIndex(17181);
    }

    private synchronized boolean c() {
        MethodCollector.i(12620);
        SQLiteDatabase sQLiteDatabase = this.f29499c;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                MethodCollector.o(12620);
                return true;
            }
        }
        MethodCollector.o(12620);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        MethodCollector.i(12960);
        if (!c()) {
            MethodCollector.o(12960);
            return;
        }
        try {
            this.f29499c.execSQL("DROP TABLE IF EXISTS queue");
            this.f29499c.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            MethodCollector.o(12960);
        } catch (Exception unused) {
            MethodCollector.o(12960);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a() {
        MethodCollector.i(12743);
        long j2 = 0;
        if (!c()) {
            MethodCollector.o(12743);
            return 0;
        }
        Cursor cursor = null;
        String str = "select count(*) from queue";
        try {
            if (!TextUtils.isEmpty(null)) {
                str = str + " " + ((String) null);
            }
            cursor = this.f29499c.rawQuery(str, null);
            if (cursor.moveToNext()) {
                j2 = cursor.getLong(0);
            }
        } catch (Throwable unused) {
        }
        a(cursor);
        MethodCollector.o(12743);
        return j2;
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

    private e(Context context) {
        if (context != null) {
            try {
                this.f29499c = a.a(context).getWritableDatabase();
            } catch (Throwable unused) {
            }
        }
    }

    static e a(Context context) {
        MethodCollector.i(12514);
        if (f29498b == null) {
            synchronized (e.class) {
                try {
                    if (f29498b == null) {
                        f29498b = new e(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12514);
                    throw th;
                }
            }
        }
        e eVar = f29498b;
        MethodCollector.o(12514);
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.bytedance.framwork.core.c.b] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.bytedance.framwork.core.c.b] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0030] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.framwork.core.c.b a(long r18) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.c.e.a(long):com.bytedance.framwork.core.c.b");
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(String str, byte[] bArr) {
        MethodCollector.i(12863);
        if (c() && bArr != null) {
            if (bArr.length > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", bArr);
                contentValues.put(StringSet.type, str);
                contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("retry_count", (Integer) 0);
                contentValues.put("retry_time", (Long) 0L);
                long insert = this.f29499c.insert("queue", null, contentValues);
                MethodCollector.o(12863);
                return insert;
            }
        }
        MethodCollector.o(12863);
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, int i2, long j2) {
        String str2;
        String[] strArr;
        MethodCollector.i(13055);
        if (!c()) {
            MethodCollector.o(13055);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (TextUtils.isEmpty(str)) {
            str2 = "timestamp <= ? ";
            strArr = new String[]{String.valueOf(currentTimeMillis)};
        } else {
            str2 = "(timestamp <= ? OR retry_count > " + i2 + ") and type = ?";
            strArr = new String[]{String.valueOf(currentTimeMillis), str};
        }
        try {
            this.f29499c.delete("queue", str2, strArr);
            MethodCollector.o(13055);
        } catch (Exception unused) {
            MethodCollector.o(13055);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(long j2, boolean z, long j3, int i2) {
        MethodCollector.i(13151);
        if (c()) {
            if (j2 > 0) {
                String[] strArr = {String.valueOf(j2)};
                if (!z) {
                    Cursor cursor = null;
                    try {
                        cursor = this.f29499c.query("queue", new String[]{"timestamp", "retry_count"}, "_id = ?", strArr, null, null, null);
                        if (!cursor.moveToNext()) {
                            return false;
                        }
                        long j4 = cursor.getLong(0);
                        int i3 = cursor.getInt(1);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - j4 >= j3 || i3 >= i2) {
                            a(cursor);
                        } else {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("retry_count", Integer.valueOf(i3 + 1));
                            contentValues.put("retry_time", Long.valueOf(currentTimeMillis));
                            this.f29499c.update("queue", contentValues, "_id = ?", strArr);
                            a(cursor);
                            MethodCollector.o(13151);
                            return true;
                        }
                    } catch (Exception unused) {
                        return false;
                    } finally {
                        a(cursor);
                        MethodCollector.o(13151);
                    }
                }
                try {
                    this.f29499c.delete("queue", "_id = ?", strArr);
                } catch (Throwable unused2) {
                }
                MethodCollector.o(13151);
                return false;
            }
        }
        MethodCollector.o(13151);
        return false;
    }
}
