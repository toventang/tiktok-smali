package com.ss.android.ugc.aweme.question.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.question.a.a;
import com.ss.android.ugc.aweme.question.api.QuestionApi;
import f.a.ab;
import f.a.ad;
import f.a.af;
import h.f.b.l;
import h.f.b.m;

public final class QuestionDetailJediViewModel extends JediViewModel<QuestionDetailState> {
    static {
        Covode.recordClassIndex(77983);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ QuestionDetailState d() {
        return new QuestionDetailState(null, 1, null);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f120010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f120011b;

        static {
            Covode.recordClassIndex(77984);
        }

        a(boolean z, long j2) {
            this.f120010a = z;
            this.f120011b = j2;
        }

        @Override // f.a.af
        public final void subscribe(ad<com.ss.android.ugc.aweme.question.api.a> adVar) {
            com.ss.android.ugc.aweme.question.api.a aVar;
            l.d(adVar, "");
            try {
                if (!this.f120010a) {
                    a.C3091a a2 = com.ss.android.ugc.aweme.question.a.a.f119898b.a(String.valueOf(this.f120011b));
                    if (!(a2 == null || System.currentTimeMillis() - a2.f119902b >= ((long) com.ss.android.ugc.aweme.question.a.a.f119897a) || (aVar = a2.f119901a) == null)) {
                        adVar.a(aVar);
                        return;
                    }
                }
                com.ss.android.ugc.aweme.question.api.a a3 = QuestionApi.a(this.f120011b);
                adVar.a(a3);
                long j2 = this.f120011b;
                l.b(a3, "");
                l.d(a3, "");
                com.ss.android.ugc.aweme.question.a.a.f119898b.a(String.valueOf(j2), new a.C3091a(a3, System.currentTimeMillis()));
            } catch (Throwable th) {
                if (!adVar.isDisposed()) {
                    adVar.a(th);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.m<QuestionDetailState, com.bytedance.jedi.arch.a<? extends com.ss.android.ugc.aweme.question.api.a>, QuestionDetailState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120012a = new b();

        static {
            Covode.recordClassIndex(77985);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailState */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.m
        public final /* synthetic */ QuestionDetailState invoke(QuestionDetailState questionDetailState, com.bytedance.jedi.arch.a<? extends com.ss.android.ugc.aweme.question.api.a> aVar) {
            QuestionDetailState questionDetailState2 = questionDetailState;
            com.bytedance.jedi.arch.a<? extends com.ss.android.ugc.aweme.question.api.a> aVar2 = aVar;
            l.d(questionDetailState2, "");
            l.d(aVar2, "");
            return questionDetailState2.copy(aVar2);
        }
    }

    public final void a(long j2, boolean z) {
        ab b2 = ab.a((af) new a(z, j2)).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        a(b2, b.f120012a);
    }
}
