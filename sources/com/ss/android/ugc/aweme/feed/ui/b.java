package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.compliance.api.model.AlgoFreeInfo;
import com.ss.android.ugc.aweme.feed.helper.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.j;
import com.ss.android.ugc.playerkit.videoview.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public VideoViewComponent f94300a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f94301b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f94302c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f94303d;

    /* renamed from: e  reason: collision with root package name */
    private r f94304e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.d.a f94305f;

    /* renamed from: g  reason: collision with root package name */
    private c f94306g = new c(this);

    static {
        Covode.recordClassIndex(59914);
    }

    public final void a() {
        f();
        this.f94301b = true;
        c();
        this.f94303d.setVisibility(0);
    }

    public final void b() {
        this.f94301b = false;
        g();
        this.f94303d.setVisibility(8);
        com.ss.android.ugc.aweme.compliance.api.a.f().c();
    }

    private void g() {
        this.f94302c = false;
        int i2 = this.f94305f.f92885a;
        if (i2 == 1 || i2 == 2 || i2 == 4) {
            r rVar = this.f94304e;
            if (rVar == null) {
                l.a("mPlayVideoHelper");
            }
            rVar.c();
            this.f94305f.f92885a = 0;
        }
    }

    public final void c() {
        VideoViewComponent videoViewComponent = this.f94300a;
        if (videoViewComponent == null) {
            l.a("mVideoView");
        }
        j jVar = videoViewComponent.f148883b;
        l.b(jVar, "");
        if (!jVar.c()) {
            this.f94302c = true;
            return;
        }
        int i2 = this.f94305f.f92885a;
        if (i2 == 0) {
            r rVar = this.f94304e;
            if (rVar == null) {
                l.a("mPlayVideoHelper");
            }
            rVar.a();
            this.f94302c = false;
            this.f94305f.f92885a = 2;
        } else if (i2 == 3) {
            d();
        }
    }

    public final void d() {
        this.f94302c = false;
        int i2 = this.f94305f.f92885a;
        if (i2 == 0) {
            c();
        } else if (i2 == 3) {
            r rVar = this.f94304e;
            if (rVar == null) {
                l.a("mPlayVideoHelper");
            }
            rVar.b();
            this.f94305f.f92885a = 4;
        }
    }

    public final void e() {
        this.f94302c = false;
        int i2 = this.f94305f.f92885a;
        if (i2 == 1 || i2 == 2 || i2 == 4) {
            r rVar = this.f94304e;
            if (rVar == null) {
                l.a("mPlayVideoHelper");
            }
            rVar.f93418b.b();
            this.f94305f.f92885a = 3;
        }
    }

    private final void f() {
        String str;
        String str2;
        String str3;
        String body;
        TuxTextView tuxTextView = (TuxTextView) this.f94303d.findViewById(R.id.c9h);
        AlgoFreeInfo a2 = com.ss.android.ugc.aweme.compliance.api.a.f().a();
        if (a2 == null || (str = a2.getLearnMoreText()) == null) {
            str = "Learn More";
        }
        tuxTextView.setText(str);
        tuxTextView.setOnClickListener(new a(tuxTextView));
        RemoteImageView remoteImageView = (RemoteImageView) this.f94303d.findViewById(R.id.bi7);
        AlgoFreeInfo a3 = com.ss.android.ugc.aweme.compliance.api.a.f().a();
        String str4 = null;
        if (a3 != null) {
            str2 = a3.getIconUrl();
        } else {
            str2 = null;
        }
        e.b(remoteImageView, str2, -1, -1);
        TuxTextView tuxTextView2 = (TuxTextView) this.f94303d.findViewById(R.id.title);
        l.b(tuxTextView2, "");
        AlgoFreeInfo a4 = com.ss.android.ugc.aweme.compliance.api.a.f().a();
        if (a4 != null) {
            str3 = a4.getTitle();
        } else {
            str3 = null;
        }
        tuxTextView2.setText(str3);
        AlgoFreeInfo a5 = com.ss.android.ugc.aweme.compliance.api.a.f().a();
        if (!(a5 == null || (body = a5.getBody()) == null)) {
            str4 = p.a(body, "\n", "\n\n", false);
        }
        SpannableString spannableString = new SpannableString(str4);
        Matcher matcher = Pattern.compile("\n\n").matcher(str4);
        while (matcher.find()) {
            spannableString.setSpan(new AbsoluteSizeSpan(7, true), matcher.start() + 1, matcher.end(), 33);
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.f94303d.findViewById(R.id.ak7);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(spannableString);
    }

    public static final class c extends com.ss.android.ugc.aweme.video.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f94315a;

        static {
            Covode.recordClassIndex(59917);
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
            super.onPlayFailed(lVar);
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(o oVar) {
            super.onRenderFirstFrame(oVar);
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onResumePlay(String str) {
            super.onResumePlay(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f94315a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreparePlay(String str) {
            super.onPreparePlay(str);
            j jVar = b.a(this.f94315a).f148883b;
            l.b(jVar, "");
            View a2 = jVar.a();
            l.b(a2, "");
            a2.setVisibility(4);
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderReady(n nVar) {
            super.onRenderReady(nVar);
            j jVar = b.a(this.f94315a).f148883b;
            l.b(jVar, "");
            View a2 = jVar.a();
            l.b(a2, "");
            a2.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.b$b  reason: collision with other inner class name */
    public static final class C2281b implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f94314a;

        static {
            Covode.recordClassIndex(59916);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2281b(b bVar) {
            this.f94314a = bVar;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            if (this.f94314a.f94302c) {
                this.f94314a.f94302c = false;
                this.f94314a.c();
            }
        }
    }

    public static final /* synthetic */ VideoViewComponent a(b bVar) {
        VideoViewComponent videoViewComponent = bVar.f94300a;
        if (videoViewComponent == null) {
            l.a("mVideoView");
        }
        return videoViewComponent;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxTextView f94307a;

        static {
            Covode.recordClassIndex(59915);
        }

        a(TuxTextView tuxTextView) {
            this.f94307a = tuxTextView;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            View rootView = this.f94307a.getRootView();
            l.b(rootView, "");
            Context context = rootView.getContext();
            AlgoFreeInfo a2 = com.ss.android.ugc.aweme.compliance.api.a.f().a();
            if (a2 != null) {
                str = a2.getLearnMoreLink();
            } else {
                str = null;
            }
            SmartRouter.buildRoute(context, str).open();
        }
    }

    public b(ViewGroup viewGroup) {
        String str;
        l.d(viewGroup, "");
        this.f94303d = viewGroup;
        com.ss.android.ugc.aweme.feed.d.a aVar = new com.ss.android.ugc.aweme.feed.d.a();
        this.f94305f = aVar;
        VideoViewComponent videoViewComponent = new VideoViewComponent((byte) 0);
        this.f94300a = videoViewComponent;
        videoViewComponent.a((ViewGroup) viewGroup.findViewById(R.id.ffp));
        VideoViewComponent videoViewComponent2 = this.f94300a;
        if (videoViewComponent2 == null) {
            l.a("mVideoView");
        }
        videoViewComponent2.a(new C2281b(this));
        VideoViewComponent videoViewComponent3 = this.f94300a;
        if (videoViewComponent3 == null) {
            l.a("mVideoView");
        }
        this.f94304e = new r(videoViewComponent3, this.f94306g);
        if (aVar.f92885a == 2) {
            r rVar = this.f94304e;
            if (rVar == null) {
                l.a("mPlayVideoHelper");
            }
            rVar.f93418b.b();
        }
        aVar.f92885a = 0;
        r rVar2 = this.f94304e;
        if (rVar2 == null) {
            l.a("mPlayVideoHelper");
        }
        AlgoFreeInfo a2 = com.ss.android.ugc.aweme.compliance.api.a.f().a();
        Aweme a3 = com.ss.android.ugc.aweme.video.e.a.a((a2 == null || (str = a2.getBackgroundVideoUrl()) == null) ? "" : str);
        l.d(a3, "");
        rVar2.f93417a = a3;
    }
}
