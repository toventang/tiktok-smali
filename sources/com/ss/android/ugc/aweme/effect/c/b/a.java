package com.ss.android.ugc.aweme.effect.c.b;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.d;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.w;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f88920a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f88921b = i.a((h.f.a.a) C2151a.f88922a);

    private static long a() {
        return ((Number) f88921b.getValue()).longValue();
    }

    private a() {
    }

    public static final boolean a(EffectPointModel effectPointModel) {
        return l.a((Object) (effectPointModel != null ? effectPointModel.getKey() : null), (Object) "1");
    }

    static {
        Covode.recordClassIndex(55925);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.b.a$a  reason: collision with other inner class name */
    static final class C2151a extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2151a f88922a = new C2151a();

        static {
            Covode.recordClassIndex(55926);
        }

        C2151a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2 = 60000;
            if (g.a().l().enable3MinRecord()) {
                j2 = Math.max(60000L, 180000L);
            }
            if (d.a()) {
                j2 = Math.max(j2, g.a().m().importLongVideoThreshold());
            }
            return Long.valueOf(j2);
        }
    }

    private static boolean b(EffectPointModel effectPointModel) {
        String str;
        if (effectPointModel != null) {
            str = effectPointModel.getKey();
        } else {
            str = null;
        }
        return l.a((Object) str, (Object) "2");
    }

    private static boolean c(EffectPointModel effectPointModel) {
        String str;
        if (effectPointModel != null) {
            str = effectPointModel.getKey();
        } else {
            str = null;
        }
        return l.a((Object) str, (Object) "3");
    }

    public static long a(int i2) {
        return Math.max((long) (i2 / 5), 1000L);
    }

    public static final boolean a(long j2) {
        if (j2 >= a()) {
            return true;
        }
        return false;
    }

    public static final w a(int i2, VideoPublishEditModel videoPublishEditModel) {
        EffectPointModel effectPointModel;
        if (videoPublishEditModel == null || (effectPointModel = videoPublishEditModel.mTimeEffect) == null) {
            return null;
        }
        long endPoint = (long) effectPointModel.getEndPoint();
        long startPoint = (long) effectPointModel.getStartPoint();
        String key = effectPointModel.getKey();
        if (Math.abs(startPoint - endPoint) < 1000) {
            long max = Math.max(1000L, (long) (i2 / 5));
            long j2 = (long) i2;
            if (startPoint + max > j2) {
                startPoint = j2 - max;
            }
            endPoint = max + startPoint;
        }
        return w.a(key, startPoint, endPoint);
    }

    public static final List<EffectPointModel> a(long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setUiStartPoint((int) j2);
        effectPointModel.setUiEndPoint((int) j3);
        arrayList.add(effectPointModel);
        return arrayList;
    }

    public static final long a(EffectPointModel effectPointModel, long j2, long j3) {
        if (b(effectPointModel)) {
            return j3 + (j2 * 2);
        }
        if (c(effectPointModel)) {
            return (j3 - j2) + ((long) (((float) j2) / 0.5f));
        }
        return j3;
    }

    public static final p<Long, Long> a(String str, com.ss.android.ugc.aweme.effect.c.a aVar, com.ss.android.ugc.asve.editor.g gVar) {
        long j2;
        Long l2;
        Long l3;
        l.d(str, "");
        l.d(aVar, "");
        long j3 = 0;
        if (gVar == null) {
            return new p<>(0L, 0L);
        }
        int r = gVar.r(gVar.k());
        if (!aVar.f88906e || (l3 = aVar.f88904c.get(str)) == null || l3.longValue() <= 0) {
            j2 = (long) r;
        } else {
            Long l4 = aVar.f88904c.get(str);
            if (l4 != null) {
                j2 = l4.longValue();
            } else {
                j2 = 0;
            }
        }
        int G = gVar.G();
        if (!aVar.f88906e || (l2 = aVar.f88905d.get(str)) == null || l2.longValue() <= 0) {
            j3 = a(G);
        } else {
            Long l5 = aVar.f88905d.get(str);
            if (l5 != null) {
                j3 = l5.longValue();
            }
        }
        long j4 = (long) G;
        if (j4 - j2 < j3) {
            j2 = j4 - j3;
        }
        aVar.f88904c.put(str, Long.valueOf(j2));
        aVar.f88905d.put(str, Long.valueOf(j3));
        return new p<>(Long.valueOf(j2), Long.valueOf(j2 + j3));
    }

    public static final boolean a(ViewPager viewPager, PagerAdapter pagerAdapter, boolean z) {
        l.d(viewPager, "");
        l.d(pagerAdapter, "");
        if (viewPager.getCurrentItem() != pagerAdapter.getCount() - 1 || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return (r6 + ((float) r8)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5 != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r5 != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float a(com.ss.android.ugc.aweme.effect.EffectPointModel r3, int r4, boolean r5, float r6, float r7, int r8, float r9) {
        /*
            boolean r0 = b(r3)
            if (r0 == 0) goto L_0x0017
            long r2 = a()
            long r0 = (long) r4
            long r2 = r2 - r0
            r0 = 2
            long r2 = r2 / r0
            float r1 = (float) r2
            float r1 = r1 / r9
            if (r5 == 0) goto L_0x002c
        L_0x0013:
            float r0 = (float) r8
            float r7 = r7 - r0
            float r7 = r7 - r1
            return r7
        L_0x0017:
            boolean r0 = c(r3)
            if (r0 == 0) goto L_0x0030
            long r2 = a()
            long r0 = (long) r4
            long r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = r1 / r0
            float r1 = r1 / r9
            if (r5 == 0) goto L_0x002c
            goto L_0x0013
        L_0x002c:
            float r0 = (float) r8
            float r6 = r6 + r0
            float r6 = r6 + r1
            return r6
        L_0x0030:
            if (r5 == 0) goto L_0x0033
            return r6
        L_0x0033:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effect.c.b.a.a(com.ss.android.ugc.aweme.effect.EffectPointModel, int, boolean, float, float, int, float):float");
    }
}
