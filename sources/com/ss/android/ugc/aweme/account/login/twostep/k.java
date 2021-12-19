package com.ss.android.ugc.aweme.account.login.twostep;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.n;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.utils.ai;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k extends n implements TwoStepAuthActivity.b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f63956d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final a f63957e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LoadingButton f63958a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f63959b;

    /* renamed from: c  reason: collision with root package name */
    public String f63960c;

    public static final class a {
        static {
            Covode.recordClassIndex(39409);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(39408);
    }

    @Override // com.ss.android.ugc.aweme.account.login.twostep.n
    public final View a() {
        MethodCollector.i(8762);
        if (this.f63984k.getLayoutResource() <= 0) {
            this.f63984k.setLayoutResource(R.layout.h1);
        }
        View inflate = this.f63984k.inflate();
        l.b(inflate, "");
        View findViewById = inflate.findViewById(R.id.cie);
        l.b(findViewById, "");
        this.f63959b = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.cid);
        l.b(findViewById2, "");
        LoadingButton loadingButton = (LoadingButton) findViewById2;
        this.f63958a = loadingButton;
        if (loadingButton == null) {
            l.a("verifyButton");
        }
        com.bytedance.ies.dmt.ui.f.c.a(loadingButton, 0.5f);
        LoadingButton loadingButton2 = this.f63958a;
        if (loadingButton2 == null) {
            l.a("verifyButton");
        }
        loadingButton2.setEnabled(false);
        LoadingButton loadingButton3 = this.f63958a;
        if (loadingButton3 == null) {
            l.a("verifyButton");
        }
        loadingButton3.setOnClickListener(new c(this));
        if (this.f63981h == null) {
            a((Integer) null, "JSON is empty");
        } else {
            ai.a(new b(this), "BoltsUtils");
        }
        MethodCollector.o(8762);
        return inflate;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f63961a;

        static {
            Covode.recordClassIndex(39410);
        }

        b(k kVar) {
            this.f63961a = kVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONArray jSONArray;
            final int i2;
            JSONObject jSONObject2 = this.f63961a.f63981h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            k kVar = this.f63961a;
            String a2 = g.a(jSONObject, "verify_ticket", "");
            l.b(a2, "");
            kVar.d(a2);
            if (jSONObject != null) {
                jSONArray = jSONObject.getJSONArray("platforms");
            } else {
                jSONArray = null;
            }
            if (TextUtils.isEmpty(this.f63961a.f63983j) || jSONArray == null || jSONArray.length() <= 0) {
                this.f63961a.a((Integer) null, "Verify ticket or platform is unavailable");
                return;
            }
            this.f63961a.f63960c = jSONArray.getString(0);
            String str = this.f63961a.f63960c;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1240244679:
                        if (str.equals("google")) {
                            i2 = 2131231064;
                            ai.b(new Runnable(this) {
                                /* class com.ss.android.ugc.aweme.account.login.twostep.k.b.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ b f63962a;

                                static {
                                    Covode.recordClassIndex(39411);
                                }

                                {
                                    this.f63962a = r1;
                                }

                                public final void run() {
                                    k.a(this.f63962a.f63961a).setEnabled(true);
                                    ImageView imageView = this.f63962a.f63961a.f63959b;
                                    if (imageView == null) {
                                        l.a("providerImage");
                                    }
                                    imageView.setImageResource(i2);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case -916346253:
                        if (str.equals("twitter")) {
                            i2 = 2131231068;
                            ai.b(new Runnable(this) {
                                /* class com.ss.android.ugc.aweme.account.login.twostep.k.b.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ b f63962a;

                                static {
                                    Covode.recordClassIndex(39411);
                                }

                                {
                                    this.f63962a = r1;
                                }

                                public final void run() {
                                    k.a(this.f63962a.f63961a).setEnabled(true);
                                    ImageView imageView = this.f63962a.f63961a.f63959b;
                                    if (imageView == null) {
                                        l.a("providerImage");
                                    }
                                    imageView.setImageResource(i2);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 3765:
                        if (str.equals("vk")) {
                            i2 = 2131231069;
                            ai.b(new Runnable(this) {
                                /* class com.ss.android.ugc.aweme.account.login.twostep.k.b.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ b f63962a;

                                static {
                                    Covode.recordClassIndex(39411);
                                }

                                {
                                    this.f63962a = r1;
                                }

                                public final void run() {
                                    k.a(this.f63962a.f63961a).setEnabled(true);
                                    ImageView imageView = this.f63962a.f63961a.f63959b;
                                    if (imageView == null) {
                                        l.a("providerImage");
                                    }
                                    imageView.setImageResource(i2);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 3321844:
                        if (str.equals("line")) {
                            i2 = 2131231067;
                            ai.b(new Runnable(this) {
                                /* class com.ss.android.ugc.aweme.account.login.twostep.k.b.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ b f63962a;

                                static {
                                    Covode.recordClassIndex(39411);
                                }

                                {
                                    this.f63962a = r1;
                                }

                                public final void run() {
                                    k.a(this.f63962a.f63961a).setEnabled(true);
                                    ImageView imageView = this.f63962a.f63961a.f63959b;
                                    if (imageView == null) {
                                        l.a("providerImage");
                                    }
                                    imageView.setImageResource(i2);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 28903346:
                        if (str.equals("instagram")) {
                            i2 = 2131231065;
                            ai.b(new Runnable(this) {
                                /* class com.ss.android.ugc.aweme.account.login.twostep.k.b.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ b f63962a;

                                static {
                                    Covode.recordClassIndex(39411);
                                }

                                {
                                    this.f63962a = r1;
                                }

                                public final void run() {
                                    k.a(this.f63962a.f63961a).setEnabled(true);
                                    ImageView imageView = this.f63962a.f63961a.f63959b;
                                    if (imageView == null) {
                                        l.a("providerImage");
                                    }
                                    imageView.setImageResource(i2);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 486515695:
                        if (str.equals("kakaotalk")) {
                            i2 = 2131231066;
                            ai.b(new Runnable(this) {
                                /* class com.ss.android.ugc.aweme.account.login.twostep.k.b.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ b f63962a;

                                static {
                                    Covode.recordClassIndex(39411);
                                }

                                {
                                    this.f63962a = r1;
                                }

                                public final void run() {
                                    k.a(this.f63962a.f63961a).setEnabled(true);
                                    ImageView imageView = this.f63962a.f63961a.f63959b;
                                    if (imageView == null) {
                                        l.a("providerImage");
                                    }
                                    imageView.setImageResource(i2);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 497130182:
                        if (str.equals("facebook")) {
                            i2 = 2131231063;
                            ai.b(new Runnable(this) {
                                /* class com.ss.android.ugc.aweme.account.login.twostep.k.b.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ b f63962a;

                                static {
                                    Covode.recordClassIndex(39411);
                                }

                                {
                                    this.f63962a = r1;
                                }

                                public final void run() {
                                    k.a(this.f63962a.f63961a).setEnabled(true);
                                    ImageView imageView = this.f63962a.f63961a.f63959b;
                                    if (imageView == null) {
                                        l.a("providerImage");
                                    }
                                    imageView.setImageResource(i2);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                }
            }
            this.f63961a.a((Integer) null, "Unknown third party platform: " + this.f63961a.f63960c);
        }
    }

    public static final /* synthetic */ LoadingButton a(k kVar) {
        LoadingButton loadingButton = kVar.f63958a;
        if (loadingButton == null) {
            l.a("verifyButton");
        }
        return loadingButton;
    }

    public final void a(String str) {
        LoadingButton loadingButton = this.f63958a;
        if (loadingButton == null) {
            l.a("verifyButton");
        }
        loadingButton.b(true);
        e(str);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f63964a;

        static {
            Covode.recordClassIndex(39412);
        }

        c(k kVar) {
            this.f63964a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            k.a(this.f63964a).a(true);
            Intent intent = new Intent(this.f63964a.d(), AuthorizeActivity.class);
            intent.putExtra("platform", this.f63964a.f63960c);
            intent.putExtra("is_only_fetch_token", true);
            intent.putExtra("is_login", false);
            if (this.f63964a.d() instanceof TwoStepAuthActivity) {
                androidx.appcompat.app.d d2 = this.f63964a.d();
                Objects.requireNonNull(d2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity");
                ((TwoStepAuthActivity) d2).f63734e = this.f63964a;
            }
            androidx.appcompat.app.d d3 = this.f63964a.d();
            if (d3 != null) {
                d3.startActivityForResult(intent, 123);
            }
        }
    }

    static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f63965a;

        static {
            Covode.recordClassIndex(39413);
        }

        d(k kVar) {
            this.f63965a = kVar;
        }

        @Override // b.g
        public final Object then(i<TwoStepAuthApi.c> iVar) {
            Integer num;
            String str;
            if (!ai.a(iVar)) {
                this.f63965a.a((Integer) null, "TwoStepAuthApi.verifyThirdParty bolts Task error");
                return null;
            }
            l.b(iVar, "");
            TwoStepAuthApi.c d2 = iVar.d();
            if (!p.a("success", d2.f63762a, true) || d2.f63763b == null || TextUtils.isEmpty(d2.f63763b.f63764a)) {
                TwoStepAuthApi.c.a aVar = d2.f63763b;
                if (aVar != null) {
                    num = aVar.f63766c;
                } else {
                    num = null;
                }
                TwoStepAuthApi.c.a aVar2 = d2.f63763b;
                if (aVar2 != null) {
                    str = aVar2.f63767d;
                } else {
                    str = null;
                }
                this.f63965a.a(num, str);
                if (str != null) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f63965a.d()).a(str).a();
                }
                return null;
            }
            this.f63965a.a(d2.f63763b.f63764a);
            return z.f158842a;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(Integer num, String str) {
        LoadingButton loadingButton = this.f63958a;
        if (loadingButton == null) {
            l.a("verifyButton");
        }
        loadingButton.b(true);
        new com.ss.android.ugc.aweme.tux.a.i.a(d()).a(b(num, str)).a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.d dVar, ViewStub viewStub, n.a aVar) {
        super(dVar, viewStub, aVar);
        l.d(dVar, "");
        l.d(viewStub, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity.b
    public final void a(int i2, int i3, Intent intent) {
        Integer num;
        String str;
        String str2;
        String str3;
        Integer num2;
        String str4;
        if (i2 == 123) {
            String str5 = null;
            if (i3 == -1) {
                if (intent != null) {
                    str = a(intent, "access_token");
                    str2 = a(intent, "access_token_secret");
                    str3 = a(intent, "code");
                    num2 = Integer.valueOf(intent.getIntExtra("expires_in", 0));
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    num2 = null;
                }
                if (intent == null || (str4 = a(intent, "platform_id")) == null) {
                    str4 = "";
                }
                l.b(str4, "");
                TwoStepAuthApi.a().verifyThirdParty(str, str2, str3, num2, 0, this.f63960c, Integer.valueOf(com.ss.android.ugc.aweme.account.n.k.a(str4)), null, this.f63983j).a(new d(this), i.f4826c, null);
                return;
            }
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("error_code", 0));
                str5 = a(intent, "description");
            } else {
                num = null;
            }
            a(num, str5);
        }
    }
}
