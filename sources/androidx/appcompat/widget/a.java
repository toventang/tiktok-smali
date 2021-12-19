package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.aa;
import androidx.core.h.v;
import androidx.core.h.z;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final C0022a f1458a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f1459b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f1460c;

    /* renamed from: d  reason: collision with root package name */
    protected ActionMenuPresenter f1461d;

    /* renamed from: e  reason: collision with root package name */
    protected int f1462e;

    /* renamed from: f  reason: collision with root package name */
    protected z f1463f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1464g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1465h;

    static {
        Covode.recordClassIndex(444);
    }

    protected static int a(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    public int getContentHeight() {
        return this.f1462e;
    }

    public int getAnimatedVisibility() {
        if (this.f1463f != null) {
            return this.f1458a.f1466a;
        }
        return getVisibility();
    }

    public boolean a() {
        ActionMenuPresenter actionMenuPresenter = this.f1461d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.e();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0022a implements aa {

        /* renamed from: a  reason: collision with root package name */
        int f1466a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1468c;

        static {
            Covode.recordClassIndex(445);
        }

        @Override // androidx.core.h.aa
        public final void c(View view) {
            this.f1468c = true;
        }

        protected C0022a() {
        }

        @Override // androidx.core.h.aa
        public final void a(View view) {
            a.super.setVisibility(0);
            this.f1468c = false;
        }

        @Override // androidx.core.h.aa
        public final void b(View view) {
            if (!this.f1468c) {
                a.this.f1463f = null;
                a.super.setVisibility(this.f1466a);
            }
        }

        public final C0022a a(z zVar, int i2) {
            a.this.f1463f = zVar;
            this.f1466a = i2;
            return this;
        }
    }

    public void setContentHeight(int i2) {
        this.f1462e = i2;
        requestLayout();
    }

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            z zVar = this.f1463f;
            if (zVar != null) {
                zVar.b();
            }
            super.setVisibility(i2);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1465h = false;
        }
        if (!this.f1465h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.f1465h = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1465h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1464g = false;
        }
        if (!this.f1464g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.f1464g = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1464g = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.jc, R.attr.jf, R.attr.jg, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.pp, R.attr.pq, R.attr.qt, R.attr.rg, R.attr.ri, R.attr.sh, R.attr.vb, R.attr.vi, R.attr.vs, R.attr.vt, R.attr.vw, R.attr.wo, R.attr.y3, R.attr.a3r, R.attr.a69, R.attr.a7l, R.attr.a7x, R.attr.a7y, R.attr.afx, R.attr.ag0, R.attr.aiy, R.attr.aja}, R.attr.h2, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1461d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.c();
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public z a(int i2, long j2) {
        z zVar = this.f1463f;
        if (zVar != null) {
            zVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            z a2 = v.j(this).a(1.0f);
            a2.a(j2);
            a2.a(this.f1458a.a(a2, i2));
            return a2;
        }
        z a3 = v.j(this).a(0.0f);
        a3.a(j2);
        a3.a(this.f1458a.a(a3, i2));
        return a3;
    }

    protected static int a(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - 0);
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1458a = new C0022a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.gz, typedValue, true) || typedValue.resourceId == 0) {
            this.f1459b = context;
        } else {
            this.f1459b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int a(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
            return -measuredWidth;
        }
        view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        return measuredWidth;
    }
}
