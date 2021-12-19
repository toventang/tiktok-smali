package com.ss.android.ugc.aweme.specact.pendant.f;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.specact.pendant.h.k;
import h.a.z;
import h.f.b.l;
import h.i;
import h.m;
import java.util.List;
import java.util.Random;

public final class b implements com.ss.android.ugc.aweme.specact.pendant.e.g {

    /* renamed from: g  reason: collision with root package name */
    public static final h.h f134236g = i.a(m.SYNCHRONIZED, C3488b.f134247a);

    /* renamed from: h  reason: collision with root package name */
    public static final a f134237h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public UgAwemeActivitySetting f134238a;

    /* renamed from: b  reason: collision with root package name */
    public int f134239b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f134240c;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends UgActivityTasks> f134241d = z.INSTANCE;

    /* renamed from: e  reason: collision with root package name */
    public boolean f134242e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.e.e f134243f;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f134244i = i.a((h.f.a.a) c.f134248a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f134245j = i.a((h.f.a.a) h.f134250a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f134246k = i.a((h.f.a.a) new g(this));

    private final com.ss.android.ugc.aweme.specact.b.c j() {
        return (com.ss.android.ugc.aweme.specact.b.c) this.f134245j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final void a(long j2, int i2) {
    }

    public final Keva d() {
        return (Keva) this.f134244i.getValue();
    }

    public final com.ss.android.ugc.aweme.specact.pendant.e.c e() {
        return (com.ss.android.ugc.aweme.specact.pendant.e.c) this.f134246k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87799);
        }

        public static b a() {
            return (b) b.f134236g.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.f.b$b  reason: collision with other inner class name */
    static final class C3488b extends h.f.b.m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3488b f134247a = new C3488b();

        static {
            Covode.recordClassIndex(87800);
        }

        C3488b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f134248a = new c();

        static {
            Covode.recordClassIndex(87801);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("pendant_global_timer_reducer");
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.specact.b.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f134250a = new h();

        static {
            Covode.recordClassIndex(87806);
        }

        h() {
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
        final /* synthetic */ b f134249a;

        static {
            Covode.recordClassIndex(87802);
        }

        d(b bVar) {
            this.f134249a = bVar;
        }

        public final void run() {
            UgActivityTasks i2 = this.f134249a.i();
            if (i2 != null) {
                this.f134249a.a(i2);
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.specact.pendant.g.c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.specact.pendant.g.c invoke() {
            com.ss.android.ugc.aweme.specact.pendant.g.c cVar = new com.ss.android.ugc.aweme.specact.pendant.g.c();
            cVar.f134273a = this.this$0;
            return cVar;
        }
    }

    static {
        Covode.recordClassIndex(87798);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final boolean c() {
        if (g() == this.f134241d.size() - 1) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (!com.ss.android.ugc.aweme.specact.pendant.h.m.a() || !this.f134240c || c() || !this.f134242e) {
            return false;
        }
        return true;
    }

    public final UgActivityTasks i() {
        if (this.f134239b < this.f134241d.size()) {
            return (UgActivityTasks) this.f134241d.get(this.f134239b);
        }
        return null;
    }

    public final int g() {
        if (k.b() != d().getLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("direct_show_pendant"), 0)) {
            d().storeInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("finished_task_stage"), -1);
        }
        return d().getInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("finished_task_stage"), -1);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final void b() {
        if (!e().d()) {
            this.f134242e = false;
            d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("pendant_has_active"), this.f134242e);
            d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("stage_task_finish"), false);
            d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("has_report_read_and_like_task"), false);
            d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_action"), false);
            e.a.f91018a.a(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_action"), (Object) "false");
        }
    }

    public final void h() {
        e().a();
        d().storeInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("finished_task_stage"), this.f134239b);
        int i2 = this.f134239b + 1;
        this.f134239b = i2;
        if (i2 < this.f134241d.size()) {
            UgActivityTasks i3 = i();
            if (i3 != null) {
                a(i3);
                return;
            }
            return;
        }
        this.f134242e = false;
        d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("pendant_has_active"), false);
        e().b(false);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final void a() {
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f134238a;
        if (ugAwemeActivitySetting != null && !com.ss.android.ugc.aweme.specact.pendant.h.a.c(ugAwemeActivitySetting)) {
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f134238a;
            if (ugAwemeActivitySetting2 == null) {
                l.b();
            }
            if (com.ss.android.ugc.aweme.specact.pendant.h.a.a(ugAwemeActivitySetting2)) {
                if (c()) {
                    this.f134242e = false;
                    d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("pendant_has_active"), false);
                    e().b(false);
                }
                if (a(this.f134241d) != null) {
                    d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("has_report_read_and_like_task"), false);
                    d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_action"), false);
                    e.a.f91018a.a(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_action"), (Object) "false");
                }
                this.f134239b = 0;
                d().storeInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("finished_task_stage"), -1);
                new Handler(Looper.getMainLooper()).postDelayed(new d(this), ((long) new Random().nextInt(5)) * 1000);
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.specact.b.a, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.specact.b.a aVar) {
            l.d(aVar, "");
            this.this$0.h();
            return h.z.f158842a;
        }
    }

    public final void a(UgActivityTasks ugActivityTasks) {
        f();
        if (f()) {
            e().a(ugActivityTasks);
        }
    }

    public static UgActivityTasks a(List<? extends UgActivityTasks> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        for (UgActivityTasks ugActivityTasks : list) {
            if (l.a((Object) ugActivityTasks.getTaskId(), (Object) "read_and_like_video")) {
                return ugActivityTasks;
            }
        }
        return null;
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.specact.b.a, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.specact.b.a aVar) {
            com.ss.android.ugc.aweme.specact.b.a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f134053a != 10009) {
                this.this$0.h();
            } else {
                this.this$0.e().a();
                if (this.this$0.f134239b == this.this$0.f134241d.size() - 1) {
                    this.this$0.f134242e = false;
                    this.this$0.d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("pendant_has_active"), false);
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.g
    public final void a(UgActivityTasks ugActivityTasks, boolean z) {
        l.d(ugActivityTasks, "");
        if (z) {
            String c2 = com.ss.android.ugc.aweme.specact.pendant.h.a.c(ugActivityTasks);
            int b2 = com.ss.android.ugc.aweme.specact.pendant.h.a.b(ugActivityTasks);
            if (!TextUtils.isEmpty(c2)) {
                f fVar = new f(this);
                e eVar = new e(this);
                if (!l.a((Object) c2, (Object) "read_and_like_video")) {
                    j();
                    com.ss.android.ugc.aweme.specact.b.c.a(c2, b2, true, fVar, eVar);
                } else if (d().getBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_action"), false)) {
                    j();
                    com.ss.android.ugc.aweme.specact.b.c.a(c2, b2, true, fVar, eVar);
                    d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("has_report_read_and_like_task"), true);
                    r.a("interact_task_complete", new com.ss.android.ugc.aweme.app.f.d().a("task_name", "complete").f66730a);
                } else {
                    r.a("interact_task_complete", new com.ss.android.ugc.aweme.app.f.d().a("task_name", "watch_video").f66730a);
                }
            }
        }
    }
}
