package com.ss.android.ugc.aweme.livewallpaper;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.livewallpaper.a;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.video.e;
import com.ss.ttvideoengine.aj;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    aj f108791a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f108792b = true;

    /* renamed from: c  reason: collision with root package name */
    private final Context f108793c;

    /* renamed from: d  reason: collision with root package name */
    private final a.AbstractC2787a f108794d;

    /* renamed from: e  reason: collision with root package name */
    private SurfaceHolder f108795e;

    /* renamed from: f  reason: collision with root package name */
    private LiveWallPaperBean f108796f;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(69692);
        }

        void a();

        void a(com.ss.ttvideoengine.s.c cVar);
    }

    static {
        Covode.recordClassIndex(69690);
    }

    public final void c() {
        aj ajVar = this.f108791a;
        if (ajVar != null) {
            ajVar.l();
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a() {
        aj ajVar = this.f108791a;
        if (ajVar != null) {
            ajVar.n();
            this.f108791a = null;
        }
        this.f108795e = null;
    }

    private void d() {
        aj ajVar;
        LiveWallPaperBean liveWallPaperBean = this.f108796f;
        if (liveWallPaperBean != null && !liveWallPaperBean.isForceToPause() && (ajVar = this.f108791a) != null) {
            ajVar.k();
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void b() {
        LiveWallPaperBean liveWallPaperBean = this.f108796f;
        if (liveWallPaperBean != null) {
            liveWallPaperBean.setForceToPause(!liveWallPaperBean.isForceToPause());
            if (this.f108796f.isForceToPause()) {
                c();
            } else {
                d();
            }
            r.a("double_tap_wallpaper", new d().a("action", !this.f108796f.isForceToPause()).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(LiveWallPaperBean liveWallPaperBean) {
        this.f108796f = liveWallPaperBean;
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(float f2) {
        LiveWallPaperBean liveWallPaperBean;
        if (this.f108791a != null && (liveWallPaperBean = this.f108796f) != null && !liveWallPaperBean.isShouldMute()) {
            this.f108796f.setVolume(f2);
            this.f108791a.a(f2, f2);
        }
    }

    private void a(SurfaceHolder surfaceHolder) {
        float volume;
        if (this.f108791a == null) {
            aj ajVar = new aj(this.f108793c, 0);
            this.f108791a = ajVar;
            ajVar.f(4, 2);
            this.f108791a.f(7, 1);
            this.f108791a.f(415, 1);
            this.f108791a.h(true);
            this.f108791a.a(surfaceHolder);
            if (this.f108796f.isShouldMute()) {
                volume = 0.0f;
            } else {
                volume = this.f108796f.getVolume();
            }
            this.f108791a.a(volume, volume);
            this.f108791a.a(new d(new a() {
                /* class com.ss.android.ugc.aweme.livewallpaper.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69691);
                }

                @Override // com.ss.android.ugc.aweme.livewallpaper.c.a
                public final void a() {
                    c.this.a(true, "");
                    if (!c.this.f108792b) {
                        c.this.c();
                    }
                }

                @Override // com.ss.android.ugc.aweme.livewallpaper.c.a
                public final void a(com.ss.ttvideoengine.s.c cVar) {
                    c.this.a(false, "media play error what = " + cVar.f153260a + " extra = " + cVar.f153263d);
                }
            }));
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(boolean z) {
        this.f108792b = z;
        if (z) {
            d();
        } else {
            c();
        }
    }

    public c(Context context, a.AbstractC2787a aVar) {
        this.f108793c = context;
        this.f108794d = aVar;
    }

    public final void a(boolean z, String str) {
        a.AbstractC2787a aVar = this.f108794d;
        if (aVar != null) {
            aVar.a(z, this.f108796f.getSource(), str);
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(SurfaceHolder surfaceHolder, int i2, int i3) {
        this.f108795e = surfaceHolder;
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(String str, int i2, int i3) {
        if (!e.b(str)) {
            a(false, "onRefresh video is not exists");
            return;
        }
        SurfaceHolder surfaceHolder = this.f108795e;
        if (surfaceHolder != null) {
            a(surfaceHolder);
            try {
                this.f108791a.f(str);
                d();
                com.a.a("onSurfaceCreated: start video, path=%s", new Object[]{str});
            } catch (Exception e2) {
                e2.printStackTrace();
                a(false, "media play exception " + e2.getMessage());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(SurfaceHolder surfaceHolder, String str, int i2, int i3) {
        this.f108795e = surfaceHolder;
        if (surfaceHolder != null) {
            a(surfaceHolder);
            try {
                this.f108791a.f(str);
                d();
            } catch (Exception e2) {
                e2.printStackTrace();
                a(false, "onSurfaceCreated media play exception " + e2.getMessage());
            }
        }
    }
}
