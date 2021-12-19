package com.ss.android.ugc.aweme.commerce;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.influencer.ECommerceRNToLynxConfigService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.ugc.effectplatform.util.u;
import h.a.n;
import h.f.b.l;
import h.f.b.r;
import h.f.b.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public final class k extends cs implements h.b, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f73414a = {new r(k.class, "currentVisibleState", "getCurrentVisibleState()Lcom/ss/android/ugc/aweme/commerce/ShopTabFragment$VisibleState;", 0), new r(k.class, "secUserId", "getSecUserId()Ljava/lang/String;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final c f73415e = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f73416b;

    /* renamed from: c  reason: collision with root package name */
    LynxView f73417c;

    /* renamed from: d  reason: collision with root package name */
    public BulletContainerView f73418d;

    /* renamed from: j  reason: collision with root package name */
    private boolean f73419j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f73420k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f73421l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f73422m;
    private final h.h.e n;
    private final h.h.e o = new b("", "", this);
    private String p = "";
    private String q = "";
    private String r = ECommerceRNToLynxConfigService.b().a();
    private String s = "";
    private int t;
    private View u;
    private SparseArray v;

    public enum d {
        INIT,
        SHOW_BY_RESUME,
        SHOW_BY_USER_VISIBLE_HINT,
        HIDE;

        static {
            Covode.recordClassIndex(45205);
        }
    }

    static {
        Covode.recordClassIndex(45201);
    }

    private final void a(d dVar) {
        this.n.a(f73414a[0], dVar);
    }

    private final void b(String str) {
        this.o.a(f73414a[1], str);
    }

    private final d i() {
        return (d) this.n.a(this, f73414a[0]);
    }

    private final String j() {
        return (String) this.o.a(this, f73414a[1]);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        l.d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final void bM_() {
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final boolean cb_() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(83, new org.greenrobot.eventbus.g(k.class, "onJsBroadcastEvent", com.ss.android.ugc.aweme.bullet.c.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(36, new org.greenrobot.eventbus.g(k.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(45204);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        public static k a(Bundle bundle) {
            l.d(bundle, "");
            k kVar = new k();
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    public static final class e implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f73428a;

        /* renamed from: b  reason: collision with root package name */
        private final String f73429b = "profile_ios_on_show_event";

        /* renamed from: c  reason: collision with root package name */
        private final Object f73430c;

        static {
            Covode.recordClassIndex(45206);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f73429b;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final Object b() {
            return this.f73430c;
        }

        e(z.e eVar) {
            this.f73428a = eVar;
            this.f73430c = eVar.element;
        }
    }

    public static final class f implements com.bytedance.ies.bullet.ui.common.b.b {
        static {
            Covode.recordClassIndex(45207);
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.b
        public final boolean p() {
            return true;
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.b
        public final boolean q() {
            return true;
        }

        f() {
        }
    }

    public static final class g implements p {

        /* renamed from: a  reason: collision with root package name */
        private final String f73431a = "profile_ios_on_hide_event";

        /* renamed from: b  reason: collision with root package name */
        private final Object f73432b;

        static {
            Covode.recordClassIndex(45208);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f73431a;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final Object b() {
            return this.f73432b;
        }

        g() {
        }
    }

    public static final class i implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowStatus f73435a;

        /* renamed from: b  reason: collision with root package name */
        private final String f73436b = "follow_status_update";

        /* renamed from: c  reason: collision with root package name */
        private final Object f73437c;

        static {
            Covode.recordClassIndex(45210);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f73436b;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final Object b() {
            return this.f73437c;
        }

        i(FollowStatus followStatus) {
            this.f73435a = followStatus;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("follow_status", followStatus.followStatus);
            this.f73437c = jSONObject;
        }
    }

    public static final class j implements p {

        /* renamed from: a  reason: collision with root package name */
        private final String f73438a = "viewAppeared";

        /* renamed from: b  reason: collision with root package name */
        private final Object f73439b;

        static {
            Covode.recordClassIndex(45211);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f73438a;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final Object b() {
            return this.f73439b;
        }

        j() {
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void a(String str, String str2) {
        if (!(str2 == null || str2.length() == 0)) {
            b(str2);
        }
        if (str != null && str.length() != 0) {
            this.s = str;
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
        if (iVar.b() == com.bytedance.ies.bullet.service.f.a.b.b.LYNX) {
            Object h2 = n.h((List) list);
            com.bytedance.ies.bullet.ui.common.c.d dVar = (com.bytedance.ies.bullet.ui.common.c.d) h2;
            LynxView lynxView = null;
            if (!((dVar != null ? dVar.f33078a : null) instanceof LynxView)) {
                h2 = null;
            }
            com.bytedance.ies.bullet.ui.common.c.d dVar2 = (com.bytedance.ies.bullet.ui.common.c.d) h2;
            if (dVar2 != null) {
                T t2 = dVar2.f33078a;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
                lynxView = (LynxView) t2;
            }
            this.f73417c = lynxView;
            if (h() && !this.f73421l) {
                a();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.v;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        a(d.HIDE);
    }

    private final boolean h() {
        if (i() == d.SHOW_BY_USER_VISIBLE_HINT || i() == d.SHOW_BY_RESUME) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        LynxView lynxView = this.f73417c;
        if (lynxView != null) {
            this.f73421l = true;
            lynxView.onEnterForeground();
        }
    }

    public final boolean c() {
        String j2 = j();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        l.b(createIUserServicebyMonsterPlugin, "");
        User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
        l.b(currentUser, "");
        return l.a((Object) j2, (Object) currentUser.getSecUid());
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BulletContainerView bulletContainerView = this.f73418d;
        if (bulletContainerView != null) {
            bulletContainerView.onEvent(new j());
        }
        if (getUserVisibleHint()) {
            a(d.SHOW_BY_RESUME);
        }
    }

    public k() {
        d dVar = d.INIT;
        this.n = new a(dVar, dVar, this);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        BulletContainerView bulletContainerView = this.f73418d;
        if (bulletContainerView != null) {
            int i2 = 1;
            this.f73422m = true;
            z.e eVar = new z.e();
            eVar.element = (T) new JSONObject();
            T t2 = eVar.element;
            int i3 = l.f73440a[i().ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
            }
            t2.put("show_from", i2);
            bulletContainerView.onEvent(new e(eVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void g() {
        BulletContainerView bulletContainerView;
        d dVar;
        if (this.f73419j) {
            if (getUserVisibleHint()) {
                dVar = d.SHOW_BY_USER_VISIBLE_HINT;
            } else {
                dVar = d.HIDE;
            }
            a(dVar);
        }
        if (!this.f73419j && getUserVisibleHint() && (bulletContainerView = this.f73418d) != null) {
            a(bulletContainerView);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        View view;
        View view2 = this.u;
        if (view2 != null) {
            return view2;
        }
        FrameLayout frameLayout = this.f73420k;
        if (frameLayout != null) {
            view = frameLayout.getChildAt(0);
        } else {
            view = null;
        }
        if (!(view instanceof BulletContainerView)) {
            view = null;
        }
        BulletContainerView bulletContainerView = (BulletContainerView) view;
        if (bulletContainerView == null) {
            return null;
        }
        View a2 = a((View) bulletContainerView);
        this.u = a2;
        return a2;
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f73433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f73434b;

        static {
            Covode.recordClassIndex(45209);
        }

        h(FrameLayout frameLayout, k kVar) {
            this.f73433a = frameLayout;
            this.f73434b = kVar;
        }

        public final void run() {
            int height = this.f73433a.getHeight();
            BulletContainerView bulletContainerView = (BulletContainerView) this.f73433a.findViewWithTag("bullet_tag");
            if (this.f73434b.c()) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                bulletContainerView.setPadding(0, 0, 0, h.g.a.a(TypedValue.applyDimension(1, 58.0f, system.getDisplayMetrics())));
            }
            l.b(bulletContainerView, "");
            bulletContainerView.setLayoutParams(new FrameLayout.LayoutParams(-1, height));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        d dVar;
        super.setUserVisibleHint(z);
        if (z) {
            dVar = d.SHOW_BY_USER_VISIBLE_HINT;
        } else {
            dVar = d.HIDE;
        }
        a(dVar);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        BulletContainerView bulletContainerView;
        l.d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        if (l.a((Object) followStatus.secUserId, (Object) j()) && (bulletContainerView = this.f73418d) != null) {
            bulletContainerView.onEvent(new i(followStatus));
        }
    }

    private View a(View view) {
        l.d(view, "");
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof LynxView) {
                childAt = ((LynxView) childAt).findViewByName("profile-shop-tab-list");
            } else if (!(childAt instanceof RecyclerView) && !(childAt instanceof WebView)) {
                if (childAt instanceof ViewGroup) {
                    childAt = a(childAt);
                } else {
                    continue;
                }
            }
            if (childAt != null) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String string;
        super.onCreate(bundle);
        if (!EventBus.a().a(this)) {
            EventBus.a(EventBus.a(), this);
        }
        Bundle arguments = getArguments();
        String str4 = "";
        if (arguments == null || (str = arguments.getString("sec_user_id", str4)) == null) {
            str = str4;
        }
        b(str);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("enter_from", str4)) == null) {
            str2 = str4;
        }
        this.p = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str3 = arguments3.getString("author_id", str4)) == null) {
            str3 = str4;
        }
        this.s = str3;
        Bundle arguments4 = getArguments();
        if (!(arguments4 == null || (string = arguments4.getString("show_window_source", str4)) == null)) {
            str4 = string;
        }
        this.q = str4;
        Bundle arguments5 = getArguments();
        int i2 = 0;
        if (arguments5 != null) {
            i2 = arguments5.getInt("follow_status", 0);
        }
        this.t = i2;
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(com.ss.android.ugc.aweme.bullet.c.a aVar) {
        String string;
        JSONObject jSONObject;
        String optString;
        l.d(aVar, "");
        try {
            JSONObject jSONObject2 = aVar.f69275b;
            if (jSONObject2 != null && (string = jSONObject2.getString("eventName")) != null) {
                Integer num = null;
                if (l.a((Object) string, (Object) "mp_tab_page_height")) {
                    JSONObject jSONObject3 = aVar.f69275b;
                    if (jSONObject3 != null && jSONObject3.has("data") && (jSONObject = aVar.f69275b) != null && (optString = jSONObject.optString("data")) != null) {
                        JSONObject jSONObject4 = new JSONObject(optString);
                        if (l.a((Object) j(), (Object) jSONObject4.get("sec_uid").toString())) {
                            Object obj = jSONObject4.get("height");
                            if (obj instanceof Integer) {
                                num = obj;
                            }
                            Integer num2 = num;
                            if (num2 != null) {
                                a(this.f73418d, num2.intValue());
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(BulletContainerView bulletContainerView) {
        String str;
        String str2 = this.r;
        if (c()) {
            str = "1";
        } else {
            str = "0";
        }
        String a2 = h.m.p.a(h.m.p.a(h.m.p.a(h.m.p.a(h.m.p.a(str2, "{is_host_profile}", str, false), "{target_sec_uid}", j(), false), "{enter_from}", this.p, false), "{author_id}", this.s, false), "{follow_status}", String.valueOf(this.t), false);
        if (!u.a(this.q)) {
            a2 = (a2 + "&show_window_source=") + this.q;
        }
        bulletContainerView.a(com.ss.android.ugc.aweme.bullet.utils.c.a(a2), (Bundle) null, this);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_my_profile", c());
        jSONObject.put("sec_user_id", j());
        jSONObject.put("enter_from", this.p);
        jSONObject.put("author_id", this.s);
        jSONObject.put("shop_tab_url", str2);
        com.bytedance.apm.b.a("shop_tab_fragment_url", 0, jSONObject);
    }

    private final void a(View view, int i2) {
        if (view != null) {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), (float) i2);
                }
                webView.setLayoutParams(layoutParams);
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    a(viewGroup.getChildAt(i3), i2);
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        l.d(uri, "");
        l.d(th, "");
        this.f73419j = false;
    }

    public static final class a extends h.h.c<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f73423a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f73424b;

        static {
            Covode.recordClassIndex(45202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, k kVar) {
            super(obj2);
            this.f73423a = obj;
            this.f73424b = kVar;
        }

        @Override // h.h.c
        public final void a(h.k.i<?> iVar, d dVar, d dVar2) {
            k kVar;
            LynxView lynxView;
            l.d(iVar, "");
            d dVar3 = dVar2;
            if (dVar != dVar3) {
                int i2 = l.f73441b[dVar3.ordinal()];
                if (i2 == 2 || i2 == 3) {
                    if (this.f73424b.getUserVisibleHint() && this.f73424b.isResumed() && this.f73424b.f73416b) {
                        BulletContainerView bulletContainerView = this.f73424b.f73418d;
                        if (bulletContainerView != null) {
                            this.f73424b.a(bulletContainerView);
                        }
                        this.f73424b.f73416b = false;
                    }
                    k kVar2 = this.f73424b;
                    kVar2.a();
                    kVar2.b();
                } else if (i2 == 4 && (lynxView = (kVar = this.f73424b).f73417c) != null) {
                    lynxView.onEnterBackground();
                    BulletContainerView bulletContainerView2 = kVar.f73418d;
                    if (bulletContainerView2 != null) {
                        bulletContainerView2.onEvent(new g());
                    }
                }
            }
        }
    }

    public static final class b extends h.h.c<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f73425a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f73426b;

        static {
            Covode.recordClassIndex(45203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, k kVar) {
            super(obj2);
            this.f73425a = obj;
            this.f73426b = kVar;
        }

        @Override // h.h.c
        public final void a(h.k.i<?> iVar, String str, String str2) {
            l.d(iVar, "");
            String str3 = str2;
            if (!h.m.p.a((CharSequence) str3) && !l.a((Object) str, (Object) str3)) {
                this.f73426b.f73416b = true;
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(8640);
        l.d(layoutInflater, "");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.post(new h(frameLayout, this));
        Context requireContext = requireContext();
        l.b(requireContext, "");
        BulletContainerView bulletContainerView = new BulletContainerView(requireContext, null, 6, (byte) 0);
        bulletContainerView.setTag("bullet_tag");
        bulletContainerView.getProviderFactory().b(com.bytedance.ies.bullet.ui.common.b.b.class, new f());
        bulletContainerView.a(BulletService.f().a());
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            l.b(activity, "");
            BulletActivityWrapper bulletActivityWrapper = new BulletActivityWrapper(activity);
            bulletActivityWrapper.a((m) activity);
            bulletContainerView.setActivityWrapper(bulletActivityWrapper);
        }
        this.f73418d = bulletContainerView;
        frameLayout.addView(bulletContainerView, -1, -1);
        this.f73420k = frameLayout;
        if (h() && !this.f73422m) {
            b();
        }
        MethodCollector.o(8640);
        return frameLayout;
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
        this.f73419j = true;
    }
}
