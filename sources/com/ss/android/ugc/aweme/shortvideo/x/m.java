package com.ss.android.ugc.aweme.shortvideo.x;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.f;
import com.bytedance.creativex.recorder.filter.b.b;
import com.ss.android.ugc.asve.recorder.effect.a;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.asve.recorder.effect.composer.c;
import com.ss.android.ugc.aweme.beauty.e;
import com.ss.android.ugc.aweme.beauty.i;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.vesdk.ax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class m implements k {

    /* renamed from: a  reason: collision with root package name */
    public final a f133009a;

    /* renamed from: b  reason: collision with root package name */
    public FilterBean f133010b = null;

    /* renamed from: c  reason: collision with root package name */
    public float f133011c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Integer> f133012d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    g f133013e = g.f132998a;

    /* renamed from: f  reason: collision with root package name */
    int f133014f;

    /* renamed from: g  reason: collision with root package name */
    String f133015g = "";

    /* renamed from: h  reason: collision with root package name */
    private boolean f133016h;

    /* renamed from: i  reason: collision with root package name */
    private int f133017i = l.f133006d;

    /* renamed from: j  reason: collision with root package name */
    private int f133018j = -1;

    /* renamed from: k  reason: collision with root package name */
    private float f133019k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f133020l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f133021m = 0.0f;
    private float n = 0.0f;
    private float o = 0.0f;
    private float p = 0.0f;
    private final a q;
    private final ax r;
    private MessageCenter.Listener s = null;

    static {
        Covode.recordClassIndex(86980);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(String str, float f2) {
        this.f133009a.a(3, str);
        this.f133009a.a(f2, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(String str, float f2, float f3) {
        this.f133009a.a(str, f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(String str) {
        this.q.a(str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(String str, String str2, float f2) {
        a aVar = this.f133009a;
        if (aVar != null) {
            c g2 = aVar.g();
            g2.a(str, str2, f2);
            g2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final int[] a(String str, String str2) {
        return this.f133009a.c(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(h hVar, int i2) {
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.a(new n(hVar), i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(List<String> list, List<String> list2) {
        List<ComposerInfo> c2 = c(list, list2);
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.d(c2, 10000);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(List<String> list) {
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.a(c(list, Collections.emptyList()));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void f() {
        this.q.a();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final float c() {
        return (((float) g.a().e().getUserBigEyeLevel(-1)) * 1.0f) / 100.0f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final float d() {
        return (((float) g.a().e().getUserShapeLevel(-1)) * 1.0f) / 100.0f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final float e() {
        return (((float) g.a().e().getUserSmoothSkinLevel(-1)) * 1.0f) / 100.0f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final float b() {
        int i2;
        if (i.a("2", "3")) {
            i2 = g.a().e().getUserBlushLevel(-1);
        } else {
            i2 = 0;
        }
        return (((float) i2) * 1.0f) / 100.0f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final float a() {
        int i2;
        if (i.a("2", "3")) {
            i2 = g.a().e().getUserLipLevel(-1);
        } else {
            i2 = 0;
        }
        return (((float) i2) * 1.0f) / 100.0f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(float f2) {
        this.f133009a.a(9, f2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void b(float f2) {
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.d(f2, 3.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void c(float f2) {
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.e(f2, 6.0f);
        }
    }

    public static List<ComposerInfo> a(FilterBean filterBean) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ComposerInfo(com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean, 0.0f), filterBean.getExtra(), String.valueOf(filterBean.getId())));
        arrayList.add(new ComposerInfo(filterBean.getFilterFolder() + ":leftSlidePosition", filterBean.getExtra(), String.valueOf(filterBean.getId())));
        arrayList.add(new ComposerInfo(filterBean.getFilterFolder() + ":rightSlidePosition", filterBean.getExtra(), String.valueOf(filterBean.getId())));
        return arrayList;
    }

    public final String a(b bVar) {
        if (this.f133014f == 2 && f.a(bVar.f28242c)) {
            FilterBean filterBean = bVar.f28240a;
            List<FilterBean> value = bVar.f28242c.f28227b.f().a().getValue();
            if (value != null && !value.isEmpty() && value.get(0).equals(filterBean)) {
                com.ss.android.ugc.aweme.filter.d.b b2 = com.ss.android.ugc.aweme.port.in.c.C.r().b();
                if (IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).isKorean()) {
                    return b2.d() + "beautify_filter_korean/";
                }
                return b2.d() + "beautify_filter/";
            }
        }
        return com.ss.android.ugc.aweme.filter.repository.a.a.a.b(bVar.f28240a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(int i2) {
        g gVar = new g(i2);
        this.f133013e = gVar;
        if (gVar.f132999b == 0 && this.f133014f == 2) {
            com.ss.android.ugc.aweme.filter.d.b b2 = com.ss.android.ugc.aweme.port.in.c.C.r().b();
            if (IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).isKorean()) {
                this.f133009a.a(b2.d() + "beautify_filter_korean/");
            } else {
                this.f133009a.a(b2.d() + "beautify_filter/");
            }
        } else {
            this.f133009a.a(com.ss.android.ugc.aweme.port.in.c.C.r().c().b(gVar.f132999b));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void b(String str, float f2) {
        this.q.a(str, f2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void d(float f2, float f3) {
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.b(f2, f3);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void e(float f2, float f3) {
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.c(f2, f3);
        }
    }

    private static List<ComposerInfo> c(List<String> list, List<String> list2) {
        return a(list, list2, Collections.emptyList());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final int b(String str, String str2) {
        a aVar = this.f133009a;
        if (aVar != null) {
            return aVar.a(str, str2);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void f(float f2, float f3) {
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.f(f2, f3);
        }
    }

    public static List<ComposerInfo> a(FilterBean filterBean, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ComposerInfo(com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean, f2), filterBean.getExtra(), String.valueOf(filterBean.getId())));
        return arrayList;
    }

    public m(a aVar, ax axVar) {
        this.q = aVar;
        this.f133009a = aVar.f132970a;
        this.r = axVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void b(float f2, float f3) {
        this.f133019k = f2;
        this.f133020l = f3;
        if (f2 - 0.0f < 0.001f && f3 - 0.0f < 0.001f) {
            this.f133009a.a("", 0.0f, 0.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void c(float f2, float f3) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f133021m = f2;
        this.n = f3;
        String str5 = "1";
        if (this.f133016h) {
            str = str5;
        } else {
            str = "2";
        }
        if (i.a(str, "3")) {
            if (this.f133016h) {
                str3 = str5;
            } else {
                str3 = "2";
            }
            str2 = i.b(str3, "3");
            if (this.f133016h) {
                str4 = str5;
            } else {
                str4 = "2";
            }
            float a2 = e.a(3, str4);
            if (a2 >= 0.0f) {
                f2 *= a2;
            }
            if (!this.f133016h) {
                str5 = "2";
            }
            float a3 = e.a(4, str5);
            if (a2 >= 0.0f) {
                f3 *= a3;
            }
        } else {
            str2 = "";
        }
        this.f133009a.b(str2, f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void b(List<String> list, List<String> list2) {
        List<ComposerInfo> c2 = c(list, list2);
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.a(c2, 10000);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(float f2, float f3) {
        String str;
        int a2;
        String str2;
        this.o = f2;
        this.p = f3;
        String str3 = "2";
        if (this.f133016h) {
            str = "1";
        } else {
            str = str3;
        }
        if (i.a(str, "1")) {
            if (this.f133016h) {
                str2 = "1";
            } else {
                str2 = str3;
            }
            float a3 = e.a(0, str2);
            if (a3 >= 0.0f) {
                f2 *= a3;
            }
        }
        this.f133009a.a(f2, f3);
        if (f2 - 0.0f < 0.001f) {
            this.f133009a.a(0, "");
            return;
        }
        a aVar = this.f133009a;
        if (this.f133016h) {
            str3 = "1";
        }
        if (i.a(str3, "1")) {
            a2 = 3;
        } else {
            a2 = com.ss.android.ugc.aweme.property.f.a();
            if (a2 == 0) {
                a2 = 1;
            }
        }
        aVar.a(a2, this.f133015g);
    }

    private static List<ComposerInfo> a(List<String> list, List<String> list2, List<String> list3) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str2 = "";
            if (i2 < list2.size()) {
                str = list2.get(i2);
            } else {
                str = str2;
            }
            if (i2 < list3.size()) {
                str2 = list3.get(i2);
            }
            arrayList.add(new ComposerInfo(list.get(i2), str, str2));
        }
        return arrayList;
    }

    public final void b(String str, String str2, float f2) {
        String[] strArr = {str, str2};
        String[] strArr2 = {"leftSlidePosition", "rightSlidePosition"};
        float[] fArr = {f2, f2};
        ax axVar = this.r;
        if (axVar != null) {
            axVar.a(strArr, strArr2, fArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(float f2, float f3, float f4, float f5) {
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.a(f2, f3, f4, f5, 1.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.k
    public final void a(int i2, float f2, float f3, int i3) {
        a aVar = this.f133009a;
        if (aVar != null) {
            aVar.a(i2, f2, f3, i3);
        }
    }
}
