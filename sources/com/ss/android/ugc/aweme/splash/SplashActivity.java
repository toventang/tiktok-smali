package com.ss.android.ugc.aweme.splash;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.newmedia.f;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.j;
import com.ss.android.ugc.aweme.app.l;
import com.ss.android.ugc.aweme.app.o;
import com.ss.android.ugc.aweme.commercialize.utils.bf;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask;
import com.ss.android.ugc.aweme.legoImp.task.UploadSysStatusTask;
import com.ss.android.ugc.aweme.legoImpl.task.AntispamApiUploadTask;
import com.ss.android.ugc.aweme.legoImpl.task.MobLaunchEventTask;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.setting.cd;
import com.ss.android.ugc.aweme.splash.b;
import com.zhiliaoapp.musically.R;

public class SplashActivity extends e implements WeakHandler.IHandler {
    public static f sConfirmWelcomeType = f.FULL_SCREEN_WELCOME;
    public static boolean sShowWelcomeCheckBox;
    private boolean isFirstShow;
    protected volatile boolean mAlive = true;
    protected boolean mAllowAd = true;
    private Dialog mDialog = null;
    private boolean mDirectlyGoMain;
    protected boolean mFirstResume = true;
    protected final Handler mHandler = new WeakHandler(this);
    protected boolean mInited;
    protected boolean mJumped;
    private b.a mSubmitPreloadHelper = new b.a();
    protected boolean mTrackSession;

    private void submitPreload() {
    }

    /* access modifiers changed from: protected */
    public void doInit() {
    }

    public boolean isSplashShowing() {
        return true;
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onDialogShowOrDismiss(DialogInterface dialogInterface, boolean z) {
    }

    @Override // androidx.fragment.app.e
    public void onStop() {
        com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    /* access modifiers changed from: protected */
    public boolean quickLaunch() {
        return false;
    }

    public void SplashActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // androidx.fragment.app.e
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void tryShowAdAndGoNext() {
        goMainActivity();
    }

    public void goMainActivity() {
        goMainActivity(null);
    }

    static {
        Covode.recordClassIndex(88003);
    }

    private static boolean enableSplashLaunchFix() {
        try {
            return c.f99077a.f99078b.getEnableSplashLaunchFix().booleanValue();
        } catch (a unused) {
            return true;
        }
    }

    private void hotStartIntercept() {
        if (isHotStart()) {
            cd.f122158b.a();
        }
    }

    /* access modifiers changed from: protected */
    public void tryInit() {
        if (!this.mInited) {
            doInit();
            this.mInited = true;
        }
    }

    @Override // androidx.fragment.app.e
    public void onDestroy() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.mHandler.removeMessages(100);
        this.mAlive = false;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void tryShowShortCutDlg() {
        a.b.f109011a.a("method_splash_try_show_ad_duration", false);
        tryShowAdAndGoNext();
        a.b.f109011a.b("method_splash_try_show_ad_duration", false);
    }

    private boolean isHotStart() {
        Intent intent = getIntent();
        if (!isTaskRoot() || intent == null || !intent.hasCategory("android.intent.category.LAUNCHER") || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return false;
        }
        return true;
    }

    private void reportLaunchTime() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - a.b.f109011a.f109007h;
        int a2 = l.a();
        int b2 = AwemeAppData.a().b();
        if (a2 != b2) {
            z = true;
        } else {
            z = false;
        }
        if (j.a().f66808a) {
            new f.c().b((w) new MobLaunchEventTask(z, currentTimeMillis)).a();
        }
        if (a2 == 0) {
            l.a(b2);
        }
    }

    /* access modifiers changed from: protected */
    public Intent getMainIntent() {
        Intent intent = getIntent();
        Intent intent2 = new Intent(this, AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().d());
        intent2.setFlags(335544320);
        if (intent != null) {
            intent2.setAction(intent.getAction());
        }
        bf.a(intent, intent2);
        if (!(intent == null || com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent) == null)) {
            intent2.putExtras(com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
        }
        return intent2;
    }

    private void mobLaunchMob() {
        String str = "";
        try {
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (data != null) {
                    str = data.getQueryParameter("gd_label");
                }
                if (booleanExtra || str != null) {
                    j.a().f66809b = false;
                    return;
                }
            }
            r.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            j.a().f66809b = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        Bundle com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        a.b.f109011a.f109002c = false;
        super.onResume();
        if (this.mDirectlyGoMain) {
            goMainActivity();
            return;
        }
        Intent intent = getIntent();
        if (this.mFirstResume && !this.mJumped) {
            this.mFirstResume = false;
            if (!(intent == null || (com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent)) == null || !com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getBoolean("from_notification"))) {
                com.ss.android.common.c.c.a(this, "more_tab", "notify_click");
                com.ss.android.common.c.c.a(this, "apn", "recall");
            }
            if (quickLaunch()) {
                goMainActivity();
            }
        }
    }

