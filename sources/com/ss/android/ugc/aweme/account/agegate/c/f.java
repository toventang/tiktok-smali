package com.ss.android.ugc.aweme.account.agegate.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.e;
import com.bytedance.sdk.a.h.a.p;
import com.ss.android.ugc.aweme.account.login.u;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.cj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f62759a;

    /* renamed from: b  reason: collision with root package name */
    public final h f62760b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f62761c;

    /* renamed from: d  reason: collision with root package name */
    public final String f62762d;

    static {
        Covode.recordClassIndex(38668);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(38669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            u.a(true, this.this$0.f62762d, null);
            this.this$0.f62760b.e();
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<String, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(38670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2;
            String str3 = str;
            String str4 = this.this$0.f62762d;
            if (str3 == null) {
                str2 = "response is null";
            } else {
                str2 = str3;
            }
            u.a(false, str4, str2);
            if (str3 == null || str3.length() == 0) {
                this.this$0.f62760b.a(Integer.valueOf((int) R.string.da_));
            } else {
                this.this$0.f62760b.a(str3);
            }
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.sdk.a.a.a.d<p>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(38671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.sdk.a.a.a.d<p> dVar) {
            final com.bytedance.sdk.a.a.a.d<p> dVar2 = dVar;
            u.a(true, this.this$0.f62762d, dVar2, "");
            if (this.this$0.f62761c) {
                q.c(false);
            }
            com.ss.android.ugc.aweme.compliance.api.a.q().a(true, new Runnable(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.c.f.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f62763a;

                static {
                    Covode.recordClassIndex(38672);
                }

                {
                    this.f62763a = r1;
                }

                public final void run() {
                    com.bytedance.sdk.a.n.a aVar;
                    p pVar;
                    com.bytedance.sdk.a.a.a.d dVar = dVar2;
                    if (dVar == null || (pVar = (p) dVar.f43081j) == null) {
                        aVar = null;
                    } else {
                        aVar = pVar.f43318c;
                    }
                    cj.a(aVar);
                    this.f62763a.this$0.f62760b.g();
                }
            });
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.sdk.a.a.a.d<p>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(38673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.sdk.a.a.a.d<p> dVar) {
            String str;
            String str2;
            com.bytedance.sdk.a.a.a.d<p> dVar2 = dVar;
            String str3 = this.this$0.f62762d;
            String str4 = null;
            if (dVar2 != null) {
                str = dVar2.f43075f;
            } else {
                str = null;
            }
            u.a(false, str3, dVar2, str);
            if (dVar2 == null || (str2 = dVar2.f43075f) == null || str2.length() == 0) {
                this.this$0.f62760b.a(Integer.valueOf((int) R.string.da_));
            } else {
                h hVar = this.this$0.f62760b;
                if (dVar2 != null) {
                    str4 = dVar2.f43075f;
                }
                hVar.a(str4);
            }
            return z.f158842a;
        }
    }

    public f(h hVar, boolean z, e eVar, String str) {
        l.d(hVar, "");
        l.d(eVar, "");
        l.d(str, "");
        this.f62760b = hVar;
        this.f62761c = z;
        this.f62762d = str;
        this.f62759a = new e(eVar);
    }
}
