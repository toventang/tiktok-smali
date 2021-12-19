package com.bytedance.scene.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Animation f42672a;

    /* renamed from: b  reason: collision with root package name */
    public final Animator f42673b;

    /* renamed from: c  reason: collision with root package name */
    public a f42674c;

    static {
        Covode.recordClassIndex(26220);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f42678a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f42679b;

        static {
            Covode.recordClassIndex(26223);
        }

        public final void a() {
            if (!this.f42679b) {
                this.f42679b = true;
                this.f42678a.run();
            }
        }

        private a(Runnable runnable) {
            if (runnable != null) {
                this.f42678a = runnable;
                return;
            }
            throw new IllegalStateException("runnable cannot be null");
        }

        /* synthetic */ a(Runnable runnable, byte b2) {
            this(runnable);
        }
    }

    public final void a() {
        Animation animation = this.f42672a;
        if (animation != null) {
            animation.cancel();
            this.f42672a.reset();
            a aVar = this.f42674c;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Animator animator = this.f42673b;
        if (animator != null) {
            animator.end();
        }
    }

    private b(Animator animator) {
        this.f42673b = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }

    private b(Animation animation) {
        this.f42672a = animation;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    public final void a(View view) {
        Animation animation = this.f42672a;
        if (animation != null) {
            view.startAnimation(animation);
            return;
        }
        Animator animator = this.f42673b;
        if (animator != null) {
            animator.setTarget(view);
            this.f42673b.start();
        }
    }

    public final void a(Runnable runnable) {
        this.f42674c = new a(runnable, (byte) 0);
        Animation animation = this.f42672a;
        if (animation != null) {
            animation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.bytedance.scene.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26221);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    b.this.f42674c.a();
                    animation.setAnimationListener(null);
                }
            });
            return;
        }
        Animator animator = this.f42673b;
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.scene.a.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(26222);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    b.this.f42674c.a();
                    b.this.f42673b.removeListener(this);
                }
            });
        }
    }

    public static b a(Activity activity, int i2) {
        MethodCollector.i(1933);
        boolean equals = "anim".equals(activity.getResources().getResourceTypeName(i2));
        if (equals) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(activity, i2);
                if (loadAnimation != null) {
                    b bVar = new b(loadAnimation);
                    MethodCollector.o(1933);
                    return bVar;
                }
            } catch (Resources.NotFoundException e2) {
                MethodCollector.o(1933);
                throw e2;
            } catch (RuntimeException unused) {
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("resource is error");
            MethodCollector.o(1933);
            throw illegalArgumentException;
        }
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(activity, i2);
            if (loadAnimator != null) {
                b bVar2 = new b(loadAnimator);
                MethodCollector.o(1933);
                return bVar2;
            }
        } catch (RuntimeException e3) {
            if (!equals) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(activity, i2);
                if (loadAnimation2 != null) {
                    b bVar3 = new b(loadAnimation2);
                    MethodCollector.o(1933);
                    return bVar3;
                }
            } else {
                MethodCollector.o(1933);
                throw e3;
            }
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("resource is error");
        MethodCollector.o(1933);
        throw illegalArgumentException2;
    }
}
