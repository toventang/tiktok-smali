package com.ss.android.ugc.aweme.lancet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import java.util.HashSet;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f107163a;

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f107164b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f107165c = false;

    static {
        Covode.recordClassIndex(68556);
        HashSet hashSet = new HashSet();
        f107163a = hashSet;
        HashSet hashSet2 = new HashSet();
        f107164b = hashSet2;
        hashSet.add("video_play");
        hashSet.add("play_time");
        hashSet.add("like");
        hashSet.add("follow");
        hashSet.add(UGCMonitor.EVENT_COMMENT);
        hashSet.add("share_video");
        hashSet.add("head");
        hashSet.add(StringSet.name);
        hashSet.add("slide_left");
        hashSet.add("challenge_click");
        hashSet.add("song_cover");
        hashSet.add("shoot");
        hashSet2.add("video_play");
        hashSet2.add("video_play_finish");
        hashSet2.add("play_time");
        hashSet2.add("like");
        hashSet2.add("follow");
        hashSet2.add("post_comment");
        hashSet2.add("share_video");
        hashSet2.add("enter_personal_detail");
        hashSet2.add("enter_tag_detail");
        hashSet2.add("enter_challenge_detail");
        hashSet2.add("shoot");
        hashSet2.add("enter_music_detail");
    }
}
