package com.bytedance.im.core.internal.b.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.af;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.aw;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.d.j;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.utils.d;
import com.bytedance.im.core.internal.utils.n;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageDirection;
import com.bytedance.im.core.proto.MessageInfo;
import com.bytedance.im.core.proto.MessageStatus;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;

public final class ae extends w<af> {

    /* renamed from: a  reason: collision with root package name */
    public h f38292a;

    /* renamed from: b  reason: collision with root package name */
    public af f38293b;

    static {
        Covode.recordClassIndex(22930);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public ae() {
        this(null);
    }

    public ae(b<af> bVar) {
        super(IMCMD.GET_MESSAGE_INFO_BY_INDEX_V2_RANGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.get_message_info_by_index_v2_range_body == null) {
            return false;
        }
        return true;
    }

    public static List<ai> a(List<MessageInfo> list) {
        boolean z;
        aw a2;
        ArrayList arrayList = new ArrayList();
        if (d.a(list)) {
            f.b("imsdk", "LoadMsgByIndexV2RangeHandler saveMessage empty", (Throwable) null);
            return arrayList;
        }
        try {
            com.bytedance.im.core.internal.a.a.b.a("LoadMsgByIndexV2RangeHandler.saveMsg");
            for (MessageInfo messageInfo : list) {
                if (!(messageInfo == null || messageInfo.body == null)) {
                    if (messageInfo.status == MessageStatus.AVAILABLE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(!z || (a2 = ai.a(messageInfo.body, true, (Pair<String, String>) null, 6)) == null || a2.f37849a == null)) {
                        arrayList.add(a2.f37849a);
                    }
                }
            }
            com.bytedance.im.core.internal.a.a.b.a("LoadMsgByIndexV2RangeHandler.saveMsg", true);
        } catch (Exception e2) {
            com.bytedance.im.core.internal.a.a.b.a("LoadMsgByIndexV2RangeHandler.saveMsg", false);
            f.b("imsdk", "LoadMsgByIndexV2RangeHandler saveMsg failed", e2);
            com.bytedance.im.core.g.b.a(6, e2);
        }
        return arrayList;
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
        f.b("imsdk", "LoadMsgByIndexV2RangeHandler handleResponse, isSuccess:" + z + ", seqId:" + kVar.f38720a, (Throwable) null);
        com.bytedance.im.core.internal.e.d.a(new c<Boolean>() {
            /* class com.bytedance.im.core.internal.b.a.ae.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22931);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ Boolean a() {
                if (!z) {
                    e.a(kVar, false);
                    ae.this.f38293b.f37700g = u.a(kVar);
                    ae aeVar = ae.this;
                    aeVar.a(aeVar.f38293b);
                    return false;
                }
                GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody = kVar.f38725f.body.get_message_info_by_index_v2_range_body;
                List<ai> a2 = ae.a(getMessageInfoByIndexV2RangeResponseBody.infos);
                af afVar = ae.this.f38293b;
                Long l2 = getMessageInfoByIndexV2RangeResponseBody.next_index_in_conversation_v2;
                boolean booleanValue = getMessageInfoByIndexV2RangeResponseBody.has_more.booleanValue();
                if (!d.a(a2)) {
                    afVar.f37699f.addAll(a2);
                }
                if (!booleanValue) {
                    afVar.f37695b = true;
                }
                if (l2 == null || l2.longValue() < 0) {
                    f.b("imsdk", "LoadMsgByIndexV2RangeHandler invalid nextIndexV2:".concat(String.valueOf(l2)), (Throwable) null);
                } else if (afVar.f37694a == 1) {
                    afVar.f37698e.start = l2.longValue() + 1;
                    if (afVar.f37698e.end <= 0) {
                        afVar.f37698e.end = afVar.f37697d.end;
                    }
                    afVar.f37697d.end = l2.longValue();
                } else {
                    if (afVar.f37698e.start <= 0) {
                        afVar.f37698e.start = afVar.f37697d.start;
                    }
                    afVar.f37698e.end = l2.longValue() - 1;
                    afVar.f37697d.start = l2.longValue();
                }
                if (!getMessageInfoByIndexV2RangeResponseBody.has_more.booleanValue()) {
                    ae aeVar2 = ae.this;
                    aeVar2.a(aeVar2.f38293b);
                }
                return true;
            }
        }, new com.bytedance.im.core.internal.e.b<Boolean>() {
            /* class com.bytedance.im.core.internal.b.a.ae.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22932);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                f.b("imsdk", "LoadMsgByIndexV2RangeHandler handleResponse onCallback, isSuccess:" + bool2 + ", result:" + ae.this.f38293b, (Throwable) null);
                if (!bool2.booleanValue()) {
                    e.a(kVar, false).a();
                } else if (kVar.f38725f.body.get_message_info_by_index_v2_range_body.has_more.booleanValue()) {
                    ae aeVar = ae.this;
                    aeVar.a(aeVar.f38292a, ae.this.f38293b.f37697d.start, ae.this.f38293b.f37697d.end, ae.this.f38293b.f37694a);
                } else {
                    e.a(kVar, true).a();
                }
            }
        }, a.c());
    }

    public final void a(h hVar, long j2, long j3, int i2) {
        if (hVar == null) {
            f.b("imsdk", "LoadMsgByIndexV2RangeHandler pull, conversation null", (Throwable) null);
            a(u.a().a("conversation null").f38031a);
        } else if (hVar.isTemp() || hVar.isWaitingInfo()) {
            f.b("imsdk", "LoadMsgByIndexV2RangeHandler pull, conversation invalid, cid:" + hVar.getConversationId() + ", isTemp:" + hVar.isTemp() + "isWaitingInfo:" + hVar.isWaitingInfo(), (Throwable) null);
            a(u.a().a("conversation invalid").f38031a);
        } else if (j2 > j3) {
            f.b("imsdk", "LoadMsgByIndexV2RangeHandler pull invalid indexV2, min:" + j2 + ", max:" + j3, (Throwable) null);
            a(u.a().a("indexV2 invalid").f38031a);
        } else {
            MessageDirection a2 = n.a(i2);
            if (a2 == null) {
                f.b("imsdk", "LoadMsgByIndexV2RangeHandler pull, direction invalid:".concat(String.valueOf(i2)), (Throwable) null);
                a(u.a().a("direction invalid").f38031a);
                return;
            }
            if (this.f38293b == null) {
                this.f38293b = new af(j2, j3, i2);
            }
            if (this.f38292a == null) {
                this.f38292a = hVar;
            }
            f.b("imsdk", "LoadMsgByIndexV2RangeHandler pull start, result:" + this.f38293b, (Throwable) null);
            a(hVar.getInboxType(), new RequestBody.Builder().get_message_info_by_index_v2_range_body(new GetMessageInfoByIndexV2RangeRequestBody.Builder().conversation_id(hVar.getConversationId()).conversation_short_id(Long.valueOf(hVar.getConversationShortId())).conversation_type(Integer.valueOf(hVar.getConversationType())).min_index_in_conversation_v2(Long.valueOf(j2)).max_index_in_conversation_v2(Long.valueOf(j3)).direction(a2).build()).build(), (j) null, new Object[0]);
        }
    }

    public final void a(String str, long j2, long j3, int i2) {
        if (TextUtils.isEmpty(str)) {
            f.b("imsdk", "LoadMsgByIndexV2RangeHandler pull, invalid conversationId", (Throwable) null);
            a(u.a().a("conversationId invalid").f38031a);
            return;
        }
        h a2 = com.bytedance.im.core.d.j.a().a(str);
        if (a2 == null) {
            f.b("imsdk", "LoadMsgByIndexV2RangeHandler pull, conversation null, cid:".concat(String.valueOf(str)), (Throwable) null);
            a(u.a().a("conversation null").f38031a);
            return;
        }
        a(a2, j2, j3, i2);
    }
}
