package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.a.a.a;
import androidx.core.a.a.b;
import com.bytedance.covode.number.Covode;

public final class q {
    static {
        Covode.recordClassIndex(359);
    }

    public static Menu a(Context context, a aVar) {
        return new r(context, aVar);
    }

    public static MenuItem a(Context context, b bVar) {
        int i2 = Build.VERSION.SDK_INT;
        return new l(context, bVar);
    }
}
