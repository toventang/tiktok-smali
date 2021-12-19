package com.ss.android.ugc.aweme.friends.invite;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.inbox.widget.b;
import h.z;

public interface a {
    static {
        Covode.recordClassIndex(61489);
    }

    void a();

    void a(Fragment fragment);

    void a(Friend friend);

    void a(b bVar);

    void b();

    LiveData<Boolean> getOnLoading();

    void setOutClickListener(h.f.a.b<? super String, z> bVar);
}
