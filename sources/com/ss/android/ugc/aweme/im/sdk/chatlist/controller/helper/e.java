package com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity;
import com.ss.android.ugc.aweme.im.service.model.a;
import h.f.a.b;
import h.f.a.q;
import h.f.b.l;
import h.z;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final b<a, Boolean> f101907a;

    /* renamed from: b  reason: collision with root package name */
    private final q<Activity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b, Integer, z> f101908b;

    static {
        Covode.recordClassIndex(65208);
    }

    public /* synthetic */ e() {
        this(new b<a, Boolean>(ChatRoomActivity.f101148c) {
            /* class com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(65209);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(a aVar) {
                a aVar2 = aVar;
                l.d(aVar2, "");
                return Boolean.valueOf(ChatRoomActivity.a.a(aVar2));
            }
        }, new q<Activity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b, Integer, z>(GroupChatDetailActivity.f101590b) {
            /* class com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(65210);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ z invoke(Activity activity, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar, Integer num) {
                Activity activity2 = activity;
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar2 = bVar;
                int intValue = num.intValue();
                l.d(activity2, "");
                l.d(bVar2, "");
                GroupChatDetailActivity.a.a(activity2, bVar2, intValue);
                return z.f158842a;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.service.model.a, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.q<? super android.app.Activity, ? super com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private e(b<? super a, Boolean> bVar, q<? super Activity, ? super com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b, ? super Integer, z> qVar) {
        l.d(bVar, "");
        l.d(qVar, "");
        this.f101907a = bVar;
        this.f101908b = qVar;
    }

    public final void a(Activity activity, SessionListNavArg sessionListNavArg) {
        String str = "";
        l.d(activity, str);
        if (sessionListNavArg != null && sessionListNavArg.getConversationId() != null) {
            Integer messagePreviewEnabled = sessionListNavArg.getMessagePreviewEnabled();
            if (messagePreviewEnabled == null || messagePreviewEnabled.intValue() != 0) {
                Integer isGroupMemberRequest = sessionListNavArg.isGroupMemberRequest();
                if (isGroupMemberRequest != null && isGroupMemberRequest.intValue() == 1) {
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b();
                    String conversationId = sessionListNavArg.getConversationId();
                    if (conversationId != null) {
                        str = conversationId;
                    }
                    bVar.setConversationId(str);
                    bVar.setEnterFromForMob(sessionListNavArg.getEnterFrom());
                    this.f101908b.invoke(activity, bVar, 16);
                    return;
                }
                Integer chatType = sessionListNavArg.getChatType();
                if (chatType != null) {
                    if (chatType.intValue() == 0) {
                        this.f101907a.invoke(a.b.a(activity, 0, sessionListNavArg.getConversationId()).c(sessionListNavArg.getEnterFrom()).a().f103883a);
                    } else if (chatType.intValue() == 1) {
                        this.f101907a.invoke(a.b.a(activity, 3, sessionListNavArg.getConversationId()).c(sessionListNavArg.getEnterFrom()).a().f103883a);
                    }
                }
            }
        }
    }
}
