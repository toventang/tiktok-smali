package com.ss.android.ugc.aweme.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.seekbar.f;
import com.ss.android.ugc.aweme.metrics.ap;
import com.ss.android.ugc.aweme.metrics.ar;
import com.ss.android.ugc.aweme.metrics.as;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.l.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class e extends FrameLayout implements OnUIPlayListener, i, j {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f144204c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f144205d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f144206a;

    /* renamed from: b  reason: collision with root package name */
    Aweme f144207b;

    /* renamed from: e  reason: collision with root package name */
    private long f144208e;

    /* renamed from: f  reason: collision with root package name */
    private final h f144209f;

    /* renamed from: g  reason: collision with root package name */
    private final h f144210g;

    static {
        Covode.recordClassIndex(94372);
    }

    public final androidx.fragment.app.e getCurrentActivity$eoy_release() {
        return (androidx.fragment.app.e) this.f144210g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.newfollow.c.c getMPlayVideoHelper() {
        return (com.ss.android.ugc.aweme.newfollow.c.c) this.f144209f.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(146, new g(e.class, "subscribeUserClickPause", f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
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
    public final void onPlayFailed(l lVar) {
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
    public final void onRenderFirstFrame(o oVar) {
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
    public final void onRetryOnError(l lVar) {
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

    public static final class a {
        static {
            Covode.recordClassIndex(94373);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.newfollow.c.c> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(94376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.newfollow.c.c invoke() {
            return new com.ss.android.ugc.aweme.newfollow.c.c((KeepSurfaceTextureView) this.this$0.findViewById(R.id.efe), this.this$0);
        }
    }

    static final class b extends m implements h.f.a.a<androidx.fragment.app.e> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(94374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.e invoke() {
            Object obj;
            Iterator a2 = k.a(this.$context, AnonymousClass1.f144225a).a();
            while (true) {
                if (!a2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = a2.next();
                if (obj instanceof Activity) {
                    break;
                }
            }
            if (!(obj instanceof androidx.fragment.app.e)) {
                return null;
            }
            return obj;
        }
    }

    public final void a() {
        new ap().g(this.f144207b).a("eoy_hub").f();
        this.f144208e = System.currentTimeMillis();
        getMPlayVideoHelper().f();
    }

    public final void b() {
        if (this.f144208e != 0) {
            as a2 = new as().g(this.f144207b).a("eoy_hub");
            a2.f109523a = System.currentTimeMillis() - this.f144208e;
            a2.f();
            this.f144208e = 0;
        }
        getMPlayVideoHelper().e();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        setMuted(f144204c);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        new ar().a("eoy_hub").g(this.f144207b).f();
    }

    public final void setMuted(boolean z) {
        hashCode();
        Aweme aweme = this.f144207b;
        if (aweme != null) {
            aweme.getAid();
        }
        f144204c = z;
        if (z) {
            getMPlayVideoHelper().g();
        } else {
            getMPlayVideoHelper().h();
        }
    }

    public final void setSrc(Aweme aweme) {
        h.f.b.l.d(aweme, "");
        this.f144207b = aweme;
        getMPlayVideoHelper().a(aweme);
        hashCode();
        Aweme aweme2 = this.f144207b;
        if (aweme2 != null) {
            aweme2.getAid();
        }
    }

    @r
    public final void subscribeUserClickPause(f fVar) {
        String str;
        h.f.b.l.d(fVar, "");
        Aweme aweme = fVar.f95106a;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = this.f144207b;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        if (h.f.b.l.a((Object) str, (Object) str2) && h.f.b.l.a((Object) fVar.f95107b, (Object) "eoy_hub")) {
            boolean z = true;
            if (fVar.f95109d == 1) {
                z = false;
            }
            this.f144206a = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e(Context context) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(3766);
        this.f144209f = h.i.a((h.f.a.a) new c(this));
        addView(com.a.a(LayoutInflater.from(context), R.layout.z_, this, false));
        getMPlayVideoHelper().f112580a = new v();
        this.f144210g = h.i.a((h.f.a.a) new b(context));
        MethodCollector.o(3766);
    }

    public /* synthetic */ e(Context context, byte b2) {
        this(context);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements OnActivityResultCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f144227a;

        static {
            Covode.recordClassIndex(94377);
        }

        d(e eVar) {
            this.f144227a = eVar;
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i2, int i3, Intent intent) {
            if (i2 == 10086) {
                this.f144227a.setMuted(e.f144204c);
                if (this.f144227a.f144206a) {
                    this.f144227a.a();
                } else {
                    this.f144227a.b();
                }
                if (EventBus.a().a(this.f144227a)) {
                    EventBus.a().b(this.f144227a);
                }
            }
        }
    }
}
