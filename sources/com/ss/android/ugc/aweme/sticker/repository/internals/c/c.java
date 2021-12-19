package com.ss.android.ugc.aweme.sticker.repository.internals.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.tools.b.a.d;
import f.a.t;
import f.a.v;
import f.a.w;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.List;

public final class c extends com.bytedance.jedi.a.f.a<z, d, d, List<? extends String>> {

    /* renamed from: a  reason: collision with root package name */
    public final String f135554a;

    /* renamed from: b  reason: collision with root package name */
    public final d f135555b;

    static {
        Covode.recordClassIndex(88591);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return z.f158842a;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<List<? extends String>> a(d dVar) {
        d dVar2 = dVar;
        l.d(dVar2, "");
        t a2 = t.a(new a(this, dVar2));
        l.b(a2, "");
        return a2;
    }

    static final class a<T> implements w<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f135556a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f135557b;

        static {
            Covode.recordClassIndex(88592);
        }

        a(c cVar, d dVar) {
            this.f135556a = cVar;
            this.f135557b = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.v<java.util.List<java.lang.String>>] */
        @Override // f.a.w
        public final void subscribe(final v<List<? extends String>> vVar) {
            l.d(vVar, "");
            this.f135556a.f135555b.a(this.f135556a.f135554a, n.a(this.f135557b.f135559a.getEffectId()), this.f135557b.f135560b, new IModFavoriteList() {
                /* class com.ss.android.ugc.aweme.sticker.repository.internals.c.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88593);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
                public final void onFail(ExceptionResult exceptionResult) {
                    l.d(exceptionResult, "");
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.a((Throwable) exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(List<String> list) {
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (vVar.isDisposed()) {
                        return;
                    }
                    if (list != null) {
                        vVar.a(list);
                        vVar.a();
                        return;
                    }
                    vVar.a((Throwable) new IllegalArgumentException("modify favorite sticker failed"));
                }
            });
        }
    }

    public c(String str, d dVar) {
        l.d(str, "");
        l.d(dVar, "");
        this.f135554a = str;
        this.f135555b = dVar;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj;
    }
}
