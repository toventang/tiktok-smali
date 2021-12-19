package com.ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.d;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import f.a.t;
import f.a.w;
import f.a.z;
import h.f.b.l;

public abstract class h extends a {
    private final SmartImageView u;
    private final SmartImageView v;

    static {
        Covode.recordClassIndex(73799);
    }

    public void a(v vVar) {
        l.d(vVar, "");
    }

    public static final class c implements z<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f114669a;

        static {
            Covode.recordClassIndex(73803);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(h hVar) {
            this.f114669a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(String str) {
            l.d(str, "");
            this.f114669a.f114589j = true;
            h.f.a.a<h.z> aVar = this.f114669a.s.f114674e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f114664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UrlModel f114665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SmartImageView f114666c;

        static {
            Covode.recordClassIndex(73800);
        }

        a(h hVar, UrlModel urlModel, SmartImageView smartImageView) {
            this.f114664a = hVar;
            this.f114665b = urlModel;
            this.f114666c = smartImageView;
        }

        @Override // f.a.w
        public final void subscribe(final f.a.v<String> vVar) {
            l.d(vVar, "");
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(this.f114665b));
            h hVar = this.f114664a;
            l.b(a2, "");
            hVar.a(a2);
            a2.E = this.f114666c;
            a2.a("NewPendant").a(new d() {
                /* class com.ss.android.ugc.aweme.pendant.h.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(73801);
                }

                @Override // com.bytedance.lighten.a.c.d, com.bytedance.lighten.a.c.k
                public final void a(Uri uri, View view) {
                    l.d(uri, "");
                }

                @Override // com.bytedance.lighten.a.c.k
                public final void a(Uri uri, View view, Throwable th) {
                    l.d(uri, "");
                    f.a.v vVar = vVar;
                    l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        f.a.v vVar2 = vVar;
                        if (th == null) {
                            l.b();
                        }
                        vVar2.a(th);
                    }
                }

                @Override // com.bytedance.lighten.a.c.k
                public final void a(Uri uri, View view, o oVar, Animatable animatable) {
                    f.a.v vVar = vVar;
                    l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.a((Object) "");
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.n
    public void a(k kVar) {
        l.d(kVar, "");
        com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel = kVar.f114708d;
        com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel2 = kVar.f114709e;
        if (urlModel != null && urlModel2 != null) {
            t<String> a2 = a(this.u, urlModel);
            t<String> a3 = a(this.v, urlModel2);
            if (a2 != null && a3 != null) {
                t.a(a2, a3, b.f114668a).b((z) new c(this));
                this.u.getDrawable().setVisible(true, false);
                this.v.getDrawable().setVisible(true, false);
            }
        }
    }

    static final class b<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114668a = new b();

        static {
            Covode.recordClassIndex(73802);
        }

        b() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            l.d(str, "");
            l.d(str2, "");
            return str + str2;
        }
    }

    private final t<String> a(SmartImageView smartImageView, com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel) {
        UrlModel urlModel2 = new UrlModel();
        try {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(urlModel.getUrlList());
            t<String> a2 = t.a(new a(this, urlModel2, smartImageView)).a(3);
            l.b(a2, "");
            return a2;
        } catch (com.bytedance.ies.a unused) {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, View view3, i iVar) {
        super(context, view, smartImageView, smartImageView2, view2, view3, iVar);
        l.d(context, "");
        l.d(view, "");
        l.d(smartImageView, "");
        l.d(smartImageView2, "");
        l.d(view2, "");
        l.d(view3, "");
        l.d(iVar, "");
        this.u = smartImageView;
        this.v = smartImageView2;
    }
}
