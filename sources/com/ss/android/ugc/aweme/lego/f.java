package com.ss.android.ugc.aweme.lego;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lego.a.a.i;
import com.ss.android.ugc.aweme.lego.a.a.j;
import com.ss.android.ugc.aweme.lego.a.a.k;
import com.ss.android.ugc.aweme.lego.a.a.m;
import com.ss.android.ugc.aweme.lego.a.a.o;
import com.ss.android.ugc.aweme.lego.a.a.p;
import com.ss.android.ugc.aweme.lego.a.a.q;
import com.ss.android.ugc.aweme.lego.a.a.t;
import com.ss.android.ugc.aweme.lego.a.a.u;
import com.ss.android.ugc.aweme.lego.a.a.w;
import com.ss.android.ugc.aweme.lego.a.e;
import com.ss.android.ugc.aweme.lego.d.a;
import com.ss.android.ugc.aweme.lego.e.a;
import com.ss.android.ugc.aweme.lego.f.a;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static long f107536a = 60000;

    /* renamed from: b  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.lego.e.d f107537b = new com.ss.android.ugc.aweme.lego.e.d();

    /* renamed from: c  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.lego.e.b f107538c = new com.ss.android.ugc.aweme.lego.e.b();

    /* renamed from: d  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.lego.e.c f107539d = new com.ss.android.ugc.aweme.lego.e.c();

    /* renamed from: e  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.lego.e.a f107540e = new com.ss.android.ugc.aweme.lego.e.a();

    /* renamed from: f  reason: collision with root package name */
    public static Context f107541f;

    /* renamed from: g  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.lego.a.d f107542g;

    /* renamed from: h  reason: collision with root package name */
    static boolean f107543h;

    /* renamed from: i  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.lego.component.c f107544i;

    /* renamed from: j  reason: collision with root package name */
    static Map<ab, List<n>> f107545j = new LinkedHashMap();

    /* renamed from: k  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.lego.component.f f107546k;

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<ad, com.ss.android.ugc.e.a> f107547l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    static final HashMap<Integer, com.ss.android.ugc.e.a> f107548m = new HashMap<>();
    public static final f n = new f();
    private static final int o = 10;
    private static final int p = 11;
    private static final int q = 12;
    private static final int r = 13;
    private static final int s = 14;
    private static final int t = 15;
    private static final int u = 16;
    private static final int v = 20;
    private static boolean w;
    private static Map<ab, List<Object>> x = new LinkedHashMap();
    private static int y;
    private static int z;

    private f() {
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f107554a;

        /* renamed from: b  reason: collision with root package name */
        private List<n>[] f107555b;

        /* renamed from: c  reason: collision with root package name */
        private List<n> f107556c;

        /* renamed from: d  reason: collision with root package name */
        private List<n> f107557d;

        /* renamed from: e  reason: collision with root package name */
        private Map<a, String[]> f107558e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, n> f107559f;

        /* renamed from: g  reason: collision with root package name */
        private int f107560g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f107561h;

        static {
            Covode.recordClassIndex(68812);
        }

        public /* synthetic */ d() {
            this(false);
        }

        private final void b() {
            for (Map.Entry<a, String[]> entry : this.f107558e.entrySet()) {
                int i2 = -1;
                Iterator a2 = h.f.b.b.a(entry.getValue());
                while (a2.hasNext()) {
                    n nVar = this.f107559f.get(a2.next());
                    if (nVar != null) {
                        a key = entry.getKey();
                        Objects.requireNonNull(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                        int ordinal = ((n) key).f().ordinal();
                        if (ordinal == nVar.f().ordinal() && ordinal == ad.TASK_BACKGROUND.ordinal()) {
                            com.ss.android.ugc.e.a aVar = f.f107548m.get(Integer.valueOf(ordinal));
                            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.common.trigger.BackgroundTrigger");
                            a key2 = entry.getKey();
                            Objects.requireNonNull(key2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                            ((com.ss.android.ugc.aweme.lego.a.a.b) aVar).a((n) key2, nVar);
                        } else {
                            int indexOf = this.f107556c.indexOf(nVar);
                            if (indexOf > i2) {
                                i2 = indexOf;
                            }
                        }
                    }
                }
                if (i2 > 0) {
                    a key3 = entry.getKey();
                    Objects.requireNonNull(key3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                    this.f107556c.add(i2 + 1, key3);
                } else {
                    List<n> list = this.f107557d;
                    a key4 = entry.getKey();
                    Objects.requireNonNull(key4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoComponent");
                    list.add(key4);
                }
            }
            this.f107556c.addAll(0, this.f107557d);
            this.f107558e = new LinkedHashMap();
            this.f107559f = new LinkedHashMap();
            this.f107557d = new ArrayList();
            this.f107560g = 0;
        }

        public final void a() {
            if (!this.f107561h) {
                List<n>[] listArr = this.f107555b;
                if (listArr.length != 0) {
                    int length = listArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        List<n> list = listArr[i2];
                        int i4 = i3 + 1;
                        if (list == null) {
                            l.b();
                        }
                        for (T t : list) {
                            com.ss.android.ugc.e.a aVar = f.f107548m.get(Integer.valueOf(i3));
                            if (aVar == null) {
                                l.b();
                            }
                            aVar.a((n) t);
                        }
                        i2++;
                        i3 = i4;
                    }
                    List<n>[] listArr2 = this.f107555b;
                    int length2 = listArr2.length;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length2) {
                        List<n> list2 = listArr2[i5];
                        int i7 = i6 + 1;
                        if (list2 == null) {
                            l.b();
                        }
                        if (list2.size() > 0) {
                            com.ss.android.ugc.e.a aVar2 = f.f107548m.get(Integer.valueOf(i6));
                            if (aVar2 == null) {
                                l.b();
                            }
                            aVar2.a(list2);
                        }
                        i5++;
                        i6 = i7;
                    }
                    this.f107555b = new List[0];
                }
            } else if (!this.f107556c.isEmpty() || !this.f107557d.isEmpty()) {
                if (this.f107554a) {
                    b();
                }
                for (n nVar : this.f107556c) {
                    int ordinal = nVar.f().ordinal();
                    com.ss.android.ugc.e.a aVar3 = f.f107548m.get(Integer.valueOf(ordinal));
                    if (aVar3 == null) {
                        l.b();
                    }
                    aVar3.a(nVar);
                    com.ss.android.ugc.e.a aVar4 = f.f107548m.get(Integer.valueOf(ordinal));
                    if (aVar4 == null) {
                        l.b();
                    }
                    aVar4.a(n.d(nVar));
                }
                this.f107556c = new ArrayList();
            }
        }

        public final d a(n nVar) {
            l.d(nVar, "");
            return a(nVar, true);
        }

        public d b(r rVar) {
            l.d(rVar, "");
            return a(rVar);
        }

        public d b(w wVar) {
            l.d(wVar, "");
            return a(wVar);
        }

        public d(boolean z) {
            this.f107554a = z;
            this.f107555b = new List[ad.values().length];
            this.f107556c = new ArrayList();
            this.f107557d = new ArrayList();
            this.f107558e = new LinkedHashMap();
            this.f107559f = new LinkedHashMap();
            this.f107561h = true;
        }

        public d b(Class<? extends q> cls) {
            l.d(cls, "");
            Object newInstance = cls.newInstance();
            l.b(newInstance, "");
            return a((n) newInstance);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
            if (r0 != 2) goto L_0x0018;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.lego.f.d a(com.ss.android.ugc.aweme.lego.n r8, boolean r9) {
            /*
            // Method dump skipped, instructions count: 330
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lego.f.d.a(com.ss.android.ugc.aweme.lego.n, boolean):com.ss.android.ugc.aweme.lego.f$d");
        }
    }

    public static d e() {
        return new d(false);
    }

    public static boolean a() {
        if ((y & t.f107627a) == t.f107627a) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if ((z & h.f107565a) == h.f107565a) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        return ((Boolean) z.f107647g.getValue()).booleanValue();
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f107562a;

        static {
            Covode.recordClassIndex(68813);
        }

        e(z.e eVar) {
            this.f107562a = eVar;
        }

        public final void run() {
            d dVar = new d();
            for (n nVar : this.f107562a.element) {
                dVar.a(nVar, false);
            }
            dVar.a();
        }
    }

    public static void d() {
        HashMap<ad, com.ss.android.ugc.e.a> hashMap = f107547l;
        com.ss.android.ugc.e.a aVar = hashMap.get(ad.SERVICE_BOOT_FINISH);
        if (aVar == null) {
            l.b();
        }
        aVar.a();
        com.ss.android.ugc.e.a aVar2 = hashMap.get(ad.TASK_BOOT_FINISH);
        if (aVar2 == null) {
            l.b();
        }
        aVar2.a();
    }

    static {
        Covode.recordClassIndex(68808);
    }

    public static d a(boolean z2) {
        return new d(z2);
    }

    public static final class a extends d {
        static {
            Covode.recordClassIndex(68809);
        }

        /* renamed from: a */
        public final a b(Class<? extends q> cls) {
            l.d(cls, "");
            d b2 = super.b(cls);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.Lego.InflateTransaction");
            return (a) b2;
        }
    }

    public static final class b extends d {
        static {
            Covode.recordClassIndex(68810);
        }

        /* renamed from: a */
        public final b b(r rVar) {
            l.d(rVar, "");
            d b2 = super.b(rVar);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.Lego.RequestTransaction");
            return (b) b2;
        }
    }

    public static final class c extends d {
        static {
            Covode.recordClassIndex(68811);
        }

        /* renamed from: a */
        public final c b(w wVar) {
            l.d(wVar, "");
            d b2 = super.b(wVar);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.Lego.TaskTransaction");
            return (c) b2;
        }
    }

    public static <T> T a(n nVar) {
        l.d(nVar, "");
        com.ss.android.ugc.e.a aVar = f107547l.get(nVar.f());
        if (aVar != null) {
            return (T) aVar.b(nVar);
        }
        return null;
    }

    public static <T> T b(Class<? extends q> cls) {
        l.d(cls, "");
        Object newInstance = cls.newInstance();
        l.b(newInstance, "");
        return (T) a((n) newInstance);
    }

    public static <T> T a(Class<? extends u> cls) {
        l.d(cls, "");
        Object newInstance = cls.newInstance();
        l.b(newInstance, "");
        return (T) a((n) newInstance);
    }

    public static void a(ab abVar) {
        l.d(abVar, "");
        if (!x.isEmpty() || !f107545j.isEmpty()) {
            z.e eVar = new z.e();
            eVar.element = (T) new ArrayList();
            List<Object> list = x.get(abVar);
            if (list != null) {
                for (T t2 : list) {
                    Objects.requireNonNull(t2, "null cannot be cast to non-null type () -> kotlin.collections.MutableList<com.ss.android.ugc.aweme.lego.LegoComponent>");
                    eVar.element.addAll((Collection) ((h.f.a.a) ad.b(t2, 0)).invoke());
                }
            }
            if (!eVar.element.isEmpty()) {
                g.d().execute(new e(eVar));
            }
            List<n> list2 = f107545j.get(abVar);
            if (list2 != null) {
                d dVar = new d();
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    dVar.a(it.next(), false);
                }
                dVar.a();
            }
            x.remove(abVar);
            f107545j.remove(abVar);
        }
    }

    public static void a(com.ss.android.ugc.aweme.lego.component.c cVar) {
        com.ss.android.ugc.e.a aVar;
        l.d(cVar, "");
        Context a2 = cVar.a();
        f107541f = a2;
        f107544i = cVar;
        if (a2 == null) {
            l.a("context");
        }
        String b2 = a.b(a2);
        com.ss.android.ugc.aweme.lego.component.f fVar = f107546k;
        if (fVar != null) {
            fVar.a(com.ss.android.ugc.aweme.lego.a.f.COLD_BOOT_BEGIN);
        }
        com.ss.android.ugc.aweme.lego.d.b.f107493b = Integer.valueOf(cVar.c().a());
        ad[] values = ad.values();
        for (ad adVar : values) {
            l.d(adVar, "");
            switch (w.f107370a[adVar.ordinal()]) {
                case 1:
                    aVar = new k();
                    break;
                case 2:
                    aVar = new com.ss.android.ugc.aweme.lego.a.a.e();
                    break;
                case 3:
                    aVar = new com.ss.android.ugc.aweme.lego.a.a.b();
                    break;
                case 4:
                    aVar = new m();
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    aVar = new com.ss.android.ugc.aweme.lego.a.a.g();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    aVar = new j();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    aVar = new u();
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    aVar = new com.ss.android.ugc.aweme.lego.a.a.n();
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    aVar = new q();
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    aVar = new o();
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    aVar = new p();
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    aVar = new com.ss.android.ugc.aweme.lego.a.a.d();
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    aVar = new com.ss.android.ugc.aweme.lego.a.a.a();
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    aVar = new com.ss.android.ugc.aweme.lego.a.a.l();
                    break;
                case 15:
                    aVar = new i();
                    break;
                case 16:
                    aVar = new t();
                    break;
                case 17:
                    aVar = new com.ss.android.ugc.aweme.lego.a.a.f();
                    break;
                default:
                    throw new IllegalArgumentException("uncorrect trigger type, please check");
            }
            f107547l.put(adVar, aVar);
            f107548m.put(Integer.valueOf(adVar.ordinal()), aVar);
        }
        if (!cVar.d()) {
            com.ss.android.ugc.aweme.lego.a.e.f107374b.a();
        }
        Context context = f107541f;
        if (context == null) {
            l.a("context");
        }
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        l.d(application, "");
        application.registerActivityLifecycleCallbacks(new e.a());
        com.ss.android.ugc.aweme.lego.e.d dVar = f107537b;
        Context context2 = f107541f;
        if (context2 == null) {
            l.a("context");
        }
        dVar.a(context2);
        com.ss.android.ugc.aweme.lego.e.b bVar = f107538c;
        Context context3 = f107541f;
        if (context3 == null) {
            l.a("context");
        }
        bVar.a(context3);
        com.ss.android.ugc.aweme.lego.e.c cVar2 = f107539d;
        Context context4 = f107541f;
        if (context4 == null) {
            l.a("context");
        }
        cVar2.a(context4);
        com.ss.android.ugc.aweme.lego.e.a aVar2 = f107540e;
        Context context5 = f107541f;
        if (context5 == null) {
            l.a("context");
        }
        l.d(context5, "");
        aVar2.f107514a = context5;
        ((Application) context5).registerActivityLifecycleCallbacks(new a.C2766a());
        if (cVar.c().b() == a.EnumC2764a.WILD) {
            if (!w) {
                cVar.b().a(new com.ss.android.ugc.aweme.lego.component.b(0, "unexpected process init.process name ".concat(String.valueOf(b2))));
                com.ss.android.ugc.aweme.lego.d.b.f107492a = true;
            } else {
                throw new RuntimeException("unexpected process init, please contract with zhanghan.cloud");
            }
        }
        if (cVar.c().b() == a.EnumC2764a.PRISON) {
            cVar.b().a(new com.ss.android.ugc.aweme.lego.component.b(1, "prison process init.process name ".concat(String.valueOf(b2))));
        }
        y = Keva.getRepo("ab_repo_cold_boot").getInt("is_opt_lego_schedule", 2);
        z = Keva.getRepo("ab_repo_cold_boot").getInt("is_opt_lego_add", 0);
    }

    public static void a(w wVar) {
        l.d(wVar, "");
        if (wVar.i()) {
            f107537b.a(wVar);
        }
    }

    public static void a(ab abVar, h.f.a.a<? extends List<? extends n>> aVar) {
        l.d(abVar, "");
        l.d(aVar, "");
        List<Object> list = x.get(abVar);
        if (list != null) {
            list.add(aVar);
            return;
        }
        x.put(abVar, new ArrayList());
        List<Object> list2 = x.get(abVar);
        if (list2 != null) {
            list2.add(aVar);
        }
    }

    public final f a(Class<? extends q> cls, q qVar) {
        l.d(cls, "");
        l.d(qVar, "");
        com.ss.android.ugc.aweme.lego.e.a aVar = f107540e;
        String h2 = qVar.h();
        l.b(h2, "");
        aVar.a(h2, qVar);
        return this;
    }
}
