package com.bytedance.ies.im.core.f;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.g.a;
import com.bytedance.ies.im.core.b.e;
import com.bytedance.ies.im.core.e.f;
import com.bytedance.ies.im.core.e.g;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.d.a.c;
import com.bytedance.im.core.internal.utils.k;
import com.bytedance.im.core.proto.Response;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.application.o;
import com.ss.android.ugc.aweme.im.sdk.iescore.IMCoreDependProxyService;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Map;

public final class b extends com.bytedance.im.core.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f34132a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f34133b;

    private b() {
    }

    @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
    public final com.bytedance.im.core.a.c j() {
        return c.f34134a;
    }

    @Override // com.bytedance.im.core.a.b
    public final String d() {
        return e.c();
    }

    @Override // com.bytedance.im.core.a.b
    public final boolean i() {
        return com.bytedance.ies.im.core.i.a.f34189a.a();
    }

    @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
    public final boolean m() {
        return p();
    }

    @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
    public final boolean n() {
        return p();
    }

    @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
    public final boolean o() {
        return p();
    }

    static {
        Covode.recordClassIndex(20320);
    }

    private static boolean p() {
        if (d.f34135a) {
            return false;
        }
        com.bytedance.ies.im.core.api.a.f();
        return false;
    }

    @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
    public final com.bytedance.im.core.h.c b() {
        return IMCoreDependProxyService.h().g();
    }

    @Override // com.bytedance.im.core.a.b
    public final boolean e() {
        return com.bytedance.ies.im.core.api.a.c().a();
    }

    @Override // com.bytedance.im.core.a.b
    public final String f() {
        return com.bytedance.ies.im.core.api.a.a().d();
    }

    @Override // com.bytedance.im.core.a.b
    public final boolean g() {
        return com.bytedance.ies.im.core.api.a.a().l();
    }

    @Override // com.bytedance.im.core.a.b
    public final int h() {
        return com.bytedance.ies.im.core.api.a.a().b();
    }

    @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
    public final Map<String, String> k() {
        return ag.c(g.a());
    }

    @Override // com.bytedance.im.core.a.b
    public final String c() {
        String str;
        com.bytedance.ies.im.core.api.a.c b2 = com.bytedance.ies.im.core.api.a.e().b();
        if (b2 == null || (str = b2.f33947b) == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
    public final void l() {
        if (!f34133b) {
            if (o.f66957b.get("wcdb") == null) {
                Librarian.a("wcdb", false, (Context) null);
            }
            f34133b = true;
        }
    }

    @Override // com.bytedance.im.core.a.b
    public final long a() {
        long parseLong = Long.parseLong(com.bytedance.ies.im.core.api.a.e().d());
        if (parseLong <= 0) {
            com.bytedance.ies.im.core.api.a.b().c("SDKBridge", "getUid uid invalid: " + com.bytedance.ies.im.core.api.a.e().d() + ", " + com.bytedance.ies.im.core.api.a.e().a());
        }
        return parseLong;
    }

    static final class a extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.c, z> {
        final /* synthetic */ int $inbox;
        final /* synthetic */ int $result;

        static {
            Covode.recordClassIndex(20321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, int i3) {
            super(1);
            this.$inbox = i2;
            this.$result = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.c cVar) {
            com.bytedance.ies.im.core.api.b.c cVar2 = cVar;
            l.d(cVar2, "");
            cVar2.a(this.$inbox, this.$result);
            return z.f158842a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.f.b$b  reason: collision with other inner class name */
    static final class C0753b extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.c, z> {
        final /* synthetic */ int $inbox;
        final /* synthetic */ int $reason;

        static {
            Covode.recordClassIndex(20322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0753b(int i2, int i3) {
            super(1);
            this.$inbox = i2;
            this.$reason = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.c cVar) {
            com.bytedance.ies.im.core.api.b.c cVar2 = cVar;
            l.d(cVar2, "");
            cVar2.b(this.$inbox, this.$reason);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<Response, z> {
        final /* synthetic */ com.bytedance.im.core.internal.d.a.a $callback;

        static {
            Covode.recordClassIndex(20323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.im.core.internal.d.a.a aVar) {
            super(1);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Response response) {
            Response response2 = response;
            com.bytedance.im.core.internal.d.a.a aVar = this.$callback;
            if (aVar != null) {
                c.a aVar2 = new c.a();
                aVar2.f38707a.f38703a = 200;
                aVar2.f38707a.f38706d = response2;
                aVar.a(aVar2.f38707a);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
    public final k a(String str) {
        if (!((Boolean) com.bytedance.ies.im.core.c.b.f34019b.getValue()).booleanValue() || str == null) {
            return null;
        }
        return new f(str);
    }

    @Override // com.bytedance.im.core.a.b
    public final void a(int i2) {
        com.bytedance.ies.im.core.api.a.b().c("SDKBridge", "onTokenInvalid: ".concat(String.valueOf(i2)));
        e eVar = e.f34007c;
        com.bytedance.ies.im.core.api.a.b().c("TokenManager", "onSDKTokenInvalid: " + e.c());
        eVar.f();
    }

    static final class d extends m implements h.f.a.b<u, z> {
        final /* synthetic */ com.bytedance.im.core.internal.d.a.a $callback;
        final /* synthetic */ com.bytedance.ies.im.core.api.g.a $request;

        static {
            Covode.recordClassIndex(20324);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.ies.im.core.api.g.a aVar, com.bytedance.im.core.internal.d.a.a aVar2) {
            super(1);
            this.$request = aVar;
            this.$callback = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(u uVar) {
            Throwable th;
            u uVar2 = uVar;
            com.bytedance.ies.im.core.api.a.b().c("SDKBridge", "sendHttp failed: " + this.$request.f33980a + ", " + uVar2);
            com.bytedance.im.core.internal.d.a.a aVar = this.$callback;
            if (aVar != null) {
                Throwable th2 = null;
                if (uVar2 != null) {
                    th = uVar2.f38030h;
                } else {
                    th = null;
                }
                if (!(th instanceof Exception)) {
                    th = null;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    if (uVar2 != null) {
                        th2 = uVar2.f38030h;
                    }
                    exc = new Exception(th2);
                }
                aVar.a(exc);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.im.core.a.a, com.bytedance.im.core.a.b
    public final void a(com.bytedance.im.core.internal.d.k kVar) {
        if (kVar != null) {
            kVar.k();
        }
        com.bytedance.ies.im.core.api.a.f();
    }

    @Override // com.bytedance.im.core.a.b
    public final void a(int i2, int i3) {
        com.bytedance.ies.im.core.api.a.f().a(new a(i2, i3));
    }

    @Override // com.bytedance.im.core.a.b
    public final void b(int i2, int i3) {
        com.bytedance.ies.im.core.api.a.f().a(new C0753b(i2, i3));
    }

    @Override // com.bytedance.im.core.a.b
    public final void a(com.bytedance.im.core.internal.d.a.b bVar, com.bytedance.im.core.internal.d.a.a aVar) {
        if (bVar == null) {
            com.bytedance.ies.im.core.api.a.b().c("SDKBridge", "sendHttp request null");
            return;
        }
        a.C0749a aVar2 = new a.C0749a();
        String str = bVar.f38697a;
        com.bytedance.ies.im.core.api.g.a<REQUEST_BODY> aVar3 = aVar2.f33986a;
        if (str == null) {
            str = "";
        }
        aVar3.f33980a = str;
        String str2 = bVar.f38698b;
        com.bytedance.ies.im.core.api.g.a<REQUEST_BODY> aVar4 = aVar2.f33986a;
        if (str2 == null) {
            str2 = "";
        }
        aVar4.f33981b = str2;
        String str3 = bVar.f38699c;
        l.d("Content-Type", "");
        aVar2.f33987b.put("Content-Type", str3);
        REQUEST_BODY request_body = (REQUEST_BODY) bVar.f38701e;
        l.b(request_body, "");
        aVar2.f33986a.f33984e = request_body;
        com.bytedance.ies.im.core.e.c b2 = f.b();
        com.bytedance.ttnet.d.d dVar = null;
        if (!(b2 == null || !b2.f34048a || b2.f34054g == 0)) {
            dVar = new com.bytedance.ttnet.d.d();
            dVar.f28948i = b2.f34055h;
        }
        aVar2.f33986a.f33985f = dVar;
        aVar2.f33986a.f33982c = ag.c(aVar2.f33987b);
        aVar2.f33986a.f33983d = ag.c(aVar2.f33988c);
        com.bytedance.ies.im.core.api.g.a<REQUEST_BODY> aVar5 = aVar2.f33986a;
        com.bytedance.ies.im.core.api.a.c().a(aVar5, com.bytedance.ies.im.core.api.e.a.a(new c(aVar), new d(aVar5, aVar)));
    }

    @Override // com.bytedance.im.core.a.b
    public final void a(int i2, long j2, String str, byte[] bArr) {
        boolean a2 = com.bytedance.ies.im.core.i.a.f34189a.a();
        com.bytedance.ies.im.core.api.a.b().b("SDKBridge", "send by ws: ".concat(String.valueOf(a2)));
        if (a2) {
            ArrayList arrayList = new ArrayList();
            WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
            msgHeader.f27305a = "cmd";
            msgHeader.f27306b = String.valueOf(i2);
            arrayList.add(msgHeader);
            WsChannelMsg.MsgHeader msgHeader2 = new WsChannelMsg.MsgHeader();
            msgHeader2.f27305a = "seq_id";
            msgHeader2.f27306b = String.valueOf(j2);
            arrayList.add(msgHeader2);
            WsChannelMsg wsChannelMsg = new WsChannelMsg();
            wsChannelMsg.f27299h = arrayList;
            wsChannelMsg.f27297f = 5;
            wsChannelMsg.f27295d = j2;
            wsChannelMsg.f27296e = 0;
            wsChannelMsg.f27298g = 1;
            wsChannelMsg.f27302k = bArr;
            wsChannelMsg.f27301j = "pb";
            wsChannelMsg.f27300i = str;
            com.bytedance.ies.im.core.i.a.f34189a.b(wsChannelMsg);
        }
    }
}
