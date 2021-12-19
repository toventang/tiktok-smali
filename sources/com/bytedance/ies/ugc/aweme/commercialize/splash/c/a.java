package com.bytedance.ies.ugc.aweme.commercialize.splash.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.k;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.k;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.facebook.drawee.a.a.e;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ad.splash.aa;
import com.ss.android.ad.splash.core.i.i;
import com.ss.android.ad.splash.core.j;
import com.ss.android.ad.splash.f.l;
import com.ss.android.ad.splash.h;
import com.ss.android.ad.splash.m;
import com.ss.android.ad.splash.n;
import com.ss.android.ad.splash.p;
import com.ss.android.ad.splash.r;
import com.ss.android.ad.splash.s;
import com.ss.android.ad.splash.u;
import com.ss.android.ad.splash.x;
import com.ss.android.ad.splash.y;
import com.ss.android.agilelogger.ALog;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.utils.br;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f34741a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f34742b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile u f34743c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f34744d = true;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f34745e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f34746f = new Object();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a$a  reason: collision with other inner class name */
    public static class C0785a implements m {
        static {
            Covode.recordClassIndex(20843);
        }

        private C0785a() {
        }

        /* synthetic */ C0785a(byte b2) {
            this();
        }

        @Override // com.ss.android.ad.splash.m
        public final void a(String str, String str2, long j2, JSONObject jSONObject) {
            d.a();
            if (TextUtils.equals(str2, "click")) {
                r.a(str, str2, String.valueOf(j2), 0, jSONObject);
                return;
            }
            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a(str, str2, String.valueOf(j2), "", "0");
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a2.b(next, jSONObject.opt(next));
                }
            }
            a2.c();
            if (com.bytedance.ies.ugc.aweme.rich.a.d.b()) {
                r.a(str, str2, String.valueOf(j2), 0, jSONObject);
            } else if (com.bytedance.ies.ugc.aweme.rich.a.d.a()) {
                try {
                    jSONObject.put("_ad_staging_flag", "1");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                r.a(str, str2, String.valueOf(j2), 0, jSONObject);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements x {
        static {
            Covode.recordClassIndex(20844);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.ss.android.ad.splash.x
        public final void a(ImageView imageView, String str, int i2, p pVar) {
            com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34766a = false;
            if (!l.a(str)) {
                if (((long) i2) == 1) {
                    Context a2 = d.a();
                    e b2 = com.facebook.drawee.a.a.c.b();
                    b2.f47315c = (REQUEST) com.facebook.imagepipeline.o.c.a(Uri.parse("file://".concat(String.valueOf(str)))).a();
                    b2.f47319g = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0036: IPUT  
                          (wrap: com.bytedance.ies.ugc.aweme.commercialize.splash.f.a$1 : 0x0033: CONSTRUCTOR  (r0v10 com.bytedance.ies.ugc.aweme.commercialize.splash.f.a$1) = (r11v0 'pVar' com.ss.android.ad.splash.p) call: com.bytedance.ies.ugc.aweme.commercialize.splash.f.a.1.<init>(com.ss.android.ad.splash.p):void type: CONSTRUCTOR)
                          (r1v2 'b2' com.facebook.drawee.a.a.e)
                         com.facebook.drawee.c.b.g com.facebook.drawee.c.d in method: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.b.a(android.widget.ImageView, java.lang.String, int, com.ss.android.ad.splash.p):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: CONSTRUCTOR  (r0v10 com.bytedance.ies.ugc.aweme.commercialize.splash.f.a$1) = (r11v0 'pVar' com.ss.android.ad.splash.p) call: com.bytedance.ies.ugc.aweme.commercialize.splash.f.a.1.<init>(com.ss.android.ad.splash.p):void type: CONSTRUCTOR in method: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.b.a(android.widget.ImageView, java.lang.String, int, com.ss.android.ad.splash.p):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 28 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.ugc.aweme.commercialize.splash.f.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 32 more
                        */
                    /*
                    // Method dump skipped, instructions count: 112
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.b.a(android.widget.ImageView, java.lang.String, int, com.ss.android.ad.splash.p):void");
                }

                @Override // com.ss.android.ad.splash.x
                public final void a(ImageView imageView, String str, int i2, String str2, p pVar) {
                    Bitmap a2;
                    com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34766a = false;
                    if (!l.a(str)) {
                        Context a3 = d.a();
                        if (((long) i2) == 1) {
                            byte[] a4 = n.c(a3).a(str, str2);
                            if (a4 != null) {
                                e b2 = com.facebook.drawee.a.a.c.b();
                                b2.f47315c = (REQUEST) com.facebook.imagepipeline.o.c.a(Uri.parse("data:image/gif;base64," + Base64.encodeToString(a4, 2))).a();
                                b2.f47319g = new com.facebook.drawee.c.c<f>(pVar) {
                                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass8 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ p f34751a;

                                    static {
                                        Covode.recordClassIndex(20840);
                                    }

                                    {
                                        this.f34751a = r1;
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                                    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                                    public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                                        if (animatable != null) {
                                            try {
                                                com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
                                                aVar.a(new com.ss.android.ugc.aweme.commercialize.g.d(aVar.f47564d, 1));
                                                aVar.a(new com.facebook.fresco.animation.c.b() {
                                                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass8.AnonymousClass1 */

                                                    static {
                                                        Covode.recordClassIndex(20841);
                                                    }

                                                    @Override // com.facebook.fresco.animation.c.b
                                                    public final void a(com.facebook.fresco.animation.c.a aVar, int i2) {
                                                    }

                                                    @Override // com.facebook.fresco.animation.c.b
                                                    public final void c(com.facebook.fresco.animation.c.a aVar) {
                                                    }

                                                    @Override // com.facebook.fresco.animation.c.b
                                                    public final void a(com.facebook.fresco.animation.c.a aVar) {
                                                        if (AnonymousClass8.this.f34751a != null) {
                                                            AnonymousClass8.this.f34751a.a();
                                                        }
                                                    }

                                                    @Override // com.facebook.fresco.animation.c.b
                                                    public final void b(com.facebook.fresco.animation.c.a aVar) {
                                                        if (AnonymousClass8.this.f34751a != null) {
                                                            AnonymousClass8.this.f34751a.b();
                                                        }
                                                    }
                                                });
                                                animatable.start();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                };
                                b2.f47322j = false;
                                com.facebook.drawee.c.a c2 = b2.e();
                                com.facebook.drawee.view.b a5 = com.facebook.drawee.view.b.a(new com.facebook.drawee.f.b(imageView.getResources()).a());
                                a5.a(c2);
                                Drawable f2 = a5.f();
                                if (f2 != null) {
                                    imageView.setImageDrawable(f2);
                                } else {
                                    pVar.c();
                                }
                            } else {
                                pVar.c();
                            }
                        } else {
                            byte[] a6 = n.c(a3).a(str, str2);
                            if (a6 == null || (a2 = a.a(a6, com.bytedance.common.utility.n.a(a3), com.bytedance.common.utility.n.b(a3))) == null) {
                                pVar.c();
                            } else {
                                imageView.setImageBitmap(a2);
                            }
                        }
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public static class c implements aa {
                static {
                    Covode.recordClassIndex(20845);
                }

                private c() {
                }

                /* synthetic */ c(byte b2) {
                    this();
                }

                @Override // com.ss.android.ad.splash.aa
                public final i a(String str) {
                    String c2 = RawURLGetter.c();
                    try {
                        String a2 = com.ss.android.ugc.aweme.commercialize.track.b.a(str, System.currentTimeMillis(), c2);
                        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "TrackUrlResponse_sendTrackUrl trackUrl = ".concat(String.valueOf(a2)));
                        com.bytedance.retrofit2.u<String> execute = com.bytedance.ies.ugc.aweme.commercialize.splash.f.f.b().executeGet(0, a2, c2).execute();
                        i.a aVar = new i.a();
                        aVar.f58618b = execute.f42629a.f42474b;
                        aVar.f58617a = c2;
                        return aVar.a();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new e(e2));
                        i.a aVar2 = new i.a();
                        aVar2.f58618b = -1;
                        aVar2.f58617a = c2;
                        return aVar2.a();
                    }
                }

                @Override // com.ss.android.ad.splash.aa
                public final y b(String str) {
                    if (com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().f()) {
                        return null;
                    }
                    try {
                        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "SplashAdResponse_sendStockUrl".concat(String.valueOf(str)));
                        try {
                            JSONObject jSONObject = new JSONObject((String) com.bytedance.ies.ugc.aweme.commercialize.splash.f.f.a().executeGet(0, str).execute().f42630b);
                            y.a aVar = new y.a();
                            aVar.f59060b = true;
                            aVar.f59059a = jSONObject;
                            return new y(aVar);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                            return null;
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new e(e3));
                        return null;
                    }
                }

                @Override // com.ss.android.ad.splash.aa
                public final y a(String str, JSONObject jSONObject) {
                    try {
                        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "SplashAdResponse_sendSplashAckUrl url path = ".concat(String.valueOf(str)));
                        JSONObject jSONObject2 = new JSONObject((String) com.bytedance.ies.ugc.aweme.commercialize.splash.f.f.a().executePost(0, com.ss.android.ugc.aweme.commercialize.util.c.f75475a + str, new TypedByteArray("application/json", jSONObject.toString().getBytes("UTF-8"), new String[0])).execute().f42630b);
                        y.a aVar = new y.a();
                        aVar.f59060b = true;
                        aVar.f59059a = jSONObject2;
                        return new y(aVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new e(e2));
                        return null;
                    }
                }

                @Override // com.ss.android.ad.splash.aa
                public final y a(String str, String str2) {
                    T t;
                    if (l.a(str) || com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().f()) {
                        return null;
                    }
                    boolean z = false;
                    try {
                        String b2 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().b();
                        if (!TextUtils.isEmpty(b2)) {
                            str = str + "&user_id=" + b2;
                        }
                        String str3 = str + "&gaid=" + URLEncoder.encode(com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().c());
                        String c2 = RawURLGetter.c();
                        if (!TextUtils.isEmpty(c2)) {
                            str3 = str3 + "&ad_user_agent=" + URLEncoder.encode(c2);
                        }
                        String str4 = com.ss.android.ugc.aweme.commercialize.util.c.f75475a + (str3 + "&cmpl_enc=" + com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().e());
                        com.ss.android.ugc.aweme.framework.a.a.b(3, null, "SplashAdResponse_loadAdMessage url = ".concat(String.valueOf(str4)));
                        t = com.bytedance.ies.ugc.aweme.commercialize.splash.f.f.a().executePost(0, str4, str2).execute().f42630b;
                        if (t == null) {
                            t = "";
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new e(e2));
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(t);
                        y.a aVar = new y.a();
                        if (!TextUtils.isEmpty(t)) {
                            z = true;
                        }
                        aVar.f59060b = z;
                        aVar.f59059a = jSONObject;
                        return new y(aVar);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                        return null;
                    }
                }

                @Override // com.ss.android.ad.splash.aa
                public final boolean a(String str, String str2, h hVar) {
                    if (l.a(str) || l.a(str2)) {
                        return false;
                    }
                    if (new File(str2).exists()) {
                        return true;
                    }
                    return a.a(str, str2, hVar);
                }

                @Override // com.ss.android.ad.splash.aa
                public final void a(String str, String str2, h hVar, aa.a aVar) {
                    AnonymousClass9 r4 = new IDownloadListener(aVar, hVar, str) {
                        /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass9 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ aa.a f34753a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ h f34754b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f34755c;

                        static {
                            Covode.recordClassIndex(20842);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onCanceled(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFirstStart(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFirstSuccess(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onPause(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onPrepare(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onProgress(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onStart(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            aa.a aVar = this.f34753a;
                            if (aVar != null) {
                                aVar.a();
                            }
                            com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.b(true, Long.valueOf(this.f34754b.f58987a), this.f34754b.f58988b, null);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            aa.a aVar = this.f34753a;
                            if (aVar != null) {
                                aVar.b();
                            }
                            com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.b(false, Long.valueOf(this.f34754b.f58987a), this.f34754b.f58988b, baseException.getErrorMessage());
                        }

                        {
                            this.f34753a = r1;
                            this.f34754b = r2;
                            this.f34755c = r3;
                        }
                    };
                    int lastIndexOf = str2.lastIndexOf("/") + 1;
                    String substring = str2.substring(lastIndexOf);
                    String substring2 = str2.substring(0, lastIndexOf);
                    com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                    with.f83081f = substring2;
                    with.f83078c = substring;
                    com.ss.android.ugc.aweme.download.component_api.a a2 = with.a("ad_splash_init_manager");
                    a2.D = r4;
                    a2.f();
                }
            }

            public static boolean a(String str, String str2, h hVar) {
                MethodCollector.i(11606);
                File file = new File(str2);
                String str3 = str2 + ".tmp";
                try {
                    if (!TextUtils.isEmpty(str3)) {
                        int lastIndexOf = str3.lastIndexOf("/") + 1;
                        if (com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a(d.a(), str, str3.substring(0, lastIndexOf), str3.substring(lastIndexOf))) {
                            File file2 = new File(str3);
                            if (file2.renameTo(file)) {
                                com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(true, Long.valueOf(hVar.f58987a), hVar.f58988b, null);
                                MethodCollector.o(11606);
                                return true;
                            }
                            if (file2.exists()) {
                                a(file2);
                            }
                            com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, Long.valueOf(hVar.f58987a), hVar.f58988b, null);
                            MethodCollector.o(11606);
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, Long.valueOf(hVar.f58987a), hVar.f58988b, th.getMessage());
                }
                MethodCollector.o(11606);
                return false;
            }

            private static boolean a(File file) {
                MethodCollector.i(11608);
                try {
                    e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                    if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                        com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    }
                    if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                        com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                        MethodCollector.o(11608);
                        return false;
                    }
                } catch (Throwable unused) {
                }
                boolean delete = file.delete();
                MethodCollector.o(11608);
                return delete;
            }

            static {
                Covode.recordClassIndex(20831);
            }

            public static boolean a() {
                c();
                return f34744d;
            }

            static long b() {
                return SettingsManager.a().a("splash_preload_delay", 0L);
            }

            private static boolean d() {
                return com.ss.android.ugc.aweme.bf.d.a(d.a(), "file_splash_ad_preload", 0).getBoolean("key_splash_ad_preload_delay", true);
            }

            private static void c() {
                MethodCollector.i(11265);
                if (!f34745e) {
                    synchronized (f34746f) {
                        try {
                            if (!f34745e) {
                                f34744d = Keva.getRepo("ab_repo_cold_boot").getBoolean("splash_ad_enable", true);
                                if (com.bytedance.ies.ugc.aweme.commercialize.splash.setting.g.c() && br.a()) {
                                    f34744d = false;
                                }
                                f34745e = true;
                            }
                        } finally {
                            MethodCollector.o(11265);
                        }
                    }
                    return;
                }
                MethodCollector.o(11265);
            }

            public static u a(Context context) {
                c(context);
                return f34743c;
            }

            private static Context d(Context context) {
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                return applicationContext;
            }

            public static s b(Context context) {
                c(context);
                j.a(context, null);
                return n.f58999a;
            }

            private static File g(Context context) {
                if (com.ss.android.ugc.aweme.lancet.d.f107193a != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
                    return com.ss.android.ugc.aweme.lancet.d.f107193a;
                }
                File externalCacheDir = context.getExternalCacheDir();
                com.ss.android.ugc.aweme.lancet.d.f107193a = externalCacheDir;
                return externalCacheDir;
            }

            private static void e(Context context) {
                HashMap<String, String> hashMap;
                if (!a() || com.bytedance.ies.abmock.b.a().a(true, "splash_param_optimize_enabled", true)) {
                    hashMap = null;
                } else {
                    hashMap = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a();
                }
                a(context, hashMap, a());
            }

            private static String f(Context context) {
                System.currentTimeMillis();
                String str = g(context).getParent() + "/splashCache/";
                System.currentTimeMillis();
                return str;
            }

            private static void c(Context context) {
                MethodCollector.i(11422);
                if (f34742b) {
                    MethodCollector.o(11422);
                    return;
                }
                synchronized (a.class) {
                    try {
                        if (!f34742b) {
                            e(context);
                            f34743c = n.a(context);
                            a(d(context), f34743c);
                            com.bytedance.ies.ugc.aweme.commercialize.splash.show.d.a();
                            k.a();
                            k.b();
                            f34742b = true;
                            MethodCollector.o(11422);
                        }
                    } finally {
                        MethodCollector.o(11422);
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[Catch:{ JSONException -> 0x0048 }] */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[Catch:{ JSONException -> 0x0048 }] */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static void a(com.ss.android.ad.splash.r.a r5) {
                /*
                    java.lang.String r1 = com.bytedance.ies.ugc.aweme.commercialize.splash.setting.e.a()
                    boolean r0 = com.ss.android.ad.splash.f.l.a(r1)
                    if (r0 != 0) goto L_0x0014
                    org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0010 }
                    r4.<init>(r1)     // Catch:{ JSONException -> 0x0010 }
                    goto L_0x0015
                L_0x0010:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x0014:
                    r4 = 0
                L_0x0015:
                    boolean r0 = r4 instanceof org.json.JSONObject
                    if (r0 != 0) goto L_0x001e
                    org.json.JSONObject r4 = new org.json.JSONObject
                    r4.<init>()
                L_0x001e:
                    com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.a()     // Catch:{ JSONException -> 0x0048 }
                    java.lang.String r0 = "enable_splash_show_count_for_empty"
                    r3 = 1
                    boolean r0 = r1.a(r0, r3)     // Catch:{ JSONException -> 0x0048 }
                    if (r0 == 0) goto L_0x0030
                    java.lang.String r0 = "enable_add_show_count_for_empty_array"
                    r4.put(r0, r3)     // Catch:{ JSONException -> 0x0048 }
                L_0x0030:
                    com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.a()     // Catch:{ JSONException -> 0x0048 }
                    java.lang.String r1 = "splash_disappear_time"
                    r0 = 0
                    int r0 = r2.a(r1, r0)     // Catch:{ JSONException -> 0x0048 }
                    if (r0 == 0) goto L_0x0042
                    java.lang.String r0 = "enable_post_stop_video"
                    r4.put(r0, r3)     // Catch:{ JSONException -> 0x0048 }
                L_0x0042:
                    java.lang.String r0 = "enable_cold_launch_interval"
                    r4.put(r0, r3)     // Catch:{ JSONException -> 0x0048 }
                    goto L_0x004c
                L_0x0048:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x004c:
                    r5.s = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.a(com.ss.android.ad.splash.r$a):void");
            }

            private static void a(final Context context, u uVar) {
                long b2;
                long a2 = SettingsManager.a().a("splash_stock_delay_millis_time", InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                boolean d2 = d();
                int i2 = d.n;
                AnonymousClass2 r8 = new com.ss.android.ad.splash.b() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(20833);
                    }

                    @Override // com.ss.android.ad.splash.b
                    public final HashMap<String, String> a() {
                        if (com.bytedance.ies.abmock.b.a().a(true, "splash_param_optimize_enabled", true)) {
                            return com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a();
                        }
                        return super.a();
                    }
                };
                if (!com.bytedance.ies.ugc.aweme.commercialize.splash.setting.j.c()) {
                    com.bytedance.ies.ugc.aweme.commercialize.splash.f.f.a();
                    com.bytedance.ies.ugc.aweme.commercialize.splash.f.f.b();
                }
                u a3 = uVar.b(SettingsManager.a().a("splash_support_timeout", false)).a(new b((byte) 0)).a(new c((byte) 0)).a(com.bytedance.ies.abmock.b.a().a(true, "aweme_splash_first_launch_enabled", false)).a(TimeUnit.DAYS.toMillis(10)).c(a2).d().i().a(new C0785a((byte) 0));
                if (d2) {
                    b2 = 15000;
                } else {
                    b2 = b();
                }
                a3.b(b2).a(r8).e(SettingsManager.a().a("enable_splash_valid_time_check", false)).f(SettingsManager.a().a("enable_splash_new_first_view_logic", true)).a(new JSONArray((Collection) com.bytedance.ies.ugc.aweme.commercialize.splash.setting.k.a()), i2).e().a(new com.ss.android.ad.splash.d() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(20834);
                    }

                    @Override // com.ss.android.ad.splash.d
                    public final void a(List<? extends com.ss.android.ad.splash.c.a> list) {
                        if (list != null && !list.isEmpty()) {
                            b.i.b(new d(list), b.i.f4824a);
                        }
                    }
                }).d(SettingsManager.a().a("splash_new_view", true));
                uVar.a(new com.ss.android.ad.splash.c() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass4 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ boolean f34748a = false;

                    static {
                        Covode.recordClassIndex(20835);
                    }

                    @Override // com.ss.android.ad.splash.c
                    public final void a(String str, String str2, Throwable th, JSONObject jSONObject) {
                        if (this.f34748a) {
                            super.a(str, str2, th, jSONObject);
                            com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a(str2);
                            ALog.d(str, str2);
                        }
                    }

                    @Override // com.ss.android.ad.splash.c
                    public final void b(String str, String str2, Throwable th, JSONObject jSONObject) {
                        if (this.f34748a) {
                            super.b(str, str2, th, jSONObject);
                            com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a(str2);
                            ALog.i(str, str2);
                        }
                    }

                    @Override // com.ss.android.ad.splash.c
                    public final void c(String str, String str2, Throwable th, JSONObject jSONObject) {
                        if (this.f34748a) {
                            super.c(str, str2, th, jSONObject);
                            com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a(str2);
                            ALog.w(str, str2);
                        }
                    }

                    @Override // com.ss.android.ad.splash.c
                    public final void d(String str, String str2, Throwable th, JSONObject jSONObject) {
                        if (this.f34748a) {
                            super.d(str, str2, th, jSONObject);
                            com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a(str2);
                        }
                        ALog.e(str, str2);
                    }
                });
                uVar.a(b.f34756a);
                com.ss.android.ad.splash.core.i.b d3 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().d();
                if (d3 != null) {
                    uVar.a(d3);
                }
                a(uVar, d2);
                uVar.c(com.bytedance.ies.ugc.aweme.commercialize.splash.setting.f.a());
                uVar.a(com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a(context));
                uVar.b(com.bytedance.ies.abmock.b.a().a(true, "splash_download_async_type", 0));
                uVar.a(new com.ss.android.ad.splash.k() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(20836);
                    }

                    @Override // com.ss.android.ad.splash.k
                    public final void a(String str, JSONObject jSONObject) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList.add("https://mon.tiktokv.com/monitor/appmonitor/v2/settings");
                        arrayList2.add("https://mon.tiktokv.com/monitor/collect/");
                        SDKMonitorUtils.a(str, arrayList);
                        SDKMonitorUtils.b(str, arrayList2);
                        Context applicationContext = context.getApplicationContext();
                        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                        SDKMonitorUtils.a(applicationContext, str, jSONObject, new k.a() {
                            /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass5.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(20837);
                            }

                            @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                            public final String a() {
                                return null;
                            }

                            @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                            public final Map<String, String> b() {
                                HashMap hashMap = new HashMap();
                                hashMap.put("oversea", "1");
                                return hashMap;
                            }
                        });
                    }
                });
                uVar.h();
                try {
                    uVar.c(f(context));
                    uVar.b(com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.a());
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                }
                n.b(context).a(new com.ss.android.ad.splash.e() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(20838);
                    }

                    @Override // com.ss.android.ad.splash.e
                    public final int a(int i2) {
                        if (i2 == 4) {
                            return R.drawable.bkc;
                        }
                        return 2131233870;
                    }
                }).k().n().m().o().q().p().l();
            }

            private static void a(u uVar, boolean z) {
                if (z) {
                    com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a(new c(uVar));
                    com.ss.android.ugc.aweme.bf.d.a(d.a(), "file_splash_ad_preload", 0).edit().putBoolean("key_splash_ad_preload_delay", false).apply();
                }
            }

            private static int a(BitmapFactory.Options options, int i2, int i3) {
                int i4 = options.outWidth;
                int i5 = options.outHeight;
                int i6 = i4 / 2;
                int i7 = i5 / 2;
                int i8 = 1;
                while (i6 / i8 >= i2 && i7 / i8 >= i3) {
                    i8 *= 2;
                }
                return i8;
            }

            private static void a(final Context context, HashMap<String, String> hashMap, boolean z) {
                AnonymousClass1 r1 = new com.ss.android.ad.splash.c.c() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(20832);
                    }

                    @Override // com.ss.android.ad.splash.c.c
                    public final void a(List<String> list) {
                        com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h a2 = com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.a();
                        com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
                        if (com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.d()) {
                            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: filter by low device");
                        } else if (com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.f34889a == null) {
                            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: filter by preference null");
                        } else if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
                            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: splash ids null");
                        } else {
                            boolean z = false;
                            for (String str : list) {
                                Aweme a3 = com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.f34889a.a(str);
                                if (a3 != null) {
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "download_video_count_splash_sdk", a3.getAwemeRawAd()).b();
                                    if ((!z || com.bytedance.ies.abmock.b.a().a(true, "awesome_splash_preload_optimize", 0) == 0) && a2.a(a3)) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.ss.android.ad.splash.c.c
                    public final boolean a(com.ss.android.ad.splash.c.a aVar, boolean z) {
                        boolean z2;
                        AwemeSplashInfo splashInfo;
                        com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.a();
                        String t = aVar.t();
                        com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a();
                        if (com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.d()) {
                            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: filter by low device");
                        } else {
                            Aweme aweme = com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.f34889a.a().get(t);
                            if (aweme == null) {
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme null");
                            } else {
                                String str = "1";
                                if (com.ss.android.ugc.aweme.commercialize.e.a.b.H(aweme)) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme past data".concat(String.valueOf(t)));
                                    a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", aweme.getAwemeRawAd()).a("ad_show_fail_type", "5");
                                    if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                        str = "2";
                                    }
                                    a2.a("awemelaunch", str).b();
                                    com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, "5");
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                } else if (!com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().b(aweme)) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme not vaild".concat(String.valueOf(t)));
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "data_invalid", aweme.getAwemeRawAd()).b();
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                } else if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.b.f34767b) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: open from push");
                                    a.C0791a a3 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", aweme.getAwemeRawAd()).a("ad_show_fail_type", "2").a("ad_show_fail_type2_reason", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.c());
                                    if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                        str = "2";
                                    }
                                    a3.a("awemelaunch", str).b();
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                    com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, "2");
                                } else if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b && com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) && aweme.getAwemeRawAd().getSplashInfo() != null && aweme.getAwemeRawAd().getSplashInfo().isDisableHotStartShow()) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: disable hot start");
                                    a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", aweme.getAwemeRawAd()).a("ad_show_fail_type", "7").a("ad_show_fail_type2_reason", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.c());
                                    if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                        str = "2";
                                    }
                                    a4.a("awemelaunch", str).b();
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                    com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, "7");
                                } else if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b && !com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34787c) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: not from launcher");
                                    a.C0791a a5 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", aweme.getAwemeRawAd()).a("ad_show_fail_type", "2").a("ad_show_fail_type2_reason", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.c());
                                    if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                        str = "2";
                                    }
                                    a5.a("awemelaunch", str).b();
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                    com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, "2");
                                } else if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34790f) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: main activity not on feed");
                                    a.C0791a a6 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", aweme.getAwemeRawAd()).a("ad_show_fail_type", "2").a("ad_show_fail_type2_reason", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.c());
                                    if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                        str = "2";
                                    }
                                    a6.a("awemelaunch", str).b();
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                    com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, "2");
                                } else if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b || com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().q()) {
                                    AwemeSplashInfo m2 = com.ss.android.ugc.aweme.commercialize.e.a.b.m(aweme);
                                    if (m2 == null) {
                                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme splash info null");
                                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "data_invalid", aweme.getAwemeRawAd()).b();
                                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                    } else if (m2.isInvalidAd()) {
                                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: aweme data invalid");
                                        a.C0791a a7 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", aweme.getAwemeRawAd()).a("ad_show_fail_type", "4");
                                        if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                            str = "2";
                                        }
                                        a7.a("awemelaunch", str).b();
                                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                        com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, "4");
                                    } else {
                                        Video video = aweme.getVideo();
                                        if (video == null) {
                                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "data_invalid", aweme.getAwemeRawAd()).b();
                                        } else {
                                            VideoUrlModel playAddr = video.getPlayAddr();
                                            if (playAddr == null || com.bytedance.common.utility.collection.b.a((Collection) playAddr.getUrlList())) {
                                                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "data_invalid", aweme.getAwemeRawAd()).b();
                                            } else if (TextUtils.isEmpty(com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.a(aweme.getAid()))) {
                                                a.C0791a a8 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", aweme.getAwemeRawAd()).a("ad_show_fail_type", str);
                                                if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                                    str = "2";
                                                }
                                                a8.a("awemelaunch", str).b();
                                            } else if (m2.getHotShowType() != 1 || !com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34791g) {
                                                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", true).a("show_immediately", Boolean.valueOf(z)).b();
                                                if (z) {
                                                    if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b && com.bytedance.ies.ugc.aweme.commercialize.splash.setting.b.a()) {
                                                        com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().e(aweme);
                                                    }
                                                    com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34792h = t;
                                                    com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34788d = t;
                                                    AwemeRawAd n = com.ss.android.ugc.aweme.commercialize.e.a.b.n(aweme);
                                                    if (!(n == null || (splashInfo = n.getSplashInfo()) == null || !splashInfo.isDisableHotStartShow())) {
                                                        com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34789e = n.getAdId();
                                                    }
                                                }
                                                z2 = true;
                                                com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(true, aweme, null);
                                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView data ready");
                                                aVar.t();
                                                return z2;
                                            } else {
                                                a.C0791a a9 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", aweme.getAwemeRawAd()).a("ad_show_fail_type", "2").a("ad_show_fail_type2_reason", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.c());
                                                if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                                    str = "2";
                                                }
                                                a9.a("awemelaunch", str).b();
                                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: not right scene because comment/share/dislike panel is showing");
                                                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                                com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, "2");
                                            }
                                        }
                                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: data not available");
                                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                    }
                                } else {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView not show reason: main activity not on top");
                                    a.C0791a a10 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", aweme.getAwemeRawAd()).a("ad_show_fail_type", "2").a("ad_show_fail_type2_reason", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.h.c());
                                    if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                        str = "2";
                                    }
                                    a10.a("awemelaunch", str).b();
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_pick", aweme.getAwemeRawAd()).a("splash_id", com.ss.android.ugc.aweme.commercialize.e.a.b.I(aweme)).a("splash_ready", false).a("show_immediately", Boolean.valueOf(z)).b();
                                    com.bytedance.ies.ugc.aweme.commercialize.splash.e.a.a(false, aweme, "2");
                                }
                            }
                        }
                        z2 = false;
                        aVar.t();
                        return z2;
                    }
                };
                r.a aVar = new r.a();
                aVar.o = new com.ss.android.ad.splash.a() {
                    /* class com.bytedance.ies.ugc.aweme.commercialize.splash.c.a.AnonymousClass7 */

                    static {
                        Covode.recordClassIndex(20839);
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String e() {
                        return d.s;
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String a() {
                        return String.valueOf(d.n);
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String b() {
                        return d.b();
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String c() {
                        return d.f();
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String j() {
                        return d.f();
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String d() {
                        return String.valueOf(d.d());
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String g() {
                        return com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().m();
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String h() {
                        return com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().n();
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String i() {
                        return com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().o();
                    }

                    @Override // com.ss.android.ad.splash.g, com.ss.android.ad.splash.a
                    public final String f() {
                        return new StringBuilder().append(d.h()).toString();
                    }
                };
                aVar.f59051h = hashMap;
                aVar.f59052i = r1;
                boolean z2 = true;
                aVar.f59053j = true;
                if (com.bytedance.ies.abmock.b.a().a(true, "splash_download_async_type", 0) == 0) {
                    z2 = false;
                }
                aVar.q = z2;
                aVar.f59055l = z;
                a(aVar);
                j.a(context, aVar.a());
            }

            public static Bitmap a(String str, int i2, int i3) {
                MethodCollector.i(11604);
                if (TextUtils.isEmpty(str)) {
                    MethodCollector.o(11604);
                    return null;
                } else if (i2 <= 0 || i3 <= 0) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    MethodCollector.o(11604);
                    return decodeFile;
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(str, options);
                    options.inSampleSize = a(options, i2, i3);
                    options.inJustDecodeBounds = false;
                    options.inPurgeable = true;
                    options.inInputShareable = true;
                    try {
                        decodeFile2 = BitmapFactory.decodeFile(str, options);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    MethodCollector.o(11604);
                    return decodeFile2;
                }
            }

            public static Bitmap a(byte[] bArr, int i2, int i3) {
                MethodCollector.i(11430);
                if (bArr == null) {
                    MethodCollector.o(11430);
                    return null;
                } else if (i2 <= 0 || i3 <= 0) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    MethodCollector.o(11430);
                    return decodeByteArray;
                } else {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    options.inSampleSize = a(options, i2, i3);
                    options.inJustDecodeBounds = false;
                    options.inPurgeable = true;
                    options.inInputShareable = true;
                    try {
                        decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    MethodCollector.o(11430);
                    return decodeByteArray2;
                }
            }
        }
