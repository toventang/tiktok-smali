package com.ss.android.ugc.aweme.qna;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.i;
import com.bytedance.assem.arch.core.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

@com.bytedance.ies.powerpage.a.a
public final class QnaProfile extends com.bytedance.ies.foundation.fragment.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f119173e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final h f119174f = RouteArgExtension.INSTANCE.optionalArgNotNull(this, c.f119179a, "enter_from", String.class);

    /* renamed from: g  reason: collision with root package name */
    private final h f119175g = RouteArgExtension.INSTANCE.optionalArgNotNull(this, d.f119180a, "enter_method", String.class);

    /* renamed from: h  reason: collision with root package name */
    private final h f119176h = RouteArgExtension.INSTANCE.optionalArgNotNull(this, b.f119178a, "to_user_id", String.class);

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f119177i;

    static {
        Covode.recordClassIndex(77395);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f119177i == null) {
            this.f119177i = new SparseArray();
        }
        View view = (View) this.f119177i.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f119177i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f119177i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final String c() {
        return (String) this.f119174f.getValue();
    }

    public final String d() {
        return (String) this.f119175g.getValue();
    }

    public final String e() {
        return (String) this.f119176h.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77396);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f119178a = new b();

        static {
            Covode.recordClassIndex(77397);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    static final class c extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f119179a = new c();

        static {
            Covode.recordClassIndex(77398);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    static final class d extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f119180a = new d();

        static {
            Covode.recordClassIndex(77399);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    static final class e extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f119181a = new e();

        static {
            Covode.recordClassIndex(77400);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f119182a);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f119183a = new f();

        static {
            Covode.recordClassIndex(77402);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f119184a);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(e.f119181a);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(f.f119183a);
    }

    static final class g extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ QnaProfile this$0;

        static {
            Covode.recordClassIndex(77404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(QnaProfile qnaProfile, View view) {
            super(1);
            this.this$0 = qnaProfile;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.qna.QnaProfile.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(77405);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(i<com.bytedance.assem.arch.extensions.c> iVar) {
                    i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.a(new com.ss.android.ugc.aweme.qna.api.c(this.this$0.this$0.c(), this.this$0.this$0.d(), this.this$0.this$0.e()));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.qna.QnaProfile.g.AnonymousClass2 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(77406);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.dei);
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.qna.a.e.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.qna.a.e();
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.qna.QnaProfile.g.AnonymousClass3 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(77407);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.dqk);
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.qna.a.i.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.qna.a.i();
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.qna.QnaProfile.g.AnonymousClass4 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(77408);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.dej);
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.qna.a.b.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.qna.a.b();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.assem.arch.extensions.d.a(this, new g(this, view));
        if (com.ss.android.ugc.aweme.qna.b.b.a(e())) {
            r.a("enter_qa_personal_profile", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", c()).a("enter_method", d()).f66730a);
            return;
        }
        r.a("enter_qa_others_profile", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "click_qa_entrance").a("enter_from", c()).a("to_user_id", e()).f66730a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.are, viewGroup, false);
    }
}
