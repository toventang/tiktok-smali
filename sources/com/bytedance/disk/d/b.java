package com.bytedance.disk.d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.f.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile b f28564a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f28565b = {"com.bytedance.disk:migration"};

    /* renamed from: c  reason: collision with root package name */
    private static final c[] f28566c = {new com.bytedance.disk.f.b()};

    /* renamed from: d  reason: collision with root package name */
    private Context f28567d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, c> f28568e = new HashMap();

    static {
        Covode.recordClassIndex(16784);
    }

    public final void a() {
        MethodCollector.i(1839);
        synchronized (this.f28568e) {
            int i2 = 0;
            while (true) {
                try {
                    String[] strArr = f28565b;
                    if (i2 < strArr.length) {
                        c[] cVarArr = f28566c;
                        cVarArr[i2].a(this.f28567d);
                        this.f28568e.put(strArr[i2], cVarArr[i2]);
                        i2++;
                    }
                } finally {
                    MethodCollector.o(1839);
                }
            }
        }
    }

    private b(Context context) {
        this.f28567d = context;
    }

    public static b a(Context context) {
        MethodCollector.i(1838);
        if (f28564a == null) {
            synchronized (b.class) {
                try {
                    if (f28564a == null) {
                        f28564a = new b(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1838);
                    throw th;
                }
            }
        }
        b bVar = f28564a;
        MethodCollector.o(1838);
        return bVar;
    }

    public final c a(Uri uri) {
        String authority;
        if ("content".equals(uri.getScheme()) && (authority = uri.getAuthority()) != null) {
            return this.f28568e.get(authority);
        }
        return null;
    }

    public static int a(Uri uri, ContentValues contentValues) {
        c a2;
        if (f28564a == null || (a2 = f28564a.a(uri)) == null) {
            return -1;
        }
        return a2.a(uri, contentValues, (String) null);
    }

    public static int a(Uri uri, String str, String[] strArr) {
        c a2;
        if (f28564a == null || (a2 = f28564a.a(uri)) == null) {
            return -1;
        }
        return a2.a(uri, str, strArr);
    }

    public static Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        c a2;
        if (f28564a == null || (a2 = f28564a.a(uri)) == null) {
            return null;
        }
        return a2.a(uri, strArr, str, strArr2, str2);
    }
}
