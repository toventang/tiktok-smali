package com.ss.android.ugc.aweme.specact.pendant.f;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.specact.pendant.h.k;
import h.f.b.l;
import h.m;
import h.z;
import java.util.Random;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.aweme.specact.pendant.e.g {

    /* renamed from: j  reason: collision with root package name */
    public static final h.h f134217j = h.i.a(m.SYNCHRONIZED, b.f134230a);

    /* renamed from: k  reason: collision with root package name */
    public static final C3487a f134218k = new C3487a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public UgAwemeActivitySetting f134219a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f134220b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f134221c;

    /* renamed from: d  reason: collision with root package name */
    public int f134222d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f134223e = false;

    /* renamed from: f  reason: collision with root package name */
    public Integer f134224f = 5;

    /* renamed from: g  reason: collision with root package name */
    public String f134225g = "coin2";

    /* renamed from: h  reason: collision with root package name */
    public Boolean f134226h = false;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.e.e f134227i;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f134228l = h.i.a((h.f.a.a) c.f134231a);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f134229m = h.i.a((h.f.a.a) new i(this));
    private final h.h n = h.i.a((h.f.a.a) j.f134235a);

    public final Keva d() {
        return (Keva) this.f134228l.getValue();
    }

    public final com.ss.android.ugc.aweme.specact.pendant.e.c e() {
        return (com.ss.android.ugc.aweme.specact.pendant.e.c) this.f134229m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.a$a  reason: collision with other inner class name */
    public static final class C3487a {
        static {
            Covode.recordClassIndex(87788);
        }

        public static a a() {
            return (a) a.f134217j.getValue();
        }

        private C3487a() {
        }

        public /* synthetic */ C3487a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134230a = new b();

        static {
            Covode.recordClassIndex(87789);
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

    static final class c extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f134231a = new c();

        static {
            Covode.recordClassIndex(87790);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("pendant_global_timer");
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.specact.b.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f134235a = new j();

        static {
            Covode.recordClassIndex(87797);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.specact.b.c invoke() {
            return new com.ss.android.ugc.aweme.specact.b.c();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134232a;

        static {
            Covode.recordClassIndex(87791);
        }

        d(a aVar) {
            this.f134232a = aVar;
        }

        public final void run() {
            UgActivityTasks h2 = this.f134232a.h();
            if (h2 != null) {
                this.f134232a.a(h2);
            }
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134234a;

        static {
            Covode.recordClassIndex(87793);
        }

        f(a aVar) {
            this.f134234a = aVar;
        }

        public final void run() {
            UgActivityTasks h2 = this.f134234a.h();
            if (h2 != null) {
                this.f134234a.a(h2);
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.specact.pendant.g.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.specact.pendant.g.a invoke() {
            com.ss.android.ugc.aweme.specact.pendant.g.a aVar = new com.ss.android.ugc.aweme.specact.pendant.g.a();
            aVar.f134264b = this.this$0;
            return aVar;
        }
    }

    public final UgActivityTasks h() {
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f134219a;
        if (ugAwemeActivitySetting == null) {
            l.b();
        }
        return com.ss.android.ugc.aweme.specact.pendant.h.a.f(ugAwemeActivitySetting);
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134233a;

        static {
            Covode.recordClassIndex(87792);
        }

        e(a aVar) {
            this.f134233a = aVar;
        }

        public final void run() {
            this.f134233a.a(true, false);
            this.f134233a.d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("task_finish"), false);
        }
    }

    static {
        Covode.recordClassIndex(87787);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final void b() {
        this.f134220b = false;
        d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("new_pendant_has_active_manual"), this.f134220b);
    }

    public final boolean f() {
        if (!com.ss.android.ugc.aweme.specact.pendant.h.m.a() || !this.f134221c || c() || !this.f134220b) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final boolean c() {
        if (!d().getBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("task_finish"), false) || !k.a(d().getLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("task_finish_save_timestamp"), 0))) {
            return false;
        }
        return true;
    }

    public final void g() {
        String str;
        d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("task_finish"), true);
        d().storeLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("task_finish_save_timestamp"), k.b());
        com.ss.android.ugc.aweme.specact.pendant.e.e eVar = this.f134227i;
        if (eVar != null) {
            eVar.a(false, com.ss.android.ugc.aweme.specact.pendant.h.a.p(this.f134219a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(this.f134219a));
        }
        this.f134220b = false;
        d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("new_pendant_has_active_manual"), false);
        e().b(false);
        boolean a2 = l.a((Object) this.f134226h, (Object) true);
        if (f()) {
            str = "ongoing";
        } else {
            str = "finished";
        }
        com.ss.android.ugc.aweme.specact.pendant.h.h.a("non_tracker", a2 ? 1 : 0, str, this.f134219a);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final void a() {
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f134219a;
        if (ugAwemeActivitySetting != null && !com.ss.android.ugc.aweme.specact.pendant.h.a.c(ugAwemeActivitySetting)) {
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f134219a;
            if (ugAwemeActivitySetting2 == null) {
                l.b();
            }
            if (com.ss.android.ugc.aweme.specact.pendant.h.a.a(ugAwemeActivitySetting2)) {
                if (c()) {
                    this.f134220b = false;
                    d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("new_pendant_has_active_manual"), false);
                    e().b(false);
                }
                if (l.a((Object) this.f134223e, (Object) false)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new d(this), ((long) new Random().nextInt(5)) * 1000);
                } else if (d().getBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("task_finish"), false)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(this), ((long) new Random().nextInt(5)) * 1000);
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new f(this), ((long) new Random().nextInt(5)) * 1000);
                }
            }
        }
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("is_last_round", false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optInt("display_amount");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int d(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optInt("display_cash_amount");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            String optString = new JSONObject(str).optString("cold_down");
            l.b(optString, "");
            return Integer.parseInt(optString);
        } catch (Exception unused) {
            return 0;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.specact.b.a, z> {
        final /* synthetic */ UgActivityTasks $task;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, UgActivityTasks ugActivityTasks) {
            super(1);
            this.this$0 = aVar;
            this.$task = ugActivityTasks;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.specact.b.a aVar) {
            com.ss.android.ugc.aweme.specact.b.a aVar2 = aVar;
            l.d(aVar2, "");
            int i2 = aVar2.f134053a;
            if (i2 == 10006 || i2 == 10009) {
                this.this$0.g();
            } else {
                this.this$0.e().b(this.$task);
                this.this$0.a(this.$task);
            }
            return z.f158842a;
        }
    }

    public final void a(UgActivityTasks ugActivityTasks) {
        f();
        if (f()) {
            com.ss.android.ugc.aweme.specact.pendant.e.e eVar = this.f134227i;
            if (eVar != null) {
                eVar.a(true, com.ss.android.ugc.aweme.specact.pendant.h.a.p(this.f134219a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(this.f134219a));
            }
            e().a(ugActivityTasks);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.specact.b.a, z> {
        final /* synthetic */ UgActivityTasks $task;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, UgActivityTasks ugActivityTasks) {
            super(1);
            this.this$0 = aVar;
            this.$task = ugActivityTasks;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.specact.b.a aVar) {
            UgActivityTasks ugActivityTasks;
            com.ss.android.ugc.aweme.specact.b.a aVar2 = aVar;
            l.d(aVar2, "");
            int a2 = a.a(aVar2.f134054b);
            if (a.b(aVar2.f134054b)) {
                this.this$0.g();
            } else {
                this.this$0.e().a();
                a aVar3 = this.this$0;
                if (a2 > 0) {
                    ugActivityTasks = this.$task.clone(Integer.valueOf(a2));
                } else {
                    ugActivityTasks = this.$task;
                }
                l.b(ugActivityTasks, "");
                aVar3.a(ugActivityTasks);
            }
            com.ss.android.ugc.aweme.specact.pendant.e.e eVar = this.this$0.f134227i;
            if (eVar != null) {
                eVar.e(aVar2.f134054b);
            }
            r.a("widget_time_tracker_1round", new com.ss.android.ugc.aweme.app.f.d().a("score_amount", a.c(aVar2.f134054b)).a("cash_amount", a.d(aVar2.f134054b)).f66730a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final void a(long j2, int i2) {
        com.ss.android.ugc.aweme.specact.pendant.e.e eVar = this.f134227i;
        if (eVar != null) {
            eVar.a((int) j2, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final void a(UgActivityTasks ugActivityTasks, boolean z) {
        l.d(ugActivityTasks, "");
        if (!z) {
            com.ss.android.ugc.aweme.specact.pendant.e.e eVar = this.f134227i;
            if (eVar != null) {
                eVar.q();
                return;
            }
            return;
        }
        String c2 = com.ss.android.ugc.aweme.specact.pendant.h.a.c(ugActivityTasks);
        if (!TextUtils.isEmpty(c2)) {
            com.ss.android.ugc.aweme.specact.pendant.e.e eVar2 = this.f134227i;
            if (eVar2 != null) {
                eVar2.r();
            }
            h hVar = new h(this, ugActivityTasks);
            g gVar = new g(this, ugActivityTasks);
            this.n.getValue();
            com.ss.android.ugc.aweme.specact.b.c.a(c2, this.f134222d, false, hVar, gVar);
        }
    }

    public final void a(boolean z, boolean z2) {
        String str;
        com.ss.android.ugc.aweme.specact.pendant.e.e eVar;
        com.ss.android.ugc.aweme.specact.pendant.e.e eVar2 = this.f134227i;
        if (eVar2 == null || eVar2.o()) {
            com.ss.android.ugc.aweme.specact.pendant.e.e eVar3 = this.f134227i;
            if (eVar3 != null && eVar3.p() && z2 && !z && (eVar = this.f134227i) != null) {
                eVar.s();
            }
            if (!this.f134220b && this.f134221c && z && !c()) {
                this.f134220b = true;
                d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("new_pendant_has_active_manual"), true);
                e().b(this.f134220b);
                com.ss.android.ugc.aweme.specact.pendant.e.e eVar4 = this.f134227i;
                if (eVar4 != null) {
                    eVar4.a(true, com.ss.android.ugc.aweme.specact.pendant.h.a.p(this.f134219a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(this.f134219a));
                }
                com.ss.android.ugc.aweme.specact.pendant.e.e eVar5 = this.f134227i;
                if (eVar5 != null) {
                    eVar5.d(this.f134225g);
                }
                boolean a2 = l.a((Object) this.f134226h, (Object) true);
                if (f()) {
                    str = "ongoing";
                } else {
                    str = "finished";
                }
                com.ss.android.ugc.aweme.specact.pendant.h.h.a("tracker", a2 ? 1 : 0, str, this.f134219a);
            }
        }
    }
}
