package com.bytedance.helios.sdk.anchor.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.api.config.ResourceCheckModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.utils.f;
import com.bytedance.helios.sdk.utils.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c implements com.bytedance.helios.sdk.anchor.b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f30775b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final androidx.c.a<String, a> f30776a = new androidx.c.a<>();

    /* renamed from: c  reason: collision with root package name */
    private final androidx.c.a<String, Map<String, String>> f30777c = new androidx.c.a<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, ResourceCheckModel> f30778d = new androidx.c.a();

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.helios.api.a.b f30779e;

    static {
        Covode.recordClassIndex(17888);
    }

    @Override // com.bytedance.helios.sdk.anchor.b
    public final String a() {
        return "AnchorTaskPlanB";
    }

    public static final class b {
        static {
            Covode.recordClassIndex(17890);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private final void b() {
        for (T t : HeliosEnvImpl.INSTANCE.getResourceCheckSettings()) {
            f.a("AnchorTaskPlanB", "init: ".concat(String.valueOf(t)), (String) null, 12);
            this.f30778d.put(t.getCheckPage(), t);
            String checkPage = t.getCheckPage();
            for (T t2 : t.getResources()) {
                Map<String, String> map = this.f30777c.get(t2);
                if (map == null) {
                    map = new androidx.c.a<>();
                }
                for (String str : t.getStopCheckLifeCycle()) {
                    map.put(checkPage, str);
                }
                this.f30777c.put(t2, map);
            }
        }
    }

    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final long f30780a;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.helios.api.a.c f30781b;

        /* renamed from: c  reason: collision with root package name */
        public String f30782c;

        /* renamed from: d  reason: collision with root package name */
        public int f30783d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f30784e;

        /* renamed from: f  reason: collision with root package name */
        private final int f30785f;

        /* renamed from: g  reason: collision with root package name */
        private final String f30786g;

        /* renamed from: h  reason: collision with root package name */
        private final int f30787h;

        /* renamed from: i  reason: collision with root package name */
        private final String f30788i;

        static {
            Covode.recordClassIndex(17889);
        }

        public final void run() {
            int i2;
            MethodCollector.i(2394);
            List<n> holdingResources = this.f30781b.getHoldingResources();
            ArrayList arrayList = new ArrayList();
            for (T t : holdingResources) {
                T t2 = t;
                com.bytedance.helios.api.b.a aVar = t2.A;
                if (aVar != null) {
                    i2 = aVar.f30642a;
                } else {
                    i2 = 0;
                }
                if (i2 < this.f30785f && ((this.f30787h == 1 && l.a((Object) t2.f30681j, (Object) this.f30786g) && t2.f30682k == this.f30783d) || this.f30787h == 0)) {
                    arrayList.add(t);
                }
            }
            ArrayList<n> arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                f.a("AnchorTaskPlanB", "run: no resource leak found: " + this.f30782c + " in " + this.f30788i, "w", 8);
                synchronized (this) {
                    try {
                        this.f30784e.f30776a.remove(this.f30782c);
                    } finally {
                        MethodCollector.o(2394);
                    }
                }
                return;
            }
            for (n nVar : arrayList2) {
                com.bytedance.helios.api.b.a aVar2 = nVar.A;
                if (aVar2 != null) {
                    aVar2.f30642a++;
                    int i3 = aVar2.f30642a;
                    f.a("AnchorTaskPlanB", "run: resource " + this.f30782c + " leak checked " + i3 + " times in " + this.f30788i, (String) null, 12);
                    if (i3 < this.f30785f) {
                        aVar2.f30643b = System.currentTimeMillis();
                        g.b().postDelayed(this, this.f30780a);
                    } else {
                        nVar.t = 4;
                        nVar.w = true;
                        o.a(nVar, false);
                    }
                }
            }
            MethodCollector.o(2394);
        }

        public a(c cVar, com.bytedance.helios.api.a.c cVar2, String str, int i2, ResourceCheckModel resourceCheckModel, int i3) {
            l.c(cVar2, "");
            l.c(str, "");
            l.c(resourceCheckModel, "");
            this.f30784e = cVar;
            this.f30781b = cVar2;
            this.f30782c = str;
            this.f30783d = i2;
            this.f30780a = resourceCheckModel.getCheckTimeDelay();
            this.f30785f = resourceCheckModel.getMaxCheckTimes();
            this.f30786g = resourceCheckModel.getCheckPage();
            this.f30787h = resourceCheckModel.getCheckType();
            this.f30788i = com.bytedance.helios.api.a.a.a(i3);
        }
    }

    private static String a(com.bytedance.helios.sdk.anchor.a aVar) {
        String str = aVar.f30766a;
        if (str == null) {
            return "null";
        }
        return str;
    }

    public c(com.bytedance.helios.api.a.b bVar) {
        l.c(bVar, "");
        this.f30779e = bVar;
    }

    private final ResourceCheckModel a(String str) {
        if (this.f30778d.isEmpty()) {
            b();
        }
        return this.f30778d.get(str);
    }

    @Override // com.bytedance.helios.sdk.anchor.b
    public final void a(com.bytedance.helios.sdk.anchor.a aVar, int i2) {
        String next;
        Map<String, String> map;
        l.c(aVar, "");
        ResourceCheckModel a2 = a(a(aVar));
        if (a2 == null) {
            com.bytedance.helios.api.a.a.a(i2);
            return;
        }
        Iterator<String> it = a2.getResources().iterator();
        while (it.hasNext() && (map = this.f30777c.get((next = it.next()))) != null && !map.isEmpty()) {
            String a3 = com.bytedance.helios.api.a.a.a(i2);
            Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry<String, String> next2 = it2.next();
                    String key = next2.getKey();
                    String value = next2.getValue();
                    if (l.a((Object) key, (Object) a(aVar)) && l.a((Object) value, (Object) a3)) {
                        f.a("AnchorTaskPlanB", "unScheduleIfNeeded: " + aVar + " in " + a3 + " for " + next, (String) null, 12);
                        a aVar2 = this.f30776a.get(next);
                        if (aVar2 != null) {
                            g.b().removeCallbacks(aVar2);
                        }
                        this.f30776a.remove(next);
                        return;
                    }
                }
            }
        }
        a(a2, aVar, i2);
    }

    @Override // com.bytedance.helios.sdk.anchor.b
    public final void a(com.bytedance.helios.sdk.anchor.a aVar, Integer num) {
        l.c(aVar, "");
        ResourceCheckModel a2 = a(a(aVar));
        if (a2 != null) {
            for (String str : a2.getResources()) {
                a aVar2 = this.f30776a.get(str);
                if (aVar2 != null) {
                    f.a("AnchorTaskPlanB", "unSchedule: " + aVar + " for " + str, (String) null, 12);
                    g.b().removeCallbacks(aVar2);
                }
            }
        }
    }

    private final void a(ResourceCheckModel resourceCheckModel, com.bytedance.helios.sdk.anchor.a aVar, int i2) {
        if (resourceCheckModel.getCheckLifeCycle().contains(com.bytedance.helios.api.a.a.a(i2))) {
            int checkType = resourceCheckModel.getCheckType();
            for (String str : resourceCheckModel.getResources()) {
                f.a("AnchorTaskPlanB", "schedule: " + aVar + " in " + com.bytedance.helios.api.a.a.a(i2) + " for " + str, (String) null, 12);
                if (checkType == 1) {
                    a(str, aVar.f30767b, i2, resourceCheckModel);
                } else if (checkType == 0) {
                    String a2 = a(aVar);
                    com.bytedance.helios.sdk.f a3 = com.bytedance.helios.sdk.f.a();
                    l.a((Object) a3, "");
                    if (l.a((Object) a2, (Object) a3.f30952e)) {
                        a(str, 0, i2, resourceCheckModel);
                    }
                }
            }
        }
    }

    private final void a(String str, int i2, int i3, ResourceCheckModel resourceCheckModel) {
        MethodCollector.i(1721);
        com.bytedance.helios.api.a.c cVar = this.f30779e.mCheckerMap.get(str);
        if (cVar != null) {
            a aVar = new a(this, cVar, str, i2, resourceCheckModel, i3);
            synchronized (this) {
                try {
                    this.f30776a.put(str, aVar);
                } finally {
                    MethodCollector.o(1721);
                }
            }
            g.b().postDelayed(aVar, aVar.f30780a);
        }
    }
}
