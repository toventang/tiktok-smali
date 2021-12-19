package com.ss.android.ugc.aweme.simkit.impl.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.api.e;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.playerkit.videoview.d.j;
import com.ss.android.ugc.playerkit.videoview.d.l;
import com.ss.android.ugc.playerkit.videoview.d.n;
import java.util.ArrayList;

public final class a implements n {

    /* renamed from: a  reason: collision with root package name */
    i f133520a;

    /* renamed from: c  reason: collision with root package name */
    private e f133521c;

    static {
        Covode.recordClassIndex(87334);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j a(n.a aVar) {
        Object obj;
        i b2;
        com.ss.android.ugc.playerkit.videoview.d.i a2 = aVar.a();
        com.ss.android.ugc.playerkit.simapicommon.a.i iVar = a2.f148932a;
        e eVar = this.f133521c;
        if (eVar == null || (obj = eVar.a(iVar)) == null || TextUtils.isEmpty(obj.toString())) {
            obj = this.f133520a.a(iVar, iVar.getBitRatedRatioUri(), a2.f148934c);
        }
        if (d.a().b().getAppConfig().isDebug() && (b2 = s.b()) != null) {
            b2.d(iVar);
        }
        return new j(obj);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j c(n.a aVar) {
        Object obj;
        i b2;
        l c2 = aVar.c();
        com.ss.android.ugc.playerkit.simapicommon.a.a aVar2 = c2.f148937a;
        com.ss.android.ugc.playerkit.simapicommon.a.i iVar = null;
        if (aVar2 != null) {
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
        e eVar = this.f133521c;
        if (eVar == null || (obj = eVar.a(iVar)) == null || TextUtils.isEmpty(obj.toString())) {
            obj = this.f133520a.a(iVar, iVar.getSourceId(), c2.f148939c);
        }
        if (d.a().b().getAppConfig().isDebug() && (b2 = s.b()) != null) {
            b2.d(iVar);
        }
        return new j(obj);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j b(n.a aVar) {
        Object obj;
        i b2;
        com.ss.android.ugc.playerkit.videoview.d.a b3 = aVar.b();
        com.ss.android.ugc.playerkit.simapicommon.a.d dVar = b3.f148923a;
        com.ss.android.ugc.playerkit.simapicommon.a.i iVar = null;
        if (dVar != null) {
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
        e eVar = this.f133521c;
        if (eVar == null || (obj = eVar.a(iVar)) == null || TextUtils.isEmpty(obj.toString())) {
            obj = this.f133520a.a(iVar, iVar.getSourceId(), b3.f148925c);
        }
        if (d.a().b().getAppConfig().isDebug() && (b2 = s.b()) != null) {
            b2.d(iVar);
        }
        return new j(obj);
    }

    public a(i iVar, e eVar) {
        this.f133520a = iVar;
        this.f133521c = eVar;
    }
}
