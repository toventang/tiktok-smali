package com.ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.u.c;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.a.as;
import com.ss.android.ugc.aweme.share.improve.a.d;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;

public final class UserSharePackage extends LinkDefaultSharePackage {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123995b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public User f123996a;

    static {
        Covode.recordClassIndex(81415);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81416);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(User user) {
            ProfileBadgeStruct profileBadge;
            l.d(user, "");
            if (user.getProfileBadge() == null || (profileBadge = user.getProfileBadge()) == null || !profileBadge.getShouldShow()) {
                if (user.getProfileBadge() == null) {
                    return false;
                }
                String uid = user.getUid();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                User curUser = g2.getCurUser();
                l.b(curUser, "");
                if (l.a((Object) uid, (Object) curUser.getUid())) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage$a$a  reason: collision with other inner class name */
        public static final class C3227a implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ UserSharePackage f123997a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f123998b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Activity f123999c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ User f124000d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Handler f124001e;

            static {
                Covode.recordClassIndex(81417);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.b(sharePackage, context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void b(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.a(sharePackage, context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(h hVar, SharePackage sharePackage, Context context) {
                l.d(hVar, "");
                l.d(sharePackage, "");
                l.d(context, "");
                if (hVar instanceof d) {
                    a.a("copy", this.f124000d);
                    a.a(hVar.c(), true, context, this.f124000d);
                } else if (hVar instanceof as) {
                    a.a("report", this.f124000d);
                }
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.b
            public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
                l.d(bVar, "");
                l.d(context, "");
                a.a(bVar.a(), z, context, this.f124000d);
                if (bVar instanceof com.ss.android.ugc.aweme.share.improve.b.b) {
                    a.a("copy", this.f124000d);
                }
            }

            public C3227a(UserSharePackage userSharePackage, String str, Activity activity, User user, Handler handler) {
                this.f123997a = userSharePackage;
                this.f123998b = str;
                this.f123999c = activity;
                this.f124000d = user;
                this.f124001e = handler;
            }
        }

        public static final class b implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ UserSharePackage f124002a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f124003b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Activity f124004c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ User f124005d;

            static {
                Covode.recordClassIndex(81418);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.b(sharePackage, context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void b(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.a(sharePackage, context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(h hVar, SharePackage sharePackage, Context context) {
                l.d(hVar, "");
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.a(hVar, sharePackage, context);
            }

            public b(UserSharePackage userSharePackage, String str, Activity activity, User user) {
                this.f124002a = userSharePackage;
                this.f124003b = str;
                this.f124004c = activity;
                this.f124005d = user;
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.b
            public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
                l.d(bVar, "");
                l.d(context, "");
                a.a(bVar.a(), z, context, this.f124005d);
                r.a("share_person", new com.ss.android.ugc.aweme.app.f.d().a("platform", bVar.a()).a("enter_method", "click_head").a("enter_from", this.f124003b).a("author_id", this.f124005d.getUid()).f66730a);
            }
        }

        public static void a(String str, User user) {
            String str2;
            l.d(str, "");
            if (user != null) {
                ab.a b2 = ab.a("share_person").b("platform", str).b("target_id", user.getUid());
                if (in.g(user)) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                b2.b("enter_from", str2).f();
            }
        }

        public static UserSharePackage a(User user, Context context, List<? extends Aweme> list) {
            String str;
            String str2;
            String str3;
            String str4;
            String shareUrl;
            String a2;
            String b2;
            l.d(user, "");
            l.d(context, "");
            SharePackage.a aVar = new SharePackage.a();
            String uid = user.getUid();
            l.b(uid, "");
            SharePackage.a b3 = aVar.b(uid);
            String string = context.getString(R.string.uh);
            l.b(string, "");
            SharePackage.a a3 = b3.a("app_name", string);
            ShareInfo shareInfo = user.getShareInfo();
            if (shareInfo == null || (str = shareInfo.getShareTitle()) == null) {
                str = "";
            }
            SharePackage.a c2 = a3.c(str);
            ShareInfo shareInfo2 = user.getShareInfo();
            if (shareInfo2 == null || (str2 = shareInfo2.getShareDesc()) == null) {
                str2 = "";
            }
            SharePackage.a d2 = c2.d(str2);
            ShareInfo shareInfo3 = user.getShareInfo();
            if (shareInfo3 == null || (shareUrl = shareInfo3.getShareUrl()) == null || (a2 = com.ss.android.ugc.aweme.share.improve.c.b.a(shareUrl)) == null || (b2 = com.ss.android.ugc.aweme.share.improve.c.b.b(a2)) == null || (str3 = com.ss.android.ugc.aweme.share.improve.c.b.c(b2)) == null) {
                str3 = "";
            }
            SharePackage.a a4 = d2.e(str3).a("user");
            String uid2 = user.getUid();
            if (uid2 == null) {
                uid2 = "";
            }
            SharePackage.a a5 = a4.a("uid", uid2);
            String secUid = user.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            SharePackage.a a6 = a5.a("sec_user_id", secUid);
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            SharePackage.a a7 = a6.a(StringSet.name, nickname);
            String uniqueId = user.getUniqueId();
            if (uniqueId == null || uniqueId.length() == 0) {
                str4 = user.getShortId();
                if (str4 == null) {
                    str4 = "";
                }
            } else {
                str4 = user.getUniqueId();
            }
            l.b(str4, "");
            SharePackage.a a8 = a7.a("desc", str4);
            if (!in.b(user, in.g(user)) && list != null && list.size() >= 3) {
                com.ss.android.ugc.aweme.share.improve.c.a.a(a8.f124602f, "aweme_cover_list", list);
            }
            a8.f124602f.putSerializable("video_cover", user.getAvatarMedium());
            UserSharePackage userSharePackage = new UserSharePackage(a8);
            userSharePackage.f123996a = user;
            return userSharePackage;
        }

        public static void a(String str, boolean z, Context context, User user) {
            l.d(str, "");
            l.d(context, "");
            if (z && user != null) {
                c cVar = new c();
                cVar.a(new com.ss.android.ugc.aweme.feed.u.a());
                c.a aVar = new c.a();
                aVar.f93987a = user.getUid();
                aVar.f93988b = 1;
                aVar.f93993g = 4;
                aVar.f93994h = str;
                cVar.a(aVar.a());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(h hVar, Context context) {
        String shareProfileToast;
        l.d(hVar, "");
        l.d(context, "");
        if (!(hVar instanceof d)) {
            return false;
        }
        User user = this.f123996a;
        if (user == null) {
            l.a("user");
        }
        GeneralPermission generalPermission = user.getGeneralPermission();
        String str = null;
        if (generalPermission != null) {
            str = generalPermission.getShareProfileToast();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        User user2 = this.f123996a;
        if (user2 == null) {
            l.a("user");
        }
        GeneralPermission generalPermission2 = user2.getGeneralPermission();
        if (generalPermission2 == null || (shareProfileToast = generalPermission2.getShareProfileToast()) == null) {
            return true;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(shareProfileToast).a();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(b bVar, Context context, h.f.a.b<? super Boolean, z> bVar2) {
        String shareProfileToast;
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        User user = this.f123996a;
        if (user == null) {
            l.a("user");
        }
        GeneralPermission generalPermission = user.getGeneralPermission();
        String str = null;
        if (generalPermission != null) {
            str = generalPermission.getShareProfileToast();
        }
        if (!TextUtils.isEmpty(str)) {
            User user2 = this.f123996a;
            if (user2 == null) {
                l.a("user");
            }
            GeneralPermission generalPermission2 = user2.getGeneralPermission();
            if (!(generalPermission2 == null || (shareProfileToast = generalPermission2.getShareProfileToast()) == null)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(shareProfileToast).a();
            }
            bVar2.invoke(true);
            return true;
        }
        ah.f123353b.a(bVar.a(), 0);
        return false;
    }
}
