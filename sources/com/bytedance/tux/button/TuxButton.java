package com.bytedance.tux.button;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.a.c;
import com.bytedance.tux.b.g;
import com.bytedance.tux.b.k;
import com.bytedance.tux.c.d;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.j.h;
import java.util.Map;

public class TuxButton extends TuxTextView implements com.bytedance.tux.icon.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f44735b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f44736a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f44737e;

    /* renamed from: f  reason: collision with root package name */
    private int f44738f;

    /* renamed from: g  reason: collision with root package name */
    private int f44739g;

    /* renamed from: h  reason: collision with root package name */
    private String f44740h;

    /* renamed from: i  reason: collision with root package name */
    private d f44741i;

    /* renamed from: j  reason: collision with root package name */
    private int f44742j;

    /* renamed from: k  reason: collision with root package name */
    private int f44743k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f44744l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.tux.icon.b f44745m;
    private final k<TuxButton> n;

    static {
        Covode.recordClassIndex(27336);
    }

    public TuxButton(Context context) {
        this(context, null, 0, 6);
    }

    public TuxButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27337);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getSupportClickWhenDisable() {
        return this.f44744l;
    }

    public final void a() {
        setMinWidth(0);
        setMaxWidth(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVar = this.f44741i;
        if (dVar != null) {
            dVar.d();
        }
    }

    private final int getPaddingLeftValue() {
        if (getPaddingLeft() > 0) {
            return getPaddingLeft();
        }
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
    }

    private final int getPaddingRightValue() {
        if (getPaddingLeft() > 0) {
            return getPaddingRight();
        }
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
    }

    private final void b() {
        if (this.f44737e) {
            int i2 = 0;
            if (this.f44736a) {
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                this.f44745m.a(this.f44741i);
                int i3 = this.f44745m.f45109b;
                int a2 = h.g.a.a(((float) h.b(width - i3, 0)) / 2.0f);
                d dVar = this.f44741i;
                if (dVar != null) {
                    dVar.setBounds(a2, 0, i3 + a2, this.f44745m.f45108a);
                }
                setCompoundDrawables(this.f44741i, null, null, null);
                return;
            }
            if (!TextUtils.isEmpty(getText())) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                i2 = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            }
            this.f44745m.a(i2);
        }
    }

    public final void setSupportClickWhenDisable(boolean z) {
        this.f44744l = z;
    }

    public final void setButtonEndIcon(Integer num) {
        this.f44745m.b(num);
        b();
    }

    public final void setButtonSize(int i2) {
        this.f44738f = i2;
        this.n.a(this, R.attr.aom, i2);
    }

    public final void setButtonStartIcon(Integer num) {
        this.f44745m.a(num);
        b();
    }

    public final void setButtonVariant(int i2) {
        this.f44739g = i2;
        this.n.a(this, R.attr.aoo, i2);
    }

    @Override // com.bytedance.tux.icon.a
    public void setIconHeight(int i2) {
        this.f44745m.f45108a = i2;
        d dVar = this.f44741i;
        if (dVar != null) {
            dVar.b(i2);
        }
        b();
    }

    public void setIconTintColor(int i2) {
        this.f44745m.f45110c = Integer.valueOf(i2);
        b();
    }

    @Override // com.bytedance.tux.icon.a
    public void setIconWidth(int i2) {
        this.f44745m.f45109b = i2;
        d dVar = this.f44741i;
        if (dVar != null) {
            dVar.a(i2);
        }
        b();
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        if (this.f44737e) {
            this.n.a(this);
        }
    }

    final class b extends com.bytedance.tux.b.a.b<TuxButton> {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.tux.b.a.d f44747b = new com.bytedance.tux.b.a.d();

        /* renamed from: c  reason: collision with root package name */
        private final c f44748c = new c();

        static {
            Covode.recordClassIndex(27338);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
        @Override // com.bytedance.tux.b.a.b
        public final /* synthetic */ Map a(TuxButton tuxButton, Map map) {
            TuxButton tuxButton2 = tuxButton;
            l.c(tuxButton2, "");
            l.c(map, "");
            return super.a(tuxButton2, this.f44748c.a(tuxButton2, this.f44747b.a((TuxTextView) tuxButton2, (Map<Integer, ? extends Object>) map)));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
        @Override // com.bytedance.tux.b.a.b
        public final /* synthetic */ boolean a(TuxButton tuxButton, int i2, Object obj) {
            l.c(tuxButton, "");
            l.c(obj, "");
            if (i2 != g.p().f44668a) {
                return false;
            }
            TuxButton tuxButton2 = TuxButton.this;
            g.p();
            l.c(obj, "");
            tuxButton2.setLoadingIcon(((Number) obj).intValue());
            return true;
        }
    }

    public final void a(Integer num) {
        this.f44745m.a(num);
        this.f44745m.b(null);
        b();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f44737e) {
            this.n.a(this);
        }
        if (!z) {
            setLoading(false);
        }
    }

    @Override // com.bytedance.tux.icon.a
    public void setIconTintColorRes(int i2) {
        Context context = getContext();
        l.a((Object) context, "");
        Integer a2 = com.bytedance.tux.h.d.a(context, i2);
        if (a2 != null) {
            setIconTintColor(a2.intValue());
        }
    }

    public final void setLoadingIcon(int i2) {
        d dVar = this.f44741i;
        if (dVar != null) {
            dVar.d();
        }
        Context context = getContext();
        l.a((Object) context, "");
        this.f44741i = new d(context, i2);
    }

    public final void a(boolean z) {
        if (!z) {
            setMinTextSize(-1.0f);
        } else if (getMinTextSize() <= 0) {
            setMinTextSize(10.0f);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f44744l || isEnabled() || !isClickable() || motionEvent == null || motionEvent.getAction() != 1 || motionEvent.getX() > ((float) getWidth()) || motionEvent.getY() > ((float) getHeight())) {
            return super.onTouchEvent(motionEvent);
        }
        performClick();
        return true;
    }

    public final void setLoading(boolean z) {
        if (z != this.f44736a) {
            this.f44736a = z;
            if (z) {
                this.f44740h = getText().toString();
                setText("");
                d dVar = this.f44741i;
                if (dVar != null) {
                    PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ROTATE", 0, 360);
                    l.a((Object) ofInt, "");
                    ValueAnimator valueAnimator = dVar.f44772h;
                    valueAnimator.setValues(ofInt);
                    valueAnimator.setInterpolator(new LinearInterpolator());
                    valueAnimator.setDuration(1000L);
                    valueAnimator.setRepeatMode(1);
                    valueAnimator.setRepeatCount(-1);
                    valueAnimator.addUpdateListener(new d.a(dVar, ofInt));
                    dVar.f44772h.start();
                    return;
                }
                return;
            }
            d dVar2 = this.f44741i;
            if (dVar2 != null) {
                dVar2.d();
            }
            setText(this.f44740h);
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        b();
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i2, int i3) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2 || getMinWidth() <= 0) {
            z = false;
        } else {
            z = true;
        }
        b(z);
        super.onMeasure(i2, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TuxButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        this.f44738f = Integer.MIN_VALUE;
        this.f44739g = Integer.MIN_VALUE;
        this.f44740h = "";
        this.f44743k = Integer.MAX_VALUE;
        k<TuxButton> kVar = new k<>(new b());
        this.n = kVar;
        this.f44737e = true;
        com.bytedance.tux.icon.b bVar = new com.bytedance.tux.icon.b(this);
        this.f44745m = bVar;
        bVar.a(attributeSet, i2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aol, R.attr.aom, R.attr.aoo, R.attr.ap_, R.attr.apa, R.attr.apl, R.attr.apn, R.attr.aq1, R.attr.arl}, i2, 0);
            l.a((Object) obtainStyledAttributes, "");
            this.f44738f = obtainStyledAttributes.getInt(1, -1);
            this.f44739g = obtainStyledAttributes.getInt(2, Integer.MIN_VALUE);
            a(obtainStyledAttributes.getBoolean(0, false));
            int resourceId = obtainStyledAttributes.getResourceId(7, 0);
            if (resourceId != 0) {
                this.f44741i = new d(context, resourceId);
            }
            obtainStyledAttributes.recycle();
        }
        this.f44742j = getMinWidth();
        this.f44743k = getMaxWidth();
        setPadding(getPaddingLeftValue(), 0, getPaddingRightValue(), 0);
        setGravity(17);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        setCompoundDrawablePadding(h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics())));
        setButtonSize(this.f44738f);
        setButtonVariant(this.f44739g);
        if (bVar.f45111d > 0.0f) {
            bVar.f45109b = (int) bVar.f45111d;
        }
        if (bVar.f45112e > 0.0f) {
            bVar.f45108a = (int) bVar.f45112e;
        }
        b();
        int i3 = this.f44743k;
        if (i3 < Integer.MAX_VALUE) {
            setMaxWidth(i3);
        }
        int i4 = this.f44742j;
        if (i4 > 0) {
            setMinWidth(i4);
        }
        kVar.a(this, (int) R.attr.cu);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxButton(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.bo : i2);
    }
}
