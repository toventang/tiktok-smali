package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class q extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96590a = new q();

    static {
        Covode.recordClassIndex(61233);
    }

    q() {
        super(FollowRelationState.class, "isSearching", "isSearching()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((FollowRelationState) obj).isSearching());
    }
}
