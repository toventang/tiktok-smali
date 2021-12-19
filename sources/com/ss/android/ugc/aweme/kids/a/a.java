package com.ss.android.ugc.aweme.kids.a;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class a implements com.ss.android.ugc.aweme.kids.a.g.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.kids.a.g.a f105235a;

    static {
        Covode.recordClassIndex(67466);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.a$a  reason: collision with other inner class name */
    static final class CallableC2690a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105236a;

        static {
            Covode.recordClassIndex(67467);
        }

        CallableC2690a(a aVar) {
            this.f105236a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f105236a.f105235a.b();
            return z.f158842a;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.b.a f105238b;

        static {
            Covode.recordClassIndex(67468);
        }

        b(a aVar, com.ss.android.ugc.aweme.kids.b.a aVar2) {
            this.f105237a = aVar;
            this.f105238b = aVar2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f105237a.f105235a.a(this.f105238b);
            return z.f158842a;
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f105240b;

        static {
            Covode.recordClassIndex(67469);
        }

        c(a aVar, int i2) {
            this.f105239a = aVar;
            this.f105240b = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f105239a.f105235a.a(this.f105240b);
            return z.f158842a;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105241a;

        static {
            Covode.recordClassIndex(67470);
        }

        d(a aVar) {
            this.f105241a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f105241a.f105235a.a();
            return z.f158842a;
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f105242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f105243b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MusicWaveBean f105244c;

        static {
            Covode.recordClassIndex(67471);
        }

        e(a aVar, String str, MusicWaveBean musicWaveBean) {
            this.f105242a = aVar;
            this.f105243b = str;
            this.f105244c = musicWaveBean;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f105242a.f105235a.a(this.f105243b, this.f105244c);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.a
    public final void a() {
        i.b(new d(this), i.f4826c);
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.a
    public final void b() {
        i.b(new CallableC2690a(this), i.f4826c);
    }

    public a(com.ss.android.ugc.aweme.kids.a.g.a aVar) {
        l.d(aVar, "");
        this.f105235a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.a
    public final void a(int i2) {
        i.b(new c(this, i2), i.f4826c);
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.a
    public final void a(com.ss.android.ugc.aweme.kids.b.a aVar) {
        l.d(aVar, "");
        i.b(new b(this, aVar), i.f4826c);
    }

    @Override // com.ss.android.ugc.aweme.kids.a.g.a
    public final void a(String str, MusicWaveBean musicWaveBean) {
        l.d(str, "");
        i.b(new e(this, str, musicWaveBean), i.f4826c);
    }
}
