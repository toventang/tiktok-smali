package com.ss.android.ugc.aweme.donation.detail;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.donation.DonateApi;
import com.ss.android.ugc.aweme.donation.b;
import com.ss.android.ugc.aweme.donation.e;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class d extends com.ss.android.ugc.aweme.common.e.a<e, b> {

    /* renamed from: a  reason: collision with root package name */
    public final DonateApi f82999a = ((DonateApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(DonateApi.class));

    /* renamed from: b  reason: collision with root package name */
    public final String f83000b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f83001c;

    /* renamed from: d  reason: collision with root package name */
    public final String f83002d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f83003e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f83004f;

    /* renamed from: g  reason: collision with root package name */
    public final String f83005g;

    static {
        Covode.recordClassIndex(51755);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<e> getItems() {
        List<e> list;
        b bVar = (b) this.mData;
        if (bVar == null || (list = bVar.f82959b) == null) {
            return null;
        }
        return n.g((Collection) list);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        Boolean bool;
        b bVar = (b) this.mData;
        if (bVar != null) {
            bool = bVar.f82961d;
        } else {
            bool = null;
        }
        return l.a((Object) bool, (Object) true);
    }

    public static final class a implements Callable<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f83006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f83007b;

        static {
            Covode.recordClassIndex(51756);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ b call() {
            b bVar = this.f83006a.f82999a.getDonateDetail(this.f83006a.f83000b, Integer.valueOf(this.f83007b), this.f83006a.f83001c, this.f83006a.f83002d, this.f83006a.f83003e, this.f83006a.f83004f, this.f83006a.f83005g, true).get();
            l.b(bVar, "");
            return bVar;
        }

        a(d dVar, int i2) {
            this.f83006a = dVar;
            this.f83007b = i2;
        }
    }

    private final void a(int i2) {
        com.ss.android.ugc.aweme.base.n.a().a(this.mHandler, new a(this, i2), 0);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        a(0);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        int i2;
        l.d(objArr, "");
        Integer num = this.mData.f82960c;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        a(i2);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        b bVar = (b) obj;
        if (this.mListQueryType != 4) {
            super.handleData(bVar);
        } else if (bVar == null) {
        } else {
            if (this.mData == null) {
                this.mData = bVar;
            } else if (bVar.f82959b != null) {
                Collection collection = ((b) this.mData).f82959b;
                if (collection == null) {
                    collection = new ArrayList();
                }
                List g2 = n.g(collection);
                Collection collection2 = bVar.f82959b;
                if (collection2 == null) {
                    collection2 = z.INSTANCE;
                }
                g2.addAll(collection2);
                b bVar2 = (b) this.mData;
                this.mData = new b(bVar2.f82958a, g2, bVar.f82960c, bVar.f82961d, bVar2.f82962e, bVar2.f82963f);
            }
        }
    }

    public d(String str, Integer num, String str2, Long l2, Integer num2, String str3) {
        this.f83000b = str;
        this.f83001c = num;
        this.f83002d = str2;
        this.f83003e = l2;
        this.f83004f = num2;
        this.f83005g = str3;
    }
}
