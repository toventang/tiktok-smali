package com.ss.android.ugc.aweme.poi_map.service;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class PoiMapServiceEmptylmpl implements IPoiMapService {
    static {
        Covode.recordClassIndex(74473);
    }

    @Override // com.ss.android.ugc.aweme.poi_map.service.IPoiMapService
    public final Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Long l2, String str9, String str10, String str11, String str12, UrlModel urlModel, String str13, String str14, String str15, String str16, String str17, String str18) {
        l.d(str3, "");
        l.d(str4, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi_map.service.IPoiMapService
    public final Class<? extends Fragment> a() {
        return null;
    }
}
