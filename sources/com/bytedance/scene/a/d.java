package com.bytedance.scene.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.b;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f42680a;

    static {
        Covode.recordClassIndex(26227);
    }

    public abstract void a(a aVar, a aVar2, Runnable runnable, b bVar);

    public abstract void b(a aVar, a aVar2, Runnable runnable, b bVar);

    public static void a(final View view, b bVar, final Runnable runnable) {
        if (view == view.getRootView()) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.bytedance.scene.a.d.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(26234);
                }

                public final boolean onPreDraw() {
                    if (atomicBoolean.get()) {
                        return false;
                    }
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                        return true;
                    }
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
            final AnonymousClass8 r2 = new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.bytedance.scene.a.d.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(26235);
                }

                public final void onGlobalLayout() {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    } else {
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    atomicBoolean.set(false);
                    runnable.run();
                }
            };
            bVar.a(new b.a() {
                /* class com.bytedance.scene.a.d.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(26236);
                }

                @Override // com.bytedance.scene.d.b.a
                public final void a() {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(r2);
                    } else {
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(r2);
                    }
                    atomicBoolean.set(false);
                    runnable.run();
                }
            });
            viewTreeObserver.addOnGlobalLayoutListener(r2);
            return;
        }
        throw new IllegalArgumentException("Need View.getRootView()");
    }
}
