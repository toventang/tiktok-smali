package com.bytedance.android.livesdkapi.depend.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public enum a {
    FEED_WITH_PREVIEW("feed_with_preview"),
    FEED("feed"),
    FEED_SHORTCUT("feed_shortcut"),
    MOMENT("moment"),
    SLIDE("slide"),
    LIVE_END("live_end"),
    PUSH("push"),
    WEB("web"),
    OTHER("other");
    
    public final String typeName;

    static {
        Covode.recordClassIndex(13580);
    }

    public static a convert(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1068531200:
                if (!str.equals("moment")) {
                    return null;
                }
                return MOMENT;
            case 117588:
                if (!str.equals("web")) {
                    return null;
                }
                return WEB;
            case 3138974:
                if (!str.equals("feed")) {
                    return null;
                }
                return FEED;
            case 3452698:
                if (!str.equals("push")) {
                    return null;
                }
                return PUSH;
            case 106069776:
                if (!str.equals("other")) {
                    return null;
                }
                return OTHER;
            case 109526449:
                if (!str.equals("slide")) {
                    return null;
                }
                return SLIDE;
            case 758159815:
                if (!str.equals("feed_shortcut")) {
                    return null;
                }
                return FEED_SHORTCUT;
            case 1418007304:
                if (!str.equals("live_end")) {
                    return null;
                }
                return LIVE_END;
            case 1595681360:
                if (!str.equals("feed_with_preview")) {
                    return null;
                }
                return FEED_WITH_PREVIEW;
            default:
                return null;
        }
    }

    private a(String str) {
        this.typeName = str;
    }
}
