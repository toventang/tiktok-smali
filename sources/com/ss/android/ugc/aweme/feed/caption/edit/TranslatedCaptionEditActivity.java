package com.ss.android.ugc.aweme.feed.caption.edit;

import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.feed.caption.edit.CaptionEditApi;
import com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel;
import com.ss.android.ugc.aweme.feed.caption.edit.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.x.t;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class TranslatedCaptionEditActivity extends com.bytedance.ies.foundation.activity.a implements a.AbstractC2258a, OnUIPlayListener {
    public static final a p = new a((byte) 0);
    private long A = -1;
    private SparseArray B;

    /* renamed from: a  reason: collision with root package name */
    public HighLightLayoutManager f92814a;

    /* renamed from: b  reason: collision with root package name */
    public a f92815b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f92816c;

    /* renamed from: d  reason: collision with root package name */
    public String f92817d;

    /* renamed from: e  reason: collision with root package name */
    public Video f92818e;

    /* renamed from: f  reason: collision with root package name */
    boolean f92819f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f92820g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f92821h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f92822i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f92823j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f92824k;

    /* renamed from: l  reason: collision with root package name */
    public float f92825l = 0.004f;

    /* renamed from: m  reason: collision with root package name */
    public int f92826m;
    long n = -1;
    long o = -1;
    private final h.h q = h.i.a((h.f.a.a) new b(this));
    private final h.h r = h.i.a((h.f.a.a) r.f92841a);
    private final h.h s = h.i.a((h.f.a.a) new q(this));
    private final h.h t = h.i.a((h.f.a.a) new p(this));
    private final h.h u = h.i.a((h.f.a.a) new n(this));
    private final h.h v = h.i.a((h.f.a.a) new i(this));
    private final h.h w = h.i.a((h.f.a.a) new l(this));
    private final h.h x = h.i.a((h.f.a.a) new o(this));
    private final h.h y = h.i.a((h.f.a.a) new c(this));
    private String z;

    static {
        Covode.recordClassIndex(58870);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.B;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.B == null) {
            this.B = new SparseArray();
        }
        View view = (View) this.B.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.B.put(i2, findViewById);
        return findViewById;
    }

    public final EditCaptionViewModel a() {
        return (EditCaptionViewModel) this.q.getValue();
    }

    public final VideoViewComponent b() {
        return (VideoViewComponent) this.r.getValue();
    }

    /* access modifiers changed from: package-private */
    public final FrameLayout c() {
        return (FrameLayout) this.t.getValue();
    }

    public final DmtStatusView d() {
        return (DmtStatusView) this.u.getValue();
    }

    public final View e() {
        return (View) this.v.getValue();
    }

    public final RecyclerView f() {
        return (RecyclerView) this.w.getValue();
    }

    public final com.ss.android.ugc.aweme.views.i g() {
        return (com.ss.android.ugc.aweme.views.i) this.y.getValue();
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
    public final void onBuffering(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z2) {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
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
    public final void onPlayStop(String str, boolean z2) {
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
    public final void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i2, float f2) {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(58873);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.views.i> {
        final /* synthetic */ TranslatedCaptionEditActivity this$0;

        static {
            Covode.recordClassIndex(58875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.this$0 = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.views.i invoke() {
            return new com.ss.android.ugc.aweme.views.i(this.this$0);
        }
    }

    public static final class k implements com.ss.android.ugc.playerkit.videoview.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslatedCaptionEditActivity f92837a;

        static {
            Covode.recordClassIndex(58891);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
            this.f92837a.f92822i = false;
        }

        k(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f92837a = translatedCaptionEditActivity;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            this.f92837a.f92822i = true;
            this.f92837a.h();
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<VideoViewComponent> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f92841a = new r();

        static {
            Covode.recordClassIndex(58904);
        }

        r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoViewComponent invoke() {
            return new VideoViewComponent();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ TranslatedCaptionEditActivity this$0;

        static {
            Covode.recordClassIndex(58889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.this$0 = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.fgr);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ TranslatedCaptionEditActivity this$0;

        static {
            Covode.recordClassIndex(58892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.this$0 = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.findViewById(R.id.asg);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<DmtStatusView> {
        final /* synthetic */ TranslatedCaptionEditActivity this$0;

        static {
            Covode.recordClassIndex(58900);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.this$0 = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.this$0.findViewById(R.id.ci4);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<TextTitleBar> {
        final /* synthetic */ TranslatedCaptionEditActivity this$0;

        static {
            Covode.recordClassIndex(58901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.this$0 = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextTitleBar invoke() {
            return this.this$0.findViewById(R.id.atm);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ TranslatedCaptionEditActivity this$0;

        static {
            Covode.recordClassIndex(58902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.this$0 = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            return this.this$0.findViewById(R.id.fhs);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ TranslatedCaptionEditActivity this$0;

        static {
            Covode.recordClassIndex(58903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.this$0 = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            return this.this$0.findViewById(R.id.d66);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<EditCaptionViewModel> {
        final /* synthetic */ TranslatedCaptionEditActivity this$0;

        static {
            Covode.recordClassIndex(58874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            super(0);
            this.this$0 = translatedCaptionEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditCaptionViewModel invoke() {
            ac a2 = ae.a(this.this$0, (ad.b) null).a(EditCaptionViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    public final void h() {
        if (this.f92822i && this.f92818e != null) {
            b().a(this.f92818e);
            c().setOnClickListener(new j(this));
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        if (d().getVisibility() == 8 && this.f92818e != null && b().g()) {
            a(false);
        }
        this.n += SystemClock.elapsedRealtime() - this.o;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onResume", true);
        super.onResume();
        if (d().getVisibility() == 8 && this.f92818e != null && !b().g() && !this.f92821h) {
            a(false);
        }
        this.o = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
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

    /* access modifiers changed from: package-private */
    public final String i() {
        Long l2;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        T t2;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        Aweme aweme = this.f92816c;
        if (aweme == null || (video2 = aweme.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Aweme aweme2 = this.f92816c;
        if (!(aweme2 == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null)) {
            Iterator<T> it = captionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                long languageId = t2.getLanguageId();
                if (l2 != null && l2.longValue() == languageId) {
                    break;
                }
            }
            T t3 = t2;
            if (t3 != null) {
                return t3.getLanguageName();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final String j() {
        Long l2;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        T t2;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        Aweme aweme = this.f92816c;
        if (aweme == null || (video2 = aweme.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Aweme aweme2 = this.f92816c;
        if (!(aweme2 == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null)) {
            Iterator<T> it = captionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                long languageId = t2.getLanguageId();
                if (l2 != null) {
                    if (l2.longValue() != languageId) {
                        break;
                    }
                } else {
                    break;
                }
            }
            T t3 = t2;
            if (t3 != null) {
                return t3.getLanguageName();
            }
        }
        return null;
    }

    public final String k() {
        Long l2;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        T t2;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        Aweme aweme = this.f92816c;
        if (aweme == null || (video2 = aweme.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Aweme aweme2 = this.f92816c;
        if (!(aweme2 == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null)) {
            Iterator<T> it = captionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                long languageId = t2.getLanguageId();
                if (l2 != null) {
                    if (l2.longValue() != languageId) {
                        break;
                    }
                } else {
                    break;
                }
            }
            T t3 = t2;
            if (t3 != null) {
                return t3.getClaSubtitleId();
            }
        }
        return null;
    }

    public final class HighLightLayoutManager extends LinearLayoutManager {
        static {
            Covode.recordClassIndex(58871);
        }

        public final class a extends androidx.recyclerview.widget.r {
            static {
                Covode.recordClassIndex(58872);
            }

            @Override // androidx.recyclerview.widget.r
            public final int a(int i2, int i3, int i4, int i5, int i6) {
                return i4 - i2;
            }

            @Override // androidx.recyclerview.widget.r
            public final int c() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r
            public final PointF c(int i2) {
                return HighLightLayoutManager.this.d(i2);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
                if (r0 == null) goto L_0x0010;
             */
            @Override // androidx.recyclerview.widget.r
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final float a(android.util.DisplayMetrics r3) {
                /*
                    r2 = this;
                    com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity$HighLightLayoutManager r0 = com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.HighLightLayoutManager.this
                    com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity r0 = com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.this
                    float r1 = r0.f92825l
                    if (r3 == 0) goto L_0x001a
                    int r0 = r3.densityDpi
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    if (r0 != 0) goto L_0x0013
                L_0x0010:
                    h.f.b.l.b()
                L_0x0013:
                    int r0 = r0.intValue()
                    float r0 = (float) r0
                    float r1 = r1 / r0
                    return r1
                L_0x001a:
                    r0 = 0
                    goto L_0x0010
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.HighLightLayoutManager.a.a(android.util.DisplayMetrics):float");
            }

            public a(Context context) {
                super(context);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public HighLightLayoutManager() {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
        public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
            Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            a aVar = new a(context);
            aVar.f3862g = i2;
            a(aVar);
        }
    }

    public static final class m implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslatedCaptionEditActivity f92838a;

        static {
            Covode.recordClassIndex(58893);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f92838a = translatedCaptionEditActivity;
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
            final /* synthetic */ m this$0;

            static {
                Covode.recordClassIndex(58894);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(m mVar) {
                super(1);
                this.this$0 = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                com.bytedance.tux.dialog.b.b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                bVar2.a(R.string.afm, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.m.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(58895);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        h.f.b.l.d(aVar, "");
                        this.this$0.this$0.f92838a.finish();
                        return z.f158842a;
                    }
                });
                bVar2.b(R.string.afl, AnonymousClass2.f92839a);
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
            final /* synthetic */ b $checkboxView;
            final /* synthetic */ m this$0;

            static {
                Covode.recordClassIndex(58897);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(m mVar, b bVar) {
                super(1);
                this.this$0 = mVar;
                this.$checkboxView = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                com.bytedance.tux.dialog.b.b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                bVar2.a(R.string.afp, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.m.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(58898);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        int i2;
                        String str;
                        List<CaptionData> transSubtitleItem;
                        CaptionData captionData;
                        Video video;
                        EditCaptionItem editCaptionItem;
                        h.f.b.l.d(aVar, "");
                        this.this$0.this$0.f92838a.g().show();
                        this.this$0.this$0.f92838a.f92824k = this.this$0.$checkboxView.getCheckbox().isChecked();
                        String k2 = this.this$0.this$0.f92838a.k();
                        if (k2 != null) {
                            TranslatedCaptionCacheServiceImpl.j().c(k2);
                        }
                        EditCaptionViewModel a2 = this.this$0.this$0.f92838a.a();
                        String str2 = this.this$0.this$0.f92838a.f92817d;
                        if (!(str2 == null || (editCaptionItem = a2.f92794a) == null)) {
                            new f.a.b.a().a(CaptionEditApi.a.a(str2, editCaptionItem.getTransSubtitleItem(), editCaptionItem.getSrcSubtitleItem()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new EditCaptionViewModel.j(a2, str2), new EditCaptionViewModel.k(a2, str2)));
                        }
                        TranslatedCaptionEditActivity translatedCaptionEditActivity = this.this$0.this$0.f92838a;
                        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", TranslatedCaptionEditActivity.a(translatedCaptionEditActivity.getIntent(), "enter_from")).a("enter_method", TranslatedCaptionEditActivity.a(translatedCaptionEditActivity.getIntent(), "enter_method")).a("group_id", com.ss.android.ugc.aweme.metrics.ac.e(translatedCaptionEditActivity.f92816c)).a("author_id", com.ss.android.ugc.aweme.metrics.ac.a(translatedCaptionEditActivity.f92816c));
                        Aweme aweme = translatedCaptionEditActivity.f92816c;
                        int i3 = 0;
                        if (aweme == null || (video = aweme.getVideo()) == null || !video.isLongVideo()) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("is_long", i2).a("video_lang", translatedCaptionEditActivity.i()).a("transl_lang", translatedCaptionEditActivity.j());
                        EditCaptionViewModel a5 = translatedCaptionEditActivity.a();
                        Iterator<T> it = a5.f92795b.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                h.a.n.a();
                            }
                            EditCaptionItem editCaptionItem2 = a5.f92794a;
                            if (editCaptionItem2 == null || (transSubtitleItem = editCaptionItem2.getTransSubtitleItem()) == null || (captionData = transSubtitleItem.get(i4)) == null) {
                                str = null;
                            } else {
                                str = captionData.getText();
                            }
                            if (!h.f.b.l.a((Object) str, (Object) next)) {
                                i3 = 1;
                                break;
                            }
                            i4 = i5;
                        }
                        com.ss.android.ugc.aweme.common.r.a("submit_transl", a4.a("has_edit", i3).a("is_start_next", translatedCaptionEditActivity.f92824k ? 1 : 0).a("stay_time", (SystemClock.elapsedRealtime() - translatedCaptionEditActivity.o) + translatedCaptionEditActivity.n).f66730a);
                        translatedCaptionEditActivity.o = SystemClock.elapsedRealtime();
                        return z.f158842a;
                    }
                });
                bVar2.b(R.string.afl, AnonymousClass2.f92840a);
                return z.f158842a;
            }
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f92838a.f92823j = false;
            TranslatedCaptionEditActivity.a(this.f92838a).a();
            com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(this.f92838a).a(R.string.afo).b(R.string.afn), new a(this)).a().b().show();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            List<CaptionData> transSubtitleItem;
            if (this.f92838a.f92822i) {
                this.f92838a.b().b();
                this.f92838a.f92820g = true;
                this.f92838a.f92821h = true;
                this.f92838a.e().setVisibility(0);
                EditCaptionItem editCaptionItem = this.f92838a.a().f92794a;
                if (!(editCaptionItem == null || (transSubtitleItem = editCaptionItem.getTransSubtitleItem()) == null)) {
                    int i2 = 0;
                    for (T t : transSubtitleItem) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            h.a.n.a();
                        }
                        T t2 = t;
                        String text = t2.getText();
                        Objects.requireNonNull(text, "null cannot be cast to non-null type kotlin.CharSequence");
                        if (h.m.p.b((CharSequence) text).toString().length() == 0) {
                            TranslatedCaptionEditActivity.a(this.f92838a).f92846e = true;
                            this.f92838a.b().a((((float) t2.getStartTime()) * 100.0f) / ((float) this.f92838a.b().f()));
                            this.f92838a.f92826m = t2.getEndTime();
                            this.f92838a.f92823j = true;
                            HighLightLayoutManager highLightLayoutManager = this.f92838a.f92814a;
                            if (highLightLayoutManager == null) {
                                h.f.b.l.a("highLightLayoutManager");
                            }
                            highLightLayoutManager.a(this.f92838a.f(), new RecyclerView.s(), i2);
                            TranslatedCaptionEditActivity.a(this.f92838a).a(i2);
                            RecyclerView.ViewHolder f2 = this.f92838a.f().f(i2);
                            if (f2 != null) {
                                Objects.requireNonNull(f2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
                                a.b bVar = (a.b) f2;
                                bVar.f92851b.requestFocus();
                                KeyboardUtils.a(bVar.f92851b);
                            }
                            new com.bytedance.tux.g.b(this.f92838a).e(R.string.afc).b();
                            return;
                        }
                        i2 = i3;
                    }
                }
                this.f92838a.f92823j = false;
                TranslatedCaptionEditActivity.a(this.f92838a).a();
                b bVar2 = new b(this.f92838a, (byte) 0);
                com.bytedance.tux.dialog.b.c.a(com.bytedance.tux.dialog.a.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(this.f92838a).a(R.string.afs).b(R.string.afr), bVar2), new b(this, bVar2)).a().b().show();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        b().i();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        b().h();
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslatedCaptionEditActivity f92830a;

        static {
            Covode.recordClassIndex(58877);
        }

        e(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f92830a = translatedCaptionEditActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            if (hk.a(str)) {
                this.f92830a.f92817d = str;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslatedCaptionEditActivity f92836a;

        static {
            Covode.recordClassIndex(58890);
        }

        j(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f92836a = translatedCaptionEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92836a.a(true);
        }
    }

    public static final /* synthetic */ a a(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
        a aVar = translatedCaptionEditActivity.f92815b;
        if (aVar == null) {
            h.f.b.l.a("editCaptionAdapter");
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(com.ss.android.ugc.playerkit.model.o oVar) {
        h.f.b.l.d(oVar, "");
        a(true);
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslatedCaptionEditActivity f92835a;

        static {
            Covode.recordClassIndex(58888);
        }

        h(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f92835a = translatedCaptionEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92835a.f92823j = false;
            TranslatedCaptionEditActivity.a(this.f92835a).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (this.f92823j) {
            b().b();
            this.f92820g = true;
            this.f92821h = true;
            e().setVisibility(0);
            a aVar = this.f92815b;
            if (aVar == null) {
                h.f.b.l.a("editCaptionAdapter");
            }
            aVar.b();
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslatedCaptionEditActivity f92829a;

        static {
            Covode.recordClassIndex(58876);
        }

        d(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f92829a = translatedCaptionEditActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Aweme aweme = (Aweme) obj;
            if (aweme != null) {
                this.f92829a.f92816c = aweme;
                this.f92829a.f92818e = aweme.getVideo();
                this.f92829a.d().d();
                this.f92829a.d().setVisibility(8);
                TranslatedCaptionEditActivity translatedCaptionEditActivity = this.f92829a;
                if (!translatedCaptionEditActivity.f92819f) {
                    translatedCaptionEditActivity.c().setVisibility(0);
                    if (aweme.getVideo() != null) {
                        translatedCaptionEditActivity.b().a(translatedCaptionEditActivity.c());
                        translatedCaptionEditActivity.b().b(translatedCaptionEditActivity);
                        translatedCaptionEditActivity.b().f148883b.a(new k(translatedCaptionEditActivity));
                        translatedCaptionEditActivity.f92819f = true;
                    }
                }
                this.f92829a.h();
                TranslatedCaptionEditActivity.a(this.f92829a).notifyDataSetChanged();
                this.f92829a.f().setVisibility(0);
                this.f92829a.b(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.caption.edit.a.AbstractC2258a
    public final void a(int i2) {
        EditCaptionViewModel a2;
        EditCaptionItem editCaptionItem;
        List<CaptionData> srcSubtitleItem;
        CaptionData captionData;
        a aVar = this.f92815b;
        if (aVar == null) {
            h.f.b.l.a("editCaptionAdapter");
        }
        if (!(aVar.f92842a == i2 || (a2 = a()) == null || (editCaptionItem = a2.f92794a) == null || (srcSubtitleItem = editCaptionItem.getSrcSubtitleItem()) == null || (captionData = srcSubtitleItem.get(i2)) == null)) {
            b().a((((float) captionData.getStartTime()) * 100.0f) / ((float) b().f()));
            this.f92826m = captionData.getEndTime();
        }
        if (this.f92823j) {
            a aVar2 = this.f92815b;
            if (aVar2 == null) {
                h.f.b.l.a("editCaptionAdapter");
            }
            if (aVar2.f92842a == i2) {
                return;
            }
        }
        b().b();
        this.f92820g = true;
        this.f92821h = true;
        this.f92823j = true;
        e().setVisibility(0);
        a aVar3 = this.f92815b;
        if (aVar3 == null) {
            h.f.b.l.a("editCaptionAdapter");
        }
        aVar3.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.feed.caption.edit.a.AbstractC2258a
    public final void b(int i2) {
        EditCaptionItem editCaptionItem;
        List<CaptionData> srcSubtitleItem;
        CaptionData captionData;
        EditCaptionViewModel a2 = a();
        if (!(a2 == null || (editCaptionItem = a2.f92794a) == null || (srcSubtitleItem = editCaptionItem.getSrcSubtitleItem()) == null || (captionData = srcSubtitleItem.get(i2)) == null)) {
            b().a((((float) captionData.getStartTime()) * 100.0f) / ((float) b().f()));
            this.f92826m = captionData.getEndTime();
        }
        this.f92823j = true;
        b().a();
        this.f92820g = false;
        this.f92821h = false;
        e().setVisibility(8);
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslatedCaptionEditActivity f92831a;

        static {
            Covode.recordClassIndex(58878);
        }

        f(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f92831a = translatedCaptionEditActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 3025001) {
                this.f92831a.d().d();
                this.f92831a.d().setVisibility(8);
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(this.f92831a).a(R.string.aef).b(R.string.aee).a(false), new h.f.a.b<com.bytedance.tux.dialog.b.b, z>(this) {
                    /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.f.AnonymousClass1 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(58879);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                        com.bytedance.tux.dialog.b.b bVar2 = bVar;
                        h.f.b.l.d(bVar2, "");
                        bVar2.a(R.string.aec, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.f.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(58880);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                h.f.b.l.d(aVar, "");
                                SmartRouter.buildRoute(this.this$0.this$0.f92831a, "//caption/translate/edit").withParam("enter_from", a(this.this$0.this$0.f92831a.getIntent(), "enter_from")).withParam("enter_method", "edited_another").withParam("video_lang", a(this.this$0.this$0.f92831a.getIntent(), "video_lang")).withParam("transl_lang", a(this.this$0.this$0.f92831a.getIntent(), "transl_lang")).open();
                                this.this$0.this$0.f92831a.finish();
                                return z.f158842a;
                            }

                            private static String a(Intent intent, String str) {
                                try {
                                    return intent.getStringExtra(str);
                                } catch (Exception unused) {
                                    return null;
                                }
                            }
                        });
                        bVar2.b(R.string.aeb, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.f.AnonymousClass1.AnonymousClass2 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(58881);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                h.f.b.l.d(aVar, "");
                                this.this$0.this$0.f92831a.finish();
                                return z.f158842a;
                            }
                        });
                        return z.f158842a;
                    }
                }).a().b().show();
            } else if (num != null && num.intValue() == 3025002) {
                this.f92831a.b(true);
                this.f92831a.d().d();
                this.f92831a.d().setVisibility(8);
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(this.f92831a).a(R.string.aef).b(R.string.aed).a(false), new h.f.a.b<com.bytedance.tux.dialog.b.b, z>(this) {
                    /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.f.AnonymousClass2 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(58882);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                        com.bytedance.tux.dialog.b.b bVar2 = bVar;
                        h.f.b.l.d(bVar2, "");
                        bVar2.a(R.string.aec, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.f.AnonymousClass2.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(58883);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                h.f.b.l.d(aVar, "");
                                SmartRouter.buildRoute(this.this$0.this$0.f92831a, "//caption/translate/edit").withParam("enter_from", a(this.this$0.this$0.f92831a.getIntent(), "enter_from")).withParam("enter_method", "edited_another").withParam("video_lang", a(this.this$0.this$0.f92831a.getIntent(), "video_lang")).withParam("transl_lang", a(this.this$0.this$0.f92831a.getIntent(), "transl_lang")).open();
                                this.this$0.this$0.f92831a.finish();
                                return z.f158842a;
                            }

                            private static String a(Intent intent, String str) {
                                try {
                                    return intent.getStringExtra(str);
                                } catch (Exception unused) {
                                    return null;
                                }
                            }
                        });
                        bVar2.b(R.string.aeb, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.f.AnonymousClass2.AnonymousClass2 */
                            final /* synthetic */ AnonymousClass2 this$0;

                            static {
                                Covode.recordClassIndex(58884);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                h.f.b.l.d(aVar, "");
                                this.this$0.this$0.f92831a.finish();
                                return z.f158842a;
                            }
                        });
                        return z.f158842a;
                    }
                }).a().b().show();
            } else if (num.intValue() > 0) {
                this.f92831a.b(true);
                this.f92831a.d().d();
                this.f92831a.d().setVisibility(8);
                new com.bytedance.tux.g.b(this.f92831a).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).e(R.string.g21).b();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.f.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f92832a;

                    static {
                        Covode.recordClassIndex(58885);
                    }

                    {
                        this.f92832a = r1;
                    }

                    public final void run() {
                        this.f92832a.f92831a.finish();
                    }
                }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslatedCaptionEditActivity f92833a;

        static {
            Covode.recordClassIndex(58886);
        }

        g(TranslatedCaptionEditActivity translatedCaptionEditActivity) {
            this.f92833a = translatedCaptionEditActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 0) {
                if (this.f92833a.g().isShowing()) {
                    this.f92833a.g().dismiss();
                }
                new com.bytedance.tux.g.b(this.f92833a).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).e(R.string.aft).b();
                EventCenter.a().a("cla_edit_translation_submit_success", "{}");
                String k2 = this.f92833a.k();
                if (k2 != null) {
                    TranslatedCaptionCacheServiceImpl.j().c(k2);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity.g.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f92834a;

                    static {
                        Covode.recordClassIndex(58887);
                    }

                    {
                        this.f92834a = r1;
                    }

                    public final void run() {
                        if (this.f92834a.f92833a.f92824k) {
                            SmartRouter.buildRoute(this.f92834a.f92833a, "//caption/translate/edit").withParam("enter_from", a(this.f92834a.f92833a.getIntent(), "enter_from")).withParam("enter_method", "submit_another").withParam("video_lang", a(this.f92834a.f92833a.getIntent(), "video_lang")).withParam("transl_lang", a(this.f92834a.f92833a.getIntent(), "transl_lang")).open();
                        } else {
                            TranslatedCaptionEditActivity translatedCaptionEditActivity = this.f92834a.f92833a;
                            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                            h.f.b.l.b(g2, "");
                            String curUserId = g2.getCurUserId();
                            h.f.b.l.b(curUserId, "");
                            String a2 = a(this.f92834a.f92833a.getIntent(), "enter_from");
                            if (a2 == null) {
                                a2 = "";
                            }
                            h.f.b.l.b(a2, "");
                            t.a(translatedCaptionEditActivity, curUserId, a2, "video", true, null);
                        }
                        this.f92834a.f92833a.finish();
                    }

                    private static String a(Intent intent, String str) {
                        try {
                            return intent.getStringExtra(str);
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            } else if (num.intValue() > 0) {
                if (this.f92833a.g().isShowing()) {
                    this.f92833a.g().dismiss();
                }
                new com.bytedance.tux.g.b(this.f92833a).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).e(R.string.aft).b();
            }
        }
    }

    public final void a(boolean z2) {
        if (this.f92820g) {
            if (!b().g() && this.f92818e != null) {
                this.f92823j = false;
                a aVar = this.f92815b;
                if (aVar == null) {
                    h.f.b.l.a("editCaptionAdapter");
                }
                aVar.a();
                b().a();
                this.f92820g = false;
                this.f92821h = false;
                e().setVisibility(8);
            }
        } else if (b().g()) {
            b().b();
            if (this.f92823j) {
                a aVar2 = this.f92815b;
                if (aVar2 == null) {
                    h.f.b.l.a("editCaptionAdapter");
                }
                aVar2.b();
            }
            this.f92820g = true;
            if (z2) {
                this.f92821h = true;
                e().setVisibility(0);
            }
        }
    }

    public final void b(boolean z2) {
        Video video;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a(getIntent(), "enter_from")).a("enter_method", a(getIntent(), "enter_method")).a("group_id", com.ss.android.ugc.aweme.metrics.ac.e(this.f92816c)).a("author_id", com.ss.android.ugc.aweme.metrics.ac.a(this.f92816c));
        Aweme aweme = this.f92816c;
        int i2 = 1;
        if (aweme == null || (video = aweme.getVideo()) == null || !video.isLongVideo()) {
            i2 = 0;
        }
        com.ss.android.ugc.aweme.common.r.a("transl_caption_loaded", a2.a("is_long", i2).a("video_lang", i()).a("transl_lang", j()).a("load_time", SystemClock.elapsedRealtime() - this.A).a("is_popup", z2 ? 1 : 0).f66730a);
        this.A = -1;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f2) {
        List<CaptionData> srcSubtitleItem;
        EditCaptionViewModel a2;
        EditCaptionItem editCaptionItem;
        List<CaptionData> srcSubtitleItem2;
        CaptionData captionData;
        int i2 = 0;
        if (!this.f92823j) {
            long e2 = b().e();
            EditCaptionItem editCaptionItem2 = a().f92794a;
            if (!(editCaptionItem2 == null || (srcSubtitleItem = editCaptionItem2.getSrcSubtitleItem()) == null)) {
                for (T t2 : srcSubtitleItem) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        h.a.n.a();
                    }
                    T t3 = t2;
                    if (((long) t3.getStartTime()) > e2 || e2 >= ((long) t3.getEndTime())) {
                        i2 = i3;
                    } else if (i2 >= 0) {
                        a aVar = this.f92815b;
                        if (aVar == null) {
                            h.f.b.l.a("editCaptionAdapter");
                        }
                        if (aVar.f92842a != i2) {
                            a aVar2 = this.f92815b;
                            if (aVar2 == null) {
                                h.f.b.l.a("editCaptionAdapter");
                            }
                            if (i2 < aVar2.getItemCount()) {
                                a aVar3 = this.f92815b;
                                if (aVar3 == null) {
                                    h.f.b.l.a("editCaptionAdapter");
                                }
                                if (!(i2 != aVar3.f92842a - 1 || (a2 = a()) == null || (editCaptionItem = a2.f92794a) == null || (srcSubtitleItem2 = editCaptionItem.getSrcSubtitleItem()) == null || (captionData = srcSubtitleItem2.get(i2)) == null)) {
                                    if (((long) captionData.getEndTime()) - b().e() <= 100) {
                                        return;
                                    }
                                }
                                if (i2 == 0) {
                                    this.f92825l = 0.004f;
                                } else {
                                    this.f92825l = 400.0f;
                                }
                                HighLightLayoutManager highLightLayoutManager = this.f92814a;
                                if (highLightLayoutManager == null) {
                                    h.f.b.l.a("highLightLayoutManager");
                                }
                                highLightLayoutManager.a(f(), new RecyclerView.s(), i2);
                                a aVar4 = this.f92815b;
                                if (aVar4 == null) {
                                    h.f.b.l.a("editCaptionAdapter");
                                }
                                aVar4.a(i2);
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        } else if ((((float) b().f()) * f2) / 100.0f >= ((float) this.f92826m)) {
            b().b();
            this.f92820g = true;
            this.f92821h = true;
            e().setVisibility(0);
            a aVar5 = this.f92815b;
            if (aVar5 == null) {
                h.f.b.l.a("editCaptionAdapter");
            }
            aVar5.b();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        f.a.b.b bVar;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onCreate", true);
        super.onCreate(bundle);
        this.A = SystemClock.elapsedRealtime();
        this.o = SystemClock.elapsedRealtime();
        setContentView(R.layout.s0);
        try {
            this.f92817d = a(getIntent(), "subtitle_id");
            this.z = a(getIntent(), "enter_from");
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            h.f.b.l.b(window, "");
            window.setNavigationBarColor(-16777216);
        }
        d().setBuilder(DmtStatusView.a.a(this));
        com.ss.android.ugc.aweme.common.r.a("enter_edit_transl_page", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a(getIntent(), "enter_from")).a("enter_method", a(getIntent(), "enter_method")).a("group_id", a(getIntent(), "group_id")).a("author_id", a(getIntent(), "author_id")).a("is_long", getIntent().getIntExtra("is_long", 0)).a("video_lang", a(getIntent(), "video_lang")).a("transl_lang", a(getIntent(), "transl_lang")).f66730a);
        d().setVisibility(0);
        d().f();
        EditCaptionViewModel a2 = a();
        String str = this.f92817d;
        if (str == null || str.length() == 0) {
            bVar = CaptionEditApi.a.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new EditCaptionViewModel.b(a2), new EditCaptionViewModel.c(a2));
            h.f.b.l.b(bVar, "");
        } else {
            bVar = CaptionEditApi.a.a(str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new EditCaptionViewModel.d(a2), new EditCaptionViewModel.e(a2));
            h.f.b.l.b(bVar, "");
        }
        new f.a.b.a().a(bVar);
        a().a().observe(this, new d(this));
        a().b().observe(this, new e(this));
        a().c().observe(this, new f(this));
        a().d().observe(this, new g(this));
        this.f92815b = new a(a(), this);
        this.f92814a = new HighLightLayoutManager();
        RecyclerView f2 = f();
        HighLightLayoutManager highLightLayoutManager = this.f92814a;
        if (highLightLayoutManager == null) {
            h.f.b.l.a("highLightLayoutManager");
        }
        f2.setLayoutManager(highLightLayoutManager);
        a aVar = this.f92815b;
        if (aVar == null) {
            h.f.b.l.a("editCaptionAdapter");
        }
        f2.setAdapter(aVar);
        RecyclerView.f itemAnimator = f2.getItemAnimator();
        if (itemAnimator != null) {
            ((ab) itemAnimator).f3953m = false;
            ((FrameLayout) this.s.getValue()).setOnClickListener(new h(this));
            ((TextTitleBar) this.x.getValue()).setOnTitleBarClickListener(new m(this));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onCreate", false);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.caption.edit.TranslatedCaptionEditActivity", "onCreate", false);
        throw nullPointerException;
    }

    static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
