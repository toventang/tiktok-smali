package com.bytedance.ies.xelement.picker.f;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.view.WheelView;

public final class b extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WheelView f37273a;

    static {
        Covode.recordClassIndex(22417);
    }

    public b(WheelView wheelView) {
        this.f37273a = wheelView;
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1000) {
            this.f37273a.invalidate();
        } else if (i2 == 2000) {
            this.f37273a.a(WheelView.a.FLING);
        } else if (i2 == 3000) {
            WheelView wheelView = this.f37273a;
            if (wheelView.f37279a != null) {
                wheelView.postDelayed(new Runnable() {
                    /* class com.bytedance.ies.xelement.picker.view.WheelView.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(22421);
                    }

                    public final void run() {
                        WheelView.this.f37279a.a(WheelView.this.getCurrentItem());
                    }
                }, 200);
            }
        }
    }
}
