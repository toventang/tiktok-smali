package com.ss.android.ugc.aweme.ao;

import android.app.Activity;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notification.bean.f;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import java.util.Arrays;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final h f66420a = i.a((h.f.a.a) C1487a.f66421a);

    private static final String b() {
        return (String) f66420a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ao.a$a  reason: collision with other inner class name */
    static final class C1487a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1487a f66421a = new C1487a();

        static {
            Covode.recordClassIndex(40813);
        }

        C1487a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return a.a().getString(R.string.dkz);
        }
    }

    static {
        Covode.recordClassIndex(40812);
    }

    public static final Resources a() {
        Resources resources;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || (resources = topActivity.getResources()) == null) {
            return d.a().getResources();
        }
        return resources;
    }

    public static final User c(List<? extends User> list) {
        User user;
        if (list == null || list.size() != 1 || (user = (User) n.h((List) list)) == null || user.getMatchedFriendStruct() == null) {
            return null;
        }
        return user;
    }

    public static final String a(List<? extends User> list) {
        User user;
        MatchedFriendStruct matchedFriendStruct;
        if (list == null || (user = (User) n.h((List) list)) == null || (matchedFriendStruct = user.getMatchedFriendStruct()) == null) {
            return null;
        }
        return matchedFriendStruct.getRecType();
    }

    public static final p<Integer, Integer> b(List<? extends User> list) {
        int i2;
        User user;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i2 > 1 || list == null || (user = (User) n.h((List) list)) == null) {
            return null;
        }
        return new p<>(Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()));
    }

    public static final String a(AtMe atMe) {
        l.d(atMe, "");
        int subType = atMe.getSubType();
        if (subType != 2) {
            if (subType == 7) {
                String string = a().getString(R.string.dku);
                l.b(string, "");
                return string;
            } else if (subType == 54) {
                String string2 = a().getString(R.string.djl);
                l.b(string2, "");
                return string2;
            } else if (subType != 55) {
                String string3 = a().getString(R.string.dkt);
                l.b(string3, "");
                return string3;
            }
        }
        return a().getString(R.string.dkx) + ' ' + atMe.getContent();
    }

    public static final String a(f fVar) {
        String string;
        l.d(fVar, "");
        if (hk.a(fVar.a())) {
            if (fVar.type == 14) {
                string = a().getString(R.string.dk6, fVar.a());
            } else {
                string = a().getString(R.string.ck8, fVar.a());
            }
            l.b(string, "");
            return string;
        }
        String string2 = a().getString(R.string.ck7);
        l.b(string2, "");
        return string2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final h.u<java.lang.String, java.lang.Integer, java.lang.Integer> a(com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r11) {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ao.a.a(com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice):h.u");
    }

    public static final String a(List<? extends User> list, int i2) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        if (list.size() == 1) {
            return j.a((User) n.g((List) list));
        }
        if (list.size() == 2 && 1 <= i2 && 3 >= i2) {
            return j.a((User) list.get(0)) + ' ' + b() + ' ' + j.a((User) list.get(1));
        }
        if (list.size() == 3 || (i2 == 3 && list.size() > 3)) {
            return j.a((User) list.get(0)) + ", " + j.a((User) list.get(1)) + ' ' + b() + ' ' + j.a((User) list.get(2));
        }
        if (list.size() <= 1) {
            return "";
        }
        String string = a().getString(R.string.dky);
        l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{Integer.valueOf(Math.max(i2, list.size()) - 2)}, 1));
        l.b(a2, "");
        return j.a((User) list.get(0)) + ", " + j.a((User) list.get(1)) + ' ' + b() + ' ' + a2;
    }
}
