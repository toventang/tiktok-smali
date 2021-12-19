package android.ss.com.vboost.d;

import android.ss.com.vboost.CapabilityType;
import android.ss.com.vboost.VboostListener;
import android.ss.com.vboost.c;
import android.ss.com.vboost.e.a;
import android.util.SparseBooleanArray;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f540a = f.class.getSimpleName();

    /* renamed from: i  reason: collision with root package name */
    public static boolean f541i = false;

    /* renamed from: j  reason: collision with root package name */
    public static volatile boolean f542j = true;

    /* renamed from: b  reason: collision with root package name */
    public Map<CapabilityType, TreeSet<d>> f543b;

    /* renamed from: c  reason: collision with root package name */
    public final transient ReentrantLock f544c;

    /* renamed from: d  reason: collision with root package name */
    public final Condition f545d;

    /* renamed from: e  reason: collision with root package name */
    public Map<CapabilityType, d> f546e;

    /* renamed from: f  reason: collision with root package name */
    public ScheduledExecutorService f547f;

    /* renamed from: g  reason: collision with root package name */
    ConcurrentHashMap<d, c> f548g;

    /* renamed from: h  reason: collision with root package name */
    public SparseBooleanArray f549h;

    /* renamed from: k  reason: collision with root package name */
    public WeakReference<VboostListener.a> f550k;

    /* renamed from: l  reason: collision with root package name */
    public a.AbstractC0000a f551l;

    /* renamed from: m  reason: collision with root package name */
    private ConcurrentHashMap<c, d> f552m;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f556a = new f((byte) 0);

        static {
            Covode.recordClassIndex(57);
        }
    }

    static {
        Covode.recordClassIndex(54);
    }

    private f() {
        this.f543b = new HashMap();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f544c = reentrantLock;
        this.f545d = reentrantLock.newCondition();
        this.f546e = new HashMap();
        this.f547f = null;
        this.f548g = new ConcurrentHashMap<>();
        this.f552m = new ConcurrentHashMap<>();
        this.f549h = new SparseBooleanArray();
        this.f551l = new a.AbstractC0000a() {
            /* class android.ss.com.vboost.d.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(55);
            }

            @Override // android.ss.com.vboost.e.a.AbstractC0000a
            public final void a(String str, JSONObject jSONObject) {
                if (f.this.f550k != null && f.this.f550k.get() != null) {
                    f.this.f550k.get().a(str, jSONObject);
                }
            }
        };
        this.f547f = new ScheduledThreadPoolExecutor(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.ss.com.vboost.d.f$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f554a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f555b;

        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
        static {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.d.f.AnonymousClass2.<clinit>():void");
        }
    }

    /* synthetic */ f(byte b2) {
        this();
    }

    public final Object a(c cVar) {
        Object obj = null;
        if (!f542j || !f541i) {
            return null;
        }
        d b2 = b(cVar);
        if (b2 != null) {
            obj = a(b2);
            this.f548g.put(b2, cVar);
            if (b2.f533j) {
                this.f552m.put(cVar, b2);
            }
        }
        return obj;
    }

    private Object a(d dVar) {
        Object obj;
        this.f544c.lock();
        try {
            if (dVar.f535l == c.ASYNC) {
                TreeSet<d> treeSet = this.f543b.get(dVar.f524a);
                if (treeSet == null) {
                    treeSet = new TreeSet<>();
                    this.f543b.put(dVar.f524a, treeSet);
                }
                boolean add = treeSet.add(dVar);
                obj = dVar;
                if (add) {
                    boolean b2 = b(dVar);
                    obj = dVar;
                    if (b2) {
                        a(dVar.f524a);
                        obj = dVar;
                    }
                }
            } else {
                this.f546e.put(dVar.f524a, dVar);
                obj = a.a(dVar);
            }
            return obj;
        } finally {
            this.f544c.unlock();
        }
    }

    private boolean b(d dVar) {
        d dVar2 = this.f546e.get(dVar.f524a);
        boolean z = true;
        if (!(this.f546e == null || dVar2 == null)) {
            if ((r1 = AnonymousClass2.f555b[dVar.n.ordinal()]) != 1) {
            }
            z = false;
            if ((dVar.f534k == g.USE_OURS || dVar.f534k == g.USE_PROVIDERS) && dVar.a() <= 50) {
                return false;
            }
        }
        return z;
    }

    private void a(CapabilityType capabilityType) {
        d pollFirst;
        while (true) {
            TreeSet<d> treeSet = this.f543b.get(capabilityType);
            if (treeSet != null && !treeSet.isEmpty()) {
                pollFirst = treeSet.pollFirst();
                pollFirst.p = System.currentTimeMillis();
                if (pollFirst.f534k == g.USE_OURS && pollFirst.a() > 50) {
                    h hVar = new h(pollFirst);
                    hVar.f558a = this.f547f.schedule(hVar, pollFirst.a(), TimeUnit.MILLISECONDS);
                    pollFirst.q = hVar;
                    pollFirst.f526c = pollFirst.a();
                }
                if (!b(pollFirst)) {
                    return;
                }
                if (pollFirst.f534k != g.USE_OURS || pollFirst.a() > 50) {
                    this.f547f.submit(new b(pollFirst));
                    this.f546e.put(pollFirst.f524a, pollFirst);
                } else {
                    capabilityType = pollFirst.f524a;
                }
            } else {
                return;
            }
        }
        this.f547f.submit(new b(pollFirst));
        this.f546e.put(pollFirst.f524a, pollFirst);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r10.f463g.getDesc();
        r5.f530g = r10.f463g;
        r5.f535l = android.ss.com.vboost.d.c.ASYNC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        if (r10.f464h == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        r5.f530g.getDesc();
        r5.f532i = true;
        r5.f533j = false;
        r5.f535l = android.ss.com.vboost.d.c.DIRECT;
        r5.f534k = android.ss.com.vboost.d.g.ONE_TIME;
        r0 = r5.q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (r0 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        r0.f558a.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        if (r10.f459c <= 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        r5.f532i = false;
        r5.f526c = r10.f459c;
        r5.f533j = false;
        r5.f534k = android.ss.com.vboost.d.g.USE_OURS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
        r5.f532i = false;
        r5.f533j = true;
        r5.f526c = 30000;
        r5.f534k = android.ss.com.vboost.d.g.USE_OURS;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.ss.com.vboost.d.d b(android.ss.com.vboost.c r10) {
        /*
        // Method dump skipped, instructions count: 614
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.d.f.b(android.ss.com.vboost.c):android.ss.com.vboost.d.d");
    }

    /* access modifiers changed from: package-private */
    public final void a(d dVar, boolean z) {
        this.f544c.lock();
        if (z) {
            try {
                this.f552m.remove(dVar.r);
            } catch (Throwable th) {
                this.f544c.unlock();
                throw th;
            }
        }
        if (dVar.q == null || z) {
            this.f548g.remove(dVar);
            this.f546e.remove(dVar.f524a);
            TreeSet<d> treeSet = this.f543b.get(dVar.f524a);
            if (treeSet != null && !treeSet.isEmpty()) {
                a(dVar.f524a);
            }
        }
        this.f544c.unlock();
    }
}
