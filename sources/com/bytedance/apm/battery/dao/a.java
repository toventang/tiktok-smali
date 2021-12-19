package com.bytedance.apm.battery.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f24541a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24542b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f24543c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Integer> f24544d = new HashMap<>();

    /* renamed from: com.bytedance.apm.battery.dao.a$a  reason: collision with other inner class name */
    public interface AbstractC0526a<T> {
        static {
            Covode.recordClassIndex(14454);
        }

        T a(b bVar);
    }

    static {
        Covode.recordClassIndex(14453);
    }

    public abstract String a();

    public abstract String[] b();

    public a() {
        Context context = c.f24685a;
        this.f24541a = context;
        this.f24542b = context.getPackageName() + ".apm";
    }

    private Uri c() {
        if (this.f24543c == null) {
            this.f24543c = Uri.parse("content://" + this.f24542b + "/apm_monitor_t1.db/" + a());
        }
        return this.f24543c;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Cursor f24550a;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<String, Integer> f24551b;

        static {
            Covode.recordClassIndex(14455);
        }

        public final long a(String str) {
            try {
                return this.f24550a.getLong(d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        public final int b(String str) {
            try {
                return this.f24550a.getInt(d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        public final String c(String str) {
            try {
                return this.f24550a.getString(d(str));
            } catch (Throwable unused) {
                return "";
            }
        }

        private int d(String str) {
            Integer num = this.f24551b.get(str);
            if (num == null) {
                try {
                    num = Integer.valueOf(this.f24550a.getColumnIndex(str));
                } catch (Throwable unused) {
                    num = -1;
                }
                this.f24551b.put(str, num);
            }
            return num.intValue();
        }

        private b(Cursor cursor, HashMap<String, Integer> hashMap) {
            this.f24550a = cursor;
            this.f24551b = hashMap;
        }

        /* synthetic */ b(Cursor cursor, HashMap hashMap, byte b2) {
            this(cursor, hashMap);
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

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <I extends T> long a(android.content.ContentValues r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r2 = -1
            android.content.Context r0 = com.bytedance.apm.c.f24685a     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            android.net.Uri r0 = r4.c()     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            android.net.Uri r0 = r1.insert(r0, r5)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r4)
            return r2
        L_0x0015:
            java.lang.String r0 = r0.getLastPathSegment()     // Catch:{ Exception -> 0x001f, all -> 0x0023 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x001f, all -> 0x0023 }
            monitor-exit(r4)
            return r0
        L_0x001f:
            r0 = 1
            monitor-exit(r4)
            return r0
        L_0x0023:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0026:
            monitor-exit(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.dao.a.a(android.content.ContentValues):long");
    }

    public final int a(ContentValues contentValues, String str, String[] strArr) {
        try {
            return c.f24685a.getContentResolver().update(c(), contentValues, str, strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final List<T> a(String str, String[] strArr, String str2, AbstractC0526a<T> aVar) {
        Cursor cursor;
        int indexOf;
        try {
            cursor = this.f24541a.getContentResolver().query(c(), b(), str, strArr, str2);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        int i2 = Integer.MAX_VALUE;
                        if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf("LIMIT")) > 0) {
                            int indexOf2 = str2.indexOf("OFF");
                            i2 = indexOf2 > 0 ? Integer.valueOf(str2.substring(indexOf + 5, indexOf2).trim()).intValue() : Integer.valueOf(str2.substring(indexOf + 5).trim()).intValue();
                        }
                        LinkedList linkedList = new LinkedList();
                        int i3 = 0;
                        while (cursor.moveToNext() && i3 < i2) {
                            linkedList.add(aVar.a(new b(cursor, this.f24544d, (byte) 0)));
                            i3++;
                        }
                        a(cursor);
                        return linkedList;
                    }
                } catch (Throwable unused) {
                    a(cursor);
                    return Collections.emptyList();
                }
            }
            List<T> emptyList = Collections.emptyList();
            a(cursor);
            return emptyList;
        } catch (Throwable unused2) {
            cursor = null;
            a(cursor);
            return Collections.emptyList();
        }
    }
}
