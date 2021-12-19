package com.bytedance.android.live.design.view.action;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.a.a.a;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.design.widget.tintable.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class LiveActionButton extends e {

    /* renamed from: a  reason: collision with root package name */
    LiveAutoRtlImageView f9424a;

    /* renamed from: b  reason: collision with root package name */
    TextView f9425b;

    /* renamed from: c  reason: collision with root package name */
    private a f9426c;

    static {
        Covode.recordClassIndex(4804);
    }

    public LiveActionButton(Context context) {
        this(context, null);
    }

    public void setText(int i2) {
        this.f9425b.setText(i2);
    }

    public final void a(int i2) {
        b(i2);
        this.f9426c.a(i2);
    }

    public void setIcon(int i2) {
        setIcon(a.b(getContext(), i2));
    }

    public void setText(CharSequence charSequence) {
        this.f9425b.setText(charSequence);
    }

    public void setIcon(Drawable drawable) {
        this.f9424a.setImageDrawable(drawable);
        if (drawable == null) {
            this.f9424a.setVisibility(8);
            this.f9425b.setGravity(17);
            return;
        }
        this.f9424a.setVisibility(0);
        this.f9425b.setGravity(8388611);
    }

    public LiveActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LiveActionButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        inflate(getContext(), R.layout.ajr, this);
        this.f9424a = (LiveAutoRtlImageView) findViewById(R.id.cbr);
        this.f9425b = (TextView) findViewById(R.id.cbs);
        a aVar = new a(this);
        this.f9426c = aVar;
        aVar.a(attributeSet, R.attr.a30, 0);
    }
}
