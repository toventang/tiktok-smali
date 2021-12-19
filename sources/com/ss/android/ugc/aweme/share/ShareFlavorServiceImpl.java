package com.ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class ShareFlavorServiceImpl implements ShareFlavorService {

    /* renamed from: b  reason: collision with root package name */
    public static int f123254b = 500;

    /* renamed from: c  reason: collision with root package name */
    public static final a f123255c = new a((byte) 0);

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final String a() {
        return "copy_link";
    }

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final String a(String str, SharePackage sharePackage) {
        l.d(str, "");
        l.d(sharePackage, "");
        return str;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80964);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (r2 != null) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String a(java.lang.String r5) {
            /*
            // Method dump skipped, instructions count: 118
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl.a.a(java.lang.String):java.lang.String");
        }
    }

    static {
        Covode.recordClassIndex(80963);
    }

    public static ShareFlavorService b() {
        MethodCollector.i(11428);
        Object a2 = b.a(ShareFlavorService.class, false);
        if (a2 != null) {
            ShareFlavorService shareFlavorService = (ShareFlavorService) a2;
            MethodCollector.o(11428);
            return shareFlavorService;
        }
        if (b.dV == null) {
            synchronized (ShareFlavorService.class) {
                try {
                    if (b.dV == null) {
                        b.dV = new ShareFlavorServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11428);
                    throw th;
                }
            }
        }
        ShareFlavorServiceImpl shareFlavorServiceImpl = (ShareFlavorServiceImpl) b.dV;
        MethodCollector.o(11428);
        return shareFlavorServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final void a(String str, long j2, c cVar) {
        l.d(str, "");
        l.d(cVar, "");
        if (j2 < 1500) {
            String a2 = a.a(str);
            if (!TextUtils.isEmpty(a2)) {
                cVar.a("errorFileContent", a2);
            } else {
                cVar.a("errorFileContent", "file is null");
            }
        }
    }
}
