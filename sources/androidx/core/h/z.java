package androidx.core.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f2582a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f2583b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f2584c;

    /* renamed from: d  reason: collision with root package name */
    int f2585d = -1;

    static {
        Covode.recordClassIndex(888);
    }

    public final long a() {
        View view = this.f2582a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public final void c() {
        View view = this.f2582a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void b() {
        View view = this.f2582a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public static class a implements aa {

        /* renamed from: a  reason: collision with root package name */
        z f2592a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2593b;

        static {
            Covode.recordClassIndex(891);
        }

        public a(z zVar) {
            this.f2592a = zVar;
        }

        @Override // androidx.core.h.aa
        public final void c(View view) {
            aa aaVar;
            Object tag = view.getTag(2113929216);
            if ((tag instanceof aa) && (aaVar = (aa) tag) != null) {
                aaVar.c(view);
            }
        }

        @Override // androidx.core.h.aa
        public final void a(View view) {
            aa aaVar;
            this.f2593b = false;
            if (this.f2592a.f2585d >= 0) {
                view.setLayerType(2, null);
            }
            if (this.f2592a.f2583b != null) {
                Runnable runnable = this.f2592a.f2583b;
                this.f2592a.f2583b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if ((tag instanceof aa) && (aaVar = (aa) tag) != null) {
                aaVar.a(view);
            }
        }

        @Override // androidx.core.h.aa
        public final void b(View view) {
            aa aaVar;
            if (this.f2592a.f2585d >= 0) {
                view.setLayerType(this.f2592a.f2585d, null);
                this.f2592a.f2585d = -1;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (this.f2592a.f2584c != null) {
                Runnable runnable = this.f2592a.f2584c;
                this.f2592a.f2584c = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if ((tag instanceof aa) && (aaVar = (aa) tag) != null) {
                aaVar.b(view);
            }
            this.f2593b = true;
        }
    }

    z(View view) {
        this.f2582a = new WeakReference<>(view);
    }

    public final z b(float f2) {
        View view = this.f2582a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    public final z a(float f2) {
        View view = this.f2582a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public final z b(long j2) {
        View view = this.f2582a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public final z a(long j2) {
        View view = this.f2582a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public final z a(Interpolator interpolator) {
        View view = this.f2582a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final z a(aa aaVar) {
        View view = this.f2582a.get();
        if (view != null) {
            int i2 = Build.VERSION.SDK_INT;
            a(view, aaVar);
        }
        return this;
    }

    public final z a(final ac acVar) {
        final View view = this.f2582a.get();
        if (view != null) {
            int i2 = Build.VERSION.SDK_INT;
            AnonymousClass2 r1 = null;
            if (acVar != null) {
                r1 = new ValueAnimator.AnimatorUpdateListener() {
                    /* class androidx.core.h.z.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(890);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        acVar.a();
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }

    public final void a(final View view, final aa aaVar) {
        if (aaVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                /* class androidx.core.h.z.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(889);
                }

                public final void onAnimationCancel(Animator animator) {
                    aaVar.c(view);
                }

                public final void onAnimationEnd(Animator animator) {
                    aaVar.b(view);
                }

                public final void onAnimationStart(Animator animator) {
                    aaVar.a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
