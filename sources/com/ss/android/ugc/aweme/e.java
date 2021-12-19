package com.ss.android.ugc.aweme;

import android.os.Bundle;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a;
import h.a.n;
import java.util.ArrayList;
import java.util.Collection;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f84181a;

    static {
        Covode.recordClassIndex(52495);
    }

    public e(Bundle bundle) {
        this.f84181a = bundle;
    }

    @Override // b.g
    public final Object then(i iVar) {
        Bundle bundle = this.f84181a;
        ArrayList arrayList = new ArrayList();
        i.a(bundle, arrayList);
        i.c(bundle, arrayList);
        i.d(bundle, arrayList);
        i.b(bundle, arrayList);
        a.C1369a.a(n.g((Collection) arrayList));
        a.C1369a.a();
        a.C1369a.a(bundle);
        return iVar.d();
    }
}
