package com.ss.android.ugc.aweme.dsp.playpage.playview.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.v;
import f.a.w;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a implements i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final String f83762j = a.class.getSimpleName();

    /* renamed from: k  reason: collision with root package name */
    public static final C1995a f83763k = new C1995a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playpage.base.b f83764a;

    /* renamed from: b  reason: collision with root package name */
    public int f83765b = -1;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playerservice.b.c f83766c;

    /* renamed from: d  reason: collision with root package name */
    public f.a.b.b f83767d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f83768e;

    /* renamed from: f  reason: collision with root package name */
    public final View f83769f;

    /* renamed from: g  reason: collision with root package name */
    public final AnimationImageView f83770g;

    /* renamed from: h  reason: collision with root package name */
    public final SmartAvatarBorderView f83771h;

    /* renamed from: i  reason: collision with root package name */
    public final View f83772i;

    /* renamed from: l  reason: collision with root package name */
    private final View f83773l;

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(66, new org.greenrobot.eventbus.g(a.class, "onFollowEvent", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.playview.b.a$a  reason: collision with other inner class name */
    public static final class C1995a {
        static {
            Covode.recordClassIndex(52254);
        }

        private C1995a() {
        }

        public /* synthetic */ C1995a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83788a;

        static {
            Covode.recordClassIndex(52255);
        }

        b(a aVar) {
            this.f83788a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f83788a.a();
        }
    }

    static {
        Covode.recordClassIndex(52253);
    }

    public final void b() {
        Integer m2;
        if (!this.f83768e) {
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83766c;
            if (cVar == null || (m2 = cVar.m()) == null || m2.intValue() != 0) {
                this.f83770g.setVisibility(4);
                return;
            }
            this.f83770g.setVisibility(0);
            this.f83770g.setImageDrawable(androidx.core.content.b.a(this.f83772i.getContext(), 2131231737));
        }
    }

    public final void a() {
        Integer m2;
        String str;
        DspStruct c2;
        Aweme aweme;
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83766c;
        if (cVar != null && (m2 = cVar.m()) != null && m2.intValue() == 0) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = this.f83766c;
                if (cVar2 == null || (c2 = cVar2.c()) == null || (aweme = c2.getAweme()) == null || (str = aweme.getAid()) == null) {
                    str = "";
                }
                com.ss.android.ugc.aweme.login.c.a(com.bytedance.ies.ugc.appcontext.f.j(), "", "click_favorite_video", new ap().a("group_id", str).a("log_pb", ac.c(str)).f142646a, new b(this));
                return;
            }
            this.f83770g.d();
            this.f83770g.setAnimation("common_feed_anim_follow_people.json");
            this.f83770g.a(new c(this));
            this.f83770g.a();
            this.f83767d = t.a(new d(this)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(e.f83802a, f.f83803a);
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83800a;

        static {
            Covode.recordClassIndex(52256);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f83800a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f83800a.f83768e = true;
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
            this.f83800a.f83768e = false;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f83800a.f83768e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f83802a = new e();

        static {
            Covode.recordClassIndex(52258);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            FollowStatus followStatus = (FollowStatus) obj;
            l.b(followStatus, "");
            new FollowStatusEvent(followStatus).post();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f83803a = new f();

        static {
            Covode.recordClassIndex(52259);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String.valueOf("follow failed ".concat(String.valueOf(obj)));
        }
    }

    public static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83806a;

        static {
            Covode.recordClassIndex(52261);
        }

        public h(a aVar) {
            this.f83806a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f83806a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83801a;

        static {
            Covode.recordClassIndex(52257);
        }

        d(a aVar) {
            this.f83801a = aVar;
        }

        @Override // f.a.w
        public final void subscribe(v<FollowStatus> vVar) {
            DspStruct c2;
            Aweme aweme;
            Music music;
            List<MusicOwnerInfo> musicOwnerInfos;
            MusicOwnerInfo musicOwnerInfo;
            l.d(vVar, "");
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83801a.f83766c;
            if (cVar == null || (c2 = cVar.c()) == null || (aweme = c2.getAweme()) == null || (music = aweme.getMusic()) == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) n.h((List) musicOwnerInfos)) == null) {
                vVar.a(new NullPointerException());
                return;
            }
            IUserService d2 = UserService.d();
            String uid = musicOwnerInfo.getUid();
            if (uid == null) {
                uid = "";
            }
            String secUid = musicOwnerInfo.getSecUid();
            if (secUid == null) {
                secUid = "'";
            }
            FollowStatus a2 = d2.a(uid, secUid, 1, 0, com.ss.android.ugc.aweme.app.c.c.a(""), aweme.getAid(), -1, "", ag.a());
            if (a2 == null) {
                vVar.a(new NullPointerException());
                return;
            }
            vVar.a(a2);
            vVar.a();
        }
    }

    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartAvatarBorderView f83804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f83805b;

        static {
            Covode.recordClassIndex(52260);
        }

        public g(SmartAvatarBorderView smartAvatarBorderView, a aVar) {
            this.f83804a = smartAvatarBorderView;
            this.f83805b = aVar;
        }

        public final void onClick(View view) {
            DspStruct c2;
            Aweme aweme;
            DspStruct c3;
            Aweme aweme2;
            Music music;
            List<MusicOwnerInfo> musicOwnerInfos;
            MusicOwnerInfo musicOwnerInfo;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83805b.f83766c;
            if (cVar != null && (c2 = cVar.c()) != null && (aweme = c2.getAweme()) != null && !in.d() && !com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
                com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = this.f83805b.f83766c;
                if (cVar2 == null || (c3 = cVar2.c()) == null || (aweme2 = c3.getAweme()) == null || (music = aweme2.getMusic()) == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) n.h((List) musicOwnerInfos)) == null) {
                    new com.bytedance.tux.g.b(this.f83804a).e(R.string.dbc).b();
                } else {
                    SmartRouter.buildRoute(this.f83804a.getContext(), "aweme://user/profile/").withParam("uid", musicOwnerInfo.getUid()).withParam("sec_user_id", musicOwnerInfo.getSecUid()).open();
                }
            }
        }
    }

    public a(View view) {
        l.d(view, "");
        this.f83772i = view;
        View findViewById = view.findViewById(R.id.pq);
        this.f83773l = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.b7j);
        l.b(findViewById2, "");
        this.f83769f = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.b7a);
        l.b(findViewById3, "");
        AnimationImageView animationImageView = (AnimationImageView) findViewById3;
        this.f83770g = animationImageView;
        View findViewById4 = findViewById.findViewById(R.id.fcu);
        l.b(findViewById4, "");
        SmartAvatarBorderView smartAvatarBorderView = (SmartAvatarBorderView) findViewById4;
        this.f83771h = smartAvatarBorderView;
        com.ss.android.ugc.aweme.cp.b bVar = new com.ss.android.ugc.aweme.cp.b();
        bVar.f78240a = findViewById;
        bVar.f78241b = findViewById;
        bVar.f78244e = findViewById.findViewById(R.id.p4);
        bVar.f78245f = smartAvatarBorderView;
        bVar.f78246g = findViewById.findViewById(R.id.fcw);
        bVar.f78247h = findViewById.findViewById(R.id.dbp);
        bVar.f78248i = findViewById.findViewById(R.id.fd1);
        bVar.f78249j = findViewById.findViewById(R.id.p5);
        bVar.f78242c = findViewById2;
        bVar.f78243d = animationImageView;
        bVar.f78250k = findViewById.findViewById(R.id.fdu);
        bVar.c();
        View view2 = bVar.f78247h;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = bVar.f78248i;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onFollowEvent(FollowStatusEvent followStatusEvent) {
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a2;
        com.ss.android.ugc.aweme.dsp.playerservice.e.b w;
        CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList;
        List<MusicOwnerInfo> musicOwnerInfos;
        MusicOwnerInfo musicOwnerInfo;
        String uid;
        List<MusicOwnerInfo> musicOwnerInfos2;
        MusicOwnerInfo musicOwnerInfo2;
        l.d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        com.ss.android.ugc.aweme.dsp.playpage.base.b bVar = this.f83764a;
        if (!(bVar == null || (a2 = bVar.a()) == null || (w = a2.m()) == null || (copyOnWriteArrayList = w.f83535c) == null)) {
            for (T t : copyOnWriteArrayList) {
                Music music = t.c().getAweme().getMusic();
                if (!(music == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) n.h((List) musicOwnerInfos)) == null || (uid = musicOwnerInfo.getUid()) == null || !l.a((Object) uid, (Object) followStatus.userId))) {
                    Music music2 = t.c().getAweme().getMusic();
                    if (!(music2 == null || (musicOwnerInfos2 = music2.getMusicOwnerInfos()) == null || (musicOwnerInfo2 = (MusicOwnerInfo) n.h((List) musicOwnerInfos2)) == null)) {
                        musicOwnerInfo2.setFollowStatus(Integer.valueOf(followStatus.followStatus));
                    }
                    t.a(Integer.valueOf(followStatus.followStatus));
                }
            }
        }
        b();
    }
}
