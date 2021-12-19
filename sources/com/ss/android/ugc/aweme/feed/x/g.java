package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.feed.model.VPAInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.shortvideo.i;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.d;
import f.a.d.k;
import java.util.Collection;
import java.util.List;

public final class g {
    static {
        Covode.recordClassIndex(60374);
    }

    public static boolean a(aj ajVar) {
        if (ajVar == null || !e.a(ajVar.b())) {
            return false;
        }
        return true;
    }

    public static Aweme b(aj ajVar) {
        if (ajVar == null) {
            return null;
        }
        return ajVar.b();
    }

    public static boolean e(aj ajVar) {
        if (ajVar == null || ajVar.p().s() != 1) {
            return false;
        }
        return true;
    }

    public static boolean f(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 151) {
            return false;
        }
        return true;
    }

    public static boolean b(Aweme aweme) {
        KtfInfo ktfInfo;
        if (aweme == null || (ktfInfo = aweme.getUploadMiscInfoStruct().ktfInfo) == null || !ktfInfo.getShowWarning()) {
            return false;
        }
        return true;
    }

    public static boolean c(aj ajVar) {
        if (ajVar == null || ajVar.b() == null || !ajVar.b().isAd()) {
            return false;
        }
        return true;
    }

    public static boolean d(aj ajVar) {
        if (ajVar == null || ajVar.b() == null || ajVar.b().getAwemeType() != 31) {
            return false;
        }
        return true;
    }

    public static boolean a(Aweme aweme) {
        i uploadMiscInfoStruct;
        VPAInfo vPAInfo;
        if (aweme == null || (uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct()) == null || (vPAInfo = uploadMiscInfoStruct.vpaInfo) == null || vPAInfo.getInfoBarType() == 0) {
            return false;
        }
        return true;
    }

    public static void c(Aweme aweme) {
        List<AwemeLabelModel> videoLabels = aweme.getVideoLabels();
        if (!b.a((Collection) videoLabels)) {
            for (int i2 = 0; i2 < videoLabels.size(); i2++) {
                AwemeLabelModel awemeLabelModel = videoLabels.get(i2);
                if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 1 && !m.a(aweme) && aweme.getStatus() != null && aweme.isPrivate()) {
                    videoLabels.remove(awemeLabelModel);
                }
            }
        }
    }

    public static d e(Aweme aweme) {
        if (!(aweme == null || aweme.getInteractStickerStructs() == null || aweme.getInteractStickerStructs().size() <= 0)) {
            for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
                if (interactStickerStruct.getCaptionStruct() != null) {
                    return interactStickerStruct.getCaptionStruct();
                }
            }
        }
        return null;
    }

    public static boolean d(Aweme aweme) {
        if (!(aweme == null || aweme.getInteractStickerStructs() == null || aweme.getInteractStickerStructs().size() <= 0)) {
            for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
                if (interactStickerStruct.getCaptionStruct() != null && !b.a((Collection) interactStickerStruct.getCaptionStruct().getAutoCaptions())) {
                    if (interactStickerStruct.getCaptionStruct().getDisable() == 0) {
                        return true;
                    }
                    if (interactStickerStruct.getCaptionStruct().getDisable() > 0 && !ah.a(aweme)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar, k<Aweme> kVar) {
        if (bVar == null || !(bVar.a() instanceof VideoItemParams)) {
            return true;
        }
        Aweme aweme = ((VideoItemParams) bVar.a()).mAweme;
        if (aweme == null) {
            return false;
        }
        try {
            if (kVar.a(aweme)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
