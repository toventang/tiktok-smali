package com.ss.android.ugc.aweme.choosemusic.model.a;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.model.ah;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.z;

public final class b extends com.bytedance.jedi.a.f.a<e, d, e, d> {
    static {
        Covode.recordClassIndex(43531);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<d> a(e eVar) {
        e eVar2 = eVar;
        l.d(eVar2, "");
        t a2 = t.a(new a(eVar2));
        l.b(a2, "");
        return a2;
    }

    static final class a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70587a;

        static {
            Covode.recordClassIndex(43532);
        }

        a(e eVar) {
            this.f70587a = eVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<d> vVar) {
            l.d(vVar, "");
            ChooseMusicApi.a(Integer.valueOf(this.f70587a.f70598a), this.f70587a.f70599b, this.f70587a.f70600c, this.f70587a.f70601d).a(new g(this) {
                /* class com.ss.android.ugc.aweme.choosemusic.model.a.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f70588a;

                static {
                    Covode.recordClassIndex(43533);
                }

                {
                    this.f70588a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // b.g
                public final /* synthetic */ Object then(i iVar) {
                    l.b(iVar, "");
                    if (iVar.a()) {
                        v vVar = vVar;
                        e eVar = this.f70588a.f70587a;
                        Object d2 = iVar.d();
                        l.b(d2, "");
                        vVar.a(new d(eVar, (ah) d2));
                    } else if (iVar.b()) {
                        vVar.a((Throwable) new IllegalStateException("query music canceled: " + this.f70588a.f70587a));
                    } else if (iVar.c()) {
                        vVar.a((Throwable) new IllegalStateException("query music faulted: " + this.f70588a.f70587a));
                    } else {
                        vVar.a((Throwable) new IllegalStateException("query music unknown: " + this.f70588a.f70587a));
                    }
                    vVar.a();
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }
}
