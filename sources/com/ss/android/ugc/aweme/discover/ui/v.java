package com.ss.android.ugc.aweme.discover.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ag;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.helper.ai;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.mob.q;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.ss.android.ugc.aweme.discover.ui.c.b;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchLiveViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.l.a.h;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class v extends u implements b.AbstractC1937b {
    private final com.bytedance.assem.arch.viewModel.b K;
    private boolean L;
    private SparseArray M;
    public final f o = new f();

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.discover.viewmodel.d, com.ss.android.ugc.aweme.discover.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(51561);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.discover.viewmodel.d invoke(com.ss.android.ugc.aweme.discover.viewmodel.d dVar) {
            l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(51559);
    }

    private final SearchLiveViewModel n() {
        return (SearchLiveViewModel) this.K.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u, com.ss.android.ugc.aweme.discover.ui.am
    public final View a(int i2) {
        if (this.M == null) {
            this.M = new SparseArray();
        }
        View view = (View) this.M.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.M.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u, com.ss.android.ugc.aweme.discover.ui.am
    public final void aT_() {
        SparseArray sparseArray = this.M;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "live";
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.discover.ui.u
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(247, new g(v.class, "enterLiveRoom", com.ss.android.ugc.aweme.discover.e.f.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.u, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        aT_();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final boolean r() {
        return this.L;
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(51560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public v() {
        h.k.c a2 = ab.a(SearchLiveViewModel.class);
        this.K = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, b.INSTANCE);
        this.t = j.f121160h;
        this.L = true;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.c.b.AbstractC1937b
    public final void a(String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("roomId", str);
        com.ss.android.ugc.aweme.discover.lynx.container.f d2 = d();
        if (d2 != null) {
            d2.a("verticalLiveBack", jSONObject);
        }
    }

    static final class c extends m implements h.f.a.b<SearchLiveList, z> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(51562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(v vVar) {
            super(1);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(SearchLiveList searchLiveList) {
            String str;
            String str2;
            String str3;
            String str4;
            SearchLiveList searchLiveList2 = searchLiveList;
            l.d(searchLiveList2, "");
            q.b(this.this$0.t);
            com.ss.android.ugc.aweme.discover.lynx.container.f d2 = this.this$0.d();
            String b2 = this.this$0.o.b(new az(searchLiveList2, new ak(q.c(this.this$0.t))));
            l.b(b2, "");
            d2.b(b2);
            v vVar = this.this$0;
            LogPbBean logPbBean = searchLiveList2.logPb;
            Long l2 = null;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            vVar.f82772j = str;
            this.this$0.g();
            s a2 = s.a.a();
            String u = this.this$0.u();
            LogPbBean logPbBean2 = searchLiveList2.logPb;
            if (logPbBean2 == null || (str2 = logPbBean2.getImprId()) == null) {
                str2 = "";
            }
            GlobalDoodleConfig globalDoodleConfig = searchLiveList2.globalDoodleConfig;
            if (globalDoodleConfig != null) {
                str3 = globalDoodleConfig.getSearchChannel();
            } else {
                str3 = null;
            }
            GlobalDoodleConfig globalDoodleConfig2 = searchLiveList2.globalDoodleConfig;
            if (globalDoodleConfig2 != null) {
                str4 = globalDoodleConfig2.getNewSource();
            } else {
                str4 = null;
            }
            BaseResponse.ServerTimeExtra serverTimeExtra = searchLiveList2.extra;
            if (serverTimeExtra != null) {
                l2 = Long.valueOf(serverTimeExtra.now);
            }
            a2.a(new com.ss.android.ugc.aweme.discover.helper.m(u, str2, str3, str4, l2));
            this.this$0.a(searchLiveList2.globalDoodleConfig);
            this.this$0.a(searchLiveList2.logPb);
            this.this$0.i();
            v vVar2 = this.this$0;
            int size = searchLiveList2.liveList.size();
            l.d(searchLiveList2, "");
            com.ss.android.ugc.aweme.search.l.a.g.a(vVar2.s).c(size).d().a(searchLiveList2.getRequestId()).a(searchLiveList2).b(0);
            h.a(vVar2.s).e(size).b().a(searchLiveList2.getRequestId()).a(searchLiveList2).c(0);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(51563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(v vVar) {
            super(1);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            this.this$0.g();
            v vVar = this.this$0;
            l.d(th2, "");
            com.ss.android.ugc.aweme.search.l.a.g.a(vVar.s).d().b(1).b(th2.getMessage());
            h.a(vVar.s).b().c(1).b(th2.getMessage());
            if (th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                try {
                    com.ss.android.ugc.aweme.discover.lynx.container.f d2 = this.this$0.d();
                    String b2 = this.this$0.o.b(new az((SearchLiveList) this.this$0.o.a(((com.ss.android.ugc.aweme.base.api.a.b.a) th2).getResponse(), SearchLiveList.class), new ak(q.c(this.this$0.t))));
                    l.b(b2, "");
                    d2.b(b2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                com.ss.android.ugc.aweme.discover.lynx.container.f d3 = this.this$0.d();
                String b3 = this.this$0.o.b(new az(null, new ak(q.c(this.this$0.t))));
                l.b(b3, "");
                d3.b(b3);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.aa
    public final void a(com.ss.android.ugc.aweme.discover.lynx.container.f fVar) {
        l.d(fVar, "");
        com.ss.android.ugc.aweme.discover.lynx.spark.a.a[] aVarArr = {new com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.a()};
        l.d(aVarArr, "");
        n.a((Collection) ((com.ss.android.ugc.aweme.discover.lynx.spark.container.a) fVar).f81598f, (Object[]) aVarArr);
        com.ss.android.ugc.aweme.discover.mixfeed.d a2 = ai.a();
        if (a2 != null) {
            fVar.a(a2);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void enterLiveRoom(com.ss.android.ugc.aweme.discover.e.f fVar) {
        EnterRoomConfig.LogData logData;
        String str;
        LiveRoomStruct liveRoomStruct;
        String str2;
        String str3;
        String str4;
        l.d(fVar, "");
        LiveRoomStruct liveRoomStruct2 = fVar.f80955a;
        ArrayList<LiveRoomStruct> arrayList = fVar.f80956b;
        EnterRoomConfig enterRoomConfig = fVar.f80958d;
        long j2 = fVar.f80957c;
        Boolean bool = fVar.f80959e;
        if (enterRoomConfig != null && (logData = enterRoomConfig.f23298b) != null && (str = logData.y) != null && str.length() > 0) {
            LiveRoomStruct liveRoomStruct3 = null;
            if (1 != 0) {
                Activity j3 = com.bytedance.ies.ugc.appcontext.f.j();
                if (arrayList != null) {
                    liveRoomStruct = arrayList.get(0);
                    liveRoomStruct3 = arrayList.get(arrayList.size() - 1);
                } else {
                    liveRoomStruct = null;
                }
                if (liveRoomStruct2 != null) {
                    Long.valueOf(liveRoomStruct2.id);
                    Long.valueOf(liveRoomStruct2.getAnchorId());
                }
                if (liveRoomStruct != null) {
                    Long.valueOf(liveRoomStruct.id);
                    Long.valueOf(liveRoomStruct.getAnchorId());
                }
                if (liveRoomStruct3 != null) {
                    Long.valueOf(liveRoomStruct3.id);
                    Long.valueOf(liveRoomStruct3.getAnchorId());
                }
                EnterRoomConfig.LogData logData2 = enterRoomConfig.f23298b;
                if (logData2 == null || (str2 = logData2.y) == null) {
                    str2 = "";
                }
                EnterRoomConfig.LogData logData3 = enterRoomConfig.f23298b;
                if (logData3 == null || (str3 = logData3.f23321m) == null) {
                    str3 = "";
                }
                EnterRoomConfig.LogData logData4 = enterRoomConfig.f23298b;
                if (logData4 == null || (str4 = logData4.x) == null) {
                    str4 = "";
                }
                com.ss.android.ugc.aweme.discover.ui.c.b bVar = new com.ss.android.ugc.aweme.discover.ui.c.b(str2, j2, "", str3, str4, this, bool);
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                s.i().a(j3, enterRoomConfig, liveRoomStruct2, arrayList, bVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        AssemViewModel.a(n(), w.f82784a, null, new d(this), null, new c(this), 10);
        super.onViewCreated(view, bundle);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u
    public final void a(int i2, com.ss.android.ugc.aweme.search.g.b bVar) {
        String str;
        super.a(i2, bVar);
        h();
        SearchLiveViewModel n = n();
        String u = u();
        com.ss.android.ugc.aweme.search.model.d dVar = this.r;
        if (dVar == null || (str = dVar.getPreSearchId()) == null) {
            str = "";
        }
        String str2 = this.u;
        if (str2 == null) {
            str2 = "";
        }
        com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f(u, 0, this.v, "live", am.H, 0, str, this.f82772j, 0, 20, str2, null, null, null, null, null, 0, null, null, 1046562);
        l.d(fVar, "");
        bz unused = i.a(n.aH_(), null, null, new SearchLiveViewModel.b(n, fVar, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.c.b.AbstractC1937b
    public final void a(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        l.d(searchLiveList, "");
        l.d(list, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("searchLiveData", this.o.b(searchLiveList));
        com.ss.android.ugc.aweme.discover.lynx.container.f d2 = d();
        if (d2 != null) {
            d2.a("verticalLiveLoadMore", jSONObject);
        }
    }
}
