package com.ss.android.ugc.aweme.tools.music.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.c.b;
import com.ss.android.ugc.aweme.c.c;
import com.ss.android.ugc.aweme.c.d;
import com.ss.android.ugc.aweme.port.in.aa;
import f.a.t;

public final class e implements aa.i {

    /* renamed from: a  reason: collision with root package name */
    public static final e f140336a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static a f140337b;

    private e() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.i
    public final void c() {
        a aVar = f140337b;
        if (aVar != null) {
            aVar.e();
        }
    }

    static {
        Covode.recordClassIndex(91685);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.i
    public final t<String> a() {
        a aVar = f140337b;
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.i
    public final boolean b() {
        if (f140337b != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.i
    public final void d() {
        a aVar = f140337b;
        if (aVar != null) {
            aVar.f();
        }
        f140337b = null;
    }

    public final a b(com.ss.android.ugc.aweme.c.e eVar) {
        a(eVar);
        return f140337b;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.i
    public final void a(com.ss.android.ugc.aweme.c.e eVar) {
        a aVar;
        if (f140337b == null) {
            if (eVar instanceof d) {
                aVar = new d((d) eVar);
            } else if (eVar instanceof b) {
                aVar = new b((b) eVar);
            } else if (eVar instanceof c) {
                aVar = new c((c) eVar);
            } else {
                aVar = null;
            }
            f140337b = aVar;
        }
    }
}
