package com.ss.android.ugc.aweme.dsp.playerservice.plugin;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.dsp.experiment.a;
import com.ss.android.ugc.aweme.dsp.playerservice.a.d;
import com.ss.android.ugc.aweme.dsp.playerservice.a.h;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.b.g;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;
import java.util.HashMap;

public final class b implements h, j, m, ActivityStack.b {

    /* renamed from: a  reason: collision with root package name */
    public d f83591a;

    /* renamed from: b  reason: collision with root package name */
    private c f83592b;

    /* renamed from: c  reason: collision with root package name */
    private f f83593c = f.PLAYBACK_STATE_STOPPED;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playerservice.b.f f83594d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playerservice.b.f f83595e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f83596f;

    /* renamed from: g  reason: collision with root package name */
    private Long f83597g;

    /* renamed from: h  reason: collision with root package name */
    private Long f83598h;

    static {
        Covode.recordClassIndex(52167);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final c a_(c cVar) {
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a_(long j2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean b(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final d v() {
        d dVar = this.f83591a;
        if (dVar == null) {
            l.a("mMediaPlayerService");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        d v = v();
        if (v != null) {
            v.b((j) this);
        }
        d v2 = v();
        if (v2 != null) {
            v2.b((h) this);
        }
        ActivityStack.removeAppBackGroundListener(this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        v().e((com.ss.android.ugc.aweme.dsp.playerservice.b.f) null);
        d v = v();
        if (v != null) {
            v.a((j) this);
        }
        d v2 = v();
        if (v2 != null) {
            v2.a((h) this);
        }
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void a() {
        c cVar;
        com.ss.android.ugc.aweme.dsp.playerservice.b.h d2;
        Long l2;
        if (a.a().getDspEnableBgPlay() && this.f83593c == f.PLAYBACK_STATE_PLAYING && (cVar = this.f83592b) != null && (d2 = cVar.d()) != null) {
            long t = v().t();
            d v = v();
            if (v != null) {
                l2 = Long.valueOf(v.g());
            } else {
                l2 = null;
            }
            com.ss.android.ugc.aweme.dsp.common.b.a.a(d2, t, l2.longValue(), new com.ss.android.ugc.aweme.dsp.playerservice.b.f("PAUSE_FROM_ON_BACKGROUND"));
            v().u();
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void b() {
        c cVar;
        com.ss.android.ugc.aweme.dsp.playerservice.b.h d2;
        Long l2;
        if (a.a().getDspEnableBgPlay() && this.f83593c == f.PLAYBACK_STATE_PLAYING && (cVar = this.f83592b) != null && (d2 = cVar.d()) != null) {
            long t = v().t();
            d v = v();
            if (v != null) {
                l2 = Long.valueOf(v.g());
            } else {
                l2 = null;
            }
            com.ss.android.ugc.aweme.dsp.common.b.a.a(d2, t, l2.longValue(), new com.ss.android.ugc.aweme.dsp.playerservice.b.f("RESUME_FROM_ON_FOREGROUND"));
            v().u();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
        com.ss.android.ugc.aweme.dsp.playerservice.b.h d2;
        com.ss.android.ugc.aweme.dsp.playerservice.b.h d3;
        String str;
        this.f83596f = true;
        c cVar = this.f83592b;
        String str2 = "1";
        if (!(cVar == null || (d3 = cVar.d()) == null)) {
            g l2 = v().l();
            l.d(d3, "");
            l.d(l2, "");
            HashMap hashMap = new HashMap();
            hashMap.put("video_group_id", d3.f83379a);
            hashMap.put("video_author_id", d3.f83380b);
            hashMap.put("music_id", d3.f83381c);
            hashMap.put("full_clip_id", d3.f83382d);
            hashMap.put("meta_song_id", d3.f83383e);
            if (ActivityStack.isAppBackGround()) {
                str = str2;
            } else {
                str = "0";
            }
            hashMap.put("is_background", str);
            hashMap.put("scene_name", d3.f83384f);
            hashMap.put("enter_method", d3.f83385g);
            hashMap.put("enter_from", d3.f83386h);
            hashMap.put("request_id", d3.f83387i);
            hashMap.put("mvid", d3.f83388j);
            hashMap.put("cache_size", String.valueOf(l2.f83376a));
            hashMap.put("audio_full_duration", String.valueOf(l2.f83377b));
            hashMap.put("play_bitrate", String.valueOf(l2.f83378c));
            r.a("play_music_quality", hashMap);
        }
        Long l3 = this.f83597g;
        if (l3 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - l3.longValue();
            c cVar2 = this.f83592b;
            if (!(cVar2 == null || (d2 = cVar2.d()) == null)) {
                l.d(d2, "");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("video_group_id", d2.f83379a);
                hashMap2.put("video_author_id", d2.f83380b);
                hashMap2.put("music_id", d2.f83381c);
                hashMap2.put("full_clip_id", d2.f83382d);
                hashMap2.put("meta_song_id", d2.f83383e);
                if (!ActivityStack.isAppBackGround()) {
                    str2 = "0";
                }
                hashMap2.put("is_background", str2);
                hashMap2.put("scene_name", d2.f83384f);
                hashMap2.put("enter_method", d2.f83385g);
                hashMap2.put("enter_from", d2.f83386h);
                hashMap2.put("request_id", d2.f83387i);
                hashMap2.put("mvid", d2.f83388j);
                hashMap2.put("first_frame_duration", String.valueOf(elapsedRealtime));
                r.a("play_music_first_frame", hashMap2);
            }
            this.f83597g = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean c(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        this.f83594d = fVar;
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean d(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        this.f83595e = fVar;
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f83591a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(c cVar) {
        this.f83592b = cVar;
        this.f83594d = null;
        this.f83595e = null;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        c cVar;
        com.ss.android.ugc.aweme.dsp.playerservice.b.h d2;
        String str;
        l.d(aVar, "");
        l.d(aVar, "");
        if (!this.f83596f && (cVar = this.f83592b) != null && (d2 = cVar.d()) != null) {
            String valueOf = String.valueOf(aVar.f83407a);
            l.d(d2, "");
            l.d(valueOf, "");
            HashMap hashMap = new HashMap();
            hashMap.put("video_group_id", d2.f83379a);
            hashMap.put("video_author_id", d2.f83380b);
            hashMap.put("music_id", d2.f83381c);
            hashMap.put("full_clip_id", d2.f83382d);
            hashMap.put("meta_song_id", d2.f83383e);
            if (ActivityStack.isAppBackGround()) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_background", str);
            hashMap.put("scene_name", d2.f83384f);
            hashMap.put("enter_method", d2.f83385g);
            hashMap.put("enter_from", d2.f83386h);
            hashMap.put("request_id", d2.f83387i);
            hashMap.put("mvid", d2.f83388j);
            hashMap.put("error_code", valueOf);
            r.a("play_music_fail", hashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        com.ss.android.ugc.aweme.dsp.playerservice.b.h d2;
        String str;
        l.d(bVar, "");
        l.d(bVar, "");
        int i2 = c.f83599a[bVar.ordinal()];
        if (i2 == 1) {
            this.f83598h = Long.valueOf(SystemClock.elapsedRealtime());
        } else if (i2 != 2) {
            this.f83598h = null;
        } else {
            Long l2 = this.f83598h;
            if (l2 != null) {
                long longValue = l2.longValue();
                c cVar = this.f83592b;
                if (!(cVar == null || (d2 = cVar.d()) == null)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
                    l.d(d2, "");
                    HashMap hashMap = new HashMap();
                    hashMap.put("video_group_id", d2.f83379a);
                    hashMap.put("video_author_id", d2.f83380b);
                    hashMap.put("music_id", d2.f83381c);
                    hashMap.put("full_clip_id", d2.f83382d);
                    hashMap.put("meta_song_id", d2.f83383e);
                    if (ActivityStack.isAppBackGround()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    hashMap.put("is_background", str);
                    hashMap.put("scene_name", d2.f83384f);
                    hashMap.put("enter_method", d2.f83385g);
                    hashMap.put("enter_from", d2.f83386h);
                    hashMap.put("request_id", d2.f83387i);
                    hashMap.put("mvid", d2.f83388j);
                    hashMap.put("block_duration", String.valueOf(elapsedRealtime));
                    r.a("play_music_block", hashMap);
                }
                this.f83598h = null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(f fVar) {
        c cVar;
        com.ss.android.ugc.aweme.dsp.playerservice.b.h d2;
        c cVar2;
        com.ss.android.ugc.aweme.dsp.playerservice.b.h d3;
        com.ss.android.ugc.aweme.dsp.playerservice.b.h d4;
        Long l2;
        Integer num;
        b bVar = this;
        l.d(fVar, "");
        int i2 = c.f83600b[fVar.ordinal()];
        if (i2 != 1) {
            String str = "1";
            if (i2 != 2) {
                Long l3 = null;
                if (i2 != 3) {
                    if (i2 == 4) {
                        c cVar3 = bVar.f83592b;
                        if (!(cVar3 == null || (d4 = cVar3.d()) == null)) {
                            d v = v();
                            if (v != null) {
                                l2 = Long.valueOf(v.t());
                            } else {
                                l2 = null;
                            }
                            long longValue = l2.longValue();
                            d v2 = v();
                            if (v2 != null) {
                                num = Integer.valueOf(v2.h());
                            } else {
                                num = null;
                            }
                            long intValue = (long) num.intValue();
                            d v3 = v();
                            if (v3 != null) {
                                l3 = Long.valueOf(v3.g());
                            }
                            long longValue2 = l3.longValue();
                            com.ss.android.ugc.aweme.dsp.common.b.a.a(d4, longValue, longValue2, bVar.f83595e);
                            com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar2 = bVar.f83595e;
                            l.d(d4, "");
                            HashMap hashMap = new HashMap();
                            hashMap.put("video_group_id", d4.f83379a);
                            hashMap.put("video_author_id", d4.f83380b);
                            hashMap.put("music_id", d4.f83381c);
                            hashMap.put("full_clip_id", d4.f83382d);
                            hashMap.put("meta_song_id", d4.f83383e);
                            if (!ActivityStack.isAppBackGround()) {
                                str = "0";
                            }
                            hashMap.put("is_background", str);
                            hashMap.put("scene_name", d4.f83384f);
                            hashMap.put("enter_method", d4.f83385g);
                            hashMap.put("enter_from", d4.f83386h);
                            hashMap.put("request_id", d4.f83387i);
                            hashMap.put("audio_over_status", com.ss.android.ugc.aweme.dsp.common.b.a.a(fVar2));
                            hashMap.put("duration", String.valueOf(intValue));
                            double d5 = (double) intValue;
                            double d6 = (double) longValue2;
                            Double.isNaN(d5);
                            Double.isNaN(d6);
                            hashMap.put("duration_pct", String.valueOf(((float) h.g.a.a((d5 / d6) * 100.0d)) / 100.0f));
                            hashMap.put("mvid", d4.f83388j);
                            r.a("audio_finish", hashMap);
                        }
                        bVar = this;
                    }
                } else if (!(!bVar.f83593c.isPlayingState() || (cVar2 = bVar.f83592b) == null || (d3 = cVar2.d()) == null)) {
                    long t = v().t();
                    d v4 = v();
                    if (v4 != null) {
                        l3 = Long.valueOf(v4.g());
                    }
                    com.ss.android.ugc.aweme.dsp.common.b.a.a(d3, t, l3.longValue(), bVar.f83594d);
                }
            } else if (!(!bVar.f83593c.isStartState() || (cVar = bVar.f83592b) == null || (d2 = cVar.d()) == null)) {
                l.d(d2, "");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("video_group_id", d2.f83379a);
                hashMap2.put("video_author_id", d2.f83380b);
                hashMap2.put("music_id", d2.f83381c);
                hashMap2.put("full_clip_id", d2.f83382d);
                hashMap2.put("meta_song_id", d2.f83383e);
                if (!ActivityStack.isAppBackGround()) {
                    str = "0";
                }
                hashMap2.put("is_background", str);
                hashMap2.put("scene_name", d2.f83384f);
                hashMap2.put("enter_method", d2.f83385g);
                hashMap2.put("enter_from", d2.f83386h);
                hashMap2.put("request_id", d2.f83387i);
                hashMap2.put("mvid", d2.f83388j);
                r.a("audio_play", hashMap2);
            }
        } else {
            bVar.f83596f = false;
            bVar.f83597g = Long.valueOf(SystemClock.elapsedRealtime());
        }
        bVar.f83593c = fVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }
}
