package com.ss.android.ugc.aweme.account.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.k.a;

public final class e extends a {

    /* renamed from: b  reason: collision with root package name */
    public String f63123b;

    /* renamed from: c  reason: collision with root package name */
    public String f63124c;

    /* renamed from: d  reason: collision with root package name */
    public String f63125d;

    /* renamed from: e  reason: collision with root package name */
    public String f63126e;

    static {
        Covode.recordClassIndex(38878);
    }

    public e() {
        super("sign_in_response");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.account.k.a
    public final void b() {
        a("is_success", this.f63123b, a.AbstractC1400a.f63117a);
        a("platform", this.f63124c, a.AbstractC1400a.f63117a);
        a("error_code", this.f63125d, a.AbstractC1400a.f63117a);
        a("url_path", this.f63126e, a.AbstractC1400a.f63117a);
    }
}
