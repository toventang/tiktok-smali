package com.ss.android.ugc.aweme.account.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bt;

final /* synthetic */ class f implements IAccountService.b {

    /* renamed from: a  reason: collision with root package name */
    private final RecoverDeletedAccountActivity f65434a;

    static {
        Covode.recordClassIndex(40223);
    }

    f(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f65434a = recoverDeletedAccountActivity;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public final void onAccountResult(int i2, boolean z, int i3, User user) {
        RecoverDeletedAccountActivity recoverDeletedAccountActivity = this.f65434a;
        recoverDeletedAccountActivity.f65421i = false;
        bt.b(recoverDeletedAccountActivity.f65420h);
    }
}
