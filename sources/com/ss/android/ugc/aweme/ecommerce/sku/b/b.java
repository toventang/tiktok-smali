package com.ss.android.ugc.aweme.ecommerce.sku.b;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.sku.d;
import com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;

public final class b extends a implements IEventCenter.b {

    /* renamed from: a  reason: collision with root package name */
    public final d f87367a;

    /* renamed from: b  reason: collision with root package name */
    private SkuPanelState f87368b;

    static {
        Covode.recordClassIndex(54855);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void d() {
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f87369a;

        static {
            Covode.recordClassIndex(54856);
        }

        a(b bVar) {
            this.f87369a = bVar;
        }

        public final void run() {
            this.f87369a.f87367a.dismissAllowingStateLoss();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void c() {
        EventCenter.a().b("ec_sku_panel_close", this);
        SkuPanelStarter.a(this.f87368b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(dVar);
        l.d(dVar, "");
        this.f87367a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final void a(View view) {
        l.d(view, "");
        EventCenter.a().a("ec_sku_panel_close", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.b.a
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        if (this.f87367a.getActivity() == null) {
            return null;
        }
        com.ss.android.ugc.aweme.ecommerce.router.view.a i2 = i();
        if (i2 == null) {
            return i2;
        }
        i2.a(this.f87367a);
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (l.a((Object) str, (Object) "ec_sku_panel_close")) {
            try {
                SkuPanelState skuPanelState = (SkuPanelState) dg.a(str2, SkuPanelState.class);
                this.f87368b = skuPanelState;
                if (skuPanelState == null) {
                    return;
                }
                if (skuPanelState.getJumpOSP()) {
                    SkuPanelStarter.a(this.f87368b);
                    new Handler(Looper.getMainLooper()).postDelayed(new a(this), 450);
                    return;
                }
                this.f87367a.dismissAllowingStateLoss();
            } catch (Exception e2) {
                com.bytedance.services.apm.api.a.a((Throwable) e2);
            }
        }
    }
}
