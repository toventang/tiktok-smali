package com.ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.analytics.page.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.router.SmartRoute;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.account.f.a;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.login.a.h;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.w;
import com.ss.android.ugc.aweme.account.login.y;
import com.ss.android.ugc.aweme.account.views.AutoRTLImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class I18nSignUpActivity extends com.bytedance.ies.foundation.activity.a implements com.bytedance.analytics.page.b, a.b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f63185h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f63186a;

    /* renamed from: b  reason: collision with root package name */
    public String f63187b = "";

    /* renamed from: c  reason: collision with root package name */
    public boolean f63188c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f63189d = h.i.a((h.f.a.a) new aa(this));

    /* renamed from: e  reason: collision with root package name */
    final h.h f63190e = h.i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    public Intent f63191f;

    /* renamed from: g  reason: collision with root package name */
    public SmartRoute f63192g;

    /* renamed from: i  reason: collision with root package name */
    private long f63193i = System.currentTimeMillis();

    /* renamed from: j  reason: collision with root package name */
    private final h.h f63194j = h.i.a((h.f.a.a) new e(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f63195k = h.i.a((h.f.a.a) new f(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f63196l = h.i.a((h.f.a.a) new v(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f63197m = h.i.a((h.f.a.a) new l(this));
    private final h.h n = h.i.a((h.f.a.a) new o(this));
    private final h.h o = h.i.a((h.f.a.a) new ad(this));
    private final h.h p = h.i.a((h.f.a.a) new ab(this));
    private final h.h q = h.i.a((h.f.a.a) new k(this));
    private final h.h r = h.i.a((h.f.a.a) new i(this));
    private final h.h s = h.i.a((h.f.a.a) new j(this));
    private final h.h t = h.i.a((h.f.a.a) new m(this));
    private final h.h u = h.i.a((h.f.a.a) new ac(this));
    private final h.h v = h.i.a((h.f.a.a) new n(this));
    private HashMap w;

    static {
        Covode.recordClassIndex(38931);
    }

    private final boolean s() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.w == null) {
            this.w = new HashMap();
        }
        View view = (View) this.w.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.w.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "5346";
    }

    public final String e() {
        return (String) this.f63194j.getValue();
    }

    public final String f() {
        return (String) this.f63195k.getValue();
    }

    public final Bundle g() {
        return (Bundle) this.f63196l.getValue();
    }

    public final Bundle h() {
        return (Bundle) this.n.getValue();
    }

    public final Bundle i() {
        return (Bundle) this.o.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.p.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    public final boolean l() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final List<com.ss.android.ugc.aweme.account.login.a.h> p() {
        return (List) this.u.getValue();
    }

    public final List<com.ss.android.ugc.aweme.account.login.a.h> q() {
        return (List) this.v.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38932);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(Activity activity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }

        public static com.ss.android.ugc.aweme.account.a.b.a a(String str, String str2, String str3, Map<String, ? extends Object> map) {
            int i2;
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
            com.ss.android.ugc.aweme.account.a.b.a a2 = aVar.a("enter_method", str2).a("enter_from", str).a("_perf_monitor", 1).a("enter_type", str3);
            if (com.bytedance.ies.ugc.appcontext.f.j() != null) {
                i2 = com.ss.android.ugc.aweme.account.n.f.b(com.bytedance.ies.ugc.appcontext.f.j());
            } else {
                i2 = -1;
            }
            a2.a("google_status", i2);
            com.ss.android.ugc.aweme.account.login.v2.a.v.a(aVar, map);
            h.f.b.l.b(aVar, "");
            return aVar;
        }

        public static void a(Activity activity, Bundle bundle, boolean z, boolean z2, boolean z3) {
            Intent intent;
            boolean z4;
            Boolean bool;
            int i2;
            h.f.b.l.d(activity, "");
            if (z3) {
                intent = new Intent(activity, I18nSignUpActivityWithNoAnimation.class);
            } else {
                intent = new Intent(activity, I18nSignUpActivity.class);
            }
            intent.putExtra("sign_up_data", bundle);
            if (z || (bundle != null && bundle.getBoolean("show_login_page_first"))) {
                z4 = true;
            } else {
                z4 = false;
            }
            intent.putExtra("show_login_page_first", z4);
            intent.putExtra("has_callBack", z2);
            if (bundle != null) {
                bool = Boolean.valueOf(bundle.getBoolean("show_learn_feed_toast"));
            } else {
                bool = null;
            }
            intent.putExtra("show_learn_feed_toast", bool);
            a(activity, intent);
            if (z3) {
                i2 = 0;
            } else {
                i2 = R.anim.a3;
            }
            activity.overridePendingTransition(i2, 0);
        }

        public static void a(String str, String str2, String str3, Map<String, ? extends Object> map, List<? extends com.ss.android.ugc.aweme.account.login.a.h> list, int i2) {
            String str4;
            String str5;
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            h.f.b.l.d(list, "");
            com.ss.android.ugc.aweme.account.a.b.a a2 = a(str, str2, str3, map);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 <= i2) {
                    a2.a(((com.ss.android.ugc.aweme.account.login.a.h) list.get(i3)).f63274f, 1);
                } else {
                    a2.a(((com.ss.android.ugc.aweme.account.login.a.h) list.get(i3)).f63274f, 0);
                }
            }
            if (TextUtils.equals(str3, "click_login")) {
                str4 = "login";
            } else {
                str4 = "register";
            }
            SecApiImpl.a().reportData(str4);
            IGuestModeService d2 = GuestModeServiceImpl.d();
            if (!d2.b() || d2.c()) {
                str5 = "0";
            } else {
                str5 = "1";
            }
            a2.a("guestmode_is_show", str5);
            com.ss.android.ugc.aweme.common.r.a("login_notify", a2.f62575a);
        }
    }

    public static final class h implements com.ss.android.ugc.aweme.account.login.v2.base.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f63202b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f63203c;

        static {
            Covode.recordClassIndex(38943);
        }

        @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
        public final String Y_() {
            return this.f63202b;
        }

        @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
        public final Bundle aa_() {
            return this.f63203c;
        }

        @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
        public final String W_() {
            String e2 = this.f63201a.e();
            h.f.b.l.b(e2, "");
            return e2;
        }

        @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
        public final String X_() {
            String f2 = this.f63201a.f();
            h.f.b.l.b(f2, "");
            return f2;
        }

        h(I18nSignUpActivity i18nSignUpActivity, String str, Bundle bundle) {
            this.f63201a = i18nSignUpActivity;
            this.f63202b = str;
            this.f63203c = bundle;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q implements ViewPagerBottomSheetBehavior.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63205a;

        static {
            Covode.recordClassIndex(38952);
        }

        q(I18nSignUpActivity i18nSignUpActivity) {
            this.f63205a = i18nSignUpActivity;
        }

        @Override // com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.b
        public final void a() {
            this.f63205a.finish();
        }
    }

    private void w() {
        this.f63191f = null;
        this.f63192g = null;
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return b.a.a(this);
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        h.f.b.l.d(this, "");
        return null;
    }

    private static boolean x() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        com.ss.android.ugc.aweme.account.f.a.b(this);
        super.onDestroy();
    }

    static final class aa extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.getIntent().getBooleanExtra("show_learn_feed_toast", false));
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.getIntent().getBooleanExtra("show_login_page_first", false));
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.a<Bundle> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Bundle invoke() {
            Bundle bundle = new Bundle(this.this$0.g());
            Map<String, Object> a2 = com.ss.android.ugc.aweme.account.login.v2.a.v.a(bundle);
            if (a2 != null) {
                a2.put("enter_type", "click_sign_up");
            }
            bundle.putString("enter_type", "click_sign_up");
            return bundle;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string = this.this$0.g().getString("enter_from");
            if (string == null) {
                return "";
            }
            return string;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string = this.this$0.g().getString("enter_method");
            if (string == null) {
                return "";
            }
            return string;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63200a;

        static {
            Covode.recordClassIndex(38942);
        }

        g(I18nSignUpActivity i18nSignUpActivity) {
            this.f63200a = i18nSignUpActivity;
        }

        public final void run() {
            if (TextUtils.equals(cj.b(), this.f63200a.f63187b) && !this.f63200a.f63186a) {
                cj.a(1, 3, (Object) "");
                cj.i();
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.g().getBoolean("is_multi_account", false));
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<Bundle> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Bundle invoke() {
            Bundle bundle = new Bundle(this.this$0.g());
            Map<String, Object> a2 = com.ss.android.ugc.aweme.account.login.v2.a.v.a(bundle);
            if (a2 != null) {
                a2.put("enter_type", "click_login");
            }
            bundle.putString("enter_type", "click_login");
            return bundle;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPagerBottomSheetBehavior f63209b;

        static {
            Covode.recordClassIndex(38956);
        }

        t(I18nSignUpActivity i18nSignUpActivity, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f63208a = i18nSignUpActivity;
            this.f63209b = viewPagerBottomSheetBehavior;
        }

        public final void run() {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f63209b;
            h.f.b.l.b(viewPagerBottomSheetBehavior, "");
            RelativeLayout relativeLayout = (RelativeLayout) this.f63208a._$_findCachedViewById(R.id.dqe);
            h.f.b.l.b(relativeLayout, "");
            viewPagerBottomSheetBehavior.b(relativeLayout.getHeight());
        }
    }

    private final boolean u() {
        Bundle a2 = a(getIntent());
        if (a2 != null) {
            return a2.getBoolean("has_callBack", false);
        }
        return false;
    }

    private static boolean y() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean x2 = x();
        com.ss.android.ugc.aweme.lancet.j.f107229h = x2;
        return x2;
    }

    public final int r() {
        int i2 = 4;
        if (l()) {
            return 4;
        }
        Integer num = com.ss.android.ugc.aweme.account.util.t.a().f65502a;
        if (num != null) {
            i2 = num.intValue() + 1;
        }
        return i2 + 1;
    }

    static final class ac extends h.f.b.m implements h.f.a.a<List<? extends com.ss.android.ugc.aweme.account.login.a.h>> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends com.ss.android.ugc.aweme.account.login.a.h> invoke() {
            I18nSignUpActivity i18nSignUpActivity = this.this$0;
            List<com.ss.android.ugc.aweme.account.login.a.h> a2 = h.b.a(true, new d(i18nSignUpActivity));
            String f2 = i18nSignUpActivity.f();
            h.f.b.l.b(f2, "");
            a2.add(1, new com.ss.android.ugc.aweme.account.login.a.p(f2, i18nSignUpActivity.i(), i18nSignUpActivity));
            return a2;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle bundleExtra = this.this$0.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra != null) {
                if (context != null) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                z = bundleExtra.getBoolean("age_gate_block");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle bundleExtra = this.this$0.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra != null) {
                if (context != null) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                z = bundleExtra.getBoolean("is_from_new_user_journey");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle bundleExtra = this.this$0.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra != null) {
                if (context != null) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                z = bundleExtra.getBoolean("is_fullscreen_dialog");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle bundleExtra = this.this$0.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra != null) {
                if (context != null) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                z = bundleExtra.getBoolean("is_skippable_dialog");
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<List<? extends com.ss.android.ugc.aweme.account.login.a.h>> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends com.ss.android.ugc.aweme.account.login.a.h> invoke() {
            I18nSignUpActivity i18nSignUpActivity = this.this$0;
            List<com.ss.android.ugc.aweme.account.login.a.h> a2 = h.b.a(false, new c(i18nSignUpActivity));
            String e2 = i18nSignUpActivity.e();
            h.f.b.l.b(e2, "");
            a2.add(1, new com.ss.android.ugc.aweme.account.login.a.n(e2, new Bundle(i18nSignUpActivity.h()), i18nSignUpActivity));
            return a2;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<Bundle> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Bundle invoke() {
            Bundle bundleExtra = this.this$0.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra == null) {
                return new Bundle();
            }
            if (context == null) {
                return bundleExtra;
            }
            bundleExtra.setClassLoader(context.getClassLoader());
            return bundleExtra;
        }
    }

    public final boolean d() {
        PagerAdapter pagerAdapter;
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.fk_);
        if (viewPager != null) {
            pagerAdapter = viewPager.getAdapter();
        } else {
            pagerAdapter = null;
        }
        Objects.requireNonNull(pagerAdapter, "null cannot be cast to non-null type androidx.fragment.app.FragmentPagerAdapter");
        ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(R.id.fk_);
        h.f.b.l.b(viewPager2, "");
        Fragment a2 = ((androidx.fragment.app.l) pagerAdapter).a(viewPager2.getCurrentItem());
        h.f.b.l.b(a2, "");
        Bundle arguments = a2.getArguments();
        if (arguments == null) {
            h.f.b.l.b();
        }
        return arguments.getBoolean("view_type", true);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        if (!u()) {
            cj.a(10, 4, "");
            new Handler().postDelayed(new g(this), 200);
        }
        overridePendingTransition(0, R.anim.a5);
        com.ss.android.ugc.aweme.account.f.a.a(15);
    }

    public final void o() {
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.fk_);
        if (viewPager == null) {
            h.f.b.l.b();
        }
        ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(R.id.fk_);
        if (viewPager2 == null) {
            h.f.b.l.b();
        }
        viewPager.setCurrentItem(1 - viewPager2.getCurrentItem());
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.fk_);
        if (viewPager == null || viewPager.getCurrentItem() != 0) {
            ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(R.id.fk_);
            h.f.b.l.b(viewPager2, "");
            ViewPager viewPager3 = (ViewPager) _$_findCachedViewById(R.id.fk_);
            h.f.b.l.b(viewPager3, "");
            viewPager2.setCurrentItem(viewPager3.getCurrentItem() - 1);
        } else if (!k()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (com.bytedance.ies.ugc.appcontext.f.f34637l) {
            a("background");
        } else {
            com.ss.android.ugc.aweme.common.r.a("sign_up_main_page", new com.ss.android.ugc.aweme.account.a.b.a().a("stay_time", System.currentTimeMillis() - this.f63193i).f62575a);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (((int) TypedValue.applyDimension(1, (float) this.this$0.getResources().getDisplayMetrics().heightPixels, this.this$0.getResources().getDisplayMetrics())) >= 700) {
                Bundle bundleExtra = this.this$0.getIntent().getBundleExtra("sign_up_data");
                Context context = BadParcelableCrashOptimizer.getContext();
                if (bundleExtra != null) {
                    if (context != null) {
                        bundleExtra.setClassLoader(context.getClassLoader());
                    }
                    z = bundleExtra.getBoolean("is_expandable_dialog");
                }
            }
            return Boolean.valueOf(z);
        }
    }

    private final String t() {
        String str;
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            for (String str3 : g().keySet()) {
                StringBuilder append = new StringBuilder(" ").append(str3).append(":");
                Object a2 = a(g(), str3);
                if (a2 != null) {
                    str2 = a2.toString();
                } else {
                    str2 = null;
                }
                sb.append(append.append(str2).toString());
            }
            StringBuilder sb2 = new StringBuilder("call: ");
            ComponentName callingActivity = getCallingActivity();
            if (callingActivity == null || (str = callingActivity.getClassName()) == null) {
                str = "";
            }
            return sb2.append(str).append(" bundle:").append((Object) sb).toString();
        } catch (Exception unused) {
            return "Exception";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r0.booleanValue() == false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean v() {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity.v():boolean");
    }

    public final void n() {
        if (!GuestModeServiceImpl.d().b() || GuestModeServiceImpl.d().c() || !com.ss.android.ugc.aweme.account.experiment.h.f62997b.e()) {
            if (m()) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) _$_findCachedViewById(R.id.ep4);
                h.f.b.l.b(autoRTLImageView, "");
                b(autoRTLImageView);
                if (s()) {
                    TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.e51);
                    h.f.b.l.b(tuxTextView, "");
                    tuxTextView.setVisibility(0);
                    ((TuxTextView) _$_findCachedViewById(R.id.e51)).setOnClickListener(new z(this));
                    return;
                }
                return;
            }
            if (s() || !k()) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) _$_findCachedViewById(R.id.eos);
                h.f.b.l.b(autoRTLImageView2, "");
                a(autoRTLImageView2);
            }
            AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) _$_findCachedViewById(R.id.ep4);
            h.f.b.l.b(autoRTLImageView3, "");
            b(autoRTLImageView3);
        } else if (d()) {
            AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) _$_findCachedViewById(R.id.ep4);
            h.f.b.l.b(autoRTLImageView4, "");
            autoRTLImageView4.setVisibility(8);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.e51);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.e51)).setText(R.string.c_a);
            ((TuxTextView) _$_findCachedViewById(R.id.e51)).setOnClickListener(new y(this));
        } else {
            AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) _$_findCachedViewById(R.id.ep4);
            h.f.b.l.b(autoRTLImageView5, "");
            b(autoRTLImageView5);
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.e51);
            h.f.b.l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
    }

    public static final class p extends ViewPagerBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63204a;

        static {
            Covode.recordClassIndex(38951);
        }

        @Override // com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
        }

        p(I18nSignUpActivity i18nSignUpActivity) {
            this.f63204a = i18nSignUpActivity;
        }

        @Override // com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.a
        public final void a(View view, int i2) {
            h.f.b.l.d(view, "");
            if (i2 == 5) {
                this.f63204a.getWindow().setDimAmount(0.0f);
                this.f63204a.finish();
            }
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63215a;

        static {
            Covode.recordClassIndex(38959);
        }

        w(I18nSignUpActivity i18nSignUpActivity) {
            this.f63215a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63215a.a("skip");
            this.f63215a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63218a;

        static {
            Covode.recordClassIndex(38962);
        }

        z(I18nSignUpActivity i18nSignUpActivity) {
            this.f63218a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63218a.finish();
            this.f63218a.a("skip");
        }
    }

    static final class c implements com.ss.android.ugc.aweme.base.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63198a;

        static {
            Covode.recordClassIndex(38938);
        }

        c(I18nSignUpActivity i18nSignUpActivity) {
            this.f63198a = i18nSignUpActivity;
        }

        @Override // com.ss.android.ugc.aweme.base.c.b
        public final String a(com.ss.android.ugc.aweme.base.c.a aVar) {
            I18nSignUpActivity i18nSignUpActivity = this.f63198a;
            h.f.b.l.b(aVar, "");
            String str = (String) aVar.a();
            h.f.b.l.b(str, "");
            i18nSignUpActivity.a(false, str, "click_login", this.f63198a.h());
            return "";
        }
    }

    static final class d implements com.ss.android.ugc.aweme.base.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63199a;

        static {
            Covode.recordClassIndex(38939);
        }

        d(I18nSignUpActivity i18nSignUpActivity) {
            this.f63199a = i18nSignUpActivity;
        }

        @Override // com.ss.android.ugc.aweme.base.c.b
        public final String a(com.ss.android.ugc.aweme.base.c.a aVar) {
            I18nSignUpActivity i18nSignUpActivity = this.f63199a;
            h.f.b.l.b(aVar, "");
            String str = (String) aVar.a();
            h.f.b.l.b(str, "");
            i18nSignUpActivity.a(true, str, "click_sign_up", this.f63199a.i());
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, h.z> {
        final /* synthetic */ I18nSignUpActivity this$0;

        static {
            Covode.recordClassIndex(38953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(I18nSignUpActivity i18nSignUpActivity) {
            super(1);
            this.this$0 = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(new h.f.a.a<com.bytedance.ies.foundation.base.a>(this) {
                /* class com.ss.android.ugc.aweme.account.login.I18nSignUpActivity.r.AnonymousClass1 */
                final /* synthetic */ r this$0;

                static {
                    Covode.recordClassIndex(38954);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.bytedance.ies.foundation.base.a invoke() {
                    if (this.this$0.this$0.k()) {
                        com.ss.android.ugc.aweme.activity.processor.x xVar = new com.ss.android.ugc.aweme.activity.processor.x(0, false, false, 7);
                        xVar.f65559e = R.attr.f159902m;
                        xVar.f65560f = R.attr.f159902m;
                        xVar.f65562h = true;
                        return xVar;
                    }
                    com.ss.android.ugc.aweme.activity.processor.x xVar2 = new com.ss.android.ugc.aweme.activity.processor.x(0, false, false, 7);
                    xVar2.f65556b = true;
                    xVar2.f65560f = R.attr.f159902m;
                    xVar2.f65555a = true;
                    return xVar2;
                }
            });
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63216a;

        static {
            Covode.recordClassIndex(38960);
        }

        x(I18nSignUpActivity i18nSignUpActivity) {
            this.f63216a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            I18nSignUpActivity i18nSignUpActivity = this.f63216a;
            if (i18nSignUpActivity.d()) {
                str = "signup_login_homepage";
            } else {
                str = "login_homepage";
            }
            com.ss.android.ugc.aweme.account.n.g.a(i18nSignUpActivity, str, this.f63216a.f());
        }
    }

    private final void b(AutoRTLImageView autoRTLImageView) {
        autoRTLImageView.setOnClickListener(new x(this));
        autoRTLImageView.setImageResource(R.drawable.jl);
        autoRTLImageView.setVisibility(0);
    }

    public static final class u implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        public int f63210a;

        /* renamed from: b  reason: collision with root package name */
        public float f63211b;

        /* renamed from: c  reason: collision with root package name */
        public int f63212c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63213d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f63214e;

        static {
            Covode.recordClassIndex(38957);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            j jVar;
            int i3 = 1 - i2;
            if (i3 >= 0 && i3 < this.f63214e.size()) {
                o oVar = (o) this.f63214e.get(i3);
                if (oVar.ab_() && (jVar = oVar.f63516a) != null) {
                    jVar.a().b(0);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            if (this.f63210a == 0 && i2 == 1) {
                TuxTextView tuxTextView = (TuxTextView) this.f63213d._$_findCachedViewById(R.id.em8);
                h.f.b.l.b(tuxTextView, "");
                this.f63211b = tuxTextView.getAlpha();
            } else if (i2 == 0) {
                I18nSignUpActivity i18nSignUpActivity = this.f63213d;
                if (i18nSignUpActivity.d()) {
                    TuxTextView tuxTextView2 = (TuxTextView) i18nSignUpActivity._$_findCachedViewById(R.id.em8);
                    h.f.b.l.b(tuxTextView2, "");
                    tuxTextView2.setText(i18nSignUpActivity.getText(R.string.aql));
                } else {
                    TuxTextView tuxTextView3 = (TuxTextView) i18nSignUpActivity._$_findCachedViewById(R.id.em8);
                    h.f.b.l.b(tuxTextView3, "");
                    tuxTextView3.setText(i18nSignUpActivity.getString(R.string.aoy));
                }
                this.f63213d.n();
                ViewPager viewPager = (ViewPager) this.f63213d._$_findCachedViewById(R.id.fk_);
                h.f.b.l.b(viewPager, "");
                this.f63212c = viewPager.getCurrentItem();
            }
            this.f63210a = i2;
        }

        u(I18nSignUpActivity i18nSignUpActivity, ArrayList arrayList) {
            this.f63213d = i18nSignUpActivity;
            this.f63214e = arrayList;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            if (this.f63211b != 0.0f && f2 != 0.0f) {
                TuxTextView tuxTextView = (TuxTextView) this.f63213d._$_findCachedViewById(R.id.em8);
                h.f.b.l.b(tuxTextView, "");
                float f3 = this.f63211b;
                if (this.f63212c == 0) {
                    f2 = 1.0f - f2;
                }
                tuxTextView.setAlpha(f3 * f2);
                View _$_findCachedViewById = this.f63213d._$_findCachedViewById(R.id.an6);
                h.f.b.l.b(_$_findCachedViewById, "");
                TuxTextView tuxTextView2 = (TuxTextView) this.f63213d._$_findCachedViewById(R.id.em8);
                h.f.b.l.b(tuxTextView2, "");
                _$_findCachedViewById.setAlpha(tuxTextView2.getAlpha());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63217a;

        static {
            Covode.recordClassIndex(38961);
        }

        y(I18nSignUpActivity i18nSignUpActivity) {
            this.f63217a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.common.r.a("click_skip_to_watch", new com.ss.android.ugc.aweme.account.a.b.a().f62575a);
            IGuestModeService d2 = GuestModeServiceImpl.d();
            I18nSignUpActivity i18nSignUpActivity = this.f63217a;
            Bundle bundle = new Bundle();
            bundle.putString("enter_method", this.f63217a.f());
            bundle.putString("enter_from", this.f63217a.e());
            d2.a(i18nSignUpActivity, bundle);
        }
    }

    private final void a(AutoRTLImageView autoRTLImageView) {
        autoRTLImageView.setOnClickListener(new w(this));
        autoRTLImageView.setImageResource(2131231077);
        autoRTLImageView.setVisibility(0);
    }

    public final void b(String str) {
        h.f.b.l.d(str, "");
        if (k()) {
            com.ss.android.ugc.aweme.common.r.a("exit_cold_launch_login_notify", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", f()).a("enter_from", e()).a("exit_method", str).f62575a);
        }
    }

    public static final class s extends androidx.fragment.app.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I18nSignUpActivity f63206a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f63207b;

        static {
            Covode.recordClassIndex(38955);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.l
        public final Fragment a(int i2) {
            o oVar = new o();
            this.f63207b.add(oVar);
            Bundle bundle = new Bundle();
            if (i2 == 0) {
                bundle.putBoolean("view_type", !this.f63206a.j());
            } else {
                bundle.putBoolean("view_type", this.f63206a.j());
            }
            bundle.putBoolean("show_learn_feed_toast", ((Boolean) this.f63206a.f63189d.getValue()).booleanValue());
            bundle.putBoolean("is_from_new_user_journey", this.f63206a.m());
            bundle.putBoolean("age_gate_block", ((Boolean) this.f63206a.f63190e.getValue()).booleanValue());
            bundle.putBoolean("is_fullscreen", this.f63206a.k());
            bundle.putBoolean("is_expandable_dialog", this.f63206a.l());
            oVar.setArguments(bundle);
            return oVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(I18nSignUpActivity i18nSignUpActivity, ArrayList arrayList, androidx.fragment.app.i iVar) {
            super(iVar);
            this.f63206a = i18nSignUpActivity;
            this.f63207b = arrayList;
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
        public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(obj, "");
            super.setPrimaryItem(viewGroup, i2, obj);
            while (i2 + 1 > this.f63207b.size()) {
                a(i2);
            }
            I18nSignUpActivity i18nSignUpActivity = this.f63206a;
            i18nSignUpActivity.a(i18nSignUpActivity.d());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.f.a.b
    public final void a(int i2) {
        if (i2 == 11) {
            this.f63186a = true;
            finish();
        } else if (i2 == 14) {
            finish();
        } else if (i2 == 15) {
            super.finish();
        }
    }

    public final void a(String str) {
        if (k()) {
            com.ss.android.ugc.aweme.common.r.a("exit_cold_launch_login_notify", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", f()).a("enter_from", e()).a("exit_method", str).f62575a);
        }
    }

    public final void a(boolean z2) {
        if (!l() || !z2 || this.f63188c) {
            ((NonSwipeableViewPager) _$_findCachedViewById(R.id.fk_)).setShouldLimitHeight(false);
        } else {
            ((NonSwipeableViewPager) _$_findCachedViewById(R.id.fk_)).setShouldLimitHeight(true);
        }
        ((NonSwipeableViewPager) _$_findCachedViewById(R.id.fk_)).requestLayout();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        String str;
        Map<String, Object> a2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", true);
        AccountService.a().o();
        String b2 = cj.b();
        h.f.b.l.b(b2, "");
        this.f63187b = b2;
        activityConfiguration(new r(this));
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.account.f.a.a(this);
        supportRequestWindowFeature(1);
        setContentView(R.layout.h3);
        ArrayList arrayList = new ArrayList();
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.fk_);
        h.f.b.l.b(viewPager, "");
        viewPager.setAdapter(new s(this, arrayList, getSupportFragmentManager()));
        if (!u()) {
            cj.a(10, 1, "");
        }
        Window window = getWindow();
        window.setGravity(80);
        window.setLayout(-1, -1);
        if (k()) {
            CoordinatorLayout.e eVar = new CoordinatorLayout.e(-1, -1);
            eVar.setMargins(0, 0, 0, 0);
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.dqe);
            h.f.b.l.b(relativeLayout, "");
            relativeLayout.setLayoutParams(eVar);
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) _$_findCachedViewById(R.id.af6);
            h.f.b.l.b(coordinatorLayout, "");
            ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
            if (layoutParams != null) {
                ((FrameLayout.LayoutParams) layoutParams).topMargin = 0;
                RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R.id.dqe);
                h.f.b.l.b(relativeLayout2, "");
                ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
                if (layoutParams2 != null) {
                    ((CoordinatorLayout.e) layoutParams2).a((CoordinatorLayout.b) null);
                    RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(R.id.dqe);
                    h.f.b.l.b(relativeLayout3, "");
                    relativeLayout3.setBackground(androidx.core.content.b.a(this, (int) R.color.f159928l));
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", false);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", false);
                throw nullPointerException2;
            }
        } else {
            ViewPagerBottomSheetBehavior b3 = ViewPagerBottomSheetBehavior.b(_$_findCachedViewById(R.id.dqe));
            b3.f63228e = true;
            b3.b();
            b3.f63235l = new p(this);
            b3.o = new q(this);
            if (!l()) {
                ((RelativeLayout) _$_findCachedViewById(R.id.dqe)).post(new t(this, b3));
            }
        }
        ((ViewPager) _$_findCachedViewById(R.id.fk_)).addOnPageChangeListener(new u(this, arrayList));
        g.a((ViewPager) _$_findCachedViewById(R.id.fk_));
        n();
        if (bundle == null) {
            if (d()) {
                a2 = com.ss.android.ugc.aweme.account.login.v2.a.v.a(i());
                String e2 = e();
                h.f.b.l.b(e2, "");
                String f2 = f();
                h.f.b.l.b(f2, "");
                a.a(e2, f2, "click_sign_up", a2, p(), r());
            } else {
                a2 = com.ss.android.ugc.aweme.account.login.v2.a.v.a(h());
                String e3 = e();
                h.f.b.l.b(e3, "");
                String f3 = f();
                h.f.b.l.b(f3, "");
                a.a(e3, f3, "click_login", a2, q(), q().size() - 1);
            }
            if (a2 == null) {
                com.ss.android.ugc.aweme.common.r.a("account_debug_info", new com.ss.android.ugc.aweme.account.a.b.a().a("info", t()).f62575a);
            }
        }
        if (y.a.c()) {
            String f4 = f();
            h.f.b.l.b(f4, "");
            h.f.b.l.d(this, "");
            h.f.b.l.d(f4, "");
            KevaBuilder.getInstance().setContext(this);
            long j2 = Keva.getRepo("aweme_account_keva").getLong("last_logout_time", 0);
            boolean z2 = Keva.getRepo("google_onetap").getBoolean("logged_out", false);
            long currentTimeMillis = System.currentTimeMillis() - j2;
            if (z2) {
                Keva.getRepo("google_onetap").storeBoolean("logged_out", false);
            }
            if ((currentTimeMillis >= 10000 || !z2) && !y.a.a() && !h.f.b.l.a((Object) f4, (Object) "switch_account")) {
                com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
                aVar.a("enter_from", e()).a("enter_method", f());
                if (y.a.b()) {
                    aVar.a("prev_logged", 1);
                } else {
                    aVar.a("prev_logged", 0);
                }
                if (y.a.b()) {
                    BaseLoginMethod d2 = q.d();
                    if (d2 instanceof TPLoginMethod) {
                        str = ((TPLoginMethod) d2).getPlatform();
                    } else {
                        str = d2.getLoginMethodName().toString();
                    }
                } else {
                    str = "none";
                }
                aVar.a("prev_login_method", str);
                com.ss.android.ugc.aweme.common.r.a("show_google_onetap", aVar.f62575a);
                if (d()) {
                    a(true, "google_onetap", "click_sign_up", i());
                } else {
                    a(false, "google_onetap", "click_login", h());
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", false);
    }

    public final boolean a(SmartRoute smartRoute) {
        h.f.b.l.d(smartRoute, "");
        w();
        this.f63192g = smartRoute;
        return v();
    }

    private com.ss.android.ugc.aweme.account.login.v2.base.g a(String str, Bundle bundle) {
        return new h(this, str, bundle);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
    }

    public final void a(boolean z2, String str, String str2, Bundle bundle) {
        if (!y()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
            return;
        }
        if (i().getBoolean("is_multi_account", false) && w.a.a()) {
            bundle.putBoolean("is_multi_account_same_user", true);
        }
        if (!z2 || !com.ss.android.ugc.aweme.compliance.api.a.h().c() || TextUtils.equals(str, "facebook") || TextUtils.equals(str, "google")) {
            w();
            this.f63191f = ab.a(this, z2, str, a(str2, bundle));
            if (!v()) {
                ab.a(this, this.f63191f);
            }
        } else {
            SmartRoute a2 = com.ss.android.ugc.aweme.account.n.m.a(this);
            bundle.putBoolean("age_gate_block", true);
            a2.withParam(bundle);
            if (!a(a2)) {
                a2.open();
            }
        }
        b("click_platform");
    }
}
