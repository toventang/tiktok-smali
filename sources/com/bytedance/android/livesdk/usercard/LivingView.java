package com.bytedance.android.livesdk.usercard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class LivingView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private static final int f21774a = y.a(32.0f);

    /* renamed from: b  reason: collision with root package name */
    private static final int f21775b = y.a(40.0f);

    /* renamed from: c  reason: collision with root package name */
    private static final int f21776c = y.a(48.0f);

    /* renamed from: d  reason: collision with root package name */
    private static final int f21777d = y.a(56.0f);

    /* renamed from: e  reason: collision with root package name */
    private static final int f21778e = y.a(64.0f);

    /* renamed from: f  reason: collision with root package name */
    private static final int f21779f = y.a(68.0f);

    /* renamed from: g  reason: collision with root package name */
    private static final int f21780g = y.a(72.0f);

    /* renamed from: h  reason: collision with root package name */
    private static final int f21781h = y.a(80.0f);

    /* renamed from: i  reason: collision with root package name */
    private static final int f21782i = y.a(13.0f);

    /* renamed from: j  reason: collision with root package name */
    private static final int f21783j = y.a(33.0f);

    /* renamed from: k  reason: collision with root package name */
    private static final int f21784k = y.a(14.0f);

    /* renamed from: l  reason: collision with root package name */
    private static final int f21785l = y.a(50.0f);

    /* renamed from: m  reason: collision with root package name */
    private static final int f21786m = y.a(20.0f);
    private static final int n = y.a(49.5f);
    private static final int o = y.a(21.0f);
    private TextView p;
    private ak q;

    static {
        Covode.recordClassIndex(12833);
    }

    public LivingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        MethodCollector.i(1088);
        this.p.setTextColor(y.b((int) R.color.y2));
        this.p.setBackgroundResource(2131234206);
        this.p.setText(R.string.glz);
        this.p.setGravity(17);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i6 = layoutParams.width;
        int i7 = layoutParams.height;
        float f2 = 10.0f;
        int i8 = 0;
        if (i6 == f21774a) {
            i5 = y.a(5.0f);
            i8 = i6 - (i5 * 2);
            i4 = f21782i;
            f2 = 8.0f;
        } else {
            if (i6 == f21775b) {
                i8 = f21783j;
                i4 = f21784k;
                i5 = (i6 - i8) / 2;
            } else if (i6 == f21776c) {
                i5 = y.a(8.0f);
                i4 = (int) (((float) y.a(6.0f)) + y.b(10.0f));
                i8 = i6 - (i5 * 2);
            } else if (i6 == f21777d) {
                i8 = f21783j;
                i4 = f21784k;
                i5 = (i6 - i8) / 2;
            } else {
                if (i6 == f21779f) {
                    i6 += y.a(8.0f);
                    i7 += y.a(8.0f);
                } else if (i6 == f21780g) {
                    i8 = f21785l;
                    i4 = f21786m;
                    f2 = 12.0f;
                    i5 = (i6 - i8) / 2;
                } else if (i6 == f21781h) {
                    i6 += y.a(8.0f);
                    i7 += y.a(8.0f);
                    f2 = 13.5f;
                    i8 = n;
                    i4 = o;
                    i5 = (i6 - i8) / 2;
                }
                i4 = 0;
                f2 = 0.0f;
                i5 = 0;
            }
            f2 = 9.0f;
        }
        this.q.getLayoutParams().width = i6;
        this.q.getLayoutParams().height = i7;
        this.p.setTextSize(f2);
        this.p.getLayoutParams().width = i8;
        this.p.getLayoutParams().height = i4;
        if (this.p.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) this.p.getLayoutParams()).topMargin = i7 - i4;
            ((FrameLayout.LayoutParams) this.p.getLayoutParams()).leftMargin = i5;
            ((FrameLayout.LayoutParams) this.p.getLayoutParams()).rightMargin = i5;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
        MethodCollector.o(1088);
    }

    private LivingView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, -1);
        MethodCollector.i(1063);
        this.p = new LiveTextView(context);
        ak akVar = new ak(context);
        this.q = akVar;
        addView(akVar);
        addView(this.p);
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        MethodCollector.o(1063);
    }
}
