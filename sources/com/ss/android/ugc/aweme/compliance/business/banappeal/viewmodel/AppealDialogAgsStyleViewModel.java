package com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.business.banappeal.c.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class AppealDialogAgsStyleViewModel extends AppealDialogViewModel<b.a> {

    /* renamed from: a  reason: collision with root package name */
    final Context f76810a;

    /* renamed from: b  reason: collision with root package name */
    public final AppealStatusResponse f76811b;

    static {
        Covode.recordClassIndex(47477);
    }

    static final class c extends m implements h.f.a.b<View, z> {
        final /* synthetic */ AppealDialogAgsStyleViewModel this$0;

        static {
            Covode.recordClassIndex(47480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel) {
            super(1);
            this.this$0 = appealDialogAgsStyleViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            SmartRouter.buildRoute(this.this$0.f76810a, "//webview").withParam(Uri.parse(this.this$0.f76811b.getAppealUrl()).buildUpon().appendQueryParameter("enter_from", "popup_perm").build()).open(17);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<View, z> {
        final /* synthetic */ AppealDialogAgsStyleViewModel this$0;

        static {
            Covode.recordClassIndex(47481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel) {
            super(1);
            this.this$0 = appealDialogAgsStyleViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            SmartRouter.buildRoute(this.this$0.f76810a, "//webview").withParam("url", "https://www.tiktok.com/web-inapp/download-your-data?enter_from=banned&hide_nav_bar=1&banned=1").withParam("hide_nav_bar", true).open();
            return z.f158842a;
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.compliance.business.banappeal.c.b' to match base method */
    @Override // com.ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.AppealDialogViewModel
    public final /* synthetic */ b.a a(AppealStatusResponse appealStatusResponse) {
        int status;
        b.a aVar;
        com.ss.android.ugc.aweme.compliance.business.banappeal.c.c cVar;
        l.d(appealStatusResponse, "");
        AppealStatusResponse appealStatusResponse2 = this.f76811b;
        l.d(appealStatusResponse2, "");
        if (appealStatusResponse2.getStatus() != 5) {
            status = appealStatusResponse2.getStatus();
        } else if (appealStatusResponse2.getBanType() == 4) {
            status = 8;
        } else if (appealStatusResponse2.getBanType() == 1 && appealStatusResponse2.getBanTime() < 31536000) {
            status = 7;
        } else if (appealStatusResponse2.getBanTime() > 31536000) {
            status = 6;
        } else {
            status = appealStatusResponse2.getStatus();
        }
        int status2 = AppealStatusResponse.copy$default(appealStatusResponse2, status, 0, 0, 0, null, null, null, null, 254, null).getStatus();
        if (status2 == 1 || status2 == 5) {
            String popTitle = this.f76811b.getPopTitle();
            String popContent = this.f76811b.getPopContent();
            if (popContent == null) {
                popContent = "";
            }
            String string = this.f76810a.getString(R.string.bf0, "");
            l.b(string, "");
            String string2 = this.f76810a.getString(R.string.bf1);
            l.b(string2, "");
            aVar = new b.a(popTitle, popContent, a(string, string2), new com.ss.android.ugc.aweme.compliance.business.banappeal.c.a(this.f76810a.getString(R.string.hch), new a(this)), null);
        } else {
            String popTitle2 = this.f76811b.getPopTitle();
            String popContent2 = this.f76811b.getPopContent();
            if (popContent2 == null) {
                popContent2 = "";
            }
            String string3 = this.f76810a.getString(R.string.bf0, "");
            l.b(string3, "");
            String string4 = this.f76810a.getString(R.string.bf1);
            l.b(string4, "");
            com.ss.android.ugc.aweme.compliance.business.banappeal.c.d a2 = a(string3, string4);
            com.ss.android.ugc.aweme.compliance.business.banappeal.c.a aVar2 = new com.ss.android.ugc.aweme.compliance.business.banappeal.c.a(this.f76810a.getString(R.string.bf2), new b(this));
            String appealUrl = this.f76811b.getAppealUrl();
            if (appealUrl == null || appealUrl.length() <= 0) {
                cVar = null;
            } else {
                String string5 = this.f76810a.getString(R.string.hcc);
                l.b(string5, "");
                cVar = new com.ss.android.ugc.aweme.compliance.business.banappeal.c.c(string5, new c(this));
            }
            aVar = new b.a(popTitle2, popContent2, a2, aVar2, cVar);
        }
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppealDialogAgsStyleViewModel(Context context, AppealStatusResponse appealStatusResponse) {
        super(context, appealStatusResponse);
        l.d(context, "");
        l.d(appealStatusResponse, "");
        this.f76810a = context;
        this.f76811b = appealStatusResponse;
    }

    private final com.ss.android.ugc.aweme.compliance.business.banappeal.c.d a(String str, String str2) {
        return new com.ss.android.ugc.aweme.compliance.business.banappeal.c.d(str, str2, new d(this));
    }

    static final class b extends m implements h.f.a.m<DialogInterface, Integer, z> {
        final /* synthetic */ AppealDialogAgsStyleViewModel this$0;

        static {
            Covode.recordClassIndex(47479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel) {
            super(2);
            this.this$0 = appealDialogAgsStyleViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(DialogInterface dialogInterface, Integer num) {
            DialogInterface dialogInterface2 = dialogInterface;
            num.intValue();
            l.d(dialogInterface2, "");
            dialogInterface2.dismiss();
            com.ss.android.ugc.aweme.account.b.b().logout("user_banned", "user_banned");
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.m<DialogInterface, Integer, z> {
        final /* synthetic */ AppealDialogAgsStyleViewModel this$0;

        static {
            Covode.recordClassIndex(47478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AppealDialogAgsStyleViewModel appealDialogAgsStyleViewModel) {
            super(2);
            this.this$0 = appealDialogAgsStyleViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(DialogInterface dialogInterface, Integer num) {
            num.intValue();
            l.d(dialogInterface, "");
            SmartRouter.buildRoute(this.this$0.f76810a, "//webview").withParam(Uri.parse(this.this$0.f76811b.getAppealUrl())).open(17);
            return z.f158842a;
        }
    }
}
