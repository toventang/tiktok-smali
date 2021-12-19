package com.ss.android.ugc.aweme.im.service.share.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public interface b {

    public static final class a {
        static {
            Covode.recordClassIndex(66579);
        }

        public static void a(String str, SharePackage sharePackage) {
            l.d(str, "");
            l.d(sharePackage, "");
        }
    }

    static {
        Covode.recordClassIndex(66578);
    }

    void a();

    void a(String str, SharePackage sharePackage);

    boolean a(SharePackage sharePackage);

    void b(SharePackage sharePackage);

    void c(SharePackage sharePackage);
}
