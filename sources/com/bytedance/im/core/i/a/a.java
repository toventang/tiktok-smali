package com.bytedance.im.core.i.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.aw;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.i.g;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.j;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.proto.GetStrangerConversationListRequestBody;
import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.StrangerConversation;
import java.util.ArrayList;
import java.util.List;

public final class a extends w<List<h>> {

    /* renamed from: a  reason: collision with root package name */
    private long f38117a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f38118b;

    static {
        Covode.recordClassIndex(22834);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public a(com.bytedance.im.core.a.a.a<List<h>> aVar) {
        super(IMCMD.GET_STRANGER_CONVERSATION_LIST.getValue(), aVar);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.get_stranger_conversation_body == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        final long j2;
        final boolean z;
        int i2 = 0;
        if (!kVar.l() || !a(kVar)) {
            e.a(kVar, false).a();
            b(kVar);
            return;
        }
        GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = kVar.f38725f.body.get_stranger_conversation_body;
        final List<StrangerConversation> list = getStrangerConversationListResponseBody.conversation_list;
        if (getStrangerConversationListResponseBody.next_cursor != null) {
            j2 = getStrangerConversationListResponseBody.next_cursor.longValue();
        } else {
            j2 = -1;
        }
        if (getStrangerConversationListResponseBody.has_more == null || !getStrangerConversationListResponseBody.has_more.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        final int intValue = kVar.f38725f.inbox_type.intValue();
        if (this.f38118b) {
            if (getStrangerConversationListResponseBody.total_unread != null) {
                i2 = getStrangerConversationListResponseBody.total_unread.intValue();
            }
            f.b("imsdk", "StrangerConversationHandler get totalUnread:".concat(String.valueOf(i2)), (Throwable) null);
            com.bytedance.im.core.i.f a2 = com.bytedance.im.core.i.f.a();
            f.b("imsdk", "StrangerManager setTotalUnread:".concat(String.valueOf(i2)), (Throwable) null);
            a2.f38154d = i2;
        }
        if (list == null || list.isEmpty()) {
            f.b("imsdk", "StrangerConversationHandler handleResponse list empty", (Throwable) null);
            a(null, j2, z);
        } else {
            d.a(new c<List<h>>() {
                /* class com.bytedance.im.core.i.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22835);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ List<h> a() {
                    long j2;
                    String str;
                    ai aiVar;
                    long j3;
                    long j4;
                    long j5;
                    int i2;
                    long j6;
                    int i3;
                    long j7;
                    long j8;
                    long j9;
                    long j10;
                    ArrayList arrayList = new ArrayList();
                    f.b("imsdk", "StrangerConversationHandler saveStrangerConversation start:" + list.size(), (Throwable) null);
                    for (StrangerConversation strangerConversation : list) {
                        int i4 = intValue;
                        if (strangerConversation != null && !TextUtils.isEmpty(strangerConversation.conversation_id)) {
                            f.b("imsdk", "IMConversationDao saveStrangerConversation:" + strangerConversation.conversation_id + ", inbox:" + i4, (Throwable) null);
                            int i5 = 0;
                            h a2 = com.bytedance.im.core.internal.a.c.a(strangerConversation.conversation_id, false);
                            aw a3 = com.bytedance.im.core.internal.b.a.ai.a(strangerConversation.last_message, true, (Pair<String, String>) null, 1);
                            if (a2 == null) {
                                f.b("imsdk", "IMConversationDao strangerConversation is new, insert", (Throwable) null);
                                a2 = new h();
                                a2.setConversationId(strangerConversation.conversation_id);
                                if (strangerConversation.conversation_short_id != null) {
                                    j2 = strangerConversation.conversation_short_id.longValue();
                                } else {
                                    j2 = 0;
                                }
                                a2.setConversationShortId(j2);
                                a2.setConversationType(e.a.f37581a);
                                a2.setMemberCount(2);
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(Long.valueOf(com.bytedance.im.core.a.d.a().f37562b.a()));
                                arrayList2.add(Long.valueOf(com.bytedance.im.core.d.k.a(strangerConversation.conversation_id)));
                                a2.setMemberIds(arrayList2);
                                a2.setIsMember(true);
                                a2.setInboxType(i4);
                                MessageBody messageBody = strangerConversation.last_message;
                                if (messageBody == null) {
                                    aiVar = null;
                                } else {
                                    if (messageBody.ext == null || !messageBody.ext.containsKey("s:client_message_id") || TextUtils.isEmpty(messageBody.ext.get("s:client_message_id"))) {
                                        str = "";
                                    } else {
                                        str = messageBody.ext.get("s:client_message_id");
                                    }
                                    aiVar = new ai();
                                    aiVar.setUuid(str);
                                    if (messageBody.server_message_id != null) {
                                        j3 = messageBody.server_message_id.longValue();
                                    } else {
                                        j3 = 0;
                                    }
                                    aiVar.setMsgId(j3);
                                    aiVar.setSecSender(messageBody.sec_sender);
                                    if (messageBody.sender != null) {
                                        j4 = messageBody.sender.longValue();
                                    } else {
                                        j4 = 0;
                                    }
                                    aiVar.setSender(j4);
                                    if (messageBody.create_time != null) {
                                        j5 = messageBody.create_time.longValue();
                                    } else {
                                        j5 = 0;
                                    }
                                    aiVar.setCreatedAt(j5);
                                    if (messageBody.message_type != null) {
                                        i2 = messageBody.message_type.intValue();
                                    } else {
                                        i2 = 0;
                                    }
                                    aiVar.setMsgType(i2);
                                    aiVar.setConversationId(messageBody.conversation_id);
                                    if (messageBody.conversation_short_id != null) {
                                        j6 = messageBody.conversation_short_id.longValue();
                                    } else {
                                        j6 = 0;
                                    }
                                    aiVar.setConversationShortId(j6);
                                    if (messageBody.conversation_type != null) {
                                        i3 = messageBody.conversation_type.intValue();
                                    } else {
                                        i3 = 0;
                                    }
                                    aiVar.setConversationType(i3);
                                    aiVar.setContent(messageBody.content);
                                    if (com.bytedance.im.core.a.d.a().b().A) {
                                        aiVar = com.bytedance.im.core.internal.utils.c.b(aiVar);
                                    }
                                    aiVar.setDeleted(0);
                                    aiVar.setMsgStatus(5);
                                    if (messageBody.index_in_conversation != null) {
                                        j7 = messageBody.index_in_conversation.longValue();
                                    } else {
                                        j7 = 0;
                                    }
                                    aiVar.setIndex(j7);
                                    if (messageBody.order_in_conversation != null) {
                                        j8 = messageBody.order_in_conversation.longValue();
                                    } else {
                                        j8 = 0;
                                    }
                                    aiVar.setOrderIndex(j8);
                                    if (messageBody.index_in_conversation_v2 != null) {
                                        j9 = messageBody.index_in_conversation_v2.longValue();
                                    } else {
                                        j9 = 0;
                                    }
                                    aiVar.setIndexInConversationV2(j9);
                                    if (messageBody.status != null) {
                                        i5 = messageBody.status.intValue();
                                    }
                                    aiVar.setSvrStatus(i5);
                                    aiVar.updatePropertyFromServer(messageBody);
                                    if (messageBody.version != null) {
                                        j10 = messageBody.version.longValue();
                                    } else {
                                        j10 = 0;
                                    }
                                    aiVar.setVersion(j10);
                                    aiVar.setExt(messageBody.ext);
                                    aiVar.setReadStatus(1);
                                    aiVar.setSenderInfo(com.bytedance.im.core.internal.utils.f.a(messageBody.user_profile));
                                }
                                a2.setLastMessage(aiVar);
                                a2.setLastMessageIndex(aiVar.getIndex());
                                a2.setLastMessageOrderIndex(aiVar.getOrderIndex());
                                a2.setMaxIndexV2(aiVar.getIndexInConversationV2());
                                if (strangerConversation.badge_count != null) {
                                    a2.setBadgeCount(strangerConversation.badge_count.intValue());
                                }
                                a2.setUnreadCount((long) strangerConversation.unread.intValue());
                                a2.setUpdatedTime(aiVar.getCreatedAt());
                                a2.setHasMore(true);
                                a2.setStranger(true);
                                a2.setSingleChatMembers(com.bytedance.im.core.internal.utils.f.a(strangerConversation.conversation_id, strangerConversation.participants));
                                g.a(a2, strangerConversation);
                                if (!(a3 == null || a3.f37849a == null)) {
                                    g.a(a2, a3.f37849a);
                                }
                                com.bytedance.im.core.internal.a.c.a(a2);
                            } else {
                                f.b("imsdk", "IMConversationDao strangerConversation already exist, update", (Throwable) null);
                                g.a(a2, i.h(a2.getConversationId()));
                                a2.setUnreadCount((long) strangerConversation.unread.intValue());
                                a2.setStranger(true);
                                g.a(a2, strangerConversation);
                                com.bytedance.im.core.internal.a.c.a(a2, true);
                            }
                            arrayList.add(a2);
                        }
                    }
                    f.b("imsdk", "StrangerConversationHandler saveStrangerConversation end:" + arrayList.size(), (Throwable) null);
                    return arrayList;
                }
            }, new b<List<h>>() {
                /* class com.bytedance.im.core.i.a.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(22836);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* bridge */ /* synthetic */ void a(List<h> list) {
                    a.this.a(list, j2, z);
                }
            });
        }
        com.bytedance.im.core.c.e.a(kVar, true).a();
    }

    public final void a(int i2, long j2, long j3, boolean z) {
        f.b("imsdk", "StrangerConversationHandler get, inbox:" + i2 + ", cursor:" + j2 + ", count:" + j3 + ", needTotalUnread:" + z, (Throwable) null);
        if (j3 <= 0) {
            j3 = 20;
        }
        this.f38117a = j2;
        this.f38118b = z;
        a(i2, new RequestBody.Builder().get_stranger_conversation_body(new GetStrangerConversationListRequestBody.Builder().count(Long.valueOf(j3)).cursor(Long.valueOf(j2)).show_total_unread(Boolean.valueOf(z)).build()).build(), (j) null, new Object[0]);
    }
}
