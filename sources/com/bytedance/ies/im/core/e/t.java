package com.bytedance.ies.im.core.e;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.a.b;
import com.bytedance.ies.im.core.d.c;
import com.bytedance.ies.im.core.d.d;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.bd;
import com.bytedance.im.core.d.u;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public final class t implements b, com.bytedance.ies.im.core.api.j.a, com.bytedance.ies.im.core.b.b {

    /* renamed from: a  reason: collision with root package name */
    public static final t f34128a = new t();

    /* renamed from: b  reason: collision with root package name */
    private static final h f34129b = i.a((h.f.a.a) a.f34130a);

    private static LinkedList<String> a() {
        return (LinkedList) f34129b.getValue();
    }

    private t() {
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(String str) {
        b("connect event: ".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.ies.im.core.b.b
    public final void a(String str, String str2) {
        b("token changed: " + str + ", " + str2);
    }

    static final class a extends m implements h.f.a.a<LinkedList<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34130a = new a();

        static {
            Covode.recordClassIndex(20318);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinkedList<String> invoke() {
            return new LinkedList();
        }
    }

    static {
        Covode.recordClassIndex(20317);
    }

    private static com.bytedance.ies.im.core.d.b c(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return (com.bytedance.ies.im.core.d.b) dg.a(str, com.bytedance.ies.im.core.d.b.class);
        } catch (Throwable th) {
            com.bytedance.ies.im.core.api.a.b().a(th);
            return null;
        }
    }

    private static int a(ai aiVar) {
        String str;
        com.bytedance.ies.im.core.d.a content;
        com.bytedance.ies.im.core.d.b c2 = c(aiVar.getLocalExtValue("s:send_response_check_msg"));
        if (c2 == null) {
            return 0;
        }
        int checkCode = c2.getCheckCode();
        if (checkCode == 7178 || checkCode == 7181 || checkCode == 7284 || checkCode == 7523 || checkCode == 7530 || checkCode == 7274 || checkCode == 7275) {
            int msgType = aiVar.getMsgType();
            int checkCode2 = c2.getCheckCode();
            c checkMsg = c2.getCheckMsg();
            if (checkMsg == null || (content = checkMsg.getContent()) == null || (str = content.getTips()) == null || str.length() <= 0) {
                str = "self visible";
            }
            String b2 = dg.a().b(new d(msgType, checkCode2, str, aiVar.getLocalExtValue("s:log_id")));
            if (b2 == null) {
                l.b();
            }
            b("message_self_visiable", b2);
        }
        return c2.getCheckCode();
    }

    private final void b(String str) {
        MethodCollector.i(1269);
        synchronized (this) {
            try {
                if (a().size() >= 100) {
                    a().remove(0);
                }
                a().add(System.currentTimeMillis() + ":  " + str);
            } finally {
                MethodCollector.o(1269);
            }
        }
    }

    private static String a(u uVar) {
        return "IMError{" + uVar.f38023a + ", {" + uVar.f38024b + ", " + uVar.f38025c + "}, {" + uVar.f38026d + ", " + uVar.f38027e + "}, " + uVar.f38028f + '}';
    }

    private final void a(int i2) {
        List<String> g2;
        MethodCollector.i(1177);
        if (i2 != 2 || this == null) {
            MethodCollector.o(1177);
            return;
        }
        synchronized (this) {
            try {
                g2 = n.g((Collection) a());
            } catch (Throwable th) {
                MethodCollector.o(1177);
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : g2) {
            sb.append(str).append("\n");
            if (sb.length() > 800) {
                com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
                String sb2 = sb.toString();
                l.b(sb2, "");
                b2.c("IMErrorMonitor", sb2);
                sb = new StringBuilder();
            }
        }
        com.bytedance.ies.im.core.api.d.b b3 = com.bytedance.ies.im.core.api.a.b();
        String sb3 = sb.toString();
        l.b(sb3, "");
        b3.c("IMErrorMonitor", sb3);
        MethodCollector.o(1177);
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(com.bytedance.ies.im.core.api.j.b bVar) {
        l.d(bVar, "");
        b("ws state changed: ".concat(String.valueOf(bVar)));
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(WsChannelMsg wsChannelMsg, bd bdVar) {
        l.d(wsChannelMsg, "");
        l.d(wsChannelMsg, "");
    }

    private static void b(String str, String str2) {
        com.bytedance.ies.im.core.api.a.b().b("IMErrorMonitor", "feedback: " + str + ", " + str2);
        com.bytedance.ies.im.core.api.a.b().d(str, str2);
    }

    @Override // com.bytedance.ies.im.core.api.a.b
    public final void a(com.bytedance.ies.im.core.api.a.a aVar, com.bytedance.ies.im.core.api.a.c cVar) {
        String str;
        l.d(aVar, "");
        StringBuilder append = new StringBuilder("account changed: ").append(aVar).append(", ");
        if (cVar != null) {
            str = cVar.f33946a;
        } else {
            str = null;
        }
        b(append.append(str).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d5, code lost:
        if (r4 == 0) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(com.bytedance.im.core.d.ai r5, com.bytedance.im.core.d.u r6) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.im.core.e.t.a(com.bytedance.im.core.d.ai, com.bytedance.im.core.d.u):void");
    }
}
