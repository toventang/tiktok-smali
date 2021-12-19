package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import java.util.Map;

public class VerifyInterceptor implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f107244a = false;

    static {
        Covode.recordClassIndex(68601);
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

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0087 A[ADDED_TO_REGION, EDGE_INSN: B:64:0x0087->B:34:0x0087 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.retrofit2.u a(com.bytedance.retrofit2.c.a.AbstractC1036a r9) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor.a(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.u");
    }

    private static Request a(Request request, c.a aVar) {
        if (f107244a) {
            request.getUrl();
        }
        Uri.Builder buildUpon = Uri.parse(request.getUrl()).buildUpon();
        for (Map.Entry<String, String> entry : aVar.f107263c.entrySet()) {
            if (f107244a) {
                entry.getKey();
                entry.getValue();
            }
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return request.newBuilder().a(buildUpon.build().toString()).a();
    }
}
