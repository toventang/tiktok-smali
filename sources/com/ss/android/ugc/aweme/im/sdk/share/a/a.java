package com.ss.android.ugc.aweme.im.sdk.share.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.a.ag;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.v;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a */
    public static final a f103353a = new a();

    private a() {
    }

    public static void a(String str, String str2, String str3, String str4, m<? super String, ? super Map<String, String>, z> mVar) {
        l.d(str4, "");
        l.d(mVar, "");
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("message_category", str);
        aVar.put("to_user_id", str3);
        aVar.put("conversation_id", str2);
        aVar.put("from_user_id", str4);
        mVar.invoke("message_forward", aVar);
    }

    static {
        Covode.recordClassIndex(66233);
    }

    public static /* synthetic */ void a(SharePackage sharePackage) {
        c cVar = c.f103356a;
        l.d(sharePackage, "");
        l.d(cVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = sharePackage.f124595i.getString("user_type", "");
        l.b(string, "");
        linkedHashMap.put("user_type", string);
        String string2 = sharePackage.f124595i.getString("request_page", "");
        l.b(string2, "");
        linkedHashMap.put("request_page", string2);
        cVar.invoke("im_share_head_show", linkedHashMap);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.a$a */
    public static final /* synthetic */ class C2623a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final C2623a f103354a = new C2623a();

        static {
            Covode.recordClassIndex(66234);
        }

        C2623a() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final b f103355a = new b();

        static {
            Covode.recordClassIndex(66235);
        }

        b() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class c extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final c f103356a = new c();

        static {
            Covode.recordClassIndex(66236);
        }

        c() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class d extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final d f103357a = new d();

        static {
            Covode.recordClassIndex(66237);
        }

        d() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class e extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final e f103358a = new e();

        static {
            Covode.recordClassIndex(66238);
        }

        e() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static void a(SharePackage sharePackage, IMContact iMContact, m<? super String, ? super Map<String, String>, z> mVar) {
        String str;
        String str2 = "";
        l.d(sharePackage, str2);
        l.d(iMContact, str2);
        l.d(mVar, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (l.a((Object) sharePackage.f124590d, (Object) UGCMonitor.EVENT_COMMENT)) {
            linkedHashMap.put("enter_from", "comment_panel");
            if (iMContact instanceof IMUser) {
                String uid = ((IMUser) iMContact).getUid();
                l.b(uid, str2);
                str = "private";
                str2 = uid;
            } else if (iMContact instanceof IMConversation) {
                str = "group";
            } else {
                str = "other";
                str2 = "unknow";
            }
            linkedHashMap.put("chat_type", str);
            linkedHashMap.put("to_user_id", str2);
            mVar.invoke("share_head_click", linkedHashMap);
        }
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("rec_friends_on_share_panel", ag.a(v.a("panel_style", str), v.a("action_type", str2), v.a("to_user_id", str3)));
    }

    public static void a(SharePackage sharePackage, BaseContent baseContent, int i2, m<? super String, ? super Map<String, String>, z> mVar) {
        String str;
        l.d(sharePackage, "");
        l.d(mVar, "");
        String a2 = t.a(sharePackage.f124590d);
        if (a2.length() != 0) {
            if (baseContent == null) {
                str = "share";
            } else {
                str = "forward";
            }
            androidx.c.a aVar = new androidx.c.a();
            aVar.put("message_category", a2);
            aVar.put("contact_number", String.valueOf(i2));
            aVar.put("action_type", str);
            mVar.invoke("multi_send_message", aVar);
        }
    }

    public static void a(IMContact iMContact, int i2, String str, SharePackage sharePackage, boolean z, m<? super String, ? super Map<String, String>, z> mVar) {
        String str2;
        String str3;
        Bundle bundle;
        String str4 = "";
        l.d(iMContact, str4);
        l.d(str, str4);
        l.d(mVar, str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iMContact instanceof IMUser) {
            linkedHashMap.put("chat_type", "private");
            IMUser iMUser = (IMUser) iMContact;
            String recType = iMUser.getRecType();
            l.b(recType, str4);
            linkedHashMap.put("rec_type", recType);
            String uid = iMUser.getUid();
            l.b(uid, str4);
            linkedHashMap.put("to_user_id", uid);
            if (iMUser.getFriendRecType() == 1) {
                str4 = "share_link_match";
            }
            linkedHashMap.put("rec_reason", str4);
        } else if (iMContact instanceof IMConversation) {
            linkedHashMap.put("chat_type", "group");
        }
        linkedHashMap.put("rank_index", String.valueOf(i2));
        linkedHashMap.put("show_type", str);
        linkedHashMap.put("is_recent_contact", String.valueOf(iMContact.getIsRecentContact()));
        linkedHashMap.put("is_chat_list_top5", String.valueOf(iMContact.getIsRecentTop5Contact()));
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        linkedHashMap.put("is_in_group", str2);
        String str5 = null;
        if (sharePackage != null) {
            str3 = sharePackage.f124590d;
        } else {
            str3 = null;
        }
        if (l.a((Object) str3, (Object) UGCMonitor.EVENT_COMMENT)) {
            linkedHashMap.put("enter_from", "comment_panel");
        } else {
            if (!(sharePackage == null || (bundle = sharePackage.f124595i) == null)) {
                str5 = bundle.getString("enter_from");
            }
            if (l.a((Object) "publish_share_panel", (Object) str5)) {
                linkedHashMap.put("enter_from", "publish_share_panel");
            } else {
                linkedHashMap.put("enter_from", "share_panel");
            }
        }
        mVar.invoke("share_head_show", linkedHashMap);
    }
}
