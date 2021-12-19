package com.bytedance.push.settings.storage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.settings.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PushProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static String f42316a;

    /* renamed from: b  reason: collision with root package name */
    public static Uri f42317b;

    /* renamed from: c  reason: collision with root package name */
    static volatile boolean f42318c;

    /* renamed from: d  reason: collision with root package name */
    private static UriMatcher f42319d;

    static {
        Covode.recordClassIndex(25854);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private static boolean a() {
        if (!TextUtils.isEmpty(f42316a) && f42319d != null) {
            return false;
        }
        return true;
    }

    public boolean onCreate() {
        f42318c = true;
        if (f42319d != null) {
            return true;
        }
        try {
            a(getContext());
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f42316a + ".item";
    }

    private static void a(Context context) {
        if (TextUtils.isEmpty(f42316a)) {
            f42316a = a(context, PushProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f42316a)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            f42319d = uriMatcher;
            uriMatcher.addURI(f42316a, "*/*/*/*", 65536);
            f42317b = Uri.parse("content://" + f42316a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f42316a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    static synchronized Uri a(Context context, b bVar) {
        synchronized (PushProvider.class) {
            MethodCollector.i(7249);
            if (f42317b == null) {
                try {
                    a(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MethodCollector.o(7249);
                    return null;
                }
            }
            if (bVar == null) {
                Uri uri = f42317b;
                MethodCollector.o(7249);
                return uri;
            }
            Uri a2 = bVar.a(f42317b);
            MethodCollector.o(7249);
            return a2;
        }
    }

    private static String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str.equals(providerInfo.name)) {
                        return providerInfo.authority;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return context.getPackageName() + ".push.settings";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        if (a()) {
            return null;
        }
        if (f42319d.match(uri) == 65536) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                return null;
            }
            String str2 = pathSegments.get(0);
            try {
                i a2 = h.f42313a.a(getContext(), true, str2);
                SharedPreferences.Editor a3 = a2.a();
                ArrayList<Runnable> arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value == null) {
                        a3.remove(key);
                    } else {
                        if (value instanceof String) {
                            if (!TextUtils.equals(a2.a(key), (String) value)) {
                                a3.putString(key, (String) value);
                                str = "string";
                            }
                        } else if (value instanceof Boolean) {
                            if (a2.e(key) != ((Boolean) value).booleanValue()) {
                                a3.putBoolean(key, ((Boolean) value).booleanValue());
                                str = "boolean";
                            }
                        } else if (value instanceof Long) {
                            if (a2.c(key) != ((Long) value).longValue()) {
                                a3.putLong(key, ((Long) value).longValue());
                                str = "long";
                            }
                        } else if (value instanceof Integer) {
                            if (a2.b(key) != ((Integer) value).intValue()) {
                                a3.putInt(key, ((Integer) value).intValue());
                                str = "integer";
                            }
                        } else if (!(value instanceof Float)) {
                            throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(uri)));
                        } else if (a2.d(key) != ((Float) value).floatValue()) {
                            a3.putFloat(key, ((Float) value).floatValue());
                            str = "float";
                        }
                        arrayList.add(a(getContext(), str2, key, str));
                    }
                }
                if (a3 == null) {
                    return null;
                }
                a3.apply();
                for (Runnable runnable : arrayList) {
                    runnable.run();
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        e eVar = f.f42344a.get(str);
        if (eVar == null) {
            return null;
        }
        return eVar.a(getContext(), bundle);
    }

    static Runnable a(final Context context, final String str, final String str2, final String str3) {
        return new Runnable() {
            /* class com.bytedance.push.settings.storage.PushProvider.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25855);
            }

            public final void run() {
                MethodCollector.i(7793);
                Uri a2 = PushProvider.a(context, new b(str, str2, "val", str3));
                if (a2 == null) {
                    MethodCollector.o(7793);
                    return;
                }
                try {
                    context.getContentResolver().notifyChange(a2, null);
                    MethodCollector.o(7793);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MethodCollector.o(7793);
                }
            }
        };
    }

    public static synchronized Uri b(Context context, String str, String str2, String str3) {
        synchronized (PushProvider.class) {
            MethodCollector.i(7246);
            if (f42317b == null) {
                try {
                    a(context);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MethodCollector.o(7246);
                    return null;
                }
            }
            if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                Uri uri = f42317b;
                MethodCollector.o(7246);
                return uri;
            }
            Uri a2 = new b(str, str2, "val", str3).a(f42317b);
            MethodCollector.o(7246);
            return a2;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        List<String> pathSegments;
        Object obj;
        if (!a() && f42319d.match(uri) == 65536 && uri != null && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() >= 4) {
            b bVar = new b(pathSegments.get(0), pathSegments.get(1), pathSegments.get(2), pathSegments.get(3));
            if (!TextUtils.isEmpty(bVar.f42324a) && !TextUtils.isEmpty(bVar.f42325b) && !TextUtils.isEmpty(bVar.f42327d)) {
                i a2 = h.f42313a.a(getContext(), true, bVar.f42324a);
                String str3 = bVar.f42327d;
                str3.hashCode();
                switch (str3.hashCode()) {
                    case -891985903:
                        if (str3.equals("string")) {
                            obj = a2.a(bVar.f42325b, bVar.f42326c);
                            MatrixCursor matrixCursor = new MatrixCursor(new String[]{bVar.f42325b});
                            matrixCursor.newRow().add(obj);
                            return matrixCursor;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 3327612:
                        if (str3.equals("long")) {
                            obj = Long.valueOf(a2.a(bVar.f42325b, Long.parseLong(bVar.f42326c)));
                            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{bVar.f42325b});
                            matrixCursor2.newRow().add(obj);
                            return matrixCursor2;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 64711720:
                        if (str3.equals("boolean")) {
                            obj = Integer.valueOf(a2.a(bVar.f42325b, Boolean.parseBoolean(bVar.f42326c)) ? 1 : 0);
                            MatrixCursor matrixCursor22 = new MatrixCursor(new String[]{bVar.f42325b});
                            matrixCursor22.newRow().add(obj);
                            return matrixCursor22;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 97526364:
                        if (str3.equals("float")) {
                            obj = Float.valueOf(a2.a(bVar.f42325b, Float.parseFloat(bVar.f42326c)));
                            MatrixCursor matrixCursor222 = new MatrixCursor(new String[]{bVar.f42325b});
                            matrixCursor222.newRow().add(obj);
                            return matrixCursor222;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 1958052158:
                        if (str3.equals("integer")) {
                            obj = Integer.valueOf(a2.a(bVar.f42325b, Integer.parseInt(bVar.f42326c)));
                            MatrixCursor matrixCursor2222 = new MatrixCursor(new String[]{bVar.f42325b});
                            matrixCursor2222.newRow().add(obj);
                            return matrixCursor2222;
                        }
                        throw new IllegalArgumentException("unknown type");
                    default:
                        throw new IllegalArgumentException("unknown type");
                }
            }
        }
        return null;
    }
}
