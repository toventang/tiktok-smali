package com.ss.android.ugc.aweme.share.qrcode;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.a.aw;
import com.ss.android.ugc.aweme.share.improve.e.a;
import com.ss.android.ugc.aweme.share.improve.f.d;
import com.ss.android.ugc.aweme.share.qrcode.b.a;
import com.ss.android.ugc.aweme.share.qrcode.pkg.QRCodeSharePackage;
import com.ss.android.ugc.aweme.share.qrcode.view.QRCodeBackgroundLayout;
import com.ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView;
import com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView;
import com.ss.android.ugc.aweme.share.qrcode.view.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.u;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Objects;

public final class UserQRCodeActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f124148b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final j f124149a = new j(this);

    /* renamed from: c  reason: collision with root package name */
    private View f124150c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f124151d;

    /* renamed from: e  reason: collision with root package name */
    private View f124152e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f124153f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f124154g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f124155h;

    /* renamed from: i  reason: collision with root package name */
    private SmartAvatarBorderView f124156i;

    /* renamed from: j  reason: collision with root package name */
    private UserQRCodeControlView f124157j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f124158k;

    /* renamed from: l  reason: collision with root package name */
    private QRCodeSquareView f124159l;

    /* renamed from: m  reason: collision with root package name */
    private QRCodeBackgroundLayout f124160m;
    private final c n = new c(this);
    private final View.OnClickListener o = new f(this);
    private final View.OnClickListener p = new g(this);
    private SparseArray q;

    public interface b {
        static {
            Covode.recordClassIndex(81543);
        }

        void a(QRCodeSquareView qRCodeSquareView, QRCodeBackgroundLayout qRCodeBackgroundLayout, com.ss.android.ugc.aweme.share.qrcode.view.a aVar);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f124162a = new d();

        static {
            Covode.recordClassIndex(81545);
        }

        d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(81541);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.q == null) {
            this.q = new SparseArray();
        }
        View view = (View) this.q.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.q.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81542);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class m implements com.ss.android.ugc.aweme.sharer.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserQRCodeActivity f124177a;

        static {
            Covode.recordClassIndex(81556);
        }

        @Override // com.ss.android.ugc.aweme.sharer.a.a
        public final Activity a() {
            return this.f124177a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(UserQRCodeActivity userQRCodeActivity) {
            this.f124177a = userQRCodeActivity;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $view;
        final /* synthetic */ UserQRCodeActivity this$0;

        static {
            Covode.recordClassIndex(81549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(UserQRCodeActivity userQRCodeActivity, View view) {
            super(0);
            this.this$0 = userQRCodeActivity;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(new b(this) {
                /* class com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f124166a;

                static {
                    Covode.recordClassIndex(81550);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f124166a = r1;
                }

                @Override // com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity.b
                public final void a(QRCodeSquareView qRCodeSquareView, QRCodeBackgroundLayout qRCodeBackgroundLayout, com.ss.android.ugc.aweme.share.qrcode.view.a aVar) {
                    h.f.b.l.d(qRCodeSquareView, "");
                    h.f.b.l.d(qRCodeBackgroundLayout, "");
                    h.f.b.l.d(aVar, "");
                    Context baseContext = this.f124166a.this$0.getBaseContext();
                    h.f.b.l.b(baseContext, "");
                    a.C3235a.a(baseContext, qRCodeSquareView, this.f124166a.$view, qRCodeBackgroundLayout, aVar, true, false, null);
                }
            });
            return z.f158842a;
        }
    }

    public static final class i implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QRCodeSquareView f124167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.share.qrcode.view.a f124168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ QRCodeBackgroundLayout f124169c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UserQRCodeActivity f124170d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f124171e;

        static {
            Covode.recordClassIndex(81551);
        }

        @Override // com.ss.android.ugc.aweme.share.qrcode.view.a.b
        public final void a() {
            this.f124171e.a(this.f124167a, this.f124169c, this.f124168b);
        }

        i(QRCodeSquareView qRCodeSquareView, com.ss.android.ugc.aweme.share.qrcode.view.a aVar, QRCodeBackgroundLayout qRCodeBackgroundLayout, UserQRCodeActivity userQRCodeActivity, b bVar) {
            this.f124167a = qRCodeSquareView;
            this.f124168b = aVar;
            this.f124169c = qRCodeBackgroundLayout;
            this.f124170d = userQRCodeActivity;
            this.f124171e = bVar;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public final void a() {
        if (MSAdaptionService.c().b((Context) this)) {
            Toast makeText = Toast.makeText(this, getString(R.string.bey), 0);
            if (Build.VERSION.SDK_INT == 25) {
                ic.a(makeText);
            }
            makeText.show();
            return;
        }
        r.a("qr_code_scan_enter", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "qr_code_detail").a("previous_page", "personal_homepage").f66730a);
        com.ss.android.ugc.aweme.qrcode.k.f119754a.a((Context) this, false, true);
    }

    public static final class k implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f124173a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f124174b;

        static {
            Covode.recordClassIndex(81553);
        }

        public static final class a implements a.C3235a.AbstractC3236a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f124175a;

            static {
                Covode.recordClassIndex(81554);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(k kVar) {
                this.f124175a = kVar;
            }

            @Override // com.ss.android.ugc.aweme.share.qrcode.b.a.C3235a.AbstractC3236a
            public final void a(Uri uri, String str, boolean z) {
                com.ss.android.ugc.aweme.sharer.l lVar;
                String str2 = "";
                if (z) {
                    if (str != null) {
                        lVar = new com.ss.android.ugc.aweme.sharer.l(com.ss.android.ugc.aweme.share.improve.c.c.a(str, com.bytedance.ies.ugc.appcontext.d.a()), str, null, 60);
                    } else {
                        return;
                    }
                } else if (uri != null) {
                    String a2 = c.d.a.a(this.f124175a.f124173a, uri);
                    h.f.b.l.b(a2, str2);
                    lVar = new com.ss.android.ugc.aweme.sharer.l(uri, a2, null, 60);
                } else {
                    return;
                }
                com.ss.android.ugc.aweme.sharer.b bVar = this.f124175a.f124174b;
                String str3 = lVar.f124580g;
                if (str3 != null) {
                    str2 = str3;
                }
                lVar.a("content_url", str2);
                lVar.a("media_type", "image/png");
                bVar.a(lVar, this.f124175a.f124173a);
            }
        }

        k(Context context, com.ss.android.ugc.aweme.sharer.b bVar) {
            this.f124173a = context;
            this.f124174b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity.b
        public final void a(QRCodeSquareView qRCodeSquareView, QRCodeBackgroundLayout qRCodeBackgroundLayout, com.ss.android.ugc.aweme.share.qrcode.view.a aVar) {
            h.f.b.l.d(qRCodeSquareView, "");
            h.f.b.l.d(qRCodeBackgroundLayout, "");
            h.f.b.l.d(aVar, "");
            a.C3235a.a(this.f124173a, qRCodeSquareView, null, qRCodeBackgroundLayout, aVar, false, true, new a(this));
        }
    }

    public static final class c implements UserQRCodeControlView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserQRCodeActivity f124161a;

        static {
            Covode.recordClassIndex(81544);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(UserQRCodeActivity userQRCodeActivity) {
            this.f124161a = userQRCodeActivity;
        }

        @Override // com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f124161a.saveToDevice(view);
        }

        @Override // com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
            this.f124161a.a();
        }

        @Override // com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.a
        public final void a(com.ss.android.ugc.aweme.sharer.b bVar) {
            h.f.b.l.d(bVar, "");
            if (bVar instanceof com.ss.android.ugc.aweme.share.qrcode.a.a) {
                this.f124161a.saveToDevice(null);
                return;
            }
            UserQRCodeActivity userQRCodeActivity = this.f124161a;
            userQRCodeActivity.a(bVar, userQRCodeActivity);
        }
    }

    public static final class j implements QRCodeSharePackage.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserQRCodeActivity f124172a;

        static {
            Covode.recordClassIndex(81552);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(UserQRCodeActivity userQRCodeActivity) {
            this.f124172a = userQRCodeActivity;
        }

        @Override // com.ss.android.ugc.aweme.share.qrcode.pkg.QRCodeSharePackage.a
        public final void a(com.ss.android.ugc.aweme.sharer.b bVar, Context context) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(context, "");
            if (bVar instanceof com.ss.android.ugc.aweme.share.qrcode.a.a) {
                this.f124172a.saveToDevice(null);
            } else {
                this.f124172a.a(bVar, context);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserQRCodeActivity f124164a;

        static {
            Covode.recordClassIndex(81547);
        }

        f(UserQRCodeActivity userQRCodeActivity) {
            this.f124164a = userQRCodeActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f124164a.finish();
        }
    }

    public final void saveToDevice(View view) {
        aw.a(this, new h(this, view));
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f124176a = new l();

        static {
            Covode.recordClassIndex(81555);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            boolean z;
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            if (a.C3219a.a().isEmpty() || h.f.b.l.a((Object) bVar2.a(), (Object) "download") || h.f.b.l.a((Object) bVar2.a(), (Object) "qr_code_save")) {
                z = true;
            } else {
                z = a.C3219a.a().contains(bVar2.a());
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f124163a = new e();

        static {
            Covode.recordClassIndex(81546);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            int i2;
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            if (com.ss.android.ugc.aweme.share.f.c.b()) {
                i2 = R.raw.icon_scan;
            } else {
                i2 = R.raw.icon_arrow_turn_up_right;
            }
            aVar2.f44749a = i2;
            aVar2.f44753e = Integer.valueOf((int) R.attr.f159902m);
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    public final void a(b bVar) {
        QRCodeSquareView qRCodeSquareView;
        QRCodeSquareView qRCodeSquareView2 = this.f124159l;
        if (qRCodeSquareView2 == null || qRCodeSquareView2.f124222b) {
            QRCodeBackgroundLayout qRCodeBackgroundLayout = this.f124160m;
            if (qRCodeBackgroundLayout != null && (qRCodeSquareView = this.f124159l) != null) {
                com.ss.android.ugc.aweme.share.qrcode.view.a aVar = new com.ss.android.ugc.aweme.share.qrcode.view.a(this, (byte) 0);
                aVar.setCallback(new i(qRCodeSquareView, aVar, qRCodeBackgroundLayout, this, bVar));
                aVar.a(qRCodeSquareView.getQrCodeUrl());
                return;
            }
            return;
        }
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        new com.ss.android.ugc.aweme.tux.a.i.a(a2).a(a2.getString(R.string.bbo)).a();
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserQRCodeActivity f124165a;

        static {
            Covode.recordClassIndex(81548);
        }

        g(UserQRCodeActivity userQRCodeActivity) {
            this.f124165a = userQRCodeActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (com.ss.android.ugc.aweme.share.f.c.b()) {
                this.f124165a.a();
                return;
            }
            UserQRCodeActivity userQRCodeActivity = this.f124165a;
            e.b bVar = new e.b();
            j jVar = userQRCodeActivity.f124149a;
            h.f.b.l.d(jVar, "");
            QRCodeSharePackage qRCodeSharePackage = new QRCodeSharePackage(new SharePackage.a().a("qr_code"));
            qRCodeSharePackage.f124203a = jVar;
            e.b a2 = bVar.a(qRCodeSharePackage);
            m mVar = new m(userQRCodeActivity);
            int a3 = com.ss.android.ugc.aweme.share.f.c.a();
            if (a3 == 2 || a3 == 3) {
                a2.a(new com.ss.android.ugc.aweme.share.qrcode.a.a());
            }
            Drawable drawable = null;
            com.ss.android.ugc.aweme.sharer.b a4 = com.ss.android.ugc.aweme.sharer.c.a("whatsapp", null);
            if (a4 != null) {
                drawable = a4.a(userQRCodeActivity.getBaseContext());
            }
            com.ss.android.ugc.aweme.sharer.d dVar = new com.ss.android.ugc.aweme.sharer.d("www.tiktokv.com", mVar, drawable, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cc2));
            com.ss.android.ugc.aweme.sharer.c.a("snapchat", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("instagram", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("instagram_story", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("whatsapp_status", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("zalo", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("kakaotalk", dVar, a2);
            if (com.ss.android.ugc.aweme.sharer.a.d.a(userQRCodeActivity, "com.facebook.katana")) {
                com.ss.android.ugc.aweme.sharer.c.a("facebook", dVar, a2);
            }
            com.ss.android.ugc.aweme.sharer.c.a("facebook_lite", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("messenger", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("messenger_lite", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("sms", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("twitter", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("viber", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("vk", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("whatsapp", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("line", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("email", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("imgur", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("kakao_story", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("naver_blog", dVar, a2);
            com.ss.android.ugc.aweme.sharer.c.a("more", dVar, a2);
            d.a.a();
            a2.o = false;
            a2.f124671j = R.string.fu7;
            a2.f124674m = R.string.a9e;
            a2.f124666e = true;
            a2.b(new com.ss.android.ugc.aweme.share.improve.f.d()).a(l.f124176a);
            ShareDependService.a.a().a(userQRCodeActivity, a2.a(), R.style.wk).show();
            r.a("click_share_personal_qr_code", new com.ss.android.ugc.aweme.app.f.d().a("qr_code_type", "general").a("enter_from", "personal_homepage").f66730a);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        User user;
        String str;
        float b2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        String str2;
        User user2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.aze);
        this.f124150c = findViewById(R.id.dfh);
        this.f124151d = (ImageView) findViewById(R.id.dfi);
        this.f124152e = findViewById(R.id.df4);
        this.f124153f = (TextView) findViewById(R.id.dfm);
        this.f124154g = (TextView) findViewById(R.id.df9);
        this.f124155h = (TextView) findViewById(R.id.dff);
        this.f124156i = (SmartAvatarBorderView) findViewById(R.id.dfk);
        this.f124157j = (UserQRCodeControlView) findViewById(R.id.df5);
        this.f124158k = (FrameLayout) findViewById(R.id.df_);
        this.f124159l = (QRCodeSquareView) findViewById(R.id.dfa);
        this.f124160m = (QRCodeBackgroundLayout) findViewById(R.id.dfl);
        View view = this.f124150c;
        if (view != null) {
            view.setOnClickListener(this.o);
        }
        ImageView imageView = this.f124151d;
        if (imageView != null) {
            imageView.setOnClickListener(this.p);
        }
        UserQRCodeControlView userQRCodeControlView = this.f124157j;
        if (userQRCodeControlView != null) {
            userQRCodeControlView.setCallback(this.n);
        }
        QRCodeSquareView qRCodeSquareView = this.f124159l;
        ViewGroup.LayoutParams layoutParams4 = null;
        if (qRCodeSquareView != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            if (g2 != null) {
                user2 = g2.getCurUser();
            } else {
                user2 = null;
            }
            qRCodeSquareView.a(4, in.i(user2), "personal_homepage");
        }
        View view2 = this.f124152e;
        if (view2 != null) {
            view2.setOnClickListener(d.f124162a);
        }
        ImageView imageView2 = this.f124151d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.bytedance.tux.c.c.a(e.f124163a).a(this));
        }
        a.C1099a.a(this).a().f44923a.d();
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        if (g3 != null) {
            user = g3.getCurUser();
        } else {
            user = null;
        }
        TextView textView = this.f124153f;
        if (textView != null) {
            if (user != null) {
                str2 = user.getNickname();
            } else {
                str2 = null;
            }
            textView.setText(str2);
        }
        SmartAvatarBorderView smartAvatarBorderView = this.f124156i;
        if (smartAvatarBorderView != null) {
            smartAvatarBorderView.setBorderColor(R.color.f159928l);
        }
        SmartAvatarBorderView smartAvatarBorderView2 = this.f124156i;
        if (smartAvatarBorderView2 != null) {
            smartAvatarBorderView2.setBorderWidth(4);
        }
        StringBuilder sb = new StringBuilder("UserQRCodeActivity_");
        if (user == null || (str = user.getUid()) == null) {
            str = "no_uid";
        }
        String sb2 = sb.append(str).toString();
        int dimension = (int) getResources().getDimension(R.dimen.sl);
        SmartAvatarBorderView smartAvatarBorderView3 = this.f124156i;
        if (smartAvatarBorderView3 != null) {
            smartAvatarBorderView3.a(u.a(user), em.a(101), dimension, dimension, sb2);
        }
        int c2 = n.c(this, (float) n.b(this));
        if (c2 < 654) {
            View view3 = this.f124152e;
            if (view3 != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) n.b(this, 18.0f);
            View view4 = this.f124152e;
            if (view4 != null) {
                view4.setLayoutParams(marginLayoutParams);
            }
            int b3 = (int) n.b(this, 130.0f);
            FrameLayout frameLayout = this.f124158k;
            if (frameLayout != null) {
                layoutParams2 = frameLayout.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = b3;
            layoutParams2.height = b3;
            FrameLayout frameLayout2 = this.f124158k;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams2);
            }
            int b4 = (int) n.b(this, 115.0f);
            QRCodeSquareView qRCodeSquareView2 = this.f124159l;
            if (qRCodeSquareView2 != null) {
                layoutParams3 = qRCodeSquareView2.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams3.width = b4;
            layoutParams3.height = b4;
            QRCodeSquareView qRCodeSquareView3 = this.f124159l;
            if (qRCodeSquareView3 != null) {
                qRCodeSquareView3.setLayoutParams(layoutParams3);
            }
        }
        if (com.ss.android.ugc.aweme.share.f.c.a() != 4) {
            UserQRCodeControlView userQRCodeControlView2 = this.f124157j;
            if (userQRCodeControlView2 != null) {
                layoutParams4 = userQRCodeControlView2.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
            if (c2 < 700) {
                b2 = n.b(this, 20.0f);
            } else {
                b2 = n.b(this, 57.0f);
            }
            marginLayoutParams2.bottomMargin = (int) b2;
            UserQRCodeControlView userQRCodeControlView3 = this.f124157j;
            if (userQRCodeControlView3 != null) {
                userQRCodeControlView3.setLayoutParams(marginLayoutParams2);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity", "onCreate", false);
    }

    public final void a(com.ss.android.ugc.aweme.sharer.b bVar, Context context) {
        com.ss.android.ugc.aweme.share.i.a.a().a(bVar.a(), 0);
        a(new k(context, bVar));
        r.a("share_personal_qr_code", new com.ss.android.ugc.aweme.app.f.d().a("qr_code_type", "general").a("enter_from", "personal_homepage").a("platform", bVar.a()).f66730a);
    }

    @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        h.f.b.l.d(strArr, "");
        h.f.b.l.d(iArr, "");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 1) {
            for (int i3 : iArr) {
                if (i3 == -1) {
                    Context baseContext = getBaseContext();
                    h.f.b.l.b(baseContext, "");
                    com.ss.android.ugc.aweme.share.improve.c.c.a(baseContext);
                    return;
                }
            }
            Context baseContext2 = getBaseContext();
            h.f.b.l.b(baseContext2, "");
            a.C3235a.a(baseContext2, (View) this.f124160m, this.f124159l, true, false, (a.C3235a.AbstractC3236a) null);
        }
    }
}
