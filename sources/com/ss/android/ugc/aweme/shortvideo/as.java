package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.aa;
import com.bytedance.creativex.recorder.b.a.j;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ftc.b.d;
import com.ss.android.ugc.aweme.ftc.f.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.tools.l;
import com.ss.android.ugc.tools.f.b;
import h.u;

public final class as {

    /* renamed from: a  reason: collision with root package name */
    private static final long f124962a = g.a().l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: b  reason: collision with root package name */
    private final a f124963b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.ftc.b.a f124964c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortVideoContext f124965d;

    /* renamed from: e  reason: collision with root package name */
    private final m f124966e;

    static {
        Covode.recordClassIndex(82097);
    }

    public final void onEvent(l lVar) {
        long j2;
        long j3;
        long j4;
        long j5;
        bw b2;
        aa aaVar;
        String str;
        com.ss.android.ugc.aweme.ftc.b.a aVar;
        com.ss.android.ugc.aweme.sticker.model.a aVar2;
        boolean z;
        if (lVar.f140203a) {
            c cVar = cr.a().f125295a;
            String str2 = this.f124965d.f124757b.y;
            if (lVar.f140204b) {
                j2 = 15000;
            } else {
                j2 = f124962a;
            }
            if (cVar == null || TextUtils.isEmpty(str2)) {
                j3 = j2;
                j4 = 0;
            } else {
                j4 = by.a(cVar, str2);
                if (this.f124963b != null && this.f124965d.f124757b.d().isEmpty()) {
                    a aVar3 = this.f124963b;
                    if (j4 > j2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar3.a(z);
                }
                j3 = Math.min(j4, j2);
            }
            com.ss.android.ugc.aweme.sticker.model.a aVar4 = this.f124965d.f124757b.r;
            if (aVar4 != null) {
                long maxDuration = aVar4.getMaxDuration();
                if (maxDuration > 0 && (aVar2 = this.f124965d.f124757b.r) != null && !aVar2.isMultiBgVideo()) {
                    j3 = Math.min(j3, maxDuration);
                }
            }
            if (this.f124965d.c()) {
                u<Long, Long, Long> a2 = com.ss.android.ugc.aweme.shortvideo.record.b.a.a(this.f124965d.F.f124773a, str2, cVar, j2);
                j4 = a2.getFirst().longValue();
                j5 = a2.getSecond().longValue();
                j3 = a2.getThird().longValue();
            } else {
                j5 = j3;
            }
            if (this.f124965d.c()) {
                b2 = d.b(j2, j3);
            } else {
                b2 = d.b(j2, j4);
            }
            m mVar = this.f124966e;
            if (lVar.f140204b) {
                aaVar = aa.FORM_15S;
            } else {
                aaVar = aa.FORM_60S;
            }
            mVar.a(aaVar, !lVar.f140203a);
            this.f124965d.d(!lVar.f140204b);
            this.f124965d.a(j5);
            this.f124966e.a(new j(j3));
            if (b2 == bw.MUSIC && !lVar.f140207e && (aVar = this.f124964c) != null) {
                aVar.a((Integer) 1);
            }
            ShortVideoContext shortVideoContext = this.f124965d;
            if (!(this.f124963b == null || !shortVideoContext.f124757b.d().isEmpty() || cVar == null)) {
                if (((long) cVar.shootDuration) > j2 || Math.abs(cVar.shootDuration - cVar.duration) >= 1000) {
                    this.f124963b.a(true);
                } else {
                    this.f124963b.a(false);
                }
            }
            g.a().e().setDurationMode(this.f124965d.f124757b.t);
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
                b a3 = bVar.a("to_status", str).a("creation_id", this.f124965d.q).a("shoot_way", this.f124965d.r);
                if (this.f124965d.C != 0) {
                    a3.a("draft_id", this.f124965d.C);
                }
                if (!TextUtils.isEmpty(this.f124965d.D)) {
                    a3.a("new_draft_id", this.f124965d.D);
                }
                r.a("change_record_mode", a3.f149193a);
            }
        }
    }

    public as(ShortVideoContext shortVideoContext, f fVar) {
        this.f124965d = shortVideoContext;
        this.f124963b = (a) fVar.b(a.class, null);
        this.f124964c = (com.ss.android.ugc.aweme.ftc.b.a) fVar.b(com.ss.android.ugc.aweme.ftc.b.a.class, null);
        this.f124966e = (m) fVar.a(m.class);
    }
}
