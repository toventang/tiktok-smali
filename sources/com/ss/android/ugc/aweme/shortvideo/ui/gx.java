package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import dmt.viewpager.DmtRtlViewPager;
import dmt.viewpager.DmtViewPager;
import java.util.ArrayList;
import java.util.Objects;

public class gx extends LinearLayout implements ViewPager.d, ViewPager.e, DmtViewPager.e {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager f131838a;

    /* renamed from: b  reason: collision with root package name */
    public DmtRtlViewPager f131839b;

    /* renamed from: c  reason: collision with root package name */
    int f131840c;

    /* renamed from: d  reason: collision with root package name */
    int f131841d;

    /* renamed from: e  reason: collision with root package name */
    int f131842e;

    /* renamed from: f  reason: collision with root package name */
    int f131843f;

    /* renamed from: g  reason: collision with root package name */
    int f131844g;

    /* renamed from: h  reason: collision with root package name */
    int f131845h;

    /* renamed from: i  reason: collision with root package name */
    DataSetObserver f131846i;

    /* renamed from: j  reason: collision with root package name */
    private b[] f131847j;

    static {
        Covode.recordClassIndex(86377);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public void onPageSelected(int i2) {
    }

    class a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        PagerAdapter f131848a;

        /* renamed from: b  reason: collision with root package name */
        gx f131849b;

        static {
            Covode.recordClassIndex(86378);
        }

        public final void onChanged() {
            if (gx.this.f131838a != null) {
                gx.this.f131838a.requestLayout();
            }
            if (gx.this.f131839b != null) {
                gx.this.f131839b.requestLayout();
            }
            this.f131849b.setUpViews(this.f131848a);
        }

        public final void onInvalidated() {
            if (gx.this.f131838a != null) {
                gx.this.f131838a.requestLayout();
            }
            if (gx.this.f131839b != null) {
                gx.this.f131839b.requestLayout();
            }
            this.f131849b.setUpViews(this.f131848a);
        }

        a(gx gxVar, PagerAdapter pagerAdapter) {
            this.f131848a = pagerAdapter;
            this.f131849b = gxVar;
        }
    }

    public int getCount() {
        PagerAdapter adapter;
        ViewPager viewPager = this.f131838a;
        if (viewPager != null) {
            PagerAdapter adapter2 = viewPager.getAdapter();
            if (adapter2 == null) {
                return 0;
            }
            if (adapter2 instanceof q) {
                return ((q) adapter2).f131887b.getCount();
            }
            return adapter2.getCount();
        }
        DmtRtlViewPager dmtRtlViewPager = this.f131839b;
        if (dmtRtlViewPager == null || (adapter = dmtRtlViewPager.getAdapter()) == null) {
            return 0;
        }
        if (adapter instanceof q) {
            return ((q) adapter).f131887b.getCount();
        }
        return adapter.getCount();
    }

    public static class b extends View {

        /* renamed from: a  reason: collision with root package name */
        Paint f131851a;

        /* renamed from: b  reason: collision with root package name */
        Paint f131852b;

        /* renamed from: c  reason: collision with root package name */
        int f131853c;

        /* renamed from: d  reason: collision with root package name */
        int f131854d;

        /* renamed from: e  reason: collision with root package name */
        int f131855e;

        static {
            Covode.recordClassIndex(86379);
        }

        public final void setFillAlpha(int i2) {
            this.f131853c = i2;
            invalidate();
        }

        public final void setStrokeAlpha(int i2) {
            this.f131854d = i2;
            invalidate();
        }

        public final void setSolidColor(int i2) {
            this.f131851a.setColor(i2);
            invalidate();
        }

        public final void setStrokeColor(int i2) {
            this.f131852b.setColor(i2);
            invalidate();
        }

        public final void setStrokeWidth(int i2) {
            this.f131855e = i2;
            this.f131852b.setStrokeWidth((float) i2);
            invalidate();
        }

        public b(Context context) {
            super(context);
            MethodCollector.i(3776);
            Paint paint = new Paint();
            this.f131851a = paint;
            paint.setAntiAlias(true);
            this.f131851a.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            this.f131852b = paint2;
            paint2.setAntiAlias(true);
            this.f131852b.setStyle(Paint.Style.STROKE);
            MethodCollector.o(3776);
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            int width = getWidth() / 2;
            this.f131851a.setAlpha(this.f131853c);
            float f2 = (float) width;
            canvas.drawCircle(f2, f2, f2, this.f131851a);
            this.f131852b.setAlpha(this.f131854d);
            canvas.drawCircle(f2, f2, (float) (width - (this.f131855e / 2)), this.f131852b);
        }
    }

