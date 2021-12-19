package com.bytedance.im.core.internal.b.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ay;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.b.a.a.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.utils.c;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.t;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.bytedance.im.core.proto.SendMessageStatus;
import java.lang.ref.WeakReference;
import java.util.List;

public final class al extends w<ai> {

    /* renamed from: a  reason: collision with root package name */
    public final ay f38367a = new ay();

    /* renamed from: b  reason: collision with root package name */
    public ai f38368b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f38369c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f38370d;

    /* renamed from: e  reason: collision with root package name */
    private volatile a f38371e;

    static {
        Covode.recordClassIndex(22960);
    }

    al() {
        super(IMCMD.SEND_MESSAGE.getValue());
    }

    public final String c() {
        if (this.f38368b == null) {
            return "";
        }
        return "{" + this.f38368b.getUuid() + ", " + this.f38368b.getMsgStatus() + "}";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.send_message_body == null) {
            return false;
        }
        return true;
    }

    al(b<ai> bVar) {
        super(IMCMD.SEND_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void d(k kVar) {
        super.d(kVar);
        if (d.a().b().ay.enableNetworkTrace) {
            this.f38371e = new a(this.f38367a);
            a aVar = this.f38371e;
            if (d.a().b().ay.enableNetworkTrace) {
                kVar.u = aVar;
            }
        }
    }

    public final void a(ai aiVar) {
        this.f38367a.f37863k = SystemClock.uptimeMillis();
        ay ayVar = this.f38367a;
        ayVar.f37862j = ayVar.f37863k - this.f38367a.f37853a;
        h a2 = j.a().a(aiVar.getConversationId());
        if (a2 == null) {
            b(k.a(-1017));
            return;
        }
        if (d.a().b().A) {
            aiVar = c.a(aiVar);
        }
        SendMessageRequestBody.Builder builder = new SendMessageRequestBody.Builder();
        List<Long> mentionIds = aiVar.getMentionIds();
        if (mentionIds != null) {
            builder.mentioned_users(mentionIds);
        }
        ReferenceInfo referenceInfo = aiVar.getReferenceInfo();
        if (referenceInfo != null && referenceInfo.referenced_message_id.longValue() > 0) {
            builder.ref_msg_info(new ReferencedMessageInfo.Builder().referenced_message_id(referenceInfo.referenced_message_id).hint(referenceInfo.hint).root_message_id(referenceInfo.root_message_id).root_message_conv_index(referenceInfo.root_message_conv_index).build());
        }
        RequestBody build = new RequestBody.Builder().send_message_body(builder.conversation_id(aiVar.getConversationId()).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).content(aiVar.getContent()).ext(aiVar.getExt()).message_type(Integer.valueOf(aiVar.getMsgType())).ticket(a2.getTicket()).client_message_id(aiVar.getUuid()).build()).build();
        this.f38370d = a2.getInboxType();
        if (d.a().b().z) {
            String uuid = aiVar.getUuid();
            if (!TextUtils.isEmpty(uuid)) {
                com.bytedance.im.core.internal.b.a.f38239m.put(uuid, new WeakReference<>(this));
            }
        }
        a(this.f38370d, build, null, aiVar, true);
    }

    private void a(h hVar, final ai aiVar) {
        if (hVar == null) {
            b(k.a(-1017));
        } else if (TextUtils.isEmpty(hVar.getTicket())) {
            this.f38367a.f37860h = true;
            final long uptimeMillis = SystemClock.uptimeMillis();
            x.a();
            x.a(hVar.getInboxType(), hVar.getConversationId(), hVar.getConversationShortId(), hVar.getConversationType(), new b<h>() {
                /* class com.bytedance.im.core.internal.b.a.al.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(22968);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                    al.this.f38367a.f37861i = SystemClock.uptimeMillis() - uptimeMillis;
                    al.this.a(aiVar);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.a.a.b
                public final /* synthetic */ void a(h hVar) {
                    al.this.f38367a.f37861i = SystemClock.uptimeMillis() - uptimeMillis;
                    al.this.a(aiVar);
                }
            });
        } else {
            a(aiVar);
        }
    }

    public final void a(ai aiVar, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ay ayVar = this.f38367a;
        ayVar.f37856d = uptimeMillis - ayVar.f37855c;
        ay ayVar2 = this.f38367a;
        ayVar2.f37857e = uptimeMillis - ayVar2.f37853a;
        int i2 = -3001;
        if (z) {
            f.b("imsdk", "SendMsgHandler afterSaveMsg saveSuccess", (Throwable) null);
            h a2 = j.a().a(aiVar.getConversationId());
            if (a2 != null) {
                ai lastMessage = a2.getLastMessage();
                if (lastMessage != null) {
                    f.b("imsdk", "SendMsgHandler afterSaveMsg lastMsg.getIndex() = " + lastMessage.getIndex() + ",lastMsg.getOrderIndex() = " + lastMessage.getOrderIndex() + "，lastMsg.getContent()" + lastMessage.getContent(), (Throwable) null);
                }
                f.b("imsdk", "SendMsgHandler afterSaveMsg msg.getIndex() = " + aiVar.getIndex() + ",msg.getOrderIndex() = " + aiVar.getOrderIndex() + ",msg.getIndex() = " + aiVar.getContent(), (Throwable) null);
                if (lastMessage == null || lastMessage.getIndex() < aiVar.getIndex()) {
                    a2.setLastMessage(aiVar);
                    a2.setLastMessageIndex(aiVar.getIndex());
                    a2.setUpdatedTime(aiVar.getCreatedAt());
                    j.a().a(a2, 2);
                    this.f38367a.f37858f = SystemClock.uptimeMillis() - uptimeMillis;
                }
            }
            a(a2, aiVar);
        } else {
            aiVar.setMsgStatus(3);
            b(k.a(-3001));
        }
        this.f38367a.f37859g = SystemClock.uptimeMillis();
        q a3 = q.a();
        if (z) {
            i2 = e.b.f37585a;
        }
        a3.a(i2, aiVar, this.f38367a);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, Runnable runnable) {
        final boolean z;
        if (!kVar.l() || !a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        final ai aiVar = (ai) kVar.f38723d[0];
        this.f38367a.f37864l = SystemClock.uptimeMillis();
        ay ayVar = this.f38367a;
        ayVar.f37865m = ayVar.f37864l - this.f38367a.f37863k;
        this.f38369c = true;
        com.bytedance.im.core.internal.b.a.d(aiVar.getUuid());
        f.b("imsdk", "SendMsgHandler handleResponse, seqId:" + kVar.f38720a + ", isSuccess:" + z + ", msg_uuid:" + aiVar.getUuid() + ", push_msg:" + c(), (Throwable) null);
        com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<ai>() {
            /* class com.bytedance.im.core.internal.b.a.al.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22961);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ ai a() {
                al.this.f38367a.v = kVar.n;
                al.this.f38367a.n = SystemClock.uptimeMillis() - al.this.f38367a.f37864l;
                ai a2 = t.a().a(aiVar.getUuid());
                if (a2 == null && (a2 = i.c(aiVar.getUuid())) == null) {
                    a2 = aiVar;
                }
                f.b("imsdk", "SendMsgHandler handleResponse task onRun, seqId:" + kVar.f38720a + ", msg_uuid:" + a2.getUuid() + ", push_msg:" + al.this.c(), (Throwable) null);
                if (z) {
                    SendMessageResponseBody sendMessageResponseBody = kVar.f38725f.body.send_message_body;
                    if (sendMessageResponseBody.status != null) {
                        a2.addLocalExt("s:send_response_extra_code", String.valueOf(sendMessageResponseBody.status));
                    }
                    if (!TextUtils.isEmpty(sendMessageResponseBody.filtered_content)) {
                        a2.setContent(sendMessageResponseBody.filtered_content);
                    }
                    al.a(a2, "s:send_response_extra_msg", sendMessageResponseBody.extra_info);
                    al.a(a2, "s:send_response_check_code", sendMessageResponseBody.check_code);
                    al.a(a2, "s:send_response_check_msg", sendMessageResponseBody.check_message);
                    if (sendMessageResponseBody.is_async_send != null && sendMessageResponseBody.is_async_send.booleanValue()) {
                        al.this.f38367a.x = true;
                        String uuid = a2.getUuid();
                        if (!TextUtils.isEmpty(uuid)) {
                            com.bytedance.im.core.internal.b.a.n.add(uuid);
                        }
                    }
                    if (sendMessageResponseBody.status == null || !(sendMessageResponseBody.status.intValue() == SendMessageStatus.SEND_SUCCEED.getValue() || sendMessageResponseBody.status.intValue() == SendMessageStatus.CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE.getValue())) {
                        a2.setMsgStatus(3);
                        a2.addLocalExt("s:err_code", new StringBuilder().append(kVar.f38728i).toString());
                        a2.addLocalExt("s:err_msg", kVar.m());
                    } else {
                        a2.setMsgStatus(2);
                        if (sendMessageResponseBody.server_message_id != null && sendMessageResponseBody.server_message_id.longValue() >= a2.getMsgId()) {
                            a2.setMsgId(sendMessageResponseBody.server_message_id.longValue());
                        }
                        a2.clearLocalExt("s:err_code");
                        a2.clearLocalExt("s:err_msg");
                    }
                } else {
                    if (al.this.f38368b != null) {
                        a2 = al.this.f38368b;
                        a2.setMsgStatus(2);
                        al.this.f38367a.u = true;
                        f.b("imsdk", "SendMsgHandler handleResponse use push msg", (Throwable) null);
                    } else {
                        a2.setMsgStatus(3);
                    }
                    a2.addLocalExt("s:err_code", new StringBuilder().append(kVar.f38728i).toString());
                    a2.addLocalExt("s:err_msg", kVar.m());
                }
                t a3 = t.a();
                if (!TextUtils.isEmpty(a2.getUuid())) {
                    f.b("imsdk", "SendMsgCache updateMsg, uuid:" + a2.getUuid() + ", opt:" + t.b(), (Throwable) null);
                    if (!t.b()) {
                        i.a(a2, false, false);
                    } else {
                        a3.f38865a.put(a2.getUuid(), a2);
                        com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<Boolean>(a2) {
                            /* class com.bytedance.im.core.internal.utils.t.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ ai f38866a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ boolean f38867b = false;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ boolean f38868c = false;

                            static {
                                Covode.recordClassIndex(23170);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.im.core.internal.e.c
                            public final /* synthetic */ Boolean a() {
                                f.b("imsdk", "SendMsgCache updateMsg onRun start, uuid:" + this.f38866a.getUuid(), (Throwable) null);
                                boolean a2 = i.a(this.f38866a, this.f38867b, this.f38868c);
                                f.b("imsdk", "SendMsgCache updateMsg onRun end, uuid:" + this.f38866a.getUuid() + ", result:" + a2, (Throwable) null);
                                return Boolean.valueOf(a2);
                            }

                            {
                                this.f38866a = r3;
                            }
                        }, null, com.bytedance.im.core.internal.e.a.c());
                    }
                }
                com.bytedance.im.core.c.d dVar = new com.bytedance.im.core.c.d();
                dVar.f37623a = "core";
                dVar.f37624b = "send_insert";
                dVar.a("duration", Long.valueOf(SystemClock.uptimeMillis() - kVar.f38729j)).a("create_time", Long.valueOf(a2.getCreatedAt())).a("conversation_id", a2.getConversationId()).a("message_type", Integer.valueOf(a2.getMsgType())).a("message_uuid", a2.getUuid()).a();
                return a2;
            }
        }, new com.bytedance.im.core.internal.e.b<ai>() {
            /* class com.bytedance.im.core.internal.b.a.al.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22962);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v0 */
            /* JADX WARN: Type inference failed for: r10v1, types: [int, boolean] */
            /* JADX WARN: Type inference failed for: r10v2 */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0150  */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.im.core.internal.e.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void a(com.bytedance.im.core.d.ai r18) {
                /*
                // Method dump skipped, instructions count: 971
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.al.AnonymousClass2.a(java.lang.Object):void");
            }
        }, com.bytedance.im.core.internal.e.a.c());
    }

    static void a(ai aiVar, String str, Object obj) {
        if (obj != null) {
            aiVar.addLocalExt(str, String.valueOf(obj));
        } else {
            aiVar.clearLocalExt(str);
        }
    }
}
