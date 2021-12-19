package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.model.g;
import com.ss.android.ugc.aweme.search.model.h;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import h.a.n;
import h.f.a.a;
import h.f.b.l;
import h.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class SummonFriendSearchModelV2 extends b<h> {
    private static final Companion Companion = new Companion(null);
    public static final int TOTAL_PARAMS_SIZE = 2;
    public boolean forceRefresh;
    private g lastRequest;
    private final h.h searchUserService$delegate = i.a((a) SummonFriendSearchModelV2$searchUserService$2.INSTANCE);

    static {
        Covode.recordClassIndex(61608);
    }

    public final ISearchUserService getSearchUserService() {
        return (ISearchUserService) this.searchUserService$delegate.getValue();
    }

    static final class Companion {
        static {
            Covode.recordClassIndex(61609);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(h.f.b.g gVar) {
            this();
        }
    }

    public final String getKeyword() {
        String str;
        g gVar = this.lastRequest;
        if (gVar == null || (str = gVar.f121532c) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void handleData(h hVar) {
        h hVar2;
        List<? extends e> list;
        List<String> list2;
        if (hVar != null) {
            if (this.mData == null) {
                this.mData = hVar;
            } else {
                h hVar3 = (h) this.mData;
                hVar3.f121537b = hVar.f121537b;
                hVar3.f121538c = hVar.f121538c;
                hVar3.f121539d = hVar.f121539d;
            }
            g gVar = this.lastRequest;
            if (gVar == null || (list2 = gVar.f121535f) == null || !list2.isEmpty()) {
                List<? extends e> list3 = hVar.f121536a;
                if (list3 != null) {
                    List<? extends e> list4 = null;
                    if ((!list3.isEmpty()) && (hVar2 = (h) this.mData) != null) {
                        h hVar4 = (h) this.mData;
                        if (!(hVar4 == null || (list = hVar4.f121536a) == null)) {
                            list4 = n.d((Collection) list, (Iterable) list3);
                        }
                        hVar2.f121536a = list4;
                        return;
                    }
                    return;
                }
                return;
            }
            h hVar5 = (h) this.mData;
            if (hVar5 != null) {
                hVar5.f121536a = hVar.f121536a;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        boolean z;
        l.d(objArr, "");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        Object safeGet = safeGet(objArr, 0);
        g gVar = null;
        if (!(safeGet instanceof Boolean)) {
            safeGet = null;
        }
        Boolean bool = (Boolean) safeGet;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.forceRefresh = z;
        Object safeGet2 = safeGet(objArr, 1);
        if (safeGet2 instanceof g) {
            gVar = safeGet2;
        }
        g gVar2 = gVar;
        if (gVar2 == null) {
            return false;
        }
        if (this.forceRefresh) {
            this.mIsLoading = false;
        }
        this.lastRequest = gVar2;
        com.bytedance.ies.e.a.a.a().a(this.mHandler, new SummonFriendSearchModelV2$sendRequest$1(this, gVar2), 0);
        return true;
    }

    private final <T> Object safeGet(T[] tArr, int i2) {
        if (i2 < tArr.length) {
            return tArr[i2];
        }
        return null;
    }
}
