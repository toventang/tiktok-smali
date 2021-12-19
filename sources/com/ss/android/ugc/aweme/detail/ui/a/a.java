package com.ss.android.ugc.aweme.detail.ui.a;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import h.f.b.l;
import java.util.Objects;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C1866a f79906c = new C1866a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f79907a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f79908b;

    static {
        Covode.recordClassIndex(49707);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.a.a$a  reason: collision with other inner class name */
    public static final class C1866a {
        static {
            Covode.recordClassIndex(49708);
        }

        private C1866a() {
        }

        public /* synthetic */ C1866a(byte b2) {
            this();
        }
    }

    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f79909a;

        static {
            Covode.recordClassIndex(49709);
        }

        public b(View view) {
            this.f79909a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            this.f79909a.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    private static boolean b(View view) {
        if (view.getVisibility() == 0 && (view instanceof SimpleDraweeView)) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
            if (simpleDraweeView.getDrawable() != null) {
                Drawable drawable = simpleDraweeView.getDrawable();
                l.b(drawable, "");
                if (!drawable.isVisible()) {
                    simpleDraweeView.getDrawable().setVisible(true, false);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(View view) {
        if (!(view instanceof ViewGroup)) {
            return b(view);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                a(childAt);
            } else {
                l.b(childAt, "");
                z = b(childAt);
            }
        }
        return z;
    }
}
