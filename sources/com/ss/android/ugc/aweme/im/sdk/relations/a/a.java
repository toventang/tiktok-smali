package com.ss.android.ugc.aweme.im.sdk.relations.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.et;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a */
    public static final a f102956a = new a();

    private a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03ae A[Catch:{ JSONException -> 0x03f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0470 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0487 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04a8 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04b7 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0513 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0560 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0571 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0582 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05a8 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x05be A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x05c0 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0659 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x065b A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0663 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0674 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0685 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0696 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x06a5 A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x06ab A[Catch:{ JSONException -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06f4 A[Catch:{ JSONException -> 0x0826 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x070b A[Catch:{ JSONException -> 0x0826 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0720 A[Catch:{ JSONException -> 0x0826 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x076b A[Catch:{ JSONException -> 0x0826 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x077e A[Catch:{ JSONException -> 0x0826 }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x07a4 A[Catch:{ JSONException -> 0x0826 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x07db A[Catch:{ JSONException -> 0x0826 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x07f9 A[Catch:{ JSONException -> 0x0826 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x083a  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0850 A[Catch:{ JSONException -> 0x0885 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x085f A[Catch:{ JSONException -> 0x0885 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x088f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(com.ss.android.ugc.aweme.im.sdk.relations.a.a r28, com.ss.android.ugc.aweme.sharer.ui.SharePackage r29, com.ss.android.ugc.aweme.im.service.model.IMContact r30, boolean r31, java.lang.String r32, long r33, h.f.a.m r35, h.f.a.m r36, int r37) {
        /*
        // Method dump skipped, instructions count: 2262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a, com.ss.android.ugc.aweme.sharer.ui.SharePackage, com.ss.android.ugc.aweme.im.service.model.IMContact, boolean, java.lang.String, long, h.f.a.m, h.f.a.m, int):void");
    }

    static {
        Covode.recordClassIndex(65994);
    }

    private static String a(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return "private";
        }
        if (!(iMContact instanceof IMConversation)) {
            return "";
        }
        IMConversation iMConversation = (IMConversation) iMContact;
        if (iMConversation.getConversationType() == 1) {
            return "private";
        }
        if (iMConversation.getConversationType() == 2) {
            return "group";
        }
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$a */
    public static final /* synthetic */ class C2604a extends j implements m<String, JSONObject, z> {

        /* renamed from: a */
        public static final C2604a f102957a = new C2604a();

        static {
            Covode.recordClassIndex(65995);
        }

        C2604a() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Lorg/json/JSONObject;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, JSONObject jSONObject) {
            r.a(str, jSONObject);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final b f102958a = new b();

        static {
            Covode.recordClassIndex(65996);
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
        public static final c f102959a = new c();

        static {
            Covode.recordClassIndex(65997);
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

    public static String a(String str, long j2) {
        l.d(str, "");
        return et.a(str + j2);
    }

    private static void a(Map<String, String> map, IMContact iMContact) {
        if (iMContact == null) {
            map.put("to_user_id", "null");
            map.put("conversation_id", "null");
        } else if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            map.put("to_user_id", iMUser.getUid());
            String uid = iMUser.getUid();
            l.b(uid, "");
            map.put("conversation_id", b.a.a(Long.parseLong(uid)));
        } else if (iMContact instanceof IMConversation) {
            map.put("conversation_id", ((IMConversation) iMContact).getConversationId());
            map.put("to_user_id", "null");
        }
    }

    private static Map<String, String> a(SharePackage sharePackage, IMContact iMContact, boolean z, long j2) {
        String str;
        androidx.c.a aVar = new androidx.c.a();
        a(aVar, iMContact);
        aVar.put("live_event_id", sharePackage.f124595i.getString("live_event_id"));
        aVar.put("author_id", sharePackage.f124595i.getString("live_event_author_id"));
        String str2 = "0";
        aVar.put("is_anchor", sharePackage.f124595i.getString("live_event_is_anchor", str2));
        aVar.put("chat_type", a(iMContact));
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat_head";
        }
        aVar.put("platform", str);
        aVar.put("enter_from", sharePackage.f124595i.getString("enter_from", ""));
        if (!sharePackage.f124595i.getBoolean("is_paid_event", false)) {
            str2 = "1";
        }
        aVar.put("is_free_event", str2);
        if (iMContact == null) {
            aVar.put("follow_status", "null");
        } else if (iMContact instanceof IMUser) {
            aVar.put("follow_status", String.valueOf(((IMUser) iMContact).getFollowStatus()));
        }
        aVar.put("bind_id", a("livesdk_live_event_share", j2));
        return aVar;
    }

    public static void a(String str, SharePackage sharePackage, IMContact iMContact, boolean z, long j2, m<? super String, ? super Map<String, String>, z> mVar) {
        l.d(str, "");
        l.d(sharePackage, "");
        l.d(mVar, "");
        mVar.invoke(str, a(sharePackage, iMContact, z, j2));
    }
}
