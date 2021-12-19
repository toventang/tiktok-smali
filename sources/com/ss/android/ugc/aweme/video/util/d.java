package com.ss.android.ugc.aweme.video.util;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.CaptionVideoPlayerItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionVideoPlayerListModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.video.c.c;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f143995a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(94222);
    }

    public static boolean a(Aweme aweme) {
        l.d(aweme, "");
        if (!TranslatedCaptionCacheServiceImpl.j().e() || !b(aweme)) {
            return false;
        }
        return true;
    }

    private static String a(CaptionModel captionModel) {
        if (captionModel == null || captionModel.getCaptionList() == null) {
            return "";
        }
        List<CaptionItemModel> captionList = captionModel.getCaptionList();
        if (captionList == null) {
            l.b();
        }
        if (captionList.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        List<CaptionItemModel> captionList2 = captionModel.getCaptionList();
        if (captionList2 != null) {
            int i2 = 0;
            for (T t : captionList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                arrayList.add(new CaptionVideoPlayerItemModel(Integer.valueOf(i2), t2.getLanguageName(), t2.getSubId(), t2.getUrl(), t2.getExpire(), t2.getFormat(), t2.getSubId()));
                i2 = i3;
            }
        }
        return new f().b(new CaptionVideoPlayerListModel(arrayList));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.util.d.b(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static c a(Video video, boolean z) {
        CaptionModel captionModel;
        if (video == null || (captionModel = video.getCaptionModel()) == null || captionModel.getCaptionList() == null) {
            return null;
        }
        List<CaptionItemModel> captionList = video.getCaptionModel().getCaptionList();
        if (captionList == null) {
            l.b();
        }
        if (captionList.isEmpty()) {
            return null;
        }
        CaptionModel captionModel2 = video.getCaptionModel();
        l.b(captionModel2, "");
        return new c(true, a(captionModel2, z), a(video.getCaptionModel()));
    }

    private static int a(CaptionModel captionModel, boolean z) {
        CaptionLanguage originalCaptionLanguage = captionModel.getOriginalCaptionLanguage();
        if (!(originalCaptionLanguage == null || captionModel.getCaptionList() == null)) {
            List<CaptionItemModel> captionList = captionModel.getCaptionList();
            if (captionList == null) {
                l.b();
            }
            if (!captionList.isEmpty()) {
                List<CaptionItemModel> captionList2 = captionModel.getCaptionList();
                if (captionList2 == null) {
                    l.b();
                }
                if (captionList2.size() == 1) {
                    List<CaptionItemModel> captionList3 = captionModel.getCaptionList();
                    if (captionList3 == null) {
                        l.b();
                    }
                    return captionList3.get(0).getSubId();
                }
                List<CaptionItemModel> captionList4 = captionModel.getCaptionList();
                if (captionList4 == null) {
                    l.b();
                }
                for (T t : captionList4) {
                    if (z) {
                        if (t.getLanguageId() != originalCaptionLanguage.getLanguageId()) {
                            return t.getSubId();
                        }
                    } else if (t.getLanguageId() == originalCaptionLanguage.getLanguageId()) {
                        return t.getSubId();
                    }
                }
            }
        }
        return -1;
    }
}
