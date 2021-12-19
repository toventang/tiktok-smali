package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.u;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f126771a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(83177);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f126772a = new a();

        static {
            Covode.recordClassIndex(83178);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Context a2 = com.ss.android.ugc.aweme.df.b.a();
            String str = di.q;
            l.b(str, "");
            u.a(a2, (int) R.raw.baritone, str);
            String str2 = di.q;
            l.b(str2, "");
            u.a(a2, (int) R.raw.chipmunk, str2);
            return z.f158842a;
        }
    }

    private static void c() {
        g.a().r().a();
        i.b(a.f126772a, i.f4824a);
    }

    public static void a() {
        IAudioEffectPreferences iAudioEffectPreferences = (IAudioEffectPreferences) new com.bytedance.cukaie.closet.a().a(com.ss.android.ugc.aweme.df.b.a(), IAudioEffectPreferences.class);
        int h2 = g.a().w().h();
        if (h2 != iAudioEffectPreferences.getResourceVersion(0)) {
            c();
            iAudioEffectPreferences.setResourceVersion(h2);
        }
    }

    public static CategoryPageModel b() {
        List b2 = n.b("chipmunk", "baritone");
        int i2 = 0;
        List b3 = n.b(2131230975, 2131230974);
        Context a2 = com.ss.android.ugc.aweme.df.b.a();
        List b4 = n.b(a2.getString(R.string.ze), a2.getString(R.string.zd));
        List b5 = n.b("default_1", "default_2");
        ArrayList arrayList = new ArrayList(n.a((Iterable) b3, 10));
        int i3 = -1;
        for (Object obj : b3) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            int intValue = ((Number) obj).intValue();
            Effect effect = new Effect(null, 1, null);
            int i5 = i3 - 1;
            effect.setEffectId(String.valueOf(i3));
            Object obj2 = b4.get(i2);
            l.b(obj2, "");
            effect.setName((String) obj2);
            effect.setIconUrl(a(intValue));
            effect.setUnzipPath(di.q + ((String) b2.get(i2)));
            effect.setTags(n.a(b5.get(i2)));
            arrayList.add(effect);
            i3 = i5;
            i2 = i4;
        }
        CategoryPageModel categoryPageModel = new CategoryPageModel(null, 1, null);
        CategoryEffectModel categoryEffectModel = new CategoryEffectModel(null, 1, null);
        categoryEffectModel.setEffects(arrayList);
        categoryPageModel.setCategoryEffects(categoryEffectModel);
        return categoryPageModel;
    }

    private static UrlModel a(int i2) {
        UrlModel urlModel = new UrlModel(null, 1, null);
        urlModel.setUrlList(n.a(String.valueOf(i2)));
        return urlModel;
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel) {
        AudioEffectParam audioEffectParam;
        AVChallenge challenge;
        T t;
        List<AVChallenge> recordStickerChallengeList;
        if (videoPublishEditModel != null && (audioEffectParam = videoPublishEditModel.veAudioEffectParam) != null && (challenge = audioEffectParam.getChallenge()) != null && videoPublishEditModel.challenges != null) {
            StickerChallenge stickerChallenge = videoPublishEditModel.stickerChallenge;
            T t2 = null;
            if (stickerChallenge != null && (recordStickerChallengeList = stickerChallenge.getRecordStickerChallengeList()) != null) {
                Iterator<T> it = recordStickerChallengeList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (l.a((Object) challenge.challengeName, (Object) t.challengeName)) {
                        break;
                    }
                }
            } else {
                t = null;
            }
            cr a2 = cr.a();
            l.b(a2, "");
            List<AVChallenge> list = a2.f125298d;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    if (l.a((Object) next.challengeName, (Object) challenge.challengeName)) {
                        t2 = next;
                        break;
                    }
                }
            }
            if (t == null && t2 == null) {
                videoPublishEditModel.challenges.remove(challenge);
                videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(challenge);
            }
        }
    }
}
