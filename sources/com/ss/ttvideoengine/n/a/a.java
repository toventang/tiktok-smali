package com.ss.ttvideoengine.n.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRAudioStream;
import com.bytedance.vcloud.abrmodule.ABRResult;
import com.bytedance.vcloud.abrmodule.ABRResultElement;
import com.bytedance.vcloud.abrmodule.ABRVideoStream;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.bytedance.vcloud.abrmodule.IABRModule;
import com.ss.ttvideoengine.ag;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.j.o;
import com.ss.ttvideoengine.j.q;
import com.ss.ttvideoengine.n.b;
import com.ss.ttvideoengine.n.c;
import com.ss.ttvideoengine.r.d;
import com.ss.ttvideoengine.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a implements c {

    /* renamed from: c  reason: collision with root package name */
    private static int f153096c = 4;

    /* renamed from: a  reason: collision with root package name */
    private final int f153097a;

    /* renamed from: b  reason: collision with root package name */
    private final int f153098b;

    static {
        Covode.recordClassIndex(101720);
    }

    /* renamed from: com.ss.ttvideoengine.n.a.a$a  reason: collision with other inner class name */
    enum EnumC4072a {
        SCREEN_WIDTH,
        SCREEN_HEIGHT,
        DISPLAY_WIDTH,
        DISPLAY_HEIGHT,
        WIFI_DEFAULT_RESOLUTION_INDEX,
        WIFI_DEFAULT_RESOLUTION_QUALITY,
        CELLULAR_MAX_RESOLUTION_INDEX,
        CELLULAR_MAX_RESOLUTION_QUALITY,
        USER_EXPECTED_RESOLUTION_INDEX,
        USER_EXPECTED_RESOLUTION_QUALITY,
        GRACIE_MAX_RESOLUTION_INDEX,
        GRACIE_MAX_RESOLUTION_QUALITY,
        DOWNGRADE_RESOLUTION_INDEX,
        DOWNGRADE_RESOLUTION_QUALITY,
        SR_STRATEGY_CONFIG;

        static {
            Covode.recordClassIndex(101721);
        }
    }

    public static void a(int i2) {
        f153096c = i2;
    }

    @Override // com.ss.ttvideoengine.n.c
    public final b a(e eVar, Map<Integer, Object> map) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        com.ss.ttvideoengine.r.c cVar;
        boolean z;
        float f2;
        float f3;
        float f4;
        float f5;
        int i11;
        d dVar;
        int i12;
        boolean z2;
        if (eVar == null) {
            return new b(new com.ss.ttvideoengine.s.c("kTTVideoSelector", -7999, "null video model"));
        }
        if (map != null) {
            Object obj = map.get(Integer.valueOf(EnumC4072a.SCREEN_WIDTH.ordinal()));
            if (obj instanceof Integer) {
                i4 = ((Integer) obj).intValue();
            } else {
                i4 = -1;
            }
            Object obj2 = map.get(Integer.valueOf(EnumC4072a.SCREEN_HEIGHT.ordinal()));
            if (obj2 instanceof Integer) {
                i9 = ((Integer) obj2).intValue();
            } else {
                i9 = -1;
            }
            Object obj3 = map.get(Integer.valueOf(EnumC4072a.DISPLAY_WIDTH.ordinal()));
            if (obj3 instanceof Integer) {
                i2 = ((Integer) obj3).intValue();
            } else {
                i2 = -1;
            }
            Object obj4 = map.get(Integer.valueOf(EnumC4072a.DISPLAY_HEIGHT.ordinal()));
            if (obj4 instanceof Integer) {
                i3 = ((Integer) obj4).intValue();
            } else {
                i3 = -1;
            }
            Object obj5 = map.get(Integer.valueOf(EnumC4072a.SR_STRATEGY_CONFIG.ordinal()));
            if (obj5 instanceof d) {
                dVar = (d) obj5;
            } else {
                dVar = null;
            }
            i10 = a(EnumC4072a.WIFI_DEFAULT_RESOLUTION_INDEX.ordinal(), EnumC4072a.WIFI_DEFAULT_RESOLUTION_QUALITY.ordinal(), map, eVar);
            i7 = a(EnumC4072a.USER_EXPECTED_RESOLUTION_INDEX.ordinal(), EnumC4072a.USER_EXPECTED_RESOLUTION_QUALITY.ordinal(), map, eVar);
            i5 = a(EnumC4072a.CELLULAR_MAX_RESOLUTION_INDEX.ordinal(), EnumC4072a.CELLULAR_MAX_RESOLUTION_QUALITY.ordinal(), map, eVar);
            i6 = a(EnumC4072a.GRACIE_MAX_RESOLUTION_INDEX.ordinal(), EnumC4072a.GRACIE_MAX_RESOLUTION_QUALITY.ordinal(), map, eVar);
            i8 = a(EnumC4072a.DOWNGRADE_RESOLUTION_INDEX.ordinal(), EnumC4072a.DOWNGRADE_RESOLUTION_QUALITY.ordinal(), map, eVar);
            if (dVar != null) {
                cVar = new com.ss.ttvideoengine.r.c();
                if (eVar.a(e.a.DASH)) {
                    i12 = 2;
                } else {
                    i12 = 0;
                }
                if (eVar.a(e.a.MP4)) {
                    i12 |= 1;
                }
                dVar.c(i12);
                dVar.d(eVar.a(3));
                List<o> b2 = eVar.b();
                if (b2 != null && b2.size() > 0) {
                    Iterator<o> it = b2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String b3 = it.next().b(32);
                        if (b3 != null && b3.toLowerCase().contains("hdr")) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                dVar.a(z2);
                cVar.a(dVar);
            }
            cVar = null;
        } else {
            i8 = -1;
            i6 = -1;
            i4 = -1;
            i9 = -1;
            i2 = -1;
            i3 = -1;
            i10 = -1;
            i7 = -1;
            i5 = -1;
            cVar = null;
        }
        IABRModule b4 = com.ss.ttvideoengine.a.a.a().b();
        if (b4 == null) {
            b4 = new DefaultABRModule();
            z = false;
        } else {
            z = true;
        }
        b4.setIntOptionForKey(14, this.f153097a);
        b4.setIntOptionForKey(6, i2);
        b4.setIntOptionForKey(7, i3);
        b4.setIntOptionForKey(34, i4);
        b4.setIntOptionForKey(35, i9);
        b4.setLongOptionForKey(12, (long) i10);
        b4.setLongOptionForKey(2, (long) i5);
        b4.setLongOptionForKey(13, (long) i6);
        b4.setLongOptionForKey(22, (long) i7);
        b4.setLongOptionForKey(33, (long) i8);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<o> b5 = eVar.b();
        if (b5 == null) {
            b5 = Collections.emptyList();
        }
        for (o oVar : b5) {
            if (oVar != null) {
                if (oVar.a() == q.f152976a) {
                    ABRVideoStream aBRVideoStream = new ABRVideoStream();
                    String b6 = oVar.b(15);
                    aBRVideoStream.setStreamId(b6);
                    aBRVideoStream.setBandWidth(oVar.a(3));
                    aBRVideoStream.setCodec(oVar.b(8));
                    int a2 = oVar.a(1);
                    int a3 = oVar.a(2);
                    aBRVideoStream.setWidth(a2);
                    aBRVideoStream.setHeight(a3);
                    aBRVideoStream.setFrameRate(-1);
                    aBRVideoStream.setSegmentDuration(5000);
                    if (!TextUtils.isEmpty(b6)) {
                        arrayList.add(aBRVideoStream);
                    }
                    aBRVideoStream.setSupportSR(0);
                    if (cVar != null) {
                        Integer num = cVar.f153217a.f153237i;
                        Integer num2 = cVar.f153217a.f153238j;
                        if (num != null && num2 != null && a2 <= num.intValue() && a3 <= num2.intValue()) {
                            aBRVideoStream.setSupportSR(1);
                        }
                    }
                    w c2 = oVar.c();
                    if (c2 != null) {
                        i11 = c2.getIndex();
                    } else {
                        i11 = -1;
                    }
                    String b7 = oVar.b(32);
                    if (b7 != null) {
                        try {
                            i11 = Integer.parseInt(b7);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    aBRVideoStream.setResolution(i11);
                } else {
                    ABRAudioStream aBRAudioStream = new ABRAudioStream();
                    String b8 = oVar.b(15);
                    aBRAudioStream.setStreamId(b8);
                    aBRAudioStream.setBandWidth(oVar.a(3));
                    aBRAudioStream.setCodec(oVar.b(8));
                    aBRAudioStream.setSampleRate(-1);
                    aBRAudioStream.setSegmentDuration(5000);
                    if (!TextUtils.isEmpty(b8)) {
                        arrayList2.add(aBRAudioStream);
                    }
                }
            }
        }
        b4.setMediaInfo(arrayList, arrayList2);
        float f6 = 0.0f;
        if (com.ss.ttvideoengine.q.c.f153180b != null) {
            Map<String, String> downloadSpeed = com.ss.ttvideoengine.q.c.f153180b.getDownloadSpeed(q.f152976a);
            if (!(downloadSpeed == null || downloadSpeed.get("download_speed") == null)) {
                f6 = Float.parseFloat(downloadSpeed.get("download_speed"));
            }
            f2 = com.ss.ttvideoengine.q.c.f153180b.getPredictSpeed(0);
            f3 = com.ss.ttvideoengine.q.c.f153180b.getLastPredictConfidence();
            f4 = com.ss.ttvideoengine.q.c.f153180b.getAverageDownloadSpeed(q.f152976a, 3, false);
            f5 = com.ss.ttvideoengine.q.c.f153180b.getAverageDownloadSpeed(q.f152976a, f153096c, false);
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
        }
        b4.setFloatOptionForKey(25, f6);
        b4.setFloatOptionForKey(23, f2);
        b4.setFloatOptionForKey(24, f3);
        b4.setFloatOptionForKey(27, f4);
        b4.setFloatOptionForKey(28, f5);
        b4.setIntOptionForKey(21, ag.a().f152179a);
        if (cVar != null) {
            b4.setIntOptionForKey(39, cVar.b() ? 1 : 0);
            b4.setIntOptionForKey(40, cVar.f153220d ? 1 : 0);
            b4.setSRBenchmarkMap(cVar.f153225i);
        }
        ABRResult onceSelect = b4.onceSelect(this.f153098b, this.f153097a);
        if (z) {
            String b9 = eVar.b(2);
            if (TextUtils.isEmpty(b9)) {
                com.ss.ttvideoengine.a.a.a().a(b4);
            } else {
                com.ss.ttvideoengine.a.a a4 = com.ss.ttvideoengine.a.a.a();
                a4.f152134a.lock();
                b4.stop();
                a4.f152136c.put(b9, b4);
                a4.f152135b.remove(b9);
                a4.f152135b.add(b9);
                a4.f152134a.unlock();
            }
        } else {
            b4.release();
        }
        if (onceSelect == null) {
            return new b(new com.ss.ttvideoengine.s.c("kTTVideoSelector", -7997, "null abr result"));
        }
        int i13 = 0;
        while (true) {
            if (i13 >= onceSelect.size()) {
                break;
            }
            ABRResultElement aBRResultElement = onceSelect.get(i13);
            if (aBRResultElement.getMediaType() == q.f152976a) {
                long bitrate = aBRResultElement.getBitrate();
                if (bitrate > 0) {
                    long j2 = -1;
                    o oVar2 = null;
                    for (o oVar3 : b5) {
                        if (!(oVar3 == null || oVar3.a() == q.f152977b || oVar3.c() == null)) {
                            long a5 = (long) oVar3.a(3);
                            if (j2 < 0 || Math.abs(a5 - bitrate) < j2) {
                                j2 = Math.abs(a5 - bitrate);
                                oVar2 = oVar3;
                            }
                        }
                    }
                    if (oVar2 != null) {
                        return new b(oVar2);
                    }
                }
            } else {
                i13++;
            }
        }
        return new b(new com.ss.ttvideoengine.s.c("kTTVideoSelector", -7999, "null video info fit bitrate"));
    }

    private static int a(int i2, int i3, Map<Integer, Object> map, e eVar) {
        int i4;
        Object obj = map.get(Integer.valueOf(i2));
        if (obj instanceof Integer) {
            i4 = ((Integer) obj).intValue();
        } else {
            i4 = -1;
        }
        Object obj2 = map.get(Integer.valueOf(i3));
        if ((i4 == -1 || i4 == w.Auto.getIndex()) && obj2 == null) {
            return -1;
        }
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.clear();
        if (obj2 instanceof String) {
            hashMap.put(32, obj2);
        }
        o a2 = eVar.a(w.valueOf(i4), hashMap, true);
        if (a2 != null) {
            return a2.a(3);
        }
        return -1;
    }
}
