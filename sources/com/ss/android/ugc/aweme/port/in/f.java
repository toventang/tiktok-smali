package com.ss.android.ugc.aweme.port.in;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements DownloadableModelSupportLibraryLoader {

    /* renamed from: a  reason: collision with root package name */
    static final DownloadableModelSupportLibraryLoader f115638a = new f();

    static {
        Covode.recordClassIndex(74588);
    }

    private f() {
    }

    @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
    public final void loadLibrary(String str) {
        AVServiceImpl.a().loadLibrary(str, c.f115622a);
    }
}
