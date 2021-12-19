package com.ss.android.ugc.aweme.kids.common.ui.a;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.d;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.l;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f105908a = new b();

    public interface a {
        static {
            Covode.recordClassIndex(67778);
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(67777);
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.a.b$b  reason: collision with other inner class name */
    public static final class C2697b implements com.bytedance.lighten.a.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f105909a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f105910b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Video f105911c;

        static {
            Covode.recordClassIndex(67779);
        }

        C2697b(l lVar, Video video) {
            this.f105910b = lVar;
            this.f105911c = video;
        }

        @Override // com.bytedance.lighten.a.c.f
        public final void a(final int i2) {
            i.b(new Callable(this) {
                /* class com.ss.android.ugc.aweme.kids.common.ui.a.b.C2697b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2697b f105912a;

                static {
                    Covode.recordClassIndex(67780);
                }

                {
                    this.f105912a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    if (this.f105912a.f105909a && i2 >= 6 && !this.f105912a.f105910b.a() && this.f105912a.f105911c.getPlayAddr() != null) {
                        VideoUrlModel playAddr = this.f105912a.f105911c.getPlayAddr();
                        h.f.b.l.b(playAddr, "");
                        if (!TextUtils.isEmpty(playAddr.getUri())) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("frames", i2);
                                VideoUrlModel playAddr2 = this.f105912a.f105911c.getPlayAddr();
                                h.f.b.l.b(playAddr2, "");
                                jSONObject.put("vid", playAddr2.getUri());
                                jSONObject.put("url", this.f105912a.f105910b.f68145b.get(0));
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

    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartImageView f105914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f105915b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f105916c = true;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UrlModel f105917d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f105918e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Video f105919f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f105920g;

        static {
            Covode.recordClassIndex(67781);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            String str;
            if (this.f105920g && !this.f105918e.a() && this.f105919f.getPlayAddr() != null) {
                VideoUrlModel playAddr = this.f105919f.getPlayAddr();
                h.f.b.l.b(playAddr, "");
                if (!TextUtils.isEmpty(playAddr.getUri())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("frames", -1);
                        VideoUrlModel playAddr2 = this.f105919f.getPlayAddr();
                        h.f.b.l.b(playAddr2, "");
                        jSONObject.put("vid", playAddr2.getUri());
                        jSONObject.put("url", this.f105918e.f68145b.get(0));
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
            this.f105914a.setUserVisibleHint(true);
            if (this.f105916c) {
                this.f105914a.b();
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(this.f105917d.getUri());
            urlModel.setUrlList(this.f105918e.f68145b);
            this.f105919f.setCachedOuterCoverUrl(urlModel);
        }

        c(SmartImageView smartImageView, a aVar, UrlModel urlModel, l lVar, Video video) {
            this.f105914a = smartImageView;
            this.f105915b = aVar;
            this.f105917d = urlModel;
            this.f105918e = lVar;
            this.f105919f = video;
            this.f105920g = false;
        }
    }
}
