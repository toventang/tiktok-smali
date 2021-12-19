package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.experiment.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f93313a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f93314b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static String f93315c;

    /* renamed from: d  reason: collision with root package name */
    private static Long f93316d;

    private a() {
    }

    static {
        Covode.recordClassIndex(59156);
    }

    public static final void a() {
        f93316d = Long.valueOf(System.currentTimeMillis());
    }

    public static boolean a(Aweme aweme) {
        return !l.a((Object) f93315c, (Object) aweme.getAid());
    }

    public static final void a(Aweme aweme, String str) {
        Long l2 = f93316d;
        if (l2 != null) {
            long currentTimeMillis = System.currentTimeMillis() - l2.longValue();
            f93316d = null;
            if (aweme != null && str != null) {
                a(aweme, str, "audio_play_duration", ag.a(v.a("duration", String.valueOf(currentTimeMillis))));
            }
        }
    }

    public static void a(Aweme aweme, String str, String str2) {
        a();
        a(aweme, str, "audio_play", ag.a(v.a("enter_method", str2)));
        f93315c = aweme.getAid();
    }

    public static final void a(Aweme aweme, Aweme aweme2, String str, String str2) {
        String str3;
        d a2 = new d().a("enter_from", str).a("log_pb", ac.a.f91473a.a(aweme.getRequestId())).a("status", b.a(c.b())).a("play_order", c.e().toMobString()).a("from_group_id", aweme.getFromGroupId());
        Music music = aweme.getMusic();
        Object obj = "";
        if (music == null || (str3 = String.valueOf(music.getId())) == null) {
            str3 = obj;
        }
        d a3 = a2.a("from_music_id", str3).a("to_group_id", aweme2.getFromGroupId());
        Music music2 = aweme2.getMusic();
        if (music2 != null) {
            obj = Long.valueOf(music2.getId());
        }
        r.a(str2, a3.a("to_music_id", obj).f66730a);
    }

    public static final void a(Aweme aweme, String str, String str2, Map<String, String> map) {
        String str3;
        d a2 = new d().a("enter_from", str);
        User author = aweme.getAuthor();
        Long l2 = null;
        if (author != null) {
            str3 = author.getUid();
        } else {
            str3 = null;
        }
        d a3 = a2.a("author_id", str3).a("group_id", aweme.getAid());
        Music music = aweme.getMusic();
        if (music != null) {
            l2 = Long.valueOf(music.getId());
        }
        r.a(str2, a3.a("music_id", String.valueOf(l2)).a("log_pb", ac.a.f91473a.a(aweme.getRequestId())).a("status", b.a(c.b())).a("play_order", c.e().toMobString()).a(map).f66730a);
    }
}
