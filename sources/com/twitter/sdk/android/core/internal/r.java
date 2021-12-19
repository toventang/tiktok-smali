package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.scribe.ad;
import com.twitter.sdk.android.core.internal.scribe.e;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.services.AccountService;
import com.twitter.sdk.android.core.u;
import java.io.IOException;

public final class r implements o<u> {

    /* renamed from: a  reason: collision with root package name */
    private final a f156022a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final com.twitter.sdk.android.core.internal.scribe.a f156023b = ad.f156054a;

    static {
        Covode.recordClassIndex(103663);
    }

    protected static class a {
        static {
            Covode.recordClassIndex(103664);
        }

        protected a() {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.twitter.sdk.android.core.i] */
    @Override // com.twitter.sdk.android.core.internal.o
    public final /* synthetic */ void a(u uVar) {
        l lVar = new l(uVar);
        if (!lVar.f156146a.contains(AccountService.class)) {
            lVar.f156146a.putIfAbsent(AccountService.class, lVar.f156147b.a(AccountService.class));
        }
        AccountService accountService = (AccountService) lVar.f156146a.get(AccountService.class);
        try {
            if (this.f156023b != null) {
                e.a aVar = new e.a();
                aVar.f156067a = "android";
                aVar.f156068b = "credentials";
                aVar.f156069c = "";
                aVar.f156070d = "";
                aVar.f156071e = "";
                aVar.f156072f = "impression";
                e a2 = aVar.a();
                this.f156023b.a(a2);
            }
            accountService.verifyCredentials(true, false, false).a();
        } catch (IOException | RuntimeException unused) {
        }
    }
}
