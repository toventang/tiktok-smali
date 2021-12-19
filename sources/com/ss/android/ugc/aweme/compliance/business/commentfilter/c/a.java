package com.ss.android.ugc.aweme.compliance.business.commentfilter.c;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.business.commentfilter.api.CommentFilterApi;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import f.a.z;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.setting.serverpush.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f76874a = new a();

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(Exception exc) {
        l.d(exc, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.c.a$a  reason: collision with other inner class name */
    public static final class C1761a implements z<BaseResponse> {
        static {
            Covode.recordClassIndex(47518);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        C1761a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            l.d(baseResponse, "");
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(47517);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(f fVar) {
        Integer a2;
        l.d(fVar, "");
        e eVar = e.a.f91018a;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        if (g3.isLogin() && !TextUtils.isEmpty(curUserId)) {
            if (l.a((Object) eVar.a("settings_times_".concat(String.valueOf(curUserId)), ""), (Object) "") || l.a((Object) eVar.a("not_now_times_".concat(String.valueOf(curUserId)), ""), (Object) "") || !eVar.a("comment_filter_function_open_".concat(String.valueOf(curUserId)), (Boolean) false).booleanValue()) {
                eVar.b("settings_times_".concat(String.valueOf(curUserId)), "0");
                eVar.b("not_now_times_".concat(String.valueOf(curUserId)), "0");
                eVar.b("comment_filter_function_open_".concat(String.valueOf(curUserId)), (Boolean) true);
            }
            Boolean a3 = eVar.a("comment_filter_function_open_".concat(String.valueOf(curUserId)), (Boolean) false);
            l.b(a3, "");
            if (a3.booleanValue() && (a2 = eVar.a("comment_filter_status_".concat(String.valueOf(curUserId)), (Integer) 0)) != null && a2.intValue() == 0 && fVar.O > 0) {
                eVar.b("settings_times_".concat(String.valueOf(curUserId)), "1");
                eVar.b("not_now_times_".concat(String.valueOf(curUserId)), "2");
            }
            eVar.b("comment_filter_status_".concat(String.valueOf(curUserId)), Integer.valueOf(fVar.O));
            eVar.b("comment_offensive_filter_".concat(String.valueOf(curUserId)), Integer.valueOf(fVar.P));
            eVar.b("author_review_all_comments_".concat(String.valueOf(curUserId)), Boolean.valueOf(fVar.Q));
            eVar.b("filter_comment_manager_visible_".concat(String.valueOf(curUserId)), Boolean.valueOf(fVar.R));
            if (!eVar.a("comment_filter_status_synced_".concat(String.valueOf(curUserId)), (Boolean) false).booleanValue()) {
                if (fVar.O == 1) {
                    CommentFilterApi.f76867a.triggerSyncServerCommentFilter().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new C1761a());
                }
                eVar.b("comment_filter_status_synced_".concat(String.valueOf(curUserId)), (Boolean) true);
            }
        }
    }

    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f76878a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f76879b;

        static {
            Covode.recordClassIndex(47520);
        }

        public c(e eVar, String str) {
            this.f76878a = eVar;
            this.f76879b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String a2 = this.f76878a.a("not_now_times_" + this.f76879b, "0");
            l.b(a2, "");
            this.f76878a.b("not_now_times_" + this.f76879b, String.valueOf(Integer.parseInt(a2) + 1));
            dialogInterface.dismiss();
        }
    }

    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f76875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f76876b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f76877c;

        static {
            Covode.recordClassIndex(47519);
        }

        public b(e eVar, String str, Activity activity) {
            this.f76875a = eVar;
            this.f76876b = str;
            this.f76877c = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String a2 = this.f76875a.a("settings_times_" + this.f76876b, "0");
            l.b(a2, "");
            this.f76875a.b("settings_times_" + this.f76876b, String.valueOf(Integer.parseInt(a2) + 1));
            SmartRouter.buildRoute(this.f76877c, "aweme://filtercomments").open();
            r.a("enter_filter_comment", new d().a("enter_from", "comment_panel").f66730a);
        }
    }
}
