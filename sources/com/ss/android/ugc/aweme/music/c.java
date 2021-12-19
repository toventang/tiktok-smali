package com.ss.android.ugc.aweme.music;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class c implements com.ss.android.ugc.aweme.music.service.b {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.music.service.b f111377a;

    static {
        Covode.recordClassIndex(71560);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f111378a;

        static {
            Covode.recordClassIndex(71561);
        }

        a(c cVar) {
            this.f111378a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f111378a.f111377a.a();
            return z.f158842a;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f111379a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.musicprovider.a f111380b;

        static {
            Covode.recordClassIndex(71562);
        }

        b(c cVar, com.ss.android.ugc.musicprovider.a aVar) {
            this.f111379a = cVar;
            this.f111380b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f111379a.f111377a.a(this.f111380b);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$c  reason: collision with other inner class name */
    static final class CallableC2852c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f111381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f111382b;

        static {
            Covode.recordClassIndex(71563);
        }

        CallableC2852c(c cVar, int i2) {
            this.f111381a = cVar;
            this.f111382b = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f111381a.f111377a.a(this.f111382b);
            return z.f158842a;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f111383a;

        static {
            Covode.recordClassIndex(71564);
        }

        d(c cVar) {
            this.f111383a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f111383a.f111377a.b();
            return z.f158842a;
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f111384a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f111385b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MusicWaveBean f111386c;

        static {
            Covode.recordClassIndex(71565);
        }

        e(c cVar, String str, MusicWaveBean musicWaveBean) {
            this.f111384a = cVar;
            this.f111385b = str;
            this.f111386c = musicWaveBean;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f111384a.f111377a.a(this.f111385b, this.f111386c);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void a() {
        i.b(new a(this), i.f4826c);
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void b() {
        i.b(new d(this), i.f4826c);
    }

    public c(com.ss.android.ugc.aweme.music.service.b bVar) {
        l.d(bVar, "");
        this.f111377a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void a(int i2) {
        i.b(new CallableC2852c(this, i2), i.f4826c);
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void a(com.ss.android.ugc.musicprovider.a aVar) {
        l.d(aVar, "");
        i.b(new b(this, aVar), i.f4826c);
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void a(String str, MusicWaveBean musicWaveBean) {
        l.d(str, "");
        i.b(new e(this, str, musicWaveBean), i.f4826c);
    }
}
