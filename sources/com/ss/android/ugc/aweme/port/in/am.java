package com.ss.android.ugc.aweme.port.in;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cg;
import com.ss.android.ugc.aweme.ch;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.port.internal.g;

public interface am {

    public interface a {
        static {
            Covode.recordClassIndex(74532);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(74531);
    }

    void a(Context context);

    void a(cg cgVar);

    void a(ch chVar);

    void a(FilterBean filterBean, int i2);

    void a(a aVar);

    void a(boolean z);

    boolean a();

    void b(a aVar);

    void b(boolean z);

    boolean b();

    void c();

    g d();
}
