package com.ss.android.ugc.aweme.user.repository;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class a extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f142426a = new a();

    static {
        Covode.recordClassIndex(93152);
    }

    a() {
        super(UserState.class, "removeFollowerError", "getRemoveFollowerError()Ljava/lang/Throwable;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((UserState) obj).getRemoveFollowerError();
    }
}
