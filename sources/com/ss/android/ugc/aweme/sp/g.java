package com.ss.android.ugc.aweme.sp;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.experiment.dx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class g implements SharedPreferences {

    /* renamed from: l  reason: collision with root package name */
    private static final Object f134000l = new Object();

    /* renamed from: a  reason: collision with root package name */
    final File f134001a;

    /* renamed from: b  reason: collision with root package name */
    public final String f134002b;

    /* renamed from: c  reason: collision with root package name */
    final File f134003c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f134004d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f134005e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public Map<String, Object> f134006f;

    /* renamed from: g  reason: collision with root package name */
    public int f134007g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f134008h = false;

    /* renamed from: i  reason: collision with root package name */
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> f134009i = new WeakHashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public long f134010j;

    /* renamed from: k  reason: collision with root package name */
    long f134011k;

    static {
        Covode.recordClassIndex(87668);
    }

    public final class a implements SharedPreferences.Editor {

        /* renamed from: b  reason: collision with root package name */
        private final Object f134019b = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, Object> f134020c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        private boolean f134021d = false;

        static {
            Covode.recordClassIndex(87671);
        }

        public final SharedPreferences.Editor clear() {
            MethodCollector.i(10743);
            synchronized (this.f134019b) {
                try {
                    this.f134021d = true;
                } finally {
                    MethodCollector.o(10743);
                }
            }
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
            return false;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean commit() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.sp.g$b r2 = r3.a()
                com.ss.android.ugc.aweme.sp.g r1 = com.ss.android.ugc.aweme.sp.g.this
                r0 = 0
                r1.a(r2, r0, r0)
                java.util.concurrent.CountDownLatch r0 = r2.f134032e     // Catch:{ InterruptedException -> 0x0017, all -> 0x0015 }
                r0.await()     // Catch:{ InterruptedException -> 0x0017, all -> 0x0015 }
                r3.a(r2)
                boolean r0 = r2.f134033f
                return r0
            L_0x0015:
                r0 = move-exception
                throw r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.g.a.commit():boolean");
        }

        public final void apply() {
            List<String> list;
            MethodCollector.i(10914);
            try {
                list = new ArrayList<>(this.f134020c.keySet());
            } catch (Exception unused) {
                list = Collections.emptyList();
            }
            final b a2 = a();
            final AnonymousClass1 r2 = new Runnable() {
                /* class com.ss.android.ugc.aweme.sp.g.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(87672);
                }

                public final void run() {
                    try {
                        a2.f134032e.await();
                    } catch (InterruptedException unused) {
                    }
                }
            };
            synchronized (d.f133984a) {
                try {
                    d.f133986c.add(r2);
                } catch (Throwable th) {
                    MethodCollector.o(10914);
                    throw th;
                }
            }
            g.this.a(a2, new Runnable() {
                /* class com.ss.android.ugc.aweme.sp.g.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(87673);
                }

                public final void run() {
                    MethodCollector.i(10815);
                    r2.run();
                    Runnable runnable = r2;
                    synchronized (d.f133984a) {
                        try {
                            d.f133986c.remove(runnable);
                        } finally {
                            MethodCollector.o(10815);
                        }
                    }
                }
            }, list);
            a(a2);
            MethodCollector.o(10914);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[SYNTHETIC, Splitter:B:18:0x005a] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf A[Catch:{ all -> 0x00f6 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.ss.android.ugc.aweme.sp.g.b a() {
            /*
            // Method dump skipped, instructions count: 258
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.g.a.a():com.ss.android.ugc.aweme.sp.g$b");
        }

        public a() {
        }

        public final SharedPreferences.Editor remove(String str) {
            MethodCollector.i(10742);
            synchronized (this.f134019b) {
                try {
                    this.f134020c.put(str, this);
                } finally {
                    MethodCollector.o(10742);
                }
            }
            return this;
        }

        public final void a(final b bVar) {
            if (!(bVar.f134030c == null || bVar.f134029b == null || bVar.f134029b.size() == 0)) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    for (int size = bVar.f134029b.size() - 1; size >= 0; size--) {
                        String str = bVar.f134029b.get(size);
                        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : bVar.f134030c) {
                            if (onSharedPreferenceChangeListener != null) {
                                onSharedPreferenceChangeListener.onSharedPreferenceChanged(g.this, str);
                            }
                        }
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.sp.g.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(87674);
                    }

                    public final void run() {
                        a.this.a(bVar);
                    }
                });
            }
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            MethodCollector.i(10587);
            synchronized (this.f134019b) {
                try {
                    this.f134020c.put(str, Boolean.valueOf(z));
                } finally {
                    MethodCollector.o(10587);
                }
            }
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f2) {
            MethodCollector.i(10586);
            synchronized (this.f134019b) {
                try {
                    this.f134020c.put(str, Float.valueOf(f2));
                } finally {
                    MethodCollector.o(10586);
                }
            }
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i2) {
            MethodCollector.i(10281);
            synchronized (this.f134019b) {
                try {
                    this.f134020c.put(str, Integer.valueOf(i2));
                } finally {
                    MethodCollector.o(10281);
                }
            }
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j2) {
            MethodCollector.i(10428);
            synchronized (this.f134019b) {
                try {
                    this.f134020c.put(str, Long.valueOf(j2));
                } finally {
                    MethodCollector.o(10428);
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet;
            MethodCollector.i(10121);
            synchronized (this.f134019b) {
                try {
                    Map<String, Object> map = this.f134020c;
                    if (set == null) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet(set);
                    }
                    map.put(str, hashSet);
                } finally {
                    MethodCollector.o(10121);
                }
            }
            return this;
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            MethodCollector.i(10120);
            synchronized (this.f134019b) {
                try {
                    this.f134020c.put(str, str2);
                    if (str2 != null && str2.length() > 500) {
                        String str3 = g.this.f134002b;
                        str2.length();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sp_value_size", str2.length());
                            jSONObject.put("sp_file_name", str3);
                            jSONObject.put("sp_key", str);
                            o.b("sp_put_big_size_value", "sp_put_big_size_value", jSONObject);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } finally {
                    MethodCollector.o(10120);
                }
            }
            return this;
        }
    }

    private void a() {
        MethodCollector.i(13689);
        if (!this.f134008h) {
            a.f133974b.get();
        }
        while (!this.f134008h) {
            try {
                this.f134004d.wait();
            } catch (InterruptedException unused) {
            }
        }
        MethodCollector.o(13689);
    }

    public final SharedPreferences.Editor edit() {
        MethodCollector.i(14060);
        synchronized (this.f134004d) {
            try {
                a();
            } catch (Throwable th) {
                MethodCollector.o(14060);
                throw th;
            }
        }
        a aVar = new a();
        MethodCollector.o(14060);
        return aVar;
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap hashMap;
        MethodCollector.i(13690);
        synchronized (this.f134004d) {
            try {
                a();
                hashMap = new HashMap(this.f134006f);
            } finally {
                MethodCollector.o(13690);
            }
        }
        return hashMap;
    }

    public final boolean contains(String str) {
        boolean containsKey;
        MethodCollector.i(14000);
        synchronized (this.f134004d) {
            try {
                a();
                containsKey = this.f134006f.containsKey(str);
            } finally {
                MethodCollector.o(14000);
            }
        }
        return containsKey;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        MethodCollector.i(13622);
        synchronized (this.f134004d) {
            try {
                this.f134009i.put(onSharedPreferenceChangeListener, f134000l);
            } finally {
                MethodCollector.o(13622);
            }
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        MethodCollector.i(13624);
        synchronized (this.f134004d) {
            try {
                this.f134009i.remove(onSharedPreferenceChangeListener);
            } finally {
                MethodCollector.o(13624);
            }
        }
    }

    static FileOutputStream b(File file) {
        FileOutputStream fileOutputStream;
        MethodCollector.i(14126);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                MethodCollector.o(14126);
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
            }
        }
        fileOutputStream2 = fileOutputStream;
        MethodCollector.o(14126);
        return fileOutputStream2;
    }

    public static boolean a(File file) {
        MethodCollector.i(13554);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(13554);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(13554);
        return delete;
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final long f134028a;

        /* renamed from: b  reason: collision with root package name */
        final List<String> f134029b;

        /* renamed from: c  reason: collision with root package name */
        final Set<SharedPreferences.OnSharedPreferenceChangeListener> f134030c;

        /* renamed from: d  reason: collision with root package name */
        final Map<String, Object> f134031d;

        /* renamed from: e  reason: collision with root package name */
        final CountDownLatch f134032e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f134033f;

        /* renamed from: g  reason: collision with root package name */
        boolean f134034g;

        static {
            Covode.recordClassIndex(87675);
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z, boolean z2) {
            this.f134034g = z;
            this.f134033f = z2;
            this.f134032e.countDown();
        }

        private b(long j2, List<String> list, Set<SharedPreferences.OnSharedPreferenceChangeListener> set, Map<String, Object> map) {
            this.f134032e = new CountDownLatch(1);
            this.f134033f = false;
            this.f134034g = false;
            this.f134028a = j2;
            this.f134029b = list;
            this.f134030c = set;
            this.f134031d = map;
        }

        /* synthetic */ b(long j2, List list, Set set, Map map, byte b2) {
            this(j2, list, set, map);
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        MethodCollector.i(13999);
        synchronized (this.f134004d) {
            try {
                a();
                try {
                    Boolean bool = (Boolean) this.f134006f.get(str);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                } catch (ClassCastException e2) {
                    e2.printStackTrace();
                }
            } finally {
                MethodCollector.o(13999);
            }
        }
        return z;
    }

    public final float getFloat(String str, float f2) {
        MethodCollector.i(13947);
        synchronized (this.f134004d) {
            try {
                a();
                try {
                    Float f3 = (Float) this.f134006f.get(str);
                    if (f3 != null) {
                        f2 = f3.floatValue();
                    }
                } catch (ClassCastException e2) {
                    e2.printStackTrace();
                }
            } finally {
                MethodCollector.o(13947);
            }
        }
        return f2;
    }

    public final int getInt(String str, int i2) {
        MethodCollector.i(13855);
        synchronized (this.f134004d) {
            try {
                a();
                try {
                    Integer num = (Integer) this.f134006f.get(str);
                    if (num != null) {
                        i2 = num.intValue();
                    }
                } catch (ClassCastException e2) {
                    e2.printStackTrace();
                }
            } finally {
                MethodCollector.o(13855);
            }
        }
        return i2;
    }

    public final long getLong(String str, long j2) {
        MethodCollector.i(13900);
        synchronized (this.f134004d) {
            try {
                a();
                try {
                    Long l2 = (Long) this.f134006f.get(str);
                    if (l2 != null) {
                        j2 = l2.longValue();
                    }
                } catch (ClassCastException e2) {
                    e2.printStackTrace();
                }
            } finally {
                MethodCollector.o(13900);
            }
        }
        return j2;
    }

    public final String getString(String str, String str2) {
        MethodCollector.i(13749);
        synchronized (this.f134004d) {
            try {
                a();
                String str3 = null;
                try {
                    str3 = (String) this.f134006f.get(str);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (str3 != null) {
                    str2 = str3;
                }
            } finally {
                MethodCollector.o(13749);
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        MethodCollector.i(13798);
        synchronized (this.f134004d) {
            try {
                a();
                Set<String> set2 = null;
                try {
                    set2 = (Set) this.f134006f.get(str);
                } catch (ClassCastException e2) {
                    e2.printStackTrace();
                }
                if (set2 != null) {
                    set = set2;
                }
            } finally {
                MethodCollector.o(13798);
            }
        }
        return set;
    }

    public g(String str, File file) {
        Executor a2;
        MethodCollector.i(13489);
        Object obj = new Object();
        this.f134004d = obj;
        this.f134001a = file;
        this.f134002b = str;
        this.f134003c = new File(file.getPath() + ".bak");
        this.f134008h = false;
        this.f134006f = null;
        synchronized (obj) {
            try {
                this.f134008h = false;
            } catch (Throwable th) {
                MethodCollector.o(13489);
                throw th;
            }
        }
        int a3 = dx.a() % 8;
        if (a3 == 1) {
            a2 = e.a(2);
        } else if (a3 == 2) {
            a2 = com.ss.android.ugc.aweme.cw.g.b();
        } else if (a3 == 3) {
            a2 = e.a(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
        } else if (a3 != 4) {
            if (e.f133997e == null) {
                e.f133997e = f.f133999a;
            }
            a2 = e.f133997e;
        } else {
            a2 = com.ss.android.ugc.aweme.cw.g.a();
        }
        a2.execute(new Runnable() {
            /* class com.ss.android.ugc.aweme.sp.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(87669);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
                r4 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
                if (r3.f134001a.canRead() == false) goto L_0x0068;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r2 = new java.io.BufferedInputStream(new java.io.FileInputStream(r3.f134001a), 16384);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
                r1 = android.util.Xml.newPullParser();
                r1.setInput(r2, null);
                r0 = (java.util.HashMap) com.ss.android.ugc.aweme.sp.j.a(r1, new java.lang.String[1]);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                r2.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
                r0 = th;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
                r2.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
                if (r2 != null) goto L_0x005e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
                r2.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
                r0 = th;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(10834);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
                throw r0;
             */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A[SYNTHETIC, Splitter:B:36:0x006b] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 201
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.g.AnonymousClass1.run():void");
            }
        });
        MethodCollector.o(13489);
    }

    public final void a(final b bVar, final Runnable runnable, final List<String> list) {
        final boolean z;
        MethodCollector.i(14096);
        boolean z2 = false;
        if (runnable == null) {
            z = true;
        } else {
            z = false;
        }
        AnonymousClass2 r6 = new Runnable() {
            /* class com.ss.android.ugc.aweme.sp.g.AnonymousClass2 */

            static {
                Covode.recordClassIndex(87670);
            }

            /* JADX WARNING: Removed duplicated region for block: B:48:0x00be A[SYNTHETIC, Splitter:B:48:0x00be] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 273
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sp.g.AnonymousClass2.run():void");
            }
        };
        if (z) {
            synchronized (this.f134004d) {
                try {
                    if (this.f134007g == 1) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14096);
                    throw th;
                }
            }
            if (z2) {
                r6.run();
                MethodCollector.o(14096);
                return;
            }
        }
        boolean z3 = !z;
        Handler a2 = d.a();
        synchronized (d.f133984a) {
            try {
                d.f133987d.add(r6);
                if (!z3 || !d.f133988e) {
                    a2.sendEmptyMessage(1);
                } else {
                    a2.sendEmptyMessageDelayed(1, 100);
                }
            } finally {
                MethodCollector.o(14096);
            }
        }
    }
}
