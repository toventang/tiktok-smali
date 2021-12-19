package com.ss.android.ugc.aweme.video.simplayer.b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.aweme.video.simplayer.a.a;
import com.ss.android.ugc.aweme.video.simplayer.s;
import com.ss.android.ugc.aweme.video.util.d;
import com.ss.android.ugc.aweme.video.v;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f143845b;

    /* renamed from: a  reason: collision with root package name */
    public int f143846a = 1;

    /* renamed from: c  reason: collision with root package name */
    public v f143847c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f143848d;

    /* renamed from: e  reason: collision with root package name */
    private long f143849e = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f143850f = -1;

    /* renamed from: g  reason: collision with root package name */
    private Object f143851g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f143852h = false;

    /* renamed from: i  reason: collision with root package name */
    private l f143853i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f143854j = false;

    /* renamed from: k  reason: collision with root package name */
    private final Object f143855k = new Object();

    static {
        Covode.recordClassIndex(94136);
    }

    public final void a(boolean z) {
        MethodCollector.i(10477);
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("coldstartplayer", "preCreateNextSessionPlayer : force " + z + ", mNextSessionCreateLock:" + this.f143854j);
        }
        if (!this.f143854j) {
            synchronized (this.f143855k) {
                try {
                    if (!this.f143854j) {
                        if (z || com.bytedance.ies.abmock.b.a().a(true, "feed_cold_start_precreate_prerender_session", 0) != 0) {
                            if (this.f143847c.q() == null && !this.f143847c.f144000b) {
                                this.f143853i.b(new a());
                            }
                            this.f143854j = true;
                        } else {
                            return;
                        }
                    }
                    MethodCollector.o(10477);
                } finally {
                    MethodCollector.o(10477);
                }
            }
        } else {
            MethodCollector.o(10477);
        }
    }

    public final void a(Aweme aweme) {
        if (com.bytedance.ies.abmock.b.a().a(true, "feed_cold_start_enable_prerender", 0) != 1) {
            if (q.a()) {
                com.ss.android.ugc.aweme.bm.b.a("PreCreateHelper", "tryPrepareVideo2FirstStart aweme:".concat(String.valueOf(aweme)));
            }
            b(true);
            if (this.f143846a == 2 && aweme != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f143849e = -1;
                Video video = aweme.getVideo();
                com.ss.android.ugc.aweme.video.simcommon.a.a(s.a(com.ss.android.ugc.aweme.video.simcommon.a.a(video))).setSourceId(aweme.getAid());
                this.f143847c.a(video, aweme.getAudio(), d.a(aweme), false);
                this.f143846a = 3;
                f143845b = true;
                if (com.bytedance.ies.abmock.b.a().a(true, "enable_player_pre_create_pause", 1) == 1) {
                    this.f143853i.f();
                }
                this.f143849e = SystemClock.elapsedRealtime() - elapsedRealtime;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("create_time", this.f143850f);
                    jSONObject.put("prepare_time", this.f143849e);
                    r.a("pre_create_player", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void b(boolean z) {
        MethodCollector.i(10479);
        if (q.a()) {
            com.ss.android.ugc.aweme.bm.b.a("PreCreateHelper", "preCreatePlayer force:" + z + ", mPreloaded:" + this.f143852h);
        }
        if (!this.f143852h) {
            synchronized (this.f143851g) {
                try {
                    if (!this.f143852h) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (z || com.bytedance.ies.abmock.b.a().a(true, "player_precreateplayer", 0) == 1) {
                            this.f143850f = -1;
                            if (this.f143846a == 1 && this.f143847c.q() == null && !this.f143847c.f144000b) {
                                this.f143853i.a(new a());
                                this.f143853i.b();
                                this.f143846a = 2;
                            }
                            this.f143850f = SystemClock.elapsedRealtime() - elapsedRealtime;
                            this.f143852h = true;
                        } else {
                            this.f143852h = true;
                            return;
                        }
                    }
                    MethodCollector.o(10479);
                } finally {
                    MethodCollector.o(10479);
                }
            }
        } else {
            MethodCollector.o(10479);
        }
    }

    public b(v vVar, l lVar) {
        this.f143847c = vVar;
        this.f143853i = lVar;
    }
}
