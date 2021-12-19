package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

public class WaveSideBar extends View {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f64086a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    /* renamed from: b  reason: collision with root package name */
    private String[] f64087b;

    /* renamed from: c  reason: collision with root package name */
    private int f64088c;

    /* renamed from: d  reason: collision with root package name */
    private float f64089d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f64090e;

    /* renamed from: f  reason: collision with root package name */
    private int f64091f;

    /* renamed from: g  reason: collision with root package name */
    private float f64092g;

    /* renamed from: h  reason: collision with root package name */
    private float f64093h;

    /* renamed from: i  reason: collision with root package name */
    private float f64094i;

    /* renamed from: j  reason: collision with root package name */
    private RectF f64095j;

    /* renamed from: k  reason: collision with root package name */
    private float f64096k;

    /* renamed from: l  reason: collision with root package name */
    private float f64097l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f64098m;
    private boolean n;
    private int o;
    private int p;
    private a q;
    private float r;
    private DisplayMetrics s;

    public interface a {
        static {
            Covode.recordClassIndex(39500);
        }

        void a(String str);
    }

    /* access modifiers changed from: protected */
    public String[] getDefaultIndexItems() {
        return f64086a;
    }

    static {
        Covode.recordClassIndex(39499);
    }

    public void setLazyRespond(boolean z) {
        this.n = z;
    }

    public void setOnSelectIndexItemListener(a aVar) {
        this.q = aVar;
    }

    public void setMaxOffset(int i2) {
        this.f64094i = (float) i2;
        invalidate();
    }

    public void setIndexItems(String... strArr) {
        this.f64087b = (String[]) Arrays.copyOf(strArr, strArr.length);
        requestLayout();
    }

    public void setTextColor(int i2) {
        this.f64091f = i2;
        this.f64090e.setColor(i2);
        invalidate();
    }

    public void setPosition(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.o = i2;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
    }

    public void setTextSize(float f2) {
        if (this.f64092g != f2) {
            this.f64092g = f2;
            this.f64090e.setTextSize(f2);
            invalidate();
        }
    }

    public void setTextAlign(int i2) {
        if (this.p != i2) {
            if (i2 == 0) {
                this.f64090e.setTextAlign(Paint.Align.CENTER);
            } else if (i2 == 1) {
                this.f64090e.setTextAlign(Paint.Align.LEFT);
            } else if (i2 == 2) {
                this.f64090e.setTextAlign(Paint.Align.RIGHT);
            } else {
                throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
            }
            this.p = i2;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        MethodCollector.i(9303);
        super.onDraw(canvas);
        int length = this.f64087b.length;
        int i2 = 0;
        while (true) {
            int i3 = 255;
            if (i2 < length) {
                float f7 = this.r;
                float f8 = this.f64093h;
                float f9 = (float) i2;
                float f10 = f7 + (f8 * f9);
                float f11 = 0.0f;
                if (this.f64088c != -1) {
                    float abs = Math.abs(this.f64089d - ((f9 * f8) + (f8 / 2.0f))) / this.f64093h;
                    f2 = Math.max(1.0f - ((abs * abs) / 16.0f), 0.0f);
                } else {
                    f2 = 0.0f;
                }
                if (i2 != this.f64088c) {
                    i3 = (int) ((1.0f - f2) * 255.0f);
                }
                this.f64090e.setAlpha(i3);
                Paint paint = this.f64090e;
                float f12 = this.f64092g;
                paint.setTextSize(f12 + (f12 * f2));
                if (this.o == 1) {
                    int i4 = this.p;
                    if (i4 == 0) {
                        f5 = ((float) getPaddingLeft()) + (this.f64097l / 2.0f);
                        f6 = this.f64094i;
                    } else if (i4 == 1) {
                        f5 = (float) getPaddingLeft();
                        f6 = this.f64094i;
                    } else if (i4 == 2) {
                        f11 = ((float) getPaddingLeft()) + this.f64097l + (this.f64094i * f2);
                    }
                    f11 = f5 + (f6 * f2);
                } else {
                    int i5 = this.p;
                    if (i5 == 0) {
                        f3 = ((float) (getWidth() - getPaddingRight())) - (this.f64097l / 2.0f);
                        f4 = this.f64094i;
                    } else if (i5 == 1) {
                        f3 = ((float) (getWidth() - getPaddingRight())) - this.f64097l;
                        f4 = this.f64094i;
                    } else if (i5 == 2) {
                        f3 = (float) (getWidth() - getPaddingRight());
                        f4 = this.f64094i;
                    }
                    f11 = f3 - (f4 * f2);
                }
                canvas.drawText(this.f64087b[i2], f11, f10, this.f64090e);
                i2++;
            } else {
                this.f64090e.setAlpha(255);
                this.f64090e.setTextSize(this.f64092g);
                MethodCollector.o(9303);
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        a aVar;
        a aVar2;
        a aVar3;
        if (this.f64087b.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        float height = y - (((float) (getHeight() / 2)) - (this.f64096k / 2.0f));
        this.f64089d = height;
        if (height <= 0.0f) {
            i2 = 0;
        } else {
            i2 = (int) (height / this.f64093h);
            String[] strArr = this.f64087b;
            if (i2 >= strArr.length) {
                i2 = strArr.length - 1;
            }
        }
        this.f64088c = i2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.f64098m && !this.n && (aVar3 = this.q) != null) {
                        aVar3.a(this.f64087b[this.f64088c]);
                    }
                    invalidate();
                    return true;
                } else if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            }
            if (this.n && (aVar2 = this.q) != null) {
                aVar2.a(this.f64087b[this.f64088c]);
            }
            this.f64088c = -1;
            this.f64098m = false;
            invalidate();
            return true;
        } else if (this.f64095j.contains(x, y)) {
            this.f64098m = true;
            if (!this.n && (aVar = this.q) != null) {
                aVar.a(this.f64087b[this.f64088c]);
            }
            invalidate();
            return true;
        } else {
            this.f64088c = -1;
            return false;
        }
    }

