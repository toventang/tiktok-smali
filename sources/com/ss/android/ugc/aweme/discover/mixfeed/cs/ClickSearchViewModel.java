package com.ss.android.ugc.aweme.discover.mixfeed.cs;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.ClickSearchWord;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;

public final class ClickSearchViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Fragment> f81683a;

    /* renamed from: b  reason: collision with root package name */
    private final h f81684b = i.a((h.f.a.a) d.f81692a);

    /* renamed from: c  reason: collision with root package name */
    private final h f81685c = i.a((h.f.a.a) b.f81691a);

    /* renamed from: d  reason: collision with root package name */
    private final h f81686d = i.a((h.f.a.a) e.f81693a);

    static {
        Covode.recordClassIndex(50746);
    }

    public final NextLiveData<b> a() {
        return (NextLiveData) this.f81684b.getValue();
    }

    public final NextLiveData<e> b() {
        return (NextLiveData) this.f81685c.getValue();
    }

    public final NextLiveData<Integer> c() {
        return (NextLiveData) this.f81686d.getValue();
    }

    static final class b extends m implements h.f.a.a<NextLiveData<e>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f81691a = new b();

        static {
            Covode.recordClassIndex(50748);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NextLiveData<e> invoke() {
            return new NextLiveData();
        }
    }

    static final class d extends m implements h.f.a.a<NextLiveData<b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f81692a = new d();

        static {
            Covode.recordClassIndex(50750);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NextLiveData<b> invoke() {
            return new NextLiveData();
        }
    }

    static final class e extends m implements h.f.a.a<NextLiveData<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f81693a = new e();

        static {
            Covode.recordClassIndex(50751);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NextLiveData<Integer> invoke() {
            return new NextLiveData();
        }
    }

    public final void d() {
        a().setValue(new b());
        b().setValue(null);
    }

    public final void a(Integer num) {
        c().setValue(num);
    }

    private final void a(h.f.a.b<? super e, z> bVar) {
        bVar.invoke(b().getValue());
    }

    static final class a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ClickSearchViewModel f81687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f81688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f81689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f81690d;

        static {
            Covode.recordClassIndex(50747);
        }

        a(ClickSearchViewModel clickSearchViewModel, int i2, String str, String str2) {
            this.f81687a = clickSearchViewModel;
            this.f81688b = i2;
            this.f81689c = str;
            this.f81690d = str2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            Object d2;
            l.b(iVar, "");
            if (iVar.a() && (d2 = iVar.d()) != null) {
                ClickSearchViewModel clickSearchViewModel = this.f81687a;
                int i2 = this.f81688b;
                String str = this.f81689c;
                l.b(str, "");
                clickSearchViewModel.a(i2, str, this.f81690d, new com.ss.android.ugc.aweme.discover.api.a.a<>((ClickSearchResponse) d2), true);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<e, z> {
        final /* synthetic */ String $aid;
        final /* synthetic */ boolean $animation;
        final /* synthetic */ int $awemeIndex;
        final /* synthetic */ String $query;
        final /* synthetic */ com.ss.android.ugc.aweme.discover.api.a.a $result;
        final /* synthetic */ ClickSearchViewModel this$0;

        static {
            Covode.recordClassIndex(50749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ClickSearchViewModel clickSearchViewModel, int i2, String str, String str2, com.ss.android.ugc.aweme.discover.api.a.a aVar, boolean z) {
            super(1);
            this.this$0 = clickSearchViewModel;
            this.$awemeIndex = i2;
            this.$aid = str;
            this.$query = str2;
            this.$result = aVar;
            this.$animation = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            if (eVar2 != null && eVar2.f81715b == d.DATA_FETCHING && this.$awemeIndex == eVar2.f81714a) {
                this.this$0.a().postValue(new b(this.$awemeIndex, this.$aid, this.$query, this.$result, this.$animation));
                this.this$0.b().setValue(new e(this.$awemeIndex, d.FINISHED));
            }
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        e value = b().getValue();
        if (value != null && value.f81714a == i2) {
            b().setValue(new e(i2, d.FINISHED));
        }
    }

    public final void a(Aweme aweme, String str, int i2) {
        com.ss.android.ugc.aweme.discover.api.a.a<ClickSearchResponse> aVar;
        T t;
        List<ClickSearchWord> list;
        T t2;
        List<ClickSearchWord> list2;
        l.d(aweme, "");
        l.d(str, "");
        b().setValue(new e(i2, d.DATA_FETCHING));
        String aid = aweme.getAid();
        b value = a().getValue();
        if (value == null || (aVar = value.f81708d) == null || (t = aVar.f80830b) == null || (list = t.wordsList) == null || list.size() <= 0 || value.f81705a != i2) {
            SuggestWordsApi.a aVar2 = new SuggestWordsApi.a();
            aVar2.f80821f = str;
            aVar2.f80822g = aid;
            SuggestWordsApi.d(aVar2).a(new a(this, i2, aid, str), b.i.f4826c, null);
            return;
        }
        com.ss.android.ugc.aweme.discover.api.a.a<ClickSearchResponse> aVar3 = value.f81708d;
        if (!(aVar3 == null || (t2 = aVar3.f80830b) == null || (list2 = t2.wordsList) == null)) {
            Integer.valueOf(list2.size());
        }
        l.b(aid, "");
        a(i2, aid, str, value.f81708d, false);
    }

    public final void a(int i2, String str, String str2, com.ss.android.ugc.aweme.discover.api.a.a<ClickSearchResponse> aVar, boolean z) {
        a(new c(this, i2, str, str2, aVar, z));
    }
}
