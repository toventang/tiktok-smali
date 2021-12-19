package org.chromium.diagnosis;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.a.a;
import com.ttnet.org.chromium.net.c;
import com.ttnet.org.chromium.net.w;
import java.util.List;
import org.chromium.CronetClient;

public class CronetDiagnosisRequestImpl implements com.bytedance.frameworks.baselib.network.http.cronet.a.a {
    private static final String TAG = CronetDiagnosisRequestImpl.class.getSimpleName();
    private static c sCronetEngine;
    public a.AbstractC0622a mCallback;
    private a mCronetCallback = new a();
    private w mRequest;

    private c getCronetEngine() {
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
        }
        return CronetClient.getCronetEngine();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.a.a
    public void cancel() {
        w wVar = this.mRequest;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.a.a
    public void start() {
        w wVar = this.mRequest;
        if (wVar != null) {
            wVar.a();
        }
    }

    static {
        Covode.recordClassIndex(106444);
    }

    private static void loadCronetKernel() {
        Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("preInitCronetKernel");
    }

    class a implements w.b {
        static {
            Covode.recordClassIndex(106445);
        }

        a() {
        }

        @Override // com.ttnet.org.chromium.net.w.b
        public final void a(String str) {
            CronetDiagnosisRequestImpl.this.mCallback.a(str);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.a.a
    public void doExtraCommand(String str, String str2) {
        w wVar = this.mRequest;
        if (wVar != null) {
            wVar.a(str, str2);
        }
    }

    public CronetDiagnosisRequestImpl(a.AbstractC0622a aVar, int i2, List<String> list, int i3, int i4) {
        this.mCallback = aVar;
        if (sCronetEngine == null) {
            sCronetEngine = getCronetEngine();
        }
        c cVar = sCronetEngine;
        if (cVar != null) {
            w.a a2 = cVar.a(this.mCronetCallback);
            a2.a(i2).a(list).b(i3).c(i4);
            this.mRequest = a2.a();
            return;
        }
        throw new UnsupportedOperationException("Can not get cronet engine.");
    }
}
