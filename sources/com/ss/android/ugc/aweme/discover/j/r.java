package com.ss.android.ugc.aweme.discover.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class r extends f<SearchUser, SearchUserList> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81307a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final int f81308b = 10;

    @Override // com.ss.android.ugc.aweme.discover.j.f
    public final int c() {
        return 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50525);
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
        public final f f81309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f81310c;

        static {
            Covode.recordClassIndex(50526);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.discover.j.b
        public final Object a() {
            return SearchApi.a(this.f81309b);
        }

        public b(r rVar, f fVar) {
            l.d(fVar, "");
            this.f81310c = rVar;
            this.f81309b = fVar;
        }
    }

    static {
        Covode.recordClassIndex(50524);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        l.b(obj, "");
        if (((SearchUserList) obj).hasMore) {
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
        int i2;
        String str = "";
        l.d(objArr, str);
        int i3 = 0;
        if (objArr.length > 3) {
            Object obj = objArr[3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            i2 = ((Integer) obj).intValue();
        } else {
            i2 = 0;
        }
        String a2 = a(objArr);
        if (!isDataEmpty()) {
            Object obj2 = this.mData;
            l.b(obj2, str);
            i3 = ((SearchUserList) obj2).cursor;
        }
        long j2 = (long) i3;
        int i4 = f81308b;
        String str2 = this.q;
        if (str2 != null) {
            str = str2;
        }
        String i5 = i();
        int i6 = this.o;
        a(new f(a2, 0, e(), null, i6, i2, str, this.r, j2, i4, i5, null, null, null, j(), k(), 0, null, null, 997386));
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        int i2;
        l.d(objArr, "");
        if (objArr.length > 3) {
            Object obj = objArr[3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            i2 = ((Integer) obj).intValue();
        } else {
            i2 = 0;
        }
        String a2 = a(objArr);
        int i3 = f81308b;
        String i4 = i();
        int i5 = this.o;
        a(new f(a2, 0, e(), null, i5, i2, "", this.r, 0, i3, i4, null, null, null, j(), k(), 0, null, s.a.a().a(), 473098));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchUserList searchUserList) {
        super.handleData((SearchApiResult) searchUserList);
        if (searchUserList == null) {
            l.b();
        }
        List<SearchUser> list = searchUserList.userList;
        this.mIsNewDataEmpty = com.bytedance.common.utility.collection.b.a((Collection) list);
        boolean z = false;
        if (!this.mIsNewDataEmpty) {
            for (SearchUser searchUser : list) {
                l.b(searchUser, "");
                searchUser.mGlobalDoodleConfig = searchUserList.globalDoodleConfig;
                if (!searchUser.isDynamicCard()) {
                    User user = searchUser.user;
                    l.b(user, "");
                    user.setRequestId(this.p);
                }
                searchUser.logPb = searchUserList.logPb;
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = searchUserList;
                Object obj = this.mData;
                l.b(obj, "");
                ((SearchUserList) obj).userList = new ArrayList();
                a_(list);
            } else if (i2 == 4) {
                b(list);
                Object obj2 = this.mData;
                l.b(obj2, "");
                SearchUserList searchUserList2 = (SearchUserList) obj2;
                if (searchUserList.hasMore) {
                    Object obj3 = this.mData;
                    l.b(obj3, "");
                    if (((SearchUserList) obj3).hasMore) {
                        z = true;
                    }
                }
                searchUserList2.hasMore = z;
                Object obj4 = this.mData;
                l.b(obj4, "");
                ((SearchUserList) obj4).cursor = searchUserList.cursor;
            }
        } else {
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = searchUserList;
                d();
                if (this.mData != null) {
                    Object obj5 = this.mData;
                    l.b(obj5, "");
                    ((SearchUserList) obj5).hasMore = false;
                }
            } else if (i3 == 4 && this.mData != null) {
                Object obj6 = this.mData;
                l.b(obj6, "");
                SearchUserList searchUserList3 = (SearchUserList) obj6;
                if (searchUserList.hasMore) {
                    Object obj7 = this.mData;
                    l.b(obj7, "");
                    if (((SearchUserList) obj7).hasMore) {
                        z = true;
                    }
                }
                searchUserList3.hasMore = z;
                Object obj8 = this.mData;
                l.b(obj8, "");
                if (((SearchUserList) obj8).hasMore) {
                    Object obj9 = this.mData;
                    l.b(obj9, "");
                    ((SearchUserList) obj9).cursor = searchUserList.cursor;
                }
            }
        }
    }
}
