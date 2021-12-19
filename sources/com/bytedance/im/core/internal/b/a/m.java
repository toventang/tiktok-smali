package com.bytedance.im.core.internal.b.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.g.b;
import com.bytedance.im.core.internal.b.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.e;
import com.bytedance.im.core.internal.utils.l;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.GetCmdMessageReqBody;
import com.bytedance.im.core.proto.GetCmdMessageRespBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.List;

public final class m extends w {

    /* renamed from: a  reason: collision with root package name */
    public int f38516a;

    /* renamed from: b  reason: collision with root package name */
    public String f38517b;

    /* renamed from: c  reason: collision with root package name */
    private int f38518c;

    static {
        Covode.recordClassIndex(23023);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    m(int i2) {
        super(IMCMD.GET_CMD_MESSAGE.getValue());
        this.f38516a = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.get_cmd_message_body == null) {
            return false;
        }
        return true;
    }

    public final void a(int i2) {
        if (!(i2 == 9 || l.a().b() == 1)) {
            b.a(5, i2);
        }
        this.f38518c = i2;
        String a2 = e.a(i2);
        if (a.f38231e.contains(Integer.valueOf(this.f38516a))) {
            f.b("imsdk", "GetCmdMsgByUserHandler pull, source:" + a2 + ", inbox:" + this.f38516a + ", already doing, return", (Throwable) null);
            return;
        }
        s.a();
        a(a2, s.c(this.f38516a));
    }

    public final boolean a(GetCmdMessageRespBody getCmdMessageRespBody) {
        long j2;
        s.a();
        long d2 = s.d(this.f38516a);
        Long l2 = getCmdMessageRespBody.next_user_message_cursor;
        long j3 = -1;
        if (l2 == null || l2.longValue() <= d2) {
            StringBuilder sb = new StringBuilder("GetCmdMsgByUserHandler updateCursor cursor invalid: cursor:");
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = -1;
            }
            f.b("imsdk", sb.append(j2).append(", local:").append(d2).toString(), (Throwable) null);
        } else {
            s.a();
            s.d(this.f38516a, l2.longValue());
        }
        s.a();
        long c2 = s.c(this.f38516a);
        Long l3 = getCmdMessageRespBody.next_cmd_index;
        if (l3 == null || l3.longValue() <= c2) {
            StringBuilder sb2 = new StringBuilder("GetCmdMsgByUserHandler updateCursor index invalid, next:");
            if (l3 != null) {
                j3 = l3.longValue();
            }
            f.b("imsdk", sb2.append(j3).append(", local:").append(c2).toString(), (Throwable) null);
            return false;
        }
        s.a();
        s.c(this.f38516a, l3.longValue());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, Runnable runnable) {
        boolean z;
        if (!kVar.l() || !a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        f.b("imsdk", "GetCmdMsgByUserHandler handleResponse, seqId:" + kVar.f38720a + ", success:" + z, (Throwable) null);
        if (!z) {
            a.h(this.f38516a);
            com.bytedance.im.core.c.e.a(kVar, false).a();
            return;
        }
        final GetCmdMessageRespBody getCmdMessageRespBody = kVar.f38725f.body.get_cmd_message_body;
        d.a(new c<Boolean>() {
            /* class com.bytedance.im.core.internal.b.a.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23024);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public Boolean a() {
                try {
                    m mVar = m.this;
                    List<MessageBody> list = getCmdMessageRespBody.messages;
                    if (!com.bytedance.im.core.internal.utils.d.a(list)) {
                        for (MessageBody messageBody : list) {
                            if (com.bytedance.im.core.i.f.a(messageBody)) {
                                com.bytedance.im.core.i.f.a().a(mVar.f38516a, messageBody);
                            } else {
                                ai.a(messageBody, false, (Pair<String, String>) null, 5);
                            }
                        }
                    }
                    return Boolean.valueOf(m.this.a(getCmdMessageRespBody));
                } catch (Exception e2) {
                    f.b("imsdk", "GetCmdMsgByUserHandler handleResponse handleCommands error", e2);
                    com.bytedance.im.core.c.e.a(e2);
                    b.a(5, e2);
                    s.a();
                    String a2 = s.a(m.this.f38516a, "error_cmd_index");
                    boolean z = true;
                    int a3 = s.f38859a.a(a2) + 1;
                    if (a3 <= 2) {
                        f.b("imsdk", "SPUtils shouldIgnoreCmdIndexError, key:" + a2 + ", errorCount:" + a3 + ", return forbid", (Throwable) null);
                        s.f38859a.a(a2, a3);
                        z = false;
                    } else {
                        f.b("imsdk", "SPUtils shouldIgnoreCmdIndexError, key:" + a2 + ", errorCount:" + a3 + ", return ignore", (Throwable) null);
                        s.f38859a.a(a2, 0);
                    }
                    if (z) {
                        return Boolean.valueOf(m.this.a(getCmdMessageRespBody));
                    }
                    f.b("imsdk", "GetCmdMsgByUserHandler handleResponse forbid update cursor", (Throwable) null);
                    return false;
                }
            }
        }, new com.bytedance.im.core.internal.e.b<Boolean>() {
            /* class com.bytedance.im.core.internal.b.a.m.AnonymousClass2 */

            static {
                Covode.recordClassIndex(23025);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                f.b("imsdk", "GetCmdMsgByUserHandler handleResponse onCallback, seqId:" + kVar.f38720a + ", result:" + bool2, (Throwable) null);
                if (!bool2.booleanValue() || !getCmdMessageRespBody.has_more.booleanValue()) {
                    a.h(m.this.f38516a);
                    com.bytedance.im.core.c.e.a(kVar, true).a();
                    return;
                }
                m mVar = m.this;
                mVar.a(mVar.f38517b, getCmdMessageRespBody.next_cmd_index.longValue());
            }
        }, com.bytedance.im.core.internal.e.a.c());
    }

    public final void a(String str, long j2) {
        f.b("imsdk", "GetCmdMsgByUserHandler pull, source:" + str + ", inbox:" + this.f38516a + ", index:" + j2, (Throwable) null);
        this.f38517b = str;
        a.g(this.f38516a);
        GetCmdMessageReqBody.Builder source = new GetCmdMessageReqBody.Builder().cmd_index(Long.valueOf(j2)).source(str);
        if (this.f38518c == 0) {
            com.bytedance.im.core.a.d.a();
        }
        a(this.f38516a, new RequestBody.Builder().get_cmd_message_body(source.build()).build(), null, new Object[0]);
    }
}
