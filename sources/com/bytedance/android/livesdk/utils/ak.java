package com.bytedance.android.livesdk.utils;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.EnumMap;
import java.util.Map;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<a, Long> f22237a = new EnumMap(a.class);

    /* renamed from: b  reason: collision with root package name */
    public static final ak f22238b = new ak();

    public enum a {
        PANEL_GIFT("gift"),
        PANEL_PROFILE("profile"),
        PANEL_HOURLY("hourly"),
        PANEL_QA("qa"),
        PANEL_LINK("link"),
        PANEL_HASHTAG_ANCHOR("panel_hashtag_anchor"),
        PANEL_HASHTAG_AUDIENCE("panel_hashtag_audience"),
        PANEL_BEAUTY_FILTER("panel_beauty_filter"),
        DEFAULT("default");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(13133);
        }

        private a(String str) {
            this.value = str;
        }
    }

    private ak() {
    }

    static {
        Covode.recordClassIndex(13132);
    }

    private static boolean c(a aVar) {
        if (aVar != a.DEFAULT) {
            return true;
        }
        return false;
    }

    public static final void a(a aVar) {
        l.d(aVar, "");
        if (!b(aVar)) {
            f22237a.put(aVar, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public static boolean b(a aVar) {
        if (PanelOpenCostTimesSetting.INSTANCE.getValue().f18747a && c(aVar) && aVar != null) {
            return false;
        }
        return true;
    }
}
