package com.ss.android.c;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.p;
import java.util.Map;

public enum c {
    JOURNEY_SLOGAN_ID(101),
    JOURNEY_INTERESTS_ID(102),
    JOURNEY_CONTENT_LANGUAGE_ID(104),
    JOURNEY_APP_LANGUAGE_ID(105),
    JOURNEY_SWIPE_UP_ID(106),
    JOURNEY_PRIVATE_ACCOUNT_TIPS_ID(107),
    JOURNEY_AD_EXPERIENCE_ID(108),
    JOURNEY_DEEPLINK_ID(109),
    JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID(110),
    JOURNEY_NEW_USER_ADD_FB_FRIENDS_ID(111),
    JOURNEY_GENDER_SELECTION(112);
    
    public static final a Companion = new a((byte) 0);
    public static final Map<Integer, c> map;
    private final int id;

    public static final class a {
        static {
            Covode.recordClassIndex(36567);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(int i2) {
            return c.map.get(Integer.valueOf(i2));
        }
    }

    public final int getId() {
        return this.id;
    }

    static {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        c cVar6;
        c cVar7;
        c cVar8;
        c cVar9;
        c cVar10;
        c cVar11;
        Covode.recordClassIndex(36566);
        map = ag.a(new p(Integer.valueOf(cVar.id), cVar), new p(Integer.valueOf(cVar2.id), cVar2), new p(Integer.valueOf(cVar3.id), cVar3), new p(Integer.valueOf(cVar4.id), cVar4), new p(Integer.valueOf(cVar5.id), cVar5), new p(Integer.valueOf(cVar6.id), cVar6), new p(Integer.valueOf(cVar7.id), cVar7), new p(Integer.valueOf(cVar8.id), cVar8), new p(Integer.valueOf(cVar9.id), cVar9), new p(Integer.valueOf(cVar10.id), cVar10), new p(Integer.valueOf(cVar11.id), cVar11));
    }

    private c(int i2) {
        this.id = i2;
    }
}
