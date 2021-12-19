package com.bytedance.ies.xelement.pickview.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.e.a;
import java.util.TimerTask;

public final class c extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    private int f37388a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    private int f37389b;

    /* renamed from: c  reason: collision with root package name */
    private int f37390c;

    /* renamed from: d  reason: collision with root package name */
    private final a f37391d;

    static {
        Covode.recordClassIndex(22473);
    }

    public final void run() {
        if (this.f37388a == Integer.MAX_VALUE) {
            this.f37388a = this.f37390c;
        }
        int i2 = this.f37388a;
        int i3 = (int) (((float) i2) * 0.1f);
        this.f37389b = i3;
        if (i3 == 0) {
            if (i2 < 0) {
                this.f37389b = -1;
            } else {
                this.f37389b = 1;
            }
        }
        if (Math.abs(i2) <= 1) {
            this.f37391d.a();
            this.f37391d.getHandler().sendEmptyMessage(3000);
            return;
        }
        a aVar = this.f37391d;
        aVar.setTotalScrollY(aVar.getTotalScrollY() + ((float) this.f37389b));
        if (!this.f37391d.f37397e) {
            float itemHeight = this.f37391d.getItemHeight();
            float itemsCount = ((float) ((this.f37391d.getItemsCount() - 1) - this.f37391d.getInitPosition())) * itemHeight;
            if (this.f37391d.getTotalScrollY() <= ((float) (-this.f37391d.getInitPosition())) * itemHeight || this.f37391d.getTotalScrollY() >= itemsCount) {
                a aVar2 = this.f37391d;
                aVar2.setTotalScrollY(aVar2.getTotalScrollY() - ((float) this.f37389b));
                this.f37391d.a();
                this.f37391d.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f37391d.getHandler().sendEmptyMessage(1000);
        this.f37388a -= this.f37389b;
    }

    public c(a aVar, int i2) {
        this.f37391d = aVar;
        this.f37390c = i2;
    }
}
