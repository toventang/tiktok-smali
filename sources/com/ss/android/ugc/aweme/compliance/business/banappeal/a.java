package com.ss.android.ugc.aweme.compliance.business.banappeal;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f76745a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(47442);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.a$a  reason: collision with other inner class name */
    public static final class C1751a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C1751a f76746a = new C1751a();

        static {
            Covode.recordClassIndex(47443);
        }

        C1751a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.compliance.api.model.a aVar = (com.ss.android.ugc.aweme.compliance.api.model.a) obj;
            if (aVar.status_code != 0 || aVar.getBanInfos() == null) {
                String str = aVar.extra.logid;
                l.b(str, "");
                com.ss.android.ugc.aweme.compliance.common.c.a.a("/tiktok/account/ban/detail/get/v1/", 1, str, String.valueOf(aVar.status_code));
                return;
            }
            List<com.ss.android.ugc.aweme.compliance.api.model.b> banInfos = aVar.getBanInfos();
            if (banInfos == null) {
                l.b();
            }
            l.d(banInfos, "");
            com.ss.android.ugc.aweme.compliance.common.b.f77288b.a(banInfos);
            com.ss.android.ugc.aweme.compliance.common.c.a.b("/tiktok/account/ban/detail/get/v1/", 0);
        }
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f76748a = new b();

        static {
            Covode.recordClassIndex(47444);
        }

        b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
            if (r3 == null) goto L_0x001a;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                boolean r0 = r5 instanceof com.ss.android.ugc.aweme.base.api.a.b.a
                if (r0 == 0) goto L_0x001a
                r0 = r5
                com.ss.android.ugc.aweme.base.api.a.b.a r0 = (com.ss.android.ugc.aweme.base.api.a.b.a) r0
                java.lang.Object r1 = r0.getRawResponse()
                java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.model.AccountBannedDetail"
                java.util.Objects.requireNonNull(r1, r0)
                com.ss.android.ugc.aweme.compliance.api.model.a r1 = (com.ss.android.ugc.aweme.compliance.api.model.a) r1
                com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r1.extra
                java.lang.String r3 = r0.logid
                if (r3 != 0) goto L_0x001c
            L_0x001a:
                java.lang.String r3 = ""
            L_0x001c:
                boolean r0 = r5 instanceof com.ss.android.ugc.aweme.base.api.a.a
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.base.api.a.a r5 = (com.ss.android.ugc.aweme.base.api.a.a) r5
                int r0 = r5.getErrorCode()
            L_0x0026:
                java.lang.String r2 = java.lang.String.valueOf(r0)
                java.lang.String r1 = "/tiktok/account/ban/detail/get/v1/"
                r0 = 1
                com.ss.android.ugc.aweme.compliance.common.c.a.a(r1, r0, r3, r2)
                return
            L_0x0031:
                r0 = -1
                goto L_0x0026
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.a.b.accept(java.lang.Object):void");
        }
    }
}
