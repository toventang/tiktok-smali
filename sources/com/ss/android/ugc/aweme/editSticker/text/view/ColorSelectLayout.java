package com.ss.android.ugc.aweme.editSticker.text.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColorSelectLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f88620f = {-1, -16777216, -1425344, -27843, -864954, -8863138, -8861530, -13265168, -14400333, -11053355, -469015, -5994149, -13479364, -13670003, -7170146, -13421773};

    /* renamed from: i  reason: collision with root package name */
    private static int f88621i = 16;

    /* renamed from: a  reason: collision with root package name */
    a f88622a;

    /* renamed from: b  reason: collision with root package name */
    c f88623b;

    /* renamed from: c  reason: collision with root package name */
    private Context f88624c;

    /* renamed from: d  reason: collision with root package name */
    private int f88625d;

    /* renamed from: e  reason: collision with root package name */
    private int f88626e = 80;

    /* renamed from: g  reason: collision with root package name */
    private List<a> f88627g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f88628h;

    public interface a {
        static {
            Covode.recordClassIndex(55776);
        }

        void a(int i2);
    }

    public final void a() {
        for (a aVar : this.f88627g) {
            if (aVar.f88645c) {
                a((View) aVar, true);
                aVar.f88645c = false;
            }
        }
    }

    static {
        Covode.recordClassIndex(55775);
    }

    private void b() {
        MethodCollector.i(3778);
        this.f88628h = new LinearLayout(getContext());
        this.f88623b = new c(getContext());
        this.f88623b.addView(this.f88628h, new FrameLayout.LayoutParams(-1, -1));
        int i2 = 0;
        this.f88623b.setHorizontalScrollBarEnabled(false);
        addView(this.f88623b, new FrameLayout.LayoutParams(-1, -1));
        this.f88627g.clear();
        while (true) {
            int[] iArr = f88620f;
            if (i2 < iArr.length) {
                int i3 = this.f88626e;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
                a aVar = new a(this.f88624c);
                aVar.f88644b = iArr[i2];
                aVar.f88643a.setColor(aVar.f88644b);
                aVar.invalidate();
                aVar.setTag(Integer.valueOf(iArr[i2]));
                if (i2 == iArr.length - 1) {
                    layoutParams.rightMargin = (int) r.a(this.f88624c, 12.0f);
                } else {
                    layoutParams.rightMargin = this.f88625d;
                }
                if (i2 == 0) {
                    layoutParams.leftMargin = (int) r.a(this.f88624c, 16.0f);
                } else {
                    layoutParams.leftMargin = (int) r.a(this.f88624c, 2.0f);
                }
                layoutParams.gravity = 16;
                this.f88628h.addView(aVar, layoutParams);
                this.f88627g.add(aVar);
                aVar.setOnClickListener(new b(this, aVar));
                i2++;
            } else {
                MethodCollector.o(3778);
                return;
            }
        }
    }

    public void setColorChangeListener(a aVar) {
        this.f88622a = aVar;
    }

    public void setSelectColorView(int i2) {
        a();
        for (a aVar : this.f88627g) {
            if (aVar != null && aVar.getColor() == i2) {
                a((View) aVar, false);
                aVar.f88645c = true;
                this.f88623b.a(aVar);
                return;
            }
        }
    }

    public void setDefault(int i2) {
        a();
        a aVar = this.f88627g.get(0);
        Iterator<a> it = this.f88627g.iterator();
        while (true) {
            if (it.hasNext()) {
                a next = it.next();
                if (next != null && next.getColor() == i2) {
                    aVar = next;
                    break;
                }
            } else if (aVar == null) {
                return;
            }
        }
        a((View) aVar, false);
        aVar.f88645c = true;
        c cVar = this.f88623b;
        cVar.postDelayed(new e(cVar, aVar), 100);
        int color = aVar.getColor();
        a aVar2 = this.f88622a;
        if (aVar2 != null) {
            aVar2.a(color);
        }
    }

    public final void a(boolean z, int i2) {
        a();
        if (z) {
            setSelectColorView(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(3762);
        super.onMeasure(i2, i3);
        this.f88626e = getMeasuredHeight();
        MethodCollector.o(3762);
    }

    public ColorSelectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3755);
        this.f88624c = context;
        this.f88625d = (int) r.a(context, 6.0f);
        this.f88626e = (int) r.a(context, 30.0f);
        b();
        MethodCollector.o(3755);
    }

    static void a(View view, boolean z) {
        float f2;
        float f3;
        float f4;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f5 = 1.2f;
        if (z) {
            f2 = 1.2f;
        } else {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 1.2f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f4 = 1.2f;
        } else {
            f4 = 1.0f;
        }
        fArr2[0] = f4;
        if (z) {
            f5 = 1.0f;
        }
        fArr2[1] = f5;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fArr2);
        animatorSet.setDuration(200L);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
