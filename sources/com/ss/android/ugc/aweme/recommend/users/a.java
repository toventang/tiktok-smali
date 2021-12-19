package com.ss.android.ugc.aweme.recommend.users;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.service.f;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class a implements IRecommendUsersDependentService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120113a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IRecommendUsersDependentService f120114b;

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    public final f a() {
        return this.f120114b.a();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    public final boolean a(boolean z) {
        return this.f120114b.a(z);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    public final boolean b() {
        return this.f120114b.b();
    }

    static {
        Covode.recordClassIndex(78077);
    }

    private a() {
        IRecommendUsersDependentService iRecommendUsersDependentServiceImpl;
        Object a2 = b.a(IRecommendUsersDependentService.class, false);
        if (a2 != null) {
            iRecommendUsersDependentServiceImpl = (IRecommendUsersDependentService) a2;
        } else {
            iRecommendUsersDependentServiceImpl = new IRecommendUsersDependentServiceImpl();
        }
        l.b(iRecommendUsersDependentServiceImpl, "");
        this.f120114b = iRecommendUsersDependentServiceImpl;
    }
}
