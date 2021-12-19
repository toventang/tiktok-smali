package com.ss.android.ugc.aweme.autoplay.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.ai;
import com.ss.android.ugc.aweme.autoplay.d.h;
import com.ss.android.ugc.aweme.discover.a.n;
import com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity;
import com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout;
import com.ss.android.ugc.aweme.discover.mixfeed.g;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.i;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public class c extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f67249c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f67250a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final ScrollToOpenLayout f67251b;

    /* renamed from: k  reason: collision with root package name */
    private final View f67252k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f67253l;

    static {
        Covode.recordClassIndex(41415);
    }

    private final a f() {
        return (a) this.f67253l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41416);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<a> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.alading.d $viewHolder;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(41417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, com.ss.android.ugc.aweme.discover.alading.d dVar) {
            super(0);
            this.this$0 = cVar;
            this.$viewHolder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            com.ss.android.ugc.aweme.autoplay.d.a eVar;
            if (n.a()) {
                eVar = new f(this.this$0.c().b(), this.this$0.c().a(), this.this$0.a());
            } else {
                View view = this.$viewHolder.itemView;
                l.b(view, "");
                Context context = view.getContext();
                l.b(context, "");
                eVar = new e(context, this.this$0.c().b(), this.this$0.c().a(), this.this$0.a());
            }
            this.this$0.a(eVar);
            return eVar;
        }
    }

    static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f67255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f67256b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.h f67257c;

        static {
            Covode.recordClassIndex(41419);
        }

        d(c cVar, r rVar, com.ss.android.ugc.aweme.discover.mixfeed.h hVar) {
            this.f67255a = cVar;
            this.f67256b = rVar;
            this.f67257c = hVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            NextLiveData<ai> nextLiveData;
            l.b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            int i2 = this.f67255a.f67250a;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            if (i2 <= h.g.a.a(TypedValue.applyDimension(1, 80.0f, system.getDisplayMetrics()))) {
                return false;
            }
            if (!com.ss.android.ugc.aweme.a.a.a()) {
                Context context = GlobalContext.getContext();
                l.b(context, "");
                com.ss.android.ugc.aweme.discover.activity.b bVar = new com.ss.android.ugc.aweme.discover.activity.b();
                bVar.setSearchKeyword(this.f67256b.f121271f);
                bVar.setEnterFrom(this.f67256b.f121272g);
                bVar.setSearchId("searchId");
                bVar.setSearchType("general");
                bVar.setRoomIdList(com.ss.android.ugc.aweme.discover.ui.c.a.a(this.f67257c.o.f81644a));
                bVar.setEnterMethod("swipe_more_general_list");
                bVar.setFromSearchSubtag("general_search");
                bVar.setPreSearchId(this.f67256b.f121275j);
                SearchLiveListActivity.a.a(context, bVar, com.ss.android.ugc.aweme.search.h.f121133a.e());
                return false;
            }
            com.ss.android.ugc.aweme.discover.mob.d.f81891j = true;
            SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
            if (searchTabViewModel == null || (nextLiveData = searchTabViewModel.tabInfo) == null) {
                return false;
            }
            nextLiveData.setValue(new ai(i.LIVE.getTabName()));
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.discover.alading.d dVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar, View view) {
        super(dVar, aVar, bVar);
        l.d(dVar, "");
        l.d(aVar, "");
        l.d(view, "");
        this.f67253l = h.i.a((h.f.a.a) new b(this, dVar));
        ScrollToOpenLayout scrollToOpenLayout = (ScrollToOpenLayout) view.findViewById(R.id.dtc);
        l.b(scrollToOpenLayout, "");
        this.f67251b = scrollToOpenLayout;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fid);
        l.b(linearLayout, "");
        this.f67252k = linearLayout;
    }

    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.c cVar, g gVar, com.ss.android.ugc.aweme.discover.mixfeed.h hVar, r rVar) {
        List<? extends Aweme> list;
        Long l2;
        l.d(hVar, "");
        l.d(rVar, "");
        if (cVar == null || (list = cVar.f81644a) == null) {
            list = z.INSTANCE;
        }
        a(list);
        List<? extends Aweme> list2 = this.f67407f;
        if (list2 == null) {
            l.b();
        }
        super.a(list2, f());
        f().f67241b = rVar;
        a f2 = f();
        List<? extends Aweme> list3 = this.f67407f;
        if (list3 == null) {
            l.b();
        }
        if (cVar != null) {
            l2 = cVar.f81647d;
        } else {
            l2 = null;
        }
        a.a(f2, list3, gVar, l2, false, 8);
        this.f67250a = -1;
        if (!l.a((Object) hVar.o.f81646c, (Object) true) || com.bytedance.ies.abmock.b.a().a(true, "search_live_swipe_see_more", 0) != 1) {
            this.f67251b.setEnable(false);
            this.f67252k.setVisibility(8);
            return;
        }
        this.f67251b.setEnable(true);
        this.f67252k.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f67251b.setOnScrollChangeListener(new View$OnScrollChangeListenerC1516c(this));
        }
        this.f80747j.f80749a.setOnTouchListener(new d(this, rVar, hVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.c$c  reason: collision with other inner class name */
    static final class View$OnScrollChangeListenerC1516c implements View.OnScrollChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f67254a;

        static {
            Covode.recordClassIndex(41418);
        }

        View$OnScrollChangeListenerC1516c(c cVar) {
            this.f67254a = cVar;
        }

        public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
            if (com.bytedance.tux.h.i.a(this.f67254a.f67251b)) {
                i2 = -i2;
            }
            this.f67254a.f67250a = i2;
        }
    }
}
