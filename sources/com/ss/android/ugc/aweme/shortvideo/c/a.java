package com.ss.android.ugc.aweme.shortvideo.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.shoutout.AVAnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;
import com.ss.android.ugc.aweme.shortvideo.i;
import com.ss.android.ugc.aweme.shortvideo.publish.e;
import com.ss.android.ugc.aweme.shortvideo.util.ad;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f125064a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(82163);
    }

    public static List<CreateAnchorInfo> a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        AVAnchorPublishStruct b2;
        boolean z2;
        boolean z3;
        l.d(videoPublishEditModel, "");
        ArrayList arrayList = new ArrayList();
        if (PrivacyServiceImpl.c().b()) {
            return arrayList;
        }
        String stickers = videoPublishEditModel.getStickers();
        if (stickers == null || stickers.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String propSource = videoPublishEditModel.getPropSource();
            if (propSource == null || propSource.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                ad.a.a(arrayList, videoPublishEditModel);
            }
        }
        if (!videoPublishEditModel.isPhotoMvMode) {
            String b3 = dg.a().b(videoPublishEditModel.uploadMiscInfoStruct);
            if (b3 == null || b3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                try {
                    i iVar = videoPublishEditModel.uploadMiscInfoStruct;
                    l.b(iVar, "");
                    ad.a.a(arrayList, iVar);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        if (videoPublishEditModel.getMainBusinessContext() != null) {
            arrayList.addAll(t.j(b.a(videoPublishEditModel.getMainBusinessContext(), d.TRACK_PAGE_EDIT)));
        }
        if (videoPublishEditModel.getMainBusinessContext() != null) {
            arrayList.addAll(t.k(b.a(videoPublishEditModel.getMainBusinessContext(), d.TRACK_PAGE_EDIT)));
        }
        if (!videoPublishEditModel.mIsFromDraft && videoPublishEditModel.mShoutOutsData != null && p.a(videoPublishEditModel.mShoutOutsData.getShoutOutsMode(), com.ss.android.ugc.aweme.shoutouts.d.MODE_POST, false) && (b2 = c.t.b()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("third_id", videoPublishEditModel.mShoutOutsData.getProductId());
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            String keyword = b2.getKeyword();
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, "");
            arrayList.add(new CreateAnchorInfo(40, keyword, "", "", jSONObject2, b2.getImg(), -1L, null, null, null, null, null, 3968, null));
        }
        ax axVar = c.r;
        l.b(axVar, "");
        List<e> b4 = axVar.b();
        l.b(b4, "");
        for (e eVar : b4) {
            eVar.a(videoPublishEditModel, arrayList);
        }
        return arrayList;
    }
}
