package com.bytedance.android.livesdk.definition;

import com.bytedance.android.live.broadcast.model.n;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public String f16932a;

    /* renamed from: b  reason: collision with root package name */
    public String f16933b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16934c;

    static {
        Covode.recordClassIndex(9405);
    }

    public d() {
    }

    public final String a() {
        String str = this.f16932a;
        if (str == null) {
            l.a(StringSet.name);
        }
        return str;
    }

    public final String b() {
        String str = this.f16933b;
        if (str == null) {
            l.a("sdkKey");
        }
        return str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(n.a aVar) {
        this();
        l.d(aVar, "");
        String str = aVar.f7937a;
        l.b(str, "");
        this.f16932a = str;
        String str2 = aVar.f7938b;
        l.b(str2, "");
        this.f16933b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(LiveCoreSDKData.Quality quality) {
        this();
        l.d(quality, "");
        String str = quality.name;
        l.b(str, "");
        this.f16932a = str;
        String str2 = quality.sdkKey;
        l.b(str2, "");
        this.f16933b = str2;
    }
}
