package com.ss.android.ugc.aweme.notification.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.e;
import com.ss.android.ugc.aweme.notification.view.template.d;
import com.ss.android.ugc.aweme.notification.view.template.f;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class c implements com.ss.android.ugc.aweme.notification.view.template.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113310a = new a((byte) 0);

    static {
        Covode.recordClassIndex(72862);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72863);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    public final boolean a(f fVar) {
        l.d(fVar, "");
        l.d(fVar, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    public final void a(d dVar) {
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        String str;
        e a2;
        l.d(dVar, "");
        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = dVar.f114024a.templateNotice;
        if (eVar != null && (cVar = eVar.f112844b) != null && (str = cVar.o) != null) {
            List<String> a3 = n.a(Uri.parse(str).getQueryParameter("channel"));
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 != null && (a2 = f2.a()) != null) {
                a2.c(a3);
            }
        }
    }
}
