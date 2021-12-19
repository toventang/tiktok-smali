package com.ss.android.ugc.aweme.commercialize.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.ad;
import h.f.b.l;

public final class a implements ICommerceCommonService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75270a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ICommerceCommonService f75271b;

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final ad a() {
        return this.f75271b.a();
    }

    static {
        Covode.recordClassIndex(46460);
    }

    private a() {
        ICommerceCommonService b2 = CommerceCommonServiceImpl.b();
        l.b(b2, "");
        this.f75271b = b2;
    }
}
