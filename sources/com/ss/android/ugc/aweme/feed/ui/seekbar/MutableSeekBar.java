package com.ss.android.ugc.aweme.feed.ui.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.p;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class MutableSeekBar extends p implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f94996a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final b f94997b;

    /* renamed from: c  reason: collision with root package name */
    private final c f94998c;

    /* renamed from: d  reason: collision with root package name */
    private SeekBar.OnSeekBarChangeListener f94999d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f95000e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f95001f;

    /* renamed from: g  reason: collision with root package name */
    private Float f95002g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f95003h;

    /* renamed from: i  reason: collision with root package name */
    private int f95004i;

    static {
        Covode.recordClassIndex(60246);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60247);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getCanDrag() {
        return this.f95003h;
    }

    public final boolean getHasActionMove() {
        return this.f95000e;
    }

    public final Float getMDownEventRawX() {
        return this.f95002g;
    }

    public final boolean getMPauseStatus() {
        return this.f95001f;
    }

    public final int getRealWidth() {
        return this.f95004i;
    }

    public static final class c extends Drawable {

        /* renamed from: a  reason: collision with root package name */
        public float f95013a = 0.5f;

        /* renamed from: b  reason: collision with root package name */
        public float f95014b = 1.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f95015c;

        /* renamed from: d  reason: collision with root package name */
        public int f95016d = -1;

        /* renamed from: e  reason: collision with root package name */
        public float f95017e;

        /* renamed from: f  reason: collision with root package name */
        public float f95018f;

        /* renamed from: g  reason: collision with root package name */
        public float f95019g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public int f95020h = -16777216;

        /* renamed from: i  reason: collision with root package name */
        private final Paint f95021i;

        static {
            Covode.recordClassIndex(60249);
        }

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i2) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final int getIntrinsicHeight() {
            return (int) (this.f95014b * this.f95015c);
        }

        public final int getIntrinsicWidth() {
            return (int) (this.f95014b * this.f95015c);
        }

        public c() {
            Paint paint = new Paint();
            this.f95021i = paint;
            paint.setAntiAlias(true);
        }

        public final void draw(Canvas canvas) {
            float exactCenterX;
            l.d(canvas, "");
            this.f95021i.setColor(this.f95016d);
            float f2 = this.f95019g;
            if (f2 >= 0.0f) {
                this.f95021i.setShadowLayer(f2, this.f95017e, this.f95018f, this.f95020h);
            }
            if (gb.a()) {
                exactCenterX = getBounds().exactCenterX() + this.f95013a;
            } else {
                exactCenterX = getBounds().exactCenterX() - this.f95013a;
            }
            canvas.drawCircle(exactCenterX, getBounds().exactCenterY(), this.f95015c / 2.0f, this.f95021i);
        }
    }

    public static final class b extends Drawable {

        /* renamed from: a  reason: collision with root package name */
        public int f95005a = -16777216;

        /* renamed from: b  reason: collision with root package name */
        public int f95006b;

        /* renamed from: c  reason: collision with root package name */
        public int f95007c = -16777216;

        /* renamed from: d  reason: collision with root package name */
        public float f95008d;

        /* renamed from: e  reason: collision with root package name */
        float f95009e;

        /* renamed from: f  reason: collision with root package name */
        float f95010f;

        /* renamed from: g  reason: collision with root package name */
        private final Paint f95011g;

        /* renamed from: h  reason: collision with root package name */
        private final RectF f95012h;

        static {
            Covode.recordClassIndex(60248);
        }

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i2) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public b() {
            Paint paint = new Paint();
            this.f95011g = paint;
            this.f95012h = new RectF();
            paint.setAntiAlias(true);
        }

        /* access modifiers changed from: protected */
        public final boolean onLevelChange(int i2) {
            boolean onLevelChange = super.onLevelChange(i2);
            invalidateSelf();
            return onLevelChange;
        }

        public final void draw(Canvas canvas) {
            l.d(canvas, "");
            float width = (float) getBounds().width();
            float f2 = this.f95008d / 2.0f;
            float centerY = ((float) getBounds().centerY()) - f2;
            float centerY2 = ((float) getBounds().centerY()) + f2;
            this.f95011g.setColor(this.f95007c);
            this.f95012h.set(0.0f, centerY, width, centerY2);
            canvas.drawRect(this.f95012h, this.f95011g);
            if (this.f95010f > this.f95009e) {
                this.f95011g.setColor(this.f95006b);
                this.f95012h.set(this.f95009e * width, centerY, this.f95010f * width, centerY2);
                canvas.drawRoundRect(this.f95012h, f2, f2, this.f95011g);
            }
            this.f95011g.setColor(this.f95005a);
            this.f95012h.set(0.0f, centerY, width * this.f95009e, centerY2);
            canvas.drawRect(this.f95012h, this.f95011g);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MutableSeekBar f95022a;

        static {
            Covode.recordClassIndex(60250);
        }

        d(MutableSeekBar mutableSeekBar) {
            this.f95022a = mutableSeekBar;
        }

        public final void run() {
            MutableSeekBar mutableSeekBar = this.f95022a;
            mutableSeekBar.onSizeChanged(mutableSeekBar.getWidth(), this.f95022a.getHeight(), 0, 0);
        }
    }

    public final void setCanDrag(boolean z) {
        this.f95003h = z;
    }

    public final void setHasActionMove(boolean z) {
        this.f95000e = z;
    }

    public final void setMDownEventRawX(Float f2) {
        this.f95002g = f2;
    }

    public final void setMPauseStatus(boolean z) {
        this.f95001f = z;
    }

    public final void setPauseStatus(boolean z) {
        this.f95001f = z;
    }

    public final void setRealWidth(int i2) {
        this.f95004i = i2;
    }

    public MutableSeekBar(Context context) {
        this(context, null);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f94999d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public final void setCustomOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        l.d(onSeekBarChangeListener, "");
        this.f94999d = onSeekBarChangeListener;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        requestLayout();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f94999d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    private final float a(int i2) {
        float f2;
        int max;
        if (Build.VERSION.SDK_INT >= 26) {
            max = getMax() - getMin();
            if (max <= 0) {
                return 0.0f;
            }
            f2 = ((float) (i2 - getMin())) * 1.0f;
        } else if (getMax() <= 0) {
            return 0.0f;
        } else {
            f2 = ((float) i2) * 1.0f;
            max = getMax();
        }
        return f2 / ((float) max);
    }

    @Override // androidx.appcompat.widget.p
    public final void onDraw(Canvas canvas) {
        if (this.f95004i != (getWidth() - getPaddingLeft()) - getPaddingRight()) {
            post(new d(this));
        }
        float a2 = a(getProgress());
        float a3 = a(getSecondaryProgress());
        b bVar = this.f94997b;
        bVar.f95009e = a2;
        bVar.f95010f = a3;
        super.onDraw(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                this.f95000e = false;
                this.f95002g = Float.valueOf(motionEvent.getRawX());
                super.onTouchEvent(motionEvent);
            } else if (num.intValue() == 2) {
                Float f2 = this.f95002g;
                if (f2 != null && Math.abs(f2.floatValue() - motionEvent.getRawX()) > 10.0f) {
                    this.f95000e = true;
                    super.onTouchEvent(motionEvent);
                }
            } else if (num.intValue() == 1) {
                if (this.f95000e || this.f95001f) {
                    super.onTouchEvent(motionEvent);
                } else {
                    onStartTrackingTouch(this);
                    onStopTrackingTouch(this);
                }
                this.f95000e = false;
            } else if (num.intValue() == 3) {
                super.onTouchEvent(motionEvent);
                this.f95000e = false;
            }
        }
        return true;
    }

    public MutableSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f94999d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i2, z);
        }
    }

    private MutableSeekBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.ab6);
        b bVar = new b();
        this.f94997b = bVar;
        c cVar = new c();
        this.f94998c = cVar;
        this.f95003h = true;
        super.setOnSeekBarChangeListener(this);
        setThumb(cVar);
        setProgressDrawable(bVar);
    }

    public static /* synthetic */ void a(MutableSeekBar mutableSeekBar, Float f2, Integer num) {
        boolean z = true;
        boolean z2 = false;
        if (f2 != null) {
            float floatValue = f2.floatValue();
            if (mutableSeekBar.f94998c.f95015c != floatValue) {
                z2 = true;
            }
            mutableSeekBar.f94998c.f95015c = floatValue;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (mutableSeekBar.f94998c.f95016d == intValue) {
                z = z2;
            }
            mutableSeekBar.f94998c.f95016d = intValue;
            z2 = z;
        }
        if (z2) {
            mutableSeekBar.requestLayout();
            mutableSeekBar.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f95004i = (i2 - getPaddingRight()) - getPaddingLeft();
    }

    public static /* synthetic */ void a(MutableSeekBar mutableSeekBar, Integer num, Integer num2, Float f2, int i2) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            num2 = null;
        }
        if ((i2 & 4) != 0) {
            f2 = null;
        }
        boolean z = false;
        boolean z2 = true;
        if (num != null) {
            int intValue = num.intValue();
            if (mutableSeekBar.f94997b.f95005a != intValue) {
                z = true;
            }
            mutableSeekBar.f94997b.f95005a = intValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (mutableSeekBar.f94997b.f95007c != intValue2) {
                z = true;
            }
            mutableSeekBar.f94997b.f95007c = intValue2;
        }
        if (f2 != null) {
            float floatValue = f2.floatValue();
            if (mutableSeekBar.f94997b.f95008d == floatValue) {
                z2 = z;
            }
            mutableSeekBar.f94997b.f95008d = floatValue;
            z = z2;
        }
        if (z) {
            mutableSeekBar.requestLayout();
            mutableSeekBar.invalidate();
        }
    }
}
