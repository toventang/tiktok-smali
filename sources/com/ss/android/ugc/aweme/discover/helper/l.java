package com.ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.helper.a;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.viewmodel.SuggestWordsViewModel;
import h.a.n;
import h.f.b.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class l implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f81129a;

    /* renamed from: b  reason: collision with root package name */
    final h.h f81130b = h.i.a((h.f.a.a) new i(this));

    /* renamed from: c  reason: collision with root package name */
    public final e f81131c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<SuggestWordResponse> f81132d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f81133e = h.i.a((h.f.a.a) new g(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f81134f = h.i.a((h.f.a.a) new k(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f81135g = h.i.a((h.f.a.a) j.f81149a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f81136h = h.i.a((h.f.a.a) new h(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f81137i = h.i.a((h.f.a.a) f.f81148a);

    public interface a {
        static {
            Covode.recordClassIndex(50431);
        }

        void a(int i2);

        void a(View view);

        void a(Word word);

        void a(String str, String str2);
    }

    static {
        Covode.recordClassIndex(50430);
    }

    private final a n() {
        return (a) this.f81137i.getValue();
    }

    public final androidx.fragment.app.e i() {
        return (androidx.fragment.app.e) this.f81133e.getValue();
    }

    public final SuggestWordsViewModel j() {
        return (SuggestWordsViewModel) this.f81134f.getValue();
    }

    public final SuggestWordsApi.a k() {
        return (SuggestWordsApi.a) this.f81135g.getValue();
    }

    public final b l() {
        return (b) this.f81136h.getValue();
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        private final h.h f81138a = h.i.a((h.f.a.a) a.f81143a);

        /* renamed from: f  reason: collision with root package name */
        public boolean f81139f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f81140g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f81141h;

        /* renamed from: i  reason: collision with root package name */
        public final e f81142i;

        static {
            Covode.recordClassIndex(50432);
        }

        public abstract void a(com.ss.android.ugc.aweme.discover.api.a.a<TypeWords> aVar);

        public boolean a(String str) {
            h.f.b.l.d(str, "");
            return false;
        }

        public void b() {
            this.f81139f = false;
        }

        public void c() {
            this.f81139f = true;
        }

        public void d() {
            this.f81139f = false;
        }

        public void e() {
            this.f81139f = true;
        }

        public void f() {
            this.f81139f = false;
        }

        public Word g() {
            return null;
        }

        /* access modifiers changed from: protected */
        public final com.ss.android.ugc.aweme.discover.mob.helpers.a h() {
            return (com.ss.android.ugc.aweme.discover.mob.helpers.a) this.f81138a.getValue();
        }

        static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.mob.helpers.a> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f81143a = new a();

            static {
                Covode.recordClassIndex(50433);
            }

            a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.ss.android.ugc.aweme.discover.mob.helpers.a invoke() {
                return new com.ss.android.ugc.aweme.discover.mob.helpers.a();
            }
        }

        public void a(boolean z) {
            this.f81139f = z;
        }

        public void b(boolean z) {
            this.f81139f = z;
        }

        public void c(boolean z) {
            this.f81139f = z;
        }

        public b(e eVar) {
            h.f.b.l.d(eVar, "");
            this.f81142i = eVar;
        }
    }

    static final class f extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f81148a = new f();

        static {
            Covode.recordClassIndex(50437);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    static final class g extends m implements h.f.a.a<androidx.fragment.app.e> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(50438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.e invoke() {
            Context context = this.this$0.f81131c.f81146a.getContext();
            if (!(context instanceof androidx.fragment.app.e)) {
                return null;
            }
            return context;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void b() {
        b l2 = l();
        if (l2 != null) {
            l2.f81139f = true;
            l2.f81140g = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void c() {
        b l2 = l();
        if (l2 != null) {
            l2.f81139f = false;
            l2.f81140g = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void d() {
        b l2 = l();
        if (l2 != null) {
            l2.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void e() {
        b l2 = l();
        if (l2 != null) {
            l2.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void f() {
        b l2 = l();
        if (l2 != null) {
            l2.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void g() {
        b l2 = l();
        if (l2 != null) {
            l2.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void h() {
        b l2 = l();
        if (l2 != null) {
            l2.f();
        }
    }

    public final Word m() {
        b l2 = l();
        if (l2 != null) {
            return l2.g();
        }
        return null;
    }

    static final class h extends m implements h.f.a.a<e> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(50439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            if (com.ss.android.ugc.aweme.discover.a.m.b() != 5) {
                return null;
            }
            return new e(this.this$0.f81131c, (SearchIntermediateViewModel) this.this$0.f81130b.getValue());
        }
    }

    static final class i extends m implements h.f.a.a<SearchIntermediateViewModel> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(50440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchIntermediateViewModel invoke() {
            if (this.this$0.i() == null) {
                return null;
            }
            androidx.fragment.app.e i2 = this.this$0.i();
            if (i2 == null) {
                h.f.b.l.b();
            }
            return ae.a(i2, (ad.b) null).a(SearchIntermediateViewModel.class);
        }
    }

    static final class j extends m implements h.f.a.a<SuggestWordsApi.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f81149a = new j();

        static {
            Covode.recordClassIndex(50441);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SuggestWordsApi.a invoke() {
            String str;
            SuggestWordsApi.a aVar = new SuggestWordsApi.a();
            aVar.f80816a = "100010";
            aVar.f80817b = "general";
            if (com.bytedance.common.utility.m.a(com.bytedance.ies.ugc.appcontext.d.s, "local_test")) {
                str = "1";
            } else {
                str = "0";
            }
            aVar.f80818c = str;
            return aVar;
        }
    }

    static final class k extends m implements h.f.a.a<SuggestWordsViewModel> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(50442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SuggestWordsViewModel invoke() {
            androidx.fragment.app.e i2 = this.this$0.i();
            if (i2 != null) {
                return ae.a(i2, (ad.b) null).a(SuggestWordsViewModel.class);
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void a() {
        SuggestWordsViewModel j2;
        if (this.f81129a && !com.ss.android.ugc.aweme.search.h.f121133a.q() && (j2 = j()) != null) {
            j2.a(k());
        }
        b l2 = l();
        if (l2 != null) {
            l2.f81139f = true;
        }
    }

    final class c implements u<com.ss.android.ugc.aweme.discover.api.a.a<TypeWords>> {
        static {
            Covode.recordClassIndex(50434);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.discover.api.a.a<TypeWords> aVar) {
            com.ss.android.ugc.aweme.discover.api.a.a<TypeWords> aVar2 = aVar;
            b l2 = l.this.l();
            if (l2 != null) {
                l2.a(aVar2);
            }
        }
    }

    final class d implements u<SuggestWordResponse> {
        static {
            Covode.recordClassIndex(50435);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(SuggestWordResponse suggestWordResponse) {
            List<Word> list;
            Integer valueOf;
            SuggestWordResponse suggestWordResponse2 = suggestWordResponse;
            h.f.b.l.d(suggestWordResponse2, "");
            List<TypeWords> list2 = suggestWordResponse2.data;
            com.ss.android.ugc.aweme.discover.api.a.a<TypeWords> aVar = null;
            if (list2 != null) {
                com.ss.android.ugc.aweme.discover.api.a.a<TypeWords> aVar2 = null;
                for (T t : list2) {
                    if (h.f.b.l.a((Object) t.type, (Object) "inbox")) {
                        List<Word> list3 = t.words;
                        if (list3 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (T t2 : list3) {
                                T t3 = t2;
                                if (!TextUtils.isEmpty(t3.getWord()) && !TextUtils.isEmpty(t3.getShowWord())) {
                                    arrayList.add(t2);
                                }
                            }
                            list = n.g((Collection) arrayList);
                            if (!(list == null || (valueOf = Integer.valueOf(list.size())) == null || valueOf.intValue() <= 5)) {
                                int i2 = 4;
                                do {
                                    list.remove(i2);
                                    i2--;
                                } while (i2 > 0);
                            }
                        } else {
                            list = null;
                        }
                        TypeWords typeWords = new TypeWords();
                        typeWords.logId = suggestWordResponse2.logId;
                        typeWords.words = list;
                        aVar2 = new com.ss.android.ugc.aweme.discover.api.a.a<>(typeWords);
                    } else {
                        aVar2 = new com.ss.android.ugc.aweme.discover.api.a.a<>(new TypeWords());
                    }
                }
                aVar = aVar2;
            }
            b l2 = l.this.l();
            if (l2 != null) {
                l2.a(aVar);
            }
        }
    }

    public final boolean a(String str) {
        h.f.b.l.d(str, "");
        b l2 = l();
        if (l2 != null) {
            return l2.a(str);
        }
        return false;
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final View f81146a;

        /* renamed from: b  reason: collision with root package name */
        public final a f81147b;

        static {
            Covode.recordClassIndex(50436);
        }

        public e(View view, a aVar) {
            h.f.b.l.d(view, "");
            h.f.b.l.d(aVar, "");
            this.f81146a = view;
            this.f81147b = aVar;
        }
    }

    public l(e eVar, LiveData<SuggestWordResponse> liveData) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(liveData, "");
        this.f81131c = eVar;
        this.f81132d = liveData;
        androidx.fragment.app.e i2 = i();
        if (i2 != null) {
            n().a(new WeakReference<>(i2));
            n().a(this);
            b l2 = l();
            if (l2 != null) {
                l2.f81139f = true;
            }
            if (com.ss.android.ugc.aweme.search.h.f121133a.q()) {
                liveData.observe(i2, new d());
                return;
            }
            SuggestWordsViewModel j2 = j();
            if (j2 != null) {
                j2.a().observe(i2, new c());
                j2.a(k());
            }
        }
    }
}
