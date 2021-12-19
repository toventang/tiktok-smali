package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity;

import android.content.Context;
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
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;

public final class BaAutoReplyEditActivity extends com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a implements TextWatcher {

    /* renamed from: d  reason: collision with root package name */
    public static final a f100414d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final IBaAutoMessageService f100415a = BaAutoMessageServiceImpl.d();

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b f100416b = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b(0, 0, "", "");

    /* renamed from: c  reason: collision with root package name */
    public boolean f100417c;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.ies.dmt.ui.widget.b f100418e = new com.bytedance.ies.dmt.ui.widget.b();

    /* renamed from: f  reason: collision with root package name */
    private KeyListener f100419f;

    /* renamed from: g  reason: collision with root package name */
    private KeyListener f100420g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f100421h;

    /* access modifiers changed from: package-private */
    public static final class e extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaAutoReplyEditActivity this$0;

        static {
            Covode.recordClassIndex(64154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BaAutoReplyEditActivity baAutoReplyEditActivity, h.c.d dVar) {
            super(dVar);
            this.this$0 = baAutoReplyEditActivity;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    static {
        Covode.recordClassIndex(64147);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f100421h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f100421h == null) {
            this.f100421h = new HashMap();
        }
        View view = (View) this.f100421h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f100421h.put(Integer.valueOf(i2), findViewById);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity", "onResume", false);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64148);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Context context, String str, long j2) {
            h.f.b.l.d(context, "");
            h.f.b.l.d(str, "");
            Intent intent = new Intent(context, BaAutoReplyEditActivity.class);
            intent.putExtra("mid", j2);
            intent.putExtra("enterFrom", str);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
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

    public final void b() {
        DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.asq);
        h.f.b.l.b(dmtEditText, "");
        KeyListener keyListener = this.f100419f;
        if (keyListener == null) {
            h.f.b.l.a("keywordKeyListener");
        }
        dmtEditText.setKeyListener(keyListener);
        DmtEditText dmtEditText2 = (DmtEditText) _$_findCachedViewById(R.id.asu);
        h.f.b.l.b(dmtEditText2, "");
        KeyListener keyListener2 = this.f100420g;
        if (keyListener2 == null) {
            h.f.b.l.a("messageKeyListener");
        }
        dmtEditText2.setKeyListener(keyListener2);
        int i2 = this.f100416b.f100385b;
        if (i2 == 0) {
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.c85);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(8);
            TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a10);
            h.f.b.l.b(tuxButton, "");
            tuxButton.setVisibility(8);
        } else if (i2 == 1) {
            FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.c85);
            h.f.b.l.b(frameLayout2, "");
            frameLayout2.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f7u)).setText(R.string.h45);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.c5k);
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(4);
            DmtEditText dmtEditText3 = (DmtEditText) _$_findCachedViewById(R.id.asq);
            h.f.b.l.b(dmtEditText3, "");
            dmtEditText3.setKeyListener(null);
            DmtEditText dmtEditText4 = (DmtEditText) _$_findCachedViewById(R.id.asu);
            h.f.b.l.b(dmtEditText4, "");
            dmtEditText4.setKeyListener(null);
            r rVar = new r(this);
            ((DmtEditText) _$_findCachedViewById(R.id.asq)).setOnTouchListener(rVar);
            ((DmtEditText) _$_findCachedViewById(R.id.asu)).setOnTouchListener(rVar);
            TuxButton tuxButton2 = (TuxButton) _$_findCachedViewById(R.id.a1a);
            h.f.b.l.b(tuxButton2, "");
            tuxButton2.setVisibility(4);
            TuxButton tuxButton3 = (TuxButton) _$_findCachedViewById(R.id.a10);
            h.f.b.l.b(tuxButton3, "");
            tuxButton3.setVisibility(4);
            ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
            h.f.b.l.b(buttonTitleBar, "");
            DmtTextView endBtn = buttonTitleBar.getEndBtn();
            h.f.b.l.b(endBtn, "");
            endBtn.setVisibility(4);
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.f1b);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(4);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.f1c);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(4);
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.f1d);
            h.f.b.l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(4);
            TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.f2s);
            h.f.b.l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(4);
            TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.f2t);
            h.f.b.l.b(tuxTextView5, "");
            tuxTextView5.setVisibility(4);
            TuxTextView tuxTextView6 = (TuxTextView) _$_findCachedViewById(R.id.f2u);
            h.f.b.l.b(tuxTextView6, "");
            tuxTextView6.setVisibility(4);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.an7);
            h.f.b.l.b(_$_findCachedViewById, "");
            _$_findCachedViewById.setVisibility(4);
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.an8);
            h.f.b.l.b(_$_findCachedViewById2, "");
            _$_findCachedViewById2.setVisibility(4);
        } else if (i2 == 2) {
            FrameLayout frameLayout3 = (FrameLayout) _$_findCachedViewById(R.id.c85);
            h.f.b.l.b(frameLayout3, "");
            frameLayout3.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(R.string.ff0));
            sb.append('\n');
            String string = getResources().getString(R.string.ff1);
            h.f.b.l.b(string, "");
            String a2 = com.a.a(string, Arrays.copyOf(new Object[]{this.f100416b.f100388e}, 1));
            h.f.b.l.b(a2, "");
            sb.append(a2);
            TuxTextView tuxTextView7 = (TuxTextView) _$_findCachedViewById(R.id.f7u);
            h.f.b.l.b(tuxTextView7, "");
            tuxTextView7.setText(sb);
        } else if (i2 == 3) {
            FrameLayout frameLayout4 = (FrameLayout) _$_findCachedViewById(R.id.c85);
            h.f.b.l.b(frameLayout4, "");
            frameLayout4.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f7u)).setText(R.string.d3y);
        } else if (i2 == 4) {
            FrameLayout frameLayout5 = (FrameLayout) _$_findCachedViewById(R.id.c85);
            h.f.b.l.b(frameLayout5, "");
            frameLayout5.setVisibility(0);
            TuxButton tuxButton4 = (TuxButton) _$_findCachedViewById(R.id.a1a);
            h.f.b.l.b(tuxButton4, "");
            tuxButton4.setEnabled(true);
            ((TuxTextView) _$_findCachedViewById(R.id.f7u)).setText(R.string.fdt);
        }
        ((DmtEditText) _$_findCachedViewById(R.id.asq)).setText(this.f100416b.f100386c);
        ((DmtEditText) _$_findCachedViewById(R.id.asu)).setText(this.f100416b.f100387d);
    }

    public static final class f implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaAutoReplyEditActivity f100424a;

        static {
            Covode.recordClassIndex(64155);
        }

        f(BaAutoReplyEditActivity baAutoReplyEditActivity) {
            this.f100424a = baAutoReplyEditActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.f100424a;
            DmtEditText dmtEditText = (DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.asq);
            h.f.b.l.b(dmtEditText, "");
            if (h.f.b.l.a((Object) String.valueOf(dmtEditText.getText()), (Object) baAutoReplyEditActivity.f100416b.f100386c)) {
                DmtEditText dmtEditText2 = (DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.asu);
                h.f.b.l.b(dmtEditText2, "");
                if (h.f.b.l.a((Object) String.valueOf(dmtEditText2.getText()), (Object) baAutoReplyEditActivity.f100416b.f100387d)) {
                    baAutoReplyEditActivity.finish();
                    return;
                }
            }
            a.C0731a aVar = new a.C0731a(baAutoReplyEditActivity);
            aVar.a(R.string.b7v);
            aVar.b(R.string.b7w);
            aVar.b(R.string.a9o, (DialogInterface.OnClickListener) q.f100433a, false);
            aVar.a(R.string.b83, (DialogInterface.OnClickListener) new p(baAutoReplyEditActivity), false);
            aVar.a().c();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
            if (this.f100424a.f100417c) {
                new com.bytedance.tux.g.b(this.f100424a).e(R.string.abu).b();
            } else if (view.getAlpha() == 1.0f) {
                BaAutoReplyEditActivity baAutoReplyEditActivity = this.f100424a;
                if (((Boolean) kotlinx.coroutines.h.a(h.c.g.INSTANCE, new k(baAutoReplyEditActivity, null))).booleanValue()) {
                    new com.bytedance.tux.g.b(baAutoReplyEditActivity).e(R.string.cro).b();
                    return;
                }
                a.C0731a aVar = new a.C0731a(baAutoReplyEditActivity);
                aVar.a(R.string.fg1);
                aVar.b(R.string.ffz);
                aVar.b(R.string.a9o, (DialogInterface.OnClickListener) l.f100428a, false);
                aVar.a(R.string.fg9, (DialogInterface.OnClickListener) new j(baAutoReplyEditActivity), false);
                aVar.a().c();
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            bz unused = kotlinx.coroutines.i.a(this, kotlinx.coroutines.internal.o.f159148a, null, new b(this, null), 2);
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaAutoReplyEditActivity f100426a;

        static {
            Covode.recordClassIndex(64157);
        }

        h(BaAutoReplyEditActivity baAutoReplyEditActivity) {
            this.f100426a = baAutoReplyEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.f100426a;
            a.C0731a aVar = new a.C0731a(baAutoReplyEditActivity);
            aVar.a(R.string.b5v);
            aVar.b(R.string.a9o, (DialogInterface.OnClickListener) d.f100423a, false);
            aVar.a(R.string.b68, (DialogInterface.OnClickListener) new c(baAutoReplyEditActivity), false);
            aVar.a().c();
        }
    }

    static final class k extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super Boolean>, Object> {
        int label;
        final /* synthetic */ BaAutoReplyEditActivity this$0;

        static {
            Covode.recordClassIndex(64165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(BaAutoReplyEditActivity baAutoReplyEditActivity, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baAutoReplyEditActivity;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new k(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super Boolean> dVar) {
            return ((k) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                BaAutoReplyEditActivity baAutoReplyEditActivity = this.this$0;
                this.label = 1;
                obj = baAutoReplyEditActivity.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    static final class n extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super Boolean>, Object> {
        int label;
        final /* synthetic */ BaAutoReplyEditActivity this$0;

        static {
            Covode.recordClassIndex(64171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(BaAutoReplyEditActivity baAutoReplyEditActivity, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baAutoReplyEditActivity;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new n(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super Boolean> dVar) {
            return ((n) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                BaAutoReplyEditActivity baAutoReplyEditActivity = this.this$0;
                this.label = 1;
                obj = baAutoReplyEditActivity.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public final void b(boolean z) {
        TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a10);
        h.f.b.l.b(tuxButton, "");
        tuxButton.setEnabled(z);
        TuxButton tuxButton2 = (TuxButton) _$_findCachedViewById(R.id.a1a);
        h.f.b.l.b(tuxButton2, "");
        tuxButton2.setEnabled(z);
        a(z);
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaAutoReplyEditActivity f100425a;

        static {
            Covode.recordClassIndex(64156);
        }

        g(BaAutoReplyEditActivity baAutoReplyEditActivity) {
            this.f100425a = baAutoReplyEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.f100425a;
            if (((Boolean) kotlinx.coroutines.h.a(h.c.g.INSTANCE, new n(baAutoReplyEditActivity, null))).booleanValue()) {
                new com.bytedance.tux.g.b(baAutoReplyEditActivity).e(R.string.cro).b();
                return;
            }
            a.C0731a aVar = new a.C0731a(baAutoReplyEditActivity);
            aVar.a(R.string.ga0);
            aVar.b(R.string.ga1);
            aVar.b(R.string.a9o, (DialogInterface.OnClickListener) o.f100430a, false);
            aVar.a(R.string.ga4, (DialogInterface.OnClickListener) new m(baAutoReplyEditActivity), false);
            aVar.a().c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ long $mid;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaAutoReplyEditActivity this$0;

        static {
            Covode.recordClassIndex(64158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(BaAutoReplyEditActivity baAutoReplyEditActivity, long j2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = baAutoReplyEditActivity;
            this.$mid = j2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            i iVar = new i(this.this$0, this.$mid, dVar);
            iVar.L$0 = obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((i) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            am amVar;
            Object obj2;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                amVar = (am) this.L$0;
                if (this.$mid != 0) {
                    IBaAutoMessageService iBaAutoMessageService = this.this$0.f100415a;
                    this.L$0 = amVar;
                    this.label = 1;
                    obj = iBaAutoMessageService.d(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                bz unused = kotlinx.coroutines.i.a(amVar, kotlinx.coroutines.internal.o.f159148a, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity.i.AnonymousClass1 */
                    int label;
                    final /* synthetic */ i this$0;

                    static {
                        Covode.recordClassIndex(64159);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                        h.f.b.l.d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        public final void a(boolean z) {
                            if (z) {
                                ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                                h.f.b.l.b(buttonTitleBar, "");
                                DmtTextView endBtn = buttonTitleBar.getEndBtn();
                                ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                                h.f.b.l.b(buttonTitleBar2, "");
                                endBtn.setTextColor(androidx.core.content.b.c(buttonTitleBar2.getContext(), R.color.bh));
                                ButtonTitleBar buttonTitleBar3 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                                h.f.b.l.b(buttonTitleBar3, "");
                                buttonTitleBar3.getEndBtn().setOnTouchListener(this.f100418e);
                                return;
                            }
                            ButtonTitleBar buttonTitleBar4 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                            h.f.b.l.b(buttonTitleBar4, "");
                            DmtTextView endBtn2 = buttonTitleBar4.getEndBtn();
                            ButtonTitleBar buttonTitleBar5 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                            h.f.b.l.b(buttonTitleBar5, "");
                            endBtn2.setTextColor(androidx.core.content.b.c(buttonTitleBar5.getContext(), R.color.bz));
                            ButtonTitleBar buttonTitleBar6 = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
                            h.f.b.l.b(buttonTitleBar6, "");
                            buttonTitleBar6.getEndBtn().setOnTouchListener(null);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
                        /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object a(h.c.d<? super java.lang.Boolean> r10) {
                            /*
                            // Method dump skipped, instructions count: 150
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity.a(h.c.d):java.lang.Object");
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
                        public final void onCreate(android.os.Bundle r12) {
                            /*
                            // Method dump skipped, instructions count: 247
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity.onCreate(android.os.Bundle):void");
                        }

                        static final class b extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                            int label;
                            final /* synthetic */ BaAutoReplyEditActivity this$0;

                            static {
                                Covode.recordClassIndex(64149);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            b(BaAutoReplyEditActivity baAutoReplyEditActivity, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = baAutoReplyEditActivity;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new b(this.this$0, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                int i2;
                                if (this.label == 0) {
                                    h.r.a(obj);
                                    BaAutoReplyEditActivity baAutoReplyEditActivity = this.this$0;
                                    int length = ((DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.asq)).length();
                                    TuxTextView tuxTextView = (TuxTextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.f1b);
                                    Resources resources = baAutoReplyEditActivity.getResources();
                                    int i3 = R.color.c5;
                                    if (length <= 40) {
                                        i2 = R.color.c5;
                                    } else {
                                        i2 = R.color.ly;
                                    }
                                    tuxTextView.setTextColor(resources.getColor(i2));
                                    TuxTextView tuxTextView2 = (TuxTextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.f1b);
                                    h.f.b.l.b(tuxTextView2, "");
                                    tuxTextView2.setText(String.valueOf(length));
                                    int length2 = ((DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.asu)).length();
                                    TuxTextView tuxTextView3 = (TuxTextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.f2s);
                                    Resources resources2 = baAutoReplyEditActivity.getResources();
                                    if (length2 > 500) {
                                        i3 = R.color.ly;
                                    }
                                    tuxTextView3.setTextColor(resources2.getColor(i3));
                                    TuxTextView tuxTextView4 = (TuxTextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.f2s);
                                    h.f.b.l.b(tuxTextView4, "");
                                    tuxTextView4.setText(String.valueOf(length2));
                                    if (length > 0 && 40 >= length && length2 > 0 && 500 >= length2) {
                                        baAutoReplyEditActivity.f100417c = false;
                                        String str = baAutoReplyEditActivity.f100416b.f100386c;
                                        DmtEditText dmtEditText = (DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.asq);
                                        h.f.b.l.b(dmtEditText, "");
                                        if (!(!h.f.b.l.a((Object) str, (Object) String.valueOf(dmtEditText.getText())))) {
                                            String str2 = baAutoReplyEditActivity.f100416b.f100387d;
                                            DmtEditText dmtEditText2 = (DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.asu);
                                            h.f.b.l.b(dmtEditText2, "");
                                            if (!(!h.f.b.l.a((Object) str2, (Object) String.valueOf(dmtEditText2.getText())))) {
                                                int i4 = baAutoReplyEditActivity.f100416b.f100385b;
                                                if (i4 == 0 || i4 == 2 || i4 == 3) {
                                                    baAutoReplyEditActivity.a(false);
                                                    TuxButton tuxButton = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a1a);
                                                    h.f.b.l.b(tuxButton, "");
                                                    tuxButton.setEnabled(false);
                                                    TuxButton tuxButton2 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a1a);
                                                    h.f.b.l.b(tuxButton2, "");
                                                    tuxButton2.setActivated(false);
                                                } else if (i4 == 4) {
                                                    baAutoReplyEditActivity.a(false);
                                                    TuxButton tuxButton3 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a1a);
                                                    h.f.b.l.b(tuxButton3, "");
                                                    tuxButton3.setEnabled(true);
                                                    TuxButton tuxButton4 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a1a);
                                                    h.f.b.l.b(tuxButton4, "");
                                                    tuxButton4.setActivated(true);
                                                }
                                            }
                                        }
                                        baAutoReplyEditActivity.a(true);
                                        TuxButton tuxButton5 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a1a);
                                        h.f.b.l.b(tuxButton5, "");
                                        tuxButton5.setEnabled(true);
                                        TuxButton tuxButton6 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a1a);
                                        h.f.b.l.b(tuxButton6, "");
                                        tuxButton6.setActivated(true);
                                    } else {
                                        baAutoReplyEditActivity.f100417c = true;
                                        baAutoReplyEditActivity.a(false);
                                        TuxButton tuxButton7 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a1a);
                                        h.f.b.l.b(tuxButton7, "");
                                        tuxButton7.setEnabled(false);
                                        TuxButton tuxButton8 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a1a);
                                        h.f.b.l.b(tuxButton8, "");
                                        tuxButton8.setActivated(false);
                                    }
                                    return z.f158842a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        static final class d implements DialogInterface.OnClickListener {

                            /* renamed from: a  reason: collision with root package name */
                            public static final d f100423a = new d();

                            static {
                                Covode.recordClassIndex(64153);
                            }

                            d() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a.b(8);
                            }
                        }

                        static final class l implements DialogInterface.OnClickListener {

                            /* renamed from: a  reason: collision with root package name */
                            public static final l f100428a = new l();

                            static {
                                Covode.recordClassIndex(64166);
                            }

                            l() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a.b(2);
                            }
                        }

                        static final class o implements DialogInterface.OnClickListener {

                            /* renamed from: a  reason: collision with root package name */
                            public static final o f100430a = new o();

                            static {
                                Covode.recordClassIndex(64172);
                            }

                            o() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a.b(6);
                            }
                        }

                        static final class q implements DialogInterface.OnClickListener {

                            /* renamed from: a  reason: collision with root package name */
                            public static final q f100433a = new q();

                            static {
                                Covode.recordClassIndex(64174);
                            }

                            q() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a.b(4);
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
                        public static final class c implements DialogInterface.OnClickListener {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ BaAutoReplyEditActivity f100422a;

                            static {
                                Covode.recordClassIndex(64150);
                            }

                            c(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                this.f100422a = baAutoReplyEditActivity;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                this.f100422a.b(false);
                                bz unused = kotlinx.coroutines.i.a(this.f100422a, null, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                    /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity.c.AnonymousClass1 */
                                    private /* synthetic */ Object L$0;
                                    int label;
                                    final /* synthetic */ c this$0;

                                    static {
                                        Covode.recordClassIndex(64151);
                                    }

                                    {
                                        this.this$0 = r2;
                                    }

                                    @Override // h.c.b.a.a
                                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                        h.f.b.l.d(dVar, "");
                                        AnonymousClass1 r1 = 

                                        static final class p implements DialogInterface.OnClickListener {

                                            /* renamed from: a  reason: collision with root package name */
                                            final /* synthetic */ BaAutoReplyEditActivity f100431a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ boolean f100432b = false;

                                            static {
                                                Covode.recordClassIndex(64173);
                                            }

                                            p(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                                this.f100431a = baAutoReplyEditActivity;
                                            }

                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a.b(3);
                                                if (this.f100432b) {
                                                    BaAutoReplyEditActivity.super.onBackPressed();
                                                }
                                                this.f100431a.finish();
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        public static final class r implements View.OnTouchListener {

                                            /* renamed from: a  reason: collision with root package name */
                                            final /* synthetic */ BaAutoReplyEditActivity f100434a;

                                            static {
                                                Covode.recordClassIndex(64175);
                                            }

                                            r(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                                this.f100434a = baAutoReplyEditActivity;
                                            }

                                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                h.f.b.l.b(motionEvent, "");
                                                if (motionEvent.getAction() == 1) {
                                                    new com.bytedance.tux.g.b(this.f100434a).e(R.string.h46).b();
                                                }
                                                return true;
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        public static final class j implements DialogInterface.OnClickListener {

                                            /* renamed from: a  reason: collision with root package name */
                                            final /* synthetic */ BaAutoReplyEditActivity f100427a;

                                            static {
                                                Covode.recordClassIndex(64160);
                                            }

                                            j(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                                this.f100427a = baAutoReplyEditActivity;
                                            }

                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                this.f100427a.b(false);
                                                DmtEditText dmtEditText = (DmtEditText) this.f100427a._$_findCachedViewById(R.id.asq);
                                                h.f.b.l.b(dmtEditText, "");
                                                String valueOf = String.valueOf(dmtEditText.getText());
                                                DmtEditText dmtEditText2 = (DmtEditText) this.f100427a._$_findCachedViewById(R.id.asu);
                                                h.f.b.l.b(dmtEditText2, "");
                                                final com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b bVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b(this.f100427a.f100416b.f100384a, 4, valueOf, String.valueOf(dmtEditText2.getText()));
                                                bz unused = kotlinx.coroutines.i.a(this.f100427a, null, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                                    /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity.j.AnonymousClass1 */
                                                    private /* synthetic */ Object L$0;
                                                    int label;
                                                    final /* synthetic */ j this$0;

                                                    static {
                                                        Covode.recordClassIndex(64161);
                                                    }

                                                    {
                                                        this.this$0 = r2;
                                                    }

                                                    @Override // h.c.b.a.a
                                                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                        h.f.b.l.d(dVar, "");
                                                        AnonymousClass1 r2 = 

                                                        /* access modifiers changed from: package-private */
                                                        public static final class m implements DialogInterface.OnClickListener {

                                                            /* renamed from: a  reason: collision with root package name */
                                                            final /* synthetic */ BaAutoReplyEditActivity f100429a;

                                                            static {
                                                                Covode.recordClassIndex(64167);
                                                            }

                                                            m(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                                                this.f100429a = baAutoReplyEditActivity;
                                                            }

                                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                                this.f100429a.b(false);
                                                                DmtEditText dmtEditText = (DmtEditText) this.f100429a._$_findCachedViewById(R.id.asq);
                                                                h.f.b.l.b(dmtEditText, "");
                                                                String valueOf = String.valueOf(dmtEditText.getText());
                                                                DmtEditText dmtEditText2 = (DmtEditText) this.f100429a._$_findCachedViewById(R.id.asu);
                                                                h.f.b.l.b(dmtEditText2, "");
                                                                final com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b bVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b(this.f100429a.f100416b.f100384a, 1, valueOf, String.valueOf(dmtEditText2.getText()));
                                                                bz unused = kotlinx.coroutines.i.a(this.f100429a, null, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                                                    /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity.m.AnonymousClass1 */
                                                                    private /* synthetic */ Object L$0;
                                                                    int label;
                                                                    final /* synthetic */ m this$0;

                                                                    static {
                                                                        Covode.recordClassIndex(64168);
                                                                    }

                                                                    {
                                                                        this.this$0 = r2;
                                                                    }

                                                                    @Override // h.c.b.a.a
                                                                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                                        h.f.b.l.d(dVar, "");
                                                                        AnonymousClass1 r2 = 
                                                                    }
