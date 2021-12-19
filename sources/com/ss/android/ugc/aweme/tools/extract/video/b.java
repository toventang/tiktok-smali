package com.ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.video.e;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f140120a;

    static {
        Covode.recordClassIndex(91562);
    }

    public b(Object obj) {
        this.f140120a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String extractFramesDir = ((VideoPublishEditModel) this.f140120a).extractFramesModel.getExtractFramesDir();
        e.e(extractFramesDir);
        e.c(extractFramesDir);
        return null;
    }
}
