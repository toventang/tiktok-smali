package com.ss.android.ugc.aweme.compliance.api.services.consent;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public interface ITpcConsentService {

    public enum a {
        US,
        EU,
        KR,
        ROW;

        static {
            Covode.recordClassIndex(47385);
        }
    }

    static {
        Covode.recordClassIndex(47384);
    }

    void a();

    void a(int i2);

    void a(Activity activity, String str);

    boolean a(a aVar);

    void b(int i2);

    boolean b();

    void c();

    void d();

    boolean e();

    a f();

    void g();

    void h();

    void i();
}
