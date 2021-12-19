package com.bytedance.android.livesdk.service.c.c;

import android.net.Uri;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f21369a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(12589);
    }

    public static final void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("cache", String.valueOf(b()));
        hashMap.put("tag", "ttlive_sdk");
        hashMap.put("gift_icon_prefetch", String.valueOf(LivePrefetchGiftImageSetting.INSTANCE.getValue()));
        b.a.a("ttlive_gift_icon_cache_hit").a((Map<String, String>) hashMap).b();
        com.bytedance.android.live.core.d.c.a("ttlive_gift_icon_cache_hit", 0, hashMap);
    }

    private static float b() {
        GiftManager inst = GiftManager.inst();
        l.b(inst, "");
        List<GiftPage> giftPageList = inst.getGiftPageList();
        if (giftPageList != null && giftPageList.size() > 0) {
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (GiftPage giftPage : giftPageList) {
                List<u> list = giftPage.gifts;
                if (list != null && list.size() > 0) {
                    for (u uVar : list) {
                        f3 += 1.0f;
                        l.b(uVar, "");
                        if (uVar.f19759b != null && uVar.f19759b.mUrls != null && uVar.f19759b.mUrls.size() > 0 && k.a(Uri.parse(uVar.f19759b.mUrls.get(0)))) {
                            f2 += 1.0f;
                        }
                    }
                }
            }
            if (f3 != 0.0f) {
                return f2 / f3;
            }
        }
        return 0.0f;
    }

    public static final void a(long j2, long j3, String str) {
        l.d(str, "");
        HashMap hashMap = new HashMap();
        hashMap.put("time", String.valueOf(j2));
        hashMap.put("tag", "ttlive_sdk");
        hashMap.put("gift_id", String.valueOf(j3));
        hashMap.put("gift_icon_url", str);
        com.bytedance.android.live.core.d.c.a("ttlive_gift_icon_download_time", 0, j2, hashMap);
        b.a.a("ttlive_gift_icon_download_time").a().a((Map<String, String>) hashMap).b();
    }
}
