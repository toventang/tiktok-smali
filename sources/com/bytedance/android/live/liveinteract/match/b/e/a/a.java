package com.bytedance.android.live.liveinteract.match.b.e.a;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.platform.common.g.b;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.ao;
import com.bytedance.android.livesdk.model.message.b.c;
import com.bytedance.android.livesdk.model.message.b.e;
import com.bytedance.android.livesdk.model.message.b.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;

public final class a implements b<ao> {
    static {
        Covode.recordClassIndex(5718);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.a.b
    public final /* bridge */ /* synthetic */ boolean a(ao aoVar, g gVar) {
        return a(aoVar, gVar);
    }

    private static boolean a(ao aoVar, g gVar) {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        f fVar5;
        String str;
        String str2;
        l.d(aoVar, "");
        l.d(gVar, "");
        if (aoVar.f19174a == 0) {
            try {
                c cVar = aoVar.f19175f;
                if (cVar == null || (fVar4 = cVar.f19257a) == null || fVar4.f19264a == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                c cVar2 = aoVar.f19175f;
                if (cVar2 == null || (fVar5 = cVar2.f19258b) == null || fVar5.f19264a == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                HashMap hashMap = new HashMap();
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(hashMap);
                com.bytedance.android.live.liveinteract.platform.common.g.b.b(hashMap);
                hashMap.put("connection_type", b.c.ANCHOR.getType());
                w.a(hashMap, b.a.a().p, false);
                if (b.a.a().q) {
                    str = "inviter";
                } else {
                    str = "invitee";
                }
                hashMap.put("anchor_type", str);
                hashMap.put("channel_id", String.valueOf(b.a.a().f9940e));
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room != null) {
                    RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                    l.b(roomAuthStatus, "");
                    if (roomAuthStatus.isEnableGift()) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    hashMap.put("is_from_gift_permission", str2);
                }
                com.bytedance.android.live.liveinteract.platform.common.g.b.a("livesdk_pk_guide_show", hashMap);
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() == 2 && aoVar.f19174a == 4) {
            e eVar = aoVar.f19179j;
            if (eVar == null || (fVar2 = eVar.f19260a) == null || fVar2.f19264a == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            e eVar2 = aoVar.f19179j;
            if (eVar2 == null || (fVar3 = eVar2.f19261b) == null || fVar3.f19264a == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            e eVar3 = aoVar.f19179j;
            if (eVar3 == null || eVar3.f19262c == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cl;
            l.b(bVar, "");
            Boolean a2 = bVar.a();
            l.b(a2, "");
            if (!a2.booleanValue()) {
                try {
                    throw new IllegalStateException("Check failed.".toString());
                } catch (IllegalArgumentException | IllegalStateException unused2) {
                    return true;
                }
            } else if (!gVar.f12205i || !aoVar.f19179j.f19263d) {
                return false;
            } else {
                return true;
            }
        } else {
            if (aoVar.f19174a == 3) {
                try {
                    com.bytedance.android.livesdk.model.message.b.b bVar2 = aoVar.f19178i;
                    if (bVar2 != null && (fVar = bVar2.f19256a) != null && fVar.f19264a != null) {
                        return false;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } catch (IllegalArgumentException unused3) {
                }
            }
            return true;
        }
    }
}
