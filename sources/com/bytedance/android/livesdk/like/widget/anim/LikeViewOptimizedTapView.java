package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.g.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedList;

public final class LikeViewOptimizedTapView extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final int f18597c = y.a(42.0f);

    /* renamed from: d  reason: collision with root package name */
    public static final b f18598d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.b<a> f18599a = new f.b<>(10);

    /* renamed from: b  reason: collision with root package name */
    public final LinkedList<a> f18600b = new LinkedList<>();

    static final class b {
        static {
            Covode.recordClassIndex(10431);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(10428);
    }

    public final void a() {
        Iterator<a> it = this.f18600b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            l.b(next, "");
            a aVar = next;
            it.remove();
            this.f18599a.release(aVar);
            a(aVar);
            aVar.f18606f.cancel();
        }
    }

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f18601a;

        /* renamed from: b  reason: collision with root package name */
        public final b f18602b;

        /* renamed from: c  reason: collision with root package name */
        public final b f18603c;

        /* renamed from: d  reason: collision with root package name */
        public final PropertyValuesHolder f18604d;

        /* renamed from: e  reason: collision with root package name */
        public final PropertyValuesHolder f18605e;

        /* renamed from: f  reason: collision with root package name */
        public final AnimatorSet f18606f;

        static {
            Covode.recordClassIndex(10429);
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.anim.LikeViewOptimizedTapView$a$a  reason: collision with other inner class name */
        public static final class C0389a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f18608a;

            static {
                Covode.recordClassIndex(10430);
            }

            C0389a(a aVar) {
                this.f18608a = aVar;
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (LikeViewOptimizedTapView.this.f18600b.contains(this.f18608a)) {
                    LikeViewOptimizedTapView.this.f18600b.remove(this.f18608a);
                    LikeViewOptimizedTapView.this.f18599a.release(this.f18608a);
                    LikeViewOptimizedTapView.this.a(this.f18608a);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
            MethodCollector.i(5180);
            ImageView imageView = new ImageView(LikeViewOptimizedTapView.this.getContext());
            this.f18601a = imageView;
            b bVar = new b();
            this.f18602b = bVar;
            b bVar2 = new b();
            this.f18603c = bVar2;
            Property property = FrameLayout.X;
            Float valueOf = Float.valueOf(0.0f);
            PropertyValuesHolder ofObject = PropertyValuesHolder.ofObject(property, bVar, valueOf, valueOf);
            l.b(ofObject, "");
            this.f18604d = ofObject;
            PropertyValuesHolder ofObject2 = PropertyValuesHolder.ofObject(FrameLayout.Y, bVar2, valueOf, valueOf);
            l.b(ofObject2, "");
            this.f18605e = ofObject2;
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.42857143f, 1.5f), Keyframe.ofFloat(0.71428573f, 1.36f), Keyframe.ofFloat(1.0f, 1.4f)), PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_Y, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.42857143f, 1.5f), Keyframe.ofFloat(0.71428573f, 1.36f), Keyframe.ofFloat(1.0f, 1.4f)));
            ofPropertyValuesHolder.setDuration(350L);
            Property property2 = FrameLayout.ALPHA;
            Keyframe ofFloat = Keyframe.ofFloat(0.33333334f, 0.6f);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(property2, Keyframe.ofFloat(0.0f, 1.0f), ofFloat, Keyframe.ofFloat(1.0f, 0.0f));
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(imageView, ofObject, ofObject2, ofKeyframe, PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_X, Keyframe.ofFloat(0.0f, 1.4f), Keyframe.ofFloat(0.16666667f, 0.5f), Keyframe.ofFloat(1.0f, 0.5f)), PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_Y, Keyframe.ofFloat(0.0f, 1.4f), Keyframe.ofFloat(0.16666667f, 0.5f), Keyframe.ofFloat(1.0f, 0.5f)));
            ofPropertyValuesHolder2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder2.setDuration(1500L);
            animatorSet.playSequentially(ofPropertyValuesHolder, ofPropertyValuesHolder2);
            animatorSet.addListener(new C0389a(this));
            this.f18606f = animatorSet;
            MethodCollector.o(5180);
        }
    }

    public final void a(a aVar) {
        removeView(aVar.f18601a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LikeViewOptimizedTapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(4938);
        MethodCollector.o(4938);
    }
}
