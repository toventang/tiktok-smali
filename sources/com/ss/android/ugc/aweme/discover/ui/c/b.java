package com.ss.android.ugc.aweme.discover.ui.c;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.r.b;
import com.ss.android.ugc.aweme.utils.ai;
import h.a.n;
import h.f.b.l;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class b implements com.ss.android.ugc.aweme.r.b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f82498g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f82499a;

    /* renamed from: b  reason: collision with root package name */
    public final String f82500b;

    /* renamed from: c  reason: collision with root package name */
    public final String f82501c;

    /* renamed from: d  reason: collision with root package name */
    public final String f82502d;

    /* renamed from: e  reason: collision with root package name */
    public final String f82503e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC1937b f82504f;

    /* renamed from: h  reason: collision with root package name */
    private final long f82505h;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f82506i;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.b$b  reason: collision with other inner class name */
    public interface AbstractC1937b {
        static {
            Covode.recordClassIndex(51367);
        }

        void a(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(51365);
    }

    static final class a {
        static {
            Covode.recordClassIndex(51366);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82507a;

        static {
            Covode.recordClassIndex(51368);
        }

        c(b bVar) {
            this.f82507a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            SearchLiveList a2 = SearchApi.a(this.f82507a.f82500b, this.f82507a.f82499a, this.f82507a.f82501c, "load_more_general_list", this.f82507a.f82502d, this.f82507a.f82503e);
            this.f82507a.f82499a = a2.cursor;
            List<SearchLiveStruct> list = a2.liveList;
            l.b(list, "");
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                l.b(t, "");
                arrayList.add(t.getLiveAweme());
            }
            return new p(a2, arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.r.b
    public final void a(Map<String, String> map) {
        String str = "";
        l.d(map, str);
        AbstractC1937b bVar = this.f82504f;
        if (bVar != null) {
            String str2 = map.get("roomId");
            if (str2 != null) {
                str = str2;
            }
            bVar.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.r.b
    public final void a(b.a aVar) {
        l.d(aVar, "");
        if (!l.a((Object) this.f82506i, (Object) false)) {
            i.b(new c(this), i.f4824a).a(new d(this, aVar), i.f4826c, null);
        }
    }

    static final class d<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82508a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.a f82509b;

        static {
            Covode.recordClassIndex(51369);
        }

        d(b bVar, b.a aVar) {
            this.f82508a = bVar;
            this.f82509b = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            String str = "";
            if (ai.a(iVar)) {
                l.b(iVar, str);
                List<SearchLiveStruct> list = ((SearchLiveList) ((p) iVar.d()).getFirst()).liveList;
                if (list != null && (!list.isEmpty())) {
                    SearchLiveList searchLiveList = (SearchLiveList) ((p) iVar.d()).getFirst();
                    List<? extends Aweme> list2 = (List) ((p) iVar.d()).getSecond();
                    list2.size();
                    AbstractC1937b bVar = this.f82508a.f82504f;
                    if (bVar != null) {
                        bVar.a(searchLiveList, list2, searchLiveList.hasMore);
                    }
                    this.f82509b.a(list2);
                    return z.f158842a;
                }
            }
            l.b(iVar, str);
            Exception e2 = iVar.e();
            if (!(e2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                e2 = null;
            }
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) e2;
            if (aVar != null) {
                Integer.valueOf(aVar.getErrorCode());
                aVar.getErrorMsg();
            }
            iVar.e();
            b.a aVar2 = this.f82509b;
            if (aVar != null) {
                aVar.getErrorCode();
                String errorMsg = aVar.getErrorMsg();
                if (errorMsg != null) {
                    str = errorMsg;
                }
            }
            aVar2.a(str);
            return z.f158842a;
        }
    }

    public /* synthetic */ b(String str, long j2, String str2, String str3, String str4, AbstractC1937b bVar) {
        this(str, j2, str2, str3, str4, bVar, true);
    }

    public b(String str, long j2, String str2, String str3, String str4, AbstractC1937b bVar, Boolean bool) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f82500b = str;
        this.f82505h = j2;
        this.f82501c = str2;
        this.f82502d = str3;
        this.f82503e = str4;
        this.f82504f = bVar;
        this.f82506i = bool;
        this.f82499a = j2;
    }
}
