package com.ss.android.legoapi.freso;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImpl.FrescoLegoTaskImpl;
import h.f.b.l;

public final class a implements IFrescoLegoTaskApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f59613a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IFrescoLegoTaskApi f59614b;

    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final w a() {
        return this.f59614b.a();
    }

    static {
        Covode.recordClassIndex(36800);
    }

    private a() {
        IFrescoLegoTaskApi b2 = FrescoLegoTaskImpl.b();
        l.b(b2, "");
        this.f59614b = b2;
    }
}
