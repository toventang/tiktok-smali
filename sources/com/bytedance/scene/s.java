package com.bytedance.scene;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;

public final class s {
    static {
        Covode.recordClassIndex(26373);
    }

    public static ad a(j jVar) {
        Activity activity = jVar.f42913m;
        if (activity != null) {
            Application application = activity.getApplication();
            if (application != null) {
                return new ad(jVar.getViewModelStore(), ad.a.a(application));
            }
            throw new IllegalStateException("Your activity is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        throw new IllegalStateException("Can't create ViewModelProvider for removed scene");
    }

    public static ad a(j jVar, ad.b bVar) {
        return new ad(jVar.getViewModelStore(), bVar);
    }
}
