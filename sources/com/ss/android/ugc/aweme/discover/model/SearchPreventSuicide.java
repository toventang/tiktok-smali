package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.suicide.PleaseNotice;
import com.ss.android.ugc.aweme.discover.model.suicide.Tools;
import com.ss.android.ugc.d.a.b;
import h.f.b.g;

public final class SearchPreventSuicide implements b {
    public static final Companion Companion = new Companion(null);
    @c(a = "notices")
    public PleaseNotice pleaseNotice;
    @c(a = "top_banner")
    public SearchOperation searchOperation;
    @c(a = "show_results_type")
    public String showResultsType;
    @c(a = "tools")
    public Tools tools;

    static {
        Covode.recordClassIndex(50957);
    }

    public final b post() {
        return com.ss.android.ugc.d.a.c.a(this);
    }

    public final b postSticky() {
        return com.ss.android.ugc.d.a.c.b(this);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(50958);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }
}
