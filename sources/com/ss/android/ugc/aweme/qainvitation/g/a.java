package com.ss.android.ugc.aweme.qainvitation.g;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.f.b;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.im.c;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.io;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119158a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(77377);
    }

    public static String a(IMUser iMUser) {
        l.d(iMUser, "");
        if (d.c()) {
            return e(iMUser);
        }
        return d(iMUser);
    }

    public static int b(Context context) {
        l.d(context, "");
        double a2 = (double) a(context);
        Double.isNaN(a2);
        return h.g.a.a(a2 * 0.99d);
    }

    private static int c(Context context) {
        l.d(context, "");
        if (i.e(context) != 0) {
            return i.e(context);
        }
        return 0;
    }

    public static int a(Context context) {
        l.d(context, "");
        double b2 = (double) ((b.b(context) - n.e(context)) - c(context));
        Double.isNaN(b2);
        return h.g.a.a(b2 * 0.99d);
    }

    public static String b(IMUser iMUser) {
        l.d(iMUser, "");
        if (d.c()) {
            return d(iMUser);
        }
        return e(iMUser);
    }

    public static List<IMUser> a(List<? extends User> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IMUser a2 = c.a(it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static List<User> b(List<? extends IMUser> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c((IMUser) it.next()));
        }
        return arrayList;
    }

    public static User c(IMUser iMUser) {
        l.d(iMUser, "");
        User user = new User();
        user.setUid(iMUser.getUid());
        user.setNickname(iMUser.getNickName());
        user.setSignature(iMUser.getSignature());
        user.setAvatarThumb(iMUser.getAvatarThumb());
        user.setUniqueId(iMUser.getUniqueId());
        user.setShortId(iMUser.getShortId());
        user.setFollowStatus(iMUser.getFollowStatus());
        user.setCustomVerify(iMUser.getCustomVerify());
        user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        user.setVerificationType(iMUser.getVerificationType());
        user.setRemarkName(iMUser.getRemarkName());
        user.isBlock = iMUser.isBlock();
        user.setSecUid(iMUser.getSecUid());
        user.setRegion("");
        return user;
    }

    private static String d(IMUser iMUser) {
        boolean z;
        String str;
        String str2;
        String uniqueId = iMUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String nickName = iMUser.getNickName();
            if (nickName == null || nickName.length() == 0) {
                str2 = "";
            } else {
                str2 = iMUser.getNickName();
            }
            l.b(str2, "");
            return str2;
        }
        String uniqueId2 = iMUser.getUniqueId();
        if (uniqueId2 == null || uniqueId2.length() == 0) {
            str = "";
        } else {
            str = iMUser.getUniqueId();
        }
        l.b(str, "");
        return str;
    }

    private static String e(IMUser iMUser) {
        boolean z;
        String str;
        String str2;
        String nickName = iMUser.getNickName();
        if (nickName == null || nickName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String uniqueId = iMUser.getUniqueId();
            if (uniqueId == null || uniqueId.length() == 0) {
                str2 = "";
            } else {
                str2 = iMUser.getUniqueId();
            }
            l.b(str2, "");
            return str2;
        }
        String nickName2 = iMUser.getNickName();
        if (nickName2 == null || nickName2.length() == 0) {
            str = "";
        } else {
            str = iMUser.getNickName();
        }
        l.b(str, "");
        return str;
    }

    public static void a(IMUser iMUser, TextView textView, TextView textView2) {
        l.d(iMUser, "");
        l.d(textView, "");
        l.d(textView2, "");
        textView.setText(a(iMUser));
        textView2.setText(b(iMUser));
        if (TextUtils.isEmpty(textView2.getText())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
    }

    public static void a(AvatarImageWithVerify avatarImageWithVerify, Context context, String str, String str2, TextView textView) {
        l.d(avatarImageWithVerify, "");
        avatarImageWithVerify.a();
        io.a(context, str, str2, textView);
    }
}
