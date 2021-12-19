package com.ss.android.ugc.aweme.feed.model;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.i;
import h.f.b.g;
import h.f.b.l;

public final class FeedSharePlayerViewModel extends ac {
    public static final Companion Companion = new Companion(null);
    public boolean hasBindCover;
    public i player;

    static {
        Covode.recordClassIndex(59381);
    }

    public static final i getPlayerManager(e eVar) {
        return Companion.getPlayerManager(eVar);
    }

    public static final FeedSharePlayerViewModel getViewModel(e eVar) {
        return Companion.getViewModel(eVar);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59382);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static ad com_ss_android_ugc_aweme_feed_model_FeedSharePlayerViewModel$Companion_androidx_lifecycle_VScopeLancet_of(e eVar) {
            return ae.a(eVar, (ad.b) null);
        }

        public final i getPlayerManager(e eVar) {
            l.d(eVar, "");
            return getViewModel(eVar).player;
        }

        public final FeedSharePlayerViewModel getViewModel(e eVar) {
            l.d(eVar, "");
            ac a2 = com_ss_android_ugc_aweme_feed_model_FeedSharePlayerViewModel$Companion_androidx_lifecycle_VScopeLancet_of(eVar).a(FeedSharePlayerViewModel.class);
            l.b(a2, "");
            return (FeedSharePlayerViewModel) a2;
        }
    }
}
