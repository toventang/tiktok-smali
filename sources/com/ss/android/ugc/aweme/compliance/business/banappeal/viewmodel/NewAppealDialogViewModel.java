package com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.business.banappeal.c.b;
import h.f.b.m;
import h.z;

public final class NewAppealDialogViewModel extends ac {

    /* renamed from: f  reason: collision with root package name */
    public static final a f76816f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<b.C1756b> f76817a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f76818b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.b f76819c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f76820d;

    /* renamed from: e  reason: collision with root package name */
    public final AppealStatusResponse f76821e;

    /* renamed from: g  reason: collision with root package name */
    private final h.f.a.a<z> f76822g;

    static {
        Covode.recordClassIndex(47484);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47485);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int a() {
        if (this.f76821e.getAppealType() != 12) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        f.a.b.b bVar = this.f76819c;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onCleared();
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ int $status;
        final /* synthetic */ NewAppealDialogViewModel this$0;

        static {
            Covode.recordClassIndex(47492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(NewAppealDialogViewModel newAppealDialogViewModel, int i2) {
            super(0);
            this.this$0 = newAppealDialogViewModel;
            this.$status = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            NewAppealDialogViewModel newAppealDialogViewModel = this.this$0;
            int i2 = this.$status;
            if (i2 == 0) {
                NewAppealDialogViewModel.a("pop_appeal_restored", newAppealDialogViewModel.a());
            } else if (i2 == 1) {
                newAppealDialogViewModel.c("0");
            } else if (i2 == 3) {
                NewAppealDialogViewModel.a("pop_appeal_failed", newAppealDialogViewModel.a());
            } else if (i2 == 4) {
                NewAppealDialogViewModel.a("pop_appeal_expired", newAppealDialogViewModel.a());
            } else if (i2 == 6) {
                newAppealDialogViewModel.c("1");
            } else if (i2 == 7) {
                newAppealDialogViewModel.c("2");
            } else if (i2 == 8) {
                newAppealDialogViewModel.c("3");
            }
            return z.f158842a;
        }
    }

    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewAppealDialogViewModel f76825a;

        static {
            Covode.recordClassIndex(47496);
        }

        public l(NewAppealDialogViewModel newAppealDialogViewModel) {
            this.f76825a = newAppealDialogViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            t<b.C1756b> tVar = this.f76825a.f76817a;
            NewAppealDialogViewModel newAppealDialogViewModel = this.f76825a;
            tVar.postValue(newAppealDialogViewModel.a(NewAppealDialogViewModel.a(newAppealDialogViewModel.f76821e).getStatus(), false));
        }
    }

    public final void b(String str) {
        SmartRouter.buildRoute(this.f76820d, "//webview").withParam(Uri.parse(str)).open(17);
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<View, z> {
        final /* synthetic */ NewAppealDialogViewModel this$0;

        static {
            Covode.recordClassIndex(47493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(NewAppealDialogViewModel newAppealDialogViewModel) {
            super(1);
            this.this$0 = newAppealDialogViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            h.f.b.l.d(view, "");
            SmartRouter.buildRoute(this.this$0.f76820d, "//webview").withParam("url", "https://www.tiktok.com/web-inapp/download-your-data?enter_from=banned&hide_nav_bar=1&banned=1").withParam("hide_nav_bar", true).open();
            return z.f158842a;
        }
    }

    public static final class j<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final j f76823a = new j();

        static {
            Covode.recordClassIndex(47494);
        }

        j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
            if (r2.getInt("status_code") == 0) goto L_0x0022;
         */
        @Override // f.a.d.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r0 = ""
                h.f.b.l.d(r5, r0)
                int r1 = r5.length()
                r3 = 1
                r0 = 0
                if (r1 <= 0) goto L_0x0027
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>(r5)
                java.lang.String r1 = "status_code"
                boolean r0 = r2.has(r1)
                if (r0 == 0) goto L_0x0027
                int r0 = r2.getInt(r1)
                if (r0 != 0) goto L_0x0027
            L_0x0022:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x0027:
                r3 = 0
                goto L_0x0022
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel.j.apply(java.lang.Object):java.lang.Object");
        }
    }

    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewAppealDialogViewModel f76824a;

        static {
            Covode.recordClassIndex(47495);
        }

        public k(NewAppealDialogViewModel newAppealDialogViewModel) {
            this.f76824a = newAppealDialogViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            t<b.C1756b> tVar = this.f76824a.f76817a;
            NewAppealDialogViewModel newAppealDialogViewModel = this.f76824a;
            int status = NewAppealDialogViewModel.a(newAppealDialogViewModel.f76821e).getStatus();
            h.f.b.l.b(bool, "");
            tVar.postValue(newAppealDialogViewModel.a(status, bool.booleanValue()));
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("appeal_type", str).a("ban_appeal_type", a());
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        r.a("pop_appeal", a2.a("user_id", g2.getCurUserId()).f66730a);
    }

    public static AppealStatusResponse a(AppealStatusResponse appealStatusResponse) {
        int status;
        h.f.b.l.d(appealStatusResponse, "");
        if (appealStatusResponse.getStatus() != 5) {
            status = appealStatusResponse.getStatus();
        } else if (appealStatusResponse.getBanType() == 4) {
            status = 8;
        } else if (appealStatusResponse.getBanType() == 1 && appealStatusResponse.getBanTime() < 31536000) {
            status = 7;
        } else if (appealStatusResponse.getBanTime() > 31536000) {
            status = 6;
        } else {
            status = appealStatusResponse.getStatus();
        }
        return AppealStatusResponse.copy$default(appealStatusResponse, status, 0, 0, 0, null, null, null, null, 254, null);
    }

    private final com.ss.android.ugc.aweme.compliance.business.banappeal.c.a a(com.ss.android.ugc.aweme.compliance.api.model.l lVar) {
        if (lVar == null) {
            return null;
        }
        Integer num = lVar.f76682c;
        int ordinal = com.ss.android.ugc.aweme.compliance.api.a.a.EXTERNAL_WEB.ordinal();
        if (num != null && num.intValue() == ordinal) {
            return new com.ss.android.ugc.aweme.compliance.business.banappeal.c.a(lVar.f76680a, new b(this, lVar));
        }
        int ordinal2 = com.ss.android.ugc.aweme.compliance.api.a.a.LOGOUT.ordinal();
        if (num != null && num.intValue() == ordinal2) {
            return new com.ss.android.ugc.aweme.compliance.business.banappeal.c.a(lVar.f76680a, new c(this));
        }
        int ordinal3 = com.ss.android.ugc.aweme.compliance.api.a.a.INTERNAL_WEB.ordinal();
        if (num != null && num.intValue() == ordinal3) {
            return new com.ss.android.ugc.aweme.compliance.business.banappeal.c.a(lVar.f76680a, new d(this, lVar));
        }
        int ordinal4 = com.ss.android.ugc.aweme.compliance.api.a.a.EXTERNAL_APPEAL_WEB.ordinal();
        if (num != null && num.intValue() == ordinal4) {
            return new com.ss.android.ugc.aweme.compliance.business.banappeal.c.a(lVar.f76680a, new e(this, lVar));
        }
        int ordinal5 = com.ss.android.ugc.aweme.compliance.api.a.a.INTERNAL_APPEAL_WEB.ordinal();
        if (num != null && num.intValue() == ordinal5) {
            return new com.ss.android.ugc.aweme.compliance.business.banappeal.c.a(lVar.f76680a, new f(this, lVar));
        }
        return new com.ss.android.ugc.aweme.compliance.business.banappeal.c.a(lVar.f76680a, new g(this, lVar));
    }

    public final void a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            Context context = this.f76820d;
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
            this.f76822g.invoke();
        } catch (ActivityNotFoundException unused) {
            SmartRouter.buildRoute(this.f76820d, "//webview").withParam(Uri.parse(str)).open(17);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.m<DialogInterface, Integer, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.l $button;
        final /* synthetic */ NewAppealDialogViewModel this$0;

        static {
            Covode.recordClassIndex(47486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NewAppealDialogViewModel newAppealDialogViewModel, com.ss.android.ugc.aweme.compliance.api.model.l lVar) {
            super(2);
            this.this$0 = newAppealDialogViewModel;
            this.$button = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            h.f.b.l.d(dialogInterface2, "");
            dialogInterface2.dismiss();
            this.this$0.a(this.$button.f76681b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.m<DialogInterface, Integer, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.l $button;
        final /* synthetic */ NewAppealDialogViewModel this$0;

        static {
            Covode.recordClassIndex(47488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(NewAppealDialogViewModel newAppealDialogViewModel, com.ss.android.ugc.aweme.compliance.api.model.l lVar) {
            super(2);
            this.this$0 = newAppealDialogViewModel;
            this.$button = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            h.f.b.l.d(dialogInterface2, "");
            dialogInterface2.dismiss();
            this.this$0.b(this.$button.f76681b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.m<DialogInterface, Integer, z> {
        final /* synthetic */ NewAppealDialogViewModel this$0;

        static {
            Covode.recordClassIndex(47487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(NewAppealDialogViewModel newAppealDialogViewModel) {
            super(2);
            this.this$0 = newAppealDialogViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            h.f.b.l.d(dialogInterface2, "");
            if (this.this$0.f76818b) {
                NewAppealDialogViewModel.a("cancel_appeal", 1);
            }
            dialogInterface2.dismiss();
            com.ss.android.ugc.aweme.account.b.b().logout("user_banned", "user_banned");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.m<DialogInterface, Integer, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.l $button;
        final /* synthetic */ NewAppealDialogViewModel this$0;

        static {
            Covode.recordClassIndex(47489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(NewAppealDialogViewModel newAppealDialogViewModel, com.ss.android.ugc.aweme.compliance.api.model.l lVar) {
            super(2);
            this.this$0 = newAppealDialogViewModel;
            this.$button = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            h.f.b.l.d(dialogInterface2, "");
            NewAppealDialogViewModel.a("click_appeal", this.this$0.a());
            dialogInterface2.dismiss();
            this.this$0.a(this.$button.f76681b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.m<DialogInterface, Integer, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.l $button;
        final /* synthetic */ NewAppealDialogViewModel this$0;

        static {
            Covode.recordClassIndex(47490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(NewAppealDialogViewModel newAppealDialogViewModel, com.ss.android.ugc.aweme.compliance.api.model.l lVar) {
            super(2);
            this.this$0 = newAppealDialogViewModel;
            this.$button = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            h.f.b.l.d(dialogInterface2, "");
            NewAppealDialogViewModel.a("click_appeal", this.this$0.a());
            dialogInterface2.dismiss();
            this.this$0.b(this.$button.f76681b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.m<DialogInterface, Integer, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.l $button;
        final /* synthetic */ NewAppealDialogViewModel this$0;

        static {
            Covode.recordClassIndex(47491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(NewAppealDialogViewModel newAppealDialogViewModel, com.ss.android.ugc.aweme.compliance.api.model.l lVar) {
            super(2);
            this.this$0 = newAppealDialogViewModel;
            this.$button = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            h.f.b.l.d(dialogInterface2, "");
            dialogInterface2.dismiss();
            SmartRouter.buildRoute(this.this$0.f76820d, "//aweme").withParam(Uri.parse(this.$button.f76681b)).open(17);
            return z.f158842a;
        }
    }

    public static void a(String str, int i2) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("ban_appeal_type", i2);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        r.a(str, a2.a("user_id", g2.getCurUserId()).f66730a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r2.intValue() != r1) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.compliance.business.banappeal.c.b.C1756b a(int r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel.a(int, boolean):com.ss.android.ugc.aweme.compliance.business.banappeal.c.b$b");
    }

    public NewAppealDialogViewModel(Context context, AppealStatusResponse appealStatusResponse, h.f.a.a<z> aVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(appealStatusResponse, "");
        h.f.b.l.d(aVar, "");
        this.f76820d = context;
        this.f76821e = appealStatusResponse;
        this.f76822g = aVar;
    }
}
