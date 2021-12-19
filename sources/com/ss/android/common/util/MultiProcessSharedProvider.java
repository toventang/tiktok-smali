package com.ss.android.common.util;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static String f59369a;

    /* renamed from: b  reason: collision with root package name */
    public static Uri f59370b;

    /* renamed from: c  reason: collision with root package name */
    private static UriMatcher f59371c;

    /* renamed from: f  reason: collision with root package name */
    private static b f59372f;

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences f59373d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f59374e;

    static {
        Covode.recordClassIndex(36656);
    }

    private void a(Uri uri) {
        MethodCollector.i(13053);
        getContext().getContentResolver().notifyChange(uri, null);
        MethodCollector.o(13053);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Context f59375a;

        /* renamed from: b  reason: collision with root package name */
        public ContentValues f59376b;

        static {
            Covode.recordClassIndex(36657);
        }

        public final synchronized void a() {
            MethodCollector.i(11547);
            b();
            MethodCollector.o(11547);
        }

        private synchronized void b() {
            MethodCollector.i(11546);
            try {
                this.f59375a.getContentResolver().insert(MultiProcessSharedProvider.a(this.f59375a, "key", StringSet.type), this.f59376b);
                MethodCollector.o(11546);
            } catch (Throwable unused) {
                MethodCollector.o(11546);
            }
        }

        private a(Context context) {
            this.f59376b = new ContentValues();
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f59375a = applicationContext;
        }

        public /* synthetic */ a(Context context, byte b2) {
            this(context);
        }
    }

    private synchronized SharedPreferences a() {
        MethodCollector.i(13054);
        SharedPreferences sharedPreferences = this.f59373d;
        if (sharedPreferences == null) {
            int i2 = Build.VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            SharedPreferences a2 = d.a(applicationContext, "multi_process_config", 4);
            this.f59373d = a2;
            MethodCollector.o(13054);
            return a2;
        }
        MethodCollector.o(13054);
        return sharedPreferences;
    }

    public boolean onCreate() {
        if (f59371c == null) {
            try {
                Logger.debug();
                b(getContext());
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        try {
            if (com.bytedance.ies.uikit.a.d.f35380a != null) {
                getContext();
                return true;
            }
            a(getContext(), new Intent(getContext(), Class.forName("com.ss.android.newmedia.message.MessageHandler")));
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    private synchronized void b() {
        MethodCollector.i(11685);
        if (this.f59374e == null) {
            this.f59374e = new ConcurrentHashMap();
            SharedPreferences a2 = a();
            if (a2 != null) {
                for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
                    Object value = entry.getValue();
                    this.f59374e.put(entry.getKey(), value);
                }
            }
        }
        MethodCollector.o(11685);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f59377a;

        static {
            Covode.recordClassIndex(36658);
        }

        private b(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f59377a = applicationContext;
            Logger.debug();
        }

        /* synthetic */ b(Context context, byte b2) {
            this(context);
        }

        public final int a(String str, int i2) {
            MethodCollector.i(11150);
            try {
                int a2 = MultiProcessSharedProvider.a(this.f59377a.getContentResolver().query(MultiProcessSharedProvider.a(this.f59377a, str, "integer"), null, null, null, null), i2);
                MethodCollector.o(11150);
                return a2;
            } catch (Throwable unused) {
                MethodCollector.o(11150);
                return i2;
            }
        }

        public final String a(String str, String str2) {
            MethodCollector.i(11149);
            try {
                String a2 = MultiProcessSharedProvider.a(this.f59377a.getContentResolver().query(MultiProcessSharedProvider.a(this.f59377a, str, "string"), null, null, null, null), str2);
                MethodCollector.o(11149);
                return a2;
            } catch (Throwable unused) {
                MethodCollector.o(11149);
                return str2;
            }
        }
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f59369a + ".item";
    }

    private static void b(Context context) {
        if (TextUtils.isEmpty(f59369a)) {
            String a2 = a(context, MultiProcessSharedProvider.class.getName());
            f59369a = a2;
            if (!TextUtils.isEmpty(a2)) {
                Logger.debug();
            } else {
                throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
            }
        }
        UriMatcher uriMatcher = new UriMatcher(-1);
        f59371c = uriMatcher;
        uriMatcher.addURI(f59369a, "*/*", 65536);
        f59370b = Uri.parse("content://" + f59369a);
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (MultiProcessSharedProvider.class) {
            MethodCollector.i(11847);
            if (f59372f == null) {
                f59372f = new b(context, (byte) 0);
            }
            bVar = f59372f;
            MethodCollector.o(11847);
        }
        return bVar;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        f59369a = providerInfo.authority;
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.MultiProcessSharedProvider.a(android.database.Cursor, int):int");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.MultiProcessSharedProvider.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        if (f59371c.match(uri) == 65536) {
            try {
                b();
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    Logger.debug();
                    if (value == null) {
                        this.f59374e.remove(key);
                    } else {
                        Object obj = this.f59374e.get(key);
                        if (obj == null || !obj.equals(value)) {
                            this.f59374e.put(key, value);
                        }
                    }
                    Logger.debug();
                    if (editor == null) {
                        editor = a().edit();
                    }
                    if (value == null) {
                        editor.remove(key);
                    } else if (value instanceof String) {
                        editor.putString(key, (String) value);
                        a(a(getContext(), key, "string"));
                    } else if (value instanceof Boolean) {
                        editor.putBoolean(key, ((Boolean) value).booleanValue());
                        a(a(getContext(), key, "boolean"));
                    } else if (value instanceof Long) {
                        editor.putLong(key, ((Long) value).longValue());
                        a(a(getContext(), key, "long"));
                    } else if (value instanceof Integer) {
                        editor.putInt(key, ((Integer) value).intValue());
                        a(a(getContext(), key, "integer"));
                    } else if (value instanceof Float) {
                        editor.putFloat(key, ((Float) value).floatValue());
                        a(a(getContext(), key, "float"));
                    } else {
                        throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(uri)));
                    }
                }
                if (editor == null) {
                    return null;
                }
                int i2 = Build.VERSION.SDK_INT;
                editor.apply();
                return null;
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.MultiProcessSharedProvider.a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (f59371c.match(uri) == 65536) {
            try {
                b();
                a().edit().clear().commit();
                this.f59374e.clear();
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
        synchronized (MultiProcessSharedProvider.class) {
            MethodCollector.i(11848);
            if (f59370b == null) {
                try {
                    Logger.debug();
                    b(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MethodCollector.o(11848);
                    return null;
                }
            }
            build = f59370b.buildUpon().appendPath(str).appendPath(str2).build();
            MethodCollector.o(11848);
        }
        return build;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        if (f59371c.match(uri) == 65536) {
            MatrixCursor matrixCursor = null;
            try {
                b();
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
                    if (!this.f59374e.containsKey(str4)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    Object obj = this.f59374e.get(str4);
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
