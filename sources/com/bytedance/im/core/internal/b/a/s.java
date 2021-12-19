package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.a;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.internal.d.j;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.f;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.IMCMD;
import java.util.ArrayList;
import java.util.List;

public final class s extends w<List<h>> {

    /* renamed from: a  reason: collision with root package name */
    public int f38557a;

    static {
        Covode.recordClassIndex(23037);
    }

    public s() {
        super(IMCMD.GET_USER_CONVERSATION_LIST.getValue());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.get_conversation_list_body == null || kVar.f38725f.body.get_conversation_list_body.list == null) {
            return false;
        }
        return true;
    }

    public s(a<List<h>> aVar, int i2) {
        super(IMCMD.GET_USER_CONVERSATION_LIST.getValue(), aVar);
        this.f38557a = 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            e.a(kVar, false).a();
            b(kVar);
            return;
        }
        final List<ConversationInfoV2> list = kVar.f38725f.body.get_conversation_list_body.list;
        final boolean booleanValue = kVar.f38725f.body.get_conversation_list_body.has_more.booleanValue();
        final long longValue = kVar.f38725f.body.get_conversation_list_body.next_cursor.longValue();
        d.a(new c<List<h>>() {
            /* class com.bytedance.im.core.internal.b.a.s.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23038);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ List<h> a() {
                int intValue;
                List list = list;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (ConversationInfoV2 conversationInfoV2 : list) {
                    h a2 = com.bytedance.im.core.internal.a.c.a(conversationInfoV2.conversation_id, true);
                    if (a2 == null) {
                        String str = conversationInfoV2.conversation_id;
                        if (conversationInfoV2.conversation_type == null) {
                            intValue = -1;
                        } else {
                            intValue = conversationInfoV2.conversation_type.intValue();
                        }
                        com.bytedance.im.core.internal.a.e.b(str, intValue, f.a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                        a2 = f.a(s.this.f38557a, (h) null, conversationInfoV2, 0);
                        com.bytedance.im.core.internal.a.c.a(a2);
                        if (conversationInfoV2.first_page_participants.has_more != null && conversationInfoV2.first_page_participants.has_more.booleanValue()) {
                            new ad(false).a(conversationInfoV2.conversation_id, 0, (j) null);
                        }
                    }
                    arrayList.add(a2);
                }
                return arrayList;
            }
        }, new b<List<h>>() {
            /* class com.bytedance.im.core.internal.b.a.s.AnonymousClass2 */

            static {
                Covode.recordClassIndex(23039);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(List<h> list) {
                List<h> list2 = list;
                e.a(kVar, true).a();
                if (list2 != null && !list2.isEmpty()) {
                    for (h hVar : list2) {
                        if (!(hVar == null || hVar.getConversationId() == null || com.bytedance.im.core.d.j.a().a(hVar.getConversationId()) != null)) {
                            com.bytedance.im.core.d.j.a().a(hVar);
                        }
                    }
                }
                s.this.a(list2, longValue, booleanValue);
            }
        });
    }
}
