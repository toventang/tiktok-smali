package com.ss.android.ugc.aweme.watermark.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.j.a.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.m;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.af.a.a;
import com.ss.android.ugc.aweme.shortvideo.af.a.f;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.watermark.l;
import com.ss.android.ugc.aweme.watermark.n;
import com.ss.android.ugc.aweme.watermark.o;
import com.ss.android.ugc.aweme.watermark.p;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.bk;
import com.ss.android.vesdk.x;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class d implements a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f144744d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f144745e;

    /* renamed from: a  reason: collision with root package name */
    final Context f144746a;

    /* renamed from: b  reason: collision with root package name */
    public p f144747b;

    /* renamed from: c  reason: collision with root package name */
    long f144748c;

    /* renamed from: f  reason: collision with root package name */
    private boolean f144749f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f144750g;

    /* renamed from: h  reason: collision with root package name */
    private f f144751h;

    /* renamed from: i  reason: collision with root package name */
    private a f144752i;

    /* renamed from: j  reason: collision with root package name */
    private VEUtils.VEVideoFileInfo f144753j;

    /* access modifiers changed from: package-private */
    public final void d() {
        a aVar = this.f144752i;
        if (aVar != null) {
            aVar.b();
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.watermark.a.a
    public final void a() {
        this.f144749f = true;
        this.f144750g = true;
        d();
        com.ss.android.ugc.aweme.shortvideo.af.a.f fVar = this.f144751h;
        if (fVar != null) {
            fVar.a();
        }
    }

    public d() {
        Context applicationContext = c.f115622a.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f144746a = applicationContext;
        e.a(f144745e, false);
    }

    public static boolean c() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean e2 = e();
        j.f107226e = e2;
        return e2;
    }

    static {
        Covode.recordClassIndex(94675);
        String str = di.f126461d + "share/";
        f144744d = str;
        f144745e = str + "pic/";
    }

    private void f() {
        int i2;
        p pVar = this.f144747b;
        if (pVar != null && pVar.f144821d != null && this.f144752i == null) {
            if (this.f144747b.f144825h) {
                i2 = 2;
            } else {
                i2 = -1;
            }
            int width = this.f144747b.f144821d.getWidth();
            int height = this.f144747b.f144821d.getHeight();
            this.f144752i = l.a(i2, this.f144747b.f144821d.getPlayAddrH264().getBitRatedRatioUri(), false, new int[]{width, height});
        }
    }

    @Override // com.ss.android.ugc.aweme.watermark.a.a
    public final void b() {
        p pVar;
        p pVar2 = this.f144747b;
        if (pVar2 != null) {
            if (pVar2.f144822e) {
                f();
                this.f144752i.a(true, this.f144747b.f144820c);
                this.f144752i.a(false, this.f144747b.f144820c);
            }
            if (this.f144747b.f144825h && c.f115630i.b() && this.f144746a != null && (pVar = this.f144747b) != null) {
                int width = pVar.f144821d.getWidth();
                int height = this.f144747b.f144821d.getHeight();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(width));
                arrayList.add(Integer.valueOf(height));
                g.a().p().a(arrayList, this.f144747b.f144818a, this.f144747b.f144820c, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.watermark.a.a
    public final void b(p pVar) {
        this.f144747b = pVar;
    }

    private x.l a(int[] iArr) {
        x.l lVar;
        if (c.f115630i.a() == 0 && this.f144747b.f144825h) {
            try {
                iArr[0] = Integer.parseInt(h.e(this.f144747b.f144818a).extractMetadata(18));
            } catch (Exception unused) {
                iArr[0] = 560;
            }
            lVar = x.l.VIDEO_OUT_RATIO_1_1;
        } else if (c.f115630i.a() != 1 || !this.f144747b.f144825h) {
            lVar = x.l.VIDEO_OUT_RATIO_ORIGINAL;
        } else {
            lVar = x.l.VIDEO_OUT_RATIO_16_9;
        }
        if (this.f144747b.f144827j) {
            return x.l.VIDEO_OUT_RATIO_16_9;
        }
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.watermark.a.a
    public final void a(p pVar) {
        boolean z;
        boolean z2;
        this.f144747b = pVar;
        m.a(pVar.f144818a, "inputPath can't be null", new Object[0]);
        m.a(this.f144747b.f144819b, "outPath can't be null", new Object[0]);
        m.a(this.f144747b.f144820c, "author can't be null", new Object[0]);
        m.a(this.f144747b.f144821d, "video can't be null", new Object[0]);
        boolean z3 = true;
        if (this.f144747b.f144822e || this.f144747b.f144823f || this.f144747b.o) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, "watermark invoked with error parameters", new Object[0]);
        File file = new File(this.f144747b.f144819b);
        File parentFile = file.getParentFile();
        if (parentFile.isDirectory() || parentFile.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        m.a(z2, "create output dir failed \noutPath = " + this.f144747b.f144819b + "\noutPath isExist = " + file.exists() + "\noutPath isfile =  " + file.isFile() + "\noutDir  = " + parentFile.getPath() + "\noutDir.isDirectory() = " + parentFile.isDirectory() + "\noutDir.mkdirs() = " + parentFile.mkdirs(), new Object[0]);
        boolean z4 = this.f144747b.f144822e;
        boolean d2 = g.a().p().d();
        if (((!this.f144747b.f144825h && !this.f144747b.f144823f) || !c.f115630i.b()) && !d2) {
            z3 = false;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.f144747b.f144818a);
        this.f144753j = videoFileInfo;
        if (videoFileInfo == null) {
            if (this.f144747b.f144824g != null) {
                this.f144747b.f144824g.b(-1);
            } else {
                return;
            }
        }
        this.f144749f = false;
        this.f144750g = false;
        i.b(new e(this, z3, z4, this.f144747b.o), com.ss.android.ugc.aweme.cw.g.a());
    }

    public final void a(int i2, int i3, String str) {
        d();
        if (this.f144747b.f144824g != null) {
            this.f144747b.f144824g.b(i3);
        }
        if (!this.f144749f) {
            this.f144749f = true;
            com.ss.android.ugc.aweme.df.d.a("mTmpPath", this.f144747b.f144818a);
            com.ss.android.ugc.aweme.df.d.a("mOutPath", this.f144747b.f144819b);
            com.ss.android.ugc.aweme.df.e.a((Throwable) new Exception("WaterMarkComposer ret: ".concat(String.valueOf(i2))));
            if (c()) {
                q.a("aweme_download_synthesis_error_rate", 1, (JSONObject) null);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netWorkQuality", b.a.f48731a.a().toString());
                jSONObject.put("netWorkSpeed", (int) b.a.f48731a.b());
                jSONObject.put("ret", i2);
                jSONObject.put("ext", i3);
                jSONObject.put("msg", str);
                q.a("aweme_movie_synthesis_log", "video_download_compose", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(boolean z, int i2, int i3, String str) {
        boolean z2;
        if (!this.f144750g) {
            this.f144750g = true;
            long currentTimeMillis = System.currentTimeMillis() - this.f144748c;
            long i4 = h.i(this.f144747b.f144818a);
            if (!h.f149997b || !h.b(this.f144747b.f144818a)) {
                z2 = TextUtils.equals(com.ss.android.ugc.aweme.df.g.b(new File(this.f144747b.f144818a).getPath()), "20");
            } else {
                z2 = h.h(this.f144747b.f144818a).endsWith("/mp4");
            }
            if (z) {
                q.a("save_video_success_rate", 0, new ar().a("watermark_duration", Long.valueOf(currentTimeMillis)).a("download_rate", Long.valueOf(this.f144747b.f144830m)).a("download_duration", Long.valueOf(this.f144747b.n)).a("isInstagram", Boolean.valueOf(this.f144747b.f144825h)).a("file_size", Long.valueOf(i4)).a("url", this.f144747b.f144829l).a("needWaterMark", (Boolean) true).a("ret", "null").a("ext", "null").a("msg", "null").a("isMp4", Boolean.valueOf(z2)).a());
            } else {
                q.a("save_video_success_rate", 2, new ar().a("watermark_duration", Long.valueOf(currentTimeMillis)).a("download_rate", Long.valueOf(this.f144747b.f144830m)).a("download_duration", Long.valueOf(this.f144747b.n)).a("isInstagram", Boolean.valueOf(this.f144747b.f144825h)).a("file_size", Long.valueOf(i4)).a("url", this.f144747b.f144829l).a("needWaterMark", (Boolean) true).a("ret", Integer.valueOf(i2)).a("ext", Integer.valueOf(i3)).a("msg", str).a("isMp4", Boolean.valueOf(z2)).a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(boolean z, boolean z2, boolean z3, int i2, int i3, List list, List list2, String str, String str2) {
        n nVar;
        boolean z4;
        VEWatermarkParam vEWatermarkParam;
        com.ss.android.ugc.aweme.watermark.b bVar;
        o oVar;
        String str3 = str2;
        MethodCollector.i(9619);
        if (z) {
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            nVar = new n(list2, str, str3, new ArrayList());
        } else {
            nVar = null;
        }
        if (z2 || z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        int[] iArr = {i2, i3};
        if (z4) {
            f();
            if (a(iArr) == x.l.VIDEO_OUT_RATIO_16_9 && ((!l.b(iArr[1], iArr[0]) || !this.f144747b.f144825h) && !this.f144747b.o)) {
                double d2 = (double) iArr[0];
                Double.isNaN(d2);
                int i4 = (int) (d2 * 1.7777777777777777d);
                iArr[1] = i4;
                l.f144796b = (i4 - iArr[1]) / 2;
            }
            l.f144797c = this.f144753j;
            l.f144795a = this.f144753j.duration;
            vEWatermarkParam = l.a(this.f144752i, this.f144747b.f144820c, new int[]{iArr[0], iArr[1]}, false, "", this.f144747b.f144825h);
        } else {
            vEWatermarkParam = null;
        }
        VEVideoEncodeSettings a2 = l.a(iArr[0], iArr[1]);
        if (!z4 || vEWatermarkParam != null) {
            if (!this.f144747b.o || this.f144747b.p == null) {
                bVar = null;
            } else {
                int[] iArr2 = new int[10];
                VEUtils.getVideoFileInfo(this.f144747b.f144818a, iArr2);
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f144747b.p);
                if (decodeFile != null) {
                    bVar = new com.ss.android.ugc.aweme.watermark.b(iArr2[3], iArr[0], iArr[1], this.f144747b.p, decodeFile.getHeight(), decodeFile.getWidth(), this.f144747b.q);
                } else {
                    bVar = null;
                }
                vEWatermarkParam.position = bk.TL;
            }
            oVar = new o(this.f144747b.f144818a, this.f144747b.f144819b, vEWatermarkParam, a2, bVar);
            if (nVar != null) {
                String str4 = nVar.f144805b;
                if (new File(str4).exists() && str4 != null) {
                    oVar.f144811a = nVar;
                }
            }
            if (this.f144747b.f144828k) {
                oVar.f144815e = -1;
            }
        } else {
            com.ss.android.ugc.tools.utils.q.b("need interWatermark,but watermark param is null ,maybe the image data is invalid");
            oVar = null;
        }
        nVar.a(list);
        if (oVar == null) {
            a(-1, 0, "create VideoWatermarkParam error");
            MethodCollector.o(9619);
            return null;
        }
        if (this.f144751h == null) {
            this.f144751h = new com.ss.android.ugc.aweme.shortvideo.af.a.c(dj.f126462e + com.bytedance.common.utility.d.b(this.f144747b.f144818a));
        }
        this.f144751h.a(oVar, new com.ss.android.ugc.aweme.shortvideo.af.a.d() {
            /* class com.ss.android.ugc.aweme.watermark.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94676);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.af.a.d
            public final void a() {
                d.this.a(true, -1, -1, null);
                d dVar = d.this;
                dVar.d();
                if (dVar.f144747b.f144824g != null) {
                    dVar.f144747b.f144824g.a(dVar.f144747b.f144819b);
                }
                if (d.c()) {
                    q.a("aweme_download_synthesis_error_rate", 0, (JSONObject) null);
                    r.a("add_watermark", new com.ss.android.ugc.tools.f.b().a("enter_from", "download_video").f149193a);
                }
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.af.a.d
            public final void a(float f2) {
                if (d.this.f144747b.f144824g != null) {
                    d.this.f144747b.f144824g.a((int) (f2 * 100.0f));
                }
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.af.a.d
            public final void a(int i2, String str, int i3) {
                d.this.a(i2, i3, str);
                d.this.a(false, i2, i3, str);
            }
        });
        MethodCollector.o(9619);
        return null;
    }
}
