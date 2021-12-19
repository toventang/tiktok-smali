package com.ss.android.ugc.aweme.live;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    static HashMap<String, Integer> f108094a;

    static {
        Covode.recordClassIndex(69305);
        HashMap<String, Integer> hashMap = new HashMap<>();
        f108094a = hashMap;
        hashMap.put("pm_livecard_end_subtitle_2", Integer.valueOf((int) R.string.edb));
        f108094a.put("pm_livecard_end_subtitle_1", Integer.valueOf((int) R.string.eda));
        f108094a.put("pm_following_livecard_watch_guide2", Integer.valueOf((int) R.string.e3g));
        f108094a.put("pm_following_livecard_live_end", Integer.valueOf((int) R.string.e3b));
        f108094a.put("pm_following_livecard_live_icon", Integer.valueOf((int) R.string.e3d));
        f108094a.put("pm_following_livecard_watch_guide", Integer.valueOf((int) R.string.e3f));
        f108094a.put("pm_following_livecard_live_icon_backup", Integer.valueOf((int) R.string.e3e));
        f108094a.put("pm_following_livecard_live_end_guide", Integer.valueOf((int) R.string.e3c));
        f108094a.put("pm_live_mt_events_live_consumer_event_end", Integer.valueOf((int) R.string.e8x));
        f108094a.put("pm_mt_live_events_live_consumer_live_events", Integer.valueOf((int) R.string.e8y));
        f108094a.put("pm_mt_live_events_live_consumer_registered", Integer.valueOf((int) R.string.e8z));
        f108094a.put("pm_live_mt_events_mixed_card", Integer.valueOf((int) R.string.e90));
        f108094a.put("ttlive_core_network_unavailable", Integer.valueOf((int) R.string.gm8));
    }

    private static int a(String str) {
        Integer num = f108094a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static String a(Context context, String str) {
        int a2 = a(str);
        if (a2 == 0) {
            return "";
        }
        return context.getString(a2);
    }
}
