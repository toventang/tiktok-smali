package com.ss.android.ugc.aweme.login;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.e;
import com.ss.android.ugc.aweme.base.component.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static e f109021a;

    static {
        Covode.recordClassIndex(69812);
    }

    public static void a(Activity activity, String str, String str2) {
        a(activity, str, str2, (Bundle) null, (f) null);
    }

    public static void a(Fragment fragment, String str, String str2) {
        a(fragment, str, str2, (Bundle) null, (f) null);
    }

    public static void a(Activity activity, String str, String str2, Bundle bundle) {
        a(activity, str, str2, bundle, (f) null);
    }

    public static void a(Activity activity, String str, String str2, f fVar) {
        a(activity, str, str2, (Bundle) null, fVar);
    }

    public static void a(Fragment fragment, String str, String str2, Bundle bundle) {
        a(fragment, str, str2, bundle, (f) null);
    }

    public static void a(Fragment fragment, String str, String str2, f fVar) {
        a(fragment, str, str2, (Bundle) null, fVar);
    }

    public static void a(Activity activity, String str, String str2, Bundle bundle, f fVar) {
        if (f109021a == null) {
            throw new RuntimeException("ILoginActivityComponent stub can't be null");
        } else if (activity != null && !activity.isFinishing()) {
            f109021a.a(activity, str, str2, bundle, fVar);
        }
    }

    public static void a(Fragment fragment, String str, String str2, Bundle bundle, f fVar) {
        if (f109021a == null) {
            throw new RuntimeException("ILoginActivityComponent stub can't be null");
        } else if (fragment != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            f109021a.a(fragment, str, str2, bundle, fVar);
        }
    }
}
