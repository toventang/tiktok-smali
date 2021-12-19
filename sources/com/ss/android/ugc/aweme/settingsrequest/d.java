package com.ss.android.ugc.aweme.settingsrequest;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig;
import com.ss.android.ugc.aweme.setting.by;
import com.ss.android.ugc.aweme.utils.gecko.c;
import java.util.Collection;
import java.util.List;

public class d implements by.a {
    static {
        Covode.recordClassIndex(80911);
    }

    @Override // com.ss.android.ugc.aweme.setting.by.a
    public void a(com.ss.android.ugc.aweme.setting.model.d dVar) {
        SettingsRequestServiceImpl.i().a(dVar);
        GeckoConfig m2 = com.ss.android.ugc.aweme.setting.model.d.m();
        if (m2 != null && !b.a((Collection) m2.getInitialChannel())) {
            List<String> initialChannel = m2.getInitialChannel();
            List<String> initialHighPriorityChannel = m2.getInitialHighPriorityChannel();
            List<String> dynamicChannel = m2.getDynamicChannel();
            if (initialChannel != null) {
                c.a.a().f142995a.a(initialChannel);
            }
            if (!b.a((Collection) initialHighPriorityChannel)) {
                c.a.a().f142996b.a(initialHighPriorityChannel);
            }
            if (!b.a((Collection) dynamicChannel)) {
                c.a.a().f142997c.a(dynamicChannel);
            }
            new StringBuilder("dynamicChannels: ").append(dynamicChannel).append(", highPriorityChannels: ").append(initialHighPriorityChannel);
        }
    }
}
