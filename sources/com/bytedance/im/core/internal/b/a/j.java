package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.c.i;
import com.bytedance.im.core.d.bf;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.b.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody;
import com.bytedance.im.core.proto.RequestBody;

public final class j extends w<String> {

    /* renamed from: a  reason: collision with root package name */
    boolean f38483a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f38484b;

    /* renamed from: c  reason: collision with root package name */
    private long f38485c;

    /* renamed from: d  reason: collision with root package name */
    private int f38486d;

    /* renamed from: e  reason: collision with root package name */
    private int f38487e;

    /* renamed from: f  reason: collision with root package name */
    private RequestBody f38488f;

    static {
        Covode.recordClassIndex(23013);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        return true;
    }

    public j() {
        this(false, null);
    }

    /* access modifiers changed from: package-private */
    public final void a(final h hVar) {
        d.a(new c<Boolean>() {
            /* class com.bytedance.im.core.internal.b.a.j.AnonymousClass2 */

            static {
                Covode.recordClassIndex(23015);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ Boolean a() {
                return Boolean.valueOf(com.bytedance.im.core.internal.a.c.e(hVar.getConversationId()));
            }
        }, new b<Boolean>() {
            /* class com.bytedance.im.core.internal.b.a.j.AnonymousClass3 */

            static {
                Covode.recordClassIndex(23016);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(Boolean bool) {
                if (bool.booleanValue()) {
                    j.this.a(hVar.getConversationId());
                    com.bytedance.im.core.d.j.a().b(hVar);
                    return;
                }
                j.this.b(k.a(-3001));
            }
        });
    }

    public final void a(n nVar) {
        if (nVar == null) {
            f.b("imsdk", "DeleteConversationHandler retryDeleteReq, request invalid", (Throwable) null);
            return;
        }
        this.f38484b = true;
        this.f38483a = false;
        this.f38486d = nVar.retryTimes;
        this.f38485c = nVar.userDelTime;
        f.b("imsdk", "DeleteConversationHandler retryDeleteReq, cid:" + nVar.conversationId + ", retryTimes:" + this.f38486d + ", userDelTime:" + this.f38485c, (Throwable) null);
        RequestBody build = new RequestBody.Builder().delete_conversation_body(nVar.toReqBody()).build();
        a(nVar.inboxType, build, null, nVar.conversationId);
    }

    /* access modifiers changed from: package-private */
    public final void b(h hVar) {
        int inboxType = hVar.getInboxType();
        String conversationId = hVar.getConversationId();
        a.b(inboxType, conversationId);
        this.f38487e = inboxType;
        this.f38485c = System.currentTimeMillis();
        if (this.f38483a) {
            a(inboxType, new RequestBody.Builder().delete_stranger_conversation_body(new DeleteStrangerConversationRequestBody.Builder().conversation_short_id(Long.valueOf(hVar.getConversationShortId())).build()).build(), null, conversationId);
            return;
        }
        RequestBody build = new RequestBody.Builder().delete_conversation_body(new DeleteConversationRequestBody.Builder().conversation_id(conversationId).conversation_short_id(Long.valueOf(hVar.getConversationShortId())).conversation_type(Integer.valueOf(hVar.getConversationType())).last_message_index(Long.valueOf(hVar.getLastMessageIndex())).last_message_index_v2(Long.valueOf(hVar.getMaxIndexV2())).badge_count(Integer.valueOf(hVar.getBadgeCount())).build()).build();
        this.f38488f = build;
        a(inboxType, build, null, conversationId);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    j(boolean r2, com.bytedance.im.core.a.a.b<java.lang.String> r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000e
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.im.core.proto.IMCMD.DELETE_STRANGER_CONVERSATION
        L_0x0004:
            int r0 = r0.getValue()
            r1.<init>(r0, r3)
            r1.f38483a = r2
            return
        L_0x000e:
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.im.core.proto.IMCMD.MARK_CONVERSATION_DELETE
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.j.<init>(boolean, com.bytedance.im.core.a.a.b):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        String str;
        String str2;
        RequestBody requestBody;
        f.b("imsdk", "DeleteConversationHandler handleResponse, isSuccess:" + kVar.l() + ", mStranger:" + this.f38483a + ", mIsRetry:" + this.f38484b, (Throwable) null);
        String str3 = (String) kVar.f38723d[0];
        if (!this.f38483a) {
            if (kVar.l()) {
                if (bf.f37901b != null) {
                    bf.f37901b.a(str3);
                }
            } else if (!this.f38484b && (requestBody = this.f38488f) != null) {
                int i2 = this.f38487e;
                DeleteConversationRequestBody deleteConversationRequestBody = requestBody.delete_conversation_body;
                if (bf.f37901b != null) {
                    bf.f37901b.a(i2, str3, deleteConversationRequestBody);
                }
            }
        } else if (kVar.l()) {
            h a2 = com.bytedance.im.core.d.j.a().a(str3);
            if (a2 == null || a2.isTemp()) {
                b(k.a(-1017));
                return;
            }
            a(a2);
        } else {
            b(k.a(-9999));
        }
        boolean z = this.f38483a;
        boolean z2 = this.f38484b;
        int i3 = this.f38486d;
        long j2 = this.f38485c;
        boolean l2 = kVar.l();
        u a3 = u.a(kVar);
        i a4 = new i().a("im_sdk_delete_conversation").a("conversation_id", str3);
        String str4 = "1";
        if (z) {
            str = str4;
        } else {
            str = "0";
        }
        i a5 = a4.a("is_stranger", str);
        if (z2) {
            str2 = str4;
        } else {
            str2 = "0";
        }
        i a6 = a5.a("is_retry", str2).a("retry_cnt", Integer.valueOf(i3)).a("del_time", Long.valueOf(j2));
        if (!l2) {
            str4 = "0";
        }
        i a7 = a6.a("is_success", str4).a("is_net_available", Integer.valueOf(com.bytedance.im.core.a.d.a().f37562b.e() ? 1 : 0));
        if (!l2) {
            a7.a("error_code", Integer.valueOf(a3.f38023a));
            a7.a("log_id", a3.f38028f);
        }
        a7.c();
    }
}
