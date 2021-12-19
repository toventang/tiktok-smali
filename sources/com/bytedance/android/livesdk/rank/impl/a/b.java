package com.bytedance.android.livesdk.rank.impl.a;

import androidx.recyclerview.widget.j;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import f.a.t;
import j.a.a.f;
import java.util.ArrayList;
import java.util.List;

public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private a f20632a;

    /* renamed from: d  reason: collision with root package name */
    private List<?> f20633d = new ArrayList();

    static {
        Covode.recordClassIndex(12185);
    }

    @Override // j.a.a.f
    public final void a(List list) {
        if (list != null) {
            a aVar = new a(this.f20633d, list);
            this.f20632a = aVar;
            t.b(j.a(aVar, true)).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new c(this, list), d.f20636a);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(List list, j.d dVar) {
        super.a(list);
        try {
            dVar.a(this);
        } catch (Exception e2) {
            i.b();
            a.a(6, "ttlive_exception", e2.getStackTrace());
        }
        this.f20633d.clear();
        this.f20633d.addAll(list);
    }
}
