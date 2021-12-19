package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;

public final class RecommendMob {
    public static final RecommendMob INSTANCE = new RecommendMob();

    public static final class Event {
        public static final Event INSTANCE = new Event();

        private Event() {
        }

        static {
            Covode.recordClassIndex(61599);
        }
    }

    public static final class Key {
        public static final Key INSTANCE = new Key();

        private Key() {
        }

        static {
            Covode.recordClassIndex(61600);
        }
    }

    public static final class MobConstants {
        public static final MobConstants INSTANCE = new MobConstants();

        private MobConstants() {
        }

        static {
            Covode.recordClassIndex(61601);
        }
    }

    private RecommendMob() {
    }

    static {
        Covode.recordClassIndex(61598);
    }
}
