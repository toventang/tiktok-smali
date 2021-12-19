package com.ss.android.ugc.aweme.awemeservice.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;

public interface b<T> {
    static {
        Covode.recordClassIndex(41638);
    }

    Aweme a(T t);

    Collection<Aweme> a();

    void a(T t, Aweme aweme);

    void b();

    boolean b(T t);
}
