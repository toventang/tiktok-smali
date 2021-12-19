package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.d;

final /* synthetic */ class fl implements k.a {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131761a;

    static {
        Covode.recordClassIndex(86301);
    }

    fl(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131761a = videoRecordNewActivity;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a
    public final void a(d dVar) {
        VideoRecordNewActivity videoRecordNewActivity = this.f131761a;
        if (dVar != null) {
            if (videoRecordNewActivity.B != null) {
                videoRecordNewActivity.B.a(true);
            }
            videoRecordNewActivity.f131228g.aw = k.a(dVar);
        }
    }
}
