package com.ss.android.ugc.aweme.crossplatform.business;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.a.c;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;

public class e implements g {

    /* renamed from: a  reason: collision with root package name */
    final c f78674a;

    /* renamed from: b  reason: collision with root package name */
    private final BusinessService f78675b = new BusinessService(this);

    static {
        Covode.recordClassIndex(48844);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.business.g
    public final void a() {
        this.f78675b.a(WalletBusiness.class);
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.business.g
    public final <T extends BusinessService.Business> T a(Class<T> cls) {
        return (T) this.f78675b.a(cls);
    }

    e(c cVar) {
        this.f78674a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.business.g
    public final void a(a aVar) {
        if (aVar != null && aVar.f78741a.f78730c != null) {
            int intValue = aVar.f78741a.f78728a.intValue();
            if ((intValue == 3 || intValue == 1) && aVar.f78741a.f78730c.endsWith("pay")) {
                this.f78675b.a(WalletBusiness.class);
            }
        }
    }
}
