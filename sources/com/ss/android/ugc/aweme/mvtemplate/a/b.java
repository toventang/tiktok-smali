package com.ss.android.ugc.aweme.mvtemplate.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class b extends com.ss.android.ugc.aweme.common.e.a<Aweme, c> {

    /* renamed from: a  reason: collision with root package name */
    private int f112129a;

    static {
        Covode.recordClassIndex(72050);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((c) this.mData).f112132a;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        Boolean bool;
        if (this.mData == null || (bool = ((c) this.mData).f112134c) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f112130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f112131b;

        static {
            Covode.recordClassIndex(72051);
        }

        a(String str, long j2) {
            this.f112130a = str;
            this.f112131b = j2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str = this.f112130a;
            long j2 = this.f112131b;
            l.d(str, "");
            String str2 = MovieDetailAPi.f112159e;
            l.b(str2, "");
            c cVar = ((MovieDetailAPi.MvDetail) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str2).a(MovieDetailAPi.MvDetail.class)).getMvDetailList(str, j2).get();
            l.b(cVar, "");
            return cVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isDataEmpty() {
        if (this.mData == null) {
            return true;
        }
        if (!l.a((Object) ((c) this.mData).f112134c, (Object) false) || !com.bytedance.common.utility.collection.b.a((Collection) getItems())) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.e.a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        Aweme aweme2 = aweme;
        l.d(aweme2, "");
        return m.a(getItems(), aweme2, this.mNotifyListeners);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>] */
    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new c();
        }
        ((c) this.mData).f112134c = true;
        ((c) this.mData).f112132a = (ArrayList) list;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        long j2;
        l.d(objArr, "");
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        if (isDataEmpty()) {
            j2 = 0;
        } else {
            j2 = ((c) this.mData).f112133b;
        }
        Object obj2 = objArr[2];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        a(str, j2, ((Integer) obj2).intValue());
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = objArr[2];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        a((String) obj, 0, ((Integer) obj2).intValue());
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ArrayList<Aweme> arrayList;
        int i2;
        Aweme aweme;
        Aweme aweme2;
        c cVar = (c) obj;
        boolean z2 = false;
        if (cVar == null || (com.bytedance.common.utility.collection.b.a((Collection) cVar.f112132a) && l.a((Object) cVar.f112134c, (Object) false))) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (cVar == null) {
                l.b();
            }
            ArrayList<Aweme> arrayList2 = cVar.f112132a;
            if (arrayList2 != null) {
                Integer valueOf = Integer.valueOf(arrayList2.size());
                int i3 = 0;
                while (true) {
                    if (valueOf != null) {
                        i2 = valueOf.intValue();
                    } else {
                        i2 = 0;
                    }
                    if (i3 >= i2) {
                        break;
                    }
                    ArrayList<Aweme> arrayList3 = cVar.f112132a;
                    if (arrayList3 != null) {
                        aweme = arrayList3.get(i3);
                    } else {
                        aweme = null;
                    }
                    Aweme a2 = AwemeService.b().a(aweme);
                    ArrayList<Aweme> arrayList4 = cVar.f112132a;
                    if (!(arrayList4 == null || (aweme2 = arrayList4.get(i3)) == null)) {
                        int isTop = aweme2.getIsTop();
                        if (a2 == null) {
                            l.b();
                        }
                        a2.setIsTop(isTop);
                    }
                    IRequestIdService a3 = RequestIdService.a();
                    StringBuilder sb = new StringBuilder();
                    l.b(a2, "");
                    a3.a(sb.append(a2.getAid()).append(this.f112129a + 11000).toString(), cVar.f112135d, i3);
                    ArrayList<Aweme> arrayList5 = cVar.f112132a;
                    if (arrayList5 != null) {
                        arrayList5.set(i3, a2);
                    }
                    if (cVar.f112136e != null) {
                        ac.a.f91473a.a(cVar.f112135d, cVar.f112136e);
                    }
                    i3++;
                }
            }
            int i4 = this.mListQueryType;
            if (i4 == 1) {
                this.mData = cVar;
            } else if (i4 == 4) {
                ArrayList<Aweme> arrayList6 = cVar.f112132a;
                if (!(arrayList6 == null || (arrayList = ((c) this.mData).f112132a) == null)) {
                    arrayList.addAll(arrayList6);
                }
                ((c) this.mData).f112133b = cVar.f112133b;
                c cVar2 = (c) this.mData;
                Boolean bool = cVar.f112134c;
                if (bool != null) {
                    z2 = bool.booleanValue();
                }
                cVar2.f112134c = Boolean.valueOf(z2);
            }
        } else if (this.mData != null) {
            ((c) this.mData).f112134c = false;
        }
    }

    private final void a(String str, long j2, int i2) {
        this.f112129a = i2;
        n.a().a(this.mHandler, new a(str, j2), 0);
    }
}
