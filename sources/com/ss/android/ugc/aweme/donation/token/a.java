package com.ss.android.ugc.aweme.donation.token;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.ss.android.newmedia.d;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.donation.token.DonationTokenCreateApi;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.f.b.z;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83035a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final IAccountService f83036b = AccountService.a();

    private a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.donation.token.a$a  reason: collision with other inner class name */
    public static final class C1951a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f83037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f83038b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f83039c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f83040d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f83041e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f83042f;

        static {
            Covode.recordClassIndex(51770);
        }

        C1951a(Context context, String str, int i2, String str2, String str3, h.f.a.b bVar) {
            this.f83037a = context;
            this.f83038b = str;
            this.f83039c = i2;
            this.f83040d = str2;
            this.f83041e = str3;
            this.f83042f = bVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            a.b(this.f83037a, this.f83038b, this.f83039c, this.f83040d, this.f83041e, this.f83042f);
        }
    }

    static {
        Covode.recordClassIndex(51769);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f83047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f83048b;

        static {
            Covode.recordClassIndex(51772);
        }

        c(z.e eVar, Context context) {
            this.f83047a = eVar;
            this.f83048b = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            bt.b(this.f83047a.element);
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) obj);
            Context context = this.f83048b;
            if (context != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(context.getString(R.string.exo)).a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f83043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f83044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f83045c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f83046d;

        static {
            Covode.recordClassIndex(51771);
        }

        b(z.e eVar, h.f.a.b bVar, String str, Context context) {
            this.f83043a = eVar;
            this.f83044b = bVar;
            this.f83045c = str;
            this.f83046d = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            DonationTokenResponse donationTokenResponse = (DonationTokenResponse) obj;
            bt.b(this.f83043a.element);
            if (donationTokenResponse.status_code == 0) {
                DonationTokenBean data = donationTokenResponse.getData();
                String str2 = null;
                if (data != null) {
                    str = data.getToken();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    DonationTokenBean data2 = donationTokenResponse.getData();
                    if (data2 != null) {
                        data2.getToken();
                    }
                    h.f.a.b bVar = this.f83044b;
                    String str3 = this.f83045c;
                    DonationTokenBean data3 = donationTokenResponse.getData();
                    if (data3 != null) {
                        str2 = data3.getToken();
                    }
                    if (str3 != null && d.a(str3) && !TextUtils.isEmpty(str2)) {
                        StringBuilder sb = new StringBuilder(str3);
                        if (!p.e((CharSequence) str3, (CharSequence) "?")) {
                            sb.append("?");
                        } else {
                            sb.append("&");
                        }
                        sb.append(str2);
                        str3 = sb.toString();
                    }
                    bVar.invoke(str3);
                    return;
                }
            }
            Context context = this.f83046d;
            if (context != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(context.getString(R.string.exo)).a();
            }
        }
    }

    public static void a(Context context, String str, int i2, String str2, String str3, h.f.a.b<? super String, h.z> bVar) {
        l.d(bVar, "");
        IAccountUserService e2 = f83036b.e();
        l.b(e2, "");
        if (e2.isLogin()) {
            b(context, str, i2, str2, str3, bVar);
        } else if (context instanceof Activity) {
            com.ss.android.ugc.aweme.login.c.a((Activity) context, "", "", new C1951a(context, str, i2, str2, str3, bVar));
        }
    }

    public static void b(Context context, String str, int i2, String str2, String str3, h.f.a.b<? super String, h.z> bVar) {
        Long l2;
        t<DonationTokenResponse> tVar;
        z.e eVar = new z.e();
        eVar.element = null;
        if (context instanceof Activity) {
            eVar.element = (T) new o((Activity) context);
            bt.a(eVar.element);
        }
        if (i2 == 3) {
            tVar = DonationTokenCreateApi.a.a().tokenCreate(i2, 0L, str, str3);
        } else {
            DonationTokenCreateApi a2 = DonationTokenCreateApi.a.a();
            if (str != null) {
                l2 = Long.valueOf(Long.parseLong(str));
            } else {
                l2 = null;
            }
            tVar = a2.tokenCreate(i2, l2, null, str3);
        }
        tVar.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(eVar, bVar, str2, context), new c(eVar, context));
    }
}
