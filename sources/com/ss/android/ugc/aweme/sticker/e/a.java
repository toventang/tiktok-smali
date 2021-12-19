package com.ss.android.ugc.aweme.sticker.e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.h;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.aweme.sticker.repository.a.ac;
import com.ss.android.ugc.aweme.sticker.repository.a.l;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.c.a;
import f.a.d.g;
import java.util.List;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f134795a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f134796b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.b.a f134797c = new f.a.b.a();

    /* renamed from: d  reason: collision with root package name */
    final boolean f134798d;

    /* renamed from: e  reason: collision with root package name */
    final l f134799e;

    static {
        Covode.recordClassIndex(88118);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.a$a  reason: collision with other inner class name */
    public static final class CallableC3512a<V> implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f134801b;

        static {
            Covode.recordClassIndex(88119);
        }

        public CallableC3512a(a aVar, Effect effect) {
            this.f134800a = aVar;
            this.f134801b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Boolean call() {
            List<String> urlList;
            UrlModel hintIcon = this.f134801b.getHintIcon();
            boolean z = true;
            String str = null;
            if (!(hintIcon == null || (urlList = hintIcon.getUrlList()) == null || urlList.isEmpty())) {
                str = urlList.get(0);
            }
            if (TextUtils.isEmpty(str) || com.ss.android.ugc.tools.c.a.a(Uri.parse(str))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class b<T, R> implements g<Throwable, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134802a = new b();

        static {
            Covode.recordClassIndex(88120);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ Boolean apply(Throwable th) {
            h.f.b.l.d(th, "");
            return true;
        }
    }

    static final class e<T> implements f.a.d.f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f134810b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f134811c;

        static {
            Covode.recordClassIndex(88123);
        }

        e(a aVar, Effect effect, c.a aVar2) {
            this.f134809a = aVar;
            this.f134810b = effect;
            this.f134811c = aVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f134809a.f134795a = false;
            this.f134811c.a(this.f134810b, new ExceptionResult(new Exception(th)));
        }
    }

    public static final class f implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f134813b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f134814c;

        static {
            Covode.recordClassIndex(88124);
        }

        @Override // com.ss.android.ugc.tools.c.a.b
        public final void a(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
            h.f.b.l.d(cVar, "");
            this.f134812a.f134796b = true;
            this.f134812a.a(this.f134813b, this.f134814c);
        }

        @Override // com.ss.android.ugc.tools.c.a.b
        public final void a(Exception exc) {
            h.f.b.l.d(exc, "");
            this.f134812a.f134796b = true;
            this.f134812a.a(this.f134813b, this.f134814c);
        }

        f(a aVar, Effect effect, c.a aVar2) {
            this.f134812a = aVar;
            this.f134813b = effect;
            this.f134814c = aVar2;
        }
    }

    public static final class c<T> implements f.a.d.f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f134804b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f134805c;

        static {
            Covode.recordClassIndex(88121);
        }

        public c(a aVar, Effect effect, c.a aVar2) {
            this.f134803a = aVar;
            this.f134804b = effect;
            this.f134805c = aVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f134803a.f134796b = true;
            }
            a aVar = this.f134803a;
            Effect effect = this.f134804b;
            c.a aVar2 = this.f134805c;
            boolean z = aVar.f134798d;
            if ((!com.ss.android.ugc.aweme.sticker.p.g.r(effect) || (h.b(effect.getEffectId()) == null && aVar.f134799e.a(effect))) && z) {
                aVar.f134795a = true;
            }
            if (!aVar.a(effect, aVar2)) {
                if (!aVar.f134795a) {
                    f.a.b.b a2 = com.ss.android.ugc.aweme.sticker.repository.internals.b.g.a(aVar.f134799e, effect, false, true).a(f.a.a.b.a.a()).a(new d(aVar, effect, aVar2), new e(aVar, effect, aVar2));
                    h.f.b.l.b(a2, "");
                    f.a.j.a.a(a2, aVar.f134797c);
                }
                if (!aVar.f134796b) {
                    com.ss.android.ugc.tools.c.a.a(com.ss.android.ugc.aweme.effectplatform.a.a(effect.getHintIcon()), new f(aVar, effect, aVar2));
                }
            }
        }
    }

    static final class d<T> implements f.a.d.f<com.ss.android.ugc.tools.h.a.d<ac, Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134806a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f134807b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f134808c;

        static {
            Covode.recordClassIndex(88122);
        }

        d(a aVar, Effect effect, c.a aVar2) {
            this.f134806a = aVar;
            this.f134807b = effect;
            this.f134808c = aVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.tools.h.a.d<ac, Effect> dVar) {
            com.ss.android.ugc.tools.h.a.d<ac, Effect> dVar2 = dVar;
            int i2 = b.f134815a[dVar2.f149207a.ordinal()];
            if (i2 != 1) {
                int i3 = 0;
                if (i2 == 2) {
                    this.f134806a.f134795a = false;
                    c.a aVar = this.f134808c;
                    Effect effect = this.f134807b;
                    Integer num = dVar2.f149211e;
                    if (num != null) {
                        i3 = num.intValue();
                    }
                    aVar.a(effect, i3);
                } else if (i2 == 3) {
                    this.f134806a.f134795a = true;
                    this.f134806a.a(this.f134807b, this.f134808c);
                } else if (i2 == 4) {
                    this.f134806a.f134795a = false;
                    this.f134808c.a(this.f134807b, new ExceptionResult(dVar2.f149210d));
                }
            } else {
                this.f134808c.c(this.f134807b);
            }
        }
    }

    public final boolean a(Effect effect, c.a aVar) {
        if (!this.f134795a || !this.f134796b) {
            return false;
        }
        aVar.b(effect);
        return true;
    }

    public a(boolean z, l lVar) {
        h.f.b.l.d(lVar, "");
        this.f134798d = z;
        this.f134799e = lVar;
    }
}
