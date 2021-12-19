package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import h.f.b.l;
import java.util.List;

public final class b implements c {
    static {
        Covode.recordClassIndex(84697);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(long j2, long j3) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void b(ShortVideoContext shortVideoContext, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, MediaState mediaState) {
        l.d(mediaState, "");
        l.d(mediaState, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        l.d(myMediaModel, "");
        l.d(myMediaModel, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, String str) {
        l.d(str, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.b bVar, String str) {
        r.a("choose_upload_content", new com.ss.android.ugc.tools.f.b().a("content_type", UGCMonitor.TYPE_PHOTO).a("upload_type", "multiple_content").f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, List<? extends MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.b bVar, String str) {
        r.a("choose_upload_content", new com.ss.android.ugc.tools.f.b().a("content_type", "video").a("upload_type", "multiple_content").f149193a);
    }
}
