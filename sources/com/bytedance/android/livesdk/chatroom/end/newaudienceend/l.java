package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.os.Message;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.chatroom.b.f;
import com.bytedance.android.livesdk.chatroom.end.g;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;

public final class l implements com.bytedance.android.livesdkapi.depend.a.a, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    WeakHandler f15483a = new WeakHandler(this);

    /* renamed from: b  reason: collision with root package name */
    public a f15484b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.a.a f15485c;

    /* renamed from: d  reason: collision with root package name */
    g f15486d = new g();

    public interface a {
        static {
            Covode.recordClassIndex(8555);
        }

        void a(List<Room> list);

        void b();

        void b(Room room);

        void c(Room room);
    }

    interface b {
        static {
            Covode.recordClassIndex(8556);
        }

        void a(User user);
    }

    static {
        Covode.recordClassIndex(8551);
    }

    @Override // com.bytedance.android.livesdkapi.depend.a.a
    public final boolean i_() {
        com.bytedance.android.livesdkapi.depend.a.a aVar = this.f15485c;
        if (aVar == null || !aVar.i_()) {
            return false;
        }
        return true;
    }

    l(a aVar) {
        this.f15484b = aVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (this.f15483a != null) {
            f.f14958a.a(this.f15483a, false, j2, 4, 12);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        a aVar;
        int i2 = message.what;
        if (message.obj instanceof Exception) {
            if (!(i2 == 21 || i2 == 22 || !(message.obj instanceof com.bytedance.android.live.a.a.b.a))) {
                ao.a(y.e(), ((com.bytedance.android.live.a.a.b.a) message.obj).getPrompt(), 0);
            }
        } else if (22 == i2) {
            if (message.obj instanceof List) {
                try {
                    List<Room> list = (List) message.obj;
                    a aVar2 = this.f15484b;
                    if (aVar2 != null) {
                        aVar2.a(list);
                        StringBuilder sb = new StringBuilder();
                        for (Room room : list) {
                            sb.append(room.getIdStr()).append(":").append(room.getOwnerUserId()).append(";");
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("room", sb.toString());
                        c.a("ttlive_live_end_recommend_live", 0, hashMap);
                    }
                } catch (Throwable th) {
                    com.bytedance.android.live.core.c.a.a("LiveEnd", th);
                }
            }
        } else if (i2 == 12 && (message.obj instanceof Room) && (aVar = this.f15484b) != null) {
            aVar.b((Room) message.obj);
            this.f15484b.c((Room) message.obj);
        }
    }
}
