package com.bytedance.common.wschannel;

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
import com.bytedance.common.wschannel.e.d;
import com.bytedance.common.wschannel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WsChannelMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static String f26976a;

    /* renamed from: b  reason: collision with root package name */
    public static Uri f26977b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f26978c;

    /* renamed from: d  reason: collision with root package name */
    private static UriMatcher f26979d;

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f26980g;

    /* renamed from: i  reason: collision with root package name */
    private static b f26981i;

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f26982e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f26983f = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    private final Object f26984h = new Object();

    static {
        Covode.recordClassIndex(15930);
    }

    public final void a(Uri uri) {
        MethodCollector.i(5777);
        getContext().getContentResolver().notifyChange(uri, null);
        MethodCollector.o(5777);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Context f26988a;

        /* renamed from: b  reason: collision with root package name */
        public ContentValues f26989b;

        static {
            Covode.recordClassIndex(15932);
        }

        public final synchronized void a() {
            MethodCollector.i(10401);
            b();
            MethodCollector.o(10401);
        }

        private synchronized void b() {
            MethodCollector.i(10400);
            try {
                this.f26988a.getContentResolver().insert(WsChannelMultiProcessSharedProvider.a(this.f26988a, "key", StringSet.type), this.f26989b);
                MethodCollector.o(10400);
            } catch (Throwable unused) {
                MethodCollector.o(10400);
            }
        }

        private a(Context context) {
            this.f26989b = new ContentValues();
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f26988a = applicationContext;
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f26990a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f26991b;

        /* renamed from: c  reason: collision with root package name */
        private SharedPreferences f26992c;

        static {
            Covode.recordClassIndex(15933);
        }

        public final a a() {
            return new a(this.f26990a, (byte) 0);
        }

        private static Context a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        private b(Context context) {
            boolean z;
            if (!d.a(context) || !WsChannelMultiProcessSharedProvider.f26978c) {
                z = false;
            } else {
                z = true;
            }
            this.f26991b = z;
            Context a2 = a(context);
            this.f26990a = a2;
            this.f26992c = com.ss.android.ugc.aweme.bf.d.a(a(a2), "wschannel_multi_process_config", 4);
            Logger.debug();
        }

        /* synthetic */ b(Context context, byte b2) {
            this(context);
        }

        public final long a(String str, long j2) {
            MethodCollector.i(10075);
            try {
                if (this.f26991b) {
                    long j3 = this.f26992c.getLong(str, j2);
                    MethodCollector.o(10075);
                    return j3;
                }
                long a2 = WsChannelMultiProcessSharedProvider.a(this.f26990a.getContentResolver().query(WsChannelMultiProcessSharedProvider.a(this.f26990a, str, "long"), null, null, null, null), j2);
                MethodCollector.o(10075);
                return a2;
            } catch (Throwable unused) {
                MethodCollector.o(10075);
                return j2;
            }
        }

        public final String a(String str, String str2) {
            MethodCollector.i(9921);
            try {
                if (this.f26991b) {
                    String string = this.f26992c.getString(str, str2);
                    MethodCollector.o(9921);
                    return string;
                }
                String a2 = WsChannelMultiProcessSharedProvider.a(this.f26990a.getContentResolver().query(WsChannelMultiProcessSharedProvider.a(this.f26990a, str, "string"), null, null, null, null), str2);
                MethodCollector.o(9921);
                return a2;
            } catch (Throwable unused) {
                MethodCollector.o(9921);
                return str2;
            }
        }

        public final boolean a(String str, boolean z) {
            MethodCollector.i(10239);
            try {
                if (this.f26991b) {
                    boolean z2 = this.f26992c.getBoolean(str, z);
                    MethodCollector.o(10239);
                    return z2;
                }
                boolean a2 = WsChannelMultiProcessSharedProvider.a(this.f26990a.getContentResolver().query(WsChannelMultiProcessSharedProvider.a(this.f26990a, str, "boolean"), null, null, null, null), z);
                MethodCollector.o(10239);
                return a2;
            } catch (Throwable unused) {
                MethodCollector.o(10239);
                return z;
            }
        }
    }

    private synchronized SharedPreferences a() {
        MethodCollector.i(5780);
        SharedPreferences sharedPreferences = this.f26982e;
        if (sharedPreferences == null) {
            int i2 = Build.VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(applicationContext, "wschannel_multi_process_config", 4);
            this.f26982e = a2;
            MethodCollector.o(5780);
            return a2;
        }
        MethodCollector.o(5780);
        return sharedPreferences;
    }

    private void b() {
        MethodCollector.i(5890);
        if (!f26980g) {
            synchronized (this.f26984h) {
                try {
                    if (!f26980g) {
                        SharedPreferences a2 = a();
                        if (a2 == null) {
                            f26980g = true;
                            return;
                        }
                        for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
                            Object value = entry.getValue();
                            this.f26983f.put(entry.getKey(), value);
                        }
                        f26980g = true;
                    }
                    MethodCollector.o(5890);
                } finally {
                    MethodCollector.o(5890);
                }
            }
        } else {
            MethodCollector.o(5890);
        }
    }

    public boolean onCreate() {
        if (d.a(getContext())) {
            f26978c = true;
        }
        Context applicationContext = getContext().getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        Application application = (Application) applicationContext;
        d dVar = new d();
        dVar.f27205b = new k.a(application);
        application.registerActivityLifecycleCallbacks(dVar);
        if (f26979d == null) {
            try {
                Logger.debug();
                b(getContext());
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f26976a + ".item";
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            MethodCollector.i(5949);
            if (f26981i == null) {
                f26981i = new b(context, (byte) 0);
            }
            bVar = f26981i;
            MethodCollector.o(5949);
        }
        return bVar;
    }

    private static void b(Context context) {
        if (TextUtils.isEmpty(f26976a)) {
            f26976a = a(context, WsChannelMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f26976a)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            f26979d = uriMatcher;
            uriMatcher.addURI(f26976a, "*/*", 65536);
            f26977b = Uri.parse("content://" + f26976a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    private Runnable a(final String str, final String str2) {
        return new Runnable() {
            /* class com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15931);
            }

            public final void run() {
                WsChannelMultiProcessSharedProvider wsChannelMultiProcessSharedProvider = WsChannelMultiProcessSharedProvider.this;
                wsChannelMultiProcessSharedProvider.a(WsChannelMultiProcessSharedProvider.a(wsChannelMultiProcessSharedProvider.getContext(), str, str2));
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f26976a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(android.database.Cursor r1, long r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x000e }
        L_0x000e:
            r1.close()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.a(android.database.Cursor, long):long");
    }

    private static String a(Context context, String str) {
        if (context != null && !m.a(str)) {
            try {
                ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str.equals(providerInfo.name)) {
                        return providerInfo.authority;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Runnable runnable;
        String str;
        if (f26979d.match(uri) == 65536) {
            try {
                b();
                ArrayList<Runnable> arrayList = new ArrayList();
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    Logger.debug();
                    if (value == null) {
                        this.f26983f.remove(key);
                    } else {
                        Object obj = this.f26983f.get(key);
                        if (obj == null || !obj.equals(value)) {
                            this.f26983f.put(key, value);
                        }
                    }
                    if (Logger.debug()) {
                        if (("MultiProcessShareProvider reallly insert key = " + key + " value = " + value) != null) {
                            str = value.toString();
                        } else {
                            str = "null";
                        }
                        Logger.v("PushService", str);
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
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.a(android.database.Cursor, java.lang.String):java.lang.String");
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.a(android.database.Cursor, boolean):boolean");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (f26979d.match(uri) == 65536) {
            try {
                a().edit().clear().commit();
                this.f26983f.clear();
                a(a(getContext(), "key", StringSet.type));
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    public static final synchronized Uri a(Context context, String str, String str2) {
        Uri build;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            MethodCollector.i(5951);
            if (f26977b == null) {
                try {
                    Logger.debug();
                    b(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MethodCollector.o(5951);
                    return null;
                }
            }
            build = f26977b.buildUpon().appendPath(str).appendPath(str2).build();
            MethodCollector.o(5951);
        }
        return build;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        if (f26979d.match(uri) == 65536) {
            MatrixCursor matrixCursor = null;
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
                    b();
                    if (!this.f26983f.containsKey(str4)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    Object obj = this.f26983f.get(str4);
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
            } catch (Exception unused2) {
                return matrixCursor;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }
}
