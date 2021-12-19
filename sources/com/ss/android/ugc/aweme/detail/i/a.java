package com.ss.android.ugc.aweme.detail.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

public final class a extends b<com.ss.android.ugc.aweme.detail.g.a> {

    /* renamed from: a  reason: collision with root package name */
    public int f79768a;

    static {
        Covode.recordClassIndex(49574);
    }

    public a(int i2) {
        this.f79768a = i2;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.detail.i.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(49575);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                Object[] objArr = objArr;
                String str2 = "";
                if (objArr.length <= 1 || objArr[1] == null) {
                    str = str2;
                } else {
                    str = (String) objArr[1];
                }
                if (objArr.length > 2 && objArr[2] != null) {
                    str2 = (String) objArr[2];
                }
                return DetailApi.a((String) objArr[0], str, str2, 0);
            }
        }, 0);
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(com.ss.android.ugc.aweme.detail.g.a aVar) {
        com.ss.android.ugc.aweme.detail.g.a aVar2 = aVar;
        if (aVar2 == null || aVar2.f79632a == null) {
            com.ss.android.ugc.aweme.framework.a.a.a(6, "BatchDetailModel", "data is null or items null!");
            return;
        }
        super.handleData(aVar2);
        int size = aVar2.f79632a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Aweme a2 = AwemeService.b().a(aVar2.f79632a.get(i2));
            String str = aVar2.f79633b;
            if (TextUtils.isEmpty(str) && aVar2.f79634c != null) {
                str = aVar2.f79634c.getImprId();
            }
            RequestIdService.a().a(a2.getAid() + this.f79768a, str, i2);
            aVar2.f79632a.set(i2, a2);
        }
    }
}
