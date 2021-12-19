package com.ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(41305);
    }

    public static Activity a(Fragment fragment) {
        e activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    public static Application a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    public static ad a(Fragment fragment, ag agVar) {
        return new ad(agVar.getViewModelStore(), ad.a.a(a(a(fragment))));
    }

    public static ad a(e eVar, ag agVar, ad.b bVar) {
        a(eVar);
        return new ad(agVar.getViewModelStore(), bVar);
    }
}
