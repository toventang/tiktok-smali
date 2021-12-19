package com.bytedance.android.live.liveinteract.linkroom.a.c;

import android.content.Context;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.b.a;
import com.bytedance.android.live.liveinteract.api.b.c;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.cohost.a.e.b;
import com.bytedance.android.live.liveinteract.linkroom.a.c.b;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.lang.ref.WeakReference;

final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f10525a;

    static {
        Covode.recordClassIndex(5608);
    }

    r(b bVar) {
        this.f10525a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        User owner;
        b bVar = this.f10525a;
        a aVar = (a) obj;
        if (bVar.y != null) {
            c cVar = aVar.f9964a;
            com.bytedance.android.live.liveinteract.platform.a.c cVar2 = bVar.f10503h;
            DataChannel dataChannel = bVar.w;
            m mVar = (m) bVar.y;
            Context context = ((b.a) bVar.y).getContext();
            l.d(cVar, "");
            l.d(cVar2, "");
            l.d(dataChannel, "");
            l.d(mVar, "");
            l.d(context, "");
            if (b.a.a().f9940e > 0 || b.a.a().af) {
                ao.a(y.e(), (int) R.string.dy0);
                return;
            }
            WeakReference weakReference = new WeakReference(context);
            k b2 = b.a.a().b();
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                long id = room.getId();
                b.d dVar = new b.d(dataChannel, weakReference);
                if (!b.a.a().ag) {
                    ao.a(y.e(), y.a((int) R.string.dyo), 0);
                } else if (b2 == k.INVITING) {
                    ao.a(y.e(), (int) R.string.e69);
                } else if (b2 == k.DISABLED) {
                    d a2 = d.a();
                    l.b(a2, "");
                    if (a2.f14182c) {
                        DataChannelGlobal.f34575d.d(com.bytedance.android.live.liveinteract.platform.common.c.k.class);
                        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.liveinteract.api.b.b(true, 200, "Success"));
                        return;
                    }
                    Room room2 = (Room) dataChannel.b(df.class);
                    if (room2 == null || (owner = room2.getOwner()) == null || owner.getSecret() != 1) {
                        com.bytedance.android.live.liveinteract.cohost.a.e.b.a(cVar2, dataChannel, cVar, id, mVar, dVar);
                    } else {
                        com.bytedance.android.live.liveinteract.cohost.ui.b.d.a(context, new b.c(dataChannel, cVar2, cVar, id, mVar, dVar)).show();
                    }
                }
            }
        }
    }
}
