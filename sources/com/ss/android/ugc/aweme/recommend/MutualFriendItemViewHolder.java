package com.ss.android.ugc.aweme.recommend;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.a.r;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.a.g;
import com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn;
import com.ss.android.ugc.aweme.friends.ui.at;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.io;
import h.f.b.l;
import h.z;

public final class MutualFriendItemViewHolder extends JediSimpleViewHolder<g> implements au {

    /* renamed from: f  reason: collision with root package name */
    private FansFollowUserBtn f120027f;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.follow.widet.a f120028g;

    /* renamed from: j  reason: collision with root package name */
    private final at f120029j;

    static {
        Covode.recordClassIndex(78001);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a extends a.g {
        static {
            Covode.recordClassIndex(78002);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
        public final void a(int i2, User user) {
            String str;
            String str2;
            if (user != null) {
                if (i2 == 1) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                v vVar = new v(str);
                vVar.f109605b = "others_homepage";
                v a2 = vVar.a("mutual_list");
                a2.s = "follow_button";
                v a3 = a2.a(user);
                if (i2 == 1) {
                    str2 = "1007";
                } else {
                    str2 = "1036";
                }
                a3.f109604a = str2;
                a3.f109608e = user.getUid();
                a3.f();
            }
        }
    }

    public static final class b implements a.d {
        static {
            Covode.recordClassIndex(78003);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutualFriendItemViewHolder(at atVar) {
        super(atVar);
        l.d(atVar, "");
        this.f120029j = atVar;
        this.f120027f = atVar.getMFollowUserBtn();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(g gVar) {
        g gVar2 = gVar;
        l.d(gVar2, "");
        User user = gVar2.f96343b;
        this.f120029j.setNeedRecommendReason(false);
        at atVar = this.f120029j;
        if (user != null) {
            atVar.f97178a.setOnClickListener(new at.b(atVar));
            if (!TextUtils.isEmpty(user.getUniqueId())) {
                atVar.f97179b.setText(user.getUniqueId());
            }
            atVar.f97179b.setOnClickListener(new at.c(atVar));
            if (!atVar.f97184g) {
                atVar.f97183f.setVisibility(8);
            } else if (!TextUtils.isEmpty(user.getRecommendReason())) {
                atVar.f97183f.setVisibility(0);
                atVar.f97183f.setText(user.getRecommendReason());
            }
            if (!TextUtils.isEmpty(user.getNickname())) {
                atVar.f97181d.setText(user.getNickname());
            }
            atVar.f97182e.a(user.getFollowStatus(), user.getFollowerStatus());
            ViewGroup.LayoutParams buttonLayoutParams = atVar.f97182e.getButtonLayoutParams();
            buttonLayoutParams.height = n.a(28.0d);
            buttonLayoutParams.width = n.a(88.0d);
            atVar.f97182e.setButtonLayoutParams(buttonLayoutParams);
            atVar.requestLayout();
            com.bytedance.lighten.a.v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(user.getAvatarThumb()));
            a2.E = atVar.f97180c;
            a2.a("RecommendFriendsItemView").c();
            atVar.f97182e.setOnClickListener(new at.d(atVar));
            io.a(atVar.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), atVar.f97179b);
        }
        com.ss.android.ugc.aweme.follow.widet.a aVar = new com.ss.android.ugc.aweme.follow.widet.a(this.f120027f, new a());
        this.f120028g = aVar;
        aVar.a(user);
        com.ss.android.ugc.aweme.follow.widet.a aVar2 = this.f120028g;
        if (aVar2 != null) {
            aVar2.f96287d = new b();
        }
        this.f120029j.setActionEventListener(new c(this, user));
        a(gVar2.f96343b, 5);
    }

    static final class c extends h.f.b.m implements h.f.a.m<Integer, String, z> {
        final /* synthetic */ User $user;
        final /* synthetic */ MutualFriendItemViewHolder this$0;

        static {
            Covode.recordClassIndex(78004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MutualFriendItemViewHolder mutualFriendItemViewHolder, User user) {
            super(2);
            this.this$0 = mutualFriendItemViewHolder;
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, String str) {
            int intValue = num.intValue();
            l.d(str, "");
            this.this$0.a(this.$user, intValue);
            return z.f158842a;
        }
    }

    public final void a(User user, int i2) {
        user.setRequestId(((g) aI_()).f96345d);
        if (i2 != com.ss.android.ugc.aweme.friends.ui.au.f97191d && i2 == com.ss.android.ugc.aweme.friends.ui.au.f97190c) {
            q qVar = new q();
            qVar.q = user.getUid();
            qVar.o("mutual_list").f();
            View view = this.itemView;
            l.b(view, "");
            Context context = view.getContext();
            if (context != null) {
                SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "mutual_list").withParam("enter_from_request_id", user.getRequestId()).open();
            }
        }
    }
}
