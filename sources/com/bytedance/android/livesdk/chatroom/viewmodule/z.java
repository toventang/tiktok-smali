package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16525a;

    static {
        Covode.recordClassIndex(9163);
    }

    z(CommentWidget commentWidget) {
        this.f16525a = commentWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        CommentWidget commentWidget = this.f16525a;
        dialogInterface.dismiss();
        if (commentWidget.f16264c != null) {
            ((RoomSwitchApi) e.a().a(RoomSwitchApi.class)).updateSwitch(commentWidget.f16264c.getId(), 3, true).a(new f()).a(new ab(commentWidget), ac.f16449a);
        }
    }
}
