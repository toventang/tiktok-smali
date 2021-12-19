package com.kakao.auth.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;

public class StartActivityWrapper {
    private Activity activity;
    private Fragment fragment;

    static {
        Covode.recordClassIndex(34322);
    }

    public Activity getActivity() {
        return this.activity;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    public Context getContext() {
        Activity activity2 = this.activity;
        if (activity2 != null) {
            return activity2;
        }
        Fragment fragment2 = this.fragment;
        if (fragment2 != null) {
            return fragment2.getActivity();
        }
        throw new IllegalStateException("StartActivityWrapper does not contain any activity or fragment.");
    }

    public StartActivityWrapper(Activity activity2) {
        this.activity = activity2;
    }

    public StartActivityWrapper(Fragment fragment2) {
        this.fragment = fragment2;
    }

    public void startActivity(Intent intent) {
        Activity activity2 = this.activity;
        if (activity2 != null) {
            com_kakao_auth_helper_StartActivityWrapper_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(activity2, intent);
            return;
        }
        Fragment fragment2 = this.fragment;
        if (fragment2 != null) {
            fragment2.startActivity(intent);
            return;
        }
        throw new IllegalStateException("StartActivityWrapper does not contain any activity or fragment.");
    }

    public static void com_kakao_auth_helper_StartActivityWrapper_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Activity activity2, Intent intent) {
        a.a(intent, activity2);
        activity2.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i2) {
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.startActivityForResult(intent, i2);
            return;
        }
        Fragment fragment2 = this.fragment;
        if (fragment2 != null) {
            fragment2.startActivityForResult(intent, i2);
            return;
        }
        throw new IllegalStateException("StartActivityWrapper does not contain any activity or fragment.");
    }
}
