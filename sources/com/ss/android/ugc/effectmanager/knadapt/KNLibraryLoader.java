package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import com.ss.ugc.effectplatform.algorithm.g;
import h.f.b.l;

public final class KNLibraryLoader implements g {
    private final DownloadableModelSupportLibraryLoader oldLibraryLoader;

    static {
        Covode.recordClassIndex(95549);
    }

    public KNLibraryLoader(DownloadableModelSupportLibraryLoader downloadableModelSupportLibraryLoader) {
        l.c(downloadableModelSupportLibraryLoader, "");
        this.oldLibraryLoader = downloadableModelSupportLibraryLoader;
    }

    @Override // com.ss.ugc.effectplatform.algorithm.g
    public final void loadLibrary(String str) {
        l.c(str, "");
        this.oldLibraryLoader.loadLibrary(str);
    }
}
