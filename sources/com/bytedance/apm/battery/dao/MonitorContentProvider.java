package com.bytedance.apm.battery.dao;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.core.SpPair;
import com.bytedance.apm.q.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MonitorContentProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static String f24539a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, SQLiteOpenHelper> f24540b = new HashMap();

    static {
        Covode.recordClassIndex(14452);
    }

    public String getType(Uri uri) {
        return null;
    }

    public boolean onCreate() {
        f24539a = getContext().getPackageName() + ".apm";
        return false;
    }

    private synchronized Pair<SharedPreferences, String> b(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String str = null;
        if (pathSegments == null || pathSegments.size() < 2 || !"sp".equals(pathSegments.get(0))) {
            return null;
        }
        SharedPreferences a2 = d.a(getContext(), pathSegments.get(1), 0);
        if (pathSegments.size() > 2) {
            str = pathSegments.get(2);
        }
        return new Pair<>(a2, str);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.util.Pair<android.database.sqlite.SQLiteDatabase, java.lang.String> a(android.net.Uri r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r4 = 0
            java.util.List r2 = r6.getPathSegments()     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            if (r2 == 0) goto L_0x004e
            int r1 = r2.size()     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            r0 = 2
            if (r1 < r0) goto L_0x004e
            r0 = 0
            java.lang.Object r1 = r2.get(r0)     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            r0 = 1
            java.lang.Object r3 = r2.get(r0)     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            if (r1 != 0) goto L_0x0021
            monitor-exit(r5)
            return r4
        L_0x0021:
            java.util.Map<java.lang.String, android.database.sqlite.SQLiteOpenHelper> r0 = r5.f24540b
            java.lang.Object r2 = r0.get(r1)
            android.database.sqlite.SQLiteOpenHelper r2 = (android.database.sqlite.SQLiteOpenHelper) r2
            if (r2 != 0) goto L_0x0041
            java.lang.String r0 = "apm_monitor_t1.db"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x004c
            com.bytedance.apm.battery.dao.b r2 = new com.bytedance.apm.battery.dao.b
            android.content.Context r0 = r5.getContext()
            r2.<init>(r0, r1)
            java.util.Map<java.lang.String, android.database.sqlite.SQLiteOpenHelper> r0 = r5.f24540b
            r0.put(r1, r2)
        L_0x0041:
            android.util.Pair r1 = new android.util.Pair
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()
            r1.<init>(r0, r3)
            monitor-exit(r5)
            return r1
        L_0x004c:
            monitor-exit(r5)
            return r4
        L_0x004e:
            monitor-exit(r5)
            return r4
        L_0x0050:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.dao.MonitorContentProvider.a(android.net.Uri):android.util.Pair");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a2 = a(uri);
        if (a2 == null || (sQLiteDatabase = (SQLiteDatabase) a2.first) == null) {
            return null;
        }
        try {
            long insert = sQLiteDatabase.insert((String) a2.second, null, contentValues);
            if (insert >= 0) {
                return ContentUris.withAppendedId(uri, insert);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static void a(SharedPreferences sharedPreferences, Bundle bundle) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bundle.getBoolean("clear")) {
            edit.clear();
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("edit");
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                SpPair spPair = (SpPair) it.next();
                if (spPair.f24871b == null) {
                    edit.remove(spPair.f24870a);
                } else {
                    String str = spPair.f24870a;
                    Object obj = spPair.f24871b;
                    if (obj instanceof String) {
                        edit.putString(str, (String) obj);
                    } else if (obj instanceof Integer) {
                        edit.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        edit.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        edit.putFloat(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Boolean) {
                        edit.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String[]) {
                        edit.putStringSet(str, new HashSet(Arrays.asList((String[]) obj)));
                    }
                }
            }
            edit.apply();
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a2 = a(uri);
        if (a2 == null || (sQLiteDatabase = (SQLiteDatabase) a2.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.delete((String) a2.second, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static Bundle a(SharedPreferences sharedPreferences, String str, Object obj) {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (str == null) {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
            }
            bundle.putParcelableArrayList("sp", arrayList);
        } else {
            Object obj2 = sharedPreferences.getAll().get(str);
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj instanceof Set) {
                obj = h.a((Set) obj);
            }
            arrayList.add(new SpPair(str, obj));
            bundle.putParcelableArrayList("sp", arrayList);
        }
        return bundle;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        SpPair spPair;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        if ("getPid".equals(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("Pid", Process.myPid());
            return bundle2;
        }
        Uri.parse(str);
        Pair<SharedPreferences, String> b2 = b(Uri.parse(str));
        Object obj = null;
        if (b2 == null) {
            return null;
        }
        if ("query".equals(str2)) {
            if (!(bundle == null || (spPair = (SpPair) bundle.getParcelable("sp")) == null)) {
                obj = spPair.f24871b;
            }
            return a((SharedPreferences) b2.first, (String) b2.second, obj);
        } else if ("contains".equals(str2)) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("contains", ((SharedPreferences) b2.first).contains((String) b2.second));
            return bundle3;
        } else {
            if ("edit".equals(str2) && bundle != null) {
                a((SharedPreferences) b2.first, bundle);
            }
            return null;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a2 = a(uri);
        if (a2 == null || (sQLiteDatabase = (SQLiteDatabase) a2.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.update((String) a2.second, contentValues, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a2 = a(uri);
        if (a2 == null || (sQLiteDatabase = (SQLiteDatabase) a2.first) == null) {
            return null;
        }
        if (TextUtils.equals(str2, "rawQuery")) {
            return sQLiteDatabase.rawQuery(str, strArr2);
        }
        if (TextUtils.equals(str2, "execSQL")) {
            String[] split = str.split(";");
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    sQLiteDatabase.execSQL(str3);
                }
            }
            return null;
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables((String) a2.second);
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
    }
}
