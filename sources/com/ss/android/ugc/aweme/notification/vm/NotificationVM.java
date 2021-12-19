package com.ss.android.ugc.aweme.notification.vm;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notification.e.a;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

public final class NotificationVM extends BaseNotificationVM {

    /* renamed from: d  reason: collision with root package name */
    public static final a f114102d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private final h f114103e = i.a((h.f.a.a) b.f114104a);

    static {
        Covode.recordClassIndex(73361);
    }

    private final Map<Integer, c> l() {
        return (Map) this.f114103e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73362);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static NotificationVM a(Fragment fragment) {
            l.d(fragment, "");
            ac a2 = ae.a(fragment, (ad.b) null).a(NotificationVM.class);
            l.b(a2, "");
            return (NotificationVM) a2;
        }
    }

    static final class b extends m implements h.f.a.a<Map<Integer, c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114104a = new b();

        static {
            Covode.recordClassIndex(73363);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, c> invoke() {
            return new LinkedHashMap();
        }
    }

    public final c j() {
        return b(a());
    }

    public final boolean k() {
        d().clear();
        e().setValue(true);
        return j().i();
    }

    public NotificationVM() {
        e eVar;
        l.d(this, "");
        com.ss.android.ugc.aweme.notification.e.a.f113335a = new WeakReference<>(this);
        a.d a2 = com.ss.android.ugc.aweme.notification.e.a.f113337c.a(false);
        if (a2 != null) {
            a2.f113362c = true;
            eVar = a2.f113361b;
        } else {
            eVar = null;
        }
        com.ss.android.ugc.aweme.notification.e.a.f113336b = null;
        if (eVar != null) {
            l().put(Integer.valueOf(a.b.a()), eVar);
        }
    }

    public final c b(int i2) {
        c cVar = l().get(Integer.valueOf(i2));
        if (cVar == null) {
            if (i2 == a.b.a()) {
                cVar = new d();
            } else {
                cVar = new c(i2);
            }
            l().put(Integer.valueOf(i2), cVar);
        }
        return cVar;
    }
}
