package com.ss.android.ugc.aweme.mediachoose.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.mediachoose.e;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.c;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import java.util.List;

public final class a extends com.bytedance.jedi.a.f.a<e, d, e, d> {
    static {
        Covode.recordClassIndex(70030);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a.a$a  reason: collision with other inner class name */
    static final class C2803a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f109332a;

        static {
            Covode.recordClassIndex(70031);
        }

        C2803a(e eVar) {
            this.f109332a = eVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<d> vVar) {
            l.d(vVar, "");
            c.f109414a.a(this.f109332a.f109353a, this.f109332a.f109354b, this.f109332a.f109355c, new e(this) {
                /* class com.ss.android.ugc.aweme.mediachoose.a.a.C2803a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2803a f109333a;

                static {
                    Covode.recordClassIndex(70032);
                }

                {
                    this.f109333a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.aweme.mediachoose.e
                public final void a(boolean z, int i2, List<MediaModel> list, d dVar) {
                    l.d(dVar, "");
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        if (list != null) {
                            vVar.a(new d(this.f109333a.f109332a, list));
                        } else {
                            vVar.a((Throwable) new IllegalStateException("query media failed"));
                        }
                        vVar.a();
                    }
                }
            });
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<d> a(e eVar) {
        e eVar2 = eVar;
        l.d(eVar2, "");
        t a2 = t.a(new C2803a(eVar2));
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }
}
