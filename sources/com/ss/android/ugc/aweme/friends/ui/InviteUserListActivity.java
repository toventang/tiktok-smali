package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.c;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.common.l;
import com.ss.android.ugc.aweme.friends.a.d;
import com.ss.android.ugc.aweme.friends.a.k;
import com.ss.android.ugc.aweme.friends.f.c;
import com.ss.android.ugc.aweme.friends.model.FacebookFriends;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.share.InviteFriendSharePackage;
import com.ss.android.ugc.aweme.sharer.m;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class InviteUserListActivity extends a implements com.bytedance.lobby.auth.a, h.a, c<Friend>, c.a, r, i, j {

    /* renamed from: d  reason: collision with root package name */
    public static final Float f97113d = Float.valueOf(88.0f);
    private static final boolean p = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f97114a;

    /* renamed from: b  reason: collision with root package name */
    public b<com.ss.android.ugc.aweme.friends.f.a> f97115b;

    /* renamed from: c  reason: collision with root package name */
    public o f97116c;

    /* renamed from: e  reason: collision with root package name */
    ButtonTitleBar f97117e;

    /* renamed from: f  reason: collision with root package name */
    TextView f97118f;

    /* renamed from: g  reason: collision with root package name */
    DmtStatusView f97119g;

    /* renamed from: h  reason: collision with root package name */
    SwipeRefreshLayout f97120h;

    /* renamed from: i  reason: collision with root package name */
    RecyclerView f97121i;

    /* renamed from: j  reason: collision with root package name */
    TextView f97122j;

    /* renamed from: k  reason: collision with root package name */
    View f97123k;

    /* renamed from: l  reason: collision with root package name */
    int f97124l = 3;

    /* renamed from: m  reason: collision with root package name */
    public String f97125m;
    String n;
    String o = "";
    private com.ss.android.ugc.aweme.friends.a.j q;
    private d r;
    private com.bytedance.lobby.internal.d s;
    private f.a.b.a t = new f.a.b.a();
    private String u = "";
    private int v = 1;
    private String w;
    private e x;
    private InviteFriendSharePackage y;
    private com.ss.android.ugc.aweme.friends.c.b z = new com.ss.android.ugc.aweme.friends.c.b() {
        /* class com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity.AnonymousClass2 */

        static {
            Covode.recordClassIndex(61713);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        private static boolean b() {
            if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
                return com.ss.android.ugc.aweme.lancet.j.f107229h;
            }
            boolean a2 = a();
            com.ss.android.ugc.aweme.lancet.j.f107229h = a2;
            return a2;
        }

        @Override // com.ss.android.ugc.aweme.friends.c.b
        public final boolean a(Friend friend) {
            if (!b()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(InviteUserListActivity.this).a(R.string.de8).a();
                return false;
            } else if (InviteUserListActivity.this.f97114a) {
                return false;
            } else {
                InviteUserListActivity.this.f97114a = true;
                return true;
            }
        }

        @Override // com.ss.android.ugc.aweme.friends.c.b
        public final boolean a(String str, String str2, int i2, int i3, boolean z) {
            if (!b()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(InviteUserListActivity.this).a(R.string.de8).a();
                return false;
            } else if (InviteUserListActivity.this.f97115b == null || InviteUserListActivity.this.f97116c.j()) {
                return false;
            } else {
                InviteUserListActivity.this.f97116c.a(new n.a().a(str).b(str2).a(z).a(i3).c(InviteUserListActivity.this.f97125m).d(i2).a());
                return true;
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void b(FollowStatus followStatus) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Friend> list, boolean z2) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(36, new g(InviteUserListActivity.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        if (!isDestroyed()) {
            this.q.ag_();
        }
    }

    static {
        Covode.recordClassIndex(61711);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        if (!isDestroyed()) {
            this.f97115b.a(4);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        b<com.ss.android.ugc.aweme.friends.f.a> bVar = this.f97115b;
        if (bVar != null) {
            bVar.cd_();
        }
        o oVar = this.f97116c;
        if (oVar != null) {
            oVar.cd_();
        }
        this.t.a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        e eVar = this.x;
        if (eVar != null && this.y != null && eVar.f124649a.size() > 0) {
            com.ss.android.ugc.aweme.sharer.b bVar = this.x.f124649a.get(0);
            if (!this.y.a(bVar, this)) {
                bVar.a(this.y.a(bVar), this);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        if (!isDestroyed()) {
            if (this.q.c() == 0) {
                this.f97120h.setRefreshing(false);
                this.f97119g.setVisibility(0);
                this.f97119g.f();
                return;
            }
            this.f97120h.setRefreshing(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        if (!isDestroyed()) {
            this.f97119g.setVisibility(0);
            this.f97119g.g();
            this.f97120h.setRefreshing(false);
            if (this.q.v) {
                this.q.d(false);
                this.q.notifyDataSetChanged();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            t.a(t.a(), this, u.a("aweme://main").a("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION").f71178a.a());
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    private m h() {
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        String a2 = com.a.a(getString(R.string.coj), new Object[]{in.b(curUser)});
        return new m(a2 + " " + ("https://m.tiktok.com/invitef/download?username=" + in.b(curUser)), (byte) 0);
    }

    public final void c() {
        int i2 = this.f97124l;
        if (i2 == 3) {
            ThirdPartyFriendModel thirdPartyFriendModel = new ThirdPartyFriendModel("facebook", this.n, null, Long.valueOf(c.b.f141662a.d(this.o)), this.v);
            thirdPartyFriendModel.isNewStyle = true;
            this.f97115b.a((com.ss.android.ugc.aweme.common.b) thirdPartyFriendModel);
        } else if (i2 == 2) {
            ThirdPartyFriendModel thirdPartyFriendModel2 = new ThirdPartyFriendModel("twitter", this.n, this.w);
            thirdPartyFriendModel2.isNewStyle = true;
            this.f97115b.a((com.ss.android.ugc.aweme.common.b) thirdPartyFriendModel2);
        } else if (i2 == 4) {
            ThirdPartyFriendModel thirdPartyFriendModel3 = new ThirdPartyFriendModel("vk", this.n, this.w);
            thirdPartyFriendModel3.isNewStyle = true;
            this.f97115b.a((com.ss.android.ugc.aweme.common.b) thirdPartyFriendModel3);
        } else {
            return;
        }
        this.f97115b.a(1);
        o oVar = new o();
        this.f97116c = oVar;
        oVar.a_(this);
        this.f97114a = false;
    }

    private void d() {
        int i2 = this.f97124l;
        if (i2 == 2) {
            com.ss.android.ugc.aweme.common.r.a("friend_list_notify_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "twitter").f66730a);
            c.a aVar = new c.a(this);
            aVar.f40170a = "twitter";
            aVar.f40172c = this;
            com.bytedance.lobby.internal.d.a(aVar.a());
        } else if (i2 == 3) {
            com.ss.android.ugc.aweme.common.r.a("friend_list_notify_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "facebook").f66730a);
            this.t.a(com.ss.android.ugc.aweme.ufr.b.a(this, com.ss.android.ugc.aweme.ufr.a.a.class, this.o, "find_friends_page", "click", true, false, null).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new am(this)));
        } else if (i2 == 4) {
            com.ss.android.ugc.aweme.common.r.a("friend_list_notify_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "vk").f66730a);
            c.a aVar2 = new c.a(this);
            aVar2.f40170a = "vk";
            aVar2.f40172c = this;
            com.bytedance.lobby.internal.d.a(aVar2.a());
        }
    }

    private void a(boolean z2) {
        if (!z2) {
            this.q.d(false);
            this.q.a((h.a) null);
            return;
        }
        this.q.ai_();
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void c(FollowStatus followStatus) {
        if (followStatus.followStatus == 0) {
            com.ss.android.ugc.aweme.common.r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "find_friends_page").a("to_user_id", followStatus.userId).f66730a);
        } else {
            com.ss.android.ugc.aweme.common.r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "find_friends_page").a("to_user_id", followStatus.userId).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void d_(Exception exc) {
        if (!isDestroyed() && this.f97116c != null && this.q != null) {
            l.a(com.ss.android.ugc.aweme.base.utils.o.a((Context) this), exc);
            int b2 = this.q.b(this.f97116c.f116607d);
            if (b2 >= 0) {
                try {
                    k kVar = (k) this.f97121i.f(b2);
                    if (kVar != null) {
                        kVar.b();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus = followStatusEvent.status;
        if (!isDestroyed()) {
            this.q.a(followStatus);
            int b2 = this.q.b(followStatus.userId);
            if (b2 != -1) {
                try {
                    k kVar = (k) this.f97121i.f(b2);
                    if (kVar != null) {
                        kVar.b();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 3002047) {
            com.ss.android.ugc.aweme.friends.service.a.f97047a.g().b(this.o);
        }
        if (!isDestroyed()) {
            this.f97119g.setVisibility(0);
            this.f97119g.g();
            if (this.q.v) {
                this.q.d(false);
                this.q.notifyDataSetChanged();
            }
            this.f97120h.setRefreshing(false);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.br2) {
            int i2 = this.f97124l;
            if (i2 == 3) {
                com.ss.android.ugc.aweme.common.r.a("invite_friend", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "facebook").f66730a);
                a();
            } else if (i2 == 2) {
                com.ss.android.ugc.aweme.common.r.a("invite_friend", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "twitter").f66730a);
                com.ss.android.ugc.aweme.sharer.b a2 = com.ss.android.ugc.aweme.sharer.c.a("twitter", null);
                if (a2 != null) {
                    a2.a(h(), (Context) this);
                }
            } else if (i2 == 4) {
                com.ss.android.ugc.aweme.common.r.a("invite_friend", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "vk").f66730a);
                com.ss.android.ugc.aweme.sharer.b a3 = com.ss.android.ugc.aweme.sharer.c.a("vk", null);
                if (a3 != null) {
                    a3.a(h(), (Context) this);
                }
            }
        } else if (view.getId() == R.id.dn8) {
            setResult(-1);
            finish();
        }
    }

    @Override // com.bytedance.lobby.auth.a
    public final void a(AuthResult authResult) {
        if (!isDestroyed()) {
            if (!authResult.f40147a) {
                if (!authResult.f40148b) {
                    new com.bytedance.tux.g.b(this).e(R.string.cog).b();
                }
                this.f97120h.setRefreshing(false);
                finish();
                return;
            }
            String str = authResult.f40150d;
            str.hashCode();
            if (!str.equals("twitter")) {
                if (str.equals("vk")) {
                    this.n = authResult.f40152f;
                    c();
                }
            } else if (TextUtils.isEmpty(authResult.f40152f) || TextUtils.isEmpty(authResult.f40153g)) {
                new com.bytedance.tux.g.b(this).e(R.string.cog).b();
            } else {
                com.ss.android.ugc.aweme.common.r.a("friend_list_notify_confirm", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "twitter").f66730a);
                this.n = authResult.f40152f;
                String str2 = authResult.f40153g;
                this.w = str2;
                com.ss.android.ugc.trill.c.a.a.c(this.n, str2);
                c();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        if (!isDestroyed()) {
            this.q.i();
            if (exc != null && (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 101) {
                d();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0242  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
        // Method dump skipped, instructions count: 768
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Friend> list, boolean z2) {
        if (!isDestroyed()) {
            a(z2);
            this.q.b(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Friend> list, boolean z2) {
        if (!isDestroyed()) {
            this.f97119g.d();
            this.f97119g.setVisibility(8);
            this.f97120h.setRefreshing(false);
            this.q.d(true);
            if (!list.isEmpty()) {
                list.add(0, new FacebookFriends(1));
                list.add(new FacebookFriends(2));
            }
            this.q.b_(list);
            a(z2);
        }
    }
}
