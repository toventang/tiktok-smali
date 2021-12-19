package com.ss.android.ugc.aweme.journey.step;

import com.bytedance.covode.number.Covode;
import com.ss.android.c.c;
import com.ss.android.ugc.aweme.journey.step.a.a;
import com.ss.android.ugc.aweme.journey.step.c.d;
import com.ss.android.ugc.aweme.journey.step.interestselector.e;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, c<?, ? super ComponentDependencies>> f104942a;

    static {
        Covode.recordClassIndex(67275);
    }

    public b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f104942a = linkedHashMap;
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_SLOGAN_ID.getId()), new com.ss.android.ugc.aweme.journey.step.g.c());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_INTERESTS_ID.getId()), new e());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID.getId()), new com.ss.android.ugc.aweme.journey.step.f.b());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_SWIPE_UP_ID.getId()), new com.ss.android.ugc.aweme.journey.step.swipeup.c());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_APP_LANGUAGE_ID.getId()), new com.ss.android.ugc.aweme.journey.step.b.c());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_CONTENT_LANGUAGE_ID.getId()), new d());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_AD_EXPERIENCE_ID.getId()), new a());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_DEEPLINK_ID.getId()), new com.ss.android.ugc.aweme.journey.step.d.d());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID.getId()), new com.ss.android.ugc.aweme.journey.step.h.a());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_NEW_USER_ADD_FB_FRIENDS_ID.getId()), new com.ss.android.ugc.aweme.journey.step.h.c());
        linkedHashMap.put(Integer.valueOf(c.JOURNEY_GENDER_SELECTION.getId()), new com.ss.android.ugc.aweme.journey.step.e.c());
    }

    public final c<?, ? super ComponentDependencies> a(int i2) {
        return this.f104942a.get(Integer.valueOf(i2));
    }
}
