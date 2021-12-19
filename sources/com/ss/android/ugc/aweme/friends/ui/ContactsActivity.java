package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.page.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.common.l;
import com.ss.android.ugc.aweme.friends.a.d;
import com.ss.android.ugc.aweme.friends.a.k;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import com.ss.android.ugc.aweme.friends.widget.IndexView;
import com.ss.android.ugc.aweme.notice.api.bean.m;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.ss.android.ugc.aweme.utils.au;
import com.ss.android.ugc.aweme.utils.en;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class ContactsActivity extends a implements b, h.a, c, r, i, j {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f97053a;

    /* renamed from: b  reason: collision with root package name */
    TextTitleBar f97054b;

    /* renamed from: c  reason: collision with root package name */
    DmtStatusView f97055c;

    /* renamed from: d  reason: collision with root package name */
    SwipeRefreshLayout f97056d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f97057e;

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f97058f;

    /* renamed from: g  reason: collision with root package name */
    IndexView f97059g;

    /* renamed from: h  reason: collision with root package name */
    TextView f97060h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.friends.a.j<Friend> f97061i;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.common.e.b<ThirdPartyFriendModel> f97062j;

    /* renamed from: k  reason: collision with root package name */
    public o f97063k;

    /* renamed from: l  reason: collision with root package name */
    d f97064l;

    /* renamed from: m  reason: collision with root package name */
    boolean f97065m;
    public LinearLayoutManager n;
    public String o = "";
    public com.ss.android.ugc.aweme.friends.f.c p;
    private int q = 1;
    private InviteContactFriendsModel r;
    private final f.a.b.a s = new f.a.b.a();
    private List<Friend> t = new ArrayList();
    private com.ss.android.ugc.aweme.friends.c.b u = new com.ss.android.ugc.aweme.friends.c.b() {
        /* class com.ss.android.ugc.aweme.friends.ui.ContactsActivity.AnonymousClass2 */

        static {
            Covode.recordClassIndex(61690);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.friends.c.b
        public final boolean a(Friend friend) {
            k kVar;
            ContactModel contactModel = new ContactModel(friend.getSocialName(), friend.getNickname());
            friend.setInvited(true);
            int a2 = ContactsActivity.this.f97061i.a(contactModel);
            if (!(a2 == -1 || (kVar = (k) ContactsActivity.this.f97053a.f(a2)) == null)) {
                kVar.c();
            }
            ContactsActivity.this.p.a(com.ss.android.ugc.aweme.friends.f.c.a(ContactsActivity.this.p.b(), "", "invitesinglesms", "find_contact_friends", true), new s(this, com.ss.android.ugc.aweme.account.b.g().getCurUser(), contactModel));
            return true;
        }

        @Override // com.ss.android.ugc.aweme.friends.c.b
        public final boolean a(String str, String str2, int i2, int i3, boolean z) {
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(ContactsActivity.this).a(R.string.de8).a();
                return false;
            } else if (ContactsActivity.this.f97063k == null || ContactsActivity.this.f97063k.j()) {
                return false;
            } else {
                ContactsActivity.this.f97063k.a(new n.a().a(str).b(str2).a(z).a(i3).b(4).c(ContactsActivity.this.o).d(i2).a());
                return true;
            }
        }
    };

    static {
        Covode.recordClassIndex(61688);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void b(FollowStatus followStatus) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "2474";
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(36, new g(ContactsActivity.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        isDestroyed();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        if (!isDestroyed()) {
            this.f97061i.ag_();
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        com.ss.android.ugc.aweme.push.a.a(this);
        this.s.a();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        if (!isDestroyed()) {
            this.f97056d.setRefreshing(false);
            this.f97061i.b_(null);
            this.f97061i.ai_();
            this.f97055c.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        this.f97062j.a(4);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        EventBus.a().b(this);
        com.ss.android.ugc.aweme.common.e.b<ThirdPartyFriendModel> bVar = this.f97062j;
        if (bVar != null) {
            bVar.cd_();
        }
        o oVar = this.f97063k;
        if (oVar != null) {
            oVar.cd_();
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", true);
        super.onResume();
        if (this.f97065m) {
            if (c.a.f141661a.b()) {
                ((com.ss.android.ugc.aweme.friends.a) com.ss.android.ugc.aweme.base.b.a.b.a(this, com.ss.android.ugc.aweme.friends.a.class)).a(false);
                if (c.a.f141661a.a()) {
                    d();
                } else {
                    c.a.a(true);
                    this.s.a(com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(1, true).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new m(this), n.f97262a));
                }
            }
            this.f97065m = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", false);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        com.bytedance.common.utility.n.a(this.f97055c, 0);
        this.f97055c.f();
        com.ss.android.ugc.aweme.friends.a.j<Friend> jVar = new com.ss.android.ugc.aweme.friends.a.j<>(this.u);
        this.f97061i = jVar;
        jVar.f96786d = true;
        this.f97061i.a((h.a) this);
        this.f97061i.g(androidx.core.content.b.c(this, R.color.c5));
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        this.n = wrapLinearLayoutManager;
        wrapLinearLayoutManager.b(1);
        this.f97053a.setLayoutManager(this.n);
        this.f97053a.setOverScrollMode(2);
        d dVar = new d(androidx.core.content.b.c(this, R.color.f159928l), (int) com.bytedance.common.utility.n.b(this, 0.5f), 1, com.bytedance.common.utility.n.b(this, 20.0f), com.bytedance.common.utility.n.b(this, 20.0f));
        this.f97064l = dVar;
        this.f97053a.a(dVar);
        this.f97053a.setAdapter(this.f97061i);
        this.p.a();
        this.f97056d.setEnabled(true);
        this.f97056d.setOnRefreshListener(new o(this));
        com.ss.android.ugc.aweme.common.e.b<ThirdPartyFriendModel> bVar = new com.ss.android.ugc.aweme.common.e.b<>();
        this.f97062j = bVar;
        bVar.a_(this);
        ThirdPartyFriendModel thirdPartyFriendModel = new ThirdPartyFriendModel("contact", this.q);
        thirdPartyFriendModel.isNewStyle = true;
        this.f97062j.a((com.ss.android.ugc.aweme.common.b) thirdPartyFriendModel);
        this.f97062j.a(1);
        o oVar = new o();
        this.f97063k = oVar;
        oVar.a_(this);
    }

    private void a(boolean z) {
        if (!z) {
            this.f97061i.d(false);
            this.f97061i.a((h.a) null);
            return;
        }
        this.f97061i.ai_();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        if (!isDestroyed()) {
            this.f97056d.setRefreshing(false);
            if (this.f97061i.e() == null) {
                this.f97055c.g();
            }
        }
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
        k kVar;
        if (!isDestroyed() && this.f97063k != null && this.f97061i != null) {
            l.a(com.ss.android.ugc.aweme.base.utils.o.a((Context) this), exc);
            int a2 = this.f97061i.a(this.f97063k.f116607d);
            if (a2 >= 0 && (kVar = (k) this.f97053a.f(a2)) != null) {
                kVar.b();
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        k kVar;
        FollowStatus followStatus = followStatusEvent.status;
        if (!isDestroyed()) {
            this.f97061i.a(followStatus);
            int a2 = this.f97061i.a(followStatus.userId);
            if (a2 != -1 && (kVar = (k) this.f97053a.f(a2)) != null) {
                kVar.b();
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65559e = R.attr.f159902m;
        xVar.f65560f = R.attr.f159902m;
        xVar.f65562h = true;
        activityConfiguration(new g(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.a1y);
        this.f97053a = (RecyclerView) findViewById(R.id.cbi);
        this.f97054b = (TextTitleBar) findViewById(R.id.em8);
        this.f97055c = (DmtStatusView) findViewById(R.id.e_o);
        this.f97056d = (SwipeRefreshLayout) findViewById(R.id.dk8);
        this.f97057e = (ImageView) findViewById(R.id.a7o);
        this.f97058f = (RelativeLayout) findViewById(R.id.awy);
        this.f97059g = (IndexView) findViewById(R.id.bnz);
        this.f97060h = (TextView) findViewById(R.id.bnt);
        View findViewById = findViewById(R.id.awz);
        if (findViewById != null) {
            findViewById.setOnClickListener(new h(this));
        }
        View findViewById2 = findViewById(R.id.a7o);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new k(this));
        }
        ContactsActivityArgs contactsActivityArgs = (ContactsActivityArgs) RouteArgExtension.INSTANCE.navArg(this, l.f97260a).getValue();
        EventBus.a(EventBus.a(), this);
        if (contactsActivityArgs != null) {
            this.o = contactsActivityArgs.getEnterFrom();
        }
        this.q = getIntent().getIntExtra("scene", this.q);
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        if (SharePrefCache.inst().getHasEnterBindPhone().c().booleanValue() || curUser.isPhoneBinded()) {
            this.f97058f.setVisibility(8);
        } else {
            this.f97058f.setVisibility(0);
        }
        this.f97054b.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.friends.ui.ContactsActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(61689);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                ContactsActivity.this.onBackPressed();
            }
        });
        this.f97054b.setTitle(getText(R.string.d5i));
        TextTitleBar textTitleBar = this.f97054b;
        textTitleBar.setTitleColor(androidx.core.content.b.c(textTitleBar.getContext(), R.color.bx));
        if (com.ss.android.ugc.aweme.notice.api.b.c(4)) {
            com.ss.android.ugc.aweme.notice.api.b.d(4);
            com.ss.android.ugc.d.a.c.a(new m(4));
        }
        DmtStatusView.a a2 = DmtStatusView.a.a(this).a();
        MtEmptyView a3 = MtEmptyView.a(this);
        a3.setStatus(new d.a(this).a(2131232659).b(R.string.cwz).c(R.string.bnc).f33648a);
        a2.b(a3);
        this.f97055c.setBuilder(a2);
        this.r = new InviteContactFriendsModel("contact", this.q);
        this.p = new com.ss.android.ugc.aweme.friends.f.c(this.r, null);
        if (c.a.f141661a.c()) {
            d();
        } else {
            this.s.a(com.ss.android.ugc.aweme.ufr.b.a(this, ContactUFR.class, in.c().getUid(), "find_friends_page", "click", true, true, null).d(new p(this)));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", false);
    }

    private static void a(List<Friend> list, int i2) {
        for (int i3 = i2; i3 < list.size(); i3++) {
            if (i3 > i2) {
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    if (TextUtils.equals(list.get(i3).getSection(), list.get(i4).getSection())) {
                        list.get(i3).setSection("");
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List list, boolean z) {
        if (!isDestroyed()) {
            this.f97061i.ai_();
            this.f97061i.b(list);
            this.f97055c.setVisibility(4);
            a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List list, boolean z) {
        if (!isDestroyed()) {
            final int i2 = 0;
            this.f97056d.setRefreshing(false);
            if (list == null || list.isEmpty()) {
                this.f97055c.g();
                return;
            }
            this.f97061i.d(true);
            this.f97061i.ai_();
            this.f97055c.d();
            if (this.f97061i.f96786d) {
                com.ss.android.ugc.aweme.friends.i.d dVar = new com.ss.android.ugc.aweme.friends.i.d();
                h.f.b.l.d(list, "");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    User user = (User) it.next();
                    if (!TextUtils.isEmpty(user.getUid())) {
                        arrayList.add(user);
                        it.remove();
                    }
                }
                dVar.f96877a = arrayList.size();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Friend friend = (Friend) it2.next();
                    friend.setSection(au.a(friend.getNickname()));
                }
                dVar.a(list);
                list.addAll(0, arrayList);
                this.f97061i.a((SectionIndexer) dVar.a());
                this.f97061i.f96787e = dVar.f96877a;
                a(list, dVar.f96877a);
                List<String> list2 = dVar.f96878b;
                List<Integer> list3 = dVar.f96879c;
                int i3 = dVar.f96877a;
                if (en.b()) {
                    this.f97059g.setVisibility(0);
                    IndexView indexView = this.f97059g;
                    indexView.f97290a.clear();
                    indexView.f97291b.clear();
                    indexView.f97290a.addAll(list2);
                    indexView.f97291b.addAll(list3);
                    indexView.requestLayout();
                    this.f97059g.setIndexLetterTv(this.f97060h);
                    if (i3 > 0) {
                        i2 = 0 + i3 + 2;
                    }
                    this.f97059g.setOnLetterTouchListener(new q(this, i2));
                    this.f97053a.f();
                    this.f97053a.a(new RecyclerView.n() {
                        /* class com.ss.android.ugc.aweme.friends.ui.ContactsActivity.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(61691);
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.n
                        public final void a(RecyclerView recyclerView, int i2) {
                            super.a(recyclerView, i2);
                            ContactsActivity.this.f97059g.setRecycleViewPos(ContactsActivity.this.n.k() - i2);
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.n
                        public final void a(RecyclerView recyclerView, int i2, int i3) {
                            super.a(recyclerView, i2, i3);
                        }
                    });
                } else {
                    this.f97059g.setVisibility(8);
                }
            }
            this.f97061i.b_(list);
            this.f97055c.setVisibility(8);
            a(z);
        }
    }

    @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        com.ss.android.ugc.aweme.utils.permission.a.a(this, i2, iArr);
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }
}
