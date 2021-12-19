package com.ss.android.ugc.aweme.sticker.d.a;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.p;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.d.b.c;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final ShortVideoContext f134745a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.b<com.ss.android.ugc.aweme.sticker.d.b.b<?>, z> f134746b;

    /* renamed from: c  reason: collision with root package name */
    private Object f134747c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f134748d;

    static {
        Covode.recordClassIndex(88073);
    }

    public static final class a implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.d.b.b f134750b;

        static {
            Covode.recordClassIndex(88074);
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(int i2) {
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.d.a.b$a$a  reason: collision with other inner class name */
        static final class CallableC3509a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f134751a;

            static {
                Covode.recordClassIndex(88075);
            }

            CallableC3509a(a aVar) {
                this.f134751a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f134751a.f134749a.f134746b.invoke(this.f134751a.f134750b);
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.d.a.b$a$b  reason: collision with other inner class name */
        static final class CallableC3510b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f134752a;

            static {
                Covode.recordClassIndex(88076);
            }

            CallableC3510b(a aVar) {
                this.f134752a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f134752a.f134749a.f134746b.invoke(this.f134752a.f134750b);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a() {
            q.a("download music strong beat " + this.f134749a.f134745a.f124762g);
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(String str) {
            l.d(str, "");
            i.b(new CallableC3510b(this), i.f4826c);
            q.a("download music strong beat success " + this.f134749a.f134745a.f124762g);
        }

        a(b bVar, com.ss.android.ugc.aweme.sticker.d.b.b bVar2) {
            this.f134749a = bVar;
            this.f134750b = bVar2;
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(Integer num, String str) {
            i.b(new CallableC3509a(this), i.f4826c);
            q.a("download music strong beat failure " + this.f134749a.f134745a.f124762g + ", err " + str);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.a.d
    public final <T> boolean a(com.ss.android.ugc.aweme.sticker.d.b.b<T> bVar) {
        String str;
        l.d(bVar, "");
        if ((!l.a(this.f134747c, bVar)) && (bVar instanceof c)) {
            c cVar = (c) bVar;
            if (cVar.f134767a.getTags() == null) {
                return false;
            }
            List<String> tags = cVar.f134767a.getTags();
            if (tags == null) {
                l.b();
            }
            if (!(!tags.contains("strong_beat") || (str = this.f134745a.f124762g) == null || str.length() == 0 || this.f134745a.f124766k == null || com.ss.android.ugc.tools.utils.i.a(g.a().s().a(this.f134745a.f124757b.e())))) {
                this.f134747c = bVar;
                p s = g.a().s();
                Context context = this.f134748d;
                String str2 = this.f134745a.f124762g;
                l.b(str2, "");
                UrlModel urlModel = this.f134745a.f124766k;
                l.b(urlModel, "");
                s.a(context, str2, urlModel, new a(this, bVar));
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.sticker.d.b.b<?>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, ShortVideoContext shortVideoContext, h.f.a.b<? super com.ss.android.ugc.aweme.sticker.d.b.b<?>, z> bVar) {
        l.d(context, "");
        l.d(shortVideoContext, "");
        l.d(bVar, "");
        this.f134748d = context;
        this.f134745a = shortVideoContext;
        this.f134746b = bVar;
    }
}
