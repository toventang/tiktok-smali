package com.ss.android.ugc.aweme.dsp.library;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.i;
import com.bytedance.assem.arch.core.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.ss.android.ugc.aweme.dsp.common.arch.a.a;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class g extends com.bytedance.ies.foundation.fragment.a implements i {

    /* renamed from: f  reason: collision with root package name */
    public static final a f83343f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playpage.model.g f83344e = new com.ss.android.ugc.aweme.dsp.playpage.model.g("my_playlist");

    /* renamed from: g  reason: collision with root package name */
    private l f83345g = new l(this);

    /* renamed from: h  reason: collision with root package name */
    private int f83346h;

    /* renamed from: i  reason: collision with root package name */
    private final d f83347i = new d(this);

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f83348j;

    static {
        Covode.recordClassIndex(51995);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f83348j == null) {
            this.f83348j = new SparseArray();
        }
        View view = (View) this.f83348j.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f83348j.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f83348j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51996);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final com.ss.android.ugc.aweme.dsp.playerservice.f.a d() {
        return a.C1960a.a(c()).f83291b.f83362b;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ f e() {
        return new f(c());
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f83345g;
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.b(lVar);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        d().b(this.f83347i);
        br_();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    private final String c() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_method")) == null) {
            return "homepage_music_tab";
        }
        return string;
    }

    public static final class d implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f83351a;

        static {
            Covode.recordClassIndex(52002);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void a(float f2) {
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void a(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void a(long j2) {
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void b(long j2) {
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void bd_() {
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void be_() {
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void d() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(g gVar) {
            this.f83351a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
            l.d(aVar, "");
            l.d(aVar, "");
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
            l.d(bVar, "");
            l.d(bVar, "");
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
            e activity;
            if (cVar != null && com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.b() && this.f83351a.isResumed() && this.f83351a.getUserVisibleHint() && (activity = this.f83351a.getActivity()) != null) {
                l.b(activity, "");
                if (!g.a(activity) || Hox.a.a(activity).b("MUSIC_DSP")) {
                    com.ss.android.ugc.aweme.dsp.b.b.a(activity, cVar, this.f83351a.f83344e);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void a(f fVar) {
            l.d(fVar, "");
            l.d(fVar, "");
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
        public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.g gVar) {
            l.d(gVar, "");
            l.d(gVar, "");
        }
    }

    static final class b extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f83349a = new b();

        static {
            Covode.recordClassIndex(51997);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f83350a);
            return z.f158842a;
        }
    }

    public static boolean a(e eVar) {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(eVar);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(b.f83349a);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        bundle.putInt("KEY_TAB_HEIGHT", this.f83346h);
        super.onSaveInstanceState(bundle);
    }

    static final class c extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(51999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.dsp.library.g.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(52000);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(i<com.bytedance.assem.arch.extensions.c> iVar) {
                    i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.f25573b = "key_hierarchy_data_page_scene";
                    iVar2.a(new com.ss.android.ugc.aweme.dsp.library.a.d(this.this$0.this$0.f83344e));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.dsp.library.g.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(52001);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.a(ab.a(a.class));
                    qVar2.f25596b = new a();
                    qVar2.f25599e = (FrameLayout) this.this$0.this$0.a(R.id.c_8);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.library.g.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.alu, viewGroup, false);
    }
}
