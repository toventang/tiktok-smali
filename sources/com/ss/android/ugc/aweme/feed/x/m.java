package com.ss.android.ugc.aweme.feed.x;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.common.e.f;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class m {
    static {
        Covode.recordClassIndex(60380);
    }

    public static Aweme c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.isForwardAweme()) {
            return aweme.getForwardItem();
        }
        return aweme;
    }

    public static boolean d(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 2) {
            return false;
        }
        return true;
    }

    public static String f(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    public static boolean a(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            return false;
        }
        return TextUtils.equals(author.getUid(), b.g().getCurUser().getUid());
    }

    public static boolean b(Aweme aweme) {
        if (aweme == null || aweme.getHotListStruct() == null || aweme.getHotListStruct().getType() != 2) {
            return false;
        }
        return true;
    }

    public static boolean e(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null) {
            return false;
        }
        return aweme.getStatus().isDelete();
    }

    public static boolean g(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRiskModel() == null) {
            return false;
        }
        if (aweme.getAwemeRiskModel().isWarn() || aweme.getAwemeRiskModel().isNotice()) {
            return true;
        }
        return false;
    }

    public static Aweme a(String str) {
        Aweme b2 = AwemeService.b().b(str);
        if (b2 != null) {
            return b2;
        }
        Aweme a2 = AwemeService.b().a(str);
        if (a2 != null) {
            return a2;
        }
        a.b(6, "DeleteAweme", "getAweme " + str + " is null, mock one");
        Aweme aweme = new Aweme();
        aweme.setAid(str);
        return aweme;
    }

    public static int a(List<Aweme> list, Aweme aweme) {
        if (!(aweme == null || aweme.getAid() == null || list == null || list.isEmpty())) {
            String aid = aweme.getAid();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Aweme aweme2 = list.get(i2);
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static int b(List<Aweme> list, Aweme aweme) {
        if (!(aweme == null || aweme.getAid() == null || list == null || list.isEmpty())) {
            String aid = aweme.getAid();
            for (int size = list.size() - 1; size >= 0; size--) {
                Aweme aweme2 = list.get(size);
                if (aweme2 != null && aid.equals(aweme2.getAid())) {
                    return size;
                }
            }
        }
        return -1;
    }

    public static boolean a(Collection<Aweme> collection, Aweme aweme, List<o> list) {
        if (aweme == null || aweme.getAid() == null || collection == null || collection.isEmpty()) {
            a.a(6, "DeleteAweme", "aweme is null or items is null, delete failed");
            return true;
        }
        int i2 = -1;
        String aid = aweme.getAid();
        Iterator<Aweme> it = collection.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Aweme next = it.next();
            if (next != null && aid.equals(next.getAid())) {
                if (!aweme.isLiveNoDeduplicate()) {
                    it.remove();
                    break;
                } else if (TextUtils.equals(aweme.getUniqueId(), next.getUniqueId())) {
                    it.remove();
                    break;
                }
            }
            i3++;
        }
        i2 = i3;
        a.b(6, "DeleteAweme", "delete aweme : " + aid + ", index is " + i2);
        if (i2 < 0) {
            return false;
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            for (o oVar : list) {
                if (oVar instanceof f) {
                    ((f) oVar).a(i2);
                }
            }
        }
        return true;
    }
}
