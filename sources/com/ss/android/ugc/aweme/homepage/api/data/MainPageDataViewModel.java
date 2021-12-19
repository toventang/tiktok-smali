package com.ss.android.ugc.aweme.homepage.api.data;

import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class MainPageDataViewModel extends ac {

    /* renamed from: c  reason: collision with root package name */
    public static final a f99133c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f99134a;

    /* renamed from: b  reason: collision with root package name */
    public String f99135b = "homepage_hot";

    static {
        Covode.recordClassIndex(63155);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63156);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel$a$a  reason: collision with other inner class name */
        public static final class C2419a implements ad.b {
            static {
                Covode.recordClassIndex(63157);
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new MainPageDataViewModel();
            }
        }
    }
}
