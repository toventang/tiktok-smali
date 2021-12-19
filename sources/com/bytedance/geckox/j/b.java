package com.bytedance.geckox.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.f;
import com.bytedance.geckox.statistic.c;
import com.bytedance.geckox.utils.e;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, ConcurrentHashMap<String, a>> f29909a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    static Map<String, File> f29910b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, Boolean> f29911c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static boolean f29912d;

    /* renamed from: e  reason: collision with root package name */
    public static int f29913e = 7;

    /* renamed from: f  reason: collision with root package name */
    public static int f29914f;

    /* renamed from: g  reason: collision with root package name */
    public static Map<String, ? extends ArrayList<String>> f29915g;

    /* renamed from: h  reason: collision with root package name */
    public static com.bytedance.geckox.m.b f29916h = new com.bytedance.geckox.m.b("meta-timer-task");

    /* renamed from: i  reason: collision with root package name */
    public static final b f29917i = new b();

    /* renamed from: com.bytedance.geckox.j.b$b  reason: collision with other inner class name */
    public static final class C0631b extends com.bytedance.geckox.m.a<Void> {
        static {
            Covode.recordClassIndex(17346);
        }

        @Override // com.bytedance.geckox.m.a
        public final int a() {
            return 5;
        }

        C0631b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
            if (r6 == null) goto L_0x00ed;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8 A[SYNTHETIC, Splitter:B:26:0x00c8] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0011 A[SYNTHETIC] */
        @Override // com.bytedance.geckox.m.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
            // Method dump skipped, instructions count: 245
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.j.b.C0631b.b():void");
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(17344);
    }

    public static final class a extends com.bytedance.geckox.m.a<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f29918a;

        static {
            Covode.recordClassIndex(17345);
        }

        @Override // com.bytedance.geckox.m.a
        public final int a() {
            return 5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.geckox.j.a>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.geckox.m.a
        public final void b() {
            Map<String, ? extends ArrayList<String>> map = b.f29915g;
            if (map == null) {
                l.a();
            }
            for (String str : map.keySet()) {
                if (b.a(str) == null && !b.b(str)) {
                    Map<String, ? extends ArrayList<String>> map2 = b.f29915g;
                    if (map2 == null) {
                        l.a();
                    }
                    ArrayList arrayList = (ArrayList) map2.get(str);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            concurrentHashMap.put(it.next(), new a(this.f29918a, false, 2, null));
                        }
                        b.f29911c.put(str, true);
                        b.f29909a.put(str, concurrentHashMap);
                    }
                }
            }
            b.f29916h.a(new C0631b());
        }

        public a(long j2) {
            this.f29918a = j2;
        }
    }

    public static boolean b(String str) {
        if (f29910b.get(str) != null) {
            return true;
        }
        File file = new File(f.a().f29842a.get(str) + File.separator + str + File.separator + "metaData.json");
        if (!file.exists()) {
            return false;
        }
        f29910b.put(str, file);
        return true;
    }

    public static long a(boolean z) {
        int i2;
        long j2 = 0;
        if (!f29912d) {
            return 0;
        }
        int i3 = f29913e * 24 * 60 * 60 * 1000;
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, ConcurrentHashMap<String, a>> entry : f29909a.entrySet()) {
            String key = entry.getKey();
            String str = f.a().f29842a.get(key) + File.separator + key;
            for (Map.Entry<String, a> entry2 : entry.getValue().entrySet()) {
                String key2 = entry2.getKey();
                a value = entry2.getValue();
                if (currentTimeMillis - value.lastReadTimeStamp >= ((long) i3)) {
                    File file = new File(str, key2);
                    if (file.exists()) {
                        j2 += e.d(file);
                        if (z) {
                            value.allowUpdate = false;
                            f29911c.put(key, true);
                            long currentTimeMillis2 = System.currentTimeMillis();
                            boolean a2 = com.bytedance.geckox.b.b.a(file.getAbsolutePath());
                            long currentTimeMillis3 = System.currentTimeMillis();
                            if (a2) {
                                i2 = 202;
                            } else {
                                i2 = 203;
                            }
                            c.a(new com.bytedance.geckox.statistic.model.b(key2, currentTimeMillis3 - currentTimeMillis2, i2, f29913e, f29914f));
                        }
                    }
                }
            }
        }
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a A[SYNTHETIC, Splitter:B:41:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a0 A[SYNTHETIC, Splitter:B:50:0x00a0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.geckox.j.a> a(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.j.b.a(java.lang.String):java.util.concurrent.ConcurrentHashMap");
    }

    public static void a(String str, String str2, String str3, String str4, String str5, long j2) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(str4, "");
        l.c(str5, "");
        ConcurrentHashMap<String, a> concurrentHashMap = f29909a.get(str);
        if (concurrentHashMap == null || concurrentHashMap.get(str2) == null) {
            c.a(str, str2, str3, str4, str5, "false", 0, 0);
            return;
        }
        a aVar = concurrentHashMap.get(str2);
        if (aVar == null) {
            l.a();
        }
        l.a((Object) aVar, "");
        a aVar2 = aVar;
        c.a(str, str2, str3, str4, str5, String.valueOf(!aVar2.allowUpdate), f29913e, f29914f);
        if (aVar2.allowUpdate) {
            aVar2.lastReadTimeStamp = j2;
        } else {
            aVar2.allowUpdate = true;
        }
        f29911c.put(str, true);
    }
}
