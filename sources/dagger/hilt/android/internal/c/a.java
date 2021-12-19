package dagger.hilt.android.internal.c;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public abstract class a {
    static {
        Covode.recordClassIndex(104045);
    }

    static e a(Activity activity) {
        try {
            return (e) activity;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(activity)), e2);
        }
    }
}
