package com.ss.android.ugc.aweme.story.avatar;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import h.f.b.l;

public interface e extends g, h {

    public static final class a {
        static {
            Covode.recordClassIndex(89365);
        }

        public static void a(com.ss.android.ugc.aweme.tux.business.story.a aVar) {
            l.d(aVar, "");
            l.d(aVar, "");
        }
    }

    static {
        Covode.recordClassIndex(89364);
    }

    StoryBrandView a();

    void a(SmartRoute smartRoute, Aweme aweme);

    m b();

    o c();
}
