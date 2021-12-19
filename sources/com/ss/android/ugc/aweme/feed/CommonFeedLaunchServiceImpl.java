package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.g.c;
import com.ss.android.ugc.b;

public class CommonFeedLaunchServiceImpl implements ICommonFeedLaunchService {
    static {
        Covode.recordClassIndex(57539);
    }

    public static ICommonFeedLaunchService b() {
        Object a2 = b.a(ICommonFeedLaunchService.class, false);
        if (a2 != null) {
            return (ICommonFeedLaunchService) a2;
        }
        return new CommonFeedLaunchServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void a() {
        if (c.a()) {
            com.ss.android.ugc.aweme.app.g.b bVar = c.b().f66747a;
            if (bVar.f66743a != null) {
                bVar.f66743a.sendMessage(bVar.f66743a.obtainMessage(1));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService
    public final void a(boolean z) {
        if (k.f93529c == null) {
            k.f93529c = Boolean.valueOf(z);
        }
    }
}
