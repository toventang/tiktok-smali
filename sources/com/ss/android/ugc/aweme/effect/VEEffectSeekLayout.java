package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.a.k;
import com.ss.android.ugc.aweme.shortvideo.cut.m;
import com.ss.android.ugc.aweme.shortvideo.ui.z;
import com.ss.android.ugc.aweme.themechange.base.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class VEEffectSeekLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f88758a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<EffectPointModel> f88759b;

    /* renamed from: c  reason: collision with root package name */
    public int f88760c;

    /* renamed from: d  reason: collision with root package name */
    public z f88761d;

    /* renamed from: e  reason: collision with root package name */
    public int f88762e;

    /* renamed from: f  reason: collision with root package name */
    private VEEffectSeekBar f88763f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f88764g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f88765h;

    /* renamed from: i  reason: collision with root package name */
    private FrameLayout f88766i;

    /* renamed from: j  reason: collision with root package name */
    private int f88767j;

    static {
        Covode.recordClassIndex(55842);
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        return this.f88759b;
    }

    public int getCursorPosition() {
        return a(this.f88766i, 1);
    }

    public int getCursorOffsetTime() {
        return (int) ((((float) ((int) n.b(getContext(), 21.0f))) / ((float) d.f88937a)) * ((float) this.f88767j));
    }

    public void setOnCursorSeekListener(z zVar) {
        this.f88761d = zVar;
    }

    public final void a(boolean z) {
        this.f88763f.a(z);
    }

    public void setNormalColor(int i2) {
        this.f88763f.setNormalColor(i2);
    }

    public void setOverlayColor(int i2) {
        this.f88763f.setOverlayColor(i2);
    }

    public final void a(int i2) {
        this.f88759b.remove(e(i2));
        this.f88763f.postInvalidate();
    }

    public final int b(int i2) {
        float b2;
        if (i2 == 1) {
            b2 = n.b(getContext(), 4.0f);
        } else {
            b2 = n.b(getContext(), 30.0f);
        }
        return (int) b2;
    }

    public void setStartTime(int i2) {
        if (i2 > this.f88767j - getCursorOffsetTime()) {
            i2 = this.f88767j;
        }
        this.f88765h.setText(d(i2));
    }

    public void setVideoDuration(int i2) {
        VEEffectSeekBar vEEffectSeekBar = this.f88763f;
        if (vEEffectSeekBar != null) {
            this.f88767j = i2;
            vEEffectSeekBar.setDuration(i2);
            this.f88764g.setText(d(i2));
        }
    }

    private static String d(int i2) {
        StringBuilder sb = new StringBuilder();
        double d2 = (double) i2;
        Double.isNaN(d2);
        String sb2 = sb.append((int) Math.floor(d2 / 1000.0d)).toString();
        if (sb2.length() < 2) {
            sb2 = "0".concat(String.valueOf(sb2));
        }
        return "00:".concat(String.valueOf(sb2));
    }

    private EffectPointModel e(int i2) {
        try {
            ArrayList<EffectPointModel> arrayList = this.f88759b;
            bl blVar = new bl(i2);
            Iterator<T> it = arrayList.iterator();
            k.a(it);
            k.a(blVar);
            while (it.hasNext()) {
                T next = it.next();
                if (blVar.a(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public final void c(int i2) {
        int b2 = d.f88937a - b(1);
        int i3 = (int) ((((float) i2) / ((float) this.f88767j)) * ((float) b2));
        if (i3 >= b2) {
            i3 = this.f88758a + b2;
        }
        if (i3 <= 0) {
            i3 = -this.f88758a;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f88766i.getLayoutParams();
        layoutParams.setMargins(i3, 0, 0, 0);
        this.f88766i.setLayoutParams(layoutParams);
        setStartTime(i2);
    }

    public VEEffectSeekLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    class a implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        private FrameLayout f88769b;

        /* renamed from: c  reason: collision with root package name */
        private RelativeLayout.LayoutParams f88770c;

        /* renamed from: d  reason: collision with root package name */
        private int f88771d = 1;

        static {
            Covode.recordClassIndex(55843);
        }

        a(FrameLayout frameLayout) {
            this.f88769b = frameLayout;
            this.f88770c = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        }

        private float a(float f2, int i2) {
            int b2 = VEEffectSeekLayout.this.b(i2);
            if (f2 < ((float) VEEffectSeekLayout.this.f88762e)) {
                return (float) (-VEEffectSeekLayout.this.f88758a);
            }
            if (f2 > ((float) (((int) n.b(VEEffectSeekLayout.this.getContext(), (float) (VEEffectSeekLayout.this.f88760c - 24))) - b2))) {
                return ((n.b(VEEffectSeekLayout.this.getContext(), (float) VEEffectSeekLayout.this.f88760c) - ((float) (VEEffectSeekLayout.this.f88762e * 2))) - ((float) b2)) + ((float) VEEffectSeekLayout.this.f88758a);
            }
            float f3 = f2 - ((float) VEEffectSeekLayout.this.f88762e);
            return f3 + (((float) VEEffectSeekLayout.this.f88758a) * (((2.0f * f3) / ((n.b(VEEffectSeekLayout.this.getContext(), (float) VEEffectSeekLayout.this.f88760c) - ((float) (VEEffectSeekLayout.this.f88762e * 2))) - ((float) b2))) - 4.0f));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            if (r0 != 3) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effect.VEEffectSeekLayout.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public final void a(int i2, int i3) {
        if (!this.f88759b.isEmpty()) {
            EffectPointModel e2 = e(i2);
            if (e2 != null) {
                e2.setUiEndPoint(i3);
            }
            this.f88763f.postInvalidate();
        }
        c(i3);
    }

    public final int a(FrameLayout frameLayout, int i2) {
        if (frameLayout == null) {
            return 0;
        }
        int left = (int) ((((float) (frameLayout.getLeft() - this.f88762e)) / ((float) d.f88937a)) * ((float) this.f88767j));
        int i3 = this.f88767j;
        int b2 = (int) ((((float) b(i2)) / ((float) d.f88937a)) * ((float) i3));
        if (left < 0) {
            return 0;
        }
        return left > i3 - b2 ? i3 : left;
    }

    public final void a(int i2, long j2) {
        EffectPointModel e2 = e(i2);
        if (e2 != null) {
            e2.setUiEndPoint((int) j2);
            this.f88763f.postInvalidate();
        }
    }

    public final void a(List<EffectPointModel> list, boolean z) {
        this.f88759b.clear();
        this.f88759b.addAll(list);
        this.f88763f.a(this.f88759b, z);
    }

    public final void a(boolean z, int i2) {
        this.f88763f.a(z, i2);
    }

    private VEEffectSeekLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(1684);
        this.f88760c = n.c(context, (float) n.a(context));
        this.f88758a = (int) n.b(context, 0.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.qa, R.attr.qr, R.attr.qs, R.attr.uz, R.attr.v0, R.attr.a1v, R.attr.a5g, R.attr.a5h, R.attr.a6a, R.attr.a7j, R.attr.abv, R.attr.acv, R.attr.af8});
            this.f88762e = Math.round(obtainStyledAttributes.getDimension(11, ((float) Math.round(obtainStyledAttributes.getDimension(5, 0.0f))) - ((float) m.f125471d))) + m.f125471d;
            obtainStyledAttributes.recycle();
        }
        int i2 = Build.VERSION.SDK_INT;
        setLayoutDirection(0);
        LayoutInflater.from(getContext()).inflate(R.layout.et, this);
        this.f88759b = new ArrayList<>();
        this.f88763f = (VEEffectSeekBar) findViewById(R.id.au3);
        this.f88764g = (TextView) findViewById(R.id.ez7);
        this.f88765h = (TextView) findViewById(R.id.f7s);
        this.f88766i = (FrameLayout) findViewById(R.id.doc);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6c});
        int color = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        this.f88763f.setNormalColor(color);
        this.f88766i.setOnTouchListener(new a(this.f88766i));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f88766i.getLayoutParams();
        layoutParams.setMargins(-this.f88758a, 0, 0, 0);
        this.f88766i.setLayoutParams(layoutParams);
        ((ImageView) findViewById(R.id.exn)).setImageDrawable(com.ss.android.ugc.tools.view.a.a(0, -1, 1, (int) n.b(getContext(), 2.0f)));
        findViewById(R.id.uu).setBackground(com.ss.android.ugc.tools.view.a.a(c.a(), 0, (int) n.b(getContext(), 1.0f), 0));
        View findViewById = findViewById(R.id.au4);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        int i3 = this.f88762e;
        layoutParams2.rightMargin = i3;
        layoutParams2.leftMargin = i3;
        findViewById.setLayoutParams(layoutParams2);
        MethodCollector.o(1684);
    }

    public final void a(int i2, long j2, int i3, boolean z) {
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setIndex(i2);
        int i4 = (int) j2;
        effectPointModel.setUiStartPoint(i4);
        effectPointModel.setUiEndPoint(i4);
        effectPointModel.setSelectedColor(i3);
        effectPointModel.setFromEnd(z);
        this.f88759b.add(effectPointModel);
        this.f88763f.a(this.f88759b, z);
    }
}
