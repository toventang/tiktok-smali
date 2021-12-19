package com.ss.android.ugc.aweme.notification.vm;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.LinkedHashSet;
import java.util.Set;

public final class NotificationDetailVM extends ac {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114099a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f114100b = i.a((h.f.a.a) b.f114101a);

    static {
        Covode.recordClassIndex(73358);
    }

    private Set<String> a() {
        return (Set) this.f114100b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73359);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114101a = new b();

        static {
            Covode.recordClassIndex(73360);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    public final void a(BaseNotice baseNotice, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (baseNotice != null && !a().contains(baseNotice.nid)) {
            Set<String> a2 = a();
            String str = baseNotice.nid;
            l.b(str, "");
            a2.add(str);
            aVar.invoke();
        }
    }
}
