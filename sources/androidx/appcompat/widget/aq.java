package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class aq extends Resources {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1590a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1591b;

    static {
        Covode.recordClassIndex(479);
    }

    public static boolean a() {
        if (!f1590a || Build.VERSION.SDK_INT > 20) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Drawable a(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i2) {
        Context context = this.f1591b.get();
        if (context != null) {
            return h.a().a(context, this, i2);
        }
        return super.getDrawable(i2);
    }

    public aq(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1591b = new WeakReference<>(context);
    }
}
