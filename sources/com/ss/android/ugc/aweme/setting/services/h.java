package com.ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.UpdateSettingServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import h.f.b.l;
import org.json.JSONObject;

public final class h implements IUpdateSettingService {

    /* renamed from: a  reason: collision with root package name */
    public static final h f122675a = new h();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IUpdateSettingService f122676b;

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final f a() {
        return this.f122676b.a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void a(String str, int i2) {
        this.f122676b.a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void a(JSONObject jSONObject) {
        this.f122676b.a(jSONObject);
    }

    static {
        Covode.recordClassIndex(80522);
    }

    private h() {
        IUpdateSettingService b2 = UpdateSettingServiceImpl.b();
        l.b(b2, "");
        this.f122676b = b2;
    }
}
