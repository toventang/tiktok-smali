package com.ss.android.pushmanager.setting;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.bf.d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PushMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static String f60108a;

    /* renamed from: b  reason: collision with root package name */
    public static Uri f60109b;

    /* renamed from: c  reason: collision with root package name */
    private static UriMatcher f60110c;

    /* renamed from: h  reason: collision with root package name */
    private static b f60111h;

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences f60112d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f60113e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f60114f = false;

    /* renamed from: g  reason: collision with root package name */
    private final Object f60115g = new Object();

    static {
        Covode.recordClassIndex(37140);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.database.Cursor r1, boolean r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0013 }
            if (r0 <= 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r1.close()     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(android.database.Cursor, boolean):boolean");
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f60121a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f60122b;

        /* renamed from: c  reason: collision with root package name */
        private SharedPreferences f60123c;

        static {
            Covode.recordClassIndex(37143);
        }

        private static boolean c() {
            com.bytedance.common.b.a.a();
            if (!com.bytedance.common.b.a.f26733b) {
                return true;
            }
            return false;
        }

        public final a a() {
            return new a(this.f60121a, (byte) 0);
        }

        public final boolean b() {
            if (this.f60122b) {
                return c();
            }
            return a("current_app_foreground", false);
        }

        private static Context a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        private b(Context context) {
            this.f60122b = com.ss.android.message.a.a.a(context);
            Context a2 = a(context);
            this.f60121a = a2;
            this.f60123c = d.a(a(a2), "push_multi_process_config", 4);
            Logger.debug();
        }

        public final long a(String str) {
            MethodCollector.i(13005);
            try {
                if (this.f60122b) {
                    long j2 = this.f60123c.getLong(str, 0);
                    MethodCollector.o(13005);
                    return j2;
                }
                long a2 = PushMultiProcessSharedProvider.a(this.f60121a.getContentResolver().query(PushMultiProcessSharedProvider.a(this.f60121a, str, "long"), null, null, null, null));
                MethodCollector.o(13005);
                return a2;
            } catch (Throwable unused) {
                MethodCollector.o(13005);
                return 0;
            }
        }

        /* synthetic */ b(Context context, byte b2) {
            this(context);
        }

        public final int a(String str, int i2) {
            MethodCollector.i(13096);
            try {
                if (this.f60122b) {
                    int i3 = this.f60123c.getInt(str, i2);
                    MethodCollector.o(13096);
                    return i3;
                }
                int a2 = PushMultiProcessSharedProvider.a(this.f60121a.getContentResolver().query(PushMultiProcessSharedProvider.a(this.f60121a, str, "integer"), null, null, null, null), i2);
                MethodCollector.o(13096);
                return a2;
            } catch (Throwable unused) {
                MethodCollector.o(13096);
                return i2;
            }
        }

        public final String a(String str, String str2) {
            MethodCollector.i(12909);
            try {
                if (this.f60122b) {
                    String string = this.f60123c.getString(str, str2);
                    MethodCollector.o(12909);
                    return string;
                }
                String a2 = PushMultiProcessSharedProvider.a(this.f60121a.getContentResolver().query(PushMultiProcessSharedProvider.a(this.f60121a, str, "string"), null, null, null, null), str2);
                MethodCollector.o(12909);
                return a2;
            } catch (Throwable unused) {
                MethodCollector.o(12909);
                return str2;
            }
        }

        public final boolean a(String str, boolean z) {
            MethodCollector.i(13095);
            try {
                if (this.f60122b) {
                    boolean z2 = this.f60123c.getBoolean(str, z);
                    MethodCollector.o(13095);
                    return z2;
                }
                boolean a2 = PushMultiProcessSharedProvider.a(this.f60121a.getContentResolver().query(PushMultiProcessSharedProvider.a(this.f60121a, str, "boolean"), null, null, null, null), z);
                MethodCollector.o(13095);
                return a2;
            } catch (Throwable unused) {
                MethodCollector.o(13095);
                return z;
            }
        }
    }

    private static boolean b() {
        if (!TextUtils.isEmpty(f60108a) && f60110c != null) {
            return false;
        }
        return true;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Context f60119a;

        /* renamed from: b  reason: collision with root package name */
        public ContentValues f60120b;

        static {
            Covode.recordClassIndex(37142);
        }

        public final synchronized void a() {
            MethodCollector.i(13067);
            try {
                this.f60119a.getContentResolver().insert(PushMultiProcessSharedProvider.a(this.f60119a, "key", StringSet.type), this.f60120b);
                MethodCollector.o(13067);
            } catch (Throwable unused) {
                MethodCollector.o(13067);
            }
        }

        private a(Context context) {
            this.f60120b = new ContentValues();
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f60119a = applicationContext;
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }

        public final a a(String str, String str2) {
            this.f60120b.put(str, str2);
            return this;
        }

        public final a a(String str, int i2) {
            this.f60120b.put(str, Integer.valueOf(i2));
            return this;
        }

        public final a a(String str, long j2) {
            this.f60120b.put(str, Long.valueOf(j2));
            return this;
        }
    }

    public boolean onCreate() {
        if (!Logger.debug() || com.ss.android.message.a.a.a(getContext())) {
            com.ss.android.message.a.a((Application) b(getContext()));
            if (f60110c != null) {
                return true;
            }
            try {
                Logger.debug();
                c(getContext());
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        } else {
            throw new IllegalAccessError("should be create in main process");
        }
    }

    private synchronized SharedPreferences a() {
        MethodCollector.i(13742);
        SharedPreferences sharedPreferences = this.f60112d;
        if (sharedPreferences == null) {
            int i2 = Build.VERSION.SDK_INT;
            SharedPreferences a2 = d.a(b(getContext()), "push_multi_process_config", 4);
            this.f60112d = a2;
            MethodCollector.o(13742);
            return a2;
        }
        MethodCollector.o(13742);
        return sharedPreferences;
    }

    private void c() {
        MethodCollector.i(13791);
        if (!this.f60114f) {
            synchronized (this.f60115g) {
                try {
                    if (!this.f60114f) {
                        SharedPreferences a2 = a();
                        if (a2 != null) {
                            for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (!(key == null || value == null)) {
                                    this.f60113e.put(key, value);
                                }
                            }
                        }
                        this.f60114f = true;
                    }
                } finally {
                    MethodCollector.o(13791);
                }
            }
            return;
        }
        MethodCollector.o(13791);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public String getType(Uri uri) {
        c();
        return "vnd.android.cursor.item/vnd." + f60108a + ".item";
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(android.database.Cursor r3) {
        /*
            r1 = 0
            if (r3 != 0) goto L_0x0005
            return r1
        L_0x0005:
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0010
            r0 = 0
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r3.close()     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(android.database.Cursor):long");
    }

    private static void c(Context context) {
        if (TextUtils.isEmpty(f60108a)) {
            f60108a = a(context, PushMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f60108a)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            f60110c = uriMatcher;
            uriMatcher.addURI(f60108a, "*/*", 65536);
            f60109b = Uri.parse("content://" + f60108a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (PushMultiProcessSharedProvider.class) {
            MethodCollector.i(13847);
            if (f60111h == null) {
                f60111h = new b(context, (byte) 0);
            }
            bVar = f60111h;
            MethodCollector.o(13847);
        }
        return bVar;
    }

    private Runnable a(final String str, final String str2) {
        return new Runnable() {
            /* class com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37141);
            }

            public final void run() {
                MethodCollector.i(12798);
                PushMultiProcessSharedProvider pushMultiProcessSharedProvider = PushMultiProcessSharedProvider.this;
                pushMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(PushMultiProcessSharedProvider.a(pushMultiProcessSharedProvider.getContext(), str, str2), null);
                MethodCollector.o(12798);
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f60108a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.database.Cursor r1, int r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x000e }
        L_0x000e:
            r1.close()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(android.database.Cursor, int):int");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Runnable runnable;
        String str;
        c();
        if (b()) {
            return null;
        }
        if (f60110c.match(uri) == 65536) {
            try {
                ArrayList<Runnable> arrayList = new ArrayList();
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    Logger.debug();
                    if (value == null) {
                        this.f60113e.remove(key);
                    } else {
                        Object obj = this.f60113e.get(key);
                        if (obj == null || !obj.equals(value)) {
                            this.f60113e.put(key, value);
                        }
                    }
                    if (Logger.debug()) {
                        if (("MultiProcessShareProvider reallly insert key = " + key + " value = " + value) != null) {
                            str = value.toString();
                        } else {
                            str = "null";
                        }
                        Logger.d("PushService", str);
                    }
                    if (editor == null) {
                        editor = a().edit();
                    }
                    if (value == null) {
                        editor.remove(key);
                    } else {
                        if (value instanceof String) {
                            editor.putString(key, (String) value);
                            runnable = a(key, "string");
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(key, ((Boolean) value).booleanValue());
                            runnable = a(key, "boolean");
                        } else if (value instanceof Long) {
                            editor.putLong(key, ((Long) value).longValue());
                            runnable = a(key, "long");
                        } else if (value instanceof Integer) {
                            editor.putInt(key, ((Integer) value).intValue());
                            runnable = a(key, "integer");
                        } else if (value instanceof Float) {
                            editor.putFloat(key, ((Float) value).floatValue());
                            runnable = a(key, "float");
                        } else {
                            throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(uri)));
                        }
                        if (runnable != null) {
                            arrayList.add(runnable);
                        }
                    }
                }
                if (editor == null) {
                    return null;
                }
                int i2 = Build.VERSION.SDK_INT;
                editor.apply();
                for (Runnable runnable2 : arrayList) {
                    runnable2.run();
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    private static String a(Context context, String str) {
        if (context == null || m.a(str)) {
            return null;
        }
        try {
            ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (str.equals(providerInfo.name)) {
                    return providerInfo.authority;
                }
            }
        } catch (Exception unused) {
        }
        return context.getPackageName() + ".push.SHARE_PROVIDER_AUTHORITY";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.database.Cursor r1, java.lang.String r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            java.lang.String r2 = r1.getString(r0)     // Catch:{ all -> 0x000e }
        L_0x000e:
            r1.close()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        c();
        if (b() || f60110c.match(uri) == 65536) {
            return 0;
        }
        throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
    }

    public static final synchronized Uri a(Context context, String str, String str2) {
        Uri build;
        synchronized (PushMultiProcessSharedProvider.class) {
            MethodCollector.i(13893);
            if (f60109b == null) {
                try {
                    Logger.debug();
                    c(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MethodCollector.o(13893);
                    return null;
                }
            }
            build = f60109b.buildUpon().appendPath(str).appendPath(str2).build();
            MethodCollector.o(13893);
        }
        return build;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Object obj;
        boolean z;
        int i2;
        c();
        MatrixCursor matrixCursor = null;
        if (b()) {
            return null;
        }
        if (f60110c.match(uri) == 65536) {
            try {
                int i3 = 1;
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = a().getAll();
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    try {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            MatrixCursor.RowBuilder newRow = matrixCursor2.newRow();
                            String str3 = "string";
                            if (!(value instanceof String)) {
                                if (value instanceof Boolean) {
                                    str3 = "boolean";
                                    if (((Boolean) value).booleanValue()) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                    value = Integer.valueOf(i2);
                                } else if (value instanceof Integer) {
                                    str3 = "integer";
                                } else if (value instanceof Long) {
                                    str3 = "long";
                                } else if (value instanceof Float) {
                                    str3 = "float";
                                }
                            }
                            newRow.add(key);
                            newRow.add(value);
                            newRow.add(str3);
                        }
                        return matrixCursor2;
                    } catch (Exception unused) {
                        matrixCursor = matrixCursor2;
                        return matrixCursor;
                    }
                } else {
                    String str4 = uri.getPathSegments().get(0);
                    boolean a2 = m.a(str4, "current_app_state");
                    boolean a3 = m.a(str4, "current_app_foreground");
                    if (!(this.f60113e.containsKey(str4) || a2 || a3)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    if (a2) {
                        try {
                            obj = Boolean.valueOf(com.bytedance.common.b.a.a().f26736a);
                        } catch (Exception unused2) {
                            matrixCursor = matrixCursor3;
                            return matrixCursor;
                        }
                    } else if (a3) {
                        com.bytedance.common.b.a.a();
                        if (!com.bytedance.common.b.a.f26733b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        obj = Boolean.valueOf(z);
                    } else {
                        obj = this.f60113e.get(str4);
                    }
                    MatrixCursor.RowBuilder newRow2 = matrixCursor3.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i3 = 0;
                        }
                        obj = Integer.valueOf(i3);
                    }
                    Logger.debug();
                    newRow2.add(obj);
                    return matrixCursor3;
                }
            } catch (Exception unused3) {
                return matrixCursor;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }
}
