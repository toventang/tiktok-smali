package com.ss.android.ugc.aweme.compliance.business.banappeal.b;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.c.d;
import com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.business.banappeal.api.AppealApi;
import com.ss.android.ugc.aweme.compliance.business.banappeal.c.b;
import com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    DialogInterface f76768a;

    /* renamed from: b  reason: collision with root package name */
    boolean f76769b;

    /* renamed from: c  reason: collision with root package name */
    final Activity f76770c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f76771d;

    /* renamed from: e  reason: collision with root package name */
    private final NewAppealDialogViewModel f76772e;

    static {
        Covode.recordClassIndex(47455);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final void b() {
        this.f76771d = true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final boolean a() {
        return this.f76771d;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final boolean c() {
        return this.f76769b;
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(47456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.this$0.f76769b = true;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final boolean e() {
        DialogInterface dialogInterface = this.f76768a;
        if (!(dialogInterface instanceof com.bytedance.tux.dialog.a)) {
            return false;
        }
        Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.bytedance.tux.dialog.TuxDialog");
        return ((com.bytedance.tux.dialog.a) dialogInterface).f44796c.isShowing();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final void d() {
        NewAppealDialogViewModel newAppealDialogViewModel;
        t<R> d2;
        this.f76771d = false;
        if (!this.f76770c.isFinishing() && !e() && (this.f76770c instanceof e) && (newAppealDialogViewModel = this.f76772e) != null) {
            newAppealDialogViewModel.f76817a.observe((androidx.lifecycle.m) this.f76770c, new c(this));
            NewAppealDialogViewModel newAppealDialogViewModel2 = this.f76772e;
            f.a.b.b bVar = newAppealDialogViewModel2.f76819c;
            if (bVar != null && !bVar.isDisposed()) {
                bVar.dispose();
            }
            int appealType = newAppealDialogViewModel2.f76821e.getAppealType();
            if (appealType == 12) {
                d2 = AppealApi.a.f76750a.apiUserInfo(1, 0).b(f.a.h.a.b(f.a.k.a.f158006c)).d(NewAppealDialogViewModel.j.f76823a);
                l.b(d2, "");
            } else if (appealType != 102) {
                d2 = t.b((Object) true);
                l.b(d2, "");
            } else {
                d2 = t.b((Object) true);
                l.b(d2, "");
            }
            newAppealDialogViewModel2.f76819c = d2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new NewAppealDialogViewModel.k(newAppealDialogViewModel2), new NewAppealDialogViewModel.l(newAppealDialogViewModel2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.b$b  reason: collision with other inner class name */
    static final class C1754b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ b.C1756b $state;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(47457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1754b(b bVar, b.C1756b bVar2) {
            super(1);
            this.this$0 = bVar;
            this.$state = bVar2;
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.b$b$a */
        static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
            final /* synthetic */ com.bytedance.tux.dialog.b.b $this_actionGroup$inlined;
            final /* synthetic */ C1754b this$0;

            static {
                Covode.recordClassIndex(47458);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1754b bVar, com.bytedance.tux.dialog.b.b bVar2) {
                super(1);
                this.this$0 = bVar;
                this.$this_actionGroup$inlined = bVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                l.d(aVar, "");
                DialogInterface dialogInterface = this.this$0.this$0.f76768a;
                if (dialogInterface != null) {
                    this.this$0.$state.f76790d.f76781b.invoke(dialogInterface, 0);
                }
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.b$b$b  reason: collision with other inner class name */
        static final class C1755b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
            final /* synthetic */ com.bytedance.tux.dialog.b.b $this_actionGroup$inlined;
            final /* synthetic */ C1754b this$0;

            static {
                Covode.recordClassIndex(47459);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1755b(C1754b bVar, com.bytedance.tux.dialog.b.b bVar2) {
                super(1);
                this.this$0 = bVar;
                this.$this_actionGroup$inlined = bVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                l.d(aVar, "");
                DialogInterface dialogInterface = this.this$0.this$0.f76768a;
                if (dialogInterface != null) {
                    this.this$0.$state.f76791e.f76781b.invoke(dialogInterface, 0);
                }
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            String str;
            String str2;
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            com.ss.android.ugc.aweme.compliance.business.banappeal.c.a aVar = this.$state.f76790d;
            if (!(aVar == null || (str2 = aVar.f76780a) == null)) {
                bVar2.a(str2, new a(this, bVar2));
            }
            com.ss.android.ugc.aweme.compliance.business.banappeal.c.a aVar2 = this.$state.f76791e;
            if (!(aVar2 == null || (str = aVar2.f76780a) == null)) {
                bVar2.b(str, new C1755b(this, bVar2));
            }
            return z.f158842a;
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f76773a;

        static {
            Covode.recordClassIndex(47460);
        }

        c(b bVar) {
            this.f76773a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            b.C1756b bVar = (b.C1756b) obj;
            b bVar2 = this.f76773a;
            l.b(bVar, "");
            com.bytedance.tux.dialog.b c2 = new com.bytedance.tux.dialog.b(bVar2.f76770c).b(bVar.f76787a).d(bVar.f76788b);
            c cVar = new c(bVar2.f76770c, (byte) 0);
            if (bVar.f76789c != null) {
                cVar.a(bVar.f76789c.f76796a, bVar.f76789c.f76797b, bVar.f76789c.f76798c);
            }
            com.bytedance.tux.dialog.a a2 = com.bytedance.tux.dialog.b.c.a(com.bytedance.tux.dialog.a.c.a(c2, cVar), new C1754b(bVar2, bVar)).a();
            a2.a();
            bVar2.f76768a = a2;
            h.f.a.a<z> aVar = bVar.f76793g;
            if (aVar != null) {
                aVar.invoke();
            }
            DialogInterface dialogInterface = this.f76773a.f76768a;
            Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.bytedance.tux.dialog.TuxDialog");
            ((com.bytedance.tux.dialog.internal.a) dialogInterface).b().show();
        }
    }

    public b(Activity activity, AppealStatusResponse appealStatusResponse) {
        NewAppealDialogViewModel newAppealDialogViewModel;
        l.d(activity, "");
        l.d(appealStatusResponse, "");
        this.f76770c = activity;
        if (activity instanceof e) {
            newAppealDialogViewModel = new NewAppealDialogViewModel(activity, appealStatusResponse, new a(this));
        } else {
            newAppealDialogViewModel = null;
        }
        this.f76772e = newAppealDialogViewModel;
    }
}
