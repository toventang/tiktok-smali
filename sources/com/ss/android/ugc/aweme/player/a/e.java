package com.ss.android.ugc.aweme.player.a;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bm.b;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.x.ah;
import com.ss.android.ugc.aweme.feed.x.j;
import com.ss.android.ugc.aweme.player.ab.abs.d;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.h.g;
import org.json.JSONObject;

public final class e {

    /* renamed from: i  reason: collision with root package name */
    private static int f114986i;

    /* renamed from: a  reason: collision with root package name */
    public aj f114987a;

    /* renamed from: b  reason: collision with root package name */
    public String f114988b;

    /* renamed from: c  reason: collision with root package name */
    public Video f114989c;

    /* renamed from: d  reason: collision with root package name */
    public String f114990d;

    /* renamed from: e  reason: collision with root package name */
    public Fragment f114991e;

    /* renamed from: f  reason: collision with root package name */
    public int f114992f;

    /* renamed from: g  reason: collision with root package name */
    public String f114993g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f114994h;

    static {
        Covode.recordClassIndex(73925);
    }

    public final void a() {
        VideoUrlModel playAddr;
        int i2;
        aj ajVar = this.f114987a;
        if (ajVar != null && ajVar.b() != null && this.f114989c != null && this.f114991e != null && f114986i < d.a() && (playAddr = this.f114989c.getPlayAddr()) != null) {
            try {
                i2 = g.f();
            } catch (Exception e2) {
                e2.printStackTrace();
                i2 = 0;
            }
            boolean c2 = com.ss.android.ugc.aweme.feed.cache.e.c(this.f114987a.b().getAid());
            boolean userVisibleHint = this.f114991e.getUserVisibleHint();
            int i3 = this.f114992f;
            int a2 = j.a(this.f114987a.b());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            i.b(new f(this, userVisibleHint, i2, a2, playAddr, c2, this.f114987a.b().getAid(), i3, s.b(), s.f93858b.name(), this.f114987a.b(), s.c(), elapsedRealtime), r.a());
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final e f114995a = new e();

        static {
            Covode.recordClassIndex(73926);
        }

        public final a a(int i2) {
            this.f114995a.f114992f = i2;
            return this;
        }

        public final a b(String str) {
            this.f114995a.f114990d = str;
            return this;
        }

        public final a c(String str) {
            this.f114995a.f114993g = str;
            return this;
        }

        public final a a(Fragment fragment) {
            this.f114995a.f114991e = fragment;
            return this;
        }

        public final a a(aj ajVar) {
            this.f114995a.f114987a = ajVar;
            return this;
        }

        public final a a(Video video) {
            this.f114995a.f114989c = video;
            return this;
        }

        public final a a(String str) {
            this.f114995a.f114988b = str;
            return this;
        }

        public final a a(boolean z) {
            this.f114995a.f114994h = z;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(boolean z, int i2, int i3, VideoUrlModel videoUrlModel, boolean z2, String str, int i4, String str2, String str3, Aweme aweme, long j2, long j3) {
        int i5;
        int i6;
        com.ss.android.ugc.aweme.common.s a2 = new com.ss.android.ugc.aweme.common.s().a("request_id", this.f114990d).a("duration", this.f114988b);
        if (!z) {
            i5 = 2;
        } else {
            i5 = 1;
        }
        com.ss.android.ugc.aweme.common.s a3 = a2.a("is_success", String.valueOf(i5)).a("internet_speed", String.valueOf(i2)).a("video_quality", String.valueOf(i3)).a("is_cache", String.valueOf(ac.a(videoUrlModel) ? 1 : 0));
        if (z2) {
            i6 = -1;
        } else if (com.ss.android.ugc.aweme.metrics.b.a.f109531a) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        JSONObject a4 = a3.a("is_first", String.valueOf(i6)).a("group_id", str).a("status", String.valueOf(i4)).a("is_from_feed_cache", String.valueOf(z2 ? 1 : 0)).a("top_activity", str2).a("feed_tab", str3).a("play_sess", String.valueOf(this.f114993g)).a("is_audio_mode", String.valueOf(this.f114994h ? 1 : 0)).a("has_tts", Integer.toString(ah.i(aweme))).a("has_cla", Integer.toString(ah.h(aweme))).a();
        if (!z2) {
            com.ss.android.ugc.aweme.metrics.b.a.f109531a = false;
        }
        r.onEvent(MobClick.obtain().setEventName("video_request_response").setLabelName("perf_monitor").setValue(str).setJsonObject(a4));
        r.a("video_request_response", a4);
        b.b("video_request_response", a4);
        long j4 = 0;
        if (j2 > 0) {
            j4 = j3 - j2;
        }
        String l2 = Long.toString(j4);
        if (!com.ss.android.ugc.aweme.metrics.b.a.a()) {
            i.b(new com.ss.android.ugc.aweme.metrics.b.b(a4, "video_request_response", "duration", l2, com.bytedance.ies.ugc.appcontext.d.a()), i.f4824a);
        }
        f114986i++;
        return null;
    }
}
