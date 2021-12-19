package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl;
import h.f.a.a;

public enum cf {
    GUEST_MODE_ENABLED("guest_mode", new cy(AccountExperimentLayerServiceImpl.b().a(), 10), true, AnonymousClass1.f69835a),
    DEPRIORITIZE_VK("deprioritize_vk", new cy(AccountExperimentLayerServiceImpl.b().a(), 100), true, AnonymousClass2.f69836a),
    MAKE_LOGIN_PAGE_DEFAULT("make_login_page_default", new cy(AccountExperimentLayerServiceImpl.b().a(), 100), false, AnonymousClass3.f69837a);
    
    private final String id;
    private final boolean newUserOnly;
    private final cy percentAllocation;
    private final a<Boolean> shouldFilterProvider;

    public final String getId() {
        return this.id;
    }

    public final boolean getNewUserOnly() {
        return this.newUserOnly;
    }

    public final cy getPercentAllocation() {
        return this.percentAllocation;
    }

    public final a<Boolean> getShouldFilterProvider() {
        return this.shouldFilterProvider;
    }

    static {
        Covode.recordClassIndex(43069);
    }

    private cf(String str, cy cyVar, boolean z, a aVar) {
        this.id = str;
        this.percentAllocation = cyVar;
        this.newUserOnly = z;
        this.shouldFilterProvider = aVar;
    }
}
