package com.bytedance.im.core.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.b.a.ae;
import com.bytedance.im.core.internal.utils.d;
import com.bytedance.im.core.internal.utils.e;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.internal.utils.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

public class aa {

    /* renamed from: a  reason: collision with root package name */
    public static aa f37654a;

    /* renamed from: b  reason: collision with root package name */
    public Set<t> f37655b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f37656c = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(22647);
    }

    private aa() {
    }

    public static aa a() {
        MethodCollector.i(11095);
        if (f37654a == null) {
            synchronized (aa.class) {
                try {
                    if (f37654a == null) {
                        f37654a = new aa();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11095);
                    throw th;
                }
            }
        }
        aa aaVar = f37654a;
        MethodCollector.o(11095);
        return aaVar;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str) || !this.f37656c.contains(str)) {
            return false;
        }
        return true;
    }

    public static long a(String str, long j2) {
        ap apVar;
        long j3;
        s.a();
        if (!s.c()) {
            f.b("imsdk", "LeakMsgRepairManager getLoadOlderMinIndex no recent mode, cid:".concat(String.valueOf(str)), (Throwable) null);
            return Long.MIN_VALUE;
        }
        s.a();
        long d2 = s.d();
        if (j2 <= d2) {
            f.b("imsdk", "LeakMsgRepairManager getLoadOlderMinIndex reach baseIndexV2, cid:" + str + ", localMinIndex:" + j2, (Throwable) null);
            return Long.MIN_VALUE;
        }
        List<ap> list = ad.a(str).copy().ranges;
        if (d.a(list)) {
            f.b("imsdk", "LeakMsgRepairManager getLoadOlderMinIndex repairedRanges empty", (Throwable) null);
            return Long.MIN_VALUE;
        }
        Iterator<ap> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                apVar = list.get(list.size() - 1);
                break;
            }
            apVar = it.next();
            if (apVar.start <= j2 && j2 <= apVar.end) {
                break;
            }
        }
        long j4 = apVar.start;
        if (j4 > d2) {
            j3 = i.b(str, j4);
        } else {
            j3 = Long.MIN_VALUE;
        }
        f.b("imsdk", "LeakMsgRepairManager getLoadOlderMinIndex, cid:" + str + ", localMinIndex:" + j2 + ", minIndexV2:" + j4 + ", minIndex:" + j3 + ", repairedRanges:" + list, (Throwable) null);
        if (j3 > 0) {
            return j3;
        }
        return Long.MIN_VALUE;
    }

    public static long b(String str, long j2) {
        ap apVar;
        long j3;
        s.a();
        if (!s.c()) {
            f.b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex no recent mode, cid:".concat(String.valueOf(str)), (Throwable) null);
            return Long.MAX_VALUE;
        }
        s.a();
        long d2 = s.d();
        if (j2 < d2) {
            f.b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex less than baseIndexV2, cid:" + str + ", localMaxIndex:" + j2, (Throwable) null);
            return Long.MAX_VALUE;
        }
        long f2 = i.f(str);
        if (j2 >= f2) {
            f.b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex reach maxIndexV2, cid:" + str + ", localMaxIndex:" + j2, (Throwable) null);
            return Long.MAX_VALUE;
        }
        List<ap> list = ad.a(str).copy().ranges;
        if (d.a(list)) {
            f.b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex repairedRanges empty", (Throwable) null);
            return Long.MAX_VALUE;
        }
        Iterator<ap> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                apVar = list.get(0);
                break;
            }
            apVar = it.next();
            if (apVar.start <= j2 && j2 <= apVar.end) {
                break;
            }
        }
        long j4 = apVar.end;
        if (j4 < d2 || j4 >= f2) {
            j3 = Long.MAX_VALUE;
        } else {
            j3 = i.b(str, j4);
        }
        f.b("imsdk", "LeakMsgRepairManager getLoadNewerMaxIndex, cid:" + str + ", localMaxIndex:" + j2 + ", maxIndexV2:" + j4 + ", maxIndex:" + j3 + ", repairedRanges:" + list, (Throwable) null);
        if (j3 > 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    static List<ai> a(String str, List<ai> list, y yVar) {
        if (TextUtils.isEmpty(str) || d.a(list)) {
            f.b("imsdk", "LeakMsgRepairManager findPreContinue, cid:" + str + ", list:" + e.a((List) list) + ", invalid", (Throwable) null);
            yVar.f38033b = 0;
            return list;
        }
        yVar.f38034c = e.a((List) list);
        s.a();
        if (!s.c()) {
            f.b("imsdk", "LeakMsgRepairManager findPreContinue, cid:" + str + ", no recent mode", (Throwable) null);
            yVar.f38033b = 1;
            return list;
        }
        v.a();
        long f2 = i.f(str);
        s.a();
        long d2 = s.d();
        yVar.f38036e = f2;
        yVar.f38037f = d2;
        if (f2 <= d2) {
            f.b("imsdk", "LeakMsgRepairManager findPreContinue, cid:" + str + ", maxIndex:" + f2 + " smaller than baseIndex:" + d2, (Throwable) null);
            yVar.f38033b = 2;
            return list;
        }
        f.b("imsdk", "LeakMsgRepairManager findPreContinue start, cid:" + str + ", list:" + list.size() + ", maxIndex:" + f2 + ", baseIndex:" + d2, (Throwable) null);
        ap apVar = new ap(Long.MAX_VALUE, Long.MIN_VALUE);
        HashSet hashSet = new HashSet();
        boolean z = false;
        for (ai aiVar : list) {
            long indexInConversationV2 = aiVar.getIndexInConversationV2();
            hashSet.add(Long.valueOf(indexInConversationV2));
            if (indexInConversationV2 >= d2) {
                apVar.start = Math.min(indexInConversationV2, apVar.start);
                apVar.end = Math.max(indexInConversationV2, apVar.end);
            } else if (!aiVar.isSelf()) {
                z = true;
            }
        }
        f.b("imsdk", "LeakMsgRepairManager findPreContinue step1, cid:" + str + ", indexRange:" + apVar + ", hasOldIndexV2:" + z, (Throwable) null);
        yVar.f38038g = apVar.copy();
        if (!apVar.isValid()) {
            f.b("imsdk", "LeakMsgRepairManager findPreContinue end by range, cid:" + str + ", indexRange:" + apVar, (Throwable) null);
            yVar.f38033b = 3;
            return list;
        }
        aq copy = ad.a(str).copy();
        ArrayList<Long> arrayList = new ArrayList();
        for (long j2 = apVar.start; j2 <= apVar.end; j2++) {
            if (!hashSet.contains(Long.valueOf(j2)) && !arrayList.contains(Long.valueOf(j2)) && !copy.check(j2)) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        f.b("imsdk", "LeakMsgRepairManager findPreContinue step2, cid:" + str + ", leakIndexList:" + arrayList + ", repairedRangeList:" + copy, (Throwable) null);
        if (!arrayList.isEmpty()) {
            i.a(str, arrayList);
        }
        ap apVar2 = !d.a(copy.ranges) ? copy.ranges.get(0) : null;
        if (!arrayList.isEmpty() || (z && (apVar2 == null || apVar2.start > d2))) {
            ap apVar3 = new ap(Long.MAX_VALUE, Long.MIN_VALUE);
            for (Long l2 : arrayList) {
                long longValue = l2.longValue();
                apVar3.start = Math.min(longValue, apVar3.start);
                apVar3.end = Math.max(longValue, apVar3.end);
            }
            f.b("imsdk", "LeakMsgRepairManager findPreContinue step3, cid:" + str + ", leakIndexList:" + arrayList + ", leakRange:" + apVar3, (Throwable) null);
            yVar.f38039h = apVar3.copy();
            yVar.f38041j = copy;
            ArrayList arrayList2 = new ArrayList();
            ap apVar4 = new ap(Long.MAX_VALUE, Long.MIN_VALUE);
            boolean z2 = false;
            for (ai aiVar2 : list) {
                long indexInConversationV22 = aiVar2.getIndexInConversationV2();
                if (indexInConversationV22 >= d2) {
                    z2 = true;
                }
                if ((indexInConversationV22 < d2 && z2) || (indexInConversationV22 <= apVar3.end && (!aiVar2.isSelf() || indexInConversationV22 >= d2))) {
                    break;
                }
                arrayList2.add(aiVar2);
                if (indexInConversationV22 >= d2) {
                    apVar4.start = Math.min(apVar4.start, indexInConversationV22);
                    apVar4.end = Math.max(apVar4.end, indexInConversationV22);
                }
            }
            ab.a(str, apVar4);
            yVar.f38033b = 5;
            yVar.f38032a = false;
            yVar.f38042k = ad.a(str).copy();
            f.b("imsdk", "LeakMsgRepairManager findPreContinue end, cid:" + str + ", indexRange:" + apVar + ", leakRange:" + apVar3 + ", continueRange:" + apVar4 + ", beforeRepaired:" + copy + ", afterRepaired:" + yVar.f38042k + ", list:" + list.size() + ", result:" + arrayList2.size(), (Throwable) null);
            return arrayList2;
        }
        f.b("imsdk", "LeakMsgRepairManager findPreContinue end by leakIndexList empty, cid:".concat(String.valueOf(str)), (Throwable) null);
        ab.a(str, apVar);
        yVar.f38033b = 4;
        return list;
    }

    public final synchronized List<ai> a(String str, long j2, ai aiVar, List<ai> list) {
        Long l2;
        ap apVar;
        MethodCollector.i(11105);
        if (!TextUtils.isEmpty(str) && !d.a(list)) {
            if (aiVar != null) {
                v.a();
                s.a();
                if (!s.c()) {
                    f.b("imsdk", "LeakMsgRepairManager onModelGetMsg no recent mode, cid:".concat(String.valueOf(str)), (Throwable) null);
                    MethodCollector.o(11105);
                    return list;
                }
                f.b("imsdk", "LeakMsgRepairManager onModelGetMsg start, cid:" + str + ", list:" + list.size() + ", localMaxIndex:" + j2 + ", lastMessage:" + aiVar.getIndexInConversationV2(), (Throwable) null);
                s.a();
                long d2 = s.d();
                ap apVar2 = new ap(Long.MAX_VALUE, Long.MIN_VALUE);
                for (ai aiVar2 : list) {
                    long indexInConversationV2 = aiVar2.getIndexInConversationV2();
                    if (indexInConversationV2 >= d2) {
                        apVar2.start = Math.min(indexInConversationV2, apVar2.start);
                        apVar2.end = Math.max(indexInConversationV2, apVar2.end);
                    }
                }
                ab.a(str, apVar2);
                if (apVar2.isValid()) {
                    long j3 = j2 + 1;
                    if (apVar2.start > j3) {
                        ap apVar3 = new ap(j3, apVar2.start - 1);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        final boolean[] zArr = new boolean[1];
                        final af[] afVarArr = new af[1];
                        new ae(new b<af>() {
                            /* class com.bytedance.im.core.d.aa.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(22650);
                            }

                            @Override // com.bytedance.im.core.a.a.b
                            public final void a(u uVar) {
                                f.b("imsdk", "LeakMsgRepairManager onModelGetMsg onFailure, error:".concat(String.valueOf(uVar)), (Throwable) null);
                                zArr[0] = false;
                                af afVar = new af();
                                afVar.f37700g = uVar;
                                afVarArr[0] = afVar;
                                countDownLatch.countDown();
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.im.core.a.a.b
                            public final /* synthetic */ void a(af afVar) {
                                boolean z;
                                af afVar2 = afVar;
                                f.b("imsdk", "LeakMsgRepairManager onModelGetMsg onSuccess, result:".concat(String.valueOf(afVar2)), (Throwable) null);
                                boolean[] zArr = zArr;
                                if (afVar2 == null || !afVar2.f37695b) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                zArr[0] = z;
                                afVarArr[0] = afVar2;
                                countDownLatch.countDown();
                            }
                        }).a(str, apVar3.start, apVar3.end, 2);
                        try {
                            countDownLatch.await();
                        } catch (Exception e2) {
                            j.b("LeakMsgRepairManager onModelGetMsg interrupt", e2);
                        }
                        if (!(afVarArr[0] == null || (apVar = afVarArr[0].f37698e) == null || !apVar.isValid())) {
                            ab.a(str, apVar);
                        }
                        if (!zArr[0]) {
                            f.b("imsdk", "LeakMsgRepairManager onModelGetMsg end error, cid:".concat(String.valueOf(str)), (Throwable) null);
                            com.bytedance.im.core.g.b.a(str, false, list.size(), 0);
                            List<ai> emptyList = Collections.emptyList();
                            MethodCollector.o(11105);
                            return emptyList;
                        }
                        List<ai> a2 = i.a(str, aiVar.getIndex(), Long.MAX_VALUE, 50);
                        Collections.reverse(a2);
                        com.bytedance.im.core.g.b.a(str, true, list.size(), e.a((List) a2));
                        f.b("imsdk", "LeakMsgRepairManager onModelGetMsg end, cid:" + str + ", list:" + list.size() + ", localIndex:" + j2 + ", indexRange:" + apVar2 + ", result:" + e.a((List) a2), (Throwable) null);
                        MethodCollector.o(11105);
                        return a2;
                    }
                }
                f.b("imsdk", "LeakMsgRepairManager onModelGetMsg end continue, cid:" + str + ", list:" + list.size() + ", localIndex:" + j2 + ", indexRange:" + apVar2, (Throwable) null);
                MethodCollector.o(11105);
                return list;
            }
        }
        StringBuilder append = new StringBuilder("LeakMsgRepairManager onModelGetMsg invalid, cid:").append(str).append(", list:").append(e.a((List) list)).append(", lastMessage:");
        if (aiVar != null) {
            l2 = Long.valueOf(aiVar.getIndexInConversationV2());
        } else {
            l2 = null;
        }
        f.b("imsdk", append.append(l2).toString(), (Throwable) null);
        MethodCollector.o(11105);
        return list;
    }
}
