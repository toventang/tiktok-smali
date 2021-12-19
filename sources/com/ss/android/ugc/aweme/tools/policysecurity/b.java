package com.ss.android.ugc.aweme.tools.policysecurity;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<OriginalSoundUploadTask> f141005a = new ArrayList();

    static {
        Covode.recordClassIndex(92050);
    }

    public final b a(OriginalSoundUploadTask originalSoundUploadTask) {
        l.d(originalSoundUploadTask, "");
        this.f141005a.add(originalSoundUploadTask);
        return this;
    }
}
