package com.ss.android.ugc.aweme.notification.view.template;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class NoticeTemplateBottomView extends FrameLayout implements b {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.notification.h.a.a f113982a;

    /* renamed from: b  reason: collision with root package name */
    public a f113983b;

    /* renamed from: c  reason: collision with root package name */
    private final h f113984c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f113985d;

    static {
        Covode.recordClassIndex(73285);
    }

    public NoticeTemplateBottomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f113985d == null) {
            this.f113985d = new SparseArray();
        }
        View view = (View) this.f113985d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f113985d.put(i2, findViewById);
        return findViewById;
    }

    private final AnimatorSet getAnimatorSet() {
        return (AnimatorSet) this.f113984c.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    static final class a extends m implements h.f.a.a<AnimatorSet> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113986a = new a();

        static {
            Covode.recordClassIndex(73286);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimatorSet invoke() {
            return new AnimatorSet();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.b
    public final void a() {
        com.ss.android.ugc.aweme.notification.h.a.a aVar = this.f113982a;
        if (aVar != null) {
            aVar.r();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.b
    public final NoticeTemplateBottomButton getNegativeButton() {
        NoticeTemplateBottomButton noticeTemplateBottomButton = (NoticeTemplateBottomButton) a(R.id.cu4);
        l.b(noticeTemplateBottomButton, "");
        return noticeTemplateBottomButton;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.b
    public final NoticeTemplateBottomButton getPositiveButton() {
        NoticeTemplateBottomButton noticeTemplateBottomButton = (NoticeTemplateBottomButton) a(R.id.d7p);
        l.b(noticeTemplateBottomButton, "");
        return noticeTemplateBottomButton;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.b
    public final void b() {
        if (!getAnimatorSet().isRunning()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f);
            l.b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ValueAnimator ofInt = ValueAnimator.ofInt(getHeight(), 0);
            l.b(ofInt, "");
            ofInt.setInterpolator(com.bytedance.tux.a.a.a.b());
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new b(this));
            getAnimatorSet().play(ofInt).with(ofFloat);
            getAnimatorSet().start();
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoticeTemplateBottomView f113987a;

        static {
            Covode.recordClassIndex(73287);
        }

        b(NoticeTemplateBottomView noticeTemplateBottomView) {
            this.f113987a = noticeTemplateBottomView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            NoticeTemplateBottomView noticeTemplateBottomView = this.f113987a;
            ViewGroup.LayoutParams layoutParams = noticeTemplateBottomView.getLayoutParams();
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            noticeTemplateBottomView.setLayoutParams(layoutParams);
        }
    }

    private /* synthetic */ NoticeTemplateBottomView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeTemplateBottomView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3744);
        this.f113984c = i.a((h.f.a.a) a.f113986a);
        com.a.a(LayoutInflater.from(context), R.layout.l6, this, true);
        MethodCollector.o(3744);
    }
}