    public WaveSideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        float paddingRight;
        float f2;
        MethodCollector.i(9301);
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        Paint.FontMetrics fontMetrics = this.f64090e.getFontMetrics();
        float f3 = fontMetrics.bottom - fontMetrics.top;
        this.f64093h = f3;
        String[] strArr = this.f64087b;
        this.f64096k = ((float) strArr.length) * f3;
        for (String str : strArr) {
            this.f64097l = Math.max(this.f64097l, this.f64090e.measureText(str));
        }
        if (this.o == 1) {
            paddingRight = 0.0f;
        } else {
            paddingRight = (((float) size2) - this.f64097l) - ((float) getPaddingRight());
        }
        if (this.o == 1) {
            f2 = ((float) getPaddingLeft()) + paddingRight + this.f64097l;
        } else {
            f2 = (float) size2;
        }
        float f4 = (float) (size / 2);
        float f5 = this.f64096k;
        float f6 = f4 - (f5 / 2.0f);
        this.f64095j.set(paddingRight, f6, f2, f5 + f6);
        float f7 = this.f64093h;
        this.r = ((f4 - ((((float) this.f64087b.length) * f7) / 2.0f)) + ((f7 / 2.0f) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f))) - fontMetrics.ascent;
        MethodCollector.o(9301);
    }

    private WaveSideBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9113);
        this.f64088c = -1;
        this.f64089d = -1.0f;
        this.f64095j = new RectF();
        this.f64098m = false;
        this.n = false;
        this.s = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ack, R.attr.acl, R.attr.acm, R.attr.acn, R.attr.aco, R.attr.acp});
        this.n = obtainStyledAttributes.getBoolean(0, false);
        this.f64091f = obtainStyledAttributes.getColor(4, -7829368);
        this.f64092g = obtainStyledAttributes.getDimension(5, TypedValue.applyDimension(2, 14.0f, this.s));
        this.f64094i = obtainStyledAttributes.getDimension(1, TypedValue.applyDimension(1, 80.0f, this.s));
        this.o = obtainStyledAttributes.getInt(2, 0);
        this.p = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        this.f64087b = getDefaultIndexItems();
        Paint paint = new Paint();
        this.f64090e = paint;
        paint.setAntiAlias(true);
        this.f64090e.setColor(this.f64091f);
        this.f64090e.setTextSize(this.f64092g);
        this.f64090e.setTypeface(b.a().a(d.f33801g));
        int i2 = this.p;
        if (i2 == 0) {
            this.f64090e.setTextAlign(Paint.Align.CENTER);
            MethodCollector.o(9113);
        } else if (i2 != 1) {
            if (i2 == 2) {
                this.f64090e.setTextAlign(Paint.Align.RIGHT);
            }
            MethodCollector.o(9113);
        } else {
            this.f64090e.setTextAlign(Paint.Align.LEFT);
            MethodCollector.o(9113);
        }
    }
}
