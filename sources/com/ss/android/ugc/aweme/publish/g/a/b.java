package com.ss.android.ugc.aweme.publish.g.a;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.settings.i;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.edit.model.a;
import java.util.List;

public final class b implements k<SynthetiseResult> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f118780a;

    static {
        Covode.recordClassIndex(77143);
    }

    @Override // com.google.c.h.a.k
    public final void onFailure(Throwable th) {
    }

    public b(List<String> list) {
        this.f118780a = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.h.a.k
    public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        if (synthetiseResult2.audioLength - synthetiseResult2.videoLength > 3000.0f) {
            int b2 = (int) a.b(synthetiseResult2.editPreviewInfo);
            if (i.a()) {
                o.a("aweme_synthesis_lost_video_log", new ar().a("fileInfo", synthetiseResult2.toString()).a("duration", Integer.valueOf(b2)).a());
            }
        }
        if (!this.f118780a.isEmpty() && i.a()) {
            o.a("aweme_synthesis_skip_frame_log", new ar().a("fileInfo", this.f118780a.toString()).a());
        }
    }
}
