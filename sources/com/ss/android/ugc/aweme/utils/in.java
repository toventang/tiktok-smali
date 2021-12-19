package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;

public class in {

    /* renamed from: a  reason: collision with root package name */
    private static User f143103a;

    /* renamed from: b  reason: collision with root package name */
    private static User f143104b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f143105c;

    static {
        Covode.recordClassIndex(93675);
    }

    public static boolean a(int i2) {
        return (i2 == 0 || i2 == 4) ? false : true;
    }

    public static void a() {
        f143103a = null;
        f143104b = null;
    }

    public static boolean d() {
        return b.g().isChildrenMode();
    }

    public static boolean f() {
        return b.g().isDeleteByAgeGate();
    }

    public static String b() {
        User user = f143103a;
        if (user == null) {
            return b.g().getLastUid();
        }
        return user.getUid();
    }

    public static User c() {
        User user = f143104b;
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            f143104b = b.g().getCurUser();
        }
        return f143104b;
    }

    public static boolean g() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser == null || !currentUser.isContentLanguageDialogShown()) {
            return false;
        }
        return true;
    }

    public static boolean e() {
        if (a.q().d()) {
            return com.ss.android.ugc.aweme.compliance.api.d.a.c();
        }
        return d();
    }

    public static UrlModel c(User user) {
        UrlModel a2 = im.a(user);
        if (a2 != null) {
            return a2;
        }
        return d(user);
    }

    public static String i(User user) {
        if (user == null) {
            return "";
        }
        return user.getUid();
    }

    public static String j(User user) {
        if (user == null) {
            return "";
        }
        return user.getNickname();
    }

    public static boolean k(User user) {
        if (user == null) {
            return false;
        }
        if (user.isBlock || user.isBlocked()) {
            return true;
        }
        return false;
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        return a(aweme.getAuthor().getFollowStatus());
    }

    public static UrlModel d(User user) {
        if (user == null) {
            return null;
        }
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger != null) {
            return avatarLarger;
        }
        UrlModel avatarMedium = user.getAvatarMedium();
        if (avatarMedium == null) {
            return user.getAvatarThumb();
        }
        return avatarMedium;
    }

    public static String e(User user) {
        if (user == null) {
            return "";
        }
        if (!d.c()) {
            return b(user);
        }
        return user.getNickname();
    }

    public static boolean f(User user) {
        if (user == null) {
            return false;
        }
        return a(user.getFollowStatus());
    }

    public static boolean m(User user) {
        if (user == null || !TextUtils.equals("unique_id", user.getNameField())) {
            return false;
        }
        return true;
    }

    public static String a(User user) {
        if (user == null) {
            return "";
        }
        if (d.c()) {
            return user.getNickname();
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    public static String b(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }

    public static boolean g(User user) {
        if (user == null) {
            return false;
        }
        if (user == f143103a) {
            return f143105c;
        }
        boolean equals = TextUtils.equals(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID(), user.getUid());
        f143105c = equals;
        f143103a = user;
        return equals;
    }

    public static boolean h(User user) {
        if (user == null || user.getAccountType() != 3 || user.getBizAccountInfo() == null || user.getBizAccountInfo().getSuggestedAccountsEntranceTipType() == 0 || TextUtils.isEmpty(user.getBizAccountInfo().getSuggestedAccountsLynxSchema())) {
            return false;
        }
        return true;
    }

    public static String l(User user) {
        StringBuilder sb = new StringBuilder();
        sb.append(" user: ");
        if (user == null) {
            sb.append(" ");
        } else {
            sb.append("{ ");
            sb.append(" uid: ");
            sb.append(user.getUid());
            sb.append(',');
            sb.append(" following_count: ");
            sb.append(user.getFollowingCount());
            sb.append(',');
            sb.append(" follower_count: ");
            sb.append(user.getFollowerCount());
            sb.append(" }");
        }
        sb.append(" time: ");
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    public static boolean a(String str) {
        return TextUtils.equals(b.g().getCurUserId(), str);
    }

    public static String[] a(UrlModel urlModel) {
        if (urlModel == null || com.ss.android.ugc.aweme.base.utils.d.a(urlModel.getUrlList())) {
            return null;
        }
        return (String[]) urlModel.getUrlList().toArray(new String[urlModel.getUrlList().size()]);
    }

    public static String a(User user, boolean z) {
        String a2;
        String str;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            a2 = user.getRemarkName();
        } else {
            a2 = a(user);
        }
        if (z) {
            str = "@";
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        return str + a2;
    }

    public static boolean b(User user, boolean z) {
        if (user == null || z || user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return false;
        }
        return true;
    }
}
