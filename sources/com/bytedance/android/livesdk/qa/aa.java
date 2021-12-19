package com.bytedance.android.livesdk.qa;

import androidx.fragment.app.i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.m.c;
import com.bytedance.android.live.m.d;
import com.bytedance.android.livesdk.event.b;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.ef;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aa {
    static {
        Covode.recordClassIndex(12001);
    }

    public static final boolean a(DataChannel dataChannel) {
        Room c2 = c.c(dataChannel);
        if (c2 == null || c2.questionVersion != 2) {
            return false;
        }
        return true;
    }

    public static final void a(DataChannel dataChannel, boolean z) {
        RoomAuthStatus roomAuthStatus;
        Room c2 = c.c(dataChannel);
        if (c2 != null && (roomAuthStatus = c2.getRoomAuthStatus()) != null) {
            roomAuthStatus.setEnableQuestion(z);
        }
    }

    public static final void a(DataChannel dataChannel, String str) {
        boolean z;
        ba userAttr;
        l.d(str, "");
        if (dataChannel != null) {
            Object b2 = dataChannel.b(ee.class);
            if (b2 == null) {
                l.b();
            }
            boolean booleanValue = ((Boolean) b2).booleanValue();
            User user = (User) dataChannel.b(dn.class);
            if (user == null || (userAttr = user.getUserAttr()) == null) {
                z = false;
            } else {
                z = userAttr.f19030b;
            }
            if (c.b(dataChannel) || booleanValue) {
                b bVar = (b) dataChannel.b(ef.class);
                if (bVar == null) {
                    bVar = new b(false);
                }
                if (!bVar.f17179a || z || booleanValue) {
                    i iVar = (i) dataChannel.b(ao.class);
                    if (iVar != null) {
                        dataChannel.b(d.class, (Object) true);
                        if (!a(dataChannel) || booleanValue || z) {
                            y yVar = new y();
                            dataChannel.a(au.class, str);
                            yVar.show(iVar, str);
                            return;
                        }
                        dataChannel.a(b.class, new d(0, 0, false, str));
                        new c().show(iVar, str);
                    }
                } else if (bVar.f17180b) {
                    com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.eq3);
                } else {
                    com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.eq2);
                }
            }
        }
    }
}
