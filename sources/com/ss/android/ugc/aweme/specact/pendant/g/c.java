package com.ss.android.ugc.aweme.specact.pendant.g;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.specact.pendant.e.g;
import com.ss.android.ugc.aweme.specact.pendant.h.k;
import com.ss.android.ugc.aweme.specact.pendant.h.m;
import h.f.b.l;

public final class c implements com.ss.android.ugc.aweme.specact.pendant.e.c, b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f134272b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g f134273a;

    /* renamed from: c  reason: collision with root package name */
    private long f134274c;

    /* renamed from: d  reason: collision with root package name */
    private UgActivityTasks f134275d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f134276e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f134277f;

    /* renamed from: g  reason: collision with root package name */
    private final Keva f134278g = Keva.getRepo("pendant_global_timer_reducer");

    static {
        Covode.recordClassIndex(87815);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void b(UgActivityTasks ugActivityTasks) {
        l.d(ugActivityTasks, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87816);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.g.b
    public final void b() {
        a();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final long e() {
        return this.f134274c;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f134279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UgActivityTasks f134280b;

        static {
            Covode.recordClassIndex(87817);
        }

        b(c cVar, UgActivityTasks ugActivityTasks) {
            this.f134279a = cVar;
            this.f134280b = ugActivityTasks;
        }

        public final void run() {
            g gVar = this.f134279a.f134273a;
            if (gVar != null) {
                UgActivityTasks ugActivityTasks = this.f134280b;
                l.b(ugActivityTasks, "");
                gVar.a((g) ugActivityTasks, (UgActivityTasks) true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.g.b
    public final void c() {
        g gVar;
        UgActivityTasks ugActivityTasks = this.f134275d;
        if (!(ugActivityTasks == null || (gVar = this.f134273a) == null)) {
            gVar.a(ugActivityTasks, false);
        }
        this.f134275d = null;
        this.f134274c = 0;
        a();
        g gVar2 = this.f134273a;
        if (gVar2 != null) {
            gVar2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final boolean d() {
        return k.a(this.f134278g.getLong(m.a("direct_show_pendant"), 0));
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void a() {
        long b2 = k.b();
        this.f134278g.storeLong(m.a("pendant_time_name"), this.f134274c);
        this.f134278g.storeLong(m.a("direct_show_pendant"), b2);
        e.a.f91018a.a(m.a("referral_video_task_time_left"), (Object) String.valueOf(this.f134274c));
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void a(UgActivityTasks ugActivityTasks) {
        l.d(ugActivityTasks, "");
        this.f134275d = ugActivityTasks;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void b(boolean z) {
        this.f134277f = z;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.g.b
    public final void a(Aweme aweme) {
        UgActivityTasks ugActivityTasks;
        l.d(aweme, "");
        g gVar = this.f134273a;
        if ((gVar == null || !gVar.c()) && this.f134277f && com.ss.android.ugc.aweme.specact.pendant.h.l.a(aweme) && (ugActivityTasks = this.f134275d) != null) {
            int b2 = com.ss.android.ugc.aweme.specact.pendant.h.a.b(ugActivityTasks);
            g gVar2 = this.f134273a;
            if (gVar2 != null) {
                gVar2.a(this.f134274c, b2);
            }
            long j2 = this.f134274c;
            if (j2 >= ((long) b2)) {
                UgActivityTasks ugActivityTasks2 = this.f134275d;
                if (ugActivityTasks2 == null) {
                    l.b();
                }
                UgActivityTasks clone = ugActivityTasks2.clone();
                this.f134275d = null;
                new Handler(Looper.getMainLooper()).postDelayed(new b(this, clone), 1000);
            } else {
                this.f134274c = j2 + 1;
            }
            e.a.f91018a.a(m.a("referral_video_task_time_left"), (Object) String.valueOf(this.f134274c));
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void a(boolean z) {
        if (this.f134276e != z) {
            this.f134276e = z;
            if (z) {
                this.f134274c = this.f134278g.getLong(m.a("pendant_time_name"), 0);
                if (!k.a(this.f134278g.getLong(m.a("direct_show_pendant"), 0))) {
                    this.f134274c = 0;
                    this.f134277f = false;
                    g gVar = this.f134273a;
                    if (gVar != null) {
                        gVar.b();
                    }
                    a();
                }
                com.ss.android.ugc.aweme.specact.pendant.f.c.a(this);
                return;
            }
            com.ss.android.ugc.aweme.specact.pendant.f.c.b(this);
            this.f134275d = null;
            this.f134274c = 0;
        }
    }
}
