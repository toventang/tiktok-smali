package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.model.message.ag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class p extends r<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15381a;

    /* renamed from: b  reason: collision with root package name */
    public final Room f15382b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15383c = LiveBannerExperiment.isNewBannerEnable();

    public interface a extends bq {
        static {
            Covode.recordClassIndex(8502);
        }

        void a(ag agVar);
    }

    static {
        Covode.recordClassIndex(8501);
    }

    public final void a(a aVar) {
        super.a((bq) aVar);
        if (this.x != null) {
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (this.y != null && (iMessage instanceof ag)) {
            int i2 = ((ag) iMessage).f19131f;
            if (i2 == 2 || i2 == 5 || (i2 == 1 && this.f15383c)) {
                ((a) this.y).a((ag) iMessage);
            }
        }
    }

    public p(Room room, boolean z) {
        this.f15382b = room;
        this.f15381a = z;
    }
}
