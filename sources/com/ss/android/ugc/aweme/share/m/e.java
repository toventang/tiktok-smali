package com.ss.android.ugc.aweme.share.m;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.setting.m;
import com.ss.android.ugc.aweme.share.ag;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f124084a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final f f124085b = new f();

    public static final class a extends com.google.gson.b.a<HashMap<String, VideoUrlModel>> {
        static {
            Covode.recordClassIndex(81490);
        }

        a() {
        }
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(81489);
    }

    public static final VideoUrlModel a(Aweme aweme) {
        l.d(aweme, "");
        Map<String, VideoUrlModel> b2 = b(aweme);
        if (b2 != null) {
            return b2.get("suffix_scene");
        }
        return null;
    }

    private static Map<String, VideoUrlModel> b(Aweme aweme) {
        Video video = aweme.getVideo();
        l.b(video, "");
        return (Map) f124085b.a(video.getMiscDownloadAddrs(), new a().type);
    }

    public static final VideoUrlModel a(Aweme aweme, String str) {
        List<ag> list;
        l.d(aweme, "");
        if (str == null) {
            return null;
        }
        l.d(aweme, "");
        com.ss.android.ugc.aweme.share.i.a a2 = com.ss.android.ugc.aweme.share.i.a.a();
        l.b(a2, "");
        List<ag> list2 = a2.f123566a;
        if (list2 == null || list2.isEmpty()) {
            list = m.a();
        } else {
            com.ss.android.ugc.aweme.share.i.a a3 = com.ss.android.ugc.aweme.share.i.a.a();
            l.b(a3, "");
            list = a3.f123566a;
        }
        l.b(list, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (ag agVar : list) {
            arrayList.add(agVar.f123339a);
        }
        Set m2 = n.m(arrayList);
        Map<String, VideoUrlModel> b2 = b(aweme);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (b2 != null) {
            for (Map.Entry<String, VideoUrlModel> entry : b2.entrySet()) {
                if (m2.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return (VideoUrlModel) linkedHashMap.get(str);
    }
}
