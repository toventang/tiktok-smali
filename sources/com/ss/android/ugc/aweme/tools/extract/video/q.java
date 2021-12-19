package com.ss.android.ugc.aweme.tools.extract.video;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    private final VideoFramesUploadService f140174a;

    /* renamed from: b  reason: collision with root package name */
    private final m f140175b;

    static {
        Covode.recordClassIndex(91578);
    }

    q(VideoFramesUploadService videoFramesUploadService, m mVar) {
        this.f140174a = videoFramesUploadService;
        this.f140175b = mVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        m mVar = this.f140175b;
        if (iVar.c()) {
            return i.a(iVar.e());
        }
        if (VideoFramesUploadService.a()) {
            return i.a((Exception) new IllegalStateException("stop task manually for specified case"));
        }
        com.ss.android.ugc.aweme.port.in.g.a().o().k().a("extract_frame", "upload zip success");
        o oVar = (o) iVar.d();
        mVar.a(oVar);
        Iterator<n> it = oVar.f140169a.iterator();
        while (it.hasNext()) {
            com.ss.android.ugc.tools.utils.q.a(VideoFramesUploadService.f140115a + " upload zip succeed,uri:" + it.next().f140147c);
        }
        return VideoFramesUploadService.a(oVar);
    }
}
