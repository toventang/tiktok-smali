package com.ss.android.ugc.aweme.discover.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.ui.aj;

public abstract class c extends aj {

    /* renamed from: a  reason: collision with root package name */
    private int f81610a;

    /* renamed from: b  reason: collision with root package name */
    private int f81611b;

    /* renamed from: c  reason: collision with root package name */
    private long f81612c;

    /* renamed from: d  reason: collision with root package name */
    private a f81613d = new a(new Runnable() {
        /* class com.ss.android.ugc.aweme.discover.m.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(50714);
        }

        public final void run() {
            c.this.a();
            c.this.f81614g = true;
        }
    });

    /* renamed from: g  reason: collision with root package name */
    public boolean f81614g;

    static {
        Covode.recordClassIndex(50713);
    }

    public abstract void a();

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f81622a;

        static {
            Covode.recordClassIndex(50717);
        }

        a(Runnable runnable) {
            this.f81622a = runnable;
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                this.f81622a.run();
            }
            super.handleMessage(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.d.b
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Animator b2 = b(view);
            b2.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.discover.m.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(50715);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            b2.start();
            this.f81610a = (int) motionEvent.getX();
            this.f81611b = (int) motionEvent.getY();
            this.f81612c = System.currentTimeMillis();
            this.f81614g = false;
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.f81613d.sendMessageDelayed(obtain, 500);
            return true;
        }
        if (motionEvent.getAction() == 2) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f81610a) > 50 || Math.abs(y - this.f81611b) > 50) {
                this.f81613d.removeCallbacksAndMessages(null);
            }
        } else if (motionEvent.getAction() == 1) {
            Animator c2 = c(view);
            if ((!this.f81613d.hasMessages(1) && !this.f81614g) || System.currentTimeMillis() - this.f81612c < 500) {
                c2.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.discover.m.c.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(50716);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        c.this.a(view);
                    }
                });
            }
            c2.start();
            this.f81613d.removeCallbacksAndMessages(null);
            return true;
        } else if (motionEvent.getAction() == 3) {
            c(view).start();
            this.f81613d.removeCallbacksAndMessages(null);
        }
        return false;
    }
}
