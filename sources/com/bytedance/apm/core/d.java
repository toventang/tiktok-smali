package com.bytedance.apm.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import com.bytedance.apm.q.h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d implements SharedPreferences {

    /* renamed from: d  reason: collision with root package name */
    private static int f24872d = -1;

    /* renamed from: a  reason: collision with root package name */
    public Application f24873a;

    /* renamed from: b  reason: collision with root package name */
    public String f24874b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f24875c;

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    class a implements SharedPreferences.Editor {

        /* renamed from: b  reason: collision with root package name */
        private boolean f24877b;

        /* renamed from: c  reason: collision with root package name */
        private HashMap<String, Object> f24878c;

        static {
            Covode.recordClassIndex(14552);
        }

        public final boolean commit() {
            apply();
            return true;
        }

        public final SharedPreferences.Editor clear() {
            this.f24878c.clear();
            this.f24877b = true;
            return this;
        }

        public final void apply() {
            if (this.f24877b || !this.f24878c.isEmpty()) {
                Bundle bundle = new Bundle();
                if (this.f24877b) {
                    bundle.putBoolean("clear", true);
                }
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f24878c.size());
                for (Map.Entry<String, Object> entry : this.f24878c.entrySet()) {
                    arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
                }
                bundle.putParcelableArrayList("edit", arrayList);
                try {
                    d.this.f24873a.getContentResolver().call(d.this.f24875c, d.this.f24874b, "edit", bundle);
                } catch (Exception unused) {
                }
            }
        }

        public final SharedPreferences.Editor remove(String str) {
            this.f24878c.put(str, null);
            return this;
        }

        private a() {
            this.f24878c = new HashMap<>();
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            this.f24878c.put(str, str2);
            return this;
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f24878c.put(str, Boolean.valueOf(z));
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f2) {
            this.f24878c.put(str, Float.valueOf(f2));
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i2) {
            this.f24878c.put(str, Integer.valueOf(i2));
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j2) {
            this.f24878c.put(str, Long.valueOf(j2));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.f24878c.put(str, h.a(set));
            return this;
        }
    }

    public final SharedPreferences.Editor edit() {
        return new a(this, (byte) 0);
    }

    static {
        Covode.recordClassIndex(14551);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        ArrayList<SpPair> a2 = a((String) null, (Object) null);
        if (a2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<SpPair> it = a2.iterator();
        while (it.hasNext()) {
            SpPair next = it.next();
            hashMap.put(next.f24870a, next.f24871b);
        }
        return hashMap;
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private static boolean c(Context context) {
        if (f24872d == -1) {
            f24872d = a(context);
        }
        if (f24872d == Process.myPid()) {
            return true;
        }
        return false;
    }

    private static int a(Context context) {
        try {
            Bundle call = context.getContentResolver().call(Uri.parse("content://" + context.getPackageName() + ".apm"), "getPid", (String) null, (Bundle) null);
            if (call != null) {
                return call.getInt("Pid", -1);
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public final boolean contains(String str) {
        String str2;
        Bundle bundle = null;
        try {
            ContentResolver contentResolver = this.f24873a.getContentResolver();
            Uri uri = this.f24875c;
            if (str != null) {
                str2 = this.f24874b + "/" + str;
            } else {
                str2 = this.f24874b;
            }
            bundle = contentResolver.call(uri, str2, "contains", (Bundle) null);
        } catch (Exception unused) {
        }
        if (bundle == null || !bundle.getBoolean("contains")) {
            return false;
        }
        return true;
    }

    public static SharedPreferences a(Context context, String str) {
        if (c(context)) {
            return com.ss.android.ugc.aweme.bf.d.a(context, str, 0);
        }
        return b(context, str);
    }

    private static SharedPreferences b(Context context, String str) {
        Application application;
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) b(context);
        }
        return new d(application, str);
    }

    public final String getString(String str, String str2) {
        ArrayList<SpPair> a2 = a(str, str2);
        if (a2 == null) {
            return null;
        }
        return (String) a2.get(0).f24871b;
    }

    private d(Application application, String str) {
        this.f24873a = application;
        String str2 = "content://" + application.getPackageName() + ".apm/sp/" + str;
        this.f24874b = str2;
        this.f24875c = Uri.parse(str2);
    }

    public final boolean getBoolean(String str, boolean z) {
        ArrayList<SpPair> a2 = a(str, String.valueOf(z));
        if (a2 == null) {
            return z;
        }
        Object obj = a2.get(0).f24871b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    public final float getFloat(String str, float f2) {
        ArrayList<SpPair> a2 = a(str, String.valueOf(f2));
        if (a2 == null) {
            return f2;
        }
        Object obj = a2.get(0).f24871b;
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            return Float.valueOf((String) obj).floatValue();
        }
        return f2;
    }

    public final int getInt(String str, int i2) {
        ArrayList<SpPair> a2 = a(str, String.valueOf(i2));
        if (a2 == null) {
            return i2;
        }
        Object obj = a2.get(0).f24871b;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.decode((String) obj).intValue();
        }
        return i2;
    }

    public final long getLong(String str, long j2) {
        ArrayList<SpPair> a2 = a(str, String.valueOf(j2));
        if (a2 == null) {
            return j2;
        }
        Object obj = a2.get(0).f24871b;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.decode((String) obj).longValue();
        }
        return j2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        ArrayList<SpPair> a2 = a(str, set);
        if (a2 == null || a2.get(0).f24871b == null) {
            return null;
        }
        String[] strArr = (String[]) a2.get(0).f24871b;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }

    private ArrayList<SpPair> a(String str, Object obj) {
        Bundle bundle;
        String str2;
        Bundle bundle2 = new Bundle();
        if (obj != null) {
            bundle2.putParcelable("sp", new SpPair(str, obj));
        }
        try {
            ContentResolver contentResolver = this.f24873a.getContentResolver();
            Uri uri = this.f24875c;
            if (str != null) {
                str2 = this.f24874b + "/" + str;
            } else {
                str2 = this.f24874b;
            }
            if (obj == null) {
                bundle2 = null;
            }
            bundle = contentResolver.call(uri, str2, "query", bundle2);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        return bundle.getParcelableArrayList("sp");
    }
}
