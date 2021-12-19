package com.bytedance.android.livesdk.chatroom.widget;

import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.chatroom.widget.CountDownView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;

public final class BroadcastCountDownWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public CountDownView.a f16532a;

    static {
        Covode.recordClassIndex(9165);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b5j;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        if (getView() instanceof CountDownView) {
            View view = getView();
            if (!(view instanceof CountDownView)) {
                view = null;
            }
            CountDownView countDownView = (CountDownView) view;
            if (countDownView != null) {
                countDownView.setCountDownListener(this.f16532a);
                countDownView.setVisibility(0);
                new CountDownTimer((long) countDownView.f16552d) {
                    /* class com.bytedance.android.livesdk.chatroom.widget.CountDownView.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(9173);
                    }

                    public final void onFinish() {
                        CountDownView.this.post(new Runnable() {
                            /* class com.bytedance.android.livesdk.chatroom.widget.CountDownView.AnonymousClass1.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(9175);
                            }

                            public final void run() {
                                MethodCollector.i(9936);
                                ViewGroup viewGroup = (ViewGroup) CountDownView.this.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(CountDownView.this);
                                }
                                MethodCollector.o(9936);
                            }
                        });
                        CountDownView.this.setVisibility(8);
                        if (CountDownView.this.f16551c != null) {
                            CountDownView.this.f16551c.a();
                        }
                    }

                    public final void onTick(long j2) {
                        long j3 = j2 / 1000;
                        CountDownView.this.f16550b.setText(String.valueOf(j3));
                        if (j3 < 2) {
                            CountDownView.this.f16549a.setAnimationListener(new Animation.AnimationListener() {
                                /* class com.bytedance.android.livesdk.chatroom.widget.CountDownView.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(9174);
                                }

                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    CountDownView.this.setVisibility(8);
                                }
                            });
                        }
                        CountDownView.this.f16549a.reset();
                        CountDownView.this.f16550b.startAnimation(CountDownView.this.f16549a);
                    }
                }.start();
            }
        }
    }
}
