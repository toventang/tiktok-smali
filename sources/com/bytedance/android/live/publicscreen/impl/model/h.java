package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.impl.model.chat.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.model.message.au;
import com.bytedance.covode.number.Covode;

public final class h extends a<au> {

    /* renamed from: h  reason: collision with root package name */
    private long f12484h;

    static {
        Covode.recordClassIndex(6853);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.impl.model.chat.a
    public final boolean B() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        return ((au) this.f12190d).f19211g;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((au) this.f12190d).f19212h;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.h
    public final boolean m() {
        if (!C()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.d
    public final void f() {
        CharSequence z = z();
        if (z == null) {
            return;
        }
        if (C()) {
            b.a.a("livesdk_anchor_room_detail_show").a().a("live_info_content", z.toString()).b();
            return;
        }
        b.a.a("livesdk_room_detail_audience_show").a().a("live_info_content", z.toString()).b();
        this.f12484h = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.d
    public final void g() {
        CharSequence z = z();
        if (!C() && z != null) {
            b.a.a("livesdk_room_detail_audience_show_duration").a().a("live_info_content", z.toString()).a("duration", (int) (System.currentTimeMillis() - this.f12484h)).b();
        }
    }

    public h(au auVar) {
        super(auVar);
    }
}
