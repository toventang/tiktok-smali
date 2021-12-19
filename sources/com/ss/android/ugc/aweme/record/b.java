package com.ss.android.ugc.aweme.record;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.n;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tools.view.a.c;
import h.f.a.a;
import h.u;
import h.z;
import java.util.List;

public interface b {
    static {
        Covode.recordClassIndex(78229);
    }

    u<Boolean, Integer, Long> checkMediaDurationValid(Context context, List<? extends MediaModel> list, long j2, long j3);

    n openAlbum(ShortVideoContext shortVideoContext, e eVar, int i2, c cVar, Bundle bundle);

    void subscribeAlbumClose(e eVar, a<z> aVar);

    void subscribeAlbumOpen(e eVar, a<z> aVar);
}
