package com.ss.android.ugc.aweme.compliance.business.inference.viewmodel;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.d;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.app.g;
import com.ss.android.ugc.aweme.compliance.business.inference.api.InferenceCategoryApi;
import com.ss.android.ugc.aweme.compliance.business.inference.model.InferenceCategory;
import com.ss.android.ugc.aweme.compliance.business.inference.model.LabelData;
import h.f.b.l;

public final class InferenceCategoryVM extends ac {

    /* renamed from: d  reason: collision with root package name */
    public static int f76972d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final a f76973e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public t<InferenceCategory> f76974a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public t<LabelData> f76975b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final InferenceCategoryApi f76976c = InferenceCategoryApi.a.a();

    public static final class a {
        static {
            Covode.recordClassIndex(47572);
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.business.inference.viewmodel.InferenceCategoryVM$a$a  reason: collision with other inner class name */
        public static final class C1766a implements ad.b {
            static {
                Covode.recordClassIndex(47573);
            }

            C1766a() {
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new InferenceCategoryVM();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static InferenceCategoryVM a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, new C1766a()).a(InferenceCategoryVM.class);
            l.b(a2, "");
            return (InferenceCategoryVM) a2;
        }
    }

    static {
        Covode.recordClassIndex(47571);
    }

    public final void a() {
        if (!g.a()) {
            this.f76976c.getUserLabelList().enqueue(new b(this));
        }
    }

    public static final class b implements d<InferenceCategory> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InferenceCategoryVM f76977a;

        static {
            Covode.recordClassIndex(47574);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(InferenceCategoryVM inferenceCategoryVM) {
            this.f76977a = inferenceCategoryVM;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<InferenceCategory> bVar, Throwable th) {
            if (InferenceCategoryVM.f76972d > 0) {
                InferenceCategoryVM.f76972d--;
                this.f76977a.a();
            }
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<InferenceCategory> bVar, u<InferenceCategory> uVar) {
            if (uVar != null && uVar.f42629a.a() && uVar.f42630b != null) {
                this.f76977a.f76974a.setValue(uVar.f42630b);
                InferenceCategoryVM.f76972d = 3;
            } else if (InferenceCategoryVM.f76972d > 0) {
                InferenceCategoryVM.f76972d--;
                this.f76977a.a();
            }
        }
    }
}
