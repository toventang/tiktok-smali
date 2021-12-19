package com.bytedance.ies.dmt.ui.widget.setting.checkable;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.h.v;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class DmtSettingSwitch extends View {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f33698d = {R.attr.ag9};

    /* renamed from: l  reason: collision with root package name */
    private static final Property<DmtSettingSwitch, Float> f33699l = new Property<DmtSettingSwitch, Float>(Float.class, "thumbPos") {
        /* class com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch.AnonymousClass1 */

        static {
            Covode.recordClassIndex(20042);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(DmtSettingSwitch dmtSettingSwitch) {
            return Float.valueOf(dmtSettingSwitch.f33700a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(DmtSettingSwitch dmtSettingSwitch, Float f2) {
            dmtSettingSwitch.setThumbPosition(f2.floatValue());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public float f33700a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f33701b;

    /* renamed from: c  reason: collision with root package name */
    ObjectAnimator f33702c;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f33703e;

    /* renamed from: f  reason: collision with root package name */
    private int f33704f;

    /* renamed from: g  reason: collision with root package name */
    private int f33705g;

    /* renamed from: h  reason: collision with root package name */
    private int f33706h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f33707i;

    /* renamed from: j  reason: collision with root package name */
    private RectF f33708j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f33709k;

    /* renamed from: m  reason: collision with root package name */
    private Paint f33710m;
    private int n;
    private a o;
    private int p;
    private VelocityTracker q;
    private int r;
    private float s;
    private float t;
    private boolean u;

    public interface a {
        static {
            Covode.recordClassIndex(20043);
        }

        void a(boolean z);
    }

    public Drawable getThumbDrawable() {
        return this.f33703e;
    }

    public Rect getThumbRect() {
        return this.f33707i;
    }

    public int getTrackPadding() {
        return this.f33705g;
    }

    public int getTrackRadius() {
        return this.f33706h;
    }

    public ColorStateList getTrackTintList() {
        return this.f33709k;
    }

    private int getThumbScrollRange() {
        return getMeasuredWidth() - this.f33704f;
    }

    private boolean getTargetCheckedState() {
        if (this.f33700a > 0.5f) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(IHostUser.MESSAGE_NICKNAME_DUPLICATE_2);
    }

    private int getThumbOffset() {
        float f2;
        if (v.e(this) == 1) {
            f2 = 1.0f - this.f33700a;
        } else {
            f2 = this.f33700a;
        }
        return (int) ((f2 * ((float) getThumbScrollRange())) + 0.5f);
    }

    public void setEnableTouch(boolean z) {
        this.u = z;
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.o = aVar;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f33703e = drawable;
    }

    public void setThumbRect(Rect rect) {
        this.f33707i = rect;
    }

    public void setTrackPadding(int i2) {
        this.f33705g = i2;
    }

    public void setTrackRadius(int i2) {
        this.f33706h = i2;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f33709k = colorStateList;
    }

    public DmtSettingSwitch(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f2) {
        this.f33700a = f2;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.f33701b) {
            mergeDrawableStates(onCreateDrawableState, f33698d);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(9146);
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.f33709k;
        if (colorStateList != null) {
            this.f33710m.setColor(colorStateList.getColorForState(drawableState, -65536));
        }
        this.f33708j.left = 0.0f;
        this.f33708j.right = (float) getMeasuredWidth();
        this.f33708j.top = (float) this.f33705g;
        this.f33708j.bottom = (float) (getMeasuredHeight() - this.f33705g);
        RectF rectF = this.f33708j;
        int i2 = this.f33706h;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.f33710m);
        this.f33707i.left = getThumbOffset();
        Rect rect = this.f33707i;
        rect.right = rect.left + this.f33704f;
        Drawable drawable = this.f33703e;
        if (drawable != null) {
            drawable.setBounds(this.f33707i);
            this.f33703e.setState(drawableState);
            this.f33703e.draw(canvas);
        }
        MethodCollector.o(9146);
    }

    public void setChecked(boolean z) {
        if (this.f33701b != z) {
            this.f33701b = z;
            a aVar = this.o;
            if (aVar != null) {
                aVar.a(z);
            }
        }
        refreshDrawableState();
        float f2 = 1.0f;
        if (getWindowToken() == null || !v.v(this)) {
            ObjectAnimator objectAnimator = this.f33702c;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z) {
                f2 = 0.0f;
            }
            setThumbPosition(f2);
            return;
        }
        if (!z) {
            f2 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f33699l, f2);
        this.f33702c = ofFloat;
        ofFloat.setDuration(250L);
        int i2 = Build.VERSION.SDK_INT;
        this.f33702c.setAutoCancel(true);
        this.f33702c.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != 3) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public DmtSettingSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(9144);
        Drawable drawable = this.f33703e;
        if (drawable == null) {
            super.onMeasure(i2, i3);
            MethodCollector.o(9144);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.f33703e.getIntrinsicHeight();
        this.f33707i.left = 0;
        this.f33707i.top = 0;
        this.f33707i.right = intrinsicWidth;
        this.f33704f = intrinsicWidth;
        this.f33707i.bottom = intrinsicHeight;
        this.f33703e.setBounds(this.f33707i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            setMeasuredDimension(size, intrinsicHeight);
            MethodCollector.o(9144);
            return;
        }
        setMeasuredDimension(intrinsicWidth * 2, intrinsicHeight);
        MethodCollector.o(9144);
    }

    private DmtSettingSwitch(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9139);
        this.f33710m = new Paint();
        this.q = VelocityTracker.obtain();
        this.u = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ain, R.attr.ak3, R.attr.ak4, R.attr.ak5});
        this.f33703e = obtainStyledAttributes.getDrawable(0);
        this.f33709k = obtainStyledAttributes.getColorStateList(3);
        this.f33705g = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f33706h = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        obtainStyledAttributes.recycle();
        this.f33710m.setAntiAlias(true);
        this.f33707i = new Rect();
        this.f33708j = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.n = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        MethodCollector.o(9139);
    }
}
