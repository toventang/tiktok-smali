package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;

final /* synthetic */ class ag implements IAccountService.b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f145432a;

    static {
        Covode.recordClassIndex(95094);
    }

    ag(Context context) {
        this.f145432a = context;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public final void onAccountResult(int i2, boolean z, int i3, User user) {
        AwemeRedBadgerManager.a(this.f145432a);
    }
}
