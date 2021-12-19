package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

public final class k {
    static {
        Covode.recordClassIndex(60147);
    }

    public enum a {
        SHOW("show"),
        FOLLOW("follow");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(60148);
        }

        private a(String str) {
            this.type = str;
        }
    }

    public enum b {
        LIKE("like"),
        POST(UGCMonitor.TYPE_POST),
        SHARE("share"),
        FINISH("finish");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(60149);
        }

        private b(String str) {
            this.type = str;
        }
    }
}
