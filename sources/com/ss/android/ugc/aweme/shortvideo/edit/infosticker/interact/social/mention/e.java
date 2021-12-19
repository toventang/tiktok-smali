package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.i;
import h.a.n;

public final class e {
    static {
        Covode.recordClassIndex(83741);
    }

    private static int a(String str) {
        if (str == null) {
            return 0;
        }
        int hashCode = str.hashCode();
        if (hashCode != -600094315) {
            if (hashCode == 765915793 && str.equals("following")) {
                return 1;
            }
        } else if (str.equals("friends")) {
            return 2;
        }
        return 0;
    }

    public static final User a(i iVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        User user = new User();
        String str6 = null;
        if (iVar != null) {
            str = iVar.getUserId();
        } else {
            str = null;
        }
        user.setUid(str);
        if (iVar != null) {
            str2 = iVar.getSecUserId();
        } else {
            str2 = null;
        }
        user.setSecUid(str2);
        if (iVar != null) {
            str3 = iVar.getUsername();
        } else {
            str3 = null;
        }
        user.setUniqueId(str3);
        if (iVar != null) {
            str4 = iVar.getUserNickname();
        } else {
            str4 = null;
        }
        user.setNickname(str4);
        if (iVar != null) {
            str5 = iVar.getUserRelationType();
        } else {
            str5 = null;
        }
        user.setFollowStatus(a(str5));
        UrlModel urlModel = new UrlModel();
        if (iVar != null) {
            str6 = iVar.getUserAvatarUri();
        }
        urlModel.setUri(str6);
        urlModel.setUrlList(n.a(str6));
        user.setAvatarThumb(urlModel);
        return user;
    }
}
