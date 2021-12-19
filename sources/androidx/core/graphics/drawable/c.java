package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import com.bytedance.covode.number.Covode;

final class c extends b {
    static {
        Covode.recordClassIndex(788);
    }

    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.f2434f, this.f2433e);
    }

    protected c(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.core.graphics.drawable.b
    public final void a(int i2, int i3, int i4, Rect rect, Rect rect2) {
        Gravity.apply(i2, i3, i4, rect, rect2, 0);
    }
}
