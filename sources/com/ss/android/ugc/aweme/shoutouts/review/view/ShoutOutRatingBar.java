package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;

public class ShoutOutRatingBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f133433a;

    /* renamed from: b  reason: collision with root package name */
    boolean f133434b;

    /* renamed from: c  reason: collision with root package name */
    float f133435c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f133436d;

    /* renamed from: e  reason: collision with root package name */
    c f133437e;

    /* renamed from: f  reason: collision with root package name */
    private Context f133438f;

    /* renamed from: g  reason: collision with root package name */
    private int f133439g;

    /* renamed from: h  reason: collision with root package name */
    private a f133440h;

    /* renamed from: i  reason: collision with root package name */
    private b f133441i;

    /* renamed from: j  reason: collision with root package name */
    private float f133442j;

    /* renamed from: k  reason: collision with root package name */
    private float f133443k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f133444l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f133445m;
    private Drawable n;

    public interface a {
        static {
            Covode.recordClassIndex(87267);
        }

        void a(float f2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(87268);
        }
    }

    static {
        Covode.recordClassIndex(87266);
    }

    public float getStarStep() {
        return this.f133435c;
    }

    public enum c {
        Half(0),
        Full(1);
        
        int mStep;

        static {
            Covode.recordClassIndex(87269);
        }

        public static c fromStep(int i2) {
            c[] values = values();
            for (c cVar : values) {
                if (cVar.mStep == i2) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException();
        }

        private c(int i2) {
            this.mStep = i2;
        }
    }

    private ImageView getStarImageView() {
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(this.f133442j), Math.round(this.f133442j));
        layoutParams.setMargins(0, 0, Math.round(this.f133443k), 0);
        autoRTLImageView.setLayoutParams(layoutParams);
        autoRTLImageView.setAdjustViewBounds(true);
        autoRTLImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        autoRTLImageView.setImageDrawable(this.f133444l);
        autoRTLImageView.setMinimumWidth(10);
        autoRTLImageView.setMaxHeight(10);
        return autoRTLImageView;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        MethodCollector.i(4355);
        super.onFinishInflate();
        if (this.f133438f != null) {
            setOrientation(1);
            LinearLayout linearLayout = new LinearLayout(this.f133438f);
            this.f133433a = linearLayout;
            linearLayout.setGravity(17);
            for (int i2 = 0; i2 < this.f133439g; i2++) {
                ImageView starImageView = getStarImageView();
                starImageView.setImageDrawable(this.f133444l);
                starImageView.setOnClickListener(new a(this, starImageView));
                this.f133433a.addView(starImageView);
            }
            setStar(this.f133435c);
            addView(this.f133433a, new LinearLayout.LayoutParams(-1, -2));
        }
        MethodCollector.o(4355);
    }

    public void setClickable(boolean z) {
        this.f133434b = z;
    }

    public void setOnRatingChangeListener(a aVar) {
        this.f133440h = aVar;
    }

    public void setStarCount(int i2) {
        this.f133439g = i2;
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.f133444l = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.f133445m = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.f133436d = drawable;
    }

    public void setStarIdleDrawable(Drawable drawable) {
        this.n = drawable;
    }

    public void setStarImageSize(float f2) {
        this.f133442j = f2;
    }

    public void setStarPadding(float f2) {
        this.f133443k = f2;
    }

    public void setStarStep(float f2) {
        this.f133435c = f2;
    }

    public void setUnClickableClickListener(b bVar) {
        this.f133441i = bVar;
    }

    public void setStepSize(int i2) {
        this.f133437e = c.fromStep(i2);
    }

    public void setStar(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        int i2 = this.f133439g;
        if (f2 > ((float) i2)) {
            f2 = (float) i2;
        }
        a aVar = this.f133440h;
        if (aVar != null) {
            aVar.a(f2);
        }
        int i3 = 0;
        if (f2 == 0.0f) {
            while (i3 < this.f133439g) {
                ((ImageView) this.f133433a.getChildAt(i3)).setImageDrawable(this.n);
                i3++;
            }
            return;
        }
        this.f133435c = f2;
        int i4 = (int) f2;
        float floatValue = new BigDecimal(Float.toString(f2)).subtract(new BigDecimal(Integer.toString(i4))).floatValue();
        while (i3 < i4) {
            ((ImageView) this.f133433a.getChildAt(i3)).setImageDrawable(this.f133445m);
            i3++;
        }
        for (int i5 = i4; i5 < this.f133439g; i5++) {
            ((ImageView) this.f133433a.getChildAt(i5)).setImageDrawable(this.f133444l);
        }
        if (floatValue > 0.0f) {
            ((ImageView) this.f133433a.getChildAt(i4)).setImageDrawable(this.f133436d);
        }
    }

    public ShoutOutRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(4340);
        this.f133438f = context;
        setOrientation(0);
        if (attributeSet == null) {
            MethodCollector.o(4340);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nu, R.attr.aey, R.attr.aez, R.attr.af0, R.attr.af1, R.attr.af2, R.attr.af3, R.attr.af4, R.attr.af5, R.attr.af6});
        this.f133442j = obtainStyledAttributes.getDimension(5, 20.0f);
        this.f133443k = obtainStyledAttributes.getDimension(6, 10.0f);
        this.f133435c = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f133439g = obtainStyledAttributes.getInteger(1, 5);
        this.f133444l = obtainStyledAttributes.getDrawable(2);
        this.f133445m = obtainStyledAttributes.getDrawable(3);
        this.f133436d = obtainStyledAttributes.getDrawable(4);
        this.n = obtainStyledAttributes.getDrawable(9);
        this.f133434b = obtainStyledAttributes.getBoolean(0, true);
        this.f133437e = c.fromStep(obtainStyledAttributes.getInt(8, 1));
        if (this.n == null) {
            this.n = getResources().getDrawable(2131233817);
        }
        if (this.f133444l == null) {
            this.f133444l = getResources().getDrawable(2131233814);
        }
        if (this.f133445m == null) {
            this.f133445m = getResources().getDrawable(2131233815);
        }
        if (this.f133436d == null) {
            this.f133436d = getResources().getDrawable(2131233816);
        }
        obtainStyledAttributes.recycle();
        MethodCollector.o(4340);
    }
}
