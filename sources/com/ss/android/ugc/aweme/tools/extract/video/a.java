package com.ss.android.ugc.aweme.tools.extract.video;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.j;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.b;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.tools.extract.a.b;
import com.ss.android.ugc.aweme.tools.extract.ab;
import com.ss.android.ugc.aweme.tools.extract.video.n;
import com.ss.android.ugc.aweme.tools.extract.y;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class a {
    static {
        Covode.recordClassIndex(91561);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.putExtra("authkey", g.a().e().getSdkV4AuthKey(""));
        f.enqueueWork(b(context), VideoFramesUploadService.class, 3009, intent);
    }

    static /* synthetic */ Object a(CountDownLatch countDownLatch, c cVar, Object obj) {
        com.ss.android.ugc.aweme.sticker.model.a backgroundVideo;
        countDownLatch.await();
        if (cVar != null) {
            d.g(cVar);
            ArrayList<TimeSpeedModelExtension> a2 = CameraComponentModel.a(cVar.K);
            if (a2 != null) {
                for (T t : a2) {
                    if (!(t == null || (backgroundVideo = t.getBackgroundVideo()) == null)) {
                        com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c.a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                    }
                }
            }
            if (obj instanceof VideoPublishEditModel) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                if (videoPublishEditModel.mShoutOutsData != null && com.ss.android.ugc.aweme.shoutouts.d.MODE_POST.equals(videoPublishEditModel.mShoutOutsData.getShoutOutsMode()) && !TextUtils.isEmpty(videoPublishEditModel.mShoutOutsData.getPostVideoPath()) && videoPublishEditModel.mShoutOutsData.getPostVideoPath().contains("shoutout")) {
                    i.b(videoPublishEditModel.mShoutOutsData.getPostVideoPath());
                }
            }
        } else if (obj instanceof VideoPublishEditModel) {
            b.a((VideoPublishEditModel) obj);
        }
        if (!(obj instanceof VideoPublishEditModel)) {
            return null;
        }
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj;
        if (videoPublishEditModel2.isMultiVideoEdit() && !m.a()) {
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.b();
        }
        es.i(videoPublishEditModel2);
        return null;
    }

    static /* synthetic */ Void a(ai aiVar, Object obj, Context context, CountDownLatch countDownLatch, b.i iVar) {
        ExtractFramesModel extractFramesModel;
        int i2;
        boolean z;
        boolean z2;
        o a2;
        if (iVar.b() || iVar.c()) {
            ab.a(aiVar, obj, (Integer) -1001, (Boolean) false, "");
        }
        j jVar = new j(context);
        k kVar = new k(countDownLatch);
        l.d(aiVar, "");
        l.d(kVar, "");
        if (obj instanceof VideoPublishEditModel) {
            g.a();
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            ab.c cVar = new ab.c(obj, jVar, false);
            l.d(videoPublishEditModel, "");
            l.d(cVar, "");
            if (!videoPublishEditModel.hasImageStickers()) {
                cVar.a(true);
            } else if (!e.b(videoPublishEditModel.extractFramesModel.getExtractFramesDir())) {
                cVar.a(false);
            } else {
                ArrayList<String> a3 = com.ss.android.ugc.aweme.tools.extract.a.b.a(videoPublishEditModel.extractFramesModel.getExtractFramesDir());
                if (a3.isEmpty()) {
                    cVar.a(false);
                } else {
                    int size = a3.size();
                    if (size == 0) {
                        cVar.a(false);
                    } else {
                        z.c cVar2 = new z.c();
                        cVar2.element = 0;
                        ArrayList arrayList = new ArrayList();
                        List<StickerItemModel> list = videoPublishEditModel.infoStickerModel.stickers;
                        l.b(list, "");
                        ArrayList<StickerItemModel> arrayList2 = new ArrayList();
                        for (T t : list) {
                            if (t.type == 11) {
                                arrayList2.add(t);
                            }
                        }
                        for (StickerItemModel stickerItemModel : arrayList2) {
                            if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.b(stickerItemModel.path) || com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.c(stickerItemModel.path)) {
                                cVar2.element++;
                            } else {
                                arrayList.add(stickerItemModel.path);
                            }
                        }
                        if (arrayList.size() != 0) {
                            com.ss.android.ugc.aweme.tools.extract.a.b.a(arrayList, new b.e(cVar2, cVar, size));
                        } else if (Math.abs(size - cVar2.element) > 3) {
                            cVar.a(false);
                        } else {
                            cVar.a(true);
                        }
                    }
                }
            }
            b.i.b(new ab.d(obj, aiVar), b.i.f4824a).a(new ab.e(obj, jVar, false, kVar), b.i.f4826c, null);
        }
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj;
        l.d(videoPublishEditModel2, "");
        l.d(aiVar, "");
        com.ss.android.ugc.aweme.shortvideo.a a4 = com.ss.android.ugc.aweme.port.in.c.x.a(aiVar);
        if (a4 == null || (extractFramesModel = videoPublishEditModel2.extractFramesModel) == null) {
            a2 = null;
            z = true;
        } else {
            extractFramesModel.setStickerIds(videoPublishEditModel2.mStickerID);
            o oVar = new o();
            n.a aVar = new n.a();
            aVar.f140157a = a4.aid;
            aVar.f140158b = aiVar.materialId;
            aVar.f140159c = "";
            aVar.f140160d = "";
            aVar.f140161e = extractFramesModel;
            aVar.f140164h = y.a(videoPublishEditModel2).f140023a;
            aVar.f140165i = videoPublishEditModel2.mIsFromDraft;
            String cameraIds = videoPublishEditModel2.getCameraIds();
            if (cameraIds == null || cameraIds.length() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            z = true;
            aVar.f140166j = i2 ^ 1;
            if (videoPublishEditModel2.mRestoreType == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.f140167k = z2;
            aVar.f140162f = System.currentTimeMillis();
            n a5 = aVar.a();
            l.b(a5, "");
            a2 = oVar.a(a5);
        }
        j k2 = g.a().o().k();
        StringBuilder sb = new StringBuilder("will insert: ");
        if (a2 == null) {
            z = false;
        }
        k2.a("extract_frame", sb.append(z).toString());
        if (a2 != null) {
            try {
                m.a(context).a(a2);
            } catch (Exception e2) {
                ab.a(aiVar, obj, (Integer) -1002, (Boolean) false, e2.getMessage());
                g.a().o().k().a("extract_frame", "insert sql fail : " + e2.getMessage());
            }
        }
        a(context);
        return null;
    }
}
