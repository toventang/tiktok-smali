package com.bytedance.ies.dmt.ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.b;
import com.zhiliaoapp.musically.R;

public class SettingItem extends a {

    /* renamed from: a  reason: collision with root package name */
    protected FrameLayout f33683a;

    /* renamed from: b  reason: collision with root package name */
    protected ImageView f33684b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f33685c;

    /* renamed from: d  reason: collision with root package name */
    protected ImageView f33686d;

    static {
        Covode.recordClassIndex(20037);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.dmt.ui.widget.setting.a
    public int getRightLayoutId() {
        return R.layout.bi2;
    }

    public View getRightLayout() {
        return this.f33683a;
    }

    @Override // com.bytedance.ies.dmt.ui.widget.setting.a
    public TextView getTxtRight() {
        return this.f33685c;
    }

    @Override // com.bytedance.ies.dmt.ui.widget.setting.a
    public void setRightTxt(String str) {
        super.setRightTxt(str);
        this.f33685c.setText(this.f33688e);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.dmt.ui.widget.setting.a
    public final void a(Context context) {
        super.a(context);
        this.f33684b = (ImageView) this.f33689f.findViewById(R.id.c0o);
        this.f33683a = (FrameLayout) this.f33689f.findViewById(R.id.dnf);
        this.f33685c = (TextView) this.f33689f.findViewById(R.id.f6_);
        this.f33686d = (ImageView) this.f33689f.findViewById(R.id.bzh);
    }

    public SettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.dmt.ui.widget.setting.a
    public final void a(Context context, AttributeSet attributeSet) {
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sv, R.attr.sz, R.attr.t0, R.attr.vk});
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.f33684b.setVisibility(8);
        }
        this.f33685c.setText(this.f33688e);
        if (b.b(context)) {
            i2 = R.drawable.cc4;
        } else {
            i2 = R.drawable.cc6;
        }
        Drawable drawable = getResources().getDrawable(obtainStyledAttributes.getResourceId(0, i2));
        if (drawable != null) {
            this.f33684b.setImageDrawable(drawable);
        }
        this.f33685c.setTextColor(this.p);
        obtainStyledAttributes.recycle();
    }

    public SettingItem(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
    }
}
