package com.ss.android.ugc.aweme.kids.homepage.bottomview.a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private ImageView f106554b;

    /* renamed from: c  reason: collision with root package name */
    private final int f106555c = 2131232992;

    /* renamed from: d  reason: collision with root package name */
    private final int f106556d = 2131232993;

    static {
        Covode.recordClassIndex(68087);
    }

    public final int getIconDarkRes() {
        return this.f106555c;
    }

    public final int getIconLightRes() {
        return this.f106556d;
    }

    @Override // com.ss.android.ugc.aweme.kids.homepage.bottomview.a.a
    public final void a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f106554b, "scaleX", 1.0f, 1.2f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f106554b, "scaleY", 1.0f, 1.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(14332);
        View.inflate(context, R.layout.adb, this);
        View findViewById = findViewById(R.id.bgm);
        l.b(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        this.f106554b = imageView;
        imageView.setImageDrawable(androidx.core.content.b.a(context, 2131232992));
        MethodCollector.o(14332);
    }

    @Override // com.ss.android.ugc.aweme.kids.homepage.bottomview.a.a
    public final void a(boolean z) {
        if (z) {
            this.f106554b.setImageDrawable(androidx.core.content.b.a(getContext(), this.f106555c));
        } else {
            this.f106554b.setImageDrawable(androidx.core.content.b.a(getContext(), this.f106556d));
        }
    }
}
