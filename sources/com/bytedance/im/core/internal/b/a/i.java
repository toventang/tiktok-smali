package com.bytedance.im.core.internal.b.a;

import android.content.ContentValues;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.m;
import com.bytedance.im.core.i.g;
import com.bytedance.im.core.internal.a.b.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.f;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.RequestBody;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class i extends w<h> {

    /* renamed from: a  reason: collision with root package name */
    public final m f38475a = new m();

    static {
        Covode.recordClassIndex(23010);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    i() {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue());
    }

    public i(b<h> bVar) {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.create_conversation_v2_body == null || kVar.f38725f.body.create_conversation_v2_body.status == null || kVar.f38725f.body.create_conversation_v2_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || kVar.f38725f.body.create_conversation_v2_body.conversation == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, final Runnable runnable) {
        this.f38475a.f38014c = SystemClock.uptimeMillis();
        m mVar = this.f38475a;
        mVar.f38015d = mVar.f38014c - this.f38475a.f38013b;
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
            runnable.run();
            e.a(kVar, false).a();
            return;
        }
        final CreateConversationV2ResponseBody createConversationV2ResponseBody = kVar.f38725f.body.create_conversation_v2_body;
        d.a(new c<h>() {
            /* class com.bytedance.im.core.internal.b.a.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23011);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public h a() {
                boolean z;
                int i2;
                boolean z2;
                i.this.f38475a.f38017f = SystemClock.uptimeMillis();
                i.this.f38475a.f38016e = i.this.f38475a.f38017f - i.this.f38475a.f38014c;
                h hVar = null;
                try {
                    com.bytedance.im.core.internal.a.a.b.a("CreateConversationHandler saveConversation");
                    h a2 = com.bytedance.im.core.internal.a.c.a(createConversationV2ResponseBody.conversation.conversation_id, true);
                    if (a2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = createConversationV2ResponseBody.conversation.conversation_id;
                    if (createConversationV2ResponseBody.conversation.conversation_type == null) {
                        i2 = -1;
                    } else {
                        i2 = createConversationV2ResponseBody.conversation.conversation_type.intValue();
                    }
                    com.bytedance.im.core.internal.a.e.a(str, i2, f.a(createConversationV2ResponseBody.conversation.conversation_id, createConversationV2ResponseBody.conversation.first_page_participants.participants));
                    h a3 = f.a(kVar.f38725f.inbox_type.intValue(), a2, createConversationV2ResponseBody.conversation, System.currentTimeMillis());
                    a3.setUpdatedTime(System.currentTimeMillis());
                    g.a(a3);
                    if (z) {
                        z2 = com.bytedance.im.core.internal.a.c.a(a3, true);
                    } else if (TextUtils.isEmpty(a3.getConversationId())) {
                        z2 = false;
                    } else {
                        j.c("IMConversationDao insertConversation:" + a3.getConversationId());
                        long currentTimeMillis = System.currentTimeMillis();
                        ContentValues f2 = com.bytedance.im.core.internal.a.c.f(a3);
                        if (a3.getCoreInfo() != null) {
                            com.bytedance.im.core.internal.a.b.a(a3.getCoreInfo());
                        }
                        if (a3.getSettingInfo() != null) {
                            com.bytedance.im.core.internal.a.g.a(a3.getSettingInfo());
                        }
                        if (com.bytedance.im.core.internal.a.a.b.b("conversation_list", f2) >= 0) {
                            z2 = true;
                            a.a();
                            com.bytedance.im.core.a.d.a();
                        } else {
                            z2 = false;
                        }
                        com.bytedance.im.core.g.c.a().a("insertConversation", currentTimeMillis);
                    }
                    com.bytedance.im.core.c.f.b("imsdk", "CreateConversationHandler hasLocal = " + z + " result = " + z2, (Throwable) null);
                    com.bytedance.im.core.internal.a.a.b.a("CreateConversationHandler saveConversation", true);
                    if (z2) {
                        hVar = a3;
                    }
                } catch (Exception e2) {
                    com.bytedance.im.core.c.f.b("imsdk", "CreateConversationHandler saveConversation", e2);
                    com.bytedance.im.core.internal.a.a.b.a("CreateConversationHandler saveConversation", false);
                }
                i.this.f38475a.f38018g = SystemClock.uptimeMillis();
                i.this.f38475a.f38019h = i.this.f38475a.f38018g - i.this.f38475a.f38017f;
                return hVar;
            }
        }, new com.bytedance.im.core.internal.e.b<h>() {
            /* class com.bytedance.im.core.internal.b.a.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(23012);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(h hVar) {
                h hVar2 = hVar;
                i.this.f38475a.f38021j = SystemClock.uptimeMillis();
                i.this.f38475a.f38020i = i.this.f38475a.f38021j - i.this.f38475a.f38018g;
                i.this.f38475a.f38022k = i.this.f38475a.f38021j - i.this.f38475a.f38012a;
                if (hVar2 != null) {
                    com.bytedance.im.core.d.j.a().c(hVar2);
                    i.this.a(hVar2, kVar);
                } else {
                    i.this.b(k.a(-3001));
                }
                runnable.run();
                e.a(kVar, true).a("conversation_id", createConversationV2ResponseBody.conversation.conversation_id).a("conversation_type", createConversationV2ResponseBody.conversation.conversation_type).a("total_count", createConversationV2ResponseBody.conversation.participants_count).a();
                com.bytedance.im.core.c.d dVar = new com.bytedance.im.core.c.d();
                dVar.f37623a = "cost";
                dVar.f37624b = "create_conversation";
                dVar.a("network_time", Long.valueOf(i.this.f38475a.f38015d)).a("sub_ts_time", Long.valueOf(i.this.f38475a.f38016e)).a("on_run_time", Long.valueOf(i.this.f38475a.f38019h)).a("main_ts_time", Long.valueOf(i.this.f38475a.f38020i)).a("whole_time", Long.valueOf(i.this.f38475a.f38022k)).a();
            }
        });
    }

    public final long a(int i2, int i3, List<Long> list, Map<String, String> map) {
        return a(i2, i3, list, null, map, null);
    }

    private long a(int i2, int i3, List<Long> list, String str, Map<String, String> map, com.bytedance.im.core.internal.d.j jVar) {
        String uuid;
        CreateConversationV2RequestBody build;
        this.f38475a.f38012a = SystemClock.uptimeMillis();
        if (list.contains(-1L)) {
            b(k.a(-1015));
            return -1;
        }
        CreateConversationV2RequestBody.Builder participants = new CreateConversationV2RequestBody.Builder().conversation_type(Integer.valueOf(i3)).participants(list);
        if (map != null) {
            participants.biz_ext(map);
        }
        if (!TextUtils.isEmpty(null)) {
            participants.name(null);
        }
        if (!TextUtils.isEmpty(null)) {
            participants.avatar_url(null);
        }
        if (!TextUtils.isEmpty(null)) {
            participants.description(null);
        }
        if (i3 == e.a.f37581a) {
            build = participants.build();
        } else {
            boolean z = !TextUtils.isEmpty(null);
            CreateConversationV2RequestBody.Builder persistent = participants.persistent(Boolean.valueOf(z));
            if (z) {
                uuid = null;
            } else {
                uuid = UUID.randomUUID().toString();
            }
            build = persistent.idempotent_id(uuid).build();
        }
        RequestBody build2 = new RequestBody.Builder().create_conversation_v2_body(build).build();
        this.f38475a.f38013b = SystemClock.uptimeMillis();
        return a(i2, build2, (com.bytedance.im.core.internal.d.j) null, new Object[0]);
    }
}
