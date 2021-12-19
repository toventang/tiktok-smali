package com.ss.android.ugc.aweme.im.sdk.group.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f102643a = new c();

    static {
        Covode.recordClassIndex(65722);
    }

    c() {
        super(GroupInviteState.class, "asyncDetail", "getAsyncDetail()Lcom/bytedance/jedi/arch/Async;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((GroupInviteState) obj).getAsyncDetail();
    }
}
