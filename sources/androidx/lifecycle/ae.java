package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;

public final class ae {
    static {
        Covode.recordClassIndex(1305);
    }

    public static ad a(e eVar) {
        return a(eVar, (ad.b) null);
    }

    private static Application a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    public static ad a(e eVar, ad.b bVar) {
        Application a2 = a((Activity) eVar);
        if (bVar == null) {
            bVar = ad.a.a(a2);
        }
        return new ad(eVar.getViewModelStore(), bVar);
    }

    public static ad a(Fragment fragment, ad.b bVar) {
        e activity = fragment.getActivity();
        if (activity != null) {
            Application a2 = a((Activity) activity);
            if (bVar == null) {
                bVar = ad.a.a(a2);
            }
            return new ad(fragment.getViewModelStore(), bVar);
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }
}
