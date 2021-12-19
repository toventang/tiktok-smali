package com.bytedance.android.live.broadcast.c.a;

import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.b.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f7821a;

    static {
        Covode.recordClassIndex(3869);
    }

    q(long j2) {
        this.f7821a = j2;
    }

    public final void run() {
        long j2 = this.f7821a;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        List<u> stickerGifts = ((IGiftService) a.a(IGiftService.class)).getStickerGifts();
        if (stickerGifts.size() != 0) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            boolean z = true;
            HashMap hashMap = new HashMap();
            for (u uVar : stickerGifts) {
                sb2.append(uVar.f19761d).append(",");
                if (((IGiftService) a.a(IGiftService.class)).getAssets("effects", uVar.n) != null) {
                    sb3.append(uVar.f19761d).append(",");
                }
                if (((IGiftService) a.a(IGiftService.class)).isAssetsDownloaded("effects", uVar.n)) {
                    if (z) {
                        sb.append(uVar.f19761d);
                        z = false;
                    } else {
                        sb.append(",").append(uVar.f19761d);
                    }
                }
            }
            hashMap.put("download_sticker_id", sb.toString());
            hashMap.put("all_sticker_id", sb2.toString());
            hashMap.put("asset_sticker_id", sb3.toString());
            hashMap.put("room_id", Long.valueOf(j2));
            if (room != null) {
                hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
                hashMap.put("live_type", Integer.valueOf(room.getOrientation()));
            }
            c.a(d.a("service_sticker_gift_status"), 0, hashMap);
            ((b) d.a.a().d().reportFaceGift(j2, sb.toString()).a(new f()).a(new com.bytedance.android.livesdk.utils.b.c())).a(3).a(new r(j2, room), new s(j2, room));
        }
    }
}
