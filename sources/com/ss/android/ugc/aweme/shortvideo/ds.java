package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.settings.o;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.p.c;
import com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi;
import com.ss.android.ugc.aweme.shortvideo.subtitle.j;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.d;
import com.ss.android.ugc.aweme.sticker.data.h;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.utils.as;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.video.e;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

public final class ds implements x<ai> {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f126481a = new CountDownLatch(2);

    /* renamed from: b  reason: collision with root package name */
    private final int f126482b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f126483c;

    static {
        Covode.recordClassIndex(82966);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishCancel() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishPause() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onParallelPublishResume() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onProgressUpdate(int i2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onSynthetiseSuccess(String str) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onError(et etVar) {
        String str = "";
        l.d(etVar, str);
        c.a("normal").e();
        if (this.f126482b == 0) {
            Object obj = this.f126483c;
            if (!(obj instanceof VideoPublishEditModel)) {
                obj = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel != null) {
                es.i(videoPublishEditModel);
            } else {
                return;
            }
        }
        if (etVar.isRecover() && !o.a()) {
            if (this.f126482b == 0) {
                Object obj2 = this.f126483c;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                str = ((BaseShortVideoContext) obj2).getDraftPrimaryKey();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (m.a()) {
                g.a().o().l().b(str);
            } else {
                g.a().o().l().a(str);
            }
        }
    }

    public ds(int i2, Object obj) {
        l.d(obj, "");
        this.f126482b = i2;
        this.f126483c = obj;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public final void onSuccess(ai aiVar, boolean z) {
        AVUploadSaveModel aVUploadSaveModel;
        String str;
        IDraftService a2;
        com.ss.android.ugc.aweme.draft.model.c queryDraft;
        String str2;
        InteractStickerStruct interactStickerStruct;
        d captionStruct;
        l.d(aiVar, "");
        a.a("args is " + this.f126483c);
        BaseShortVideoContext baseShortVideoContext = null;
        if (this.f126482b == 0) {
            Object obj = this.f126483c;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            String localFinalPath = videoPublishEditModel.getLocalFinalPath();
            if (localFinalPath == null || (str = localFinalPath.toString()) == null) {
                str = "";
            }
            aVUploadSaveModel = videoPublishEditModel.getSaveModel();
        } else {
            aVUploadSaveModel = null;
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            aiVar.mSaveModel = aVUploadSaveModel;
            e.e(dj.f126468k);
        }
        if (!m.a()) {
            dmt.av.video.a.a.a("publish_page");
        }
        if (this.f126482b != 0) {
            ALog.e("ShortVideoPublishCallback", "unknown video type");
        } else {
            Object obj2 = this.f126483c;
            if (!(obj2 instanceof VideoPublishEditModel)) {
                obj2 = null;
            }
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj2;
            if (videoPublishEditModel2 != null && (queryDraft = (a2 = com.ss.android.ugc.aweme.tools.draft.j.c.a()).queryDraft(videoPublishEditModel2.getDraftPrimaryKey())) != null) {
                l.b(queryDraft, "");
                ae aeVar = com.ss.android.ugc.aweme.port.in.c.y;
                String r = queryDraft.r();
                l.b(r, "");
                aeVar.a(r);
                a2.delete(queryDraft);
                a2.notifyDraftDelete(queryDraft);
                com.ss.android.ugc.aweme.port.in.l.f115658a.m().a(aiVar, videoPublishEditModel2, this.f126481a);
                com.ss.android.ugc.aweme.port.in.l.f115658a.m().b(aiVar, videoPublishEditModel2, this.f126481a);
                a a3 = com.ss.android.ugc.aweme.port.in.c.x.a(aiVar);
                if (a3 != null) {
                    List<InteractStickerStruct> a4 = b.a(videoPublishEditModel2.getMainBusinessContext(), 11, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
                    d dVar = a3.captionStruct;
                    if (dVar != null) {
                        String str3 = aiVar.materialId;
                        if (str3 == null) {
                            str3 = "";
                        }
                        List<h> utterances = dVar.getUtterances();
                        if (utterances == null) {
                            utterances = z.INSTANCE;
                        }
                        j jVar = new j(str3, utterances);
                        if (a4 == null || (interactStickerStruct = (InteractStickerStruct) n.b((List) a4, 0)) == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null || (str2 = captionStruct.getTaskId()) == null) {
                            str2 = "";
                        }
                        au C = g.a().C();
                        AVApi b2 = AVApiImpl.b();
                        l.b(b2, "");
                        String a5 = b2.a();
                        l.b(a5, "");
                        SubtitleApi subtitleApi = (SubtitleApi) C.createRetrofit(a5, true, SubtitleApi.class);
                        String str4 = aiVar.materialId;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = a3.aid;
                        l.b(str5, "");
                        subtitleApi.feedback(str4, str5, str2, jVar);
                        if (dVar.getUtterances() != null) {
                            new File(as.f142650a).mkdirs();
                            String str6 = as.f142650a + System.currentTimeMillis();
                            e.a(str6, dg.a().b(dVar));
                            Context a6 = com.ss.android.ugc.aweme.df.b.a();
                            UrlModel urlModel = new UrlModel();
                            urlModel.setUrlList(n.c(str6));
                            com.ss.android.ugc.aweme.language.b currentI18nItem = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getCurrentI18nItem(a6);
                            l.b(currentI18nItem, "");
                            dVar.setAutoCaptions(n.c(new com.ss.android.ugc.aweme.sticker.data.b(currentI18nItem.a(), urlModel)));
                        }
                    }
                }
                com.ss.android.ugc.aweme.port.in.l.f115658a.m().a(videoPublishEditModel2, queryDraft, this.f126481a);
            } else {
                return;
            }
        }
        if (o.a()) {
            if (m.a()) {
                Object obj3 = this.f126483c;
                if (obj3 instanceof BaseShortVideoContext) {
                    baseShortVideoContext = obj3;
                }
                BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
                if (baseShortVideoContext2 != null) {
                    g.a().o().l().c(baseShortVideoContext2.getDraftPrimaryKey());
                } else {
                    return;
                }
            } else {
                g.a().o().l().a("");
            }
        }
        c.a("normal").e();
    }
}
