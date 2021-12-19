package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.aa;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.w.m;
import com.ss.android.ugc.aweme.tools.l;
import com.ss.android.ugc.gamora.recorder.j.a;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.ss.android.ugc.tools.f.b;
import h.u;

public class ec {

    /* renamed from: a  reason: collision with root package name */
    private final a f126690a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.choosemusic.a f126691b;

    /* renamed from: c  reason: collision with root package name */
    private final ShortVideoContext f126692c;

    /* renamed from: d  reason: collision with root package name */
    private final m f126693d;

    /* renamed from: e  reason: collision with root package name */
    private final z f126694e;

    /* renamed from: f  reason: collision with root package name */
    private final j f126695f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.choosemusic.a.a f126696g;

    static {
        Covode.recordClassIndex(83090);
    }

    public void onEvent(l lVar) {
        long j2;
        long j3;
        long j4;
        bw b2;
        aa aaVar;
        String str;
        com.ss.android.ugc.gamora.recorder.choosemusic.a aVar;
        com.ss.android.ugc.aweme.sticker.model.a aVar2;
        boolean z;
        if (lVar.f140203a) {
            c cVar = cr.a().f125295a;
            String str2 = this.f126692c.f124757b.y;
            long maxShootingDuration = g.a().l().getMaxDurationResolver().getMaxShootingDuration(lVar.f140204b, this.f126692c);
            if (cVar == null || TextUtils.isEmpty(str2)) {
                j2 = maxShootingDuration;
                j3 = 0;
            } else {
                j3 = by.a(cVar, str2);
                if (this.f126690a != null && this.f126692c.f124757b.d().isEmpty()) {
                    a aVar3 = this.f126690a;
                    if (j3 > maxShootingDuration) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar3.a(z);
                }
                j2 = Math.min(j3, maxShootingDuration);
            }
            com.ss.android.ugc.aweme.sticker.model.a aVar4 = this.f126692c.f124757b.r;
            if (aVar4 != null) {
                long maxDuration = aVar4.getMaxDuration();
                if (maxDuration > 0 && (aVar2 = this.f126692c.f124757b.r) != null && !aVar2.isMultiBgVideo()) {
                    j2 = Math.min(j2, maxDuration);
                }
            }
            long resolveMaxDurationFor3MinWithMusic = g.a().l().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(this.f126692c, j2);
            if (this.f126692c.c()) {
                u<Long, Long, Long> a2 = com.ss.android.ugc.aweme.shortvideo.record.b.a.a(this.f126692c.F.f124773a, str2, cVar, maxShootingDuration);
                j3 = a2.getFirst().longValue();
                j4 = a2.getSecond().longValue();
                resolveMaxDurationFor3MinWithMusic = a2.getThird().longValue();
            } else {
                j4 = resolveMaxDurationFor3MinWithMusic;
            }
            if (this.f126692c.c()) {
                new bx(this.f126692c);
                b2 = bx.b(maxShootingDuration, resolveMaxDurationFor3MinWithMusic);
            } else {
                new bx(this.f126692c);
                b2 = bx.b(maxShootingDuration, j3);
            }
            m mVar = this.f126693d;
            if (lVar.f140204b) {
                aaVar = aa.FORM_15S;
            } else {
                aaVar = aa.FORM_60S;
            }
            mVar.a(aaVar, !lVar.f140203a);
            this.f126692c.d(!lVar.f140204b);
            this.f126692c.a(j4);
            if (this.f126696g != null) {
                int i2 = this.f126692c.f124757b.q;
                if (lVar.f140208f) {
                    if (this.f126692c.d()) {
                        i2 = com.ss.android.ugc.aweme.shortvideo.record.b.a.a(this.f126692c.F.f124773a);
                    } else if (!this.f126692c.O || (this.f126692c.f124757b.d().isEmpty() && !this.f126692c.f124757b.f124714i)) {
                        i2 = 0;
                    }
                }
                this.f126696g.a(this.f126692c.f124757b.e(), (long) i2, Long.valueOf(this.f126692c.f124757b.k()), this.f126695f.t().f(), ed.f126697a);
            }
            this.f126693d.a(new com.bytedance.creativex.recorder.b.a.j(resolveMaxDurationFor3MinWithMusic));
            this.f126693d.g(lVar.f140205c);
            if (b2 == bw.MUSIC && !lVar.f140207e && (aVar = this.f126691b) != null) {
                aVar.showMusicTips(1);
            }
            ShortVideoContext shortVideoContext = this.f126692c;
            if (!(this.f126690a == null || !shortVideoContext.f124757b.d().isEmpty() || cVar == null)) {
                this.f126690a.a(maxShootingDuration, cVar);
            }
            g.a().e().setDurationMode(this.f126692c.f124757b.t);
            IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new com.bytedance.cukaie.closet.a((byte) 0).a(i.f115645a, IVideoRecordPreferences.class);
            if (iVideoRecordPreferences != null && !iVideoRecordPreferences.isDurationModeManuallyChange(false)) {
                iVideoRecordPreferences.setDurationModeManuallyChange(true);
            }
            if (!lVar.a()) {
                b bVar = new b();
                if (lVar.f140204b) {
                    str = "15s";
                } else {
                    str = "60s";
                }
                b a3 = bVar.a("to_status", str).a("creation_id", this.f126692c.q).a("shoot_way", this.f126692c.r);
                if (this.f126692c.C != 0) {
                    a3.a("draft_id", this.f126692c.C);
                }
                if (!TextUtils.isEmpty(this.f126692c.D)) {
                    a3.a("new_draft_id", this.f126692c.D);
                }
                r.a("video_duration_select", a3.f149193a);
            }
        }
    }

    public ec(ShortVideoContext shortVideoContext, f fVar) {
        this.f126692c = shortVideoContext;
        this.f126690a = (a) fVar.b(a.class, null);
        this.f126691b = (com.ss.android.ugc.gamora.recorder.choosemusic.a) fVar.b(com.ss.android.ugc.gamora.recorder.choosemusic.a.class, null);
        this.f126693d = (m) fVar.a(m.class);
        this.f126694e = (z) fVar.a(z.class);
        this.f126695f = (j) fVar.a(j.class);
        this.f126696g = (com.ss.android.ugc.gamora.recorder.choosemusic.a.a) fVar.b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null);
    }
}
