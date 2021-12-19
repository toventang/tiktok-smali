package com.bytedance.android.live;

import androidx.fragment.app.i;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import emotes.a.a;
import h.f.b.l;

public class b implements f {
    static {
        Covode.recordClassIndex(3532);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.f
    public Class<? extends LiveRecyclableWidget> getCommentWidget() {
        return CommentWidget.class;
    }

    @Override // com.bytedance.android.live.f
    public void showEmoteDetailDialog(EmoteModel emoteModel, i iVar) {
        l.d(emoteModel, "");
        l.d(iVar, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null && room.getOwner() != null) {
            User owner = room.getOwner();
            l.b(owner, "");
            if (owner.isAnchorHasSubQualification()) {
                a aVar = new a();
                if (emoteModel != null) {
                    aVar.f157069d = emoteModel;
                }
                String simpleName = a.class.getSimpleName();
                l.b(simpleName, "");
                aVar.show(iVar, simpleName);
            }
        }
    }
}
