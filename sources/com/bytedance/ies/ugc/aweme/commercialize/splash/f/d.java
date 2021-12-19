package com.bytedance.ies.ugc.aweme.commercialize.splash.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.c;
import com.bytedance.ies.ugc.aweme.rich.a.a;

final /* synthetic */ class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private final Long f34776a;

    /* renamed from: b  reason: collision with root package name */
    private final String f34777b;

    static {
        Covode.recordClassIndex(20863);
    }

    d(Long l2, String str) {
        this.f34776a = l2;
        this.f34777b = str;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.f.c.a
    public final void a(boolean z) {
        Long l2 = this.f34776a;
        String str = this.f34777b;
        if (z) {
            a.a("splash_ad", "deeplink_success", l2.toString(), str, null).b();
        } else {
            a.a("splash_ad", "deeplink_failed", l2.toString(), str, null).b();
        }
    }
}
