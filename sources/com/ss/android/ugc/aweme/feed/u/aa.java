package com.ss.android.ugc.aweme.feed.u;

import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import java.util.HashMap;

public final class aa extends b<e<String, Integer>> {

    /* renamed from: a  reason: collision with root package name */
    public int f93968a;

    static {
        Covode.recordClassIndex(59765);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof HashMap)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        n.a().a(this.mHandler, new ab(this, objArr), 0);
        return true;
    }
}
