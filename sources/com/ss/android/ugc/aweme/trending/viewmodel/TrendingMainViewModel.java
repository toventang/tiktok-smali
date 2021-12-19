package com.ss.android.ugc.aweme.trending.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.ss.android.ugc.aweme.search.l;
import f.a.t;
import h.a.n;
import h.f.b.m;
import h.f.b.z;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class TrendingMainViewModel extends CommonListViewModel<Aweme, TrendingMainState> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f141161m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f141162a;

    /* renamed from: b  reason: collision with root package name */
    public long f141163b = System.currentTimeMillis();

    /* renamed from: c  reason: collision with root package name */
    public String f141164c = "";

    /* renamed from: d  reason: collision with root package name */
    public boolean f141165d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> f141166e = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<ArrayList<l>> f141167f = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f141168g;

    /* renamed from: k  reason: collision with root package name */
    public boolean f141169k = true;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.param.b f141170l = new com.ss.android.ugc.aweme.feed.param.b();
    private c n = new c();

    static {
        Covode.recordClassIndex(92174);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92175);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<TrendingMainState, t<p<List<Aweme>, o>>> a() {
        return new d(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<TrendingMainState, t<p<List<Aweme>, o>>> b() {
        return new c(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new TrendingMainState(null, null, null, null, null, null, false, 127, null);
    }

    public final ArrayList<l> m() {
        ArrayList<l> value = this.f141167f.getValue();
        if (value == null) {
            return new ArrayList<>();
        }
        return value;
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        String str;
        String str2;
        super.onCleared();
        Aweme aweme = this.f141162a;
        if (aweme != null) {
            if (this.f141165d) {
                str = "click_arrow";
            } else {
                str = "slide_rightward";
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f141163b;
            String str3 = this.f141164c;
            com.ss.android.ugc.aweme.feed.param.b bVar = this.f141170l;
            h.f.b.l.d(str3, "");
            h.f.b.l.d(str, "");
            if (h.f.b.l.a((Object) str3, (Object) "click_fyp_trending_bar") && aweme.getTrendingBarFYP() != null) {
                AwemeTrendingBar trendingBarFYP = aweme.getTrendingBarFYP();
                Map<String, String> trackMap = trendingBarFYP.getTrackMap();
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "trending_inflow_page").a("enter_method", str);
                if (bVar == null || (str2 = bVar.getFromGroupId()) == null) {
                    str2 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("from_group_id", str2);
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", aid).a("trending_topic", trendingBarFYP.getEventKeyword()).a("trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
                String str4 = trackMap.get("trending_topic_source");
                if (str4 == null) {
                    str4 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("trending_topic_source", str4);
                String str5 = trackMap.get("topic_rank");
                if (str5 == null) {
                    str5 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a6 = a5.a("topic_rank", str5);
                String str6 = trackMap.get("topic_group_rank");
                if (str6 == null) {
                    str6 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a7 = a6.a("topic_group_rank", str6);
                String str7 = trackMap.get("topic_group_num");
                if (str7 == null) {
                    str7 = "";
                }
                com.ss.android.ugc.aweme.app.f.d a8 = a7.a("topic_group_num", str7).a("inflow_stay_duration", currentTimeMillis);
                h.f.b.l.b(a8, "");
                com.ss.android.ugc.aweme.trending.d.b.a("trending_inflow_page_quit", a8);
            }
        }
    }

    public final void a(l lVar) {
        h.f.b.l.d(lVar, "");
        c(new f(lVar));
    }

    public final void b(l lVar) {
        h.f.b.l.d(lVar, "");
        c(new h(lVar));
    }

    static final class c extends m implements h.f.a.b<TrendingMainState, t<p<? extends List<? extends Aweme>, ? extends o>>> {
        final /* synthetic */ TrendingMainViewModel this$0;

        static {
            Covode.recordClassIndex(92178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TrendingMainViewModel trendingMainViewModel) {
            super(1);
            this.this$0 = trendingMainViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Aweme>, ? extends o>> invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            h.f.b.l.d(trendingMainState2, "");
            TrendingMainViewModel trendingMainViewModel = this.this$0;
            return trendingMainViewModel.a(false, trendingMainState2, trendingMainViewModel.f141170l.getOutAwemeId(), trendingMainState2.getLoadingTrending());
        }
    }

    static final class d extends m implements h.f.a.b<TrendingMainState, t<p<? extends List<? extends Aweme>, ? extends o>>> {
        final /* synthetic */ TrendingMainViewModel this$0;

        static {
            Covode.recordClassIndex(92179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TrendingMainViewModel trendingMainViewModel) {
            super(1);
            this.this$0 = trendingMainViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Aweme>, ? extends o>> invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            h.f.b.l.d(trendingMainState2, "");
            TrendingMainViewModel trendingMainViewModel = this.this$0;
            return trendingMainViewModel.a(true, trendingMainState2, trendingMainViewModel.f141170l.getOutAwemeId(), trendingMainState2.getLoadingTrending());
        }
    }

    public static final class e extends m implements h.f.a.b<TrendingMainState, TrendingMainState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f141176a = new e();

        static {
            Covode.recordClassIndex(92180);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            h.f.b.l.d(trendingMainState2, "");
            return TrendingMainState.copy$default(trendingMainState2, null, null, null, null, null, null, false, 63, null);
        }
    }

    static final class f extends m implements h.f.a.b<TrendingMainState, TrendingMainState> {
        final /* synthetic */ l $trending;

        static {
            Covode.recordClassIndex(92181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar) {
            super(1);
            this.$trending = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            h.f.b.l.d(trendingMainState2, "");
            return TrendingMainState.copy$default(trendingMainState2, null, this.$trending, null, null, null, null, false, 125, null);
        }
    }

    public static final class g extends m implements h.f.a.b<TrendingMainState, TrendingMainState> {
        final /* synthetic */ ArrayList $list;

        static {
            Covode.recordClassIndex(92182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ArrayList arrayList) {
            super(1);
            this.$list = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            h.f.b.l.d(trendingMainState2, "");
            return TrendingMainState.copy$default(trendingMainState2, null, null, null, this.$list, null, null, false, 119, null);
        }
    }

    static final class h extends m implements h.f.a.b<TrendingMainState, TrendingMainState> {
        final /* synthetic */ l $trending;

        static {
            Covode.recordClassIndex(92183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(l lVar) {
            super(1);
            this.$trending = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
            TrendingMainState trendingMainState2 = trendingMainState;
            h.f.b.l.d(trendingMainState2, "");
            return TrendingMainState.copy$default(trendingMainState2, null, null, this.$trending, null, null, null, false, 123, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TrendingMainViewModel f141171a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f141172b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f141173c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f141174d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f141175e;

        static {
            Covode.recordClassIndex(92176);
        }

        b(TrendingMainViewModel trendingMainViewModel, boolean z, String str, l lVar, String str2) {
            this.f141171a = trendingMainViewModel;
            this.f141172b = z;
            this.f141173c = str;
            this.f141174d = lVar;
            this.f141175e = str2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            int i2;
            boolean z;
            final com.ss.android.ugc.aweme.search.m mVar = (com.ss.android.ugc.aweme.search.m) obj;
            h.f.b.l.d(mVar, "");
            this.f141171a.f141168g = !this.f141172b;
            final z.e eVar = new z.e();
            eVar.element = null;
            int i3 = 0;
            if (mVar.a()) {
                String str = mVar.f121443c;
                if (str == null) {
                    str = this.f141173c;
                }
                eVar.element = (T) e.b(str, mVar.f121442b);
                if (eVar.element == null) {
                    eVar.element = (T) this.f141174d;
                }
                i2 = mVar.f121446f;
            } else {
                String str2 = mVar.f121443c;
                if (str2 == null) {
                    str2 = this.f141173c;
                }
                eVar.element = (T) e.d(str2, mVar.f121442b);
                i2 = 0;
            }
            final z.e eVar2 = new z.e();
            String str3 = mVar.f121443c;
            if (str3 == null) {
                str3 = this.f141173c;
            }
            eVar2.element = (T) e.b(str3, mVar.f121442b);
            if (eVar2.element == null) {
                T t = (T) new l();
                t.setEventId(this.f141173c);
                t.setTrendingName(this.f141175e);
                eVar2.element = t;
            }
            if (mVar.a() || eVar.element != null) {
                z = true;
            } else {
                z = false;
            }
            String.valueOf(eVar.element);
            final StringBuilder sb = new StringBuilder();
            ArrayList<l> arrayList = mVar.f121442b;
            if (arrayList != null) {
                this.f141171a.f141167f.postValue(arrayList);
                for (T t2 : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        n.a();
                    }
                    String eventId = t2.getEventId();
                    if (eventId != null) {
                        sb.append(eventId);
                        if (i3 != arrayList.size() - 1) {
                            sb.append(",");
                        }
                    }
                    i3 = i4;
                }
            }
            this.f141171a.c(new h.f.a.b<TrendingMainState, TrendingMainState>() {
                /* class com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(92177);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ TrendingMainState invoke(TrendingMainState trendingMainState) {
                    boolean z;
                    TrendingMainState trendingMainState2 = trendingMainState;
                    h.f.b.l.d(trendingMainState2, "");
                    ArrayList<l> arrayList = mVar.f121442b;
                    T t = eVar2.element;
                    T t2 = eVar.element;
                    String sb = sb.toString();
                    List<? extends Aweme> list = mVar.f121441a;
                    if (list == null || list.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return TrendingMainState.copy$default(trendingMainState2, null, t, t2, null, arrayList, sb, z, 9, null);
                }
            });
            List<? extends Aweme> list = mVar.f121441a;
            if (list != null) {
                for (T t3 : list) {
                    String str4 = mVar.f121443c;
                    if (str4 == null) {
                        str4 = this.f141173c;
                    }
                    t3.setTrendingId(str4);
                    String trendingName = eVar2.element.getTrendingName();
                    if (trendingName == null) {
                        trendingName = "";
                    }
                    t3.setTrendingName(trendingName);
                    t3.setFromTrendingCard(this.f141171a.f141170l.getIsFromTrendingCard());
                }
            }
            List<? extends Aweme> list2 = mVar.f121441a;
            if (list2 != null) {
                Integer.valueOf(list2.size());
            }
            Object obj2 = mVar.f121441a;
            if (obj2 == null) {
                obj2 = h.a.z.INSTANCE;
            }
            return v.a(obj2, new o(z, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r17 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r6 = r18.getSubstate().getPayload();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r0 = r16.n;
        r5 = new com.ss.android.ugc.aweme.trending.viewmodel.d(r6, r7, r19, r18.getTrendingIdList(), r16.f141164c, (byte) 0);
        h.f.b.l.d(r5, "");
        r0 = r0.f141197b.c(r5).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel.b(r16, r17, r7, r20, r15));
        h.f.b.l.b(r0, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r20 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r15 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r15 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r6 = new com.bytedance.jedi.arch.ext.list.o(false, 3, (byte) 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.a.t<h.p<java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, com.bytedance.jedi.arch.ext.list.o>> a(boolean r17, com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState r18, java.lang.String r19, com.ss.android.ugc.aweme.search.l r20) {
        /*
            r16 = this;
            r3 = r16
            java.lang.String r2 = ""
            r4 = r18
            h.f.b.l.d(r4, r2)
            r14 = r20
            if (r14 == 0) goto L_0x0013
            java.lang.String r7 = r14.getEventId()
            if (r7 != 0) goto L_0x0016
        L_0x0013:
            r7 = r2
            if (r14 == 0) goto L_0x001c
        L_0x0016:
            java.lang.String r15 = r14.getTrendingName()
            if (r15 != 0) goto L_0x001d
        L_0x001c:
            r15 = r2
        L_0x001d:
            com.bytedance.jedi.arch.ext.list.o r6 = new com.bytedance.jedi.arch.ext.list.o
            r1 = 3
            r0 = 0
            r6.<init>(r0, r1, r0)
            r12 = r17
            if (r12 != 0) goto L_0x0030
            com.bytedance.jedi.arch.ext.list.ListState r0 = r4.getSubstate()
            com.bytedance.jedi.arch.ext.list.o r6 = r0.getPayload()
        L_0x0030:
            com.ss.android.ugc.aweme.trending.viewmodel.c r0 = r3.n
            com.ss.android.ugc.aweme.trending.viewmodel.d r5 = new com.ss.android.ugc.aweme.trending.viewmodel.d
            java.lang.String r9 = r4.getTrendingIdList()
            java.lang.String r10 = r3.f141164c
            r11 = 0
            r8 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            h.f.b.l.d(r5, r2)
            com.ss.android.ugc.aweme.trending.viewmodel.a r0 = r0.f141197b
            f.a.t r1 = r0.c(r5)
            f.a.aa r0 = f.a.k.a.f158006c
            f.a.aa r0 = f.a.h.a.b(r0)
            f.a.t r0 = r1.b(r0)
            com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$b r10 = new com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel$b
            r11 = r16
            r13 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            f.a.t r0 = r0.d(r10)
            h.f.b.l.b(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel.a(boolean, com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState, java.lang.String, com.ss.android.ugc.aweme.search.l):f.a.t");
    }
}
