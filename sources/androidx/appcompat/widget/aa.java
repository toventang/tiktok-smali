package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.s;
import androidx.core.h.v;
import androidx.core.widget.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;

public class aa implements s {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1469a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f1470b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f1471c;
    private boolean A;
    private boolean B;
    private boolean C;
    private View D;
    private DataSetObserver E;
    private final d F;
    private final c G;
    private final a H;
    private Runnable I;
    private final Rect J;

    /* renamed from: d  reason: collision with root package name */
    private Context f1472d;

    /* renamed from: e  reason: collision with root package name */
    public x f1473e;

    /* renamed from: f  reason: collision with root package name */
    public int f1474f;

    /* renamed from: g  reason: collision with root package name */
    public int f1475g;

    /* renamed from: h  reason: collision with root package name */
    public int f1476h;

    /* renamed from: i  reason: collision with root package name */
    public int f1477i;

    /* renamed from: j  reason: collision with root package name */
    public int f1478j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1479k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1480l;

    /* renamed from: m  reason: collision with root package name */
    public int f1481m;
    public int n;
    public View o;
    public Drawable p;
    public AdapterView.OnItemClickListener q;
    public AdapterView.OnItemSelectedListener r;
    final e s;
    final Handler t;
    public Rect u;
    public boolean v;
    public PopupWindow w;
    private ListAdapter x;
    private int y;
    private boolean z;

