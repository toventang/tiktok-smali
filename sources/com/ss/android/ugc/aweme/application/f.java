package com.ss.android.ugc.aweme.application;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;

public abstract class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private LocalTestApi f66936a;

    static {
        Covode.recordClassIndex(41253);
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public String a(String str) {
        return str;
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public void a() {
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public void a(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public void a(Configuration configuration) {
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public void b() {
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public void b(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public boolean c() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public Resources a(Resources resources) {
        if (this.f66936a == null) {
            this.f66936a = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        }
        LocalTestApi localTestApi = this.f66936a;
        if (localTestApi != null) {
            return localTestApi.getTranslationProxyResource(resources);
        }
        return resources;
    }
}
