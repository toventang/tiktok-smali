package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

public final class ah {
    static {
        Covode.recordClassIndex(1308);
    }

    public static af a(Fragment fragment) {
        return fragment.getViewModelStore();
    }

    public static af a(e eVar) {
        return eVar.getViewModelStore();
    }
}
