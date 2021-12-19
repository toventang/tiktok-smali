package com.ss.android.ugc.aweme.shortvideo.page.linkanchor;

import androidx.lifecycle.ac;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.shortvideo.page.linkanchor.b;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import kotlinx.coroutines.bs;

public final class LinkAnchorViewModel extends ac {

    /* renamed from: f  reason: collision with root package name */
    public static final a f129577f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final t<String> f129578a;

    /* renamed from: b  reason: collision with root package name */
    public final t<c> f129579b;

    /* renamed from: c  reason: collision with root package name */
    public final t<String> f129580c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    final t<Boolean> f129581d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f129582e;

    /* renamed from: g  reason: collision with root package name */
    private final h f129583g = i.a((h.f.a.a) b.f129587a);

    static {
        Covode.recordClassIndex(85055);
    }

    public final f.a.b.a a() {
        return (f.a.b.a) this.f129583g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85059);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f129587a = new b();

        static {
            Covode.recordClassIndex(85060);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        a().dispose();
    }

    public LinkAnchorViewModel() {
        t<String> tVar = new t<>();
        this.f129578a = tVar;
        t<c> tVar2 = new t<>();
        this.f129579b = tVar2;
        tVar.setValue("");
        tVar2.setValue(c.INITIAL);
        bs bsVar = bs.f159054a;
        l.d(tVar, "");
        l.d(bsVar, "");
        r rVar = new r();
        z.e eVar = new z.e();
        eVar.element = null;
        rVar.a(tVar, new b.a(eVar, rVar, tVar, tVar, bsVar));
        rVar.observeForever(new u(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorViewModel.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LinkAnchorViewModel f129584a;

            static {
                Covode.recordClassIndex(85056);
            }

            {
                this.f129584a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                String str = (String) obj;
                if (this.f129584a.f129582e) {
                    this.f129584a.f129579b.setValue(c.VALIDATING);
                    this.f129584a.a().a();
                    f.a.b.a a2 = this.f129584a.a();
                    Object a3 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(AnchorLinkValidateApi.class);
                    l.b(a3, "");
                    int type = ab.NEWS.getTYPE();
                    l.b(str, "");
                    a2.a(((AnchorLinkValidateApi) a3).validate(type, str).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).b(f.a.e.b.a.f157195h).b(new f(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorViewModel.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f129585a;

                        static {
                            Covode.recordClassIndex(85057);
                        }

                        {
                            this.f129585a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            this.f129585a.f129584a.f129579b.setValue(c.INVALID);
                        }
                    }).e(new f(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorViewModel.AnonymousClass1.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f129586a;

                        static {
                            Covode.recordClassIndex(85058);
                        }

                        {
                            this.f129586a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            d dVar = (d) obj;
                            if (dVar.f129596a != 0) {
                                this.f129586a.f129584a.f129579b.setValue(c.INVALID);
                                this.f129586a.f129584a.f129580c.setValue(dVar.f129597b);
                                return;
                            }
                            this.f129586a.f129584a.f129579b.setValue(c.VALIDATED);
                        }
                    }));
                }
            }
        });
    }
}
