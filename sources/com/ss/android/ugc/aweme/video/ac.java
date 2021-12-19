package com.ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.experiment.de;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.setting.l;
import com.ss.android.ugc.aweme.utils.fr;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.aweme.video.preload.d;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.aweme.video.preload.n;
import com.ss.android.ugc.aweme.video.preload.o;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.aweme.video.simcommon.a;
import com.ss.android.ugc.playerkit.model.c;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import java.util.ArrayList;
import java.util.List;

public final class ac {
    static {
        Covode.recordClassIndex(93763);
    }

    public static boolean a(VideoUrlModel videoUrlModel) {
        return s.b().a(a.a(videoUrlModel));
    }

    public static int c(VideoUrlModel videoUrlModel) {
        return b(videoUrlModel);
    }

    public static int b(VideoUrlModel videoUrlModel) {
        return s.b().c(a.a(videoUrlModel));
    }

    public static long d(VideoUrlModel videoUrlModel) {
        return s.b().e(a.a(videoUrlModel));
    }

    public static void e(VideoUrlModel videoUrlModel) {
        s.b().h(a.a(videoUrlModel));
    }

    public static VideoUrlModel a(Video video) {
        return a.a(a.C3820a.f143369a.a().getVideoPlayAddr(com.ss.android.ugc.aweme.video.simcommon.a.a(video), c.f148702a.getPlayerType()));
    }

    public static void a(List<Aweme> list) {
        if (list != null && list.size() != 0 && list.size() > 0) {
            a(list.get(0), 0);
        }
    }

    public static i b(Aweme aweme) {
        i a2;
        if (com.ss.android.ugc.aweme.video.preload.a.a.f143571a) {
            a2 = p.a(com.ss.android.ugc.aweme.video.simcommon.a.a(aweme.getVideo()), c.f148702a.getPlayerType());
        } else {
            a2 = com.ss.android.ugc.aweme.video.simcommon.a.a(aweme.getVideo().getProperPlayAddr());
        }
        if (a2 == null) {
            return null;
        }
        a2.setSourceId(aweme.getAid());
        a2.setRatio(aweme.getVideo().getRatio());
        if (!TextUtils.isEmpty(aweme.getVideo().getVideoModelStr())) {
            a2.setDashVideoModelStr(aweme.getVideo().getVideoModelStr());
        }
        return a2;
    }

    public static List<i> d(Aweme aweme) {
        CaptionModel captionModel;
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Video video = aweme.getVideo();
        if (!(video == null || video.getCaptionModel() == null || (captionModel = video.getCaptionModel()) == null || captionModel.getCaptionList() == null || captionModel.getCaptionList().isEmpty())) {
            for (CaptionItemModel captionItemModel : captionModel.getCaptionList()) {
                i iVar = new i();
                iVar.setSourceId(String.valueOf(captionItemModel.getSubId()));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(captionItemModel.getUrl());
                iVar.setUrlList(arrayList2);
                iVar.setUri(String.valueOf(captionItemModel.getSubId()));
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public static List<i> c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Audio audio = aweme.getAudio();
        if (!(audio == null || audio.getTtsInfos() == null || audio.getTtsInfos().isEmpty())) {
            for (TtsInfos ttsInfos : audio.getTtsInfos()) {
                if (ttsInfos.getPlayAddress() != null) {
                    i iVar = new i();
                    if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                        iVar.setSourceId(ttsInfos.getPlayAddress().getUrlKey());
                    }
                    if (ttsInfos.getPlayAddress().getFileHash() != null) {
                        iVar.setFileHash(ttsInfos.getPlayAddress().getFileHash());
                    }
                    if (ttsInfos.getPlayAddress().getHeight() != null) {
                        iVar.setHeight(ttsInfos.getPlayAddress().getHeight().intValue());
                    }
                    if (ttsInfos.getPlayAddress().getWidth() != null) {
                        iVar.setWidth(ttsInfos.getPlayAddress().getWidth().intValue());
                    }
                    if (ttsInfos.getPlayAddress().getDataSize() != null) {
                        iVar.setSize(ttsInfos.getPlayAddress().getDataSize().longValue());
                    }
                    if (ttsInfos.getPlayAddress().getUri() != null) {
                        iVar.setUri(ttsInfos.getPlayAddress().getUri());
                    }
                    if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                        iVar.setUrlKey(ttsInfos.getPlayAddress().getUrlKey());
                    }
                    if (ttsInfos.getPlayAddress().getUrlList() != null) {
                        iVar.setUrlList(ttsInfos.getPlayAddress().getUrlList());
                    }
                    if (ttsInfos.getPlayAddress().getPlayerAccessKey() != null) {
                        iVar.setaK(ttsInfos.getPlayAddress().getPlayerAccessKey());
                    }
                    arrayList.add(iVar);
                }
            }
        }
        return arrayList;
    }

