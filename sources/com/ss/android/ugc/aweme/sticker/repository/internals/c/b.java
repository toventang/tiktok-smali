package com.ss.android.ugc.aweme.sticker.repository.internals.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.z;

public final class b extends d<z, FetchFavoriteListResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final String f135550a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.tools.b.a.d f135551b;

    static {
        Covode.recordClassIndex(88588);
    }

    static final class a<T> implements w<FetchFavoriteListResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f135552a;

        static {
            Covode.recordClassIndex(88589);
        }

        a(b bVar) {
            this.f135552a = bVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<FetchFavoriteListResponse> vVar) {
            l.d(vVar, "");
            this.f135552a.f135551b.a(this.f135552a.f135550a, new IFetchFavoriteList() {
                /* class com.ss.android.ugc.aweme.sticker.repository.internals.c.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88590);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList
                public final void onFailed(ExceptionResult exceptionResult) {
                    l.d(exceptionResult, "");
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.a((Throwable) exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (vVar.isDisposed()) {
                        return;
                    }
                    if (fetchFavoriteListResponse != null) {
                        vVar.a(fetchFavoriteListResponse);
                        vVar.a();
                        return;
                    }
                    vVar.a((Throwable) new IllegalArgumentException("favorite list fetching failed"));
                }
            });
        }
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        l.d(obj, "");
        t a2 = t.a(new a(this));
        l.b(a2, "");
        return a2;
    }

    public b(String str, com.ss.android.ugc.tools.b.a.d dVar) {
        l.d(str, "");
        l.d(dVar, "");
        this.f135550a = str;
        this.f135551b = dVar;
    }
}
