package com.ss.android.ugc.aweme.feed.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.metrics.ap;
import com.ss.android.ugc.aweme.metrics.ar;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.j;
import com.ss.android.ugc.playerkit.videoview.k;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public final class VideoPlayActivity extends com.bytedance.ies.foundation.activity.a implements OnUIPlayListener {

    /* renamed from: g  reason: collision with root package name */
    public static final a f94184g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    KeepSurfaceTextureView f94185a;

    /* renamed from: b  reason: collision with root package name */
    Video f94186b;

    /* renamed from: c  reason: collision with root package name */
    String f94187c = "";

    /* renamed from: d  reason: collision with root package name */
    String f94188d = "";

    /* renamed from: e  reason: collision with root package name */
    String f94189e = "";

    /* renamed from: f  reason: collision with root package name */
    float f94190f;

    /* renamed from: h  reason: collision with root package name */
    private View f94191h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f94192i;

    /* renamed from: j  reason: collision with root package name */
    private ImageButton f94193j;

    /* renamed from: k  reason: collision with root package name */
    private final h f94194k = i.a((h.f.a.a) f.f94201a);

    /* renamed from: l  reason: collision with root package name */
    private String f94195l = "";

    /* renamed from: m  reason: collision with root package name */
    private boolean f94196m = true;
    private boolean n;
    private boolean o;
    private String p = "";
    private String q = "";
    private String r = "";
    private SparseArray s;

    static {
        Covode.recordClassIndex(59845);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.s == null) {
            this.s = new SparseArray();
        }
        View view = (View) this.s.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.s.put(i2, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final VideoViewComponent a() {
        return (VideoViewComponent) this.f94194k.getValue();
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
    public final void onPlayFailed(String str, l lVar) {
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
    public final void onPreParePlay(String str, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, l lVar) {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59846);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class f extends m implements h.f.a.a<VideoViewComponent> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f94201a = new f();

        static {
            Covode.recordClassIndex(59851);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoViewComponent invoke() {
            return new VideoViewComponent();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        if (a().g()) {
            a(false);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onResume", true);
        super.onResume();
        if (!a().g() && this.f94186b != null && !this.o) {
            a(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        ap o2 = new ap().a(this.p).o(this.q);
        o2.ai = this.r;
        o2.f();
        a().a(this.f94185a);
        a().b(this);
        j.a(this.f94185a).a(new e(this));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        a().a(this);
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

    public static final class e implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPlayActivity f94200a;

        static {
            Covode.recordClassIndex(59850);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(VideoPlayActivity videoPlayActivity) {
            this.f94200a = videoPlayActivity;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            KeepSurfaceTextureView keepSurfaceTextureView;
            VideoPlayActivity videoPlayActivity = this.f94200a;
            if (videoPlayActivity.f94186b == null) {
                Video video = new Video();
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setBytevc1(false);
                ArrayList arrayList = new ArrayList();
                h.a.n.a((Collection) arrayList, (h.l.h) p.a(videoPlayActivity.f94187c, new String[]{","}));
                videoUrlModel.setUrlList(arrayList);
                videoUrlModel.setSourceId(videoPlayActivity.f94189e);
                videoUrlModel.setUrlKey(videoPlayActivity.f94189e);
                if (videoUrlModel.getUrlList().size() == 1) {
                    List<String> urlList = videoUrlModel.getUrlList();
                    h.f.b.l.b(urlList, "");
                    videoUrlModel.setUri((String) h.a.n.g((List) urlList));
                }
                video.setPlayAddr(videoUrlModel);
                if (!p.a((CharSequence) videoPlayActivity.f94188d)) {
                    UrlModel urlModel = new UrlModel();
                    ArrayList arrayList2 = new ArrayList();
                    h.a.n.a((Collection) arrayList2, (h.l.h) p.a(videoPlayActivity.f94188d, new String[]{","}));
                    urlModel.setUri((String) h.a.n.h((List) arrayList2));
                    urlModel.setUrlList(arrayList2);
                    video.setCover(urlModel);
                }
                video.setSourceId(videoPlayActivity.f94189e);
                videoPlayActivity.f94186b = video;
            }
            videoPlayActivity.a().a(videoPlayActivity.f94186b);
            if (videoPlayActivity.f94190f > 0.0f && (keepSurfaceTextureView = videoPlayActivity.f94185a) != null) {
                keepSurfaceTextureView.setAlpha(0.0f);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(l lVar) {
        if (lVar != null) {
            Integer.valueOf(lVar.f148749d);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPlayActivity f94197a;

        static {
            Covode.recordClassIndex(59847);
        }

        b(VideoPlayActivity videoPlayActivity) {
            this.f94197a = videoPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94197a.finish();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPlayActivity f94198a;

        static {
            Covode.recordClassIndex(59848);
        }

        c(VideoPlayActivity videoPlayActivity) {
            this.f94198a = videoPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94198a.a(true);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPlayActivity f94199a;

        static {
            Covode.recordClassIndex(59849);
        }

        d(VideoPlayActivity videoPlayActivity) {
            this.f94199a = videoPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94199a.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(l lVar) {
        View view = this.f94191h;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        ar a2 = new ar().a(this.p);
        a2.v = this.q;
        a2.f();
        if (!this.f94196m) {
            finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(o oVar) {
        View view = this.f94191h;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.f94190f > 0.0f) {
            KeepSurfaceTextureView keepSurfaceTextureView = this.f94185a;
            if (keepSurfaceTextureView != null) {
                keepSurfaceTextureView.setAlpha(1.0f);
            }
            a().a(this.f94190f);
        }
    }

    public final void a(boolean z) {
        if (this.n) {
            if (!a().g() && this.f94186b != null) {
                a().a(this.f94186b);
                ImageButton imageButton = this.f94193j;
                if (imageButton != null) {
                    imageButton.setVisibility(8);
                }
                this.n = false;
                this.o = false;
            }
        } else if (a().g()) {
            a().b();
            ImageButton imageButton2 = this.f94193j;
            if (imageButton2 != null) {
                imageButton2.setVisibility(0);
            }
            this.n = true;
            if (z) {
                this.o = true;
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.wb);
        this.f94185a = (KeepSurfaceTextureView) findViewById(R.id.fhs);
        this.f94191h = findViewById(R.id.ci9);
        this.f94192i = (ImageView) findViewById(R.id.a7q);
        this.f94193j = (ImageButton) findViewById(R.id.d2_);
        ImageView imageView = this.f94192i;
        if (imageView != null) {
            imageView.setOnClickListener(new b(this));
        }
        KeepSurfaceTextureView keepSurfaceTextureView = this.f94185a;
        if (keepSurfaceTextureView != null) {
            keepSurfaceTextureView.setOnClickListener(new c(this));
        }
        ImageButton imageButton = this.f94193j;
        if (imageButton != null) {
            imageButton.setOnClickListener(new d(this));
        }
        String a2 = a(getIntent(), "play_addr_string");
        String str = "";
        if (a2 == null) {
            a2 = str;
        }
        this.f94187c = a2;
        String a3 = a(getIntent(), "cover_image_string");
        if (a3 == null) {
            a3 = str;
        }
        this.f94188d = a3;
        this.f94196m = getIntent().getBooleanExtra("loop", true);
        String a4 = a(getIntent(), "video_id");
        if (a4 == null) {
            a4 = str;
        }
        this.f94189e = a4;
        String a5 = a(getIntent(), "video_md5");
        if (a5 == null) {
            a5 = str;
        }
        this.f94195l = a5;
        String a6 = a(getIntent(), "enter_from");
        if (a6 == null) {
            a6 = str;
        }
        this.p = a6;
        String a7 = a(getIntent(), "video_type");
        if (a7 == null) {
            a7 = str;
        }
        this.q = a7;
        String a8 = a(getIntent(), "tag_line");
        if (a8 != null) {
            str = a8;
        }
        this.r = str;
        this.f94190f = getIntent().getFloatExtra("progress", 0.0f);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
