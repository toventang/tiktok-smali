package com.ss.android.ugc.aweme.discover.mixfeed;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.a.a;
import com.bytedance.ies.ugc.aweme.network.a.b;

final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    private final i f81806a;

    /* renamed from: b  reason: collision with root package name */
    private final n f81807b;

    static {
        Covode.recordClassIndex(50808);
    }

    j(i iVar, n nVar) {
        this.f81806a = iVar;
        this.f81807b = nVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        i iVar2 = this.f81806a;
        n nVar = this.f81807b;
        iVar2.f81795d = System.currentTimeMillis();
        b bVar = (b) iVar.d();
        if (bVar != null) {
            bVar.a(new a<m>(nVar, iVar) {
                /* class com.ss.android.ugc.aweme.discover.mixfeed.i.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n f81797a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b.i f81798b;

                static {
                    Covode.recordClassIndex(50804);
                }

                @Override // com.bytedance.ies.ugc.aweme.network.a.a
                public final void a() {
                    i.this.f81794c.k();
                    if (!this.f81797a.y) {
                        i.this.mHandler.post(new l(this));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.ies.ugc.aweme.network.a.a
                public final /* synthetic */ void a(m mVar) {
                    m mVar2 = mVar;
                    if (i.this.f81792a == 4) {
                        return;
                    }
                    if (this.f81797a.y) {
                        i.this.f81794c.k();
                        return;
                    }
                    com.ss.android.ugc.aweme.search.l.i.b();
                    i.this.f81796e = System.currentTimeMillis();
                    mVar2.f81834l = true;
                    i.this.mHandler.post(new k(this, mVar2));
                }

                @Override // com.bytedance.ies.ugc.aweme.network.a.a
                public final void a(Throwable th) {
                    i.this.f81793b = true;
                    i.this.a(4);
                    i.this.f81794c.k();
                    if (!this.f81797a.y) {
                        if (th instanceof Exception) {
                            i.this.a((Exception) th, this.f81798b);
                            return;
                        }
                        i.this.a(this.f81798b.e(), this.f81798b);
                        i.this.f81249m = false;
                    }
                }

                {
                    this.f81797a = r2;
                    this.f81798b = r3;
                }
            });
        }
        return iVar;
    }
}
