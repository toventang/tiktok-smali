package com.ss.videoarch.strategy.inferenceEngine.a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.videoarch.strategy.inferenceEngine.networkStrategy.NetworkProber;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private static List<String> H = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, b> f154456e = new androidx.c.a();

    /* renamed from: g  reason: collision with root package name */
    public static List<String> f154457g = new ArrayList();
    public boolean A = false;
    public int B = 1;
    public String C = "";
    public int D = 8000;
    private final ThreadPoolExecutor E;
    private final ThreadPoolExecutor F;
    private final List<String> G = new ArrayList();
    private Map<String, Integer> I;
    private boolean J = false;
    private String K = null;
    private boolean L = false;
    private boolean M = false;

    /* renamed from: a  reason: collision with root package name */
    public volatile d f154458a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f154459b;

    /* renamed from: c  reason: collision with root package name */
    public ReentrantLock f154460c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public Handler f154461d = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f154462f = new LinkedList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f154463h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f154464i = false;

    /* renamed from: j  reason: collision with root package name */
    public Set<String> f154465j;

    /* renamed from: k  reason: collision with root package name */
    public int f154466k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f154467l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f154468m = -1;
    public int n = -1;
    public int o = -1;
    public int p = 0;
    public int q = -1;
    public int r = 2;
    public long s = 5000;
    public int t = -1;
    public long u = 0;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public boolean y = false;
    public int z = -1;

    public interface c {
        static {
            Covode.recordClassIndex(102941);
        }

        void a(String str, String str2);
    }

    public interface d {
        static {
            Covode.recordClassIndex(102942);
        }

        void a(String str);
    }

    public final void a(d dVar, String str) {
        Set<String> set;
        if (dVar != null) {
            if (str == null) {
                Map<String, b> map = f154456e;
                if (map == null || map.size() == 0 || (set = this.f154465j) == null || set.size() == 0) {
                    dVar.a(str);
                    return;
                }
                this.f154466k = 0;
                if (this.q == 1) {
                    this.f154460c.lock();
                    f154457g.clear();
                    this.f154460c.unlock();
                }
                H.clear();
                for (String str2 : this.f154465j) {
                    b bVar = f154456e.get(str2);
                    if (this.n == 1 && this.q != 1 && bVar != null && bVar.f154489b == 1) {
                        if (this.r != 2) {
                            if (!TextUtils.equals(str2.substring(0, 4), this.r == 1 ? "pull" : "push")) {
                            }
                        }
                        H.add(bVar.f154488a);
                    }
                }
                for (b bVar2 : f154456e.values()) {
                    a(bVar2, dVar, str);
                }
                return;
            }
            a(f154456e.get(str), dVar, str);
        }
    }

    private boolean b() {
        if (this.f154468m != 1) {
            return false;
        }
        if (this.o == 0 || this.z == 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(102935);
    }

    /* renamed from: com.ss.videoarch.strategy.inferenceEngine.a.a$a  reason: collision with other inner class name */
    static class ThreadFactoryC4109a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadGroup f154481a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f154482b;

        /* renamed from: c  reason: collision with root package name */
        private final String f154483c;

        static {
            Covode.recordClassIndex(102939);
        }

        private ThreadFactoryC4109a() {
            ThreadGroup threadGroup;
            this.f154482b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f154481a = threadGroup;
            this.f154483c = "dns-optimizer-listen-";
        }

        /* synthetic */ ThreadFactoryC4109a(byte b2) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(6177);
            Thread thread = new Thread(this.f154481a, runnable, this.f154483c + this.f154482b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.o(6177);
            return thread;
        }
    }

    static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadGroup f154484a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f154485b;

        /* renamed from: c  reason: collision with root package name */
        private final String f154486c;

        static {
            Covode.recordClassIndex(102940);
        }

        private b() {
            ThreadGroup threadGroup;
            this.f154485b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f154484a = threadGroup;
            this.f154486c = "dns-optimizer-";
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(6165);
            Thread thread = new Thread(this.f154484a, runnable, this.f154486c + this.f154485b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.o(6165);
            return thread;
        }
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        this.f154460c.lock();
        List<String> list = f154457g;
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            sb.append("\"HTTPDNSRequest\":{\"Enabled\":true,\"DomainNames\":[");
            for (String str : f154457g) {
                if (i2 != 0) {
                    sb.append(",");
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append("\"" + str + "\"");
                }
                i2++;
            }
            sb.append("],\"IsNeedIPV6\":" + b() + "}");
        }
        this.f154460c.unlock();
        return sb.toString();
    }

    public final void a() {
        Set<String> set = this.f154465j;
        if (set == null || set.size() == 0) {
            f154456e.clear();
            this.f154464i = false;
            return;
        }
        for (String str : this.f154465j) {
            b bVar = f154456e.get(str);
            if (bVar != null) {
                bVar.b(null);
                bVar.c(null);
                bVar.a((List<String>) null);
            }
        }
        this.f154464i = false;
    }

    private void a(com.ss.videoarch.strategy.b.a.a aVar) {
        this.J = aVar.f154414h;
        if (aVar.f154408b != -1) {
            this.n = aVar.f154408b;
        }
        if (aVar.f154407a != -1) {
            this.f154468m = aVar.f154407a;
        }
        if (aVar.f154410d == 1 && aVar.f154412f != null && !aVar.f154412f.isEmpty()) {
            this.p = aVar.f154410d;
            this.C = aVar.f154412f;
            this.D = aVar.f154413g;
        }
        if (aVar.f154411e == 1) {
            this.o = aVar.f154411e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (android.text.TextUtils.equals(r1, r0) != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.inferenceEngine.a.a.c(java.lang.String):java.lang.String");
    }

    private String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            Map<String, b> map = f154456e;
            if (!(map == null || map.size() == 0)) {
                sb.append("\"SelectNodeRequest\":{\"Enabled\":true,\"IsNeedIPV6\":" + b() + ",\"IPs\":{");
                int i2 = 0;
                for (b bVar : map.values()) {
                    List<String> list = bVar.f154490c;
                    if (!(list == null || list.size() == 0)) {
                        if (i2 != 0) {
                            sb.append(",");
                        }
                        sb.append("\"" + bVar.f154488a + "\":[");
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            if (i3 != 0) {
                                sb.append(",");
                            }
                            sb.append("\"" + list.get(i3) + "\"");
                        }
                        sb.append("]");
                        i2++;
                    }
                }
                sb.append("}}");
            }
        } else {
            Map<String, b> map2 = f154456e;
            if (!(map2 == null || map2.size() == 0)) {
                sb.append("\"SelectNodeRequest\":{\"Enabled\":true,\"IsNeedIPV6\":" + b() + ",\"IPs\":{");
                sb.append("\"" + str + "\":[");
                b bVar2 = map2.get(str);
                List arrayList = new ArrayList();
                if ((bVar2 == null || (arrayList = bVar2.f154490c) != null) && arrayList.size() != 0) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        if (i4 != 0) {
                            sb.append(",");
                        }
                        sb.append("\"" + ((String) arrayList.get(i4)) + "\"");
                    }
                }
                sb.append("]}}");
            }
        }
        return sb.toString();
    }

    public final JSONObject a(final String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str2 = null;
        if (!this.f154463h && !this.J) {
            return null;
        }
        Map<String, b> map = f154456e;
        b bVar = map.get(str);
        if (bVar != null) {
            str2 = bVar.a(b());
            jSONObject = bVar.c();
            jSONArray = bVar.a();
        } else {
            jSONArray = null;
            jSONObject = null;
        }
        if (this.n == 1 && this.x == 1 && str2 == null && map.containsKey(str) && this.f154464i) {
            this.f154461d.post(new Runnable() {
                /* class com.ss.videoarch.strategy.inferenceEngine.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(102936);
                }

                public final void run() {
                    a aVar = a.this;
                    aVar.a(aVar.f154458a, str);
                }
            });
        }
        try {
            jSONObject2.put("Ip", str2);
            jSONObject2.put("EvaluatorSymbol", jSONObject);
            jSONObject2.put("RemoteResult", jSONArray);
            jSONObject2.put("RequestId", this.K);
            jSONObject2.put("IsRemoteSorted", this.J);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject2;
    }

    public final int a(int i2, int i3) {
        if (i2 == 0) {
            return this.z;
        }
        if (i2 != 1) {
            return i3;
        }
        return this.B;
    }

    public a(d dVar, int i2) {
        MethodCollector.i(6511);
        this.f154458a = dVar;
        ThreadPoolExecutor threadPoolExecutor = com.ss.videoarch.strategy.b.c.a().f154424d;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b((byte) 0));
            this.E = threadPoolExecutor2;
            if (i2 == 1) {
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
            }
        } else {
            this.E = threadPoolExecutor;
        }
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4109a((byte) 0));
        this.F = threadPoolExecutor3;
        if (i2 == 1) {
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
        }
        MethodCollector.o(6511);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r0 == 1) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(boolean r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.inferenceEngine.a.a.a(boolean, java.lang.String):java.lang.String");
    }

    public final void a(com.ss.videoarch.strategy.b.a.a aVar, String str) {
        this.f154463h = true;
        if (aVar != null) {
            if (this.f154465j == null) {
                this.f154465j = aVar.a();
                this.I = aVar.f154418l;
            }
            this.K = aVar.f154416j;
            a(aVar);
            Set<String> set = this.f154465j;
            if (set == null || set.size() == 0) {
                f154456e.clear();
                return;
            }
            Set<String> hashSet = new HashSet();
            if (str == null) {
                hashSet = this.f154465j;
            } else {
                hashSet.add(str);
            }
            for (String str2 : hashSet) {
                b bVar = f154456e.get(str2);
                if (bVar == null) {
                    if (this.I.get(str2) != null) {
                        bVar = new b(str2, this.I.get(str2).intValue());
                    } else {
                        bVar = new b(str2, 0);
                    }
                }
                JSONArray a2 = aVar.a(str2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (a2 != null) {
                    for (int i2 = 0; i2 < a2.length(); i2++) {
                        JSONObject optJSONObject = a2.optJSONObject(i2);
                        if (optJSONObject.has("IP") && optJSONObject.has("DomainParseType")) {
                            if (optJSONObject.optInt("DomainParseType") == 0) {
                                arrayList2.add(optJSONObject.optString("IP"));
                            } else {
                                arrayList.add(optJSONObject.optString("IP"));
                            }
                        }
                    }
                }
                bVar.a(arrayList);
                bVar.b(arrayList2);
                bVar.f154491d = aVar.f154417k;
                f154456e.put(str2, bVar);
                if (this.v == 1) {
                    String a3 = bVar.a(b());
                    if (!TextUtils.isEmpty(a3) && this.f154459b != null) {
                        this.f154459b.a(str2, a3);
                    }
                }
            }
            if (!this.M) {
                this.M = true;
                a(this.f154458a, (String) null);
            }
        }
    }

    private void a(final b bVar, final d dVar, final String str) {
        MethodCollector.i(6663);
        if (!this.f154463h) {
            MethodCollector.o(6663);
            return;
        }
        final c cVar = new c(bVar.f154488a);
        synchronized (this.f154462f) {
            try {
                this.f154462f.add(cVar);
            } finally {
                MethodCollector.o(6663);
            }
        }
        final Future<?> submit = this.E.submit(new Runnable() {
            /* class com.ss.videoarch.strategy.inferenceEngine.a.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(102937);
            }

            public final void run() {
                boolean z;
                boolean z2;
                int i2;
                MethodCollector.i(7840);
                synchronized (a.this.f154462f) {
                    try {
                        z = false;
                        if (!a.this.f154462f.contains(cVar)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } finally {
                        MethodCollector.o(7840);
                    }
                }
                if (z2) {
                    MethodCollector.o(7840);
                    return;
                }
                if (str != null) {
                    bVar.b();
                    if (!bVar.b().isEmpty()) {
                        synchronized (a.this.f154462f) {
                            try {
                                a.this.f154462f.remove(cVar);
                            } finally {
                                MethodCollector.o(7840);
                            }
                        }
                        return;
                    }
                }
                List<String> a2 = cVar.a();
                if (a2 != null && !a2.isEmpty()) {
                    if (a.this.o == 1 && !a.this.y) {
                        Iterator<String> it = a2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            if (!TextUtils.isEmpty(next) && next.contains(":")) {
                                a.this.z = (int) NetworkProber.a().a(0, next, 80, null);
                                a.this.y = true;
                                break;
                            }
                        }
                    }
                    if (a.this.p == 1 && !a.this.A && !a.this.C.isEmpty() && a.this.C.contentEquals(cVar.f154498a) && a.this.D != -1) {
                        Iterator<String> it2 = a2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String next2 = it2.next();
                            if (!TextUtils.isEmpty(next2) && !next2.contains(":")) {
                                a aVar = a.this;
                                if (((int) NetworkProber.a().a(1, next2, a.this.D, a.this.C)) >= 0) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                aVar.B = i2;
                                a.this.A = true;
                            }
                        }
                    }
                }
                bVar.c(a2);
                synchronized (a.this.f154462f) {
                    try {
                        if (!a.this.f154462f.remove(cVar)) {
                            z = true;
                        }
                    } finally {
                        MethodCollector.o(7840);
                    }
                }
                if (z) {
                    MethodCollector.o(7840);
                    return;
                }
                if (str == null) {
                    a.this.f154466k++;
                }
                if (a.this.f154466k == a.this.f154465j.size() || str != null) {
                    a.this.f154464i = true;
                    dVar.a(str);
                }
            }
        });
        if (this.n == 1 && this.w == 1) {
            this.F.submit(new Runnable() {
                /* class com.ss.videoarch.strategy.inferenceEngine.a.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(102938);
                }

                public final void run() {
                    try {
                        submit.get(a.this.s, TimeUnit.MILLISECONDS);
                    } catch (Exception e2) {
                        submit.cancel(true);
                        a.this.f154464i = true;
                        if (a.this.n == 1 && a.this.q == 1) {
                            a.this.f154460c.lock();
                            a.f154457g.add(cVar.f154498a);
                            a.this.f154460c.unlock();
                        }
                        dVar.a(str);
                        e2.printStackTrace();
                    }
                }
            });
        }
    }
}
