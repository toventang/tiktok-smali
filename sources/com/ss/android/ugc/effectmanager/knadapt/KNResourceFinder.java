package com.ss.android.ugc.effectmanager.knadapt;

import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import h.f.b.l;

public final class KNResourceFinder extends DownloadableModelSupportResourceFinder {
    private final ResourceFinder resourceFinder;

    static {
        Covode.recordClassIndex(95554);
    }

    @Override // com.bef.effectsdk.ResourceFinder, com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder
    public final long createNativeResourceFinder(long j2) {
        return this.resourceFinder.createNativeResourceFinder(j2);
    }

    @Override // com.bef.effectsdk.ResourceFinder, com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder
    public final void release(long j2) {
        this.resourceFinder.release(j2);
    }

    public KNResourceFinder(ResourceFinder resourceFinder2) {
        l.c(resourceFinder2, "");
        this.resourceFinder = resourceFinder2;
    }
}
