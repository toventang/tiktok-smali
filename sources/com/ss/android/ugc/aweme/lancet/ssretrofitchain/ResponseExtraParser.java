package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.g;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.sec.e;

public final class ResponseExtraParser {

    /* access modifiers changed from: package-private */
    public static class OldErrorModel {
        Data data;

        static {
            Covode.recordClassIndex(68599);
        }

        /* access modifiers changed from: package-private */
        public static class Data {
            String description;
            int error_code;
            String verify_center_decision_conf;
            String verify_center_secondary_decision_conf;

            static {
                Covode.recordClassIndex(68600);
            }

            Data() {
            }
        }

        OldErrorModel() {
        }
    }

    static {
        Covode.recordClassIndex(68598);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r9.equals("error_code") != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if (r9.equals("status_code") != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r5.f107268a > 0) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        r5.f107268a = r6.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        r6.o();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.lancet.ssretrofitchain.g a(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.a(java.lang.String):com.ss.android.ugc.aweme.lancet.ssretrofitchain.g");
    }

    public static g a(String str, u uVar) {
        long j2;
        g gVar = null;
        if (uVar == null) {
            return null;
        }
        T t = uVar.f42630b;
        if (t != null) {
            if (t instanceof BaseResponse) {
                return a(str, t, uVar);
            }
            if (t instanceof String) {
                return a(t.toString());
            }
            if (t instanceof FeedItemList) {
                T t2 = t;
                if (t2 == null) {
                    return null;
                }
                g.a aVar = new g.a();
                int i2 = t2.status_code;
                if (i2 == 0) {
                    i2 = t2.error_code;
                }
                aVar.f107268a = i2;
                aVar.f107269b = t2.status_msg;
                if (t2.extra != null) {
                    j2 = t2.extra.now;
                } else {
                    j2 = -1;
                }
                return new g(aVar, j2);
            }
        }
        if (uVar.f42629a == null || uVar.f42629a.f42477e == null) {
            return null;
        }
        b a2 = uVar.f42629a.a("Transfer-Encoding");
        if (a2 != null && "chunked".equalsIgnoreCase(a2.f42472b)) {
            return null;
        }
        try {
            System.currentTimeMillis();
            gVar = a(e.a(uVar.f42629a));
            return gVar;
        } catch (Throwable unused) {
            return gVar;
        }
    }

    private static g a(String str, BaseResponse baseResponse, u uVar) {
        long j2;
        if (baseResponse == null) {
            return null;
        }
        if (SecApiImpl.a().isCaptchaUrl(str)) {
            try {
                return a(e.a(uVar.f42629a));
            } catch (Exception unused) {
            }
        }
        g.a aVar = new g.a();
        aVar.f107268a = baseResponse.status_code;
        aVar.f107269b = baseResponse.status_msg;
        if (baseResponse.extra != null) {
            j2 = baseResponse.extra.now;
        } else {
            j2 = -1;
        }
        return new g(aVar, j2);
    }
}
