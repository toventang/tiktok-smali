package com.ss.android.ugc.aweme.feed.api;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import android.widget.Toast;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.b;
import com.ss.android.ugc.aweme.utils.ic;
import h.m.p;
import h.z;
import java.util.concurrent.Callable;

public final class ComplianceEncryptCheckInterceptor implements com.bytedance.retrofit2.c.a {
    static {
        Covode.recordClassIndex(57861);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Request f91919a;

        static {
            Covode.recordClassIndex(57862);
        }

        a(Request request) {
            this.f91919a = request;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            Activity j2 = f.j();
            StringBuilder sb = new StringBuilder("Missing Compliance Encrypt param! ");
            Request request = this.f91919a;
            if (request != null) {
                str = request.getUrl();
            } else {
                str = null;
            }
            Toast makeText = Toast.makeText(j2, sb.append(str).toString(), 1);
            if (Build.VERSION.SDK_INT == 25) {
                ic.a(makeText);
            }
            makeText.show();
            return z.f158842a;
        }
    }

    private static u<?> a(a.AbstractC1036a aVar) {
        Request request;
        String url;
        if (aVar != null) {
            request = aVar.a();
        } else {
            request = null;
        }
        if (request == null || (url = request.getUrl()) == null || !p.a((CharSequence) url, (CharSequence) "cmpl_enc", false)) {
            i.b(new a(request), i.f4826c);
        }
        if (aVar != null) {
            return aVar.a(request);
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.c.a
    public final u intercept(a.AbstractC1036a aVar) {
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
        u<?> a2 = a(aVar);
        if (bVar.X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.X;
            String simpleName = getClass().getSimpleName();
            bVar.a(simpleName, uptimeMillis2);
            bVar.c(simpleName, uptimeMillis2);
        }
        bVar.X = SystemClock.uptimeMillis();
        return a2;
    }
}
