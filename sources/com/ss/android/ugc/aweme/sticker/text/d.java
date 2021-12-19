package com.ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.q;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(88724);
    }

    public static final boolean a(BaseShortVideoContext baseShortVideoContext) {
        q b2 = b(baseShortVideoContext);
        if (b2 != null) {
            return b2.a();
        }
        return false;
    }

    private static q b(BaseShortVideoContext baseShortVideoContext) {
        String str;
        if (baseShortVideoContext == null || (str = baseShortVideoContext.commerceData) == null || str.length() == 0) {
            return null;
        }
        try {
            return (q) g.a().G().a(baseShortVideoContext.commerceData, q.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean b(VideoPublishEditModel videoPublishEditModel) {
        List<CreateAnchorInfo> anchors;
        l.d(videoPublishEditModel, "");
        List<InteractStickerStruct> a2 = b.a(videoPublishEditModel.getMainBusinessContext(), com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        if (a2 == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : a2) {
            T t2 = t;
            l.b(t2, "");
            if (t2.getType() == 5) {
                arrayList.add(t);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) next;
            try {
                f G = g.a().G();
                l.b(interactStickerStruct, "");
                TextStruct textStruct = (TextStruct) G.a(interactStickerStruct.getTextStruct(), TextStruct.class);
                if (!(textStruct == null || (anchors = textStruct.getAnchors()) == null || anchors.isEmpty())) {
                    if (next != null) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static final List<TextStickerTextWrap> a(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        TextStickerData textStickerData;
        boolean z;
        if (videoPublishEditModel == null) {
            return new ArrayList();
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (!(infoStickerModel == null || (list = infoStickerModel.stickers) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.type == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(t);
                }
            }
            ArrayList<StickerItemModel> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
            for (StickerItemModel stickerItemModel : arrayList2) {
                try {
                    textStickerData = (TextStickerData) g.a().G().a(stickerItemModel.extra, TextStickerData.class);
                } catch (Exception unused) {
                    textStickerData = null;
                }
                arrayList3.add(textStickerData);
            }
            List<TextStickerData> g2 = n.g((Iterable) arrayList3);
            if (g2 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (TextStickerData textStickerData2 : g2) {
                    n.a((Collection) arrayList4, (Iterable) textStickerData2.getTextWrapList());
                }
                return arrayList4;
            }
        }
        return new ArrayList();
    }
}
