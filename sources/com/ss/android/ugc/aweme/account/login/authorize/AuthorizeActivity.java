package com.ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.a;
import com.bytedance.lobby.auth.c;
import com.bytedance.lobby.internal.d;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.a.a.a.e;
import com.bytedance.sdk.a.a.f;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.agegate.a;
import com.ss.android.ugc.aweme.account.agegate.util.h;
import com.ss.android.ugc.aweme.account.base.SafeHandler;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.login.b;
import com.ss.android.ugc.aweme.account.login.g.b;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.login.m;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.account.login.n;
import com.ss.android.ugc.aweme.account.login.v2.a.a.o;
import com.ss.android.ugc.aweme.account.login.v2.a.v;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.g;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.m.d;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.bf;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AuthorizeActivity extends b implements a, a.AbstractC1371a, com.ss.android.ugc.aweme.account.login.authorize.b.a, b.a, m.a, g {

    /* renamed from: m  reason: collision with root package name */
    private static final boolean f63328m = false;
    private static Set<Integer> y = new HashSet();
    private int A = -1;
    private String B = "";
    private e C;
    private boolean D = false;
    private boolean E = false;

    /* renamed from: i  reason: collision with root package name */
    public AuthResult f63329i;

    /* renamed from: j  reason: collision with root package name */
    public String f63330j;

    /* renamed from: k  reason: collision with root package name */
    protected String f63331k;

    /* renamed from: l  reason: collision with root package name */
    protected String f63332l;
    private d n;
    private c o;
    private com.ss.android.ugc.aweme.account.h.e p;
    private f q;
    private boolean r;
    private boolean s;
    private boolean t;
    private m u;
    private boolean v;
    private boolean w;
    private Handler x = new SafeHandler(this);
    private boolean z = false;

    @Override // com.ss.android.ugc.aweme.account.login.b
    public final int a() {
        return R.layout.h9;
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
    public void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final String W_() {
        return this.f63331k;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final String X_() {
        return this.f63332l;
    }

    private int h() {
        if (this.t) {
            return 3;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final String Y_() {
        return a(getIntent(), "enter_type");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final Bundle aa_() {
        return a(getIntent());
    }

    @Override // com.ss.android.ugc.aweme.account.login.m.a
    public final void e() {
        a(0, new Intent());
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        bt.b(this.u);
        super.finish();
    }

    static {
        Covode.recordClassIndex(39026);
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (this.u == null) {
            m mVar = new m(this);
            this.u = mVar;
            mVar.f63490a = this;
        }
        bt.a(this.u);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", true);
        super.onResume();
        if (this.D && !this.E) {
            g();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", false);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        MethodCollector.i(9372);
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        if (this.n != null) {
            com.bytedance.lobby.internal.a a2 = com.bytedance.lobby.internal.a.a();
            synchronized (a2.f40238a) {
                try {
                    for (Map.Entry<androidx.core.g.e<String, Integer>, List<com.bytedance.lobby.auth.a>> entry : a2.f40238a.entrySet()) {
                        List<com.bytedance.lobby.auth.a> value = entry.getValue();
                        if (value != null) {
                            value.remove(this);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9372);
                    throw th;
                }
            }
        }
        Set<Integer> set = y;
        if (set != null) {
            set.remove(Integer.valueOf(hashCode()));
        }
        MethodCollector.o(9372);
    }

    public final void g() {
        o.f64188b = null;
        if (this.r) {
            d.a.a(1, this.f63330j, this.A, "passport error:" + this.B);
            i.a(this.A, this.B, this.f63330j);
        }
        Intent intent = new Intent();
        intent.putExtra("error_code", this.A);
        if (((bf) com.ss.android.ugc.aweme.a.a(bf.class)).d() == 1 && this.w && !TextUtils.equals(this.f63330j, "facebook") && !TextUtils.equals(this.f63330j, "google") && q.a() != 0) {
            a(0, intent);
        } else if (this.C.a()) {
            intent.putExtra("description", this.A);
            intent.putExtra("repeat_bind_error", true);
            a(999, intent);
        } else {
            intent.putExtra("description", this.A);
            a(0, intent);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0151, code lost:
        if (r9.equals(r10) != false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea  */
    @Override // com.ss.android.ugc.aweme.account.login.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 482
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.b():void");
    }

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String b(AuthResult authResult) {
        if (TextUtils.equals("google", authResult.f40150d)) {
            return "";
        }
        return authResult.f40152f;
    }

    private static String c(AuthResult authResult) {
        if (TextUtils.equals("google", authResult.f40150d) || TextUtils.equals("google_onetap", authResult.f40150d)) {
            return authResult.f40152f;
        }
        return authResult.f40153g;
    }

    private void a(Boolean bool) {
        if (!TextUtils.isEmpty(this.f63330j) && "google_onetap".equals(this.f63330j)) {
            com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
            aVar.a("enter_from", this.f63331k).a("enter_method", this.f63332l);
            if (bool.booleanValue()) {
                aVar.a("exit_method", "dismiss");
            } else {
                aVar.a("exit_method", "continue");
            }
            r.a("exit_google_onetap", aVar.f62575a);
        }
    }

    public final void b(com.bytedance.sdk.a.n.a aVar) {
        this.E = true;
        o.f64188b = null;
        a(aVar);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.account.login.b, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", true);
        super.onCreate(bundle);
        y.add(Integer.valueOf(hashCode()));
        if (y.size() != 1) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
            return;
        }
        this.f63331k = a(getIntent(), "enter_from");
        this.f63332l = a(getIntent(), "enter_method");
        h.a();
        if (!(this.n == null || this.o == null)) {
            r.onEvent(MobClick.obtain().setEventName("sign_in").setLabelName(this.f63330j));
            com.ss.android.ugc.aweme.account.m.d.f65149a = System.currentTimeMillis();
            if ("google_web".equals(this.o.f40167b)) {
                f();
            }
            com.bytedance.lobby.internal.d.a(this.o);
            if (this.r) {
                r.a("token_request", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f63332l).a("enter_from", this.f63331k).a("platform", this.f63330j).a("_perf_monitor", 1).f62575a);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(final com.bytedance.sdk.a.n.a aVar) {
        j jVar;
        AuthResult authResult;
        boolean z2;
        if (this.r) {
            if (!TextUtils.isEmpty(this.f63330j) && "facebook".equals(this.f63330j) && aVar != null && (authResult = this.f63329i) != null) {
                String[] stringArray = authResult.f40156j.getStringArray("fb_granted_permissions");
                int length = stringArray.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if ("user_friends".equals(stringArray[i2])) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                String valueOf = String.valueOf(aVar.f43463a);
                String str = this.f63329i.f40152f;
                long j2 = this.f63329i.f40154h;
                if (z2) {
                    com.ss.android.ugc.aweme.friends.service.a.f97047a.g().a(valueOf, str, j2);
                } else {
                    com.ss.android.ugc.aweme.friends.service.a.f97047a.g().b(valueOf);
                    com.ss.android.ugc.aweme.friends.service.a.f97047a.c(false);
                }
            }
            final Intent intent = new Intent();
            AgeGateResponse ageGateResponse = null;
            if (((bf) com.ss.android.ugc.aweme.a.a(bf.class)).d() != 0 && this.w) {
                ageGateResponse = new AgeGateResponse(0, "", false, 0, 0, null);
            }
            Bundle bundle = new Bundle(a(getIntent()));
            if (aVar.f43467e) {
                bundle.putBoolean("new_user_need_set_username", true);
                bundle.putBoolean("new_user_need_get_recommend_username", true);
                bundle.putString("set_username_platform", com.ss.android.ugc.aweme.account.h.f.a(this.o));
                bundle.putString("enter_from", this.f63331k);
                bundle.putString("enter_method", this.f63332l);
            }
            if (aVar.f43467e) {
                jVar = j.SIGN_UP;
            } else {
                jVar = j.LOGIN;
            }
            bundle.putInt("current_scene", jVar.getValue());
            bundle.putString("platform", com.ss.android.ugc.aweme.account.h.f.a(this.o));
            bundle.putString("login_path", "third_party_auth");
            if (ageGateResponse != null) {
                bundle.putSerializable("age_gate_response", ageGateResponse);
            }
            com.ss.android.ugc.aweme.account.d.a(bundle, this, new h.f.a.b<b.i<Bundle>, z>() {
                /* class com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(39027);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(b.i<Bundle> iVar) {
                    if (iVar.c()) {
                        AuthorizeActivity.this.a(0, intent);
                    } else {
                        com.ss.android.ugc.aweme.account.f.a.a(11);
                        AuthorizeActivity.this.a(-1, intent);
                        v.a(aVar.f43467e, AuthorizeActivity.this.f63330j, (g) AuthorizeActivity.this, aVar, (Map<String, ? extends Object>) null, false);
                    }
                    User f2 = cj.f();
                    String uid = f2.getUid();
                    if (!TextUtils.isEmpty(uid) && AuthorizeActivity.this.getIntent().getBooleanExtra("need_remember_login_method", true)) {
                        com.ss.android.ugc.aweme.account.login.q.b(new TPLoginMethod(uid, AuthorizeActivity.this.f63330j, TPUserInfo.from(f2), false, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis())));
                    }
                    if (cj.d()) {
                        cj.a(1, 1, (Object) "");
                        cj.a(cj.f());
                    }
                    if (AuthorizeActivity.this.f63329i == null) {
                        return null;
                    }
                    ((IAccountHelperService) com.ss.android.ugc.aweme.a.a(IAccountHelperService.class)).friendUploadToken(AuthorizeActivity.this.f63330j, AuthorizeActivity.this.f63329i.f40152f, AuthorizeActivity.this.f63329i.f40153g);
                    return null;
                }
            });
            if ("find_account".equals(this.f63331k)) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.c());
                return;
            }
            return;
        }
        a(-1, new Intent());
    }

    @Override // com.bytedance.lobby.auth.a
    public final void a(AuthResult authResult) {
        Set<String> keySet;
        if (f63328m) {
            Bundle bundle = authResult.f40156j;
            l.d("AuthorizeActivity", "");
            if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
                for (T t2 : keySet) {
                    new StringBuilder("[").append((String) t2).append(": ").append(com.ss.android.ugc.aweme.account.util.c.a(bundle, t2)).append(']');
                }
            }
        }
        if (!(isFinishing() || isDestroyed())) {
            this.f63329i = authResult;
            if (authResult.f40147a) {
                a(authResult, true);
            } else if (authResult.f40148b) {
                a((Boolean) true);
                this.x.post(new a(this));
            } else {
                this.x.post(new b(this));
            }
            com.ss.android.ugc.aweme.account.h.e eVar = this.p;
            if (eVar != null) {
                eVar.a(authResult);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.authorize.b.a
    public final void a(com.bytedance.sdk.a.n.a aVar) {
        cj.a(aVar);
        a((Boolean) false);
        if (this.r) {
            String str = this.f63330j;
            if (i.a()) {
                com.ss.android.ugc.aweme.account.m.b.a("aweme_thirdparty_login_error_rate", 1, i.a(str).a("app_language", ((ILanguageService) com.ss.android.ugc.aweme.a.a(ILanguageService.class)).a()).a("platform", str).a());
            }
        }
        ((IAccountHelperService) com.ss.android.ugc.aweme.a.a(IAccountHelperService.class)).AppsFlyerUtilsTrackLoginSuccess(this.f63330j);
        this.x.post(new f(this, aVar));
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.g.b.a
    public final void b(int i2, AuthResult authResult) {
        if (i2 == -1) {
            a(authResult, false);
            return;
        }
        a(0, new Intent());
        finish();
    }

    private static boolean b(int i2, Intent intent) {
        Bundle a2;
        if (i2 == 0 || intent == null || (a2 = a(intent)) == null || !a2.containsKey("callback")) {
            return false;
        }
        try {
            Uri parse = Uri.parse(a2.getString("callback"));
            String scheme = parse.getScheme();
            if (scheme != null) {
                if (scheme.startsWith("snssdk")) {
                    if ("connect_switch".equals(parse.getQueryParameter("error_name"))) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void a(int i2, Intent intent) {
        intent.putExtra("platform", this.f63330j);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            setResult(i2, intent);
            finish();
            return;
        }
        this.x.post(new e(this, i2, intent));
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.a.AbstractC1371a
    public final void a(int i2, AuthResult authResult) {
        if (!isFinishing()) {
            if (i2 == -1) {
                v.a(true, 56004, com.ss.android.ugc.aweme.account.h.f.d(authResult), (g) this, (Map<String, ? extends Object>) null, false);
            } else if (i2 == 0) {
                v.a(true, -3005, com.ss.android.ugc.aweme.account.h.f.d(authResult), (g) this, (Map<String, ? extends Object>) null, false);
            }
            if (authResult == null || i2 != 1) {
                a(0, new Intent());
                finish();
                return;
            }
            a(authResult, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(AuthResult authResult, boolean z2) {
        String a2 = com.ss.android.ugc.aweme.account.h.f.a(authResult);
        String c2 = com.ss.android.ugc.aweme.account.h.f.c(authResult);
        String d2 = com.ss.android.ugc.aweme.account.h.f.d(authResult);
        long j2 = authResult.f40154h / 1000;
        String b2 = b(authResult);
        String c3 = c(authResult);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(authResult.f40151e)) {
            hashMap.put("uid", Uri.encode(authResult.f40151e));
        }
        if (!TextUtils.isEmpty(c3)) {
            hashMap.put("access_token_secret", Uri.encode(c3));
        }
        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.account.h.f.b(authResult))) {
            hashMap.put("profile_key", Uri.encode(com.ss.android.ugc.aweme.account.h.f.b(authResult)));
        }
        int h2 = h();
        if (h2 == 1) {
            this.v = z2;
            if (this.r && cj.g().isEnableMultiAccountLogin()) {
                hashMap.put("multi_login", Uri.encode("1"));
            }
            if (!z2) {
                Map<String, String> b3 = h.b();
                if (b3.size() > 0) {
                    hashMap.putAll(b3);
                }
                if (this.r) {
                    if (this.s) {
                        hashMap.put("multi_signup", "1");
                    } else {
                        hashMap.put("multi_signup", "0");
                    }
                }
                if (!TextUtils.isEmpty(a2)) {
                    this.q.a(c2, d2, a2, j2, hashMap, new com.ss.android.ugc.aweme.account.login.authorize.b.c(this));
                } else {
                    this.q.b(c2, d2, b2, j2, hashMap, new com.ss.android.ugc.aweme.account.login.authorize.b.c(this));
                }
            } else if (!TextUtils.isEmpty(a2)) {
                this.q.c(c2, d2, a2, j2, hashMap, new com.ss.android.ugc.aweme.account.login.authorize.b.c(this));
            } else {
                this.q.d(c2, d2, b2, j2, hashMap, new com.ss.android.ugc.aweme.account.login.authorize.b.c(this));
            }
        } else if (h2 != 3) {
            this.x.post(new c(this));
        } else {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(b2)) {
                intent.putExtra("access_token", b2);
            }
            if (!TextUtils.isEmpty(c3)) {
                intent.putExtra("access_token_secret", c3);
            }
            if (!TextUtils.isEmpty(a2)) {
                intent.putExtra("code", a2);
            }
            if (j2 > 0) {
                intent.putExtra("expires_in", j2);
            }
            if (!TextUtils.isEmpty(c2)) {
                intent.putExtra("platform_id", c2);
            }
            a(-1, intent);
        }
        this.x.post(new d(this));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 32972) {
            if (b(i3, intent)) {
                Intent intent2 = new Intent();
                intent2.putExtra("repeat_bind_error", true);
                a(0, intent2);
                return;
            }
            this.q.a(this.f63330j, new com.ss.android.ugc.aweme.account.login.authorize.b.b(this));
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.ss.android.ugc.aweme.account.login.authorize.b.a
    public final void a(int i2, String str, String str2, e eVar) {
        boolean z2;
        String str3;
        String str4;
        if (!isFinishing()) {
            this.A = i2;
            this.B = str;
            this.C = eVar;
            boolean z3 = false;
            a((Boolean) false);
            int d2 = ((bf) com.ss.android.ugc.aweme.a.a(bf.class)).d();
            if (i2 == 1011) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.w = z2;
            com.ss.android.ugc.aweme.account.k.e eVar2 = new com.ss.android.ugc.aweme.account.k.e();
            eVar2.f63124c = this.f63330j;
            eVar2.f63123b = "0";
            eVar2.f63125d = String.valueOf(i2);
            if (this.v) {
                str3 = "/passport/auth/only_login/";
            } else {
                str3 = "/passport/auth/login/";
            }
            eVar2.f63126e = str3;
            eVar2.a();
            if (a(getIntent()) != null && a(getIntent()).getBoolean("age_gate_block", false)) {
                z3 = true;
            }
            if (!this.v || !this.w) {
                if (!this.w && this.r) {
                    v.a(false, i2, this.f63330j, (g) this, (Map<String, ? extends Object>) null, false);
                    if (i2 > 0 && !n.f63503a.contains(Integer.valueOf(i2)) && !n.f63504b.contains(Integer.valueOf(i2))) {
                        if (i2 == 1450) {
                            l.d(this, "");
                            l.d(eVar, "");
                            o.f64188b = new WeakReference<>(this);
                            String optString = eVar.f43077h.optJSONObject("data").optString("webapp_url");
                            if (TextUtils.isEmpty(optString)) {
                                new com.bytedance.tux.g.b(this).e(R.string.bpf).b();
                            }
                            SmartRouter.buildRoute(this, optString).open();
                            this.D = true;
                            return;
                        } else if (i2 != 1381) {
                            if (TextUtils.isEmpty(str)) {
                                str4 = getString(R.string.d01);
                            } else {
                                str4 = str;
                            }
                            new com.ss.android.ugc.aweme.tux.a.i.a(getBaseContext()).a(str4).a();
                        } else {
                            if (eVar.f43077h != null) {
                                com.ss.android.ugc.aweme.account.login.v2.a.a.g gVar = new com.ss.android.ugc.aweme.account.login.v2.a.a.g(eVar.f43077h.optJSONObject("data"));
                                if (gVar.f64159a) {
                                    CommonFlowActivity.a(this, gVar.a(), j.CHANGE_PASSWORD, gVar.b(), new h(this), null, true);
                                }
                            }
                            new com.ss.android.ugc.aweme.tux.a.i.a(getBaseContext()).a(R.string.bpf).a();
                        }
                    }
                }
                if (this.r) {
                    d.a.a(1, this.f63330j, i2, "passport error:".concat(String.valueOf(str)));
                    i.a(i2, str, this.f63330j);
                }
                g();
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f63329i.f40156j.putString("profile_key", str2);
            }
            this.x.post(new g(this, d2, z3));
        }
    }
}
