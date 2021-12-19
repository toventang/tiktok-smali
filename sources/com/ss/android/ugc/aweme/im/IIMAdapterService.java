package com.ss.android.ugc.aweme.im;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public interface IIMAdapterService {
    static {
        Covode.recordClassIndex(63768);
    }

    void a(User user);

    boolean a();

    boolean b();

    boolean c();
}
