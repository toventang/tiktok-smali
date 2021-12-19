package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.c;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    g f127891a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a f127892b;

    static {
        Covode.recordClassIndex(83827);
    }

    public final void a(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData2 != null) {
            Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
            Integer num = (Integer) playInOutTime.first;
            Integer num2 = (Integer) playInOutTime.second;
            g gVar = this.f127891a;
            if (gVar != null) {
                gVar.r();
            }
            g gVar2 = this.f127891a;
            if (gVar2 != null) {
                int unused = gVar2.a(com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoRecordData2), false, true);
            }
            b(multiEditVideoRecordData);
            float f2 = 1.0f;
            if (multiEditVideoRecordData.isSingleVideo) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = multiEditVideoRecordData.segmentDataList.get(0);
                l.b(multiEditVideoSegmentRecordData, "");
                f2 = multiEditVideoSegmentRecordData.getVideoSpeed();
            }
            a(multiEditVideoRecordData, (int) (((float) num.intValue()) / f2), (int) (((float) num2.intValue()) / f2));
            g gVar3 = this.f127891a;
            if (gVar3 != null) {
                gVar3.a(true);
            }
            d();
            g gVar4 = this.f127891a;
            if (gVar4 != null) {
                gVar4.p();
            }
            e();
            l.b(num, "");
            int intValue = num.intValue();
            l.b(num2, "");
            a(intValue, num2.intValue(), f2);
            g gVar5 = this.f127891a;
            if (gVar5 != null) {
                gVar5.u();
            }
            a((long) (((float) num.intValue()) / f2), x.f.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    public final void a() {
        g gVar = this.f127891a;
        if (gVar != null) {
            gVar.t();
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a aVar = this.f127892b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void b() {
        g gVar = this.f127891a;
        if (gVar != null) {
            gVar.u();
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a aVar = this.f127892b;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void c() {
        g gVar = this.f127891a;
        if (gVar != null) {
            gVar.a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        g gVar;
        g gVar2 = this.f127891a;
        if (gVar2 != null) {
            gVar2.a(x.e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
        }
        if (c.a() && (gVar = this.f127891a) != null) {
            gVar.c(b.f127976e, b.f127977f);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        g gVar;
        if (c.b() && (gVar = this.f127891a) != null) {
            gVar.a(b.f127972a, b.f127973b, b.f127974c, b.f127975d);
        }
    }

    public final void a(g gVar) {
        if (this.f127891a == null) {
            this.f127891a = gVar;
            if (gVar != null) {
                gVar.c(new a(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(MultiEditVideoRecordData multiEditVideoRecordData) {
        g gVar;
        if (multiEditVideoRecordData != null) {
            if (!com.ss.android.ugc.aweme.shortvideo.af.b.a(multiEditVideoRecordData.musicPath, i.f115645a)) {
                g gVar2 = this.f127891a;
                if (gVar2 != null) {
                    gVar2.a(0, 0, multiEditVideoRecordData.originVolume);
                    return;
                }
                return;
            }
            multiEditVideoRecordData.musicDuration = fa.a(multiEditVideoRecordData.musicPath);
            g gVar3 = this.f127891a;
            if (gVar3 != null) {
                String str = multiEditVideoRecordData.musicPath;
                l.b(str, "");
                int a2 = gVar3.a(str, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicDuration, multiEditVideoRecordData.isSoundLoop);
                g gVar4 = this.f127891a;
                if (gVar4 != null) {
                    gVar4.a(a2, 1, multiEditVideoRecordData.musicVolume);
                }
                if (a2 > 0 && (gVar = this.f127891a) != null) {
                    gVar.a(0, 0, multiEditVideoRecordData.originVolume);
                }
                multiEditVideoRecordData.musicIndex = a2;
            }
        }
    }

    public final void a(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            g gVar = this.f127891a;
            if (gVar != null) {
                gVar.r();
            }
            VERecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoRecordData);
            Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
            a2.a(((long) ((Integer) playInOutTime.first).intValue()) * 1000, ((long) ((Integer) playInOutTime.second).intValue()) * 1000);
            g gVar2 = this.f127891a;
            if (gVar2 != null) {
                int unused = gVar2.a(a2, false, true);
            }
            b(multiEditVideoRecordData);
            g gVar3 = this.f127891a;
            if (gVar3 != null) {
                gVar3.a(true);
            }
            d();
            g gVar4 = this.f127891a;
            if (gVar4 != null) {
                gVar4.p();
            }
            e();
            g gVar5 = this.f127891a;
            if (gVar5 != null) {
                gVar5.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }

    public final void a(long j2, x.f fVar) {
        l.d(fVar, "");
        g gVar = this.f127891a;
        if (gVar != null) {
            gVar.a((int) j2, fVar);
        }
    }

    public final void a(int i2, int i3, float f2) {
        g gVar = this.f127891a;
        if (gVar != null) {
            if (((float) i3) > ((float) gVar.j()) * f2) {
                i3 = (int) (((float) gVar.j()) * f2);
            }
            gVar.b(i2, i3);
        }
    }

    public final void a(MultiEditVideoRecordData multiEditVideoRecordData, int i2, int i3) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.musicIndex != -1) {
            g gVar = this.f127891a;
            if (gVar != null && i3 > gVar.j()) {
                i3 = gVar.j();
            }
            int i4 = i3 - i2;
            if (i4 > multiEditVideoRecordData.musicDuration) {
                i4 = multiEditVideoRecordData.musicDuration;
            }
            g gVar2 = this.f127891a;
            if (gVar2 != null) {
                gVar2.a(multiEditVideoRecordData.musicIndex, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicTrimIn + i4, i2, i2 + i4, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127893a;

        static {
            Covode.recordClassIndex(83828);
        }

        a(d dVar) {
            this.f127893a = dVar;
        }

        @Override // com.ss.android.vesdk.r
        public final void onCallback(int i2, int i3, float f2, String str) {
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a aVar;
            if (i2 == 4101 && (aVar = this.f127893a.f127892b) != null) {
                aVar.c();
            }
        }
    }

    public final void a(MultiEditVideoRecordData multiEditVideoRecordData, int i2, int i3, int i4) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.musicIndex != -1) {
            int i5 = i2 + multiEditVideoRecordData.musicTrimIn;
            if (i5 > multiEditVideoRecordData.musicDuration) {
                i5 %= multiEditVideoRecordData.musicDuration;
            }
            g gVar = this.f127891a;
            if (gVar != null) {
                gVar.a(multiEditVideoRecordData.musicIndex, i5, i5 + i4, i3, i3 + i4, false);
            }
        }
    }

    public final void a(MultiEditVideoRecordData multiEditVideoRecordData, VideoSegment videoSegment, Pair<Integer, Integer> pair, boolean z, boolean z2) {
        boolean z3;
        l.d(pair, "");
        if (multiEditVideoRecordData != null && videoSegment != null && !k.a(multiEditVideoRecordData.segmentDataList)) {
            if (z || z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            g gVar = this.f127891a;
            if (gVar != null) {
                gVar.r();
            }
            VERecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoRecordData);
            Integer num = (Integer) pair.first;
            Integer num2 = (Integer) pair.second;
            if (!z3) {
                a2.a(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
            }
            g gVar2 = this.f127891a;
            if (gVar2 != null) {
                int unused = gVar2.a(a2, false, true);
            }
            b(multiEditVideoRecordData);
            g gVar3 = this.f127891a;
            if (gVar3 != null) {
                gVar3.a(true);
            }
            d();
            g gVar4 = this.f127891a;
            if (gVar4 != null) {
                gVar4.p();
            }
            e();
            if (z3) {
                g gVar5 = this.f127891a;
                if (gVar5 != null) {
                    l.b(num, "");
                    int intValue = num.intValue();
                    l.b(num2, "");
                    gVar5.b(intValue, num2.intValue());
                }
                g gVar6 = this.f127891a;
                if (gVar6 != null) {
                    l.b(num, "");
                    gVar6.a(num.intValue(), x.f.EDITOR_SEEK_FLAG_LastSeek);
                    return;
                }
                return;
            }
            g gVar7 = this.f127891a;
            if (gVar7 != null) {
                gVar7.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }
}
