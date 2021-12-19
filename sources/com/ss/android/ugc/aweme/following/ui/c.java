package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class c extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96468a = new c();

    static {
        Covode.recordClassIndex(61098);
    }

    c() {
        super(FollowRelationState.class, "connectedRelationCount", "getConnectedRelationCount()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((FollowRelationState) obj).getConnectedRelationCount());
    }
}
