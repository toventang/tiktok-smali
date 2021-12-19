package com.ss.android.ugc.aweme.ecommerce.delivery.a;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import h.f.b.l;

public final class a extends g implements IEventCenter.b {

    /* renamed from: a  reason: collision with root package name */
    private DeliveryPanelStarter.PackedDeliverySelectResult f85812a = new DeliveryPanelStarter.PackedDeliverySelectResult();

    static {
        Covode.recordClassIndex(53675);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void a(Dialog dialog) {
        l.d(dialog, "");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void e() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final void d() {
        DeliveryPanelStarter.a(this.f85812a);
        EventCenter.a().b("ec_delivery_panel_close", this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.ecommerce.common.a.a aVar, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(aVar, deliveryPanelViewModel);
        l.d(aVar, "");
        l.d(deliveryPanelViewModel, "");
        this.f87186j = false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.delivery.a.g
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        EventCenter.a().a("ec_delivery_panel_close", this);
        if (this.f85823c.getActivity() == null) {
            return null;
        }
        com.ss.android.ugc.aweme.ecommerce.router.view.a i2 = i();
        if (i2 == null) {
            return i2;
        }
        i2.a(this.f85823c);
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (str.hashCode() == -1860001485 && str.equals("ec_delivery_panel_close")) {
            this.f85812a = (DeliveryPanelStarter.PackedDeliverySelectResult) i.a(str2, DeliveryPanelStarter.PackedDeliverySelectResult.class);
            this.f85823c.dismiss();
        }
    }
}
