package com.ss.android.ugc.aweme.friends.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.page.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.a.d;
import com.ss.android.ugc.aweme.friends.a.k;
import com.ss.android.ugc.aweme.friends.f.c;
import com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import com.ss.android.ugc.aweme.share.InviteFriendSharePackage;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.utils.be;
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

public class InviteFriendsActivity extends a implements b, h.a, c<Friend>, c.a, i, j {
    private static String n = "invite_friends";

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f97096a;

    /* renamed from: b  reason: collision with root package name */
    TextTitleBar f97097b;

    /* renamed from: c  reason: collision with root package name */
    DmtStatusView f97098c;

    /* renamed from: d  reason: collision with root package name */
    SwipeRefreshLayout f97099d;

    /* renamed from: e  reason: collision with root package name */
    View f97100e;

    /* renamed from: f  reason: collision with root package name */
    View f97101f;

    /* renamed from: g  reason: collision with root package name */
    ShareChannelBar f97102g;

    /* renamed from: h  reason: collision with root package name */
    com.ss.android.ugc.aweme.friends.f.c f97103h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.friends.a.j<Friend> f97104i;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.common.e.b<InviteContactFriendsModel> f97105j;

    /* renamed from: k  reason: collision with root package name */
    d f97106k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f97107l;

    /* renamed from: m  reason: collision with root package name */
    public List<Friend> f97108m = new ArrayList();
    private View o;
    private InviteContactFriendsModel p;
    private int q = 1;
    private com.ss.android.ugc.aweme.friends.a.h r;
    private float s;
    private ValueAnimator t;
    private com.ss.android.ugc.aweme.friends.c.b u = new com.ss.android.ugc.aweme.friends.c.b() {
        /* class com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity.AnonymousClass4 */

        static {
            Covode.recordClassIndex(61710);
        }

        @Override // com.ss.android.ugc.aweme.friends.c.b
        public final boolean a(String str, String str2, int i2, int i3, boolean z) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.friends.c.b
        public final boolean a(Friend friend) {
            k kVar;
            if (InviteFriendsActivity.this.f97108m.contains(friend)) {
                return false;
            }
            InviteFriendsActivity.this.f97108m.add(friend);
            ContactModel contactModel = new ContactModel(friend.getSocialName(), friend.getNickname());
            InviteFriendsActivity inviteFriendsActivity = InviteFriendsActivity.this;
            inviteFriendsActivity.f97103h.a(com.ss.android.ugc.aweme.friends.f.c.a(inviteFriendsActivity.f97103h.b(), "", "invitesinglesms", "invite_friends", true), new ad(inviteFriendsActivity, com.ss.android.ugc.aweme.account.b.g().getCurUser(), contactModel));
            friend.setInvited(true);
            InviteFriendsActivity.this.f97108m.remove(friend);
            int a2 = InviteFriendsActivity.this.f97104i.a(contactModel) + 1;
            if (!(a2 == -1 || (kVar = (k) InviteFriendsActivity.this.f97096a.f(a2)) == null)) {
                kVar.c();
            }
            r.a("invite_friend_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "invite_friends").f66730a);
            return true;
        }
    };

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "6234";
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Friend> list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(297, new g(InviteFriendsActivity.class, "onSyncContactStatusEvent", SyncContactStatusEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(243, new g(InviteFriendsActivity.class, "onBackFromPermissionSettingEvent", BackFromSettingEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        isDestroyed();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        com.ss.android.ugc.aweme.push.a.a(this);
    }

    static {
        Covode.recordClassIndex(61706);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        if (!isDestroyed()) {
            this.f97104i.ag_();
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        EventBus.a().b(this);
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.t.cancel();
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

    public final void d() {
        n.a(this.f97101f, 0);
        n.a(this.f97100e, 0);
        n.a(this.f97102g, 0);
        InviteFriendSharePackage a2 = InviteFriendSharePackage.a.a(this.f97103h);
        e.b bVar = new e.b();
        ah.f123352a.a(bVar, (Activity) this, true);
        bVar.a(a2).a(new com.ss.android.ugc.aweme.share.improve.b.b());
        e a3 = bVar.a();
        if (a3.f124652d) {
            Iterator<com.ss.android.ugc.aweme.sharer.b> it = a3.f124649a.iterator();
            while (it.hasNext()) {
                if (!it.next().b(this)) {
                    it.remove();
                }
            }
        }
        this.f97102g.a(a3.f124649a);
        this.f97102g.a(new ab(this, a2));
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        if (!isDestroyed()) {
            this.f97099d.setRefreshing(false);
            this.f97104i.b_(null);
            this.f97104i.ai_();
            this.f97098c.setVisibility(0);
            this.f97098c.g();
            if (this.f97102g.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f97098c.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) n.b(this, 134.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f97098c.setLayoutParams(marginLayoutParams);
            }
            n.a(this.f97099d, 0);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onResume", true);
        super.onResume();
        if (this.f97107l) {
            this.f97107l = false;
            if (be.a(this)) {
                ((com.ss.android.ugc.aweme.friends.a) com.ss.android.ugc.aweme.base.b.a.b.a(this, com.ss.android.ugc.aweme.friends.a.class)).a(false);
                if (com.ss.android.ugc.aweme.friends.service.a.f97047a.e()) {
                    h();
                    d();
                } else {
                    com.ss.android.ugc.aweme.friends.service.a.f97047a.a("invite_friends", true);
                }
            } else {
                finish();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onResume", false);
    }

    public final void h() {
        int i2;
        n.a(this.f97098c, 0);
        this.f97098c.f();
        com.ss.android.ugc.aweme.friends.a.j<Friend> jVar = new com.ss.android.ugc.aweme.friends.a.j<>(this.u);
        this.f97104i = jVar;
        jVar.a((h.a) this);
        this.f97104i.g(androidx.core.content.b.c(this, R.color.c5));
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.b(1);
        this.f97096a.setLayoutManager(wrapLinearLayoutManager);
        this.f97096a.setOverScrollMode(2);
        View a2 = com.a.a(LayoutInflater.from(this), R.layout.a2_, this.f97096a, false);
        this.o = a2;
        this.f97104i.a(a2);
        this.f97100e = this.o.findViewById(R.id.br6);
        this.f97101f = this.o.findViewById(R.id.bre);
        this.f97102g = (ShareChannelBar) this.o.findViewById(R.id.cgm);
        d dVar = new d(androidx.core.content.b.c(this, R.color.f159928l), (int) n.b(this, 0.5f), 1, n.b(this, 20.0f), n.b(this, 20.0f));
        this.f97106k = dVar;
        this.f97096a.a(dVar);
        this.f97096a.setAdapter(this.f97104i);
        View view = this.f97100e;
        Resources resources = getResources();
        if (com.bytedance.ies.dmt.ui.common.b.b(null)) {
            i2 = R.color.b2;
        } else {
            i2 = R.color.a0;
        }
        view.setBackgroundColor(resources.getColor(i2));
        this.f97099d.setOnRefreshListener(new ac(this));
        com.ss.android.ugc.aweme.common.e.b<InviteContactFriendsModel> bVar = new com.ss.android.ugc.aweme.common.e.b<>();
        this.f97105j = bVar;
        bVar.a_(this);
        this.f97105j.a((com.ss.android.ugc.aweme.common.b) this.p);
        this.f97105j.a(1);
        this.f97103h.a();
        this.s = n.b(this, 84.0f);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onBackFromPermissionSettingEvent(BackFromSettingEvent backFromSettingEvent) {
        if ("invite_friends".equals(backFromSettingEvent.enterFrom)) {
            this.f97107l = true;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onSyncContactStatusEvent(SyncContactStatusEvent syncContactStatusEvent) {
        if ("invite_friends".equals(syncContactStatusEvent.enterFrom) && syncContactStatusEvent.isSuccess && !syncContactStatusEvent.lastValue) {
            h();
            d();
        }
    }

    private void a(boolean z) {
        if (!z) {
            this.f97104i.d(false);
            this.f97104i.a((h.a) null);
            return;
        }
        this.f97104i.ai_();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        if (!isDestroyed()) {
            this.f97099d.setRefreshing(false);
            if (this.f97104i.e() == null) {
                this.f97098c.setVisibility(0);
                this.f97098c.g();
                if (this.f97102g.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f97098c.getLayoutParams();
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) n.b(this, 134.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    this.f97098c.setLayoutParams(marginLayoutParams);
                }
            }
            n.a(this.f97099d, 0);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(android.os.Bundle r22) {
        /*
        // Method dump skipped, instructions count: 508
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, InviteFriendsActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str);
        }
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Friend> list, boolean z) {
        if (!isDestroyed()) {
            this.f97104i.ai_();
            this.f97104i.b(list);
            this.f97098c.setVisibility(4);
            a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Friend> list, boolean z) {
        if (!isDestroyed()) {
            this.f97099d.setRefreshing(false);
            if (list == null) {
                this.f97098c.setVisibility(0);
            } else {
                this.f97104i.ai_();
                List<String> list2 = ((InviteContactFriendsModel) this.f97105j.f76396h).mIndexLetters;
                List<Integer> list3 = ((InviteContactFriendsModel) this.f97105j.f76396h).mIndexCounts;
                com.ss.android.ugc.aweme.friends.a.h hVar = this.r;
                if (hVar != null) {
                    this.f97096a.c(hVar);
                    this.r = null;
                }
                if (!list2.isEmpty() && !list3.isEmpty()) {
                    int[] iArr = new int[list3.size()];
                    for (int i2 = 0; i2 < list3.size(); i2++) {
                        iArr[i2] = list3.get(i2).intValue();
                    }
                    String[] strArr = new String[list2.size()];
                    list2.toArray(strArr);
                    com.ss.android.ugc.aweme.friends.a.c cVar = new com.ss.android.ugc.aweme.friends.a.c(strArr, iArr);
                    com.ss.android.ugc.aweme.friends.a.h hVar2 = new com.ss.android.ugc.aweme.friends.a.h(this, cVar, this.f97104i.d());
                    this.r = hVar2;
                    this.f97096a.a(hVar2);
                    this.f97104i.a((SectionIndexer) cVar);
                }
                this.f97104i.b_(list);
                this.f97098c.d();
                this.f97098c.setVisibility(4);
                a(z);
            }
            n.a(this.f97099d, 0);
        }
    }

    @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        com.ss.android.ugc.aweme.utils.permission.a.a(this, i2, iArr);
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }
}
