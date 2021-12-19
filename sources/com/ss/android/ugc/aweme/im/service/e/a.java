package com.ss.android.ugc.aweme.im.service.e;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;

public interface a {
    static {
        Covode.recordClassIndex(66530);
    }

    InboxAdapterWidget a(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData);

    InboxAdapterWidget b(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData);
}
