package com.ss.android.ugc.aweme.share.improve.pkg;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.improve.c.c;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import f.a.d.f;
import f.a.d.g;
import f.a.n;
import f.a.o;
import f.a.q;
import h.f.b.l;
import h.z;

public class LinkDefaultSharePackage extends SharePackage {
    static {
        Covode.recordClassIndex(81385);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123964a;

        static {
            Covode.recordClassIndex(81389);
        }

        b(h.f.a.b bVar) {
            this.f123964a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b bVar = this.f123964a;
            l.b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkDefaultSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkDefaultSharePackage f123957a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f123958b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f123959c;

        static {
            Covode.recordClassIndex(81386);
        }

        a(LinkDefaultSharePackage linkDefaultSharePackage, com.ss.android.ugc.aweme.sharer.b bVar, String str) {
            this.f123957a = linkDefaultSharePackage;
            this.f123958b = bVar;
            this.f123959c = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            String a2 = this.f123958b.a();
            if (a2.hashCode() == 96619420 && a2.equals("email")) {
                return n.a((q) new q(this) {
                    /* class com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f123960a;

                    static {
                        Covode.recordClassIndex(81387);
                    }

                    {
                        this.f123960a = r1;
                    }

                    @Override // f.a.q
                    public final void a(o<h> oVar) {
                        l.d(oVar, "");
                        String str = str;
                        l.b(str, "");
                        oVar.a(new k(str, this.f123960a.f123957a.f124592f, this.f123960a.f123959c));
                    }
                });
            }
            return n.a((q) new q(this) {
                /* class com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f123962a;

                static {
                    Covode.recordClassIndex(81388);
                }

                {
                    this.f123962a = r1;
                }

                @Override // f.a.q
                public final void a(o<h> oVar) {
                    l.d(oVar, "");
                    String str = str;
                    l.b(str, "");
                    oVar.a(new k(str, this.f123962a.f123959c, null, 4));
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final void a(com.ss.android.ugc.aweme.sharer.b bVar, h.f.a.b<? super h, z> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        String a2 = com.ss.android.ugc.aweme.share.m.h.f124087a.a(bVar, this.f124590d, this.f124593g);
        if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
            c.b(this.f124594h, this.f124590d, bVar).a(new a(this, bVar, a2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new b(bVar2));
            return;
        }
        String a3 = c.a(this.f124594h, this.f124590d, bVar);
        String a4 = bVar.a();
        if (a4.hashCode() == 96619420 && a4.equals("email")) {
            bVar2.invoke(new k(a3, this.f124592f, a2));
        } else {
            bVar2.invoke(new k(a3, a2, null, 4));
        }
    }
}
