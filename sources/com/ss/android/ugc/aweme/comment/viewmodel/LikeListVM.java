package com.ss.android.ugc.aweme.comment.viewmodel;

import android.util.Log;
import android.util.LruCache;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.api.LikeApi;
import com.ss.android.ugc.aweme.comment.model.LikeListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.cg;
import f.a.v;
import f.a.w;
import h.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class LikeListVM extends ac implements com.ss.android.ugc.aweme.comment.api.e, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f72925c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public BubbleBridge f72926a;

    /* renamed from: b  reason: collision with root package name */
    public String f72927b = "";

    /* renamed from: d  reason: collision with root package name */
    private final h.h f72928d = h.i.a((h.f.a.a) f.f72951a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f72929e = h.i.a((h.f.a.a) c.f72948a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f72930f = h.i.a((h.f.a.a) e.f72950a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f72931g = h.i.a((h.f.a.a) d.f72949a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f72932h = h.i.a((h.f.a.a) g.f72952a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f72933i = h.i.a((h.f.a.a) h.f72953a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f72934j = h.i.a((h.f.a.a) l.f72958a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f72935k = h.i.a((h.f.a.a) i.f72954a);

    static {
        Covode.recordClassIndex(44928);
    }

    public final LruCache<String, Boolean> c() {
        return (LruCache) this.f72928d.getValue();
    }

    /* access modifiers changed from: package-private */
    public final LruCache<String, LikeListResponse> d() {
        return (LruCache) this.f72929e.getValue();
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Long> e() {
        return (Map) this.f72930f.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<p<String, Long>> f() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f72931g.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<User> g() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f72932h.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(35, new org.greenrobot.eventbus.g(LikeListVM.class, "onBlockUserEvent", com.ss.android.ugc.aweme.profile.b.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final f.a.b.a h() {
        return (f.a.b.a) this.f72933i.getValue();
    }

    public final Set<String> i() {
        return (Set) this.f72934j.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> j() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f72935k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44932);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static LikeListVM a(androidx.fragment.app.e eVar) {
            h.f.b.l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(LikeListVM.class);
            h.f.b.l.b(a2, "");
            LikeListVM likeListVM = (LikeListVM) a2;
            likeListVM.a(eVar);
            return likeListVM;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<LruCache<String, LikeListResponse>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f72948a = new c();

        static {
            Covode.recordClassIndex(44934);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LruCache<String, LikeListResponse> invoke() {
            return new LruCache(3);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<p<? extends String, ? extends Long>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f72949a = new d();

        static {
            Covode.recordClassIndex(44935);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<p<? extends String, ? extends Long>> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Map<String, Long>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f72950a = new e();

        static {
            Covode.recordClassIndex(44936);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Long> invoke() {
            return new LinkedHashMap();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<LruCache<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f72951a = new f();

        static {
            Covode.recordClassIndex(44937);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LruCache<String, Boolean> invoke() {
            return new LruCache(3);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<User>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f72952a = new g();

        static {
            Covode.recordClassIndex(44938);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<User> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f72953a = new h();

        static {
            Covode.recordClassIndex(44939);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f72954a = new i();

        static {
            Covode.recordClassIndex(44940);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f72958a = new l();

        static {
            Covode.recordClassIndex(44943);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.e
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<p<String, Long>> a() {
        return f();
    }

    public final BubbleBridge b() {
        BubbleBridge bubbleBridge = this.f72926a;
        if (bubbleBridge == null) {
            h.f.b.l.a("bubbleBridge");
        }
        return bubbleBridge;
    }

    public final LikeListResponse k() {
        return d().get(this.f72927b);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        h().a();
        cg.b(this);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f72943a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f72944b;

        /* renamed from: c  reason: collision with root package name */
        public final LikeApi.a f72945c;

        /* renamed from: d  reason: collision with root package name */
        public final int f72946d;

        /* renamed from: e  reason: collision with root package name */
        public final String f72947e;

        static {
            Covode.recordClassIndex(44933);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.f.b.l.a(this.f72943a, bVar.f72943a) && this.f72944b == bVar.f72944b && h.f.b.l.a(this.f72945c, bVar.f72945c) && this.f72946d == bVar.f72946d && h.f.b.l.a(this.f72947e, bVar.f72947e);
        }

        public final int hashCode() {
            String str = this.f72943a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f72944b;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode + i3) * 31;
            LikeApi.a aVar = this.f72945c;
            int hashCode2 = (((i6 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f72946d) * 31;
            String str2 = this.f72947e;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "Request{aid:" + this.f72943a + ", isRefresh:" + this.f72944b + ", scenario:" + this.f72945c + '}';
        }

        private b(String str, boolean z, LikeApi.a aVar, int i2, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(aVar, "");
            this.f72943a = str;
            this.f72944b = z;
            this.f72945c = aVar;
            this.f72946d = i2;
            this.f72947e = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, boolean z, LikeApi.a aVar, int i2, String str2, int i3) {
            this(str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? LikeApi.a.NORMAL : aVar, (i3 & 8) != 0 ? 20 : i2, (i3 & 16) != 0 ? null : str2);
        }
    }

    public LikeListVM() {
        cg.a(this);
    }

    public final void a(androidx.fragment.app.e eVar) {
        if (this.f72926a == null) {
            this.f72926a = new BubbleBridge(this, eVar);
        }
    }

    public static final class BubbleBridge extends ILikedListViewModel {

        /* renamed from: d  reason: collision with root package name */
        private final LikeListVM f72936d;

        static {
            Covode.recordClassIndex(44929);
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BubbleBridge f72940a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f72941b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f72942c;

            static {
                Covode.recordClassIndex(44931);
            }

            b(BubbleBridge bubbleBridge, boolean z, String str) {
                this.f72940a = bubbleBridge;
                this.f72941b = z;
                this.f72942c = str;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                if (this.f72941b) {
                    this.f72940a.a("REFRESH_LIKED_LIST_FAIL", this.f72942c);
                } else {
                    this.f72940a.a("LOAD_MORE_LIKED_LIST_FAIL", this.f72942c);
                }
            }
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BubbleBridge f72937a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f72938b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f72939c;

            static {
                Covode.recordClassIndex(44930);
            }

            a(BubbleBridge bubbleBridge, boolean z, String str) {
                this.f72937a = bubbleBridge;
                this.f72938b = z;
                this.f72939c = str;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                if (this.f72938b) {
                    this.f72937a.a("REFRESH_LIKED_LIST_SUCCESS", new p(this.f72939c, obj));
                } else {
                    this.f72937a.a("LOAD_MORE_LIKED_LIST_SUCCESS", new p(this.f72939c, obj));
                }
            }
        }

        public BubbleBridge(LikeListVM likeListVM, androidx.lifecycle.m mVar) {
            h.f.b.l.d(likeListVM, "");
            h.f.b.l.d(mVar, "");
            this.f72936d = likeListVM;
            this.f66996a = mVar;
        }

        public final void a(String str, long j2) {
            boolean z;
            h.f.b.l.d(str, "");
            if (j2 == 0) {
                z = true;
            } else {
                z = false;
            }
            f.a.b.b a2 = LikeApi.Api.a.a(LikeApi.a(), str, j2, LikeApi.a.BULLET.getValue()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, z, str), new b(this, z, str));
            h.f.b.l.b(a2, "");
            f.a.j.a.a(a2, this.f72936d.h());
        }
    }

    public static final class j<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeListVM f72955a;

        static {
            Covode.recordClassIndex(44941);
        }

        public j(LikeListVM likeListVM) {
            this.f72955a = likeListVM;
        }

        @Override // f.a.w
        public final void subscribe(v<LikeListResponse> vVar) {
            h.f.b.l.d(vVar, "");
            this.f72955a.a(new b(this.f72955a.f72927b, false, null, 0, null, 28), vVar);
        }
    }

    public static final class k<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeListVM f72956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f72957b;

        static {
            Covode.recordClassIndex(44942);
        }

        public k(LikeListVM likeListVM, String str) {
            this.f72956a = likeListVM;
            this.f72957b = str;
        }

        @Override // f.a.w
        public final void subscribe(v<LikeListResponse> vVar) {
            h.f.b.l.d(vVar, "");
            this.f72956a.a(new b(this.f72956a.f72927b, true, null, 0, this.f72957b, 12), vVar);
        }
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        if (!h.f.b.l.a((Object) this.f72927b, (Object) str)) {
            this.f72927b = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final m f72959a = new m();

        static {
            Covode.recordClassIndex(44944);
        }

        m() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            String recType;
            LikeListResponse likeListResponse = (LikeListResponse) obj;
            h.f.b.l.d(likeListResponse, "");
            List<User> likeList = likeListResponse.getLikeList();
            if (likeList != null) {
                for (T t : likeList) {
                    MatchedFriendStruct matchedFriendStruct = t.getMatchedFriendStruct();
                    if (!(matchedFriendStruct == null || (recType = matchedFriendStruct.getRecType()) == null)) {
                        t.setRecType(recType);
                    }
                    BaseResponse.ServerTimeExtra serverTimeExtra = likeListResponse.extra;
                    if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
                        str = "";
                    }
                    t.setRequestId(str);
                }
            }
            return likeListResponse;
        }
    }

    public final long a(Aweme aweme) {
        AwemeStatistics statistics;
        if (aweme == null) {
            return 0;
        }
        Long l2 = e().get(aweme.getAid());
        if (l2 == null && ((statistics = aweme.getStatistics()) == null || (l2 = Long.valueOf(statistics.getDiggCount())) == null)) {
            return 0;
        }
        return l2.longValue();
    }

    /* access modifiers changed from: package-private */
    public static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeListVM f72964a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f72965b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v f72966c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f72967d;

        static {
            Covode.recordClassIndex(44946);
        }

        o(LikeListVM likeListVM, String str, v vVar, b bVar) {
            this.f72964a = likeListVM;
            this.f72965b = str;
            this.f72966c = vVar;
            this.f72967d = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f72964a.c().put(this.f72965b, false);
            v vVar = this.f72966c;
            if (vVar != null) {
                h.f.b.l.b(th, "");
                com.ss.android.ugc.aweme.common.ac.a(vVar, th);
            }
            String str = "request error, req:" + this.f72967d;
            h.f.b.l.b(th, "");
            h.f.b.l.d("LikeListVM", "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(th, "");
            if (com.ss.android.ugc.aweme.comment.util.i.a()) {
                com.ss.android.ugc.aweme.framework.a.a.b(6, "LikeListVM", str + ": " + Log.getStackTraceString(th));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeListVM f72960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f72961b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f72962c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f72963d;

        static {
            Covode.recordClassIndex(44945);
        }

        n(LikeListVM likeListVM, b bVar, String str, v vVar) {
            this.f72960a = likeListVM;
            this.f72961b = bVar;
            this.f72962c = str;
            this.f72963d = vVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            LikeListResponse likeListResponse;
            long j2;
            LikeListResponse likeListResponse2 = (LikeListResponse) obj;
            com.ss.android.ugc.aweme.comment.util.i.a("LikeListVM", "request success: req:" + this.f72961b + ", resp:" + likeListResponse2);
            this.f72960a.c().put(this.f72962c, false);
            v vVar = this.f72963d;
            if (vVar != null) {
                LikeListVM likeListVM = this.f72960a;
                b bVar = this.f72961b;
                h.f.b.l.b(likeListResponse2, "");
                LikeListResponse likeListResponse3 = likeListVM.d().get(bVar.f72943a);
                if (likeListResponse3 == null || bVar.f72944b) {
                    likeListResponse = likeListResponse2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<User> likeList = likeListResponse3.getLikeList();
                    if (likeList != null) {
                        arrayList.addAll(likeList);
                    }
                    List<User> likeList2 = likeListResponse2.getLikeList();
                    if (likeList2 != null) {
                        arrayList.addAll(likeList2);
                    }
                    likeListResponse = LikeListResponse.copy$default(likeListResponse2, false, 0, arrayList, false, 11, null);
                }
                likeListVM.d().put(bVar.f72943a, likeListResponse);
                if (bVar.f72944b && !likeListResponse2.getHasMore()) {
                    List<User> likeList3 = likeListResponse2.getLikeList();
                    if (likeList3 != null) {
                        j2 = (long) likeList3.size();
                    } else {
                        j2 = 0;
                    }
                    Long l2 = likeListVM.e().get(bVar.f72943a);
                    if (l2 == null || j2 != l2.longValue()) {
                        likeListVM.e().put(bVar.f72943a, Long.valueOf(j2));
                        likeListVM.f().setValue(h.v.a(bVar.f72943a, Long.valueOf(j2)));
                    }
                }
                com.ss.android.ugc.aweme.common.ac.a(vVar, likeListResponse);
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onBlockUserEvent(com.ss.android.ugc.aweme.profile.b.a aVar) {
        User user;
        String uid;
        LikeListResponse k2;
        List<User> likeList;
        if (aVar != null && (user = aVar.f116043a) != null && (uid = user.getUid()) != null && (k2 = k()) != null && (likeList = k2.getLikeList()) != null) {
            ListIterator<User> listIterator = likeList.listIterator();
            boolean z = false;
            while (listIterator.hasNext()) {
                if (h.f.b.l.a((Object) listIterator.next().getUid(), (Object) uid)) {
                    listIterator.remove();
                    z = true;
                }
            }
            if (z) {
                p<String, Long> value = f().getValue();
                if (value != null && h.f.b.l.a((Object) this.f72927b, (Object) value.getFirst()) && value.getSecond().longValue() > 0) {
                    f().setValue(h.v.a(value.getFirst(), Long.valueOf(value.getSecond().longValue() - 1)));
                }
                Long l2 = e().get(this.f72927b);
                if (l2 != null && l2.longValue() > 0) {
                    e().put(this.f72927b, Long.valueOf(l2.longValue() - 1));
                }
            }
            g().setValue(aVar.f116043a);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.e
    public final void a(String str, long j2) {
        if (str != null && str.length() != 0) {
            e().put(str, Long.valueOf(j2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        if (r7 <= 0) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM.b r13, f.a.v<com.ss.android.ugc.aweme.comment.model.LikeListResponse> r14) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM.a(com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$b, f.a.v):boolean");
    }
}
