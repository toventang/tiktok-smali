package com.ss.android.ugc.aweme.relation.viewholder;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.user.repository.UserState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class a extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f120496a = new a();

    static {
        Covode.recordClassIndex(78438);
    }

    a() {
        super(UserState.class, "user", "getUser()Lcom/ss/android/ugc/aweme/profile/model/User;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((UserState) obj).getUser();
    }
}
