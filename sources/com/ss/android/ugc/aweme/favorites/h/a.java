package com.ss.android.ugc.aweme.favorites.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90644a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(56947);
    }

    public static final void a(Comment comment) {
        String str;
        String str2;
        User author;
        String str3 = "";
        l.d(comment, str3);
        IAccountUserService g2 = b.g();
        String str4 = null;
        if (g2 != null) {
            str = g2.getCurUserId();
        } else {
            str = null;
        }
        d a2 = new d().a("enter_from", "collection_comment");
        String cid = comment.getCid();
        if (cid == null) {
            cid = str3;
        }
        d a3 = a2.a("comment_id", cid);
        Aweme aliasAweme = comment.getAliasAweme();
        if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (str2 = author.getUid()) == null) {
            str2 = str3;
        }
        d a4 = a3.a("author_id", str2);
        String awemeId = comment.getAwemeId();
        if (awemeId == null) {
            awemeId = str3;
        }
        d a5 = a4.a("group_id", awemeId);
        User user = comment.getUser();
        if (user != null) {
            str4 = user.getUid();
        }
        d a6 = a5.a("is_author", Boolean.valueOf(l.a((Object) str4, (Object) str)));
        if (str != null) {
            str3 = str;
        }
        r.a("tap_comment", a6.a("user_id", str3).f66730a);
    }
}
