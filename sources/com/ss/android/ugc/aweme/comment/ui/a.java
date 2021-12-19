package com.ss.android.ugc.aweme.comment.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f72484b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final View f72485a;

    /* renamed from: c  reason: collision with root package name */
    private final MentionEditText f72486c;

    /* renamed from: d  reason: collision with root package name */
    private final ImageView f72487d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f72488e;

    /* renamed from: f  reason: collision with root package name */
    private final SmartImageView f72489f;

    /* renamed from: g  reason: collision with root package name */
    private final LinearLayout f72490g;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.a$a  reason: collision with other inner class name */
    public static final class animation.InterpolatorC1626a implements Interpolator {
        static {
            Covode.recordClassIndex(44676);
        }

        public final float getInterpolation(float f2) {
            if (f2 == 0.0f) {
                return 0.0f;
            }
            return f2 <= 0.72f ? (f2 / 0.72f) * 1.14f : f2 <= 0.88f ? (((0.88f - f2) / 0.16f) * 0.20999998f) + 0.93f : 1.0f - (((1.0f - f2) / 0.12f) * 0.06999999f);
        }
    }

    static {
        Covode.recordClassIndex(44675);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(44677);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f72486c.setVisibility(8);
        this.f72490g.setVisibility(8);
        this.f72487d.setVisibility(8);
        this.f72488e.setVisibility(8);
        this.f72489f.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f72491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup.MarginLayoutParams f72492b;

        static {
            Covode.recordClassIndex(44678);
        }

        c(a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f72491a = aVar;
            this.f72492b = marginLayoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f72492b;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            marginLayoutParams.setMarginEnd(((Integer) animatedValue).intValue());
            this.f72491a.f72485a.setLayoutParams(this.f72492b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f72493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup.MarginLayoutParams f72494b;

        static {
            Covode.recordClassIndex(44679);
        }

        d(a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f72493a = aVar;
            this.f72494b = marginLayoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f72494b;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            marginLayoutParams.setMarginStart(((Integer) animatedValue).intValue());
            this.f72493a.f72485a.setLayoutParams(this.f72494b);
        }
    }

    public a(ConstraintLayout constraintLayout) {
        l.d(constraintLayout, "");
        View findViewById = constraintLayout.findViewById(R.id.a_7);
        l.b(findViewById, "");
        this.f72486c = (MentionEditText) findViewById;
        View findViewById2 = constraintLayout.findViewById(R.id.aa2);
        l.b(findViewById2, "");
        this.f72487d = (ImageView) findViewById2;
        View findViewById3 = constraintLayout.findViewById(R.id.dlj);
        l.b(findViewById3, "");
        this.f72488e = (ImageView) findViewById3;
        View findViewById4 = constraintLayout.findViewById(R.id.a9v);
        l.b(findViewById4, "");
        this.f72489f = (SmartImageView) findViewById4;
        View findViewById5 = constraintLayout.findViewById(R.id.biv);
        l.b(findViewById5, "");
        this.f72490g = (LinearLayout) findViewById5;
        View findViewById6 = constraintLayout.findViewById(R.id.c5j);
        l.b(findViewById6, "");
        this.f72485a = findViewById6;
    }

    public final void a(boolean z, int i2) {
        ValueAnimator ofInt;
        ViewGroup.LayoutParams layoutParams = this.f72485a.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i2 == 0) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            marginLayoutParams.setMarginStart(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
            this.f72485a.setLayoutParams(marginLayoutParams);
        } else if (i2 == 2) {
            if (z) {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                Resources system3 = Resources.getSystem();
                l.a((Object) system3, "");
                ofInt = ValueAnimator.ofInt(h.g.a.a(TypedValue.applyDimension(1, 114.0f, system2.getDisplayMetrics())), h.g.a.a(TypedValue.applyDimension(1, 52.0f, system3.getDisplayMetrics())));
                l.b(ofInt, "");
            } else {
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                Resources system5 = Resources.getSystem();
                l.a((Object) system5, "");
                ofInt = ValueAnimator.ofInt(h.g.a.a(TypedValue.applyDimension(1, 52.0f, system4.getDisplayMetrics())), h.g.a.a(TypedValue.applyDimension(1, 114.0f, system5.getDisplayMetrics())));
                l.b(ofInt, "");
            }
            ofInt.addUpdateListener(new d(this, marginLayoutParams));
            ofInt.setDuration(300L).start();
        }
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        int a2;
        int[] iArr;
        float applyDimension;
        int a3;
        int a4;
        ViewGroup.LayoutParams layoutParams = this.f72485a.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z3) {
            if (z) {
                iArr = new int[2];
                if (z2) {
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    a4 = h.g.a.a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()));
                } else {
                    Resources system2 = Resources.getSystem();
                    l.a((Object) system2, "");
                    a4 = h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics()));
                }
                iArr[0] = a4;
                Resources system3 = Resources.getSystem();
                l.a((Object) system3, "");
                a3 = h.g.a.a(TypedValue.applyDimension(1, 52.0f, system3.getDisplayMetrics()));
            } else {
                iArr = new int[2];
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                iArr[0] = h.g.a.a(TypedValue.applyDimension(1, 52.0f, system4.getDisplayMetrics()));
                if (z2) {
                    Resources system5 = Resources.getSystem();
                    l.a((Object) system5, "");
                    applyDimension = TypedValue.applyDimension(1, 14.0f, system5.getDisplayMetrics());
                } else {
                    Resources system6 = Resources.getSystem();
                    l.a((Object) system6, "");
                    applyDimension = TypedValue.applyDimension(1, 12.0f, system6.getDisplayMetrics());
                }
                a3 = h.g.a.a(applyDimension);
            }
            iArr[1] = a3;
            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
            l.b(ofInt, "");
            ofInt.addUpdateListener(new c(this, marginLayoutParams));
            ofInt.setDuration(200L).start();
            return;
        }
        if (z) {
            Resources system7 = Resources.getSystem();
            l.a((Object) system7, "");
            a2 = h.g.a.a(TypedValue.applyDimension(1, 52.0f, system7.getDisplayMetrics()));
        } else if (z2) {
            Resources system8 = Resources.getSystem();
            l.a((Object) system8, "");
            a2 = h.g.a.a(TypedValue.applyDimension(1, 14.0f, system8.getDisplayMetrics()));
        } else {
            Resources system9 = Resources.getSystem();
            l.a((Object) system9, "");
            a2 = h.g.a.a(TypedValue.applyDimension(1, 12.0f, system9.getDisplayMetrics()));
        }
        marginLayoutParams.setMarginEnd(a2);
        this.f72485a.setLayoutParams(marginLayoutParams);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.f72487d.setVisibility(0);
            b(true, z3, z2);
            if (z2) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.f72487d, View.SCALE_X, 0.0f, this.f72487d.getScaleX()).setDuration(250L);
                l.b(duration, "");
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f72487d, View.SCALE_Y, 0.0f, this.f72487d.getScaleY()).setDuration(250L);
                l.b(duration2, "");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new animation.InterpolatorC1626a());
                animatorSet.playTogether(duration, duration2);
                animatorSet.start();
            }
            this.f72486c.setHint("");
            this.f72486c.setMaxLines(4);
            return;
        }
        this.f72487d.setVisibility(8);
        b(false, z3, z2);
        this.f72486c.setMaxLines(1);
        this.f72486c.setEllipsize(TextUtils.TruncateAt.END);
    }
}
