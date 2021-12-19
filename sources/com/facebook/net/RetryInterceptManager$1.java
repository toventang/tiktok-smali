package com.facebook.net;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.d.d;
import com.facebook.common.k.g;
import com.facebook.net.h;
import com.ss.android.ugc.aweme.bs.b;
import java.util.List;

class RetryInterceptManager$1 implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f48947a;

    static {
        Covode.recordClassIndex(29502);
    }

    @Override // com.bytedance.retrofit2.c.a
    public u intercept(a.AbstractC1036a aVar) {
        if (!(aVar.c() instanceof b)) {
            return a(aVar);
        }
        b bVar = (b) aVar.c();
        if (bVar.W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.W;
            bVar.a(bVar.Y, uptimeMillis);
            bVar.b(bVar.Y, uptimeMillis);
        }
        bVar.a(getClass().getSimpleName());
        bVar.W = SystemClock.uptimeMillis();
        u a2 = a(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return a2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x0094 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.net.RetryInterceptManager$1] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.retrofit2.u] */
    /* JADX WARN: Type inference failed for: r3v5 */
    private u a(a.AbstractC1036a aVar) {
        Exception e2;
        RetryInterceptManager$1 retryInterceptManager$1;
        d dVar;
        List<Uri> list;
        RetryInterceptManager$1 retryInterceptManager$12 = this;
        int i2 = 0;
        while (true) {
            boolean z = true;
            try {
                Request a2 = aVar.a();
                Object extraInfo = a2.getExtraInfo();
                if ((extraInfo instanceof b) && (list = ((b) extraInfo).v) != null && list.size() - 1 >= i2) {
                    Uri uri = list.get(i2);
                    if (g.b(uri)) {
                        a2 = new Request(a2.getMethod(), uri.toString(), a2.getHeaders(), a2.getBody(), a2.getPriorityLevel(), a2.isResponseStreaming(), a2.getMaxLength(), a2.isAddCommonParam(), a2.getExtraInfo());
                    }
                }
                if (retryInterceptManager$12.f48947a.b()) {
                    Object extraInfo2 = a2.getExtraInfo();
                    if (extraInfo2 instanceof d) {
                        dVar = (d) extraInfo2;
                    } else {
                        dVar = new d();
                    }
                    dVar.f28942c = (long) retryInterceptManager$12.f48947a.f48994a.get(i2).intValue();
                    dVar.f28943d = (long) retryInterceptManager$12.f48947a.f48995b.get(i2).intValue();
                    a2.setExtraInfo(dVar);
                }
                try {
                    retryInterceptManager$12 = aVar.a(a2);
                    try {
                        if (retryInterceptManager$12 instanceof u) {
                            Object obj = retryInterceptManager$12.f42629a.f42478f;
                            if (obj instanceof com.bytedance.ttnet.d.b) {
                                ((com.bytedance.ttnet.d.b) obj).z.put("retryCount", i2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return retryInterceptManager$12;
                } catch (Exception e3) {
                    e2 = e3;
                    retryInterceptManager$1 = retryInterceptManager$12;
                }
            } catch (Exception e4) {
                e2 = e4;
                retryInterceptManager$1 = retryInterceptManager$12;
                if (!retryInterceptManager$1.f48947a.b()) {
                    break;
                }
                String message = e2.getMessage();
                if ("request canceled".equals(message) || "Canceled".equals(message) || "network not available".equals(message)) {
                    z = false;
                }
                if (!z) {
                    break;
                }
                i2++;
                if (i2 < retryInterceptManager$1.f48947a.f48996c) {
                    com.ss.a.a.a.d("RetryInterceptManager", "[intercept] retryNum: ".concat(String.valueOf(i2)));
                    retryInterceptManager$12 = retryInterceptManager$1;
                } else {
                    throw new h.a(e2, i2);
                }
                throw e2;
            }
            com.ss.a.a.a.d("RetryInterceptManager", "[intercept] retryNum: ".concat(String.valueOf(i2)));
            retryInterceptManager$12 = retryInterceptManager$1;
        }
        throw e2;
    }
}
