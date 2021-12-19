package com.ss.android.ugc.aweme.social.widget.card.rec.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.j;
import com.ss.android.ugc.aweme.social.widget.card.rec.cell.a;
import com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM;
import com.ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.List;
import java.util.Map;

public abstract class RecommendUserCell<T extends a> extends PowerCell<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h f133849a = i.a((h.f.a.a) new e(this));

    /* renamed from: l  reason: collision with root package name */
    public SocialCardVM f133850l;

    /* renamed from: m  reason: collision with root package name */
    public T f133851m;
    protected View n;
    protected SmartAvatarImageView o;
    protected TuxTextView p;
    protected TuxTextView q;
    protected MutualRelationView r;
    protected FollowButtonWithBlock s;
    protected TuxIconView t;

    static {
        Covode.recordClassIndex(87563);
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public void a(View view) {
        l.d(view, "");
    }

    /* access modifiers changed from: protected */
    public void a(FollowButtonWithBlock followButtonWithBlock, FollowStatus followStatus) {
        l.d(followButtonWithBlock, "");
        l.d(followStatus, "");
    }

    public final SocialCardVM b() {
        return (SocialCardVM) this.f133849a.getValue();
    }

    /* access modifiers changed from: protected */
    public final FollowButtonWithBlock c() {
        FollowButtonWithBlock followButtonWithBlock = this.s;
        if (followButtonWithBlock == null) {
            l.a("followButton");
        }
        return followButtonWithBlock;
    }

    /* access modifiers changed from: protected */
    public final TuxIconView d() {
        TuxIconView tuxIconView = this.t;
        if (tuxIconView == null) {
            l.a("deleteIconView");
        }
        return tuxIconView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        super.l();
        SocialCardVM b2 = b();
        T t2 = this.f133851m;
        if (t2 == null) {
            l.a("mItem");
        }
        b2.a(t2);
    }

    static final class e extends m implements h.f.a.a<SocialCardVM> {
        final /* synthetic */ RecommendUserCell this$0;

        static {
            Covode.recordClassIndex(87568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RecommendUserCell recommendUserCell) {
            super(0);
            this.this$0 = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SocialCardVM invoke() {
            Object obj = this.this$0.f133850l;
            if (obj != null || (obj = PowerCell.b(this.this$0, SocialCardVM.class)) != null || (obj = PowerCell.a(this.this$0, SocialCardVM.class)) != null) {
                return obj;
            }
            throw new IllegalStateException("Where am I? the activity is null!");
        }
    }

    public static final /* synthetic */ a a(RecommendUserCell recommendUserCell) {
        T t2 = recommendUserCell.f133851m;
        if (t2 == null) {
            l.a("mItem");
        }
        return t2;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<FollowStatus, z> {
        final /* synthetic */ RecommendUserCell this$0;

        static {
            Covode.recordClassIndex(87565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecommendUserCell recommendUserCell) {
            super(1);
            this.this$0 = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FollowStatus followStatus) {
            FollowStatus followStatus2 = followStatus;
            l.d(followStatus2, "");
            RecommendUserCell recommendUserCell = this.this$0;
            recommendUserCell.a(recommendUserCell.c(), followStatus2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserCell f133854a;

        static {
            Covode.recordClassIndex(87567);
        }

        d(RecommendUserCell recommendUserCell) {
            this.f133854a = recommendUserCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f133854a.b().b(RecommendUserCell.a(this.f133854a));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserCell f133852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f133853b;

        static {
            Covode.recordClassIndex(87564);
        }

        a(RecommendUserCell recommendUserCell, User user) {
            this.f133852a = recommendUserCell;
            this.f133853b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            RecommendUserCell recommendUserCell = this.f133852a;
            User user = this.f133853b;
            Map<String, String> map = recommendUserCell.b().v.f133753d;
            View view2 = recommendUserCell.itemView;
            l.b(view2, "");
            Context context = view2.getContext();
            l.b(context, "");
            String str = map.get("enter_from");
            if (str == null) {
                str = "";
            }
            String str2 = map.get("homepage_uid");
            String str3 = map.get("previous_page");
            if (str3 == null) {
                str3 = "";
            }
            com.ss.android.ugc.aweme.social.widget.a.a.a(user, context, str, str2, str3, null, 16);
            SocialCardVM b2 = recommendUserCell.b();
            T t = recommendUserCell.f133851m;
            if (t == null) {
                l.a("mItem");
            }
            l.d(t, "");
            j jVar = b2.f133913e;
            if (jVar != null) {
                jVar.a(t.f133855a);
            }
            com.ss.android.ugc.aweme.social.widget.card.c.c.a(t.f133855a, u.c.CARD, Integer.valueOf(b2.f133920l.indexOf(t)), b2.f133914f);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), a(), viewGroup, false);
        l.b(a2, "");
        this.n = a2;
        if (a2 == null) {
            l.a("container");
        }
        View findViewById = a2.findViewById(R.id.ow);
        l.b(findViewById, "");
        this.o = (SmartAvatarImageView) findViewById;
        View view = this.n;
        if (view == null) {
            l.a("container");
        }
        View findViewById2 = view.findViewById(R.id.cv9);
        l.b(findViewById2, "");
        this.p = (TuxTextView) findViewById2;
        View view2 = this.n;
        if (view2 == null) {
            l.a("container");
        }
        View findViewById3 = view2.findViewById(R.id.di0);
        l.b(findViewById3, "");
        this.q = (TuxTextView) findViewById3;
        View view3 = this.n;
        if (view3 == null) {
            l.a("container");
        }
        View findViewById4 = view3.findViewById(R.id.crt);
        l.b(findViewById4, "");
        this.r = (MutualRelationView) findViewById4;
        View view4 = this.n;
        if (view4 == null) {
            l.a("container");
        }
        View findViewById5 = view4.findViewById(R.id.b7b);
        l.b(findViewById5, "");
        this.s = (FollowButtonWithBlock) findViewById5;
        View view5 = this.n;
        if (view5 == null) {
            l.a("container");
        }
        View findViewById6 = view5.findViewById(R.id.ajq);
        l.b(findViewById6, "");
        this.t = (TuxIconView) findViewById6;
        View view6 = this.n;
        if (view6 == null) {
            l.a("container");
        }
        return view6;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ RecommendUserCell this$0;

        static {
            Covode.recordClassIndex(87566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RecommendUserCell recommendUserCell) {
            super(1);
            this.this$0 = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            u.a aVar;
            Integer num2;
            if (num.intValue() == 1) {
                SocialCardVM b2 = this.this$0.b();
                a a2 = RecommendUserCell.a(this.this$0);
                l.d(a2, "");
                j jVar = b2.f133913e;
                if (jVar != null) {
                    jVar.a(a2.f133855a);
                }
                List<com.bytedance.ies.powerlist.b.a> value = b2.f133921m.getValue();
                if (value != null) {
                    num2 = Integer.valueOf(value.indexOf(a2));
                } else {
                    num2 = null;
                }
                b2.n.postValue(num2);
            }
            SocialCardVM b3 = this.this$0.b();
            a a3 = RecommendUserCell.a(this.this$0);
            l.d(a3, "");
            User user = a3.f133855a;
            int indexOf = b3.f133920l.indexOf(a3);
            Map<String, String> map = b3.f133914f;
            l.d(user, "");
            l.d(map, "");
            String str = map.get("previous_page");
            String str2 = map.get("homepage_uid");
            String str3 = map.get("position");
            String a4 = com.ss.android.ugc.aweme.social.widget.card.c.c.a(user);
            com.ss.android.ugc.aweme.app.f.d a5 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "follow_button").a("enter_from", map.get("enter_from")).a("previous_page", str).a("rec_type", user.getRecType()).a("to_user_id", user.getUid()).a("impr_order", indexOf).a("req_id", user.getRequestId()).a("relation_type", user.getFriendTypeStr());
            new u();
            r.a(a4, a5.a("follow_type", u.b(user).getType()).f66730a);
            u a6 = new u().a(map.get("enter_from"));
            a6.f109596a = u.c.CARD;
            if (user.getFollowStatus() == 0) {
                aVar = u.a.FOLLOW;
            } else {
                aVar = u.a.FOLLOW_CANCEL;
            }
            a6.f109597b = aVar;
            a6.a(user).s(user.getRequestId()).p(str3).t(str2).q(str).f();
            return z.f158842a;
        }
    }

    public final void a(T t2) {
        l.d(t2, "");
        super.a((com.bytedance.ies.powerlist.b.a) t2);
        this.f133851m = t2;
        User user = t2.f133855a;
        View view = this.n;
        if (view == null) {
            l.a("container");
        }
        view.setOnClickListener(new a(this, user));
        FollowButtonWithBlock followButtonWithBlock = this.s;
        if (followButtonWithBlock == null) {
            l.a("followButton");
        }
        followButtonWithBlock.setOnClickListener(new b(this));
        FollowButtonWithBlock followButtonWithBlock2 = this.s;
        if (followButtonWithBlock2 == null) {
            l.a("followButton");
        }
        followButtonWithBlock2.setMobListener(new c(this));
        TuxIconView tuxIconView = this.t;
        if (tuxIconView == null) {
            l.a("deleteIconView");
        }
        tuxIconView.setOnClickListener(new d(this));
        SmartAvatarImageView smartAvatarImageView = this.o;
        if (smartAvatarImageView == null) {
            l.a("avatarView");
        }
        l.d(user, "");
        l.d(smartAvatarImageView, "");
        UrlModel avatarThumb = user.getAvatarThumb();
        l.b(avatarThumb, "");
        com.ss.android.ugc.aweme.social.widget.a.a.a(smartAvatarImageView, avatarThumb);
        TuxTextView tuxTextView = this.p;
        if (tuxTextView == null) {
            l.a("usernameView");
        }
        l.d(user, "");
        l.d(tuxTextView, "");
        com.ss.android.ugc.aweme.social.widget.a.a.a(tuxTextView, user);
        TuxTextView tuxTextView2 = this.q;
        if (tuxTextView2 == null) {
            l.a("reasonView");
        }
        MutualRelationView mutualRelationView = this.r;
        if (mutualRelationView == null) {
            l.a("mutualView");
        }
        a(t2, tuxTextView2, mutualRelationView);
        FollowButtonWithBlock followButtonWithBlock3 = this.s;
        if (followButtonWithBlock3 == null) {
            l.a("followButton");
        }
        a(user, followButtonWithBlock3);
        TuxIconView tuxIconView2 = this.t;
        if (tuxIconView2 == null) {
            l.a("deleteIconView");
        }
        l.d(user, "");
        l.d(tuxIconView2, "");
        if (user.getFollowStatus() == 0) {
            tuxIconView2.setVisibility(0);
        } else {
            tuxIconView2.setVisibility(8);
        }
        View view2 = this.n;
        if (view2 == null) {
            l.a("container");
        }
        a(view2);
    }

    /* access modifiers changed from: protected */
    public void a(User user, FollowButtonWithBlock followButtonWithBlock) {
        l.d(user, "");
        l.d(followButtonWithBlock, "");
        if (in.d()) {
            followButtonWithBlock.setVisibility(8);
            return;
        }
        l.d(user, "");
        followButtonWithBlock.getFollowBlock().a(user);
        followButtonWithBlock.a(user.getFollowStatus(), user.getFollowerStatus());
        followButtonWithBlock.setListener(user);
    }

    /* access modifiers changed from: protected */
    public void a(T t2, TuxTextView tuxTextView, MutualRelationView mutualRelationView) {
        l.d(t2, "");
        l.d(tuxTextView, "");
        l.d(mutualRelationView, "");
        com.ss.android.ugc.aweme.social.widget.a.a.a(t2.f133855a, tuxTextView, mutualRelationView);
    }
}
