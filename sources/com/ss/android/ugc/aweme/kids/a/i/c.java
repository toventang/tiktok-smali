package com.ss.android.ugc.aweme.kids.a.i;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.net.URI;
import java.util.Collection;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f105383a = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f105384b = false;

    static {
        Covode.recordClassIndex(67541);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URI(str).getHost();
        } catch (Exception e2) {
            e2.printStackTrace();
            a.a("music url illegal");
            return null;
        }
    }

    public static void a(MusicModel musicModel) {
        if (musicModel.getMusic() != null && musicModel.getMusic().getChallenge() != null) {
            AVExternalServiceImpl.a().publishService().addChallenge(musicModel.getMusic().getChallenge());
        }
    }

    public static boolean a(MusicModel musicModel, Context context, boolean z) {
        if (musicModel == null) {
            return false;
        }
        if (f105384b) {
            musicModel.getMusicStatus();
            musicModel.getLocalPath();
        }
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            return true;
        }
        if (musicModel.getUrl() != null && !TextUtils.isEmpty(musicModel.getUrl().getUri()) && !b.a((Collection) musicModel.getUrl().getUrlList()) && musicModel.getMusicStatus() != 0) {
            return true;
        }
        String offlineDesc = musicModel.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.dcb);
        }
        if (z) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(offlineDesc).a();
        }
        return false;
    }
}
