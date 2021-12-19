package com.ss.android.ugc.aweme.duet.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.duet.api.API;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.in;
import h.a.i;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class b extends com.ss.android.ugc.aweme.common.e.a<Aweme, a> {
    static {
        Covode.recordClassIndex(52441);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    public final void a() {
        resetLoadingStatus(null);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((a) this.mData).f84116a;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || ((a) this.mData).f84118c == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isDataEmpty() {
        if (this.mData == null) {
            return true;
        }
        if (((a) this.mData).f84118c != 0 || !com.bytedance.common.utility.collection.b.a((Collection) getItems())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f84120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f84121b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f84122c = 20;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f84123d;

        static {
            Covode.recordClassIndex(52442);
        }

        a(String str, long j2, String str2) {
            this.f84120a = str;
            this.f84121b = j2;
            this.f84123d = str2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str = this.f84120a;
            long j2 = this.f84121b;
            long j3 = (long) this.f84122c;
            String str2 = this.f84123d;
            l.d(str, "");
            String str3 = Api.f66569d;
            l.b(str3, "");
            a aVar = ((API) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str3).a(API.class)).getDuetDetailList(str, j2, j3, str2, 37).get();
            l.b(aVar, "");
            return aVar;
        }
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
            j2 = ((a) this.mData).f84117b;
        }
        a(str, j2, "");
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        String str = "";
        l.d(objArr, str);
        if (i.b(objArr, 4) instanceof String) {
            Object b2 = i.b(objArr, 4);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type kotlin.String");
            str = (String) b2;
        }
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        a((String) obj, 0, str);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ArrayList<Aweme> arrayList;
        int i2;
        Aweme aweme;
        Aweme aweme2;
        a aVar = (a) obj;
        if (aVar == null || (com.bytedance.common.utility.collection.b.a((Collection) aVar.f84116a) && aVar.f84118c != 1)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (aVar == null) {
                l.b();
            }
            ArrayList<Aweme> arrayList2 = aVar.f84116a;
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
                    ArrayList<Aweme> arrayList3 = aVar.f84116a;
                    if (arrayList3 != null) {
                        aweme = arrayList3.get(i3);
                    } else {
                        aweme = null;
                    }
                    Aweme a2 = AwemeService.b().a(aweme);
                    ArrayList<Aweme> arrayList4 = aVar.f84116a;
                    if (!(arrayList4 == null || (aweme2 = arrayList4.get(i3)) == null)) {
                        int isTop = aweme2.getIsTop();
                        if (a2 == null) {
                            l.b();
                        }
                        a2.setIsTop(isTop);
                    }
                    ArrayList<Aweme> arrayList5 = aVar.f84116a;
                    if (arrayList5 != null) {
                        arrayList5.set(i3, a2);
                    }
                    i3++;
                }
            }
            int i4 = this.mListQueryType;
            if (i4 == 1) {
                this.mData = aVar;
            } else if (i4 == 4) {
                ArrayList<Aweme> arrayList6 = aVar.f84116a;
                if (!(arrayList6 == null || (arrayList = ((a) this.mData).f84116a) == null)) {
                    arrayList.addAll(arrayList6);
                }
                ((a) this.mData).f84117b = aVar.f84117b;
                ((a) this.mData).f84118c = aVar.f84118c;
            }
        } else if (this.mData != null) {
            ((a) this.mData).f84118c = 0;
        }
    }

    private final void a(String str, long j2, String str2) {
        if (!in.d()) {
            n.a().a(this.mHandler, new a(str, j2, str2), 0);
        }
    }
}
