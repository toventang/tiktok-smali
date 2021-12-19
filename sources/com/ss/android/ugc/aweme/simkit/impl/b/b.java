package com.ss.android.ugc.aweme.simkit.impl.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.playerkit.videoview.d.a;
import com.ss.android.ugc.playerkit.videoview.d.j;
import com.ss.android.ugc.playerkit.videoview.d.l;
import com.ss.android.ugc.playerkit.videoview.d.n;
import java.util.ArrayList;

public final class b implements n {

    /* renamed from: a  reason: collision with root package name */
    private final i f133522a;

    static {
        Covode.recordClassIndex(87335);
    }

    public b(i iVar) {
        this.f133522a = iVar;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j a(n.a aVar) {
        i b2;
        com.ss.android.ugc.playerkit.videoview.d.i a2 = aVar.a();
        com.ss.android.ugc.playerkit.simapicommon.a.i iVar = a2.f148932a;
        String[] strArr = a2.f148934c;
        if (strArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = strArr[i2] + a(strArr[i2], iVar.getSourceId());
            }
        }
        Object a3 = this.f133522a.a(iVar, a2.f148933b, strArr);
        if (d.a().b().getAppConfig().isDebug() && (b2 = s.b()) != null) {
            b2.d(iVar);
        }
        return new j(a3);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j b(n.a aVar) {
        com.ss.android.ugc.playerkit.simapicommon.a.i iVar;
        i b2;
        a b3 = aVar.b();
        com.ss.android.ugc.playerkit.simapicommon.a.d dVar = b3.f148923a;
        if (dVar == null) {
            iVar = null;
        } else {
            iVar = new com.ss.android.ugc.playerkit.simapicommon.a.i();
            if (dVar.getUrlKey() != null) {
                iVar.setSourceId(dVar.getUrlKey());
            }
            if (dVar.getFileHash() != null) {
                iVar.setFileHash(dVar.getFileHash());
            }
            iVar.setHeight(dVar.getHeight());
            iVar.setWidth(dVar.getWidth());
            iVar.setSize(dVar.getSize());
            if (dVar.getUri() != null) {
                iVar.setUri(dVar.getUri());
            }
            if (dVar.getUrlKey() != null) {
                iVar.setUrlKey(dVar.getUrlKey());
            }
            if (dVar.getUrlList() != null) {
                iVar.setUrlList(dVar.getUrlList());
            }
            if (dVar.getaK() != null) {
                iVar.setaK(dVar.getaK());
            }
        }
        String[] strArr = b3.f148925c;
        if (strArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = strArr[i2] + a(strArr[i2], iVar.getSourceId());
            }
        }
        Object a2 = this.f133522a.a(iVar, b3.f148924b, strArr);
        if (d.a().b().getAppConfig().isDebug() && (b2 = s.b()) != null) {
            b2.d(iVar);
        }
        return new j(a2);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j c(n.a aVar) {
        com.ss.android.ugc.playerkit.simapicommon.a.i iVar;
        i b2;
        l c2 = aVar.c();
        com.ss.android.ugc.playerkit.simapicommon.a.a aVar2 = c2.f148937a;
        if (aVar2 == null) {
            iVar = null;
        } else {
            iVar = new com.ss.android.ugc.playerkit.simapicommon.a.i();
            iVar.setSourceId(String.valueOf(aVar2.getSubId()));
            if (aVar2.getUrl() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar2.getUrl());
                iVar.setUrlList(arrayList);
            }
            if (aVar2.getUri() != null) {
                iVar.setUri(aVar2.getUri());
            }
        }
        String[] strArr = c2.f148939c;
        if (strArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = strArr[i2] + a(strArr[i2], iVar.getSourceId());
            }
        }
        Object a2 = this.f133522a.a(iVar, c2.f148938b, strArr);
        if (d.a().b().getAppConfig().isDebug() && (b2 = s.b()) != null) {
            b2.d(iVar);
        }
        return new j(a2);
    }

    private static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("?")) {
            return "&source_id=".concat(String.valueOf(str2));
        }
        return "?&source_id=".concat(String.valueOf(str2));
    }
}
