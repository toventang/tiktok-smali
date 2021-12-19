package com.bytedance.crash.j;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.c;
import com.bytedance.crash.entity.d;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.b;
import com.bytedance.crash.runtime.n;
import com.bytedance.crash.runtime.s;
import com.bytedance.crash.util.g;
import com.bytedance.crash.util.q;
import com.bytedance.crash.util.v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final q<a, d> f27689a = new q<a, d>() {
        /* class com.bytedance.crash.j.i.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16236);
        }

        @Override // com.bytedance.crash.util.q
        public final List<d> newList() {
            return new LinkedList();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public static final Object f27690d = c.f27560b;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<a, HashMap<String, LinkedList<d>>> f27691e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static volatile i f27692f;

    /* renamed from: b  reason: collision with root package name */
    public final s f27693b = n.b();

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f27694c = new Runnable() {
        /* class com.bytedance.crash.j.i.AnonymousClass2 */

        static {
            Covode.recordClassIndex(16237);
        }

        public final void run() {
            if (!com.bytedance.crash.n.f27744h) {
                i.b();
                i.this.c();
                i.this.f27693b.a(i.this.f27694c, 30000);
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f27695g;

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        private static final HashMap<Integer, a> f27700c = new HashMap<>();

        /* renamed from: a  reason: collision with root package name */
        final Object f27701a;

        /* renamed from: b  reason: collision with root package name */
        final int f27702b;

        static {
            Covode.recordClassIndex(16242);
        }

        public final int hashCode() {
            return (this.f27701a.hashCode() * 31) + this.f27702b;
        }

        private static int a(d dVar) {
            if (dVar.c()) {
                return 1;
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27702b != aVar.f27702b) {
                return false;
            }
            return this.f27701a.equals(aVar.f27701a);
        }

        private a(Object obj, int i2) {
            this.f27701a = obj;
            this.f27702b = i2;
        }

        private static int b(Object obj, d dVar) {
            return (obj.hashCode() * 31) + a(dVar);
        }

        public static a a(Object obj, d dVar) {
            int b2 = b(obj, dVar);
            HashMap<Integer, a> hashMap = f27700c;
            a aVar = hashMap.get(Integer.valueOf(b2));
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a(obj, a(dVar));
            hashMap.put(Integer.valueOf(b2), aVar2);
            return aVar2;
        }
    }

    static {
        Covode.recordClassIndex(16235);
    }

    private i() {
    }

    private static void d() {
        if (com.bytedance.crash.n.f27737a && !com.bytedance.crash.n.f27744h) {
            try {
                n.b().a(new Runnable() {
                    /* class com.bytedance.crash.j.i.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(16239);
                    }

                    public final void run() {
                        i.a().c();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static i a() {
        MethodCollector.i(10136);
        if (f27692f == null) {
            synchronized (i.class) {
                try {
                    if (f27692f == null) {
                        f27692f = new i();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10136);
                    throw th;
                }
            }
        }
        i iVar = f27692f;
        MethodCollector.o(10136);
        return iVar;
    }

    public static void b() {
        HashMap hashMap;
        MethodCollector.i(8780);
        HashMap<a, HashMap<String, LinkedList<d>>> hashMap2 = f27691e;
        if (hashMap2.isEmpty()) {
            MethodCollector.o(8780);
        } else if (!com.bytedance.crash.n.f27737a || (!b.b() && System.currentTimeMillis() - m.f27726c < 180000)) {
            MethodCollector.o(8780);
        } else {
            synchronized (hashMap2) {
                try {
                    hashMap = new HashMap(hashMap2);
                    hashMap2.clear();
                } finally {
                    MethodCollector.o(8780);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                    LinkedList linkedList = (LinkedList) entry2.getValue();
                    while (!linkedList.isEmpty()) {
                        try {
                            d dVar = (d) linkedList.poll();
                            if (dVar == null) {
                                break;
                            }
                            a(((a) entry.getKey()).f27701a, dVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r7 = new java.util.LinkedList();
        r8 = com.bytedance.crash.j.i.f27689a.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r8.hasNext() == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1 = r8.next();
        r5 = (java.util.List) r1.getValue();
        r4 = r1.getKey().f27701a;
        r3 = r1.getKey().f27702b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r5.isEmpty() != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r5.isEmpty() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r7.add(r5.remove(0));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r1 >= 30) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r7.isEmpty() == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r1 = com.bytedance.crash.runtime.a.e.a().a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r1 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        com.bytedance.crash.util.v.a("upload events");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r4 != com.bytedance.crash.j.i.f27690d) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r3 != 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r2 = com.bytedance.crash.entity.c.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0085, code lost:
        r2 = com.bytedance.crash.entity.c.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        com.bytedance.crash.j.c.a(r1.f27557a, r2, new com.bytedance.crash.j.i.AnonymousClass5(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        com.bytedance.crash.runtime.g.a().c();
        r7.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        com.bytedance.crash.m.f27730g.isDebugMode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r10.f27695g = false;
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8808);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.j.i.c():void");
    }

    public static void a(final d dVar) {
        if (!com.bytedance.crash.n.f27744h) {
            Handler handler = n.b().f27964d;
            if (handler == null || handler.getLooper() != Looper.myLooper()) {
                n.b().a(new Runnable() {
                    /* class com.bytedance.crash.j.i.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(16238);
                    }

                    public final void run() {
                        i.a(i.f27690d, dVar);
                    }
                });
            } else {
                a(f27690d, dVar);
            }
        }
    }

    private static void b(Object obj, d dVar) {
        boolean z;
        List<d> list = f27689a.getList(a.a(obj, dVar));
        list.add(dVar);
        int size = list.size();
        if (size >= 30) {
            z = true;
        } else {
            z = false;
        }
        v.b("[enqueue] size=".concat(String.valueOf(size)));
        if (z) {
            d();
        }
    }

    private static void c(Object obj, d dVar) {
        LinkedList<d> linkedList;
        MethodCollector.i(8773);
        try {
            String string = dVar.f27557a.getString("log_type");
            HashMap<a, HashMap<String, LinkedList<d>>> hashMap = f27691e;
            synchronized (hashMap) {
                try {
                    HashMap<String, LinkedList<d>> hashMap2 = hashMap.get(a.a(obj, dVar));
                    if (hashMap2 == null) {
                        hashMap2 = new HashMap<>();
                        hashMap.put(a.a(obj, dVar), hashMap2);
                    }
                    linkedList = hashMap2.get(string);
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        hashMap2.put(string, linkedList);
                    }
                } finally {
                    MethodCollector.o(8773);
                }
            }
            linkedList.add(dVar);
            if (linkedList.size() > 100) {
                linkedList.poll();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            MethodCollector.o(8773);
        }
    }

    public static void a(Object obj, d dVar) {
        Object obj2;
        String a2;
        if (!com.bytedance.crash.n.f27744h && !com.bytedance.crash.n.f27745i) {
            if (obj == null) {
                obj = f27690d;
            }
            if (!com.bytedance.crash.n.f27737a || (obj == (obj2 = f27690d) && !b.b() && System.currentTimeMillis() - m.f27726c < 180000)) {
                c(obj, dVar);
                return;
            }
            if (obj != obj2 && (!com.bytedance.crash.runtime.b.a.a(c.c(obj)) || m.a(c.c(obj)))) {
                a.a(obj);
            }
            b();
            String optString = dVar.f27557a.optString("log_type");
            if ("service_monitor".equals(optString)) {
                String optString2 = dVar.f27557a.optString("service");
                if (TextUtils.isEmpty(optString2) || !b.b(obj, optString2)) {
                    v.a("EventUploadQueue", "serviceName " + optString2 + " not sampled");
                    return;
                }
                v.a("EventUploadQueue", "serviceName " + optString2 + " enqueue success");
                b(obj, dVar);
                return;
            }
            String optString3 = dVar.f27557a.optString("message");
            if (TextUtils.isEmpty(optString3)) {
                a2 = null;
            } else {
                a2 = g.a(optString3);
            }
            String optString4 = dVar.f27557a.optString("crash_md5");
            if (!com.bytedance.crash.runtime.g.a().a(optString4, a2)) {
                m.f27730g.isDebugMode();
            } else if (TextUtils.isEmpty(optString) || !b.a(obj, optString)) {
                v.a("EventUploadQueue", "logType " + optString + " not sampled");
            } else if (!com.bytedance.crash.runtime.g.a().b(optString4, a2)) {
                m.f27730g.isDebugMode();
            } else {
                v.a("EventUploadQueue", "logType " + optString + " enqueue success");
                b(obj, dVar);
            }
        }
    }
}
