package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.ss.android.ugc.aweme.commercialize.log.ah;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.model.af;
import com.ss.android.ugc.aweme.commercialize.model.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.ag;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public final class bs {

    /* renamed from: a  reason: collision with root package name */
    public static final bs f75700a = new bs();

    /* renamed from: b  reason: collision with root package name */
    private static final h.m.l f75701b = new h.m.l("(\\d+)%");

    /* renamed from: c  reason: collision with root package name */
    private static final h.m.l f75702c = new h.m.l("(\\d{2}):(\\d{2}):(\\d{2})");

    /* access modifiers changed from: package-private */
    public static final class a implements com.bytedance.x.b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75703a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(46693);
        }

        @Override // com.bytedance.x.b
        public final Document a(String str) {
            boolean z;
            MethodCollector.i(9497);
            if (str != null) {
                try {
                    String a2 = RawURLGetter.a("other");
                    if (a2.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    List<com.ss.android.http.a.a> c2 = z ? null : h.a.n.c(new com.ss.android.http.a.b.a("User-Agent", a2));
                    ArrayList arrayList = new ArrayList();
                    if (c2 != null) {
                        for (com.ss.android.http.a.a aVar : c2) {
                            arrayList.add(new com.bytedance.retrofit2.client.b(aVar.a(), aVar.b()));
                        }
                    }
                    String str2 = RawURLGetter.a().doGet(str, arrayList).get();
                    if (str2 == null) {
                        h.f.b.l.b();
                    }
                    try {
                        Charset charset = h.m.d.f158808a;
                        if (str2 != null) {
                            byte[] bytes = str2.getBytes(charset);
                            h.f.b.l.b(bytes, "");
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                            try {
                                Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream);
                                h.e.c.a(byteArrayInputStream, null);
                                h.f.b.l.b(parse, "");
                                MethodCollector.o(9497);
                                return parse;
                            } catch (Throwable th) {
                                h.e.c.a(byteArrayInputStream, th);
                                MethodCollector.o(9497);
                                throw th;
                            }
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            MethodCollector.o(9497);
                            throw nullPointerException;
                        }
                    } catch (Throwable th2) {
                        com.bytedance.x.a.b bVar = new com.bytedance.x.a.b(th2);
                        MethodCollector.o(9497);
                        throw bVar;
                    }
                } catch (Exception e2) {
                    com.bytedance.x.a.a aVar2 = new com.bytedance.x.a.a(str, e2);
                    MethodCollector.o(9497);
                    throw aVar2;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("url is null");
                MethodCollector.o(9497);
                throw nullPointerException2;
            }
        }
    }

    private bs() {
    }

    public static final void a(h.l.h<String> hVar, ah ahVar) {
        com.ss.android.ugc.aweme.commercialize.log.g.a(ahVar, (Collection<String>) h.l.k.h(h.l.k.e(h.l.k.e(hVar), n.f75731a)), false);
    }

    public static final void a(String str, Aweme aweme, String str2) {
        h.l.h hVar;
        AwemeRawAd awemeRawAd;
        ai omVast;
        com.bytedance.x.b.f fVar;
        List<com.bytedance.x.b.b> list;
        if (str != null && br.a(aweme, 3)) {
            if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
                hVar = h.l.c.f158758a;
            } else {
                hVar = h.l.k.d(h.a.n.t(list), new r());
            }
            a(h.l.k.e(h.l.k.a(hVar, (h.f.a.b) new s(str)), t.f75737a), str2, aweme);
        }
    }

    private static boolean a() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            h.f.b.l.b(iESSettingsProxy, "");
            Boolean disableOmSdk = iESSettingsProxy.getDisableOmSdk();
            h.f.b.l.b(disableOmSdk, "");
            return disableOmSdk.booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return true;
        }
    }

    static /* synthetic */ void a(String str, String str2, long j2, String str3, Aweme aweme, AwemeRawAd awemeRawAd, int i2) {
        if ((i2 & 16) != 0) {
            aweme = null;
        }
        if ((i2 & 32) != 0) {
            awemeRawAd = null;
        }
        if (str3 != null) {
            f.b a2 = com.ss.android.ugc.aweme.commercialize.log.f.a(str, str2, j2);
            a2.f74809f = "track_url";
            a2.f74804a = "track_ad";
            a2.d(str3).b(aweme).b(awemeRawAd).b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements com.bytedance.x.c {

        /* renamed from: a  reason: collision with root package name */
        public final Aweme f75706a;

        /* renamed from: b  reason: collision with root package name */
        private final long f75707b = System.currentTimeMillis();

        /* renamed from: c  reason: collision with root package name */
        private long f75708c;

        /* renamed from: d  reason: collision with root package name */
        private int f75709d;

        /* renamed from: e  reason: collision with root package name */
        private final be f75710e = new be();

        /* renamed from: f  reason: collision with root package name */
        private final be f75711f = new be();

        static {
            Covode.recordClassIndex(46696);
        }

        @Override // com.bytedance.x.c
        public final void e() {
            this.f75709d--;
        }

        @Override // com.bytedance.x.c
        public final void b() {
            this.f75709d++;
            this.f75708c = System.currentTimeMillis();
        }

        @Override // com.bytedance.x.c
        public final void d() {
            if (this.f75710e.a()) {
                f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75706a);
                b2.f74804a = "draw_ad";
                b2.f74805b = "show_fail";
                b2.a(ag.a(h.v.a("error_message", "vast_wrapper_count_unmatch"))).a((Context) null);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_fail", this.f75706a.getAwemeRawAd()).a("error_message", "vast_wrapper_count_unmatch").c();
            }
        }

        @Override // com.bytedance.x.c
        public final void a() {
            this.f75709d++;
            this.f75708c = System.currentTimeMillis();
            if (this.f75711f.a()) {
                f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75706a);
                b2.f74804a = "draw_ad";
                b2.f74805b = "query_wrapper";
                b2.a(ag.a(h.v.a("duration", Long.valueOf(System.currentTimeMillis() - this.f75707b)))).a((Context) null);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "query_wrapper", this.f75706a.getAwemeRawAd()).a("duration", Long.valueOf(System.currentTimeMillis() - this.f75708c)).c();
            }
        }

        @Override // com.bytedance.x.c
        public final void c() {
            f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75706a);
            b2.f74804a = "draw_ad";
            b2.f74805b = "get_inline";
            b2.a(ag.a(h.v.a("duration", Long.valueOf(System.currentTimeMillis() - this.f75708c)), h.v.a("wrapper_count", Integer.valueOf(this.f75709d - 1)))).a((Context) null);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "get_inline", this.f75706a.getAwemeRawAd()).a("duration", Long.valueOf(System.currentTimeMillis() - this.f75708c)).a("wrapper_count", Integer.valueOf(this.f75709d - 1)).c();
        }

        public b(Aweme aweme) {
            h.f.b.l.d(aweme, "");
            this.f75706a = aweme;
        }

        @Override // com.bytedance.x.c
        public final void a(com.bytedance.x.a.a aVar) {
            String str;
            String str2;
            String str3 = null;
            if (aVar.getCause() instanceof com.ss.android.http.a.a.b) {
                f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75706a);
                b2.f74804a = "draw_ad";
                b2.f74805b = "show_fail";
                h.p[] pVarArr = new h.p[2];
                pVarArr[0] = h.v.a("error_message", "vast_mediafile_bad_response");
                Throwable cause = aVar.getCause();
                if (cause != null) {
                    str2 = cause.getMessage();
                } else {
                    str2 = null;
                }
                pVarArr[1] = h.v.a("error_detail", str2);
                b2.a(ag.a(pVarArr)).a((Context) null);
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_fail", this.f75706a.getAwemeRawAd()).a("error_message", "vast_mediafile_bad_response");
                Throwable cause2 = aVar.getCause();
                if (cause2 != null) {
                    str3 = cause2.getMessage();
                }
                a2.a("error_detail", str3).c();
                return;
            }
            f.b b3 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75706a);
            b3.f74804a = "draw_ad";
            b3.f74805b = "show_fail";
            h.p[] pVarArr2 = new h.p[2];
            pVarArr2[0] = h.v.a("error_message", "vast_filtered_others");
            Throwable cause3 = aVar.getCause();
            if (cause3 != null) {
                str = cause3.getMessage();
            } else {
                str = null;
            }
            pVarArr2[1] = h.v.a("error_detail", str);
            b3.a(ag.a(pVarArr2)).a((Context) null);
            a.C0791a a3 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_fail", this.f75706a.getAwemeRawAd()).a("error_message", "vast_filtered_others");
            Throwable cause4 = aVar.getCause();
            if (cause4 != null) {
                str3 = cause4.getMessage();
            }
            a3.a("error_detail", str3).c();
        }

        @Override // com.bytedance.x.c
        public final void a(com.bytedance.x.a.b bVar) {
            String str;
            f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75706a);
            b2.f74804a = "draw_ad";
            b2.f74805b = "show_fail";
            h.p[] pVarArr = new h.p[2];
            pVarArr[0] = h.v.a("error_message", "vast_xml_format_error");
            Throwable cause = bVar.getCause();
            String str2 = null;
            if (cause != null) {
                str = cause.getMessage();
            } else {
                str = null;
            }
            pVarArr[1] = h.v.a("error_detail", str);
            b2.a(ag.a(pVarArr)).a((Context) null);
            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_fail", this.f75706a.getAwemeRawAd()).a("error_message", "vast_xml_format_error");
            Throwable cause2 = bVar.getCause();
            if (cause2 != null) {
                str2 = cause2.getMessage();
            }
            a2.a("error_detail", str2).c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f75724a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f75725b = null;

        static {
            Covode.recordClassIndex(46703);
        }

        h(Aweme aweme, Runnable runnable) {
            this.f75724a = aweme;
        }

        public final void run() {
            AwemeRawAd awemeRawAd;
            ai omVast;
            Aweme aweme = this.f75724a;
            if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null)) {
                omVast.loading = false;
            }
            Runnable runnable = this.f75725b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    static {
        Covode.recordClassIndex(46692);
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f75712a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f75713b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f75714c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ai f75715d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f75716e;

        static {
            Covode.recordClassIndex(46698);
        }

        public d(Runnable runnable, Aweme aweme, long j2, ai aiVar, int i2) {
            this.f75712a = runnable;
            this.f75713b = aweme;
            this.f75714c = j2;
            this.f75715d = aiVar;
            this.f75716e = i2;
        }

        public final void run() {
            try {
                f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75713b);
                b2.f74804a = "draw_ad";
                b2.f74805b = "parse_vast";
                b2.a(ag.a(h.v.a("duration", Long.valueOf(System.currentTimeMillis() - this.f75714c)))).a((Context) null);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "parse_vast", this.f75713b.getAwemeRawAd()).a("duration", Long.valueOf(System.currentTimeMillis() - this.f75714c)).c();
                this.f75715d.loaded = true;
                this.f75715d.vast = new com.bytedance.x.b.f();
                String str = this.f75715d.vastUrl;
                if (str == null || str.length() == 0) {
                    String str2 = this.f75715d.vastContent;
                    if (str2 != null) {
                        if (str2.length() != 0) {
                            try {
                                this.f75715d.vast.parseContent(this.f75715d.vastContent, this.f75716e, a.f75703a, new b(this.f75713b));
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    this.f75715d.vast.parseUri(str, this.f75716e, a.f75703a, new b(this.f75713b));
                }
            } finally {
                Runnable runnable = this.f75712a;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f75717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f75718b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f75719c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.x.b.f f75720d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ai f75721e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f75722f;

        static {
            Covode.recordClassIndex(46699);
        }

        public e(Runnable runnable, Aweme aweme, long j2, com.bytedance.x.b.f fVar, ai aiVar, int i2) {
            this.f75717a = runnable;
            this.f75718b = aweme;
            this.f75719c = j2;
            this.f75720d = fVar;
            this.f75721e = aiVar;
            this.f75722f = i2;
        }

        public final void run() {
            String str;
            T t;
            Set<String> set;
            Boolean bool;
            h.l.h e2;
            List<BitRate> g2;
            UrlModel avatarThumb;
            List<String> urlList;
            String str2;
            try {
                f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75718b);
                b2.f74804a = "draw_ad";
                b2.f74805b = "parse_vast";
                com.bytedance.x.b.c cVar = null;
                b2.a(ag.a(h.v.a("duration", Long.valueOf(System.currentTimeMillis() - this.f75719c)))).a((Context) null);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "parse_vast", this.f75718b.getAwemeRawAd()).a("duration", Long.valueOf(System.currentTimeMillis() - this.f75719c)).c();
                try {
                    this.f75720d.parseContent(this.f75721e.vastContent, this.f75722f, a.f75703a, new b(this.f75718b));
                    String str3 = this.f75720d.adTitle;
                    if (!(str3 == null || str3.length() == 0)) {
                        this.f75721e.vast = this.f75720d;
                        com.bytedance.x.b.f fVar = this.f75720d;
                        User author = this.f75718b.getAuthor();
                        if (author == null || (str = author.getNickname()) == null || h.m.p.a((CharSequence) str) || str == null) {
                            str = this.f75720d.adTitle;
                        }
                        fVar.adTitle = str;
                        Aweme aweme = this.f75718b;
                        String desc = aweme.getDesc();
                        if (desc == null || h.m.p.a((CharSequence) desc)) {
                            desc = null;
                        }
                        if (desc == null && (desc = this.f75721e.vast.description) == null) {
                            desc = "";
                        }
                        aweme.setDesc(desc);
                        AwemeRawAd awemeRawAd = this.f75718b.getAwemeRawAd();
                        if (awemeRawAd != null) {
                            AwemeRawAd awemeRawAd2 = this.f75718b.getAwemeRawAd();
                            if (awemeRawAd2 == null || (str2 = awemeRawAd2.getWebUrl()) == null || h.m.p.a((CharSequence) str2) || str2 == null) {
                                com.bytedance.x.b.g g3 = bs.g(this.f75718b);
                                if (g3 != null) {
                                    str2 = g3.clickThrough;
                                } else {
                                    str2 = null;
                                }
                            }
                            awemeRawAd.setWebUrl(str2);
                        }
                        List<com.bytedance.x.b.b> list = this.f75720d.creativeList;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                T t2 = t;
                                if (t2 != null && !t2.byWrapper) {
                                    break;
                                }
                            }
                            T t3 = t;
                            if (t3 != null) {
                                User author2 = this.f75718b.getAuthor();
                                if (author2 == null || (avatarThumb = author2.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null) {
                                    set = null;
                                } else {
                                    set = h.l.k.f(h.l.k.b(h.a.n.t(urlList), f.f75723a));
                                }
                                try {
                                    IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                                    h.f.b.l.b(iESSettingsProxy, "");
                                    bool = iESSettingsProxy.getDisallowVastHasAuthor();
                                } catch (Throwable unused) {
                                    bool = false;
                                }
                                h.f.b.l.b(bool, "");
                                if (bool.booleanValue()) {
                                    this.f75718b.setAuthor(null);
                                }
                                com.bytedance.x.b.c a2 = br.a(this.f75718b, "icon");
                                if (a2 != null) {
                                    if (set == null || set.isEmpty() || set == null) {
                                        set = a2.staticResource;
                                    }
                                    a2.staticResource = set;
                                }
                                Aweme aweme2 = this.f75718b;
                                af afVar = this.f75721e.adChoiceIcon;
                                if (afVar != null) {
                                    cVar = afVar.toIcon("AdChoices");
                                }
                                bs.a(t3, aweme2, cVar);
                                double durationInMs = (double) t3.getDurationInMs();
                                List<com.bytedance.x.b.d> list2 = t3.mediaFileList;
                                if (!(list2 == null || (e2 = h.l.k.e(h.l.k.e(h.a.n.t(list2), new a(durationInMs)))) == null || (g2 = h.l.k.g(e2)) == null || g2.isEmpty())) {
                                    if (this.f75718b.getVideo() == null) {
                                        this.f75718b.setVideo(new Video());
                                    }
                                    UrlModel playAddr = g2.get(0).getPlayAddr();
                                    Video video = this.f75718b.getVideo();
                                    h.f.b.l.b(video, "");
                                    h.f.b.l.b(playAddr, "");
                                    video.setWidth(playAddr.getWidth());
                                    Video video2 = this.f75718b.getVideo();
                                    h.f.b.l.b(video2, "");
                                    video2.setHeight(playAddr.getHeight());
                                    Video video3 = this.f75718b.getVideo();
                                    h.f.b.l.b(video3, "");
                                    VideoUrlModel videoUrlModel = new VideoUrlModel();
                                    videoUrlModel.setWidth(playAddr.getWidth());
                                    videoUrlModel.setHeight(playAddr.getHeight());
                                    videoUrlModel.setUri(playAddr.getUri());
                                    videoUrlModel.setUrlKey(playAddr.getUrlKey());
                                    videoUrlModel.setUrlList(playAddr.getUrlList());
                                    videoUrlModel.setDuration((double) t3.getDurationInMs());
                                    video3.setPlayAddr(videoUrlModel);
                                    IESSettingsProxy iESSettingsProxy2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                                    h.f.b.l.b(iESSettingsProxy2, "");
                                    if (!iESSettingsProxy2.getDisableVastBitrate().booleanValue()) {
                                        Video video4 = this.f75718b.getVideo();
                                        h.f.b.l.b(video4, "");
                                        video4.setBitRate(g2);
                                    }
                                    this.f75718b.setTitle(this.f75721e.vast.adTitle);
                                    this.f75721e.loaded = true;
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
            } finally {
                Runnable runnable = this.f75717a;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.d, BitRate> {
            final /* synthetic */ double $duration;

            static {
                Covode.recordClassIndex(46700);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(double d2) {
                super(1);
                this.$duration = d2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ BitRate invoke(com.bytedance.x.b.d dVar) {
                return bs.a(dVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.d, BitRate> {
        final /* synthetic */ double $duration;

        static {
            Covode.recordClassIndex(46702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(double d2) {
            super(1);
            this.$duration = d2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ BitRate invoke(com.bytedance.x.b.d dVar) {
            return bs.a(dVar);
        }
    }

    public static final class p implements RawURLGetter.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwemeRawAd f75735a;

        static {
            Covode.recordClassIndex(46711);
        }

        public p(AwemeRawAd awemeRawAd) {
            this.f75735a = awemeRawAd;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.log.RawURLGetter.a
        public final void a(int i2, boolean z, Exception exc) {
            String str;
            if (!z) {
                f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75735a);
                b2.f74804a = "draw_ad";
                b2.f74805b = "load_failed";
                h.p[] pVarArr = new h.p[3];
                pVarArr[0] = h.v.a("error_message", "vast_clickthru_bad_response");
                pVarArr[1] = h.v.a("error_code", Integer.valueOf(i2));
                String str2 = null;
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pVarArr[2] = h.v.a("error_detail", str);
                b2.a(ag.a(pVarArr)).a((Context) null);
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "load_failed", this.f75735a).a("error_message", "vast_clickthru_bad_response").a("error_code", Integer.valueOf(i2));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a2.a("error_detail", str2).c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.e, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f75737a = new t();

        static {
            Covode.recordClassIndex(46715);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ String invoke(com.bytedance.x.b.e eVar) {
            return eVar.url;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.b, h.l.h<? extends com.bytedance.x.b.g>> {
        static {
            Covode.recordClassIndex(46697);
        }

        public c() {
            super(1);
        }

        public final h.l.h<com.bytedance.x.b.g> invoke(com.bytedance.x.b.b bVar) {
            List<com.bytedance.x.b.g> list;
            h.l.h<com.bytedance.x.b.g> t;
            if (bVar == null || (list = bVar.clickList) == null || (t = h.a.n.t(list)) == null) {
                return h.l.c.f158758a;
            }
            return t;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.g, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f75727a = new j();

        static {
            Covode.recordClassIndex(46705);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ String invoke(com.bytedance.x.b.g gVar) {
            com.bytedance.x.b.g gVar2 = gVar;
            if (gVar2 != null) {
                return gVar2.clickThrough;
            }
            return null;
        }
    }

    public static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.b, h.l.h<? extends com.bytedance.x.b.e>> {
        static {
            Covode.recordClassIndex(46713);
        }

        public r() {
            super(1);
        }

        public final h.l.h<com.bytedance.x.b.e> invoke(com.bytedance.x.b.b bVar) {
            List<com.bytedance.x.b.e> list;
            h.l.h<com.bytedance.x.b.e> t;
            if (bVar == null || (list = bVar.trackingEventList) == null || (t = h.a.n.t(list)) == null) {
                return h.l.c.f158758a;
            }
            return t;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.g, h.l.h<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f75738a = new u();

        static {
            Covode.recordClassIndex(46716);
        }

        u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.l.h<? extends String> invoke(com.bytedance.x.b.g gVar) {
            Set<String> set = gVar.clickTracking;
            if (set != null) {
                return h.a.n.t(set);
            }
            return h.l.c.f158758a;
        }
    }

    public static final class z extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.b, h.l.h<? extends com.bytedance.x.b.e>> {
        static {
            Covode.recordClassIndex(46721);
        }

        public z() {
            super(1);
        }

        public final h.l.h<com.bytedance.x.b.e> invoke(com.bytedance.x.b.b bVar) {
            List<com.bytedance.x.b.e> list;
            h.l.h<com.bytedance.x.b.e> t;
            if (bVar == null || (list = bVar.trackingEventList) == null || (t = h.a.n.t(list)) == null) {
                return h.l.c.f158758a;
            }
            return t;
        }
    }

    public static com.bytedance.x.b.g g(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return null;
        }
        return e(awemeRawAd);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f75723a = new f();

        static {
            Covode.recordClassIndex(46701);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.b, h.l.h<? extends com.bytedance.x.b.g>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f75726a = new i();

        static {
            Covode.recordClassIndex(46704);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.l.h<? extends com.bytedance.x.b.g> invoke(com.bytedance.x.b.b bVar) {
            com.bytedance.x.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            List<com.bytedance.x.b.g> list = bVar2.clickList;
            if (list != null) {
                return h.a.n.t(list);
            }
            return h.l.c.f158758a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.g, h.l.h<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f75728a = new k();

        static {
            Covode.recordClassIndex(46706);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.l.h<? extends String> invoke(com.bytedance.x.b.g gVar) {
            com.bytedance.x.b.g gVar2 = gVar;
            h.f.b.l.d(gVar2, "");
            Set<String> set = gVar2.clickTracking;
            if (set != null) {
                return h.a.n.t(set);
            }
            return h.l.c.f158758a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f75729a = new l();

        static {
            Covode.recordClassIndex(46707);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f75730a = new m();

        static {
            Covode.recordClassIndex(46708);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f75731a = new n();

        static {
            Covode.recordClassIndex(46709);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            return h.m.p.a(str2, "[ERRORCODE]", "0", false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f75736a = new q();

        static {
            Covode.recordClassIndex(46712);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.e, Boolean> {
        final /* synthetic */ String $name;

        static {
            Covode.recordClassIndex(46714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(String str) {
            super(1);
            this.$name = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.bytedance.x.b.e eVar) {
            String str;
            com.bytedance.x.b.e eVar2 = eVar;
            if (eVar2 != null) {
                str = eVar2.name;
            } else {
                str = null;
            }
            return Boolean.valueOf(h.f.b.l.a((Object) str, (Object) this.$name));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f75739a = new v();

        static {
            Covode.recordClassIndex(46717);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class w extends h.f.b.m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f75740a = new w();

        static {
            Covode.recordClassIndex(46718);
        }

        w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y extends h.f.b.m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f75744a = new y();

        static {
            Covode.recordClassIndex(46720);
        }

        y() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    public static final void a(com.bytedance.x.b.c cVar) {
        List<com.bytedance.x.b.g> list;
        if (cVar != null && (list = cVar.clickList) != null) {
            a(h.l.k.b(h.l.k.d(h.a.n.t(list), u.f75738a), v.f75739a), (ah) null);
        }
    }

    public static final boolean b(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !b(aweme.getAwemeRawAd())) {
            return false;
        }
        return true;
    }

    public static final boolean c(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !c(aweme.getAwemeRawAd())) {
            return false;
        }
        return true;
    }

    public static final com.bytedance.x.b.a e(Aweme aweme) {
        AwemeRawAd awemeRawAd = null;
        if (aweme != null) {
            if (!aweme.isAd()) {
                return null;
            }
            awemeRawAd = aweme.getAwemeRawAd();
        }
        return d(awemeRawAd);
    }

    public static final class aa extends h.f.b.m implements h.f.a.b<com.bytedance.x.b.e, Boolean> {
        final /* synthetic */ long $check;
        final /* synthetic */ long $duration;
        final /* synthetic */ long $now;

        static {
            Covode.recordClassIndex(46694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public aa(long j2, long j3, long j4) {
            super(1);
            this.$duration = j2;
            this.$now = j3;
            this.$check = j4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.bytedance.x.b.e eVar) {
            com.bytedance.x.b.e eVar2 = eVar;
            String str = eVar2.offset;
            boolean z = false;
            if (!(str == null || str.length() == 0 || (!h.f.b.l.a((Object) eVar2.name, (Object) "progress")))) {
                long j2 = this.$duration;
                String str2 = eVar2.offset;
                h.f.b.l.b(str2, "");
                long a2 = bs.a(j2, str2);
                long j3 = this.$now;
                if (this.$check + 1 <= a2 && j3 >= a2) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final boolean b(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getOmVast() == null) {
            return false;
        }
        if (d(awemeRawAd) == null || a()) {
            return true;
        }
        return false;
    }

    public static final boolean c(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getOmVast() == null || d(awemeRawAd) == null || a()) {
            return false;
        }
        return true;
    }

    private static com.bytedance.x.b.g e(AwemeRawAd awemeRawAd) {
        h.l.h hVar;
        ai omVast;
        com.bytedance.x.b.f fVar;
        List<com.bytedance.x.b.b> list;
        if (awemeRawAd == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
            hVar = h.l.c.f158758a;
        } else {
            hVar = h.l.k.d(h.a.n.t(list), new c());
        }
        return (com.bytedance.x.b.g) h.l.k.d(hVar);
    }

    public static final String f(Aweme aweme) {
        com.bytedance.x.b.g g2;
        if (!(aweme == null || (g2 = g(aweme)) == null)) {
            String str = g2.clickThrough;
            if (str != null && str.length() != 0) {
                return g2.clickThrough;
            }
            Set<String> set = g2.clickTracking;
            if (set != null && !set.isEmpty()) {
                Set<String> set2 = g2.clickTracking;
                h.f.b.l.b(set2, "");
                return (String) h.l.k.d(h.l.k.e(h.a.n.t(set2)));
            }
        }
        return null;
    }

    private static com.bytedance.x.b.a d(AwemeRawAd awemeRawAd) {
        List<com.bytedance.x.b.a> list;
        com.bytedance.x.b.f fVar;
        List<com.bytedance.x.b.a> list2;
        com.bytedance.x.b.a aVar;
        com.bytedance.x.b.f fVar2;
        List<com.bytedance.x.b.a> list3;
        if (awemeRawAd == null) {
            return null;
        }
        ai omVast = awemeRawAd.getOmVast();
        if (omVast == null || omVast.providerType != 3) {
            ai omVast2 = awemeRawAd.getOmVast();
            if (omVast2 != null && (fVar = omVast2.vast) != null && (list2 = fVar.adVerificationList) != null && (aVar = (com.bytedance.x.b.a) h.a.n.h((List) list2)) != null) {
                return aVar;
            }
            ai omVast3 = awemeRawAd.getOmVast();
            if (omVast3 == null || (list = omVast3.adVerificationList) == null) {
                return null;
            }
            return (com.bytedance.x.b.a) h.a.n.h((List) list);
        }
        ai omVast4 = awemeRawAd.getOmVast();
        if (omVast4 == null || (fVar2 = omVast4.vast) == null || (list3 = fVar2.adVerificationList) == null) {
            return null;
        }
        return (com.bytedance.x.b.a) h.a.n.h((List) list3);
    }

    public static BitRate a(com.bytedance.x.b.d dVar) {
        String str;
        int i2;
        String str2;
        int i3;
        int i4;
        if (dVar == null || (!h.f.b.l.a((Object) dVar.type, (Object) "video/mp4")) || dVar.width <= 0 || dVar.height <= 0 || (str = dVar.url) == null || str.length() == 0) {
            return null;
        }
        BitRate bitRate = new BitRate();
        bitRate.setBytevc1(0);
        int i5 = dVar.width;
        if (i5 >= 0) {
            if (540 > i5) {
                bitRate.setGearName("noraml_480");
                bitRate.setQualityType(301);
                if (dVar.bitRate > 0) {
                    i3 = dVar.bitRate * 1024;
                } else {
                    i3 = 600000;
                }
                bitRate.setBitRate(i3);
                str2 = "480p";
            } else if (540 <= i5 && 720 > i5) {
                bitRate.setGearName("normal_540");
                bitRate.setQualityType(201);
                if (dVar.bitRate > 0) {
                    i2 = dVar.bitRate * 1024;
                } else {
                    i2 = 1350000;
                }
                bitRate.setBitRate(i2);
                str2 = "540p";
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setWidth(dVar.width);
            urlModel.setHeight(dVar.height);
            String str3 = dVar.url;
            h.f.b.l.b(str3, "");
            Charset charset = h.m.d.f158808a;
            Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str3.getBytes(charset);
            h.f.b.l.b(bytes, "");
            urlModel.setUri(Base64.encodeToString(bytes, 2));
            urlModel.setUrlKey(urlModel.getUri() + "_h264_" + str2 + '_' + bitRate.getBitRate());
            urlModel.setUrlList(h.a.n.c(dVar.url));
            bitRate.setPlayAddr(urlModel);
            return bitRate;
        }
        bitRate.setGearName("normal_720");
        bitRate.setQualityType(101);
        if (dVar.bitRate > 0) {
            i4 = dVar.bitRate * 1024;
        } else {
            i4 = 2000000;
        }
        bitRate.setBitRate(i4);
        str2 = "720p";
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setWidth(dVar.width);
        urlModel2.setHeight(dVar.height);
        String str32 = dVar.url;
        h.f.b.l.b(str32, "");
        Charset charset2 = h.m.d.f158808a;
        Objects.requireNonNull(str32, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = str32.getBytes(charset2);
        h.f.b.l.b(bytes2, "");
        urlModel2.setUri(Base64.encodeToString(bytes2, 2));
        urlModel2.setUrlKey(urlModel2.getUri() + "_h264_" + str2 + '_' + bitRate.getBitRate());
        urlModel2.setUrlList(h.a.n.c(dVar.url));
        bitRate.setPlayAddr(urlModel2);
        return bitRate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r9 != null) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.bs.d(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        ai omVast;
        com.bytedance.x.b.f fVar;
        Set<String> set;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && (fVar = omVast.vast) != null && (set = fVar.impressionSet) != null) {
            Iterator a2 = h.l.k.a(h.a.n.t(set), (h.f.a.b) y.f75744a).a();
            while (a2.hasNext()) {
                String str = (String) a2.next();
                long currentTimeMillis = System.currentTimeMillis();
                h.f.b.l.b(str, "");
                RawURLGetter.a(str, new x(str, currentTimeMillis, aweme));
            }
        }
    }

    public static final void a(AwemeRawAd awemeRawAd) {
        com.bytedance.x.b.g e2;
        boolean z2;
        String str;
        if (awemeRawAd != null && (e2 = e(awemeRawAd)) != null) {
            Set<String> set = e2.clickTracking;
            if (set == null || set.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                Set<String> set2 = e2.clickTracking;
                h.f.b.l.b(set2, "");
                Iterator a2 = h.l.k.a(h.a.n.t(set2), (h.f.a.b) q.f75736a).a();
                while (a2.hasNext()) {
                    String str2 = (String) a2.next();
                    long currentTimeMillis = System.currentTimeMillis();
                    h.f.b.l.b(str2, "");
                    RawURLGetter.a(str2, new o(str2, currentTimeMillis, awemeRawAd));
                }
                return;
            }
            ai omVast = awemeRawAd.getOmVast();
            if (omVast != null && omVast.providerType == 2 && (str = e2.clickThrough) != null && str.length() != 0) {
                String str3 = e2.clickThrough;
                h.f.b.l.b(str3, "");
                RawURLGetter.a(str3, new p(awemeRawAd));
            }
        }
    }

    public static final void a(String str, Aweme aweme) {
        a(str, aweme, (String) null);
    }

    public static long a(long j2, String str) {
        h.m.j matchEntire = f75701b.matchEntire(str);
        if (matchEntire != null) {
            long j3 = j2 * 100;
            h.m.g a2 = matchEntire.c().a(1);
            if (a2 == null) {
                h.f.b.l.b();
            }
            return j3 / ((long) Integer.parseInt(a2.f158825a));
        }
        h.m.j matchEntire2 = f75702c.matchEntire(str);
        if (matchEntire2 == null) {
            return -1;
        }
        TimeUnit timeUnit = TimeUnit.HOURS;
        h.m.g a3 = matchEntire2.c().a(1);
        if (a3 == null) {
            h.f.b.l.b();
        }
        long millis = timeUnit.toMillis(Long.parseLong(a3.f158825a));
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        h.m.g a4 = matchEntire2.c().a(2);
        if (a4 == null) {
            h.f.b.l.b();
        }
        long millis2 = millis + timeUnit2.toMillis(Long.parseLong(a4.f158825a));
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        h.m.g a5 = matchEntire2.c().a(3);
        if (a5 == null) {
            h.f.b.l.b();
        }
        return millis2 + timeUnit3.toMillis(Long.parseLong(a5.f158825a));
    }

    /* access modifiers changed from: package-private */
    public static final class ab implements ah {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f75704a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f75705b;

        static {
            Covode.recordClassIndex(46695);
        }

        ab(String str, Aweme aweme) {
            this.f75704a = str;
            this.f75705b = aweme;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.log.ah
        public final void a(String str, String str2, long j2) {
            bs.a(str, str2, j2, this.f75704a, this.f75705b, null, 32);
        }
    }

    public static final class o implements RawURLGetter.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f75732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f75733b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AwemeRawAd f75734c;

        static {
            Covode.recordClassIndex(46710);
        }

        public o(String str, long j2, AwemeRawAd awemeRawAd) {
            this.f75732a = str;
            this.f75733b = j2;
            this.f75734c = awemeRawAd;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.log.RawURLGetter.a
        public final void a(int i2, boolean z, Exception exc) {
            String str;
            if (!z) {
                f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75734c);
                b2.f74804a = "draw_ad";
                b2.f74805b = "load_failed";
                h.p[] pVarArr = new h.p[3];
                pVarArr[0] = h.v.a("error_message", "vast_click_tracker_bad_response");
                pVarArr[1] = h.v.a("error_code", Integer.valueOf(i2));
                String str2 = null;
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pVarArr[2] = h.v.a("error_detail", str);
                b2.a(ag.a(pVarArr)).a((Context) null);
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "load_failed", this.f75734c).a("error_message", "vast_click_tracker_bad_response").a("error_code", Integer.valueOf(i2));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a2.a("error_detail", str2).c();
            }
            bs.a(this.f75732a, String.valueOf(i2), this.f75733b, "click", null, this.f75734c, 16);
        }
    }

    public static final class x implements RawURLGetter.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f75741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f75742b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f75743c;

        static {
            Covode.recordClassIndex(46719);
        }

        public x(String str, long j2, Aweme aweme) {
            this.f75741a = str;
            this.f75742b = j2;
            this.f75743c = aweme;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.log.RawURLGetter.a
        public final void a(int i2, boolean z, Exception exc) {
            String str;
            if (!z) {
                f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(this.f75743c);
                b2.f74804a = "draw_ad";
                b2.f74805b = "load_failed";
                h.p[] pVarArr = new h.p[3];
                pVarArr[0] = h.v.a("error_message", "vast_imp_tracker_bad_response");
                pVarArr[1] = h.v.a("error_code", Integer.valueOf(i2));
                String str2 = null;
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pVarArr[2] = h.v.a("error_detail", str);
                b2.a(ag.a(pVarArr)).a((Context) null);
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "load_failed", this.f75743c.getAwemeRawAd()).a("error_message", "vast_imp_tracker_bad_response").a("error_code", Integer.valueOf(i2));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a2.a("error_detail", str2).c();
            }
            bs.a(this.f75741a, String.valueOf(i2), this.f75742b, "show", this.f75743c, null, 32);
        }
    }

    public static final void a(h.l.h<String> hVar, String str, Aweme aweme) {
        h.f.b.l.d(hVar, "");
        a(hVar, new ab(str, aweme));
    }

    public static final void a(Aweme aweme, Executor executor, boolean z2) {
        AwemeRawAd awemeRawAd;
        ai omVast;
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null)) {
            omVast.loading = true;
        }
        a(aweme, executor, new h(aweme, null), z2);
    }

    public static void a(com.bytedance.x.b.b bVar, Aweme aweme, com.bytedance.x.b.c cVar) {
        if (cVar != null) {
            String str = cVar.program;
            h.f.b.l.b(str, "");
            com.bytedance.x.b.c a2 = br.a(aweme, str);
            if (a2 == null) {
                if (bVar.iconList == null) {
                    bVar.iconList = new LinkedList();
                }
                bVar.iconList.add(cVar);
                return;
            }
            Set<String> set = cVar.staticResource;
            if (set == null || set.isEmpty()) {
                set = a2.staticResource;
            }
            a2.staticResource = set;
            Set<String> set2 = cVar.viewTracking;
            if (set2 != null) {
                ArrayList arrayList = new ArrayList();
                for (T t2 : set2) {
                    T t3 = t2;
                    if (!(t3 == null || t3.length() == 0)) {
                        arrayList.add(t2);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    if (a2.viewTracking == null) {
                        a2.viewTracking = new HashSet();
                    }
                    a2.viewTracking.addAll(arrayList2);
                }
            }
            List<com.bytedance.x.b.g> list = cVar.clickList;
            if (!(list == null || list.isEmpty())) {
                if (a2.clickList == null) {
                    a2.clickList = new LinkedList();
                }
                List<com.bytedance.x.b.g> list2 = a2.clickList;
                List<com.bytedance.x.b.g> list3 = cVar.clickList;
                h.f.b.l.b(list3, "");
                list2.addAll(0, list3);
            }
        }
    }

    private static void a(Aweme aweme, Executor executor, Runnable runnable, boolean z2) {
        AwemeRawAd awemeRawAd;
        ai omVast;
        int i2;
        String str;
        String str2;
        T t2;
        Set<String> set;
        Boolean bool;
        h.l.h e2;
        List<BitRate> g2;
        UrlModel avatarThumb;
        List<String> urlList;
        String str3;
        String str4;
        String str5;
        com.bytedance.x.b.c cVar = null;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null) {
            runnable.run();
            return;
        }
        List<com.bytedance.x.b.a> list = omVast.adVerificationList;
        if ((list == null || list.isEmpty()) && (((str4 = omVast.vastContent) == null || str4.length() == 0) && ((str5 = omVast.vastUrl) == null || str5.length() == 0))) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                awemeRawAd2.setOmVast(null);
            }
            runnable.run();
            return;
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = omVast.vastWrapperCount;
        }
        long currentTimeMillis = System.currentTimeMillis();
        omVast.loaded = false;
        if (omVast.providerType == 2) {
            if (executor == null) {
                try {
                    f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(aweme);
                    b2.f74804a = "draw_ad";
                    b2.f74805b = "parse_vast";
                    b2.a(ag.a(h.v.a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)))).a((Context) null);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "parse_vast", aweme.getAwemeRawAd()).a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).c();
                    omVast.loaded = true;
                    omVast.vast = new com.bytedance.x.b.f();
                    String str6 = omVast.vastUrl;
                    if (str6 == null || str6.length() == 0) {
                        String str7 = omVast.vastContent;
                        if (str7 != null) {
                            if (str7.length() != 0) {
                                try {
                                    omVast.vast.parseContent(omVast.vastContent, i2, a.f75703a, new b(aweme));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } else {
                        omVast.vast.parseUri(str6, i2, a.f75703a, new b(aweme));
                    }
                } finally {
                    runnable.run();
                }
            } else {
                executor.execute(new d(runnable, aweme, currentTimeMillis, omVast, i2));
            }
        } else if (omVast.providerType != 3 || (str = omVast.vastContent) == null || str.length() == 0) {
            runnable.run();
        } else {
            com.bytedance.x.b.f fVar = new com.bytedance.x.b.f();
            if (executor == null) {
                try {
                    f.b b3 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(aweme);
                    b3.f74804a = "draw_ad";
                    b3.f74805b = "parse_vast";
                    b3.a(ag.a(h.v.a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)))).a((Context) null);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "parse_vast", aweme.getAwemeRawAd()).a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).c();
                    try {
                        fVar.parseContent(omVast.vastContent, i2, a.f75703a, new b(aweme));
                        String str8 = fVar.adTitle;
                        if (!(str8 == null || str8.length() == 0)) {
                            omVast.vast = fVar;
                            User author = aweme.getAuthor();
                            if (author == null || (str2 = author.getNickname()) == null || h.m.p.a((CharSequence) str2) || str2 == null) {
                                str2 = fVar.adTitle;
                            }
                            fVar.adTitle = str2;
                            String desc = aweme.getDesc();
                            if (desc == null || h.m.p.a((CharSequence) desc)) {
                                desc = null;
                            }
                            if (desc == null && (desc = omVast.vast.description) == null) {
                                desc = "";
                            }
                            aweme.setDesc(desc);
                            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                            if (awemeRawAd3 != null) {
                                AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                                if (awemeRawAd4 == null || (str3 = awemeRawAd4.getWebUrl()) == null || h.m.p.a((CharSequence) str3) || str3 == null) {
                                    com.bytedance.x.b.g g3 = g(aweme);
                                    if (g3 != null) {
                                        str3 = g3.clickThrough;
                                    } else {
                                        str3 = null;
                                    }
                                }
                                awemeRawAd3.setWebUrl(str3);
                            }
                            List<com.bytedance.x.b.b> list2 = fVar.creativeList;
                            if (list2 != null) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t2 = null;
                                        break;
                                    }
                                    t2 = it.next();
                                    T t3 = t2;
                                    if (t3 != null && !t3.byWrapper) {
                                        break;
                                    }
                                }
                                T t4 = t2;
                                if (t4 != null) {
                                    User author2 = aweme.getAuthor();
                                    if (author2 == null || (avatarThumb = author2.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null) {
                                        set = null;
                                    } else {
                                        set = h.l.k.f(h.l.k.b(h.a.n.t(urlList), f.f75723a));
                                    }
                                    try {
                                        IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                                        h.f.b.l.b(iESSettingsProxy, "");
                                        bool = iESSettingsProxy.getDisallowVastHasAuthor();
                                    } catch (Throwable unused2) {
                                        bool = false;
                                    }
                                    h.f.b.l.b(bool, "");
                                    if (bool.booleanValue()) {
                                        aweme.setAuthor(null);
                                    }
                                    com.bytedance.x.b.c a2 = br.a(aweme, "icon");
                                    if (a2 != null) {
                                        if (set == null || set.isEmpty() || set == null) {
                                            set = a2.staticResource;
                                        }
                                        a2.staticResource = set;
                                    }
                                    af afVar = omVast.adChoiceIcon;
                                    if (afVar != null) {
                                        cVar = afVar.toIcon("AdChoices");
                                    }
                                    a(t4, aweme, cVar);
                                    double durationInMs = (double) t4.getDurationInMs();
                                    List<com.bytedance.x.b.d> list3 = t4.mediaFileList;
                                    if (!(list3 == null || (e2 = h.l.k.e(h.l.k.e(h.a.n.t(list3), new g(durationInMs)))) == null || (g2 = h.l.k.g(e2)) == null || g2.isEmpty())) {
                                        if (aweme.getVideo() == null) {
                                            aweme.setVideo(new Video());
                                        }
                                        UrlModel playAddr = g2.get(0).getPlayAddr();
                                        Video video = aweme.getVideo();
                                        h.f.b.l.b(video, "");
                                        h.f.b.l.b(playAddr, "");
                                        video.setWidth(playAddr.getWidth());
                                        Video video2 = aweme.getVideo();
                                        h.f.b.l.b(video2, "");
                                        video2.setHeight(playAddr.getHeight());
                                        Video video3 = aweme.getVideo();
                                        h.f.b.l.b(video3, "");
                                        VideoUrlModel videoUrlModel = new VideoUrlModel();
                                        videoUrlModel.setWidth(playAddr.getWidth());
                                        videoUrlModel.setHeight(playAddr.getHeight());
                                        videoUrlModel.setUri(playAddr.getUri());
                                        videoUrlModel.setUrlKey(playAddr.getUrlKey());
                                        videoUrlModel.setUrlList(playAddr.getUrlList());
                                        videoUrlModel.setDuration((double) t4.getDurationInMs());
                                        video3.setPlayAddr(videoUrlModel);
                                        IESSettingsProxy iESSettingsProxy2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                                        h.f.b.l.b(iESSettingsProxy2, "");
                                        if (!iESSettingsProxy2.getDisableVastBitrate().booleanValue()) {
                                            Video video4 = aweme.getVideo();
                                            h.f.b.l.b(video4, "");
                                            video4.setBitRate(g2);
                                        }
                                        aweme.setTitle(omVast.vast.adTitle);
                                        omVast.loaded = true;
                                    }
                                }
                            }
                        }
                    } catch (Exception unused3) {
                    }
                } finally {
                    runnable.run();
                }
            } else {
                executor.execute(new e(runnable, aweme, currentTimeMillis, fVar, omVast, i2));
            }
        }
    }
}
