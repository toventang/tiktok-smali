package com.bytedance.ies.xelement.pickview.d;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import java.util.TimerTask;

public final class a extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    private float f37384a = 2.14748365E9f;

    /* renamed from: b  reason: collision with root package name */
    private final float f37385b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.ies.xelement.pickview.e.a f37386c;

    static {
        Covode.recordClassIndex(22471);
    }

    public final void run() {
        if (this.f37384a == 2.14748365E9f) {
            float f2 = 2000.0f;
            if (Math.abs(this.f37385b) > 2000.0f) {
                if (this.f37385b <= 0.0f) {
                    f2 = -2000.0f;
                }
                this.f37384a = f2;
            } else {
                this.f37384a = this.f37385b;
            }
        }
        if (Math.abs(this.f37384a) < 0.0f || Math.abs(this.f37384a) > 20.0f) {
            int i2 = (int) (this.f37384a / 100.0f);
            com.bytedance.ies.xelement.pickview.e.a aVar = this.f37386c;
            float f3 = (float) i2;
            aVar.setTotalScrollY(aVar.getTotalScrollY() - f3);
            if (!this.f37386c.f37397e) {
                float itemHeight = this.f37386c.getItemHeight();
                float f4 = ((float) (-this.f37386c.getInitPosition())) * itemHeight;
                float itemsCount = ((float) ((this.f37386c.getItemsCount() - 1) - this.f37386c.getInitPosition())) * itemHeight;
                double totalScrollY = (double) this.f37386c.getTotalScrollY();
                double d2 = (double) itemHeight;
                Double.isNaN(d2);
                double d3 = d2 * 0.25d;
                Double.isNaN(totalScrollY);
                if (totalScrollY - d3 < ((double) f4)) {
                    f4 = this.f37386c.getTotalScrollY() + f3;
                } else {
                    double totalScrollY2 = (double) this.f37386c.getTotalScrollY();
                    Double.isNaN(totalScrollY2);
                    if (totalScrollY2 + d3 > ((double) itemsCount)) {
                        itemsCount = this.f37386c.getTotalScrollY() + f3;
                    }
                }
                if (this.f37386c.getTotalScrollY() <= f4) {
                    this.f37384a = 40.0f;
                    this.f37386c.setTotalScrollY((float) ((int) f4));
                } else if (this.f37386c.getTotalScrollY() >= itemsCount) {
                    this.f37386c.setTotalScrollY((float) ((int) itemsCount));
                    this.f37384a = -40.0f;
                }
            }
            float f5 = this.f37384a;
            if (f5 < 0.0f) {
                this.f37384a = f5 + 20.0f;
            } else {
                this.f37384a = f5 - 20.0f;
            }
            this.f37386c.getHandler().sendEmptyMessage(1000);
            return;
        }
        this.f37386c.a();
        this.f37386c.getHandler().sendEmptyMessage(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    public a(com.bytedance.ies.xelement.pickview.e.a aVar, float f2) {
        this.f37386c = aVar;
        this.f37385b = f2;
    }
}
