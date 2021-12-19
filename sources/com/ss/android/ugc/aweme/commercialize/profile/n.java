package com.ss.android.ugc.aweme.commercialize.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.l;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class n extends com.ss.android.ugc.aweme.common.e.a<Aweme, FeedItemList> {
    static {
        Covode.recordClassIndex(46411);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        l.d(objArr, "");
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        l.b(obj, "");
        return ((FeedItemList) obj).getItems();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        l.b(obj, "");
        if (((FeedItemList) obj).isHasMore()) {
            return true;
        }
        return false;
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f75229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f75230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f75231c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f75232d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f75233e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f75234f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f75235g;

        static {
            Covode.recordClassIndex(46412);
        }

        a(String str, String str2, long j2, long j3, int i2, String str3, String str4) {
            this.f75229a = str;
            this.f75230b = str2;
            this.f75231c = j2;
            this.f75232d = j3;
            this.f75233e = i2;
            this.f75234f = str3;
            this.f75235g = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return ((FakeUserAwemeApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(FakeUserAwemeApi.class)).getFakeUserAwemeList(this.f75229a, this.f75230b, this.f75231c, this.f75232d, this.f75233e, this.f75234f, this.f75235g).execute().f42630b;
        }
    }

    public final void a() {
        if (this.mData != null) {
            Object obj = this.mData;
            l.b(obj, "");
            if (((FeedItemList) obj).getItems() != null) {
                Object obj2 = this.mData;
                l.b(obj2, "");
                if (((FeedItemList) obj2).getItems().size() != 0) {
                    Object obj3 = this.mData;
                    l.b(obj3, "");
                    List<Aweme> items = ((FeedItemList) obj3).getItems();
                    l.b(items, "");
                    int size = items.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj4 = this.mData;
                        l.b(obj4, "");
                        List<Aweme> items2 = ((FeedItemList) obj4).getItems();
                        IAwemeService b2 = AwemeService.b();
                        Object obj5 = this.mData;
                        l.b(obj5, "");
                        items2.set(i2, b2.a(((FeedItemList) obj5).getItems().get(i2)));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length < 8 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String) || !(objArr[2] instanceof Long) || !(objArr[3] instanceof Long) || !(objArr[4] instanceof Integer) || !(objArr[5] instanceof Integer) || !(objArr[6] instanceof String) || !(objArr[7] instanceof String)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        int i2;
        List<Aweme> items;
        FeedItemList feedItemList = (FeedItemList) obj;
        if (this.mData == null) {
            super.handleData(feedItemList);
        } else if (feedItemList != null && feedItemList.getItems() != null) {
            List<Aweme> items2 = feedItemList.getItems();
            FeedItemList feedItemList2 = (FeedItemList) this.mData;
            if (feedItemList2 == null || (items = feedItemList2.getItems()) == null) {
                i2 = 0;
            } else {
                i2 = items.size();
            }
            insertItemList(items2, i2);
            Object obj2 = this.mData;
            l.b(obj2, "");
            List<Aweme> items3 = ((FeedItemList) obj2).getItems();
            super.handleData(feedItemList);
            Object obj3 = this.mData;
            l.b(obj3, "");
            ((FeedItemList) obj3).items = items3;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b, com.ss.android.ugc.aweme.common.e.a
    public final boolean sendRequest(Object... objArr) {
        l.d(objArr, "");
        if (checkParams(objArr)) {
            return false;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = objArr[2];
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj3).longValue();
        Object obj4 = objArr[3];
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue2 = ((Long) obj4).longValue();
        Object obj5 = objArr[4];
        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj5).intValue();
        Object obj6 = objArr[5];
        Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj6).intValue();
        Object obj7 = objArr[6];
        Objects.requireNonNull(obj7, "null cannot be cast to non-null type kotlin.String");
        Object obj8 = objArr[7];
        Objects.requireNonNull(obj8, "null cannot be cast to non-null type kotlin.String");
        this.mListQueryType = intValue2;
        com.ss.android.ugc.aweme.base.n.a().a(this.mHandler, new a((String) obj, (String) obj2, longValue, longValue2, intValue, (String) obj7, (String) obj8), 0);
        return true;
    }
}
