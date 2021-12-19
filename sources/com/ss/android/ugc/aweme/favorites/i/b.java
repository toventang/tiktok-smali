package com.ss.android.ugc.aweme.favorites.i;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.login.b.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

public final class b {
    static {
        Covode.recordClassIndex(56950);
    }

    public static boolean a(Aweme aweme, String str) {
        if (aweme == null || !TextUtils.equals(str, "collection_video") || !aweme.isCollected()) {
            return false;
        }
        if (!aweme.isCanPlay() || a.a(aweme)) {
            return true;
        }
        return false;
    }

    public static void a(Context context, View view, Music music, String str, String str2, boolean z) {
        boolean z2;
        if (music != null) {
            if (music.getMusicStatus() == 0) {
                String offlineDesc = music.getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = context.getString(R.string.dcb);
                }
                new com.bytedance.tux.g.b(view).a(offlineDesc).b();
            } else if (!z) {
                r.a("enter_music_detail_failed", new d().a("group_id", "").a("author_id", "").a("music_id", music.getMid()).a("enter_from", str).f66730a);
            } else {
                String uuid = UUID.randomUUID().toString();
                String mid = music.getMid();
                if (music.getMatchedPGCSoundInfo() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a.a(mid, str, str2, uuid, z2);
                SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), "aweme://music/detail/").withParam("id", music.getMid()).withParam("extra_music_from", str).withParam("process_id", uuid).open();
            }
        }
    }
}
