package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public x f35625a;

    /* renamed from: b  reason: collision with root package name */
    private q f35626b;

    static {
        Covode.recordClassIndex(21281);
    }

    public final void a(String str) {
        this.f35625a.f35711b.invokeMethod(str);
    }

    public final void a(final i iVar) {
        if (this.f35626b != null) {
            l lVar = this.f35625a.f35713d;
            lVar.f35681j.remove(this.f35626b);
        }
        this.f35626b = new q() {
            /* class com.bytedance.ies.web.jsbridge2.an.AnonymousClass1 */

            static {
                Covode.recordClassIndex(21282);
            }

            @Override // com.bytedance.ies.web.jsbridge2.q
            public final void a(String str) {
            }

            @Override // com.bytedance.ies.web.jsbridge2.q
            public final void a(String str, String str2, int i2) {
                r.a(this, str, str2, i2);
            }

            @Override // com.bytedance.ies.web.jsbridge2.q
            public final void a(String str, String str2, int i2, String str3, al alVar) {
                r.b(this, str, str2, i2);
            }

            @Override // com.bytedance.ies.web.jsbridge2.q
            public final void b(String str, String str2, int i2) {
            }

            @Override // com.bytedance.ies.web.jsbridge2.q
            public final void a(w wVar, int i2) {
                iVar.a(wVar, i2);
            }

            @Override // com.bytedance.ies.web.jsbridge2.q
            public final void a(String str, al alVar) {
                a(str);
            }
        };
        this.f35625a.f35713d.b(this.f35626b);
    }
}
