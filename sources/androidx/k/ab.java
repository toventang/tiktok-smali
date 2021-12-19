package androidx.k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class ab implements ad {

    /* renamed from: a  reason: collision with root package name */
    public a f3222a;

    static {
        Covode.recordClassIndex(1167);
    }

    static class a extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        static Method f3223a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f3224b;

        /* renamed from: c  reason: collision with root package name */
        View f3225c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Drawable> f3226d;

        /* renamed from: e  reason: collision with root package name */
        ab f3227e;

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        static {
            Covode.recordClassIndex(1168);
            try {
                f3223a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public final void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public final void b(View view) {
            super.removeView(view);
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f3226d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f3224b.removeView(this);
                }
            }
        }

        /* access modifiers changed from: protected */
        public final boolean verifyDrawable(Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.f3226d;
            if (arrayList == null || !arrayList.contains(drawable)) {
                return false;
            }
            return true;
        }

        public final void a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f3224b || viewGroup.getParent() == null || !v.y(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f3224b.getLocationOnScreen(iArr2);
                    v.e(view, iArr[0] - iArr2[0]);
                    v.d(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: protected */
        public final void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f3224b.getLocationOnScreen(iArr);
            this.f3225c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f3225c.getWidth(), this.f3225c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f3226d;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f3226d.get(i2).draw(canvas);
                }
            }
        }

        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f3224b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            ViewGroup viewGroup = this.f3224b;
            if (viewGroup instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                int[] iArr3 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                this.f3225c.getLocationOnScreen(iArr3);
                int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
                rect.offset(iArr4[0], iArr4[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        a(Context context, ViewGroup viewGroup, View view, ab abVar) {
            super(context);
            this.f3224b = viewGroup;
            this.f3225c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f3227e = abVar;
        }
    }

    @Override // androidx.k.ad
    public final void b(Drawable drawable) {
        a aVar = this.f3222a;
        if (aVar.f3226d != null) {
            aVar.f3226d.remove(drawable);
            aVar.invalidate(drawable.getBounds());
            drawable.setCallback(null);
        }
    }

    @Override // androidx.k.ad
    public final void a(Drawable drawable) {
        a aVar = this.f3222a;
        if (aVar.f3226d == null) {
            aVar.f3226d = new ArrayList<>();
        }
        if (!aVar.f3226d.contains(drawable)) {
            aVar.f3226d.add(drawable);
            aVar.invalidate(drawable.getBounds());
            drawable.setCallback(aVar);
        }
    }

    static ab c(View view) {
        View view2 = view;
        while (view2 != null) {
            if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view2;
                if (viewGroup == null) {
                    return null;
                }
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof a) {
                        return ((a) childAt).f3227e;
                    }
                }
                return new v(viewGroup.getContext(), viewGroup, view);
            } else if (view2.getParent() instanceof ViewGroup) {
                view2 = (ViewGroup) view2.getParent();
            }
        }
        return null;
    }

    ab(Context context, ViewGroup viewGroup, View view) {
        this.f3222a = new a(context, viewGroup, view, this);
    }
}
