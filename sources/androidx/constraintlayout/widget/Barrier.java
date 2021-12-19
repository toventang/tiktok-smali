package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import androidx.constraintlayout.a.a.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class Barrier extends a {

    /* renamed from: a  reason: collision with root package name */
    b f2028a;

    /* renamed from: g  reason: collision with root package name */
    private int f2029g;

    /* renamed from: h  reason: collision with root package name */
    private int f2030h;

    static {
        Covode.recordClassIndex(614);
    }

    public int getType() {
        return this.f2029g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2028a.f1895b = z;
    }

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setType(int i2) {
        this.f2029g = i2;
        this.f2030h = i2;
        int i3 = Build.VERSION.SDK_INT;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i4 = this.f2029g;
            if (i4 == 5) {
                this.f2030h = 1;
            } else if (i4 == 6) {
                this.f2030h = 0;
            }
        } else {
            int i5 = this.f2029g;
            if (i5 == 5) {
                this.f2030h = 0;
            } else if (i5 == 6) {
                this.f2030h = 1;
            }
        }
        this.f2028a.f1894a = this.f2030h;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.a
    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.f2028a = new b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.js, R.attr.jt, R.attr.mn, R.attr.ph, R.attr.pi, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0q, R.attr.a0r, R.attr.a0y, R.attr.a0z, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a17, R.attr.a18, R.attr.a1h});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 5) {
                    this.f2028a.f1895b = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f2065e = this.f2028a;
        a();
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
