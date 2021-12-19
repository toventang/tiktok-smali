package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class PDPHeaderImageExperiment {
    public static final PDPHeaderImageExperiment INSTANCE = new PDPHeaderImageExperiment();
    private static final h config$delegate = i.a((h.f.a.a) a.f84201a);
    public static final PDPImageConfig none = new PDPImageConfig();

    private final PDPImageConfig getConfig() {
        return (PDPImageConfig) config$delegate.getValue();
    }

    private PDPHeaderImageExperiment() {
    }

    public final boolean isProgressiveSwitch() {
        if (getConfig().f84202a == 1) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<PDPImageConfig> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f84201a = new a();

        static {
            Covode.recordClassIndex(52514);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PDPImageConfig invoke() {
            Object a2 = b.a().a(true, "ecom_pdp_header_img_setting", PDPImageConfig.class, PDPHeaderImageExperiment.none);
            if (a2 != null) {
                return a2;
            }
            PDPHeaderImageExperiment pDPHeaderImageExperiment = PDPHeaderImageExperiment.INSTANCE;
            return PDPHeaderImageExperiment.none;
        }
    }

    static {
        Covode.recordClassIndex(52513);
    }
}
