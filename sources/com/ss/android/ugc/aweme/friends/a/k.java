package com.ss.android.ugc.aweme.friends.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.c.b;
import com.ss.android.ugc.aweme.friends.e.a;
import com.ss.android.ugc.aweme.friends.invite.I18nFollowAndInviteUserBtn;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import com.zhiliaoapp.musically.R;

public final class k<T extends User> extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final boolean f96798a;

    /* renamed from: b  reason: collision with root package name */
    Context f96799b;

    /* renamed from: c  reason: collision with root package name */
    public T f96800c;

    /* renamed from: d  reason: collision with root package name */
    public int f96801d;

    /* renamed from: e  reason: collision with root package name */
    b f96802e;

    /* renamed from: f  reason: collision with root package name */
    View f96803f;

    /* renamed from: g  reason: collision with root package name */
    TextView f96804g;

    /* renamed from: h  reason: collision with root package name */
    TextView f96805h;

    /* renamed from: i  reason: collision with root package name */
    I18nFollowAndInviteUserBtn f96806i;

    /* renamed from: j  reason: collision with root package name */
    ViewGroup f96807j;

    /* renamed from: k  reason: collision with root package name */
    TextView f96808k;

    /* renamed from: l  reason: collision with root package name */
    boolean f96809l;

    /* renamed from: m  reason: collision with root package name */
    TextView f96810m;
    public int n;
    int o;
    String p = "";

    static {
        Covode.recordClassIndex(61415);
    }

    static String a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "" : "vk" : "facebook" : "twitter" : "weibo" : "contact_friend";
    }

    public final void b() {
        T t = this.f96800c;
        if (t != null) {
            this.f96806i.a(t.getFollowStatus(), this.f96800c.getFollowerStatus());
        }
    }

    public final String d() {
        int i2 = this.f96801d;
        if (i2 == 0) {
            return "contact";
        }
        if (i2 == 3) {
            return "facebook";
        }
        if (i2 == 2) {
            return "twitter";
        }
        if (i2 == 4) {
            return "vk";
        }
        return "";
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void c() {
        if (a(this.f96800c) != null) {
            if (!a(this.f96800c).isInvited()) {
                this.f96806i.d();
            } else {
                this.f96806i.e();
            }
        }
    }

    static Friend a(T t) {
        if (t instanceof Friend) {
            return (Friend) t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        T t = this.f96800c;
        if (t != null && !TextUtils.isEmpty(t.getUid())) {
            r.a(str, a(this.f96801d), this.f96800c.getUid(), 0);
            a.d(this.f96800c, this.n, "", d());
            u q = new u().a("find_friends_page").q(this.p);
            q.f109596a = u.c.CARD;
            q.f109597b = u.a.ENTER_PROFILE;
            q.a(this.f96800c).s(this.f96800c.getRequestId()).f();
            SmartRouter.buildRoute(this.f96799b, "aweme://user/profile/").withParam("uid", this.f96800c.getUid()).withParam("sec_user_id", this.f96800c.getSecUid()).withParam("from_discover", a(this.f96801d)).withParam("recommend_enter_profile_params", new g("find_friends_page", null, u.c.CARD, this.f96800c.getRecType(), g.getFollowType(this.f96800c), this.f96800c.getUid(), null, null, this.f96800c.getRequestId(), null, this.f96800c.getFriendTypeStr(), this.f96800c.getSocialInfo())).open();
        }
    }

    public k(View view, b bVar, boolean z, boolean z2, final String str) {
        super(view);
        this.f96809l = z2;
        this.f96798a = z;
        this.f96799b = view.getContext();
        this.f96803f = view.findViewById(R.id.bu0);
        this.f96804g = (TextView) view.findViewById(R.id.fb8);
        this.f96805h = (TextView) view.findViewById(R.id.faq);
        this.f96806i = (I18nFollowAndInviteUserBtn) view.findViewById(R.id.fap);
        this.p = str;
        this.f96807j = (ViewGroup) view.findViewById(R.id.b_4);
        this.f96802e = bVar;
        this.f96806i.setOnClickListener(new l(this));
        this.f96803f.setOnClickListener(new m(this));
        this.f96804g.setOnClickListener(new n(this));
        this.f96807j.setOnClickListener(new o(this));
        this.f96808k = (TextView) view.findViewById(R.id.bnx);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.ugc.aweme.friends.a.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(61416);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            public final void onViewAttachedToWindow(View view) {
                if (k.this.f96801d != 0) {
                    a.a(k.this.f96800c, k.this.n, "", k.this.d());
                    u q = new u().a("find_friends_page").q(str);
                    q.f109596a = u.c.CARD;
                    q.f109597b = u.a.SHOW;
                    q.a(k.this.f96800c).s(k.this.f96800c.getRequestId()).f();
                } else if (!TextUtils.isEmpty(k.this.f96800c.getUid())) {
                    a.a(k.this.f96800c, k.this.n, "", k.this.d());
                    u q2 = new u().a("find_friends_page").q(str);
                    q2.f109596a = u.c.CARD;
                    q2.f109597b = u.a.SHOW;
                    q2.a(k.this.f96800c).s(k.this.f96800c.getRequestId()).f();
                }
            }
        });
        if (z2) {
            this.f96810m = (TextView) view.findViewById(R.id.fb2);
            this.f96806i.setShowMessage(I18nFollowAndInviteUserBtn.b());
            return;
        }
        this.f96806i.setShowMessage(false);
    }
}
