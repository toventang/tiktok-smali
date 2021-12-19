package com.ss.android.ugc.aweme.homepage.api.interaction;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public class ScrollSwitchStateManager extends BaseScrollSwitchStateManager {
    public static final a p = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(63162);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager$a$a  reason: collision with other inner class name */
        public static final class C2420a implements ad.b {
            static {
                Covode.recordClassIndex(63163);
            }

            C2420a() {
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new ScrollSwitchStateManager();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ScrollSwitchStateManager a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, new C2420a()).a(ScrollSwitchStateManager.class);
            l.b(a2, "");
            return (ScrollSwitchStateManager) a2;
        }
    }

    static {
        Covode.recordClassIndex(63161);
    }

    public final Fragment c() {
        if (this.f99149k == null) {
            return null;
        }
        WeakReference<Fragment> weakReference = this.f99149k;
        if (weakReference == null) {
            l.b();
        }
        return weakReference.get();
    }
}
