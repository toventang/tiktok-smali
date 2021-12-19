package com.ss.android.ugc.aweme.share.improve.d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.AclType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.m.f;
import com.ss.android.ugc.trill.share.base.e;
import h.f.b.l;
import h.z;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123882a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81317);
    }

    public static final class a {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.h$a$a  reason: collision with other inner class name */
        public interface AbstractC3215a {
            static {
                Covode.recordClassIndex(81319);
            }

            void a();

            void b();
        }

        static {
            Covode.recordClassIndex(81318);
        }

        private a() {
        }

        public static boolean a(String str) {
            l.d(str, "");
            switch (str.hashCode()) {
                case -1837180097:
                    return str.equals("whatsapp_status");
                case -816556504:
                    return str.equals("instagram_story");
                case 3731178:
                    return str.equals("zalo");
                case 28903346:
                    return str.equals("instagram");
                case 96619420:
                    return str.equals("email");
                case 284397090:
                    return str.equals("snapchat");
                case 486515695:
                    return str.equals("kakaotalk");
                case 497130182:
                    return str.equals("facebook");
                case 1934780818:
                    return str.equals("whatsapp");
                default:
                    return false;
            }
        }

        public static final class d implements com.ss.android.ugc.aweme.feed.share.a.a.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AwemeSharePackage f123888a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f123889b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h.f.a.b f123890c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f123891d;

            static {
                Covode.recordClassIndex(81322);
            }

            @Override // com.ss.android.ugc.aweme.feed.share.a.a.b
            public final void a() {
                this.f123891d.invoke();
            }

            @Override // com.ss.android.ugc.aweme.feed.share.a.a.b
            public final void a(String str) {
                l.d(str, "");
                this.f123890c.invoke(str);
            }

            d(AwemeSharePackage awemeSharePackage, String str, h.f.a.b bVar, h.f.a.a aVar) {
                this.f123888a = awemeSharePackage;
                this.f123889b = str;
                this.f123890c = bVar;
                this.f123891d = aVar;
            }
        }

        public static final class c implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ACLCommonShare f123885a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.trill.share.base.b f123886b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Aweme f123887c;

            static {
                Covode.recordClassIndex(81321);
            }

            @Override // com.ss.android.ugc.aweme.share.m.f
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.share.m.f
            public final void a() {
                if (this.f123885a.getCode() == 0) {
                    this.f123886b.a(this.f123887c, "share_download", false);
                }
            }

            c(ACLCommonShare aCLCommonShare, com.ss.android.ugc.trill.share.base.b bVar, Aweme aweme) {
                this.f123885a = aCLCommonShare;
                this.f123886b = bVar;
                this.f123887c = aweme;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static final class b extends com.ss.android.ugc.aweme.feed.share.a.a.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.feed.share.a.a.b f123883a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f123884b;

            static {
                Covode.recordClassIndex(81320);
            }

            @Override // com.ss.android.ugc.aweme.feed.share.a.a.a, com.ss.android.ugc.aweme.feed.share.a.a.b
            public final void a(String str) {
                if (str != null && str.length() != 0) {
                    this.f123883a.a(str);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(com.ss.android.ugc.aweme.feed.share.a.a.b bVar, Activity activity, Context context) {
                super(context);
                this.f123883a = bVar;
                this.f123884b = activity;
            }
        }

        private static ACLCommonShare b(Aweme aweme) {
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo != null) {
                return awemeACLShareInfo.getShareThirdPlatform();
            }
            return null;
        }

        private static ACLCommonShare a(Aweme aweme) {
            ACLCommonShare shareThirdPlatform;
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null || (shareThirdPlatform = awemeACLShareInfo.getShareThirdPlatform()) == null) {
                return null;
            }
            shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
            return shareThirdPlatform;
        }

        public static ACLCommonShare a(Aweme aweme, String str) {
            l.d(aweme, "");
            l.d(str, "");
            if (a(str)) {
                return b(aweme, str);
            }
            return a(aweme);
        }

        public static ACLCommonShare b(Aweme aweme, String str) {
            l.d(aweme, "");
            l.d(str, "");
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null) {
                return null;
            }
            ACLCommonShare shareThirdPlatform = awemeACLShareInfo.getShareThirdPlatform();
            if (shareThirdPlatform != null) {
                shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
                return shareThirdPlatform;
            }
            List<ACLCommonShare> platformList = awemeACLShareInfo.getPlatformList();
            if (platformList != null) {
                for (ACLCommonShare aCLCommonShare : platformList) {
                    if (TextUtils.equals(str, aCLCommonShare.getPlatformId())) {
                        aCLCommonShare.setAwemeAclType(AclType.PLATFORM_LIST);
                        return aCLCommonShare;
                    }
                }
            }
            ACLCommonShare shareGeneral = awemeACLShareInfo.getShareGeneral();
            if (shareGeneral != null) {
                shareGeneral.setAwemeAclType(AclType.SHARE_GENERAL);
            }
            return awemeACLShareInfo.getShareGeneral();
        }

        private static boolean a(Context context, ACLCommonShare aCLCommonShare) {
            if (aCLCommonShare != null) {
                String toastMsg = aCLCommonShare.getToastMsg();
                if (toastMsg != null && toastMsg.length() > 0) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(context).a(toastMsg).a();
                }
                if (aCLCommonShare.getCode() == 0) {
                    return true;
                }
            }
            return false;
        }

        public static boolean a(Aweme aweme, Context context) {
            l.d(aweme, "");
            l.d(context, "");
            ACLCommonShare a2 = a(aweme);
            if (a2 != null && !a(context, a2)) {
                return false;
            }
            return true;
        }

        public static boolean a(Context context, AwemeSharePackage awemeSharePackage, String str, AbstractC3215a aVar) {
            l.d(context, "");
            l.d(awemeSharePackage, "");
            l.d(str, "");
            l.d(aVar, "");
            if (b(awemeSharePackage.a()) != null) {
                aVar.a();
                return true;
            }
            ACLCommonShare b2 = b(awemeSharePackage.a(), str);
            if (b2 == null) {
                aVar.b();
                return false;
            } else if (b2.getCode() == 0) {
                aVar.a();
                return true;
            } else {
                aVar.b();
                return false;
            }
        }

        public static void a(AwemeSharePackage awemeSharePackage, String str, Context context, h.f.a.b<? super String, z> bVar, h.f.a.a<z> aVar) {
            String str2 = "";
            l.d(awemeSharePackage, str2);
            l.d(str, str2);
            l.d(context, str2);
            l.d(bVar, str2);
            l.d(aVar, str2);
            Activity a2 = com.ss.android.ugc.aweme.share.improve.c.b.a(context);
            if (a2 != null) {
                Aweme a3 = awemeSharePackage.a();
                boolean a4 = l.a((Object) str, (Object) "instagram");
                int i2 = awemeSharePackage.f124595i.getInt("page_type");
                d dVar = new d(awemeSharePackage, str, bVar, aVar);
                String string = awemeSharePackage.f124595i.getString("enter_from");
                if (string != null) {
                    str2 = string;
                }
                a(a2, a3, a4, i2, str, dVar, str2);
            }
        }

        public static void a(Activity activity, Aweme aweme, boolean z, int i2, String str, com.ss.android.ugc.aweme.feed.share.a.a.b bVar, String str2) {
            ACLCommonShare b2;
            l.d(activity, "");
            l.d(aweme, "");
            l.d(str, "");
            l.d(bVar, "");
            l.d(str2, "");
            if (!com.ss.android.ugc.trill.share.base.c.a(activity, aweme, str)) {
                com.ss.android.ugc.trill.share.base.b bVar2 = new com.ss.android.ugc.trill.share.base.b(activity, z, i2, str);
                bVar2.a(str2);
                bVar2.a(new b(bVar, activity, activity));
                if (e.a(activity, aweme) && (b2 = b(aweme, str)) != null) {
                    String popupMsg = b2.getPopupMsg();
                    if (popupMsg == null || popupMsg.length() == 0) {
                        String toastMsg = b2.getToastMsg();
                        if (!(toastMsg == null || toastMsg.length() == 0)) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(toastMsg).a();
                        }
                        if (b2.getCode() == 0) {
                            bVar2.a(aweme, "share_download", false);
                            return;
                        }
                        return;
                    }
                    com.ss.android.ugc.aweme.share.m.d.a(activity, popupMsg, Integer.valueOf(b2.getCode()), new c(b2, bVar2, aweme));
                }
            }
        }
    }
}
