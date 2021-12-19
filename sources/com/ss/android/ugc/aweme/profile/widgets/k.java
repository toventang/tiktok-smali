package com.ss.android.ugc.aweme.profile.widgets;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.bx;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class k implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final a f117905f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<b> f117906a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.user.c f117907b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f117908c;

    /* renamed from: d  reason: collision with root package name */
    public final e f117909d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.profile.e.a f117910e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f117911g;

    public interface b {
        static {
            Covode.recordClassIndex(76405);
        }

        void c();
    }

    static {
        Covode.recordClassIndex(76403);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(76404);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f117920a;

        static {
            Covode.recordClassIndex(76407);
        }

        d(k kVar) {
            this.f117920a = kVar;
        }

        public final void run() {
            final String str = this.f117920a.f117907b.f142345a;
            IAccountUserService e2 = AccountService.a().e();
            l.b(e2, "");
            User curUser = e2.getCurUser();
            l.b(curUser, "");
            final String uid = curUser.getUid();
            r.a("switch_account_submit", new com.ss.android.ugc.aweme.app.f.d().a("from_uid", uid).a("target_uid", str).a("enter_method", this.f117920a.f117910e.f116065b).a("enter_from", this.f117920a.f117910e.f116064a).f66730a);
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", this.f117920a.f117910e.f116064a);
            bundle.putString("enter_method", this.f117920a.f117910e.f116065b);
            com.ss.android.ugc.aweme.account.b.b().switchAccount(this.f117920a.f117907b, bundle, new bx(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.k.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f117922a;

                static {
                    Covode.recordClassIndex(76408);
                }

                @Override // com.ss.android.ugc.aweme.bx
                public final void a() {
                    this.f117922a.f117920a.a();
                    r.a("switch_account_result", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").a("enter_method", "unfold_triangle").a("from_uid", uid).a("target_uid", str).a("status", 1).f66730a);
                }

                @Override // com.ss.android.ugc.aweme.bx
                public final void a(Integer num, String str) {
                    Activity j2;
                    this.f117922a.f117920a.a();
                    int i2 = -1;
                    if ((num == null || num.intValue() != 1349) && (j2 = f.j()) != null) {
                        if (num == null || num.intValue() <= 0 || str == null || TextUtils.isEmpty(str)) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(j2).a(R.string.bpf).a();
                        } else {
                            new com.ss.android.ugc.aweme.tux.a.i.a(j2).a(str).a();
                        }
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("status", 0);
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    r.a("switch_account_result", a2.a("fail_info", i2).f66730a);
                }

                {
                    this.f117922a = r1;
                }
            });
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f117917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f117918b = 8;

        static {
            Covode.recordClassIndex(76406);
        }

        c(k kVar) {
            this.f117917a = kVar;
        }

        public final void run() {
            if (com.ss.android.ugc.aweme.account.b.g().allUidList().size() < this.f117918b) {
                e eVar = this.f117917a.f117909d;
                String str = this.f117917a.f117910e.f116064a;
                String str2 = this.f117917a.f117910e.f116065b;
                l.d(str, "");
                l.d(str2, "");
                ap apVar = new ap();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                com.ss.android.ugc.aweme.login.c.a(eVar, str, str2, apVar.a("previous_uid", g2.getCurUserId()).a("force_use_default_login_method", true).a("is_multi_account", true).a("is_fullscreen_dialog", true).a("is_skippable_dialog", true).a("need_auto_fill_latest_login_info", false).f142646a);
                return;
            }
            String string = this.f117917a.f117908c.getString(R.string.p1, Integer.valueOf(this.f117918b));
            l.b(string, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f117917a.f117908c).a(string).a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070 A[Catch:{ all -> 0x0078 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.k.a():void");
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (!this.f117911g) {
            this.f117911g = true;
            if (in.d()) {
                n.a("child_mode_click_switch_account", "", (JSONObject) null);
            }
            MultiAccountService.c();
            if (l.a((Object) this.f117907b.f142345a, (Object) "-1")) {
                a();
                if (com.ss.android.ugc.aweme.account.b.g().allUidList().size() == 8) {
                    String string = this.f117908c.getString(R.string.p1, 8);
                    l.b(string, "");
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f117908c).a(string).a();
                    return;
                }
                com.ss.android.ugc.aweme.compliance.api.a.o().a(this.f117908c, "add_account", new c(this));
            } else if (AVExternalServiceImpl.a().publishService().isPublishable()) {
                com.ss.android.ugc.aweme.compliance.api.a.o().a(this.f117908c, "switch_account", new d(this));
            } else {
                a();
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f117908c).a(R.string.f0w).a();
            }
        }
    }

    public k(WeakReference<b> weakReference, com.ss.android.ugc.aweme.user.c cVar, Context context, e eVar, com.ss.android.ugc.aweme.profile.e.a aVar) {
        l.d(weakReference, "");
        l.d(cVar, "");
        l.d(context, "");
        l.d(eVar, "");
        l.d(aVar, "");
        this.f117906a = weakReference;
        this.f117907b = cVar;
        this.f117908c = context;
        this.f117909d = eVar;
        this.f117910e = aVar;
    }
}
