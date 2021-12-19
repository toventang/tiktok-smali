package com.ss.android.ugc.aweme.ay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.l;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.v;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.lancet.j;
import h.a.n;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.q;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f67775a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f67776b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final h f67777c = i.a((h.f.a.a) b.f67778a);

    public interface a {
        static {
            Covode.recordClassIndex(41728);
        }
    }

    private static int b() {
        return ((Number) f67777c.getValue()).intValue();
    }

    private c() {
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67778a = new b();

        static {
            Covode.recordClassIndex(41729);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "dynamic_cover_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(41727);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ay.c$c  reason: collision with other inner class name */
    public static final class C1530c implements com.bytedance.lighten.a.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f67779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f67780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Video f67781c;

        static {
            Covode.recordClassIndex(41730);
        }

        C1530c(boolean z, l lVar, Video video) {
            this.f67779a = z;
            this.f67780b = lVar;
            this.f67781c = video;
        }

        @Override // com.bytedance.lighten.a.c.f
        public final void a(final int i2) {
            b.i.b(new Callable(this) {
                /* class com.ss.android.ugc.aweme.ay.c.C1530c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1530c f67782a;

                static {
                    Covode.recordClassIndex(41731);
                }

                {
                    this.f67782a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    if (this.f67782a.f67779a && i2 >= 6 && !this.f67782a.f67780b.a() && this.f67782a.f67781c.getPlayAddr() != null) {
                        VideoUrlModel playAddr = this.f67782a.f67781c.getPlayAddr();
                        h.f.b.l.b(playAddr, "");
                        if (!TextUtils.isEmpty(playAddr.getUri())) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("frames", i2);
                                VideoUrlModel playAddr2 = this.f67782a.f67781c.getPlayAddr();
                                h.f.b.l.b(playAddr2, "");
                                jSONObject.put("vid", playAddr2.getUri());
                                jSONObject.put("url", this.f67782a.f67780b.f68145b.get(0));
                                o.a("aweme_animated_image_frames_error", jSONObject);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    return null;
                }
            }, g.c());
        }
    }

    private static boolean a(Context context) {
        boolean z;
        if (!com.ss.android.ugc.aweme.performance.i.a()) {
            if (!j.f107226e || !j.b() || j.c()) {
                j.f107226e = a();
            }
            if (!j.f107226e || com.ss.android.ugc.aweme.framework.c.a.a(context)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                if (com.ss.android.ugc.aweme.base.h.a.a("aweme_app", "use_dynamic_cover", z)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(UrlModel urlModel) {
        if (!(urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty())) {
            for (String str : urlModel.getUrlList()) {
                if (!TextUtils.isEmpty(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final class d extends com.bytedance.lighten.a.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartImageView f67784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f67785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f67786c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UrlModel f67787d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f67788e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Video f67789f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f67790g;

        static {
            Covode.recordClassIndex(41732);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            String str;
            if (this.f67790g && !this.f67788e.a() && this.f67789f.getPlayAddr() != null) {
                VideoUrlModel playAddr = this.f67789f.getPlayAddr();
                h.f.b.l.b(playAddr, "");
                if (!TextUtils.isEmpty(playAddr.getUri())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("frames", -1);
                        VideoUrlModel playAddr2 = this.f67789f.getPlayAddr();
                        h.f.b.l.b(playAddr2, "");
                        jSONObject.put("vid", playAddr2.getUri());
                        jSONObject.put("url", this.f67788e.f68145b.get(0));
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = null;
                        }
                        jSONObject.put("errMsg", str);
                        o.a("aweme_animated_image_frames_error", jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, com.bytedance.lighten.a.o oVar, Animatable animatable) {
            this.f67784a.setUserVisibleHint(true);
            if (this.f67786c) {
                this.f67784a.b();
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(this.f67787d.getUri());
            urlModel.setUrlList(this.f67788e.f68145b);
            this.f67789f.setCachedOuterCoverUrl(urlModel);
        }

        d(SmartImageView smartImageView, a aVar, boolean z, UrlModel urlModel, l lVar, Video video, boolean z2) {
            this.f67784a = smartImageView;
            this.f67785b = aVar;
            this.f67786c = z;
            this.f67787d = urlModel;
            this.f67788e = lVar;
            this.f67789f = video;
            this.f67790g = z2;
        }
    }

    private static String a(String str, String str2, String str3) {
        Throwable th;
        String str4;
        String str5 = "";
        h.f.b.l.d(str, str5);
        h.f.b.l.d(str2, str5);
        try {
            Uri parse = Uri.parse(str);
            h.f.b.l.b(parse, str5);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str6 : queryParameterNames) {
                if (h.f.b.l.a((Object) str6, (Object) str2)) {
                    str4 = str3;
                } else {
                    str4 = parse.getQueryParameter(str6);
                }
                clearQuery.appendQueryParameter(str6, str4);
            }
            String uri = clearQuery.build().toString();
            h.f.b.l.b(uri, str5);
            try {
                q.m223constructorimpl(z.f158842a);
                return uri;
            } catch (Throwable th2) {
                th = th2;
                str5 = uri;
            }
        } catch (Throwable th3) {
            th = th3;
            q.m223constructorimpl(r.a(th));
            return str5;
        }
    }

    public static /* synthetic */ boolean a(c cVar, SmartImageView smartImageView, Video video, String str, boolean z, boolean z2, int i2) {
        boolean z3 = z;
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        if ((i2 & 64) != 0) {
            z4 = true;
        }
        h.f.b.l.d(smartImageView, "");
        h.f.b.l.d(video, "");
        h.f.b.l.d(str, "");
        return a(cVar, smartImageView, video, str, z3, (a) null, z4, (Bitmap.Config) null, 256);
    }

    public static /* synthetic */ boolean a(c cVar, SmartImageView smartImageView, Video video, String str, boolean z, a aVar, boolean z2, Bitmap.Config config, int i2) {
        boolean z3 = z;
        a aVar2 = aVar;
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        if ((i2 & 16) != 0) {
            aVar2 = null;
        }
        if ((i2 & 64) != 0) {
            z4 = true;
        }
        return a(smartImageView, video, str, z3, aVar2, (String) null, z4, config, false);
    }

    private static void a(SmartImageView smartImageView, UrlModel urlModel, Video video, boolean z, String str, String str2, a aVar, boolean z2, Bitmap.Config config) {
        int i2;
        if (z) {
            i2 = r.f67839e.f39808b;
        } else {
            com.bytedance.lighten.a.a aVar2 = com.bytedance.lighten.a.a.f39807a;
            h.f.b.l.b(aVar2, "");
            i2 = aVar2.f39808b;
        }
        l a2 = v.a(urlModel);
        h.f.b.l.b(a2, "");
        if (!TextUtils.isEmpty(str2) && !a2.a()) {
            List<String> list = a2.f68145b;
            h.f.b.l.b(list, "");
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                h.f.b.l.b(t, "");
                String a3 = a(t, "l", "0");
                Map<String, String> map = f67776b;
                String str3 = map.get(a3);
                if (str3 == null || str3.length() <= 0) {
                    map.put(a3, t);
                } else {
                    a3 = map.get(a3);
                    if (a3 == null) {
                        a3 = t;
                    }
                }
                arrayList.add(p.e((CharSequence) t, (CharSequence) "?") ? (a3 + "&ilog=") + str2 : (a3 + "?ilog=") + str2);
            }
            a2.f68145b = arrayList;
        }
        com.bytedance.lighten.a.v a4 = com.bytedance.lighten.a.r.a(a2);
        a4.E = smartImageView;
        com.bytedance.lighten.a.v a5 = a4.a(str);
        if (config != null) {
            a5.u = Bitmap.Config.ARGB_8888;
        }
        a5.a(i2, new C1530c(z, a2, video)).a().a(new d(smartImageView, aVar, z2, urlModel, a2, video, z));
    }

    public static boolean a(SmartImageView smartImageView, Video video, String str, boolean z, a aVar, String str2, boolean z2, Bitmap.Config config, boolean z3) {
        h.f.b.l.d(smartImageView, "");
        h.f.b.l.d(video, "");
        h.f.b.l.d(str, "");
        if (z2 && !z3 && !a(com.bytedance.ies.ugc.appcontext.d.a())) {
            return false;
        }
        if ((h.f.b.l.a((Object) null, (Object) "9frames") || b() == 1) && a(video.getDynamicCover())) {
            UrlModel dynamicCover = video.getDynamicCover();
            h.f.b.l.b(dynamicCover, "");
            a(smartImageView, dynamicCover, video, false, str, "9frames", aVar, z, config);
            return true;
        }
        if (h.f.b.l.a((Object) null, (Object) "6frames") || b() == 2) {
            if (a(video.getAnimatedCover())) {
                UrlModel animatedCover = video.getAnimatedCover();
                h.f.b.l.b(animatedCover, "");
                a(smartImageView, animatedCover, video, true, str, "6frames", aVar, z, config);
                return true;
            } else if (a(video.getDynamicCover())) {
                UrlModel dynamicCover2 = video.getDynamicCover();
                h.f.b.l.b(dynamicCover2, "");
                a(smartImageView, dynamicCover2, video, false, str, "9frames_test", aVar, z, config);
                return true;
            }
        }
        if (b() != 0 || !a(video.getDynamicCover())) {
            return false;
        }
        UrlModel dynamicCover3 = video.getDynamicCover();
        h.f.b.l.b(dynamicCover3, "");
        a(smartImageView, dynamicCover3, video, false, str, "", aVar, z, config);
        return true;
    }
}
