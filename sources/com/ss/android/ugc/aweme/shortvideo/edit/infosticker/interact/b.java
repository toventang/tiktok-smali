package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import androidx.core.g.e;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(83423);
    }

    public static List<InteractStickerStruct> a(e eVar, int i2, d dVar) {
        c d2 = d(eVar);
        if (d2 == null) {
            return null;
        }
        return d2.getTrackByType(Integer.valueOf(i2), dVar);
    }

    public static boolean a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) b(videoPublishEditModel.getMainBusinessContext(), d.TRACK_PAGE_RECORD))) {
                return true;
            }
        }
        return false;
    }

    public static List<InteractStickerStruct> a(e eVar, d... dVarArr) {
        c d2 = d(eVar);
        if (d2 == null || d2.isEmpty(dVarArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = d2.getStickerStructsByPage(dVarArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPollStruct() != null) {
                PollStruct pollStruct = interactStickerStruct.getPollStruct();
                if (!com.bytedance.common.utility.collection.b.a((Collection) pollStruct.getOptions()) && pollStruct.getOptions().size() >= 2) {
                    if (m.a(pollStruct.getOptions().get(0).getPostOption())) {
                        pollStruct.getOptions().get(0).setPostOption(i.f115645a.getString(R.string.hdm));
                    }
                    if (m.a(pollStruct.getOptions().get(1).getPostOption())) {
                        pollStruct.getOptions().get(1).setPostOption(i.f115645a.getString(R.string.hdn));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    public static void a(g gVar, e eVar) {
        if (eVar != null) {
            HashMap hashMap = new HashMap();
            List<InteractStickerStruct> a2 = a(eVar, d.TRACK_PAGE_RECORD);
            if (!com.bytedance.common.utility.collection.b.a((Collection) a2)) {
                hashMap.put("interaction_stickers", com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(a2));
                com.ss.android.ugc.aweme.port.in.g.a().z().a(true);
            } else {
                com.ss.android.ugc.aweme.port.in.g.a().z().a(false);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("com.bytedance.info", com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(hashMap));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            gVar.a("com.android.information", jSONObject.toString());
        }
    }

    private static c d(e eVar) {
        if (eVar != null) {
            return eVar.mInteractStickerContext;
        }
        return null;
    }

    public static c a(String str) {
        if (m.a(str)) {
            return null;
        }
        try {
            return ((e) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(str, e.class)).mInteractStickerContext;
        } catch (Exception unused) {
            return null;
        }
    }

    public static NormalTrackTimeStamp a(InteractStickerStruct interactStickerStruct) {
        List list;
        try {
            list = (List) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(interactStickerStruct.getTrackList(), new a<List<NormalTrackTimeStamp>>() {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(83425);
                }
            }.type);
        } catch (Exception unused) {
            list = null;
        }
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return null;
        }
        return (NormalTrackTimeStamp) list.get(0);
    }

    public static void b(VideoPublishEditModel videoPublishEditModel) {
        c d2;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null && (d2 = d(videoPublishEditModel.getMainBusinessContext())) != null && d2.removeStickerStructByPage(d.TRACK_PAGE_EDIT, 16)) {
            videoPublishEditModel.changeStickerStruct = true;
            videoPublishEditModel.onlyUpdateSuperMainBusinessData(videoPublishEditModel.getMainBusinessContext());
        }
    }

    public static DuetStickerStruct a(e eVar) {
        c d2;
        List<InteractStickerStruct> stickerStructsByPage;
        if (!(eVar == null || (d2 = d(eVar)) == null || (stickerStructsByPage = d2.getStickerStructsByPage(d.TRACK_PAGE_EDIT)) == null || stickerStructsByPage.isEmpty())) {
            for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
                if (interactStickerStruct.getType() == 16 && interactStickerStruct.getDuetStickerStruct() != null) {
                    return interactStickerStruct.getDuetStickerStruct();
                }
            }
        }
        return null;
    }

    public static QaStruct b(e eVar) {
        c d2;
        List<InteractStickerStruct> stickerStructsByPage;
        if (!(eVar == null || (d2 = d(eVar)) == null || (stickerStructsByPage = d2.getStickerStructsByPage(d.TRACK_PAGE_EDIT)) == null || stickerStructsByPage.isEmpty())) {
            for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
                if (interactStickerStruct.getType() == 17 && interactStickerStruct.getQaStruct() != null) {
                    return interactStickerStruct.getQaStruct();
                }
            }
        }
        return null;
    }

    public static e<String, String> c(e eVar) {
        String str;
        String str2;
        Exception e2;
        List<InteractStickerStruct> a2 = a(eVar, 1, d.TRACK_PAGE_EDIT);
        String str3 = "";
        if (a2 == null || a2.isEmpty() || m.a(a2.get(0).getAttr())) {
            return new e<>(str3, str3);
        }
        try {
            HashMap hashMap = (HashMap) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(a2.get(0).getAttr(), new a<HashMap<String, String>>() {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(83424);
                }
            }.type);
            if (hashMap != null) {
                if (hashMap.containsKey("poll_sticker_id")) {
                    str2 = (String) hashMap.get("poll_sticker_id");
                } else {
                    str2 = str3;
                }
                try {
                    if (hashMap.containsKey("poll_sticker_tab_id")) {
                        str = (String) hashMap.get("poll_sticker_tab_id");
                        str3 = str2;
                        return new e<>(str3, str);
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    com.ss.android.ugc.aweme.port.in.g.a().I().a((Throwable) e2);
                    str = str3;
                    str3 = str2;
                    return new e<>(str3, str);
                }
                str = str3;
                str3 = str2;
                return new e<>(str3, str);
            }
            str = str3;
            return new e<>(str3, str);
        } catch (Exception e4) {
            e2 = e4;
            str2 = str3;
            com.ss.android.ugc.aweme.port.in.g.a().I().a((Throwable) e2);
            str = str3;
            str3 = str2;
            return new e<>(str3, str);
        }
    }

    private static List<InteractStickerStruct> b(e eVar, d... dVarArr) {
        LinkedList linkedList = new LinkedList();
        c d2 = d(eVar);
        if (d2 == null || d2.isEmpty(dVarArr)) {
            return null;
        }
        linkedList.addAll(d2.getStickerStructsByPage(dVarArr));
        return linkedList;
    }

    public static Collection<InteractStickerStruct> a(BaseShortVideoContext baseShortVideoContext, d... dVarArr) {
        c a2;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            a2 = d(((VideoPublishEditModel) baseShortVideoContext).getMainBusinessContext());
        } else {
            a2 = a(baseShortVideoContext.getMainBusinessData());
        }
        if (a2 == null || a2.isEmpty(dVarArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = a2.getStickerStructsByPage(dVarArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPollStruct() != null) {
                PollStruct pollStruct = interactStickerStruct.getPollStruct();
                if (!com.bytedance.common.utility.collection.b.a((Collection) pollStruct.getOptions()) && pollStruct.getOptions().size() >= 2) {
                    if (m.a(pollStruct.getOptions().get(0).getPostOption())) {
                        pollStruct.getOptions().get(0).setPostOption(i.f115645a.getString(R.string.hdm));
                    }
                    if (m.a(pollStruct.getOptions().get(1).getPostOption())) {
                        pollStruct.getOptions().get(1).setPostOption(i.f115645a.getString(R.string.hdn));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    public static String a(e eVar, List<InteractStickerStruct> list, d dVar) {
        c cVar;
        if (eVar == null) {
            eVar = new e();
        }
        if (eVar.mInteractStickerContext == null) {
            cVar = new c();
        } else {
            cVar = eVar.mInteractStickerContext;
        }
        cVar.upDateStickerStructs(list, dVar);
        eVar.setInteractStickerContext(cVar);
        return com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(eVar);
    }

    public static List<InteractStickerStruct> a(BaseShortVideoContext baseShortVideoContext, int i2, d dVar) {
        c a2;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            a2 = d(((VideoPublishEditModel) baseShortVideoContext).getMainBusinessContext());
        } else {
            a2 = a(baseShortVideoContext.getMainBusinessData());
        }
        if (a2 == null) {
            return null;
        }
        return a2.getTrackByType(Integer.valueOf(i2), dVar);
    }

    public static String a(String str, List<InteractStickerStruct> list, d dVar, boolean z) {
        e eVar;
        c cVar;
        if (m.a(str)) {
            eVar = new e();
        } else {
            try {
                eVar = (e) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(str, e.class);
            } catch (Exception unused) {
                eVar = new e();
            }
        }
        if (eVar.mInteractStickerContext == null) {
            cVar = new c();
        } else {
            cVar = eVar.mInteractStickerContext;
        }
        cVar.upDateStickerStructs(list, dVar);
        eVar.setInteractStickerContext(cVar);
        eVar.interactStickerCheckEffectSdk = z;
        return com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(eVar);
    }
}
