package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public interface ShareFlavorService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123252a = a.f123253a;

    static {
        Covode.recordClassIndex(80961);
    }

    String a();

    String a(String str, SharePackage sharePackage);

    void a(String str, long j2, c cVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f123253a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80962);
        }

        public static ShareFlavorService a() {
            ShareFlavorService b2 = ShareFlavorServiceImpl.b();
            l.b(b2, "");
            return b2;
        }
    }
}
