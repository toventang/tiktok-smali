package com.ss.android.ugc.aweme.awemeservice.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface IAwemeService {
    static {
        Covode.recordClassIndex(41648);
    }

    Aweme a(Aweme aweme);

    Aweme a(Aweme aweme, int i2);

    Aweme a(String str);

    Aweme a(String str, int i2);

    void a();

    void a(long j2);

    void a(String str, long j2);

    Aweme b(String str);

    void b(Aweme aweme, int i2);

    void b(String str, int i2);

    void c(Aweme aweme, int i2);

    void c(String str);

    void c(String str, int i2);

    Aweme d(String str);

    Aweme e(String str);
}
