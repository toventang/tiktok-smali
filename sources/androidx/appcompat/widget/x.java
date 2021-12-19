package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.b.a.c;
import androidx.core.h.z;
import androidx.core.widget.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public class x extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1714a;

    /* renamed from: b  reason: collision with root package name */
    b f1715b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f1716c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private int f1717d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f1718e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1719f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f1720g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f1721h;

    /* renamed from: i  reason: collision with root package name */
    private Field f1722i;

    /* renamed from: j  reason: collision with root package name */
    private a f1723j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1724k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1725l;

    /* renamed from: m  reason: collision with root package name */
    private z f1726m;
    private f n;

    static {
        Covode.recordClassIndex(521);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1715b = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        static {
            Covode.recordClassIndex(523);
        }

        public final void run() {
            x.this.f1715b = null;
            x.this.drawableStateChanged();
        }

        b() {
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1715b == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            a();
        }
    }

    public boolean hasFocus() {
        if (this.f1725l || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.f1725l || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public boolean isFocused() {
        if (this.f1725l || super.isFocused()) {
            return true;
        }
        return false;
    }

    private void a() {
        Drawable selector = getSelector();
        if (selector != null && this.f1714a && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public boolean isInTouchMode() {
        if ((!this.f1725l || !this.f1724k) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1724k = z;
    }

    /* access modifiers changed from: package-private */
    public static class a extends c {

        /* renamed from: b  reason: collision with root package name */
        public boolean f1727b = true;

        static {
            Covode.recordClassIndex(522);
        }

        a(Drawable drawable) {
            super(drawable);
        }

        @Override // androidx.appcompat.b.a.c
        public final void draw(Canvas canvas) {
            if (this.f1727b) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.b.a.c
        public final boolean setState(int[] iArr) {
            if (this.f1727b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.b.a.c
        public final void setHotspot(float f2, float f3) {
            if (this.f1727b) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // androidx.appcompat.b.a.c
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f1727b) {
                return super.setVisible(z, z2);
            }
            return false;
        }

        @Override // androidx.appcompat.b.a.c
        public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f1727b) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f1723j;
        if (aVar != null) {
            aVar.f1727b = z;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1716c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1716c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1721h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1715b;
        if (bVar != null) {
            x.this.f1715b = null;
            x.this.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar;
        if (drawable != null) {
            aVar = new a(drawable);
        } else {
            aVar = null;
        }
        this.f1723j = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1717d = rect.left;
        this.f1718e = rect.top;
        this.f1719f = rect.right;
        this.f1720g = rect.bottom;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1715b == null) {
            b bVar = new b();
            this.f1715b = bVar;
            x.this.post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    x(Context context, boolean z) {
        super(context, null, R.attr.s3);
        this.f1725l = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1722i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (1 == 0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r10 != 3) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MotionEvent r17, int r18) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.a(android.view.MotionEvent, int):boolean");
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, makeMeasureSpec);
            view.forceLayout();
            if (i10 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 < i5) {
                if (i6 >= 0 && i10 >= i6) {
                    i9 = i7;
                }
            } else if (i6 < 0 || i10 <= i6 || i9 <= 0 || i7 == i5) {
                return i5;
            } else {
                return i9;
            }
        }
        return i7;
    }
}
