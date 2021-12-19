package i.a.a.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(105397);
    }

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static final void b(View view) {
        l.d(view, "");
        n.a(view, 4);
    }

    public static final void c(View view) {
        l.d(view, "");
        n.a(view, 0);
    }

    public static final void a(View view) {
        l.d(view, "");
        n.a(view, 8);
    }

    public static final float a(float f2) {
        Context e2 = y.e();
        l.b(e2, "");
        Context a2 = a(e2);
        l.b(a2, "");
        Resources resources = a2.getResources();
        l.b(resources, "");
        return (resources.getDisplayMetrics().density * f2) + 0.5f;
    }
}
