package com.bytedance.ies.xelement.picker.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.TimerTask;

public final class c extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    private int f37274a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    private int f37275b;

    /* renamed from: c  reason: collision with root package name */
    private int f37276c;

    /* renamed from: d  reason: collision with root package name */
    private final WheelView f37277d;

    static {
        Covode.recordClassIndex(22418);
    }

    public final void run() {
        if (this.f37274a == Integer.MAX_VALUE) {
            this.f37274a = this.f37276c;
        }
        int i2 = this.f37274a;
        int i3 = (int) (((float) i2) * 0.1f);
        this.f37275b = i3;
        if (i3 == 0) {
            if (i2 < 0) {
                this.f37275b = -1;
            } else {
                this.f37275b = 1;
            }
        }
        if (Math.abs(i2) <= 1) {
            this.f37277d.a();
            this.f37277d.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f37277d;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + ((float) this.f37275b));
        if (!this.f37277d.f37283e) {
            float itemHeight = this.f37277d.getItemHeight();
            float itemsCount = ((float) ((this.f37277d.getItemsCount() - 1) - this.f37277d.getInitPosition())) * itemHeight;
            if (this.f37277d.getTotalScrollY() <= ((float) (-this.f37277d.getInitPosition())) * itemHeight || this.f37277d.getTotalScrollY() >= itemsCount) {
                WheelView wheelView2 = this.f37277d;
                wheelView2.setTotalScrollY(wheelView2.getTotalScrollY() - ((float) this.f37275b));
                this.f37277d.a();
                this.f37277d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f37277d.getHandler().sendEmptyMessage(1000);
        this.f37274a -= this.f37275b;
    }

    public c(WheelView wheelView, int i2) {
        this.f37277d = wheelView;
        this.f37276c = i2;
    }
}
