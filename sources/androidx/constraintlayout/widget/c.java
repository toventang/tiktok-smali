package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    b f2083a;

    static {
        Covode.recordClassIndex(625);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public static class a extends ConstraintLayout.a {
        public float an = 1.0f;
        public boolean ao;
        public float ap;
        public float aq;
        public float ar;
        public float as;
        public float at = 1.0f;
        public float au = 1.0f;
        public float av;
        public float aw;
        public float ax;
        public float ay;
        public float az;

        static {
            Covode.recordClassIndex(626);
        }

        public a() {
            super(-2, -2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.js, R.attr.jt, R.attr.mn, R.attr.pi, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0q, R.attr.a0r, R.attr.a0y, R.attr.a0z, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a17, R.attr.a18});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 13) {
                    this.an = obtainStyledAttributes.getFloat(index, this.an);
                } else if (index == 26) {
                    this.ap = obtainStyledAttributes.getFloat(index, this.ap);
                    this.ao = true;
                } else if (index == 21) {
                    this.ar = obtainStyledAttributes.getFloat(index, this.ar);
                } else if (index == 22) {
                    this.as = obtainStyledAttributes.getFloat(index, this.as);
                } else if (index == 20) {
                    this.aq = obtainStyledAttributes.getFloat(index, this.aq);
                } else if (index == 18) {
                    this.at = obtainStyledAttributes.getFloat(index, this.at);
                } else if (index == 19) {
                    this.au = obtainStyledAttributes.getFloat(index, this.au);
                } else if (index == 14) {
                    this.av = obtainStyledAttributes.getFloat(index, this.av);
                } else if (index == 15) {
                    this.aw = obtainStyledAttributes.getFloat(index, this.aw);
                } else if (index == 16) {
                    this.ax = obtainStyledAttributes.getFloat(index, this.ax);
                } else if (index == 17) {
                    this.ay = obtainStyledAttributes.getFloat(index, this.ay);
                } else if (index == 25) {
                    this.ax = obtainStyledAttributes.getFloat(index, this.az);
                }
            }
        }
    }

    public final b getConstraintSet() {
        if (this.f2083a == null) {
            this.f2083a = new b();
        }
        b bVar = this.f2083a;
        int childCount = getChildCount();
        bVar.f2069b.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!bVar.f2069b.containsKey(Integer.valueOf(id))) {
                    bVar.f2069b.put(Integer.valueOf(id), new b.a((byte) 0));
                }
                b.a aVar2 = bVar.f2069b.get(Integer.valueOf(id));
                if (childAt instanceof a) {
                    a aVar3 = (a) childAt;
                    aVar2.a(id, aVar);
                    if (aVar3 instanceof Barrier) {
                        aVar2.at = 1;
                        Barrier barrier = (Barrier) aVar3;
                        aVar2.as = barrier.getType();
                        aVar2.au = barrier.getReferencedIds();
                    }
                }
                aVar2.a(id, aVar);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f2083a;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}
