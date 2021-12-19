package com.bytedance.android.livesdk.feed;

import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(9562);
    }

    void a(EnumC0361a aVar, String str);

    void a(EnumC0361a aVar, String str, Throwable th);

    void b(EnumC0361a aVar, String str);

    /* renamed from: com.bytedance.android.livesdk.feed.a$a  reason: collision with other inner class name */
    public enum EnumC0361a {
        REFRESH,
        LOAD_MORE;

        static {
            Covode.recordClassIndex(9563);
        }
    }
}
