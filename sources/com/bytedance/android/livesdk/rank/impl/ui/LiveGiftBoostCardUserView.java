package com.bytedance.android.livesdk.rank.impl.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class LiveGiftBoostCardUserView extends View {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<String> f20932a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private Paint f20933b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f20934c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f20935d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Float> f20936e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<Float> f20937f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private Float f20938g;

    /* renamed from: h  reason: collision with root package name */
    private Float f20939h;

    /* renamed from: i  reason: collision with root package name */
    private float f20940i;

    /* renamed from: j  reason: collision with root package name */
    private float f20941j;

    /* renamed from: k  reason: collision with root package name */
    private final float f20942k;

    /* renamed from: l  reason: collision with root package name */
    private final float f20943l;

    /* renamed from: m  reason: collision with root package name */
    private final int f20944m = a(2);
    private final float n;
    private final float o = 2.0f;
    private final int p = a(75);
    private final String q = "#33FF5A2C";
    private final String r = "#00000000";
    private Float s;
    private Float t;
    private f.a.b.a u = new f.a.b.a();
    private boolean v = y.g();

    static {
        Covode.recordClassIndex(12389);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u.a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.gift.d.a.class).d(new a(this)));
    }

    private final void getMinMaxData() {
        ArrayList<String> arrayList = this.f20932a;
        int size = arrayList.size();
        float f2 = Float.MIN_VALUE;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            String str = arrayList.get(i2);
            l.b(str, "");
            if (f2 < Float.parseFloat(str)) {
                String str2 = arrayList.get(i2);
                l.b(str2, "");
                f2 = Float.parseFloat(str2);
            }
            String str3 = arrayList.get(i2);
            l.b(str3, "");
            if (f3 > Float.parseFloat(str3)) {
                String str4 = arrayList.get(i2);
                l.b(str4, "");
                f3 = Float.parseFloat(str4);
            }
        }
        this.f20940i = f2;
        this.f20941j = f3;
    }

    private final void getDataCoordination() {
        float f2;
        this.f20936e.clear();
        this.f20937f.clear();
        int size = this.f20932a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<Float> arrayList = this.f20936e;
            Float f3 = this.f20938g;
            float f4 = 0.0f;
            if (f3 != null) {
                f2 = f3.floatValue();
            } else {
                f2 = 0.0f;
            }
            float f5 = this.f20943l;
            float f6 = this.n;
            arrayList.add(Float.valueOf(((((f2 - (f5 * 2.0f)) - f6) / ((float) (size - 1))) * ((float) i2)) + f5 + f6));
            ArrayList<Float> arrayList2 = this.f20937f;
            Float f7 = this.f20939h;
            if (f7 != null) {
                f4 = f7.floatValue();
            }
            float f8 = ((f4 - (this.f20942k * 2.0f)) - ((float) this.f20944m)) - ((float) this.p);
            float f9 = this.f20940i;
            String str = this.f20932a.get(i2);
            l.b(str, "");
            arrayList2.add(Float.valueOf(((f8 * (f9 - Float.parseFloat(str))) / (this.f20940i - this.f20941j)) + this.f20942k + ((float) this.p)));
        }
        this.s = (Float) Collections.max(this.f20937f);
        this.t = (Float) Collections.min(this.f20937f);
    }

    private final int a(int i2) {
        Context context = getContext();
        l.b(context, "");
        Resources resources = context.getResources();
        l.b(resources, "");
        return (int) ((((float) i2) * resources.getDisplayMetrics().density) + 0.5f);
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftBoostCardUserView f20945a;

        static {
            Covode.recordClassIndex(12390);
        }

        a(LiveGiftBoostCardUserView liveGiftBoostCardUserView) {
            this.f20945a = liveGiftBoostCardUserView;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            LiveGiftBoostCardUserView liveGiftBoostCardUserView = this.f20945a;
            Iterator<Long> it = ((com.bytedance.android.livesdk.gift.d.a) obj).f17845a.iterator();
            l.b(it, "");
            liveGiftBoostCardUserView.f20932a.clear();
            while (it.hasNext()) {
                liveGiftBoostCardUserView.f20932a.add(String.valueOf(it.next().longValue()));
            }
            liveGiftBoostCardUserView.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f2;
        float f3;
        float floatValue;
        float floatValue2;
        float f4;
        float floatValue3;
        float f5;
        float f6;
        float f7;
        float floatValue4;
        float f8;
        float f9;
        float floatValue5;
        float floatValue6;
        float f10;
        float f11;
        MethodCollector.i(2542);
        super.onDraw(canvas);
        if (canvas != null) {
            if (this.f20932a.size() < 2) {
                MethodCollector.o(2542);
                return;
            }
            getMinMaxData();
            getDataCoordination();
            int size = this.f20932a.size() - 2;
            if (size >= 0) {
                int i2 = 0;
                while (true) {
                    Paint paint = this.f20933b;
                    if (paint != null) {
                        if (this.v) {
                            Float f12 = this.f20938g;
                            if (f12 != null) {
                                f11 = f12.floatValue();
                            } else {
                                f11 = 0.0f;
                            }
                            Float f13 = this.f20936e.get(i2);
                            l.b(f13, "");
                            floatValue5 = f11 - f13.floatValue();
                        } else {
                            Float f14 = this.f20936e.get(i2);
                            l.b(f14, "");
                            floatValue5 = f14.floatValue();
                        }
                        Float f15 = this.f20937f.get(i2);
                        l.b(f15, "");
                        float floatValue7 = f15.floatValue();
                        if (this.v) {
                            Float f16 = this.f20938g;
                            if (f16 != null) {
                                f10 = f16.floatValue();
                            } else {
                                f10 = 0.0f;
                            }
                            Float f17 = this.f20936e.get(i2 + 1);
                            l.b(f17, "");
                            floatValue6 = f10 - f17.floatValue();
                        } else {
                            Float f18 = this.f20936e.get(i2 + 1);
                            l.b(f18, "");
                            floatValue6 = f18.floatValue();
                        }
                        Float f19 = this.f20937f.get(i2 + 1);
                        l.b(f19, "");
                        canvas.drawLine(floatValue5, floatValue7, floatValue6, f19.floatValue(), paint);
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            if (this.f20936e.size() < 2 || this.f20937f.size() < 2) {
                MethodCollector.o(2542);
                return;
            }
            Float f20 = this.f20936e.get(0);
            l.b(f20, "");
            float floatValue8 = f20.floatValue();
            Float f21 = this.t;
            if (f21 != null) {
                f2 = f21.floatValue();
            } else {
                f2 = 0.0f;
            }
            Float f22 = this.f20936e.get(0);
            l.b(f22, "");
            float floatValue9 = f22.floatValue();
            Float f23 = this.s;
            if (f23 != null) {
                f3 = f23.floatValue();
            } else {
                f3 = 0.0f;
            }
            LinearGradient linearGradient = new LinearGradient(floatValue8, f2, floatValue9, f3, Color.parseColor(this.q), Color.parseColor(this.r), Shader.TileMode.CLAMP);
            Paint paint2 = this.f20934c;
            if (paint2 != null) {
                paint2.setShader(linearGradient);
            }
            Path path = new Path();
            if (this.v) {
                Float f24 = this.f20938g;
                if (f24 != null) {
                    f9 = f24.floatValue();
                } else {
                    f9 = 0.0f;
                }
                Float f25 = this.f20936e.get(0);
                l.b(f25, "");
                floatValue = f9 - f25.floatValue();
            } else {
                Float f26 = this.f20936e.get(0);
                l.b(f26, "");
                floatValue = f26.floatValue();
            }
            Float f27 = this.f20937f.get(0);
            l.b(f27, "");
            path.moveTo(floatValue, f27.floatValue());
            int size2 = this.f20932a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (this.v) {
                    Float f28 = this.f20938g;
                    if (f28 != null) {
                        f8 = f28.floatValue();
                    } else {
                        f8 = 0.0f;
                    }
                    Float f29 = this.f20936e.get(i3);
                    l.b(f29, "");
                    floatValue4 = f8 - f29.floatValue();
                } else {
                    Float f30 = this.f20936e.get(i3);
                    l.b(f30, "");
                    floatValue4 = f30.floatValue();
                }
                Float f31 = this.f20937f.get(i3);
                l.b(f31, "");
                path.lineTo(floatValue4, f31.floatValue());
            }
            if (this.v) {
                Float f32 = this.f20938g;
                if (f32 != null) {
                    f7 = f32.floatValue();
                } else {
                    f7 = 0.0f;
                }
                Float f33 = this.f20936e.get(this.f20932a.size() - 1);
                l.b(f33, "");
                floatValue2 = f7 - f33.floatValue();
            } else {
                Float f34 = this.f20936e.get(this.f20932a.size() - 1);
                l.b(f34, "");
                floatValue2 = f34.floatValue();
            }
            Float f35 = this.f20939h;
            if (f35 != null) {
                f4 = f35.floatValue();
            } else {
                f4 = 0.0f - this.f20942k;
            }
            path.lineTo(floatValue2, f4);
            if (this.v) {
                Float f36 = this.f20938g;
                if (f36 != null) {
                    f6 = f36.floatValue();
                } else {
                    f6 = 0.0f;
                }
                Float f37 = this.f20936e.get(0);
                l.b(f37, "");
                floatValue3 = f6 - f37.floatValue();
            } else {
                Float f38 = this.f20936e.get(0);
                l.b(f38, "");
                floatValue3 = f38.floatValue();
            }
            Float f39 = this.f20939h;
            if (f39 != null) {
                f5 = f39.floatValue();
            } else {
                f5 = 0.0f - this.f20942k;
            }
            path.lineTo(floatValue3, f5);
            path.close();
            Paint paint3 = this.f20934c;
            if (paint3 != null) {
                canvas.drawPath(path, paint3);
                MethodCollector.o(2542);
                return;
            }
        }
        MethodCollector.o(2542);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(2528);
        super.onMeasure(i2, i3);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        this.f20938g = Float.valueOf((float) measuredWidth);
        this.f20939h = Float.valueOf((float) measuredHeight);
        Paint paint = this.f20933b;
        if (paint != null) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        }
        Paint paint2 = this.f20933b;
        if (paint2 != null) {
            paint2.setStrokeWidth(this.o);
            MethodCollector.o(2528);
            return;
        }
        MethodCollector.o(2528);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveGiftBoostCardUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(2563);
        setBackgroundColor(-1);
        this.f20933b = new Paint();
        this.f20934c = new Paint();
        this.f20935d = new Paint();
        Paint paint = this.f20934c;
        if (paint != null) {
            paint.setAntiAlias(true);
        }
        Paint paint2 = this.f20934c;
        if (paint2 != null) {
            paint2.setStrokeWidth(3.0f);
        }
        Paint paint3 = this.f20934c;
        if (paint3 != null) {
            paint3.setStyle(Paint.Style.FILL);
        }
        Paint paint4 = this.f20934c;
        if (paint4 != null) {
            paint4.setTextSize(20.0f);
        }
        Paint paint5 = this.f20933b;
        if (paint5 != null) {
            paint5.setColor(Color.parseColor("#FF5A2C"));
        }
        Paint paint6 = this.f20933b;
        if (paint6 != null) {
            paint6.setAntiAlias(true);
        }
        setBackground(context.getResources().getDrawable(R.drawable.bt7));
        MethodCollector.o(2563);
    }
}
