package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import h.k.k;

final /* synthetic */ class y extends h.f.b.y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96661a = new y();

    static {
        Covode.recordClassIndex(61304);
    }

    y() {
        super(FollowRelationState.class, "isFollowingTab", "isFollowingTab()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((FollowRelationState) obj).isFollowingTab());
    }
}
