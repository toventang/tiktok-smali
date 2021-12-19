package com.ss.android.ugc.aweme.discover.ui.c;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.discover.activity.SearchLiveListEnterParamViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.discover.ui.ac;
import com.ss.android.ugc.aweme.discover.ui.bh;
import com.ss.android.ugc.aweme.discover.ui.c.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;

public final class d extends bh<SearchLiveStruct> implements b.AbstractC1937b {

    /* renamed from: d  reason: collision with root package name */
    private static final a f82518d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private boolean f82519a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.activity.b f82520b;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f82521e;

    static {
        Covode.recordClassIndex(51373);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final View a(int i2) {
        if (this.f82521e == null) {
            this.f82521e = new SparseArray();
        }
        View view = (View) this.f82521e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f82521e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.c.b.AbstractC1937b
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final void aT_() {
        SparseArray sparseArray = this.f82521e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "live";
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.discover.ui.av
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(71, new g(d.class, "onRoomStatusEvent", com.bytedance.android.live.base.a.a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.discover.ui.bh, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        aT_();
    }

    static final class a {
        static {
            Covode.recordClassIndex(51374);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public d() {
        this.t = 7;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final RecyclerView.i D() {
        getContext();
        return new GridLayoutManager(2);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void i() {
        String str;
        String str2;
        a(new g());
        com.ss.android.ugc.aweme.discover.j.g<?> n = n();
        Objects.requireNonNull(n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.live.SearchLivePresenter");
        f fVar = new f();
        com.ss.android.ugc.aweme.discover.activity.b bVar = this.f82520b;
        c cVar = null;
        if (bVar != null) {
            str = bVar.getRoomIdList();
        } else {
            str = null;
        }
        fVar.f82527a = str;
        com.ss.android.ugc.aweme.discover.activity.b bVar2 = this.f82520b;
        if (bVar2 != null) {
            str2 = bVar2.getEnterFrom();
        } else {
            str2 = null;
        }
        fVar.f82528b = str2;
        n.a((Object) fVar);
        n().a_((c) this);
        n().a((ac) this);
        f A = A();
        if (A instanceof c) {
            cVar = A;
        }
        c cVar2 = cVar;
        if (cVar2 != null) {
            com.ss.android.ugc.aweme.discover.j.f fVar2 = (com.ss.android.ugc.aweme.discover.j.f) n().f76396h;
            Objects.requireNonNull(fVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.live.SearchLiveModel");
            f fVar3 = (f) fVar2;
            l.d(fVar3, "");
            cVar2.f82510g = fVar3;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void m() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.r == null) {
            com.ss.android.ugc.aweme.search.model.d dVar = new com.ss.android.ugc.aweme.search.model.d();
            com.ss.android.ugc.aweme.discover.activity.b bVar = this.f82520b;
            if (bVar == null || (str = bVar.getSearchKeyword()) == null) {
                str = "";
            }
            com.ss.android.ugc.aweme.search.model.d keyword = dVar.setKeyword(str);
            com.ss.android.ugc.aweme.discover.activity.b bVar2 = this.f82520b;
            if (bVar2 != null) {
                str2 = bVar2.getEnterMethod();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.search.model.d enterMethod = keyword.setEnterMethod(str2);
            com.ss.android.ugc.aweme.discover.activity.b bVar3 = this.f82520b;
            if (bVar3 == null || (str3 = bVar3.getFromSearchSubtag()) == null) {
                str3 = "";
            }
            com.ss.android.ugc.aweme.search.model.d fromSearchSubtag = enterMethod.setFromSearchSubtag(str3);
            com.ss.android.ugc.aweme.discover.activity.b bVar4 = this.f82520b;
            if (bVar4 == null || (str4 = bVar4.getPreSearchId()) == null) {
                str4 = "";
            }
            this.r = fromSearchSubtag.setPreSearchId(str4);
        }
        com.ss.android.ugc.aweme.search.model.d dVar2 = this.r;
        if (dVar2 == null) {
            l.b();
        }
        c cVar = new c(dVar2, v(), this, this);
        String str5 = this.u;
        l.d(str5, "");
        cVar.f82512i = str5;
        a(cVar);
        this.f82519a = true;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final void onCreate(Bundle bundle) {
        SearchLiveListEnterParamViewModel searchLiveListEnterParamViewModel;
        super.onCreate(bundle);
        EventBus.a(EventBus.a(), this);
        e activity = getActivity();
        com.ss.android.ugc.aweme.discover.activity.b bVar = null;
        if (!(activity == null || (searchLiveListEnterParamViewModel = (SearchLiveListEnterParamViewModel) ae.a(activity, (ad.b) null).a(SearchLiveListEnterParamViewModel.class)) == null)) {
            bVar = searchLiveListEnterParamViewModel.f80271a;
        }
        this.f82520b = bVar;
    }

    @r
    public final void onRoomStatusEvent(com.bytedance.android.live.base.a.a aVar) {
        l.d(aVar, "");
        long j2 = aVar.f7362a;
        f A = A();
        Integer num = null;
        if (!(A instanceof c)) {
            A = null;
        }
        c cVar = (c) A;
        if (cVar != null) {
            int i2 = 0;
            Iterator it = cVar.f76354l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                SearchLiveStruct searchLiveStruct = (SearchLiveStruct) it.next();
                l.b(searchLiveStruct, "");
                if (searchLiveStruct.getLiveAweme() != null) {
                    Aweme liveAweme = searchLiveStruct.getLiveAweme();
                    l.b(liveAweme, "");
                    User author = liveAweme.getAuthor();
                    if (author != null && j2 == author.roomId) {
                        break;
                    }
                }
                i2++;
            }
            num = Integer.valueOf(i2);
        }
        RecyclerView.a adapter = w().getAdapter();
        if (adapter != null) {
            Integer.valueOf(adapter.getItemCount());
        }
        if (num != null && num.intValue() != -1) {
            w().d(num.intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        w().a(new e(n.a(8.0d)));
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.c.b.AbstractC1937b
    public final void a(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        l.d(searchLiveList, "");
        l.d(list, "");
        com.ss.android.ugc.aweme.discover.j.f fVar = (com.ss.android.ugc.aweme.discover.j.f) n().f76396h;
        List list2 = null;
        if (!(fVar instanceof f)) {
            fVar = null;
        }
        f fVar2 = (f) fVar;
        if (fVar2 != null) {
            fVar2.a(searchLiveList);
        }
        List e2 = A().e();
        if (e2 != null) {
            List<SearchLiveStruct> list3 = searchLiveList.liveList;
            l.b(list3, "");
            list2 = h.a.n.d((Collection) e2, (Iterable) list3);
        }
        b(list2, z);
    }
}
