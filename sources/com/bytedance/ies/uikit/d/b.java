package com.bytedance.ies.uikit.d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b extends Handler {

    /* renamed from: d  reason: collision with root package name */
    private static b f35405d;

    /* renamed from: a  reason: collision with root package name */
    public final Queue<a> f35406a = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    public boolean f35407b;

    /* renamed from: c  reason: collision with root package name */
    public int f35408c = 5;

    static {
        Covode.recordClassIndex(21186);
    }

    public static synchronized b a() {
        synchronized (b.class) {
            MethodCollector.i(12725);
            b bVar = f35405d;
            if (bVar != null) {
                MethodCollector.o(12725);
                return bVar;
            }
            b bVar2 = new b(Looper.getMainLooper());
            f35405d = bVar2;
            MethodCollector.o(12725);
            return bVar2;
        }
    }

    private void b() {
        a peek;
        while (!this.f35406a.isEmpty() && (peek = this.f35406a.peek()) != null) {
            if (peek.e()) {
                peek.d();
                this.f35406a.poll();
            } else if (!peek.c()) {
                Message obtain = Message.obtain();
                obtain.what = 291;
                obtain.obj = peek;
                sendMessage(obtain);
                return;
            } else {
                return;
            }
        }
    }

    private b(Looper looper) {
        super(looper);
    }

    public final void a(Context context) {
        for (a aVar : this.f35406a) {
            if (aVar != null && aVar.f35391a == context) {
                aVar.f35399i = false;
            }
        }
    }

    public final void a(a aVar) {
        if (!this.f35406a.contains(aVar) && this.f35406a.size() <= this.f35408c) {
            this.f35406a.offer(aVar);
            if (!this.f35407b) {
                sendEmptyMessage(1929);
            }
        }
    }

    public final void b(final a aVar) {
        if (!aVar.c() || aVar.e()) {
            aVar.d();
            this.f35407b = false;
            this.f35406a.remove(aVar);
            sendEmptyMessage(1929);
        } else if (!this.f35406a.contains(aVar)) {
            this.f35407b = false;
            removeMessages(1110);
            sendEmptyMessage(1929);
        } else {
            AnimatorSet a2 = aVar.a();
            a2.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.ies.uikit.d.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(21187);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    aVar.f35402l = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    aVar.f35402l = false;
                    aVar.d();
                    b.this.f35407b = false;
                    b.this.removeMessages(1110);
                    b.this.sendEmptyMessage(1929);
                }
            });
            a2.start();
            this.f35406a.poll();
        }
    }

    public final void handleMessage(Message message) {
        MethodCollector.i(12729);
        a aVar = (a) message.obj;
        int i2 = message.what;
        if (i2 == 291) {
            if (!aVar.c()) {
                if (!aVar.e()) {
                    if (aVar.f35396f != null && !m.a(aVar.f35401k)) {
                        aVar.f35396f.setText(aVar.f35401k);
                    }
                    aVar.f35400j = true;
                    aVar.f35392b.removeAllViews();
                    if (aVar.f35395e.getParent() == null) {
                        aVar.f35392b.addView(aVar.f35395e);
                    } else {
                        ((ViewGroup) aVar.f35395e.getParent()).removeView(aVar.f35395e);
                        aVar.f35392b.addView(aVar.f35395e);
                    }
                    if (aVar.o == null) {
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 262280, -2);
                        layoutParams.flags = 262280;
                        layoutParams.gravity = aVar.f35393c;
                        if (layoutParams.gravity == 48) {
                            layoutParams.y = aVar.f35394d[0];
                        }
                        aVar.o = layoutParams;
                    }
                    aVar.n = (WindowManager) a.a(aVar.f35391a, "window");
                    if (aVar.f35392b.getParent() != null) {
                        a.a(aVar.n, aVar.f35392b);
                    }
                    try {
                        WindowManager windowManager = aVar.n;
                        ViewGroup viewGroup = aVar.f35392b;
                        WindowManager.LayoutParams layoutParams2 = aVar.o;
                        if (!((Boolean) a.a(windowManager, new Object[]{viewGroup, layoutParams2}, 102800, "void", false, null).first).booleanValue()) {
                            windowManager.addView(viewGroup, layoutParams2);
                            a.a(null, windowManager, new Object[]{viewGroup, layoutParams2}, 102800, "com_bytedance_ies_uikit_toast_CustomToast_android_view_WindowManager_addView(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V");
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f35407b = true;
                if (aVar.f35397g == null) {
                    aVar.f35397g = new AnimatorSet();
                    aVar.f35397g.playTogether(ObjectAnimator.ofFloat(aVar.f35392b, "translationY", (float) (-aVar.u), 0.0f), ObjectAnimator.ofFloat(aVar.f35392b, "alpha", 0.0f, 1.0f));
                    aVar.f35397g.setInterpolator(new AccelerateDecelerateInterpolator());
                    aVar.f35397g.setDuration(320L);
                }
                aVar.f35397g.start();
                Message obtain = Message.obtain();
                obtain.what = 1110;
                obtain.obj = aVar;
                sendMessageDelayed(obtain, aVar.f35398h);
            }
            MethodCollector.o(12729);
        } else if (i2 != 1110) {
            if (i2 == 1929) {
                b();
            }
            MethodCollector.o(12729);
        } else {
            b(aVar);
            MethodCollector.o(12729);
        }
    }
}
