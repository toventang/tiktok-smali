package com.ss.android.ugc.aweme.request_combine.request.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.b;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.List;

public final class a implements r {

    /* renamed from: a  reason: collision with root package name */
    public final aa f120630a;

    static {
        Covode.recordClassIndex(78556);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return this.f120630a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.a$a  reason: collision with other inner class name */
    public static final class C3115a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f120631a;

        static {
            Covode.recordClassIndex(78557);
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.b
        public final void a() {
            if (this.f120631a.f120630a == aa.NORMAL) {
                c.b(new com.ss.android.ugc.aweme.journey.b());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3115a(a aVar) {
            this.f120631a = aVar;
        }
    }

    public a(aa aaVar) {
        l.d(aaVar, "");
        this.f120630a = aaVar;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        com.ss.android.ugc.aweme.compliance.api.a.j().a(new C3115a(this));
    }
}
