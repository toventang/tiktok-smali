package com.ss.android.ugc.aweme.tools.extract.video;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.d;
import java.util.Iterator;

final /* synthetic */ class p implements g {

    /* renamed from: a  reason: collision with root package name */
    private final VideoFramesUploadService f140170a;

    /* renamed from: b  reason: collision with root package name */
    private final m f140171b;

    /* renamed from: c  reason: collision with root package name */
    private final o f140172c;

    /* renamed from: d  reason: collision with root package name */
    private final d f140173d;

    static {
        Covode.recordClassIndex(91577);
    }

    p(VideoFramesUploadService videoFramesUploadService, m mVar, o oVar, d dVar) {
        this.f140170a = videoFramesUploadService;
        this.f140171b = mVar;
        this.f140172c = oVar;
        this.f140173d = dVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        VideoFramesUploadService videoFramesUploadService = this.f140170a;
        m mVar = this.f140171b;
        o oVar = this.f140172c;
        d dVar = this.f140173d;
        if (iVar.c()) {
            return i.a(iVar.e());
        }
        mVar.a((o) iVar.d());
        Iterator<n> it = ((o) iVar.d()).f140169a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        com.ss.android.ugc.aweme.port.in.g.a().o().k().a("extract_frame", "package zip success.");
        return videoFramesUploadService.a(oVar, dVar.f118725d);
    }
}
