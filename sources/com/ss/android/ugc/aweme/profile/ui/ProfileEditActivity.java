package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.zhiliaoapp.musically.R;
import dagger.a;

public class ProfileEditActivity extends ai {

    /* renamed from: a  reason: collision with root package name */
    public a<az> f116790a;

    static {
        Covode.recordClassIndex(75431);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        this.f116790a.get().l();
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

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (r11.getY() < ((float) r5)) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r1.hideSoftInputFromWindow(r3.getWindowToken(), 2) == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.profile.ui.ai, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.f159928l;
        activityConfiguration(new bg(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.mc);
        n a2 = getSupportFragmentManager().a();
        if (!this.f116790a.get().n) {
            az azVar = this.f116790a.get();
            Bundle bundle2 = new Bundle();
            if (getIntent() != null) {
                bundle2.putInt("jump_school_edit", getIntent().getIntExtra("jump_school_edit", 0));
                if (TextUtils.equals(a(getIntent(), "enter_from"), "message")) {
                    bundle2.putInt("need_focus_id_input", 3);
                } else {
                    bundle2.putInt("need_focus_id_input", getIntent().getIntExtra("need_focus_id_input", 0));
                }
                bundle2.putInt("need_focus_id_input", getIntent().getIntExtra("need_focus_id_input", 0));
                bundle2.putString("enter_from", a(getIntent(), "enter_from"));
                bundle2.putString("enter_method", a(getIntent(), "enter_method"));
                bundle2.putBoolean("change_to_ba", getIntent().getBooleanExtra("change_to_ba", false));
                getIntent();
            }
            azVar.setArguments(bundle2);
            a2.b(R.id.b94, this.f116790a.get(), "user_profile_edit_fragment").b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    public static void a(Activity activity, Bundle bundle) {
        if (activity != null) {
            if (bundle == null) {
                a(activity, new Intent(activity, ProfileEditActivity.class));
                return;
            }
            Intent intent = new Intent(activity, ProfileEditActivity.class);
            intent.putExtras(bundle);
            a(activity, intent);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.f116790a.get().onActivityResult(i2, i3, intent);
    }
}
