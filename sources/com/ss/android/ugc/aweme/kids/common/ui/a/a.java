package com.ss.android.ugc.aweme.kids.common.ui.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.a.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.kids.common.ui.a.b;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.performance.i;
import com.ss.android.ugc.aweme.utils.em;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends e<Aweme> {

    /* renamed from: a  reason: collision with root package name */
    protected b.a f105907a;

    static {
        Covode.recordClassIndex(67776);
    }

    public a(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    public final void a(UrlModel urlModel, String str) {
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        int[] a3 = em.a(200);
        if (a3 != null) {
            a2.b(a3);
        }
        a2.E = this.n;
        a2.a(str).c();
    }

    /* access modifiers changed from: protected */
    public final boolean a(Video video, String str) {
        boolean z;
        UrlModel dynamicCover;
        if (C()) {
            SmartImageView smartImageView = this.n;
            b.a aVar = this.f105907a;
            l.d(smartImageView, "");
            l.d(video, "");
            l.d(str, "");
            Context a2 = d.a();
            if (!i.a()) {
                if (!j.f107226e || !j.b() || j.c()) {
                    j.f107226e = b.a();
                }
                if (!j.f107226e || com.ss.android.ugc.aweme.framework.c.a.a(a2)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (com.ss.android.ugc.aweme.base.h.a.a("aweme_app", "use_dynamic_cover", z) && (dynamicCover = video.getDynamicCover()) != null && dynamicCover.getUrlList() != null && !dynamicCover.getUrlList().isEmpty()) {
                        for (String str2 : dynamicCover.getUrlList()) {
                            if (!TextUtils.isEmpty(str2)) {
                                UrlModel dynamicCover2 = video.getDynamicCover();
                                l.b(dynamicCover2, "");
                                com.bytedance.lighten.a.a aVar2 = com.bytedance.lighten.a.a.f39807a;
                                l.b(aVar2, "");
                                int i2 = aVar2.f39808b;
                                com.ss.android.ugc.aweme.base.l a3 = com.ss.android.ugc.aweme.base.v.a(dynamicCover2);
                                l.b(a3, "");
                                if (!TextUtils.isEmpty("") && !a3.a()) {
                                    List<String> list = a3.f68145b;
                                    l.b(list, "");
                                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                                    for (T t : list) {
                                        l.b(t, "");
                                        arrayList.add(p.e((CharSequence) t, (CharSequence) "?") ? (((String) t) + "&ilog=") + "" : (((String) t) + "?ilog=") + "");
                                    }
                                    a3.f68145b = arrayList;
                                }
                                v a4 = r.a(a3);
                                a4.E = smartImageView;
                                a4.a(str).a(i2, new b.C2697b(a3, video)).a().a(new b.c(smartImageView, aVar, dynamicCover2, a3, video));
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
