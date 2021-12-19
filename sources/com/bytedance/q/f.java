package com.bytedance.q;

import com.bytedance.covode.number.Covode;

public interface f {
    static {
        Covode.recordClassIndex(25896);
    }

    <T> T a(Class<T> cls);

    public static class a implements f {
        static {
            Covode.recordClassIndex(25897);
        }

        @Override // com.bytedance.q.f
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
