package com.ss.android.ugc.aweme.watermark.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.facebook.j.a.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.g;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.af.a.a;
import com.ss.android.ugc.aweme.shortvideo.af.a.f;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.watermark.l;
import com.ss.android.ugc.aweme.watermark.o;
import com.ss.android.ugc.aweme.watermark.p;
import com.ss.android.ugc.tools.c.a;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.x;
import java.io.File;
import org.json.JSONObject;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f144724a;

    /* renamed from: i  reason: collision with root package name */
    private static final String f144725i;

    /* renamed from: b  reason: collision with root package name */
    public final Context f144726b;

    /* renamed from: c  reason: collision with root package name */
    public String f144727c;

    /* renamed from: d  reason: collision with root package name */
    public p f144728d;

    /* renamed from: e  reason: collision with root package name */
    private long f144729e = -1;

    /* renamed from: f  reason: collision with root package name */
    private String f144730f;

    /* renamed from: g  reason: collision with root package name */
    private String f144731g;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f144732h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f144733j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f144734k;

    /* renamed from: l  reason: collision with root package name */
    private String f144735l;

    /* renamed from: m  reason: collision with root package name */
    private long f144736m;
    private f n;
    private a o;
    private VEUtils.VEVideoFileInfo p;

    public final void a(boolean z, int i2, int i3, String str) {
        boolean z2;
        if (!this.f144734k) {
            this.f144734k = true;
            long currentTimeMillis = System.currentTimeMillis() - this.f144736m;
            long i4 = h.i(this.f144728d.f144818a);
            if (!h.f149997b || !h.b(this.f144728d.f144818a)) {
                z2 = TextUtils.equals(g.b(new File(this.f144728d.f144818a).getPath()), "20");
            } else {
                z2 = h.h(this.f144728d.f144818a).endsWith("/mp4");
            }
            if (z) {
                q.a("save_video_success_rate", 0, new ar().a("watermark_duration", Long.valueOf(currentTimeMillis)).a("download_rate", Long.valueOf(this.f144728d.f144830m)).a("download_duration", Long.valueOf(this.f144728d.n)).a("isInstagram", Boolean.valueOf(this.f144728d.f144825h)).a("file_size", Long.valueOf(i4)).a("url", this.f144728d.f144829l).a("needWaterMark", (Boolean) true).a("ret", "null").a("ext", "null").a("msg", "null").a("isMp4", Boolean.valueOf(z2)).a());
            } else {
                q.a("save_video_success_rate", 2, new ar().a("watermark_duration", Long.valueOf(currentTimeMillis)).a("download_rate", Long.valueOf(this.f144728d.f144830m)).a("download_duration", Long.valueOf(this.f144728d.n)).a("isInstagram", Boolean.valueOf(this.f144728d.f144825h)).a("file_size", Long.valueOf(i4)).a("url", this.f144728d.f144829l).a("needWaterMark", (Boolean) true).a("ret", Integer.valueOf(i2)).a("ext", Integer.valueOf(i3)).a("msg", str).a("isMp4", Boolean.valueOf(z2)).a());
            }
        }
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.watermark.a.a
    public final void a() {
        this.f144733j = true;
        this.f144734k = true;
        d();
        com.ss.android.ugc.aweme.shortvideo.af.a.f fVar = this.n;
        if (fVar != null) {
            fVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f144727c = null;
        this.f144735l = null;
        a aVar = this.o;
        if (aVar != null) {
            aVar.b();
        }
    }

    public b() {
        Context applicationContext = c.f115622a.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f144726b = applicationContext;
        e.a(f144724a, false);
    }

    public static boolean c() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean f2 = f();
        j.f107226e = f2;
        return f2;
    }

    static {
        Covode.recordClassIndex(94671);
        String str = di.f126461d + "share/";
        f144725i = str;
        f144724a = str + "pic/";
    }

    private void e() {
        String str = this.f144727c;
        if (str == null || !i.a(str)) {
            final String h2 = this.f144728d.f144820c.h();
            try {
                com.ss.android.ugc.tools.c.a.a(this.f144728d.f144820c.g(), new a.b() {
                    /* class com.ss.android.ugc.aweme.watermark.a.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(94673);
                    }

                    @Override // com.ss.android.ugc.tools.c.a.b
                    public final void a(Exception exc) {
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:54:0x0274  */
                    /* JADX WARNING: Removed duplicated region for block: B:56:0x027e  */
                    /* JADX WARNING: Removed duplicated region for block: B:58:0x02a4  */
                    @Override // com.ss.android.ugc.tools.c.a.b
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> r29) {
                        /*
                        // Method dump skipped, instructions count: 768
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.a.b.AnonymousClass2.a(com.facebook.d.c):void");
                    }
                });
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.watermark.a.a
    public final void b() {
        p pVar = this.f144728d;
        if (pVar != null) {
            if (pVar.f144822e) {
                g();
                this.o.a(true, this.f144728d.f144820c);
                this.o.a(false, this.f144728d.f144820c);
            }
            if (this.f144728d.f144825h && c.f115630i.b()) {
                e();
            }
        }
    }

    private void g() {
        int i2;
        p pVar = this.f144728d;
        if (pVar != null && pVar.f144821d != null && this.o == null) {
            if (this.f144728d.f144825h) {
                i2 = 2;
            } else {
                i2 = -1;
            }
            int width = this.f144728d.f144821d.getWidth();
            int height = this.f144728d.f144821d.getHeight();
            this.o = l.a(i2, this.f144728d.f144821d.getPlayAddrH264().getBitRatedRatioUri(), false, new int[]{width, height});
        }
    }

    @Override // com.ss.android.ugc.aweme.watermark.a.a
    public final void b(p pVar) {
        this.f144728d = pVar;
    }

    private x.l a(int[] iArr) {
        x.l lVar;
        if (c.f115630i.a() == 0 && this.f144728d.f144825h) {
            try {
                iArr[0] = Integer.parseInt(h.e(this.f144728d.f144818a).extractMetadata(18));
            } catch (Exception unused) {
                iArr[0] = 560;
            }
            lVar = x.l.VIDEO_OUT_RATIO_1_1;
        } else if (c.f115630i.a() != 1 || !this.f144728d.f144825h) {
            lVar = x.l.VIDEO_OUT_RATIO_ORIGINAL;
        } else {
            lVar = x.l.VIDEO_OUT_RATIO_16_9;
        }
        if (this.f144728d.f144827j) {
            return x.l.VIDEO_OUT_RATIO_16_9;
        }
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.watermark.a.a
    public final void a(p pVar) {
        boolean z;
        boolean z2;
        this.f144728d = pVar;
        com.bytedance.jedi.a.g.a.c.a(pVar.f144818a, "inputPath can't be null");
        com.bytedance.jedi.a.g.a.c.a(this.f144728d.f144819b, "outPath can't be null");
        com.bytedance.jedi.a.g.a.c.a(this.f144728d.f144820c, "author can't be null");
        com.bytedance.jedi.a.g.a.c.a(this.f144728d.f144821d, "video can't be null");
        boolean z3 = true;
        if (this.f144728d.f144822e || this.f144728d.f144823f || this.f144728d.o) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.jedi.a.g.a.c.a(z, "watermark invoked with error parameters");
        File file = new File(this.f144728d.f144819b);
        File parentFile = file.getParentFile();
        if (parentFile.isDirectory() || parentFile.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.bytedance.jedi.a.g.a.c.a(z2, "create output dir failed \noutPath = " + this.f144728d.f144819b + "\noutPath isExist = " + file.exists() + "\noutPath isfile =  " + file.isFile() + "\noutDir  = " + parentFile.getPath() + "\noutDir.isDirectory() = " + parentFile.isDirectory() + "\noutDir.mkdirs() = " + parentFile.mkdirs());
        boolean z4 = this.f144728d.f144822e;
        if (!this.f144728d.f144828k) {
            z3 = this.f144728d.f144823f;
        } else if (!this.f144728d.f144825h || !c.f115630i.b()) {
            z3 = false;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.f144728d.f144818a.toString());
        this.p = videoFileInfo;
        if (videoFileInfo == null) {
            if (this.f144728d.f144824g != null) {
                this.f144728d.f144824g.b(-1);
            } else {
                return;
            }
        }
        this.f144733j = false;
        this.f144734k = false;
        b.i.b(new c(this, z4, this.f144728d.o, z3), com.ss.android.ugc.aweme.cw.g.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.f144736m = System.currentTimeMillis();
        this.f144729e = System.currentTimeMillis();
        this.f144730f = "download_time";
        this.f144731g = "add_watermark";
        this.f144732h = null;
        Video video = this.f144728d.f144821d;
        int width = video.getWidth();
        int height = video.getHeight();
        if (z || z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        o a2 = a(z4, z3, new int[]{width, height});
        if (a2 == null) {
            a(-1, 0, "create VideoWatermarkParam error");
            return null;
        }
        if (this.n == null) {
            this.n = new com.ss.android.ugc.aweme.shortvideo.af.a.b(dj.f126462e + d.b(this.f144728d.f144818a.toString()));
        }
        this.n.a(a2, new com.ss.android.ugc.aweme.shortvideo.af.a.d() {
            /* class com.ss.android.ugc.aweme.watermark.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94672);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.af.a.d
            public final void a() {
                b.this.a(true, -1, -1, null);
                b bVar = b.this;
                bVar.d();
                if (bVar.f144728d.f144824g != null) {
                    bVar.f144728d.f144824g.a(bVar.f144728d.f144819b);
                }
                if (b.c()) {
                    q.a("aweme_download_synthesis_error_rate", 0, (JSONObject) null);
                    r.a("add_watermark", new com.ss.android.ugc.tools.f.b().a("enter_from", "download_video").f149193a);
                }
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.af.a.d
            public final void a(float f2) {
                if (b.this.f144728d.f144824g != null) {
                    b.this.f144728d.f144824g.a((int) (f2 * 100.0f));
                }
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.af.a.d
            public final void a(int i2, String str, int i3) {
                b.this.a(i2, i3, str);
                b.this.a(false, i2, i3, str);
            }
        });
        return null;
    }

    public final void a(int i2, int i3, String str) {
        d();
        if (this.f144728d.f144824g != null) {
            this.f144728d.f144824g.b(i3);
        }
        if (!this.f144733j) {
            this.f144733j = true;
            com.ss.android.ugc.aweme.df.d.a("mTmpPath", this.f144728d.f144818a.toString());
            com.ss.android.ugc.aweme.df.d.a("mOutPath", this.f144728d.f144819b);
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

    /* JADX WARNING: Removed duplicated region for block: B:79:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0350  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ugc.aweme.watermark.o a(boolean r24, boolean r25, int[] r26) {
        /*
        // Method dump skipped, instructions count: 857
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.a.b.a(boolean, boolean, int[]):com.ss.android.ugc.aweme.watermark.o");
    }
}