    @Override // androidx.appcompat.view.menu.s
    public final ListView g() {
        return this.f1473e;
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        static {
            Covode.recordClassIndex(450);
        }

        public final void run() {
            aa.this.i();
        }

        a() {
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends DataSetObserver {
        static {
            Covode.recordClassIndex(451);
        }

        public final void onInvalidated() {
            aa.this.d();
        }

        public final void onChanged() {
            if (aa.this.w.isShowing()) {
                aa.this.c();
            }
        }

        b() {
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public final boolean e() {
        return this.w.isShowing();
    }

    public final void h() {
        this.w.setInputMethodMode(2);
    }

    public final void k() {
        this.C = true;
        this.B = true;
    }

    public final void b() {
        this.v = true;
        this.w.setFocusable(true);
    }

    public final int f() {
        if (!this.z) {
            return 0;
        }
        return this.y;
    }

    public final void i() {
        x xVar = this.f1473e;
        if (xVar != null) {
            xVar.setListSelectionHidden(true);
            xVar.requestLayout();
        }
    }

    public final boolean j() {
        if (this.w.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    private void a() {
        View view = this.D;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.D);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public final void d() {
        this.w.dismiss();
        a();
        this.w.setContentView(null);
        this.f1473e = null;
        this.t.removeCallbacks(this.s);
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {
        static {
            Covode.recordClassIndex(454);
        }

        public final void run() {
            if (aa.this.f1473e != null && v.y(aa.this.f1473e) && aa.this.f1473e.getCount() > aa.this.f1473e.getChildCount() && aa.this.f1473e.getChildCount() <= aa.this.f1481m) {
                aa.this.w.setInputMethodMode(2);
                aa.this.c();
            }
        }

        e() {
        }
    }

    static {
        Covode.recordClassIndex(446);
        try {
            f1469a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            f1470b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            f1471c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.s
    public void c() {
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int makeMeasureSpec;
        int i7;
        boolean z4 = true;
        if (this.f1473e == null) {
            Context context = this.f1472d;
            this.I = new Runnable() {
                /* class androidx.appcompat.widget.aa.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(448);
                }

                public final void run() {
                    View view = aa.this.o;
                    if (view != null && view.getWindowToken() != null) {
                        aa.this.c();
                    }
                }
            };
            x a2 = a(context, !this.v);
            this.f1473e = a2;
            Drawable drawable = this.p;
            if (drawable != null) {
                a2.setSelector(drawable);
            }
            this.f1473e.setAdapter(this.x);
            this.f1473e.setOnItemClickListener(this.q);
            this.f1473e.setFocusable(true);
            this.f1473e.setFocusableInTouchMode(true);
            this.f1473e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                /* class androidx.appcompat.widget.aa.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(449);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
                    x xVar;
                    if (i2 != -1 && (xVar = aa.this.f1473e) != null) {
                        xVar.setListSelectionHidden(false);
                    }
                }
            });
            this.f1473e.setOnScrollListener(this.G);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.r;
            if (onItemSelectedListener != null) {
                this.f1473e.setOnItemSelectedListener(onItemSelectedListener);
            }
            x xVar = this.f1473e;
            View view = this.D;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i8 = this.n;
                if (i8 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(xVar, layoutParams);
                } else if (i8 == 1) {
                    linearLayout.addView(xVar, layoutParams);
                    linearLayout.addView(view);
                }
                int i9 = this.f1475g;
                if (i9 >= 0) {
                    i7 = Integer.MIN_VALUE;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, i7), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i2 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                xVar = linearLayout;
            } else {
                i2 = 0;
            }
            this.w.setContentView(xVar);
        } else {
            this.w.getContentView();
            View view2 = this.D;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.w.getBackground();
        if (background != null) {
            background.getPadding(this.J);
            i3 = this.J.top + this.J.bottom;
            if (!this.z) {
                this.y = -this.J.top;
            }
        } else {
            this.J.setEmpty();
            i3 = 0;
        }
        if (this.w.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int a3 = a(this.o, this.y, z2);
        if (this.f1479k || this.f1474f == -1) {
            i4 = a3 + i3;
        } else {
            int i10 = this.f1475g;
            if (i10 == -2) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1472d.getResources().getDisplayMetrics().widthPixels - (this.J.left + this.J.right), Integer.MIN_VALUE);
            } else if (i10 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1472d.getResources().getDisplayMetrics().widthPixels - (this.J.left + this.J.right), 1073741824);
            }
            int a4 = this.f1473e.a(makeMeasureSpec, 0, -1, a3 - i2, -1);
            if (a4 > 0) {
                i2 += i3 + this.f1473e.getPaddingTop() + this.f1473e.getPaddingBottom();
            }
            i4 = a4 + i2;
        }
        boolean j2 = j();
        g.a(this.w, this.f1477i);
        if (!this.w.isShowing()) {
            int i11 = this.f1475g;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.o.getWidth();
            }
            int i12 = this.f1474f;
            if (i12 == -1) {
                i4 = -1;
            } else if (i12 != -2) {
                i4 = i12;
            }
            this.w.setWidth(i11);
            this.w.setHeight(i4);
            Method method = f1469a;
            if (method != null) {
                try {
                    method.invoke(this.w, true);
                } catch (Exception unused) {
                }
            }
            PopupWindow popupWindow = this.w;
            if (this.f1480l || this.f1479k) {
                z3 = false;
            } else {
                z3 = true;
            }
            popupWindow.setOutsideTouchable(z3);
            this.w.setTouchInterceptor(this.F);
            if (this.C) {
                g.a(this.w, this.B);
            }
            Method method2 = f1471c;
            if (method2 != null) {
                try {
                    method2.invoke(this.w, this.u);
                } catch (Exception unused2) {
                }
            }
            g.a(this.w, this.o, this.f1476h, this.y, this.f1478j);
            this.f1473e.setSelection(-1);
            if (!this.v || this.f1473e.isInTouchMode()) {
                i();
            }
            if (!this.v) {
                this.t.post(this.H);
            }
        } else if (v.y(this.o)) {
            int i13 = this.f1475g;
            if (i13 == -1) {
                i13 = -1;
            } else if (i13 == -2) {
                i13 = this.o.getWidth();
            }
            int i14 = this.f1474f;
            if (i14 == -1) {
                if (j2) {
                    PopupWindow popupWindow2 = this.w;
                    if (this.f1475g == -1) {
                        i6 = -1;
                    } else {
                        i6 = 0;
                    }
                    popupWindow2.setWidth(i6);
                    this.w.setHeight(0);
                } else {
                    i4 = -1;
                    PopupWindow popupWindow3 = this.w;
                    if (this.f1475g == -1) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                    popupWindow3.setWidth(i5);
                    this.w.setHeight(-1);
                }
            } else if (i14 != -2) {
                i4 = i14;
            }
            PopupWindow popupWindow4 = this.w;
            if (this.f1480l || this.f1479k) {
                z4 = false;
            }
            popupWindow4.setOutsideTouchable(z4);
            PopupWindow popupWindow5 = this.w;
            View view3 = this.o;
            int i15 = this.f1476h;
            int i16 = this.y;
            if (i13 < 0) {
                i13 = -1;
            }
            if (i4 < 0) {
                i4 = -1;
            }
            popupWindow5.update(view3, i15, i16, i13, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements AbsListView.OnScrollListener {
        static {
            Covode.recordClassIndex(452);
        }

        public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        c() {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1 && !aa.this.j() && aa.this.w.getContentView() != null) {
                aa.this.t.removeCallbacks(aa.this.s);
                aa.this.s.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements View.OnTouchListener {
        static {
            Covode.recordClassIndex(453);
        }

        d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                if (aa.this.w == null || !aa.this.w.isShowing() || x < 0 || x >= aa.this.w.getWidth() || y < 0 || y >= aa.this.w.getHeight()) {
                    return false;
                }
                aa.this.t.postDelayed(aa.this.s, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                aa.this.t.removeCallbacks(aa.this.s);
                return false;
            }
        }
    }

    public aa(Context context) {
        this(context, null, R.attr.a2t);
    }

    public final void a(int i2) {
        this.y = i2;
        this.z = true;
    }

    public final void b(int i2) {
        Drawable background = this.w.getBackground();
        if (background != null) {
            background.getPadding(this.J);
            this.f1475g = this.J.left + this.J.right + i2;
            return;
        }
        this.f1475g = i2;
    }

    public final void c(int i2) {
        x xVar = this.f1473e;
        if (this.w.isShowing() && xVar != null) {
            xVar.setListSelectionHidden(false);
            xVar.setSelection(i2);
            if (xVar.getChoiceMode() != 0) {
                xVar.setItemChecked(i2, true);
            }
        }
    }

    public final void a(Drawable drawable) {
        this.w.setBackgroundDrawable(drawable);
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.E;
        if (dataSetObserver == null) {
            this.E = new b();
        } else {
            ListAdapter listAdapter2 = this.x;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
        x xVar = this.f1473e;
        if (xVar != null) {
            xVar.setAdapter(this.x);
        }
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.w.setOnDismissListener(onDismissListener);
    }

    /* access modifiers changed from: package-private */
    public x a(Context context, boolean z2) {
        return new x(context, z2);
    }

    public aa(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    private int a(View view, int i2, boolean z2) {
        Method method = f1470b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.w, view, Integer.valueOf(i2), Boolean.valueOf(z2))).intValue();
            } catch (Exception unused) {
            }
        }
        return this.w.getMaxAvailableHeight(view, i2);
    }

    public aa(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1474f = -2;
        this.f1475g = -2;
        this.f1477i = 1002;
        this.A = true;
        this.f1481m = Integer.MAX_VALUE;
        this.s = new e();
        this.F = new d();
        this.G = new c();
        this.H = new a();
        this.J = new Rect();
        this.f1472d = context;
        this.t = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843436, 16843437}, i2, i3);
        this.f1476h = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.z = true;
        }
        obtainStyledAttributes.recycle();
        l lVar = new l(context, attributeSet, i2, i3);
        this.w = lVar;
        lVar.setInputMethodMode(1);
    }
}
