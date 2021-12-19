package com.bytedance.android.b.a;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.a;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface b extends a {
    static {
        Covode.recordClassIndex(3267);
    }

    Fragment createDrawerFeedFragment(com.bytedance.android.livesdkapi.g.b bVar);

    void delayInit();

    Map<String, Object> getFeedTab(long j2);

    Map<String, Object> getFeedTabForyouPage(long j2);

    n getStartLiveRoomInterceptor();

    void init();

    void preloadInboxTopLivesFeedAction(int i2);

    void requestTabListForyouPage();
}
