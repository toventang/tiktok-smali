package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.df.c;
import java.util.concurrent.Callable;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    static c.a f132564a;

    /* renamed from: b  reason: collision with root package name */
    public static final m f132565b = new m();

    private m() {
    }

    public static final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f132566a;

        static {
            Covode.recordClassIndex(86754);
        }

        @Override // com.ss.android.ugc.aweme.df.c.a
        public final void a() {
            i.b(new b(this.f132566a), i.f4824a);
        }

        @Override // com.ss.android.ugc.aweme.df.c.a
        public final void b() {
            i.b(new c(this.f132566a), i.f4824a);
        }

        a(h.f.a.a aVar) {
            this.f132566a = aVar;
        }
    }

    static {
        Covode.recordClassIndex(86753);
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f132567a;

        static {
            Covode.recordClassIndex(86755);
        }

        b(h.f.a.a aVar) {
            this.f132567a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(((g) this.f132567a.invoke()).u());
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f132568a;

        static {
            Covode.recordClassIndex(86756);
        }

        c(h.f.a.a aVar) {
            this.f132568a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(((g) this.f132568a.invoke()).t());
        }
    }
}
