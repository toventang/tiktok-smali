package com.ss.android.ugc.aweme.search.k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.n.d;
import h.a.am;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.q;
import h.z;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class c<T extends c<T>> extends b<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final h f121225d = i.a((h.f.a.a) b.f121245a);

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Set<String>> f121226e;
    public static final a p = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(79005);
        }

        public static ExecutorService a() {
            return (ExecutorService) c.f121225d.getValue();
        }

        private a() {
        }

        static final class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f121236a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Set f121237b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ JSONObject f121238c;

            static {
                Covode.recordClassIndex(79009);
            }

            d(String str, Set set, JSONObject jSONObject) {
                this.f121236a = str;
                this.f121237b = set;
                this.f121238c = jSONObject;
            }

            public final void run() {
                c.f121226e.put(this.f121236a, n.p(this.f121237b));
                r.a(this.f121236a, this.f121238c);
            }
        }

        static final class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f121239a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f121240b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.search.n.h f121241c;

            static {
                Covode.recordClassIndex(79010);
            }

            e(String str, String str2, com.ss.android.ugc.aweme.search.n.h hVar) {
                this.f121239a = str;
                this.f121240b = str2;
                this.f121241c = hVar;
            }

            public final void run() {
                String str;
                c.f121226e.put(this.f121239a, am.b("search_id"));
                String str2 = this.f121239a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("search_id", this.f121240b);
                com.ss.android.ugc.aweme.search.n.h hVar = this.f121241c;
                if (hVar != null) {
                    str = hVar.getSearchId();
                } else {
                    str = null;
                }
                jSONObject.put("search_id_x", str);
                r.a(str2, jSONObject);
            }
        }

        public static final class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f121242a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f121243b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.search.n.h f121244c;

            static {
                Covode.recordClassIndex(79011);
            }

            public f(String str, String str2, com.ss.android.ugc.aweme.search.n.h hVar) {
                this.f121242a = str;
                this.f121243b = str2;
                this.f121244c = hVar;
            }

            public final void run() {
                String str;
                c.f121226e.put(this.f121242a, am.b("search_keyword"));
                String str2 = this.f121242a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("search_keyword", this.f121243b);
                com.ss.android.ugc.aweme.search.n.h hVar = this.f121244c;
                if (hVar != null) {
                    str = hVar.getSearchKeyword();
                } else {
                    str = null;
                }
                jSONObject.put("search_keyword_x", str);
                r.a(str2, jSONObject);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.search.k.c$a$c  reason: collision with other inner class name */
        static final class RunnableC3137c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f121232a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f121233b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f121234c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.search.n.h f121235d;

            static {
                Covode.recordClassIndex(79008);
            }

            RunnableC3137c(String str, String str2, String str3, com.ss.android.ugc.aweme.search.n.h hVar) {
                this.f121232a = str;
                this.f121233b = str2;
                this.f121234c = str3;
                this.f121235d = hVar;
            }

            public final void run() {
                String str;
                c.f121226e.put(this.f121232a, am.b("search_id", "search_keyword"));
                String str2 = this.f121232a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("search_id", this.f121233b);
                jSONObject.put("search_keyword", this.f121234c);
                com.ss.android.ugc.aweme.search.n.h hVar = this.f121235d;
                String str3 = null;
                if (hVar != null) {
                    str = hVar.getSearchId();
                } else {
                    str = null;
                }
                jSONObject.put("search_id_x", str);
                com.ss.android.ugc.aweme.search.n.h hVar2 = this.f121235d;
                if (hVar2 != null) {
                    str3 = hVar2.getSearchKeyword();
                }
                jSONObject.put("search_keyword_x", str3);
                r.a(str2, jSONObject);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.search.k.c$a$a  reason: collision with other inner class name */
        public static final class RunnableC3136a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f121227a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ JSONObject f121228b;

            static {
                Covode.recordClassIndex(79006);
            }

            public RunnableC3136a(String str, JSONObject jSONObject) {
                this.f121227a = str;
                this.f121228b = jSONObject;
            }

            public final void run() {
                try {
                    if (!l.a((Object) "search_refactor_mob_validator_key", (Object) this.f121227a)) {
                        JSONObject jSONObject = new JSONObject();
                        Set<String> set = c.f121226e.get(this.f121227a);
                        if (set != null) {
                            for (T t : set) {
                                JSONObject jSONObject2 = this.f121228b;
                                if (!TextUtils.isEmpty(t) && (!l.a((Object) jSONObject2.optString(t), (Object) jSONObject2.optString(((String) t) + "_x")))) {
                                    jSONObject.put(t, this.f121228b.optString(t));
                                    jSONObject.put(((String) t) + "_x", this.f121228b.optString(((String) t) + "_x"));
                                }
                            }
                        }
                        if (jSONObject.length() != 0) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("search_refactor_diff_event", this.f121227a);
                            jSONObject3.put("search_refactor_diff_param", jSONObject.toString());
                            com.ss.android.common.c.a.a("search_refactor_mob_validator_key", jSONObject3);
                            q.m223constructorimpl(z.f158842a);
                        }
                    }
                } catch (Throwable th) {
                    q.m223constructorimpl(h.r.a(th));
                }
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f121229a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ad f121230b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.search.n.h f121231c;

            static {
                Covode.recordClassIndex(79007);
            }

            b(String str, ad adVar, com.ss.android.ugc.aweme.search.n.h hVar) {
                this.f121229a = str;
                this.f121230b = adVar;
                this.f121231c = hVar;
            }

            public final void run() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                Map<String, String> searchTrackMap;
                Map<String, String> searchTrackMap2;
                String str8 = "ref_search_validate_adapter_" + this.f121229a;
                c.f121226e.put(str8, am.b("search_id", "search_keyword", "tns_ban_type", "use_scenario"));
                JSONObject jSONObject = new JSONObject();
                ad adVar = this.f121230b;
                String str9 = null;
                if (adVar != null) {
                    str = adVar.f121172a;
                } else {
                    str = null;
                }
                jSONObject.put("search_id", str);
                ad adVar2 = this.f121230b;
                if (adVar2 != null) {
                    str2 = adVar2.f121173b;
                } else {
                    str2 = null;
                }
                jSONObject.put("search_keyword", str2);
                com.ss.android.ugc.aweme.search.n.h hVar = this.f121231c;
                if (hVar != null) {
                    str3 = hVar.getSearchId();
                } else {
                    str3 = null;
                }
                jSONObject.put("search_id_x", str3);
                com.ss.android.ugc.aweme.search.n.h hVar2 = this.f121231c;
                if (hVar2 != null) {
                    str4 = hVar2.getSearchKeyword();
                } else {
                    str4 = null;
                }
                jSONObject.put("search_keyword_x", str4);
                ad adVar3 = this.f121230b;
                if (adVar3 != null) {
                    str5 = adVar3.f121174c;
                } else {
                    str5 = null;
                }
                jSONObject.put("tns_ban_type", str5);
                ad adVar4 = this.f121230b;
                if (adVar4 != null) {
                    str6 = adVar4.f121175d;
                } else {
                    str6 = null;
                }
                jSONObject.put("use_scenario", str6);
                com.ss.android.ugc.aweme.search.n.h hVar3 = this.f121231c;
                if (hVar3 == null || (searchTrackMap2 = hVar3.getSearchTrackMap()) == null) {
                    str7 = null;
                } else {
                    str7 = searchTrackMap2.get("tns_ban_type");
                }
                jSONObject.put("tns_ban_type_x", str7);
                com.ss.android.ugc.aweme.search.n.h hVar4 = this.f121231c;
                if (!(hVar4 == null || (searchTrackMap = hVar4.getSearchTrackMap()) == null)) {
                    str9 = searchTrackMap.get("use_scenario");
                }
                jSONObject.put("use_scenario_x", str9);
                r.a(str8, jSONObject);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str) {
            ad adVar;
            l.d(str, "");
            if (as.f121196a) {
                q a2 = am.a();
                if (a2 != null) {
                    adVar = a2.c();
                } else {
                    adVar = null;
                }
                a().execute(new b(str, adVar, d.a.b()));
            }
        }

        public static void a(String str, String str2) {
            l.d(str, "");
            if (as.f121196a) {
                a().execute(new e(str, str2, d.a.b()));
            }
        }

        public static void a(String str, String str2, String str3) {
            l.d(str, "");
            if (as.f121196a) {
                a().execute(new RunnableC3137c(str, str2, str3, d.a.b()));
            }
        }

        public static void a(String str, JSONObject jSONObject, Set<String> set) {
            l.d(str, "");
            l.d(jSONObject, "");
            l.d(set, "");
            if (as.f121196a) {
                a().execute(new d(str, set, jSONObject));
            }
        }
    }

    static final class b extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f121245a = new b();

        static {
            Covode.recordClassIndex(79012);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
            a2.f79174c = 1;
            return g.a(a2.a());
        }
    }

    static {
        Covode.recordClassIndex(79004);
        ConcurrentHashMap<String, Set<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("trending_words_click", am.b("search_id_a"));
        concurrentHashMap.put("search_session_finish", am.b("search_id"));
        concurrentHashMap.put("search_duration", am.b("search_id"));
        concurrentHashMap.put("search_result_show_video", am.b("search_keyword"));
        concurrentHashMap.put("play_music", am.b("search_id_a", "search_keyword_a"));
        concurrentHashMap.put("search_video_play_finish", am.b("search_id", "search_keyword"));
        concurrentHashMap.put("survey_card_click", am.b("search_id", "search_keyword"));
        concurrentHashMap.put("survey_card_show", am.b("search_id", "search_keyword"));
        concurrentHashMap.put("click_search_feedback", am.b("search_id_a", "search_keyword_a"));
        concurrentHashMap.put("click_search_filter", am.b("search_id", "search_keyword"));
        concurrentHashMap.put("choose_search_filter", am.b("search_id", "search_keyword"));
        concurrentHashMap.put("ref_search_feed_set_dynamic_header", am.b("search_id", "use_scenario"));
        concurrentHashMap.put("ref_search_jedi_set_dynamic_header", am.b("search_id", "use_scenario"));
        concurrentHashMap.put("ref_search_jedi_set_dynamic_mask", am.b("search_id", "use_scenario"));
        concurrentHashMap.put("searchTransferEnter", am.b("enter_from", "from_group_id"));
        f121226e = concurrentHashMap;
    }

    public final T a(String str) {
        c("search_id", str);
        return this;
    }

    public final T b(String str) {
        c("search_keyword", str);
        return this;
    }

    public final T c(String str) {
        c("log_pb", str);
        return this;
    }

    public final T d(String str) {
        c("impr_id", str);
        return this;
    }

    public final T e(String str) {
        c("anchor_id", str);
        return this;
    }

    public final T f(String str) {
        c("search_type", str);
        return this;
    }

    public final T g(String str) {
        b("search_result_id", str);
        return this;
    }

    public final T q(String str) {
        c("action_type", str);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        h.f.b.l.d(str, "");
    }

    public final T a(Integer num) {
        c("rank", String.valueOf(num));
        return this;
    }

    public final T b(Integer num) {
        c("order", String.valueOf(num));
        return this;
    }
}
