package com.ss.android.ugc.aweme.account.login.rememberaccount;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.f.a;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.c;
import com.ss.android.ugc.aweme.account.login.v2.a.v;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.n.g;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class LoginMethodListActivity extends CommonFlowActivity implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63626a = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private HashMap f63627h;

    static {
        Covode.recordClassIndex(39225);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f63627h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f63627h == null) {
            this.f63627h = new HashMap();
        }
        View view = (View) this.f63627h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f63627h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final int c() {
        return -1;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39226);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Activity activity, Bundle bundle, List<? extends BaseLoginMethod> list, IAccountService.g gVar) {
            int i2;
            long time;
            l.d(activity, "");
            l.d(bundle, "");
            l.d(list, "");
            HashMap hashMap = new HashMap();
            Map<String, Object> a2 = v.a(bundle);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
            hashMap.put("show_user_cnt", Integer.valueOf(list.size()));
            hashMap.put("trust_one_click_is_show", 1);
            hashMap.put("login_last_time", 1);
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = new JSONArray();
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                JSONObject jSONObject = new JSONObject();
                try {
                    BaseLoginMethod baseLoginMethod = (BaseLoginMethod) list.get(i3);
                    String a3 = a.a(baseLoginMethod);
                    hashSet.add(a3);
                    jSONObject.put("user_id", baseLoginMethod.getUid());
                    jSONObject.put("platform", a3);
                    Long lastActiveTime = baseLoginMethod.getLastActiveTime();
                    if (lastActiveTime == null || lastActiveTime.longValue() <= 0) {
                        time = baseLoginMethod.getExpires().getTime() - 2592000000L;
                    } else {
                        Long lastActiveTime2 = baseLoginMethod.getLastActiveTime();
                        if (lastActiveTime2 == null) {
                            l.b();
                        }
                        time = lastActiveTime2.longValue();
                    }
                    jSONArray.put(jSONObject.put("last_active", c.b.a(time)));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            String jSONArray2 = jSONArray.toString();
            l.b(jSONArray2, "");
            hashMap.put("user_detail", jSONArray2);
            com.ss.android.ugc.aweme.account.login.v[] values = com.ss.android.ugc.aweme.account.login.v.values();
            l.b(values, "");
            for (com.ss.android.ugc.aweme.account.login.v vVar : values) {
                String name = vVar.name();
                Locale locale = Locale.ENGLISH;
                l.b(locale, "");
                Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = name.toLowerCase(locale);
                l.b(lowerCase, "");
                aVar.a(lowerCase + "_is_show", hashSet.contains(lowerCase) ? 1 : 0);
            }
            if (hashSet.contains("email") || hashSet.contains("sms_verification") || hashSet.contains("sms_verification") || hashSet.contains("phone") || hashSet.contains("handle")) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            aVar.a("phone_email_show", i2);
            aVar.a("enter_method", bundle.getString("enter_method", ""));
            aVar.a("enter_from", bundle.getString("enter_from", ""));
            aVar.a("enter_type", "click_login");
            v.a(aVar, hashMap);
            r.a("login_notify", aVar.f62575a);
            Intent intent = new Intent(activity, LoginMethodListActivity.class);
            intent.putExtra("next_page", k.ONE_KEY_LOGIN.getValue());
            intent.putExtra("current_scene", j.ONE_KEY_LOGIN.getValue());
            intent.putExtras(bundle);
            intent.putExtra("action_type", j.ONE_KEY_LOGIN.getValue());
            intent.putExtra("origin_bundle", bundle);
            intent.putExtra("ONE_KEY_LOGIN_MOB_PARAMS", hashMap);
            CommonFlowActivity.a.a(activity, j.ONE_KEY_LOGIN.getValue(), gVar, false);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.a3, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void a() {
        setContentView(R.layout.fl);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final void finish() {
        overridePendingTransition(0, R.anim.a5);
        super.finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        com.ss.android.ugc.aweme.account.f.a.b(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void b() {
        supportRequestWindowFeature(1);
        Window window = getWindow();
        window.setGravity(80);
        window.setLayout(-1, -1);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginMethodListActivity f63630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f63631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPagerBottomSheetBehavior f63632c;

        static {
            Covode.recordClassIndex(39228);
        }

        c(LoginMethodListActivity loginMethodListActivity, z.c cVar, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f63630a = loginMethodListActivity;
            this.f63631b = cVar;
            this.f63632c = viewPagerBottomSheetBehavior;
        }

        public final void run() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f63630a._$_findCachedViewById(R.id.dqe);
            l.b(relativeLayout, "");
            if (relativeLayout.getHeight() != this.f63631b.element) {
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f63632c;
                l.b(viewPagerBottomSheetBehavior, "");
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f63630a._$_findCachedViewById(R.id.dqe);
                l.b(relativeLayout2, "");
                viewPagerBottomSheetBehavior.b(relativeLayout2.getHeight());
            }
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, androidx.appcompat.app.d
    public final void onStop() {
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

    static final class d extends m implements h.f.a.b<BaseActivityViewModel, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f63633a = new d();

        static {
            Covode.recordClassIndex(39229);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f63634a);
            return h.z.f158842a;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginMethodListActivity f63635a;

        static {
            Covode.recordClassIndex(39231);
        }

        e(LoginMethodListActivity loginMethodListActivity) {
            this.f63635a = loginMethodListActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LoginMethodListActivity loginMethodListActivity = this.f63635a;
            g.a(loginMethodListActivity, "trust_one_click_pad", loginMethodListActivity.f());
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginMethodListActivity f63636a;

        static {
            Covode.recordClassIndex(39232);
        }

        f(LoginMethodListActivity loginMethodListActivity) {
            this.f63636a = loginMethodListActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63636a.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.f.a.b
    public final void a(int i2) {
        if (i2 == 11) {
            a(i2, (Bundle) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0055  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity.onCreate(android.os.Bundle):void");
    }

    public static final class b extends ViewPagerBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoginMethodListActivity f63628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f63629b;

        static {
            Covode.recordClassIndex(39227);
        }

        @Override // com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.a
        public final void a(View view) {
            l.d(view, "");
        }

        b(LoginMethodListActivity loginMethodListActivity, z.c cVar) {
            this.f63628a = loginMethodListActivity;
            this.f63629b = cVar;
        }

        @Override // com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.a
        public final void a(View view, int i2) {
            l.d(view, "");
            if (i2 == 5) {
                this.f63628a.getWindow().setDimAmount(0.0f);
                this.f63628a.finish();
            }
        }
    }
}
