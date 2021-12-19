package androidx.k;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.bytedance.covode.number.Covode;

final class w implements x {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f3371a;

    static {
        Covode.recordClassIndex(1244);
    }

    @Override // androidx.k.ad
    public final void a(Drawable drawable) {
        this.f3371a.add(drawable);
    }

    @Override // androidx.k.ad
    public final void b(Drawable drawable) {
        this.f3371a.remove(drawable);
    }

    w(ViewGroup viewGroup) {
        this.f3371a = viewGroup.getOverlay();
    }

    @Override // androidx.k.x
    public final void a(View view) {
        this.f3371a.add(view);
    }

    @Override // androidx.k.x
    public final void b(View view) {
        this.f3371a.remove(view);
    }
}
