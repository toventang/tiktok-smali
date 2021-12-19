package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.util.u;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class TPUserInfo {
    public static final a Companion = new a((byte) 0);
    private final String avatarUrl;
    private final String userName;

    static {
        Covode.recordClassIndex(39143);
    }

    public static /* synthetic */ TPUserInfo copy$default(TPUserInfo tPUserInfo, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tPUserInfo.userName;
        }
        if ((i2 & 2) != 0) {
            str2 = tPUserInfo.avatarUrl;
        }
        return tPUserInfo.copy(str, str2);
    }

    public static final TPUserInfo from(User user) {
        return a.a(user);
    }

    public final String component1() {
        return this.userName;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final TPUserInfo copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new TPUserInfo(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TPUserInfo)) {
            return false;
        }
        TPUserInfo tPUserInfo = (TPUserInfo) obj;
        return l.a(this.userName, tPUserInfo.userName) && l.a(this.avatarUrl, tPUserInfo.avatarUrl);
    }

    public final int hashCode() {
        String str = this.userName;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avatarUrl;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TPUserInfo(userName=" + this.userName + ", avatarUrl=" + this.avatarUrl + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39144);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static TPUserInfo a(User user) {
            String str;
            l.d(user, "");
            String a2 = u.a(user);
            l.b(a2, "");
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                l.b(avatarThumb, "");
                if (avatarThumb.getUrlList() != null) {
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    l.b(avatarThumb2, "");
                    if (!avatarThumb2.getUrlList().isEmpty()) {
                        UrlModel avatarThumb3 = user.getAvatarThumb();
                        l.b(avatarThumb3, "");
                        str = avatarThumb3.getUrlList().get(0);
                        l.b(str, "");
                        return new TPUserInfo(a2, str);
                    }
                }
            }
            str = "";
            l.b(str, "");
            return new TPUserInfo(a2, str);
        }
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getUserName() {
        return this.userName;
    }

    public TPUserInfo(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.userName = str;
        this.avatarUrl = str2;
    }
}
