package com.ss.android.ugc.aweme.components.video.playbox;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.b.e;
import com.facebook.drawee.e.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.newfollow.c.d;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import h.a.ag;
import h.f.a.q;
import h.m.p;
import h.r;
import h.v;
import h.z;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public class DeclarativeVideoPlayBox extends com.bytedance.ies.xelement.d implements au, OnUIPlayListener {

    /* renamed from: i  reason: collision with root package name */
    public static SoftReference<com.ss.android.ugc.aweme.video.i> f78112i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f78113j = new a((byte) 0);
    private boolean A;
    private final IResourceLoaderService B;
    private boolean C;
    private int D;
    private q<? super String, ? super Map<String, ? extends Object>, ? super com.bytedance.ies.xelement.d, z> E;
    private final h.h F;
    private final h.h G;
    private final h.h H;
    private KeepSurfaceTextureView I;
    private KeepSurfaceTextureView J;
    private final RemoteImageView K;

    /* renamed from: a  reason: collision with root package name */
    public boolean f78114a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f78115b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f78116c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78117d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f78118e;

    /* renamed from: f  reason: collision with root package name */
    public String f78119f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f78120g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.video.a.a f78121h;

    /* renamed from: k  reason: collision with root package name */
    private Uri f78122k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f78123l;

    /* renamed from: m  reason: collision with root package name */
    private int f78124m;
    private String n;
    private int o;
    private boolean p;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;
    private float u;
    private float v;
    private boolean w;
    private int x;
    private int y;
    private String z;

    static {
        Covode.recordClassIndex(48430);
    }

    private final com.ss.android.ugc.aweme.video.i getMPlayer() {
        return (com.ss.android.ugc.aweme.video.i) this.F.getValue();
    }

    private final String getMReactSessionId() {
        return (String) this.H.getValue();
    }

    private final j.AnonymousClass1 getSurfaceListener() {
        return (j.AnonymousClass1) this.G.getValue();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j2, long j3) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i2, float f2) {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onHostResume(mVar);
        } else if (aVar == i.a.ON_PAUSE) {
            onHostPause(mVar);
        } else if (aVar == i.a.ON_DESTROY) {
            onHostDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i2, int i3) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48431);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final KeepSurfaceTextureView getMTextureView() {
        return this.I;
    }

    static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ boolean $play;
        final /* synthetic */ int $seekTime;
        final /* synthetic */ DeclarativeVideoPlayBox this$0;

        static {
            Covode.recordClassIndex(48439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(DeclarativeVideoPlayBox declarativeVideoPlayBox, int i2, boolean z) {
            super(0);
            this.this$0 = declarativeVideoPlayBox;
            this.$seekTime = i2;
            this.$play = z;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.video.a.a f78130a;

            static {
                Covode.recordClassIndex(48440);
            }

            a(com.ss.android.ugc.aweme.video.a.a aVar) {
                this.f78130a = aVar;
            }

            public final void run() {
                this.f78130a.c();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2;
            Video video;
            com.ss.android.ugc.aweme.video.a.a aVar = this.this$0.f78121h;
            if (aVar != null) {
                float f2 = (float) this.$seekTime;
                Aweme aweme = this.this$0.f78115b;
                if (aweme == null || (video = aweme.getVideo()) == null) {
                    i2 = 100;
                } else {
                    i2 = video.getDuration();
                }
                float f3 = (f2 / ((float) i2)) * 100.0f;
                com.ss.android.ugc.aweme.video.i iVar = aVar.f143232a;
                if (iVar != null) {
                    iVar.a(f3);
                }
                this.this$0.a("onSeeked", ag.c(v.a("progress", Integer.valueOf(this.$seekTime))));
                if (!this.$play) {
                    this.this$0.postDelayed(new a(aVar), 500);
                }
            }
            this.this$0.f78120g = true ^ this.$play;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeclarativeVideoPlayBox f78126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f78127b;

        static {
            Covode.recordClassIndex(48436);
        }

        f(DeclarativeVideoPlayBox declarativeVideoPlayBox, h.f.a.a aVar) {
            this.f78126a = declarativeVideoPlayBox;
            this.f78127b = aVar;
        }

        public final void run() {
            this.f78126a.b(this.f78127b);
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeclarativeVideoPlayBox f78128a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f78129b;

        static {
            Covode.recordClassIndex(48437);
        }

        g(DeclarativeVideoPlayBox declarativeVideoPlayBox, h.f.a.a aVar) {
            this.f78128a = declarativeVideoPlayBox;
            this.f78129b = aVar;
        }

        public final void run() {
            this.f78128a.a(this.f78129b);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ DeclarativeVideoPlayBox this$0;

        static {
            Covode.recordClassIndex(48441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(0);
            this.this$0 = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new TextureView.SurfaceTextureListener(this) {
                /* class com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f78131a;

                static {
                    Covode.recordClassIndex(48442);
                }

                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    h.f.b.l.d(surfaceTexture, "");
                    return false;
                }

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    h.f.b.l.d(surfaceTexture, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f78131a = r1;
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                    h.f.b.l.d(surfaceTexture, "");
                    this.f78131a.this$0.a(i2, i3);
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                    h.f.b.l.d(surfaceTexture, "");
                    this.f78131a.this$0.a(i2, i3);
                }
            };
        }
    }

    @Override // com.bytedance.ies.xelement.d
    public final void a() {
        if (this.w) {
            e();
        }
    }

    @Override // com.bytedance.ies.xelement.d
    public final void b() {
        h();
        this.f78120g = true;
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78125a = new c();

        static {
            Covode.recordClassIndex(48433);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ DeclarativeVideoPlayBox this$0;

        static {
            Covode.recordClassIndex(48438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(0);
            this.this$0 = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            if (!this.this$0.f78117d) {
                this.this$0.f78120g = true;
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.d
    public void d() {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            topActivity.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = true;
        g();
    }

    private final void f() {
        if (this.f78123l) {
            com.ss.android.ugc.aweme.video.a.a aVar = this.f78121h;
            if (aVar != null) {
                aVar.g();
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.video.a.a aVar2 = this.f78121h;
        if (aVar2 != null) {
            float f2 = this.u;
            aVar2.a(f2, f2);
        }
    }

    private final void g() {
        com.ss.android.ugc.aweme.video.i mPlayer;
        if (this.f78124m > 0 && (mPlayer = getMPlayer()) != null) {
            mPlayer.J();
        }
        com.ss.android.ugc.aweme.video.a.a aVar = this.f78121h;
        if (aVar != null) {
            aVar.c();
        }
        com.ss.android.ugc.aweme.video.a.a aVar2 = this.f78121h;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    private final void h() {
        com.ss.android.ugc.aweme.video.i mPlayer;
        com.ss.android.ugc.aweme.video.a.a aVar = this.f78121h;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f78124m > 0 && (mPlayer = getMPlayer()) != null) {
            mPlayer.J();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.video.i> {
        final /* synthetic */ DeclarativeVideoPlayBox this$0;

        static {
            Covode.recordClassIndex(48432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(0);
            this.this$0 = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.video.i invoke() {
            if (!this.this$0.f78116c) {
                return d.a.f112589a.a();
            }
            SoftReference<com.ss.android.ugc.aweme.video.i> softReference = DeclarativeVideoPlayBox.f78112i;
            if (softReference == null || softReference.get() == null) {
                DeclarativeVideoPlayBox.f78112i = new SoftReference<>(d.a.f112589a.a());
            }
            SoftReference<com.ss.android.ugc.aweme.video.i> softReference2 = DeclarativeVideoPlayBox.f78112i;
            if (softReference2 != null) {
                return softReference2.get();
            }
            return null;
        }
    }

    @androidx.lifecycle.v(a = i.a.ON_DESTROY)
    public final void onHostDestroy() {
        Context context;
        androidx.lifecycle.i lifecycle;
        Context context2 = getContext();
        m mVar = null;
        if (!(context2 instanceof ContextWrapper)) {
            context2 = null;
        }
        ContextWrapper contextWrapper = (ContextWrapper) context2;
        if (contextWrapper != null) {
            context = contextWrapper.getBaseContext();
        } else {
            context = null;
        }
        if (context instanceof m) {
            mVar = context;
        }
        m mVar2 = mVar;
        if (mVar2 != null && (lifecycle = mVar2.getLifecycle()) != null) {
            lifecycle.b(this);
        }
    }

    @Override // com.bytedance.ies.xelement.d
    public void c() {
        if (this.f78115b != null) {
            h();
            if (getMPlayer() != null) {
                a("onZoomChange", ag.c(v.a("zoom", 1)));
                return;
            }
            return;
        }
        Uri uri = this.f78122k;
        if (uri != null && uri.isHierarchical()) {
            h();
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            if (createIMainServicebyMonsterPlugin != null) {
                Context context = getContext();
                String str = this.f78119f;
                createIMainServicebyMonsterPlugin.startVideoPlayActivity(context, str, "", this.p, str, com.bytedance.common.utility.d.b(str), "hybrid", "", this.v);
            }
            this.v = 0.0f;
        }
    }

    public void requestLayout() {
        super.requestLayout();
        if (getWidth() > 0 && getHeight() > 0) {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getPaddingLeft() + getLeft(), getPaddingTop() + getTop(), getWidth() + getPaddingLeft() + getLeft(), getHeight() + getPaddingTop() + getTop());
        }
    }

    public final void e() {
        q.b bVar;
        if (this.f78114a) {
            g();
            this.J = this.I;
            KeepSurfaceTextureView keepSurfaceTextureView = new KeepSurfaceTextureView(getContext());
            keepSurfaceTextureView.setAlpha(0.0f);
            this.I = keepSurfaceTextureView;
            addView(keepSurfaceTextureView, -1, -1);
            com.ss.android.ugc.aweme.video.a.a aVar = new com.ss.android.ugc.aweme.video.a.a(this.I, this);
            this.f78121h = aVar;
            aVar.f143232a = getMPlayer();
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.I;
            if (keepSurfaceTextureView2 != null) {
                keepSurfaceTextureView2.setSurfaceTextureListener(getSurfaceListener());
            }
            com.ss.android.ugc.aweme.video.a.a aVar2 = this.f78121h;
            if (aVar2 != null) {
                aVar2.f143236e = this.p;
                Uri uri = this.f78122k;
                if (uri == null || !uri.isHierarchical()) {
                    aVar2.f143234c = this.f78115b;
                } else {
                    aVar2.f143235d = this.f78119f;
                }
            }
            requestLayout();
            String str = this.q;
            if (this.K.getTag() == null && bm.a(this.q) && str != null) {
                RemoteImageView remoteImageView = this.K;
                remoteImageView.setAlpha(1.0f);
                com.facebook.drawee.f.a aVar3 = (com.facebook.drawee.f.a) remoteImageView.getHierarchy();
                h.f.b.l.b(aVar3, "");
                String str2 = this.n;
                int hashCode = str2.hashCode();
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && str2.equals("contain")) {
                        bVar = q.b.f47438d;
                        aVar3.a(bVar);
                        com.ss.android.ugc.aweme.base.e.b(remoteImageView, this.q, -1, -1);
                        remoteImageView.setTag(this.q);
                    }
                } else if (str2.equals("cover")) {
                    bVar = q.b.f47442h;
                    aVar3.a(bVar);
                    com.ss.android.ugc.aweme.base.e.b(remoteImageView, this.q, -1, -1);
                    remoteImageView.setTag(this.q);
                }
                bVar = q.b.f47436b;
                aVar3.a(bVar);
                com.ss.android.ugc.aweme.base.e.b(remoteImageView, this.q, -1, -1);
                remoteImageView.setTag(this.q);
            }
        } else {
            f();
        }
        a(new h(this));
        this.w = false;
        this.f78114a = false;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setAutoLifecycle(boolean z2) {
        this.r = z2;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setAutoPlay(boolean z2) {
        this.f78117d = z2;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setDeviceChangeAware(boolean z2) {
        this.s = z2;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setLoop(boolean z2) {
        this.p = z2;
    }

    public final void setMTextureView(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.I = keepSurfaceTextureView;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setPreload(boolean z2) {
        this.t = z2;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setRate(int i2) {
        this.f78124m = i2;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setSinglePlayer(boolean z2) {
        this.f78116c = z2;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setStateChangeReporter(h.f.a.q<? super String, ? super Map<String, ? extends Object>, ? super com.bytedance.ies.xelement.d, z> qVar) {
        this.E = qVar;
    }

    public /* synthetic */ DeclarativeVideoPlayBox(Context context) {
        this(context, null, 0);
    }

    @Override // com.bytedance.ies.xelement.d
    public void setObjectFit(String str) {
        h.f.b.l.d(str, "");
        this.n = str;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setInitTime(int i2) {
        boolean z2;
        if (this.o != i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(z2);
        this.o = i2;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setMuted(boolean z2) {
        boolean z3;
        if (this.f78123l != z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        a(z3);
        this.f78123l = z2;
    }

    @Override // com.bytedance.ies.xelement.d
    public void setVolume(float f2) {
        boolean z2;
        if (this.u != f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(z2);
        this.u = f2;
    }

    private final boolean b(String str) {
        String str2;
        if (h.f.b.l.a((Object) str, (Object) this.f78119f)) {
            return true;
        }
        Aweme aweme = this.f78115b;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (h.f.b.l.a((Object) str, (Object) str2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z2) {
        a("onBuffering", ag.c(v.a("buffer", Integer.valueOf(z2 ? 1 : 0))));
    }

    @androidx.lifecycle.v(a = i.a.ON_PAUSE)
    public final void onHostPause(m mVar) {
        h.f.b.l.d(mVar, "");
        com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
        if (mPlayer != null && mPlayer.o() && this.r && !this.f78116c) {
            h();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        if (b(str)) {
            a("onPause", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
        if (b(str)) {
            a("onFirstCompleted", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(l lVar) {
        h.f.b.l.d(lVar, "");
        if (b(lVar.f148746a)) {
            a("onPlayFailed", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreparePlay(String str) {
        if (b(str)) {
            a("onPreparePlay", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(n nVar) {
        h.f.b.l.d(nVar, "");
        if (b(nVar.f148789a)) {
            a("onRenderReady", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
        if (b(str)) {
            a("onPlay", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(l lVar) {
        h.f.b.l.d(lVar, "");
        a("onError", ag.c(v.a("message", lVar.toString())));
    }

    @Override // com.bytedance.ies.xelement.d
    public void setPoster(String str) {
        h.f.b.l.d(str, "");
        a(!h.f.b.l.a((Object) this.q, (Object) str));
        this.q = str;
    }

    static final class e extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ String $originUrl;
        final /* synthetic */ DeclarativeVideoPlayBox this$0;

        static {
            Covode.recordClassIndex(48435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(1);
            this.$originUrl = str;
            this.this$0 = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            DeclarativeVideoPlayBox declarativeVideoPlayBox = this.this$0;
            declarativeVideoPlayBox.f78114a = declarativeVideoPlayBox.a(!h.f.b.l.a((Object) this.$originUrl, (Object) declarativeVideoPlayBox.f78119f));
            DeclarativeVideoPlayBox declarativeVideoPlayBox2 = this.this$0;
            declarativeVideoPlayBox2.f78118e = declarativeVideoPlayBox2.f78114a;
            this.this$0.f78119f = this.$originUrl;
            this.this$0.e();
            return z.f158842a;
        }
    }

    private static Object a(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (p.b(str, "video://", false)) {
                return Uri.parse(str);
            }
            return new Api.b(Aweme.class).a(str);
        } catch (Throwable th) {
            Object r1 = h.q.m223constructorimpl(r.a(th));
            if (h.q.m228isFailureimpl(r1)) {
                return null;
            }
            return r1;
        }
    }

    @androidx.lifecycle.v(a = i.a.ON_RESUME)
    public final void onHostResume(m mVar) {
        h.f.b.l.d(mVar, "");
        com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
        if (mPlayer != null && !mPlayer.o() && this.r && !this.f78120g && !this.f78116c) {
            a((h.f.a.a<z>) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        if (b(str)) {
            int i2 = this.D;
            this.D = i2 + 1;
            a("onCompleted", ag.c(v.a("times", Integer.valueOf(i2))));
            if (!this.p && this.A) {
                a(0, false);
                h();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f2) {
        long j2;
        this.v = f2;
        h.p[] pVarArr = new h.p[1];
        com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
        if (mPlayer != null) {
            j2 = mPlayer.n();
        } else {
            j2 = 0;
        }
        pVarArr[0] = v.a("progress", Integer.valueOf((int) j2));
        a("onProgressChange", ag.c(pVarArr));
    }

    static final class d extends h.f.b.m implements h.f.a.b<ap, z> {
        final /* synthetic */ String $originUrl;
        final /* synthetic */ DeclarativeVideoPlayBox this$0;

        static {
            Covode.recordClassIndex(48434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, DeclarativeVideoPlayBox declarativeVideoPlayBox) {
            super(1);
            this.$originUrl = str;
            this.this$0 = declarativeVideoPlayBox;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ap apVar) {
            String str;
            ap apVar2 = apVar;
            h.f.b.l.d(apVar2, "");
            if (apVar2.o != null) {
                str = "file:/" + apVar2.o;
            } else {
                str = this.$originUrl;
            }
            DeclarativeVideoPlayBox declarativeVideoPlayBox = this.this$0;
            declarativeVideoPlayBox.f78114a = declarativeVideoPlayBox.a(!h.f.b.l.a((Object) str, (Object) declarativeVideoPlayBox.f78119f));
            DeclarativeVideoPlayBox declarativeVideoPlayBox2 = this.this$0;
            declarativeVideoPlayBox2.f78118e = declarativeVideoPlayBox2.f78114a;
            this.this$0.f78119f = str;
            this.this$0.e();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.d
    public final void a(h.f.a.a<z> aVar) {
        Boolean bool;
        if (this.A) {
            b(aVar);
            return;
        }
        com.ss.android.ugc.aweme.video.a.a aVar2 = this.f78121h;
        if (aVar2 != null) {
            bool = Boolean.valueOf(aVar2.f());
        } else {
            bool = null;
        }
        if (!h.f.b.l.a((Object) bool, (Object) true) || this.C) {
            if (this.f78118e) {
                this.f78118e = false;
                com.ss.android.ugc.aweme.video.a.a aVar3 = this.f78121h;
                if (aVar3 != null) {
                    aVar3.a(this.o);
                }
                f();
            } else {
                com.ss.android.ugc.aweme.video.a.a aVar4 = this.f78121h;
                if (aVar4 != null) {
                    aVar4.d();
                }
            }
            this.f78120g = false;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        postDelayed(new g(this, aVar), 100);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(o oVar) {
        h.f.b.l.d(oVar, "");
        if (b(oVar.getId())) {
            KeepSurfaceTextureView keepSurfaceTextureView = this.I;
            if (keepSurfaceTextureView != null) {
                keepSurfaceTextureView.setAlpha(1.0f);
            }
            this.K.setAlpha(0.0f);
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.J;
            if (keepSurfaceTextureView2 != null) {
                removeView(keepSurfaceTextureView2);
            }
            this.v = 0.0f;
            a("onFirstFrame", new HashMap());
            a("onPlay", new HashMap());
            if (this.f78120g) {
                b();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(h.f.a.a<h.z> r9) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox.b(h.f.a.a):void");
    }

    @Override // com.bytedance.ies.xelement.d
    public void setSrc(String str) {
        String queryParameter;
        int i2;
        Integer e2;
        Integer e3;
        h.f.b.l.d(str, "");
        if (!h.f.b.l.a((Object) this.z, (Object) str)) {
            this.z = str;
            this.f78118e = true;
        }
        Object a2 = a(str);
        if (a2 != null) {
            String str2 = null;
            boolean z2 = false;
            r2 = 0;
            int i3 = 0;
            z2 = false;
            if (a2 instanceof Uri) {
                if (a(!h.f.b.l.a(this.f78122k, a2))) {
                    this.f78114a = true;
                }
                Uri uri = (Uri) a2;
                this.f78122k = uri;
                if (uri != null) {
                    str2 = uri.getQueryParameter("play_legacy");
                }
                if (h.f.b.l.a((Object) "false", (Object) str2)) {
                    this.A = false;
                } else {
                    this.A = true;
                }
                Uri uri2 = this.f78122k;
                this.x = 0;
                this.y = 0;
                if (uri2 != null && uri2.isHierarchical()) {
                    String queryParameter2 = uri2.getQueryParameter("width");
                    if (queryParameter2 == null || (e3 = p.e(queryParameter2)) == null) {
                        i2 = 0;
                    } else {
                        i2 = e3.intValue();
                    }
                    this.x = i2;
                    String queryParameter3 = uri2.getQueryParameter("height");
                    if (!(queryParameter3 == null || (e2 = p.e(queryParameter3)) == null)) {
                        i3 = e2.intValue();
                    }
                    this.y = i3;
                }
                Uri uri3 = this.f78122k;
                if (uri3 != null && uri3.isHierarchical() && (queryParameter = uri3.getQueryParameter("play_url")) != null) {
                    if (this.A) {
                        boolean a3 = a(!h.f.b.l.a((Object) queryParameter, (Object) this.f78119f));
                        this.f78114a = a3;
                        this.f78118e = a3;
                        h.f.b.l.b(queryParameter, "");
                        this.f78119f = queryParameter;
                        e();
                        return;
                    }
                    h.f.b.l.b(queryParameter, "");
                    IResourceLoaderService iResourceLoaderService = this.B;
                    if (iResourceLoaderService != null) {
                        iResourceLoaderService.loadAsync(queryParameter, new com.bytedance.ies.bullet.service.base.resourceloader.config.j(""), new d(queryParameter, this), new e(queryParameter, this));
                    }
                }
            } else if (a2 instanceof Aweme) {
                if (this.f78122k == null) {
                    Aweme aweme = this.f78115b;
                    if (aweme != null) {
                        str2 = aweme.getAid();
                    }
                    if (!h.f.b.l.a((Object) str2, (Object) ((Aweme) a2).getAid())) {
                        z2 = true;
                    }
                }
                if (a(z2)) {
                    this.f78114a = true;
                }
                this.f78115b = (Aweme) a2;
            }
        }
    }

    public final boolean a(boolean z2) {
        if (z2) {
            this.w = true;
        }
        return z2;
    }

    @Override // com.bytedance.ies.xelement.d
    public final void a(int i2, boolean z2) {
        this.f78118e = true;
        this.o = i2;
        a(new i(this, i2, z2));
    }

    public final void a(String str, Map<String, ? extends Object> map) {
        System.out.println((Object) "DeclarativeVideoPlayBox- ".concat(String.valueOf(str)));
        h.f.a.q<? super String, ? super Map<String, ? extends Object>, ? super com.bytedance.ies.xelement.d, z> qVar = this.E;
        if (qVar != null) {
            qVar.invoke(str, map, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r1 <= r4) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r1 > r4) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r3 = r1 / r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox.a(int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeclarativeVideoPlayBox(Context context, AttributeSet attributeSet, int i2) {
        super(context, null, 0);
        Context context2;
        androidx.lifecycle.i lifecycle;
        h.f.b.l.d(context, "");
        m mVar = null;
        this.f78124m = 166;
        this.n = "fill";
        this.q = "";
        this.u = 1.0f;
        this.z = "";
        this.A = true;
        this.f78119f = "";
        this.B = (IResourceLoaderService) e.a.a().a(IResourceLoaderService.class);
        this.D = 1;
        this.f78120g = true;
        this.F = h.i.a((h.f.a.a) new b(this));
        this.G = h.i.a(h.m.NONE, new j(this));
        this.H = h.i.a((h.f.a.a) c.f78125a);
        RemoteImageView remoteImageView = new RemoteImageView(context);
        this.K = remoteImageView;
        addView(remoteImageView, -1, -1);
        ContextWrapper contextWrapper = (ContextWrapper) (!(context instanceof ContextWrapper) ? null : context);
        if (contextWrapper != null) {
            context2 = contextWrapper.getBaseContext();
        } else {
            context2 = null;
        }
        m mVar2 = context2 instanceof m ? context2 : mVar;
        if (mVar2 != null && (lifecycle = mVar2.getLifecycle()) != null) {
            lifecycle.a(this);
        }
    }
}
