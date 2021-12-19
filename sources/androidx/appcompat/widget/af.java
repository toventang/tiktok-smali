package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class af extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: i  reason: collision with root package name */
    private static final Interpolator f1505i = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    Runnable f1506a;

    /* renamed from: b  reason: collision with root package name */
    LinearLayoutCompat f1507b;

    /* renamed from: c  reason: collision with root package name */
    int f1508c;

    /* renamed from: d  reason: collision with root package name */
    int f1509d;

    /* renamed from: e  reason: collision with root package name */
    int f1510e;

    /* renamed from: f  reason: collision with root package name */
    private Spinner f1511f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1512g;

    /* renamed from: h  reason: collision with root package name */
    private int f1513h;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    class a extends BaseAdapter {
        static {
            Covode.recordClassIndex(462);
        }

        public final long getItemId(int i2) {
            return (long) i2;
        }

        public final int getCount() {
            return af.this.f1507b.getChildCount();
        }

        a() {
        }

        public final Object getItem(int i2) {
            return ((b) af.this.f1507b.getChildAt(i2)).f1517a;
        }

        public final View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                af afVar = af.this;
                b bVar = new b(afVar.getContext(), (a.b) getItem(i2));
                bVar.setBackgroundDrawable(null);
                bVar.setLayoutParams(new AbsListView.LayoutParams(-1, afVar.f1510e));
                return bVar;
            }
            b bVar2 = (b) view;
            bVar2.f1517a = (a.b) getItem(i2);
            bVar2.a();
            return view;
        }
    }

    static {
        Covode.recordClassIndex(460);
    }

    private boolean a() {
        Spinner spinner = this.f1511f;
        if (spinner == null || spinner.getParent() != this) {
            return false;
        }
        return true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1506a;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1506a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    private boolean b() {
        if (!a()) {
            return false;
        }
        removeView(this.f1511f);
        addView(this.f1507b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1511f.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: package-private */
    public class b extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        a.b f1517a;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f1519c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f1520d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f1521e;

        /* renamed from: f  reason: collision with root package name */
        private View f1522f;

        static {
            Covode.recordClassIndex(463);
        }

        public final void a() {
            a.b bVar = this.f1517a;
            View c2 = bVar.c();
            CharSequence charSequence = null;
            if (c2 != null) {
                ViewParent parent = c2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c2);
                    }
                    addView(c2);
                }
                this.f1522f = c2;
                TextView textView = this.f1520d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1521e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1521e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1522f;
            if (view != null) {
                removeView(view);
                this.f1522f = null;
            }
            Drawable a2 = bVar.a();
            CharSequence b2 = bVar.b();
            if (a2 != null) {
                if (this.f1521e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1521e = appCompatImageView;
                }
                this.f1521e.setImageDrawable(a2);
                this.f1521e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1521e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1521e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(b2);
            if (z) {
                if (this.f1520d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.h5);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1520d = appCompatTextView;
                }
                this.f1520d.setText(b2);
                this.f1520d.setVisibility(0);
            } else {
                TextView textView2 = this.f1520d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1520d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1521e;
            if (imageView3 != null) {
                imageView3.setContentDescription(bVar.d());
            }
            if (!z) {
                charSequence = bVar.d();
            }
            an.a(this, charSequence);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.b.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.b.class.getName());
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public final void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (af.this.f1508c > 0 && getMeasuredWidth() > af.this.f1508c) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(af.this.f1508c, 1073741824), i3);
            }
        }

        public b(Context context, a.b bVar) {
            super(context, null, R.attr.h4);
            int[] iArr = {16842964};
            this.f1519c = iArr;
            this.f1517a = bVar;
            al a2 = al.a(context, null, iArr, R.attr.h4, 0);
            if (a2.f(0)) {
                setBackgroundDrawable(a2.a(0));
            }
            a2.f1549a.recycle();
            setGravity(8388627);
            a();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.f1512g = z;
    }

    public void setContentHeight(int i2) {
        this.f1510e = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        boolean z;
        this.f1513h = i2;
        int childCount = this.f1507b.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f1507b.getChildAt(i3);
            if (i3 == i2) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.f1507b.getChildAt(i2);
                Runnable runnable = this.f1506a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                AnonymousClass1 r0 = new Runnable() {
                    /* class androidx.appcompat.widget.af.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(461);
                    }

                    public final void run() {
                        af.this.smoothScrollTo(childAt2.getLeft() - ((af.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        af.this.f1506a = null;
                    }
                };
                this.f1506a = r0;
                post(r0);
            }
        }
        Spinner spinner = this.f1511f;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a a2 = androidx.appcompat.view.a.a(getContext());
        TypedArray obtainStyledAttributes = a2.f1063a.obtainStyledAttributes(null, new int[]{R.attr.jc, R.attr.jf, R.attr.jg, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.pp, R.attr.pq, R.attr.qt, R.attr.rg, R.attr.ri, R.attr.sh, R.attr.vb, R.attr.vi, R.attr.vs, R.attr.vt, R.attr.vw, R.attr.wo, R.attr.y3, R.attr.a3r, R.attr.a69, R.attr.a7l, R.attr.a7x, R.attr.a7y, R.attr.afx, R.attr.ag0, R.attr.aiy, R.attr.aja}, R.attr.h2, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = a2.f1063a.getResources();
        if (!a2.b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.f159943m));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f1509d = a2.f1063a.getResources().getDimensionPixelSize(R.dimen.n);
    }

    public void onMeasure(int i2, int i3) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f1507b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1508c = -1;
        } else {
            if (childCount > 2) {
                this.f1508c = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.f1508c = View.MeasureSpec.getSize(i2) / 2;
            }
            this.f1508c = Math.min(this.f1508c, this.f1509d);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1510e, 1073741824);
        if (z || !this.f1512g) {
            b();
        } else {
            this.f1507b.measure(0, makeMeasureSpec);
            if (this.f1507b.getMeasuredWidth() <= View.MeasureSpec.getSize(i2)) {
                b();
            } else if (!a()) {
                if (this.f1511f == null) {
                    r rVar = new r(getContext(), null, R.attr.h9);
                    rVar.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
                    rVar.setOnItemSelectedListener(this);
                    this.f1511f = rVar;
                }
                removeView(this.f1507b);
                addView(this.f1511f, new ViewGroup.LayoutParams(-2, -1));
                if (this.f1511f.getAdapter() == null) {
                    this.f1511f.setAdapter((SpinnerAdapter) new a());
                }
                Runnable runnable = this.f1506a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                    this.f1506a = null;
                }
                this.f1511f.setSelection(this.f1513h);
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1513h);
        }
    }
}
