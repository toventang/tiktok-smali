package com.ss.android.ugc.aweme.question.g;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.google.c.h.a.l;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.question.c;
import com.ss.android.ugc.aweme.translation.api.TranslationApi;
import java.util.Collection;
import java.util.List;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final c f119984a;

    /* renamed from: b  reason: collision with root package name */
    private final a f119985b;

    static {
        Covode.recordClassIndex(77939);
    }

    public final void run() {
        try {
            l.a(TranslationApi.a(this.f119985b.f119971b, new f().b(this.f119985b.f119970a), 4), new a(this), m.f68150a);
        } catch (Exception e2) {
            e2.printStackTrace();
            a(new Exception());
        }
    }

    public static final class a implements k<com.ss.android.ugc.aweme.translation.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f119986a;

        static {
            Covode.recordClassIndex(77940);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.f119986a = dVar;
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            h.f.b.l.d(th, "");
            this.f119986a.a(th);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.c.h.a.k
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.translation.a.a aVar) {
            List<com.ss.android.ugc.aweme.translation.a.c> list;
            com.ss.android.ugc.aweme.translation.a.c cVar;
            com.ss.android.ugc.aweme.translation.a.a aVar2 = aVar;
            if (aVar2 != null) {
                list = aVar2.f141008a;
            } else {
                list = null;
            }
            if (!b.a((Collection) list) && list != null && (cVar = list.get(0)) != null) {
                d dVar = this.f119986a;
                CommentService e2 = CommentServiceImpl.e();
                String str = cVar.f141015a;
                h.f.b.l.b(str, "");
                dVar.f119984a.setContent(e2.b(str));
                this.f119986a.f119984a.setTranslated(true);
                c.a().a(this.f119986a.f119984a, false);
                c a2 = c.a();
                c cVar2 = this.f119986a.f119984a;
                if (cVar2 != null) {
                    a2.f119980a.put(cVar2.getId().toString(), cVar2.clone());
                }
                com.ss.android.ugc.aweme.arch.widgets.base.c<b> a3 = c.a().a(String.valueOf(this.f119986a.f119984a.getId()));
                h.f.b.l.b(a3, "");
                a3.setValue(new b(this.f119986a.f119984a, true));
            }
        }
    }

    public final void a(Throwable th) {
        c.a().a(this.f119984a, false);
        b bVar = new b(this.f119984a, false);
        if (th instanceof Exception) {
            bVar.f119978c = (Exception) th;
        }
        com.ss.android.ugc.aweme.arch.widgets.base.c<b> a2 = c.a().a(String.valueOf(this.f119984a.getId()));
        h.f.b.l.b(a2, "");
        a2.setValue(bVar);
    }

    public d(c cVar, a aVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(aVar, "");
        this.f119984a = cVar;
        this.f119985b = aVar;
    }
}
