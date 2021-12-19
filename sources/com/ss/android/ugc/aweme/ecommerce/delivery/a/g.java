package com.ss.android.ugc.aweme.ecommerce.delivery.a;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.common.a.a;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.router.m;
import h.f.b.l;

public abstract class g extends m {

    /* renamed from: c  reason: collision with root package name */
    public final a f85823c;

    /* renamed from: d  reason: collision with root package name */
    public final DeliveryPanelViewModel f85824d;

    static {
        Covode.recordClassIndex(53696);
    }

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void a();

    public abstract void a(Dialog dialog);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(a aVar, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(null, aVar, 1);
        l.d(aVar, "");
        l.d(deliveryPanelViewModel, "");
        this.f85823c = aVar;
        this.f85824d = deliveryPanelViewModel;
    }
}
