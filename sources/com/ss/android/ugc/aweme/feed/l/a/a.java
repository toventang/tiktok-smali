package com.ss.android.ugc.aweme.feed.l.a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.l.b.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f93556a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(59264);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.l.a.a$a  reason: collision with other inner class name */
    public static final class C2266a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f93557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f93558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f93559c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.feed.param.b f93560d;

        static {
            Covode.recordClassIndex(59265);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.l.a.a$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC2267a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2266a f93561a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup f93562b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AwemeTrendingBar f93563c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f93564d;

            static {
                Covode.recordClassIndex(59266);
            }

            View$OnClickListenerC2267a(C2266a aVar, ViewGroup viewGroup, AwemeTrendingBar awemeTrendingBar, String str) {
                this.f93561a = aVar;
                this.f93562b = viewGroup;
                this.f93563c = awemeTrendingBar;
                this.f93564d = str;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                SmartRoute withParam = SmartRouter.buildRoute(this.f93562b.getContext(), this.f93563c.getSchema()).withParam("enter_from", this.f93564d);
                com.ss.android.ugc.aweme.feed.param.b bVar = this.f93561a.f93560d;
                String str4 = null;
                if (bVar != null) {
                    str = bVar.getSearchId();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    com.ss.android.ugc.aweme.feed.param.b bVar2 = this.f93561a.f93560d;
                    if (bVar2 != null) {
                        str3 = bVar2.getSearchId();
                    } else {
                        str3 = null;
                    }
                    withParam.withParam("search_id", str3);
                }
                com.ss.android.ugc.aweme.feed.param.b bVar3 = this.f93561a.f93560d;
                if (bVar3 != null) {
                    str2 = bVar3.getSearchKeyword();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    com.ss.android.ugc.aweme.feed.param.b bVar4 = this.f93561a.f93560d;
                    if (bVar4 != null) {
                        str4 = bVar4.getSearchKeyword();
                    }
                    withParam.withParam("search_keyword", str4);
                }
                withParam.open();
                this.f93561a.a("click", this.f93564d);
            }
        }

        @Override // com.ss.android.ugc.aweme.feed.l.b.d
        public final void a(com.ss.android.ugc.aweme.feed.l.b.a aVar) {
            l.d(aVar, "");
            if (!this.f93558b.hasTrendingBar() || this.f93558b.disableSearchTrendingBar) {
                aVar.a();
                return;
            }
            com.a.a(LayoutInflater.from(this.f93557a.getContext()), R.layout.ti, this.f93557a, true);
            ViewGroup viewGroup = this.f93557a;
            AwemeTrendingBar trendingBar = this.f93558b.getTrendingBar();
            l.b(trendingBar, "");
            String str = this.f93559c;
            com.bytedance.ies.dmt.ui.d.a aVar2 = new a.C0730a().a(trendingBar.getDisplay()).f33382a;
            View findViewById = viewGroup.findViewById(R.id.adh);
            l.b(findViewById, "");
            ((TuxTextView) findViewById).setText(aVar2);
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(trendingBar.getIconUrl()));
            a2.v = w.CENTER;
            a2.F = (ImageView) viewGroup.findViewById(R.id.bja);
            a2.c();
            viewGroup.setOnClickListener(new View$OnClickListenerC2267a(this, viewGroup, trendingBar, str));
            a("show", this.f93559c);
        }

        public final void a(String str, String str2) {
            String str3;
            if (this.f93558b.getTrendingBar() != null) {
                Map<String, String> trackMap = this.f93558b.getTrendingBar().getTrackMap();
                String logPbString = this.f93558b.getLogPbString();
                l.b(logPbString, "");
                trackMap.put("log_pd", logPbString);
                trackMap.put("action_type", str);
                trackMap.put("enter_from", str2);
                a("group_id", this.f93558b.getGroupId(), trackMap);
                trackMap.put("event_keyword", this.f93558b.getTrendingBar().getEventKeyword());
                trackMap.put("event_keyword_id", String.valueOf(this.f93558b.getTrendingBar().getEventKeywordId()));
                if (this.f93558b.getAuthor() != null) {
                    User author = this.f93558b.getAuthor();
                    String str4 = null;
                    if (author != null) {
                        str3 = author.getUid();
                    } else {
                        str3 = null;
                    }
                    a("author_id", str3, trackMap);
                    if (author != null) {
                        str4 = String.valueOf(author.getFollowStatus());
                    }
                    a("follow_status", str4, trackMap);
                }
                com.ss.android.ugc.aweme.common.r.a("hot_search_video_guide", trackMap);
            }
        }

        private static void a(String str, String str2, Map<String, String> map) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2 == null) {
                    l.b();
                }
                map.put(str, str2);
            }
        }

        public C2266a(ViewGroup viewGroup, Aweme aweme, String str, com.ss.android.ugc.aweme.feed.param.b bVar) {
            this.f93557a = viewGroup;
            this.f93558b = aweme;
            this.f93559c = str;
            this.f93560d = bVar;
        }
    }

    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f93565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f93566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f93567c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.feed.param.b f93568d;

        static {
            Covode.recordClassIndex(59267);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.l.a.a$b$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC2268a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f93569a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup f93570b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AwemeTrendingBar f93571c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f93572d;

            static {
                Covode.recordClassIndex(59268);
            }

            View$OnClickListenerC2268a(b bVar, ViewGroup viewGroup, AwemeTrendingBar awemeTrendingBar, String str) {
                this.f93569a = bVar;
                this.f93570b = viewGroup;
                this.f93571c = awemeTrendingBar;
                this.f93572d = str;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                SmartRoute withParam = SmartRouter.buildRoute(this.f93570b.getContext(), this.f93571c.getSchema()).withParam("enter_from", this.f93572d);
                String groupId = this.f93569a.f93566b.getGroupId();
                if (groupId == null) {
                    groupId = "";
                }
                SmartRoute withParam2 = withParam.withParam("from_group_id", groupId);
                com.ss.android.ugc.aweme.feed.param.b bVar = this.f93569a.f93568d;
                String str4 = null;
                if (bVar != null) {
                    str = bVar.getSearchId();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    com.ss.android.ugc.aweme.feed.param.b bVar2 = this.f93569a.f93568d;
                    if (bVar2 != null) {
                        str3 = bVar2.getSearchId();
                    } else {
                        str3 = null;
                    }
                    withParam2.withParam("search_id", str3);
                }
                com.ss.android.ugc.aweme.feed.param.b bVar3 = this.f93569a.f93568d;
                if (bVar3 != null) {
                    str2 = bVar3.getSearchKeyword();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    com.ss.android.ugc.aweme.feed.param.b bVar4 = this.f93569a.f93568d;
                    if (bVar4 != null) {
                        str4 = bVar4.getSearchKeyword();
                    }
                    withParam2.withParam("search_keyword", str4);
                }
                withParam2.open();
                this.f93569a.a("trending_bar_click");
                b bVar5 = this.f93569a;
                if (bVar5.f93566b.getTrendingBarFYP() != null) {
                    bVar5.f93566b.getTrendingBarFYP().getTrackMap();
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "trending_inflow_page").a("trending_entrance", "homepage_hot_trending_bar");
                    String groupId2 = bVar5.f93566b.getGroupId();
                    if (groupId2 == null) {
                        groupId2 = "";
                    }
                    com.ss.android.ugc.aweme.common.r.a("trending_inflow_page_show", a2.a("from_group_id", groupId2).a("search_keyword", "").a("search_keyword_id", "").f66730a);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.feed.l.b.d
        public final void a(com.ss.android.ugc.aweme.feed.l.b.a aVar) {
            l.d(aVar, "");
            if (!this.f93566b.hasTrendingBarFYP() || !this.f93566b.disableSearchTrendingBar) {
                aVar.a();
                return;
            }
            com.a.a(LayoutInflater.from(this.f93565a.getContext()), R.layout.tj, this.f93565a, true);
            ViewGroup viewGroup = this.f93565a;
            AwemeTrendingBar trendingBarFYP = this.f93566b.getTrendingBarFYP();
            l.b(trendingBarFYP, "");
            String str = this.f93567c;
            com.bytedance.ies.dmt.ui.d.a aVar2 = new a.C0730a().a(trendingBarFYP.getDisplay()).f33382a;
            View findViewById = viewGroup.findViewById(R.id.adh);
            l.b(findViewById, "");
            ((TuxTextView) findViewById).setText(aVar2);
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(trendingBarFYP.getIconUrl()));
            a2.v = w.CENTER;
            a2.F = (ImageView) viewGroup.findViewById(R.id.bja);
            a2.c();
            viewGroup.setOnClickListener(new View$OnClickListenerC2268a(this, viewGroup, trendingBarFYP, str));
            a("trending_bar_show");
        }

        public final void a(String str) {
            String str2;
            String str3;
            AwemeTrendingBar trendingBarFYP = this.f93566b.getTrendingBarFYP();
            if (trendingBarFYP != null) {
                Map<String, String> trackMap = trendingBarFYP.getTrackMap();
                if (l.a((Object) str, (Object) "trending_bar_click")) {
                    trackMap.put("enter_method", "click_trending_bar");
                } else {
                    trackMap.put("position", "bottom_bar");
                }
                com.ss.android.ugc.aweme.feed.param.b bVar = this.f93568d;
                if (bVar == null || (str2 = bVar.getEventType()) == null) {
                    str2 = "";
                }
                trackMap.put("enter_from", str2);
                a("group_id", this.f93566b.getGroupId(), trackMap);
                trackMap.put("trending_topic", trendingBarFYP.getEventKeyword());
                trackMap.put("trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
                if (this.f93566b.getAuthor() != null) {
                    User author = this.f93566b.getAuthor();
                    String str4 = null;
                    if (author != null) {
                        str3 = author.getUid();
                    } else {
                        str3 = null;
                    }
                    a("author_id", str3, trackMap);
                    if (author != null) {
                        str4 = String.valueOf(author.getFollowStatus());
                    }
                    a("follow_status", str4, trackMap);
                }
                com.ss.android.ugc.aweme.common.r.a(str, trackMap);
            }
        }

        private static void a(String str, String str2, Map<String, String> map) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2 == null) {
                    l.b();
                }
                map.put(str, str2);
            }
        }

        public b(ViewGroup viewGroup, Aweme aweme, String str, com.ss.android.ugc.aweme.feed.param.b bVar) {
            this.f93565a = viewGroup;
            this.f93566b = aweme;
            this.f93567c = str;
            this.f93568d = bVar;
        }
    }
}
