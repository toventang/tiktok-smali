package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.internal.o;

public final class BaWelcomeMessageEditActivity extends com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a implements TextWatcher {

    /* renamed from: c  reason: collision with root package name */
    public static final a f100464c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a f100465a = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a(0L, 0, "");

    /* renamed from: b  reason: collision with root package name */
    public final IBaAutoMessageService f100466b = BaAutoMessageServiceImpl.d();

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.ies.dmt.ui.widget.b f100467d = new com.bytedance.ies.dmt.ui.widget.b();

    /* renamed from: e  reason: collision with root package name */
    private KeyListener f100468e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f100469f;

    static {
        Covode.recordClassIndex(64210);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f100469f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f100469f == null) {
            this.f100469f = new HashMap();
        }
        View view = (View) this.f100469f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f100469f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
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

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64211);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        c();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity", "onResume", true);
        super.onResume();
        bz unused = kotlinx.coroutines.i.a(this, null, null, new d(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity", "onResume", false);
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

    /* access modifiers changed from: package-private */
    public final void c() {
        DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.ato);
        l.b(dmtEditText, "");
        if (l.a((Object) String.valueOf(dmtEditText.getText()), (Object) this.f100465a.f100382c)) {
            finish();
            return;
        }
        a.C0731a aVar = new a.C0731a(this);
        aVar.a(R.string.b7v);
        aVar.b(R.string.b7w);
        aVar.b(R.string.a9o, (DialogInterface.OnClickListener) j.f100478a, false);
        aVar.a(R.string.b83, (DialogInterface.OnClickListener) new i(this, false), false);
        aVar.a().c();
    }

    private final void d() {
        int i2;
        int length = ((DmtEditText) _$_findCachedViewById(R.id.ato)).length();
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.f8a);
        Resources resources = getResources();
        if (length <= 250) {
            i2 = R.color.c5;
        } else {
            i2 = R.color.ly;
        }
        tuxTextView.setTextColor(resources.getColor(i2));
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.f8a);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(String.valueOf(length));
        if (length > 0 && 250 >= length) {
            String str = this.f100465a.f100382c;
            DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.ato);
            l.b(dmtEditText, "");
            if (!l.a((Object) str, (Object) String.valueOf(dmtEditText.getText()))) {
                b(true);
                TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a1a);
                l.b(tuxButton, "");
                tuxButton.setEnabled(true);
                TuxButton tuxButton2 = (TuxButton) _$_findCachedViewById(R.id.a1a);
                l.b(tuxButton2, "");
                tuxButton2.setActivated(true);
                return;
            }
            int i3 = this.f100465a.f100381b;
            if (i3 == 0 || i3 == 2 || i3 == 3) {
                b(false);
                TuxButton tuxButton3 = (TuxButton) _$_findCachedViewById(R.id.a1a);
                l.b(tuxButton3, "");
                tuxButton3.setEnabled(false);
                TuxButton tuxButton4 = (TuxButton) _$_findCachedViewById(R.id.a1a);
                l.b(tuxButton4, "");
                tuxButton4.setActivated(false);
            } else if (i3 == 4) {
                b(false);
                TuxButton tuxButton5 = (TuxButton) _$_findCachedViewById(R.id.a1a);
                l.b(tuxButton5, "");
                tuxButton5.setEnabled(true);
                TuxButton tuxButton6 = (TuxButton) _$_findCachedViewById(R.id.a1a);
                l.b(tuxButton6, "");
                tuxButton6.setActivated(true);
            }
        } else {
            b(false);
            TuxButton tuxButton7 = (TuxButton) _$_findCachedViewById(R.id.a1a);
            l.b(tuxButton7, "");
            tuxButton7.setEnabled(false);
            TuxButton tuxButton8 = (TuxButton) _$_findCachedViewById(R.id.a1a);
            l.b(tuxButton8, "");
            tuxButton8.setActivated(false);
        }
    }

    public final void b() {
        DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.ato);
        l.b(dmtEditText, "");
        KeyListener keyListener = this.f100468e;
        if (keyListener == null) {
            l.a("keyListener");
        }
        dmtEditText.setKeyListener(keyListener);
        int i2 = this.f100465a.f100381b;
        if (i2 == 0) {
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.c85);
            l.b(frameLayout, "");
            frameLayout.setVisibility(8);
        } else if (i2 == 1) {
            FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.c85);
            l.b(frameLayout2, "");
            frameLayout2.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f7u)).setText(R.string.h45);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.c5k);
            l.b(linearLayout, "");
            linearLayout.setVisibility(4);
            DmtEditText dmtEditText2 = (DmtEditText) _$_findCachedViewById(R.id.ato);
            l.b(dmtEditText2, "");
            dmtEditText2.setKeyListener(null);
            ((DmtEditText) _$_findCachedViewById(R.id.ato)).setOnTouchListener(new k(this));
            TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a1a);
            l.b(tuxButton, "");
            tuxButton.setVisibility(4);
            ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
            l.b(buttonTitleBar, "");
            DmtTextView endBtn = buttonTitleBar.getEndBtn();
            l.b(endBtn, "");
            endBtn.setVisibility(4);
        } else if (i2 == 2) {
            FrameLayout frameLayout3 = (FrameLayout) _$_findCachedViewById(R.id.c85);
            l.b(frameLayout3, "");
            frameLayout3.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(R.string.ff0));
            sb.append('\n');
            String string = getResources().getString(R.string.ff1);
            l.b(string, "");
            String a2 = com.a.a(string, Arrays.copyOf(new Object[]{this.f100465a.f100383d}, 1));
            l.b(a2, "");
            sb.append(a2);
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.f7u);
            l.b(tuxTextView, "");
            tuxTextView.setText(sb);
        } else if (i2 == 3) {
            FrameLayout frameLayout4 = (FrameLayout) _$_findCachedViewById(R.id.c85);
            l.b(frameLayout4, "");
            frameLayout4.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f7u)).setText(R.string.d3y);
        } else if (i2 == 4) {
            FrameLayout frameLayout5 = (FrameLayout) _$_findCachedViewById(R.id.c85);
            l.b(frameLayout5, "");
            frameLayout5.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f7u)).setText(R.string.fdu);
        }
        ((DmtEditText) _$_findCachedViewById(R.id.ato)).setText(this.f100465a.f100382c);
        d();
    }

    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaWelcomeMessageEditActivity f100470a;

        static {
            Covode.recordClassIndex(64212);
        }

        b(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
            this.f100470a = baWelcomeMessageEditActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            l.d(view, "");
            this.f100470a.c();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            l.d(view, "");
            DmtEditText dmtEditText = (DmtEditText) this.f100470a._$_findCachedViewById(R.id.ato);
            l.b(dmtEditText, "");
            Editable text = dmtEditText.getText();
            if (text != null && text.length() > 250) {
                new com.bytedance.tux.g.b(this.f100470a).e(R.string.abu).b();
            } else if (view.getAlpha() == 1.0f) {
                BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.f100470a;
                a.C0731a aVar = new a.C0731a(baWelcomeMessageEditActivity);
                aVar.a(R.string.fg1);
                aVar.b(R.string.ffz);
                aVar.b(R.string.a9o, (DialogInterface.OnClickListener) f.f100473a, false);
                aVar.a(R.string.fg9, (DialogInterface.OnClickListener) new e(baWelcomeMessageEditActivity), false);
                aVar.a().c();
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            d();
        }
    }

    public final void a(boolean z) {
        TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a1a);
        l.b(tuxButton, "");
        tuxButton.setEnabled(z);
        b(z);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaWelcomeMessageEditActivity f100471a;

        static {
            Covode.recordClassIndex(64213);
        }

        c(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
            this.f100471a = baWelcomeMessageEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.f100471a;
            a.C0731a aVar = new a.C0731a(baWelcomeMessageEditActivity);
            aVar.a(R.string.ga0);
            aVar.b(R.string.ga1);
            aVar.b(R.string.a9o, (DialogInterface.OnClickListener) h.f100475a, false);
            aVar.a(R.string.ga4, (DialogInterface.OnClickListener) new g(baWelcomeMessageEditActivity), false);
            aVar.a().c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.k implements m<am, h.c.d<? super z>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaWelcomeMessageEditActivity this$0;

        static {
            Covode.recordClassIndex(64214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baWelcomeMessageEditActivity;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            d dVar2 = new d(this.this$0, dVar);
            dVar2.L$0 = obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            am amVar;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                amVar = (am) this.L$0;
                IBaAutoMessageService iBaAutoMessageService = this.this$0.f100466b;
                this.L$0 = amVar;
                this.label = 1;
                obj = iBaAutoMessageService.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                amVar = (am) this.L$0;
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a aVar2 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a) obj;
            if (aVar2 == null) {
                this.this$0.finish();
                return z.f158842a;
            }
            this.this$0.f100465a = aVar2;
            bz unused = kotlinx.coroutines.i.a(amVar, o.f159148a, null, new m<am, h.c.d<? super z>, Object>(this, null) {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity.d.AnonymousClass1 */
                int label;
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(64215);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.c.b.a.a
                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                    l.d(dVar, "");
                    return 

                    private final void b(boolean z) {
                        if (z) {
                            ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                            l.b(buttonTitleBar, "");
                            DmtTextView endBtn = buttonTitleBar.getEndBtn();
                            ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                            l.b(buttonTitleBar2, "");
                            endBtn.setTextColor(androidx.core.content.b.c(buttonTitleBar2.getContext(), R.color.bh));
                            ButtonTitleBar buttonTitleBar3 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                            l.b(buttonTitleBar3, "");
                            buttonTitleBar3.getEndBtn().setOnTouchListener(this.f100467d);
                            return;
                        }
                        ButtonTitleBar buttonTitleBar4 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                        l.b(buttonTitleBar4, "");
                        DmtTextView endBtn2 = buttonTitleBar4.getEndBtn();
                        ButtonTitleBar buttonTitleBar5 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                        l.b(buttonTitleBar5, "");
                        endBtn2.setTextColor(androidx.core.content.b.c(buttonTitleBar5.getContext(), R.color.bz));
                        ButtonTitleBar buttonTitleBar6 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                        l.b(buttonTitleBar6, "");
                        buttonTitleBar6.getEndBtn().setOnTouchListener(null);
                    }

                    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
                        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                        */
                    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
                    public final void onCreate(android.os.Bundle r8) {
                        /*
                        // Method dump skipped, instructions count: 143
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity.onCreate(android.os.Bundle):void");
                    }

                    static final class f implements DialogInterface.OnClickListener {

                        /* renamed from: a  reason: collision with root package name */
                        public static final f f100473a = new f();

                        static {
                            Covode.recordClassIndex(64220);
                        }

                        f() {
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a.a(2);
                        }
                    }

                    static final class h implements DialogInterface.OnClickListener {

                        /* renamed from: a  reason: collision with root package name */
                        public static final h f100475a = new h();

                        static {
                            Covode.recordClassIndex(64224);
                        }

                        h() {
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a.a(6);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public static final class j implements DialogInterface.OnClickListener {

                        /* renamed from: a  reason: collision with root package name */
                        public static final j f100478a = new j();

                        static {
                            Covode.recordClassIndex(64226);
                        }

                        j() {
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a.a(4);
                        }
                    }

                    private static String a(Intent intent, String str) {
                        try {
                            return intent.getStringExtra(str);
                        } catch (Exception unused) {
                            return null;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public static final class i implements DialogInterface.OnClickListener {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ BaWelcomeMessageEditActivity f100476a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ boolean f100477b = false;

                        static {
                            Covode.recordClassIndex(64225);
                        }

                        i(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, boolean z) {
                            this.f100476a = baWelcomeMessageEditActivity;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a.a(3);
                            if (this.f100477b) {
                                BaWelcomeMessageEditActivity.super.onBackPressed();
                            }
                            this.f100476a.finish();
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public static final class k implements View.OnTouchListener {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ BaWelcomeMessageEditActivity f100479a;

                        static {
                            Covode.recordClassIndex(64227);
                        }

                        k(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
                            this.f100479a = baWelcomeMessageEditActivity;
                        }

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            new com.bytedance.tux.g.b(this.f100479a).e(R.string.h46).b();
                            return true;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public static final class e implements DialogInterface.OnClickListener {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ BaWelcomeMessageEditActivity f100472a;

                        static {
                            Covode.recordClassIndex(64216);
                        }

                        e(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
                            this.f100472a = baWelcomeMessageEditActivity;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            this.f100472a.a(false);
                            DmtEditText dmtEditText = (DmtEditText) this.f100472a._$_findCachedViewById(R.id.ato);
                            l.b(dmtEditText, "");
                            final String valueOf = String.valueOf(dmtEditText.getText());
                            bz unused = kotlinx.coroutines.i.a(this.f100472a, null, null, new m<am, h.c.d<? super z>, Object>(this, null) {
                                /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity.e.AnonymousClass1 */
                                private /* synthetic */ Object L$0;
                                int label;
                                final /* synthetic */ e this$0;

                                static {
                                    Covode.recordClassIndex(64217);
                                }

                                {
                                    this.this$0 = r2;
                                }

                                @Override // h.c.b.a.a
                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                    l.d(dVar, "");
                                    AnonymousClass1 r2 = 

                                    /* access modifiers changed from: package-private */
                                    public static final class g implements DialogInterface.OnClickListener {

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ BaWelcomeMessageEditActivity f100474a;

                                        static {
                                            Covode.recordClassIndex(64221);
                                        }

                                        g(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
                                            this.f100474a = baWelcomeMessageEditActivity;
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            this.f100474a.a(false);
                                            DmtEditText dmtEditText = (DmtEditText) this.f100474a._$_findCachedViewById(R.id.ato);
                                            l.b(dmtEditText, "");
                                            final String valueOf = String.valueOf(dmtEditText.getText());
                                            bz unused = kotlinx.coroutines.i.a(this.f100474a, null, null, new m<am, h.c.d<? super z>, Object>(this, null) {
                                                /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity.g.AnonymousClass1 */
                                                private /* synthetic */ Object L$0;
                                                int label;
                                                final /* synthetic */ g this$0;

                                                static {
                                                    Covode.recordClassIndex(64222);
                                                }

                                                {
                                                    this.this$0 = r2;
                                                }

                                                @Override // h.c.b.a.a
                                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                    l.d(dVar, "");
                                                    AnonymousClass1 r2 = 
                                                }
