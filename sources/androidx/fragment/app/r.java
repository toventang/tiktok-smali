package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class r implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f3054a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f3055b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f3056c;

    static {
        Covode.recordClassIndex(1085);
    }

    public final boolean onPreDraw() {
        a();
        this.f3056c.run();
        return true;
    }

    private void a() {
        if (this.f3055b.isAlive()) {
            this.f3055b.removeOnPreDrawListener(this);
        } else {
            this.f3054a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3054a.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f3055b = view.getViewTreeObserver();
    }

    private r(View view, Runnable runnable) {
        this.f3054a = view;
        this.f3055b = view.getViewTreeObserver();
        this.f3056c = runnable;
    }

    public static r a(View view, Runnable runnable) {
        r rVar = new r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        return rVar;
    }
}
