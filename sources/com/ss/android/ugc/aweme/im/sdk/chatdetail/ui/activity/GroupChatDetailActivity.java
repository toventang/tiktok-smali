package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.c.a;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.sheet.a.a;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

public final class GroupChatDetailActivity extends com.bytedance.ies.foundation.activity.a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f101590b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b f101591a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f101592c = h.i.a((h.f.a.a) s.f101618a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f101593d = h.i.a((h.f.a.a) new v(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f101594e = h.i.a((h.f.a.a) new h(this));

    /* renamed from: f  reason: collision with root package name */
    private HashMap f101595f;

    static {
        Covode.recordClassIndex(64959);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f101595f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f101595f == null) {
            this.f101595f = new HashMap();
        }
        View view = (View) this.f101595f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f101595f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return ((Boolean) this.f101592c.getValue()).booleanValue();
    }

    public final GroupChatDetailViewModel b() {
        return (GroupChatDetailViewModel) this.f101593d.getValue();
    }

    public final GroupChatController c() {
        return (GroupChatController) this.f101594e.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new org.greenrobot.eventbus.g(GroupChatDetailActivity.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64960);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Activity activity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar, int i2) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(bVar, "");
            Intent intent = new Intent(activity, GroupChatDetailActivity.class);
            intent.putExtra("key_session_info", bVar);
            activity.startActivityForResult(intent, i2);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<GroupChatController> {
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GroupChatController invoke() {
            return new GroupChatController(this.this$0.b(), this.this$0);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f101618a = new s();

        static {
            Covode.recordClassIndex(64995);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.f());
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        b().a(GroupChatDetailViewModel.ae.f101806a);
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

    public final void d() {
        ArrayList arrayList;
        String str;
        List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list;
        Bundle bundle = new Bundle();
        z zVar = z.INSTANCE;
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = b().b().getValue();
        if (value == null || (list = value.f101532f) == null) {
            arrayList = z.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                IMUser user = it.next().getUser();
                if (user != null) {
                    arrayList2.add(user);
                }
            }
            arrayList = arrayList2;
        }
        com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a aVar = com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.ADD_MEMBER;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar = this.f101591a;
        if (bVar == null || (str = bVar.getConversationId()) == null) {
            str = "";
        }
        bundle.putSerializable("member_select_config", new b.d(zVar, arrayList, aVar, str));
        RelationSelectActivity.a.a(this, bundle, 12333);
    }

    static final class v extends h.f.b.m implements h.f.a.a<GroupChatDetailViewModel> {
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(65001);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(GroupChatDetailActivity groupChatDetailActivity) {
            super(0);
            this.this$0 = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GroupChatDetailViewModel invoke() {
            String str;
            ac a2;
            GroupChatDetailActivity groupChatDetailActivity = this.this$0;
            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar = groupChatDetailActivity.f101591a;
            Object obj = null;
            if (bVar != null) {
                str = bVar.getConversationId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            h.f.b.l.d(groupChatDetailActivity, "");
            h.f.b.l.d(str, "");
            ad a3 = ae.a(groupChatDetailActivity, new com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.a(str, b.a.a(str)));
            String concat = "GroupChatDetailViewModel_".concat(String.valueOf(str));
            if (GroupChatDetailViewModel.class.equals(ScopeViewModel.class)) {
                a2 = a3.a(concat, GroupChatDetailViewModel.class);
            } else {
                a2 = a3.a(concat, GroupChatDetailViewModel.class);
                ab.a(a2, a3);
            }
            h.f.b.l.b(a2, "");
            GroupChatDetailViewModel groupChatDetailViewModel = (GroupChatDetailViewModel) a2;
            com.bytedance.ies.im.core.api.b.a().a(a.EnumC0747a.ENTER_CHAT_ROOM);
            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a.f100498d.a(groupChatDetailViewModel.f101798d, groupChatDetailViewModel.f101797c);
            com.bytedance.im.a.a.a a4 = com.bytedance.im.a.a.a.a();
            long a5 = groupChatDetailViewModel.a();
            GroupChatDetailViewModel.w wVar = new GroupChatDetailViewModel.w(groupChatDetailViewModel);
            boolean z = com.bytedance.im.core.a.d.a().b().aQ;
            com.bytedance.im.core.c.f.a("imsdk", "getNewestAuditList", (Throwable) null);
            new com.bytedance.im.a.a.a.d(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007e: INVOKE  
                  (wrap: com.bytedance.im.a.a.a.d : 0x0077: CONSTRUCTOR  (r8v0 com.bytedance.im.a.a.a.d) = 
                  (wrap: com.bytedance.im.a.a.a$1 : 0x0074: CONSTRUCTOR  (r0v10 com.bytedance.im.a.a.a$1) = 
                  (r2v5 'a4' com.bytedance.im.a.a.a)
                  (r1v5 'wVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$w)
                 call: com.bytedance.im.a.a.a.1.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                 call: com.bytedance.im.a.a.a.d.<init>(com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                  (0 long)
                  (r11v0 'a5' long)
                  (r13v0 'z' boolean)
                 type: VIRTUAL call: com.bytedance.im.a.a.a.d.a(long, long, boolean):void in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.v.invoke():com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0077: CONSTRUCTOR  (r8v0 com.bytedance.im.a.a.a.d) = 
                  (wrap: com.bytedance.im.a.a.a$1 : 0x0074: CONSTRUCTOR  (r0v10 com.bytedance.im.a.a.a$1) = 
                  (r2v5 'a4' com.bytedance.im.a.a.a)
                  (r1v5 'wVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$w)
                 call: com.bytedance.im.a.a.a.1.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                 call: com.bytedance.im.a.a.a.d.<init>(com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.v.invoke():com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 14 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: CONSTRUCTOR  (r0v10 com.bytedance.im.a.a.a$1) = 
                  (r2v5 'a4' com.bytedance.im.a.a.a)
                  (r1v5 'wVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$w)
                 call: com.bytedance.im.a.a.a.1.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.v.invoke():com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 20 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.a.a.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 26 more
                */
            /*
            // Method dump skipped, instructions count: 258
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.v.invoke():java.lang.Object");
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $member;
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(GroupChatDetailActivity groupChatDetailActivity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            super(1);
            this.this$0 = groupChatDetailActivity;
            this.$member = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(android.view.View r3) {
            /*
                r2 = this;
                android.view.View r3 = (android.view.View) r3
                java.lang.String r1 = ""
                h.f.b.l.d(r3, r1)
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity r0 = r2.this$0
                r0.b()
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a r0 = r2.$member
                h.f.b.l.d(r0, r1)
                java.lang.String r0 = r0.getUid()
                com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(r0)
                com.bytedance.tux.sheet.sheet.a.b.a(r3)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f101601a = new i();

        static {
            Covode.recordClassIndex(64971);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f101602a);
            baseActivityViewModel2.config(AnonymousClass2.f101603a);
            baseActivityViewModel2.config(AnonymousClass3.f101604a);
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.this$0 = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.c9l, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.u.AnonymousClass1 */
                final /* synthetic */ u this$0;

                static {
                    Covode.recordClassIndex(65000);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    SmartRouter.buildRoute(this.this$0.this$0, "aweme://webview").withParam(Uri.parse("https://www.tiktok.com/web-inapp/suicide/help?enter_from=dm_group_name_popup")).open();
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    static final class b<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f101596a;

        static {
            Covode.recordClassIndex(64961);
        }

        b(GroupChatDetailActivity groupChatDetailActivity) {
            this.f101596a = groupChatDetailActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView recyclerView = (RecyclerView) this.f101596a._$_findCachedViewById(R.id.bkb);
            h.f.b.l.b(recyclerView, "");
            RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.d();
            }
            this.f101596a.c().setData(this.f101596a.b().f101799e, obj);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<IMUser, h.z> {
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.this$0 = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(IMUser iMUser) {
            IMUser iMUser2 = iMUser;
            h.f.b.l.d(iMUser2, "");
            this.this$0.b().a(iMUser2);
            this.this$0.b().g();
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_leave_admin", new h.p[0]);
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $imMember;
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(GroupChatDetailActivity groupChatDetailActivity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            super(1);
            this.this$0 = groupChatDetailActivity;
            this.$imMember = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.this$0.getString(R.string.c78);
            h.f.b.l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(64976);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.b().a(this.this$0.$imMember.getUser());
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_admin_pop", h.v.a("confirm", "result"));
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, AnonymousClass2.f101605a);
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $imMember;
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(GroupChatDetailActivity groupChatDetailActivity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            super(1);
            this.this$0 = groupChatDetailActivity;
            this.$imMember = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.this$0.getString(R.string.c78);
            h.f.b.l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(64979);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.b();
                    GroupChatDetailViewModel.a(this.this$0.$imMember);
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_block_pop", h.v.a("confirm", "result"));
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, AnonymousClass2.f101606a);
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64985);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.this$0 = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.this$0.getString(R.string.b5g);
            h.f.b.l.b(string, "");
            bVar2.c(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(64986);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    GroupChatDetailViewModel b2 = this.this$0.this$0.b();
                    b2.f101799e.b(new GroupChatDetailViewModel.i(b2));
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_end_pop_up", h.v.a("end", "result"));
                    return h.z.f158842a;
                }
            });
            String string2 = this.this$0.getString(R.string.a9e);
            h.f.b.l.b(string2, "");
            bVar2.b(string2, AnonymousClass2.f101608a);
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.this$0 = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.this$0.getString(R.string.c6w);
            h.f.b.l.b(string, "");
            bVar2.c(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.n.AnonymousClass1 */
                final /* synthetic */ n this$0;

                static {
                    Covode.recordClassIndex(64989);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.b().g();
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_leave_pop", h.v.a("leave", "result"));
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, AnonymousClass2.f101609a);
            return h.z.f158842a;
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f101610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a f101611b;

        static {
            Covode.recordClassIndex(64991);
        }

        o(GroupChatDetailActivity groupChatDetailActivity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            this.f101610a = groupChatDetailActivity;
            this.f101611b = aVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r5)
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity r0 = r4.f101610a
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel r3 = r0.b()
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a r1 = r4.f101611b
                java.lang.String r2 = ""
                h.f.b.l.d(r1, r2)
                com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r1.getUser()
                if (r0 == 0) goto L_0x001f
                boolean r0 = r0.isBlock()
                if (r0 == 0) goto L_0x002e
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.a(r1)
            L_0x001f:
                r0 = 0
                h.p[] r1 = new h.p[r0]
                java.lang.String r0 = "click_member_block"
                com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(r0, r1)
                h.f.b.l.b(r5, r2)
                com.bytedance.tux.sheet.sheet.a.b.a(r5)
                return
            L_0x002e:
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ar r0 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ar
                r0.<init>(r3, r1)
                r3.b(r0)
                goto L_0x001f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.o.onClick(android.view.View):void");
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f101614a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a f101615b;

        static {
            Covode.recordClassIndex(64993);
        }

        q(GroupChatDetailActivity groupChatDetailActivity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            this.f101614a = groupChatDetailActivity;
            this.f101615b = aVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r6)
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity r0 = r5.f101614a
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel r4 = r0.b()
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a r3 = r5.f101615b
                java.lang.String r2 = ""
                h.f.b.l.d(r3, r2)
                r0 = 0
                h.p[] r1 = new h.p[r0]
                java.lang.String r0 = "click_member_admin"
                com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(r0, r1)
                boolean r0 = r4.h()
                if (r0 == 0) goto L_0x002a
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$f r0 = com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel.f.f101819a
                r4.b(r0)
            L_0x0023:
                h.f.b.l.b(r6, r2)
                com.bytedance.tux.sheet.sheet.a.b.a(r6)
                return
            L_0x002a:
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$g r0 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$g
                r0.<init>(r3)
                r4.b(r0)
                goto L_0x0023
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.q.onClick(android.view.View):void");
        }
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f101616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a f101617b;

        static {
            Covode.recordClassIndex(64994);
        }

        r(GroupChatDetailActivity groupChatDetailActivity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            this.f101616a = groupChatDetailActivity;
            this.f101617b = aVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r5)
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity r0 = r4.f101616a
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel r3 = r0.b()
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a r1 = r4.f101617b
                java.lang.String r2 = ""
                h.f.b.l.d(r1, r2)
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ah r0 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ah
                r0.<init>(r1)
                r3.b(r0)
                r0 = 0
                h.p[] r1 = new h.p[r0]
                java.lang.String r0 = "click_member_remove"
                com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(r0, r1)
                h.f.b.l.b(r5, r2)
                com.bytedance.tux.sheet.sheet.a.b.a(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.r.onClick(android.view.View):void");
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $imMember;
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(GroupChatDetailActivity groupChatDetailActivity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            super(1);
            this.this$0 = groupChatDetailActivity;
            this.$imMember = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.this$0.getString(R.string.fbo);
            h.f.b.l.b(string, "");
            bVar2.c(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.t.AnonymousClass1 */
                final /* synthetic */ t this$0;

                static {
                    Covode.recordClassIndex(64997);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    GroupChatDetailViewModel b2 = this.this$0.this$0.b();
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar2 = this.this$0.$imMember;
                    h.f.b.l.d(aVar2, "");
                    b2.f101799e.b(h.a.n.a(aVar2.getUid()), ag.a(), new GroupChatDetailViewModel.k(b2));
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_remove_pop", h.v.a("confirm", "result"));
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, AnonymousClass2.f101619a);
            return h.z.f158842a;
        }
    }

    static boolean a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
        int i2;
        boolean z;
        IMUser user = aVar.getUser();
        if (user != null) {
            i2 = user.getFollowStatus();
        } else {
            i2 = 0;
        }
        boolean a2 = in.a(i2);
        IMUser user2 = aVar.getUser();
        if (user2 == null || user2.getFollowStatus() != 4) {
            z = false;
        } else {
            z = true;
        }
        if (a2 || z) {
            return true;
        }
        return false;
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        h.f.b.l.d(jVar, "");
        new com.bytedance.tux.g.b(this).e(R.string.c75).b(R.raw.icon_tick_fill_small).c(androidx.core.content.b.c(this, R.color.bf)).b();
    }

    static final class f extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $member;
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(GroupChatDetailActivity groupChatDetailActivity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            super(1);
            this.this$0 = groupChatDetailActivity;
            this.$member = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(android.view.View r15) {
            /*
                r14 = this;
                android.view.View r15 = (android.view.View) r15
                java.lang.String r1 = ""
                h.f.b.l.d(r15, r1)
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity r0 = r14.this$0
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel r5 = r0.b()
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a r0 = r14.$member
                h.f.b.l.d(r0, r1)
                com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r0.getUser()
                if (r4 == 0) goto L_0x0050
                boolean r13 = r4.isSecret()
                int r0 = r4.getFollowerStatus()
                r3 = 1
                if (r0 != r3) goto L_0x0056
                java.lang.String r12 = "single"
            L_0x0025:
                com.ss.android.ugc.aweme.notice.api.helper.LogHelper r6 = com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl.a()
                java.lang.String r11 = r4.getUid()
                h.f.b.l.b(r11, r1)
                java.lang.String r7 = "member_list"
                java.lang.String r8 = "message"
                java.lang.String r9 = "other_places"
                java.lang.String r10 = "follow_button"
                r6.a(r7, r8, r9, r10, r11, r12, r13)
                r0 = 0
                com.ss.android.ugc.aweme.friends.service.IFollowService r6 = com.ss.android.ugc.aweme.friends.services.FollowService.createIFollowServicebyMonsterPlugin(r0)
                java.lang.String r2 = r4.getUid()
                java.lang.String r1 = r4.getSecUid()
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$u r0 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$u
                r0.<init>(r4, r5)
                r6.sendRequest(r2, r1, r3, r0)
            L_0x0050:
                com.bytedance.tux.sheet.sheet.a.b.a(r15)
                h.z r0 = h.z.f158842a
                return r0
            L_0x0056:
                java.lang.String r12 = "mutual"
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.this$0 = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = this.this$0.getString(R.string.c71);
            h.f.b.l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(64982);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    List<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a> list;
                    androidx.fragment.app.e eVar;
                    Activity activity;
                    androidx.fragment.app.i supportFragmentManager;
                    h.f.b.l.d(aVar, "");
                    GroupChatDetailActivity groupChatDetailActivity = this.this$0.this$0;
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = groupChatDetailActivity.b().b().getValue();
                    if (!(value == null || (list = value.f101532f) == null)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            IMUser user = it.next().getUser();
                            if (user != null) {
                                arrayList.add(user);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (!h.f.b.l.a((Object) ((IMUser) obj).getUid(), (Object) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b())) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        Context context = groupChatDetailActivity;
                        while (true) {
                            eVar = null;
                            if (context != null) {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                if (!(context instanceof ContextWrapper)) {
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                break;
                            }
                        }
                        activity = null;
                        if (activity instanceof androidx.fragment.app.e) {
                            eVar = activity;
                        }
                        androidx.fragment.app.e eVar2 = eVar;
                        if (!(eVar2 == null || (supportFragmentManager = eVar2.getSupportFragmentManager()) == null)) {
                            new a.C1112a().a(new com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.a(groupChatDetailActivity, arrayList3, new g(groupChatDetailActivity))).a(0).b(false).f45299a.show(supportFragmentManager, "GroupChatDetailActivity");
                        }
                    }
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_leave_pop", h.v.a("choose_admin", "result"));
                    return h.z.f158842a;
                }
            });
            String string2 = this.this$0.getString(R.string.c6w);
            h.f.b.l.b(string2, "");
            bVar2.c(string2, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.l.AnonymousClass2 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(64983);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.b().g();
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_leave_pop", h.v.a("leave", "result"));
                    return h.z.f158842a;
                }
            });
            String string3 = this.this$0.getString(R.string.a9e);
            h.f.b.l.b(string3, "");
            bVar2.b(string3, AnonymousClass3.f101607a);
            bVar2.f44820b = true;
            return h.z.f158842a;
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f101612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a f101613b;

        static {
            Covode.recordClassIndex(64992);
        }

        p(GroupChatDetailActivity groupChatDetailActivity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar) {
            this.f101612a = groupChatDetailActivity;
            this.f101613b = aVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
        public final void onClick(android.view.View r18) {
            /*
            // Method dump skipped, instructions count: 103
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.p.onClick(android.view.View):void");
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onCreate", true);
        activityConfiguration(i.f101601a);
        super.onCreate(bundle);
        setContentView(R.layout.a4a);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().setupStatusBar(this);
        Serializable serializableExtra = getIntent().getSerializableExtra("key_session_info");
        if (!(serializableExtra instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b)) {
            serializableExtra = null;
        }
        this.f101591a = (com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b) serializableExtra;
        b().b().observe(this, new b(this));
        ((EpoxyRecyclerView) _$_findCachedViewById(R.id.bkb)).setController(c());
        b().b().observe(this, new c(this));
        b().c().observe(this, new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.a(new d(this)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity", "onCreate", false);
    }

    static final class c<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatDetailActivity f101597a;

        static {
            Covode.recordClassIndex(64962);
        }

        c(GroupChatDetailActivity groupChatDetailActivity) {
            this.f101597a = groupChatDetailActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar = (com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b) obj;
            if (!bVar.f101530d.f101549c) {
                ((ImTextTitleBar) this.f101597a._$_findCachedViewById(R.id.blt)).setRightTextVisibility(8);
                ((ImTextTitleBar) this.f101597a._$_findCachedViewById(R.id.blt)).setOnTitlebarClickListener(new ImTextTitleBar.a(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f101598a;

                    static {
                        Covode.recordClassIndex(64963);
                    }

                    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                    public final void a(int i2) {
                    }

                    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                    public final void b() {
                    }

                    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                    public final void c() {
                    }

                    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                    public final void a() {
                        this.f101598a.f101597a.finish();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f101598a = r1;
                    }
                });
                return;
            }
            ((ImTextTitleBar) this.f101597a._$_findCachedViewById(R.id.blt)).setRightTextVisibility(0);
            ((ImTextTitleBar) this.f101597a._$_findCachedViewById(R.id.blt)).setRightTuxFont(42);
            if (bVar.f101530d.f101550d) {
                ((ImTextTitleBar) this.f101597a._$_findCachedViewById(R.id.blt)).setRightTextColor(androidx.core.content.b.c(this.f101597a, R.color.bz));
                ((ImTextTitleBar) this.f101597a._$_findCachedViewById(R.id.blt)).setOnTitlebarClickListener(new ImTextTitleBar.a(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.c.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f101599a;

                    static {
                        Covode.recordClassIndex(64964);
                    }

                    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                    public final void a(int i2) {
                    }

                    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                    public final void b() {
                    }

                    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                    public final void c() {
                    }

                    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                    public final void a() {
                        this.f101599a.f101597a.finish();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f101599a = r1;
                    }
                });
                return;
            }
            ((ImTextTitleBar) this.f101597a._$_findCachedViewById(R.id.blt)).setRightTextColor(androidx.core.content.b.c(this.f101597a, R.color.bh));
            ((ImTextTitleBar) this.f101597a._$_findCachedViewById(R.id.blt)).setOnTitlebarClickListener(new ImTextTitleBar.a(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity.c.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f101600a;

                static {
                    Covode.recordClassIndex(64965);
                }

                @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                public final void b() {
                }

                @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                public final void c() {
                }

                @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                public final void a() {
                    this.f101600a.f101597a.finish();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f101600a = r1;
                }

                @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
                public final void a(int i2) {
                    this.f101600a.f101597a.b().d();
                }
            });
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c, h.z> {
        final /* synthetic */ GroupChatDetailActivity this$0;

        static {
            Covode.recordClassIndex(64966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.this$0 = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar) {
            a.C1109a eVar;
            a.C1109a a2;
            a.C1109a eVar2;
            int i2;
            a.C1109a eVar3;
            a.C1109a eVar4;
            a.C1109a eVar5;
            a.C1109a eVar6;
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            if (cVar2.f101534a) {
                GroupChatDetailActivity groupChatDetailActivity = this.this$0;
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.c.a(groupChatDetailActivity).a(false).a(R.string.c83).b(R.string.c85), new m(groupChatDetailActivity)).a().b().show();
            }
            if (cVar2.f101535b) {
                GroupChatDetailActivity groupChatDetailActivity2 = this.this$0;
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.c.a(groupChatDetailActivity2).a(false).a(R.string.c76).b(R.string.c77), new n(groupChatDetailActivity2)).a().b().show();
            }
            if (cVar2.f101546m) {
                GroupChatDetailActivity groupChatDetailActivity3 = this.this$0;
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.c.a(groupChatDetailActivity3).b(R.string.c9k), new u(groupChatDetailActivity3)).a().b().show();
            }
            if (cVar2.f101536c.length() > 0) {
                new com.bytedance.tux.g.b(this.this$0).a(cVar2.f101536c).b();
            }
            if (cVar2.f101537d) {
                this.this$0.setResult(2097);
                this.this$0.finish();
            }
            if (cVar2.f101538e) {
                GroupChatController c2 = this.this$0.c();
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) this.this$0._$_findCachedViewById(R.id.bkb);
                h.f.b.l.b(epoxyRecyclerView, "");
                c2.scrollToRequestInfoModel(epoxyRecyclerView);
            }
            if (cVar2.f101539f) {
                GroupChatDetailActivity groupChatDetailActivity4 = this.this$0;
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.c.a(groupChatDetailActivity4).a(false).a(R.string.c6z).b(R.string.c82), new l(groupChatDetailActivity4)).a().b().show();
            }
            String str = null;
            if (cVar2.f101540g != null) {
                GroupChatDetailActivity groupChatDetailActivity5 = this.this$0;
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar = cVar2.f101540g;
                a.C1109a[] aVarArr = new a.C1109a[3];
                if (GroupChatDetailActivity.a(aVar)) {
                    if (groupChatDetailActivity5.a()) {
                        eVar6 = new a.d().c(R.raw.icon_person);
                    } else {
                        eVar6 = new a.e();
                    }
                    a2 = eVar6.a(R.string.c9w).a(new e(groupChatDetailActivity5, aVar));
                } else {
                    String string = groupChatDetailActivity5.a() ? groupChatDetailActivity5.getString(R.string.byp) : "+ " + groupChatDetailActivity5.getString(R.string.byp);
                    h.f.b.l.b(string, "");
                    String string2 = groupChatDetailActivity5.getString(R.string.byq);
                    h.f.b.l.b(string2, "");
                    if (groupChatDetailActivity5.a()) {
                        eVar = new a.d().c(R.raw.icon_plus);
                    } else {
                        eVar = new a.e();
                    }
                    IMUser user = aVar.getUser();
                    if (user != null && user.getFollowerStatus() == 1) {
                        string = string2;
                    }
                    a2 = eVar.a(string).b(1).a(new f(groupChatDetailActivity5, aVar));
                }
                aVarArr[0] = a2;
                if (groupChatDetailActivity5.a()) {
                    eVar2 = new a.d().c(R.raw.icon_block);
                    if (GroupChatDetailActivity.a(aVar)) {
                        eVar2 = (a.d) eVar2.b(1);
                    }
                } else {
                    eVar2 = new a.e();
                }
                IMUser user2 = aVar.getUser();
                if (user2 == null || !user2.isBlock()) {
                    i2 = R.string.cdc;
                } else {
                    i2 = R.string.cj5;
                }
                aVarArr[1] = eVar2.a(i2).a(new o(groupChatDetailActivity5, aVar));
                if (groupChatDetailActivity5.a()) {
                    eVar3 = new a.d().c(R.raw.icon_flag);
                    if (GroupChatDetailActivity.a(aVar)) {
                        eVar3 = (a.d) eVar3.b(1);
                    }
                } else {
                    eVar3 = new a.e();
                }
                aVarArr[2] = eVar3.a(R.string.chg).a(new p(groupChatDetailActivity5, aVar));
                List<a.C1109a> c3 = h.a.n.c(aVarArr);
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = groupChatDetailActivity5.b().b().getValue();
                if (com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(value != null ? value.f101532f : null)) {
                    a.C1109a[] aVarArr2 = new a.C1109a[2];
                    if (groupChatDetailActivity5.a()) {
                        eVar4 = new a.d().c(R.raw.icon_person);
                    } else {
                        eVar4 = new a.e();
                    }
                    aVarArr2[0] = eVar4.a(R.string.c6o).a(new q(groupChatDetailActivity5, aVar));
                    if (groupChatDetailActivity5.a()) {
                        eVar5 = new a.d().c(R.raw.icon_person_x_mark);
                    } else {
                        eVar5 = new a.e();
                    }
                    aVarArr2[1] = eVar5.a(R.string.c6p).b(1).a(new r(groupChatDetailActivity5, aVar));
                    c3.addAll(h.a.n.b(aVarArr2));
                }
                a.b a3 = new a.b().a(R.string.a9e);
                String nickName = aVar.getNickName();
                if (nickName == null) {
                    nickName = "";
                }
                a.b a4 = a3.a(nickName);
                if (groupChatDetailActivity5.a()) {
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) c3, 10));
                    for (a.C1109a aVar2 : c3) {
                        Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.bytedance.tux.sheet.actionsheet.TuxActionSheet.IconAction");
                        arrayList.add(aVar2);
                    }
                    a4.a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) c3, 10));
                    for (a.C1109a aVar3 : c3) {
                        Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.bytedance.tux.sheet.actionsheet.TuxActionSheet.TextAction");
                        arrayList2.add(aVar3);
                    }
                    a4.b(arrayList2);
                }
                a4.b().show(groupChatDetailActivity5.getSupportFragmentManager(), "MEMBER_OPERATION_DIALOG");
            }
            if (cVar2.f101541h != null) {
                GroupChatDetailActivity groupChatDetailActivity6 = this.this$0;
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar4 = cVar2.f101541h;
                com.bytedance.tux.dialog.b a5 = com.bytedance.tux.dialog.c.a(groupChatDetailActivity6);
                Object[] objArr = new Object[1];
                IMUser user3 = aVar4.getUser();
                objArr[0] = user3 != null ? user3.getNickName() : null;
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a5.b(groupChatDetailActivity6.getString(R.string.c8z, objArr)).b(R.string.c90), new k(groupChatDetailActivity6, aVar4)).a().b().show();
            }
            if (cVar2.f101542i != null) {
                GroupChatDetailActivity groupChatDetailActivity7 = this.this$0;
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar5 = cVar2.f101542i;
                com.bytedance.tux.dialog.b a6 = com.bytedance.tux.dialog.c.a(groupChatDetailActivity7);
                Object[] objArr2 = new Object[1];
                IMUser user4 = aVar5.getUser();
                objArr2[0] = user4 != null ? user4.getNickName() : null;
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a6.b(groupChatDetailActivity7.getString(R.string.c9c, objArr2)).b(R.string.c9d), new j(groupChatDetailActivity7, aVar5)).a().b().show();
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar6 = cVar2.f101543j;
            if (aVar6 != null) {
                GroupChatDetailActivity groupChatDetailActivity8 = this.this$0;
                com.bytedance.tux.dialog.b a7 = com.bytedance.tux.dialog.c.a(groupChatDetailActivity8);
                Object[] objArr3 = new Object[1];
                IMUser user5 = aVar6.getUser();
                if (user5 != null) {
                    str = user5.getNickName();
                }
                objArr3[0] = str;
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a7.b(groupChatDetailActivity8.getString(R.string.c9r, objArr3)).b(R.string.c9s), new t(groupChatDetailActivity8, aVar6)).a().b().show();
            }
            Pair<Integer, String> pair = cVar2.f101545l;
            if (pair != null) {
                com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.this$0);
                Object obj = pair.first;
                h.f.b.l.b(obj, "");
                bVar.b(((Number) obj).intValue()).c(androidx.core.content.b.c(this.this$0, R.color.bf)).a((CharSequence) pair.second).b();
            }
            if (cVar2.f101544k) {
                this.this$0.d();
            }
            return h.z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == 2095) {
            finish();
        } else if (i3 != 2098) {
            super.onActivityResult(i2, i3, intent);
        } else {
            b.a.a(b().f101798d, this);
        }
    }
}
