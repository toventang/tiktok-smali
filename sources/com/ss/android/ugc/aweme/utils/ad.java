package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.tools.c.c;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.List;

public final class ad {
    static {
        Covode.recordClassIndex(93298);
    }

    public static final MediaModel a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int[] iArr = new int[10];
        if (c.a(str, iArr) != 0) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f109390b = str;
        mediaModel.f109400l = iArr[0];
        mediaModel.f109401m = iArr[1];
        mediaModel.f109396h = (long) iArr[3];
        return mediaModel;
    }

    public static final List<User> a(ExtraMentionUserModel extraMentionUserModel) {
        l.d(extraMentionUserModel, "");
        List<p<String, String>> userList = extraMentionUserModel.getUserList();
        if (!(!extraMentionUserModel.getUserList().isEmpty()) || userList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(n.a((Iterable) userList, 10));
        for (T t : userList) {
            User user = new User();
            user.setUid((String) t.getFirst());
            user.setNickname((String) t.getSecond());
            arrayList.add(user);
        }
        return arrayList;
    }

    public static final void a(Context context, String str, int i2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                ICrashReportService provideErrorReporter = AVExternalServiceImpl.a().provideErrorReporter();
                if (i2 == 1) {
                    if (str == null) {
                        l.b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_sticker_id", str);
                } else if (i2 == 2) {
                    if (str == null) {
                        l.b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_mv_id", str);
                } else if (i2 == 3) {
                    if (str == null) {
                        l.b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_filter_id", str);
                } else if (i2 == 4) {
                    if (str == null) {
                        l.b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_beauty_id", str);
                } else if (i2 == 5) {
                    if (str == null) {
                        l.b();
                    }
                    provideErrorReporter.setEffectIdInfo("last_infosticker_id", str);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
