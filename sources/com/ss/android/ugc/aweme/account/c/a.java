package com.ss.android.ugc.aweme.account.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.common.m;
import java.util.ArrayList;
import java.util.List;

public class a<T extends b, K extends m> extends c<T, K> {

    /* renamed from: a  reason: collision with root package name */
    private List<Object> f62898a;

    static {
        Covode.recordClassIndex(38751);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public void c() {
        super.c();
        this.f62898a = null;
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public boolean a(Object... objArr) {
        this.f62898a = new ArrayList();
        for (Object obj : objArr) {
            this.f62898a.add(obj);
        }
        return super.a(objArr);
    }
}
