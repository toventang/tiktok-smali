package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c {

    /* renamed from: m  reason: collision with root package name */
    public static final HashMap<String, c> f86421m = new HashMap<>();
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f86422a = -1;

    /* renamed from: b  reason: collision with root package name */
    public long f86423b;

    /* renamed from: c  reason: collision with root package name */
    long f86424c;

    /* renamed from: d  reason: collision with root package name */
    long f86425d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f86426e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    final List<q<Integer, Integer, Long, z>> f86427f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public long f86428g = 1000;

    /* renamed from: h  reason: collision with root package name */
    public int f86429h;

    /* renamed from: i  reason: collision with root package name */
    int f86430i;

    /* renamed from: j  reason: collision with root package name */
    int f86431j;

    /* renamed from: k  reason: collision with root package name */
    public Runnable f86432k = new Runnable(this) {
        /* class com.ss.android.ugc.aweme.ecommerce.pdp.c.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f86434a;

        static {
            Covode.recordClassIndex(54139);
        }

        {
            this.f86434a = r1;
        }

        public final void run() {
            long j2;
            this.f86434a.f86423b = SystemClock.elapsedRealtime();
            if (this.f86434a.f86429h == 3) {
                c cVar = this.f86434a;
                if (cVar.f86427f.isEmpty()) {
                    cVar.f86431j++;
                }
                if (cVar.f86431j == 30) {
                    cVar.f86427f.clear();
                    cVar.a();
                    c.f86421m.remove(cVar.f86433l);
                }
                this.f86434a.f86426e.postDelayed(c.a(this.f86434a), this.f86434a.f86428g);
                return;
            }
            c cVar2 = this.f86434a;
            if (cVar2.f86423b < cVar2.f86424c) {
                cVar2.f86429h = 1;
                cVar2.f86422a = cVar2.f86424c - cVar2.f86423b;
            } else if (cVar2.f86423b < cVar2.f86424c || cVar2.f86423b >= cVar2.f86425d) {
                cVar2.f86422a = 0;
                cVar2.f86429h = 3;
            } else {
                cVar2.f86429h = 2;
                cVar2.f86422a = cVar2.f86425d - cVar2.f86423b;
            }
            Iterator<T> it = cVar2.f86427f.iterator();
            while (it.hasNext()) {
                it.next().invoke(Integer.valueOf(cVar2.f86429h), Integer.valueOf(cVar2.f86430i), Long.valueOf(cVar2.f86422a));
            }
            cVar2.f86430i = cVar2.f86429h;
            if (this.f86434a.f86429h != 3) {
                Handler handler = this.f86434a.f86426e;
                Runnable a2 = c.a(this.f86434a);
                int i2 = (this.f86434a.f86422a > this.f86434a.f86428g ? 1 : (this.f86434a.f86422a == this.f86434a.f86428g ? 0 : -1));
                c cVar3 = this.f86434a;
                if (i2 > 0) {
                    j2 = cVar3.f86428g;
                } else {
                    j2 = cVar3.f86422a;
                }
                handler.postDelayed(a2, j2);
            }
        }
    };

    /* renamed from: l  reason: collision with root package name */
    public final String f86433l;

    public static final class a {
        static {
            Covode.recordClassIndex(54140);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(String str) {
            l.d(str, "");
            HashMap<String, c> hashMap = c.f86421m;
            c cVar = hashMap.get(str);
            if (cVar == null) {
                cVar = new c(str);
                hashMap.put(str, cVar);
            }
            return cVar;
        }
    }

    static {
        Covode.recordClassIndex(54138);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Handler handler = this.f86426e;
        Runnable runnable = this.f86432k;
        if (runnable == null) {
            l.a("countDownAction");
        }
        handler.removeCallbacks(runnable);
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f86437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FlashSale f86438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f86439c = 1000;

        static {
            Covode.recordClassIndex(54141);
        }

        public b(c cVar, FlashSale flashSale) {
            this.f86437a = cVar;
            this.f86438b = flashSale;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 156
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.c.b.run():void");
        }
    }

    public static final /* synthetic */ Runnable a(c cVar) {
        Runnable runnable = cVar.f86432k;
        if (runnable == null) {
            l.a("countDownAction");
        }
        return runnable;
    }

    public c(String str) {
        l.d(str, "");
        this.f86433l = str;
    }

    public final void a(q<? super Integer, ? super Integer, ? super Long, z> qVar) {
        l.d(qVar, "");
        if (!this.f86427f.contains(qVar)) {
            this.f86427f.add(qVar);
        }
    }
}
