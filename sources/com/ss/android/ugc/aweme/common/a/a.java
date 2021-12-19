package com.ss.android.ugc.aweme.common.a;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.ay.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.gr;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.em;

public abstract class a extends e<Aweme> {

    /* renamed from: k  reason: collision with root package name */
    protected c.a f76347k;

    /* renamed from: l  reason: collision with root package name */
    protected com.bytedance.lighten.a.c.a f76348l = new com.bytedance.lighten.a.c.a() {
        /* class com.ss.android.ugc.aweme.common.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(47118);
        }

        @Override // com.bytedance.lighten.a.c.a
        public final void a() {
            a aVar = a.this;
            if (!aVar.p && b.a().a(true, "stop_main_anim_when_invisible", false)) {
                aVar.n.c();
            }
        }
    };

    static {
        Covode.recordClassIndex(47117);
    }

    /* access modifiers changed from: protected */
    public int[] b() {
        return em.a(200);
    }

    public a(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    public final void a(UrlModel urlModel, String str) {
        a(urlModel, str, (Bitmap.Config) null);
    }

    /* access modifiers changed from: protected */
    public boolean a(Video video, String str) {
        return a(video, str, (Bitmap.Config) null);
    }

    public boolean a(Video video, String str, Bitmap.Config config) {
        if (!C() || !c.a(c.f67775a, this.n, video, str, true, this.f76347k, true, config, 256)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(UrlModel urlModel, String str, Bitmap.Config config) {
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        int[] b2 = b();
        if (b2 != null) {
            a2.b(b2);
        }
        a2.E = this.n;
        v a3 = a2.a(str);
        if (config != null) {
            a3.u = config;
        }
        a3.c();
        if (this.f76353m != null && ((Aweme) this.f76353m).getVideo() != null && !gr.a()) {
            ((Aweme) this.f76353m).getVideo().setCachedOuterCoverUrl(urlModel);
            ((Aweme) this.f76353m).getVideo().setCachedOuterCoverSize(b2);
        }
    }
}
