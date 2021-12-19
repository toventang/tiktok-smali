package com.ss.android.ugc.aweme.account.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import f.a.ad;
import f.a.af;

public final /* synthetic */ class d implements af {

    /* renamed from: a  reason: collision with root package name */
    private final String f63099a;

    static {
        Covode.recordClassIndex(38863);
    }

    public d(String str) {
        this.f63099a = str;
    }

    @Override // f.a.af
    public final void subscribe(ad adVar) {
        String str = this.f63099a;
        NetworkProxyAccount.f65195b.a(b.f63082a);
        adVar.a(str);
    }
}
