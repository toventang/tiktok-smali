package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.h;
import androidx.core.h.v;
import androidx.core.h.z;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class ActionBarContextView extends a {

    /* renamed from: g  reason: collision with root package name */
    public boolean f1288g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f1289h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f1290i;

    /* renamed from: j  reason: collision with root package name */
    private View f1291j;

    /* renamed from: k  reason: collision with root package name */
    private View f1292k;

    /* renamed from: l  reason: collision with root package name */
    private LinearLayout f1293l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f1294m;
    private TextView n;
    private int o;
    private int p;
    private int q;

    static {
        Covode.recordClassIndex(368);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CharSequence getSubtitle() {
        return this.f1290i;
    }

    public CharSequence getTitle() {
        return this.f1289h;
    }

    public final void b() {
        if (this.f1291j == null) {
            c();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // androidx.appcompat.widget.a
    public final boolean a() {
        if (this.f1461d != null) {
            return this.f1461d.e();
        }
        return false;
    }

    public final void c() {
        removeAllViews();
        this.f1292k = null;
        this.f1460c = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1461d != null) {
            this.f1461d.g();
            this.f1461d.i();
        }
    }

    private void d() {
        int i2;
        if (this.f1293l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.a2, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1293l = linearLayout;
            this.f1294m = (TextView) linearLayout.findViewById(R.id.c3);
            this.n = (TextView) this.f1293l.findViewById(R.id.c2);
            if (this.o != 0) {
                this.f1294m.setTextAppearance(getContext(), this.o);
            }
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
        }
        this.f1294m.setText(this.f1289h);
        this.n.setText(this.f1290i);
        boolean z = !TextUtils.isEmpty(this.f1289h);
        boolean z2 = !TextUtils.isEmpty(this.f1290i);
        TextView textView = this.n;
        int i3 = 0;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        LinearLayout linearLayout2 = this.f1293l;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.f1293l.getParent() == null) {
            addView(this.f1293l);
        }
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i2) {
        this.f1462e = i2;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1290i = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1289h = charSequence;
        d();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1288g) {
            requestLayout();
        }
        this.f1288g = z;
    }

    public void setCustomView(View view) {
        View view2 = this.f1292k;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1292k = view;
        if (view != null) {
            LinearLayout linearLayout = this.f1293l;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f1293l = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1289h);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public final void a(final b bVar) {
        View view = this.f1291j;
        if (view == null) {
            View a2 = a.a(LayoutInflater.from(getContext()), this.q, this, false);
            this.f1291j = a2;
            addView(a2);
        } else if (view.getParent() == null) {
            addView(this.f1291j);
        }
        this.f1291j.findViewById(R.id.cf).setOnClickListener(new View.OnClickListener() {
            /* class androidx.appcompat.widget.ActionBarContextView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(369);
            }

            public final void onClick(View view) {
                bVar.c();
            }
        });
        h hVar = (h) bVar.b();
        if (this.f1461d != null) {
            this.f1461d.h();
        }
        this.f1461d = new ActionMenuPresenter(getContext());
        this.f1461d.d();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hVar.a(this.f1461d, this.f1459b);
        this.f1460c = (ActionMenuView) this.f1461d.a(this);
        v.a(this.f1460c, (Drawable) null);
        addView(this.f1460c, layoutParams);
    }

    @Override // androidx.appcompat.widget.a
    public final /* bridge */ /* synthetic */ z a(int i2, long j2) {
        return super.a(i2, j2);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size;
        int i4;
        boolean z;
        int i5;
        int i6 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            if (this.f1462e > 0) {
                size = this.f1462e;
            } else {
                size = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size2 - getPaddingLeft()) - getPaddingRight();
            int i7 = size - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            View view = this.f1291j;
            if (view != null) {
                int a2 = a(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1291j.getLayoutParams();
                paddingLeft = a2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f1460c != null && this.f1460c.getParent() == this) {
                paddingLeft = a(this.f1460c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f1293l;
            if (linearLayout != null && this.f1292k == null) {
                if (this.f1288g) {
                    this.f1293l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1293l.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                        paddingLeft -= measuredWidth;
                    } else {
                        z = false;
                    }
                    LinearLayout linearLayout2 = this.f1293l;
                    if (z) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    linearLayout2.setVisibility(i5);
                } else {
                    paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f1292k;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams.width != -2) {
                    i4 = 1073741824;
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i6 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i7 = Math.min(layoutParams.height, i7);
                }
                this.f1292k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(i7, i6));
            }
            if (this.f1462e <= 0) {
                int childCount = getChildCount();
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i8) {
                        i8 = measuredHeight;
                    }
                }
                setMeasuredDimension(size2, i8);
                return;
            }
            setMeasuredDimension(size2, size);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    private ActionBarContextView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.hn);
        al a2 = al.a(context, attributeSet, new int[]{R.attr.jc, R.attr.jf, R.attr.o6, R.attr.vb, R.attr.ag0, R.attr.aja}, R.attr.hn, 0);
        v.a(this, a2.a(0));
        this.o = a2.g(5, 0);
        this.p = a2.g(4, 0);
        this.f1462e = a2.f(3, 0);
        this.q = a2.g(2, R.layout.a7);
        a2.f1549a.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int paddingRight;
        int i6;
        int i7;
        boolean a2 = ar.a(this);
        if (a2) {
            paddingLeft = (i4 - i2) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1291j;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1291j.getLayoutParams();
            if (a2) {
                i6 = marginLayoutParams.rightMargin;
                i7 = marginLayoutParams.leftMargin;
            } else {
                i6 = marginLayoutParams.leftMargin;
                i7 = marginLayoutParams.rightMargin;
            }
            int a3 = a(paddingLeft, i6, a2);
            paddingLeft = a(a3 + a(this.f1291j, a3, paddingTop, paddingTop2, a2), i7, a2);
        }
        LinearLayout linearLayout = this.f1293l;
        if (!(linearLayout == null || this.f1292k != null || linearLayout.getVisibility() == 8)) {
            paddingLeft += a(this.f1293l, paddingLeft, paddingTop, paddingTop2, a2);
        }
        View view2 = this.f1292k;
        if (view2 != null) {
            a(view2, paddingLeft, paddingTop, paddingTop2, a2);
        }
        if (a2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i4 - i2) - getPaddingRight();
        }
        if (this.f1460c != null) {
            a(this.f1460c, paddingRight, paddingTop, paddingTop2, !a2);
        }
    }
}
