package com.bytedance.scene.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.d.a;
import com.bytedance.scene.d.b;

public abstract class e extends d {
    static {
        Covode.recordClassIndex(26237);
    }

    /* access modifiers changed from: protected */
    public abstract Animator a(a aVar, a aVar2);

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract Animator b(a aVar, a aVar2);

    @Override // com.bytedance.scene.a.d
    public final void a(final a aVar, final a aVar2, final Runnable runnable, b bVar) {
        final a.C1042a aVar3;
        final View view = aVar.f42664b;
        final View view2 = aVar2.f42664b;
        final a.C1042a aVar4 = null;
        if (aVar.f42666d) {
            aVar3 = a.b(view);
        } else {
            a.a(view);
            aVar3 = null;
        }
        if (aVar2.f42666d) {
            aVar4 = a.b(view2);
        } else {
            a.a(view2);
        }
        view.setVisibility(0);
        final float k2 = v.k(view);
        if (k2 > 0.0f) {
            v.a(view, 0.0f);
        }
        final Animator a2 = a(aVar, aVar2);
        if (!a()) {
            a2.setDuration(300);
        }
        a2.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.scene.a.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26238);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!aVar2.f42666d) {
                    view.setVisibility(8);
                }
                float f2 = k2;
                if (f2 > 0.0f) {
                    v.a(view, f2);
                }
                if (aVar.f42666d) {
                    a.a(view, aVar3);
                } else {
                    a.a(view);
                }
                if (aVar2.f42666d) {
                    a.a(view2, aVar4);
                } else {
                    a.a(view2);
                }
                runnable.run();
            }
        });
        a2.start();
        bVar.a(new b.a() {
            /* class com.bytedance.scene.a.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(26239);
            }

            @Override // com.bytedance.scene.d.b.a
            public final void a() {
                a2.end();
            }
        });
    }

    @Override // com.bytedance.scene.a.d
    public final void b(final a aVar, final a aVar2, final Runnable runnable, b bVar) {
        final a.C1042a aVar3;
        final View view = aVar.f42664b;
        final View view2 = aVar2.f42664b;
        final a.C1042a aVar4 = null;
        if (aVar.f42666d) {
            aVar3 = a.b(view);
        } else {
            a.a(view);
            aVar3 = null;
        }
        if (aVar2.f42666d) {
            aVar4 = a.b(view2);
        } else {
            a.a(view2);
        }
        view.setVisibility(0);
        int i2 = Build.VERSION.SDK_INT;
        this.f42680a.getOverlay().add(view);
        final Animator b2 = b(aVar, aVar2);
        if (!a()) {
            b2.setDuration(300);
        }
        b2.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.scene.a.e.AnonymousClass3 */

            static {
                Covode.recordClassIndex(26240);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                MethodCollector.i(11524);
                super.onAnimationEnd(animator);
                if (aVar.f42666d) {
                    a.a(view, aVar3);
                } else {
                    a.a(view);
                }
                if (aVar2.f42666d) {
                    a.a(view2, aVar4);
                } else {
                    a.a(view2);
                }
                int i2 = Build.VERSION.SDK_INT;
                e.this.f42680a.getOverlay().remove(view);
                runnable.run();
                MethodCollector.o(11524);
            }
        });
        b2.start();
        bVar.a(new b.a() {
            /* class com.bytedance.scene.a.e.AnonymousClass4 */

            static {
                Covode.recordClassIndex(26241);
            }

            @Override // com.bytedance.scene.d.b.a
            public final void a() {
                b2.end();
            }
        });
    }
}
