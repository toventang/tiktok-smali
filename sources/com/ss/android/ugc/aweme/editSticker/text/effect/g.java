package com.ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.dependence.a.a.b.b;
import com.ss.android.ugc.aweme.dependence.a.a.b.e;
import com.ss.android.ugc.aweme.editSticker.b.a;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.List;

public final class g<T extends com.ss.android.ugc.aweme.editSticker.b.a> extends b<T, Void> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f88488i = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private final m<T, d<? super z>, Object> f88489j;

    static {
        Covode.recordClassIndex(55707);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55708);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.b.b
    public final boolean a() {
        return com.ss.android.ugc.aweme.editSticker.b.b.a(this.f79574h.f88093b);
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.b.b
    public final void b(com.ss.android.ugc.aweme.dependence.a.a.a.b<T, Void> bVar) {
        List<String> urlList;
        l.d(bVar, "");
        File file = new File(this.f79574h.f88093b.getZipPath());
        UrlModel fileUrl = this.f79574h.f88093b.getFileUrl();
        if (fileUrl == null || (urlList = fileUrl.getUrlList()) == null || urlList.isEmpty()) {
            this.f79572f = new e(-1, "EffectTextDownloadTask , effectId : " + this.f79574h.f88093b.getEffectId() + " , urlList is null or empty", null);
            bVar.c(this);
            return;
        }
        Downloader.with(com.ss.android.ugc.aweme.editSticker.d.a()).url(fileUrl.getUrlList().get(0)).savePath(file.getParent()).name(file.getName()).mainThreadListener(new e(this, this.f88489j, bVar)).download();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super T extends com.ss.android.ugc.aweme.editSticker.b.a, ? super h.c.d<? super h.z>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str, T t, m<? super T, ? super d<? super z>, ? extends Object> mVar) {
        super(str, t);
        l.d(str, "");
        l.d(t, "");
        this.f88489j = mVar;
    }
}
