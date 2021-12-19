package com.ss.android.ugc.aweme.profile.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.ui.widget.h;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.z;

public final class l extends RecyclerView.ViewHolder implements View.OnClickListener, r {

    /* renamed from: a  reason: collision with root package name */
    AvatarImageWithVerify f117455a;

    /* renamed from: b  reason: collision with root package name */
    TextView f117456b;

    /* renamed from: c  reason: collision with root package name */
    TextView f117457c;

    /* renamed from: d  reason: collision with root package name */
    TextView f117458d;

    /* renamed from: e  reason: collision with root package name */
    public User f117459e;

    /* renamed from: f  reason: collision with root package name */
    int f117460f;

    /* renamed from: g  reason: collision with root package name */
    a f117461g;

    /* renamed from: h  reason: collision with root package name */
    b f117462h;

    /* renamed from: i  reason: collision with root package name */
    h.b f117463i;

    /* renamed from: j  reason: collision with root package name */
    final View f117464j;

    /* renamed from: k  reason: collision with root package name */
    String f117465k;

    /* renamed from: l  reason: collision with root package name */
    int f117466l;

    /* renamed from: m  reason: collision with root package name */
    private View f117467m;
    private Context n;
    private w o;
    private View p;
    private ImageView q;
    private Object r;

    public interface a {
        static {
            Covode.recordClassIndex(75879);
        }

