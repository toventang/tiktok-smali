package com.ss.android.ugc.aweme.preload.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.language.f;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import com.ss.android.ugc.aweme.ml.b.c;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.HashMap;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final h f115790d = i.a(m.SYNCHRONIZED, C2959b.f115795a);

    /* renamed from: e  reason: collision with root package name */
    public static final a f115791e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f115792a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f115793b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f115794c;

    public static final class a {
        static {
            Covode.recordClassIndex(74695);
        }

        public static b a() {
            return (b) b.f115790d.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.b.b$b  reason: collision with other inner class name */
    static final class C2959b extends h.f.b.m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2959b f115795a = new C2959b();

        static {
            Covode.recordClassIndex(74696);
        }

        C2959b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static {
        Covode.recordClassIndex(74694);
    }

    public final boolean a(Aweme aweme, boolean z, boolean z2) {
        int i2;
        if (aweme == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        c feedTrackRangeInfo = MLDataCenterService.b.f110379a.getFeedTrackRangeInfo(aweme.getAid(), 5, true);
        if (feedTrackRangeInfo != null) {
            int i3 = 0;
            int i4 = 0;
            do {
                if (i4 < 0 || i4 >= feedTrackRangeInfo.f110416e.size()) {
                    hashMap.put("play_time_".concat(String.valueOf(i3)), 0);
                } else {
                    String concat = "play_time_".concat(String.valueOf(i3));
                    Long l2 = feedTrackRangeInfo.f110416e.get(i4);
                    l.b(l2, "");
                    hashMap.put(concat, l2);
                    i4++;
                }
                i3++;
            } while (i3 < 5);
            hashMap.put("finish_cnt", Integer.valueOf(feedTrackRangeInfo.f110414c));
            hashMap.put("like_cnt", Integer.valueOf(feedTrackRangeInfo.f110412a));
            hashMap.put("head_cnt", Integer.valueOf(feedTrackRangeInfo.f110415d));
            hashMap.put("follow_cnt", Integer.valueOf(this.f115792a));
            hashMap.put("comment_cnt", Integer.valueOf(feedTrackRangeInfo.f110413b));
        }
        Video video = aweme.getVideo();
        if (video != null) {
            hashMap.put("v_duration", Integer.valueOf(video.getVideoLength()));
        }
        hashMap.put("is_ad", Integer.valueOf(aweme.isAd() ? 1 : 0));
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            hashMap.put("v_comments", Long.valueOf(statistics.getCommentCount()));
            hashMap.put("v_likes", Long.valueOf(statistics.getDiggCount()));
            hashMap.put("v_vvs", Long.valueOf(statistics.getPlayCount()));
            hashMap.put("v_shares", Long.valueOf(statistics.getShareCount()));
            hashMap.put("v_downloads", Long.valueOf(statistics.getDownloadCount()));
        }
        hashMap.put("follow_status", Integer.valueOf(aweme.getFollowStatus()));
        hashMap.put("cur_finish", Integer.valueOf(z ? 1 : 0));
        hashMap.put("cur_like", Integer.valueOf(aweme.isLike() ? 1 : 0));
        if (aweme.getFollowStatus() > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        hashMap.put("cur_follow", Integer.valueOf(i2));
        hashMap.put("cur_favorite", Integer.valueOf(aweme.isCollected() ? 1 : 0));
        if (z2) {
            hashMap.put("cur_comment", Integer.valueOf(this.f115793b ? 1 : 0));
        }
        String a2 = f.a();
        l.b(a2, "");
        hashMap.put("country", a2);
        if (z2) {
            float smartJudge = SmartPreloadProfileV2Service.b.f110391a.smartJudge(aweme, hashMap, hashMap2);
            SmartPreloadProfileV2Experiment.PreloadProfileMLModel a3 = SmartPreloadProfileV2Experiment.a.a();
            if (a3 == null || smartJudge < a3.clientAIThreshold) {
                return false;
            }
            return true;
        }
        float smartJudge2 = SmartPreloadCommentV2Service.b.f110389a.smartJudge(aweme, hashMap, hashMap2);
        SmartPreloadCommentV2Experiment.PreloadCommentMLModel a4 = SmartPreloadCommentV2Experiment.a.a();
        if (a4 == null || smartJudge2 < a4.clientAIThreshold) {
            return false;
        }
        return true;
        return false;
    }
}
