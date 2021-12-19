package com.ss.android.ugc.aweme.im.sdk.chat.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f100108a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(63806);
    }

    static final /* synthetic */ class c extends j implements h.f.a.b<Map<String, ? extends String>, z> {
        static {
            Covode.recordClassIndex(63809);
        }

        c(e eVar) {
            super(1, eVar, e.class, "monitorMsgSendStatus", "monitorMsgSendStatus(Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.ugc.aweme.im.service.e */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, ? extends String> map) {
            Map<String, ? extends String> map2 = map;
            l.d(map2, "");
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().monitorMsgSendStatus(map2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f100109a = new a();

        static {
            Covode.recordClassIndex(63807);
        }

        a() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100110a = new b();

        static {
            Covode.recordClassIndex(63808);
        }

        b() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    static final /* synthetic */ class d extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f100111a = new d();

        static {
            Covode.recordClassIndex(63810);
        }

        d() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static void a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_type", str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        r.onEvent(MobClick.obtain().setEventName("enter_chat").setLabelName("message").setValue(str).setJsonObject(jSONObject));
    }

    public static /* synthetic */ void a(com.ss.android.ugc.aweme.im.service.model.a aVar, String str, int i2) {
        String a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a();
        com.bytedance.ies.im.core.api.b.a a3 = a.C0745a.a();
        b bVar = b.f100110a;
        String str2 = "";
        l.d(aVar, str2);
        l.d(str, str2);
        l.d(a2, str2);
        l.d(a3, str2);
        l.d(bVar, str2);
        androidx.c.a aVar2 = new androidx.c.a();
        String groupId = aVar.getGroupId();
        if (groupId == null) {
            groupId = str2;
        }
        aVar2.put("group_id", groupId);
        aVar2.put("follow_status", String.valueOf(aVar.getFollowStatus()));
        String storyType = aVar.getStoryType();
        if (storyType == null) {
            storyType = str2;
        }
        aVar2.put("story_type", storyType);
        String storyCollectionId = aVar.getStoryCollectionId();
        if (storyCollectionId != null) {
            str2 = storyCollectionId;
        }
        aVar2.put("story_collection_id", str2);
        a(aVar, str, i2, a2, aVar2, a3, bVar);
    }

    public static /* synthetic */ void a(com.ss.android.ugc.aweme.im.service.model.a aVar, String str, String str2, int i2, com.bytedance.ies.im.core.api.b.a aVar2, m mVar, int i3) {
        String str3 = str2;
        int i4 = i2;
        com.bytedance.ies.im.core.api.b.a aVar3 = aVar2;
        m mVar2 = mVar;
        if ((i3 & 4) != 0) {
            str3 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a();
        }
        if ((i3 & 8) != 0) {
            i4 = -1;
        }
        if ((i3 & 16) != 0) {
            aVar3 = a.C0745a.a();
        }
        if ((i3 & 32) != 0) {
            mVar2 = a.f100109a;
        }
        l.d(aVar, "");
        l.d(str, "");
        l.d(str3, "");
        l.d(aVar3, "");
        l.d(mVar2, "");
        a(aVar, str, i4, str3, new androidx.c.a(), aVar3, mVar2);
    }

    private static void a(com.ss.android.ugc.aweme.im.service.model.a aVar, String str, int i2, String str2, Map<String, String> map, com.bytedance.ies.im.core.api.b.a aVar2, m<? super String, ? super Map<String, String>, z> mVar) {
        String userId;
        String str3;
        String sessionId = aVar.getSessionId();
        String str4 = "";
        if (sessionId == null) {
            sessionId = str4;
        }
        String enterFromForMob = aVar.getEnterFromForMob();
        if (enterFromForMob == null) {
            enterFromForMob = str4;
        }
        String enterMethodForMob = aVar.getEnterMethodForMob();
        if (enterMethodForMob == null) {
            enterMethodForMob = str4;
        }
        String enterFromSubPage = aVar.getEnterFromSubPage();
        String buttonType = aVar.getButtonType();
        map.put("conversation_id", sessionId);
        if (!l.a((Object) str, (Object) "group") && (userId = aVar.getUserId()) != null) {
            str4 = userId;
        }
        map.put("to_user_id", str4);
        map.put("chat_type", str);
        map.put("enter_method", enterMethodForMob);
        map.put("enter_from", enterFromForMob);
        if (enterFromSubPage != null) {
            map.put("sub_page", enterFromSubPage);
        }
        if (buttonType != null) {
            map.put("button_type", buttonType);
        }
        map.put("process_id", str2);
        map.put("relation_tag", String.valueOf(i2));
        if (str == "group") {
            map.put("is_master", new StringBuilder().append(com.ss.android.ugc.aweme.im.sdk.group.a.a.a.d(aVar2.a(sessionId))).toString());
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_from", enterFromForMob);
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_method", enterMethodForMob);
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("relation_tag", String.valueOf(i2));
        if (aVar.isStickyTop()) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        map.put("is_top", str3);
        map.put("unread_cnt", String.valueOf(aVar.getUnreadCount()));
        if (aVar.getUnreadCount() > 0) {
            map.put("notice_type", "number_dot");
        } else if (aVar.getHasUnreadDot()) {
            map.put("notice_type", "yellow_dot");
        }
        mVar.invoke("enter_chat", map);
    }
}
