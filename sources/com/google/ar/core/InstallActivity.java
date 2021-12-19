package com.google.ar.core;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicReference;

public class InstallActivity extends Activity {
    private boolean finished;
    private ArCoreApk.InstallBehavior installBehavior;
    private boolean installStarted;
    public aj lastEvent = aj.CANCELLED;
    private ArCoreApk.UserMessageType messageType;
    private final ContextThemeWrapper themeWrapper = new ContextThemeWrapper(this, 16974394);
    public boolean waitingForCompletion;

    static {
        Covode.recordClassIndex(33022);
    }

    public static int com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public void InstallActivity__onStop$___twin___() {
        super.onStop();
    }

    public void onNewIntent(Intent intent) {
    }

    public void onPause() {
        a.c(this);
        super.onPause();
    }

    public void onStart() {
        a.a(this);
        super.onStart();
    }

    public void onStop() {
        a.d(this);
        com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    private boolean isOptional() {
        if (this.installBehavior == ArCoreApk.InstallBehavior.OPTIONAL) {
            return true;
        }
        return false;
    }

    public void finish() {
        finishWithFailure(new UnavailableUserDeclinedInstallationException());
    }

    public void onDestroy() {
        a.e(this);
        if (!this.finished) {
            z.f53484a.a();
        }
        super.onDestroy();
    }

    public void closeInstaller() {
        com_google_ar_core_InstallActivity_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(this, new Intent(this, InstallActivity.class).setFlags(67108864));
    }

    private void showEducationDialog() {
        setContentView(R.layout.f159992a);
        findViewById(R.id.al).setOnClickListener(new af(this, (byte) 0));
        if (!isOptional()) {
            findViewById(R.id.al).setVisibility(8);
        }
        findViewById(R.id.am).setOnClickListener(new af(this));
        TextView textView = (TextView) findViewById(R.id.an);
        if (this.messageType.ordinal() != 1) {
            textView.setText(R.string.hn);
        } else {
            textView.setText(R.string.ho);
        }
    }

    public void animateToSpinner() {
        MethodCollector.i(9925);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = (int) (displayMetrics.density * 280.0f);
        int width = getWindow().getDecorView().getWidth();
        int height = getWindow().getDecorView().getHeight();
        setContentView(new RelativeLayout(this));
        getWindow().getDecorView().setMinimumWidth(i2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ag(this, width, i2, height));
        ofFloat.addListener(new ah(this));
        ofFloat.start();
        MethodCollector.o(9925);
    }

    public void onResume() {
        MethodCollector.i(10078);
        a.b(this);
        super.onResume();
        if (!this.installStarted) {
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                startInstaller();
                MethodCollector.o(10078);
                return;
            }
            MethodCollector.o(10078);
        } else if (!this.finished) {
            synchronized (this) {
                try {
                    if (this.lastEvent == aj.CANCELLED) {
                        finish();
                    } else if (this.lastEvent == aj.ACCEPTED) {
                        this.waitingForCompletion = true;
                    } else {
                        finishWithFailure(z.f53484a.f53485b);
                    }
                } finally {
                    MethodCollector.o(10078);
                }
            }
        } else {
            MethodCollector.o(10078);
        }
    }

    public void showSpinner() {
        MethodCollector.i(9924);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i2, i2);
        RelativeLayout relativeLayout = new RelativeLayout(this.themeWrapper);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.themeWrapper);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.themeWrapper);
        textView.setText(R.string.hp);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i2, i2);
        MethodCollector.o(9924);
    }

    public void startInstaller() {
        this.installStarted = true;
        this.lastEvent = aj.CANCELLED;
        ak a2 = z.f53484a.a((Context) this);
        ai aiVar = new ai(this);
        if (a2.f53418e == null) {
            a2.f53417d = getPackageManager().getPackageInstaller();
            a2.f53418e = new ao(a2, aiVar);
            a2.f53417d.registerSessionCallback(a2.f53418e);
        }
        if (a2.f53415b == null) {
            a2.f53415b = new b(aiVar);
            a2.f53416c = this;
            ak.a(a2.f53416c, a2.f53415b, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
        }
        try {
            a2.a(new e(a2, this, aiVar));
        } catch (f unused) {
            ak.a(this, aiVar);
        }
    }

    public void finishWithFailure(Exception exc) {
        z.f53484a.f53485b = exc;
        z.f53484a.a();
        this.finished = true;
        super.finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }

    public static void com_google_ar_core_InstallActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(InstallActivity installActivity) {
        installActivity.InstallActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                installActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(InstallActivity installActivity) {
        com_google_ar_core_InstallActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(installActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                installActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                finishWithFailure(new FatalException("Install activity was suspended and recreated."));
            } catch (RuntimeException e2) {
                finishWithFailure(new FatalException("Exception starting install flow", e2));
            }
        } else {
            this.messageType = (ArCoreApk.UserMessageType) getIntent().getSerializableExtra("message");
            ArCoreApk.InstallBehavior installBehavior2 = (ArCoreApk.InstallBehavior) getIntent().getSerializableExtra("behavior");
            this.installBehavior = installBehavior2;
            if (this.messageType == null || installBehavior2 == null) {
                com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_LogLancet_e("ARCore-InstallActivity", "missing intent data.");
                finishWithFailure(new FatalException("Install activity launched without config data."));
                return;
            }
            setTheme(16974394);
            getWindow().requestFeature(1);
            setFinishOnTouchOutside(isOptional());
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                showSpinner();
                return;
            }
            AtomicReference atomicReference = new AtomicReference(ArCoreApk.Availability.UNKNOWN_CHECKING);
            z.f53484a.a((Context) this).a(this, new ae(atomicReference));
            int ordinal = ((ArCoreApk.Availability) atomicReference.get()).ordinal();
            if (ordinal == 0) {
                com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w("ARCore-InstallActivity", "Preliminary compatibility check failed.");
            } else if (ordinal == 3) {
                finishWithFailure(new UnavailableDeviceNotCompatibleException());
                return;
            }
            showEducationDialog();
        }
    }

    public static void com_google_ar_core_InstallActivity_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(InstallActivity installActivity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, installActivity);
        installActivity.startActivity(intent);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        StringBuilder sb = new StringBuilder(27);
        sb.append("activityResult: ");
        sb.append(i3);
        com_google_ar_core_InstallActivity_com_ss_android_ugc_aweme_lancet_LogLancet_i("ARCore-InstallActivity", sb.toString());
    }
}
