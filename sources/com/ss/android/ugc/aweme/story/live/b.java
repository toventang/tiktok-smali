package com.ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.deeplink.a;
import com.ss.android.ugc.aweme.profile.model.User;

public interface b {
    static {
        Covode.recordClassIndex(90241);
    }

    String a();

    void a(String str, Bundle bundle, Context context);

    boolean a(User user);

    void b();

    a c();
}
