package com.ss.android.ugc.aweme.initializer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;

final /* synthetic */ class b implements IAccountService.b {

    /* renamed from: a  reason: collision with root package name */
    private final z.b f104731a;

    static {
        Covode.recordClassIndex(67137);
    }

    b(z.b bVar) {
        this.f104731a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public final void onAccountResult(int i2, boolean z, int i3, User user) {
        z.b bVar = this.f104731a;
        if (user != null) {
            ShareDependService.a.a().a(user);
        }
        bVar.a(i2, z);
    }
}
