package com.bytedance.android.live.share;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import f.a.t;
import h.f.b.l;

public class d implements c {
    static {
        Covode.recordClassIndex(7027);
    }

    @Override // com.bytedance.android.live.share.c
    public f getShareBehavior(e eVar, Context context, i iVar, m mVar) {
        l.d(mVar, "");
        return null;
    }

    public String getShareUrl(User user) {
        return "";
    }

    @Override // com.bytedance.android.live.share.c
    public LiveWidget getShareWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.share.c
    public t<com.bytedance.android.live.network.response.d<ShareReportResult>> sendShare(long j2, String str, int i2, String str2, String str3) {
        return null;
    }

    @Override // com.bytedance.android.live.share.c
    public a share() {
        return null;
    }

    @Override // com.bytedance.android.live.share.c
    public boolean shareable(Room room) {
        return false;
    }

    public static final class a implements b {
        static {
            Covode.recordClassIndex(7028);
        }

        @Override // com.bytedance.android.live.share.b
        public final void a() {
        }

        @Override // com.bytedance.android.live.share.b
        public final void a(DataChannel dataChannel, IMessageManager iMessageManager, int i2) {
            l.d(dataChannel, "");
        }

        a() {
        }
    }

    @Override // com.bytedance.android.live.share.c
    public b provideShareCountManager() {
        return new a();
    }
}
