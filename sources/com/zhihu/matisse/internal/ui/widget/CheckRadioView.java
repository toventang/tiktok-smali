package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;

public class CheckRadioView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f156489a;

    /* renamed from: b  reason: collision with root package name */
    private int f156490b = f.b(getResources(), R.color.a39, getContext().getTheme());

    /* renamed from: c  reason: collision with root package name */
    private int f156491c = f.b(getResources(), R.color.a38, getContext().getTheme());

    static {
        Covode.recordClassIndex(103913);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public void setColor(int i2) {
        if (this.f156489a == null) {
            this.f156489a = getDrawable();
        }
        this.f156489a.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
    }

    public void setChecked(boolean z) {
        if (z) {
            setImageResource(2131232393);
            Drawable drawable = getDrawable();
            this.f156489a = drawable;
            if (drawable != null) {
                drawable.setColorFilter(this.f156490b, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        setImageResource(2131232392);
        Drawable drawable2 = getDrawable();
        this.f156489a = drawable2;
        if (drawable2 != null) {
            drawable2.setColorFilter(this.f156491c, PorterDuff.Mode.SRC_IN);
        }
    }

    public CheckRadioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChecked(false);
    }
}
