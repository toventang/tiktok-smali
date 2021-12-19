package com.ss.android.ugc.aweme.share;

import android.net.Uri;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import com.ss.android.ugc.aweme.utils.cs;
import h.f.b.l;
import h.f.b.z;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123306a = new a((byte) 0);

    static {
        Covode.recordClassIndex(80997);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80998);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        public static final class c<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f123322a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f123323b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z.e f123324c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ z.e f123325d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f123326e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f123327f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f123328g;

            static {
                Covode.recordClassIndex(81001);
            }

            c(String str, String str2, z.e eVar, z.e eVar2, String str3, String str4, int i2) {
                this.f123322a = str;
                this.f123323b = str2;
                this.f123324c = eVar;
                this.f123325d = eVar2;
                this.f123326e = str3;
                this.f123327f = str4;
                this.f123328g = i2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                r.a("watermark_share_download", new d().a("group_id", this.f123322a).a("enter_from", this.f123323b).a("action_type", (String) this.f123324c.element).a("platform", (String) this.f123325d.element).a("is_long", this.f123326e).a("logo_name", this.f123327f).a("watermark_type", this.f123328g).f66730a);
                return null;
            }
        }

        public static final class b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f123317a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Long f123318b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Integer f123319c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f123320d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f123321e;

            static {
                Covode.recordClassIndex(81000);
            }

            public b(String str, Long l2, Integer num, String str2, boolean z) {
                this.f123317a = str;
                this.f123318b = l2;
                this.f123319c = num;
                this.f123320d = str2;
                this.f123321e = z;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                String d2 = cs.d(this.f123317a);
                long length = new File(this.f123317a).length();
                boolean equals = TextUtils.equals(d2, "20");
                com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
                Long l2 = this.f123318b;
                long j2 = 0;
                if (!(l2 == null || l2.longValue() == 0)) {
                    j2 = length / this.f123318b.longValue();
                }
                com.ss.android.ugc.aweme.app.f.c a2 = cVar.a("download_rate", Long.valueOf(j2)).a("download_duration", this.f123318b).a("file_size", Long.valueOf(length)).a("errorDesc", "null").a("errorCode", this.f123319c).a("url", this.f123320d).a("muteAudio", (Boolean) true).a("needWaterMark", Boolean.valueOf(this.f123321e)).a("fileMagic", cs.d(this.f123317a)).a("isMp4", Boolean.valueOf(equals));
                com.bytedance.u.b a3 = com.bytedance.u.b.a(com.bytedance.ies.ugc.appcontext.d.a());
                if (a3 != null) {
                    a2.a("has_remove_sd", (Boolean) true);
                    a2.a("sd_state", Boolean.valueOf(a3.a()));
                    a2.a("sd_available_size", Long.valueOf(a3.f45701a));
                    a2.a("share_dir", am.d(com.bytedance.ies.ugc.appcontext.d.a()));
                } else {
                    a2.a("has_remove_sd", (Boolean) false);
                }
                com.bytedance.apm.b.a("save_video_success_rate", 3, a2.a());
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ac$a$a  reason: collision with other inner class name */
        static final class CallableC3193a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f123307a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Long f123308b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f123309c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f123310d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Boolean f123311e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ UrlModel f123312f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ boolean f123313g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f123314h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ Integer f123315i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ boolean f123316j;

            static {
                Covode.recordClassIndex(80999);
            }

            CallableC3193a(String str, Long l2, long j2, String str2, Boolean bool, UrlModel urlModel, boolean z, String str3, Integer num, boolean z2) {
                this.f123307a = str;
                this.f123308b = l2;
                this.f123309c = j2;
                this.f123310d = str2;
                this.f123311e = bool;
                this.f123312f = urlModel;
                this.f123313g = z;
                this.f123314h = str3;
                this.f123315i = num;
                this.f123316j = z2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Integer num;
                List<String> urlList;
                Integer num2;
                List<String> urlList2;
                String str = this.f123307a;
                if (str != null) {
                    boolean equals = TextUtils.equals(cs.d(str), "20");
                    com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
                    Long l2 = this.f123308b;
                    long j2 = 0;
                    if (!(l2 == null || l2.longValue() == 0)) {
                        j2 = this.f123309c / this.f123308b.longValue();
                    }
                    com.ss.android.ugc.aweme.app.f.c a2 = cVar.a("download_rate", Long.valueOf(j2)).a("download_duration", this.f123308b).a("file_size", Long.valueOf(this.f123309c)).a("errorDesc", "null").a("errorCode", "null").a("url", this.f123310d).a("needWaterMark", (Boolean) false).a("muteAudio", this.f123311e).a("fileMagic", cs.d(this.f123307a)).a("isMp4", Boolean.valueOf(equals));
                    UrlModel urlModel = this.f123312f;
                    if (urlModel == null || (urlList2 = urlModel.getUrlList()) == null) {
                        num2 = null;
                    } else {
                        num2 = Integer.valueOf(urlList2.size());
                    }
                    com.ss.android.ugc.aweme.app.f.c a3 = a2.a("urlNums", num2).a("isPrivateAweme", Boolean.valueOf(this.f123313g));
                    if (!equals) {
                        ShareFlavorService a4 = ShareFlavorService.a.a();
                        String str2 = this.f123307a;
                        long j3 = this.f123309c;
                        l.b(a3, "");
                        a4.a(str2, j3, a3);
                    }
                    com.bytedance.u.b a5 = com.bytedance.u.b.a(com.bytedance.ies.ugc.appcontext.d.a());
                    if (a5 != null) {
                        a3.a("has_remove_sd", (Boolean) true);
                        a3.a("sd_state", Boolean.valueOf(a5.a()));
                        a3.a("sd_available_size", Long.valueOf(a5.f45701a));
                        a3.a("share_dir", am.d(com.bytedance.ies.ugc.appcontext.d.a()));
                    } else {
                        a3.a("has_remove_sd", (Boolean) false);
                    }
                    com.bytedance.apm.b.a("save_video_success_rate", 0, a3.a());
                } else {
                    com.ss.android.ugc.aweme.app.f.c a6 = new com.ss.android.ugc.aweme.app.f.c().a("download_rate", (Integer) 0).a("download_duration", this.f123308b).a("file_size", (Integer) -1).a("errorDesc", this.f123314h).a("errorCode", this.f123315i).a("url", this.f123310d).a("needWaterMark", Boolean.valueOf(this.f123316j)).a("fileMagic", "download_error").a("muteAudio", this.f123311e).a("strategy_enabled", Boolean.valueOf(com.bytedance.u.d.a())).a("isMp4", "notSure");
                    UrlModel urlModel2 = this.f123312f;
                    if (urlModel2 == null || (urlList = urlModel2.getUrlList()) == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(urlList.size());
                    }
                    com.ss.android.ugc.aweme.app.f.c a7 = a6.a("urlNums", num).a("isPrivateAweme", Boolean.valueOf(this.f123313g));
                    com.bytedance.u.b a8 = com.bytedance.u.b.a(com.bytedance.ies.ugc.appcontext.d.a());
                    if (a8 != null) {
                        a7.a("has_remove_sd", (Boolean) true);
                        a7.a("sd_state", Boolean.valueOf(a8.a()));
                        a7.a("sd_available_size", Long.valueOf(a8.f45701a));
                        a7.a("share_dir", am.d(com.bytedance.ies.ugc.appcontext.d.a()));
                    } else {
                        a7.a("has_remove_sd", (Boolean) false);
                    }
                    com.bytedance.apm.b.a("save_video_success_rate", 1, a7.a());
                }
                return null;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Aweme aweme) {
            if (aweme == null) {
                return false;
            }
            return aweme.isPrivate();
        }

        public static String a(UrlModel urlModel) {
            String str = null;
            if (urlModel != null && urlModel.getUrlList() != null) {
                for (String str2 : urlModel.getUrlList()) {
                    Uri parse = Uri.parse(str2);
                    l.b(parse, "");
                    if (!parse.isOpaque()) {
                        str = parse.getQueryParameter("logo_name");
                        if (!TextUtils.isEmpty(str)) {
                            break;
                        }
                    }
                }
            }
            return str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        public static void a(String str, String str2, String str3, String str4, String str5, int i2) {
            l.d(str4, "");
            z.e eVar = new z.e();
            eVar.element = null;
            z.e eVar2 = new z.e();
            eVar2.element = str3;
            if (l.a((Object) "download", (Object) str3)) {
                eVar.element = "download";
                eVar2.element = null;
            } else {
                eVar.element = "share";
            }
            i.b(new c(str, str2, eVar, eVar2, str4, str5, i2), i.f4824a);
        }

        public static void a(String str, long j2, Long l2, String str2, boolean z, Integer num, String str3, Boolean bool, UrlModel urlModel, boolean z2) {
            i.b(new CallableC3193a(str, l2, j2, str2, bool, urlModel, z2, str3, num, z), i.f4824a);
        }
    }
}
