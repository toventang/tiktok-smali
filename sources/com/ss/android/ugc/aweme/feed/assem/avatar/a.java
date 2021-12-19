package com.ss.android.ugc.aweme.feed.assem.avatar;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.ss.android.ugc.aweme.feed.assem.avatar.b;
import com.ss.android.ugc.aweme.feed.assem.avatar.i;
import com.ss.android.ugc.aweme.feed.experiment.af;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    public static final C2220a v = new C2220a((byte) 0);
    public final b u = new b(this);
    private final h w = i.a((h.f.a.a) new b(this));
    private final h x = i.a((h.f.a.a) new f(this));
    private com.ss.android.ugc.aweme.cp.b y;
    private SparseArray z;

    static {
        Covode.recordClassIndex(57939);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.sl;
    }

    public final i F() {
        return (i) this.w.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.z == null) {
            this.z = new SparseArray();
        }
        View view = (View) this.z.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.z.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public final o H() {
        return (o) this.x.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.a$a  reason: collision with other inner class name */
    public static final class C2220a {
        static {
            Covode.recordClassIndex(57940);
        }

        private C2220a() {
        }

        public /* synthetic */ C2220a(byte b2) {
            this();
        }

        public static boolean a(Aweme aweme) {
            l.d(aweme, "");
            return br.a(aweme, 3);
        }

        public static boolean b(Aweme aweme) {
            if (aweme == null) {
                return false;
            }
            LiveOuterService.s();
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.y(aweme)) {
                return true;
            }
            User author = aweme.getAuthor();
            if (author == null || !author.isLive() || !com.ss.android.ugc.aweme.story.c.a() || author.isBlock() || in.d()) {
                return false;
            }
            return true;
        }
    }

    static final class f extends m implements h.f.a.a<o> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(57945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return new o(this.this$0);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f91999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92000b;

        static {
            Covode.recordClassIndex(57942);
        }

        c(a aVar, VideoItemParams videoItemParams) {
            this.f91999a = aVar;
            this.f92000b = videoItemParams;
        }

        public final void run() {
            this.f91999a.u.a(this.f92000b);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92002b;

        static {
            Covode.recordClassIndex(57943);
        }

        d(a aVar, VideoItemParams videoItemParams) {
            this.f92001a = aVar;
            this.f92002b = videoItemParams;
        }

        public final void run() {
            this.f92001a.F().a(this.f92002b);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92004b;

        static {
            Covode.recordClassIndex(57944);
        }

        e(a aVar, VideoItemParams videoItemParams) {
            this.f92003a = aVar;
            this.f92004b = videoItemParams;
        }

        public final void run() {
            this.f92003a.H().a(this.f92004b);
        }
    }

    static final class b extends m implements h.f.a.a<i> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(57941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            Context ar_ = this.this$0.ar_();
            if (ar_ == null) {
                l.b();
            }
            return new i(ar_, this.this$0);
        }
    }

    @Override // com.bytedance.assem.arch.b.x
    public final void E() {
        super.E();
        ProfileBadgeServiceImpl.b().b(this.u.f92013i);
        F();
        H();
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        b bVar = this.u;
        f.a.a(bVar, bVar.c(), c.f92022a, (k) null, new b.h(bVar), 6);
        f.a.a(bVar, bVar.c(), d.f92023a, (k) null, new b.i(bVar), 6);
        F();
        H();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        l.d(videoItemParams2, "");
        com.ss.android.ugc.aweme.cp.b bVar = this.y;
        if (bVar != null) {
            bVar.c();
        }
        B().setVisibility(0);
        if (com.ss.android.ugc.aweme.feed.assem.a.f91966a) {
            p.a().post(new c(this, videoItemParams2));
            p.a().post(new d(this, videoItemParams2));
            p.a().post(new e(this, videoItemParams2));
            return;
        }
        this.u.a(videoItemParams2);
        F().a(videoItemParams2);
        H().a(videoItemParams2);
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        Aweme aweme;
        ViewGroup.LayoutParams layoutParams;
        l.d(view, "");
        b bVar = this.u;
        Context ar_ = ar_();
        if (ar_ == null) {
            l.b();
        }
        l.d(ar_, "");
        bVar.f92012h = ar_;
        B().setVisibility(8);
        com.ss.android.ugc.aweme.cp.b bVar2 = new com.ss.android.ugc.aweme.cp.b();
        this.y = bVar2;
        bVar2.f78240a = s();
        bVar2.f78241b = view;
        bVar2.f78244e = view.findViewById(R.id.p4);
        bVar2.f78245f = view.findViewById(R.id.fcu);
        bVar2.f78246g = B().findViewById(R.id.fcw);
        bVar2.f78247h = view.findViewById(R.id.dbp);
        bVar2.f78248i = B().findViewById(R.id.fd1);
        bVar2.f78249j = view.findViewById(R.id.p5);
        bVar2.f78242c = view.findViewById(R.id.b7j);
        bVar2.f78243d = view.findViewById(R.id.b7a);
        bVar2.f78250k = B().findViewById(R.id.fdu);
        b bVar3 = this.u;
        l.d(view, "");
        View findViewById = view.findViewById(R.id.b7a);
        l.b(findViewById, "");
        bVar3.f92006b = (AnimationImageView) findViewById;
        AnimationImageView animationImageView = bVar3.f92006b;
        if (animationImageView == null) {
            l.a("followView");
        }
        animationImageView.setAnimation("common_feed_anim_follow_people.json");
        View findViewById2 = view.findViewById(R.id.b7j);
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        if (af.a()) {
            l.b(viewGroup, "");
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            layoutParams2.width = h.g.a.a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()));
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (com.ss.android.ugc.aweme.im.service.c.k.a()) {
            l.b(viewGroup, "");
            com.ss.android.ugc.aweme.common.f.d.a(viewGroup, 8);
        }
        viewGroup.setOnClickListener(new b.j(bVar3));
        l.b(findViewById2, "");
        bVar3.f92007c = viewGroup;
        View findViewById3 = view.findViewById(R.id.fcu);
        SmartAvatarBorderView smartAvatarBorderView = (SmartAvatarBorderView) findViewById3;
        smartAvatarBorderView.setOnTouchListener(new com.bytedance.ies.dmt.ui.widget.b());
        l.b(smartAvatarBorderView, "");
        ViewGroup.LayoutParams layoutParams3 = smartAvatarBorderView.getLayoutParams();
        if (layoutParams3 != null) {
            if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            } else {
                layoutParams = layoutParams3;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                marginLayoutParams.bottomMargin = h.g.a.a(TypedValue.applyDimension(1, 10.0f, system2.getDisplayMetrics()));
            }
        } else {
            layoutParams3 = null;
        }
        smartAvatarBorderView.setLayoutParams(layoutParams3);
        l.b(findViewById3, "");
        bVar3.f92008d = smartAvatarBorderView;
        SmartAvatarBorderView smartAvatarBorderView2 = bVar3.f92008d;
        if (smartAvatarBorderView2 == null) {
            l.a("avatarView");
        }
        smartAvatarBorderView2.setBorderColor(R.color.f159928l);
        View findViewById4 = view.findViewById(R.id.dbp);
        l.b(findViewById4, "");
        bVar3.f92009e = (SmartImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bwx);
        l.b(findViewById5, "");
        bVar3.f92010f = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.p5);
        l.b(findViewById6, "");
        bVar3.f92011g = (RemoteImageView) findViewById6;
        ProfileBadgeServiceImpl.b().a(bVar3.f92013i);
        f.a.a(bVar3, bVar3.b(), e.f92024a, (k) null, new b.k(bVar3), 6);
        f.a.a(bVar3, bVar3.b(), f.f92025a, (k) null, new b.l(bVar3), 6);
        f.a.a(bVar3, bVar3.b(), g.f92026a, (k) null, new b.m(bVar3), 6);
        i F = F();
        l.d(view, "");
        View findViewById7 = view.findViewById(R.id.fcu);
        l.b(findViewById7, "");
        F.f92029a = (SmartAvatarBorderView) findViewById7;
        View findViewById8 = view.findViewById(R.id.fd1);
        l.b(findViewById8, "");
        F.f92030b = (AvatarImageWithLive) findViewById8;
        AvatarImageWithLive avatarImageWithLive = F.f92030b;
        if (avatarImageWithLive == null) {
            l.a("avatarLiveView");
        }
        avatarImageWithLive.setBorderColor(R.color.us);
        View findViewById9 = view.findViewById(R.id.fcw);
        l.b(findViewById9, "");
        F.f92031c = (LiveCircleView) findViewById9;
        AvatarImageWithLive avatarImageWithLive2 = F.f92030b;
        if (avatarImageWithLive2 == null) {
            l.a("avatarLiveView");
        }
        avatarImageWithLive2.setOnTouchListener(new com.bytedance.ies.dmt.ui.widget.b());
        VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(F.f92036h);
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        boolean b2 = C2220a.b(aweme);
        AvatarImageWithLive avatarImageWithLive3 = F.f92030b;
        if (avatarImageWithLive3 == null) {
            l.a("avatarLiveView");
        }
        SmartAvatarBorderView smartAvatarBorderView3 = F.f92029a;
        if (smartAvatarBorderView3 == null) {
            l.a("avatarView");
        }
        LiveCircleView liveCircleView = F.f92031c;
        if (liveCircleView == null) {
            l.a("avatarBorderView");
        }
        F.f92032d = new com.ss.android.ugc.aweme.feed.ui.d(b2, avatarImageWithLive3, smartAvatarBorderView3, liveCircleView);
        AvatarImageWithLive avatarImageWithLive4 = F.f92030b;
        if (avatarImageWithLive4 == null) {
            l.a("avatarLiveView");
        }
        avatarImageWithLive4.setVisibility(8);
        LiveCircleView liveCircleView2 = F.f92031c;
        if (liveCircleView2 == null) {
            l.a("avatarBorderView");
        }
        liveCircleView2.setVisibility(8);
        f.a.a(F, F.a(), j.f92048a, (k) null, new i.k(F), 6);
        f.a.a(F, F.a(), k.f92049a, (k) null, new i.l(F), 6);
        f.a.a(F, F.a(), l.f92050a, (k) null, new i.m(F), 6);
        f.a.a(F, F.b(), m.f92051a, (k) null, new i.n(F), 6);
        f.a.a(F, F.b(), n.f92052a, (k) null, new i.j(F), 6);
        o H = H();
        l.d(view, "");
        View findViewById10 = H.f92058f.B().findViewById(R.id.fdu);
        l.b(findViewById10, "");
        H.f92054b = (StoryBrandView) findViewById10;
        View findViewById11 = H.f92058f.B().findViewById(R.id.fd1);
        l.b(findViewById11, "");
        H.f92055c = (AvatarImageWithLive) findViewById11;
        View findViewById12 = H.f92058f.B().findViewById(R.id.fcw);
        l.b(findViewById12, "");
        H.f92056d = (LiveCircleView) findViewById12;
        View findViewById13 = H.f92058f.B().findViewById(R.id.fcu);
        l.b(findViewById13, "");
        H.f92053a = (SmartAvatarBorderView) findViewById13;
    }
}
