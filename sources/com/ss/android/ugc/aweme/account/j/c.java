package com.ss.android.ugc.aweme.account.j;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63095a;

    /* renamed from: b  reason: collision with root package name */
    private final User f63096b;

    /* renamed from: c  reason: collision with root package name */
    private final long f63097c;

    /* renamed from: d  reason: collision with root package name */
    private final bo.a f63098d;

    static {
        Covode.recordClassIndex(38862);
    }

    public c(boolean z, User user, long j2, bo.a aVar) {
        this.f63095a = z;
        this.f63096b = user;
        this.f63097c = j2;
        this.f63098d = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        boolean z = this.f63095a;
        User user = this.f63096b;
        long j2 = this.f63097c;
        bo.a aVar = this.f63098d;
        if (z || user.isUserCancelled()) {
            q.a(user.getUid(), 2592000000L + j2, true);
        } else {
            q.a(user.getUid(), j2, false);
        }
        q.b(user.getUid(), j2);
        q.a(user);
        if (aVar != null) {
            aVar.a();
        }
        return iVar.d();
    }
}
