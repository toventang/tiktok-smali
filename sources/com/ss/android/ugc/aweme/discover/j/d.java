package com.ss.android.ugc.aweme.discover.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.discover.c.e;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchMix;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class d extends f<Aweme, SearchMix> {

    /* renamed from: c  reason: collision with root package name */
    public static final String f81231c = "video_search";

    /* renamed from: d  reason: collision with root package name */
    public static final String f81232d = "guide_search";

    /* renamed from: e  reason: collision with root package name */
    public static final a f81233e = new a((byte) 0);
    private static final int s = 10;

    /* renamed from: a  reason: collision with root package name */
    public String f81234a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f81235b;

    /* renamed from: f  reason: collision with root package name */
    private int f81236f;

    /* renamed from: g  reason: collision with root package name */
    private String f81237g = f81231c;

    @Override // com.ss.android.ugc.aweme.discover.j.f
    public final int c() {
        return 4;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50485);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(50484);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        l.b(obj, "");
        if (((SearchMix) obj).hasMore) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final class b extends b {

        /* renamed from: b  reason: collision with root package name */
        public final f f81238b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f81239c;

        static {
            Covode.recordClassIndex(50486);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
        @Override // com.ss.android.ugc.aweme.discover.j.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a() {
            /*
            // Method dump skipped, instructions count: 166
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.j.d.b.a():java.lang.Object");
        }

        public b(d dVar, f fVar) {
            l.d(fVar, "");
            this.f81239c = dVar;
            this.f81238b = fVar;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.f81237g = str;
    }

    @Override // com.ss.android.ugc.aweme.discover.j.f
    public final void a_(List<? extends Aweme> list) {
        int i2;
        super.a_(list);
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        this.f81236f = i2;
    }

    private void a(f fVar) {
        l.d(fVar, "");
        this.f81244h = fVar.f81398l;
        b bVar = new b(this, fVar);
        bVar.f81229a = fVar.r;
        this.f81247k = bVar;
        n.a().a(this.mHandler, bVar, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMix searchMix) {
        boolean z;
        boolean z2;
        int i2;
        super.handleData((SearchApiResult) searchMix);
        boolean z3 = false;
        if (searchMix == null || com.bytedance.common.utility.collection.b.a((Collection) searchMix.awemeList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (searchMix == null) {
                l.b();
            }
            List<Aweme> list = searchMix.awemeList;
            if (this.mListQueryType == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f81236f = e.a(z2, list, this.f81236f);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Aweme a2 = AwemeService.b().a(searchMix.awemeList.get(i3));
                if (this.mData != null) {
                    Object obj = this.mData;
                    l.b(obj, "");
                    if (((SearchMix) obj).awemeList != null) {
                        Object obj2 = this.mData;
                        l.b(obj2, "");
                        i2 = ((SearchMix) obj2).awemeList.size();
                        l.b(a2, "");
                        a2.setRequestId(this.p);
                        RequestIdService.a().a(a2.getAid() + 9, this.p, i2 + i3);
                        list.set(i3, a2);
                        a2.setAwemePosition(i3);
                    }
                }
                i2 = 0;
                l.b(a2, "");
                a2.setRequestId(this.p);
                RequestIdService.a().a(a2.getAid() + 9, this.p, i2 + i3);
                list.set(i3, a2);
                a2.setAwemePosition(i3);
            }
            int i4 = this.mListQueryType;
            if (i4 == 1) {
                this.mData = searchMix;
                a_(list);
            } else if (i4 == 4) {
                b(list);
                Object obj3 = this.mData;
                l.b(obj3, "");
                SearchMix searchMix2 = (SearchMix) obj3;
                if (searchMix.hasMore) {
                    Object obj4 = this.mData;
                    l.b(obj4, "");
                    if (((SearchMix) obj4).hasMore) {
                        z3 = true;
                    }
                }
                searchMix2.hasMore = z3;
                Object obj5 = this.mData;
                l.b(obj5, "");
                ((SearchMix) obj5).cursor = searchMix.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
                d();
            }
            if (this.mData != null) {
                Object obj6 = this.mData;
                l.b(obj6, "");
                ((SearchMix) obj6).hasMore = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public void loadMoreList(Object... objArr) {
        f fVar;
        String str = "";
        l.d(objArr, str);
        int i2 = 0;
        if (objArr.length == 1) {
            String a2 = a(objArr);
            if (!isDataEmpty()) {
                Object obj = this.mData;
                l.b(obj, str);
                i2 = ((SearchMix) obj).cursor;
            }
            long j2 = (long) i2;
            int i3 = s;
            String str2 = this.q;
            if (str2 != null) {
                str = str2;
            }
            com.ss.android.ugc.aweme.search.g.b bVar = this.f81244h;
            String i4 = i();
            int i5 = this.o;
            fVar = new f(a2, 0, e(), this.f81237g, i5, 1, str, this.r, j2, i3, i4, bVar, this.f81234a, null, null, null, 0, null, null, 1040386);
        } else {
            String a3 = a(objArr);
            if (!isDataEmpty()) {
                Object obj2 = this.mData;
                l.b(obj2, str);
                i2 = ((SearchMix) obj2).cursor;
            }
            long j3 = (long) i2;
            int i6 = s;
            String str3 = this.q;
            if (str3 != null) {
                str = str3;
            }
            Object obj3 = objArr[3];
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            String i7 = i();
            int i8 = this.o;
            String e2 = e();
            String str4 = this.f81237g;
            String str5 = this.f81234a;
            fVar = new f(a3, 0, e2, str4, i8, ((Integer) obj3).intValue(), str, this.r, j3, i6, i7, (com.ss.android.ugc.aweme.search.g.b) objArr[4], str5, null, null, null, 0, null, null, 1040386);
        }
        a(fVar);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public void refreshList(Object... objArr) {
        f fVar;
        l.d(objArr, "");
        if (objArr.length == 1) {
            String a2 = a(objArr);
            int i2 = s;
            com.ss.android.ugc.aweme.search.g.b bVar = this.f81244h;
            String i3 = i();
            int i4 = this.o;
            fVar = new f(a2, 0, e(), this.f81237g, i4, 1, "", this.r, 0, i2, i3, bVar, this.f81234a, this.f81235b, null, null, 0, null, s.a.a().a(), 507906);
        } else {
            String a3 = a(objArr);
            int i5 = s;
            Object obj = objArr[3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            String i6 = i();
            int i7 = this.o;
            String e2 = e();
            String str = this.f81237g;
            String str2 = this.f81234a;
            String str3 = this.f81235b;
            fVar = new f(a3, 0, e2, str, i7, ((Integer) obj).intValue(), "", this.r, 0, i5, i6, (com.ss.android.ugc.aweme.search.g.b) objArr[4], str2, str3, null, null, 0, null, s.a.a().a(), 507906);
        }
        a(fVar);
    }
}
