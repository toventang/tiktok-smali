package com.ss.android.ugc.aweme.journey.step.swipeup;

import android.graphics.Matrix;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.j;
import com.ss.android.ugc.playerkit.videoview.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class e {

    /* renamed from: j  reason: collision with root package name */
    public static final a f105165j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public VideoViewComponent f105166a;

    /* renamed from: b  reason: collision with root package name */
    RemoteImageView f105167b;

    /* renamed from: c  reason: collision with root package name */
    public a f105168c;

    /* renamed from: d  reason: collision with root package name */
    final com.ss.android.ugc.aweme.feed.d.a f105169d = new com.ss.android.ugc.aweme.feed.d.a();

    /* renamed from: e  reason: collision with root package name */
    public boolean f105170e;

    /* renamed from: f  reason: collision with root package name */
    public Aweme f105171f;

    /* renamed from: g  reason: collision with root package name */
    boolean f105172g;

    /* renamed from: h  reason: collision with root package name */
    public View f105173h;

    /* renamed from: i  reason: collision with root package name */
    public b f105174i;

    /* renamed from: k  reason: collision with root package name */
    private f f105175k;

    public interface b {
        static {
            Covode.recordClassIndex(67429);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(67427);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67428);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements SurfaceHolder.Callback {
        static {
            Covode.recordClassIndex(67431);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            l.d(surfaceHolder, "");
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            l.d(surfaceHolder, "");
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            l.d(surfaceHolder, "");
        }

        d() {
        }
    }

    public final void a() {
        RemoteImageView remoteImageView = this.f105167b;
        if (remoteImageView == null) {
            l.a("mCoverView");
        }
        remoteImageView.setVisibility(0);
    }

    public final void b() {
        RemoteImageView remoteImageView = this.f105167b;
        if (remoteImageView == null) {
            l.a("mCoverView");
        }
        remoteImageView.setVisibility(8);
    }

    public final void d() {
        this.f105170e = false;
        int i2 = this.f105169d.f92885a;
        if (i2 == 0) {
            c();
        } else if (i2 == 3) {
            a aVar = this.f105168c;
            if (aVar == null) {
                l.a("mPlayVideoHelper");
            }
            aVar.a();
            this.f105169d.f92885a = 4;
        }
    }

    public final void e() {
        this.f105170e = false;
        int i2 = this.f105169d.f92885a;
        if (i2 == 1 || i2 == 2 || i2 == 4) {
            a aVar = this.f105168c;
            if (aVar == null) {
                l.a("mPlayVideoHelper");
            }
            aVar.f105140b.b();
            this.f105169d.f92885a = 3;
        }
    }

    public final void c() {
        VideoViewComponent videoViewComponent = this.f105166a;
        if (videoViewComponent == null) {
            l.a("mVideoView");
        }
        j jVar = videoViewComponent.f148883b;
        l.b(jVar, "");
        if (!jVar.c()) {
            this.f105170e = true;
            return;
        }
        int i2 = this.f105169d.f92885a;
        if (i2 == 0) {
            a aVar = this.f105168c;
            if (aVar == null) {
                l.a("mPlayVideoHelper");
            }
            if (aVar.b()) {
                aVar.f105140b.b(aVar.f105141c);
                VideoViewComponent videoViewComponent2 = aVar.f105140b;
                Aweme aweme = aVar.f105139a;
                if (aweme == null) {
                    l.b();
                }
                videoViewComponent2.a(aweme.getVideo(), com.bytedance.ies.abmock.b.a().a(true, "decoder_type", 0));
                aVar.f105140b.h();
            }
            this.f105170e = false;
            this.f105169d.f92885a = 2;
        } else if (i2 == 3) {
            d();
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.video.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f105180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f105181b;

        static {
            Covode.recordClassIndex(67433);
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompletedFirstTime(String str) {
            super.onPlayCompletedFirstTime(str);
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(o oVar) {
            super.onRenderFirstFrame(oVar);
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str) {
            super.onPlayCompleted(str);
            this.f105180a.f105174i.a();
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
            super.onPlayFailed(lVar);
            this.f105180a.a();
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderReady(n nVar) {
            super.onRenderReady(nVar);
            this.f105180a.b();
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onResumePlay(String str) {
            super.onResumePlay(str);
            this.f105180a.b();
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayProgressChange(float f2) {
            super.onPlayProgressChange(f2);
            if (this.f105181b && f2 >= 85.0f) {
                a aVar = this.f105180a.f105168c;
                if (aVar == null) {
                    l.a("mPlayVideoHelper");
                }
                aVar.f105140b.a(90.0f);
                this.f105180a.f105174i.a();
                this.f105180a.e();
            }
        }

        f(e eVar, boolean z) {
            this.f105180a = eVar;
            this.f105181b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.e$e  reason: collision with other inner class name */
    public static final class C2687e implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f105179a;

        static {
            Covode.recordClassIndex(67432);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2687e(e eVar) {
            this.f105179a = eVar;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            if (this.f105179a.f105170e) {
                this.f105179a.f105170e = false;
                this.f105179a.c();
            }
        }
    }

    public static final class c implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f105176a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f105177b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f105178c;

        static {
            Covode.recordClassIndex(67430);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            float f2;
            if (this.f105177b) {
                VideoViewComponent videoViewComponent = this.f105176a.f105166a;
                if (videoViewComponent == null) {
                    l.a("mVideoView");
                }
                j jVar = videoViewComponent.f148883b;
                l.b(jVar, "");
                TextureView textureView = (TextureView) jVar.a();
                float f3 = this.f105178c;
                float f4 = ((float) i3) / ((float) i2);
                int i4 = i2 / 2;
                float f5 = 1.0f;
                if (f4 > f3) {
                    f5 = f3 / f4;
                    f2 = 1.0f;
                } else {
                    f2 = f3 / f4;
                }
                if (textureView != null) {
                    Matrix matrix = new Matrix();
                    matrix.setScale(f5, f2, (float) i4, 0.0f);
                    textureView.setTransform(matrix);
                }
            }
        }

        c(e eVar, boolean z, float f2) {
            this.f105176a = eVar;
            this.f105177b = z;
            this.f105178c = f2;
        }
    }

    public e(View view, b bVar, boolean z) {
        l.d(view, "");
        l.d(bVar, "");
        this.f105173h = view;
        this.f105174i = bVar;
        this.f105175k = new f(this, z);
        VideoViewComponent videoViewComponent = new VideoViewComponent((byte) 0);
        this.f105166a = videoViewComponent;
        View view2 = this.f105173h;
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        videoViewComponent.a((ViewGroup) view2);
        VideoViewComponent videoViewComponent2 = this.f105166a;
        if (videoViewComponent2 == null) {
            l.a("mVideoView");
        }
        videoViewComponent2.a(new C2687e(this));
        VideoViewComponent videoViewComponent3 = this.f105166a;
        if (videoViewComponent3 == null) {
            l.a("mVideoView");
        }
        this.f105168c = new a(videoViewComponent3, this.f105175k);
        View findViewById = this.f105173h.findViewById(R.id.agf);
        l.b(findViewById, "");
        this.f105167b = (RemoteImageView) findViewById;
        this.f105173h.setTag(this);
    }
}
