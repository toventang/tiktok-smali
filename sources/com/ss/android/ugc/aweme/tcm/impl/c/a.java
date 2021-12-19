package com.ss.android.ugc.aweme.tcm.impl.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.notice.api.bean.b;
import com.ss.android.ugc.aweme.notice.api.bean.f;
import com.ss.android.ugc.aweme.notice.api.e.q;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class a implements com.ss.android.ugc.aweme.notice.api.a.a {

    /* renamed from: b  reason: collision with root package name */
    public static a f138611b;

    /* renamed from: c  reason: collision with root package name */
    public static final C3657a f138612c = new C3657a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.notice.api.bean.a f138613a;

    static {
        Covode.recordClassIndex(90679);
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.c.a$a  reason: collision with other inner class name */
    public static final class C3657a {
        static {
            Covode.recordClassIndex(90680);
        }

        private C3657a() {
        }

        public final synchronized a a() {
            a aVar;
            MethodCollector.i(7251);
            if (a.f138611b == null) {
                a.f138611b = new a();
            }
            aVar = a.f138611b;
            if (aVar == null) {
                l.b();
            }
            MethodCollector.o(7251);
            return aVar;
        }

        public /* synthetic */ C3657a(byte b2) {
            this();
        }
    }

    public a() {
        q.f112739f.a(f.BC, this);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.a.a
    public final void a(b bVar) {
        String str;
        User b2;
        if (bVar instanceof com.ss.android.ugc.aweme.notice.api.bean.a) {
            com.ss.android.ugc.aweme.notice.api.bean.a aVar = (com.ss.android.ugc.aweme.notice.api.bean.a) bVar;
            this.f138613a = aVar;
            if (aVar != null) {
                com.ss.android.ugc.aweme.tcm.api.a.a a2 = com.ss.android.ugc.aweme.tcm.impl.a.a.a();
                if (a2 == null || (b2 = a2.b()) == null) {
                    str = null;
                } else {
                    str = b2.getUid();
                }
                aVar.setUid(str);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("videoCounts", Integer.valueOf(aVar.getNewContentNum()));
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("onBCVideoCountsChange", aVar.getUpdateTime(), com.bytedance.ies.xbridge.platform.b.b.a(linkedHashMap)));
        }
    }
}
