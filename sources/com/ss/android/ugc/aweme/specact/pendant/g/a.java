package com.ss.android.ugc.aweme.specact.pendant.g;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.specact.pendant.e.c;
import com.ss.android.ugc.aweme.specact.pendant.e.g;
import com.ss.android.ugc.aweme.specact.pendant.h.k;
import com.ss.android.ugc.aweme.specact.pendant.h.m;
import h.f.b.l;

public final class a implements c, b {

    /* renamed from: c  reason: collision with root package name */
    public static final C3490a f134262c = new C3490a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f134263a;

    /* renamed from: b  reason: collision with root package name */
    public g f134264b;

    /* renamed from: d  reason: collision with root package name */
    private long f134265d;

    /* renamed from: e  reason: collision with root package name */
    private UgActivityTasks f134266e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f134267f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f134268g;

    /* renamed from: h  reason: collision with root package name */
    private final Keva f134269h = Keva.getRepo("pendant_global_timer");

    static {
        Covode.recordClassIndex(87811);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.g.a$a  reason: collision with other inner class name */
    public static final class C3490a {
        static {
            Covode.recordClassIndex(87812);
        }

        private C3490a() {
        }

        public /* synthetic */ C3490a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.g.b
    public final void b() {
        a();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final long e() {
        return this.f134265d;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UgActivityTasks f134271b;

        static {
            Covode.recordClassIndex(87813);
        }

        b(a aVar, UgActivityTasks ugActivityTasks) {
            this.f134270a = aVar;
            this.f134271b = ugActivityTasks;
        }

        public final void run() {
            this.f134270a.f134263a = 0;
            g gVar = this.f134270a.f134264b;
            if (gVar != null) {
                UgActivityTasks ugActivityTasks = this.f134271b;
                l.b(ugActivityTasks, "");
                gVar.a((g) ugActivityTasks, (UgActivityTasks) true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.g.b
    public final void c() {
        g gVar;
        UgActivityTasks ugActivityTasks = this.f134266e;
        if (!(ugActivityTasks == null || (gVar = this.f134264b) == null)) {
            gVar.a(ugActivityTasks, false);
        }
        this.f134266e = null;
        this.f134263a = 0;
        this.f134265d = 0;
        a();
        g gVar2 = this.f134264b;
        if (gVar2 != null) {
            gVar2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final boolean d() {
        return k.a(this.f134269h.getLong(m.a("last_active_date"), 0));
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void a() {
        long b2 = k.b();
        this.f134269h.storeLong(m.a("pendant_current_time_name"), this.f134263a);
        this.f134269h.storeLong(m.a("pendant_total_time_name"), this.f134265d);
        this.f134269h.storeLong(m.a("last_active_date"), b2);
        e.a.f91018a.a(m.a("referral_video_task_time_left"), (Object) String.valueOf(this.f134265d));
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void a(UgActivityTasks ugActivityTasks) {
        l.d(ugActivityTasks, "");
        this.f134266e = ugActivityTasks;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void b(boolean z) {
        this.f134268g = z;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void b(UgActivityTasks ugActivityTasks) {
        l.d(ugActivityTasks, "");
        this.f134263a = 0;
        long j2 = this.f134265d;
        Integer time = ugActivityTasks.getTime();
        l.b(time, "");
        this.f134265d = j2 - ((long) time.intValue());
        a();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.c
    public final void a(boolean z) {
        if (this.f134267f != z) {
            this.f134267f = z;
            if (z) {
                this.f134263a = this.f134269h.getLong(m.a("pendant_current_time_name"), 0);
                this.f134265d = this.f134269h.getLong(m.a("pendant_total_time_name"), 0);
                if (!k.a(this.f134269h.getLong(m.a("last_active_date"), 0))) {
                    this.f134263a = 0;
                    this.f134265d = 0;
                    this.f134268g = false;
                    g gVar = this.f134264b;
                    if (gVar != null) {
                        gVar.b();
                    }
                    a();
                }
                com.ss.android.ugc.aweme.specact.pendant.f.c.a(this);
                return;
            }
            com.ss.android.ugc.aweme.specact.pendant.f.c.b(this);
            this.f134266e = null;
            this.f134263a = 0;
            this.f134265d = 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.g.b
    public final void a(Aweme aweme) {
        l.d(aweme, "");
        g gVar = this.f134264b;
        if ((gVar == null || !gVar.c()) && this.f134268g && com.ss.android.ugc.aweme.specact.pendant.h.l.a(aweme) && this.f134266e != null && this.f134269h.getBoolean(m.a("show_pendant"), true)) {
            UgActivityTasks ugActivityTasks = this.f134266e;
            if (ugActivityTasks == null) {
                l.b();
            }
            int b2 = com.ss.android.ugc.aweme.specact.pendant.h.a.b(ugActivityTasks);
            long j2 = this.f134263a + 1;
            this.f134263a = j2;
            this.f134265d++;
            g gVar2 = this.f134264b;
            if (gVar2 != null) {
                gVar2.a(j2, b2);
            }
            if (this.f134263a >= ((long) b2)) {
                UgActivityTasks ugActivityTasks2 = this.f134266e;
                if (ugActivityTasks2 == null) {
                    l.b();
                }
                UgActivityTasks clone = ugActivityTasks2.clone();
                this.f134266e = null;
                new Handler(Looper.getMainLooper()).postDelayed(new b(this, clone), 1000);
            }
            e.a.f91018a.a(m.a("referral_video_task_time_left"), (Object) String.valueOf(this.f134265d));
        }
    }
}