    public static Bundle com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        com.ss.android.ugc.aweme.feed.cache.e.j();
        super.attachBaseContext(context);
    }

    public static void com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(SplashActivity splashActivity) {
        splashActivity.SplashActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                splashActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(SplashActivity splashActivity) {
        com_ss_android_ugc_aweme_splash_SplashActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(splashActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                splashActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (this.mAlive && message.what == 100) {
            goMainActivity(message.getData());
        }
    }

    public void goMainActivity(Bundle bundle) {
        submitPreload();
        this.mHandler.removeMessages(100);
        if (!this.mJumped) {
            this.mJumped = true;
            if (this.mAlive) {
                Intent mainIntent = getMainIntent();
                if (bundle != null) {
                    mainIntent.putExtra("extra_splash_data", bundle);
                }
                com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(this, mainIntent);
                if (!isFinishing()) {
                    finish();
                }
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        a.b.f109011a.b("cold_boot_application_to_splash", true);
        a.b.f109011a.a("cold_boot_splash_duration", true);
        com.ss.android.ugc.aweme.bz.a.a(this);
        a.b.f109011a.a("method_splash_super_duration", false);
        getWindow().setBackgroundDrawable(new ColorDrawable(androidx.core.content.b.c(this, R.color.t)));
        super.onCreate(bundle);
        a.b.f109011a.b("method_splash_super_duration", false);
        if (getIntent() != null && TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") && getIntent().getCategories() != null && getIntent().getCategories().size() > 0 && getIntent().getCategories().contains("android.intent.category.LAUNCHER") && !isTaskRoot() && o.a().f66861a.a() && enableSplashLaunchFix()) {
            com.ss.android.ugc.aweme.framework.a.a.b(4, "SplashActivity", "finish SplashActivity directly");
            finish();
        } else if (!isTaskRoot()) {
            goMainActivity();
        } else {
            this.mAlive = true;
            this.mFirstResume = true;
            this.mJumped = false;
            reportLaunchTime();
            mobLaunchMob();
            j.a().f66808a = false;
            new f.c().b((w) new UploadInstallEventTask()).a();
            if (sConfirmWelcomeType == com.ss.android.newmedia.f.NO_WELCOME) {
                this.mTrackSession = true;
                tryInit();
            }
            hotStartIntercept();
            if (!this.mJumped) {
                tryInit();
                if (!quickLaunch()) {
                    tryShowShortCutDlg();
                }
            }
            new f.c().b((w) new AntispamApiUploadTask()).a();
            new f.c().b((w) new UploadSysStatusTask()).a();
            a.b.f109011a.b("cold_boot_splash_duration", true);
            a.b.f109011a.a("cold_boot_splash_to_main", true);
        }
    }

    public static void com_ss_android_ugc_aweme_splash_SplashActivity_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(SplashActivity splashActivity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, splashActivity);
        splashActivity.startActivity(intent);
    }
}
