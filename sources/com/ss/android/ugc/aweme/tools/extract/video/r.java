package com.ss.android.ugc.aweme.tools.extract.video;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class r implements g {

    /* renamed from: a  reason: collision with root package name */
    private final VideoFramesUploadService f140176a;

    /* renamed from: b  reason: collision with root package name */
    private final o f140177b;

    /* renamed from: c  reason: collision with root package name */
    private final m f140178c;

    static {
        Covode.recordClassIndex(91579);
    }

    r(VideoFramesUploadService videoFramesUploadService, o oVar, m mVar) {
        this.f140176a = videoFramesUploadService;
        this.f140177b = oVar;
        this.f140178c = mVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        o oVar = this.f140177b;
        m mVar = this.f140178c;
        if (iVar.c()) {
            com.ss.android.ugc.aweme.port.in.g.a().o().k().a("extract_frame", iVar.e());
            return null;
        }
        VideoFramesUploadService.a(oVar, mVar);
        return null;
    }
}
