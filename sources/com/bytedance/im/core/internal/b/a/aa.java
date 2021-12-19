package com.bytedance.im.core.internal.b.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ab;
import com.bytedance.im.core.d.ac;
import com.bytedance.im.core.d.ad;
import com.bytedance.im.core.d.ap;
import com.bytedance.im.core.d.aw;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.utils.d;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageDirection;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.List;

public final class aa extends w<ac> {

    /* renamed from: a  reason: collision with root package name */
    public ac f38257a = new ac();

    /* renamed from: b  reason: collision with root package name */
    long f38258b;

    /* renamed from: c  reason: collision with root package name */
    public String f38259c;

    /* renamed from: d  reason: collision with root package name */
    private int f38260d;

    static {
        Covode.recordClassIndex(22916);
    }

    public aa(b<ac> bVar) {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue(), bVar);
        s.a();
        this.f38258b = s.d();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.messages_in_conversation_body == null) {
            return false;
        }
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
        f.b("imsdk", "LeakMsgRepairToOldHandler handleResponse, isSuccess:".concat(String.valueOf(z)), (Throwable) null);
        if (!z) {
            this.f38257a.f37687h = u.a(kVar);
            a(this.f38257a);
            return;
        }
        final List<MessageBody> list = kVar.f38725f.body.messages_in_conversation_body.messages;
        if (d.a(list)) {
            this.f38257a.f37680a = true;
            a(this.f38257a);
            return;
        }
        com.bytedance.im.core.internal.e.d.a(new c<Boolean>() {
            /* class com.bytedance.im.core.internal.b.a.aa.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22917);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public Boolean a() {
                boolean z;
                try {
                    com.bytedance.im.core.internal.a.a.b.a("LeakMsgRepairToOldHandler.handleResponse()");
                    aa aaVar = aa.this;
                    List<MessageBody> list = list;
                    f.b("imsdk", "LeakMsgRepairToOldHandler repair start, cid:" + aaVar.f38259c + ", messages:" + list.size(), (Throwable) null);
                    ap apVar = new ap(Long.MAX_VALUE, Long.MIN_VALUE);
                    long g2 = i.g(aaVar.f38259c);
                    boolean z2 = false;
                    boolean z3 = false;
                    for (MessageBody messageBody : list) {
                        long longValue = messageBody.index_in_conversation_v2.longValue();
                        long longValue2 = messageBody.order_in_conversation.longValue();
                        if (longValue >= aaVar.f38258b) {
                            apVar.start = Math.min(apVar.start, longValue);
                            apVar.end = Math.max(apVar.end, longValue);
                        }
                        if (longValue <= aaVar.f38258b || longValue2 <= g2) {
                            z2 = true;
                        }
                        aaVar.f38257a.f37684e++;
                        aw a2 = ai.a(messageBody, true, (Pair<String, String>) null, 1);
                        if (!(a2 == null || a2.f37849a == null)) {
                            aaVar.f38257a.f37685f++;
                            if (a2.f37850b) {
                                aaVar.f38257a.f37686g++;
                            } else {
                                z3 = true;
                            }
                        }
                    }
                    f.b("imsdk", "LeakMsgRepairToOldHandler repair end, cid:" + aaVar.f38259c + ", reachBase:" + z2 + ", reachLocal:" + z3 + ", range:" + apVar, (Throwable) null);
                    if (!z2) {
                        if (!z3) {
                            if (apVar.isValid()) {
                                ab.a(aaVar.f38259c, apVar);
                            }
                            aaVar.f38257a.f37681b = z2;
                            aaVar.f38257a.f37682c = z3;
                            ac acVar = aaVar.f38257a;
                            acVar.f37688i.add(apVar.copy());
                            acVar.f37689j.merge(apVar.copy());
                            if (!z2 || z3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            com.bytedance.im.core.internal.a.a.b.a("LeakMsgRepairToOldHandler.handleResponse()", true);
                            return Boolean.valueOf(z);
                        }
                    }
                    List<ap> list2 = ad.a(aaVar.f38259c).copy().ranges;
                    long j2 = aaVar.f38258b;
                    if (!d.a(list2)) {
                        j2 = list2.get(0).start;
                    } else if (apVar.end > aaVar.f38258b) {
                        j2 = apVar.end;
                    }
                    ab.a(aaVar.f38259c, new ap(aaVar.f38258b, j2));
                    aaVar.f38257a.f37681b = z2;
                    aaVar.f38257a.f37682c = z3;
                    ac acVar2 = aaVar.f38257a;
                    acVar2.f37688i.add(apVar.copy());
                    acVar2.f37689j.merge(apVar.copy());
                    if (!z2) {
                    }
                    z = true;
                    com.bytedance.im.core.internal.a.a.b.a("LeakMsgRepairToOldHandler.handleResponse()", true);
                    return Boolean.valueOf(z);
                } catch (Exception e2) {
                    f.b("imsdk", "LeakMsgRepairToOldHandler handleResponse repair error", e2);
                    com.bytedance.im.core.internal.a.a.b.a("LeakMsgRepairToOldHandler.handleResponse()", false);
                    e.a(e2);
                    return false;
                }
            }
        }, new com.bytedance.im.core.internal.e.b<Boolean>() {
            /* class com.bytedance.im.core.internal.b.a.aa.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22918);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                f.b("imsdk", "LeakMsgRepairToOldHandler handleResponse onCallback, result:".concat(String.valueOf(bool2)), (Throwable) null);
                if (bool2.booleanValue() || !kVar.f38725f.body.messages_in_conversation_body.has_more.booleanValue()) {
                    aa.this.f38257a.f37680a = true;
                    aa aaVar = aa.this;
                    aaVar.a(aaVar.f38257a);
                    return;
                }
                aa aaVar2 = aa.this;
                aaVar2.a(aaVar2.f38259c, kVar.f38725f.body.messages_in_conversation_body.next_cursor.longValue());
            }
        }, a.a());
    }

    public final void a(String str, long j2) {
        if (TextUtils.isEmpty(str) || j2 <= 0) {
            this.f38257a.f37687h = u.a().a("invalid cid or anchorIndex, cid:" + str + ", anchorIndex:" + j2).f38031a;
            a(this.f38257a);
            return;
        }
        h a2 = j.a().a(str);
        if (a2 == null || a2.isTemp() || a2.isLocal()) {
            this.f38257a.f37687h = u.a().a("invalid conversation, cid:".concat(String.valueOf(str))).f38031a;
            a(this.f38257a);
            return;
        }
        int i2 = this.f38260d;
        if (i2 >= 10) {
            f.b("imsdk", "LeakMsgRepairToOldHandler pull to many times, cid:".concat(String.valueOf(str)), (Throwable) null);
            a(this.f38257a);
            return;
        }
        int i3 = i2 + 1;
        this.f38260d = i3;
        this.f38257a.f37683d = i3;
        this.f38259c = str;
        RequestBody build = new RequestBody.Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(a2.getConversationId()).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(j2)).build()).build();
        a(a2.getInboxType(), build, null, a2.getConversationId());
    }
}
