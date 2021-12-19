package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f1593a;

    static {
        Covode.recordClassIndex(482);
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i2) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public b(ActionBarContainer actionBarContainer) {
        this.f1593a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        if (!this.f1593a.f1281d) {
            if (this.f1593a.f1278a != null) {
                this.f1593a.f1278a.draw(canvas);
            }
            if (this.f1593a.f1279b != null && this.f1593a.f1282e) {
                this.f1593a.f1279b.draw(canvas);
            }
        } else if (this.f1593a.f1280c != null) {
            this.f1593a.f1280c.draw(canvas);
        }
    }

    public final void getOutline(Outline outline) {
        if (this.f1593a.f1281d) {
            if (this.f1593a.f1280c != null) {
                this.f1593a.f1280c.getOutline(outline);
            }
        } else if (this.f1593a.f1278a != null) {
            this.f1593a.f1278a.getOutline(outline);
        }
    }
}
