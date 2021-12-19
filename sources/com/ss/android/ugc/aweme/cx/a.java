package com.ss.android.ugc.aweme.cx;

import android.app.Application;
import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.an;
import com.ss.android.ugc.aweme.property.ep;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.ck;
import com.ss.android.ugc.aweme.shortvideo.cl;
import com.ss.android.ugc.aweme.shortvideo.cm;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.tools.extract.video.b;
import com.ss.android.ugc.aweme.tools.extract.video.d;
import com.ss.android.ugc.aweme.tools.extract.video.e;
import com.ss.android.ugc.aweme.tools.extract.w;
import com.ss.android.ugc.aweme.tools.extract.x;
import com.ss.android.ugc.aweme.tools.extract.y;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.ugc.effectplatform.util.k;
import h.a.n;
import h.f.b.l;
import h.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

public final class a implements b {
    static {
        Covode.recordClassIndex(49141);
    }

    @Override // com.ss.android.ugc.aweme.cx.b
    public final void a(Object obj, c cVar, CountDownLatch countDownLatch) {
        l.d(obj, "");
        l.d(countDownLatch, "");
        i.b(new e(new com.ss.android.ugc.aweme.tools.extract.video.a(), countDownLatch, cVar, obj), i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.cx.b
    public final void a(ai aiVar, VideoPublishEditModel videoPublishEditModel, CountDownLatch countDownLatch) {
        l.d(aiVar, "");
        l.d(videoPublishEditModel, "");
        l.d(countDownLatch, "");
        ck ckVar = new ck();
        Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
        if (!ep.a()) {
            countDownLatch.countDown();
            return;
        }
        boolean a2 = w.a.a(videoPublishEditModel);
        g.a().o().k().a("original_sound", "need upload original sound: ".concat(String.valueOf(a2)));
        i.b(new cl(ckVar, a2, aiVar, videoPublishEditModel, application, countDownLatch), i.f4824a).b((b.g) new cm(application));
    }

    @Override // com.ss.android.ugc.aweme.cx.b
    public final void b(ai aiVar, VideoPublishEditModel videoPublishEditModel, CountDownLatch countDownLatch) {
        Object obj;
        p<Long, Long> a2;
        int i2;
        boolean z;
        l.d(aiVar, "");
        l.d(videoPublishEditModel, "");
        l.d(countDownLatch, "");
        com.ss.android.ugc.aweme.tools.extract.video.a aVar = new com.ss.android.ugc.aweme.tools.extract.video.a();
        Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
        if (!x.c(videoPublishEditModel)) {
            countDownLatch.countDown();
            if ((videoPublishEditModel instanceof VideoPublishEditModel) && videoPublishEditModel.extractFramesModel != null) {
                i.b(new b(videoPublishEditModel), i.f4824a);
            }
            com.ss.android.ugc.aweme.tools.extract.video.a.a(application);
            return;
        }
        l.d(aiVar, "");
        l.d(videoPublishEditModel, "");
        boolean z2 = videoPublishEditModel instanceof VideoPublishEditModel;
        if (z2) {
            l.d(aiVar, "");
            l.d(videoPublishEditModel, "");
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            com.ss.android.ugc.aweme.shortvideo.a a3 = createIAVServiceProxybyMonsterPlugin.getAVConverter().a(aiVar);
            ar a4 = new ar().a("stage", (Integer) 1).a("aweme_id", a3 != null ? a3.aid : null).a("match_factors", Integer.valueOf(y.a(videoPublishEditModel).f140023a));
            String cameraIds = videoPublishEditModel.getCameraIds();
            if (cameraIds == null || cameraIds.length() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            ar a5 = a4.a("origin", Integer.valueOf(i2 ^ 1)).a("is_draft", Boolean.valueOf(videoPublishEditModel.mIsFromDraft));
            if (videoPublishEditModel.mRestoreType == 2) {
                z = true;
            } else {
                z = false;
            }
            q.a("av_video_audit", 1, a5.a("is_backup", Boolean.valueOf(z)).a("video_type", Integer.valueOf(es.g(videoPublishEditModel))).a());
        }
        l.d(videoPublishEditModel, "");
        if (z2) {
            if (an.a()) {
                l.d(videoPublishEditModel, "");
                ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
                if (extractFramesModel != null && extractFramesModel.getSegmentEffectPhoto() != null) {
                    ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
                    l.b(finalVideoList, "");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TimeSpeedModelExtension next = it.next();
                            if (next.getIdentityKey() == null) {
                                break;
                            }
                            String identityKey = next.getIdentityKey();
                            l.b(identityKey, "");
                            linkedHashSet.add(identityKey);
                        } else {
                            HashMap<String, List<String>> segmentEffectPhoto = extractFramesModel.getSegmentEffectPhoto();
                            if (segmentEffectPhoto == null) {
                                l.b();
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, List<String>> entry : segmentEffectPhoto.entrySet()) {
                                if (linkedHashSet.contains(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                n.a((Collection) arrayList, (Iterable) ((List) entry2.getValue()));
                            }
                            HashSet j2 = n.j((Iterable) arrayList);
                            HashMap<Integer, List<String>> multiStickers = extractFramesModel.getMultiStickers();
                            if (multiStickers != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Map.Entry<Integer, List<String>> entry3 : multiStickers.entrySet()) {
                                    n.a((Collection) arrayList2, (Iterable) entry3.getValue());
                                }
                                ArrayList<String> arrayList3 = new ArrayList();
                                for (Object obj2 : arrayList2) {
                                    if (!j2.contains(obj2)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                for (String str : arrayList3) {
                                    if (new File(str).exists() && com.ss.android.ugc.aweme.shortvideo.af.b.a(str)) {
                                        k.c(str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (videoPublishEditModel.isStitchMode()) {
                ey.a(videoPublishEditModel);
            } else if (!(!videoPublishEditModel.isMultiVideoEdit() || videoPublishEditModel.extractFramesModel == null || videoPublishEditModel.extractFramesModel.getFramesV1() == null || videoPublishEditModel.extractFramesModel.getSegmentFrameKeys() == null)) {
                ExtractFramesModel extractFramesModel2 = videoPublishEditModel.extractFramesModel;
                Iterator<Map.Entry<Integer, String>> it2 = extractFramesModel2.getSegmentFrameKeys().entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<Integer, String> next2 = it2.next();
                    if (!ey.a(next2.getValue(), videoPublishEditModel)) {
                        HashMap<Integer, ArrayList<FrameItem>> framesV1 = extractFramesModel2.getFramesV1();
                        if (framesV1 != null) {
                            framesV1.remove(next2.getKey());
                        }
                        HashMap<Integer, List<String>> multiStickers2 = extractFramesModel2.getMultiStickers();
                        if (multiStickers2 != null) {
                            multiStickers2.remove(next2.getKey());
                        }
                        it2.remove();
                    }
                }
                HashMap<Integer, ArrayList<FrameItem>> framesV12 = extractFramesModel2.getFramesV1();
                if (framesV12 != null) {
                    for (Map.Entry<Integer, ArrayList<FrameItem>> entry4 : framesV12.entrySet()) {
                        String str2 = extractFramesModel2.getSegmentFrameKeys().get(entry4.getKey());
                        if (!(str2 == null || str2.length() == 0 || (a2 = ey.a(videoPublishEditModel, str2)) == null)) {
                            n.a((List) entry4.getValue(), (h.f.a.b) new ey.a(a2));
                        }
                    }
                }
            }
        }
        j jVar = new j();
        com.ss.android.ugc.aweme.tools.extract.a a6 = x.a(videoPublishEditModel);
        if (a6 == null) {
            jVar.b((Object) null);
            obj = i.f4828e;
        } else {
            i.b(new com.ss.android.ugc.aweme.tools.extract.video.g(a6, videoPublishEditModel, jVar), i.f4825b);
            obj = jVar.f4869a;
        }
        ((i) Objects.requireNonNull(obj)).b((b.g) new com.ss.android.ugc.aweme.tools.extract.video.c(aVar, aiVar, videoPublishEditModel)).a((b.g) new d(aVar, aiVar, videoPublishEditModel, application, countDownLatch));
    }
}
