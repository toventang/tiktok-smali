package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f1453a;

    /* renamed from: b  reason: collision with root package name */
    private int f1454b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f1455c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f1456d;

    /* renamed from: e  reason: collision with root package name */
    private a f1457e;

    public interface a {
        static {
            Covode.recordClassIndex(443);
        }
    }

    static {
        Covode.recordClassIndex(442);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public final int getInflatedId() {
        return this.f1454b;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.f1456d;
    }

    public final int getLayoutResource() {
        return this.f1453a;
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1453a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1456d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View a2 = com.a.a(layoutInflater, this.f1453a, viewGroup, false);
            int i2 = this.f1454b;
            if (i2 != -1) {
                a2.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(a2, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(a2, indexOfChild);
            }
            this.f1455c = new WeakReference<>(a2);
            return a2;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void setInflatedId(int i2) {
        this.f1454b = i2;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1456d = layoutInflater;
    }

    public final void setLayoutResource(int i2) {
        this.f1453a = i2;
    }

    public final void setOnInflateListener(a aVar) {
        this.f1457e = aVar;
    }

    public final void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f1455c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    private ViewStubCompat(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842960, 16842994, 16842995}, 0, 0);
        this.f1454b = obtainStyledAttributes.getResourceId(2, -1);
        this.f1453a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
