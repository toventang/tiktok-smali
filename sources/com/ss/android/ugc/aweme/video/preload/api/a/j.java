package com.ss.android.ugc.aweme.video.preload.api.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.video.preload.api.i;
import com.ss.android.ugc.aweme.video.preload.i;
import java.io.File;

public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final j f143617a = new j();

    @Override // com.ss.android.ugc.aweme.video.preload.api.i
    public final boolean a() {
        return false;
    }

    private j() {
    }

    static {
        Covode.recordClassIndex(93958);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.i
    public final File a(Context context, i.a aVar) {
        File file;
        if (context != null) {
            if (d.f107194b == null || !d.f107197e) {
                d.f107194b = context.getCacheDir();
            }
            file = d.f107194b;
        } else {
            file = null;
        }
        return new File(file, i.a.VideoCache.getCacheDirName());
    }
}
