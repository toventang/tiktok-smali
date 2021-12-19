package com.bytedance.android.live.slot;

import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.livesetting.slot.LiveOutsideBizRegisterPrioritySetting;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    static Map<IIconSlot.b, Map<String, Integer>> f12752a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    static Map<IFrameSlot.b, Map<String, Integer>> f12753b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    static Map<String, Integer> f12754c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static int f12755d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static int f12756e = 999;

    private static Map<String, Integer> a() {
        HashMap hashMap = new HashMap();
        if (2 == LiveOutsideBizRegisterPrioritySetting.INSTANCE.getValue()) {
            hashMap.put("ec_shop", 2);
            hashMap.put("business_links", 1);
        } else {
            hashMap.put("ec_shop", 1);
            hashMap.put("business_links", 2);
        }
        return hashMap;
    }

    static {
        Covode.recordClassIndex(7093);
        f12752a.put(IIconSlot.b.SLOT_LIVE_WATCHER_TOOLBAR, a());
        f12752a.put(IIconSlot.b.SLOT_LIVE_WATCHER_L2_TOOLBAR, a());
        Map<IIconSlot.b, Map<String, Integer>> map = f12752a;
        IIconSlot.b bVar = IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR;
        HashMap hashMap = new HashMap();
        hashMap.put("business_links", Integer.valueOf(f12755d));
        hashMap.put("ec_shop", Integer.valueOf(f12755d));
        map.put(bVar, hashMap);
        Map<IIconSlot.b, Map<String, Integer>> map2 = f12752a;
        IIconSlot.b bVar2 = IIconSlot.b.SLOT_LIVE_ANCHOR_TOOLBAR;
        HashMap hashMap2 = new HashMap();
        if (2 == LiveOutsideBizRegisterPrioritySetting.INSTANCE.getValue()) {
            hashMap2.put("ec_shop", 2);
            hashMap2.put("business_links", 1);
        } else {
            hashMap2.put("ec_shop", 1);
            hashMap2.put("business_links", 2);
        }
        map2.put(bVar2, hashMap2);
        Map<IFrameSlot.b, Map<String, Integer>> map3 = f12753b;
        IFrameSlot.b bVar3 = IFrameSlot.b.SLOT_LIVE_BOTTOM_POP;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("business_links", Integer.valueOf(f12755d));
        hashMap3.put("ec_shop", Integer.valueOf(f12755d));
        map3.put(bVar3, hashMap3);
        f12754c.put("ec_shop", 1);
        f12754c.put("business_links", 2);
    }

    public static int a(String str) {
        Integer num = f12754c.get(str);
        if (num == null) {
            return f12756e;
        }
        return num.intValue();
    }

    public static int a(IIconSlot.b bVar, String str) {
        Integer num;
        Map<String, Integer> map = f12752a.get(bVar);
        if (map == null || (num = map.get(str)) == null) {
            return f12756e;
        }
        return num.intValue();
    }
}
