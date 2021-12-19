package com.ss.android.ugc.aweme.following.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;

public class e extends f<IMUser> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f96441a = e.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public String f96442b = "";

    static {
        Covode.recordClassIndex(61082);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
    }

    /* access modifiers changed from: package-private */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        AvatarImageWithVerify f96443a;

        /* renamed from: b  reason: collision with root package name */
        TextView f96444b;

        /* renamed from: c  reason: collision with root package name */
        TextView f96445c;

        /* renamed from: d  reason: collision with root package name */
        FollowUserBtn f96446d;

        /* renamed from: e  reason: collision with root package name */
        View f96447e;

        /* renamed from: f  reason: collision with root package name */
        View f96448f;

        /* renamed from: g  reason: collision with root package name */
        com.ss.android.ugc.aweme.follow.widet.a f96449g;

        static {
            Covode.recordClassIndex(61083);
        }

        public final void a(IMUser iMUser) {
            final User user = IMUser.toUser(iMUser);
            if (user.getFollowStatus() == 2) {
                user.setFollowerStatus(1);
            }
            this.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.following.ui.adapter.e.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(61085);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (a.this.itemView.getContext() != null) {
                        SmartRouter.buildRoute(a.this.itemView.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "following").withParam("profile_enterprise_type", ae.f115954a.a(user)).open();
                    }
                    q qVar = new q();
                    qVar.q = user.getUid();
                    q o = qVar.o("following");
                    o.Y = "personal_homepage";
                    o.X = "1044";
                    o.f();
                }
            });
            this.f96443a.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            e.a(this.f96444b, iMUser);
            e.b(this.f96445c, iMUser);
            this.f96449g.f96286c = new f(this, iMUser);
            this.f96449g.a(user);
            this.f96448f.getLayoutParams().width = 0;
            this.f96443a.a();
            io.a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f96444b);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(IMUser iMUser, FollowStatus followStatus) {
            if (followStatus != null) {
                e.a(this.f96444b, iMUser);
                e.b(this.f96445c, iMUser);
                if (followStatus.isFollowSucess) {
                    iMUser.setFollowStatus(followStatus.followStatus);
                }
            }
        }

        a(View view) {
            super(view);
            this.f96443a = (AvatarImageWithVerify) view.findViewById(R.id.bu0);
            this.f96444b = (TextView) view.findViewById(R.id.fb8);
            this.f96445c = (TextView) view.findViewById(R.id.fak);
            this.f96446d = (FollowUserBtn) view.findViewById(R.id.fap);
            this.f96447e = view.findViewById(R.id.bwj);
            this.f96448f = view.findViewById(R.id.cnk);
            this.f96449g = new com.ss.android.ugc.aweme.follow.widet.a(this.f96446d, new a.g(e.this) {
                /* class com.ss.android.ugc.aweme.following.ui.adapter.e.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(61084);
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
                public final void a(int i2, User user) {
                    String str;
                    String str2;
                    super.a(i2, user);
                    if (i2 == 0) {
                        str = "follow_cancel";
                    } else {
                        str = "follow";
                    }
                    v vVar = new v(str);
                    vVar.f109605b = "others_homepage";
                    v a2 = vVar.a("common_relation");
                    a2.s = "follow_button";
                    int i3 = 1;
                    if (i2 == 1) {
                        str2 = "1007";
                    } else {
                        str2 = "1036";
                    }
                    a2.f109604a = str2;
                    a2.f109608e = user.getUid();
                    a2.aa = user.isSecret() ? 1 : 0;
                    if (user.getFollowStatus() == 0) {
                        i3 = -1;
                    } else if (user.getFollowStatus() == 4) {
                        i3 = 0;
                    }
                    a2.ab = i3;
                    a2.a(user).f();
                }
            });
        }
    }

    protected static void a(TextView textView, IMUser iMUser) {
        textView.setText(iMUser.getDisplayId());
    }

    protected static void b(TextView textView, IMUser iMUser) {
        textView.setText(iMUser.getNickName());
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        ((a) viewHolder).a((IMUser) this.f76354l.get(i2));
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aoq, viewGroup, false));
    }
}
