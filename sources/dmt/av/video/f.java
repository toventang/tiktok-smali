package dmt.av.video;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.at;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.property.ca;
import com.ss.android.ugc.aweme.property.cb;
import com.ss.android.ugc.aweme.property.cs;
import com.ss.android.ugc.aweme.property.eq;
import com.ss.android.ugc.aweme.property.ex;
import com.ss.android.ugc.aweme.property.g;
import com.ss.android.ugc.aweme.property.x;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.bm;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.shortvideo.edit.br;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.util.ap;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.tools.utils.q;
import dmt.av.video.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f156887a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(104210);
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isFastImport || ex.a()) {
            return false;
        }
        return true;
    }

    public static final int[] c(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        int[] b2 = b(videoPublishEditModel);
        if (b2[0] > 0 && b2[1] > 0) {
            return b2;
        }
        return new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
    }

    private static int e(VideoPublishEditModel videoPublishEditModel) {
        bq a2 = br.a(videoPublishEditModel);
        if (!(a2.b() == 0 || a2.a() == 0)) {
            float a3 = ((float) videoPublishEditModel.mOutVideoWidth) / ((float) a2.a());
            float b2 = ((float) videoPublishEditModel.mOutVideoHeight) / ((float) a2.b());
            if (a3 != 1.0f && b2 != 1.0f && a3 == b2) {
                return 1;
            }
            if (!((a2.d() == a2.b() && a2.c() == a2.a()) || videoPublishEditModel.mOutVideoWidth == a2.a())) {
                return 2;
            }
        }
        return 0;
    }

    public static final int[] b(VideoPublishEditModel videoPublishEditModel) {
        int a2;
        boolean z;
        int i2;
        String str = "";
        l.d(videoPublishEditModel, str);
        a aVar = c.J;
        l.b(aVar, str);
        int[] a3 = b.a(aVar.f118319b);
        if (a3 == null || a3.length != 2 || a3[0] <= 0 || a3[1] <= 0) {
            if (!bm.a(videoPublishEditModel) || videoPublishEditModel.mOutVideoWidth <= 0 || videoPublishEditModel.mOutVideoHeight <= 0) {
                a3 = videoPublishEditModel.isFastImport ? new int[]{-1, -1} : new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
            } else {
                a3 = new int[]{videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight};
            }
        }
        if (videoPublishEditModel.isPhotoMvMode) {
            if (!at.a()) {
                return a3;
            }
        } else if (videoPublishEditModel.isMvThemeVideoType()) {
            q.a("CalculateOutVideoSize mv/status compileSize : " + a3[0] + 'x' + a3[1]);
            return a3;
        }
        eq uploadSpeedEncodeSettings = videoPublishEditModel.getUploadSpeedEncodeSettings();
        if (m.a((Object) videoPublishEditModel)) {
            if (uploadSpeedEncodeSettings != null) {
                q.d("UploadSpeeds , highQualityCompileVideoSizeIndex : " + uploadSpeedEncodeSettings.f118506e);
                a2 = uploadSpeedEncodeSettings.f118506e;
            } else {
                a2 = cb.a();
            }
        } else if (uploadSpeedEncodeSettings != null) {
            q.d("UploadSpeeds , compileVideoSizeIndex : " + uploadSpeedEncodeSettings.f118505d);
            a2 = uploadSpeedEncodeSettings.f118505d;
        } else {
            a2 = x.a();
        }
        int[] a4 = b.a(a2);
        if (videoPublishEditModel.isDuet()) {
            return a(b.g(), a3);
        }
        String str2 = " sourceSize:" + a3[0] + "x" + a3[1];
        if (a4 != null) {
            str = " compileSize:" + a4[0] + "x" + a4[1];
            if (a3[0] > a3[1]) {
                z = true;
            } else {
                z = false;
            }
            int max = Math.max(a3[0], a3[1]);
            int min = Math.min(a3[0], a3[1]);
            float f2 = ((float) max) / ((float) min);
            int max2 = Math.max(a4[0], a4[1]);
            int min2 = Math.min(a4[0], a4[1]);
            if (min2 == 1080) {
                i2 = 1100;
            } else {
                i2 = min2;
            }
            if (max > max2 || min > i2) {
                if (max * min2 >= min * max2) {
                    min = (int) (((float) max2) / f2);
                    max = max2;
                } else {
                    max = (int) (((float) min2) * f2);
                    min = min2;
                }
            }
            if (z) {
                a3[0] = max;
                a3[1] = min;
            } else {
                a3[1] = max;
                a3[0] = min;
            }
        }
        q.a("CalculateOutVideoSize " + str2 + (" resultSize:" + a3[0] + "x" + a3[1]) + " compileIndex:" + a2 + str);
        return a3;
    }

    public static final boolean d(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        boolean z2;
        boolean z3;
        int a2;
        boolean z4;
        boolean z5;
        boolean z6;
        l.d(videoPublishEditModel, "");
        boolean a3 = cs.a();
        boolean a4 = a(videoPublishEditModel);
        boolean isMvThemeVideoType = videoPublishEditModel.isMvThemeVideoType();
        boolean hasStickers = videoPublishEditModel.hasStickers();
        if (videoPublishEditModel.mTimeEffect != null || h.b(videoPublishEditModel.mEffectList)) {
            z = true;
        } else {
            z = false;
        }
        if (videoPublishEditModel.mSelectedId != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!videoPublishEditModel.isAutoEnhanceEnable(com.ss.android.ugc.aweme.shortvideo.edit.b.a.a()) || !videoPublishEditModel.autoEnhanceOn) {
            z3 = false;
        } else {
            z3 = true;
        }
        int c2 = aj.c(videoPublishEditModel.videoPath()) * 1000;
        eq uploadSpeedEncodeSettings = videoPublishEditModel.getUploadSpeedEncodeSettings();
        if (uploadSpeedEncodeSettings != null) {
            a2 = uploadSpeedEncodeSettings.f118512k;
        } else {
            a2 = g.a();
        }
        if (m.a((Object) videoPublishEditModel)) {
            eq uploadSpeedEncodeSettings2 = videoPublishEditModel.getUploadSpeedEncodeSettings();
            if (uploadSpeedEncodeSettings2 != null) {
                a2 = uploadSpeedEncodeSettings2.f118513l;
            } else {
                a2 = ca.a();
            }
        }
        if (c2 > a2) {
            z4 = true;
        } else {
            z4 = false;
        }
        a aVar = c.J;
        l.b(aVar, "");
        if (aVar.f118318a > 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        String str = videoPublishEditModel.mSelectedFilterResId;
        if (!(str == null || str.length() == 0)) {
            com.ss.android.ugc.aweme.filter.repository.a.q f2 = com.ss.android.ugc.aweme.port.in.g.a().r().d().f();
            String str2 = videoPublishEditModel.mSelectedFilterResId;
            l.b(str2, "");
            FilterBean a5 = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(f2, str2);
            if (a5 != null) {
                z6 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(a5);
                q.a("ShouldRecode isABForceRecode:" + a3 + " isFastImportNotAllow:" + a4 + ' ' + "isMvThemeVideoType:" + isMvThemeVideoType + " hasStickers:" + hasStickers + " hasEffect:" + z + " hasEditPageFilter:" + z2 + ' ' + "isBitrateLarge:" + z4 + " isFestivalClose:" + z5 + " isComposerFilter: " + z6 + "useAutoEnhance: " + z3);
                if (!a3 || a4 || isMvThemeVideoType || hasStickers || z || z2 || z4 || z5 || z6 || z3) {
                    return true;
                }
                return false;
            }
        }
        z6 = false;
        q.a("ShouldRecode isABForceRecode:" + a3 + " isFastImportNotAllow:" + a4 + ' ' + "isMvThemeVideoType:" + isMvThemeVideoType + " hasStickers:" + hasStickers + " hasEffect:" + z + " hasEditPageFilter:" + z2 + ' ' + "isBitrateLarge:" + z4 + " isFestivalClose:" + z5 + " isComposerFilter: " + z6 + "useAutoEnhance: " + z3);
        if (!a3) {
        }
        return true;
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        l.d(iArr2, "");
        if (iArr == null || iArr.length < 2 || iArr2.length < 2) {
            return iArr2;
        }
        if (ap.a(((float) iArr2[0]) / ((float) iArr2[1]), ((float) iArr[0]) / ((float) iArr[1]), 0.05f)) {
            return iArr2;
        }
        q.a("DuetCompileVideoSize, original video width:" + iArr2[0] + "height:" + iArr2[1] + " server RecordSize width " + iArr[0] + " height: " + iArr[1]);
        int min = Math.min(iArr[0], iArr[1]);
        int[] iArr3 = new int[2];
        float f2 = (float) (iArr[0] * 2);
        if (f2 > ((float) iArr[1])) {
            iArr3[1] = min;
            iArr3[0] = (int) ((f2 / ((float) iArr[1])) * ((float) iArr3[1]));
        } else {
            iArr3[0] = min;
            iArr3[1] = (int) ((((float) iArr[1]) / f2) * ((float) iArr3[0]));
        }
        int i2 = 0;
        do {
            int i3 = iArr3[i2] % 16;
            if (i3 < 8) {
                iArr3[i2] = iArr3[i2] - i3;
            } else {
                iArr3[i2] = (iArr3[i2] + 16) - i3;
            }
            i2++;
        } while (i2 <= 1);
        q.a("DuetCompileVideoSize, final compile width:" + iArr3[0] + "height:" + iArr3[1]);
        return iArr3;
    }

    public static final z a(VideoPublishEditModel videoPublishEditModel, m mVar) {
        InfoStickerModel infoStickerModel;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        l.d(videoPublishEditModel, "");
        l.d(mVar, "");
        g gVar = new g();
        bq a2 = br.a(videoPublishEditModel);
        a2.a(videoPublishEditModel.getCoverPublishModel().getNeedExpandCompiledSize(), false);
        VEPreviewParams a3 = com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(videoPublishEditModel, 3, -1, -1);
        int c2 = a2.c();
        int d2 = a2.d();
        if (videoPublishEditModel.isPhotoMvMode && at.a()) {
            int[] b2 = b(videoPublishEditModel);
            c2 = b2[0];
            d2 = b2[1];
        }
        a3.mCanvasWidth = c2;
        a3.mCanvasHeight = d2;
        if (a3.mVideoPaths != null) {
            for (String str : a3.mVideoPaths) {
                k.a("[createFromVideoPublishEditModel]: segment.videoPath = ".concat(String.valueOf(str)));
            }
        }
        if (a3.mAudioPaths != null) {
            for (String str2 : a3.mAudioPaths) {
                k.a("[createFromVideoPublishEditModel]: segment.audioPath = ".concat(String.valueOf(str2)));
            }
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            a3.setVeAudioEffectParam(videoPublishEditModel.veAudioEffectParam);
        }
        t tVar = new t();
        tVar.setValue(a3);
        t tVar2 = new t();
        if (videoPublishEditModel.isMusic() == 1 || bz.a(videoPublishEditModel)) {
            VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
            vEPreviewMusicParams.f156744i = videoPublishEditModel.isFastImport;
            vEPreviewMusicParams.f156743h = 3;
            vEPreviewMusicParams.f156736a = videoPublishEditModel.mMusicPath;
            vEPreviewMusicParams.f156737b = videoPublishEditModel.mMusicStart;
            String str3 = videoPublishEditModel.mMusicPath;
            l.d(videoPublishEditModel, "");
            vEPreviewMusicParams.f156738c = fa.a(str3);
            vEPreviewMusicParams.n = videoPublishEditModel.recordBgmDelay;
            if (videoPublishEditModel.loudnessBalanceParam != null) {
                vEPreviewMusicParams.o = videoPublishEditModel.loudnessBalanceParam.getBgmLoudness();
                vEPreviewMusicParams.p = videoPublishEditModel.loudnessBalanceParam.getPeakLoudness();
                vEPreviewMusicParams.q = videoPublishEditModel.loudnessBalanceParam.getAvgLoudness();
            }
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null || cVar.getShootDuration() <= 0 || Math.abs(vEPreviewMusicParams.f156738c - cVar.getShootDuration()) < 1000) {
                vEPreviewMusicParams.f156739d = vEPreviewMusicParams.f156738c;
            } else {
                vEPreviewMusicParams.f156739d = cVar.getShootDuration();
            }
            vEPreviewMusicParams.f156740e = videoPublishEditModel.musicVolume;
            vEPreviewMusicParams.f156741f = videoPublishEditModel.musicId;
            vEPreviewMusicParams.f156742g = videoPublishEditModel.previewStartTime;
            Boolean bool = videoPublishEditModel.isSoundLoop;
            l.b(bool, "");
            vEPreviewMusicParams.f156747l = bool.booleanValue();
            vEPreviewMusicParams.f156748m = bz.a(videoPublishEditModel);
            tVar2.setValue(vEPreviewMusicParams);
        }
        t<InfoStickerModel> tVar3 = new t<>();
        InfoStickerModel infoStickerModel2 = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel2 == null || !h.b(infoStickerModel2.stickers) || !bm.b(videoPublishEditModel)) {
            infoStickerModel = videoPublishEditModel.infoStickerModel;
        } else {
            infoStickerModel = infoStickerModel2.clone();
            l.b(infoStickerModel, "");
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (!stickerItemModel.isImageStickerLayer) {
                    float[] a4 = bm.a(stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY, videoPublishEditModel.mVideoCanvasWidth, videoPublishEditModel.mVideoCanvasHeight, videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight);
                    stickerItemModel.currentOffsetX = a4[0];
                    stickerItemModel.currentOffsetY = a4[1];
                }
            }
        }
        tVar3.setValue(infoStickerModel);
        k<w> kVar = new k<>();
        t<Boolean> tVar4 = new t<>();
        k<n> kVar2 = new k<>();
        t<AudioRecorderParam> tVar5 = new t<>();
        t<com.ss.android.ugc.gamora.editor.a.a> tVar6 = new t<>();
        tVar6.setValue(new com.ss.android.ugc.gamora.editor.a.a(videoPublishEditModel.isFastImport, videoPublishEditModel.isAudioEnhance));
        t tVar7 = new t();
        tVar7.setValue(new com.ss.android.ugc.aweme.shortvideo.edit.b.b(videoPublishEditModel.autoEnhanceOn, videoPublishEditModel.autoEnhanceType, false, com.ss.android.ugc.aweme.shortvideo.edit.b.f.a(), com.ss.android.ugc.aweme.shortvideo.edit.b.f.b(), null, 32));
        z zVar = new z(videoPublishEditModel.videoEditorType, "compile");
        zVar.a(1);
        zVar.I = e(videoPublishEditModel);
        zVar.a();
        zVar.a(new ArrayList<>());
        zVar.a(tVar4);
        zVar.n = new t();
        zVar.o = new t();
        zVar.f156986j = kVar;
        zVar.f156988l = tVar5;
        zVar.f156987k = kVar2;
        zVar.b(new t<>());
        zVar.f156989m = new t();
        zVar.f156985i = gVar;
        zVar.f156984h = new t();
        zVar.q = tVar3;
        zVar.f156983g = new t();
        zVar.f156982f = tVar2;
        zVar.s = tVar7;
        zVar.u = tVar6;
        zVar.f156981e = tVar;
        zVar.a((Context) null, mVar, (SurfaceView) null, videoPublishEditModel);
        w a5 = com.ss.android.ugc.aweme.effect.c.b.a.a(zVar.H.d(), videoPublishEditModel);
        if (a5 != null) {
            kVar.setValue(a5);
        }
        if (videoPublishEditModel.mTimeEffect != null) {
            EffectPointModel effectPointModel = videoPublishEditModel.mTimeEffect;
            l.b(effectPointModel, "");
            if (l.a((Object) effectPointModel.getKey(), (Object) "1")) {
                if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
                    com.ss.android.ugc.asve.editor.g gVar2 = zVar.w;
                    String[] reverseVideoArray = videoPublishEditModel.getPreviewInfo().getReverseVideoArray();
                    if (reverseVideoArray != null) {
                        ArrayList arrayList = new ArrayList(reverseVideoArray.length);
                        for (String str4 : reverseVideoArray) {
                            arrayList.add(str4.toString());
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        strArr = (String[]) array;
                    } else {
                        strArr = null;
                    }
                    gVar2.a(strArr, videoPublishEditModel.getPreviewInfo().getReverseAudioArray());
                    com.ss.android.ugc.asve.editor.g gVar3 = zVar.w;
                    String[] tempVideoArray = videoPublishEditModel.getPreviewInfo().getTempVideoArray();
                    if (tempVideoArray != null) {
                        ArrayList arrayList2 = new ArrayList(tempVideoArray.length);
                        for (String str5 : tempVideoArray) {
                            arrayList2.add(str5.toString());
                        }
                        Object[] array2 = arrayList2.toArray(new String[0]);
                        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                        strArr2 = (String[]) array2;
                    } else {
                        strArr2 = null;
                    }
                    gVar3.a(strArr2);
                } else {
                    com.ss.android.ugc.asve.editor.g gVar4 = zVar.w;
                    String[] reverseVideoArray2 = videoPublishEditModel.getPreviewInfo().getReverseVideoArray();
                    if (reverseVideoArray2 != null) {
                        ArrayList arrayList3 = new ArrayList(reverseVideoArray2.length);
                        for (String str6 : reverseVideoArray2) {
                            arrayList3.add(str6.toString());
                        }
                        Object[] array3 = arrayList3.toArray(new String[0]);
                        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
                        strArr3 = (String[]) array3;
                    } else {
                        strArr3 = null;
                    }
                    gVar4.b(strArr3);
                }
                zVar.w.c(true);
                if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
                    zVar.w.a(zVar.w.a().f151435j, zVar.w.a().f151436k, a3.mVolume);
                }
            }
        }
        if (videoPublishEditModel.mEffectList != null) {
            q.a(videoPublishEditModel.mEffectList, gVar);
        }
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            tVar5.setValue(videoPublishEditModel.veAudioRecorderParam);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
            if (audioEffectParam != null) {
                audioEffectParam.setShowErrorToast(false);
            }
            AudioEffectParam audioEffectParam2 = videoPublishEditModel.veAudioEffectParam;
            if (audioEffectParam2 != null) {
                audioEffectParam2.setPreprocessResult(null);
            }
            kVar2.setValue(n.a.a(videoPublishEditModel.veAudioEffectParam));
        }
        if (videoPublishEditModel.mSelectedId != 0) {
            zVar.w.c(es.a(videoPublishEditModel, com.ss.android.ugc.aweme.port.in.g.a().a(es.f(videoPublishEditModel)).d()).getFilterFolder(), videoPublishEditModel.mSelectedFilterIntensity);
        }
        return zVar;
    }
}
