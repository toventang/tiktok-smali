package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.a.a.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

public abstract class a extends View {

    /* renamed from: a  reason: collision with root package name */
    private String f2061a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f2062b;

    /* renamed from: c  reason: collision with root package name */
    protected int f2063c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f2064d;

    /* renamed from: e  reason: collision with root package name */
    protected j f2065e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f2066f;

    static {
        Covode.recordClassIndex(622);
    }

    public void b() {
    }

    public void onDraw(Canvas canvas) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2062b, this.f2063c);
    }

    public final void a() {
        if (this.f2065e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).al = this.f2065e;
            }
        }
    }

    public a(Context context) {
        super(context);
        this.f2062b = new int[32];
        this.f2064d = context;
        a((AttributeSet) null);
    }

    public void setReferencedIds(int[] iArr) {
        this.f2063c = 0;
        for (int i2 : iArr) {
            setTag(i2, null);
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i2 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    a(str.substring(i2));
                    return;
                } else {
                    a(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f2061a);
        }
        j jVar = this.f2065e;
        if (jVar != null) {
            jVar.z();
            for (int i2 = 0; i2 < this.f2063c; i2++) {
                View a2 = constraintLayout.a(this.f2062b[i2]);
                if (a2 != null) {
                    this.f2065e.a(constraintLayout.a(a2));
                }
            }
        }
    }

    private void a(String str) {
        Object a2;
        if (str != null && this.f2064d != null) {
            String trim = str.trim();
            int i2 = 0;
            try {
                i2 = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
            if (i2 != 0 || (i2 = this.f2064d.getResources().getIdentifier(trim, "id", this.f2064d.getPackageName())) != 0 || (isInEditMode() && (getParent() instanceof ConstraintLayout) && (a2 = ((ConstraintLayout) getParent()).a(trim)) != null && (a2 instanceof Integer) && (i2 = ((Integer) a2).intValue()) != 0)) {
                setTag(i2, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.js, R.attr.jt, R.attr.mn, R.attr.ph, R.attr.pi, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0q, R.attr.a0r, R.attr.a0y, R.attr.a0z, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a17, R.attr.a18, R.attr.a1h});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 9) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2061a = string;
                    setIds(string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f2066f) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2062b = new int[32];
        this.f2064d = context;
        a(attributeSet);
    }

    public void setTag(int i2, Object obj) {
        int i3 = this.f2063c + 1;
        int[] iArr = this.f2062b;
        if (i3 > iArr.length) {
            this.f2062b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2062b;
        int i4 = this.f2063c;
        iArr2[i4] = i2;
        this.f2063c = i4 + 1;
    }
}
