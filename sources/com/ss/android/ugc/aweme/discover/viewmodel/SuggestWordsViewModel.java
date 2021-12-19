package com.ss.android.ugc.aweme.discover.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.utils.cn;
import com.ss.android.ugc.aweme.utils.fn;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class SuggestWordsViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f82803a = i.a((h.f.a.a) c.f82805a);

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.b f82804b;

    static {
        Covode.recordClassIndex(51592);
    }

    public final t<com.ss.android.ugc.aweme.discover.api.a.a<TypeWords>> a() {
        return (t) this.f82803a.getValue();
    }

    static final class c extends m implements h.f.a.a<t<com.ss.android.ugc.aweme.discover.api.a.a<TypeWords>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f82805a = new c();

        static {
            Covode.recordClassIndex(51595);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<com.ss.android.ugc.aweme.discover.api.a.a<TypeWords>> invoke() {
            return new t();
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        b();
    }

    private final void b() {
        f.a.b.b bVar = this.f82804b;
        if (bVar != null) {
            if (!bVar.isDisposed()) {
                bVar.dispose();
            }
            this.f82804b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ SuggestWordsViewModel this$0;

        static {
            Covode.recordClassIndex(51594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SuggestWordsViewModel suggestWordsViewModel) {
            super(1);
            this.this$0 = suggestWordsViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            this.this$0.a().setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>(th2));
            return z.f158842a;
        }
    }

    public final void a(SuggestWordsApi.a aVar) {
        l.d(aVar, "");
        b();
        f.a.t a2 = fn.a(SuggestWordsApi.c(aVar));
        cn cnVar = new cn(new a(this), null, new b(this), 2);
        this.f82804b = cnVar;
        a2.b((f.a.z) cnVar);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<SuggestWordResponse, z> {
        final /* synthetic */ SuggestWordsViewModel this$0;

        static {
            Covode.recordClassIndex(51593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SuggestWordsViewModel suggestWordsViewModel) {
            super(1);
            this.this$0 = suggestWordsViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(SuggestWordResponse suggestWordResponse) {
            ArrayList arrayList;
            SuggestWordResponse suggestWordResponse2 = suggestWordResponse;
            l.d(suggestWordResponse2, "");
            List<TypeWords> list = suggestWordResponse2.data;
            if (list != null) {
                for (T t : list) {
                    if (l.a((Object) t.type, (Object) "inbox")) {
                        List<Word> list2 = t.words;
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (T t2 : list2) {
                                T t3 = t2;
                                if (!TextUtils.isEmpty(t3.getWord()) && !TextUtils.isEmpty(t3.getShowWord())) {
                                    arrayList2.add(t2);
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        t<com.ss.android.ugc.aweme.discover.api.a.a<TypeWords>> a2 = this.this$0.a();
                        t.logId = suggestWordResponse2.logId;
                        t.words = arrayList;
                        a2.setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>((TypeWords) t));
                    } else {
                        this.this$0.a().setValue(new com.ss.android.ugc.aweme.discover.api.a.a<>(new TypeWords()));
                    }
                }
            }
            return z.f158842a;
        }
    }
}
