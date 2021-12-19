package com.ss.android.ugc.aweme.shortvideo.af.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.k;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.watermark.b;
import com.ss.android.ugc.aweme.watermark.n;
import com.ss.android.ugc.aweme.watermark.o;
import com.ss.android.ugc.aweme.watermark.t;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.filterparam.VEImageAddFilterParam;
import com.ss.android.vesdk.x;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f124918a;

    /* renamed from: b  reason: collision with root package name */
    private o f124919b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.asve.editor.a f124920c;

    /* renamed from: d  reason: collision with root package name */
    private final String f124921d;

    static {
        Covode.recordClassIndex(82072);
    }

    public static final class a implements VEListener.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f124922a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f124923b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f124924c;

        static {
            Covode.recordClassIndex(82073);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileDone() {
            d dVar = this.f124924c;
            if (dVar != null) {
                dVar.a();
            }
            this.f124922a.a((o) this.f124923b);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileProgress(float f2) {
            d dVar = this.f124924c;
            if (dVar != null) {
                dVar.a(f2);
            }
        }

        a(c cVar, t tVar, d dVar) {
            this.f124922a = cVar;
            this.f124923b = tVar;
            this.f124924c = dVar;
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileError(int i2, int i3, float f2, String str) {
            d dVar = this.f124924c;
            if (dVar != null) {
                if (str == null) {
                    str = "";
                }
                dVar.a(i2, str, i3);
            }
            this.f124922a.a((o) this.f124923b);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.af.a.f
    public final void a() {
        if (this.f124918a) {
            o oVar = this.f124919b;
            if (oVar != null) {
                b(oVar);
            }
            com.ss.android.ugc.asve.editor.a aVar = this.f124920c;
            if (aVar != null) {
                aVar.s();
            }
            this.f124920c = null;
            this.f124918a = false;
        }
    }

    public c(String str) {
        l.d(str, "");
        this.f124921d = str;
    }

    public final void a(o oVar) {
        this.f124918a = false;
        com.ss.android.ugc.asve.editor.a aVar = this.f124920c;
        if (aVar != null) {
            aVar.s();
        }
        this.f124920c = null;
        b(oVar);
    }

    private static void b(o oVar) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        VEWatermarkParam vEWatermarkParam = oVar.f144816f;
        if (!(vEWatermarkParam == null || (strArr2 = vEWatermarkParam.images) == null || strArr2.length == 0)) {
            for (String str3 : strArr2) {
                e.c(str3);
            }
        }
        VEWatermarkParam vEWatermarkParam2 = oVar.f144816f;
        if (!(vEWatermarkParam2 == null || (strArr = vEWatermarkParam2.secondHalfImages) == null || strArr.length == 0)) {
            for (String str4 : strArr) {
                e.c(str4);
            }
        }
        n nVar = oVar.f144811a;
        if (!(nVar == null || (str2 = nVar.f144805b) == null)) {
            e.c(str2);
        }
        n nVar2 = oVar.f144811a;
        if (!(nVar2 == null || (str = nVar2.f144806c) == null)) {
            e.c(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: java.lang.Integer[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.shortvideo.af.a.f
    public final void a(t tVar, d dVar) {
        int a2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        List<Number> b2;
        String str;
        int i8;
        int i9;
        int i10;
        VEWatermarkParam vEWatermarkParam;
        VEWatermarkParam vEWatermarkParam2;
        VEWatermarkParam.VEWatermarkEntity[] entities;
        String[] strArr;
        l.d(tVar, "");
        if (tVar instanceof o) {
            o oVar = (o) tVar;
            String str2 = null;
            int i11 = -1;
            if (oVar.f144816f == null || !(((vEWatermarkParam = oVar.f144816f) == null || (strArr = vEWatermarkParam.images) == null || strArr.length == 0) && ((vEWatermarkParam2 = oVar.f144816f) == null || (entities = vEWatermarkParam2.getEntities()) == null || entities.length == 0))) {
                com.ss.android.ugc.aweme.port.in.c.e();
                if (this.f124920c == null) {
                    com.ss.android.ugc.asve.editor.a aVar = new com.ss.android.ugc.asve.editor.a(this.f124921d);
                    aVar.a(false);
                    aVar.c(2);
                    this.f124920c = aVar;
                }
                com.ss.android.ugc.asve.editor.a aVar2 = this.f124920c;
                if (aVar2 != null) {
                    this.f124919b = oVar;
                    if (oVar.f144816f != null) {
                        oVar.f144817g.setWatermark(oVar.f144816f);
                    }
                    if (oVar.f144811a != null) {
                        n nVar = oVar.f144811a;
                        if (nVar != null) {
                            if (nVar.f144807d <= 0) {
                                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(tVar.f144832h);
                                if (videoFileInfo != null) {
                                    i8 = videoFileInfo.duration;
                                } else {
                                    i8 = -1;
                                }
                                nVar.f144807d = i8;
                                Integer[] numArr = new Integer[2];
                                if (videoFileInfo != null) {
                                    i9 = videoFileInfo.width;
                                } else {
                                    i9 = -1;
                                }
                                numArr[0] = Integer.valueOf(i9);
                                if (videoFileInfo != null) {
                                    i10 = videoFileInfo.height;
                                } else {
                                    i10 = -1;
                                }
                                numArr[1] = Integer.valueOf(i10);
                                nVar.a(h.a.n.b(numArr));
                            }
                            k kVar = new k(new String[]{tVar.f144832h, nVar.f144805b});
                            kVar.a(oVar.f144814d);
                            kVar.f62018a = new int[]{0, 0};
                            kVar.f62019b = new int[]{nVar.f144807d, nVar.f144808e + nVar.f144809f};
                            kVar.f62020c = null;
                            a2 = aVar2.a(kVar);
                            if (a2 == 0 && (str = nVar.f144806c) != null && new File(str).exists()) {
                                int i12 = nVar.f144807d;
                                Integer.valueOf(aVar2.a(str, 0, nVar.f144808e, i12, i12 + nVar.f144808e, false));
                            }
                            VEWatermarkParam vEWatermarkParam3 = oVar.f144816f;
                            if (vEWatermarkParam3 != null) {
                                vEWatermarkParam3.duration = (long) nVar.f144807d;
                            }
                        } else {
                            a2 = -1;
                        }
                    } else if (oVar.f144816f == null) {
                        a2 = -1;
                        dVar.a(a2, "init editor failed with errorCode:".concat(String.valueOf(a2)), 0);
                        a(oVar);
                        return;
                    } else {
                        k kVar2 = new k(new String[]{tVar.f144832h});
                        kVar2.a(oVar.f144814d);
                        a2 = aVar2.a(kVar2);
                    }
                    if (a2 == 0) {
                        n nVar2 = oVar.f144811a;
                        if (nVar2 != null && (!nVar2.f144804a.isEmpty())) {
                            Integer[] numArr2 = new Integer[2];
                            VESize videoRes = oVar.f144817g.getVideoRes();
                            if (videoRes != null) {
                                i7 = videoRes.width;
                            } else {
                                i7 = -1;
                            }
                            numArr2[0] = Integer.valueOf(i7);
                            VESize videoRes2 = oVar.f144817g.getVideoRes();
                            if (videoRes2 != null) {
                                i11 = videoRes2.height;
                            }
                            numArr2[1] = Integer.valueOf(i11);
                            List b3 = h.a.n.b(numArr2);
                            List<Integer> list = nVar2.f144810g;
                            if (list.get(0).intValue() > list.get(1).intValue()) {
                                b2 = h.a.n.b(b3.get(0), Integer.valueOf((int) ((((Number) b3.get(0)).floatValue() * 1.0f) / ((list.get(0).floatValue() * 1.0f) / list.get(1).floatValue()))));
                            } else {
                                b2 = h.a.n.b(b3.get(0), Integer.valueOf(Math.min((int) ((((Number) b3.get(0)).floatValue() * 1.0f) / ((list.get(0).floatValue() * 1.0f) / list.get(1).floatValue())), ((Number) b3.get(1)).intValue())));
                            }
                            String str3 = nVar2.f144804a.get(0);
                            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) b2, 10));
                            for (Number number : b2) {
                                arrayList.add(String.valueOf(number.intValue()));
                            }
                            Object[] array = arrayList.toArray(new String[0]);
                            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                            int a3 = aVar2.a(str3, (String[]) array);
                            int i13 = nVar2.f144807d;
                            aVar2.b(a3, i13, nVar2.f144808e + i13 + nVar2.f144809f);
                        }
                        if (oVar.f144813c != null) {
                            aVar2.c(3);
                            VEImageAddFilterParam vEImageAddFilterParam = new VEImageAddFilterParam();
                            b bVar = oVar.f144813c;
                            if (bVar != null) {
                                str2 = bVar.f144775d;
                            }
                            vEImageAddFilterParam.imagePath = str2;
                            b bVar2 = oVar.f144813c;
                            if (bVar2 != null) {
                                i2 = bVar2.f144773b;
                            } else {
                                i2 = 0;
                            }
                            b bVar3 = oVar.f144813c;
                            if (bVar3 != null) {
                                i3 = bVar3.f144774c;
                            } else {
                                i3 = 0;
                            }
                            b bVar4 = oVar.f144813c;
                            if (bVar4 != null) {
                                i4 = bVar4.f144776e;
                            } else {
                                i4 = 0;
                            }
                            b bVar5 = oVar.f144813c;
                            if (bVar5 != null) {
                                i5 = bVar5.f144777f;
                            } else {
                                i5 = 0;
                            }
                            aVar2.a(x.e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                            b bVar6 = oVar.f144813c;
                            if (bVar6 == null || !bVar6.f144778g) {
                                if (oVar.f144811a != null) {
                                    aVar2.a(x.e.SCALE_MODE_CENTER_INSIDE);
                                    if (i2 > i3) {
                                        i6 = i2 - i3;
                                    } else {
                                        i6 = i3 - i2;
                                        i2 = i3;
                                    }
                                    VEWatermarkParam vEWatermarkParam4 = oVar.f144816f;
                                    if (vEWatermarkParam4 == null) {
                                        l.b();
                                    }
                                    vEWatermarkParam4.xOffset += i6 / 2;
                                    i3 = i2;
                                } else {
                                    i6 = 0;
                                }
                                float f2 = ((float) (i2 - i5)) / 2.0f;
                                double d2 = (double) f2;
                                double d3 = (double) i2;
                                Double.isNaN(d3);
                                double d4 = d3 * 1.0d;
                                Double.isNaN(d2);
                                vEImageAddFilterParam.x = (float) (d2 / d4);
                                double d5 = (double) (((float) (i3 - i4)) - (f2 - ((float) (i6 / 2))));
                                double d6 = (double) i3;
                                Double.isNaN(d6);
                                double d7 = d6 * 1.0d;
                                Double.isNaN(d5);
                                vEImageAddFilterParam.y = (float) (d5 / d7);
                                double d8 = (double) i5;
                                Double.isNaN(d8);
                                vEImageAddFilterParam.width = (float) (d8 / d4);
                                double d9 = (double) i4;
                                Double.isNaN(d9);
                                vEImageAddFilterParam.height = (float) (d9 / d7);
                                oVar.f144817g.setVideoRes(i2, i3);
                            } else {
                                int i14 = i3 + i4;
                                aVar2.c(i2, i14);
                                vEImageAddFilterParam.x = 0.0f;
                                double d10 = (double) i3;
                                double d11 = (double) i14;
                                Double.isNaN(d11);
                                double d12 = d11 * 1.0d;
                                Double.isNaN(d10);
                                vEImageAddFilterParam.y = (float) (d10 / d12);
                                vEImageAddFilterParam.width = 1.0f;
                                double d13 = (double) i4;
                                Double.isNaN(d13);
                                vEImageAddFilterParam.height = (float) (d13 / d12);
                                oVar.f144817g.setResizeMode(5);
                                oVar.f144817g.setVideoRes(i2, i14);
                            }
                            VEWatermarkParam vEWatermarkParam5 = oVar.f144816f;
                            if (vEWatermarkParam5 != null) {
                                vEWatermarkParam5.secondHalfImages = null;
                            }
                            b bVar7 = oVar.f144813c;
                            if (bVar7 == null) {
                                l.b();
                            }
                            aVar2.a(aVar2.a(0, vEImageAddFilterParam, 0, bVar7.f144772a), vEImageAddFilterParam);
                        }
                        this.f124918a = true;
                        aVar2.b(oVar.f144815e);
                        Boolean.valueOf(aVar2.a(tVar.f144833i, (String) null, oVar.f144817g, new a(this, tVar, dVar)));
                        return;
                    }
                    dVar.a(a2, "init editor failed with errorCode:".concat(String.valueOf(a2)), 0);
                    a(oVar);
                    return;
                }
                return;
            }
            dVar.a(-1, "images in veWatermarkParam is null or empty", 0);
            return;
        }
        throw new IllegalArgumentException("VideoWatermarkParam is needed when use VEVideoWatermarkCreator");
    }
}
