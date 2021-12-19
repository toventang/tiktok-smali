package com.ss.android.ugc.aweme.filter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.dependence.a.a.b.e;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.dependence.a.a.b.b<Effect, z> {
    static {
        Covode.recordClassIndex(60495);
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.b.b
    public final void b(com.ss.android.ugc.aweme.dependence.a.a.a.b<Effect, z> bVar) {
        List<String> urlList;
        l.d(bVar, "");
        File file = new File(this.f79574h.getZipPath());
        UrlModel fileUrl = this.f79574h.getFileUrl();
        if (fileUrl == null || (urlList = fileUrl.getUrlList()) == null || urlList.isEmpty()) {
            this.f79572f = new e(-1, "", null);
            bVar.c(this);
            return;
        }
        Downloader.with(i.f115645a).url(fileUrl.getUrlList().get(0)).savePath(file.getParent()).name(file.getName()).subThreadListener(new a(this, bVar)).download();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, Effect effect) {
        super(str, effect);
        l.d(str, "");
        l.d(effect, "");
    }
}
