package com.bytedance.android.livesdk.userinfowidget;

import android.widget.ImageView;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f21991a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f21992b;

    static {
        Covode.recordClassIndex(12951);
    }

    z(ImageView imageView, Room room) {
        this.f21991a = imageView;
        this.f21992b = room;
    }

    public final void run() {
        g.a(this.f21991a, this.f21992b.getOwner().getAvatarThumb(), 2131234424);
    }
}
