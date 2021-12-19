package com.ss.android.ugc.aweme.flowfeed.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.discover.a.u;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.ss.android.ugc.aweme.discover.mixfeed.s;
import com.ss.android.ugc.aweme.discover.mixfeed.t;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.bl;
import com.ss.android.ugc.aweme.search.k.j;
import com.ss.android.ugc.aweme.utils.ef;
import com.ss.android.ugc.aweme.utils.eg;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class DetailFeedSearchHelper implements eg {

    /* renamed from: a  reason: collision with root package name */
    static f.a.b.b f96149a;

    /* renamed from: b  reason: collision with root package name */
    public static a f96150b;

    /* renamed from: c  reason: collision with root package name */
    public static final DetailFeedSearchHelper f96151c = new DetailFeedSearchHelper();

    private DetailFeedSearchHelper() {
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        eg.a.onCreate(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        eg.a.onDestroy(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        eg.a.onPause(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        eg.a.onResume(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_START)
    public final void onStart() {
        eg.a.onStart(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_STOP)
    public final void onStop() {
        eg.a.onStop(this);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final m f96152a;

        /* renamed from: b  reason: collision with root package name */
        public final String f96153b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, String> f96154c;

        static {
            Covode.recordClassIndex(60922);
        }

        public final String toString() {
            return "EntryInfo(owner=" + this.f96152a + ", awemeId=" + this.f96153b + ", params=" + this.f96154c + ")";
        }

        public final int hashCode() {
            return super.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            a aVar = (a) obj;
            if (!l.a(this.f96152a, aVar.f96152a) || !l.a((Object) this.f96153b, (Object) aVar.f96153b)) {
                return false;
            }
            return true;
        }

        public a(m mVar, String str, Map<String, String> map) {
            l.d(mVar, "");
            l.d(str, "");
            l.d(map, "");
            this.f96152a = mVar;
            this.f96153b = str;
            this.f96154c = map;
        }
    }

    static {
        Covode.recordClassIndex(60921);
    }

    @v(a = i.a.ON_DESTROY)
    public final void release() {
        f.a.b.b bVar = f96149a;
        if (bVar != null && !bVar.isDisposed()) {
            f.a.b.b bVar2 = f96149a;
            if (bVar2 == null) {
                l.b();
            }
            bVar2.dispose();
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f96155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f96156b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f96157c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f96158d;

        static {
            Covode.recordClassIndex(60923);
        }

        public b(View view, m mVar, String str, Map map) {
            this.f96155a = view;
            this.f96156b = mVar;
            this.f96157c = str;
            this.f96158d = map;
        }

        public final void run() {
            String a2;
            MethodCollector.i(675);
            View view = this.f96155a;
            View findViewWithTag = view.findViewWithTag("search_bar");
            if (findViewWithTag == null) {
                View view2 = DetailFeedServiceImpl.b().a(view).get("search_bar_in_feed");
                if (view2 != null) {
                    ViewStub viewStub = (ViewStub) view2;
                    viewStub.setLayoutResource(R.layout.aut);
                    findViewWithTag = viewStub.inflate();
                    l.b(findViewWithTag, "");
                    findViewWithTag.setTag("search_bar");
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                    MethodCollector.o(675);
                    throw nullPointerException;
                }
            }
            l.b(findViewWithTag, "");
            if (u.a() == 3) {
                DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.f96151c;
                m mVar = this.f96156b;
                String str = this.f96157c;
                Map map = this.f96158d;
                detailFeedSearchHelper.release();
                if (map.containsKey("isTrending")) {
                    a2 = "trending_inflow";
                } else {
                    a2 = DetailFeedSearchHelper.a(map);
                }
                l.d(str, "");
                l.d(a2, "");
                DetailFeedSearchHelper.f96149a = SearchApiNew.RealApi.a.f80781a.fetchFeedDetailWords(str, a2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(mVar, findViewWithTag, map), new f(mVar, findViewWithTag, map));
                ef.a(mVar, detailFeedSearchHelper);
                MethodCollector.o(675);
                return;
            }
            DetailFeedSearchHelper.a(findViewWithTag, null, this.f96158d);
            MethodCollector.o(675);
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f96165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f96166b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f96167c;

        static {
            Covode.recordClassIndex(60926);
        }

        e(m mVar, View view, Map map) {
            this.f96165a = mVar;
            this.f96166b = view;
            this.f96167c = map;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            t tVar = (t) obj;
            if (!DetailFeedSearchHelper.a(this.f96165a)) {
                DetailFeedSearchHelper.a(this.f96166b, tVar, this.f96167c);
            }
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f96168a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f96169b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f96170c;

        static {
            Covode.recordClassIndex(60927);
        }

        f(m mVar, View view, Map map) {
            this.f96168a = mVar;
            this.f96169b = view;
            this.f96170c = map;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (!DetailFeedSearchHelper.a(this.f96168a)) {
                DetailFeedSearchHelper.a(this.f96169b, null, this.f96170c);
            }
        }
    }

    public static String a(Map<String, String> map) {
        String str = map.get("enter_from");
        if (TextUtils.isEmpty(str)) {
            return "unknow";
        }
        if (str == null) {
            l.b();
        }
        return str;
    }

    public static void b(Map<String, String> map) {
        String a2;
        j jVar = (j) new j().b("1").p("enter");
        if (map.containsKey("tab_name")) {
            jVar.a(map.get("tab_name"));
        }
        if (map.containsKey("isTrending")) {
            a2 = "trending_inflow";
        } else {
            a2 = a(map);
        }
        jVar.o(a2);
        jVar.f();
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f96159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f96160b;

        static {
            Covode.recordClassIndex(60924);
        }

        public c(View view, Map map) {
            this.f96159a = view;
            this.f96160b = map;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRoute withParam = SmartRouter.buildRoute(this.f96159a.getContext(), "//search").withParam("set_hint_by_sug_word", true).withParam("is_from_video", "1").withParam("in_single_stack", true).withParam("group_id", (String) this.f96160b.get("group_id"));
            l.b(withParam, "");
            DetailFeedSearchHelper.a(withParam, this.f96160b);
            withParam.open();
            DetailFeedSearchHelper.b(this.f96160b);
        }
    }

    public static boolean a(m mVar) {
        i lifecycle = mVar.getLifecycle();
        l.b(lifecycle, "");
        if (lifecycle.a() == i.b.DESTROYED) {
            return true;
        }
        Objects.requireNonNull(mVar, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        if (((Fragment) mVar).getView() == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f96161a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f96162b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f96163c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t f96164d;

        static {
            Covode.recordClassIndex(60925);
        }

        d(View view, Map map, z.e eVar, t tVar) {
            this.f96161a = view;
            this.f96162b = map;
            this.f96163c = eVar;
            this.f96164d = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRoute withParam = SmartRouter.buildRoute(this.f96161a.getContext(), "//search").withParam("is_from_video", "1").withParam("in_single_stack", true).withParam("group_id", (String) this.f96162b.get("group_id"));
            if (TextUtils.isEmpty(this.f96163c.element)) {
                withParam.withParam("set_hint_by_sug_word", true);
            } else {
                withParam.withParam("search_hint_word", (String) this.f96163c.element);
                t tVar = this.f96164d;
                if (tVar == null) {
                    l.b();
                }
                List<s> list = tVar.f81867a;
                if (list == null) {
                    l.b();
                }
                withParam.withParam("hint_group_id", list.get(0).f81866b);
                withParam.withParam("hint_imp_id", this.f96164d.a());
            }
            l.b(withParam, "");
            DetailFeedSearchHelper.a(withParam, this.f96162b);
            withParam.open();
            DetailFeedSearchHelper.b(this.f96162b);
        }
    }

    public static void a(SmartRoute smartRoute, Map<String, String> map) {
        if (map.containsKey("isTrending")) {
            smartRoute.withParam("search_position", "trending_inflow");
            smartRoute.withParam("tab_name", a(map));
            smartRoute.withParam("enter_from", "trending_inflow");
            return;
        }
        if (map.containsKey("tab_name")) {
            smartRoute.withParam("tab_name", map.get("tab_name"));
        }
        smartRoute.withParam("enter_from", a(map));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, t tVar, Map<String, String> map) {
        z.e eVar = new z.e();
        eVar.element = "";
        TextView textView = (TextView) view.findViewById(R.id.f6p);
        T t = null;
        if (!(tVar == null || tVar.f81867a == null)) {
            List<s> list = tVar.f81867a;
            if (list == null) {
                l.b();
            }
            if (!list.isEmpty()) {
                List<s> list2 = tVar.f81867a;
                if (list2 == null) {
                    l.b();
                }
                String str = list2.get(0).f81865a;
                if (hk.a(str)) {
                    if (str == 0) {
                        l.b();
                    }
                    t = str;
                }
            }
        }
        l.b(textView, "");
        String str2 = t;
        if (TextUtils.isEmpty(str2)) {
            Context context = view.getContext();
            l.b(context, "");
            str2 = context.getResources().getString(R.string.ft);
        } else {
            if (t == null) {
                l.b();
            }
            eVar.element = t;
        }
        textView.setText(str2);
        view.setOnClickListener(new d(view, map, eVar, tVar));
        if (hk.a(t)) {
            if (tVar == null) {
                l.b();
            }
            bk v = new bl().y(a(map)).d((Integer) 0).v("search_bar_outer");
            if (t == null) {
                l.b();
            }
            bk bkVar = (bk) ((com.ss.android.ugc.aweme.search.k.c) v.w(t).i(map.get("group_id"))).d(tVar.a()).a((Integer) -1);
            if (map.containsKey("isTrending")) {
                bkVar.y("trending_inflow");
            } else {
                bkVar.y(a(map));
            }
            if (map.containsKey("tab_name")) {
                bkVar.a((Object) map.get("tab_name"));
            }
            bkVar.f();
        }
    }
}
