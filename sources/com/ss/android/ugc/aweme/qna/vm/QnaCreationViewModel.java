package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.assem.arch.extensions.h;
import com.bytedance.assem.arch.extensions.n;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.d.g;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class QnaCreationViewModel extends AssemViewModel<g> {

    /* renamed from: j  reason: collision with root package name */
    public final g f119630j = new g();

    static {
        Covode.recordClassIndex(77724);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ g f() {
        return new g();
    }

    public static final class a extends m implements h.f.a.b<g, g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f119631a = new a();

        static {
            Covode.recordClassIndex(77725);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ g invoke(g gVar) {
            l.d(gVar, "");
            return g.a(new n(), e.PUBLISH_START);
        }
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaCreationViewModel f119632a;

        static {
            Covode.recordClassIndex(77726);
        }

        public b(QnaCreationViewModel qnaCreationViewModel) {
            this.f119632a = qnaCreationViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.question.model.a aVar = (com.ss.android.ugc.aweme.question.model.a) obj;
            QnaCreationViewModel qnaCreationViewModel = this.f119632a;
            l.b(aVar, "");
            qnaCreationViewModel.a(new e(aVar));
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaCreationViewModel f119633a;

        static {
            Covode.recordClassIndex(77727);
        }

        public c(QnaCreationViewModel qnaCreationViewModel) {
            this.f119633a = qnaCreationViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            QnaCreationViewModel qnaCreationViewModel = this.f119633a;
            l.b(th, "");
            qnaCreationViewModel.a(new d(th));
        }
    }

    static final class d extends m implements h.f.a.b<g, g> {
        final /* synthetic */ Throwable $error;

        static {
            Covode.recordClassIndex(77728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Throwable th) {
            super(1);
            this.$error = th;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ g invoke(g gVar) {
            l.d(gVar, "");
            return g.a(new h(this.$error), e.PUBLISH_FAILED);
        }
    }

    static final class e extends m implements h.f.a.b<g, g> {
        final /* synthetic */ com.ss.android.ugc.aweme.question.model.a $response;

        static {
            Covode.recordClassIndex(77729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.question.model.a aVar) {
            super(1);
            this.$response = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ g invoke(g gVar) {
            l.d(gVar, "");
            return g.a(new o(this.$response), e.PUBLISH_SUCCEED);
        }
    }

    public static String a(List<? extends User> list) {
        ArrayList arrayList;
        com.google.gson.f fVar = new com.google.gson.f();
        if (list != null) {
            arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String uid = it.next().getUid();
                l.b(uid, "");
                arrayList.add(p.g(uid));
            }
        } else {
            arrayList = null;
        }
        return fVar.b(arrayList);
    }
}
