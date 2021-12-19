package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class d extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96496a = new d();

    static {
        Covode.recordClassIndex(61114);
    }

    d() {
        super(FollowRelationState.class, "fanCount", "getFanCount()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((FollowRelationState) obj).getFanCount());
    }
}
