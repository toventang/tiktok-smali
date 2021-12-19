package com.ss.android.ugc.aweme.crossplatform.business;

import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78680a = new a((byte) 0);

    static {
        Covode.recordClassIndex(48849);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48850);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Class<? extends AbsShareBusiness> a(int i2) {
            if (i2 == 1 || i2 != 2) {
                return ShareBusiness.class;
            }
            return LandingShareBusiness.class;
        }
    }
}
