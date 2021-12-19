package com.ss.android.ugc.aweme.qainvitation.d;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.view.I18nFollowUserBtn;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class b extends h {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f119105a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends IMUser> f119106b;

    static {
        Covode.recordClassIndex(77355);
    }

    private /* synthetic */ b() {
        this(z.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c() {
        return this.f119106b.size();
    }

    public final class a extends com.bytedance.ies.dmt.ui.a.a<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public AvatarImageWithVerify f119107a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f119108b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f119109c;

        /* renamed from: d  reason: collision with root package name */
        public I18nFollowUserBtn f119110d;

        /* renamed from: e  reason: collision with root package name */
        public final View f119111e;

        /* renamed from: f  reason: collision with root package name */
        public final b f119112f;

        /* renamed from: g  reason: collision with root package name */
        public final List<IMUser> f119113g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f119114h;

        static {
            Covode.recordClassIndex(77356);
        }

        @Override // com.bytedance.ies.dmt.ui.a.a
        public final void a() {
        }

        public final void b() {
            new com.bytedance.tux.g.b(this.f119111e).e(R.string.g21).a(3000L).b();
        }

        static final class d<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f119125a;

            static {
                Covode.recordClassIndex(77360);
            }

            d(a aVar) {
                this.f119125a = aVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f119125a.b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.b$a$a  reason: collision with other inner class name */
        public static final class View$OnClickListenerC3072a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ IMUser f119115a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f119116b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f119117c;

            static {
                Covode.recordClassIndex(77357);
            }

            View$OnClickListenerC3072a(IMUser iMUser, a aVar, int i2) {
                this.f119115a = iMUser;
                this.f119116b = aVar;
                this.f119117c = i2;
            }

            public final void onClick(View view) {
                int i2;
                ClickAgent.onClick(view);
                a aVar = this.f119116b;
                IMUser iMUser = this.f119115a;
                int i3 = this.f119117c;
                List<IMUser> list = aVar.f119113g;
                b bVar = this.f119116b.f119112f;
                l.d(iMUser, "");
                l.d(list, "");
                l.d(bVar, "");
                if (iMUser.getFollowStatus() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                IUserService d2 = UserService.d();
                String uid = iMUser.getUid();
                l.b(uid, "");
                String secUid = iMUser.getSecUid();
                l.b(secUid, "");
                f.a.b.b a2 = d2.a(uid, secUid, i2, -1, 0, "", -1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(aVar, iMUser, list, i3, bVar), new d(aVar));
                l.b(a2, "");
                bVar.f119105a.a(a2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.b$a$b  reason: collision with other inner class name */
        public static final class View$OnClickListenerC3073b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f119118a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IMUser f119119b;

            static {
                Covode.recordClassIndex(77358);
            }

            View$OnClickListenerC3073b(a aVar, IMUser iMUser) {
                this.f119118a = aVar;
                this.f119119b = iMUser;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View view2 = this.f119118a.itemView;
                l.b(view2, "");
                SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + this.f119119b.getUid()).withParam("sec_uid", this.f119119b.getSecUid()).open();
                r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "qa_personal_profile").f66730a);
            }
        }

        static final class c<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f119120a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IMUser f119121b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f119122c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f119123d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f119124e;

            static {
                Covode.recordClassIndex(77359);
            }

            c(a aVar, IMUser iMUser, List list, int i2, b bVar) {
                this.f119120a = aVar;
                this.f119121b = iMUser;
                this.f119122c = list;
                this.f119123d = i2;
                this.f119124e = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                FollowStatus followStatus = (FollowStatus) obj;
                if (followStatus != null) {
                    this.f119121b.setFollowStatus(followStatus.followStatus);
                    List<? extends IMUser> g2 = n.g((Collection) this.f119122c);
                    g2.set(this.f119123d, this.f119121b);
                    this.f119124e.a(g2);
                    this.f119124e.notifyDataSetChanged();
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "qa_personal_profile");
                    if (this.f119121b.getFollowStatus() == 0) {
                        str = "follow";
                    } else {
                        str = "unfollow";
                    }
                    r.a(str, a2.f66730a);
                    return;
                }
                this.f119120a.b();
            }
        }

        public final void a(IMUser iMUser, int i2) {
            l.d(iMUser, "");
            View view = this.itemView;
            l.b(view, "");
            View view2 = this.itemView;
            l.b(view2, "");
            view.setBackground(com.bytedance.ies.dmt.ui.common.c.c(view2.getContext()));
            View view3 = this.itemView;
            l.b(view3, "");
            I18nFollowUserBtn i18nFollowUserBtn = (I18nFollowUserBtn) view3.findViewById(R.id.yf);
            l.b(i18nFollowUserBtn, "");
            int i3 = 0;
            i18nFollowUserBtn.setVisibility(0);
            User c2 = com.ss.android.ugc.aweme.qainvitation.g.a.c(iMUser);
            this.f119107a.setUserData(new UserVerify(c2.getAvatarThumb(), c2.getCustomVerify(), c2.getEnterpriseVerifyReason(), Integer.valueOf(c2.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f119107a;
            View view4 = this.itemView;
            l.b(view4, "");
            com.ss.android.ugc.aweme.qainvitation.g.a.a(avatarImageWithVerify, view4.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f119108b);
            com.ss.android.ugc.aweme.qainvitation.g.a.a(iMUser, this.f119108b, this.f119109c);
            String uid = iMUser.getUid();
            com.ss.android.ugc.aweme.account.b.a();
            IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
            l.b(e2, "");
            if (TextUtils.equals(uid, e2.getCurUserId())) {
                this.f119110d.setVisibility(8);
            } else {
                this.f119110d.setVisibility(0);
                I18nFollowUserBtn i18nFollowUserBtn2 = this.f119110d;
                int followStatus = iMUser.getFollowStatus();
                if (iMUser.getFollowerStatus() == 1) {
                    i3 = 1;
                }
                i18nFollowUserBtn2.a(followStatus, i3);
            }
            this.f119110d.setOnClickListener(new View$OnClickListenerC3072a(iMUser, this, i2));
            this.f119111e.setOnClickListener(new View$OnClickListenerC3073b(this, iMUser));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view, b bVar2, List<? extends IMUser> list) {
            super(view);
            l.d(view, "");
            l.d(bVar2, "");
            l.d(list, "");
            this.f119114h = bVar;
            this.f119111e = view;
            this.f119112f = bVar2;
            this.f119113g = list;
            View findViewById = view.findViewById(R.id.or);
            l.b(findViewById, "");
            this.f119107a = (AvatarImageWithVerify) findViewById;
            View findViewById2 = view.findViewById(R.id.cs_);
            l.b(findViewById2, "");
            this.f119108b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ak7);
            l.b(findViewById3, "");
            this.f119109c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.yf);
            l.b(findViewById4, "");
            this.f119110d = (I18nFollowUserBtn) findViewById4;
        }
    }

    public final void a(List<? extends IMUser> list) {
        l.d(list, "");
        this.f119106b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f119105a.dispose();
    }

    public b(List<? extends IMUser> list) {
        l.d(list, "");
        this.f119106b = list;
        this.f119105a = new f.a.b.a();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.art, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2, this, this.f119106b);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qainvitation.invitedYou.QAInvitedYouUsersListAdapter.QAInvitedYouUsersListViewHolder");
        ((a) viewHolder).a((IMUser) this.f119106b.get(i2), i2);
    }
}
