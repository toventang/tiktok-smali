package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;

public class Group extends a {
    static {
        Covode.recordClassIndex(618);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void b() {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.al.c(0);
        aVar.al.d(0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.a
    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.f2066f = false;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void a(ConstraintLayout constraintLayout) {
        float f2;
        int visibility = getVisibility();
        if (Build.VERSION.SDK_INT >= 21) {
            f2 = getElevation();
        } else {
            f2 = 0.0f;
        }
        for (int i2 = 0; i2 < this.f2063c; i2++) {
            View a2 = constraintLayout.a(this.f2062b[i2]);
            if (a2 != null) {
                a2.setVisibility(visibility);
                if (f2 > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    a2.setElevation(f2);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
