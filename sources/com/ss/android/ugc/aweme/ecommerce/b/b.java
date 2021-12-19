package com.ss.android.ugc.aweme.ecommerce.b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.x.j;
import com.ss.android.ugc.aweme.utils.bk;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.h.g;
import com.ss.android.ugc.playerkit.model.o;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static long f84664a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final b f84665b = new b();

    private b() {
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final d f84675a = new d();

        static {
            Covode.recordClassIndex(52868);
        }

        d() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enter_from", "TEMAI");
                r.a("video_request", jSONObject);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(52864);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.b$b  reason: collision with other inner class name */
    static final class CallableC2024b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final CallableC2024b f84672a = new CallableC2024b();

        static {
            Covode.recordClassIndex(52866);
        }

        CallableC2024b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.f84664a;
                if (b.f84664a != -1 && elapsedRealtime > 80) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", elapsedRealtime);
                    jSONObject.put("enter_from", "TEMAI");
                    r.a("video_block", jSONObject);
                }
                b.f84664a = -1;
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            return z.f158842a;
        }
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Video f84666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f84667b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f84668c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f84669d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f84670e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f84671f;

        static {
            Covode.recordClassIndex(52865);
        }

        a(Video video, o oVar, long j2, int i2, int i3, int i4) {
            this.f84666a = video;
            this.f84667b = oVar;
            this.f84668c = j2;
            this.f84669d = i2;
            this.f84670e = i3;
            this.f84671f = i4;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Integer num;
            try {
                VideoUrlModel playAddr = this.f84666a.getPlayAddr();
                int videoLength = this.f84666a.getVideoLength();
                int b2 = j.b(playAddr);
                int f2 = g.f();
                int b3 = ac.b(this.f84666a.getPlayAddr()) / 1024;
                boolean isBytevc1 = this.f84667b.isBytevc1();
                if (bk.f142679b != null) {
                    num = bk.f142679b;
                } else {
                    num = -1;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", this.f84668c);
                jSONObject.put("vduration", ((long) videoLength) * 1000);
                jSONObject.put("video_quality", b2);
                jSONObject.put("internet_speed", f2);
                jSONObject.put("pre_cache_size", b3);
                jSONObject.put("video_bitrate", this.f84669d);
                jSONObject.put("play_bitrate", this.f84670e);
                jSONObject.put("is_bytevc1", isBytevc1);
                jSONObject.put("codec_name", this.f84671f);
                l.b(num, "");
                jSONObject.put("cpu_rate", num.intValue());
                jSONObject.put("enter_from", "TEMAI");
                r.a("video_play_quality", jSONObject);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            return z.f158842a;
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Video f84673a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.playerkit.model.l f84674b;

        static {
            Covode.recordClassIndex(52867);
        }

        c(Video video, com.ss.android.ugc.playerkit.model.l lVar) {
            this.f84673a = video;
            this.f84674b = lVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2;
            String videoUrlModel;
            try {
                int videoLength = this.f84673a.getVideoLength();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", String.valueOf(this.f84674b.f148749d));
                jSONObject.put("error_internal_code", String.valueOf(this.f84674b.f148750e));
                jSONObject.put("error_info", this.f84674b.f148751f.toString());
                int i3 = 1;
                if (this.f84674b.f148747b) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("is_bytevc1", String.valueOf(i2));
                if (!this.f84674b.f148748c) {
                    i3 = 0;
                }
                jSONObject.put("is_dash", String.valueOf(i3));
                jSONObject.put("is_ad", "0");
                jSONObject.put("vduration", ((long) videoLength) * 1000);
                jSONObject.put("internet_speed", String.valueOf(g.f()));
                jSONObject.put("cache_size", String.valueOf(ac.c(this.f84673a.getPlayAddr())));
                jSONObject.put("video_size", String.valueOf(ac.d(this.f84673a.getPlayAddr())));
                if (this.f84673a.getPlayAddr() == null) {
                    videoUrlModel = "null";
                } else {
                    videoUrlModel = this.f84673a.getPlayAddr().toString();
                    l.b(videoUrlModel, "");
                }
                jSONObject.put("play_url", videoUrlModel);
                jSONObject.put("is_from_feed_cache", "0");
                jSONObject.put("enter_from", "TEMAI");
                r.a("video_play_failed", jSONObject);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            return z.f158842a;
        }
    }
}
