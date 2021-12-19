package com.ss.android.ugc.playerkit.videoview.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.c;
import com.ss.android.ugc.playerkit.model.s;
import com.ss.android.ugc.playerkit.simapicommon.a.d;
import com.ss.android.ugc.playerkit.videoview.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private long f148926a = 2400000;

    /* renamed from: b  reason: collision with root package name */
    private List<n> f148927b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f148928c;

    /* renamed from: d  reason: collision with root package name */
    private long f148929d;

    static {
        Covode.recordClassIndex(98066);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.f
    public final s b(d dVar) {
        int i2;
        int i3;
        float f2;
        if (dVar == null) {
            return null;
        }
        s sVar = new s();
        sVar.f148809a = 1;
        String str = "";
        sVar.f148810b = str;
        if (dVar.getUrlList() != null && !dVar.getUrlList().isEmpty()) {
            sVar.f148810b = dVar.getUrlList().get(0);
        }
        if (dVar.getBitRate() != null) {
            i2 = dVar.getBitRate().intValue();
        } else {
            i2 = 0;
        }
        sVar.f148811c = i2;
        if (dVar.getInfoId() != null) {
            i3 = dVar.getInfoId().intValue();
        } else {
            i3 = -1;
        }
        sVar.f148812d = i3;
        float f3 = 0.0f;
        if (dVar.getLoudness() != null) {
            f2 = dVar.getLoudness().floatValue();
        } else {
            f2 = 0.0f;
        }
        sVar.f148813e = f2;
        if (dVar.getPeak() != null) {
            f3 = dVar.getPeak().floatValue();
        }
        sVar.f148814f = f3;
        if (dVar.getUrlKey() != null) {
            str = dVar.getUrlKey();
        }
        sVar.f148815g = str;
        sVar.f148816h = false;
        return sVar;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.f
    public final s a(d dVar) {
        int i2;
        float f2;
        if (dVar == null) {
            return null;
        }
        dVar.getUrlKey();
        int i3 = 0;
        if (dVar.getUrlKey() == null || TextUtils.isEmpty(dVar.getUrlKey()) || dVar.getUrlList() == null || dVar.getUrlList().isEmpty()) {
            return null;
        }
        a aVar = new a();
        aVar.f148904b = dVar.getUrlKey();
        aVar.f148905c = dVar.getFileCheckSum();
        int size = dVar.getUrlList().size();
        String[] strArr = new String[size];
        dVar.getUrlList().toArray(strArr);
        long createTime = dVar.getCreateTime();
        long longValue = dVar.getCdnUrlExpired().longValue();
        if (c.f148702a.forceHttps()) {
            for (int i4 = 0; i4 < size; i4++) {
                String str = strArr[i4];
                if (str != null && str.startsWith("http") && !str.startsWith("https")) {
                    str = str.replaceFirst("http", "https");
                }
                strArr[i4] = str;
            }
        }
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.aweme.simkit.c a2 = com.ss.android.ugc.aweme.simkit.d.a();
        for (int i5 = 0; i5 < size; i5++) {
            if (strArr[i5] != null) {
                if ((strArr[i5].contains("aweme/v1/play") || strArr[i5].contains("aweme/v2/play")) && a2.b().getCommonConfig().getCommonParamsProcessor() != null) {
                    arrayList.add(a2.b().getCommonConfig().getCommonParamsProcessor().a(strArr[i5]));
                } else {
                    Arrays.toString(strArr);
                    if (longValue <= 0 || !this.f148928c) {
                        if (SystemClock.elapsedRealtime() - createTime < this.f148926a) {
                            arrayList.add(strArr[i5]);
                        }
                    } else if (System.currentTimeMillis() / 1000 < this.f148929d + longValue) {
                        arrayList.add(strArr[i5]);
                    }
                }
            }
        }
        aVar.f148903a = (String[]) arrayList.toArray(new String[0]);
        com.ss.android.ugc.playerkit.session.a.f148854a.a(aVar.f148904b, aVar.f148905c);
        s sVar = new s();
        a aVar2 = new a(dVar, aVar.f148904b, aVar.f148903a);
        j a3 = new o(this.f148927b, aVar2, 0).a(aVar2);
        sVar.f148809a = 1;
        String str2 = "";
        if (a3 == null || a3.f148935a == null) {
            sVar.f148810b = str2;
        } else {
            sVar.f148810b = a3.f148935a;
        }
        if (dVar.getBitRate() != null) {
            i3 = dVar.getBitRate().intValue();
        }
        sVar.f148811c = i3;
        if (dVar.getInfoId() != null) {
            i2 = dVar.getInfoId().intValue();
        } else {
            i2 = -1;
        }
        sVar.f148812d = i2;
        float f3 = 0.0f;
        if (dVar.getLoudness() != null) {
            f2 = dVar.getLoudness().floatValue();
        } else {
            f2 = 0.0f;
        }
        sVar.f148813e = f2;
        if (dVar.getPeak() != null) {
            f3 = dVar.getPeak().floatValue();
        }
        sVar.f148814f = f3;
        if (dVar.getUrlKey() != null) {
            str2 = dVar.getUrlKey();
        }
        sVar.f148815g = str2;
        if (a3 != null) {
            sVar.f148816h = a3.f148936b;
        }
        return sVar;
    }

    public b(List<n> list, long j2) {
        this.f148927b = list.isEmpty() ? Collections.singletonList(n.f148944b) : list;
        this.f148926a = j2;
        this.f148928c = com.ss.android.ugc.aweme.simkit.d.a().b().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        this.f148929d = com.ss.android.ugc.aweme.simkit.d.a().b().getSimPlayerExperiment().cdnUrlExpiredOffset();
    }
}
