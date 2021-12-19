package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.helper.n;
import com.ss.android.ugc.aweme.feed.helper.q;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;

public final class bi extends LinearLayout implements n {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f94367a;

    /* renamed from: b  reason: collision with root package name */
    boolean f94368b;

    /* renamed from: c  reason: collision with root package name */
    float f94369c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f94370d;

    /* renamed from: e  reason: collision with root package name */
    c f94371e;

    /* renamed from: f  reason: collision with root package name */
    private Context f94372f;

    /* renamed from: g  reason: collision with root package name */
    private int f94373g;

    /* renamed from: h  reason: collision with root package name */
    private a f94374h;

    /* renamed from: i  reason: collision with root package name */
    private b f94375i;

    /* renamed from: j  reason: collision with root package name */
    private float f94376j;

    /* renamed from: k  reason: collision with root package name */
    private float f94377k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f94378l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f94379m;
    private TuxTextView n;
    private q o;

    public interface a {
        static {
            Covode.recordClassIndex(59943);
        }

        void a(float f2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(59944);
        }
    }

    static {
        Covode.recordClassIndex(59942);
    }

    public final q getOptionClickListener() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    public enum c {
        Half(0),
        Full(1);
        
        int mStep;

        static {
            Covode.recordClassIndex(59945);
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
        MethodCollector.i(7725);
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(this.f94376j), Math.round(this.f94376j));
        layoutParams.setMargins(0, 0, Math.round(this.f94377k), 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageDrawable(this.f94378l);
        imageView.setMinimumWidth(10);
        imageView.setMaxHeight(10);
        MethodCollector.o(7725);
        return imageView;
    }

    public final void a() {
        MethodCollector.i(7650);
        if (this.f94372f == null) {
            MethodCollector.o(7650);
            return;
        }
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(this.f94372f);
        this.f94367a = linearLayout;
        linearLayout.setGravity(17);
        for (int i2 = 0; i2 < this.f94373g; i2++) {
            ImageView starImageView = getStarImageView();
            starImageView.setImageDrawable(this.f94378l);
            starImageView.setOnClickListener(new bj(this, starImageView));
            this.f94367a.addView(starImageView);
        }
        setStar(this.f94369c);
        addView(this.f94367a, new LinearLayout.LayoutParams(-1, -2));
        if (this.f94372f != null) {
            TuxTextView tuxTextView = new TuxTextView(this.f94372f);
            this.n = tuxTextView;
            tuxTextView.setTextColor(androidx.core.content.b.c(this.f94372f, R.color.c5));
            this.n.setTuxFont(61);
            this.n.setGravity(17);
            this.n.setPadding(0, (int) com.bytedance.common.utility.n.b(this.f94372f, 4.0f), 0, 0);
            addView(this.n, new LinearLayout.LayoutParams(-1, -2));
        }
        MethodCollector.o(7650);
    }

    public final void setClickable(boolean z) {
        this.f94368b = z;
    }

    public final void setOnRatingChangeListener(a aVar) {
        this.f94374h = aVar;
    }

    @Override // com.ss.android.ugc.aweme.feed.helper.n
    public final void setOptionListener(q qVar) {
        this.o = qVar;
    }

    public final void setStarCount(int i2) {
        this.f94373g = i2;
    }

    public final void setStarEmptyDrawable(Drawable drawable) {
        this.f94378l = drawable;
    }

    public final void setStarFillDrawable(Drawable drawable) {
        this.f94379m = drawable;
    }

    public final void setStarHalfDrawable(Drawable drawable) {
        this.f94370d = drawable;
    }

    public final void setStarImageSize(float f2) {
        this.f94376j = f2;
    }

    public final void setStarPadding(float f2) {
        this.f94377k = f2;
    }

    public final void setStarStep(float f2) {
        this.f94369c = f2;
    }

    public final void setUnClickableClickListener(b bVar) {
        this.f94375i = bVar;
    }

    public bi(Context context) {
        this(context, (byte) 0);
        this.f94372f = context;
    }

    public final void setOption(String str) {
        TuxTextView tuxTextView = this.n;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void setStepSize(int i2) {
        this.f94371e = c.fromStep(i2);
    }

    public final void setStar(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        int i2 = this.f94373g;
        if (f2 > ((float) i2)) {
            f2 = (float) i2;
        }
        a aVar = this.f94374h;
        if (aVar != null) {
            aVar.a(f2);
        }
        this.f94369c = f2;
        int i3 = (int) f2;
        float floatValue = new BigDecimal(Float.toString(f2)).subtract(new BigDecimal(Integer.toString(i3))).floatValue();
        for (int i4 = 0; i4 < i3; i4++) {
            ((ImageView) this.f94367a.getChildAt(i4)).setImageDrawable(this.f94379m);
        }
        for (int i5 = i3; i5 < this.f94373g; i5++) {
            ((ImageView) this.f94367a.getChildAt(i5)).setImageDrawable(this.f94378l);
        }
        if (floatValue > 0.0f) {
            ((ImageView) this.f94367a.getChildAt(i3)).setImageDrawable(this.f94370d);
        }
    }

    private bi(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(7575);
        this.f94372f = context;
        setOrientation(0);
        MethodCollector.o(7575);
    }
}
