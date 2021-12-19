package androidx.k;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import com.bytedance.covode.number.Covode;

final class ac implements ad {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f3228a;

    static {
        Covode.recordClassIndex(1169);
    }

    @Override // androidx.k.ad
    public final void a(Drawable drawable) {
        this.f3228a.add(drawable);
    }

    @Override // androidx.k.ad
    public final void b(Drawable drawable) {
        this.f3228a.remove(drawable);
    }

    ac(View view) {
        this.f3228a = view.getOverlay();
    }
}
