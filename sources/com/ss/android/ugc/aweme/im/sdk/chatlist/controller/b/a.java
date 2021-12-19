package com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.im.service.e.a {
    static {
        Covode.recordClassIndex(65191);
    }

    @Override // com.ss.android.ugc.aweme.im.service.e.a
    public final InboxAdapterWidget a(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData) {
        l.d(fragment, "");
        l.d(liveData, "");
        return new FocusedSessionListWidget(fragment, liveData);
    }

    @Override // com.ss.android.ugc.aweme.im.service.e.a
    public final InboxAdapterWidget b(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData) {
        l.d(fragment, "");
        l.d(liveData, "");
        return new TopNoticeInboxWidget(fragment, liveData);
    }
}
