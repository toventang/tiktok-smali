package com.ss.android.ugc.aweme.discover.adapter;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class g extends com.ss.android.ugc.aweme.common.a.a {

    /* renamed from: e  reason: collision with root package name */
    public static final h f80548e = i.a((h.f.a.a) b.f80558a);

    /* renamed from: f  reason: collision with root package name */
    public static final h f80549f = i.a((h.f.a.a) c.f80559a);

    /* renamed from: g  reason: collision with root package name */
    public static final a f80550g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f80551a;

    /* renamed from: b  reason: collision with root package name */
    public int f80552b;

    /* renamed from: c  reason: collision with root package name */
    public int f80553c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.tooltip.b f80554d;

    /* renamed from: h  reason: collision with root package name */
    private final View f80555h;

    /* renamed from: i  reason: collision with root package name */
    private final View f80556i;

    public static final class a {
        static {
            Covode.recordClassIndex(50112);
        }

        public static boolean a() {
            return ((Boolean) g.f80548e.getValue()).booleanValue();
        }

        public static boolean b() {
            return ((Boolean) g.f80549f.getValue()).booleanValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.a
    public final int[] b() {
        return em.a(200);
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f80558a = new b();

        static {
            Covode.recordClassIndex(50113);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.performance.i.a());
        }
    }

    private static boolean g() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f80559a = new c();

        static {
            Covode.recordClassIndex(50114);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(com.ss.android.ugc.aweme.base.h.a.a("aweme_app", "use_dynamic_cover", z));
        }
    }

    static {
        Covode.recordClassIndex(50110);
    }

    private static boolean h() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean g2 = g();
        j.f107226e = g2;
        return g2;
    }

    private static boolean i() {
        boolean z;
        if (!com.ss.android.ugc.aweme.base.h.a.a("aweme_app", "use_dynamic_cover")) {
            return a.b();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return com.ss.android.ugc.aweme.base.h.a.b("aweme_app", "use_dynamic_cover", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (com.ss.android.ugc.aweme.framework.c.a.a(r0.getContext()) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean f() {
        /*
            r3 = this;
            boolean r0 = com.ss.android.ugc.aweme.discover.adapter.g.a.a()
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            android.view.View r0 = r3.itemView
            java.lang.String r1 = ""
            h.f.b.l.b(r0, r1)
            r0.getContext()
            boolean r0 = h()
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = r3.itemView
            h.f.b.l.b(r0, r1)
            android.content.Context r0 = r0.getContext()
            boolean r0 = com.ss.android.ugc.aweme.framework.c.a.a(r0)
            if (r0 == 0) goto L_0x002f
        L_0x0027:
            boolean r0 = i()
            if (r0 == 0) goto L_0x002f
            r0 = 1
            return r0
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.g.f():boolean");
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void c() {
        if (this.f76353m != null) {
            Object obj = this.f76353m;
            l.b(obj, "");
            Video video = ((Aweme) obj).getVideo();
            if (video == null) {
                return;
            }
            if (com.ss.android.ugc.aweme.discover.f.g.a()) {
                if (a(video, "CoverViewHolder", Bitmap.Config.ARGB_8888)) {
                    this.o = true;
                } else {
                    a(video.getCover(), "CoverViewHolder", Bitmap.Config.ARGB_8888);
                }
            } else if (a(video, "CoverViewHolder")) {
                this.o = true;
            } else {
                a(video.getCover(), "CoverViewHolder");
            }
        }
    }

    public final void a(Aweme aweme, int i2) {
        if (aweme != null) {
            super.a((Object) aweme, i2);
            this.f76353m = aweme;
            com.ss.android.ugc.aweme.common.a.a.a(this.f80555h, this.f80553c, this.f80552b);
            c();
            if (y.f(aweme)) {
                this.f80556i.setVisibility(0);
            } else {
                this.f80556i.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.a
    public final boolean a(Video video, String str, Bitmap.Config config) {
        if (!com.ss.android.ugc.aweme.discover.f.f.a().f80992a) {
            return super.a(video, str, config);
        }
        if (!f()) {
            return false;
        }
        SmartImageView smartImageView = this.n;
        l.b(smartImageView, "");
        if (video == null) {
            l.b();
        }
        if (str == null) {
            l.b();
        }
        if (com.ss.android.ugc.aweme.ay.c.a(smartImageView, video, str, true, this.f76347k, (String) null, true, config, true)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(com.ss.android.ugc.aweme.discover.tooltip.b bVar, View view, d dVar) {
        super(view);
        l.d(bVar, "");
        l.d(view, "");
        this.f80551a = dVar;
        this.f80554d = bVar;
        this.f80552b = com.ss.android.ugc.aweme.framework.d.b.a(view.getContext(), 133.0f);
        this.f80553c = com.ss.android.ugc.aweme.framework.d.b.a(view.getContext(), 100.0f);
        View findViewById = view.findViewById(R.id.dqn);
        l.b(findViewById, "");
        this.f80555h = findViewById;
        this.n = (SmartImageView) view.findViewById(R.id.jd);
        this.n.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f80557a;

            static {
                Covode.recordClassIndex(50111);
            }

            {
                this.f80557a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                d dVar = this.f80557a.f80551a;
                if (dVar != null) {
                    dVar.a(view, (Aweme) this.f80557a.f76353m, null);
                }
                this.f80557a.f80554d.l();
            }
        });
        if (com.bytedance.ies.abmock.b.a().a(true, "stop_main_anim_when_invisible", false)) {
            this.n.setAnimationListener(this.f76348l);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            SmartImageView smartImageView = this.n;
            l.b(smartImageView, "");
            SmartImageView smartImageView2 = this.n;
            l.b(smartImageView2, "");
            smartImageView.setForeground(smartImageView2.getContext().getDrawable(R.drawable.a5d));
        } else {
            com.ss.android.ugc.aweme.notification.g.a.a(this.n);
        }
        View findViewById2 = view.findViewById(R.id.fft);
        l.b(findViewById2, "");
        this.f80556i = findViewById2;
        findViewById2.setVisibility(8);
    }
}
