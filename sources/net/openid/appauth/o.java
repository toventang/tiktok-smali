package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Map;

public final class o implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final o f159714a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(106101);
    }

    @Override // net.openid.appauth.k
    public final Map<String, String> a(String str) {
        return Collections.singletonMap("client_id", str);
    }
}
