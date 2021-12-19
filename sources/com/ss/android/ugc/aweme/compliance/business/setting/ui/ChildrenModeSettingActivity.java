package com.ss.android.ugc.aweme.compliance.business.setting.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.lighten.a.v;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.bn;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.business.setting.a.c;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.setting.l;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class ChildrenModeSettingActivity extends a implements View.OnClickListener, IAccountService.b, i, j {

    /* renamed from: a  reason: collision with root package name */
    ViewGroup f77181a;

    /* renamed from: b  reason: collision with root package name */
    TextTitleBar f77182b;

    /* renamed from: c  reason: collision with root package name */
    CommonItemView f77183c;

    /* renamed from: d  reason: collision with root package name */
    CommonItemView f77184d;

    /* renamed from: e  reason: collision with root package name */
    CommonItemView f77185e;

    /* renamed from: f  reason: collision with root package name */
    CommonItemView f77186f;

    /* renamed from: g  reason: collision with root package name */
    CommonItemView f77187g;

    /* renamed from: h  reason: collision with root package name */
    CommonItemView f77188h;

    /* renamed from: i  reason: collision with root package name */
    CommonItemView f77189i;

    /* renamed from: j  reason: collision with root package name */
    CommonItemView f77190j;

    /* renamed from: k  reason: collision with root package name */
    CommonItemView f77191k;

    /* renamed from: l  reason: collision with root package name */
    TextView f77192l;

    /* renamed from: m  reason: collision with root package name */
    TextView f77193m;
    CommonItemView n;
    CommonItemView o;
    CommonItemView p;
    CommonItemView q;
    CommonItemView r;
    CommonItemView s;
    com.ss.android.ugc.aweme.login.a t;
    protected com.bytedance.ies.dmt.ui.dialog.a u;
    private int v;
    private long w;

    static {
        Covode.recordClassIndex(47724);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new g(ChildrenModeSettingActivity.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.f354do, R.anim.dx);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        b.a();
        b.f62864a.b(this);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onResume", true);
        super.onResume();
        this.f77185e.setRightText(com.ss.android.ugc.aweme.i18n.language.a.b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        IBenchmarkService c2 = BenchmarkServiceImpl.c();
        if (c2 != null) {
            c2.a(1);
        }
    }

    static boolean a() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean e2 = e();
        com.ss.android.ugc.aweme.lancet.j.f107229h = e2;
        return e2;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void d() {
        if (this.u == null) {
            a.C0731a aVar = new a.C0731a(this);
            aVar.a(R.string.asn).b(R.string.a9e, (DialogInterface.OnClickListener) new k(this), false).a(R.string.czc, (DialogInterface.OnClickListener) new l(this), false);
            this.u = aVar.a();
        }
        this.u.b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        b.a();
        b.f62864a.k().updateMethodInfo("allow_one_key_login", true);
        d();
        r.a("remember_login_info_confirm", new d().a("user_id", b.g().getCurUserId()).f66730a);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        IBenchmarkService c2 = BenchmarkServiceImpl.c();
        if (c2 != null) {
            c2.a();
        }
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

    public final void b() {
        b.a();
        bn k2 = b.f62864a.k();
        if (!k2.isOneKeyLoginExprimentEnable() || k2.getSaveLoginStatus() || !k2.isCurrentMethodAvaliable()) {
            d();
            return;
        }
        r.a("remember_login_info_notify", new d().a("user_id", b.g().getCurUserId()).f66730a);
        a.C0731a aVar = new a.C0731a(this);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(this);
        v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(b.g().getCurUser().getAvatarThumb()));
        a2.E = smartAvatarImageView;
        a2.c();
        aVar.a(smartAvatarImageView, 48, 48);
        aVar.M = false;
        aVar.a(R.string.c3).b(R.string.c0).b(R.string.c1, (DialogInterface.OnClickListener) new i(this), false).a(R.string.c2, (DialogInterface.OnClickListener) new j(this), false);
        aVar.a().c();
    }

    public void exit(View view) {
        finish();
    }

    public static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (TextUtils.equals("user", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(this, this.f77181a, jVar);
        }
    }

    public static boolean a(File file) {
        MethodCollector.i(5177);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(5177);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(5177);
        return delete;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(b.i iVar) {
        if (!iVar.a()) {
            return null;
        }
        this.f77191k.setRightText("0 M");
        new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.agm).a();
        return null;
    }

    public void onVersionClick(View view) {
        if (System.currentTimeMillis() - this.w < 500) {
            this.v++;
        } else {
            this.v = 0;
        }
        if (this.v >= 4) {
            this.f77192l.setVisibility(0);
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.a().configService().avsettingsConfig();
            StringBuilder sb = new StringBuilder();
            sb.append("UserId: " + b.g().getCurUserId()).append("\n").append("DeviceId: ".concat(String.valueOf(serverDeviceId))).append("\n").append("UpdateVerionCode: " + com.bytedance.ies.ugc.appcontext.d.d()).append("\n").append("GitSHA: " + com.bytedance.ies.ugc.appcontext.d.p).append("\n").append("VESDK: " + avsettingsConfig.getVESDKVersion()).append("\n").append("EffectSdk: " + avsettingsConfig.getEffectVersion()).append("\n").append(com.ss.android.ugc.aweme.setting.services.f.f122672a.getReleaseBuildString());
            this.f77192l.setText(sb.toString());
            this.v = 0;
        }
        this.w = System.currentTimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f7, code lost:
        if (r0 != false) goto L_0x02f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r14) {
        /*
        // Method dump skipped, instructions count: 1015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity.onClick(android.view.View):void");
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65559e = R.attr.f159902m;
        xVar.f65560f = R.attr.f159902m;
        xVar.f65562h = true;
        activityConfiguration(new c(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.ty);
        this.f77181a = (ViewGroup) findViewById(R.id.dqe);
        this.f77182b = (TextTitleBar) findViewById(R.id.em8);
        this.f77183c = (CommonItemView) findViewById(R.id.bm);
        this.f77184d = (CommonItemView) findViewById(R.id.am8);
        this.f77185e = (CommonItemView) findViewById(R.id.acd);
        this.f77186f = (CommonItemView) findViewById(R.id.bg1);
        this.f77187g = (CommonItemView) findViewById(R.id.b27);
        this.f77188h = (CommonItemView) findViewById(R.id.eiv);
        this.f77189i = (CommonItemView) findViewById(R.id.d9e);
        this.f77190j = (CommonItemView) findViewById(R.id.af_);
        this.f77191k = (CommonItemView) findViewById(R.id.a76);
        this.f77192l = (TextView) findViewById(R.id.fdd);
        this.f77193m = (TextView) findViewById(R.id.ff2);
        this.n = (CommonItemView) findViewById(R.id.czh);
        this.o = (CommonItemView) findViewById(R.id.cj4);
        this.p = (CommonItemView) findViewById(R.id.ace);
        this.q = (CommonItemView) findViewById(R.id.dry);
        this.r = (CommonItemView) findViewById(R.id.aid);
        this.s = (CommonItemView) findViewById(R.id.dwr);
        View findViewById = findViewById(R.id.ff2);
        if (findViewById != null) {
            findViewById.setOnClickListener(new d(this));
        }
        this.f77182b.setTitle(R.string.aja);
        this.f77182b.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47725);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                ChildrenModeSettingActivity.this.exit(view);
            }
        });
        o.a(true, this.q);
        this.f77193m.setText(com.a.a(getString(R.string.fnj), new Object[]{com.bytedance.ies.ugc.appcontext.d.i(), String.valueOf(com.bytedance.ies.ugc.appcontext.d.h())}) + "");
        ViewGroup viewGroup = this.f77181a;
        viewGroup.setBackgroundColor(androidx.core.content.b.c(viewGroup.getContext(), R.color.f159928l));
        this.f77182b.setBackgroundColor(androidx.core.content.b.c(this.f77181a.getContext(), R.color.f159928l));
        o.a(l.c(), this.r);
        c.a((ViewGroup) this.f77181a.findViewById(R.id.cgl));
        this.n.setLeftText("Debug Test");
        this.n.setVisibility(8);
        try {
            ICacheService cacheConfig = AVExternalServiceImpl.a().configService().cacheConfig();
            File[] fileArr = new File[4];
            fileArr[0] = getCacheDir();
            fileArr[1] = com.ss.android.ugc.aweme.video.e.a();
            fileArr[2] = new File(cacheConfig.stickerDir());
            File file = new File(a(com.bytedance.ies.ugc.appcontext.d.a()).getAbsolutePath() + "/aweme_monitor");
            if (!file.exists()) {
                file.mkdir();
            }
            fileArr[3] = file;
            String b2 = com.ss.android.ugc.aweme.utils.bn.b(fileArr);
            if (!m.a(b2)) {
                this.f77191k.setRightText(b2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this.f77191k.setRightText("0.00M");
        }
        this.f77183c.setOnClickListener(this);
        this.f77184d.setOnClickListener(this);
        this.f77185e.setOnClickListener(this);
        this.f77187g.setOnClickListener(this);
        this.f77186f.setOnClickListener(this);
        this.f77188h.setOnClickListener(this);
        this.f77189i.setOnClickListener(this);
        this.f77190j.setOnClickListener(this);
        this.f77191k.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.s.setOnClickListener(this);
        com.ss.android.ugc.aweme.compliance.api.a.l().a("new_kids_mode_visit", true ^ in.d(), new d().a("activity", "ChildrenModeSettingActivity").f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.setting.ui.ChildrenModeSettingActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public void onAccountResult(int i2, boolean z, int i3, User user) {
        com.ss.android.ugc.aweme.login.a aVar;
        if (!isFinishing() && (aVar = this.t) != null && aVar.isShowing()) {
            this.t.dismiss();
        }
    }
}
