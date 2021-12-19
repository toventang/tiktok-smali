package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.core.h.u;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class r extends Spinner implements u {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f1665d = {16843505};

    /* renamed from: a  reason: collision with root package name */
    b f1666a;

    /* renamed from: b  reason: collision with root package name */
    int f1667b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f1668c;

    /* renamed from: e  reason: collision with root package name */
    private final e f1669e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f1670f;

    /* renamed from: g  reason: collision with root package name */
    private z f1671g;

    /* renamed from: h  reason: collision with root package name */
    private SpinnerAdapter f1672h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f1673i;

    /* access modifiers changed from: package-private */
    public static class a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f1676a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f1677b;

        static {
            Covode.recordClassIndex(510);
        }

        public final int getItemViewType(int i2) {
            return 0;
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1677b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1676a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1676a;
            if (spinnerAdapter == null || !spinnerAdapter.hasStableIds()) {
                return false;
            }
            return true;
        }

        public final boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1676a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1676a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public final Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1676a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        public final long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1676a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i2);
        }

        public final boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f1677b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        public a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1676a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1677b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public final View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1676a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1669e;
        if (eVar != null) {
            eVar.d();
        }
    }

    public int getDropDownHorizontalOffset() {
        b bVar = this.f1666a;
        if (bVar != null) {
            return bVar.f1476h;
        }
        int i2 = Build.VERSION.SDK_INT;
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownWidth() {
        if (this.f1666a != null) {
            return this.f1667b;
        }
        int i2 = Build.VERSION.SDK_INT;
        return super.getDropDownWidth();
    }

    public CharSequence getPrompt() {
        b bVar = this.f1666a;
        if (bVar != null) {
            return bVar.f1678a;
        }
        return super.getPrompt();
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1669e;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1669e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(508);
    }

    public int getDropDownVerticalOffset() {
        b bVar = this.f1666a;
        if (bVar != null) {
            return bVar.f();
        }
        int i2 = Build.VERSION.SDK_INT;
        return super.getDropDownVerticalOffset();
    }

    public Drawable getPopupBackground() {
        b bVar = this.f1666a;
        if (bVar != null) {
            return bVar.w.getBackground();
        }
        int i2 = Build.VERSION.SDK_INT;
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        if (this.f1666a != null) {
            return this.f1670f;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f1666a;
        if (bVar != null && bVar.w.isShowing()) {
            this.f1666a.d();
        }
    }

    public boolean performClick() {
        b bVar = this.f1666a;
        if (bVar == null) {
            return super.performClick();
        }
        if (bVar.w.isShowing()) {
            return true;
        }
        this.f1666a.c();
        return true;
    }

    /* access modifiers changed from: package-private */
    public class b extends aa {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f1678a;

        /* renamed from: b  reason: collision with root package name */
        ListAdapter f1679b;

        /* renamed from: c  reason: collision with root package name */
        final Rect f1680c = new Rect();

        static {
            Covode.recordClassIndex(511);
        }

        @Override // androidx.appcompat.widget.aa, androidx.appcompat.view.menu.s
        public final void c() {
            ViewTreeObserver viewTreeObserver;
            boolean e2 = e();
            a();
            h();
            super.c();
            this.f1473e.setChoiceMode(1);
            c(r.this.getSelectedItemPosition());
            if (!e2 && (viewTreeObserver = r.this.getViewTreeObserver()) != null) {
                final AnonymousClass2 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    /* class androidx.appcompat.widget.r.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(513);
                    }

                    public final void onGlobalLayout() {
                        b bVar = b.this;
                        r rVar = r.this;
                        if (!v.y(rVar) || !rVar.getGlobalVisibleRect(bVar.f1680c)) {
                            b.this.d();
                            return;
                        }
                        b.this.a();
                        b.super.c();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r1);
                a(new PopupWindow.OnDismissListener() {
                    /* class androidx.appcompat.widget.r.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(514);
                    }

                    public final void onDismiss() {
                        ViewTreeObserver viewTreeObserver = r.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r1);
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            int i2;
            Drawable background = this.w.getBackground();
            int i3 = 0;
            if (background != null) {
                background.getPadding(r.this.f1668c);
                if (ar.a(r.this)) {
                    i3 = r.this.f1668c.right;
                } else {
                    i3 = -r.this.f1668c.left;
                }
            } else {
                Rect rect = r.this.f1668c;
                r.this.f1668c.right = 0;
                rect.left = 0;
            }
            int paddingLeft = r.this.getPaddingLeft();
            int paddingRight = r.this.getPaddingRight();
            int width = r.this.getWidth();
            if (r.this.f1667b == -2) {
                int a2 = r.this.a((SpinnerAdapter) this.f1679b, this.w.getBackground());
                int i4 = (r.this.getContext().getResources().getDisplayMetrics().widthPixels - r.this.f1668c.left) - r.this.f1668c.right;
                if (a2 > i4) {
                    a2 = i4;
                }
                b(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (r.this.f1667b == -1) {
                b((width - paddingLeft) - paddingRight);
            } else {
                b(r.this.f1667b);
            }
            if (ar.a(r.this)) {
                i2 = i3 + ((width - paddingRight) - this.f1475g);
            } else {
                i2 = i3 + paddingLeft;
            }
            this.f1476h = i2;
        }

        @Override // androidx.appcompat.widget.aa
        public final void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.f1679b = listAdapter;
        }

        public b(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.o = r.this;
            b();
            this.n = 0;
            this.q = new AdapterView.OnItemClickListener(r.this) {
                /* class androidx.appcompat.widget.r.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(512);
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                    r.this.setSelection(i2);
                    if (r.this.getOnItemClickListener() != null) {
                        r.this.performItemClick(view, i2, b.this.f1679b.getItemId(i2));
                    }
                    b.this.d();
                }
            };
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1669e;
        if (eVar != null) {
            eVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1669e;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1669e;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1669e;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        b bVar = this.f1666a;
        if (bVar != null) {
            bVar.f1476h = i2;
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        b bVar = this.f1666a;
        if (bVar != null) {
            bVar.a(i2);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        super.setDropDownVerticalOffset(i2);
    }

    public void setDropDownWidth(int i2) {
        if (this.f1666a != null) {
            this.f1667b = i2;
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        super.setDropDownWidth(i2);
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        b bVar = this.f1666a;
        if (bVar != null) {
            bVar.a(drawable);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setPopupBackgroundDrawable(drawable);
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(androidx.appcompat.a.a.a.b(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        b bVar = this.f1666a;
        if (bVar != null) {
            bVar.f1678a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        z zVar = this.f1671g;
        if (zVar == null || !zVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1673i) {
            this.f1672h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1666a != null) {
            Context context = this.f1670f;
            if (context == null) {
                context = getContext();
            }
            this.f1666a.a(new a(spinnerAdapter, context.getTheme()));
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ad3);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1666a != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f1668c);
        return i3 + this.f1668c.left + this.f1668c.right;
    }

    public r(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, (byte) 0);
    }

    private r(Context context, AttributeSet attributeSet, int i2, byte b2) {
        this(context, attributeSet, i2, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r2 == null) goto L_0x0058;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private r(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
