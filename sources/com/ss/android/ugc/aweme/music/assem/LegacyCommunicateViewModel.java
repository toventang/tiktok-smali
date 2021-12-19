package com.ss.android.ugc.aweme.music.assem;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.ui.aq;
import h.f.b.l;
import h.f.b.m;

public final class LegacyCommunicateViewModel extends AssemViewModel<a> {

    /* renamed from: j  reason: collision with root package name */
    public aq.b f111103j;

    /* renamed from: k  reason: collision with root package name */
    public String f111104k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f111105l;

    static {
        Covode.recordClassIndex(71302);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ a f() {
        return new a();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f111103j = null;
        this.f111104k = null;
        this.f111105l = false;
    }

    static final class a extends m implements h.f.a.b<a, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f111106a = new a();

        static {
            Covode.recordClassIndex(71303);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, new com.bytedance.assem.arch.extensions.a(null), null, 2);
        }
    }

    static final class b extends m implements h.f.a.b<a, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f111107a = new b();

        static {
            Covode.recordClassIndex(71304);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, null, new com.bytedance.assem.arch.extensions.a(null), 1);
        }
    }
}
