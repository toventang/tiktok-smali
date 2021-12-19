package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class BaAutoReplyListActivity extends com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a implements View.OnClickListener, a.b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f100435d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.a.a f100436a = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.a.a();

    /* renamed from: b  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b> f100437b;

    /* renamed from: c  reason: collision with root package name */
    public final IBaAutoMessageService f100438c = BaAutoMessageServiceImpl.d();

    /* renamed from: e  reason: collision with root package name */
    private HashMap f100439e;

    static {
        Covode.recordClassIndex(64176);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f100439e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f100439e == null) {
            this.f100439e = new HashMap();
        }
        View view = (View) this.f100439e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f100439e.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64177);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b> b() {
        List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b> list = this.f100437b;
        if (list == null) {
            l.a("messages");
        }
        return list;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity", "onResume", true);
        super.onResume();
        bz unused = i.a(this, null, null, new c(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity", "onResume", false);
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

    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaAutoReplyListActivity f100440a;

        static {
            Covode.recordClassIndex(64178);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            l.d(view, "");
        }

        b(BaAutoReplyListActivity baAutoReplyListActivity) {
            this.f100440a = baAutoReplyListActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            l.d(view, "");
            this.f100440a.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.a.a.b
    public final void a(int i2) {
        List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b> list = this.f100437b;
        if (list == null) {
            l.a("messages");
        }
        BaAutoReplyEditActivity.a.a(this, "business_auto_reply", list.get(i2).f100384a);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b> list = this.f100437b;
        if (list == null) {
            l.a("messages");
        }
        if (list.size() >= 4) {
            new com.bytedance.tux.g.b(this).e(R.string.d32).b();
        } else {
            BaAutoReplyEditActivity.a.a(this, "business_message_setting_page", 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends k implements m<am, d<? super z>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ BaAutoReplyListActivity this$0;

        static {
            Covode.recordClassIndex(64179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BaAutoReplyListActivity baAutoReplyListActivity, d dVar) {
            super(2, dVar);
            this.this$0 = baAutoReplyListActivity;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0094 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
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
    public final void onCreate(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyListActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
