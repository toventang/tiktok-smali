package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(83414);
    }

    public static final LinkedHashMap<String, List<InteractStickerStruct>> a(Map<String, ? extends InteractStickerStruct> map) {
        LinkedHashMap<String, List<InteractStickerStruct>> linkedHashMap = new LinkedHashMap<>();
        if (map == null) {
            return linkedHashMap;
        }
        for (T t : map.keySet()) {
            if (linkedHashMap.get(t) == null) {
                linkedHashMap.put(t, new ArrayList());
            }
            Object obj = map.get(t);
            if (obj != null) {
                List<InteractStickerStruct> list = linkedHashMap.get(t);
                if (list == null) {
                    l.b();
                }
                list.add(obj);
            }
        }
        return linkedHashMap;
    }
}
