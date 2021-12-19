package com.bytedance.android.live.broadcast.c.a;

import com.bytedance.android.live.base.model.b;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(3855);
    }

    private static b a(UrlModel urlModel) {
        if (urlModel == null) {
            return new b();
        }
        b bVar = new b();
        bVar.f7375a = urlModel.getUri();
        bVar.f7376b = urlModel.getUrlList();
        return bVar;
    }

    private static void b(a aVar) {
        if (!m.a(aVar.E)) {
            aVar.F = (a.d) e.a.f9628b.a(aVar.E, a.d.class);
        }
    }

    public static a a(Effect effect) {
        a aVar = new a();
        aVar.f22998d = a(effect.getIconUrl());
        aVar.f22995a = Long.valueOf(effect.getEffectId()).longValue();
        aVar.a(effect.getId());
        aVar.b(effect.getResourceId());
        aVar.c(effect.getUnzipPath());
        aVar.f23000f = effect.getHint();
        aVar.f23006l = effect.isDownloaded();
        aVar.f23003i = effect.getTags();
        String tagsUpdatedAt = effect.getTagsUpdatedAt();
        if (tagsUpdatedAt != null) {
            aVar.f23005k = tagsUpdatedAt;
        }
        aVar.f23004j = effect.getTypes();
        aVar.f22999e = effect.getName();
        aVar.q = effect;
        aVar.A = effect.getExtra();
        aVar.a(b.a(effect.getExtra()));
        String sdkExtra = effect.getSdkExtra();
        if (sdkExtra != null) {
            aVar.E = sdkExtra;
        }
        c(aVar);
        b(aVar);
        return b.a(aVar.q, aVar);
    }

    public static Effect a(a aVar) {
        UrlModel urlModel;
        if (aVar.q != null) {
            return aVar.q;
        }
        Effect effect = new Effect();
        effect.setId(aVar.f22996b);
        effect.setEffectId(aVar.f22997c);
        b bVar = aVar.f22998d;
        if (bVar == null) {
            urlModel = new UrlModel();
        } else {
            urlModel = new UrlModel();
            urlModel.setUri(bVar.f7375a);
            urlModel.setUrlList(bVar.f7376b);
        }
        effect.setIconUrl(urlModel);
        effect.setUnzipPath(aVar.f23001g);
        effect.setHint(aVar.f23000f);
        effect.setTags(aVar.f23003i);
        effect.setDownloaded(aVar.f23006l);
        effect.setEffectId(aVar.f22997c);
        String str = aVar.f23005k;
        if (str != null) {
            effect.setTagsUpdatedAt(str);
        }
        effect.setExtra(aVar.A);
        effect.setTypes(aVar.f23004j);
        String str2 = aVar.E;
        if (str2 != null) {
            effect.setSdkExtra(str2);
        }
        return effect;
    }

    private static void c(a aVar) {
        if (!m.a(aVar.A)) {
            try {
                o j2 = q.a(aVar.A).j();
                if (j2.b("RepelPanel")) {
                    aVar.f23002h = j2.c("RepelPanel").g();
                }
                if (j2.b("is_blessing_sticker")) {
                    aVar.t = j2.c("is_blessing_sticker").h();
                }
                if (j2.b("game")) {
                    aVar.v = j2.c("game").h();
                }
                if (j2.b("video_tag")) {
                    aVar.d(j2.c("video_tag").c());
                }
                if (j2.b("beautify")) {
                    List<a.b> list = (List) e.a.f9628b.a((l) q.a(j2.c("beautify").c()).j().e("items"), new com.google.gson.b.a<List<a.b>>() {
                        /* class com.bytedance.android.live.broadcast.c.a.f.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(3856);
                        }
                    }.type);
                    aVar.a(list);
                    for (a.b bVar : list) {
                        aVar.p.add(bVar.f23010c);
                    }
                }
                if (j2.b("Review_original_frame")) {
                    aVar.u = j2.c("Review_original_frame").h();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
