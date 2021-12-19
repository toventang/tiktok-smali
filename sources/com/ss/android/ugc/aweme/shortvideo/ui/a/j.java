package com.ss.android.ugc.aweme.shortvideo.ui.a;

import android.app.Activity;
import com.bytedance.als.g;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public final class j extends com.bytedance.als.j<i> implements com.bytedance.o.a, i {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f131326a = {new y(j.class, "activity", "getActivity()Landroid/app/Activity;", 0), new y(j.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final i f131327b = this;

    /* renamed from: c  reason: collision with root package name */
    public final ShortVideoContext f131328c = ((ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    public final k<Boolean> f131329d = new k<>();

    /* renamed from: e  reason: collision with root package name */
    private final d f131330e = com.bytedance.o.b.a.a(getDiContainer(), Activity.class);

    /* renamed from: f  reason: collision with root package name */
    private final d f131331f = com.bytedance.o.b.a.a(getDiContainer(), z.class);

    /* renamed from: g  reason: collision with root package name */
    private final m f131332g = ((m) getDiContainer().a(m.class, (String) null));

    /* renamed from: h  reason: collision with root package name */
    private final f f131333h;

    static {
        Covode.recordClassIndex(86037);
    }

    public final Activity b() {
        return (Activity) this.f131330e.a(this, f131326a[0]);
    }

    public final z c() {
        return (z) this.f131331f.a(this, f131326a[1]);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.a.i
    public final /* bridge */ /* synthetic */ g a() {
        return this.f131329d;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ i getApiComponent() {
        return this.f131327b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f131333h;
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f131332g.s().a(this, new a(this));
        c().v().a(this, new b(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.a.i
    public final void a(boolean z) {
        this.f131329d.a(Boolean.valueOf(z));
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f131334a;

        static {
            Covode.recordClassIndex(86038);
        }

        a(j jVar) {
            this.f131334a = jVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f131334a.f131328c.f124757b.d().isEmpty() && this.f131334a.f131328c.c()) {
                this.f131334a.c().a(new com.ss.android.ugc.aweme.tools.j(3));
            }
        }
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f131335a;

        static {
            Covode.recordClassIndex(86039);
        }

        b(j jVar) {
            this.f131335a = jVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.tools.j jVar = (com.ss.android.ugc.aweme.tools.j) obj;
            if (this.f131335a.f131328c.c()) {
                l.b(jVar, "");
                int i2 = jVar.f140202a;
                if (i2 == 1) {
                    this.f131335a.f131328c.c(false);
                    StitchParams stitchParams = this.f131335a.f131328c.F.f124773a;
                    if (stitchParams != null) {
                        stitchParams.setMuted(false);
                    }
                    j.a.b(this.f131335a.b(), (int) R.string.f8_, 1).a();
                } else if (i2 == 2) {
                    this.f131335a.f131328c.c(true);
                    StitchParams stitchParams2 = this.f131335a.f131328c.F.f124773a;
                    if (stitchParams2 != null) {
                        stitchParams2.setMuted(true);
                    }
                    j.a.b(this.f131335a.b(), (int) R.string.b0h, 1).a();
                }
            }
        }
    }

    public j(f fVar) {
        l.d(fVar, "");
        this.f131333h = fVar;
    }
}
