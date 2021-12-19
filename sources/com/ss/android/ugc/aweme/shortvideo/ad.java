package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.j;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.cz.a.d;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import h.f.b.l;
import h.u;

public final class ad {

    /* renamed from: b  reason: collision with root package name */
    public static final long f124874b = g.a().l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: c  reason: collision with root package name */
    public static final a f124875c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ShortVideoContext f124876a;

    /* renamed from: d  reason: collision with root package name */
    private final e f124877d;

    /* renamed from: e  reason: collision with root package name */
    private final m f124878e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.choosemusic.a f124879f;

    /* renamed from: g  reason: collision with root package name */
    private final f f124880g;

    public static final class a {
        static {
            Covode.recordClassIndex(82047);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(82046);
    }

    public static final class b implements k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad f124881a;

        static {
            Covode.recordClassIndex(82048);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ad adVar) {
            this.f124881a = adVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a
        public final void a(d dVar) {
            this.f124881a.f124876a.aw = k.a(dVar);
        }
    }

    public final void a(d dVar) {
        long j2;
        long j3;
        long j4;
        long j5;
        com.ss.android.ugc.aweme.sticker.model.a aVar;
        bw a2;
        com.ss.android.ugc.gamora.recorder.j.a aVar2;
        l.d(dVar, "");
        if (dVar.f79323a) {
            if (!this.f124877d.isFinishing()) {
                dn.a(this.f124876a);
                dm.d(this.f124876a);
                this.f124878e.a(new j(this.f124876a.f124757b.f124707b));
                this.f124879f.handleCancelMusicResultEvent();
            }
        } else if (!TextUtils.isEmpty(dVar.f79326d) && !this.f124877d.isFinishing()) {
            String str = dVar.f79326d;
            c cVar = dVar.f79325c;
            String str2 = dVar.f79324b;
            if (this.f124876a.f124757b.t) {
                j2 = f124874b;
            } else {
                j2 = 15000;
            }
            if (com.ss.android.ugc.aweme.shortvideo.record.b.a.b(this.f124876a.F.f124773a)) {
                StitchParams stitchParams = this.f124876a.F.f124773a;
                if (stitchParams == null) {
                    l.b();
                }
                u<Long, Long, Long> a3 = com.ss.android.ugc.aweme.shortvideo.record.b.a.a(stitchParams, str, cVar, j2);
                j4 = a3.component1().longValue();
                j3 = a3.component2().longValue();
                j5 = a3.component3().longValue();
            } else {
                if (cVar == null || TextUtils.isEmpty(str)) {
                    j3 = j2;
                    j4 = 0;
                } else {
                    j4 = by.a(cVar, str);
                    j3 = Math.min(j4, j2);
                }
                com.ss.android.ugc.aweme.sticker.model.a aVar3 = this.f124876a.f124757b.r;
                if (aVar3 != null) {
                    long maxDuration = aVar3.getMaxDuration();
                    if (maxDuration > 0 && (aVar = this.f124876a.f124757b.r) != null && !aVar.isMultiBgVideo()) {
                        j3 = Math.min(j3, maxDuration);
                    }
                }
                j5 = j3;
            }
            this.f124876a.f124765j = str2;
            this.f124876a.a(str);
            this.f124876a.a(j3);
            k.a(this.f124876a.f124757b.y, new b(this));
            this.f124879f.handleChooseMusicResultEvent(cVar, str);
            if (!(cVar == null || (aVar2 = (com.ss.android.ugc.gamora.recorder.j.a) this.f124880g.b(com.ss.android.ugc.gamora.recorder.j.a.class, null)) == null)) {
                aVar2.a(j2, cVar);
            }
            if (this.f124876a.c()) {
                new bx(this.f124876a);
                a2 = bx.a(j2, j5);
            } else {
                new bx(this.f124876a);
                a2 = bx.a(j2, j4);
            }
            if (a2 == bw.MUSIC && dVar.f79327e) {
                this.f124879f.showMusicTips(1);
            }
            this.f124878e.a(new j(j5));
        }
    }

    public ad(e eVar, m mVar, com.ss.android.ugc.gamora.recorder.choosemusic.a aVar, ShortVideoContext shortVideoContext, f fVar) {
        l.d(eVar, "");
        l.d(mVar, "");
        l.d(aVar, "");
        l.d(shortVideoContext, "");
        l.d(fVar, "");
        this.f124877d = eVar;
        this.f124878e = mVar;
        this.f124879f = aVar;
        this.f124876a = shortVideoContext;
        this.f124880g = fVar;
    }
}
