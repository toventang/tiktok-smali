package com.ss.android.ugc.aweme.hybridkit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.w;
import h.f.b.l;

public final class a implements IHybridKitService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f99732a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IHybridKitService f99733b;

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final w a() {
        return this.f99733b.a();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final w b() {
        return this.f99733b.b();
    }

    static {
        Covode.recordClassIndex(63570);
    }

    private a() {
        IHybridKitService c2 = HybridKitTaskImpl.c();
        l.b(c2, "");
        this.f99733b = c2;
    }
}
