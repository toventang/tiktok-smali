package com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.a;
import h.f.b.l;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final PopupCardVO f87827a;

    /* renamed from: b  reason: collision with root package name */
    private a f87828b;

    /* renamed from: c  reason: collision with root package name */
    private final long f87829c;

    static {
        Covode.recordClassIndex(55231);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c
    public final a b() {
        return this.f87828b;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.c
    public final boolean a() {
        return this.f87827a.isInStock();
    }

    public b(PopupCardVO popupCardVO, long j2) {
        a aVar;
        l.d(popupCardVO, "");
        this.f87827a = popupCardVO;
        this.f87829c = j2;
        a flashSaleInfo = popupCardVO.getFlashSaleInfo();
        if (flashSaleInfo != null) {
            aVar = new a(j2, flashSaleInfo.f87944a, flashSaleInfo.f87945b);
        } else {
            aVar = null;
        }
        this.f87828b = aVar;
    }
}
