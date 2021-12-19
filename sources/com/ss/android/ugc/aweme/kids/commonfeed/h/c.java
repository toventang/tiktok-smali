package com.ss.android.ugc.aweme.kids.commonfeed.h;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.kids.common.c.f;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.FeedTitleWidget;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.KidsAnchorWidget;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicCoverWidget;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicInfoWidget;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.i;
import com.ss.android.ugc.playerkit.videoview.j;
import com.ss.android.ugc.playerkit.videoview.k;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class c implements ag, a, OnUIPlayListener, k {
    public static final a s = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final SmartImageView f106136a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f106137b;

    /* renamed from: c  reason: collision with root package name */
    public final SmartCircleImageView f106138c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f106139d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f106140e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f106141f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f106142g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.commonfeed.g.b f106143h = new com.ss.android.ugc.aweme.kids.commonfeed.g.b();

    /* renamed from: i  reason: collision with root package name */
    public Aweme f106144i;

    /* renamed from: j  reason: collision with root package name */
    public int f106145j;

    /* renamed from: k  reason: collision with root package name */
    public Video f106146k;

    /* renamed from: l  reason: collision with root package name */
    public DataCenter f106147l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.commonfeed.g.a.a f106148m;
    public b n;
    public final View o;
    public final Fragment p;
    public final String q;
    public final String r;
    private final ImageView t;
    private final LongPressLayout u;
    private final i v;
    private boolean w;
    private com.ss.android.ugc.aweme.arch.widgets.base.e x;
    private final View.OnTouchListener y;

    static {
        Covode.recordClassIndex(67879);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.k
    public final void aB_() {
    }

    @Override // com.ss.android.ugc.playerkit.videoview.k
    public final void b(int i2, int i3) {
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
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
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
    public final void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
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
            Covode.recordClassIndex(67880);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.h.a
    public final Aweme b() {
        return this.f106144i;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.h.a
    public final DataCenter f() {
        return this.f106147l;
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.h.a
    public final int h() {
        return this.f106145j;
    }

    private final void k() {
        this.f106136a.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.h.a
    public final Surface g() {
        return this.v.b();
    }

    @Override // androidx.lifecycle.ag
    public final af getViewModelStore() {
        return new af();
    }

    public final void i() {
        this.f106136a.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.h.a
    public final void c() {
        DataCenter dataCenter = this.f106147l;
        if (dataCenter != null) {
            dataCenter.a("stop_animation", (Object) true);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.h.a
    public final void d() {
        DataCenter dataCenter = this.f106147l;
        if (dataCenter != null) {
            dataCenter.a("start_animation", (Object) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.h.a
    public final void e() {
        DataCenter dataCenter = this.f106147l;
        if (dataCenter != null) {
            dataCenter.a("pause_animation", (Object) null);
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106152a;

        static {
            Covode.recordClassIndex(67884);
        }

        e(c cVar) {
            this.f106152a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", this.f106152a.q);
            Aweme aweme = this.f106152a.f106144i;
            String str3 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.c a3 = a2.a("group_id", str);
            Aweme aweme2 = this.f106152a.f106144i;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.app.f.c a4 = a3.a("author_id", str2);
            Aweme aweme3 = this.f106152a.f106144i;
            if (aweme3 != null) {
                str3 = aweme3.getLogPbString();
            }
            f.a("video_play_finish", a4.a("log_pb", str3).a());
            return z.f158842a;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106151a;

        static {
            Covode.recordClassIndex(67883);
        }

        d(c cVar) {
            this.f106151a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.app.f.c cVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5 = "log_pb";
            String str6 = null;
            if (TextUtils.equals("discovery", this.f106151a.q) || TextUtils.equals("category_details_page", this.f106151a.q)) {
                com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", this.f106151a.q);
                Aweme aweme = this.f106151a.f106144i;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.app.f.c a3 = a2.a("group_id", str);
                Aweme aweme2 = this.f106151a.f106144i;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                } else {
                    str2 = null;
                }
                com.ss.android.ugc.aweme.app.f.c a4 = a3.a("author_id", str2);
                Aweme aweme3 = this.f106151a.f106144i;
                if (aweme3 != null) {
                    str6 = aweme3.getLogPbString();
                }
                cVar = a4.a(str5, str6).a("rank", Integer.valueOf(this.f106151a.f106145j + 1));
                str5 = com.ss.android.ugc.aweme.kids.common.c.c.f105889a;
                str6 = com.ss.android.ugc.aweme.kids.common.c.c.f105890b;
            } else {
                com.ss.android.ugc.aweme.app.f.c a5 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", this.f106151a.q);
                Aweme aweme4 = this.f106151a.f106144i;
                if (aweme4 != null) {
                    str3 = aweme4.getAid();
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.app.f.c a6 = a5.a("group_id", str3);
                Aweme aweme5 = this.f106151a.f106144i;
                if (aweme5 != null) {
                    str4 = aweme5.getAuthorUid();
                } else {
                    str4 = null;
                }
                cVar = a6.a("author_id", str4);
                Aweme aweme6 = this.f106151a.f106144i;
                if (aweme6 != null) {
                    str6 = aweme6.getLogPbString();
                }
            }
            f.a("video_play", cVar.a(str5, str6).a());
            return z.f158842a;
        }
    }

    private final void j() {
        this.f106147l = DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.d.a(this.p, this), this.p);
        com.ss.android.ugc.aweme.arch.widgets.base.e a2 = com.ss.android.ugc.aweme.arch.widgets.base.e.a(this.p, this.o);
        this.x = a2;
        if (a2 != null) {
            a2.a(this.f106147l);
        }
        com.ss.android.ugc.aweme.arch.widgets.base.e eVar = this.x;
        if (eVar != null) {
            eVar.b(R.id.b12, new FeedTitleWidget());
            eVar.b(R.id.b1e, new MusicInfoWidget());
            eVar.b(R.id.b1d, new MusicCoverWidget());
            eVar.b(R.id.b1_, new DiggWidget());
            eVar.b(R.id.b18, new VideoProgressBarWidget());
            Object a3 = com.ss.android.ugc.aweme.kids.experiment.abmock.a.a(new com.ss.android.ugc.aweme.kids.experiment.abmock.a.c());
            Objects.requireNonNull(a3, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) a3).intValue() == 1 && KidsAnchorWidget.a.a(this.f106144i)) {
                eVar.b(R.id.b17, new KidsAnchorWidget());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        i();
        a(true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
        a(false);
    }

    private final void a(boolean z) {
        DataCenter dataCenter = this.f106147l;
        if (dataCenter != null) {
            dataCenter.a("load_progress_bar", Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        if (z) {
            a(true);
        } else {
            a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        b.i.b(new e(this), f.a());
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(l lVar) {
        a(false);
        DataCenter dataCenter = this.f106147l;
        if (dataCenter != null) {
            dataCenter.a("pause_animation", (Object) true);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        this.w = false;
        k();
        com.ss.android.ugc.aweme.kids.commonfeed.g.a.a aVar = this.f106148m;
        if (aVar != null) {
            aVar.a();
        }
        DataCenter dataCenter = this.f106147l;
        if (dataCenter != null) {
            dataCenter.a("start_animation", (Object) true);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f2) {
        Aweme aweme;
        VideoControl videoControl;
        DataCenter dataCenter;
        Aweme aweme2 = this.f106144i;
        if (aweme2 != null && aweme2.getVideoControl() != null && (aweme = this.f106144i) != null && (videoControl = aweme.getVideoControl()) != null && videoControl.showProgressBar == 1 && (dataCenter = this.f106147l) != null) {
            dataCenter.a("on_play_progress_change", Float.valueOf(f2));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(o oVar) {
        k();
        b.i.b(new d(this), f.a());
        com.ss.android.ugc.aweme.kids.commonfeed.g.a.a aVar = this.f106148m;
        if (aVar != null) {
            aVar.a();
        }
        DataCenter dataCenter = this.f106147l;
        if (dataCenter != null) {
            dataCenter.a("start_animation", (Object) true);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106149a;

        static {
            Covode.recordClassIndex(67881);
        }

        b(c cVar) {
            this.f106149a = cVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.kids.commonfeed.d.b.a aVar = new com.ss.android.ugc.aweme.kids.commonfeed.d.b.a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_aweme", this.f106149a.f106144i);
            aVar.setArguments(bundle);
            aVar.show(this.f106149a.p.getFragmentManager(), "AwemeMore");
            com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", this.f106149a.q);
            Aweme aweme = this.f106149a.f106144i;
            String str3 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.c a3 = a2.a("group_id", str);
            Aweme aweme2 = this.f106149a.f106144i;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.app.f.c a4 = a3.a("author_id", str2);
            Aweme aweme3 = this.f106149a.f106144i;
            if (aweme3 != null) {
                str3 = aweme3.getLogPbString();
            }
            f.a("click_menu", a4.a("log_pb", str3).a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.h.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC2706c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106150a;

        static {
            Covode.recordClassIndex(67882);
        }

        View$OnClickListenerC2706c(c cVar) {
            this.f106150a = cVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", this.f106150a.q);
            Aweme aweme = this.f106150a.f106144i;
            String str3 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.c a3 = a2.a("group_id", str);
            Aweme aweme2 = this.f106150a.f106144i;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.app.f.c a4 = a3.a("author_id", str2);
            Aweme aweme3 = this.f106150a.f106144i;
            if (aweme3 != null) {
                str3 = aweme3.getLogPbString();
            }
            f.a("click_profile_icon", a4.a("log_pb", str3).a());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        com.ss.android.ugc.aweme.kids.commonfeed.g.a.a aVar;
        this.w = true;
        Aweme aweme = this.f106144i;
        if (!(aweme == null || (aVar = this.f106148m) == null)) {
            String str2 = this.q;
            int i2 = this.f106145j;
            String str3 = this.r;
            h.f.b.l.d(str2, "");
            h.f.b.l.d(aweme, "");
            if (aVar.f106126a != -1) {
                long currentTimeMillis = System.currentTimeMillis() - aVar.f106126a;
                if (currentTimeMillis > 50) {
                    String valueOf = String.valueOf(currentTimeMillis);
                    h.f.b.l.d(valueOf, "");
                    com.ss.android.ugc.aweme.kids.commonfeed.reportstats.b.f106210b = valueOf;
                    com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", str2).a("duration", String.valueOf(currentTimeMillis)).a("rank", Integer.valueOf(i2 + 1)).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).a("log_pb", aweme.getLogPbString());
                    if (hk.a(str3)) {
                        if (str3 == null) {
                            str3 = "";
                        }
                        a2.a("category_id", str3);
                    }
                    f.a("play_time", a2.a());
                }
                aVar.f106126a = -1;
            }
        }
        DataCenter dataCenter = this.f106147l;
        if (dataCenter != null) {
            dataCenter.a("pause_animation", (Object) true);
        }
    }

    @Override // com.ss.android.ugc.playerkit.videoview.k
    public final void a(int i2, int i3) {
        b bVar = this.n;
        if (bVar != null) {
            bVar.a(this.f106145j);
        }
    }

    public c(View view, Fragment fragment, String str, String str2, View.OnTouchListener onTouchListener) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(fragment, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(onTouchListener, "");
        this.o = view;
        this.p = fragment;
        this.q = str;
        this.r = str2;
        this.y = onTouchListener;
        View findViewById = view.findViewById(R.id.b19);
        h.f.b.l.b(findViewById, "");
        this.f106136a = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.b1u);
        h.f.b.l.b(findViewById2, "");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.f106137b = frameLayout;
        View findViewById3 = view.findViewById(R.id.b1b);
        h.f.b.l.b(findViewById3, "");
        ImageView imageView = (ImageView) findViewById3;
        this.t = imageView;
        View findViewById4 = view.findViewById(R.id.b1a);
        h.f.b.l.b(findViewById4, "");
        SmartCircleImageView smartCircleImageView = (SmartCircleImageView) findViewById4;
        this.f106138c = smartCircleImageView;
        View findViewById5 = view.findViewById(R.id.b1c);
        h.f.b.l.b(findViewById5, "");
        LongPressLayout longPressLayout = (LongPressLayout) findViewById5;
        this.u = longPressLayout;
        View findViewById6 = view.findViewById(R.id.afg);
        h.f.b.l.b(findViewById6, "");
        this.f106139d = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.afh);
        h.f.b.l.b(findViewById7, "");
        this.f106140e = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(R.id.afc);
        h.f.b.l.b(findViewById8, "");
        this.f106141f = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(R.id.afd);
        h.f.b.l.b(findViewById9, "");
        this.f106142g = (ImageView) findViewById9;
        j a2 = j.a(frameLayout);
        h.f.b.l.b(a2, "");
        this.v = a2;
        a2.a(this);
        j();
        longPressLayout.setTapListener(onTouchListener);
        imageView.setOnClickListener(new b(this));
        smartCircleImageView.setOnClickListener(new View$OnClickListenerC2706c(this));
        int i2 = Build.VERSION.SDK_INT;
        com.ss.android.ugc.aweme.kids.commonfeed.g.b.a(view.getContext());
    }
}
