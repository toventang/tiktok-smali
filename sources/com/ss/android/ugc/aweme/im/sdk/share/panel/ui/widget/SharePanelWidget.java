package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.c;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cu;
import kotlinx.coroutines.internal.o;

public final class SharePanelWidget extends Widget implements com.bytedance.assem.arch.viewModel.h, au, com.ss.android.ugc.aweme.im.sdk.share.b.a.b, com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f103543m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f103544a;

    /* renamed from: b  reason: collision with root package name */
    public SharePanelViewModel f103545b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f103546c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b f103547d;

    /* renamed from: e  reason: collision with root package name */
    public View f103548e;

    /* renamed from: f  reason: collision with root package name */
    DmtEditText f103549f;

    /* renamed from: g  reason: collision with root package name */
    public a f103550g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b f103551h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.social.widget.card.d f103552i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f103553j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.share.b.b f103554k;

    /* renamed from: l  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.share.a.c f103555l;
    private RemoteImageView n;
    private TuxButton o;
    private LinearLayout p;
    private TuxIconView q;
    private com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c r;
    private boolean s;
    private boolean t;
    private boolean u;

    static {
        Covode.recordClassIndex(66340);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void c(boolean z) {
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66341);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0141, code lost:
        if (r21 != false) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cb  */
    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.im.service.model.IMContact r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 548
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget.a(com.ss.android.ugc.aweme.im.service.model.IMContact, boolean):boolean");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void a(boolean z) {
        SharePanelViewModel sharePanelViewModel = this.f103545b;
        if (sharePanelViewModel == null) {
            l.a("viewModel");
        }
        sharePanelViewModel.f103595b = z;
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b bVar = this.f103547d;
        if (bVar == null) {
            l.a("headAdapter");
        }
        bVar.notifyDataSetChanged();
        c();
    }

    public final void a(List<? extends User> list, boolean z) {
        com.ss.android.ugc.aweme.social.widget.card.d dVar = this.f103552i;
        f fVar = new f(this, z);
        if (dVar != null) {
            dVar.a(list);
            dVar.a(fVar);
        } else {
            androidx.fragment.app.e a2 = com.ss.android.ugc.aweme.ap.a.a(this.f103544a);
            String string = this.f103554k.f103954k.f124595i.getString("enter_from");
            if (string == null) {
                string = "";
            }
            l.b(string, "");
            dVar = com.ss.android.ugc.aweme.social.widget.card.i.f133800a.a(new com.ss.android.ugc.aweme.social.widget.a(a2, null, string, null, 10), com.ss.android.ugc.aweme.social.a.e.a());
            dVar.a(list);
            dVar.a(fVar);
            dVar.a(new e(dVar, this, list, fVar));
            this.f103552i = dVar;
        }
        dVar.b();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    public final void a(List<? extends IMContact> list) {
        l.d(list, "");
        com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelWidget", "updatePanelHead: " + (list != null ? Integer.valueOf(list.size()) : null));
        if (list == null || list.isEmpty()) {
            com.ss.android.ugc.aweme.im.sdk.share.b.b.h.a(false);
            this.f103554k.f103947a.setVisibility(8);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.share.b.b.h.a(true);
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b bVar = this.f103547d;
        if (bVar == null) {
            l.a("headAdapter");
        }
        bVar.a(list);
        com.ss.android.ugc.aweme.im.sdk.share.a.a.a(this.f103554k.f103954k);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ boolean $isCancelPrevTips;
        final /* synthetic */ SharePanelWidget this$0;

        static {
            Covode.recordClassIndex(66346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SharePanelWidget sharePanelWidget, boolean z) {
            super(0);
            this.this$0 = sharePanelWidget;
            this.$isCancelPrevTips = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.social.widget.card.d dVar;
            if (this.$isCancelPrevTips) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.service.model.d((byte) 0));
            }
            if (this.this$0.f103553j && (dVar = this.this$0.f103552i) != null) {
                dVar.d();
            }
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ SharePanelWidget this$0;

        static {
            Covode.recordClassIndex(66350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SharePanelWidget sharePanelWidget) {
            super(0);
            this.this$0 = sharePanelWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f103555l.a("chat_merge", this.this$0.f103554k.f103954k);
            return z.f158842a;
        }
    }

    static int d() {
        com.ss.android.ugc.aweme.im.service.model.i iMSetting;
        com.ss.android.ugc.aweme.im.service.e b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b();
        if (b2 == null || (iMSetting = b2.getIMSetting()) == null) {
            return 10;
        }
        return iMSetting.f103906c;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget
    public final void a() {
        super.a();
        com.ss.android.ugc.aweme.social.widget.card.d dVar = this.f103552i;
        if (dVar != null && dVar.a()) {
            dVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        String string = this.f103544a.getString(R.string.cj1, Integer.valueOf(d()));
        l.b(string, "");
        Context context = this.f103544a;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        new com.bytedance.tux.g.b((Activity) context).a(string).b();
    }

    public final void b() {
        t<Boolean> a2;
        SharePanelViewModel sharePanelViewModel = this.f103545b;
        if (sharePanelViewModel == null) {
            l.a("viewModel");
        }
        boolean z = false;
        if (!sharePanelViewModel.b().isEmpty() || this.t) {
            View view = this.f103548e;
            if (view == null) {
                l.a("editLayout");
            }
            view.setVisibility(0);
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b bVar = this.f103551h;
            if (bVar != null) {
                bVar.setVisibility(0);
            }
            RemoteImageView remoteImageView = this.n;
            if (remoteImageView == null) {
                l.a("shareCover");
            }
            com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.a(remoteImageView, this.f103554k.f103954k, (Boolean) false);
            SharePackage sharePackage = this.f103554k.f103954k;
            View view2 = this.f103548e;
            if (view2 == null) {
                l.a("editLayout");
            }
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.a.a(sharePackage, view2);
        } else {
            View view3 = this.f103548e;
            if (view3 == null) {
                l.a("editLayout");
            }
            view3.setVisibility(8);
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b bVar2 = this.f103551h;
            if (bVar2 != null) {
                bVar2.setVisibility(8);
            }
            DmtEditText dmtEditText = this.f103549f;
            if (dmtEditText == null) {
                l.a("editText");
            }
            KeyboardUtils.c(dmtEditText);
        }
        SharePanelAndroidViewModel a3 = SharePanelAndroidViewModel.a.a(this.f103544a);
        if (a3 != null && (a2 = a3.a()) != null) {
            View view4 = this.f103548e;
            if (view4 == null) {
                l.a("editLayout");
            }
            if (view4.getVisibility() == 0) {
                z = true;
            }
            a2.setValue(Boolean.valueOf(z));
        }
    }

    public final void c() {
        String sb;
        SharePanelViewModel sharePanelViewModel = this.f103545b;
        if (sharePanelViewModel == null) {
            l.a("viewModel");
        }
        if (!sharePanelViewModel.f103596c) {
            View findViewById = this.f103554k.f103951e.findViewById(R.id.e1k);
            SharePanelViewModel sharePanelViewModel2 = this.f103545b;
            if (sharePanelViewModel2 == null) {
                l.a("viewModel");
            }
            boolean z = false;
            if (!sharePanelViewModel2.b().isEmpty() || this.t) {
                l.b(findViewById, "");
                findViewById.setVisibility(8);
                TuxButton tuxButton = this.o;
                if (tuxButton == null) {
                    l.a("sendTv");
                }
                tuxButton.setVisibility(0);
                TuxButton tuxButton2 = this.o;
                if (tuxButton2 == null) {
                    l.a("sendTv");
                }
                SharePanelViewModel sharePanelViewModel3 = this.f103545b;
                if (sharePanelViewModel3 == null) {
                    l.a("viewModel");
                }
                if (sharePanelViewModel3.b().size() != 0) {
                    z = true;
                }
                tuxButton2.setEnabled(z);
                TuxButton tuxButton3 = this.o;
                if (tuxButton3 == null) {
                    l.a("sendTv");
                }
                SharePanelViewModel sharePanelViewModel4 = this.f103545b;
                if (sharePanelViewModel4 == null) {
                    l.a("viewModel");
                }
                if (sharePanelViewModel4.b().size() <= 1) {
                    TuxButton tuxButton4 = this.o;
                    if (tuxButton4 == null) {
                        l.a("sendTv");
                    }
                    sb = tuxButton4.getResources().getString(R.string.ci1);
                } else {
                    a aVar = this.f103550g;
                    if (aVar == null || !aVar.f103568b) {
                        StringBuilder sb2 = new StringBuilder();
                        TuxButton tuxButton5 = this.o;
                        if (tuxButton5 == null) {
                            l.a("sendTv");
                        }
                        StringBuilder append = sb2.append(tuxButton5.getResources().getString(R.string.fku)).append('(');
                        SharePanelViewModel sharePanelViewModel5 = this.f103545b;
                        if (sharePanelViewModel5 == null) {
                            l.a("viewModel");
                        }
                        sb = append.append(sharePanelViewModel5.b().size()).append(')').toString();
                    } else {
                        sb = this.f103544a.getString(R.string.c6y);
                    }
                }
                tuxButton3.setText(sb);
                return;
            }
            l.b(findViewById, "");
            findViewById.setVisibility(0);
            TuxButton tuxButton6 = this.o;
            if (tuxButton6 == null) {
                l.a("sendTv");
            }
            tuxButton6.setVisibility(8);
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.im.service.share.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SharePanelWidget f103556a;

        static {
            Covode.recordClassIndex(66344);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(SharePanelWidget sharePanelWidget) {
            this.f103556a = sharePanelWidget;
        }

        @Override // com.ss.android.ugc.aweme.im.service.share.a.a
        public final void a(SharePackage sharePackage) {
            l.d(sharePackage, "");
            this.f103556a.f103555l.c(sharePackage);
        }

        @Override // com.ss.android.ugc.aweme.im.service.share.a.a
        public final void b(SharePackage sharePackage) {
            l.d(sharePackage, "");
            this.f103556a.f103555l.b(sharePackage);
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b a(SharePanelWidget sharePanelWidget) {
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b bVar = sharePanelWidget.f103547d;
        if (bVar == null) {
            l.a("headAdapter");
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    public final void b(List<? extends IMContact> list) {
        l.d(list, "");
        l.d(list, "");
    }

    static final class c extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ boolean $isSendMessageFirst$inlined;
        final /* synthetic */ List $userList;
        int label;
        final /* synthetic */ SharePanelWidget this$0;

        static {
            Covode.recordClassIndex(66343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List list, h.c.d dVar, SharePanelWidget sharePanelWidget, boolean z) {
            super(2, dVar);
            this.$userList = list;
            this.this$0 = sharePanelWidget;
            this.$isSendMessageFirst$inlined = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.$userList, dVar, this.this$0, this.$isSendMessageFirst$inlined);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.a(this.$userList, true);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.im.core.d.h, z> {
        final /* synthetic */ SharePanelWidget this$0;

        static {
            Covode.recordClassIndex(66342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SharePanelWidget sharePanelWidget) {
            super(1);
            this.this$0 = sharePanelWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.im.core.d.h hVar) {
            com.bytedance.im.core.d.h hVar2 = hVar;
            this.this$0.d(false);
            if (hVar2 != null) {
                this.this$0.f103554k.f103954k.f124595i.putBoolean("is_new_group", true);
                this.this$0.c(n.c(com.ss.android.ugc.aweme.im.sdk.common.controller.e.e.b(hVar2)));
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f103557a = new g();

        static {
            Covode.recordClassIndex(66347);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            eVar2.f44776b = Integer.valueOf((int) R.attr.w);
            return z.f158842a;
        }
    }

    public static final class h extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SharePanelWidget f103558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f103559b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f103560c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f103561d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f103562e;

        static {
            Covode.recordClassIndex(66348);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            Context context = this.f103558a.f103544a;
            String str = this.f103559b;
            String str2 = this.f103560c;
            String str3 = this.f103561d;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            SpannableStringBuilder a2 = CommentSharePackage.a.a(context, str, str2, str3, bitmap, h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
            TextView textView = this.f103562e;
            l.b(textView, "");
            textView.setText(a2);
        }

        h(SharePanelWidget sharePanelWidget, String str, String str2, String str3, TextView textView) {
            this.f103558a = sharePanelWidget;
            this.f103559b = str;
            this.f103560c = str2;
            this.f103561d = str3;
            this.f103562e = textView;
        }
    }

    public static final class k implements com.ss.android.ugc.aweme.upvote.publish.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SharePanelWidget f103564a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f103565b;

        static {
            Covode.recordClassIndex(66351);
        }

        @Override // com.ss.android.ugc.aweme.upvote.publish.a
        public final void a(String str) {
            l.d(str, "");
            if (l.a((Object) str, (Object) this.f103565b) && SharePanelWidget.a(this.f103564a).getItemCount() > 0) {
                SharePanelWidget.a(this.f103564a).notifyItemChanged(0);
            }
        }

        k(SharePanelWidget sharePanelWidget, String str) {
            this.f103564a = sharePanelWidget;
            this.f103565b = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<List<? extends IMUser>, z> {
        final /* synthetic */ h.f.a.a $cancelAction$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.social.widget.card.d $this_apply;
        final /* synthetic */ List $userList$inlined;
        final /* synthetic */ SharePanelWidget this$0;

        static {
            Covode.recordClassIndex(66345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.social.widget.card.d dVar, SharePanelWidget sharePanelWidget, List list, h.f.a.a aVar) {
            super(1);
            this.$this_apply = dVar;
            this.this$0 = sharePanelWidget;
            this.$userList$inlined = list;
            this.$cancelAction$inlined = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends IMUser> list) {
            String str;
            List<? extends IMUser> list2 = list;
            l.d(list2, "");
            this.this$0.f103554k.f103954k.f124595i.putBoolean("show_tips_until_cancel", false);
            SharePanelWidget sharePanelWidget = this.this$0;
            SharePackage sharePackage = sharePanelWidget.f103554k.f103954k;
            sharePackage.f124595i.putString("is_share_pop_up", "1");
            DmtEditText dmtEditText = sharePanelWidget.f103549f;
            if (dmtEditText == null) {
                l.a("editText");
            }
            KeyboardUtils.c(dmtEditText);
            if (!sharePanelWidget.f103553j) {
                sharePanelWidget.f103555l.a();
            }
            DmtEditText dmtEditText2 = sharePanelWidget.f103549f;
            if (dmtEditText2 == null) {
                l.a("editText");
            }
            Editable text = dmtEditText2.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a((List<IMContact>) list2, str, sharePackage, com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a());
            com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(sharePackage, str, n.g((Collection) list2));
            this.$this_apply.c();
            this.$this_apply.d();
            return z.f158842a;
        }
    }

    public final void d(boolean z) {
        SharePanelViewModel sharePanelViewModel = this.f103545b;
        if (sharePanelViewModel == null) {
            l.a("viewModel");
        }
        sharePanelViewModel.f103596c = z;
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b bVar = this.f103547d;
        if (bVar == null) {
            l.a("headAdapter");
        }
        bVar.notifyDataSetChanged();
        TuxButton tuxButton = this.o;
        if (tuxButton == null) {
            l.a("sendTv");
        }
        tuxButton.setLoading(z);
        if (z) {
            TuxButton tuxButton2 = this.o;
            if (tuxButton2 == null) {
                l.a("sendTv");
            }
            tuxButton2.setBackgroundResource(R.color.bh);
            return;
        }
        a aVar = this.f103550g;
        if (aVar != null) {
            aVar.f103569c = false;
        }
        TuxButton tuxButton3 = this.o;
        if (tuxButton3 == null) {
            l.a("sendTv");
        }
        tuxButton3.setBackgroundResource(R.drawable.ar6);
        c();
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SharePanelWidget f103563a;

        static {
            Covode.recordClassIndex(66349);
        }

        i(SharePanelWidget sharePanelWidget) {
            this.f103563a = sharePanelWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SharePanelViewModel sharePanelViewModel = this.f103563a.f103545b;
            if (sharePanelViewModel == null) {
                l.a("viewModel");
            }
            if (!sharePanelViewModel.f103596c && !u.a(view, 500)) {
                SharePanelWidget sharePanelWidget = this.f103563a;
                if (!sharePanelWidget.f103555l.a(sharePanelWidget.f103554k.f103954k)) {
                    com.ss.android.ugc.aweme.im.service.m.a.a("SharePanelWidget", "cancel share by callback");
                    return;
                }
                SharePanelViewModel sharePanelViewModel2 = sharePanelWidget.f103545b;
                if (sharePanelViewModel2 == null) {
                    l.a("viewModel");
                }
                List<IMContact> g2 = n.g((Collection) sharePanelViewModel2.e());
                boolean z = !g2.isEmpty();
                SharePanelViewModel sharePanelViewModel3 = sharePanelWidget.f103545b;
                if (sharePanelViewModel3 == null) {
                    l.a("viewModel");
                }
                SharePackage sharePackage = sharePanelViewModel3.f103597d;
                String str = sharePackage != null ? sharePackage.f124590d : null;
                if (!(!l.a((Object) str, (Object) "aweme"))) {
                    Set<IMContact> b2 = sharePanelViewModel3.b();
                    ArrayList arrayList = new ArrayList();
                    for (T t : b2) {
                        if (t instanceof com.ss.android.ugc.aweme.social.c.a) {
                            arrayList.add(t);
                        }
                    }
                    List<com.ss.android.ugc.aweme.social.c.a> a2 = n.a((Iterable) arrayList, (Comparator) SharePanelViewModel.c.f103607a);
                    if (!a2.isEmpty() && a2 != null) {
                        ArrayList arrayList2 = new ArrayList(n.a((Iterable) a2, 10));
                        for (com.ss.android.ugc.aweme.social.c.a aVar : a2) {
                            arrayList2.add(com.ss.android.ugc.aweme.social.c.b.a(aVar));
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            if (z) {
                                sharePanelWidget.f103554k.f103954k.f124595i.putBoolean("show_tips_until_cancel", true);
                                bz unused = kotlinx.coroutines.i.a(new kotlinx.coroutines.internal.e(cu.a().plus(o.f159148a)), null, null, new c(arrayList3, null, sharePanelWidget, z), 3);
                            } else {
                                sharePanelWidget.a((List<? extends User>) arrayList3, false);
                            }
                        }
                    }
                }
                if (!g2.isEmpty()) {
                    DmtEditText dmtEditText = sharePanelWidget.f103549f;
                    if (dmtEditText == null) {
                        l.a("editText");
                    }
                    Editable text = dmtEditText.getText();
                    if (text == null || text.length() <= 6000) {
                        a aVar2 = sharePanelWidget.f103550g;
                        if (aVar2 == null || !aVar2.f103568b) {
                            a aVar3 = sharePanelWidget.f103550g;
                            if (aVar3 == null || !aVar3.f103568b) {
                                SharePanelViewModel sharePanelViewModel4 = sharePanelWidget.f103545b;
                                if (sharePanelViewModel4 == null) {
                                    l.a("viewModel");
                                }
                                if (sharePanelViewModel4.b().size() >= SharePanelWidget.d()) {
                                    sharePanelWidget.e();
                                    return;
                                }
                            }
                            sharePanelWidget.c(g2);
                            return;
                        }
                        a aVar4 = sharePanelWidget.f103550g;
                        if (aVar4 != null) {
                            Boolean valueOf = Boolean.valueOf(aVar4.a(new b(sharePanelWidget)));
                            if (valueOf.booleanValue()) {
                                valueOf.booleanValue();
                                sharePanelWidget.d(true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Context context = sharePanelWidget.f103544a;
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    new com.bytedance.tux.g.b((Activity) context).e(R.string.cfv).b();
                }
            }
        }
    }

    public final void c(List<IMContact> list) {
        SharePackage sharePackage = this.f103554k.f103954k;
        sharePackage.f124595i.putInt("friends_shared_cnt", com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.a.a(list));
        String str = null;
        com.ss.android.ugc.aweme.im.sdk.share.a.a.a(sharePackage, (BaseContent) null, list.size());
        String a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a();
        com.ss.android.ugc.aweme.im.sdk.share.b.b.g.a(a2, sharePackage, list);
        DmtEditText dmtEditText = this.f103549f;
        if (dmtEditText == null) {
            l.a("editText");
        }
        KeyboardUtils.c(dmtEditText);
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            if (t2 instanceof IMUser) {
                arrayList.add(t2);
            }
        }
        ArrayList<IMUser> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
        for (IMUser iMUser : arrayList2) {
            arrayList3.add(iMUser.getUid());
        }
        String obj = arrayList3.toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        String substring = obj.substring(1, obj.length() - 1);
        l.b(substring, "");
        int size = arrayList2.size();
        Bundle bundle = this.f103554k.f103954k.f124595i;
        bundle.putString("shareIdList", substring);
        bundle.putInt("chat_cnt", size);
        bundle.putInt("group_chat_cnt", list.size() - size);
        this.f103553j = true;
        com.ss.android.ugc.aweme.im.service.share.a.c cVar = this.f103555l;
        list.size();
        cVar.c(sharePackage);
        DmtEditText dmtEditText2 = this.f103549f;
        if (dmtEditText2 == null) {
            l.a("editText");
        }
        Editable text = dmtEditText2.getText();
        com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a(list, text != null ? text.toString() : null, sharePackage, a2);
        DmtEditText dmtEditText3 = this.f103549f;
        if (dmtEditText3 == null) {
            l.a("editText");
        }
        Editable text2 = dmtEditText3.getText();
        if (text2 != null) {
            str = text2.toString();
        }
        com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(sharePackage, str, n.g((Collection) list));
        if (l.a((Object) "live_event", (Object) sharePackage.f124590d)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a.f102956a, "livesdk_live_event_share", sharePackage, it.next());
            }
        }
        if (l.a((Object) sharePackage.f124590d, (Object) UGCMonitor.EVENT_COMMENT)) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_from", "comment_panel");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    public final void a(IMContact iMContact) {
        l.d(iMContact, "");
        l.d(iMContact, "");
    }

    public SharePanelWidget(com.ss.android.ugc.aweme.im.service.share.b.b bVar, com.ss.android.ugc.aweme.im.service.share.a.c cVar) {
        UrlModel urlModel;
        String str;
        User user;
        User user2;
        Bundle bundle;
        int i2;
        l.d(bVar, "");
        l.d(cVar, "");
        MethodCollector.i(7155);
        this.f103554k = bVar;
        this.f103555l = cVar;
        Context context = bVar.f103953j;
        this.f103544a = context;
        this.t = l.a((Object) bVar.f103954k.f124590d, (Object) UGCMonitor.EVENT_COMMENT);
        this.u = l.a((Object) bVar.f103954k.f124590d, (Object) UGCMonitor.EVENT_COMMENT);
        com.ss.android.ugc.aweme.im.sdk.share.b.b.h.f103381a = true;
        boolean z = false;
        this.s = bVar.f103954k.f124595i.getBoolean("is_share_live", false);
        create();
        this.f103545b = SharePanelViewModel.a.a(bVar.f103954k, this, h.a.z.INSTANCE, c.b.NORMAL, 0, 16);
        androidx.lifecycle.i lifecycle = getLifecycle();
        SharePanelViewModel sharePanelViewModel = this.f103545b;
        if (sharePanelViewModel == null) {
            l.a("viewModel");
        }
        lifecycle.a(sharePanelViewModel);
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.a aVar = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.a(context, (byte) 0);
        aVar.setWidget(this);
        bVar.f103947a.addView(aVar);
        View findViewById = aVar.findViewById(R.id.djh);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f103546c = recyclerView;
        if (recyclerView == null) {
            l.a("headRecyclerView");
        }
        recyclerView.a(new com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b(com.ss.android.ugc.aweme.base.utils.n.a(12.0d), com.ss.android.ugc.aweme.base.utils.n.a(6.0d), com.ss.android.ugc.aweme.base.utils.n.a(26.0d)));
        SharePanelViewModel sharePanelViewModel2 = this.f103545b;
        if (sharePanelViewModel2 == null) {
            l.a("viewModel");
        }
        sharePanelViewModel2.f103594a = this.s;
        SharePanelViewModel sharePanelViewModel3 = this.f103545b;
        if (sharePanelViewModel3 == null) {
            l.a("viewModel");
        }
        this.f103547d = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b(sharePanelViewModel3);
        RecyclerView recyclerView2 = this.f103546c;
        if (recyclerView2 == null) {
            l.a("headRecyclerView");
        }
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b bVar2 = this.f103547d;
        if (bVar2 == null) {
            l.a("headAdapter");
        }
        recyclerView2.setAdapter(bVar2);
        RecyclerView recyclerView3 = this.f103546c;
        if (recyclerView3 == null) {
            l.a("headRecyclerView");
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(0, false));
        View findViewById2 = aVar.findViewById(R.id.c2q);
        l.b(findViewById2, "");
        this.q = (TuxIconView) findViewById2;
        SharePanelViewModel sharePanelViewModel4 = this.f103545b;
        if (sharePanelViewModel4 == null) {
            l.a("viewModel");
        }
        SharePackage sharePackage = sharePanelViewModel4.f103597d;
        if (!(sharePackage == null || (bundle = sharePackage.f124595i) == null)) {
            String string = bundle.getString("author_user_name", null);
            int i3 = bundle.getInt("share_im_limit_tip_type", -1);
            if (i3 > 0 && !TextUtils.isEmpty(string)) {
                com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b bVar3 = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b(context, (byte) 0);
                bVar3.setWidget(this);
                ((FrameLayout) bVar.f103951e.findViewById(R.id.e1m)).addView(bVar3);
                ViewGroup.LayoutParams layoutParams = bVar3.getLayoutParams();
                if (layoutParams != null) {
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) com.bytedance.common.utility.n.b(context, 5.0f);
                    TuxIconView tuxIconView = (TuxIconView) bVar3.a(R.id.elk);
                    l.b(tuxIconView, "");
                    tuxIconView.setVisibility(0);
                    if (this.u) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    l.b(string, "");
                    com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c cVar2 = new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c(string, i3, i2);
                    this.r = cVar2;
                    bVar3.a(cVar2);
                    bVar3.setVisibility(8);
                    this.f103551h = bVar3;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    MethodCollector.o(7155);
                    throw nullPointerException;
                }
            }
        }
        com.a.a(LayoutInflater.from(context), R.layout.a7k, bVar.f103949c, true);
        View findViewById3 = bVar.f103949c.findViewById(R.id.dyk);
        l.b(findViewById3, "");
        this.p = (LinearLayout) findViewById3;
        View findViewById4 = bVar.f103949c.findViewById(R.id.dye);
        l.b(findViewById4, "");
        TuxButton tuxButton = (TuxButton) findViewById4;
        this.o = tuxButton;
        if (tuxButton == null) {
            l.a("sendTv");
        }
        tuxButton.setOnClickListener(new i(this));
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i.a()) {
            View findViewById5 = bVar.f103949c.findViewById(R.id.bd9);
            l.b(findViewById5, "");
            View findViewById6 = bVar.f103949c.findViewById(R.id.a5_);
            l.b(findViewById6, "");
            a aVar2 = new a(new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b((LinearLayout) findViewById5, (TuxCheckBox) findViewById6), bVar.f103954k, this);
            aVar2.c();
            this.f103550g = aVar2;
        }
        com.a.a(LayoutInflater.from(context), R.layout.a7j, bVar.f103948b, true);
        ViewGroup viewGroup = bVar.f103948b;
        View findViewById7 = viewGroup.findViewById(R.id.cp4);
        l.b(findViewById7, "");
        this.f103548e = findViewById7;
        View findViewById8 = viewGroup.findViewById(R.id.cp3);
        l.b(findViewById8, "");
        this.f103549f = (DmtEditText) findViewById8;
        View findViewById9 = viewGroup.findViewById(R.id.cp2);
        l.b(findViewById9, "");
        this.n = (RemoteImageView) findViewById9;
        DmtEditText dmtEditText = this.f103549f;
        if (dmtEditText == null) {
            l.a("editText");
        }
        InputFilter[] inputFilterArr = new InputFilter[1];
        DmtEditText dmtEditText2 = this.f103549f;
        if (dmtEditText2 == null) {
            l.a("editText");
        }
        inputFilterArr[0] = new ad(dmtEditText2);
        dmtEditText.setFilters(inputFilterArr);
        if (this.t) {
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b bVar4 = this.f103551h;
            if (bVar4 != null) {
                bVar4.setVisibility(0);
            }
            View view = this.f103548e;
            if (view == null) {
                l.a("editLayout");
            }
            view.setVisibility(0);
            DmtEditText dmtEditText3 = this.f103549f;
            if (dmtEditText3 == null) {
                l.a("editText");
            }
            dmtEditText3.setVisibility(0);
            LinearLayout linearLayout = this.p;
            if (linearLayout == null) {
                l.a("sendContainer");
            }
            View findViewById10 = linearLayout.findViewById(R.id.e1i);
            if (findViewById10 != null) {
                findViewById10.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.p;
            if (linearLayout2 == null) {
                l.a("sendContainer");
            }
            View findViewById11 = linearLayout2.findViewById(R.id.bd9);
            if (findViewById11 != null) {
                findViewById11.setVisibility(8);
            }
            View findViewById12 = bVar.f103951e.findViewById(R.id.e1k);
            l.b(findViewById12, "");
            findViewById12.setVisibility(8);
            TuxButton tuxButton2 = this.o;
            if (tuxButton2 == null) {
                l.a("sendTv");
            }
            tuxButton2.setVisibility(0);
            TuxButton tuxButton3 = this.o;
            if (tuxButton3 == null) {
                l.a("sendTv");
            }
            TuxButton tuxButton4 = this.o;
            if (tuxButton4 == null) {
                l.a("sendTv");
            }
            tuxButton3.setText(tuxButton4.getResources().getString(R.string.ci1));
            TuxButton tuxButton5 = this.o;
            if (tuxButton5 == null) {
                l.a("sendTv");
            }
            tuxButton5.setEnabled(false);
        }
        if (this.u) {
            RemoteImageView remoteImageView = this.n;
            if (remoteImageView == null) {
                l.a("shareCover");
            }
            remoteImageView.setVisibility(8);
            View view2 = this.f103548e;
            if (view2 == null) {
                l.a("editLayout");
            }
            TextView textView = (TextView) view2.findViewById(R.id.cp1);
            l.b(textView, "");
            textView.setVisibility(0);
            com.bytedance.tux.c.e a2 = com.bytedance.tux.c.f.a(g.f103557a);
            Context context2 = textView.getContext();
            l.b(context2, "");
            textView.setBackground(a2.a(context2));
            SharePackage sharePackage2 = bVar.f103954k;
            if (sharePackage2 != null) {
                CommentSharePackage commentSharePackage = (CommentSharePackage) sharePackage2;
                Comment comment = commentSharePackage.f123941a;
                String str2 = (comment == null || (user2 = comment.getUser()) == null || (str2 = user2.getNickname()) == null) ? "" : str2;
                Comment comment2 = commentSharePackage.f123941a;
                String str3 = (comment2 == null || (str3 = comment2.getText()) == null) ? "" : str3;
                Comment comment3 = commentSharePackage.f123941a;
                String str4 = (comment3 == null || (str4 = comment3.getReplyToUserName()) == null) ? "" : str4;
                Comment comment4 = commentSharePackage.f123941a;
                if (comment4 == null || (user = comment4.getUser()) == null) {
                    urlModel = null;
                } else {
                    urlModel = user.getAvatarThumb();
                }
                if (str2.length() == 0 || str3.length() == 0 || urlModel == null) {
                    StringBuilder sb = new StringBuilder("Share data error, [");
                    Comment comment5 = commentSharePackage.f123941a;
                    com.ss.android.ugc.aweme.im.service.m.a.e("SharePanelWidget", sb.append((comment5 == null || (str = comment5.getCid()) == null) ? "" : str).append("] creatorName:").append(str2).append(" comment:").append(str3).append(" avatarIsNull:").append(urlModel == null ? true : z).toString());
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131232780);
                l.b(decodeResource, "");
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                textView.setText(CommentSharePackage.a.a(context, str2, str4, str3, decodeResource, h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()))));
                v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
                a3.f39906b = context;
                a3.a("CommentShare").a(new h(this, str2, str4, str3, textView));
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage");
                MethodCollector.o(7155);
                throw nullPointerException2;
            }
        }
        SharePanelViewModel sharePanelViewModel5 = this.f103545b;
        if (sharePanelViewModel5 == null) {
            l.a("viewModel");
        }
        if (sharePanelViewModel5.f()) {
            String string2 = bVar.f103954k.f124595i.getString("aid");
            string2 = string2 == null ? "" : string2;
            l.b(string2, "");
            com.ss.android.ugc.aweme.upvote.service.a.f142308a.a(this, new k(this, string2));
        }
        SharePanelViewModel sharePanelViewModel6 = this.f103545b;
        if (sharePanelViewModel6 == null) {
            l.a("viewModel");
        }
        sharePanelViewModel6.d();
        MethodCollector.o(7155);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(kVar5, "");
        l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
