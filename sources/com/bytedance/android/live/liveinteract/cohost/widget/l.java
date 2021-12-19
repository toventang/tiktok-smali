package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.platform.common.view.b;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class l implements b.AbstractC0253b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10486a;

    static {
        Covode.recordClassIndex(5573);
    }

    l(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10486a = linkCrossRoomWidget;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
    public final void a(View view, Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f10486a;
        LinearLayout linearLayout = (LinearLayout) view;
        User user = (User) obj;
        ((TextView) linearLayout.findViewById(R.id.f3f)).setText(g.b(user));
        com.bytedance.android.livesdk.chatroom.g.g.a((ImageView) linearLayout.findViewById(R.id.bf0), user.getAvatarThumb(), 2131234424);
        if (linkCrossRoomWidget.f10466e && !linkCrossRoomWidget.f10471j) {
            linearLayout.setVisibility(8);
        } else if (linkCrossRoomWidget.f10472k != null && linkCrossRoomWidget.f10472k.v) {
            linearLayout.setVisibility(0);
        } else if (linkCrossRoomWidget.f10472k == null) {
            linearLayout.setVisibility(0);
        }
    }
}
