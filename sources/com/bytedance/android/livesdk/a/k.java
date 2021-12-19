package com.bytedance.android.livesdk.a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f13284a;

    /* renamed from: b  reason: collision with root package name */
    private final User f13285b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13286c;

    static {
        Covode.recordClassIndex(7392);
    }

    k(f fVar, User user, String str) {
        this.f13284a = fVar;
        this.f13285b = user;
        this.f13286c = str;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        f fVar = this.f13284a;
        User user = this.f13285b;
        b.a.a("livesdk_mute_click").a().a("default_mute_set", ((j) obj).f7925a).a("to_user_id", user.getIdStr()).a("entry_point", "admin_pannel").a("anchor_id", fVar.f13273m).a("room_id", fVar.f13272l).a("admin_type", this.f13286c).a("action_type", "cancel").b();
    }
}
