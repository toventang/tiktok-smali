package com.ss.android.ugc.aweme.compliance.api.services.familypairing;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ck.j;

public interface IFamilyPairingService {

    public enum a {
        UNLINK_LOCKED,
        PARENT,
        CHILD,
        NONE;

        static {
            Covode.recordClassIndex(47391);
        }
    }

    static {
        Covode.recordClassIndex(47390);
    }

    a a();

    void a(Activity activity);

    boolean a(String str);

    j b();

    void b(Activity activity);

    j c();

    IInterceptor d();

    boolean e();
}
