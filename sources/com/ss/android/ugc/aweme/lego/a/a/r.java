package com.ss.android.ugc.aweme.lego.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public abstract class r implements com.ss.android.ugc.e.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f107360a;

    /* renamed from: c  reason: collision with root package name */
    public final ThreadLocal<List<com.ss.android.ugc.aweme.lego.r>> f107361c = new a();

    static {
        Covode.recordClassIndex(68715);
    }

    @Override // com.ss.android.ugc.e.a
    public void a() {
        this.f107360a = true;
    }

    @Override // com.ss.android.ugc.e.a
    public final void a(n nVar) {
        l.d(nVar, "");
    }

    @Override // com.ss.android.ugc.e.a
    public final n b(n nVar) {
        l.d(nVar, "");
        return nVar;
    }

    @Override // com.ss.android.ugc.e.a
    public final void b() {
        this.f107360a = false;
    }

    public static final class a extends ThreadLocal<List<com.ss.android.ugc.aweme.lego.r>> {
        static {
            Covode.recordClassIndex(68716);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ List<com.ss.android.ugc.aweme.lego.r> initialValue() {
            return new ArrayList();
        }
    }
}
