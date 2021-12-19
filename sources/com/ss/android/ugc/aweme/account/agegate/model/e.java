package com.ss.android.ugc.aweme.account.agegate.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ai;

final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f62786a;

    static {
        Covode.recordClassIndex(38687);
    }

    e(b bVar) {
        this.f62786a = bVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f62786a;
        if (!ai.a(iVar)) {
            return null;
        }
        cj.f71084b.e().updateCurUser((User) iVar.d());
        return bVar.mData;
    }
}
