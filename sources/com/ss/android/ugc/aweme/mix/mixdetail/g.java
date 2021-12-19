package com.ss.android.ugc.aweme.mix.mixdetail;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g extends com.ss.android.ugc.aweme.base.f.a implements com.bytedance.assem.arch.viewModel.h {

    /* renamed from: k  reason: collision with root package name */
    public static final c f109994k = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TextTitleBar f109995a;

    /* renamed from: b  reason: collision with root package name */
    public MixManageBottomView f109996b;

    /* renamed from: c  reason: collision with root package name */
    public String f109997c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f109998d = "";

    /* renamed from: e  reason: collision with root package name */
    public boolean f109999e;

    /* renamed from: j  reason: collision with root package name */
    public long f110000j = 300;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f110001l;

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f110002m;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70509);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70507);
    }

    public final MixVideosManageViewModel a() {
        return (MixVideosManageViewModel) this.f110001l.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
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

    public static final class c {
        static {
            Covode.recordClassIndex(70510);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class i implements com.bytedance.ies.dmt.ui.titlebar.a.a {
        static {
            Covode.recordClassIndex(70518);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
        }

        i() {
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
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

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f110002m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public g() {
        h.k.c a2 = ab.a(MixVideosManageViewModel.class);
        this.f110001l = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, b.INSTANCE);
    }

    public final void b() {
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context, "");
        com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(R.string.b82).b(R.string.b81), new q(this)).a().b().show();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(view, "");
        view.setFocusableInTouchMode(true);
        View view2 = getView();
        if (view2 == null) {
            h.f.b.l.b();
        }
        view2.requestFocus();
        View view3 = getView();
        if (view3 == null) {
            h.f.b.l.b();
        }
        view3.setOnKeyListener(new p(this));
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f110008a;

        static {
            Covode.recordClassIndex(70521);
        }

        k(g gVar) {
            this.f110008a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f110008a.a(false);
        }
    }

    public static final /* synthetic */ MixManageBottomView a(g gVar) {
        MixManageBottomView mixManageBottomView = gVar.f109996b;
        if (mixManageBottomView == null) {
            h.f.b.l.a("mBottomView");
        }
        return mixManageBottomView;
    }

    public static final /* synthetic */ TextTitleBar b(g gVar) {
        TextTitleBar textTitleBar = gVar.f109995a;
        if (textTitleBar == null) {
            h.f.b.l.a("mTitleBar");
        }
        return textTitleBar;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f110004a;

        static {
            Covode.recordClassIndex(70512);
        }

        e(g gVar) {
            this.f110004a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            g.a(this.f110004a.a(), new h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.g.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(70513);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
                    com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    if (!aVar2.f110136d.f25631b.booleanValue()) {
                        this.this$0.f110004a.a(true);
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.b(this.this$0, AnonymousClass1.f110007a);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$g  reason: collision with other inner class name */
    static final class View$OnClickListenerC2818g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f110006a;

        static {
            Covode.recordClassIndex(70515);
        }

        View$OnClickListenerC2818g(g gVar) {
            this.f110006a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f110006a.f109999e) {
                g.a(this.f110006a.a(), new h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.mix.mixdetail.g.View$OnClickListenerC2818g.AnonymousClass1 */
                    final /* synthetic */ View$OnClickListenerC2818g this$0;

                    static {
                        Covode.recordClassIndex(70516);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
                        com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar2 = aVar;
                        h.f.b.l.d(aVar2, "");
                        if (aVar2.f110136d.f25631b.booleanValue()) {
                            DmtTextView startText = g.b(this.this$0.f110006a).getStartText();
                            h.f.b.l.b(startText, "");
                            if (startText.getVisibility() == 0) {
                                this.this$0.f110006a.b();
                            }
                        }
                        return z.f158842a;
                    }
                });
                return;
            }
            com.ss.android.ugc.aweme.mix.a.a.a(this.f110006a.f109997c, this.f110006a.f109998d, false);
            androidx.fragment.app.e activity = this.f110006a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            CharSequence text = this.this$0.getText(R.string.b7s);
            h.f.b.l.b(text, "");
            bVar2.c(text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.g.q.AnonymousClass1 */
                final /* synthetic */ q this$0;

                static {
                    Covode.recordClassIndex(70529);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.mix.a.a.a(this.this$0.this$0.f109997c, this.this$0.this$0.f109998d, true);
                    androidx.fragment.app.e activity = this.this$0.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return z.f158842a;
                }
            });
            CharSequence text2 = this.this$0.getText(R.string.aub);
            h.f.b.l.b(text2, "");
            bVar2.b(text2, AnonymousClass2.f110011a);
            return z.f158842a;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f110005a;

        static {
            Covode.recordClassIndex(70514);
        }

        f(g gVar) {
            this.f110005a = gVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i supportFragmentManager;
            androidx.fragment.app.i supportFragmentManager2;
            Fragment a2;
            androidx.fragment.app.i supportFragmentManager3;
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f110005a.getActivity();
            if (activity == null || (supportFragmentManager2 = activity.getSupportFragmentManager()) == null || (a2 = supportFragmentManager2.a("AddMultiVideoFragment")) == null) {
                AddMultiVideoFragment a3 = AddMultiVideoFragment.e.a();
                androidx.fragment.app.e activity2 = this.f110005a.getActivity();
                if (!(activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null)) {
                    supportFragmentManager.a().a(R.anim.dq, R.anim.dx).a(R.id.b94, a3, "AddMultiVideoFragment").a((String) null).b();
                }
            } else {
                androidx.fragment.app.e activity3 = this.f110005a.getActivity();
                if (!(activity3 == null || (supportFragmentManager3 = activity3.getSupportFragmentManager()) == null)) {
                    supportFragmentManager3.a().c(a2).a((String) null).a(R.anim.ds, R.anim.dt).b();
                }
            }
            com.ss.android.ugc.aweme.mix.a.a.e(this.f110005a.a().f110070j, "manage_video");
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f110003a;

        static {
            Covode.recordClassIndex(70511);
        }

        d(g gVar) {
            this.f110003a = gVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.e activity;
            ArrayList arrayList;
            String str;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, this.f110003a.f110000j) && (activity = this.f110003a.getActivity()) != null) {
                MixVideosManageViewModel a2 = this.f110003a.a();
                h.f.b.l.b(activity, "");
                h.f.b.l.d(activity, "");
                com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar = (com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a) a2.d().a();
                List<Aweme> list = aVar.f110133a;
                String str2 = null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getAid());
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                String str3 = ",";
                String a3 = arrayList != null ? h.a.n.a(arrayList, str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62) : null;
                if (arrayList == null || arrayList.isEmpty()) {
                    List<String> list2 = aVar.f110134b;
                    if (list2 != null) {
                        str = h.a.n.a(list2, str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
                    }
                    str = null;
                } else {
                    List<String> list3 = aVar.f110134b;
                    if (list3 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (T t : list3) {
                            if (!arrayList.contains(t)) {
                                arrayList3.add(t);
                            }
                        }
                        str3 = str3;
                        str = h.a.n.a(arrayList3, str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
                    }
                    str = null;
                }
                List<String> list4 = aVar.f110135c;
                if (list4 != null) {
                    str2 = h.a.n.a(list4, str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
                }
                List<Aweme> list5 = aVar.f110133a;
                if (list5 != null) {
                    for (T t2 : list5) {
                        if (t2.getCommerceVideoAuthInfo() != null) {
                            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = t2.getCommerceVideoAuthInfo();
                            h.f.b.l.b(commerceVideoAuthInfo, "");
                            if (commerceVideoAuthInfo.getDarkPostStatus() == 1) {
                                new com.bytedance.tux.g.b(activity).e(R.string.b4h).b();
                                return;
                            }
                        }
                    }
                }
                MixFeedApi a4 = MixFeedApi.a.a();
                int operation = MixFeedApi.b.VIDEOCOMMITCHANGES.getOperation();
                String str4 = a2.f110071k;
                if (str4 == null) {
                    h.f.b.l.a("mMixId");
                }
                f.a.b.b a5 = a4.manageMixFeed(operation, str4, "[" + a3 + ']', "[" + str2 + ']', "[" + str + ']', null).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new MixVideosManageViewModel.r(a2, activity), new MixVideosManageViewModel.s(a2, activity));
                h.f.b.l.b(a5, "");
                a2.a(a5);
            }
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f110009a;

        static {
            Covode.recordClassIndex(70522);
        }

        l(g gVar) {
            this.f110009a = gVar;
        }

        public final void onClick(View view) {
            List list;
            ClickAgent.onClick(view);
            MixVideosManageViewModel a2 = this.f110009a.a();
            com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar = (com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a) a2.d().a();
            z.e eVar = new z.e();
            T t = (T) 0;
            eVar.element = t;
            List<Aweme> list2 = aVar.f110133a;
            ArrayList arrayList = new ArrayList();
            z.e eVar2 = new z.e();
            eVar2.element = (T) aVar.f110135c;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (list2 != null) {
                arrayList.addAll(h.a.n.k(list2));
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    T t2 = eVar.element;
                    if (t2 == null) {
                        h.f.b.l.b();
                    }
                    Aweme aweme = (Aweme) arrayList.get(i2 - t2.intValue());
                    List<String> list3 = aVar.f110134b;
                    if (list3 != null && list3.contains(aweme.getAid())) {
                        arrayList.remove(i2 - eVar.element.intValue());
                        eVar.element = (T) Integer.valueOf(eVar.element.intValue() + 1);
                    }
                }
                if (eVar2.element != null) {
                    arrayList2.addAll(h.a.n.k(eVar2.element));
                    List<String> list4 = aVar.f110134b;
                    if (list4 != null) {
                        list = h.a.n.k(list4);
                    } else {
                        list = null;
                    }
                    com.ss.android.ugc.aweme.feed.adapter.j.a(arrayList3, list);
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        int i5 = i4 - i3;
                        Object obj = arrayList2.get(i5);
                        h.f.b.l.b(obj, "");
                        List<String> list5 = aVar.f110134b;
                        if (list5 != null && list5.contains(obj)) {
                            arrayList2.remove(i5);
                            i3++;
                            arrayList3.remove(obj);
                        }
                    }
                }
                a2.a(new MixVideosManageViewModel.e(arrayList, list2, eVar, aVar, eVar2, arrayList2, arrayList3, a2));
                a2.a(MixVideosManageViewModel.g.f110075a);
            }
            com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar2 = (com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a) a2.d().a();
            z.e eVar3 = new z.e();
            eVar3.element = t;
            List<Aweme> list6 = aVar2.f110138f;
            ArrayList arrayList4 = new ArrayList();
            if (list6 != null) {
                arrayList4.addAll(h.a.n.k(list6));
                int size3 = arrayList4.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    T t3 = eVar3.element;
                    if (t3 == null) {
                        h.f.b.l.b();
                    }
                    Aweme aweme2 = (Aweme) arrayList4.get(i6 - t3.intValue());
                    List<String> list7 = aVar2.f110134b;
                    if (list7 != null && list7.contains(aweme2.getAid())) {
                        arrayList4.remove(i6 - eVar3.element.intValue());
                        eVar3.element = (T) Integer.valueOf(eVar3.element.intValue() + 1);
                    }
                }
                a2.a(new MixVideosManageViewModel.f(arrayList4, list6, eVar3, aVar2, a2));
            }
            r.a("remove_multiple_playlist_video", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f110009a.f109998d).a("enter_method", "manage_video").a("playlist_id", this.f110009a.f109997c).f66730a);
            this.f110009a.a(true);
            new com.bytedance.tux.g.b(this.f110009a).e(R.string.fce).b();
        }
    }

    public final void a(boolean z) {
        a().a(z);
        if (z) {
            TextTitleBar textTitleBar = this.f109995a;
            if (textTitleBar == null) {
                h.f.b.l.a("mTitleBar");
            }
            DmtTextView startText = textTitleBar.getStartText();
            h.f.b.l.b(startText, "");
            startText.setVisibility(0);
            TextTitleBar textTitleBar2 = this.f109995a;
            if (textTitleBar2 == null) {
                h.f.b.l.a("mTitleBar");
            }
            textTitleBar2.setTitle(R.string.bk_);
            TextTitleBar textTitleBar3 = this.f109995a;
            if (textTitleBar3 == null) {
                h.f.b.l.a("mTitleBar");
            }
            DmtTextView endText = textTitleBar3.getEndText();
            h.f.b.l.b(endText, "");
            endText.setVisibility(0);
            TextTitleBar textTitleBar4 = this.f109995a;
            if (textTitleBar4 == null) {
                h.f.b.l.a("mTitleBar");
            }
            ImageView backBtn = textTitleBar4.getBackBtn();
            h.f.b.l.b(backBtn, "");
            backBtn.setVisibility(8);
            TextTitleBar textTitleBar5 = this.f109995a;
            if (textTitleBar5 == null) {
                h.f.b.l.a("mTitleBar");
            }
            textTitleBar5.setUseBackIcon(false);
        } else {
            TextTitleBar textTitleBar6 = this.f109995a;
            if (textTitleBar6 == null) {
                h.f.b.l.a("mTitleBar");
            }
            textTitleBar6.setUseBackIcon(true);
            TextTitleBar textTitleBar7 = this.f109995a;
            if (textTitleBar7 == null) {
                h.f.b.l.a("mTitleBar");
            }
            textTitleBar7.setTitle(R.string.fc7);
            TextTitleBar textTitleBar8 = this.f109995a;
            if (textTitleBar8 == null) {
                h.f.b.l.a("mTitleBar");
            }
            DmtTextView startText2 = textTitleBar8.getStartText();
            h.f.b.l.b(startText2, "");
            startText2.setVisibility(8);
            TextTitleBar textTitleBar9 = this.f109995a;
            if (textTitleBar9 == null) {
                h.f.b.l.a("mTitleBar");
            }
            DmtTextView endText2 = textTitleBar9.getEndText();
            h.f.b.l.b(endText2, "");
            endText2.setVisibility(8);
        }
        if (z) {
            MixManageBottomView mixManageBottomView = this.f109996b;
            if (mixManageBottomView == null) {
                h.f.b.l.a("mBottomView");
            }
            mixManageBottomView.getEditMixLayout().setVisibility(0);
            MixManageBottomView mixManageBottomView2 = this.f109996b;
            if (mixManageBottomView2 == null) {
                h.f.b.l.a("mBottomView");
            }
            mixManageBottomView2.getRemoveConfirmView().setVisibility(8);
            return;
        }
        MixManageBottomView mixManageBottomView3 = this.f109996b;
        if (mixManageBottomView3 == null) {
            h.f.b.l.a("mBottomView");
        }
        mixManageBottomView3.getEditMixLayout().setVisibility(8);
        MixManageBottomView mixManageBottomView4 = this.f109996b;
        if (mixManageBottomView4 == null) {
            h.f.b.l.a("mBottomView");
        }
        mixManageBottomView4.getRemoveConfirmView().setVisibility(0);
    }

    public static <VM1 extends AssemViewModel<S1>, S1 extends com.bytedance.assem.arch.viewModel.j, R> R a(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) h.a.a(vm1, bVar);
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, List<? extends Aweme>, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, List<? extends Aweme> list) {
            boolean z;
            List<? extends Aweme> list2 = list;
            h.f.b.l.d(dVar, "");
            TuxButton removeView = g.a(this.this$0).getRemoveView();
            if (list2 == null || list2.size() != 0) {
                z = true;
            } else {
                z = false;
            }
            removeView.setEnabled(z);
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar2, "");
            this.this$0.f109999e = aVar2.f25631b.booleanValue();
            if (aVar2.f25631b.booleanValue()) {
                g.b(this.this$0).getEndText().setTextColor(androidx.core.content.b.c(g.b(this.this$0).getContext(), R.color.bh));
                DmtTextView endText = g.b(this.this$0).getEndText();
                h.f.b.l.b(endText, "");
                endText.setEnabled(true);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MixVideosManageViewModel a2;
        MixVideosManageViewModel a3;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.cn4);
        h.f.b.l.b(findViewById, "");
        TextTitleBar textTitleBar = (TextTitleBar) findViewById;
        this.f109995a = textTitleBar;
        if (textTitleBar == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar.setUseBackIcon(false);
        TextTitleBar textTitleBar2 = this.f109995a;
        if (textTitleBar2 == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar2.getBackBtn().setOnClickListener(new e(this));
        TextTitleBar textTitleBar3 = this.f109995a;
        if (textTitleBar3 == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar3.setStartText(R.string.a9e);
        TextTitleBar textTitleBar4 = this.f109995a;
        if (textTitleBar4 == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar4.getBackBtn().setImageResource(2131233214);
        TextTitleBar textTitleBar5 = this.f109995a;
        if (textTitleBar5 == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar5.setTitle(R.string.bk_);
        TextTitleBar textTitleBar6 = this.f109995a;
        if (textTitleBar6 == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar6.setEndText(R.string.bba);
        TextTitleBar textTitleBar7 = this.f109995a;
        if (textTitleBar7 == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar7.getEndText().setTextColor(getResources().getColor(R.color.bz));
        TextTitleBar textTitleBar8 = this.f109995a;
        if (textTitleBar8 == null) {
            h.f.b.l.a("mTitleBar");
        }
        DmtTextView endText = textTitleBar8.getEndText();
        h.f.b.l.b(endText, "");
        endText.setEnabled(false);
        TextTitleBar textTitleBar9 = this.f109995a;
        if (textTitleBar9 == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar9.getStartText().setOnClickListener(new View$OnClickListenerC2818g(this));
        TextTitleBar textTitleBar10 = this.f109995a;
        if (textTitleBar10 == null) {
            h.f.b.l.a("mTitleBar");
        }
        DmtTextView endText2 = textTitleBar10.getEndText();
        h.f.b.l.b(endText2, "");
        if (endText2.getVisibility() == 0) {
            f.a.a(this, a(), h.f110012a, (com.bytedance.assem.arch.viewModel.k) null, new h(this), 6);
        }
        TextTitleBar textTitleBar11 = this.f109995a;
        if (textTitleBar11 == null) {
            h.f.b.l.a("mTitleBar");
        }
        DmtTextView endText3 = textTitleBar11.getEndText();
        h.f.b.l.b(endText3, "");
        endText3.isEnabled();
        TextTitleBar textTitleBar12 = this.f109995a;
        if (textTitleBar12 == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar12.getEndText().setOnClickListener(new d(this));
        TextTitleBar textTitleBar13 = this.f109995a;
        if (textTitleBar13 == null) {
            h.f.b.l.a("mTitleBar");
        }
        textTitleBar13.setOnTitleBarClickListener(new i());
        com.bytedance.assem.arch.extensions.d.a(this, new j(this));
        View findViewById2 = view.findViewById(R.id.cn3);
        h.f.b.l.b(findViewById2, "");
        MixManageBottomView mixManageBottomView = (MixManageBottomView) findViewById2;
        this.f109996b = mixManageBottomView;
        if (mixManageBottomView == null) {
            h.f.b.l.a("mBottomView");
        }
        mixManageBottomView.getRemoveView().setOnClickListener(new k(this));
        MixManageBottomView mixManageBottomView2 = this.f109996b;
        if (mixManageBottomView2 == null) {
            h.f.b.l.a("mBottomView");
        }
        mixManageBottomView2.getRemoveConfirmView().setOnClickListener(new l(this));
        MixManageBottomView mixManageBottomView3 = this.f109996b;
        if (mixManageBottomView3 == null) {
            h.f.b.l.a("mBottomView");
        }
        mixManageBottomView3.getAddVideoView().setOnClickListener(new f(this));
        a(a2, i.f110013a, j.f110014a, com.bytedance.assem.arch.viewModel.l.a(a().f25686c), null, new m(this));
        z.c cVar = new z.c();
        cVar.element = MixFeedService.k().d();
        a(a3, k.f110015a, l.f110016a, com.bytedance.assem.arch.viewModel.l.a(a().f25686c), null, new n(this, cVar));
        f.a.a(this, a(), m.f110017a, (com.bytedance.assem.arch.viewModel.k) null, new o(this), 6);
    }

    static final class p implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f110010a;

        static {
            Covode.recordClassIndex(70526);
        }

        p(g gVar) {
            this.f110010a = gVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            h.f.b.l.b(keyEvent, "");
            if (keyEvent.getAction() != 0 || i2 != 4) {
                return false;
            }
            g.a(this.f110010a.a(), new h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.g.p.AnonymousClass1 */
                final /* synthetic */ p this$0;

                static {
                    Covode.recordClassIndex(70527);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
                    com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    if (!aVar2.f110136d.f25631b.booleanValue()) {
                        this.this$0.f110010a.a(true);
                        return h.z.f158842a;
                    } else if (this.this$0.f110010a.f109999e) {
                        this.this$0.f110010a.b();
                        return h.z.f158842a;
                    } else {
                        com.ss.android.ugc.aweme.mix.a.a.a(this.this$0.f110010a.f109997c, this.this$0.f110010a.f109998d, false);
                        androidx.fragment.app.e activity = this.this$0.f110010a.getActivity();
                        if (activity == null) {
                            return null;
                        }
                        activity.finish();
                        return h.z.f158842a;
                    }
                }
            });
            return true;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.q<com.bytedance.tiktok.proxy.d, List<? extends String>, List<? extends String>, h.z> {
        final /* synthetic */ z.c $maxAddCount;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(g gVar, z.c cVar) {
            super(3);
            this.this$0 = gVar;
            this.$maxAddCount = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, List<? extends String> list, List<? extends String> list2) {
            boolean z;
            List<? extends String> list3 = list;
            h.f.b.l.d(dVar, "");
            TuxButton addVideoView = g.a(this.this$0).getAddVideoView();
            if (list3 == null) {
                h.f.b.l.b();
            }
            if (list3.size() < this.$maxAddCount.element) {
                z = true;
            } else {
                z = false;
            }
            addVideoView.setEnabled(z);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str = "";
        h.f.b.l.d(layoutInflater, str);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("key_mix_id");
            if (string == null) {
                string = str;
            }
            this.f109997c = string;
            String string2 = arguments.getString("enter_from");
            if (string2 != null) {
                str = string2;
            }
            this.f109998d = str;
        }
        return com.a.a(layoutInflater, R.layout.a16, viewGroup, false);
    }

    static final class m extends h.f.b.m implements h.f.a.q<com.bytedance.tiktok.proxy.d, List<? extends String>, List<? extends Aweme>, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(g gVar) {
            super(3);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, List<? extends String> list, List<? extends Aweme> list2) {
            List<? extends String> list3 = list;
            List<? extends Aweme> list4 = list2;
            h.f.b.l.d(dVar, "");
            if (list3 != null) {
                if (list4 != null) {
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list4, 10));
                    Iterator<T> it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAid());
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && (!arrayList2.isEmpty())) {
                        ArrayList arrayList3 = new ArrayList();
                        for (T t : list3) {
                            if (arrayList2.contains(t)) {
                                arrayList3.add(t);
                            }
                        }
                        g.a(this.this$0).a(arrayList3.size());
                    }
                }
                g.a(this.this$0).a(list3.size());
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
