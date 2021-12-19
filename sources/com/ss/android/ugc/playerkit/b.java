package com.ss.android.ugc.playerkit;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.c;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.simapicommon.a.g;
import java.util.ArrayList;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(97968);
    }

    public static boolean a(m.e eVar) {
        if (!c.f148702a.isEnableBytevc1()) {
            return false;
        }
        if (m.e.TT.equals(eVar) || m.e.TT_HARDWARE.equals(eVar)) {
            return true;
        }
        return false;
    }

    public static boolean a(g gVar) {
        List<String> urlList;
        if (!(gVar == null || (urlList = gVar.getUrlList()) == null || urlList.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (String str : urlList) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            gVar.setUrlList(arrayList);
            if (urlList.isEmpty() || TextUtils.isEmpty(gVar.getUri())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
