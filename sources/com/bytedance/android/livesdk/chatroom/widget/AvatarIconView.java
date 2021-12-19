package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class AvatarIconView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f16526a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f16527b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f16528c;

    /* renamed from: d  reason: collision with root package name */
    private int f16529d;

    /* renamed from: e  reason: collision with root package name */
    private int f16530e;

    /* renamed from: f  reason: collision with root package name */
    private int f16531f;

    static {
        Covode.recordClassIndex(9164);
    }

    public void setAvatar(int i2) {
        p.a(this.f16526a, i2, -1, -1);
    }

    public void setAvatar(ImageModel imageModel) {
        if (imageModel != null) {
            ImageView imageView = this.f16526a;
            int i2 = this.f16529d;
            g.a(imageView, imageModel, i2, i2, 2131234726);
        }
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (imageModel != null) {
            this.f16527b.setVisibility(0);
            ImageView imageView = this.f16527b;
            int i2 = this.f16530e;
            p.a(imageView, imageModel, i2, i2);
            return;
        }
        this.f16527b.setVisibility(8);
    }

    public void setIcon(ImageModel imageModel) {
        if (imageModel != null) {
            this.f16528c.setVisibility(0);
            ImageView imageView = this.f16528c;
            int i2 = this.f16531f;
            p.b(imageView, imageModel, i2, i2, -1, null);
            return;
        }
        this.f16528c.setVisibility(4);
    }

    public AvatarIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AvatarIconView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(10095);
        this.f16529d = (int) n.b(context, 100.0f);
        this.f16531f = (int) n.b(context, 42.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.an1, R.attr.an2, R.attr.an4});
            this.f16529d = obtainStyledAttributes.getDimensionPixelSize(1, this.f16529d);
            this.f16530e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f16531f = obtainStyledAttributes.getDimensionPixelSize(2, this.f16531f);
            obtainStyledAttributes.recycle();
        }
        this.f16526a = new ImageView(context);
        int i2 = this.f16529d;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        this.f16526a.setLayoutParams(layoutParams);
        addView(this.f16526a);
        this.f16527b = new ImageView(context);
        int i3 = this.f16530e;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i3, i3);
        layoutParams2.gravity = 17;
        this.f16527b.setLayoutParams(layoutParams2);
        addView(this.f16527b);
        this.f16528c = new ImageView(context);
        int i4 = this.f16531f;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i4, i4);
        layoutParams3.bottomMargin = (int) n.b(context, 3.0f);
        layoutParams3.rightMargin = (int) n.b(context, 2.0f);
        layoutParams3.gravity = 8388693;
        this.f16528c.setLayoutParams(layoutParams3);
        addView(this.f16528c);
        this.f16528c.setVisibility(4);
        MethodCollector.o(10095);
    }
}
