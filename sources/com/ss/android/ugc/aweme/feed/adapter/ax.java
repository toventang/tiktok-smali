package com.ss.android.ugc.aweme.feed.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.ui.widget.h;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.io;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

public final class ax extends RecyclerView.ViewHolder implements View.OnClickListener, GalleryLayoutManager.c, r {

    /* renamed from: a  reason: collision with root package name */
    int f91618a;

    /* renamed from: b  reason: collision with root package name */
    int f91619b;

    /* renamed from: c  reason: collision with root package name */
    public h.b f91620c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.d.d<ax> f91621d;

    /* renamed from: e  reason: collision with root package name */
    public VideoViewComponent f91622e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f91623f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f91624g;

    /* renamed from: h  reason: collision with root package name */
    public Video f91625h;

    /* renamed from: i  reason: collision with root package name */
    public UserWithAweme f91626i;

    /* renamed from: j  reason: collision with root package name */
    public final a f91627j;

    /* renamed from: k  reason: collision with root package name */
    public final b f91628k;

    /* renamed from: l  reason: collision with root package name */
    public GalleryLayoutManager f91629l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f91630m;
    private final h.h n;
    private final h.h o;
    private final h.h p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final com.ss.android.ugc.aweme.feed.d.a t = new com.ss.android.ugc.aweme.feed.d.a();
    private Integer u;
    private w v = com.ss.android.ugc.aweme.friends.service.a.f97047a.i();
    private final j w = new j(this);

    public interface a {
        static {
            Covode.recordClassIndex(57706);
        }

        void a(User user, int i2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(57707);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(57703);
    }

    private TextView j() {
        return (TextView) this.f91630m.getValue();
    }

    private AvatarImageWithVerify k() {
        return (AvatarImageWithVerify) this.n.getValue();
    }

    private TextView l() {
        return (TextView) this.p.getValue();
    }

    private TextView m() {
        return (TextView) this.q.getValue();
    }

    public final RemoteImageView a() {
        return (RemoteImageView) this.r.getValue();
    }

