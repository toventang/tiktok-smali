package com.ss.android.ugc.aweme.shoutouts.player;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxLoadingHUD;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderGetApi;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.ab;
import h.z;
import java.util.List;
import org.json.JSONObject;

public final class ShoutoutsPlayActivity extends com.bytedance.ies.foundation.activity.a implements ar<e>, com.bytedance.jedi.arch.q, OnUIPlayListener {

    /* renamed from: c  reason: collision with root package name */
    public static final c f133234c = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Video f133235a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f133236b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f133237d = h.i.a((h.f.a.a) p.f133267a);

    /* renamed from: e  reason: collision with root package name */
    private boolean f133238e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f133239f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f133240g;

    /* renamed from: h  reason: collision with root package name */
    private float f133241h;

    /* renamed from: i  reason: collision with root package name */
    private final lifecycleAwareLazy f133242i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f133243j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f133244k;

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f133245l;

    public static final class a extends h.f.b.m implements h.f.a.m<ShoutoutsPlayState, Bundle, ShoutoutsPlayState> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(87136);
        }

        public a() {
            super(2);
        }

        public final ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState, Bundle bundle) {
            h.f.b.l.c(shoutoutsPlayState, "");
            return shoutoutsPlayState;
        }
    }

    static {
        Covode.recordClassIndex(87135);
    }

    private final VideoViewComponent c() {
        return (VideoViewComponent) this.f133237d.getValue();
    }

    private final boolean e() {
        return ((Boolean) this.f133244k.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f133245l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f133245l == null) {
            this.f133245l = new SparseArray();
        }
        View view = (View) this.f133245l.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f133245l.put(i2, findViewById);
        return findViewById;
    }

    public final ShoutoutsPlayViewModel a() {
        return (ShoutoutsPlayViewModel) this.f133242i.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j2, long j3) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, com.ss.android.ugc.playerkit.model.n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, com.ss.android.ugc.playerkit.model.o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(com.ss.android.ugc.playerkit.model.n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i2, float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(87139);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    public static final class n implements com.ss.android.ugc.playerkit.videoview.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayActivity f133263a;

        static {
            Covode.recordClassIndex(87156);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
            this.f133263a.f133236b = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f133263a = shoutoutsPlayActivity;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            this.f133263a.f133236b = true;
            this.f133263a.b();
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<VideoViewComponent> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f133267a = new p();

        static {
            Covode.recordClassIndex(87158);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoViewComponent invoke() {
            return new VideoViewComponent();
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f133268a = new q();

        static {
            Covode.recordClassIndex(87159);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* synthetic */ e d() {
        return (e) this.f133243j.getValue();
    }

    static final class j extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ ShoutoutsPlayActivity this$0;

        static {
            Covode.recordClassIndex(87146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            super(0);
            this.this$0 = shoutoutsPlayActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (this.this$0.getIntent().getIntExtra("is_preview", 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        if (c().g()) {
            a(false);
        }
        super.onPause();
    }

    public ShoutoutsPlayActivity() {
        h.k.c a2 = ab.a(ShoutoutsPlayViewModel.class);
        this.f133242i = new lifecycleAwareLazy(this, new b(this, a2, a.INSTANCE, a2));
        this.f133243j = h.i.a((h.f.a.a) q.f133268a);
        this.f133244k = h.i.a((h.f.a.a) new j(this));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onResume", true);
        super.onResume();
        if (!c().g() && this.f133235a != null && !this.f133240g) {
            a(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        c().a((KeepSurfaceTextureView) _$_findCachedViewById(R.id.e3t));
        c().b(this);
        com.ss.android.ugc.playerkit.videoview.j.a((KeepSurfaceTextureView) _$_findCachedViewById(R.id.e3t)).a(new n(this));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        c().a(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<ShoutoutsPlayViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ androidx.appcompat.app.d $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(87137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.appcompat.app.d dVar, h.k.c cVar, h.f.a.m mVar, h.k.c cVar2) {
            super(0);
            this.$this_viewModel = dVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel invoke() {
            /*
                r4 = this;
                androidx.appcompat.app.d r1 = r4.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r4.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r3 = ""
                h.f.b.l.a(r1, r3)
                h.k.c r0 = r4.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel> r0 = com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.a(r0)
                if (r0 == 0) goto L_0x0038
                h.f.b.l.a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$b$1 r0 = new com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$b$1
                r0.<init>(r4)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class o implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayActivity f133264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextureView f133265b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Video f133266c;

        static {
            Covode.recordClassIndex(87157);
        }

        public final void onGlobalLayout() {
            if (this.f133265b.getWidth() > 0 && this.f133265b.getHeight() > 0) {
                this.f133265b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (this.f133266c.getWidth() > 0 && this.f133266c.getHeight() > 0) {
                    new com.ss.android.ugc.aweme.feed.helper.c().a(this.f133264a, this.f133265b, this.f133266c.getWidth(), this.f133266c.getHeight());
                }
            }
        }

        o(ShoutoutsPlayActivity shoutoutsPlayActivity, TextureView textureView, Video video) {
            this.f133264a = shoutoutsPlayActivity;
            this.f133265b = textureView;
            this.f133266c = video;
        }
    }

    public final void b() {
        if (this.f133236b && this.f133235a != null) {
            c().a(this.f133235a);
            Video video = this.f133235a;
            if (video == null) {
                h.f.b.l.b();
            }
            KeepSurfaceTextureView keepSurfaceTextureView = (KeepSurfaceTextureView) _$_findCachedViewById(R.id.e3t);
            h.f.b.l.b(keepSurfaceTextureView, "");
            if (keepSurfaceTextureView.getWidth() == 0 || keepSurfaceTextureView.getHeight() == 0) {
                keepSurfaceTextureView.getViewTreeObserver().addOnGlobalLayoutListener(new o(this, keepSurfaceTextureView, video));
            } else if (video.getWidth() > 0 && video.getHeight() > 0) {
                new com.ss.android.ugc.aweme.feed.helper.c().a(this, keepSurfaceTextureView, video.getWidth(), video.getHeight());
            }
            if (this.f133241h > 0.0f) {
                KeepSurfaceTextureView keepSurfaceTextureView2 = (KeepSurfaceTextureView) _$_findCachedViewById(R.id.e3t);
                h.f.b.l.b(keepSurfaceTextureView2, "");
                keepSurfaceTextureView2.setAlpha(0.0f);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (!this.f133238e) {
            finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
        if (lVar != null) {
            Integer.valueOf(lVar.f148749d);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayActivity f133246a;

        static {
            Covode.recordClassIndex(87140);
        }

        d(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f133246a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133246a.finish();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayActivity f133247a;

        static {
            Covode.recordClassIndex(87141);
        }

        e(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f133247a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133247a.a(true);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayActivity f133248a;

        static {
            Covode.recordClassIndex(87142);
        }

        f(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f133248a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133248a.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
        TuxLoadingHUD tuxLoadingHUD = (TuxLoadingHUD) _$_findCachedViewById(R.id.e3q);
        if (tuxLoadingHUD != null) {
            tuxLoadingHUD.setVisibility(0);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f133254a = new k();

        static {
            Covode.recordClassIndex(87147);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f133255a);
            baseActivityViewModel2.config(AnonymousClass2.f133256a);
            return z.f158842a;
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayActivity f133249a;

        static {
            Covode.recordClassIndex(87143);
        }

        g(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f133249a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Video video = this.f133249a.f133235a;
            if (video != null) {
                r.a("download", ShoutoutsPlayActivity.a(this.f133249a, true, false, 2).f66730a);
                this.f133249a.a().a(this.f133249a, video);
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayActivity f133250a;

        static {
            Covode.recordClassIndex(87144);
        }

        h(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f133250a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e.b a2 = new e.b().a(new SharePackage.a().a("").a());
            a2.t = true;
            e.b a3 = a2.a(new f(a(this.f133250a.getIntent(), "aweme_id"), a(this.f133250a.getIntent(), "author_id")));
            a3.o = false;
            new com.ss.android.ugc.aweme.sharer.ui.i(this.f133250a, R.style.a1d, a3.a()).show();
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final void a(boolean z) {
        TuxLoadingHUD tuxLoadingHUD = (TuxLoadingHUD) _$_findCachedViewById(R.id.e3q);
        h.f.b.l.b(tuxLoadingHUD, "");
        if (tuxLoadingHUD.getVisibility() != 0) {
            if (this.f133239f) {
                if (!c().g() && this.f133235a != null) {
                    c().a(this.f133235a);
                    TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.e3s);
                    h.f.b.l.b(tuxIconView, "");
                    tuxIconView.setVisibility(8);
                    this.f133239f = false;
                    this.f133240g = false;
                }
            } else if (c().g()) {
                c().b();
                TuxIconView tuxIconView2 = (TuxIconView) _$_findCachedViewById(R.id.e3s);
                h.f.b.l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
                this.f133239f = true;
                if (z) {
                    this.f133240g = true;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(com.ss.android.ugc.playerkit.model.o oVar) {
        TuxLoadingHUD tuxLoadingHUD = (TuxLoadingHUD) _$_findCachedViewById(R.id.e3q);
        h.f.b.l.b(tuxLoadingHUD, "");
        tuxLoadingHUD.setVisibility(8);
        r.a("video_play", a(this, false, true, 1).f66730a);
        if (this.f133241h > 0.0f) {
            KeepSurfaceTextureView keepSurfaceTextureView = (KeepSurfaceTextureView) _$_findCachedViewById(R.id.e3t);
            if (keepSurfaceTextureView != null) {
                keepSurfaceTextureView.setAlpha(1.0f);
            }
            c().a(this.f133241h);
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayActivity f133251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f133252b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f133253c;

        static {
            Covode.recordClassIndex(87145);
        }

        i(ShoutoutsPlayActivity shoutoutsPlayActivity, String str, String str2) {
            this.f133251a = shoutoutsPlayActivity;
            this.f133252b = str;
            this.f133253c = str2;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Video video;
            Video video2;
            com.ss.android.ugc.aweme.shoutouts.model.b bVar = (com.ss.android.ugc.aweme.shoutouts.model.b) obj;
            this.f133251a.f133235a = new Video();
            Video video3 = this.f133251a.f133235a;
            if (video3 != null) {
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setUrlList(h.a.n.a(this.f133252b));
                videoUrlModel.setSourceId(this.f133252b);
                videoUrlModel.setUrlKey(this.f133252b);
                List<String> urlList = videoUrlModel.getUrlList();
                h.f.b.l.b(urlList, "");
                videoUrlModel.setUri((String) h.a.n.h((List) urlList));
                video3.setPlayAddr(videoUrlModel);
                video3.setDownloadAddr(video3.getPlayAddr());
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(this.f133253c);
                urlModel.setUrlList(h.a.n.a(this.f133253c));
                video3.setCover(urlModel);
                Aweme aweme = bVar.f133205b;
                int i3 = 0;
                if (aweme == null || (video2 = aweme.getVideo()) == null) {
                    i2 = 0;
                } else {
                    i2 = video2.getWidth();
                }
                video3.setWidth(i2);
                Aweme aweme2 = bVar.f133205b;
                if (!(aweme2 == null || (video = aweme2.getVideo()) == null)) {
                    i3 = video.getHeight();
                }
                video3.setHeight(i3);
                video3.setSourceId(this.f133252b);
                this.f133251a.b();
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        boolean z;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onCreate", true);
        activityConfiguration(k.f133254a);
        super.onCreate(bundle);
        setContentView(R.layout.b0j);
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.e3n);
        if (tuxIconView != null) {
            tuxIconView.setTintColor(androidx.core.content.b.c(tuxIconView.getContext(), R.color.a_));
            tuxIconView.setOnClickListener(new d(this));
        }
        KeepSurfaceTextureView keepSurfaceTextureView = (KeepSurfaceTextureView) _$_findCachedViewById(R.id.e3t);
        if (keepSurfaceTextureView != null) {
            keepSurfaceTextureView.setOnClickListener(new e(this));
        }
        TuxIconView tuxIconView2 = (TuxIconView) _$_findCachedViewById(R.id.e3s);
        if (tuxIconView2 != null) {
            tuxIconView2.setOnClickListener(new f(this));
        }
        ((TuxButton) _$_findCachedViewById(R.id.e3p)).setOnClickListener(new g(this));
        ((TuxButton) _$_findCachedViewById(R.id.e3p)).setBackgroundColor(androidx.core.content.b.c(this, R.color.a2));
        String a2 = a(getIntent(), "author_id");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (h.f.b.l.a((Object) a2, (Object) g2.getCurUserId())) {
            TuxIconView tuxIconView3 = (TuxIconView) _$_findCachedViewById(R.id.e3r);
            h.f.b.l.b(tuxIconView3, "");
            tuxIconView3.setVisibility(8);
        } else {
            ((TuxIconView) _$_findCachedViewById(R.id.e3r)).setOnClickListener(new h(this));
        }
        String a3 = a(getIntent(), "cover");
        String a4 = a(getIntent(), "download_url");
        if (a3 == null || a3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || a4 == null || a4.length() == 0) {
            new com.bytedance.tux.g.b(this).e(R.string.de2).b();
        } else {
            String a5 = a(getIntent(), "order_id");
            if (a5 != null) {
                a().f133269a.observe(this, new i(this, a4, a3));
                ShoutoutsPlayViewModel a6 = a();
                h.f.b.l.b(a5, "");
                h.f.b.l.d(a5, "");
                Object a7 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(ShoutoutsOrderGetApi.class);
                h.f.b.l.b(a7, "");
                ((ShoutoutsOrderGetApi) a7).getOrder(a5).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ShoutoutsPlayViewModel.c(a6));
            } else {
                new com.bytedance.tux.g.b(this).e(R.string.de2).b();
            }
        }
        if (e()) {
            TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.e3p);
            h.f.b.l.b(tuxButton, "");
            tuxButton.setVisibility(8);
            TuxIconView tuxIconView4 = (TuxIconView) _$_findCachedViewById(R.id.e3r);
            h.f.b.l.b(tuxIconView4, "");
            tuxIconView4.setVisibility(8);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onCreate", false);
            return;
        }
        f.a.b.b unused = selectSubscribe(a(), c.f133280a, new ah(), new l(this));
        f.a.b.b unused2 = selectSubscribe(a(), d.f133281a, new ah(), new m(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ ShoutoutsPlayActivity this$0;

        static {
            Covode.recordClassIndex(87155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            super(2);
            this.this$0 = shoutoutsPlayActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(iVar, "");
            TuxTextView tuxTextView = (TuxTextView) this.this$0._$_findCachedViewById(R.id.e3i);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setText(new StringBuilder().append(intValue).append('%').toString());
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, a, z> {
        final /* synthetic */ ShoutoutsPlayActivity this$0;

        static {
            Covode.recordClassIndex(87150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            super(2);
            this.this$0 = shoutoutsPlayActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, a aVar) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            a aVar2 = aVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(aVar2, "");
            int i2 = b.f133279a[aVar2.ordinal()];
            if (i2 == 1 || i2 == 2) {
                RelativeLayout relativeLayout = (RelativeLayout) this.this$0._$_findCachedViewById(R.id.e3l);
                h.f.b.l.b(relativeLayout, "");
                relativeLayout.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) this.this$0._$_findCachedViewById(R.id.e3j);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                TuxButton tuxButton = (TuxButton) this.this$0._$_findCachedViewById(R.id.e3p);
                h.f.b.l.b(tuxButton, "");
                tuxButton.setVisibility(0);
                TuxButton tuxButton2 = (TuxButton) this.this$0._$_findCachedViewById(R.id.e3p);
                h.f.b.l.b(tuxButton2, "");
                tuxButton2.setEnabled(true);
            } else if (i2 == 3) {
                RelativeLayout relativeLayout2 = (RelativeLayout) this.this$0._$_findCachedViewById(R.id.e3l);
                h.f.b.l.b(relativeLayout2, "");
                relativeLayout2.setVisibility(8);
                TuxTextView tuxTextView2 = (TuxTextView) this.this$0._$_findCachedViewById(R.id.e3j);
                h.f.b.l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                TuxButton tuxButton3 = (TuxButton) this.this$0._$_findCachedViewById(R.id.e3p);
                h.f.b.l.b(tuxButton3, "");
                tuxButton3.setVisibility(4);
                TuxButton tuxButton4 = (TuxButton) this.this$0._$_findCachedViewById(R.id.e3p);
                h.f.b.l.b(tuxButton4, "");
                tuxButton4.setEnabled(false);
            } else if (i2 == 4) {
                RelativeLayout relativeLayout3 = (RelativeLayout) this.this$0._$_findCachedViewById(R.id.e3l);
                h.f.b.l.b(relativeLayout3, "");
                relativeLayout3.setVisibility(0);
                TuxTextView tuxTextView3 = (TuxTextView) this.this$0._$_findCachedViewById(R.id.e3j);
                h.f.b.l.b(tuxTextView3, "");
                tuxTextView3.setVisibility(8);
                TuxButton tuxButton5 = (TuxButton) this.this$0._$_findCachedViewById(R.id.e3p);
                h.f.b.l.b(tuxButton5, "");
                tuxButton5.setVisibility(4);
                TuxButton tuxButton6 = (TuxButton) this.this$0._$_findCachedViewById(R.id.e3p);
                h.f.b.l.b(tuxButton6, "");
                tuxButton6.setEnabled(false);
                TuxTextView tuxTextView4 = (TuxTextView) this.this$0._$_findCachedViewById(R.id.e3h);
                h.f.b.l.b(tuxTextView4, "");
                tuxTextView4.setText(this.this$0.getString(R.string.bcb));
                TuxTextView tuxTextView5 = (TuxTextView) this.this$0._$_findCachedViewById(R.id.e3i);
                h.f.b.l.b(tuxTextView5, "");
                tuxTextView5.setVisibility(0);
                ((TuxTextView) this.this$0._$_findCachedViewById(R.id.e3k)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.l.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ l f133257a;

                    static {
                        Covode.recordClassIndex(87151);
                    }

                    {
                        this.f133257a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        DownloadServiceManager.INSTANCE.getDownloadService().cancel(this.f133257a.this$0.a().f133270b);
                    }
                });
            } else if (i2 == 5) {
                RelativeLayout relativeLayout4 = (RelativeLayout) this.this$0._$_findCachedViewById(R.id.e3l);
                h.f.b.l.b(relativeLayout4, "");
                relativeLayout4.setVisibility(0);
                TuxTextView tuxTextView6 = (TuxTextView) this.this$0._$_findCachedViewById(R.id.e3j);
                h.f.b.l.b(tuxTextView6, "");
                tuxTextView6.setVisibility(8);
                TuxButton tuxButton7 = (TuxButton) this.this$0._$_findCachedViewById(R.id.e3p);
                h.f.b.l.b(tuxButton7, "");
                tuxButton7.setVisibility(4);
                TuxButton tuxButton8 = (TuxButton) this.this$0._$_findCachedViewById(R.id.e3p);
                h.f.b.l.b(tuxButton8, "");
                tuxButton8.setEnabled(false);
                iVar2.withState(this.this$0.a(), new h.f.a.b<ShoutoutsPlayState, z>(this) {
                    /* class com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.l.AnonymousClass2 */
                    final /* synthetic */ l this$0;

                    static {
                        Covode.recordClassIndex(87152);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$l$2$a */
                    public static final class a extends ClickableSpan {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass2 f133259a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ StyleSpan f133260b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f133261c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ String f133262d;

                        static {
                            Covode.recordClassIndex(87154);
                        }

                        public final void updateDrawState(TextPaint textPaint) {
                            h.f.b.l.d(textPaint, "");
                            textPaint.setColor(androidx.core.content.b.c(this.f133259a.this$0.this$0, R.color.a9));
                            textPaint.setUnderlineText(true);
                        }

                        public final void onClick(View view) {
                            h.f.b.l.d(view, "");
                            ShoutoutsPlayViewModel a2 = this.f133259a.this$0.this$0.a();
                            Context context = view.getContext();
                            h.f.b.l.b(context, "");
                            a2.a(context, this.f133259a.this$0.this$0.f133235a);
                        }

                        a(AnonymousClass2 r1, StyleSpan styleSpan, String str, String str2) {
                            this.f133259a = r1;
                            this.f133260b = styleSpan;
                            this.f133261c = str;
                            this.f133262d = str2;
                        }
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(ShoutoutsPlayState shoutoutsPlayState) {
                        h.f.b.l.d(shoutoutsPlayState, "");
                        TuxTextView tuxTextView = (TuxTextView) this.this$0.this$0._$_findCachedViewById(R.id.e3i);
                        h.f.b.l.b(tuxTextView, "");
                        tuxTextView.setText("");
                        TuxTextView tuxTextView2 = (TuxTextView) this.this$0.this$0._$_findCachedViewById(R.id.e3i);
                        h.f.b.l.b(tuxTextView2, "");
                        tuxTextView2.setVisibility(8);
                        String string = this.this$0.this$0.getString(R.string.fzc);
                        h.f.b.l.b(string, "");
                        String string2 = this.this$0.this$0.getString(R.string.g0a);
                        h.f.b.l.b(string2, "");
                        StyleSpan styleSpan = new StyleSpan(1);
                        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string).append((CharSequence) string2);
                        append.setSpan(styleSpan, string.length(), string.length() + string2.length(), 33);
                        append.setSpan(new a(this, styleSpan, string, string2), string.length(), string.length() + string2.length(), 33);
                        TuxTextView tuxTextView3 = (TuxTextView) this.this$0.this$0._$_findCachedViewById(R.id.e3h);
                        tuxTextView3.setText(append);
                        tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
                        tuxTextView3.setHighlightColor(0);
                        ((TuxTextView) this.this$0.this$0._$_findCachedViewById(R.id.e3k)).setOnClickListener(new View.OnClickListener(this) {
                            /* class com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.l.AnonymousClass2.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass2 f133258a;

                            static {
                                Covode.recordClassIndex(87153);
                            }

                            {
                                this.f133258a = r1;
                            }

                            public final void onClick(View view) {
                                ClickAgent.onClick(view);
                                ShoutoutsPlayViewModel a2 = this.f133258a.this$0.this$0.a();
                                DownloadServiceManager.INSTANCE.getDownloadService().cancel(a2.f133270b);
                                a2.c(ShoutoutsPlayViewModel.a.f133272a);
                            }
                        });
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    static /* synthetic */ com.ss.android.ugc.aweme.app.f.d a(ShoutoutsPlayActivity shoutoutsPlayActivity, boolean z, boolean z2, int i2) {
        String str;
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        String a2 = a(shoutoutsPlayActivity.getIntent(), "author_id");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        boolean a3 = h.f.b.l.a((Object) a2, (Object) g2.getCurUserId());
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        String a4 = a(shoutoutsPlayActivity.getIntent(), "enter_from");
        if (a4 == null) {
            a4 = "chat";
        }
        com.ss.android.ugc.aweme.app.f.d a5 = dVar.a("enter_from", a4).a("content_source", "shoutouts");
        if (a3) {
            str = "creator";
        } else {
            str = "consumer";
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("user_type", str).a("author_id", a(shoutoutsPlayActivity.getIntent(), "author_id")).a("group_id", a(shoutoutsPlayActivity.getIntent(), "aweme_id"));
        if (a3 && z2) {
            a6 = shoutoutsPlayActivity.e() ? a6.a("video_status", "review") : a6.a("video_status", "finish");
        }
        if (z) {
            String a7 = a(shoutoutsPlayActivity.getIntent(), "order_id");
            if (a7 == null) {
                a7 = "";
            }
            a6 = a6.a("order_id", a7);
        }
        h.f.b.l.b(a6, "");
        return a6;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