    public static boolean a(Aweme aweme) {
        return s.b().b(b(aweme));
    }

    public static void a(Aweme aweme, int i2) {
        int i3;
        if (aweme != null && !aweme.isLive() && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && s.b() != null && o.a() != null) {
            i b2 = b(aweme);
            if (i2 > 0) {
                i3 = 102400;
            } else {
                i3 = 0;
            }
            List<i> c2 = c(aweme);
            ab.a(b2, s.b().a(b2, i2, d(aweme), c2, i3), i2);
        }
    }

    private static void c(Aweme aweme, int i2) {
        List<Video> videoList;
        a(aweme, i2);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (videoList = awemeRawAd.getVideoList()) != null && !videoList.isEmpty()) {
            int i3 = 0;
            while (i3 < videoList.size()) {
                Aweme clone = aweme.clone();
                int i4 = i3 + 1;
                clone.setAid(aweme.getAid() + i4);
                clone.setVideo(videoList.get(i3));
                a(clone, i2);
                i3 = i4;
            }
        }
    }

    public static void b(Aweme aweme, int i2) {
        if (b.aw(aweme)) {
            c(aweme, i2);
        } else if (aweme == null || !aweme.isAd() || (!com.ss.android.ugc.aweme.video.b.b.a() && com.ss.android.ugc.aweme.video.b.a.a() == 1.0d)) {
            a(aweme, i2);
        } else {
            g.a aVar = new g.a();
            if (com.ss.android.ugc.aweme.video.b.b.a()) {
                aVar.f143724a = 2;
            }
            double a2 = com.ss.android.ugc.aweme.video.b.a.a();
            double d2 = (double) i2;
            Double.isNaN(d2);
            a(aweme, (int) (d2 * a2), aVar);
        }
    }

    public static void a(Aweme aweme, String str, d dVar) {
        i b2 = b(aweme);
        com.ss.android.ugc.aweme.video.preload.i b3 = s.b();
        if (b3 != null) {
            b3.a(b2, str, dVar);
        }
    }

    private static void a(Aweme aweme, int i2, g.a aVar) {
        int i3;
        if (aweme != null && !aweme.isLive() && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && s.b() != null && o.a() != null) {
            i b2 = b(aweme);
            if (i2 > 0) {
                i3 = 102400;
            } else {
                i3 = 0;
            }
            List<i> c2 = c(aweme);
            s.b().a(b2, i2, n.b.f143760b, aVar, d(aweme), c2, i3);
        }
    }

    public static void a(Aweme[] awemeArr, final int i2, boolean z) {
        if (awemeArr != null && awemeArr.length > 0) {
            for (final Aweme aweme : awemeArr) {
                if ((!de.f89780f || !fr.f142950d) && !z) {
                    b(aweme, i2);
                } else {
                    com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.video.ac.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(93765);
                        }

                        public final void run() {
                            ac.b(aweme, i2);
                        }
                    }, 500);
                }
            }
        }
    }

    public static void a(boolean z, int i2, List<Aweme> list, List<PreloadTask> list2, final boolean z2) {
        int i3;
        for (final PreloadTask preloadTask : list2) {
            if (preloadTask.count > 0 && preloadTask.offset >= 0) {
                if (l.b() == 2) {
                    i3 = 1;
                } else {
                    i3 = preloadTask.count;
                }
                preloadTask.count = i3;
                int i4 = preloadTask.count;
                int i5 = preloadTask.offset;
                final Aweme[] awemeArr = new Aweme[i4];
                if (z) {
                    for (int i6 = 0; i6 < i4; i6++) {
                        int i7 = i2 + 1 + i6 + i5;
                        if (i7 < list.size()) {
                            awemeArr[i6] = list.get(i7);
                        }
                    }
                } else {
                    for (int i8 = 0; i8 < i4; i8++) {
                        int i9 = ((i2 - 1) - i8) - i5;
                        if (i9 >= 0 && i9 < list.size()) {
                            awemeArr[i8] = list.get(i9);
                        }
                    }
                }
                if (com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < i4; i10++) {
                        Aweme aweme = awemeArr[i10];
                        if (aweme != null) {
                            arrayList.add(aweme.getDesc() + "\n");
                        }
                    }
                    if (!de.f89780f) {
                        arrayList.size();
                    }
                }
                if (!de.f89780f || !fr.f142950d) {
                    a(awemeArr, preloadTask.getVideoPreloadSize(), z2);
                } else {
                    com.bytedance.aweme.b.a.f25788b.f25790a.post(new Runnable() {
                        /* class com.ss.android.ugc.aweme.video.ac.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(93764);
                        }

                        public final void run() {
                            ac.a(awemeArr, preloadTask.getVideoPreloadSize(), z2);
                        }
                    });
                }
            }
        }
    }
}
