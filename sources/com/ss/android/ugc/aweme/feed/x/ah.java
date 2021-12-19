package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.sticker.data.a;
import com.ss.android.ugc.aweme.sticker.data.d;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static final ah f95305a = new ah();

    private ah() {
    }

    static {
        Covode.recordClassIndex(60367);
    }

    public static int h(Aweme aweme) {
        if (j(aweme)) {
            return 0;
        }
        return 1;
    }

    public static int i(Aweme aweme) {
        if (k(aweme)) {
            return 0;
        }
        return 1;
    }

    public static boolean j(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean k(Aweme aweme) {
        Audio audio;
        List<TtsInfos> ttsInfos;
        if (aweme == null || (audio = aweme.getAudio()) == null || (ttsInfos = audio.getTtsInfos()) == null || n.g((List) ttsInfos) == null) {
            return false;
        }
        return true;
    }

    public static String c(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        Long l2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            return "";
        }
        Video video2 = aweme.getVideo();
        if (video2 == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        for (T t : captionList) {
            long languageId = t.getLanguageId();
            if (l2 != null && languageId == l2.longValue()) {
                if (t.isAutoGenerated()) {
                    return "asr";
                }
                return "creator";
            }
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.x.ah.e(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            r1 = 0
            if (r3 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.feed.model.Video r0 = r3.getVideo()
            if (r0 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r0.getCaptionList()
        L_0x0013:
            r2 = 0
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.Video r0 = r3.getVideo()
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x004f
            java.util.List r0 = r0.getCaptionList()
            if (r0 != 0) goto L_0x002b
        L_0x0028:
            h.f.b.l.b()
        L_0x002b:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0032
        L_0x0031:
            return r2
        L_0x0032:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r3.getVideo()
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x0044
            java.util.List r1 = r0.getCaptionList()
            if (r1 != 0) goto L_0x0047
        L_0x0044:
            h.f.b.l.b()
        L_0x0047:
            int r1 = r1.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0031
            return r0
        L_0x004f:
            r0 = r1
            goto L_0x0028
        L_0x0051:
            r0 = r1
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.x.ah.f(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static boolean g(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        Long l2;
        d e2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            return false;
        }
        Video video2 = aweme.getVideo();
        if (video2 == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        for (T t : captionList) {
            long languageId = t.getLanguageId();
            if (l2 != null && languageId == l2.longValue() && !t.isAutoGenerated() && (e2 = g.e(aweme)) != null && e2.getLocation() == a.LEFT_TOP.getValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.x.ah.a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r0 == null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.x.ah.b(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static long d(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        Long l2 = null;
        boolean a2 = l.a((Object) TranslatedCaptionCacheServiceImpl.j().c(), (Object) (aweme != null ? aweme.getAid() : null));
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            return 0;
        }
        Video video2 = aweme.getVideo();
        if (!(video2 == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null)) {
            l2 = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        for (T t : captionList) {
            if (a2) {
                long languageId = t.getLanguageId();
                if (l2 != null && languageId == l2.longValue()) {
                }
            } else {
                long languageId2 = t.getLanguageId();
                if (l2 != null && languageId2 == l2.longValue()) {
                }
            }
            return t.getComplaintId();
        }
        return 0;
    }

    public static int a(boolean z, Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        Long l2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            return 0;
        }
        Video video2 = aweme.getVideo();
        if (video2 == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        for (T t : captionList) {
            long languageId = t.getLanguageId();
            if (l2 == null || languageId != l2.longValue() || !z) {
                long languageId2 = t.getLanguageId();
                if ((l2 != null && languageId2 == l2.longValue()) || z) {
                }
            }
            try {
                return Integer.parseInt(t.getVersionType());
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}