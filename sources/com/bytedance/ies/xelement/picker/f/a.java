package com.bytedance.ies.xelement.picker.f;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.TimerTask;

public final class a extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    private float f37270a = 2.14748365E9f;

    /* renamed from: b  reason: collision with root package name */
    private final float f37271b;

    /* renamed from: c  reason: collision with root package name */
    private final WheelView f37272c;

    static {
        Covode.recordClassIndex(22416);
    }

    public final void run() {
        if (this.f37270a == 2.14748365E9f) {
            float f2 = 2000.0f;
            if (Math.abs(this.f37271b) > 2000.0f) {
                if (this.f37271b <= 0.0f) {
                    f2 = -2000.0f;
                }
                this.f37270a = f2;
            } else {
                this.f37270a = this.f37271b;
            }
        }
        if (Math.abs(this.f37270a) < 0.0f || Math.abs(this.f37270a) > 20.0f) {
            int i2 = (int) (this.f37270a / 100.0f);
            WheelView wheelView = this.f37272c;
            float f3 = (float) i2;
            wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f3);
            if (!this.f37272c.f37283e) {
                float itemHeight = this.f37272c.getItemHeight();
                float f4 = ((float) (-this.f37272c.getInitPosition())) * itemHeight;
                float itemsCount = ((float) ((this.f37272c.getItemsCount() - 1) - this.f37272c.getInitPosition())) * itemHeight;
                double totalScrollY = (double) this.f37272c.getTotalScrollY();
                double d2 = (double) itemHeight;
                Double.isNaN(d2);
                double d3 = d2 * 0.25d;
                Double.isNaN(totalScrollY);
                if (totalScrollY - d3 < ((double) f4)) {
                    f4 = this.f37272c.getTotalScrollY() + f3;
                } else {
                    double totalScrollY2 = (double) this.f37272c.getTotalScrollY();
                    Double.isNaN(totalScrollY2);
                    if (totalScrollY2 + d3 > ((double) itemsCount)) {
                        itemsCount = this.f37272c.getTotalScrollY() + f3;
                    }
                }
                if (this.f37272c.getTotalScrollY() <= f4) {
                    this.f37270a = 40.0f;
                    this.f37272c.setTotalScrollY((float) ((int) f4));
                } else if (this.f37272c.getTotalScrollY() >= itemsCount) {
                    this.f37272c.setTotalScrollY((float) ((int) itemsCount));
                    this.f37270a = -40.0f;
                }
            }
            float f5 = this.f37270a;
            if (f5 < 0.0f) {
                this.f37270a = f5 + 20.0f;
            } else {
                this.f37270a = f5 - 20.0f;
            }
            this.f37272c.getHandler().sendEmptyMessage(1000);
            return;
        }
        this.f37272c.a();
        this.f37272c.getHandler().sendEmptyMessage(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    public a(WheelView wheelView, float f2) {
        this.f37272c = wheelView;
        this.f37271b = f2;
    }
}
