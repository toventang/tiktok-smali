package com.ss.android.ugc.aweme.im.sdk.iescore.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.a.b;
import com.ss.android.token.d;
import com.ss.android.token.f;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a extends com.bytedance.ies.im.core.api.d.a implements IAccountService.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102807a;

    /* renamed from: b  reason: collision with root package name */
    private static final h f102808b = i.a((h.f.a.a) C2595a.f102809a);

    private static CopyOnWriteArraySet<b> f() {
        return (CopyOnWriteArraySet) f102808b.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.a$a  reason: collision with other inner class name */
    static final class C2595a extends m implements h.f.a.a<CopyOnWriteArraySet<b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2595a f102809a = new C2595a();

        static {
            Covode.recordClassIndex(65914);
        }

        C2595a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArraySet<b> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.a
    public final boolean a() {
        return c.a();
    }

    @Override // com.bytedance.ies.im.core.api.d.a
    public final boolean e() {
        return in.e();
    }

    @Override // com.bytedance.ies.im.core.api.d.a
    public final com.bytedance.ies.im.core.api.a.c b() {
        User d2 = c.d();
        if (d2 != null) {
            return com.ss.android.ugc.aweme.im.sdk.iescore.c.a.a(d2);
        }
        return null;
    }

    @Override // com.bytedance.ies.im.core.api.d.a
    public final String c() {
        if (d.f61016a) {
            return f.f61019a.a();
        }
        return null;
    }

    @Override // com.bytedance.ies.im.core.api.d.a
    public final String d() {
        CharSequence b2 = c.b();
        l.b(b2, "");
        return b2.toString();
    }

    static {
        Covode.recordClassIndex(65913);
        a aVar = new a();
        f102807a = aVar;
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.a(aVar);
    }

    @Override // com.bytedance.ies.im.core.api.d.a
    public final void a(b bVar) {
        l.d(bVar, "");
        f().add(bVar);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public final void onAccountResult(int i2, boolean z, int i3, User user) {
        com.bytedance.ies.im.core.api.a.a aVar;
        b.f102810a.b("AccountDependService", new StringBuilder("onAccountResult: ").append(i2).append(", ").append(z).append(", ").append(i3).append(", ").append(user != null ? user.getUid() : null).append(", ").append(user != null ? user.getSecUid() : null).toString());
        if (z) {
            if (i2 == 1) {
                aVar = com.bytedance.ies.im.core.api.a.a.LOGIN;
            } else if (i2 == 2) {
                aVar = com.bytedance.ies.im.core.api.a.a.SWITCH;
            } else if (i2 != 3) {
                aVar = com.bytedance.ies.im.core.api.a.a.UNKNOWN;
            } else {
                aVar = com.bytedance.ies.im.core.api.a.a.LOGOUT;
            }
            if (user == null) {
                user = c.d();
            }
            for (T t : f()) {
                t.a(aVar, user != null ? com.ss.android.ugc.aweme.im.sdk.iescore.c.a.a(user) : null);
            }
        }
    }
}