        void a(User user, int i2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(75880);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(75878);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void c(FollowStatus followStatus) {
    }

    private void b() {
        this.f117458d.setPadding(0, 0, 0, 0);
        this.f117458d.setGravity(17);
        this.f117458d.setCompoundDrawables(null, null, null, null);
    }

    private String c() {
        int i2 = this.f117466l;
        if (i2 == 1) {
            return "homepage_follow";
        }
        if (i2 == 2) {
            return "homepage_friends";
        }
        return "others_homepage";
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        b bVar;
        Activity activity = null;
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            c.a(f.j(), "homepage_follow", "click_follow_tab", (Bundle) null, new m(this));
            return;
        }
        if (this.f117459e.getFollowStatus() == 0 && (bVar = this.f117462h) != null) {
            bVar.a();
        }
        Context context = this.n;
        if (context != null && (context instanceof Activity)) {
            activity = (Activity) context;
        }
        int i2 = 2;
        if (this.f117459e.getFollowStatus() != 0) {
            i2 = 0;
        } else if (this.f117459e.isSecret()) {
            i2 = 4;
        } else if (this.f117459e.getFollowerStatus() != 1) {
            i2 = 1;
        }
        if (this.f117459e.getFollowStatus() == 4) {
            if (activity == null) {
                return;
            }
        } else if (i2 == 4) {
            if (activity != null) {
                a(activity);
            } else {
                return;
            }
        }
        b(i2);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void d_(Exception exc) {
        com.ss.android.ugc.aweme.common.l.a(o.a(this.n), exc);
        int followStatus = this.f117459e.getFollowStatus();
        this.f117459e.getFollowerStatus();
        a(followStatus);
    }

    private void c(int i2) {
        com.ss.android.ugc.aweme.im.service.model.b.a(o.d(this.itemView)).a(this.r).a(c()).a((View) this.f117458d).a(this.f117458d).a(this.f117459e).a(i2).a((h.f.a.b<? super com.ss.android.ugc.aweme.im.service.model.c, z>) new n(this));
    }

    private static void a(Activity activity) {
        aj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = privacyAccountFollowCount.c().intValue();
        if (intValue == 0) {
            new a.C0731a(activity).b(R.string.evb).a(R.string.cc_, (DialogInterface.OnClickListener) null, false).a().b();
        } else if (intValue > 0 && intValue < 4) {
            new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(R.string.evc).a();
        }
        privacyAccountFollowCount.b(Integer.valueOf(intValue + 1));
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void b(FollowStatus followStatus) {
        if (TextUtils.equals(followStatus.userId, this.f117459e.getUid())) {
            this.f117459e.setFollowStatus(followStatus.followStatus);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.challenge.d.c(followStatus.followStatus, this.f117459e));
            a(followStatus.followStatus);
            Context context = this.n;
            if ((!(context instanceof m) || ((m) context).getLifecycle().a() != i.b.DESTROYED) && followStatus.followStatus == 0 && !TextUtils.isEmpty(this.f117459e.getRemarkName())) {
                this.f117459e.setRemarkName("");
                a(this.f117459e);
            }
        }
    }

    private void b(int i2) {
        int i3;
        String str;
        com.ss.android.ugc.aweme.im.service.model.b.a(o.d(this.itemView)).a(this.r).a(this.f117459e).a(i2).a();
        this.f117459e.getFollowerStatus();
        a(i2);
        boolean z = false;
        if (this.f117459e.getFollowStatus() == 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        w wVar = this.o;
        n.a b2 = new n.a().a(this.f117459e.getUid()).b(this.f117459e.getSecUid());
        if (this.f117459e.isSecret() || this.f117459e.isPrivateAccount()) {
            z = true;
        }
        n.a a2 = b2.a(z).a(i3);
        if (this.f117466l == 1) {
            str = "homepage_follow";
        } else {
            str = "others_homepage";
        }
        wVar.a(a2.c(str).b(12).d(this.f117459e.getFollowerStatus()).a());
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        int id = view.getId();
        if (id == R.id.a7h) {
            a aVar = this.f117461g;
            if (aVar != null) {
                aVar.a(this.f117459e, this.f117460f);
            }
        } else if (id == R.id.or) {
            h.b bVar = this.f117463i;
            if (bVar != null) {
                bVar.c(this.f117459e);
            }
            if (this.f117459e != null) {
                SmartRouter.buildRoute(this.n, "//user/profile").withParam("uid", this.f117459e.getUid()).withParam("from_recommend_card", 1).withParam("sec_user_id", this.f117459e.getSecUid()).withParam("enter_from", c()).withParam("enter_from_request_id", this.f117465k).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", this.f117459e.getRecommendReason()).withParam("recommend_from_type", "card").open();
            }
        } else if (id == R.id.b7a) {
            h.b bVar2 = this.f117463i;
            if (bVar2 != null) {
                bVar2.b(this.f117459e);
            }
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.f117458d.setVisibility(0);
        Resources resources = this.n.getResources();
        if (i2 == 0) {
            this.f117458d.setText(resources.getText(R.string.byp));
            this.f117458d.setBackgroundResource(R.drawable.nc);
            TextView textView = this.f117458d;
            textView.setTextColor(androidx.core.content.b.c(textView.getContext(), R.color.a9));
            b();
        } else if (i2 == 1 || i2 == 2) {
            b();
            int i3 = R.string.c06;
            if (i2 == 2) {
                i3 = R.string.bbg;
            }
            this.f117458d.setText(i3);
            TextView textView2 = this.f117458d;
            textView2.setTextColor(androidx.core.content.b.c(textView2.getContext(), R.color.bx));
            this.f117458d.setBackgroundResource(R.drawable.baw);
        } else if (i2 == 4) {
            TextView textView3 = this.f117458d;
            textView3.setTextColor(androidx.core.content.b.c(textView3.getContext(), R.color.bx));
            this.f117458d.setBackgroundResource(R.drawable.baw);
            this.f117458d.setText(this.n.getString(R.string.bzw));
        }
        c(i2);
    }

    public final void a(User user) {
        if (TextUtils.isEmpty(user.getRemarkName())) {
            this.f117456b.setText(this.f117459e.getNickname());
            this.f117467m.setContentDescription(this.f117459e.getNickname());
            this.f117455a.setContentDescription(this.f117459e.getNickname());
            return;
        }
        this.f117456b.setText(this.f117459e.getRemarkName());
        this.f117467m.setContentDescription(this.f117459e.getRemarkName());
        this.f117455a.setContentDescription(this.f117459e.getNickname());
    }

    public l(View view, int i2, Object obj) {
        super(view);
        this.n = view.getContext();
        View findViewById = view.findViewById(R.id.fdc);
        this.f117467m = findViewById;
        v.a(findViewById, 1);
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) view.findViewById(R.id.or);
        this.f117455a = avatarImageWithVerify;
        avatarImageWithVerify.setRequestImgSize(em.a(101));
        this.f117464j = view.findViewById(R.id.dqe);
        this.f117456b = (TextView) view.findViewById(R.id.fdm);
        this.f117457c = (TextView) view.findViewById(R.id.dig);
        this.f117458d = (TextView) view.findViewById(R.id.b7a);
        this.p = view.findViewById(R.id.bwj);
        ImageView imageView = (ImageView) view.findViewById(R.id.a7h);
        this.q = imageView;
        imageView.setOnClickListener(this);
        this.f117467m.setOnClickListener(this);
        this.f117455a.setOnClickListener(this);
        this.f117458d.setOnClickListener(this);
        if (this.o == null) {
            w i3 = FriendsServiceImpl.s().i();
            this.o = i3;
            i3.a(this);
        }
        this.f117466l = i2;
        this.r = obj;
    }
}
