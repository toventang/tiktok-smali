package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class cy {

    /* renamed from: c  reason: collision with root package name */
    public static cy f118427c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f118428d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f118429a;

    /* renamed from: b  reason: collision with root package name */
    public final String f118430b;

    static {
        Covode.recordClassIndex(76922);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(76923);
        }

        private a() {
        }

        public static cy a() {
            cy cyVar = cy.f118427c;
            if (cyVar != null) {
                return cyVar;
            }
            if (aw.f118350a) {
                String a2 = cp.a();
                if (a2.length() > 0) {
                    cy cyVar2 = new cy(a2);
                    cy.f118427c = cyVar2;
                    return cyVar2;
                }
            }
            String a3 = cq.a();
            if (a3.length() > 0) {
                cy cyVar3 = new cy(a3);
                cy.f118427c = cyVar3;
                return cyVar3;
            }
            cy cyVar4 = new cy("");
            cy.f118427c = cyVar4;
            return cyVar4;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ cy(String str) {
        this(aw.f118350a, str);
    }

    private cy(boolean z, String str) {
        l.d(str, "");
        this.f118429a = z;
        this.f118430b = str;
    }
}
