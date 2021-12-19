package com.ss.android.ugc.aweme.discover.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.helper.w;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchChallengeList;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class i extends f<SearchChallenge, SearchChallengeList> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81253a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final int f81254b = 20;

    @Override // com.ss.android.ugc.aweme.discover.j.f
    public final int c() {
        return 2;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50492);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final class b extends b {

        /* renamed from: b  reason: collision with root package name */
        public final f f81255b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f81256c;

        static {
            Covode.recordClassIndex(50493);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.discover.j.b
        public final Object a() {
            return SearchApi.b(this.f81255b);
        }

        public b(i iVar, f fVar) {
            l.d(fVar, "");
            this.f81256c = iVar;
            this.f81255b = fVar;
        }
    }

    static {
        Covode.recordClassIndex(50491);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        l.b(obj, "");
        if (((SearchChallengeList) obj).hasMore) {
            return true;
        }
        return false;
    }

    private void a(f fVar) {
        l.d(fVar, "");
        b bVar = new b(this, fVar);
        bVar.f81229a = fVar.r;
        this.f81247k = bVar;
        n.a().a(this.mHandler, bVar, 0);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        String str = "";
        l.d(objArr, str);
        int i2 = 0;
        String a2 = a(objArr);
        if (!isDataEmpty()) {
            Object obj = this.mData;
            l.b(obj, str);
            i2 = ((SearchChallengeList) obj).cursor;
        }
        long j2 = (long) i2;
        int i3 = f81254b;
        String str2 = this.q;
        if (str2 != null) {
            str = str2;
        }
        Object obj2 = objArr[3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        String i4 = i();
        a(new f(a2, 0, e(), null, this.o, intValue, str, this.r, j2, i3, i4, null, null, null, null, null, 0, null, null, 1046538));
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        String a2 = a(objArr);
        int i2 = f81254b;
        Object obj = objArr[3];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        String i3 = i();
        a(new f(a2, 0, e(), null, this.o, intValue, "", this.r, 0, i2, i3, null, null, null, null, null, 0, null, s.a.a().a(), 522250));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchChallengeList searchChallengeList) {
        super.handleData((SearchApiResult) searchChallengeList);
        if (searchChallengeList == null) {
            l.b();
        }
        List<SearchChallenge> list = searchChallengeList.challengeList;
        w.a(list);
        this.mIsNewDataEmpty = com.bytedance.common.utility.collection.b.a((Collection) list);
        boolean z = false;
        if (!this.mIsNewDataEmpty) {
            for (SearchChallenge searchChallenge : list) {
                l.b(searchChallenge, "");
                if (searchChallenge.getChallenge() != null) {
                    Challenge challenge = searchChallenge.getChallenge();
                    l.b(challenge, "");
                    challenge.setRequestId(this.p);
                }
                searchChallenge.setRequestId(searchChallengeList.getRequestId());
                searchChallenge.logPbBean = searchChallengeList.logPb;
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = searchChallengeList;
                Object obj = this.mData;
                l.b(obj, "");
                ((SearchChallengeList) obj).challengeList = new ArrayList();
                a_(list);
            } else if (i2 == 4) {
                b(list);
                Object obj2 = this.mData;
                l.b(obj2, "");
                SearchChallengeList searchChallengeList2 = (SearchChallengeList) obj2;
                if (searchChallengeList.hasMore) {
                    Object obj3 = this.mData;
                    l.b(obj3, "");
                    if (((SearchChallengeList) obj3).hasMore) {
                        z = true;
                    }
                }
                searchChallengeList2.hasMore = z;
                Object obj4 = this.mData;
                l.b(obj4, "");
                ((SearchChallengeList) obj4).cursor = searchChallengeList.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchChallengeList;
                d();
            }
            if (this.mData != null) {
                Object obj5 = this.mData;
                l.b(obj5, "");
                ((SearchChallengeList) obj5).hasMore = false;
            }
        }
    }
}
