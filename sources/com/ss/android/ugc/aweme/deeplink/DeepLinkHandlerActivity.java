package com.ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.j;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.aw;
import com.ss.android.ugc.aweme.bx;
import com.ss.android.ugc.aweme.commercialize.utils.bn;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.deeplink.d.c;
import com.ss.android.ugc.aweme.deeplink.q;
import com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.ss.android.ugc.aweme.main.bc;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.an;
import com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class DeepLinkHandlerActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    protected p f79401a = new p();

    /* renamed from: b  reason: collision with root package name */
    protected Uri f79402b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f79403c = false;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f79404d = false;

    /* renamed from: e  reason: collision with root package name */
    public String f79405e = null;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f79406f = false;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f79407g = false;

    /* renamed from: h  reason: collision with root package name */
    private long f79408h = 0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f79409i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f79410j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f79411k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f79412l = false;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<String> f79413m = new ArrayList<>();
    private ArrayList<Intent> n = new ArrayList<>();
    private Intent o = null;
    private Intent p = null;
    private boolean q = false;
    private boolean r = false;
    private IAccountUserService s = AccountService.a().e();
    private IDeepLinkService t = DeepLinkServiceImpl.g();
    private String u = "";

    static {
        Covode.recordClassIndex(49312);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, String str2, Context context, DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
            r.a("2131828516", new d().a("rule_id", this.f79405e).a("push_label", this.u).a("anchor_id", str).a("room_id", str2).f66730a);
        }
        c();
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, String str2, DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            r.a("2131828515", new d().a("rule_id", this.f79405e).a("push_label", this.u).a("anchor_id", str).a("room_id", str2).f66730a);
            dialogInterface.dismiss();
        }
        c.a("live_dialog", 2010, this.f79402b, "user is in live");
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        this.f79406f = false;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        finish();
    }

    private boolean b() {
        String[] strArr;
        String a2 = com.ss.android.ugc.aweme.language.d.a();
        try {
            strArr = (String[]) SettingsManager.a().a("app_action_allowlist", String[].class);
            if (strArr == null) {
                strArr = new String[]{"US"};
            }
        } catch (Throwable unused) {
            strArr = new String[]{"US"};
        }
        for (String str : strArr) {
            if (TextUtils.equals(a2, str)) {
                return false;
            }
        }
        if (!a()) {
            Intent mainActivityIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
            mainActivityIntent.putExtra("app_action_restricted", true);
            a(this, mainActivityIntent);
        } else {
            new b(this).e(R.string.buo).b();
        }
        return true;
    }

    private void c() {
        Intent intent = getIntent();
        this.f79413m = intent.getStringArrayListExtra("pre_o_urls");
        try {
            if (b(intent)) {
                if (!this.r) {
                    a(this.o, this.p, this.n);
                }
                c.a("Transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, this.f79402b, "");
                j.a().f66808a = false;
                this.t.a(a(this.f79402b, this.f79413m), true, "");
                com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a.a(this.f79402b, this.f79404d);
                if (this.f79404d && this.f79412l) {
                    int isPushVideoPreload = com.ss.android.di.push.a.a().isPushVideoPreload(this.f79408h);
                    if (a()) {
                        an.b(System.currentTimeMillis(), this.u, isPushVideoPreload);
                    } else {
                        an.a(System.currentTimeMillis(), this.u, isPushVideoPreload);
                    }
                }
            }
        } catch (Exception e2) {
            this.t.a(a(this.f79402b, this.f79413m), false, e2.getMessage());
            c.a("Transfer", 2014, this.f79402b, e2.getMessage());
            e2.printStackTrace();
        }
    }

    protected static boolean a() {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAppHot();
    }

    @Override // com.bytedance.ies.foundation.activity.a, android.view.ContextThemeWrapper, androidx.appcompat.app.d, android.app.Activity
    public void setTheme(int i2) {
        try {
            super.setTheme(i2);
        } catch (Exception unused) {
        }
    }

    private boolean b(Intent intent) {
        String str;
        Uri uri;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        String str3 = "";
        if (intent != null) {
            str = a(intent, "rule_id");
        } else {
            str = str3;
        }
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        List<String> allUidList = this.s.allUidList();
        String curUserId = this.s.getCurUserId();
        if (uri != null) {
            str2 = uri.getQueryParameter("multi_account_push_uid");
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        boolean isLogin = com.ss.android.ugc.aweme.account.b.g().isLogin();
        boolean equals = TextUtils.equals(str2, curUserId);
        boolean contains = allUidList.contains(str2);
        if (com.ss.android.ugc.aweme.language.d.c() && !isEmpty && isLogin && !equals) {
            this.r = true;
            if (AVExternalServiceImpl.a().publishService().isPublishing()) {
                new Handler().post(new h(this));
                c.a("Transfer", 2011, this.f79402b, "uploading video");
                return false;
            }
            b(contains, intent);
        }
        if (intent == null || !intent.getBooleanExtra("second_jump", false)) {
            z = false;
        } else {
            z = true;
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f79413m)) {
            if (!com.ss.android.ugc.aweme.account.b.g().isLogin() || TextUtils.isEmpty(str2) || TextUtils.equals(str2, this.s.getCurUserId())) {
                if (!a() || z) {
                    Iterator<String> it = this.f79413m.iterator();
                    while (it.hasNext()) {
                        Uri parse = Uri.parse(it.next());
                        if (this.p != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Intent a2 = a(parse, z3, false);
                        if (a2 != null) {
                            a2.putExtra("is_have_intents", true);
                            a2.putExtra("rule_id", str);
                            this.n.add(0, a2);
                        }
                    }
                }
            } else if (a()) {
                this.t.a(this.f79413m.toString(), false, "abs isAppHot == true");
                return false;
            } else {
                this.o = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
            }
        }
        if (this.o == null) {
            Uri uri2 = this.f79402b;
            if (this.p != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.o = a(uri2, z2, true);
        }
        Intent intent2 = this.o;
        if (intent2 == null) {
            if (!this.q) {
                IDeepLinkService iDeepLinkService = this.t;
                Uri uri3 = this.f79402b;
                if (uri3 != null) {
                    str3 = uri3.toString();
                }
                iDeepLinkService.a(str3, false, "abs intent == null");
            }
            if (!a() && this.f79406f) {
                Intent mainActivityIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
                this.o = mainActivityIntent;
                androidx.core.app.a.a(this, mainActivityIntent, (Bundle) null);
            }
            return false;
        }
        intent2.putExtra("from_notification", this.f79404d);
        this.o.putExtra("from_notification_uuid", this.f79405e);
        this.o.putExtra("rule_id", str);
        if (!this.f79403c) {
            this.o.addFlags(268435456);
        }
        if (this.n.size() > 0) {
            if (this.o.getComponent() == null || (!TextUtils.equals(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityClass().getName(), this.o.getComponent().getClassName()) && !TextUtils.equals(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getSplashActivityClass().getName(), this.o.getComponent().getClassName()))) {
                this.o.putExtra("is_have_intents", true);
                this.n.add(this.o);
            } else {
                this.n.clear();
            }
        }
        return true;
    }

    private boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!m.a(action) && action.indexOf("com.ss.android.sdk.") == 0) {
            String a2 = a(intent, "open_url");
            if (!m.a(a2)) {
                try {
                    this.f79402b = Uri.parse(a2);
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        if (this.f79402b == null) {
            this.f79402b = intent.getData();
        }
        Uri uri = this.f79402b;
        if (uri == null || uri.isOpaque()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x033d  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 903
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(DeepLinkHandlerActivity deepLinkHandlerActivity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, deepLinkHandlerActivity);
        deepLinkHandlerActivity.startActivity(intent);
    }

    private static String a(Uri uri, ArrayList<String> arrayList) {
        if (uri != null) {
            return uri.toString();
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList)) {
            return arrayList.toString();
        }
        return "";
    }

    private void a(String str, final Bundle bundle) {
        com.ss.android.ugc.aweme.user.c findSignificanUserInfo = com.ss.android.ugc.aweme.account.b.g().findSignificanUserInfo(str);
        if (findSignificanUserInfo != null) {
            com.ss.android.ugc.aweme.account.b.b().switchAccount(findSignificanUserInfo, bundle, new bx() {
                /* class com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(49313);
                }

                @Override // com.ss.android.ugc.aweme.bx
                public final void a() {
                    r.a("switch_account_result", new d().a("status", 1).f66730a);
                }

                @Override // com.ss.android.ugc.aweme.bx
                public final void a(Integer num, String str) {
                    if (!DeepLinkHandlerActivity.a()) {
                        LoginUtilsServiceImpl.a().a(bundle);
                        return;
                    }
                    if (Boolean.valueOf(MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAwemeAppDataEmpty()).booleanValue()) {
                        new b(f.j()).e(R.string.bpf).b();
                    }
                    r.a("switch_account_result", new d().a("status", 0).a("fail_info", num).f66730a);
                }
            });
        }
    }

    private void b(boolean z, Intent intent) {
        Activity previousActivity = ActivityStack.getPreviousActivity();
        if (previousActivity != null) {
            String canonicalName = previousActivity.getClass().getCanonicalName();
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity");
            if (arrayList.contains(canonicalName)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(previousActivity, R.style.u6);
                builder.setMessage(R.string.f22);
                builder.setNegativeButton(R.string.a9e, i.f79493a);
                builder.setPositiveButton(R.string.asg, new j(this, z, intent));
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(false);
                create.setCancelable(false);
                try {
                    create.show();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                arrayList.clear();
                return;
            }
            arrayList.clear();
        }
        a(z, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void a(boolean z, Intent intent) {
        Uri uri;
        String str;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null) {
            str = uri.getQueryParameter("multi_account_push_uid");
        } else {
            str = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_intent", intent);
        bundle.putBoolean("mFromNotification", this.f79404d);
        bundle.putString("from_notification_uuid", this.f79405e);
        bundle.putBoolean("cancelRestoreOnMain", true);
        if (z) {
            bundle.putBoolean("switch_jump", true);
            a(str, bundle);
            return;
        }
        Intent intent2 = new Intent(com.ss.android.ugc.aweme.framework.d.a.f96678a, AccountService.a().g().getPushLoginActivityClass());
        intent2.putExtra("multi_account_push_uid", str);
        intent2.putExtra("multi_account", bundle);
        if (a()) {
            a(this, intent2);
            return;
        }
        androidx.core.app.a.a(this, new Intent[]{MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this), intent2}, (Bundle) null);
    }

    private static void a(DeepLinkHandlerActivity deepLinkHandlerActivity, Intent intent, Bundle bundle) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, deepLinkHandlerActivity);
        deepLinkHandlerActivity.startActivity(intent, bundle);
    }

    private void a(Intent intent, Intent intent2, ArrayList<Intent> arrayList) {
        String str;
        androidx.core.app.b a2;
        if (getIntent() != null) {
            str = a(getIntent(), "rule_id");
        } else {
            str = "";
        }
        boolean equals = TextUtils.equals(intent.getComponent().getClassName(), DetailFeedServiceImpl.b().a().getName());
        this.f79411k = equals;
        Bundle bundle = null;
        if (equals && (a2 = androidx.core.app.b.a(this)) != null) {
            bundle = a2.a();
        }
        if (intent2 != null) {
            if (arrayList.size() > 1) {
                intent2.putExtra("next_steps", arrayList);
            } else {
                intent2.putExtra("next_step", intent);
            }
            intent2.putExtra("rule_id", str);
            if (a()) {
                a(this, intent2, bundle);
                return;
            }
            Intent[] intentArr = new Intent[2];
            intentArr[0] = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
            intentArr[0].putExtra("rule_id", str);
            intentArr[1] = intent2;
            androidx.core.app.a.a(this, intentArr, bundle);
        } else if (arrayList.size() > 1) {
            androidx.core.app.a.a(this, (Intent[]) arrayList.toArray(new Intent[arrayList.size()]), bundle);
        } else if (intent.getBooleanExtra("need_post", false)) {
            new Handler().post(new k(this, intent, bundle));
        } else {
            androidx.core.app.a.a(this, intent, bundle);
        }
    }

    public Intent a(Uri uri, boolean z, boolean z2) {
        String path;
        boolean z3;
        String str;
        String scheme = uri.getScheme();
        Intent intent = null;
        if (TextUtils.isEmpty(scheme)) {
            return null;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return null;
        }
        if (DeeplinkPrefetchImpl.a().a(new com.ss.android.ugc.tiktok.deeplink.a(uri, Boolean.valueOf(this.f79404d))).f148981i) {
            String str2 = "";
            if (uri.getPath() == null) {
                path = str2;
            } else {
                path = uri.getPath();
            }
            String a2 = a(getIntent(), "from_token");
            if (!TextUtils.isEmpty(a2)) {
                str2 = a2;
            }
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("from_token", str2);
            if (TextUtils.isEmpty(uri.getQueryParameter("enter_from"))) {
                if (TextUtils.equals("token", a(getIntent(), "enter_from"))) {
                    buildUpon.appendQueryParameter("enter_from", "token");
                } else {
                    if (this.f79404d) {
                        str = "push";
                    } else {
                        str = "deeplink";
                    }
                    buildUpon.appendQueryParameter("enter_from", str);
                }
            }
            Uri build = buildUpon.build();
            Iterator<aw> it = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getDeeplinkCommands().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                aw next = it.next();
                if (next.a(build, scheme, host, path)) {
                    if ((host + path).contains("aweme/detail") || (host + path).contains("aweme/push_detail")) {
                        this.f79412l = true;
                    } else {
                        this.f79412l = false;
                    }
                    this.f79401a.c(next.a(build));
                    intent = next.a(this, build, host, path, str2, this.f79404d, z);
                    if (intent != null) {
                        if (a(intent, "share_url_user_id") != null) {
                            this.f79401a.f(a(intent, "share_url_user_id"));
                        } else if (a(intent, "share_sec_url_user_id") != null) {
                            this.f79401a.f(a(intent, "share_sec_url_user_id"));
                        }
                        if (a(intent, "share_url_link_id") != null) {
                            this.f79401a.g(a(intent, "share_url_link_id"));
                        }
                    }
                    if (intent == null) {
                        next.a(this, build, this.f79404d);
                        c.a("independent_transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, this.f79402b, "business takeover");
                    }
                    if (!TextUtils.isEmpty(next.a())) {
                        q.a.a(build, next.a());
                    } else if (intent != null) {
                        q.a.a(build, intent.getComponent().getClassName());
                    }
                    z3 = true;
                }
            }
            if (intent != null && !a() && !intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) {
                String a3 = bc.a(build.getQueryParameter("tab_index"));
                if ((!"aweme".equals(host) || !"click_push_newvideo".equals(build.getQueryParameter("gd_label")) || !TextUtils.equals(a3, "DISCOVER")) && !TextUtils.isEmpty(a3)) {
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", a3);
                }
                intent.putExtra("is_from_push", true);
            }
            if (intent != null) {
                String queryParameter = build.getQueryParameter("backurl");
                if (!TextUtils.isEmpty(queryParameter)) {
                    intent.putExtra("backurl", queryParameter);
                }
            }
            j.a().f66808a = false;
            bn.a(build, intent);
            if (!(intent == null || build.getQueryParameter("gd_label") == null || !build.getQueryParameter("gd_label").startsWith("click_wap"))) {
                intent.putExtra("ads_app_activity_by_wap_click", true);
            }
            if (!z3) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("open_url", build.toString());
                    n.a("service_monitor", "no_matched_deep_link", jSONObject);
                } catch (Exception unused) {
                }
            }
            if (!z3 && z2) {
                this.f79406f = true;
                this.f79401a.c("default_homepage");
            }
        }
        return intent;
    }
}
