package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static Handler f102364a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(65523);
    }

    public static void a(View view) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae.AnonymousClass2 */

            static {
                Covode.recordClassIndex(65526);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    ae.a(true, view);
                } else if (action == 1 || action == 3) {
                    ae.a(false, view);
                }
                return false;
            }
        });
    }

    public static class a implements View.OnTouchListener {
        static {
            Covode.recordClassIndex(65527);
        }

        public final void a(View... viewArr) {
            if (viewArr.length > 0) {
                for (View view : viewArr) {
                    if (view != null) {
                        view.setOnTouchListener(this);
                    }
                }
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                ae.a(true, view);
            } else if (action == 1 || action == 3) {
                ae.a(false, view);
            }
            return false;
        }
    }

    public static void a(boolean z, View view) {
        float f2;
        float[] fArr = new float[2];
        float f3 = 1.0f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 0.5f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }

    public static void a(final int i2, final int i3, View... viewArr) {
        int i4 = 0;
        do {
            final View view = viewArr[i4];
            view.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(65524);
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    view.setBackgroundColor(i3);
                    ae.f102364a.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(65525);
                        }

                        public final void run() {
                            view.setBackgroundColor(i2);
                        }
                    }, 150);
                    return false;
                }
            });
            i4++;
        } while (i4 < 2);
    }
}
