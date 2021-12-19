package com.bytedance.ies.powerpermissions;

import androidx.fragment.app.e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class l implements c {

    /* renamed from: b  reason: collision with root package name */
    public static LinkedList<e> f34467b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f34468c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f34469d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public k f34470a;

    public static final class a {
        static {
            Covode.recordClassIndex(20615);
        }

        private a() {
        }

        public final void a() {
            MethodCollector.i(9034);
            if (!l.f34468c) {
                synchronized (this) {
                    try {
                        if (!l.f34468c) {
                            IGetInterceptor c2 = PowerPermissionsTask.c();
                            h.f.b.l.a((Object) c2, "");
                            List<e> a2 = c2.a();
                            if (a2 != null) {
                                for (T t : a2) {
                                    h.f.b.l.a((Object) t, "");
                                    h.f.b.l.c(t, "");
                                    l.f34467b.add(t);
                                }
                            }
                            l.f34468c = true;
                        }
                    } finally {
                        MethodCollector.o(9034);
                    }
                }
                return;
            }
            MethodCollector.o(9034);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final c a(e eVar, PrivacyCert privacyCert) {
            h.f.b.l.c(eVar, "");
            a();
            l lVar = new l(eVar, (byte) 0);
            if (privacyCert != null) {
                k kVar = lVar.f34470a;
                h.f.b.l.c(privacyCert, "");
                kVar.f34464b = privacyCert;
            }
            if (!l.f34467b.isEmpty()) {
                Iterator<e> it = l.f34467b.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    h.f.b.l.a((Object) next, "");
                    lVar.a(next);
                }
            }
            return lVar;
        }
    }

    static {
        Covode.recordClassIndex(20614);
    }

    public static final c a(e eVar) {
        return f34469d.a(eVar, null);
    }

    @Override // com.bytedance.ies.powerpermissions.c
    public final c a(e eVar) {
        h.f.b.l.c(eVar, "");
        return this.f34470a.a(eVar);
    }

    private l(e eVar) {
        h.f.b.l.c(eVar, "");
        k kVar = new k();
        kVar.f34463a = new WeakReference<>(eVar);
        this.f34470a = kVar;
    }

    @Override // com.bytedance.ies.powerpermissions.c
    public final c a(String... strArr) {
        h.f.b.l.c(strArr, "");
        return this.f34470a.a((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.bytedance.ies.powerpermissions.c
    public final void a(f fVar) {
        h.f.b.l.c(fVar, "");
        this.f34470a.a(fVar);
    }

    public /* synthetic */ l(e eVar, byte b2) {
        this(eVar);
    }
}
