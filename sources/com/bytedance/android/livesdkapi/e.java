package com.bytedance.android.livesdkapi;

import com.bytedance.covode.number.Covode;

public interface e {

    public interface a {
        static {
            Covode.recordClassIndex(13742);
        }

        Object defValue();

        String key();

        boolean supportPersist();

        b type();
    }

    static {
        Covode.recordClassIndex(13741);
    }

    void a(a aVar, int i2);

    boolean a(a aVar);

    void b(a aVar);

    int c(a aVar);

    public enum b {
        Boolean,
        Integer,
        Long,
        Float,
        String,
        StrSet;

        static {
            Covode.recordClassIndex(13743);
        }
    }
}
