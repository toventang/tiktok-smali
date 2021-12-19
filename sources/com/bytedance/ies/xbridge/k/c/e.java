package com.bytedance.ies.xbridge.k.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class e extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36230d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36231a;

    /* renamed from: b  reason: collision with root package name */
    public String f36232b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36233c;

    static {
        Covode.recordClassIndex(21659);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21660);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("channel", "accessKey", "enableDownloadAutoRetry");
    }
}
