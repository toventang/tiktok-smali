package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class l extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    ImageView f8809g;

    /* renamed from: h  reason: collision with root package name */
    TextView f8810h;

    /* renamed from: i  reason: collision with root package name */
    View f8811i;

    /* renamed from: j  reason: collision with root package name */
    TextView f8812j;

    /* renamed from: k  reason: collision with root package name */
    ImageView f8813k;

    static {
        Covode.recordClassIndex(4496);
    }

    private int getLayoutId() {
        return R.layout.beg;
    }

    public final View getRootView() {
        return this;
    }

    public final ImageView getAlertImageView() {
        return this.f8813k;
    }

    public final TextView getAlertText() {
        return this.f8812j;
    }

    public final ImageView getIconView() {
        return this.f8809g;
    }

    public final View getRedDotView() {
        return this.f8811i;
    }

    public final TextView getTextView() {
        return this.f8810h;
    }

    public final void b() {
        this.f8811i.setVisibility(8);
        this.f8813k.setVisibility(8);
        this.f8812j.setVisibility(8);
    }

    public l(Context context) {
        this(context, (byte) 0);
    }

    public final void setIconMarginTop(int i2) {
        ImageView imageView = this.f8809g;
        if (imageView != null && (imageView.getLayoutParams() instanceof ConstraintLayout.a)) {
            ConstraintLayout.a aVar = (ConstraintLayout.a) this.f8809g.getLayoutParams();
            aVar.topMargin = i2;
            this.f8809g.setLayoutParams(aVar);
        }
    }

    private l(Context context, byte b2) {
        this(context, (char) 0);
    }

    private l(Context context, char c2) {
        super(context, null, 0);
        inflate(getContext(), getLayoutId(), this);
        this.f8809g = (ImageView) findViewById(R.id.enn);
        this.f8810h = (TextView) findViewById(R.id.enm);
        this.f8812j = (TextView) findViewById(R.id.enh);
        this.f8813k = (ImageView) findViewById(R.id.eng);
        this.f8811i = findViewById(R.id.enk);
    }
}
