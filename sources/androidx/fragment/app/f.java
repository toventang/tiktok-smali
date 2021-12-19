package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class f {
    static {
        Covode.recordClassIndex(1042);
    }

    public abstract View a(int i2);

    public abstract boolean a();

    public Fragment a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
