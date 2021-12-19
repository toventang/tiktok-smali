package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class d extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f100551a = new d();

    static {
        Covode.recordClassIndex(64311);
    }

    d() {
        super(GroupInviteState.class, "close", "getClose()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((GroupInviteState) obj).getClose());
    }
}
