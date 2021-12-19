package com.bytedance.android.livesdk.newvideogift;

import com.bytedance.android.live.core.f.r;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.ab.l;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget;
import com.bytedance.android.livesdkapi.depend.d.a.d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

final /* synthetic */ class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewVideoGiftWidget f19937a;

    static {
        Covode.recordClassIndex(11790);
    }

    b(LiveNewVideoGiftWidget liveNewVideoGiftWidget) {
        this.f19937a = liveNewVideoGiftWidget;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.a.d
    public final void a(boolean z, String str, int i2, int i3, String str2) {
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.f19937a;
        if (!z && com.ss.android.ugc.aweme.live.alphaplayer.d.b.class.getSimpleName().equals(str)) {
            c.a((com.bytedance.android.livesdk.ao.c) a.bu, (Object) true);
        }
        LiveNewVideoGiftWidget.b bVar = liveNewVideoGiftWidget.f19846f;
        long j2 = -1;
        String str3 = "";
        if (bVar.f19854a != null) {
            j2 = bVar.f19854a.getId();
            if (bVar.f19854a.getResourceModel() != null && !r.a(bVar.f19854a.getResourceModel().f17833b)) {
                str3 = bVar.f19854a.getResourceModel().f17833b.get(0);
            }
        }
        new l().a("gift_id", Long.valueOf(j2)).a("gift_resource", str3).a("extra", Integer.valueOf(i3)).a("code", Integer.valueOf(i2)).a("error_info", str2).a("hotsoon_live_video_gift_play_success_rate", !z ? 1 : 0);
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "VIDEO_GIFT_PLAY_SUCCESS_RATE");
        hashMap.put("gift_id", Long.valueOf(j2));
        hashMap.put("gift_resource", str3);
        hashMap.put("extra", Integer.valueOf(i3));
        hashMap.put("code", Integer.valueOf(i2));
        hashMap.put("error_info", str2);
        i.b().a("ttlive_gift", hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asset_id", Long.valueOf(j2));
        hashMap2.put("url", str3);
        hashMap2.put("error_code", Integer.valueOf(i2));
        hashMap2.put("error_msg", str2);
        hashMap2.put("asset_show_extra", Integer.valueOf(i3));
        hashMap2.put("gift_player_type", str);
        if (z) {
            com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_gift_asset_show_status"), 0, hashMap2);
            return;
        }
        com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_gift_asset_show_status"), 1, hashMap2);
        com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.b("ttlive_gift_asset_show_status"), 1, hashMap2);
        com.bytedance.android.livesdk.ab.a.a.a();
        com.bytedance.android.livesdk.ab.a.a.a(com.bytedance.android.livesdk.ab.a.b.Gift.info, "ttlive_gift_asset_show_status", hashMap2);
    }
}
