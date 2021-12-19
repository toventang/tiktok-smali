package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class l extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f1650a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1651b;

    static {
        boolean z;
        Covode.recordClassIndex(502);
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f1650a = z;
    }

    public final void showAsDropDown(View view, int i2, int i3) {
        if (f1650a && this.f1651b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    public l(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        al a2 = al.a(context, attributeSet, new int[]{16843126, 16843465, R.attr.a6n}, i2, i3);
        if (a2.f(2)) {
            boolean a3 = a2.a(2, false);
            if (f1650a) {
                this.f1651b = a3;
            } else {
                g.a(this, a3);
            }
        }
        setBackgroundDrawable(a2.a(0));
        a2.f1549a.recycle();
    }

    public final void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f1650a && this.f1651b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i2, int i3, int i4, int i5) {
        int i6 = i3;
        if (f1650a && this.f1651b) {
            i6 -= view.getHeight();
        }
        super.update(view, i2, i6, i4, i5);
    }
}
