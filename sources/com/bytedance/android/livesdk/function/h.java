package com.bytedance.android.livesdk.function;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.core.h.b.b;
import com.bytedance.android.live.uikit.c.a;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomNotifyWidget.AnonymousClass1 f17797a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17798b;

    static {
        Covode.recordClassIndex(9879);
    }

    h(LiveRoomNotifyWidget.AnonymousClass1 r1, int i2) {
        this.f17797a = r1;
        this.f17798b = i2;
    }

    public final void run() {
        LiveRoomNotifyWidget.AnonymousClass1 r5 = this.f17797a;
        int i2 = this.f17798b;
        if (LiveRoomNotifyWidget.this.isViewValid()) {
            if (LiveRoomNotifyWidget.this.f17762b.getScrollX() != 0 && a.a(LiveRoomNotifyWidget.this.context)) {
                i2 = LiveRoomNotifyWidget.this.f17762b.getScrollX() - i2;
            }
            ObjectAnimator duration = ObjectAnimator.ofInt(LiveRoomNotifyWidget.this.f17762b, "scrollX", i2).setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            duration.setInterpolator(b.a(0.42f, 0.0f, 0.58f, 1.0f));
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.AnonymousClass1.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(9861);
                }

                public final void onAnimationEnd(Animator animator) {
                    View view = LiveRoomNotifyWidget.this.getView();
                    i iVar = new i(this);
                    long j2 = 500;
                    if (LiveRoomNotifyWidget.this.f17766f > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                        j2 = 500 + (LiveRoomNotifyWidget.this.f17766f - InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    }
                    view.postDelayed(iVar, j2);
                }
            });
            duration.start();
        }
    }
}
