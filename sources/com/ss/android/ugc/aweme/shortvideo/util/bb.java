package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.df.b;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.zhiliaoapp.musically.R;
import dmt.av.video.aj;
import h.f.b.l;
import java.util.List;

public final class bb {
    static {
        Covode.recordClassIndex(86611);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.h.a.q<? extends com.ss.android.ugc.aweme.shortvideo.ai> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final q<ai> a(q<? extends ai> qVar) {
        l.d(qVar, "");
        g.a();
        return qVar;
    }

    private static String a(User user) {
        String str;
        if (user != null) {
            str = user.getRemarkName();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (user != null) {
                return user.getRemarkName();
            }
            return null;
        } else if (user != null) {
            return user.getNickname();
        } else {
            return null;
        }
    }

    public static final String a(int i2) {
        Context a2 = b.a();
        if (i2 == 1) {
            String string = a2.getString(R.string.a_8);
            l.b(string, "");
            return string;
        } else if (i2 != 2) {
            String string2 = a2.getString(R.string.dlu);
            l.b(string2, "");
            return string2;
        } else {
            String string3 = a2.getString(R.string.a_7);
            l.b(string3, "");
            return string3;
        }
    }

    public static final int[] a(EditPreviewInfo editPreviewInfo) {
        List<EditVideoSegment> videoList;
        if (editPreviewInfo == null || (videoList = editPreviewInfo.getVideoList()) == null || videoList.size() <= 0) {
            return null;
        }
        return aj.a(videoList.get(0).getVideoPath());
    }

    public static final String a(int i2, List<? extends User> list) {
        if (i2 <= 0) {
            return "";
        }
        User user = null;
        if (i2 > 1) {
            Context a2 = b.a();
            Object[] objArr = new Object[2];
            if (list != null) {
                user = (User) list.get(0);
            }
            objArr[0] = a(user);
            objArr[1] = Integer.valueOf(i2);
            String string = a2.getString(R.string.f0v, objArr);
            if (string == null) {
                string = "";
            }
            l.b(string, "");
            return string;
        }
        if (list != null) {
            user = (User) list.get(0);
        }
        String a3 = a(user);
        if (a3 == null) {
            return "";
        }
        return a3;
    }
}
