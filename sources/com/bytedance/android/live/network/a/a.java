package com.bytedance.android.live.network.a;

import com.bytedance.covode.number.Covode;

public @interface a {
    static {
        Covode.recordClassIndex(6619);
    }

    EnumC0254a a();

    /* renamed from: com.bytedance.android.live.network.a.a$a  reason: collision with other inner class name */
    public enum EnumC0254a {
        ROOM("room"),
        FEED("feed"),
        GIFT("gift"),
        BROADCAST("broadcast"),
        RANK_LIST("rank_list"),
        REPORT("report"),
        LINK_MIC("link_mic"),
        OTHER("other");
        
        public final String key;

        static {
            Covode.recordClassIndex(6620);
        }

        private EnumC0254a(String str) {
            this.key = str;
        }
    }
}
