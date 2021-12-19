package com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.a;
import com.zhiliaoapp.musically.R;

public class CircularAnimateButton extends AppCompatButton {

    /* renamed from: a  reason: collision with root package name */
    public int f140934a;

    /* renamed from: b  reason: collision with root package name */
    public int f140935b;

    /* renamed from: c  reason: collision with root package name */
    public int f140936c;

    /* renamed from: e  reason: collision with root package name */
    public int f140937e;

    /* renamed from: f  reason: collision with root package name */
    private b f140938f;

    static {
        Covode.recordClassIndex(92028);
    }

    public final void a() {
        int i2 = this.f140937e;
        a a2 = a((float) i2, (float) this.f140934a, i2, this.f140936c);
        a2.f140942d = this.f140935b;
        a2.f140943e = this.f140935b;
        a2.f140944f = 0;
        a2.f140945g = 0;
        a2.a();
    }

    public void setBackgroundCompat(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        setBackground(drawable);
    }

    public void setBackgroundColor(int i2) {
        this.f140935b = i2;
        b a2 = a(i2);
        this.f140938f = a2;
        setBackgroundCompat(a2.f140956c);
    }

    private b a(int i2) {
        GradientDrawable gradientDrawable = (GradientDrawable) a.a(i2, i2, 0, this.f140934a);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius((float) this.f140934a);
        b bVar = new b(gradientDrawable);
        bVar.a(i2);
        bVar.a();
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(this.f140936c, this.f140937e);
    }

    public CircularAnimateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140935b = b.c(context, R.color.bh);
        this.f140934a = (int) n.b(context, 22.0f);
        this.f140936c = (int) n.b(context, 230.0f);
        this.f140937e = (int) n.b(context, 44.0f);
        if (this.f140938f == null) {
            this.f140938f = a(this.f140935b);
        }
        setBackgroundCompat(this.f140938f.f140956c);
    }

    public final a a(float f2, float f3, int i2, int i3) {
        a aVar = new a(this, this.f140938f);
        aVar.f140946h = f2;
        aVar.f140947i = f3;
        aVar.f140940b = i2;
        aVar.f140941c = i3;
        aVar.f140939a = 300;
        return aVar;
    }
}
