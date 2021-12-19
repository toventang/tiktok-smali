package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import f.a.aa;
import f.a.ab;
import f.a.o;
import f.a.q;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import okhttp3.HttpUrl;

public final class GiphyViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f100704a;

    /* renamed from: b  reason: collision with root package name */
    public final t<Integer> f100705b;

    /* renamed from: c  reason: collision with root package name */
    public final t<Boolean> f100706c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<Throwable> f100707d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b>> f100708e;

    /* renamed from: f  reason: collision with root package name */
    public final t<z> f100709f;

    /* renamed from: g  reason: collision with root package name */
    public f.a.b.b f100710g;

    /* renamed from: h  reason: collision with root package name */
    Long f100711h;

    /* renamed from: i  reason: collision with root package name */
    final GiphyAnalytics f100712i;

    /* renamed from: j  reason: collision with root package name */
    public final a f100713j;

    /* renamed from: k  reason: collision with root package name */
    final aa f100714k;

    /* renamed from: l  reason: collision with root package name */
    private ab<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.c> f100715l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a f100716m;

    public interface a {
        static {
            Covode.recordClassIndex(64431);
        }

        long a();

        void a(long j2);

        void a(boolean z);
    }

    final /* synthetic */ class f implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f100719a;

        static {
            Covode.recordClassIndex(64436);
        }

        f(h.f.a.b bVar) {
            this.f100719a = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            return this.f100719a.invoke(obj);
        }
    }

    static {
        Covode.recordClassIndex(64430);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        f.a.b.b bVar = this.f100710g;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    static final class i extends m implements h.f.a.a<z> {
        final /* synthetic */ GiphyViewModel this$0;

        static {
            Covode.recordClassIndex(64439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(GiphyViewModel giphyViewModel) {
            super(0);
            this.this$0 = giphyViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f100713j.a(true);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GiphyViewModel f100718a;

        static {
            Covode.recordClassIndex(64433);
        }

        c(GiphyViewModel giphyViewModel) {
            this.f100718a = giphyViewModel;
        }

        @Override // f.a.d.a
        public final void a() {
            if (l.a((Object) this.f100718a.f100704a.getValue(), (Object) true)) {
                this.f100718a.f100704a.postValue(false);
            }
        }
    }

    private final void a() {
        f.a.b.b bVar = this.f100710g;
        if (bVar == null || bVar.isDisposed()) {
            ab<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.c> a2 = this.f100715l.b(this.f100714k).a(new b(this)).a(new c(this));
            l.b(a2, "");
            this.f100710g = f.a.j.d.a(a2, new e(this.f100707d), new d(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class e extends h.f.b.j implements h.f.a.b<Throwable, z> {
        static {
            Covode.recordClassIndex(64435);
        }

        e(t tVar) {
            super(1, tVar, t.class, "postValue", "postValue(Ljava/lang/Object;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            ((LiveData) this.receiver).postValue(th);
            return z.f158842a;
        }
    }

    static final /* synthetic */ class h extends h.f.b.j implements h.f.a.b<String, f.a.b> {
        static {
            Covode.recordClassIndex(64438);
        }

        h(GiphyAnalytics giphyAnalytics) {
            super(1, giphyAnalytics, GiphyAnalytics.class, "track", "track(Ljava/lang/String;)Lio/reactivex/Completable;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ f.a.b invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return ((GiphyAnalytics) this.receiver).track(str2);
        }
    }

    static final class j extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ GiphyViewModel this$0;

        static {
            Covode.recordClassIndex(64440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(GiphyViewModel giphyViewModel) {
            super(1);
            this.this$0 = giphyViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            this.this$0.f100713j.a(false);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GiphyViewModel f100717a;

        static {
            Covode.recordClassIndex(64432);
        }

        b(GiphyViewModel giphyViewModel) {
            this.f100717a = giphyViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b> value = this.f100717a.f100708e.getValue();
            if (value == null || value.isEmpty()) {
                this.f100717a.f100704a.postValue(true);
            }
        }
    }

    static final class g<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GiphyViewModel f100720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100721b;

        static {
            Covode.recordClassIndex(64437);
        }

        g(GiphyViewModel giphyViewModel, String str) {
            this.f100720a = giphyViewModel;
            this.f100721b = str;
        }

        @Override // f.a.q
        public final void a(o<String> oVar) {
            l.d(oVar, "");
            HttpUrl parse = HttpUrl.parse(this.f100721b);
            if (parse == null) {
                oVar.a(new IllegalArgumentException("Expecting valid url"));
                return;
            }
            l.b(parse, "");
            String httpUrl = parse.newBuilder().addQueryParameter("ts", String.valueOf(this.f100720a.f100713j.a())).build().toString();
            l.b(httpUrl, "");
            oVar.a(httpUrl);
        }
    }

    private final void b(boolean z) {
        if (z) {
            f.a.b.b bVar = this.f100710g;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f100705b.postValue(0);
            this.f100706c.postValue(true);
            this.f100708e.postValue(h.a.z.INSTANCE);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.c, z> {
        final /* synthetic */ GiphyViewModel this$0;

        static {
            Covode.recordClassIndex(64434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(GiphyViewModel giphyViewModel) {
            super(1);
            this.this$0 = giphyViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.c cVar) {
            int i2;
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.g gVar = cVar.f100776c;
            if (gVar != null) {
                List<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b> value = this.this$0.f100708e.getValue();
                if (value == null) {
                    value = h.a.z.INSTANCE;
                }
                Iterable iterable = gVar.f100781a;
                if (iterable == null) {
                    iterable = h.a.z.INSTANCE;
                }
                List d2 = n.d((Collection) value, iterable);
                t<List<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b>> tVar = this.this$0.f100708e;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : d2) {
                    if (hashSet.add(((com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b) obj).f100770b)) {
                        arrayList.add(obj);
                    }
                }
                tVar.postValue(arrayList);
                t<Integer> tVar2 = this.this$0.f100705b;
                com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.f fVar = gVar.f100782b;
                boolean z = false;
                if (fVar != null) {
                    i2 = fVar.f100780b;
                } else {
                    i2 = 0;
                }
                tVar2.postValue(Integer.valueOf(i2));
                t<Boolean> tVar3 = this.this$0.f100706c;
                com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.f fVar2 = gVar.f100782b;
                if (fVar2 != null) {
                    z = fVar2.f100779a;
                }
                tVar3.postValue(Boolean.valueOf(z));
            }
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        b(z);
        Integer value = this.f100705b.getValue();
        if (value != null && !l.a((Object) this.f100706c.getValue(), (Object) false)) {
            l.b(value, "");
            this.f100715l = this.f100716m.a(value.intValue());
            a();
        }
    }

    public GiphyViewModel(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a aVar, GiphyAnalytics giphyAnalytics, a aVar2, aa aaVar) {
        l.d(aVar, "");
        l.d(giphyAnalytics, "");
        l.d(aVar2, "");
        l.d(aaVar, "");
        this.f100716m = aVar;
        this.f100712i = giphyAnalytics;
        this.f100713j = aVar2;
        this.f100714k = aaVar;
        t<Boolean> tVar = new t<>();
        this.f100704a = tVar;
        t<Integer> tVar2 = new t<>();
        this.f100705b = tVar2;
        t<List<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b>> tVar3 = new t<>();
        this.f100708e = tVar3;
        this.f100709f = new t<>();
        ab<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.c> a2 = f.a.h.a.a(f.a.e.e.f.q.f157797a);
        l.b(a2, "");
        this.f100715l = a2;
        tVar.setValue(false);
        tVar2.setValue(0);
        tVar3.setValue(h.a.z.INSTANCE);
    }
}
