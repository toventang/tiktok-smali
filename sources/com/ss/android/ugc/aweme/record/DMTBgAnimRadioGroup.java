package com.ss.android.ugc.aweme.record;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class DMTBgAnimRadioGroup extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f120186a;

    /* renamed from: b  reason: collision with root package name */
    public float f120187b;

    /* renamed from: c  reason: collision with root package name */
    public float f120188c;

    /* renamed from: d  reason: collision with root package name */
    public b f120189d;

    /* renamed from: e  reason: collision with root package name */
    public final View f120190e;

    /* renamed from: f  reason: collision with root package name */
    public final ValueAnimator f120191f;

    /* renamed from: g  reason: collision with root package name */
    private int f120192g;

    /* renamed from: h  reason: collision with root package name */
    private float f120193h;

    /* renamed from: i  reason: collision with root package name */
    private int f120194i;

    /* renamed from: j  reason: collision with root package name */
    private int f120195j;

    /* renamed from: k  reason: collision with root package name */
    private final LinearLayout f120196k;

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f120197l;

    public interface b {
        static {
            Covode.recordClassIndex(78181);
        }

        void a(int i2);

        boolean b(int i2);
    }

    static {
        Covode.recordClassIndex(78179);
    }

    public DMTBgAnimRadioGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final LinearLayout getContainer() {
        return this.f120196k;
    }

    public final int getItemTextNormalColor() {
        return this.f120194i;
    }

    public final int getItemTextSelectColor() {
        return this.f120195j;
    }

    public final float getItemTextSize() {
        return this.f120193h;
    }

    public final void setItemTextNormalColor(int i2) {
        this.f120194i = i2;
    }

    public final void setItemTextSelectColor(int i2) {
        this.f120195j = i2;
    }

    public final void setItemTextSize(float f2) {
        this.f120193h = f2;
    }

    public final void setOnItemChangeListener(b bVar) {
        l.d(bVar, "");
        this.f120189d = bVar;
    }

    public final void setCurrentItem(int i2) {
        b bVar;
        if (!(i2 == this.f120186a || (bVar = this.f120189d) == null)) {
            bVar.a(i2);
        }
        this.f120186a = i2;
        a(this.f120196k.getChildAt(i2), this.f120195j);
    }

    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DMTBgAnimRadioGroup f120198a;

        static {
            Covode.recordClassIndex(78180);
        }

        a(DMTBgAnimRadioGroup dMTBgAnimRadioGroup) {
            this.f120198a = dMTBgAnimRadioGroup;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f120198a.f120190e.setX(this.f120198a.f120187b + ((this.f120198a.f120188c - this.f120198a.f120187b) * floatValue));
            if (floatValue == 1.0f) {
                DMTBgAnimRadioGroup dMTBgAnimRadioGroup = this.f120198a;
                dMTBgAnimRadioGroup.a(dMTBgAnimRadioGroup.getContainer().getChildAt(this.f120198a.f120186a), this.f120198a.getItemTextSelectColor());
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DMTBgAnimRadioGroup f120199a;

        static {
            Covode.recordClassIndex(78182);
        }

        c(DMTBgAnimRadioGroup dMTBgAnimRadioGroup) {
            this.f120199a = dMTBgAnimRadioGroup;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DMTBgAnimRadioGroup dMTBgAnimRadioGroup = this.f120199a;
            dMTBgAnimRadioGroup.f120187b = dMTBgAnimRadioGroup.f120190e.getX();
            DMTBgAnimRadioGroup dMTBgAnimRadioGroup2 = this.f120199a;
            l.b(view, "");
            dMTBgAnimRadioGroup2.f120188c = view.getX();
            int indexOfChild = this.f120199a.getContainer().indexOfChild(view);
            if (indexOfChild != this.f120199a.f120186a) {
                b bVar = this.f120199a.f120189d;
                if (bVar == null || bVar.b(indexOfChild)) {
                    DMTBgAnimRadioGroup dMTBgAnimRadioGroup3 = this.f120199a;
                    dMTBgAnimRadioGroup3.a(dMTBgAnimRadioGroup3.getContainer().getChildAt(this.f120199a.f120186a), this.f120199a.getItemTextNormalColor());
                    this.f120199a.f120186a = indexOfChild;
                    b bVar2 = this.f120199a.f120189d;
                    if (bVar2 != null) {
                        bVar2.a(indexOfChild);
                    }
                    this.f120199a.f120191f.start();
                }
            }
        }
    }

    public final void a(String str) {
        MethodCollector.i(8416);
        l.d(str, "");
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.ary, this.f120196k, false);
        if (a2 != null) {
            TextView textView = (TextView) a2;
            textView.setText(str);
            textView.setTextSize(0, this.f120193h);
            textView.setTextColor(this.f120194i);
            textView.setOnClickListener(this.f120197l);
            this.f120196k.addView(textView);
            MethodCollector.o(8416);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        MethodCollector.o(8416);
        throw nullPointerException;
    }

    public final void a(View view, int i2) {
        if (view != null && (view instanceof TextView) && this.f120195j != -1) {
            ((TextView) view).setTextColor(i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(8559);
        super.onMeasure(i2, i3);
        int size = (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight();
        this.f120192g = size;
        measureChild(this.f120190e, View.MeasureSpec.makeMeasureSpec(size / this.f120196k.getChildCount(), Integer.MIN_VALUE), i3);
        MethodCollector.o(8559);
    }

    private /* synthetic */ DMTBgAnimRadioGroup(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DMTBgAnimRadioGroup(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8595);
        this.f120186a = -1;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f120190e = view;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f120196k = linearLayout;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new a(this));
        this.f120191f = ofFloat;
        this.f120197l = new c(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ya, R.attr.yc, R.attr.ye, R.attr.yf}, 0, 0);
        l.b(obtainStyledAttributes, "");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f120193h = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f120194i = obtainStyledAttributes.getColor(1, 0);
        this.f120195j = obtainStyledAttributes.getColor(2, -1);
        obtainStyledAttributes.recycle();
        view.setBackground(drawable);
        addView(view);
        addView(linearLayout);
        MethodCollector.o(8595);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(8587);
        super.onLayout(z, i2, i3, i4, i5);
        View childAt = this.f120196k.getChildAt(this.f120186a);
        if (childAt != null) {
            this.f120190e.setX(childAt.getX());
        }
        MethodCollector.o(8587);
    }
}
