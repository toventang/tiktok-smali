package com.bytedance.im.core.internal.b.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.internal.b.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.f;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class p extends w {

    /* renamed from: a  reason: collision with root package name */
    public boolean f38542a;

    /* renamed from: b  reason: collision with root package name */
    public List<h> f38543b;

    static {
        Covode.recordClassIndex(23031);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    private p() {
        this(false);
    }

    private p(boolean z) {
        super(IMCMD.GET_CONVERSATION_INFO_LIST_V2.getValue());
        this.f38542a = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.get_conversation_info_list_v2_body == null || kVar.f38725f.body.get_conversation_info_list_v2_body.conversation_info_list == null) {
            return false;
        }
        return true;
    }

    private void a(final int i2, final Map<String, MessageBody> map) {
        Set<String> keySet;
        if (map != null && !map.isEmpty()) {
            if (this.f38542a && (keySet = map.keySet()) != null && !keySet.isEmpty()) {
                if (a.f38236j.get(Integer.valueOf(i2)) == null) {
                    a.f38236j.put(Integer.valueOf(i2), new ArrayList(keySet));
                } else {
                    a.f38236j.get(Integer.valueOf(i2)).addAll(keySet);
                }
            }
            com.bytedance.im.core.internal.e.a.a().execute(new Runnable() {
                /* class com.bytedance.im.core.internal.b.a.p.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(23034);
                }

                public final void run() {
                    p.this.f38543b = new ArrayList();
                    for (MessageBody messageBody : map.values()) {
                        h a2 = o.a(i2, messageBody);
                        if (a2 != null) {
                            p.this.f38543b.add(a2);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (MessageBody messageBody2 : map.values()) {
                        arrayList.add(new GetConversationInfoV2RequestBody.Builder().conversation_id(messageBody2.conversation_id).conversation_short_id(messageBody2.conversation_short_id).conversation_type(messageBody2.conversation_type).build());
                    }
                    RequestBody build = new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build();
                    p.this.a(i2, build, null, map);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, Runnable runnable) {
        List<h> list;
        final int intValue = kVar.f38724e.inbox_type.intValue();
        final Map map = (Map) kVar.f38723d[0];
        if (!kVar.l() || !a(kVar)) {
            a.a(intValue);
            e.a(kVar, false).a();
            if (kVar.f38728i == -1000 && (list = this.f38543b) != null && !list.isEmpty()) {
                j.a().a(false, 6, (h[]) this.f38543b.toArray(new h[0]));
            }
            if (this.f38542a && map != null) {
                a.a(intValue, map.keySet());
                return;
            }
            return;
        }
        final HashSet hashSet = new HashSet();
        d.a(new c<List<Pair<Pair<h, Boolean>, List<ah>>>>() {
            /* class com.bytedance.im.core.internal.b.a.p.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23032);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ List<Pair<Pair<h, Boolean>, List<ah>>> a() {
                Pair<h, Boolean> a2;
                List<ConversationInfoV2> list = kVar.f38725f.body.get_conversation_info_list_v2_body.conversation_info_list;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (ConversationInfoV2 conversationInfoV2 : list) {
                    MessageBody messageBody = (MessageBody) map.get(conversationInfoV2.conversation_id);
                    if (!(messageBody == null || (a2 = o.a(intValue, messageBody.create_time.longValue(), conversationInfoV2)) == null || a2.first == null)) {
                        arrayList.add(new Pair(a2, conversationInfoV2.first_page_participants != null ? f.a(((h) a2.first).getConversationId(), conversationInfoV2.first_page_participants.participants) : null));
                        if (!(conversationInfoV2.first_page_participants == null || conversationInfoV2.first_page_participants.has_more == null || !conversationInfoV2.first_page_participants.has_more.booleanValue())) {
                            hashSet.add(conversationInfoV2.conversation_id);
                        }
                    }
                }
                return arrayList;
            }
        }, new b<List<Pair<Pair<h, Boolean>, List<ah>>>>() {
            /* class com.bytedance.im.core.internal.b.a.p.AnonymousClass2 */

            static {
                Covode.recordClassIndex(23033);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(List<Pair<Pair<h, Boolean>, List<ah>>> list) {
                Map map;
                List<Pair<Pair<h, Boolean>, List<ah>>> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Pair<Pair<h, Boolean>, List<ah>> pair : list2) {
                        arrayList.add(((Pair) pair.first).first);
                        if (hashSet.contains(((h) ((Pair) pair.first).first).getConversationId())) {
                            new ad().a(((h) ((Pair) pair.first).first).getConversationId(), 0, (com.bytedance.im.core.internal.d.j) null);
                        } else {
                            j.a().a(((h) ((Pair) pair.first).first).getConversationId(), (List) pair.second);
                        }
                    }
                    j.a().a(true, 5, (h[]) arrayList.toArray(new h[arrayList.size()]));
                }
                e.a(kVar, true).a();
                a.a(intValue);
                if (p.this.f38542a && (map = map) != null) {
                    a.a(intValue, map.keySet());
                }
            }
        });
    }

    public static void a(int i2, Map<String, MessageBody> map, boolean z) {
        if (!(map == null || map.isEmpty())) {
            while (true) {
                HashMap hashMap = null;
                for (String str : map.keySet()) {
                    MessageBody messageBody = map.get(str);
                    if (messageBody != null) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(str, messageBody);
                        if (hashMap.size() == 50) {
                            new p(z).a(i2, hashMap);
                        }
                    }
                }
                new p(z).a(i2, hashMap);
                return;
            }
        }
    }
}
