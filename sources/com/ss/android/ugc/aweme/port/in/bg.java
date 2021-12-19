package com.ss.android.ugc.aweme.port.in;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

public interface bg {

    public interface a {
        static {
            Covode.recordClassIndex(74566);
        }

        String a();

        void a(int i2);

        void a(Fragment fragment);

        void a(b bVar);

        void a(String str);

        void a(boolean z);

        int b();

        View c();

        void d();
    }

    public interface b {
        static {
            Covode.recordClassIndex(74567);
        }

        boolean a(View view);
    }

    static {
        Covode.recordClassIndex(74565);
    }

    a a(e eVar);

    a b(e eVar);
}
