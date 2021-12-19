package com.ss.android.ugc.aweme.video.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.videoview.d.a;
import com.ss.android.ugc.playerkit.videoview.d.j;
import com.ss.android.ugc.playerkit.videoview.d.l;
import com.ss.android.ugc.playerkit.videoview.d.n;
import java.util.List;

public final class c implements n {
    static {
        Covode.recordClassIndex(93832);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j b(n.a aVar) {
        a b2 = aVar.b();
        String a2 = i.a(com.ss.android.ugc.aweme.video.simcommon.a.a(b2.f148923a).getSourceId());
        if (!TextUtils.isEmpty(a2)) {
            return new j(a2);
        }
        return aVar.a(b2);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j c(n.a aVar) {
        l c2 = aVar.c();
        String a2 = i.a(com.ss.android.ugc.aweme.video.simcommon.a.a(c2.f148937a).getSourceId());
        if (!TextUtils.isEmpty(a2)) {
            return new j(a2);
        }
        return aVar.a(c2);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j a(n.a aVar) {
        Aweme b2;
        List<LongVideo> longVideos;
        Video video;
        com.ss.android.ugc.playerkit.videoview.d.i a2 = aVar.a();
        VideoUrlModel a3 = com.ss.android.ugc.aweme.video.simcommon.a.a(a2.f148932a);
        String sourceId = a3.getSourceId();
        double duration = a3.getDuration();
        if (!TextUtils.isEmpty(sourceId) && (b2 = AwemeService.b().b(sourceId)) != null && (longVideos = b2.getLongVideos()) != null && !longVideos.isEmpty()) {
            for (LongVideo longVideo : longVideos) {
                if (!(longVideo == null || (video = longVideo.getVideo()) == null || ((double) video.getDuration()) != duration)) {
                    return aVar.a(a2);
                }
            }
        }
        String a4 = i.a(a3.getSourceId());
        if (!TextUtils.isEmpty(a4)) {
            return new j(a4);
        }
        return aVar.a(a2);
    }
}
