package com.bytedance.tiktok.homepage.mainactivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.d.f;
import com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.push.downgrade.e;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.setting.by;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.is;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class a implements i, j {

    /* renamed from: e  reason: collision with root package name */
    public static final C1077a f44133e = new C1077a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f44134a = true;

    /* renamed from: b  reason: collision with root package name */
    public c f44135b = new c();

    /* renamed from: c  reason: collision with root package name */
    public final MainActivity f44136c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.tiktok.homepage.a f44137d;

    /* renamed from: f  reason: collision with root package name */
    private final DataCenter f44138f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f44139g = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(27046);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(274, new g(a.class, "onUserLogicDeleteEvent", f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(275, new g(a.class, "onUserLoginStateChange", com.ss.android.ugc.aweme.al.f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(276, new g(a.class, "onSwitchAccountSuccess", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainactivity.a$a  reason: collision with other inner class name */
    public static final class C1077a {
        static {
            Covode.recordClassIndex(27047);
        }

        private C1077a() {
        }

        public /* synthetic */ C1077a(byte b2) {
            this();
        }
    }

    public static final class c implements IAccountService.b {
        static {
            Covode.recordClassIndex(27049);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.b
        public final void onAccountResult(int i2, boolean z, int i3, User user) {
            if (e.a(d.a())) {
                com.ss.android.ugc.aweme.push.downgrade.b.f118877a = false;
                com.ss.android.ugc.aweme.push.downgrade.b.a();
            } else {
                IPushApi a2 = com.ss.android.di.push.a.a();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                a2.initPushAccountService(g2.isLogin());
            }
            is.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f44140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44141b;

        static {
            Covode.recordClassIndex(27048);
        }

        b(a aVar, String str) {
            this.f44140a = aVar;
            this.f44141b = str;
        }

        public final void run() {
            new com.bytedance.tux.g.b(this.f44140a.f44136c).a(this.f44141b).b();
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onUserLogicDeleteEvent(f fVar) {
        l.d(fVar, "");
        if (this.f44139g.compareAndSet(false, true)) {
            new com.bytedance.tux.g.b(this.f44136c).a(fVar.f68104a).b();
            com.ss.android.ugc.aweme.account.b.b().logout("user_logic_delete", "cancel_account_logout");
        }
    }

    @r
    public final void onUserLoginStateChange(com.ss.android.ugc.aweme.al.f fVar) {
        l.d(fVar, "");
        if (fVar.f66366a == 0) {
            com.ss.android.ugc.aweme.ug.c a2 = UgCommonServiceImpl.j().a();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            l.b(curUserId, "");
            a2.a("login", curUserId);
        }
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            Uri uri = null;
            if (in.d() && com.ss.android.ugc.aweme.account.b.g().allUidList().size() > 1) {
                n.a("child_mode_multi_account", "", (JSONObject) null);
            }
            com.ss.android.ugc.aweme.login.d.f109022a = false;
            com.ss.android.ugc.aweme.compliance.api.a.h().b();
            if (bundle.getBoolean("is_start_by_switch_account", false)) {
                com.ss.android.ugc.aweme.compliance.api.a.n().a(this.f44136c);
            }
            if (!TextUtils.isEmpty(bundle.getString("switch_account_success_toast_text", null))) {
                new Handler().post(new b(this, bundle.getString("switch_account_success_toast_text", null)));
            }
            boolean z = bundle.getBoolean("login_jump");
            boolean z2 = bundle.getBoolean("switch_jump");
            boolean z3 = bundle.getBoolean("cancelRestoreOnMain");
            Intent intent = (Intent) bundle.getParcelable("push_intent");
            if (intent != null) {
                uri = intent.getData();
            }
            if (z3) {
                AVExternalServiceImpl.a().publishService().cancelRestoreOnMain();
            }
            if (intent == null) {
                return;
            }
            if (z || z2) {
                intent.putExtra("second_jump", true);
                intent.setClass(this.f44136c, DeepLinkActivityV2.class);
                intent.putExtra("inner_from", "switch_account");
                if (uri != null) {
                    intent.setData(uri.buildUpon().appendQueryParameter("_t", String.valueOf(System.currentTimeMillis())).build());
                }
                MainActivity mainActivity = this.f44136c;
                com.ss.android.ugc.tiktok.security.a.a.a(intent, mainActivity);
                mainActivity.startActivity(intent);
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onSwitchAccountSuccess(com.ss.android.ugc.aweme.fe.method.j jVar) {
        String str;
        String str2 = "";
        l.d(jVar, str2);
        if (jVar.f91311b != null) {
            Integer num = null;
            if (!TextUtils.equals(jVar.f91311b.optString("eventName"), "account_switch_success")) {
                JSONObject optJSONObject = jVar.f91311b.optJSONObject("data");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("eventName");
                } else {
                    str = null;
                }
                if (!TextUtils.equals(str, "account_switch_success")) {
                    return;
                }
            }
            if (com.bytedance.ies.abmock.j.a().c()) {
                com.ss.android.ugc.aweme.lego.f.e().a(new com.ss.android.ugc.aweme.request_combine.request.a.e(1)).a();
            } else {
                by.f122128a.a((Context) this.f44136c);
            }
            com.ss.android.ugc.aweme.lego.f.e().a(new com.ss.android.ugc.aweme.settingsrequest.api.g()).a();
            com.ss.android.ugc.aweme.account.b.g().updateCurUser(com.ss.android.ugc.aweme.account.b.g().queryUser(((IAccountHelperService) com.ss.android.ugc.aweme.a.a(IAccountHelperService.class)).selfUserApi(), false));
            JSONObject optJSONObject2 = jVar.f91311b.optJSONObject("data");
            if (optJSONObject2 != null) {
                int optInt = optJSONObject2.optInt("account_type");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("data");
                if (optJSONObject3 != null) {
                    num = Integer.valueOf(optJSONObject3.optInt("account_type"));
                }
                if (optInt == 2) {
                    SmartRouter.buildRoute(this.f44136c, "//setting").addFlags(67108864).addFlags(536870912).withParam("from_switch_creator_success", true).open();
                    com.ss.android.ugc.aweme.compliance.api.a.s().a();
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.setting.d.f());
                } else if (optInt == 3 || (num != null && num.intValue() == 3)) {
                    this.f44138f.a("performClickTab", "USER");
                    if (com.bytedance.ies.abmock.j.a().c()) {
                        SettingManagerServiceImpl.b().a(1);
                    } else {
                        SettingManagerServiceImpl.b().a(this.f44136c);
                    }
                    SettingManagerServiceImpl.b().a();
                    if (this.f44137d != null) {
                        MainActivity mainActivity = this.f44136c;
                        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
                        a.C0731a aVar = new a.C0731a(mainActivity);
                        aVar.E = true;
                        StringBuilder append = new StringBuilder().append(mainActivity.getResources().getString(R.string.a26)).append(" ");
                        if (curUser.getNickname() != null) {
                            str2 = curUser.getNickname();
                        }
                        aVar.f33401a = append.append(str2).toString();
                        aVar.f33402b = mainActivity.getResources().getString(R.string.gl2);
                        aVar.a(mainActivity.getResources().getString(R.string.a28), (DialogInterface.OnClickListener) new com.bytedance.tiktok.homepage.b(mainActivity), false).c(mainActivity.getResources().getString(R.string.a29), com.bytedance.tiktok.homepage.c.f44122a, false).a().c();
                    }
                    com.ss.android.ugc.aweme.compliance.api.a.s().a();
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.setting.d.e());
                }
            }
        }
    }

    public a(MainActivity mainActivity, DataCenter dataCenter, com.bytedance.tiktok.homepage.a aVar) {
        l.d(mainActivity, "");
        l.d(dataCenter, "");
        this.f44136c = mainActivity;
        this.f44137d = aVar;
        this.f44138f = dataCenter;
        EventBus.a(EventBus.a(), this);
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.a(this.f44135b);
    }
}