    public final KeepSurfaceTextureView b() {
        return (KeepSurfaceTextureView) this.s.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.c
    public final void h() {
        i();
    }

    /* access modifiers changed from: package-private */
    public static final class f implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ax f91634a;

        static {
            Covode.recordClassIndex(57711);
        }

        f(ax axVar) {
            this.f91634a = axVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f91634a.g();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<AvatarImageWithVerify> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(57708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageWithVerify invoke() {
            return this.$itemView.findViewById(R.id.or);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(57709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.$itemView.findViewById(R.id.a7h);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(57710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.b7a);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<RemoteImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(57713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.$itemView.findViewById(R.id.bvt);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<KeepSurfaceTextureView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(57716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ KeepSurfaceTextureView invoke() {
            return this.$itemView.findViewById(R.id.ekb);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(57717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.dhv);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(57718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.fdm);
        }
    }

    public final void c() {
        a().setVisibility(0);
    }

    public final void d() {
        if (this.f91623f && a().getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500);
            alphaAnimation.setAnimationListener(new g(this));
            a().startAnimation(alphaAnimation);
        }
    }

    public final void f() {
        this.f91624g = false;
        if (this.t.f92885a != 0) {
            VideoViewComponent videoViewComponent = this.f91622e;
            if (videoViewComponent == null) {
                h.f.b.l.a("mVideoView");
            }
            videoViewComponent.c();
            VideoViewComponent videoViewComponent2 = this.f91622e;
            if (videoViewComponent2 == null) {
                h.f.b.l.a("mVideoView");
            }
            videoViewComponent2.d();
            VideoViewComponent videoViewComponent3 = this.f91622e;
            if (videoViewComponent3 == null) {
                h.f.b.l.a("mVideoView");
            }
            videoViewComponent3.a(this.w);
            this.t.f92885a = 0;
            c();
        }
    }

    public final void e() {
        int i2;
        do {
            VideoViewComponent videoViewComponent = this.f91622e;
            if (videoViewComponent == null) {
                h.f.b.l.a("mVideoView");
            }
            com.ss.android.ugc.playerkit.videoview.j jVar = videoViewComponent.f148883b;
            h.f.b.l.b(jVar, "");
            if (!jVar.c() || this.f91625h == null) {
                this.f91624g = true;
                return;
            }
            int i3 = this.t.f92885a;
            if (i3 == 0) {
                VideoViewComponent videoViewComponent2 = this.f91622e;
                if (videoViewComponent2 == null) {
                    h.f.b.l.a("mVideoView");
                }
                videoViewComponent2.b(this.w);
                VideoViewComponent videoViewComponent3 = this.f91622e;
                if (videoViewComponent3 == null) {
                    h.f.b.l.a("mVideoView");
                }
                videoViewComponent3.a(this.f91625h, com.bytedance.ies.abmock.b.a().a(true, "decoder_type", 0));
                this.f91624g = false;
                this.t.f92885a = 2;
                return;
            } else if (i3 == 3) {
                i2 = this.t.f92885a;
            } else {
                return;
            }
        } while (i2 == 0);
        if (i2 == 3) {
            d();
            VideoViewComponent videoViewComponent4 = this.f91622e;
            if (videoViewComponent4 == null) {
                h.f.b.l.a("mVideoView");
            }
            videoViewComponent4.a(this.f91625h);
            this.t.f92885a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        UserWithAweme userWithAweme = this.f91626i;
        if (userWithAweme != null) {
            a(userWithAweme.getUser().getFollowStatus(), userWithAweme.getUser().getFollowerStatus());
            k().setUserData(new UserVerify(userWithAweme.getUser().getAvatarThumb(), userWithAweme.getUser().getCustomVerify(), userWithAweme.getUser().getEnterpriseVerifyReason(), Integer.valueOf(userWithAweme.getUser().getVerificationType())));
            k().a();
            a(userWithAweme.getUser());
        }
    }

    public final void g() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        Activity activity = null;
        if (!g2.isLogin()) {
            com.ss.android.ugc.aweme.login.c.a(com.bytedance.ies.ugc.appcontext.f.j(), "homepage_follow", "click_follow_tab", (Bundle) null, new f(this));
            return;
        }
        UserWithAweme userWithAweme = this.f91626i;
        if (userWithAweme != null) {
            if (userWithAweme.getUser().getFollowStatus() == 0) {
                this.f91628k.a(getAdapterPosition());
            }
            View view = this.itemView;
            h.f.b.l.b(view, "");
            if (view.getContext() != null) {
                View view2 = this.itemView;
                h.f.b.l.b(view2, "");
                if (view2.getContext() instanceof Activity) {
                    View view3 = this.itemView;
                    h.f.b.l.b(view3, "");
                    Context context = view3.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    activity = (Activity) context;
                }
            }
            int i2 = 2;
            int i3 = 0;
            if (userWithAweme.getUser().getFollowStatus() == 0) {
                if (userWithAweme.getUser().isSecret()) {
                    i2 = 4;
                } else if (userWithAweme.getUser().getFollowerStatus() != 1) {
                    i2 = 1;
                }
                i3 = i2;
            }
            if (userWithAweme.getUser().getFollowStatus() == 4) {
                if (activity == null) {
                    return;
                }
            } else if (i3 == 4) {
                if (activity != null) {
                    a(activity);
                } else {
                    return;
                }
            }
            a(i3);
        }
    }

    public static final class g implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ax f91635a;

        static {
            Covode.recordClassIndex(57712);
        }

        public final void onAnimationRepeat(Animation animation) {
            h.f.b.l.d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            h.f.b.l.d(animation, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(ax axVar) {
            this.f91635a = axVar;
        }

        public final void onAnimationEnd(Animation animation) {
            h.f.b.l.d(animation, "");
            this.f91635a.a().setVisibility(8);
        }
    }

    public static final class i implements com.ss.android.ugc.playerkit.videoview.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ax f91636a;

        static {
            Covode.recordClassIndex(57714);
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void aB_() {
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void b(int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(ax axVar) {
            this.f91636a = axVar;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.k
        public final void a(int i2, int i3) {
            if (this.f91636a.f91624g) {
                this.f91636a.f91624g = false;
                this.f91636a.e();
            }
        }
    }

    public static final class j extends com.ss.android.ugc.aweme.video.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ax f91637a;

        static {
            Covode.recordClassIndex(57715);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(ax axVar) {
            this.f91637a = axVar;
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
            super.onPlayFailed(lVar);
            this.f91637a.a().setVisibility(0);
        }

        @Override // com.ss.android.ugc.aweme.video.c, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(o oVar) {
            super.onRenderFirstFrame(oVar);
            this.f91637a.f91623f = true;
            this.f91637a.d();
            if (this.f91637a.getAdapterPosition() != this.f91637a.f91629l.f93214b) {
                VideoViewComponent videoViewComponent = this.f91637a.f91622e;
                if (videoViewComponent == null) {
                    h.f.b.l.a("mVideoView");
                }
                videoViewComponent.b();
            }
        }
    }

    private static void a(Activity activity) {
        SharePrefCache inst = SharePrefCache.inst();
        h.f.b.l.b(inst, "");
        aj<Integer> privacyAccountFollowCount = inst.getPrivacyAccountFollowCount();
        h.f.b.l.b(privacyAccountFollowCount, "");
        Integer c2 = privacyAccountFollowCount.c();
        if (c2 != null && c2.intValue() == 0) {
            new a.C0731a(activity).b(R.string.evb).a(R.string.cc_, (DialogInterface.OnClickListener) null, false).a().b();
        } else {
            h.f.b.l.b(c2, "");
            int intValue = c2.intValue();
            if (1 <= intValue && 3 >= intValue) {
                new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(R.string.evc).a();
            }
        }
        privacyAccountFollowCount.b(Integer.valueOf(c2.intValue() + 1));
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void b(FollowStatus followStatus) {
        h.f.b.l.d(followStatus, "");
        UserWithAweme userWithAweme = this.f91626i;
        if (userWithAweme != null && TextUtils.equals(followStatus.userId, userWithAweme.getUser().getUid())) {
            userWithAweme.getUser().setFollowStatus(followStatus.followStatus);
            int i2 = followStatus.followStatus;
            UserWithAweme userWithAweme2 = this.f91626i;
            if (userWithAweme2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.challenge.d.c(i2, userWithAweme2));
            a(followStatus.followStatus, followStatus.followerStatus);
            if (followStatus.followStatus == 0 && !TextUtils.isEmpty(userWithAweme.getUser().getRemarkName())) {
                userWithAweme.getUser().setRemarkName("");
                a(userWithAweme.getUser());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void c(FollowStatus followStatus) {
        h.f.b.l.d(followStatus, "");
        this.u = Integer.valueOf(followStatus.followStatus);
        String str = followStatus.userId;
        h.f.b.l.b(str, "");
        if (followStatus.followStatus == 0) {
            com.ss.android.ugc.aweme.common.r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_follow").a("to_user_id", str).f66730a);
        } else {
            com.ss.android.ugc.aweme.common.r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_follow").a("to_user_id", str).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void d_(Exception exc) {
        User user;
        int i2;
        int followStatus;
        View view = this.itemView;
        h.f.b.l.b(view, "");
        Activity a2 = com.ss.android.ugc.aweme.base.utils.o.a(view.getContext());
        h.f.b.l.b(a2, "");
        com.ss.android.ugc.aweme.common.l.a(a2, exc);
        UserWithAweme userWithAweme = this.f91626i;
        if (userWithAweme != null) {
            Integer num = this.u;
            if (num != null) {
                followStatus = num.intValue();
            } else {
                followStatus = userWithAweme.getUser().getFollowStatus();
            }
            a(followStatus, userWithAweme.getUser().getFollowerStatus());
        }
        UserWithAweme userWithAweme2 = this.f91626i;
        if (userWithAweme2 != null && (user = userWithAweme2.getUser()) != null) {
            Integer num2 = this.u;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            user.setFollowStatus(i2);
        }
    }

    public final void onClick(View view) {
        UserWithAweme userWithAweme;
        ClickAgent.onClick(view);
        h.f.b.l.d(view, "");
        int id = view.getId();
        if (id == R.id.a7h) {
            UserWithAweme userWithAweme2 = this.f91626i;
            if (userWithAweme2 != null) {
                h.b bVar = this.f91620c;
                if (bVar != null) {
                    User user = userWithAweme2.getUser();
                    getAdapterPosition();
                    bVar.a(user);
                }
                this.f91627j.a(userWithAweme2.getUser(), getAdapterPosition());
            }
        } else if (id == R.id.b7a && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (userWithAweme = this.f91626i) != null) {
            h.b bVar2 = this.f91620c;
            if (bVar2 != null) {
                User user2 = userWithAweme.getUser();
                getAdapterPosition();
                bVar2.b(user2);
            }
            g();
        }
    }

    private final void a(int i2) {
        Integer num;
        int i3;
        User user;
        a(i2, -1);
        UserWithAweme userWithAweme = this.f91626i;
        if (userWithAweme == null || (user = userWithAweme.getUser()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(user.getFollowStatus());
        }
        this.u = num;
        UserWithAweme userWithAweme2 = this.f91626i;
        if (userWithAweme2 != null) {
            boolean z = true;
            if (userWithAweme2.getUser().getFollowStatus() == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            w wVar = this.v;
            n.a b2 = new n.a().a(userWithAweme2.getUser().getUid()).b(userWithAweme2.getUser().getSecUid());
            if (!userWithAweme2.getUser().isSecret() && !userWithAweme2.getUser().isPrivateAccount()) {
                z = false;
            }
            wVar.a(b2.a(z).a(i3).c("homepage_follow").b(12).d(userWithAweme2.getUser().getFollowerStatus()).a());
        }
    }

    private void a(User user) {
        h.f.b.l.d(user, "");
        m().setText(user.getNickname());
        j().setText("@" + user.getUniqueId());
        View view = this.itemView;
        h.f.b.l.b(view, "");
        io.a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), m());
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.c
    public final void a(RecyclerView recyclerView, int i2) {
        if (getAdapterPosition() != i2) {
            f();
        } else if (recyclerView != null && recyclerView.getVisibility() == 0) {
            com.ss.android.ugc.aweme.common.d.d<ax> dVar = this.f91621d;
            if (dVar != null) {
                dVar.b(this);
            }
            GalleryLayoutManager galleryLayoutManager = this.f91629l;
            if (!(galleryLayoutManager.f93220h == null || galleryLayoutManager.f93220h.get() == null)) {
                if (!MainServiceImpl.createIMainServicebyMonsterPlugin(false).isOnFollowPage(galleryLayoutManager.f93220h.get())) {
                    return;
                }
            }
            e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0090, code lost:
        if (r6 == 2) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.ax.a(int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ax(final View view, a aVar, b bVar, GalleryLayoutManager galleryLayoutManager) {
        super(view);
        h.f.b.l.d(view, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(galleryLayoutManager, "");
        this.f91627j = aVar;
        this.f91628k = bVar;
        this.f91629l = galleryLayoutManager;
        this.f91618a = (int) com.bytedance.common.utility.n.b(view.getContext(), 279.0f);
        this.f91619b = (int) com.bytedance.common.utility.n.b(view.getContext(), 372.0f);
        this.f91630m = h.i.a((h.f.a.a) new l(view));
        this.n = h.i.a((h.f.a.a) new c(view));
        h.h a2 = h.i.a((h.f.a.a) new d(view));
        this.o = a2;
        this.p = h.i.a((h.f.a.a) new e(view));
        this.q = h.i.a((h.f.a.a) new m(view));
        this.r = h.i.a((h.f.a.a) new h(view));
        this.s = h.i.a((h.f.a.a) new k(view));
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.feed.adapter.ax.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ax f91631a;

            static {
                Covode.recordClassIndex(57704);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f91631a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                h.f.b.l.d(view, "");
                GalleryLayoutManager galleryLayoutManager = this.f91631a.f91629l;
                galleryLayoutManager.f93222j.add(this.f91631a);
            }

            public final void onViewDetachedFromWindow(View view) {
                h.f.b.l.d(view, "");
                this.f91631a.f();
                GalleryLayoutManager galleryLayoutManager = this.f91631a.f91629l;
                galleryLayoutManager.f93222j.remove(this.f91631a);
            }
        });
        VideoViewComponent videoViewComponent = new VideoViewComponent((byte) 0);
        this.f91622e = videoViewComponent;
        videoViewComponent.a(b());
        VideoViewComponent videoViewComponent2 = this.f91622e;
        if (videoViewComponent2 == null) {
            h.f.b.l.a("mVideoView");
        }
        videoViewComponent2.f148883b.a(new i(this));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.feed.adapter.ax.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ax f91632a;

            static {
                Covode.recordClassIndex(57705);
            }

            {
                this.f91632a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                UserWithAweme userWithAweme = this.f91632a.f91626i;
                if (userWithAweme == null) {
                    h.f.b.l.b();
                }
                if (this.f91632a.getAdapterPosition() < this.f91632a.f91629l.f93214b) {
                    this.f91632a.f91629l.a(this.f91632a.f91629l.f93214b - 1);
                } else if (this.f91632a.getAdapterPosition() > this.f91632a.f91629l.f93214b) {
                    this.f91632a.f91629l.a(this.f91632a.f91629l.f93214b + 1);
                } else {
                    h.b bVar = this.f91632a.f91620c;
                    if (bVar != null) {
                        User user = userWithAweme.getUser();
                        this.f91632a.getAdapterPosition();
                        bVar.c(user);
                    }
                    SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", userWithAweme.getUser().getUid()).withParam("sec_user_id", userWithAweme.getUser().getSecUid()).withParam("enter_from", "homepage_follow").withParam("enter_from_request_id", userWithAweme.getUser().getRequestId()).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", userWithAweme.getUser().getRecommendReason()).withParam("recommend_from_type", "card").open();
                }
            }
        });
        l().setOnClickListener(this);
        ((ImageView) a2.getValue()).setOnClickListener(this);
        this.v.a(this);
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        if (com.ss.android.ugc.aweme.feed.experiment.aj.a()) {
            int a3 = (int) (((float) com.bytedance.common.utility.n.a(context)) * 0.712f);
            this.f91618a = a3;
            this.f91619b = (int) (((float) a3) * 1.34f);
        }
    }
}
