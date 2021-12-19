package com.ss.android.ugc.aweme.detail.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.f.b.l;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class g extends b<Aweme> {
    static {
        Covode.recordClassIndex(49581);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f79775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f79776b;

        static {
            Covode.recordClassIndex(49582);
        }

        a(String str, String str2) {
            this.f79775a = str;
            this.f79776b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return GsonHolder.c().b().a(new JSONObject((String) DetailApi.f79607a.queryAwemeFromInbox(this.f79775a, this.f79776b).execute().f42630b).optString("data"), Aweme.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        l.d(objArr, "");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        n.a().a(this.mHandler, new a((String) objArr[0], (String) objArr[1]), 0);
        return true;
    }
}
