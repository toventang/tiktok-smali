package com.ss.android.ugc.aweme.commercialize;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.publish.e;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.ag;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a implements e {
    static {
        Covode.recordClassIndex(45311);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.e
    public final void a(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
        Map a2;
        l.d(baseShortVideoContext, "");
        PublishExtensionModel fromContext = PublishExtensionModel.fromContext(baseShortVideoContext);
        String str = fromContext.anchorContent;
        if (str == null || (a2 = (HashMap) dg.a().a(str, (Class) new HashMap().getClass())) == null) {
            a2 = ag.a();
        }
        if (l.a(a2.get("common_type"), (Object) true)) {
            int i2 = fromContext.anchorBusinessType;
            String str2 = fromContext.anchorTitle;
            if (str2 == null) {
                str2 = "";
            }
            l.b(str2, "");
            String str3 = fromContext.anchorContent;
            if (str3 == null) {
                str3 = "";
            }
            l.b(str3, "");
            list.add(new CreateAnchorInfo(i2, str2, "", "", str3, null, null, null, null, null, fromContext.anchorSubtype, null, 3040, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.e
    public final void a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        Map a2;
        String str;
        l.d(baseShortVideoContext, "");
        l.d(linkedHashMap, "");
        List<CreateAnchorInfo> list2 = PublishExtensionModel.fromContext(baseShortVideoContext).createAnchorInfos;
        if (!(list2 == null || list == null)) {
            l.b(list2, "");
            list.addAll(list2);
        }
        PublishExtensionModel fromContext = PublishExtensionModel.fromContext(baseShortVideoContext);
        String str2 = fromContext.anchorContent;
        if (str2 == null || (a2 = (HashMap) dg.a().a(str2, (Class) new HashMap().getClass())) == null) {
            a2 = ag.a();
        }
        if (l.a(a2.get("common_type"), (Object) true)) {
            try {
                String str3 = fromContext.anchorContent;
                if (str3 == null) {
                    str3 = "";
                }
                str = new JSONObject(str3).optString("url");
                l.b(str, "");
            } catch (Exception unused) {
                str = "";
            }
            if (list != null) {
                int i2 = fromContext.anchorBusinessType;
                String str4 = fromContext.anchorTitle;
                if (str4 == null) {
                    str4 = "";
                }
                l.b(str4, "");
                String str5 = fromContext.anchorContent;
                if (str5 == null) {
                    str5 = "";
                }
                l.b(str5, "");
                list.add(new CreateAnchorInfo(i2, str4, str, "", str5, null, null, null, null, null, fromContext.anchorSubtype, null, 3040, null));
            }
        }
    }
}
