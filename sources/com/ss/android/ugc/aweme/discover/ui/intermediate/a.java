package com.ss.android.ugc.aweme.discover.ui.intermediate;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import h.a.n;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static C1941a f82592a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f82593b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final List<com.ss.android.ugc.aweme.discover.lynx.container.a> f82594c;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.intermediate.a$a  reason: collision with other inner class name */
    public static final class C1941a implements Serializable {
        @c(a = "data_list")
        private List<com.ss.android.ugc.aweme.discover.lynx.container.a> defaultConfigs = new ArrayList();

        static {
            Covode.recordClassIndex(51422);
        }

        public final List<com.ss.android.ugc.aweme.discover.lynx.container.a> getDefaultConfigs() {
            return this.defaultConfigs;
        }

        public final void setDefaultConfigs(List<com.ss.android.ugc.aweme.discover.lynx.container.a> list) {
            l.d(list, "");
            this.defaultConfigs = list;
        }
    }

    private a() {
    }

    public static List<com.ss.android.ugc.aweme.discover.lynx.container.a> a() {
        List<com.ss.android.ugc.aweme.discover.lynx.container.a> defaultConfigs;
        try {
            f82592a = (C1941a) SettingsManager.a().a("search_intermediate_config", C1941a.class, f82592a);
        } catch (Throwable unused) {
        }
        C1941a aVar = f82592a;
        if (aVar == null || (defaultConfigs = aVar.getDefaultConfigs()) == null) {
            return f82594c;
        }
        return defaultConfigs;
    }

    static {
        Covode.recordClassIndex(51421);
        d dVar = new d();
        dVar.setSchema("aweme://lynxview/?channel=fe_tiktok_lynx_search_transfer&bundle=template.js&group=fe_tiktok_lynx_search_transfer&ab_params=show_most_visited_account,show_suggest_search_words,intermediate_show_trending_billboard,is_lynx_request_suggest");
        f82594c = n.c(new com.ss.android.ugc.aweme.discover.lynx.container.a(dVar));
    }
}
