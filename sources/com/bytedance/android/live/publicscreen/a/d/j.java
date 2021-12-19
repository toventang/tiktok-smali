package com.bytedance.android.live.publicscreen.a.d;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class j<MESSAGE extends a> extends k<MESSAGE> {
    static {
        Covode.recordClassIndex(6706);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public User b() {
        return null;
    }

    public abstract ImageModel s();

    public abstract int t();

    public ImageModel u() {
        return null;
    }

    public abstract boolean v();

    public void w() {
    }

    public String x() {
        return "#ff4e33";
    }

    public ImageModel y() {
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(MESSAGE message) {
        super(message);
        l.d(message, "");
    }
}
