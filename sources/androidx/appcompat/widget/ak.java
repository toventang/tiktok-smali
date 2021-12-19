package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class ak extends ad {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f1548a;

    static {
        Covode.recordClassIndex(469);
    }

    @Override // androidx.appcompat.widget.ad, android.content.res.Resources
    public final Drawable getDrawable(int i2) {
        Drawable drawable = super.getDrawable(i2);
        Context context = this.f1548a.get();
        if (!(drawable == null || context == null)) {
            h.a();
            h.a(context, i2, drawable);
        }
        return drawable;
    }

    public ak(Context context, Resources resources) {
        super(resources);
        this.f1548a = new WeakReference<>(context);
    }
}
