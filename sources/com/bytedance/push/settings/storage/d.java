package com.bytedance.push.settings.storage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f42334a;

    /* renamed from: b  reason: collision with root package name */
    private final String f42335b;

    /* renamed from: c  reason: collision with root package name */
    private Map<com.bytedance.push.settings.a, ContentObserver> f42336c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(25860);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final String a(String str) {
        return a(str, (String) null);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final String a(String str, String str2) {
        MethodCollector.i(8258);
        try {
            String a2 = a(this.f42334a.getContentResolver().query(a(this.f42334a, this.f42335b, str, str2, "string"), null, null, null, null), str2);
            MethodCollector.o(8258);
            return a2;
        } catch (Throwable unused) {
            MethodCollector.o(8258);
            return str2;
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final int a(String str, int i2) {
        MethodCollector.i(8375);
        try {
            int a2 = a(this.f42334a.getContentResolver().query(a(this.f42334a, this.f42335b, str, String.valueOf(i2), "integer"), null, null, null, null), i2);
            MethodCollector.o(8375);
            return a2;
        } catch (Throwable unused) {
            MethodCollector.o(8375);
            return i2;
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final long a(String str, long j2) {
        MethodCollector.i(8377);
        try {
            long a2 = a(this.f42334a.getContentResolver().query(a(this.f42334a, this.f42335b, str, String.valueOf(j2), "long"), null, null, null, null), j2);
            MethodCollector.o(8377);
            return a2;
        } catch (Throwable unused) {
            MethodCollector.o(8377);
            return j2;
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final boolean a(String str, boolean z) {
        MethodCollector.i(8541);
        try {
            boolean a2 = a(this.f42334a.getContentResolver().query(a(this.f42334a, this.f42335b, str, String.valueOf(z), "boolean"), null, null, null, null), z);
            MethodCollector.o(8541);
            return a2;
        } catch (Throwable unused) {
            MethodCollector.o(8541);
            return z;
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final SharedPreferences.Editor a() {
        return new a(this.f42334a, this.f42335b, new j() {
            /* class com.bytedance.push.settings.storage.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25861);
            }

            @Override // com.bytedance.push.settings.storage.j
            public final Uri a(Context context, b bVar) {
                return d.a(context, bVar);
            }
        });
    }

    @Override // com.bytedance.push.settings.storage.i
    public final void a(Context context, String str, String str2, final com.bytedance.push.settings.a aVar) {
        Uri b2;
        if (aVar != null && (b2 = PushProvider.b(context, this.f42335b, str, str2)) != null) {
            AnonymousClass2 r2 = new ContentObserver(new Handler(Looper.getMainLooper())) {
                /* class com.bytedance.push.settings.storage.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(25862);
                }

                public final void onChange(boolean z, Uri uri) {
                    super.onChange(z, uri);
                }
            };
            context.getContentResolver().registerContentObserver(b2, true, r2);
            this.f42336c.put(aVar, r2);
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final void a(com.bytedance.push.settings.a aVar) {
        ContentObserver remove;
        if (aVar != null && (remove = this.f42336c.remove(aVar)) != null) {
            this.f42334a.getContentResolver().unregisterContentObserver(remove);
        }
    }

    static final class a implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        private final j f42340a;

        /* renamed from: b  reason: collision with root package name */
        private final String f42341b;

        /* renamed from: c  reason: collision with root package name */
        private Context f42342c;

        /* renamed from: d  reason: collision with root package name */
        private ContentValues f42343d = new ContentValues();

        static {
            Covode.recordClassIndex(25863);
        }

        public final boolean commit() {
            return false;
        }

        public final /* synthetic */ SharedPreferences.Editor clear() {
            throw new UnsupportedOperationException("not support clear");
        }

        public final synchronized void apply() {
            MethodCollector.i(6940);
            try {
                this.f42342c.getContentResolver().insert(this.f42340a.a(this.f42342c, new b(this.f42341b, "key", "val", StringSet.type)), this.f42343d);
                MethodCollector.o(6940);
            } catch (Throwable unused) {
                MethodCollector.o(6940);
            }
        }

        public final /* synthetic */ SharedPreferences.Editor remove(String str) {
            this.f42343d.putNull(str);
            return this;
        }

        public final /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
            this.f42343d.put(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new UnsupportedOperationException("putStringSet not support");
        }

        public final /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f42343d.put(str, Boolean.valueOf(z));
            return this;
        }

        public final /* synthetic */ SharedPreferences.Editor putFloat(String str, float f2) {
            this.f42343d.put(str, Float.valueOf(f2));
            return this;
        }

        public final /* synthetic */ SharedPreferences.Editor putInt(String str, int i2) {
            this.f42343d.put(str, Integer.valueOf(i2));
            return this;
        }

        public final /* synthetic */ SharedPreferences.Editor putLong(String str, long j2) {
            this.f42343d.put(str, Long.valueOf(j2));
            return this;
        }

        a(Context context, String str, j jVar) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f42342c = applicationContext;
            this.f42340a = jVar;
            this.f42341b = str;
        }
    }

    private static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final int b(String str) {
        return a(str, 0);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final long c(String str) {
        return a(str, 0L);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final float d(String str) {
        return a(str, 0.0f);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final boolean e(String str) {
        return a(str, false);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final boolean f(String str) {
        MethodCollector.i(3650);
        try {
            Uri a2 = a(this.f42334a, (b) null);
            ContentResolver contentResolver = this.f42334a.getContentResolver();
            String str2 = this.f42335b;
            Bundle bundle = new Bundle();
            bundle.putString("_storage_key", str2);
            bundle.putString("_key", str);
            Bundle call = contentResolver.call(a2, "_contains", (String) null, bundle);
            if (call == null) {
                MethodCollector.o(3650);
                return false;
            }
            boolean z = call.getBoolean("_result");
            MethodCollector.o(3650);
            return z;
        } catch (Throwable unused) {
            MethodCollector.o(3650);
            return false;
        }
    }

    d(Context context, String str) {
        this.f42334a = context;
        this.f42335b = str;
    }

    private static float a(Cursor cursor, float f2) {
        if (cursor == null) {
            return f2;
        }
        try {
            if (cursor.moveToFirst()) {
                f2 = cursor.getFloat(0);
            }
        } catch (Throwable unused) {
        }
        a(cursor);
        return f2;
    }

    private static int a(Cursor cursor, int i2) {
        if (cursor == null) {
            return i2;
        }
        try {
            if (cursor.moveToFirst()) {
                i2 = cursor.getInt(0);
            }
        } catch (Throwable unused) {
        }
        a(cursor);
        return i2;
    }

    private static long a(Cursor cursor, long j2) {
        if (cursor == null) {
            return j2;
        }
        try {
            if (cursor.moveToFirst()) {
                j2 = cursor.getLong(0);
            }
        } catch (Throwable unused) {
        }
        a(cursor);
        return j2;
    }

    public static synchronized Uri a(Context context, b bVar) {
        Uri a2;
        synchronized (d.class) {
            MethodCollector.i(3654);
            a2 = PushProvider.a(context, bVar);
            MethodCollector.o(3654);
        }
        return a2;
    }

    private static String a(Cursor cursor, String str) {
        if (cursor == null) {
            return str;
        }
        try {
            if (cursor.moveToFirst()) {
                str = cursor.getString(0);
            }
        } catch (Throwable unused) {
        }
        a(cursor);
        return str;
    }

    private static boolean a(Cursor cursor, boolean z) {
        if (cursor == null) {
            return z;
        }
        try {
            if (cursor.moveToFirst()) {
                boolean z2 = false;
                if (cursor.getInt(0) > 0) {
                    z2 = true;
                }
                z = z2;
            }
        } catch (Throwable unused) {
        }
        a(cursor);
        return z;
    }

    @Override // com.bytedance.push.settings.storage.i
    public final float a(String str, float f2) {
        MethodCollector.i(8379);
        try {
            float a2 = a(this.f42334a.getContentResolver().query(a(this.f42334a, this.f42335b, str, String.valueOf(f2), "float"), null, null, null, null), f2);
            MethodCollector.o(8379);
            return a2;
        } catch (Throwable unused) {
            MethodCollector.o(8379);
            return f2;
        }
    }

    private static Uri a(Context context, String str, String str2, String str3, String str4) {
        return a(context, new b(str, str2, str3, str4));
    }
}
