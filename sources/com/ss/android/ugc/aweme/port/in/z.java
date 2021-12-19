package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public interface z {

    public interface a {
        static {
            Covode.recordClassIndex(74615);
        }

        void a();

        void b();
    }

    public interface b {
        static {
            Covode.recordClassIndex(74616);
        }

        void a(int i2, boolean z);
    }

    static {
        Covode.recordClassIndex(74614);
    }

    com.ss.android.ugc.aweme.account.model.a a(String str, String str2);

    void a(Activity activity, String str, String str2, Bundle bundle, a aVar);

    void a(Fragment fragment, String str, String str2, a aVar);

    void a(b bVar);

    void a(String str, String str2, int i2, h.f.a.b<? super Integer, h.z> bVar);

    boolean a();

    void b(b bVar);

    boolean b();

    String c();

    String d();

    com.ss.android.ugc.aweme.account.model.a e();

    boolean f();

    boolean g();

    boolean h();

    void i();
}
