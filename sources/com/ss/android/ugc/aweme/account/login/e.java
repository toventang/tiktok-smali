package com.ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.f.a;
import com.ss.android.ugc.aweme.account.k.d;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.v2.a.v;
import com.ss.android.ugc.aweme.account.login.v2.base.g;
import com.ss.android.ugc.aweme.account.views.b;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public abstract class e extends b implements a.b, g, com.ss.android.ugc.aweme.base.c.b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f63407a;

    /* renamed from: b  reason: collision with root package name */
    protected Activity f63408b;

    /* renamed from: c  reason: collision with root package name */
    protected Bundle f63409c;

    /* renamed from: d  reason: collision with root package name */
    protected String f63410d;

    /* renamed from: e  reason: collision with root package name */
    protected String f63411e;

    /* renamed from: f  reason: collision with root package name */
    protected String f63412f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f63413g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f63414h;

    /* renamed from: i  reason: collision with root package name */
    protected View f63415i;

    /* renamed from: j  reason: collision with root package name */
    public String f63416j;

    static {
        Covode.recordClassIndex(39078);
    }

    public void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final String W_() {
        return this.f63410d;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final String X_() {
        return this.f63411e;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final String Y_() {
        return this.f63412f;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final Bundle aa_() {
        return this.f63409c;
    }

    public void cancel() {
        super.cancel();
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void show() {
        this.f63407a = false;
        try {
            if (getOwnerActivity() == null || !getOwnerActivity().isFinishing()) {
                super.show();
                cj.a(1, 1, "");
            }
        } catch (Exception unused) {
        }
    }

    public void dismiss() {
        this.f63407a = true;
        super.dismiss();
        a.b(this);
        if (this.f63413g) {
            this.f63413g = false;
            return;
        }
        cj.a(1, 4, "");
        if (!this.f63414h) {
            new Handler().postDelayed(f.f63442a, 200);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.views.b
    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(n.a(getContext()), -2);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.f.a.b
    public final void a(int i2) {
        if (i2 == 11 && !this.f63407a) {
            try {
                dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.c.b
    public final String a(com.ss.android.ugc.aweme.base.c.a aVar) {
        String str = aVar.f68040a;
        str.hashCode();
        if (!str.equals("login")) {
            if (str.equals("dismiss")) {
                cancel();
            }
        } else if (!aVar.b()) {
            return null;
        } else {
            getContext();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = e();
            }
            if (!j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.de8).a();
                return null;
            }
            this.f63413g = true;
            if (isShowing()) {
                dismiss();
            }
            a((String) aVar.a());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        this.f63416j = str;
        if (this.f63409c != null) {
            d dVar = new d();
            dVar.f63120b = this.f63409c.getString("enter_from");
            l.d(str, "");
            dVar.f63121c = str;
            dVar.a();
        }
        v.a((Boolean) false, str, (g) this, false, (Map<String, ? extends Object>) null, false);
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) com.ss.android.ugc.aweme.a.a(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.a("Mob.Event.LOGIN_SUBMIT_".concat(String.valueOf(str)));
            iFeed0VVManagerService.b("LOGIN");
        }
        Intent intent = new Intent(this.f63408b, AuthorizeActivity.class);
        Bundle bundle = this.f63409c;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("platform", str);
        intent.putExtra("enter_from", this.f63410d);
        intent.putExtra("enter_method", this.f63411e);
        intent.putExtra("enter_type", this.f63412f);
        Activity activity = this.f63408b;
        if (activity != null) {
            activity.startActivityForResult(intent, 1001);
        }
        a(str, this.f63410d, this.f63411e);
    }

    public e(Activity activity, Bundle bundle) {
        this(activity, bundle, (byte) 0);
    }

    private e(Activity activity, Bundle bundle, byte b2) {
        super(activity);
        this.f63408b = activity;
        this.f63409c = bundle;
        a(activity);
        Bundle bundle2 = this.f63409c;
        if (bundle2 != null) {
            this.f63410d = bundle2.getString("enter_from");
            this.f63411e = this.f63409c.getString("enter_method");
            this.f63412f = this.f63409c.getString("enter_type");
        }
    }

    private static void a(String str, String str2, String str3) {
        r.a("login_choose_platform", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", str3).a("enter_from", str2).a("platform", str).a("_perf_monitor", 1).f62575a);
    }
}
