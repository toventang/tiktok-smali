package com.bytedance.ies.xbridge.n.d;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.a.n;
import java.util.List;

public final class f extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36354d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36355a;

    /* renamed from: b  reason: collision with root package name */
    public String f36356b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f36357c;

    static {
        Covode.recordClassIndex(21781);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21782);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("message", StringSet.type, "duration");
    }
}
