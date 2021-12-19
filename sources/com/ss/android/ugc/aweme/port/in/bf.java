package com.ss.android.ugc.aweme.port.in;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bq.a.e;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public interface bf {
    static {
        Covode.recordClassIndex(74564);
    }

    User a(Intent intent);

    List<e> a();

    List<e> a(long j2);

    List<User> a(List<User> list, String str);

    void a(Fragment fragment);

    void a(Fragment fragment, String str, int i2);

    boolean a(int i2);

    List<e> b();
}
