package com.bytedance.im.core.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.g.b;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.b.a.aa;
import com.bytedance.im.core.internal.b.a.ae;
import com.bytedance.im.core.internal.utils.d;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.internal.utils.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public String f37668a;

    /* renamed from: b  reason: collision with root package name */
    public z f37669b = new z();

    /* renamed from: c  reason: collision with root package name */
    Handler f37670c = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.im.core.d.ab.AnonymousClass1 */

        static {
            Covode.recordClassIndex(22653);
        }

        public final void handleMessage(Message message) {
            removeMessages(1);
            b.a(ab.this.f37668a, ab.this.f37669b, true);
        }
    };

    static {
        Covode.recordClassIndex(22652);
    }

    /* access modifiers changed from: package-private */
    public final void a(aq aqVar) {
        f.b("imsdk", "LeakMsgRepairModel repairRange start, cid:" + this.f37668a + ", repairedRangeList:" + aqVar, (Throwable) null);
        List<ap> list = aqVar.ranges;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < list.size() - 1) {
            ap apVar = list.get(i2);
            i2++;
            ap apVar2 = list.get(i2);
            List<Long> a2 = i.a(this.f37668a, new ap(apVar.end, apVar2.start));
            if (d.a(a2)) {
                f.b("imsdk", "LeakMsgRepairModel repairRange indexList error, range:" + apVar + "nextRange:" + apVar2, (Throwable) null);
                arrayList.add(new ap(apVar.end, apVar2.start));
            } else {
                if (!a2.contains(Long.valueOf(apVar.end))) {
                    a2.add(Long.valueOf(apVar.end));
                }
                if (!a2.contains(Long.valueOf(apVar2.start))) {
                    a2.add(Long.valueOf(apVar2.start));
                }
                ap apVar3 = new ap(apVar.end + 1, apVar2.start - 1);
                List<Long> b2 = b(a2);
                if (d.a(b2)) {
                    a(this.f37668a, apVar3);
                } else {
                    List<ap> c2 = c(b2);
                    if (d.a(c2)) {
                        f.b("imsdk", "LeakMsgRepairModel repairRange leakRangeList error, leakIndexList:".concat(String.valueOf(b2)), (Throwable) null);
                        a(this.f37668a, apVar3);
                    } else {
                        arrayList.addAll(c2);
                        a(this.f37668a, apVar3, c2);
                    }
                }
            }
        }
        this.f37669b.f38050g = new aq(arrayList);
        if (arrayList.isEmpty()) {
            f.b("imsdk", "LeakMsgRepairModel repairRange end, empty leakRanges, cid:" + this.f37668a + ", repairedRangeList:" + aqVar, (Throwable) null);
            this.f37669b.f38049f = 1;
            a(new ap(list.get(0).start, list.get(list.size() - 1).end));
            return;
        }
        List<ap> d2 = d(arrayList);
        this.f37669b.f38051h = new aq(d2);
        if (d2.isEmpty()) {
            f.b("imsdk", "LeakMsgRepairModel repairRange, empty mergedLeakRanges, cid:" + this.f37668a + ", leakRanges:" + arrayList, (Throwable) null);
            d2.addAll(arrayList);
        }
        f.b("imsdk", "LeakMsgRepairModel repairRange start real, cid:" + this.f37668a + ", leakRanges:" + arrayList + ", mergedLeakRanges:" + d2, (Throwable) null);
        long uptimeMillis = SystemClock.uptimeMillis();
        Pair<Boolean, List<String>> a3 = a(d2);
        this.f37669b.f38056m = ((Boolean) a3.first).booleanValue();
        this.f37669b.f38055l = a3.second.toString();
        aq copy = ad.a(this.f37668a).copy();
        List<ap> list2 = copy.ranges;
        this.f37669b.f38054k = SystemClock.uptimeMillis() - uptimeMillis;
        this.f37669b.f38052i = aqVar;
        this.f37669b.f38053j = copy;
        f.b("imsdk", "LeakMsgRepairModel repairRange end, cid:" + this.f37668a + ", before:" + aqVar + ", after:" + copy + ", mergedLeakRanges:" + d2, (Throwable) null);
        if (list2 == null) {
            f.b("imsdk", "LeakMsgRepairModel repairRange definitely error, cid:" + this.f37668a, (Throwable) null);
            this.f37669b.f38049f = 4;
            a((ap) null);
        } else if (list2.size() > 1) {
            this.f37669b.f38049f = 2;
            f.b("imsdk", "LeakMsgRepairModel repairRange part error, cid:" + this.f37668a, (Throwable) null);
            c(list2.get(list2.size() - 1).end);
        } else {
            this.f37669b.f38049f = 3;
            a(list2.get(list2.size() - 1));
        }
    }

    private static void a(String str, ap apVar, List<ap> list) {
        if (d.a(list)) {
            f.b("imsdk", "LeakMsgRepairModel storeRangeByLeak leakRanges empty, cid:" + str + ", sourceRange:" + apVar + ", leakRanges:" + list, (Throwable) null);
            a(str, apVar);
            return;
        }
        ArrayList<ap> arrayList = new ArrayList();
        int i2 = 0;
        ap apVar2 = new ap(apVar.start, list.get(0).start - 1);
        ap apVar3 = new ap(list.get(list.size() - 1).end + 1, apVar.end);
        if (apVar2.isValid()) {
            arrayList.add(apVar2);
        }
        while (i2 < list.size() - 1) {
            i2++;
            ap apVar4 = new ap(list.get(i2).end + 1, list.get(i2).start - 1);
            if (apVar4.isValid()) {
                arrayList.add(apVar4);
            }
        }
        if (apVar3.isValid()) {
            arrayList.add(apVar3);
        }
        f.b("imsdk", "LeakMsgRepairModel storeRangeByLeak, cid:" + str + ", sourceRange:" + apVar + ", leakRanges:" + list + ", continueRange:" + arrayList, (Throwable) null);
        for (ap apVar5 : arrayList) {
            a(str, apVar5);
        }
    }

    private void a() {
        long f2 = i.f(this.f37668a);
        s.a();
        long d2 = s.d();
        this.f37669b.q = true;
        this.f37669b.o = f2;
        this.f37669b.p = d2;
        f.b("imsdk", "LeakMsgRepairModel fullRepairDB start, cid:" + this.f37668a + ", maxIndex:" + f2 + ", baseIndex:" + d2, (Throwable) null);
        ad.a(this.f37668a, new aq(new ArrayList()));
        if (f2 <= d2) {
            this.f37669b.n = 1;
            f.b("imsdk", "LeakMsgRepairModel fullRepairDB end, no bigger index, cid:" + this.f37668a, (Throwable) null);
            if (f2 == d2) {
                a(this.f37668a, new ap(f2, f2));
                return;
            }
            return;
        }
        this.f37669b.n = 2;
        a(f2);
    }

    ab(String str) {
        this.f37668a = str;
    }

    private static List<Long> b(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        for (long longValue = list.get(0).longValue(); longValue <= list.get(list.size() - 1).longValue(); longValue++) {
            if (!list.contains(Long.valueOf(longValue)) && !arrayList.contains(Long.valueOf(longValue))) {
                arrayList.add(Long.valueOf(longValue));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void a(ap apVar) {
        f.b("imsdk", "LeakMsgRepairModel repairDB start, cid:" + this.f37668a + ", repairedRange:" + apVar, (Throwable) null);
        this.f37669b.s = apVar;
        if (apVar == null) {
            a();
        } else if (!apVar.isValid()) {
            this.f37669b.r = true;
            a();
        } else {
            this.f37669b.n = 3;
            c(apVar.end);
            a(apVar.start);
        }
    }

    private Pair<Boolean, List<String>> a(List<ap> list) {
        final ArrayList arrayList = new ArrayList();
        if (d.a(list)) {
            f.b("imsdk", "LeakMsgRepairModel repairByRange, cid:" + this.f37668a + ", invalid ranges:" + list, (Throwable) null);
            arrayList.add("repairByRange invalid ranges");
            return new Pair<>(false, arrayList);
        }
        f.b("imsdk", "LeakMsgRepairModel repairByRange start, cid:" + this.f37668a + ", ranges:" + list, (Throwable) null);
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final boolean[] zArr = new boolean[1];
        for (final ap apVar : list) {
            new ae(new com.bytedance.im.core.a.a.b<af>() {
                /* class com.bytedance.im.core.d.ab.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(22655);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                    zArr[0] = false;
                    String str = apVar.toString() + ":" + uVar;
                    f.b("imsdk", "LeakMsgRepairModel repairByRange onFailure, cid:" + ab.this.f37668a + ", info:" + str, (Throwable) null);
                    arrayList.add(str);
                    countDownLatch.countDown();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.a.a.b
                public final /* synthetic */ void a(af afVar) {
                    af afVar2 = afVar;
                    zArr[0] = afVar2.f37695b;
                    String str = apVar + ":" + afVar2;
                    f.b("imsdk", "LeakMsgRepairModel repairByRange onSuccess, cid:" + ab.this.f37668a + ", info:" + str, (Throwable) null);
                    arrayList.add(str);
                    if (afVar2.f37695b) {
                        ab.a(ab.this.f37668a, apVar);
                    } else if (afVar2.f37698e.isValid()) {
                        ab.a(ab.this.f37668a, afVar2.f37698e);
                    }
                    countDownLatch.countDown();
                }
            }).a(this.f37668a, apVar.start, apVar.end, 1);
        }
        try {
            countDownLatch.await(120000, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            j.b("LeakMsgRepairModel repairByRange await interrupt, cid:" + this.f37668a, e2);
        }
        if (!zArr[0]) {
            this.f37669b.f38048e = false;
        }
        f.b("imsdk", "LeakMsgRepairModel repairByRange end, cid:" + this.f37668a + ", infoList:" + arrayList, (Throwable) null);
        return new Pair<>(Boolean.valueOf(zArr[0]), arrayList);
    }

    private static List<ap> c(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            f.b("imsdk", "LeakMsgRepairModel findLeakRange, leakIndexList:" + list + ", leakRanges:" + arrayList, (Throwable) null);
            return arrayList;
        } else if (list.size() == 1) {
            long longValue = list.get(0).longValue();
            arrayList.add(new ap(longValue, longValue));
            f.b("imsdk", "LeakMsgRepairModel findLeakRange, leakIndexList:" + list + ", leakRanges:" + arrayList, (Throwable) null);
            return arrayList;
        } else {
            long longValue2 = list.get(0).longValue();
            int i2 = 1;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                long longValue3 = list.get(i2 - 1).longValue();
                long longValue4 = list.get(i2).longValue();
                if (longValue4 - longValue3 >= 8) {
                    arrayList.add(new ap(longValue2, longValue3));
                    if (i2 == list.size() - 1) {
                        arrayList.add(new ap(longValue4, longValue4));
                        break;
                    }
                    longValue2 = longValue4;
                } else if (longValue4 - longValue2 >= 40) {
                    arrayList.add(new ap(longValue2, longValue4));
                    if (i2 == list.size() - 1) {
                        break;
                    }
                    longValue2 = list.get(i2 + 1).longValue();
                } else if (i2 == list.size() - 1) {
                    arrayList.add(new ap(longValue2, longValue4));
                    break;
                }
                i2++;
            }
            f.b("imsdk", "LeakMsgRepairModel findLeakRange, leakIndexList:" + list + ", leakRanges:" + arrayList, (Throwable) null);
            return arrayList;
        }
    }

    private static List<ap> d(List<ap> list) {
        if (list.size() <= 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ap apVar = list.get(0);
        int i2 = 1;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            ap apVar2 = list.get(i2);
            if (apVar2.start - apVar.end >= 8) {
                arrayList.add(apVar);
                if (i2 == list.size() - 1) {
                    arrayList.add(apVar2);
                    break;
                }
                apVar = apVar2;
            } else if (apVar2.end - apVar.start >= 40) {
                arrayList.add(new ap(apVar.start, apVar2.end));
                if (i2 == list.size() - 1) {
                    break;
                }
                apVar = list.get(i2 + 1);
            } else if (i2 == list.size() - 1) {
                arrayList.add(new ap(apVar.start, apVar2.end));
                break;
            }
            i2++;
        }
        f.b("imsdk", "LeakMsgRepairModel mergeLeakRange, leakRanges:" + list + ", merged:" + arrayList, (Throwable) null);
        return arrayList;
    }

    private void b(long j2) {
        int i2;
        f.b("imsdk", "LeakMsgRepairModel repairDBOlderToBase start, cid:" + this.f37668a + ", startIndex:" + j2, (Throwable) null);
        s.a();
        long d2 = s.d();
        this.f37669b.C = j2;
        if (j2 <= d2) {
            this.f37669b.B = 1;
            f.b("imsdk", "LeakMsgRepairModel repairDBOlderToBase end, reach base, cid:" + this.f37668a + ", startIndex:" + j2 + ", baseIndex:" + d2, (Throwable) null);
            return;
        }
        long b2 = i.b(this.f37668a, j2);
        if (b2 <= 0) {
            this.f37669b.B = 3;
            f.b("imsdk", "LeakMsgRepairModel repairDBOlderToBase end, no indexV1, cid:" + this.f37668a + ", startIndex:" + j2, (Throwable) null);
            return;
        }
        this.f37669b.B = 4;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        new aa(new com.bytedance.im.core.a.a.b<ac>() {
            /* class com.bytedance.im.core.d.ab.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22654);
            }

            @Override // com.bytedance.im.core.a.a.b
            public final void a(u uVar) {
                f.b("imsdk", "LeakMsgRepairModel repairDBOlderToBase onFailure, cid:" + ab.this.f37668a + ", error:" + uVar, (Throwable) null);
                zArr[0] = false;
                countDownLatch.countDown();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.a.a.b
            public final /* synthetic */ void a(ac acVar) {
                boolean z;
                ac acVar2 = acVar;
                f.b("imsdk", "LeakMsgRepairModel repairDBOlderToBase onSuccess, cid:" + ab.this.f37668a + ", result:" + acVar2, (Throwable) null);
                ab.this.f37669b.F = acVar2;
                boolean[] zArr = zArr;
                if (acVar2 == null || !acVar2.f37680a) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[0] = z;
                countDownLatch.countDown();
            }
        }).a(this.f37668a, b2);
        this.f37669b.G = ad.a(this.f37668a);
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            countDownLatch.await(120000, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            j.b("LeakMsgRepairModel repairDBOlderToBase interrupt, cid:" + this.f37668a, e2);
        }
        if (!zArr[0]) {
            this.f37669b.f38048e = false;
        }
        z zVar = this.f37669b;
        if (zArr[0]) {
            i2 = 5;
        } else {
            i2 = 6;
        }
        zVar.B = i2;
        this.f37669b.H = ad.a(this.f37668a);
        this.f37669b.E = SystemClock.uptimeMillis() - uptimeMillis;
        f.b("imsdk", "LeakMsgRepairModel repairDBOlderToBase end, cid:" + this.f37668a + ", before:" + this.f37669b.G + ", after:" + this.f37669b.H, (Throwable) null);
    }

    private void c(long j2) {
        int i2;
        long f2 = i.f(this.f37668a);
        s.a();
        long d2 = s.d();
        f.b("imsdk", "LeakMsgRepairModel repairDBNewer start, cid:" + this.f37668a + ", maxIndex:" + f2 + ", baseIndex:" + d2 + ", startIndex:" + j2, (Throwable) null);
        this.f37669b.J = j2;
        if (f2 <= d2) {
            f.b("imsdk", "LeakMsgRepairModel repairDBNewer end, no bigger index, cid:" + this.f37668a, (Throwable) null);
            this.f37669b.I = 1;
            if (f2 == d2) {
                a(this.f37668a, new ap(f2, f2));
            }
        } else if (j2 >= f2) {
            f.b("imsdk", "LeakMsgRepairModel repairDBNewer end, reach max, cid:" + this.f37668a, (Throwable) null);
            this.f37669b.I = 2;
        } else {
            List<Long> a2 = i.a(this.f37668a, new ap(j2, f2));
            if (d.a(a2)) {
                this.f37669b.I = 3;
                f.b("imsdk", "LeakMsgRepairModel repairDBNewer error indexList empty, cid:" + this.f37668a, (Throwable) null);
                return;
            }
            this.f37669b.M = ad.a(this.f37668a).copy();
            List<Long> b2 = b(a2);
            if (b2.isEmpty()) {
                this.f37669b.I = 7;
                f.b("imsdk", "LeakMsgRepairModel repairDBNewer leakIndexList empty, cid:" + this.f37668a, (Throwable) null);
                a(this.f37668a, new ap(j2, f2));
                return;
            }
            List<ap> c2 = c(b2);
            a(this.f37668a, new ap(j2 + 1, f2 - 1), c2);
            this.f37669b.K = b2;
            this.f37669b.L = new aq(c2);
            if (c2.isEmpty()) {
                f.b("imsdk", "LeakMsgRepairModel repairDBNewer error leakRange empty, cid:" + this.f37668a + ", leakIndexList:" + b2, (Throwable) null);
                this.f37669b.I = 4;
                return;
            }
            f.b("imsdk", "LeakMsgRepairModel repairDBNewer start real, cid:" + this.f37668a, (Throwable) null);
            long uptimeMillis = SystemClock.uptimeMillis();
            Pair<Boolean, List<String>> a3 = a(c2);
            z zVar = this.f37669b;
            if (((Boolean) a3.first).booleanValue()) {
                i2 = 5;
            } else {
                i2 = 6;
            }
            zVar.I = i2;
            this.f37669b.P = a3.second.toString();
            this.f37669b.O = SystemClock.uptimeMillis() - uptimeMillis;
            this.f37669b.N = ad.a(this.f37668a).copy();
            f.b("imsdk", "LeakMsgRepairModel repairDBNewer end, cid:" + this.f37668a + ", before:" + this.f37669b.M + ", after:" + this.f37669b.N, (Throwable) null);
        }
    }

    private void a(long j2) {
        int i2;
        s.a();
        long d2 = s.d();
        f.b("imsdk", "LeakMsgRepairModel repairDBOlder start, cid:" + this.f37668a + ", startIndex:" + j2, (Throwable) null);
        this.f37669b.u = j2;
        if (j2 <= d2) {
            f.b("imsdk", "LeakMsgRepairModel repairDBOlder end, reach base, cid:" + this.f37668a + ", baseIndex:" + d2 + ", startIndex:" + j2, (Throwable) null);
            this.f37669b.t = 1;
            if (j2 == d2) {
                a(this.f37668a, new ap(j2, j2));
                return;
            }
            return;
        }
        List<Long> a2 = i.a(this.f37668a, new ap(d2, j2));
        if (d.a(a2)) {
            this.f37669b.t = 2;
            f.b("imsdk", "LeakMsgRepairModel repairDBOlder error indexList empty, cid:" + this.f37668a, (Throwable) null);
            return;
        }
        this.f37669b.x = ad.a(this.f37668a).copy();
        long longValue = a2.get(0).longValue();
        List<Long> b2 = b(a2);
        if (b2.isEmpty()) {
            this.f37669b.t = 6;
            f.b("imsdk", "LeakMsgRepairModel repairDBOlder leakIndexList empty, cid:" + this.f37668a, (Throwable) null);
            a(this.f37668a, new ap(longValue, j2));
            b(longValue);
            return;
        }
        List<ap> c2 = c(b2);
        a(this.f37668a, new ap(longValue + 1, j2 - 1), c2);
        this.f37669b.v = b2;
        this.f37669b.w = new aq(c2);
        if (c2.isEmpty()) {
            f.b("imsdk", "LeakMsgRepairModel repairDBOlder error leakRange empty, cid:" + this.f37668a + ", leakIndexList:" + b2, (Throwable) null);
            this.f37669b.t = 3;
            b(longValue);
            return;
        }
        f.b("imsdk", "LeakMsgRepairModel repairDBOlder start real, cid:" + this.f37668a + ", leakRanges:" + c2, (Throwable) null);
        long uptimeMillis = SystemClock.uptimeMillis();
        Pair<Boolean, List<String>> a3 = a(c2);
        this.f37669b.A = a3.second.toString();
        z zVar = this.f37669b;
        if (((Boolean) a3.first).booleanValue()) {
            i2 = 4;
        } else {
            i2 = 5;
        }
        zVar.t = i2;
        this.f37669b.z = SystemClock.uptimeMillis() - uptimeMillis;
        b(longValue);
        this.f37669b.y = ad.a(this.f37668a).copy();
        f.b("imsdk", "LeakMsgRepairModel repairDBOlder end, cid:" + this.f37668a + ", before:" + this.f37669b.x + ", after:" + this.f37669b.y, (Throwable) null);
    }

    public static synchronized void a(String str, ap apVar) {
        synchronized (ab.class) {
            MethodCollector.i(11291);
            if (TextUtils.isEmpty(str) || apVar == null || !apVar.isValid()) {
                f.b("LeakMsgRepairModel ", "storeContinueRange invalid, cid:" + str + ", range:" + apVar, (Throwable) null);
                MethodCollector.o(11291);
                return;
            }
            aq a2 = ad.a(str);
            aq copy = a2.copy();
            a2.merge(apVar.copy());
            ad.a(str, a2);
            f.b("imsdk", "LeakMsgRepairModel storeContinueRange, cid:" + str + ", range:" + apVar + ", before:" + copy + ", after:" + a2, (Throwable) null);
            MethodCollector.o(11291);
        }
    }
}
