package com.bytedance.retrofit2.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.s;
import com.bytedance.retrofit2.u;

public interface a {

    /* renamed from: com.bytedance.retrofit2.c.a$a  reason: collision with other inner class name */
    public interface AbstractC1036a {
        static {
            Covode.recordClassIndex(26005);
        }

        Request a();

        u a(Request request);

        b b();

        s c();
    }

    static {
        Covode.recordClassIndex(26004);
    }

    u intercept(AbstractC1036a aVar);
}
