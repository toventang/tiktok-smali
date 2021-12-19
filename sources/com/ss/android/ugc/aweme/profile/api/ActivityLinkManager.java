package com.ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import java.util.HashMap;
import java.util.Map;
import l.b.f;
import l.b.t;

public final class ActivityLinkManager {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, ActivityLinkResponse> f115973a = new HashMap();

    interface ActivityLinkApi {
        static {
            Covode.recordClassIndex(74790);
        }

        @f(a = "/aweme/v1/activity/profile_link/")
        q<ActivityLinkResponse> getLinkInfo();

        @f(a = "/aweme/v1/activity/profile_link/")
        q<ActivityLinkResponse> getLinkInfo(@t(a = "sec_uid") String str, @t(a = "show_other_banner") boolean z);
    }

    static {
        Covode.recordClassIndex(74789);
    }
}
