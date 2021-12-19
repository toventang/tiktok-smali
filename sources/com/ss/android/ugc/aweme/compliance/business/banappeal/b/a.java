package com.ss.android.ugc.aweme.compliance.business.banappeal.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.business.banappeal.b.c;
import com.ss.android.ugc.aweme.compliance.business.banappeal.c.b;
import com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogAgsStyleViewModel;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class a implements com.ss.android.ugc.aweme.compliance.api.c.d {

    /* renamed from: d  reason: collision with root package name */
    public static final C1752a f76758d = new C1752a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f76759a;

    /* renamed from: b  reason: collision with root package name */
    DialogInterface f76760b;

    /* renamed from: c  reason: collision with root package name */
    public final Activity f76761c;

    /* renamed from: e  reason: collision with root package name */
    private final AppealDialogAgsStyleViewModel f76762e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f76763f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f76764g;

    static {
        Covode.recordClassIndex(47449);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final void b() {
        this.f76763f = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.a$a  reason: collision with other inner class name */
    public static final class C1752a {
        static {
            Covode.recordClassIndex(47450);
        }

        private C1752a() {
        }

        public /* synthetic */ C1752a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final boolean a() {
        return this.f76763f;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final boolean c() {
        return this.f76764g;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final boolean e() {
        DialogInterface dialogInterface = this.f76760b;
        if (!(dialogInterface instanceof com.bytedance.tux.dialog.a)) {
            return false;
        }
        Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.bytedance.tux.dialog.TuxDialog");
        return ((com.bytedance.tux.dialog.a) dialogInterface).f44796c.isShowing();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.d
    public final void d() {
        AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel;
        this.f76763f = false;
        if (!this.f76761c.isFinishing() && !e() && (this.f76761c instanceof e) && (appealDialogAgsStyleViewModel = this.f76762e) != null) {
            appealDialogAgsStyleViewModel.f76814c.observe((m) this.f76761c, new d(this));
            AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel2 = this.f76762e;
            appealDialogAgsStyleViewModel2.f76814c.postValue((T) appealDialogAgsStyleViewModel2.a(appealDialogAgsStyleViewModel2.f76815d));
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ b.a $state;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, b.a aVar2) {
            super(1);
            this.this$0 = aVar;
            this.$state = aVar2;
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.a$c$a  reason: collision with other inner class name */
        static final class C1753a extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
            final /* synthetic */ com.bytedance.tux.dialog.b.b $this_actionGroup$inlined;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(47453);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1753a(c cVar, com.bytedance.tux.dialog.b.b bVar) {
                super(1);
                this.this$0 = cVar;
                this.$this_actionGroup$inlined = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                l.d(aVar, "");
                DialogInterface dialogInterface = this.this$0.this$0.f76760b;
                if (dialogInterface != null) {
                    this.this$0.$state.f76785d.f76781b.invoke(dialogInterface, 0);
                }
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            String str = this.$state.f76785d.f76780a;
            if (str != null) {
                bVar2.a(str, new C1753a(this, bVar2));
            }
            return z.f158842a;
        }
    }

    public static final class b implements ad.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76765a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppealStatusResponse f76766b;

        static {
            Covode.recordClassIndex(47451);
        }

        @Override // androidx.lifecycle.ad.b
        public final <T extends ac> T a(Class<T> cls) {
            l.d(cls, "");
            return new AppealDialogAgsStyleViewModel(this.f76765a.f76761c, this.f76766b);
        }

        b(a aVar, AppealStatusResponse appealStatusResponse) {
            this.f76765a = aVar;
            this.f76766b = appealStatusResponse;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76767a;

        static {
            Covode.recordClassIndex(47454);
        }

        d(a aVar) {
            this.f76767a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            b.a aVar = (b.a) obj;
            a aVar2 = this.f76767a;
            l.b(aVar, "");
            com.bytedance.tux.dialog.b c2 = new com.bytedance.tux.dialog.b(aVar2.f76761c).b(aVar.f76782a).d(aVar.f76783b);
            c cVar = new c(aVar2.f76761c, (byte) 0);
            cVar.a(aVar.f76784c.f76796a, aVar.f76784c.f76797b, aVar.f76784c.f76798c);
            if (aVar.f76786e != null) {
                String str = aVar.f76786e.f76794a;
                h.f.a.b<View, z> bVar = aVar.f76786e.f76795b;
                l.d(str, "");
                l.d(bVar, "");
                cVar.f76774g.setVisibility(0);
                cVar.f76774g.setText(str);
                cVar.f76774g.setOnClickListener(new c.a(bVar));
            }
            com.bytedance.tux.dialog.a a2 = com.bytedance.tux.dialog.b.c.a(com.bytedance.tux.dialog.a.c.a(c2, cVar), new c(aVar2, aVar)).a();
            a2.a();
            aVar2.f76760b = a2;
            com.bytedance.tux.dialog.internal.a aVar3 = (com.bytedance.tux.dialog.internal.a) this.f76767a.f76760b;
            if (aVar3 != null) {
                aVar3.b().show();
            }
            r.a("tns_ags_popup_perm_ban", new com.ss.android.ugc.aweme.app.f.d().a("status", this.f76767a.f76759a).f66730a);
        }
    }

    public a(Activity activity, AppealStatusResponse appealStatusResponse) {
        AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel;
        l.d(activity, "");
        l.d(appealStatusResponse, "");
        this.f76761c = activity;
        this.f76759a = appealStatusResponse.getStatus();
        if (activity instanceof e) {
            appealDialogAgsStyleViewModel = (AppealDialogAgsStyleViewModel) new ad((ag) activity, new b(this, appealStatusResponse)).a(AppealDialogAgsStyleViewModel.class);
        } else {
            appealDialogAgsStyleViewModel = null;
        }
        this.f76762e = appealDialogAgsStyleViewModel;
    }
}
