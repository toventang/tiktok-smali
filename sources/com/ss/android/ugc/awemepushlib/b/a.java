package com.ss.android.ugc.awemepushlib.b;

import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.e.ae;
import com.ss.android.ugc.aweme.notice.api.e.m;
import com.ss.android.ugc.aweme.notice.api.e.t;
import com.ss.android.ugc.aweme.notice.api.e.w;
import com.ss.android.ugc.aweme.notice.api.e.z;
import h.f.b.l;

public final class a implements com.bytedance.push.frontier.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f145379a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static z f145380b;

    private a() {
    }

    static {
        Covode.recordClassIndex(95054);
    }

    @Override // com.bytedance.push.frontier.a.b
    public final void a() {
        z zVar = f145380b;
        if (zVar != null) {
            t a2 = t.f112753j.a();
            m mVar = new m(com.bytedance.push.frontier.b.f42133a, com.bytedance.push.frontier.b.f42134b);
            l.d(mVar, "");
            l.d(zVar, "");
            a2.f112760g.remove(mVar);
        }
    }

    static final class b implements z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f145382a;

        static {
            Covode.recordClassIndex(95056);
        }

        b(e eVar) {
            this.f145382a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.notice.api.e.z
        public final void a(WsChannelMsg wsChannelMsg) {
            l.d(wsChannelMsg, "");
            e eVar = this.f145382a;
            if (eVar != null) {
                eVar.a(wsChannelMsg);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.b.a$a  reason: collision with other inner class name */
    static final class C3866a implements ae {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f145381a;

        static {
            Covode.recordClassIndex(95055);
        }

        C3866a(e eVar) {
            this.f145381a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.notice.api.e.ae
        public final void a(w wVar) {
            l.d(wVar, "");
            e eVar = this.f145381a;
            if (eVar != null) {
                eVar.a(wVar.f112765a, wVar.f112766b);
            }
        }
    }

    @Override // com.bytedance.push.frontier.a.b
    public final void a(e eVar) {
        t a2 = t.f112753j.a();
        C3866a aVar = new C3866a(eVar);
        l.d(aVar, "");
        a2.f112759f.add(aVar);
        if (f145380b == null) {
            f145380b = new b(eVar);
        }
        z zVar = f145380b;
        if (zVar != null) {
            t.f112753j.a().a(new m(com.bytedance.push.frontier.b.f42133a, com.bytedance.push.frontier.b.f42134b), zVar);
        }
    }
}
