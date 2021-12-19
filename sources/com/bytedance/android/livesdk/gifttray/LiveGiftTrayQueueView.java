package com.bytedance.android.livesdk.gifttray;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gifttray.b.a;
import com.bytedance.android.livesdk.gifttray.d.b;
import com.bytedance.android.livesdk.gifttray.d.d;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPerformanceSettings;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.c.i.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class LiveGiftTrayQueueView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    final LinkedList<com.bytedance.android.livesdk.gifttray.a.a> f17980a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    final LinkedList<com.bytedance.android.livesdk.gifttray.a.a> f17981b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f17982c = new ArrayList<>(2);

    /* renamed from: d  reason: collision with root package name */
    DataChannel f17983d;

    /* renamed from: e  reason: collision with root package name */
    final HashSet<String> f17984e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    final HashSet<String> f17985f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    final a f17986g = new a(this);

    static {
        Covode.recordClassIndex(9989);
    }

    public static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftTrayQueueView f17987a;

        static {
            Covode.recordClassIndex(9990);
        }

        @Override // com.bytedance.android.livesdk.gifttray.a
        public final void a() {
            this.f17987a.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(LiveGiftTrayQueueView liveGiftTrayQueueView) {
            this.f17987a = liveGiftTrayQueueView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ca, code lost:
            if (r6 == null) goto L_0x0057;
         */
        /* JADX WARNING: Removed duplicated region for block: B:135:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
        @Override // com.bytedance.android.livesdk.gifttray.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r10) {
            /*
            // Method dump skipped, instructions count: 518
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.LiveGiftTrayQueueView.a.a(int):void");
        }
    }

    public final int getQueueSize() {
        return this.f17980a.size() + this.f17981b.size();
    }

    private final boolean d() {
        Iterator<b> it = this.f17982c.iterator();
        while (it.hasNext()) {
            if (it.next().f18015h) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        com.bytedance.android.livesdk.gifttray.a.a b2;
        Iterator<b> it = this.f17982c.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f18008a) {
                if (d()) {
                    b2 = c();
                } else {
                    b2 = b();
                }
                if (b2 != null) {
                    b2.o = com.bytedance.android.livesdk.utils.a.a.a();
                    b(b2);
                    next.a(b2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int getNotCommonShowAmount() {
        u uVar;
        u uVar2;
        Iterator<com.bytedance.android.livesdk.gifttray.a.a> it = this.f17980a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            y yVar = it.next().C;
            if (yVar == null || (uVar2 = yVar.t) == null || uVar2.f19762e != 2) {
                i2++;
            }
        }
        Iterator<com.bytedance.android.livesdk.gifttray.a.a> it2 = this.f17981b.iterator();
        while (it2.hasNext()) {
            y yVar2 = it2.next().C;
            if (yVar2 == null || (uVar = yVar2.t) == null || uVar.f19762e != 2) {
                i2++;
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final int getNotEffectShowAmount() {
        u uVar;
        u uVar2;
        Iterator<com.bytedance.android.livesdk.gifttray.a.a> it = this.f17980a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            y yVar = it.next().C;
            if (!(yVar == null || (uVar2 = yVar.t) == null || uVar2.f19762e != 2)) {
                i2++;
            }
        }
        Iterator<com.bytedance.android.livesdk.gifttray.a.a> it2 = this.f17981b.iterator();
        while (it2.hasNext()) {
            y yVar2 = it2.next().C;
            if (!(yVar2 == null || (uVar = yVar2.t) == null || uVar.f19762e != 2)) {
                i2++;
            }
        }
        return i2;
    }

    private final com.bytedance.android.livesdk.gifttray.a.a b() {
        com.bytedance.android.livesdk.gifttray.a.a aVar;
        if (this.f17980a.size() != 0) {
            Iterator<com.bytedance.android.livesdk.gifttray.a.a> it = this.f17980a.iterator();
            l.b(it, "");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.android.livesdk.gifttray.a.a next = it.next();
                l.b(next, "");
                aVar = next;
                if (!c(aVar)) {
                    it.remove();
                    if (LiveGiftPerformanceSettings.INSTANCE.useNewSelfQueue()) {
                        if (!this.f17985f.contains(aVar.f17994a)) {
                            return aVar;
                        }
                        this.f17985f.remove(aVar.f17994a);
                        return aVar;
                    } else if (aVar != null) {
                        return aVar;
                    }
                }
            }
        }
        aVar = null;
        if (this.f17981b.size() == 0) {
            return aVar;
        }
        Iterator<com.bytedance.android.livesdk.gifttray.a.a> it2 = this.f17981b.iterator();
        l.b(it2, "");
        while (it2.hasNext()) {
            com.bytedance.android.livesdk.gifttray.a.a next2 = it2.next();
            l.b(next2, "");
            com.bytedance.android.livesdk.gifttray.a.a aVar2 = next2;
            if (!c(aVar2)) {
                it2.remove();
                if (LiveGiftPerformanceSettings.INSTANCE.useNewQueue() && this.f17984e.contains(aVar2.f17994a)) {
                    this.f17984e.remove(aVar2.f17994a);
                }
                return aVar2;
            }
        }
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.android.livesdk.gifttray.a.a c() {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.LiveGiftTrayQueueView.c():com.bytedance.android.livesdk.gifttray.a.a");
    }

    public final void setDataCenter(DataChannel dataChannel) {
        this.f17983d = dataChannel;
    }

    private final boolean c(com.bytedance.android.livesdk.gifttray.a.a aVar) {
        if (aVar == null) {
            return true;
        }
        Iterator<b> it = this.f17982c.iterator();
        while (it.hasNext()) {
            if (b.a(aVar, it.next().f18012e)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void b(com.bytedance.android.livesdk.gifttray.a.a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.f17981b.size() >= LiveGiftPerformanceSettings.INSTANCE.getHotQueueSize()) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.f17998e >= LiveGiftPerformanceSettings.INSTANCE.getSelfHotQueueSize()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || aVar.A) {
            z3 = false;
        } else {
            z3 = true;
        }
        aVar.f17999f = z3;
        if (z2 && aVar.A) {
            z4 = true;
        }
        aVar.f18000g = z4;
        aVar.f18002i = this.f17981b.size();
        aVar.f18003j = this.f17980a.size();
        if (d.a(aVar)) {
            aVar.f18004k = aVar.f18001h;
        } else {
            aVar.f18004k = 1;
        }
    }

    public final void a(com.bytedance.android.livesdk.gifttray.a.a aVar) {
        u uVar;
        u uVar2;
        l.d(aVar, "");
        aVar.n = com.bytedance.android.livesdk.utils.a.a.a();
        if (aVar.A) {
            if (LiveGiftPerformanceSettings.INSTANCE.useNewSelfQueue()) {
                LinkedList<com.bytedance.android.livesdk.gifttray.a.a> linkedList = this.f17980a;
                HashSet<String> hashSet = this.f17985f;
                l.d(aVar, "");
                l.d(linkedList, "");
                l.d(hashSet, "");
                aVar.s = System.nanoTime();
                String str = aVar.f17994a;
                if (b.a(aVar) || !hashSet.contains(str)) {
                    aVar.t = System.nanoTime();
                    com.bytedance.android.livesdk.gifttray.b.a.a(aVar, linkedList);
                    hashSet.add(str);
                    aVar.u = System.nanoTime();
                } else {
                    com.bytedance.android.livesdk.gifttray.a.a a2 = com.bytedance.android.livesdk.gifttray.b.a.a(str, linkedList);
                    if (a2 != null) {
                        aVar.f17998e = a2.f17998e;
                        aVar.f18001h = a2.f18001h + 1;
                    }
                    aVar.t = System.nanoTime();
                    com.bytedance.android.livesdk.gifttray.b.a.a(aVar, linkedList);
                    b.a.C0467a.f21435a.c();
                    aVar.u = System.nanoTime();
                }
            } else {
                this.f17980a.addLast(aVar);
            }
        } else if (LiveGiftPerformanceSettings.INSTANCE.useNewQueue()) {
            LinkedList<com.bytedance.android.livesdk.gifttray.a.a> linkedList2 = this.f17981b;
            HashSet<String> hashSet2 = this.f17984e;
            l.d(aVar, "");
            l.d(linkedList2, "");
            l.d(hashSet2, "");
            aVar.s = System.nanoTime();
            String str2 = aVar.f17994a;
            if (com.bytedance.android.livesdk.gifttray.d.b.a(aVar) || !hashSet2.contains(str2)) {
                aVar.t = System.nanoTime();
                com.bytedance.android.livesdk.gifttray.b.a.a(aVar, linkedList2);
                hashSet2.add(str2);
                aVar.u = System.nanoTime();
            } else {
                com.bytedance.android.livesdk.gifttray.a.a a3 = com.bytedance.android.livesdk.gifttray.b.a.a(str2, linkedList2);
                if (a3 != null) {
                    aVar.f17998e = a3.f17998e;
                    aVar.f18001h = a3.f18001h + 1;
                }
                aVar.t = System.nanoTime();
                com.bytedance.android.livesdk.gifttray.b.a.a(aVar, linkedList2);
                y yVar = aVar.C;
                if (yVar == null || (uVar2 = yVar.t) == null || uVar2.f19762e != 2) {
                    b.a.C0467a.f21435a.b();
                } else {
                    b.a.C0467a.f21435a.d();
                }
                aVar.u = System.nanoTime();
            }
        } else {
            LinkedList<com.bytedance.android.livesdk.gifttray.a.a> linkedList3 = this.f17981b;
            l.d(aVar, "");
            l.d(linkedList3, "");
            long nanoTime = System.nanoTime();
            com.bytedance.android.livesdk.gifttray.a.a aVar2 = null;
            Iterator<com.bytedance.android.livesdk.gifttray.a.a> it = linkedList3.iterator();
            l.b(it, "");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.android.livesdk.gifttray.a.a next = it.next();
                l.b(next, "");
                com.bytedance.android.livesdk.gifttray.a.a aVar3 = next;
                if (com.bytedance.android.livesdk.gifttray.d.b.a(aVar3, aVar)) {
                    it.remove();
                    aVar2 = aVar3;
                    if (aVar2 != null) {
                        aVar2.f17997d = aVar.f17997d;
                        linkedList3.add(aVar2);
                        y yVar2 = aVar2.C;
                        if (yVar2 == null || (uVar = yVar2.t) == null || uVar.f19762e != 2) {
                            b.a.C0467a.f21435a.b();
                        } else {
                            b.a.C0467a.f21435a.d();
                        }
                        y yVar3 = aVar2.C;
                        if (yVar3 != null && yVar3.s) {
                            b.a.C0467a.f21435a.c();
                        }
                        aVar2.f18001h++;
                        aVar2.p = nanoTime;
                        aVar2.q = System.nanoTime();
                    }
                }
            }
            linkedList3.add(aVar);
            aVar.p = nanoTime;
            aVar.q = System.nanoTime();
            n.a((List) linkedList3, (Comparator) a.C0375a.f18021a);
            if (aVar2 == null) {
                aVar.r = System.nanoTime();
            } else {
                aVar2.r = System.nanoTime();
            }
        }
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveGiftTrayQueueView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(10219);
        MethodCollector.o(10219);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(com.bytedance.android.livesdk.gifttray.a.a aVar, Integer num) {
        int i2;
        if (aVar != null) {
            ArrayList<b> arrayList = this.f17982c;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            b bVar = arrayList.get(i2);
            l.b(bVar, "");
            if (com.bytedance.android.livesdk.gifttray.d.b.a(aVar, bVar.f18012e)) {
                return true;
            }
        }
        return false;
    }
}
