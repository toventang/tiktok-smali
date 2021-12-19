package com.bytedance.helios.sdk.anchor.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.a.b;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.c;
import com.bytedance.helios.sdk.d.n;
import com.bytedance.helios.sdk.d.v;
import com.bytedance.helios.sdk.e;
import com.bytedance.helios.sdk.f;
import com.bytedance.helios.sdk.utils.g;
import h.f.b.l;
import h.m.p;
import h.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b implements com.bytedance.helios.sdk.anchor.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30770a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final androidx.c.a<String, Runnable> f30771b = new androidx.c.a<>();

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.helios.api.a.b f30772c;

    static {
        Covode.recordClassIndex(17885);
    }

    @Override // com.bytedance.helios.sdk.anchor.b
    public final String a() {
        return "AnchorTaskPlanA";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17886);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(String str) {
            boolean z;
            boolean z2;
            n a2 = e.a(v.f30935b);
            if (a2 != null) {
                List<com.bytedance.helios.api.b.n> list = a2.f30909c;
                if (!l.a((Object) str, (Object) "detectionAllPage") || !(!list.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List<c> list2 = (List) it.next().n.get("floating_view_activities");
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                            for (c cVar : list2) {
                                arrayList.add(cVar.f30802c);
                            }
                            ArrayList arrayList2 = arrayList;
                            if (arrayList2 != null && arrayList2.contains(str)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
                z2 = false;
                if (z || z2) {
                    return true;
                }
                return false;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.a.b$b  reason: collision with other inner class name */
    public static final class RunnableC0646b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public AnchorInfoModel f30773a;

        /* renamed from: b  reason: collision with root package name */
        public int f30774b;

        static {
            Covode.recordClassIndex(17887);
        }

        public final void run() {
            boolean z;
            List<com.bytedance.helios.api.b.n> list;
            boolean equals = TextUtils.equals(this.f30773a.getAnchorPage(), this.f30773a.getDetectionPage());
            f a2 = f.a();
            l.a((Object) a2, "");
            if (a2.c()) {
                f a3 = f.a();
                l.a((Object) a3, "");
                if (l.a((Object) a3.f30952e, (Object) this.f30773a.getDetectionPage())) {
                    f a4 = f.a();
                    l.a((Object) a4, "");
                    if (a4.f30954g == this.f30774b || !equals) {
                        com.bytedance.helios.sdk.utils.f.a("Helios-Log-Detection-Task", "skipDetectionTask runnable=" + hashCode() + " currentActivityPage=" + this.f30773a.getDetectionPage() + ' ' + "pageHashCode=" + this.f30774b + " isSamePage=" + equals, (String) null, 12);
                        return;
                    }
                }
            }
            Map<String, com.bytedance.helios.api.a.c> map = b.a.a().mCheckerMap;
            Iterator<T> it = this.f30773a.getMonitorEvents().iterator();
            loop0:
            while (true) {
                z = false;
                while (it.hasNext()) {
                    com.bytedance.helios.api.a.c cVar = map.get(it.next());
                    if (cVar != null) {
                        list = cVar.getHoldingResources();
                    } else {
                        list = null;
                    }
                    if (z || (list != null && a(list, this.f30773a, this.f30774b))) {
                        z = true;
                    }
                }
                break loop0;
            }
            if (z) {
                g.b().postDelayed(this, this.f30773a.getAnchorTimeDelay());
                com.bytedance.helios.sdk.utils.f.a("Helios-Log-Detection-Task", "continueDetectionTask runnable=" + hashCode() + " pageHashCode=" + this.f30774b, (String) null, 12);
            }
        }

        public RunnableC0646b(AnchorInfoModel anchorInfoModel, int i2) {
            l.c(anchorInfoModel, "");
            this.f30773a = anchorInfoModel;
            this.f30774b = i2;
        }

        private static boolean a(List<com.bytedance.helios.api.b.n> list, AnchorInfoModel anchorInfoModel, int i2) {
            int i3;
            long j2;
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                com.bytedance.helios.api.b.a aVar = t2.A;
                if (aVar != null) {
                    i3 = aVar.f30642a;
                } else {
                    i3 = 0;
                }
                if (i3 < anchorInfoModel.getMaxAnchorCheckCount()) {
                    com.bytedance.helios.api.b.a aVar2 = t2.A;
                    if (aVar2 != null) {
                        j2 = aVar2.f30643b;
                    } else {
                        j2 = 0;
                    }
                    if (currentTimeMillis - j2 >= anchorInfoModel.getAnchorTimeDelay() && ((i2 == 0 && l.a((Object) anchorInfoModel.getDetectionPage(), (Object) "detectionAllPage")) || (i2 == t2.f30682k && l.a((Object) t2.f30681j, (Object) anchorInfoModel.getDetectionPage())))) {
                        arrayList.add(t);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                com.bytedance.helios.api.b.n nVar = (com.bytedance.helios.api.b.n) obj;
                boolean a2 = a.a(nVar.f30681j);
                if (a2) {
                    com.bytedance.helios.sdk.utils.f.a("Helios-Log-Detection-Task", "skipCheckResourceByFloatingView page=" + nVar.f30681j + " hashCode=" + i2, (String) null, 12);
                    if (!(!a2)) {
                    }
                }
                arrayList2.add(obj);
            }
            ArrayList<com.bytedance.helios.api.b.n> arrayList3 = arrayList2;
            for (com.bytedance.helios.api.b.n nVar2 : arrayList3) {
                com.bytedance.helios.api.b.a aVar3 = nVar2.A;
                if (aVar3 != null) {
                    aVar3.f30642a++;
                    aVar3.f30643b = currentTimeMillis;
                    com.bytedance.helios.sdk.utils.f.a("Helios-Log-Detection-Task", "checkSelfResourceIsRelease pageHashCode=" + i2 + " eventId=" + nVar2.f30673b + " eventName=" + nVar2.f30674c + ' ' + "eventStartTime=" + nVar2.f30683l + " eventAnchorReportCount=" + aVar3.f30642a, (String) null, 12);
                    if (aVar3.f30642a == anchorInfoModel.getMaxAnchorCheckCount()) {
                        nVar2.t = 4;
                        nVar2.w = true;
                        o.a(nVar2, false);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    public b(com.bytedance.helios.api.a.b bVar) {
        l.c(bVar, "");
        this.f30772c = bVar;
    }

    private final void a(String str, String str2) {
        Runnable runnable = this.f30771b.get(str);
        if (runnable != null) {
            g.b().removeCallbacks(runnable);
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Detection-Task", "removeAnchorTask detectionTaskKey=" + str + " removeTag=" + str2, (String) null, 12);
        }
    }

    private static AnchorInfoModel a(String str, int i2) {
        T t;
        String a2 = com.bytedance.helios.api.a.a.a(i2);
        Iterator<T> it = HeliosEnvImpl.INSTANCE.getAnchorConfigList().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if ((TextUtils.equals(t2.getAnchorPage(), str) || t2.getAnchorPage().length() == 0) && (t2.getAnchorLifeCycle().contains(a2) || (i2 == 9 && t2.getSkipAnchorActions().contains("floating_window_view")))) {
                break;
            }
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.helios.sdk.anchor.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.helios.sdk.anchor.a r9, int r10) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.anchor.a.b.a(com.bytedance.helios.sdk.anchor.a, int):void");
    }

    @Override // com.bytedance.helios.sdk.anchor.b
    public final void a(com.bytedance.helios.sdk.anchor.a aVar, Integer num) {
        l.c(aVar, "");
        if (num != null && num.intValue() == 8) {
            List<c> list = aVar.f30768c;
            if (list != null) {
                for (T t : list) {
                    a(t.f30802c, com.bytedance.helios.api.a.a.a(8));
                    a(t.toString(), com.bytedance.helios.api.a.a.a(8));
                }
            }
            List<AnchorInfoModel> anchorConfigList = HeliosEnvImpl.INSTANCE.getAnchorConfigList();
            ArrayList<AnchorInfoModel> arrayList = new ArrayList();
            for (T t2 : anchorConfigList) {
                if (l.a((Object) t2.getDetectionPage(), (Object) "detectionAllPage")) {
                    arrayList.add(t2);
                }
            }
            for (AnchorInfoModel anchorInfoModel : arrayList) {
                if (p.a((CharSequence) anchorInfoModel.getAnchorPage())) {
                    a("AppBackgroundTask", com.bytedance.helios.api.a.a.a(8));
                } else {
                    Set<String> keySet = this.f30771b.keySet();
                    l.a((Object) keySet, "");
                    ArrayList<String> arrayList2 = new ArrayList();
                    for (T t3 : keySet) {
                        T t4 = t3;
                        l.a((Object) t4, "");
                        if (p.e((CharSequence) t4, (CharSequence) anchorInfoModel.getAnchorPage())) {
                            arrayList2.add(t3);
                        }
                    }
                    for (String str : arrayList2) {
                        a(str, com.bytedance.helios.api.a.a.a(8));
                    }
                }
            }
        }
    }

    private final void a(String str, AnchorInfoModel anchorInfoModel, int i2) {
        if (a.a(anchorInfoModel.getDetectionPage())) {
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Detection-Task", "skipAddTaskByFloatingView page=" + anchorInfoModel.getDetectionPage() + " hashCode=" + i2, (String) null, 12);
            return;
        }
        a(str, "addDetectionTask");
        this.f30771b.put(str, new RunnableC0646b(anchorInfoModel, i2));
        Runnable runnable = this.f30771b.get(str);
        if (runnable != null) {
            g.b().postDelayed(runnable, anchorInfoModel.getAnchorTimeDelay());
        }
        com.bytedance.helios.sdk.utils.f.a("Helios-Log-Detection-Task", "runAnchorTask detectionTaskKey=" + str + " hashCode=" + i2, (String) null, 12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0086, code lost:
        if ((!h.f.b.l.a((java.lang.Object) r12, (java.lang.Object) r0.e())) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        if (r0.f30954g == r15.f30767b) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.bytedance.helios.api.config.AnchorInfoModel r14, com.bytedance.helios.sdk.anchor.a r15, int r16) {
        /*
        // Method dump skipped, instructions count: 486
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.anchor.a.b.a(com.bytedance.helios.api.config.AnchorInfoModel, com.bytedance.helios.sdk.anchor.a, int):void");
    }
}
