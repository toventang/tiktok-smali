package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.privacy.data.api.UserSettingService;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class BaMessageSettingActivity extends com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f100441h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public av<? extends com.ss.android.ugc.aweme.setting.serverpush.a.f> f100442a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f100443b;

    /* renamed from: c  reason: collision with root package name */
    public final IBaAutoMessageService f100444c = BaAutoMessageServiceImpl.d();

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dc.h f100445d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dc.f f100446e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dc.h f100447f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dc.f f100448g;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f100449i = h.i.a((h.f.a.a) new s(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f100450j;

    static {
        Covode.recordClassIndex(64181);
    }

    private final dm b() {
        return (dm) this.f100449i.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f100450j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f100450j == null) {
            this.f100450j = new HashMap();
        }
        View view = (View) this.f100450j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f100450j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64182);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<dm> {
        final /* synthetic */ BaMessageSettingActivity this$0;

        static {
            Covode.recordClassIndex(64209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(BaMessageSettingActivity baMessageSettingActivity) {
            super(0);
            this.this$0 = baMessageSettingActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dm invoke() {
            PowerList powerList = (PowerList) this.this$0._$_findCachedViewById(R.id.d7z);
            h.f.b.l.b(powerList, "");
            return new dm(powerList);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onResume", true);
        super.onResume();
        this.f100442a = kotlinx.coroutines.i.b(this, bf.f159041b, null, new g(null), 2);
        com.ss.android.ugc.aweme.dc.h hVar = this.f100445d;
        if (hVar == null) {
            h.f.b.l.a("welcomeSwitch");
        }
        hVar.a(h.f100456a);
        com.ss.android.ugc.aweme.dc.f fVar = this.f100446e;
        if (fVar == null) {
            h.f.b.l.a("welcomeSetting");
        }
        fVar.a(i.f100457a);
        com.ss.android.ugc.aweme.dc.h hVar2 = this.f100447f;
        if (hVar2 == null) {
            h.f.b.l.a("autoReplySwitch");
        }
        hVar2.a(j.f100458a);
        com.ss.android.ugc.aweme.dc.f fVar2 = this.f100448g;
        if (fVar2 == null) {
            h.f.b.l.a("autoReplySetting");
        }
        fVar2.a(k.f100459a);
        bz unused = kotlinx.coroutines.i.a(this, null, null, new l(this, null), 3);
        bz unused2 = kotlinx.coroutines.i.a(this, null, null, new m(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onResume", false);
    }

    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaMessageSettingActivity f100451a;

        static {
            Covode.recordClassIndex(64183);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
        }

        b(BaMessageSettingActivity baMessageSettingActivity) {
            this.f100451a = baMessageSettingActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f100451a.finish();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaMessageSettingActivity f100452a;

        static {
            Covode.recordClassIndex(64184);
        }

        c(BaMessageSettingActivity baMessageSettingActivity) {
            this.f100452a = baMessageSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaMessageSettingActivity baMessageSettingActivity = this.f100452a;
            baMessageSettingActivity.a(BaMessageSettingActivity.a(baMessageSettingActivity));
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaMessageSettingActivity f100453a;

        static {
            Covode.recordClassIndex(64185);
        }

        d(BaMessageSettingActivity baMessageSettingActivity) {
            this.f100453a = baMessageSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaMessageSettingActivity baMessageSettingActivity = this.f100453a;
            baMessageSettingActivity.a(BaMessageSettingActivity.b(baMessageSettingActivity));
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.dc.h a(BaMessageSettingActivity baMessageSettingActivity) {
        com.ss.android.ugc.aweme.dc.h hVar = baMessageSettingActivity.f100445d;
        if (hVar == null) {
            h.f.b.l.a("welcomeSwitch");
        }
        return hVar;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.dc.h b(BaMessageSettingActivity baMessageSettingActivity) {
        com.ss.android.ugc.aweme.dc.h hVar = baMessageSettingActivity.f100447f;
        if (hVar == null) {
            h.f.b.l.a("autoReplySwitch");
        }
        return hVar;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.dc.f c(BaMessageSettingActivity baMessageSettingActivity) {
        com.ss.android.ugc.aweme.dc.f fVar = baMessageSettingActivity.f100446e;
        if (fVar == null) {
            h.f.b.l.a("welcomeSetting");
        }
        return fVar;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.dc.f d(BaMessageSettingActivity baMessageSettingActivity) {
        com.ss.android.ugc.aweme.dc.f fVar = baMessageSettingActivity.f100448g;
        if (fVar == null) {
            h.f.b.l.a("autoReplySetting");
        }
        return fVar;
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f100456a = new h();

        static {
            Covode.recordClassIndex(64189);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            com.ss.android.ugc.aweme.be.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            return com.ss.android.ugc.aweme.be.h.a(hVar2, false, null, null, false, null, null, null, null, null, false, null, false, false, null, 14335);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f100457a = new i();

        static {
            Covode.recordClassIndex(64190);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 7679);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f100458a = new j();

        static {
            Covode.recordClassIndex(64191);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            com.ss.android.ugc.aweme.be.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            return com.ss.android.ugc.aweme.be.h.a(hVar2, false, null, null, false, null, null, null, null, null, false, null, false, false, null, 14335);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f100459a = new k();

        static {
            Covode.recordClassIndex(64192);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 7679);
        }
    }

    public final void a(com.ss.android.ugc.aweme.dc.h hVar) {
        bz unused = kotlinx.coroutines.i.a(this, kotlinx.coroutines.internal.o.f159148a, null, new n(this, hVar, null), 2);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaMessageSettingActivity f100454a;

        static {
            Covode.recordClassIndex(64186);
        }

        e(BaMessageSettingActivity baMessageSettingActivity) {
            this.f100454a = baMessageSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaMessageSettingActivity baMessageSettingActivity = this.f100454a;
            h.f.b.l.d(baMessageSettingActivity, "");
            h.f.b.l.d("business_message_setting_page", "");
            Intent intent = new Intent(baMessageSettingActivity, BaWelcomeMessageEditActivity.class);
            intent.putExtra("enterFrom", "business_message_setting_page");
            com.ss.android.ugc.tiktok.security.a.a.a(intent, baMessageSettingActivity);
            baMessageSettingActivity.startActivity(intent);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaMessageSettingActivity f100455a;

        static {
            Covode.recordClassIndex(64187);
        }

        f(BaMessageSettingActivity baMessageSettingActivity) {
            this.f100455a = baMessageSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaMessageSettingActivity baMessageSettingActivity = this.f100455a;
            h.f.b.l.d(baMessageSettingActivity, "");
            h.f.b.l.d("business_message_setting_page", "");
            Intent intent = new Intent(baMessageSettingActivity, BaAutoReplyListActivity.class);
            intent.putExtra("enterFrom", "business_message_setting_page");
            com.ss.android.ugc.tiktok.security.a.a.a(intent, baMessageSettingActivity);
            baMessageSettingActivity.startActivity(intent);
        }
    }

    static final class g extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super com.ss.android.ugc.aweme.setting.serverpush.a.f>, Object> {
        int label;

        static {
            Covode.recordClassIndex(64188);
        }

        g(h.c.d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new g(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super com.ss.android.ugc.aweme.setting.serverpush.a.f> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                h.r.a(obj);
                try {
                    String b2 = com.ss.android.ugc.aweme.co.b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "last_user_setting_version", "");
                    UserSettingService a2 = UserSettingService.a.a();
                    h.f.b.l.b(b2, "");
                    return a2.getUserSettingsFuture(b2).get();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    static final class l extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ BaMessageSettingActivity this$0;

        static {
            Covode.recordClassIndex(64193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(BaMessageSettingActivity baMessageSettingActivity, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baMessageSettingActivity;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new l(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((l) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            BaMessageSettingActivity baMessageSettingActivity;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                baMessageSettingActivity = this.this$0;
                IBaAutoMessageService iBaAutoMessageService = baMessageSettingActivity.f100444c;
                this.L$0 = baMessageSettingActivity;
                this.label = 1;
                obj = iBaAutoMessageService.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                baMessageSettingActivity = (BaMessageSettingActivity) this.L$0;
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baMessageSettingActivity.a(((Boolean) obj).booleanValue());
            return z.f158842a;
        }
    }

    static final class m extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ BaMessageSettingActivity this$0;

        static {
            Covode.recordClassIndex(64194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(BaMessageSettingActivity baMessageSettingActivity, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baMessageSettingActivity;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new m(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((m) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            BaMessageSettingActivity baMessageSettingActivity;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                baMessageSettingActivity = this.this$0;
                IBaAutoMessageService iBaAutoMessageService = baMessageSettingActivity.f100444c;
                this.L$0 = baMessageSettingActivity;
                this.label = 1;
                obj = iBaAutoMessageService.b(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                baMessageSettingActivity = (BaMessageSettingActivity) this.L$0;
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baMessageSettingActivity.b(((Boolean) obj).booleanValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ boolean $enable;
        int label;
        final /* synthetic */ BaMessageSettingActivity this$0;

        static {
            Covode.recordClassIndex(64200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(BaMessageSettingActivity baMessageSettingActivity, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baMessageSettingActivity;
            this.$enable = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new p(this.this$0, this.$enable, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((p) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                h.r.a(obj);
                BaMessageSettingActivity.b(this.this$0).a(new h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h>(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity.p.AnonymousClass1 */
                    final /* synthetic */ p this$0;

                    static {
                        Covode.recordClassIndex(64201);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
                        com.ss.android.ugc.aweme.be.h hVar2 = hVar;
                        h.f.b.l.d(hVar2, "");
                        return com.ss.android.ugc.aweme.be.h.a(hVar2, this.this$0.$enable, null, null, false, null, null, null, null, null, false, null, true, false, null, 14334);
                    }
                });
                BaMessageSettingActivity.d(this.this$0).a(new h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f>(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity.p.AnonymousClass2 */
                    final /* synthetic */ p this$0;

                    static {
                        Covode.recordClassIndex(64202);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
                        com.ss.android.ugc.aweme.be.f fVar2 = fVar;
                        h.f.b.l.d(fVar2, "");
                        return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, this.this$0.$enable, null, false, false, null, null, 8063);
                    }
                });
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ boolean $enable;
        int label;
        final /* synthetic */ BaMessageSettingActivity this$0;

        static {
            Covode.recordClassIndex(64206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(BaMessageSettingActivity baMessageSettingActivity, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baMessageSettingActivity;
            this.$enable = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new r(this.this$0, this.$enable, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((r) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                h.r.a(obj);
                BaMessageSettingActivity.a(this.this$0).a(new h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h>(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity.r.AnonymousClass1 */
                    final /* synthetic */ r this$0;

                    static {
                        Covode.recordClassIndex(64207);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
                        com.ss.android.ugc.aweme.be.h hVar2 = hVar;
                        h.f.b.l.d(hVar2, "");
                        return com.ss.android.ugc.aweme.be.h.a(hVar2, this.this$0.$enable, null, null, false, null, null, null, null, null, false, null, true, false, null, 14334);
                    }
                });
                BaMessageSettingActivity.c(this.this$0).a(new h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f>(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity.r.AnonymousClass2 */
                    final /* synthetic */ r this$0;

                    static {
                        Covode.recordClassIndex(64208);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
                        com.ss.android.ugc.aweme.be.f fVar2 = fVar;
                        h.f.b.l.d(fVar2, "");
                        return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, this.this$0.$enable, null, false, false, null, null, 8063);
                    }
                });
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void a(boolean z) {
        if (z) {
            bz unused = kotlinx.coroutines.i.a(this, null, null, new q(this, null), 3);
        }
        bz unused2 = kotlinx.coroutines.i.a(this, kotlinx.coroutines.internal.o.f159148a, null, new r(this, z, null), 2);
    }

    public final void b(boolean z) {
        if (z) {
            bz unused = kotlinx.coroutines.i.a(this, null, null, new o(this, null), 3);
        }
        bz unused2 = kotlinx.coroutines.i.a(this, kotlinx.coroutines.internal.o.f159148a, null, new p(this, z, null), 2);
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaMessageSettingActivity this$0;

        static {
            Covode.recordClassIndex(64197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(BaMessageSettingActivity baMessageSettingActivity, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baMessageSettingActivity;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            o oVar = new o(this.this$0, dVar);
            oVar.L$0 = obj;
            return oVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((o) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            am amVar;
            final String quantityString;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                amVar = (am) this.L$0;
                IBaAutoMessageService iBaAutoMessageService = this.this$0.f100444c;
                this.L$0 = amVar;
                this.label = 1;
                obj = iBaAutoMessageService.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                amVar = (am) this.L$0;
                try {
                    h.r.a(obj);
                } catch (Exception unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj == null) {
                h.f.b.l.b();
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                quantityString = this.this$0.getResources().getString(R.string.dil);
            } else {
                quantityString = this.this$0.getResources().getQuantityString(R.plurals.dd, list.size(), h.c.b.a.b.a(list.size()));
            }
            h.f.b.l.b(quantityString, "");
            bz unused2 = kotlinx.coroutines.i.a(amVar, kotlinx.coroutines.internal.o.f159148a, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity.o.AnonymousClass1 */
                int label;
                final /* synthetic */ o this$0;

                static {
                    Covode.recordClassIndex(64198);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.c.b.a.a
                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                    h.f.b.l.d(dVar, "");
                    return 

                    /* access modifiers changed from: package-private */
                    public static final class q extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                        private /* synthetic */ Object L$0;
                        int label;
                        final /* synthetic */ BaMessageSettingActivity this$0;

                        static {
                            Covode.recordClassIndex(64203);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        q(BaMessageSettingActivity baMessageSettingActivity, h.c.d dVar) {
                            super(2, dVar);
                            this.this$0 = baMessageSettingActivity;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                            h.f.b.l.d(dVar, "");
                            q qVar = new q(this.this$0, dVar);
                            qVar.L$0 = obj;
                            return qVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // h.f.a.m
                        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                            return ((q) create(amVar, dVar)).invokeSuspend(z.f158842a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            am amVar;
                            int i2;
                            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                            int i3 = this.label;
                            if (i3 == 0) {
                                h.r.a(obj);
                                amVar = (am) this.L$0;
                                IBaAutoMessageService iBaAutoMessageService = this.this$0.f100444c;
                                this.L$0 = amVar;
                                this.label = 1;
                                obj = iBaAutoMessageService.c(this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            } else if (i3 == 1) {
                                amVar = (am) this.L$0;
                                try {
                                    h.r.a(obj);
                                } catch (Exception unused) {
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            if (obj == null) {
                                h.f.b.l.b();
                            }
                            Resources resources = this.this$0.getResources();
                            if (((com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a) obj).f100381b == 0) {
                                i2 = R.string.dil;
                            } else {
                                i2 = R.string.bjc;
                            }
                            final String string = resources.getString(i2);
                            h.f.b.l.b(string, "");
                            bz unused2 = kotlinx.coroutines.i.a(amVar, kotlinx.coroutines.internal.o.f159148a, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity.q.AnonymousClass1 */
                                int label;
                                final /* synthetic */ q this$0;

                                static {
                                    Covode.recordClassIndex(64204);
                                }

                                {
                                    this.this$0 = r2;
                                }

                                @Override // h.c.b.a.a
                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                    h.f.b.l.d(dVar, "");
                                    return 

                                    /* access modifiers changed from: package-private */
                                    public static final class n extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                                        final /* synthetic */ com.ss.android.ugc.aweme.dc.h $switchUnit;
                                        int I$0;
                                        int label;
                                        final /* synthetic */ BaMessageSettingActivity this$0;

                                        static {
                                            Covode.recordClassIndex(64195);
                                        }

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        n(BaMessageSettingActivity baMessageSettingActivity, com.ss.android.ugc.aweme.dc.h hVar, h.c.d dVar) {
                                            super(2, dVar);
                                            this.this$0 = baMessageSettingActivity;
                                            this.$switchUnit = hVar;
                                        }

                                        @Override // h.c.b.a.a
                                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                            h.f.b.l.d(dVar, "");
                                            return new n(this.this$0, this.$switchUnit, dVar);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                        @Override // h.f.a.m
                                        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                            return ((n) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                        }

                                        /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService */
                                        /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r1v3, types: [int, boolean] */
                                        /* JADX WARN: Type inference failed for: r7v3, types: [int, boolean] */
                                        /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
                                        /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
                                        /* JADX WARNING: Removed duplicated region for block: B:46:0x0116  */
                                        /* JADX WARNING: Unknown variable types count: 2 */
                                        @Override // h.c.b.a.a
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                                            /*
                                            // Method dump skipped, instructions count: 346
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity.n.invokeSuspend(java.lang.Object):java.lang.Object");
                                        }

                                        /* access modifiers changed from: package-private */
                                        public static final class a implements DialogInterface.OnClickListener {

                                            /* renamed from: a  reason: collision with root package name */
                                            final /* synthetic */ n f100460a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ Spanned f100461b;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ int f100462c;

                                            /* renamed from: d  reason: collision with root package name */
                                            final /* synthetic */ com.ss.android.ugc.aweme.setting.serverpush.a.f f100463d;

                                            static {
                                                Covode.recordClassIndex(64196);
                                            }

                                            a(n nVar, Spanned spanned, int i2, com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
                                                this.f100460a = nVar;
                                                this.f100461b = spanned;
                                                this.f100462c = i2;
                                                this.f100463d = fVar;
                                            }

                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                SmartRouter.buildRoute(this.f100460a.this$0, "aweme://chatcontrol/setting").withParam("currentSettingsValue", this.f100462c).withParam("group_chat_set", this.f100463d.F).open(1);
                                            }
                                        }
                                    }

                                    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
                                    public final void onCreate(Bundle bundle) {
                                        com.bytedance.helios.sdk.utils.a.a(this, bundle);
                                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onCreate", true);
                                        super.onCreate(bundle);
                                        this.f100444c.a();
                                        setContentView(R.layout.a8h);
                                        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                                        buttonTitleBar.setTitle(R.string.d45);
                                        buttonTitleBar.setOnTitleBarClickListener(new b(this));
                                        String string = getString(R.string.hen);
                                        h.f.b.l.b(string, "");
                                        this.f100445d = new com.ss.android.ugc.aweme.dc.h(new com.ss.android.ugc.aweme.be.h(false, string, new c(this), false, null, null, null, null, getString(R.string.heo), false, 15353));
                                        String string2 = getString(R.string.crp);
                                        h.f.b.l.b(string2, "");
                                        this.f100447f = new com.ss.android.ugc.aweme.dc.h(new com.ss.android.ugc.aweme.be.h(false, string2, new d(this), false, null, null, null, null, getString(R.string.crq), false, 15353));
                                        String string3 = getString(R.string.d3x);
                                        h.f.b.l.b(string3, "");
                                        this.f100446e = new com.ss.android.ugc.aweme.dc.f(new com.ss.android.ugc.aweme.be.f("", false, null, string3, null, null, false, false, new e(this), null, 6006));
                                        String string4 = getString(R.string.d3x);
                                        h.f.b.l.b(string4, "");
                                        this.f100448g = new com.ss.android.ugc.aweme.dc.f(new com.ss.android.ugc.aweme.be.f("", false, null, string4, null, null, false, false, new f(this), null, 6006));
                                        String a2 = a(getIntent(), "enter_from");
                                        if (a2 == null) {
                                            a2 = "";
                                        }
                                        h.f.b.l.b(a2, "");
                                        a.e eVar = a.e.f100374a;
                                        h.f.b.l.d(a2, "");
                                        h.f.b.l.d(eVar, "");
                                        Map<String, String> map = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a2).f66730a;
                                        h.f.b.l.b(map, "");
                                        eVar.invoke("enter_business_message_setting", map);
                                        dm b2 = b();
                                        String string5 = getString(R.string.hen);
                                        h.f.b.l.b(string5, "");
                                        b2.a(new com.ss.android.ugc.aweme.dc.d(new com.ss.android.ugc.aweme.be.e(string5, false, false, 14)));
                                        dm b3 = b();
                                        com.ss.android.ugc.aweme.dc.h hVar = this.f100445d;
                                        if (hVar == null) {
                                            h.f.b.l.a("welcomeSwitch");
                                        }
                                        b3.a(hVar);
                                        dm b4 = b();
                                        com.ss.android.ugc.aweme.dc.f fVar = this.f100446e;
                                        if (fVar == null) {
                                            h.f.b.l.a("welcomeSetting");
                                        }
                                        b4.a(fVar);
                                        dm b5 = b();
                                        String string6 = getString(R.string.crp);
                                        h.f.b.l.b(string6, "");
                                        b5.a(new com.ss.android.ugc.aweme.dc.d(new com.ss.android.ugc.aweme.be.e(string6, true, false, 12)));
                                        dm b6 = b();
                                        com.ss.android.ugc.aweme.dc.h hVar2 = this.f100447f;
                                        if (hVar2 == null) {
                                            h.f.b.l.a("autoReplySwitch");
                                        }
                                        b6.a(hVar2);
                                        dm b7 = b();
                                        com.ss.android.ugc.aweme.dc.f fVar2 = this.f100448g;
                                        if (fVar2 == null) {
                                            h.f.b.l.a("autoReplySetting");
                                        }
                                        b7.a(fVar2);
                                        this.f100444c.b();
                                        this.f100444c.c();
                                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onCreate", false);
                                    }

                                    private static String a(Intent intent, String str) {
                                        try {
                                            return intent.getStringExtra(str);
                                        } catch (Exception unused) {
                                            return null;
                                        }
                                    }
                                }
