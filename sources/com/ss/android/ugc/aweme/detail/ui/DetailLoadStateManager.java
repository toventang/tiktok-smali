package com.ss.android.ugc.aweme.detail.ui;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DetailLoadStateManager extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f79902b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f79903a = new t<>();

    public static final class a {
        static {
            Covode.recordClassIndex(49701);
        }

        /* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager$a$a  reason: collision with other inner class name */
        public static final class C1865a implements ad.b {
            static {
                Covode.recordClassIndex(49702);
            }

            C1865a() {
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new DetailLoadStateManager();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static DetailLoadStateManager a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, new C1865a()).a(DetailLoadStateManager.class);
            l.b(a2, "");
            return (DetailLoadStateManager) a2;
        }
    }

    static {
        Covode.recordClassIndex(49700);
    }
}
