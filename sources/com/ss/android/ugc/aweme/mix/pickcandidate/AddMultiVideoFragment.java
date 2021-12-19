package com.ss.android.ugc.aweme.mix.pickcandidate;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.mix.createmix.g;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public final class AddMultiVideoFragment extends com.ss.android.ugc.aweme.base.f.a implements com.bytedance.assem.arch.viewModel.h {

    /* renamed from: b  reason: collision with root package name */
    public static final e f110166b = new e((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f110167a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f110168c = h.i.a((h.f.a.a) new n(this));

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f110169d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f110170e;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f110171j;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.createmix.viewmodel.a, com.ss.android.ugc.aweme.mix.createmix.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70714);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.createmix.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.createmix.viewmodel.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(70716);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70710);
    }

    public final View a(int i2) {
        if (this.f110171j == null) {
            this.f110171j = new SparseArray();
        }
        View view = (View) this.f110171j.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f110171j.put(i2, findViewById);
        return findViewById;
    }

    public final MultiVideoViewModel a() {
        return (MultiVideoViewModel) this.f110168c.getValue();
    }

    public final MixCreateViewModel b() {
        return (MixCreateViewModel) this.f110169d.getValue();
    }

    public final MixVideosManageViewModel c() {
        return (MixVideosManageViewModel) this.f110170e.getValue();
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

    public static final class e {
        static {
            Covode.recordClassIndex(70717);
        }

        private e() {
        }

        public static AddMultiVideoFragment a() {
            Bundle bundle = new Bundle();
            AddMultiVideoFragment addMultiVideoFragment = new AddMultiVideoFragment();
            addMultiVideoFragment.setArguments(bundle);
            return addMultiVideoFragment;
        }

        public /* synthetic */ e(byte b2) {
            this();
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
        SparseArray sparseArray = this.f110171j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70713);
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

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<MultiVideoViewModel> {
        final /* synthetic */ AddMultiVideoFragment this$0;

        static {
            Covode.recordClassIndex(70727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(AddMultiVideoFragment addMultiVideoFragment) {
            super(0);
            this.this$0 = addMultiVideoFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MultiVideoViewModel invoke() {
            ac a2 = ae.a(this.this$0, (ad.b) null).a(MultiVideoViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
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
        view3.setOnKeyListener(new m(this));
    }

    public AddMultiVideoFragment() {
        h.k.c a2 = ab.a(MixCreateViewModel.class);
        this.f110169d = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, b.INSTANCE);
        h.k.c a3 = ab.a(MixVideosManageViewModel.class);
        this.f110170e = new com.bytedance.assem.arch.viewModel.b(a3, new c(a3), u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, d.INSTANCE);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public static final class CandidateGridLayoutManager extends GridLayoutManager {
        public final PowerList L;

        static {
            Covode.recordClassIndex(70711);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager
        public final void a(GridLayoutManager.c cVar) {
            super.a(new a(this, cVar));
        }

        public static final class a extends GridLayoutManager.c {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ CandidateGridLayoutManager f110172e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ GridLayoutManager.c f110173f;

            static {
                Covode.recordClassIndex(70712);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int a(int i2) {
                List<com.bytedance.ies.powerlist.b.a> c2 = this.f110172e.L.getState().c();
                int headerCount = this.f110172e.L.getHeaderCount();
                if (i2 < headerCount) {
                    return ((GridLayoutManager) this.f110172e).f3760b;
                }
                if (i2 >= c2.size() + headerCount) {
                    return ((GridLayoutManager) this.f110172e).f3760b;
                }
                int i3 = i2 - headerCount;
                if (c2.get(i3) instanceof com.bytedance.ies.powerlist.header.a) {
                    return ((GridLayoutManager) this.f110172e).f3760b;
                }
                GridLayoutManager.c cVar = this.f110173f;
                if (cVar != null) {
                    return cVar.a(i3);
                }
                return 1;
            }

            a(CandidateGridLayoutManager candidateGridLayoutManager, GridLayoutManager.c cVar) {
                this.f110172e = candidateGridLayoutManager;
                this.f110173f = cVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CandidateGridLayoutManager(Context context, PowerList powerList) {
            super(3);
            h.f.b.l.d(context, "");
            h.f.b.l.d(powerList, "");
            this.L = powerList;
            a((GridLayoutManager.c) null);
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddMultiVideoFragment f110174a;

        static {
            Covode.recordClassIndex(70719);
        }

        g(AddMultiVideoFragment addMultiVideoFragment) {
            this.f110174a = addMultiVideoFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f110174a.a().b();
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddMultiVideoFragment f110179a;

        static {
            Covode.recordClassIndex(70723);
        }

        k(AddMultiVideoFragment addMultiVideoFragment) {
            this.f110179a = addMultiVideoFragment;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i supportFragmentManager;
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f110179a.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                this.f110179a.c().a(true);
                if (supportFragmentManager.e() == 0) {
                    androidx.fragment.app.e activity2 = this.f110179a.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                        return;
                    }
                    return;
                }
                supportFragmentManager.c();
            }
        }
    }

    static final class i<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddMultiVideoFragment f110177a;

        static {
            Covode.recordClassIndex(70721);
        }

        i(AddMultiVideoFragment addMultiVideoFragment) {
            this.f110177a = addMultiVideoFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            int status = MultiVideoViewModel.a.EMPTY.getStatus();
            if (num != null && num.intValue() == status) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f110177a.a(R.id.a27);
                h.f.b.l.b(dmtStatusView, "");
                dmtStatusView.setVisibility(0);
                ((DmtStatusView) this.f110177a.a(R.id.a27)).g();
                return;
            }
            int status2 = MultiVideoViewModel.a.ERROR.getStatus();
            if (num != null && num.intValue() == status2) {
                DmtStatusView dmtStatusView2 = (DmtStatusView) this.f110177a.a(R.id.a27);
                h.f.b.l.b(dmtStatusView2, "");
                dmtStatusView2.setVisibility(0);
                ((DmtStatusView) this.f110177a.a(R.id.a27)).h();
                return;
            }
            int status3 = MultiVideoViewModel.a.SUCCESS.getStatus();
            if (num != null && num.intValue() == status3) {
                DmtStatusView dmtStatusView3 = (DmtStatusView) this.f110177a.a(R.id.a27);
                h.f.b.l.b(dmtStatusView3, "");
                dmtStatusView3.setVisibility(8);
            }
        }
    }

    static final class j<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddMultiVideoFragment f110178a;

        static {
            Covode.recordClassIndex(70722);
        }

        j(AddMultiVideoFragment addMultiVideoFragment) {
            this.f110178a = addMultiVideoFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            TuxButton tuxButton = (TuxButton) this.f110178a.a(R.id.cuz);
            h.f.b.l.b(tuxButton, "");
            if (num.intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            TuxButton tuxButton2 = (TuxButton) this.f110178a.a(R.id.cuz);
            h.f.b.l.b(tuxButton2, "");
            Resources resources = this.f110178a.getResources();
            h.f.b.l.b(num, "");
            tuxButton2.setText(resources.getQuantityString(R.plurals.fc, num.intValue(), num));
        }
    }

    static final class h<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddMultiVideoFragment f110175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f110176b;

        static {
            Covode.recordClassIndex(70720);
        }

        h(AddMultiVideoFragment addMultiVideoFragment, int i2) {
            this.f110175a = addMultiVideoFragment;
            this.f110176b = i2;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            TuxButton tuxButton = (TuxButton) this.f110175a.a(R.id.cuz);
            h.f.b.l.b(tuxButton, "");
            if (num.intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            tuxButton.setEnabled(z);
            if (num.intValue() >= this.f110176b) {
                if (!this.f110175a.a().f110202h) {
                    this.f110175a.f110167a = true;
                    this.f110175a.a().f110202h = true;
                    PowerList powerList = (PowerList) this.f110175a.a(R.id.de4);
                    h.f.b.l.b(powerList, "");
                    int i2 = 0;
                    for (T t : powerList.getState().c()) {
                        if (t instanceof a) {
                            T t2 = t;
                            if (!t2.f110217b) {
                                a aVar = a.a(t2.f110216a, t2.f110217b, true, t2.f110219d, t2.f110220e, t2.f110221f, t2.f110222g);
                                PowerList powerList2 = (PowerList) this.f110175a.a(R.id.de4);
                                h.f.b.l.b(powerList2, "");
                                powerList2.getState().b(i2, aVar);
                            }
                        }
                        i2++;
                    }
                    String string = this.f110175a.getResources().getString(R.string.gil);
                    h.f.b.l.b(string, "");
                    String a2 = com.a.a(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f110176b)}, 1));
                    h.f.b.l.b(a2, "");
                    new com.bytedance.tux.g.b(this.f110175a).a(a2).b();
                    this.f110175a.a().f110201g = false;
                    if (this.f110175a.getActivity() instanceof MixFeedManagerActivity) {
                        com.ss.android.ugc.aweme.mix.a.a.a(this.f110175a.c().g(), this.f110175a.c().f110070j, "manage_video");
                    } else {
                        com.ss.android.ugc.aweme.mix.a.a.a(this.f110175a.b().f109869j, this.f110175a.b().f109870k, "create_playlist");
                    }
                } else {
                    return;
                }
            } else if (this.f110175a.f110167a) {
                this.f110175a.f110167a = false;
                PowerList powerList3 = (PowerList) this.f110175a.a(R.id.de4);
                h.f.b.l.b(powerList3, "");
                int i3 = 0;
                for (T t3 : powerList3.getState().c()) {
                    if (t3 instanceof a) {
                        T t4 = t3;
                        if (!t4.f110219d && !t4.f110217b) {
                            a aVar2 = a.a(t4.f110216a, t4.f110217b, false, t4.f110219d, t4.f110220e, t4.f110221f, t4.f110222g);
                            PowerList powerList4 = (PowerList) this.f110175a.a(R.id.de4);
                            h.f.b.l.b(powerList4, "");
                            powerList4.getState().b(i3, aVar2);
                        }
                    }
                    i3++;
                }
                this.f110175a.a().f110201g = true;
            }
            if (!(this.f110175a.getActivity() instanceof MixFeedManagerActivity)) {
                TuxButton tuxButton2 = (TuxButton) this.f110175a.a(R.id.cuz);
                h.f.b.l.b(tuxButton2, "");
                String string2 = this.f110175a.getString(R.string.dgu);
                h.f.b.l.b(string2, "");
                String a3 = com.a.a(string2, Arrays.copyOf(new Object[]{num}, 1));
                h.f.b.l.b(a3, "");
                tuxButton2.setText(a3);
            }
            if (num.intValue() < this.f110176b) {
                this.f110175a.a().f110202h = false;
            }
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddMultiVideoFragment f110180a;

        static {
            Covode.recordClassIndex(70724);
        }

        l(AddMultiVideoFragment addMultiVideoFragment) {
            this.f110180a = addMultiVideoFragment;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i supportFragmentManager;
            androidx.fragment.app.i supportFragmentManager2;
            androidx.fragment.app.i supportFragmentManager3;
            ClickAgent.onClick(view);
            TuxButton tuxButton = (TuxButton) this.f110180a.a(R.id.cuz);
            h.f.b.l.b(tuxButton, "");
            if (tuxButton.isEnabled()) {
                if (this.f110180a.getActivity() instanceof MixFeedManagerActivity) {
                    MixVideosManageViewModel c2 = this.f110180a.c();
                    AddMultiVideoFragment addMultiVideoFragment = this.f110180a;
                    ArrayList arrayList = new ArrayList();
                    PowerList powerList = (PowerList) addMultiVideoFragment.a(R.id.de4);
                    h.f.b.l.b(powerList, "");
                    for (T t : powerList.getState().c()) {
                        for (Aweme aweme : addMultiVideoFragment.a().f110197c) {
                            if (t instanceof a) {
                                T t2 = t;
                                if (h.f.b.l.a(t2.f110220e, aweme) && !t2.f110221f) {
                                    arrayList.add(aweme);
                                }
                            }
                        }
                    }
                    List<Aweme> list = this.f110180a.a().f110197c;
                    h.f.b.l.d(arrayList, "");
                    h.f.b.l.d(list, "");
                    List<Aweme> list2 = ((com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a) c2.d().a()).f110133a;
                    z.e eVar = new z.e();
                    eVar.element = (T) new ArrayList();
                    if (list2 != null) {
                        eVar.element.addAll(h.a.n.k(list2));
                        eVar.element.addAll(0, arrayList);
                    }
                    c2.a(new MixVideosManageViewModel.b(eVar, c2, arrayList, list));
                    c2.a(new MixVideosManageViewModel.c(c2, arrayList, list));
                }
                MixCreateViewModel b2 = this.f110180a.b();
                List a2 = h.a.n.a((Iterable) this.f110180a.a().f110197c, (Comparator) new a());
                h.f.b.l.d(a2, "");
                b2.a(new MixCreateViewModel.f(a2));
                if (this.f110180a.getActivity() instanceof MixFeedManagerActivity) {
                    androidx.fragment.app.e activity = this.f110180a.getActivity();
                    if (!(activity == null || (supportFragmentManager3 = activity.getSupportFragmentManager()) == null)) {
                        this.f110180a.c().a(true);
                        supportFragmentManager3.c();
                    }
                    String g2 = this.f110180a.c().g();
                    String str = this.f110180a.c().f110070j;
                    Integer value = this.f110180a.a().f110203i.getValue();
                    if (value == null) {
                        value = 0;
                    }
                    h.f.b.l.b(value, "");
                    r.a("add_multiple_playlist_video", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("enter_method", "manage_video").a("add_cnt", value.intValue()).a("playlist_id", g2).f66730a);
                    Resources resources = this.f110180a.getResources();
                    Integer value2 = this.f110180a.a().f110203i.getValue();
                    if (value2 == null) {
                        value2 = 0;
                    }
                    h.f.b.l.b(value2, "");
                    String quantityString = resources.getQuantityString(R.plurals.f160021m, value2.intValue(), this.f110180a.a().f110203i.getValue());
                    h.f.b.l.b(quantityString, "");
                    new com.bytedance.tux.g.b(this.f110180a).a(quantityString).b();
                } else if (com.ss.android.ugc.aweme.mix.c.b.a() != 2 || !this.f110180a.b().h()) {
                    androidx.fragment.app.e activity2 = this.f110180a.getActivity();
                    if (activity2 == null || (supportFragmentManager2 = activity2.getSupportFragmentManager()) == null || supportFragmentManager2.a("MixFeedOrderFragment") == null) {
                        com.ss.android.ugc.aweme.mix.createmix.g a3 = g.c.a();
                        androidx.fragment.app.e activity3 = this.f110180a.getActivity();
                        if (!(activity3 == null || (supportFragmentManager = activity3.getSupportFragmentManager()) == null)) {
                            supportFragmentManager.a().a(R.anim.dq, R.anim.dx, 0, R.anim.dx).a(R.id.b94, a3, "AddMultiVideoFragment").a((String) null).b();
                        }
                        com.ss.android.ugc.aweme.mix.a.a.f(this.f110180a.b().f109870k, this.f110180a.b().f109871l);
                    }
                } else {
                    this.f110180a.b().a(com.ss.android.ugc.aweme.mix.createmix.viewmodel.b.CREATE_NAME);
                }
            }
        }

        public static final class a<T> implements Comparator {
            static {
                Covode.recordClassIndex(70725);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return h.b.a.a(t2.getAid(), t.getAid());
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2017);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(2017);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Collection<? extends Aweme> arrayList;
        List<String> arrayList2;
        MethodCollector.i(2009);
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.al4, (ViewGroup) null);
        h.f.b.l.b(inflate, "");
        DmtStatusView.a a3 = a2.b(inflate).a(R.string.g21, new g(this));
        a3.f33605g = 0;
        ((DmtStatusView) a(R.id.a27)).setBuilder(a3);
        if (getActivity() instanceof MixFeedManagerActivity) {
            MultiVideoViewModel a4 = a();
            String g2 = c().g();
            h.f.b.l.d(g2, "");
            a4.f110205k = g2;
        }
        int i2 = Build.VERSION.SDK_INT;
        Context context = getContext();
        if (context != null) {
            obj = a(context, "input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            TuxButton tuxButton = (TuxButton) a(R.id.cuz);
            h.f.b.l.b(tuxButton, "");
            inputMethodManager.hideSoftInputFromWindow(tuxButton.getWindowToken(), 0);
        }
        DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.a27);
        h.f.b.l.b(dmtStatusView, "");
        dmtStatusView.setVisibility(0);
        if (getActivity() instanceof MixFeedManagerActivity) {
            TuxButton tuxButton2 = (TuxButton) a(R.id.cuz);
            h.f.b.l.b(tuxButton2, "");
            tuxButton2.setText(getString(R.string.pn));
        } else {
            TuxButton tuxButton3 = (TuxButton) a(R.id.cuz);
            h.f.b.l.b(tuxButton3, "");
            tuxButton3.setText(getString(R.string.dgt));
        }
        if (getActivity() instanceof MixFeedManagerActivity) {
            List<Aweme> list = a().f110197c;
            com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar = (com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a) c().d().a();
            if (aVar != null) {
                arrayList = aVar.f110138f;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
            } else {
                arrayList = new ArrayList<>();
            }
            list.addAll(arrayList);
            a().f110203i.postValue(0);
            MultiVideoViewModel a5 = a();
            com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar2 = (com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a) c().d().a();
            if (aVar2 != null) {
                arrayList2 = aVar2.f110139g;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
            } else {
                arrayList2 = new ArrayList<>();
            }
            a5.f110204j = arrayList2;
        }
        TuxButton tuxButton4 = (TuxButton) a(R.id.cuz);
        h.f.b.l.b(tuxButton4, "");
        tuxButton4.setEnabled(false);
        if (getContext() != null) {
            ((PowerList) a(R.id.de4)).a(MixPickCandidatePowerCell.class);
            ((RecyclerView) a(R.id.de4)).b(new f());
            RecyclerView recyclerView = (RecyclerView) a(R.id.de4);
            h.f.b.l.b(recyclerView, "");
            Context context2 = getContext();
            if (context2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context2, "");
            PowerList powerList = (PowerList) a(R.id.de4);
            h.f.b.l.b(powerList, "");
            recyclerView.setLayoutManager(new CandidateGridLayoutManager(context2, powerList));
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.de4);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setItemAnimator(null);
            ((PowerList) a(R.id.de4)).a(a().a());
            a().b();
            ((PowerList) a(R.id.de4)).a(0, com.a.a(LayoutInflater.from(getContext()), R.layout.akr, null, false));
            DmtStatusView dmtStatusView2 = (DmtStatusView) a(R.id.a27);
            if (dmtStatusView2 != null) {
                dmtStatusView2.f();
            }
        }
        a().f110198d.observe(this, new h(this, SettingsManager.a().a("mix_max_add_aweme_count", 100)));
        a().f110199e.observe(this, new i(this));
        if (getActivity() instanceof MixFeedManagerActivity) {
            a().f110203i.observe(this, new j(this));
        }
        ((ImageView) a(R.id.csw)).setOnClickListener(new k(this));
        ((TuxButton) a(R.id.cuz)).setOnClickListener(new l(this));
        MethodCollector.o(2009);
    }

    public static final class f extends RecyclerView.h {
        static {
            Covode.recordClassIndex(70718);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
            h.f.b.l.d(canvas, "");
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(sVar, "");
            super.onDraw(canvas, recyclerView, sVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            h.f.b.l.d(rect, "");
            h.f.b.l.d(view, "");
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(sVar, "");
            super.getItemOffsets(rect, view, recyclerView, sVar);
            rect.set(2, 2, 2, 2);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.akw, viewGroup, false);
    }

    static final class m implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddMultiVideoFragment f110181a;

        static {
            Covode.recordClassIndex(70726);
        }

        m(AddMultiVideoFragment addMultiVideoFragment) {
            this.f110181a = addMultiVideoFragment;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            androidx.fragment.app.i supportFragmentManager;
            h.f.b.l.b(keyEvent, "");
            if (keyEvent.getAction() != 0 || i2 != 4) {
                return false;
            }
            androidx.fragment.app.e activity = this.f110181a.getActivity();
            if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                this.f110181a.c().a(true);
                if (supportFragmentManager.e() == 0) {
                    androidx.fragment.app.e activity2 = this.f110181a.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                } else {
                    supportFragmentManager.c();
                }
            }
            return true;
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
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<q<A, B>> kVar3, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, h.z> qVar) {
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
