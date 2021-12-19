package com.ss.android.ugc.playerkit.videoview.d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.playerkit.model.c;
import com.ss.android.ugc.playerkit.model.t;
import com.ss.android.ugc.playerkit.simapicommon.a.a;
import com.ss.android.ugc.playerkit.videoview.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class m implements g {

    /* renamed from: a  reason: collision with root package name */
    private long f148940a = 2400000;

    /* renamed from: b  reason: collision with root package name */
    private List<n> f148941b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f148942c;

    /* renamed from: d  reason: collision with root package name */
    private long f148943d;

    static {
        Covode.recordClassIndex(98078);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.g
    public final t b(a aVar) {
        String str;
        String str2;
        if (aVar == null) {
            return null;
        }
        t tVar = new t();
        tVar.f148817a = aVar.getId();
        String str3 = "";
        if (aVar.getLang() != null) {
            str = aVar.getLang();
        } else {
            str = str3;
        }
        tVar.f148818b = str;
        tVar.f148819c = aVar.getLanguageId();
        if (aVar.getUrl() != null) {
            str2 = aVar.getUrl();
        } else {
            str2 = str3;
        }
        tVar.f148820d = str2;
        tVar.f148821e = aVar.getExpire();
        if (aVar.getCaptionFormat() != null) {
            str3 = aVar.getCaptionFormat();
        }
        tVar.f148822f = str3;
        tVar.f148823g = aVar.getSubId();
        return tVar;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.g
    public final t a(a aVar) {
        String str;
        if (aVar == null) {
            return null;
        }
        String.valueOf(aVar.getSubId());
        if (aVar.getUrl() == null) {
            return null;
        }
        b bVar = new b();
        bVar.f148907b = String.valueOf(aVar.getSubId());
        String[] strArr = new String[0];
        if (aVar.getUrl() != null) {
            strArr = new String[]{aVar.getUrl()};
        }
        long createTime = aVar.getCreateTime();
        long expire = aVar.getExpire();
        if (c.f148702a.forceHttps()) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str2 = strArr[0];
                if (str2 != null && str2.startsWith("http") && !str2.startsWith("https")) {
                    str2 = str2.replaceFirst("http", "https");
                }
                strArr[0] = str2;
            }
        }
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.aweme.simkit.c a2 = d.a();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3] != null) {
                if ((strArr[i3].contains("aweme/v1/play") || strArr[i3].contains("aweme/v2/play")) && a2.b().getCommonConfig().getCommonParamsProcessor() != null) {
                    arrayList.add(a2.b().getCommonConfig().getCommonParamsProcessor().a(strArr[i3]));
                } else {
                    Arrays.toString(strArr);
                    if (expire <= 0 || !this.f148942c) {
                        if (SystemClock.elapsedRealtime() - createTime < this.f148940a) {
                            arrayList.add(strArr[i3]);
                        }
                    } else if (System.currentTimeMillis() / 1000 < this.f148943d + expire) {
                        arrayList.add(strArr[i3]);
                    }
                }
            }
        }
        bVar.f148906a = (String[]) arrayList.toArray(new String[0]);
        t tVar = new t();
        l lVar = new l(aVar, bVar.f148907b, bVar.f148906a);
        j a3 = new o(this.f148941b, lVar, 0).a(lVar);
        tVar.f148817a = aVar.getId();
        String str3 = "";
        if (aVar.getLang() != null) {
            str = aVar.getLang();
        } else {
            str = str3;
        }
        tVar.f148818b = str;
        tVar.f148819c = aVar.getLanguageId();
        if (a3 == null || a3.f148935a == null) {
            tVar.f148820d = str3;
        } else {
            tVar.f148820d = a3.f148935a;
        }
        tVar.f148821e = aVar.getExpire();
        if (aVar.getCaptionFormat() != null) {
            str3 = aVar.getCaptionFormat();
        }
        tVar.f148822f = str3;
        tVar.f148823g = aVar.getSubId();
        return tVar;
    }

    public m(List<n> list, long j2) {
        this.f148941b = list.isEmpty() ? Collections.singletonList(n.f148944b) : list;
        this.f148940a = j2;
        this.f148942c = d.a().b().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        this.f148943d = d.a().b().getSimPlayerExperiment().cdnUrlExpiredOffset();
    }
}
