package com.ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class e implements ISettingDependService {

    /* renamed from: a  reason: collision with root package name */
    public static final e f122670a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ISettingDependService f122671b;

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final List<String> a() {
        return this.f122671b.a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final List<String> b() {
        return this.f122671b.b();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final String c() {
        return this.f122671b.c();
    }

    static {
        Covode.recordClassIndex(80519);
    }

    private e() {
        ISettingDependService d2 = SettingDependServiceImpl.d();
        l.b(d2, "");
        this.f122671b = d2;
    }
}
