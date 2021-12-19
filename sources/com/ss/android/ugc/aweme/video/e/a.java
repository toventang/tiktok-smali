package com.ss.android.ugc.aweme.video.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.video.local.e;
import com.ss.android.ugc.playerkit.simapicommon.a.d;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.videoview.d.j;
import com.ss.android.ugc.playerkit.videoview.d.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashSet;

public final class a implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f143372a = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet<String> f143373c = new HashSet<>();

    private a() {
    }

    static {
        Covode.recordClassIndex(93830);
    }

    private static void b(String str) {
        f143373c.add(str);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j a(n.a aVar) {
        i iVar;
        com.ss.android.ugc.playerkit.videoview.d.i a2 = aVar.a();
        if (a2 == null || (iVar = a2.f148932a) == null) {
            j a3 = aVar.a(a2);
            if (a3 == null) {
                l.b();
            }
            return a3;
        } else if (f143373c.contains(iVar.getSourceId())) {
            return new j(iVar.getUri());
        } else {
            j a4 = aVar.a(a2);
            if (a4 == null) {
                l.b();
            }
            return a4;
        }
    }

    public static Aweme a(String str) {
        l.d(str, "");
        Aweme aweme = new Aweme();
        Video video = new Video();
        e eVar = new e();
        eVar.setSourceId(str);
        eVar.setUri(str);
        eVar.setUrlList(new ArrayList());
        eVar.getUrlList().add(eVar.getUri());
        eVar.setUrlKey(str);
        video.setPlayAddr(eVar);
        video.setPlayAddrBytevc1(video.getPlayAddr());
        aweme.setVideo(video);
        aweme.setAid(str);
        b(str);
        return aweme;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j c(n.a aVar) {
        i iVar;
        com.ss.android.ugc.playerkit.videoview.d.l c2 = aVar.c();
        if (c2 == null || c2.f148937a == null) {
            j a2 = aVar.a(c2);
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
        com.ss.android.ugc.playerkit.simapicommon.a.a aVar2 = c2.f148937a;
        if (aVar2 == null) {
            iVar = null;
        } else {
            iVar = new i();
            iVar.setSourceId(String.valueOf(aVar2.getSubId()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar2.getUrl());
            iVar.setUrlList(arrayList);
            iVar.setUri(aVar2.getUri());
        }
        l.b(iVar, "");
        if (f143373c.contains(iVar.getSourceId())) {
            return new j(iVar.getUri());
        }
        j a3 = aVar.a(c2);
        if (a3 == null) {
            l.b();
        }
        return a3;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j b(n.a aVar) {
        i iVar;
        com.ss.android.ugc.playerkit.videoview.d.a b2 = aVar.b();
        if (b2 == null || b2.f148923a == null) {
            j a2 = aVar.a(b2);
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
        d dVar = b2.f148923a;
        if (dVar == null) {
            iVar = null;
        } else {
            iVar = new i();
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
        l.b(iVar, "");
        if (f143373c.contains(iVar.getSourceId())) {
            return new j(iVar.getUri());
        }
        j a3 = aVar.a(b2);
        if (a3 == null) {
            l.b();
        }
        return a3;
    }
}
