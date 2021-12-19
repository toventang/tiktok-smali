package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import h.i;

public final class GroupChatTitleBarComponent implements au, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.c {

    /* renamed from: a  reason: collision with root package name */
    public String f100569a;

    /* renamed from: b  reason: collision with root package name */
    public final GroupChatViewModel f100570b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a f100571c;

    /* renamed from: d  reason: collision with root package name */
    public final ImTextTitleBar f100572d;

    /* renamed from: e  reason: collision with root package name */
    private final h f100573e = i.a((h.f.a.a) g.f100583a);

    /* renamed from: f  reason: collision with root package name */
    private final h f100574f = i.a((h.f.a.a) a.f100575a);

    static {
        Covode.recordClassIndex(64329);
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.tux.c.a a() {
        return (com.bytedance.tux.c.a) this.f100573e.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.tux.c.a b() {
        return (com.bytedance.tux.c.a) this.f100574f.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            setup();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.bytedance.tux.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f100575a = new a();

        static {
            Covode.recordClassIndex(64330);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.c.a invoke() {
            return com.bytedance.tux.c.c.a(AnonymousClass1.f100576a);
        }
    }

    public static final class e implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatTitleBarComponent f100580a;

        static {
            Covode.recordClassIndex(64335);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void b() {
            this.f100580a.a(StringSet.name);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void c() {
            this.f100580a.a(StringSet.name);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a() {
            this.f100580a.f100571c.c();
            this.f100580a.f100571c.requireActivity().finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(GroupChatTitleBarComponent groupChatTitleBarComponent) {
            this.f100580a = groupChatTitleBarComponent;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index: 0
            	at java.base/java.util.Collections$EmptyList.get(Collections.java:4586)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a(int r4) {
            /*
                r3 = this;
                r0 = 2131755316(0x7f100134, float:1.9141508E38)
                if (r4 != r0) goto L_0x0029
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent r0 = r3.f100580a
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel r0 = r0.f100570b
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b r0 = r0.f100605e
                java.lang.String r0 = r0.getConversationId()
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.g$a r2 = com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(r0)
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent r0 = r3.f100580a
                com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a r0 = r0.f100571c
                androidx.fragment.app.e r1 = r0.requireActivity()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                java.lang.String r0 = "entrance"
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(r2, r1, r0)
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a.a.b()
                return
            L_0x0029:
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent r1 = r3.f100580a
                java.lang.String r0 = "button"
                r1.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent.e.a(int):void");
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.im.sdk.common.controller.utils.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatTitleBarComponent f100581a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f100582b;

        static {
            Covode.recordClassIndex(64336);
        }

        @Override // com.facebook.drawee.c.d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onSubmit(String str, Object obj) {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.e
        public final void a() {
            this.f100581a.f100569a = this.f100582b;
        }

        f(GroupChatTitleBarComponent groupChatTitleBarComponent, String str) {
            this.f100581a = groupChatTitleBarComponent;
            this.f100582b = str;
        }

        @Override // com.facebook.drawee.c.d
        public final void onFailure(String str, Throwable th) {
            this.f100581a.f100569a = null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            a();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.tux.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f100583a = new g();

        static {
            Covode.recordClassIndex(64337);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.c.a invoke() {
            return com.bytedance.tux.c.c.a(AnonymousClass1.f100584a);
        }
    }

    @v(a = i.a.ON_CREATE)
    public final void setup() {
        this.f100570b.f100601a.observe(this.f100571c.getViewLifecycleOwner(), new b(this));
        this.f100570b.f100602b.observe(this.f100571c.getViewLifecycleOwner(), new c(this));
        this.f100570b.f100603c.observe(this.f100571c.getViewLifecycleOwner(), new d(this));
        this.f100572d.setLeftTitleVisible(true);
        ViewGroup.LayoutParams layoutParams = this.f100572d.getLayoutParams();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 56.0f, system.getDisplayMetrics()));
        this.f100572d.setOnTitlebarClickListener(new e(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatTitleBarComponent f100577a;

        static {
            Covode.recordClassIndex(64332);
        }

        b(GroupChatTitleBarComponent groupChatTitleBarComponent) {
            this.f100577a = groupChatTitleBarComponent;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Integer num = (Integer) obj;
            Boolean value = this.f100577a.f100570b.f100603c.getValue();
            if (value == null) {
                value = Boolean.valueOf(com.ss.android.ugc.aweme.im.sdk.group.a.a.a.b(this.f100577a.f100570b.f100602b.getValue()));
            }
            l.b(value, "");
            boolean booleanValue = value.booleanValue();
            ImTextTitleBar imTextTitleBar = this.f100577a.f100572d;
            if (num.intValue() <= 0 || !booleanValue) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imTextTitleBar.setRightDotVisibility(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatTitleBarComponent f100578a;

        static {
            Covode.recordClassIndex(64333);
        }

        c(GroupChatTitleBarComponent groupChatTitleBarComponent) {
            this.f100578a = groupChatTitleBarComponent;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            com.bytedance.im.core.d.h hVar = (com.bytedance.im.core.d.h) obj;
            if (hVar != null) {
                GroupChatTitleBarComponent groupChatTitleBarComponent = this.f100578a;
                com.bytedance.im.core.d.i coreInfo = hVar.getCoreInfo();
                if (coreInfo != null) {
                    str = coreInfo.getIcon();
                } else {
                    str = null;
                }
                if (hk.a(str) && (!l.a((Object) groupChatTitleBarComponent.f100569a, (Object) str))) {
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(n.c(str));
                    ImTextTitleBar imTextTitleBar = groupChatTitleBarComponent.f100572d;
                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(imTextTitleBar.f102530a, urlModel, new f(groupChatTitleBarComponent, str));
                }
                groupChatTitleBarComponent.f100572d.setTitle(com.ss.android.ugc.aweme.im.sdk.group.a.a.a.e(hVar));
                groupChatTitleBarComponent.f100572d.setHint(groupChatTitleBarComponent.f100571c.getResources().getQuantityString(R.plurals.cy, hVar.getMemberCount(), Integer.valueOf(hVar.getMemberCount())));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatTitleBarComponent f100579a;

        static {
            Covode.recordClassIndex(64334);
        }

        d(GroupChatTitleBarComponent groupChatTitleBarComponent) {
            this.f100579a = groupChatTitleBarComponent;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            GroupChatTitleBarComponent groupChatTitleBarComponent = this.f100579a;
            l.b(bool, "");
            boolean booleanValue = bool.booleanValue();
            if (!booleanValue) {
                groupChatTitleBarComponent.f100572d.getRightView().setOnTouchListener(null);
                groupChatTitleBarComponent.a().f44753e = Integer.valueOf((int) R.attr.bd);
                groupChatTitleBarComponent.b().f44753e = Integer.valueOf((int) R.attr.bd);
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.b()) {
                    groupChatTitleBarComponent.f100572d.setRightIcons(groupChatTitleBarComponent.b(), groupChatTitleBarComponent.a());
                }
            } else if (booleanValue) {
                groupChatTitleBarComponent.a().f44753e = Integer.valueOf((int) R.attr.bc);
                groupChatTitleBarComponent.b().f44753e = Integer.valueOf((int) R.attr.bc);
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.b()) {
                    groupChatTitleBarComponent.f100572d.setRightIcons(groupChatTitleBarComponent.b(), groupChatTitleBarComponent.a());
                }
            }
        }
    }

    public final void a(String str) {
        boolean z;
        String str2;
        com.bytedance.im.core.d.i coreInfo;
        GroupChatViewModel groupChatViewModel = this.f100570b;
        androidx.fragment.app.e requireActivity = this.f100571c.requireActivity();
        l.b(requireActivity, "");
        l.d(requireActivity, "");
        if (com.ss.android.ugc.aweme.im.sdk.group.a.a.a.b(groupChatViewModel.a())) {
            com.bytedance.im.core.d.h a2 = groupChatViewModel.a();
            if (a2 == null || (coreInfo = a2.getCoreInfo()) == null || coreInfo.getOwner() != com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.e()) {
                z = false;
            } else {
                z = true;
            }
            String conversationId = groupChatViewModel.f100605e.getConversationId();
            androidx.c.a aVar = new androidx.c.a();
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            aVar.put("is_master", str2);
            aVar.put("enter_method", str);
            aVar.put("conversation_id", conversationId);
            r.a("enter_group_setting", aVar);
            GroupChatDetailActivity.a.a(requireActivity, groupChatViewModel.f100605e, 16);
        }
    }

    public GroupChatTitleBarComponent(GroupChatViewModel groupChatViewModel, com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a aVar, ImTextTitleBar imTextTitleBar) {
        l.d(groupChatViewModel, "");
        l.d(aVar, "");
        l.d(imTextTitleBar, "");
        this.f100570b = groupChatViewModel;
        this.f100571c = aVar;
        this.f100572d = imTextTitleBar;
    }
}
