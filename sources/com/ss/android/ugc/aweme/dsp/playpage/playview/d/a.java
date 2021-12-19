package com.ss.android.ugc.aweme.dsp.playpage.playview.d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.ss.android.ugc.aweme.dsp.playerservice.c.g;
import com.ss.android.ugc.aweme.dsp.playpage.base.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.dsp.playpage.playview.a.a implements j {

    /* renamed from: f  reason: collision with root package name */
    public static final C1999a f83885f = new C1999a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public RemoteImageView f83886c;

    /* renamed from: d  reason: collision with root package name */
    public View f83887d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f83888e;

    /* renamed from: g  reason: collision with root package name */
    private final Context f83889g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.helper.c f83890h = new com.ss.android.ugc.aweme.feed.helper.c();

    /* renamed from: i  reason: collision with root package name */
    private boolean f83891i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.widget.a.c f83892j;

    /* renamed from: k  reason: collision with root package name */
    private Surface f83893k;

    /* renamed from: l  reason: collision with root package name */
    private final ViewStub f83894l;

    static {
        Covode.recordClassIndex(52304);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.playview.d.a$a  reason: collision with other inner class name */
    public static final class C1999a {
        static {
            Covode.recordClassIndex(52305);
        }

        private C1999a() {
        }

        public /* synthetic */ C1999a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
        m();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
        p();
    }

    public final void n() {
        this.f83891i = true;
        p();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.a
    public final void g() {
        super.g();
        if (r()) {
            l().a().b(this);
            Surface surface = this.f83893k;
            if (surface != null) {
                surface.release();
            }
        }
    }

    private final void p() {
        String str;
        if (this.f83891i || !j()) {
            q();
        } else if (r()) {
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83755a;
            if (cVar != null) {
                str = cVar.a();
            } else {
                str = null;
            }
            new b(str).run();
        } else {
            q();
        }
    }

    private final void q() {
        String str;
        RemoteImageView remoteImageView = this.f83886c;
        if (remoteImageView != null && remoteImageView.getVisibility() != 0) {
            remoteImageView.setVisibility(0);
            StringBuilder sb = new StringBuilder("runnable VISIBLE ");
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83755a;
            String str2 = null;
            if (cVar != null) {
                str = cVar.a();
            } else {
                str = null;
            }
            StringBuilder append = sb.append(str).append(' ');
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = this.f83755a;
            if (cVar2 != null) {
                str2 = cVar2.i();
            }
            String.valueOf(append.append(str2).toString());
        }
    }

    private final boolean r() {
        f e2 = l().a().f83565a.e();
        if (!b.a.a(l()) || !i()) {
            return false;
        }
        if (e2.isPlayingState() || e2.isPauseState()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.a
    public final ViewGroup e() {
        MethodCollector.i(893);
        View inflate = this.f83894l.inflate();
        inflate.setBackgroundColor(inflate.getResources().getColor(R.color.ae));
        this.f83886c = (RemoteImageView) inflate.findViewById(R.id.agk);
        this.f83887d = inflate.findViewById(R.id.bzv);
        ViewGroup viewGroup = (ViewGroup) inflate;
        MethodCollector.o(893);
        return viewGroup;
    }

    public final void m() {
        int i2 = l().a().f83565a.i();
        int j2 = l().a().f83565a.j();
        com.ss.android.ugc.aweme.dsp.widget.a.c cVar = this.f83892j;
        if (cVar != null) {
            cVar.a(i2, j2);
        }
    }

    public final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final String f83895a;

        static {
            Covode.recordClassIndex(52306);
        }

        public final void run() {
            String str;
            RemoteImageView remoteImageView;
            String str2 = this.f83895a;
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = a.this.f83755a;
            String str3 = null;
            if (cVar != null) {
                str = cVar.a();
            } else {
                str = null;
            }
            if (!(!l.a((Object) str2, (Object) str)) && (remoteImageView = a.this.f83886c) != null && remoteImageView.getVisibility() != 8) {
                remoteImageView.setVisibility(8);
                StringBuilder append = new StringBuilder("runnable GONE ").append(this.f83895a).append(' ');
                com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = a.this.f83755a;
                if (cVar2 != null) {
                    str3 = cVar2.i();
                }
                String.valueOf(append.append(str3).toString());
            }
        }

        public b(String str) {
            this.f83895a = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.a
    public final void f() {
        MethodCollector.i(918);
        super.f();
        if (j()) {
            l().a().a(this);
            if (this.f83892j == null) {
                ViewGroup k2 = k();
                Context context = k2.getContext();
                l.b(context, "");
                com.ss.android.ugc.aweme.dsp.widget.a.c cVar = new com.ss.android.ugc.aweme.dsp.widget.a.c(context);
                cVar.setDisplayMode(4);
                cVar.setSurfaceTextureListener(new c(this));
                this.f83892j = cVar;
                k2.addView(this.f83892j, 0, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        MethodCollector.o(918);
    }

    public final void o() {
        f e2 = l().a().f83565a.e();
        if (!b.a.a(l()) || !i() || !e2.isPlayingState()) {
            l().a().g(new com.ss.android.ugc.aweme.dsp.playerservice.b.f("RESUME_FROM_USER_RESUME"));
        } else {
            l().a().f(new com.ss.android.ugc.aweme.dsp.playerservice.b.f("PAUSE_FROM_USER_PAUSE"));
        }
    }

    public static final class c implements TextureView.SurfaceTextureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83897a;

        static {
            Covode.recordClassIndex(52307);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            l.d(surfaceTexture, "");
        }

        c(a aVar) {
            this.f83897a = aVar;
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            l.d(surfaceTexture, "");
            String.valueOf("onSurfaceTextureDestroyed : " + surfaceTexture + ", " + this.f83897a.hashCode());
            this.f83897a.n();
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            l.d(surfaceTexture, "");
            String.valueOf("onSurfaceTextureSizeChanged, width:" + i2 + ", height:" + i3 + ", " + this.f83897a.hashCode());
            this.f83897a.a(surfaceTexture);
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            l.d(surfaceTexture, "");
            String.valueOf("onSurfaceTextureAvailable : " + surfaceTexture + ", width:" + i2 + ", height:" + i3 + ", " + this.f83897a.hashCode());
            this.f83897a.a(surfaceTexture);
            this.f83897a.m();
        }
    }

    private final void e(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        String str;
        RemoteImageView remoteImageView = this.f83886c;
        if (remoteImageView != null) {
            if (cVar != null) {
                str = cVar.h();
            } else {
                str = null;
            }
            remoteImageView.setImageURI(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.a
    public final void c(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        f(cVar);
        e(cVar);
        p();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.playview.a.a
    public final void d(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        f(cVar);
        e(cVar);
        p();
    }

    public a(ViewStub viewStub) {
        l.d(viewStub, "");
        this.f83894l = viewStub;
        this.f83889g = viewStub.getContext();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface;
        if (surfaceTexture == null) {
            surface = null;
        } else {
            surface = new Surface(surfaceTexture);
        }
        Surface surface2 = this.f83893k;
        if (surface2 != null) {
            surface2.release();
        }
        this.f83893k = surface;
        l().a().a(surface);
        this.f83891i = false;
        p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r7 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f(com.ss.android.ugc.aweme.dsp.playerservice.b.c r7) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.playview.d.a.f(com.ss.android.ugc.aweme.dsp.playerservice.b.c):void");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        l.d(aVar, "");
        Context context = this.f83889g;
        l.b(context, "");
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    if (l.a(aVar, com.ss.android.ugc.aweme.dsp.playerservice.c.a.f83402c)) {
                        new com.bytedance.tux.g.b(activity).e(R.string.dbo).b();
                        return;
                    } else {
                        new com.bytedance.tux.g.b(activity).e(R.string.dc6).b();
                        return;
                    }
                } else {
                    return;
                }
            } else if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(f fVar) {
        int i2;
        l.d(fVar, "");
        p();
        if (fVar.isPauseState() || fVar == f.PLAYBACK_STATE_STOPPED) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.f83888e = Integer.valueOf(i2);
        View view = this.f83887d;
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
        com.ss.android.ugc.aweme.dsp.widget.a.c cVar = this.f83892j;
        if (cVar != null) {
            String.valueOf("onVideoSizeChanged, width:" + i2 + ", height:" + i3);
            cVar.f84055a.a(i2, i3);
        }
    }

    private final boolean b(int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            int a2 = com.ss.android.ugc.aweme.feed.helper.c.a();
            int b2 = com.ss.android.ugc.aweme.feed.helper.c.b();
            if (a2 > 0 && b2 > 0) {
                float f2 = ((float) i2) / ((float) i3);
                float f3 = ((float) a2) / ((float) b2);
                String.valueOf("videoScale: " + f2 + ", screenScale: " + f3);
                if (com.ss.android.ugc.aweme.feed.helper.c.b(this.f83889g) != 1) {
                    if (((double) f2) > 0.5625d || ((double) f3) > 0.5625d || f2 < 0.47f) {
                        return true;
                    }
                    return false;
                } else if (((double) f2) > 0.625d || ((double) f3) > 0.625d || f2 < 0.47f) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
