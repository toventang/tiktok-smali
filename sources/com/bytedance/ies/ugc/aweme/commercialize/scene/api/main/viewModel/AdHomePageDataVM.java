package com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class AdHomePageDataVM extends ac {

    /* renamed from: e  reason: collision with root package name */
    public static final a f34656e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f34657a;

    /* renamed from: b  reason: collision with root package name */
    public t<com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a> f34658b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public t<Float> f34659c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public t<Boolean> f34660d = new t<>();

    public static final class a {
        static {
            Covode.recordClassIndex(20787);
        }

        /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM$a$a  reason: collision with other inner class name */
        public static final class C0780a implements ad.b {
            static {
                Covode.recordClassIndex(20788);
            }

            C0780a() {
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new AdHomePageDataVM();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static AdHomePageDataVM a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, new C0780a()).a(AdHomePageDataVM.class);
            l.b(a2, "");
            return (AdHomePageDataVM) a2;
        }
    }

    static {
        Covode.recordClassIndex(20786);
    }

    public final boolean a() {
        com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a value = this.f34658b.getValue();
        if (value == null || value.f34874a == 4) {
            return false;
        }
        return true;
    }
}
