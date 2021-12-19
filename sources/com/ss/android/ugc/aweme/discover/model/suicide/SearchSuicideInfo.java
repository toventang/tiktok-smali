package com.ss.android.ugc.aweme.discover.model.suicide;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.g;

public final class SearchSuicideInfo {
    public static final Companion Companion = new Companion(null);
    public Aweme aweme;
    public GlobalDoodleConfig globalDoodleConfig;
    public PleaseNotice pleaseNotice;
    public SearchDialInfo searchDialInfo;
    public SearchOperation searchOperation;
    public int type = -1;

    static {
        Covode.recordClassIndex(50999);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(51000);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }
}