    public void setOrientation(int i2) {
        super.setOrientation(i2);
        if (i2 == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    public void setUpViewPager(ViewPager viewPager) {
        Objects.requireNonNull(viewPager, "viewPager == null.");
        if (this.f131838a != null) {
            viewPager.removeOnPageChangeListener(this);
            viewPager.removeOnAdapterChangeListener(this);
        }
        this.f131838a = viewPager;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.addOnPageChangeListener(this);
        viewPager.addOnAdapterChangeListener(this);
        if (adapter != null) {
            DataSetObserver dataSetObserver = this.f131846i;
            if (dataSetObserver != null) {
                adapter.unregisterDataSetObserver(dataSetObserver);
            }
            a aVar = new a(this, adapter);
            this.f131846i = aVar;
            adapter.registerDataSetObserver(aVar);
            setUpViews(adapter);
        }
    }

    public void setUpViewPager(DmtRtlViewPager dmtRtlViewPager) {
        Objects.requireNonNull(dmtRtlViewPager, "viewPager == null.");
        if (this.f131839b != null) {
            dmtRtlViewPager.b((ViewPager.e) this);
            if (dmtRtlViewPager.f157023l != null) {
                dmtRtlViewPager.f157023l.remove(this);
            }
        }
        this.f131839b = dmtRtlViewPager;
        PagerAdapter adapter = dmtRtlViewPager.getAdapter();
        dmtRtlViewPager.a((ViewPager.e) this);
        if (dmtRtlViewPager.f157023l == null) {
            dmtRtlViewPager.f157023l = new ArrayList();
        }
        dmtRtlViewPager.f157023l.add(this);
        if (adapter != null) {
            DataSetObserver dataSetObserver = this.f131846i;
            if (dataSetObserver != null) {
                adapter.unregisterDataSetObserver(dataSetObserver);
            }
            a aVar = new a(this, adapter);
            this.f131846i = aVar;
            adapter.registerDataSetObserver(aVar);
            setUpViews(adapter);
        }
    }

    public void setUpViews(PagerAdapter pagerAdapter) {
        int count;
        if (pagerAdapter instanceof q) {
            count = ((q) pagerAdapter).f131887b.getCount();
        } else {
            count = pagerAdapter.getCount();
        }
        removeAllViews();
        this.f131847j = new b[count];
        int i2 = this.f131844g / 2;
        for (int i3 = 0; i3 < count; i3++) {
            b bVar = new b(getContext());
            bVar.setSolidColor(this.f131841d);
            bVar.setStrokeColor(this.f131842e);
            int i4 = this.f131840c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
            if (getOrientation() == 1) {
                layoutParams.setMargins(0, i2, 0, i2);
            } else {
                layoutParams.setMargins(i2, 0, i2, 0);
            }
            addView(bVar, layoutParams);
            this.f131847j[i3] = bVar;
        }
    }

    public gx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // dmt.viewpager.DmtViewPager.e
    public final void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        DataSetObserver dataSetObserver;
        if (!(pagerAdapter == null || (dataSetObserver = this.f131846i) == null)) {
            pagerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
        if (pagerAdapter2 != null) {
            a aVar = new a(this, pagerAdapter2);
            this.f131846i = aVar;
            pagerAdapter2.registerDataSetObserver(aVar);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.d
    public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        DataSetObserver dataSetObserver;
        if (!(pagerAdapter == null || (dataSetObserver = this.f131846i) == null)) {
            pagerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
        if (pagerAdapter2 != null) {
            a aVar = new a(this, pagerAdapter2);
            this.f131846i = aVar;
            pagerAdapter2.registerDataSetObserver(aVar);
        }
    }

    public gx(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(4496);
        this.f131847j = new b[0];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.wp, R.attr.wq, R.attr.wr, R.attr.ws, R.attr.wt, R.attr.wv}, 0, 0);
        this.f131841d = obtainStyledAttributes.getColor(1, -1);
        this.f131842e = obtainStyledAttributes.getColor(3, -1);
        this.f131840c = obtainStyledAttributes.getDimensionPixelSize(0, (int) n.b(context, 4.0f));
        this.f131843f = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        float f2 = 0.5f;
        float f3 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f3 > 0.0f && f3 <= 1.0f) {
            f2 = f3;
        }
        this.f131845h = (int) (f2 * 255.0f);
        this.f131844g = obtainStyledAttributes.getDimensionPixelSize(2, (int) n.b(context, 4.0f));
        obtainStyledAttributes.recycle();
        if (getOrientation() == 0) {
            setGravity(16);
            MethodCollector.o(4496);
            return;
        }
        setGravity(1);
        MethodCollector.o(4496);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public void onPageScrolled(int i2, float f2, int i3) {
        int count = getCount();
        if (count != 0) {
            if (count != this.f131847j.length) {
                ViewPager viewPager = this.f131838a;
                if (viewPager != null) {
                    setUpViews(viewPager.getAdapter());
                }
                DmtRtlViewPager dmtRtlViewPager = this.f131839b;
                if (dmtRtlViewPager != null) {
                    setUpViews(dmtRtlViewPager.getAdapter());
                }
            }
            int i4 = i2 % count;
            b bVar = this.f131847j[i4];
            bVar.setStrokeAlpha(0);
            double d2 = (double) (1.0f - f2);
            Double.isNaN(d2);
            double d3 = (double) this.f131845h;
            Double.isNaN(d3);
            bVar.setFillAlpha((int) (((Math.sin((d2 * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + d3));
            int i5 = (i4 + 1) % count;
            b bVar2 = this.f131847j[i5];
            bVar2.setStrokeAlpha(0);
            double d4 = (double) f2;
            Double.isNaN(d4);
            double d5 = (double) this.f131845h;
            Double.isNaN(d5);
            bVar2.setFillAlpha((int) (((Math.sin((d4 * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + d5));
            for (int i6 = 0; i6 < count; i6++) {
                if (!(i6 == i4 || i6 == i5)) {
                    b bVar3 = this.f131847j[i6];
                    bVar3.setStrokeAlpha(0);
                    bVar3.setFillAlpha(this.f131845h);
                }
            }
        }
    }
}
