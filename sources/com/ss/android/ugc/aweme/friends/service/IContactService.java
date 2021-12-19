package com.ss.android.ugc.aweme.friends.service;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.n;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;

public interface IContactService {
    static {
        Covode.recordClassIndex(61665);
    }

    n a();

    InboxAdapterWidget a(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData);
}
