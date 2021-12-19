package com.ss.android.ugc.aweme.im.sdk.share.ui.c;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.MTSearchHead;
import com.ss.android.ugc.aweme.im.sdk.share.data.a.c;
import com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.ad;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class a extends com.google.android.material.bottomsheet.a implements com.ss.android.ugc.aweme.im.sdk.share.b.a.b {
    public static final C2638a o = new C2638a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f103626a;

    /* renamed from: b  reason: collision with root package name */
    final m f103627b;

    /* renamed from: c  reason: collision with root package name */
    public final ShareDialogViewModel f103628c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f103629d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d f103630e;

    /* renamed from: f  reason: collision with root package name */
    final Activity f103631f;

    /* renamed from: j  reason: collision with root package name */
    final Set<IMContact> f103632j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f103633k;

    /* renamed from: l  reason: collision with root package name */
    final com.ss.android.ugc.aweme.im.service.share.a.a f103634l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f103635m;
    final SharePackage n;
    private final com.ss.android.ugc.aweme.im.sdk.share.data.a.b p;
    private final com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c q;
    private final com.ss.android.ugc.aweme.im.service.model.f r;

    static {
        Covode.recordClassIndex(66390);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void b(boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$a  reason: collision with other inner class name */
    public static final class C2638a {
        static {
            Covode.recordClassIndex(66391);
        }

        private C2638a() {
        }

        public /* synthetic */ C2638a(byte b2) {
            this();
        }
    }

    public final void show() {
        super.show();
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(true));
    }

    public final void dismiss() {
        View view;
        Window window = getWindow();
        if (window != null) {
            view = window.getCurrentFocus();
        } else {
            view = null;
        }
        KeyboardUtils.c(view);
        if (!this.f103626a) {
            ((MTSearchHead) findViewById(R.id.dv0)).a();
        }
        super.dismiss();
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(false));
    }

    static final /* synthetic */ class b extends h.f.b.j implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.e> {
        static {
            Covode.recordClassIndex(66392);
        }

        b(a aVar) {
            super(0, aVar, a.class, "createShareTextBoxComponent", "createShareTextBoxComponent()Lcom/ss/android/ugc/aweme/im/sdk/share/ui/textbox/ShareTextBoxLayoutComponent;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.e invoke() {
            a aVar = (a) this.receiver;
            Activity activity = aVar.f103631f;
            ShareDialogViewModel shareDialogViewModel = aVar.f103628c;
            com.ss.android.ugc.aweme.im.service.share.a.a aVar2 = aVar.f103634l;
            SharePackage sharePackage = aVar.n;
            Set<IMContact> set = aVar.f103632j;
            boolean z = aVar.f103635m;
            boolean z2 = aVar.f103633k;
            m mVar = aVar.f103627b;
            View findViewById = aVar.findViewById(R.id.e28);
            if (findViewById == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(activity, "");
            h.f.b.l.d(shareDialogViewModel, "");
            h.f.b.l.d(sharePackage, "");
            h.f.b.l.d(mVar, "");
            h.f.b.l.d(findViewById, "");
            t<Boolean> tVar = shareDialogViewModel.f103765g;
            LinearLayout linearLayout = (LinearLayout) findViewById.findViewById(R.id.bd9);
            h.f.b.l.b(linearLayout, "");
            TuxCheckBox tuxCheckBox = (TuxCheckBox) findViewById.findViewById(R.id.a5_);
            h.f.b.l.b(tuxCheckBox, "");
            ShareTextBoxViewModel shareTextBoxViewModel = new ShareTextBoxViewModel(sharePackage, aVar2, null, aVar, tVar, new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b(linearLayout, tuxCheckBox), z);
            return new com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.e(findViewById, shareTextBoxViewModel, set, z2, new com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d(activity, findViewById, sharePackage, shareTextBoxViewModel, mVar));
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103645a;

        static {
            Covode.recordClassIndex(66400);
        }

        j(a aVar) {
            this.f103645a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f103645a.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void a(boolean z) {
        this.f103630e.a(z);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void c(boolean z) {
        this.f103630e.e(z);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103636a;

        static {
            Covode.recordClassIndex(66393);
        }

        c(a aVar) {
            this.f103636a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103636a.dismiss();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103639a;

        static {
            Covode.recordClassIndex(66395);
        }

        e(a aVar) {
            this.f103639a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103639a.f103628c.f103764f.postValue(true);
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103643a;

        static {
            Covode.recordClassIndex(66398);
        }

        h(a aVar) {
            this.f103643a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (hk.a((String) obj)) {
                this.f103643a.f103630e.r();
            } else {
                this.f103643a.f103630e.q();
            }
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103644a;

        static {
            Covode.recordClassIndex(66399);
        }

        i(a aVar) {
            this.f103644a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f103644a.f103630e.r();
            this.f103644a.f103630e.e((List) obj);
        }
    }

    static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103647a;

        static {
            Covode.recordClassIndex(66402);
        }

        l(a aVar) {
            this.f103647a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f103647a.dismiss();
            SmartRouter.buildRoute(this.f103647a.getContext(), "//friends/find").withParam("previous_page", "share_page").open();
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareDialogViewModel f103640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f103641b;

        static {
            Covode.recordClassIndex(66396);
        }

        f(ShareDialogViewModel shareDialogViewModel, a aVar) {
            this.f103640a = shareDialogViewModel;
            this.f103641b = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f103641b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.im.service.model.IMContact>");
            List<IMContact> a2 = ShareDialogViewModel.a(ad.d(obj));
            aVar.f103630e.q();
            if (a2 == null || a2.isEmpty()) {
                MTSearchHead mTSearchHead = (MTSearchHead) aVar.findViewById(R.id.dv0);
                h.f.b.l.b(mTSearchHead, "");
                mTSearchHead.setVisibility(8);
                return;
            }
            aVar.f103630e.e(a2);
            com.ss.android.ugc.aweme.im.sdk.share.a.a.a(aVar.n);
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103642a;

        static {
            Covode.recordClassIndex(66397);
        }

        g(a aVar) {
            this.f103642a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            List<? extends IMContact> list = (List) obj;
            Window window = this.f103642a.getWindow();
            if (window != null) {
                view = window.getCurrentFocus();
            } else {
                view = null;
            }
            KeyboardUtils.c(view);
            com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.e eVar = (com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.e) this.f103642a.f103629d.getValue();
            h.f.b.l.b(list, "");
            h.f.b.l.d(list, "");
            eVar.f103756a.a(list);
            if (list.isEmpty()) {
                eVar.b();
            } else {
                eVar.a();
            }
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103646a;

        static {
            Covode.recordClassIndex(66401);
        }

        k(a aVar) {
            this.f103646a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            View findViewById;
            int i2;
            Boolean bool = (Boolean) obj;
            View view = ((com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b) this.f103646a.f103630e).f103204b;
            if (view != null && (findViewById = view.findViewById(R.id.cjq)) != null) {
                h.f.b.l.b(bool, "");
                if (!bool.booleanValue() || this.f103646a.f103626a) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                findViewById.setVisibility(i2);
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        List<IMUser> list;
        ViewGroup.LayoutParams layoutParams;
        MethodCollector.i(7869);
        super.onCreate(bundle);
        setContentView(R.layout.a6y);
        b.a aVar = com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b.f102324a;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ad5);
        h.f.b.l.b(recyclerView, "");
        aVar.a(recyclerView, "more_share_dialog");
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
            }
            window.setLayout(-1, -1);
            window.setSoftInputMode(16);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.yo;
            }
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.akq);
        BottomSheetBehavior a2 = BottomSheetBehavior.a(frameLayout);
        if (!(frameLayout == null || (layoutParams = frameLayout.getLayoutParams()) == null)) {
            layoutParams.height = -1;
        }
        h.f.b.l.b(a2, "");
        a2.c(3);
        a2.b(0);
        a2.f52332h = true;
        a2.f52333i = true;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.cny);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new c(this));
        }
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getUnder16Proxy().d() || com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getUnder16Proxy().c()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.ad5);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setVisibility(8);
            TuxStatusView tuxStatusView = (TuxStatusView) findViewById(R.id.e_o);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            MethodCollector.o(7869);
            return;
        }
        if (!this.f103626a) {
            ((MTSearchHead) findViewById(R.id.dv0)).setListViewModel(this.f103628c);
        } else {
            MTSearchHead mTSearchHead = (MTSearchHead) findViewById(R.id.dv0);
            h.f.b.l.b(mTSearchHead, "");
            mTSearchHead.setVisibility(8);
            TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
            h.f.b.l.b(tuxTextView, "");
            com.ss.android.ugc.aweme.im.service.model.f fVar = this.r;
            if (fVar != null) {
                str = fVar.getPanelTitle();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.ad5);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.getContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager());
        recyclerView3.setAdapter(this.f103630e);
        recyclerView3.a(new d(recyclerView3, recyclerView3.getContext(), this));
        View a3 = com.a.a(LayoutInflater.from(getContext()), R.layout.a4g, (ViewGroup) findViewById(R.id.ad5), false);
        a3.findViewById(R.id.cjq).setOnClickListener(new e(this));
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d dVar = this.f103630e;
        h.f.b.l.b(a3, "");
        dVar.c(a3);
        com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c cVar = this.q;
        if (cVar != null) {
            Context context = getContext();
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b bVar = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b(context, (byte) 0);
            bVar.a(cVar);
            ((FrameLayout) findViewById(R.id.elm)).addView(bVar);
        }
        this.p.e();
        ShareDialogViewModel shareDialogViewModel = this.f103628c;
        shareDialogViewModel.f103761c.observe(this.f103627b, new f(shareDialogViewModel, this));
        shareDialogViewModel.f103762d.observe(this.f103627b, new g(this));
        shareDialogViewModel.f103759a.observe(this.f103627b, new h(this));
        shareDialogViewModel.f103760b.observe(this.f103627b, new i(this));
        shareDialogViewModel.f103765g.observe(this.f103627b, new j(this));
        shareDialogViewModel.f103766h.observe(this.f103627b, new k(this));
        shareDialogViewModel.f103764f.observe(this.f103627b, new l(this));
        Set<IMContact> set = this.f103632j;
        if (set != null) {
            this.f103628c.b(n.k(set));
        }
        if (this.f103626a) {
            ShareDialogViewModel shareDialogViewModel2 = this.f103628c;
            com.ss.android.ugc.aweme.im.service.model.f fVar2 = this.r;
            if (fVar2 == null || (list = fVar2.getBatchContacts()) == null) {
                list = z.INSTANCE;
            }
            shareDialogViewModel2.b(list);
        }
        shareDialogViewModel.a(0);
        shareDialogViewModel.d();
        TuxStatusView tuxStatusView2 = (TuxStatusView) findViewById(R.id.e_o);
        h.f.b.l.b(tuxStatusView2, "");
        new com.ss.android.ugc.aweme.im.sdk.share.ui.a.a(tuxStatusView2, this.f103631f, this.f103628c, this.f103627b);
        MethodCollector.o(7869);
    }

    public static final class d extends com.ss.android.ugc.aweme.framework.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView f103637a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f103638b;

        static {
            Covode.recordClassIndex(66394);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2) {
            View view;
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 1) {
                Window window = this.f103638b.getWindow();
                if (window != null) {
                    view = window.getCurrentFocus();
                } else {
                    view = null;
                }
                KeyboardUtils.c(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RecyclerView recyclerView, Context context, a aVar) {
            super(context);
            this.f103637a = recyclerView;
            this.f103638b = aVar;
        }
    }

    public /* synthetic */ a(Activity activity, Set set, boolean z, com.ss.android.ugc.aweme.im.service.share.a.a aVar, boolean z2, SharePackage sharePackage, com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c cVar) {
        this(activity, set, z, aVar, z2, sharePackage, cVar, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.Set<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity, Set<? extends IMContact> set, boolean z, com.ss.android.ugc.aweme.im.service.share.a.a aVar, boolean z2, SharePackage sharePackage, com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c cVar, com.ss.android.ugc.aweme.im.service.model.f fVar) {
        super(activity, R.style.yu);
        boolean z3;
        com.ss.android.ugc.aweme.im.sdk.share.data.a.b aVar2;
        h.f.b.l.d(activity, "");
        h.f.b.l.d(sharePackage, "");
        this.f103631f = activity;
        this.f103632j = set;
        this.f103633k = z;
        this.f103634l = aVar;
        this.f103635m = z2;
        this.n = sharePackage;
        this.q = cVar;
        this.r = fVar;
        if (fVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f103626a = z3;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.f103627b = (androidx.appcompat.app.d) activity;
        List<IMUser> list = (fVar == null || (list = fVar.getBatchContacts()) == null) ? z.INSTANCE : list;
        h.f.b.l.d(list, "");
        if (list.isEmpty()) {
            aVar2 = c.a.a(null, false, null);
        } else {
            aVar2 = new com.ss.android.ugc.aweme.im.sdk.share.data.a.a(list);
        }
        this.p = aVar2;
        ShareDialogViewModel shareDialogViewModel = new ShareDialogViewModel(sharePackage, aVar2);
        this.f103628c = shareDialogViewModel;
        this.f103629d = h.i.a((h.f.a.a) new b(this));
        this.f103630e = new com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d(sharePackage, shareDialogViewModel, false, z3);
        com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b.f102324a.a("more_share_dialog");
    }
}
