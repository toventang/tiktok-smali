package com.ss.android.ugc.aweme.main.experiment;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.services.MainFragmentCacheExpServiceImpl;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class d implements IMainFragmentCacheExpService {

    /* renamed from: a  reason: collision with root package name */
    public static final d f109248a = new d();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IMainFragmentCacheExpService f109249b;

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final q a() {
        return this.f109249b.a();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final q b() {
        return this.f109249b.b();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final q c() {
        return this.f109249b.c();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final View d() {
        return this.f109249b.d();
    }

    static {
        Covode.recordClassIndex(69959);
    }

    private d() {
        IMainFragmentCacheExpService mainFragmentCacheExpServiceImpl;
        Object a2 = b.a(IMainFragmentCacheExpService.class, false);
        if (a2 != null) {
            mainFragmentCacheExpServiceImpl = (IMainFragmentCacheExpService) a2;
        } else {
            mainFragmentCacheExpServiceImpl = new MainFragmentCacheExpServiceImpl();
        }
        l.b(mainFragmentCacheExpServiceImpl, "");
        this.f109249b = mainFragmentCacheExpServiceImpl;
    }
}
