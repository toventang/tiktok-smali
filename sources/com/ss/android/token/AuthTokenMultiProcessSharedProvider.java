package com.ss.android.token;

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
import android.util.Log;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class AuthTokenMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static String f60988a;

    /* renamed from: b  reason: collision with root package name */
    public static Uri f60989b;

    /* renamed from: c  reason: collision with root package name */
    public static String f60990c = "token_shared_preference";

    /* renamed from: d  reason: collision with root package name */
    private static UriMatcher f60991d;

    /* renamed from: i  reason: collision with root package name */
    private static b f60992i;

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f60993e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f60994f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f60995g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Object f60996h = new Object();

    public final void a(Uri uri) {
        MethodCollector.i(13021);
        getContext().getContentResolver().notifyChange(uri, null);
        MethodCollector.o(13021);
    }

    static {
        Covode.recordClassIndex(37581);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f61002a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f61003b;

        /* renamed from: c  reason: collision with root package name */
        private SharedPreferences f61004c;

        static {
            Covode.recordClassIndex(37584);
        }

        public final a a() {
            return new a(this.f61002a, (byte) 0);
        }

        private static Context a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        public final boolean a(String str) {
            MethodCollector.i(12100);
            try {
                if (this.f61003b) {
                    boolean z = this.f61004c.getBoolean(str, true);
                    MethodCollector.o(12100);
                    return z;
                }
                boolean a2 = AuthTokenMultiProcessSharedProvider.a(this.f61002a.getContentResolver().query(AuthTokenMultiProcessSharedProvider.a(this.f61002a, str, "boolean"), null, null, null, null));
                MethodCollector.o(12100);
                return a2;
            } catch (Throwable th) {
                e.a(th);
                MethodCollector.o(12100);
                return true;
            }
        }

        public final String a(String str, String str2) {
            MethodCollector.i(11968);
            try {
                if (this.f61003b) {
                    String string = this.f61004c.getString(str, str2);
                    d.a("AuthTokenMultiProcessShared", "mSharedPreferences main getString get key = " + str + " value = " + f.a((Object) string) + " " + Log.getStackTraceString(new Exception()));
                    MethodCollector.o(11968);
                    return string;
                }
                String a2 = AuthTokenMultiProcessSharedProvider.a(this.f61002a.getContentResolver().query(AuthTokenMultiProcessSharedProvider.a(this.f61002a, str, "string"), null, null, null, null), str2);
                d.a("AuthTokenMultiProcessShared", " MultiProcessShared getString get key = " + str + " value = " + f.a((Object) a2) + " " + Log.getStackTraceString(new Exception()));
                MethodCollector.o(11968);
                return a2;
            } catch (Throwable th) {
                e.a(th);
                MethodCollector.o(11968);
                return str2;
            }
        }

        private b(Context context, String str, boolean z) {
            this.f61003b = z;
            this.f61002a = a(context);
            AuthTokenMultiProcessSharedProvider.f60990c = str;
            this.f61004c = com.ss.android.ugc.aweme.bf.d.a(a(this.f61002a), AuthTokenMultiProcessSharedProvider.f60990c, 4);
            Logger.debug();
        }

        /* synthetic */ b(Context context, String str, boolean z, byte b2) {
            this(context, str, z);
        }
    }

    private static boolean b() {
        if (!TextUtils.isEmpty(f60988a) && f60991d != null) {
            return false;
        }
        return true;
    }

    private synchronized SharedPreferences a() {
        MethodCollector.i(13022);
        SharedPreferences sharedPreferences = this.f60993e;
        if (sharedPreferences == null) {
            int i2 = Build.VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(applicationContext, f60990c, 4);
            this.f60993e = a2;
            MethodCollector.o(13022);
            return a2;
        }
        MethodCollector.o(13022);
        return sharedPreferences;
    }

    public boolean onCreate() {
        if (Logger.debug() && !g.a(getContext())) {
            throw new IllegalAccessError("should be create in main process");
        } else if (f60991d != null) {
            return true;
        } else {
            try {
                Logger.debug();
                a(getContext());
                return true;
            } catch (Exception e2) {
                e.a(e2);
                e2.printStackTrace();
                return false;
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Context f61000a;

        /* renamed from: b  reason: collision with root package name */
        private ContentValues f61001b;

        static {
            Covode.recordClassIndex(37583);
        }

        public final synchronized void a() {
            MethodCollector.i(12256);
            try {
                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.f61000a, AuthTokenMultiProcessSharedProvider.f60990c, 4).edit();
                for (Map.Entry<String, Object> entry : this.f61001b.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    d.a("AuthTokenMultiProcessShared", "MultiProcessShareProvider apply key = " + key + " value = " + f.a(value));
                    if (value == null) {
                        edit.remove(key);
                    } else if (value instanceof String) {
                        edit.putString(key, (String) value);
                    } else if (value instanceof Boolean) {
                        edit.putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Long) {
                        edit.putLong(key, ((Long) value).longValue());
                    } else if (value instanceof Integer) {
                        edit.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Float) {
                        edit.putFloat(key, ((Float) value).floatValue());
                    }
                }
                edit.commit();
                this.f61000a.getContentResolver().insert(AuthTokenMultiProcessSharedProvider.a(this.f61000a, "key", StringSet.type), this.f61001b);
                MethodCollector.o(12256);
            } catch (Throwable th) {
                d.a("AuthTokenMultiProcessShared", "MultiProcessShareProvider apply error = " + Log.getStackTraceString(th));
                e.a(th);
                MethodCollector.o(12256);
            }
        }

        public final a a(String str) {
            this.f61001b.put(str, (Boolean) false);
            return this;
        }

        private a(Context context) {
            this.f61001b = new ContentValues();
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f61000a = applicationContext;
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }

        public final a a(String str, String str2) {
            this.f61001b.put(str, str2);
            return this;
        }
    }

    private void c() {
        MethodCollector.i(13115);
        if (!this.f60995g) {
            synchronized (this.f60996h) {
                try {
                    if (!this.f60995g) {
                        SharedPreferences a2 = a();
                        if (a2 != null) {
                            for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == null || key == null) {
                                    try {
                                        d.a("AuthTokenMultiProcessShared", "MultiProcessShareProvider loadValues key_ = " + key + " value_ = " + value);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("key_", key);
                                        jSONObject.put("value_", value);
                                        com.bytedance.sdk.a.i.a.a("token_sp_error", jSONObject);
                                    } catch (Exception e2) {
                                        e.a(e2);
                                    }
                                } else {
                                    this.f60994f.put(key, value);
                                }
                            }
                        }
                        this.f60995g = true;
                    }
                } finally {
                    MethodCollector.o(13115);
                }
            }
            return;
        }
        MethodCollector.o(13115);
    }

    public String getType(Uri uri) {
        c();
        return "vnd.android.cursor.item/vnd." + f60988a + ".item";
    }

    private static void a(Context context) {
        if (TextUtils.isEmpty(f60988a)) {
            f60988a = a(context, AuthTokenMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f60988a)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            f60991d = uriMatcher;
            uriMatcher.addURI(f60988a, "*/*", 65536);
            f60989b = Uri.parse("content://" + f60988a);
            return;
        }
        throw new IllegalStateException("Must Set AuthTokenMultiProcessSharedProvider Authority");
    }

    public static boolean a(Cursor cursor) {
        boolean z = true;
        if (cursor == null) {
            return true;
        }
        try {
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) <= 0) {
                    z = false;
                }
            }
            try {
                cursor.close();
            } catch (Exception e2) {
                e.a(e2);
            }
        } catch (Throwable th) {
            try {
                cursor.close();
            } catch (Exception e3) {
                e.a(e3);
            }
            throw th;
        }
        return z;
    }

    private Runnable a(final String str, final String str2) {
        return new Runnable() {
            /* class com.ss.android.token.AuthTokenMultiProcessSharedProvider.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37582);
            }

            public final void run() {
                AuthTokenMultiProcessSharedProvider authTokenMultiProcessSharedProvider = AuthTokenMultiProcessSharedProvider.this;
                authTokenMultiProcessSharedProvider.a(AuthTokenMultiProcessSharedProvider.a(authTokenMultiProcessSharedProvider.getContext(), str, str2));
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f60988a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
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
        } catch (Exception e2) {
            e.a(e2);
        }
        return context.getPackageName() + ".auth_token.SHARE_PROVIDER_AUTHORITY";
    }

    public static String a(Cursor cursor, String str) {
        if (cursor == null) {
            return str;
        }
        try {
            if (cursor.moveToFirst()) {
                str = cursor.getString(0);
            }
            try {
                cursor.close();
            } catch (Exception e2) {
                e.a(e2);
            }
        } catch (Throwable th) {
            try {
                cursor.close();
            } catch (Exception e3) {
                e.a(e3);
            }
            throw th;
        }
        return str;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Runnable runnable;
        c();
        if (b()) {
            return null;
        }
        if (f60991d.match(uri) == 65536) {
            try {
                ArrayList<Runnable> arrayList = new ArrayList();
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    d.a("AuthTokenMultiProcessShared", "MultiProcessShareProvider reallly insert key = " + key + " value = " + f.a(value));
                    if (key != null) {
                        if (value == null) {
                            this.f60994f.remove(key);
                        } else {
                            Object obj = this.f60994f.get(key);
                            if (obj == null || !obj.equals(value)) {
                                this.f60994f.put(key, value);
                            }
                        }
                        d.a("AuthTokenMultiProcessShared", "MultiProcessShareProvider reallly insert key = " + key + " value = " + f.a(value));
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
                e.a(e2);
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    public static synchronized b a(Context context, String str, boolean z) {
        b bVar;
        synchronized (AuthTokenMultiProcessSharedProvider.class) {
            MethodCollector.i(13119);
            if (f60992i == null) {
                f60992i = new b(context, str, z, (byte) 0);
            }
            bVar = f60992i;
            MethodCollector.o(13119);
        }
        return bVar;
    }

    public static final synchronized Uri a(Context context, String str, String str2) {
        Uri build;
        synchronized (AuthTokenMultiProcessSharedProvider.class) {
            MethodCollector.i(13201);
            if (f60989b == null) {
                try {
                    Logger.debug();
                    a(context);
                } catch (Exception e2) {
                    e.a(e2);
                    MethodCollector.o(13201);
                    return null;
                }
            }
            build = f60989b.buildUpon().appendPath(str).appendPath(str2).build();
            MethodCollector.o(13201);
        }
        return build;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        c();
        if (b()) {
            return 0;
        }
        if (f60991d.match(uri) == 65536) {
            try {
                this.f60994f.clear();
                a().edit().clear().commit();
                a(a(getContext(), "key", StringSet.type));
            } catch (Exception e2) {
                e.a(e2);
            }
            return 0;
        }
        throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Exception e2;
        int i2;
        c();
        MatrixCursor matrixCursor = null;
        if (b()) {
            return null;
        }
        if (f60991d.match(uri) == 65536) {
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
                    } catch (Exception e3) {
                        e2 = e3;
                        matrixCursor = matrixCursor2;
                        e.a(e2);
                        return matrixCursor;
                    }
                } else {
                    String str4 = uri.getPathSegments().get(0);
                    if (!this.f60994f.containsKey(str4)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    Object obj = this.f60994f.get(str4);
                    MatrixCursor.RowBuilder newRow2 = matrixCursor3.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i3 = 0;
                        }
                        obj = Integer.valueOf(i3);
                    }
                    d.a("AuthTokenMultiProcessShared", "MultiProcessShareProvider  get key = " + str4 + " value = " + f.a(obj) + " " + Log.getStackTraceString(new Exception()));
                    newRow2.add(obj);
                    return matrixCursor3;
                }
            } catch (Exception e4) {
                e2 = e4;
                e.a(e2);
                return matrixCursor;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }
}
