package com.ss.android.ugc.aweme.preload.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Preload;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import com.ss.android.ugc.aweme.preload.a.e;
import com.ss.android.ugc.aweme.preload.b.b;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.utils.fe;
import h.f.b.l;
import h.f.b.z;
import h.h;
import h.i;
import h.m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final h f115765g = i.a(m.SYNCHRONIZED, b.f115776a);

    /* renamed from: h  reason: collision with root package name */
    public static final C2958a f115766h = new C2958a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f115767a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Boolean> f115768b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public volatile Aweme f115769c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f115770d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f115771e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f115772f;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, com.ss.android.ugc.aweme.preload.a.e> f115773i = new ConcurrentHashMap();

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f115774j;

    /* renamed from: k  reason: collision with root package name */
    private long f115775k;

    /* renamed from: com.ss.android.ugc.aweme.preload.b.a$a  reason: collision with other inner class name */
    public static final class C2958a {
        static {
            Covode.recordClassIndex(74688);
        }

        public static a a() {
            return (a) a.f115765g.getValue();
        }

        private C2958a() {
        }

        public /* synthetic */ C2958a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f115776a = new b();

        static {
            Covode.recordClassIndex(74689);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f115777a;

        static {
            Covode.recordClassIndex(74690);
        }

        public c(a aVar) {
            this.f115777a = aVar;
        }

        public final void run() {
            this.f115777a.f115771e = SmartPreloadCommentV2Service.b.f110389a.ensureEvaluatorAvailable();
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f115778a;

        static {
            Covode.recordClassIndex(74691);
        }

        public d(a aVar) {
            this.f115778a = aVar;
        }

        public final void run() {
            this.f115778a.f115772f = SmartPreloadProfileV2Service.b.f110391a.ensureEvaluatorAvailable();
        }
    }

    public final void a() {
        if (true != this.f115767a) {
            d();
        }
        this.f115767a = true;
    }

    static {
        Covode.recordClassIndex(74687);
    }

    public static void c() {
        if (SmartPreloadCommentV2Experiment.a.c() || SmartPreloadProfileV2Experiment.a.c()) {
            CommentServiceImpl.e().a();
            ae.f115954a.f();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f115784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f115785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.a f115786c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f115787d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.a f115788e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f115789f;

        static {
            Covode.recordClassIndex(74693);
        }

        f(String str, a aVar, z.a aVar2, z.e eVar, z.a aVar3, String str2) {
            this.f115784a = str;
            this.f115785b = aVar;
            this.f115786c = aVar2;
            this.f115787d = eVar;
            this.f115788e = aVar3;
            this.f115789f = str2;
        }

        public final void run() {
            if (this.f115788e.element) {
                this.f115785b.f115768b.put(this.f115789f, true);
                this.f115785b.a((com.ss.android.ugc.aweme.preload.a.e) this.f115787d.element, this.f115784a);
            }
        }
    }

    private final void d() {
        if (!this.f115773i.isEmpty()) {
            for (Map.Entry<String, com.ss.android.ugc.aweme.preload.a.e> entry : this.f115773i.entrySet()) {
                a(entry.getValue().f115756b, entry.getKey(), true);
            }
            this.f115773i.clear();
        }
    }

    private final void e() {
        if (Math.abs(System.currentTimeMillis() - this.f115775k) > 5000) {
            this.f115775k = System.currentTimeMillis();
            this.f115774j = fe.c(com.bytedance.ies.ugc.appcontext.d.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f115779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f115780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f115781c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.a f115782d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f115783e;

        static {
            Covode.recordClassIndex(74692);
        }

        e(a aVar, z.a aVar2, z.e eVar, z.a aVar3, String str) {
            this.f115779a = aVar;
            this.f115780b = aVar2;
            this.f115781c = eVar;
            this.f115782d = aVar3;
            this.f115783e = str;
        }

        public final void run() {
            if (l.a((Object) "comment_preload_task", (Object) this.f115781c.element.f115755a)) {
                this.f115782d.element = b.a.a().a(this.f115779a.f115769c, this.f115779a.f115770d, false);
            } else if (l.a((Object) "profile_preload_task", (Object) this.f115781c.element.f115755a)) {
                this.f115782d.element = b.a.a().a(this.f115779a.f115769c, this.f115779a.f115770d, true);
            }
        }
    }

    public final void b() {
        String aid;
        String aid2;
        Aweme aweme = this.f115769c;
        if (!(aweme == null || (aid2 = aweme.getAid()) == null)) {
            CommentServiceImpl.e().a(aid2);
        }
        Aweme aweme2 = this.f115769c;
        if (aweme2 != null) {
            a(aweme2.getSecAuthorUid(), aweme2.getAuthorUid());
        }
        this.f115767a = false;
        this.f115770d = false;
        this.f115773i.clear();
        this.f115768b.clear();
        Aweme aweme3 = this.f115769c;
        if (!(aweme3 == null || (aid = aweme3.getAid()) == null)) {
            com.ss.android.ugc.aweme.preload.a.a.a(aid);
        }
        this.f115769c = null;
        b.a.a().f115793b = false;
        b.a.a().f115794c = false;
    }

    public final void a(int i2) {
        if (this.f115769c != null) {
            switch (i2) {
                case 1:
                    a(i2, "comment_preload_task", false);
                    a(i2, "profile_preload_task", false);
                    return;
                case 2:
                    a(i2, "comment_preload_task", false);
                    a(i2, "profile_preload_task", false);
                    return;
                case 3:
                    a(i2, "comment_preload_task", false);
                    a(i2, "profile_preload_task", false);
                    return;
                case 4:
                    a(i2, "profile_preload_task", false);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    a(i2, "comment_preload_task", false);
                    a(i2, "profile_preload_task", false);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    a(i2, "comment_preload_task", false);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    a(i2, "profile_preload_task", false);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    a(i2, "comment_preload_task", false);
                    a(i2, "profile_preload_task", false);
                    return;
                default:
                    return;
            }
        }
    }

    public static void a(String str, String str2) {
        ae.f115954a.a(str, str2);
    }

    public final void a(com.ss.android.ugc.aweme.preload.a.e eVar, String str) {
        String str2;
        e();
        if (this.f115774j && (str2 = eVar.f115755a) != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1607013413) {
                if (hashCode == -1216448303 && str2.equals("profile_preload_task")) {
                    ae.f115954a.a(this.f115769c, 300000, eVar.f115756b, "homepage_hot");
                }
            } else if (str2.equals("comment_preload_task")) {
                CommentServiceImpl.e().a(str, (Integer) 300000, eVar.f115756b, "homepage_hot", "homepage_hot");
            }
        }
    }

    private final void a(int i2, String str, boolean z) {
        Integer num;
        String aid;
        Preload preload;
        String str2;
        SmartPreloadProfileV2Experiment.PreloadProfileMLModel a2;
        boolean z2;
        SmartPreloadCommentV2Experiment.PreloadCommentMLModel a3;
        boolean z3;
        SmartPreloadProfileV2Experiment.PreloadProfileMLModel a4;
        try {
            if ((!this.f115768b.isEmpty()) && this.f115768b.containsKey(str)) {
                return;
            }
            if (l.a((Object) "comment_preload_task", (Object) str) && b.a.a().f115793b) {
                return;
            }
            if (!l.a((Object) "profile_preload_task", (Object) str) || !b.a.a().f115794c) {
                if (l.a((Object) "comment_preload_task", (Object) str)) {
                    SmartPreloadCommentV2Experiment.PreloadCommentMLModel a5 = SmartPreloadCommentV2Experiment.a.a();
                    if (a5 != null) {
                        num = Integer.valueOf(a5.groupId);
                    } else {
                        return;
                    }
                } else if (l.a((Object) "profile_preload_task", (Object) str) && (a4 = SmartPreloadProfileV2Experiment.a.a()) != null) {
                    num = Integer.valueOf(a4.groupId);
                } else {
                    return;
                }
                if (num != null && num.intValue() > 0) {
                    if (num.intValue() <= 6) {
                        if (i2 != 1 || num.intValue() == 1 || num.intValue() == 4) {
                            z.e eVar = new z.e();
                            eVar.element = (T) e.b.a(str, i2);
                            if (this.f115767a || z) {
                                z.a aVar = new z.a();
                                aVar.element = false;
                                z.a aVar2 = new z.a();
                                aVar2.element = false;
                                if (num.intValue() == 1) {
                                    if (i2 == 1) {
                                        aVar2.element = true;
                                    }
                                } else if (num.intValue() == 2) {
                                    if (i2 != 2) {
                                        if (i2 >= 4 && i2 <= 7) {
                                        }
                                    }
                                    aVar2.element = true;
                                } else if (num.intValue() == 3) {
                                    if (i2 >= 3 && i2 <= 7) {
                                        aVar2.element = true;
                                    }
                                } else if (num.intValue() == 4) {
                                    if (i2 == 1) {
                                        eVar.element = (T) e.b.a(str, 8);
                                        Aweme aweme = this.f115769c;
                                        if (!(aweme == null || (preload = aweme.getPreload()) == null || (str2 = preload.predictConfig) == null)) {
                                            com.google.gson.l a6 = q.a(str2);
                                            l.b(a6, "");
                                            o j2 = a6.j();
                                            if (l.a((Object) "comment_preload_task", (Object) eVar.element.f115755a) && (a3 = SmartPreloadCommentV2Experiment.a.a()) != null) {
                                                float f2 = a3.recommendThreshold;
                                                com.google.gson.l c2 = j2.c("click_comment");
                                                l.b(c2, "");
                                                if (c2.d() >= ((double) f2)) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                aVar2.element = z3;
                                            }
                                            if (l.a((Object) "profile_preload_task", (Object) eVar.element.f115755a) && (a2 = SmartPreloadProfileV2Experiment.a.a()) != null) {
                                                float f3 = a2.recommendThreshold;
                                                com.google.gson.l c3 = j2.c("head");
                                                l.b(c3, "");
                                                if (c3.d() >= ((double) f3)) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                aVar2.element = z2;
                                            }
                                        }
                                    }
                                } else if (!((num.intValue() != 5 && num.intValue() != 6) || i2 == 1 || i2 == 3)) {
                                    aVar.element = true;
                                }
                                Aweme aweme2 = this.f115769c;
                                if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                                    if (aVar.element) {
                                        com.ss.android.ugc.aweme.preload.a.a.a(aid, eVar.element, new e(this, aVar, eVar, aVar2, str), new f(aid, this, aVar, eVar, aVar2, str));
                                    } else if (aVar2.element) {
                                        this.f115768b.put(str, true);
                                        a((com.ss.android.ugc.aweme.preload.a.e) eVar.element, aid);
                                    }
                                }
                            } else if (!this.f115773i.containsKey(str)) {
                                this.f115773i.put(str, eVar.element);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
