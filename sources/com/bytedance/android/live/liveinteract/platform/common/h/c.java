package com.bytedance.android.live.liveinteract.platform.common.h;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12047a = new c();

    public enum a {
        NORMAL_VIDEO("normal_video_live"),
        LINE_UP("video_anchor_order"),
        LINK_MIC_ANCHOR("video_anchor_connect"),
        LINK_MIC_PK("video_anchor_pk"),
        LINK_MIC_GUEST("video_anchor_guest_connect");
        
        private final String desc;

        public final String getDesc() {
            return this.desc;
        }

        static {
            Covode.recordClassIndex(6567);
        }

        private a(String str) {
            this.desc = str;
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(6566);
    }
}
