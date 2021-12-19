package com.ss.android.ugc.playerkit.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.playerkit.simapicommon.a.g;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import java.util.ArrayList;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(97977);
    }

    public static i a(e eVar) {
        if (eVar != null && (eVar.p instanceof i)) {
            return (i) eVar.p;
        }
        return null;
    }

    private static e.a a(com.ss.android.ugc.playerkit.simapicommon.a.e eVar) {
        if (eVar == null) {
            return null;
        }
        e.a aVar = new e.a();
        aVar.f115348a = eVar.getBitRate();
        aVar.f115349b = eVar.getGearName();
        aVar.f115350c = eVar.getQualityType();
        aVar.f115351d = eVar.isBytevc1();
        aVar.f115352e = eVar.getUrlKey();
        aVar.f115353f = eVar.urlList();
        aVar.f115354g = eVar.getChecksum();
        aVar.f115355h = eVar.getSize();
        g playAddr = eVar.getPlayAddr();
        if (playAddr != null) {
            aVar.f115356i = playAddr.getUri();
            aVar.f115357j = playAddr.getWidth();
            aVar.f115358k = playAddr.getHeight();
            aVar.f115359l = playAddr.getaK();
        }
        return aVar;
    }

    public static e a(i iVar, c cVar) {
        boolean z;
        if (iVar == null) {
            return null;
        }
        e eVar = new e();
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        eVar.f115340f = z;
        eVar.f115335a = iVar.getSourceId();
        eVar.f115336b = iVar.getUri();
        eVar.f115337c = iVar.getaK();
        eVar.f115338d = iVar.getDuration();
        eVar.f115339e = iVar.getAspectRatio();
        eVar.f115344j = iVar.getCdnUrlExpired();
        eVar.f115345k = iVar.getCreateTime();
        eVar.f115343i = new e.a();
        eVar.f115343i.f115352e = iVar.getUrlKey();
        eVar.f115343i.f115353f = iVar.getUrlList();
        eVar.f115343i.f115354g = iVar.getFileCheckSum();
        eVar.f115343i.f115348a = -1;
        eVar.f115343i.f115360m = iVar.getRatio();
        eVar.f115343i.n = iVar.getSourceId();
        eVar.f115343i.p = iVar.getCdnUrlExpired();
        List<com.ss.android.ugc.playerkit.simapicommon.a.e> bitRate = iVar.getBitRate();
        ArrayList arrayList = new ArrayList();
        if (bitRate != null && bitRate.size() > 0) {
            for (com.ss.android.ugc.playerkit.simapicommon.a.e eVar2 : bitRate) {
                e.a a2 = a(eVar2);
                a2.f115360m = iVar.getRatio();
                a2.n = iVar.getSourceId();
                a2.p = iVar.getCdnUrlExpired();
                arrayList.add(a2);
            }
        }
        eVar.f115342h = arrayList;
        eVar.f115341g = arrayList;
        eVar.n = cVar;
        eVar.p = iVar;
        return eVar;
    }
}
