package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.x.c.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import h.f.b.l;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f143196a = new y();

    private y() {
    }

    static {
        Covode.recordClassIndex(93731);
    }

    public static final boolean e(Aweme aweme) {
        if (aweme == null || !aweme.downloadWithoutWatermark || !m.a(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean a(Aweme aweme) {
        if (aweme == null || aweme.getMusic() == null) {
            return false;
        }
        Music music = aweme.getMusic();
        l.b(music, "");
        if (music.getMusicStatus() == 0) {
            return true;
        }
        return false;
    }

    private static final boolean j(Aweme aweme) {
        if (aweme == null || aweme.getMusic() == null || aweme.getMusic().getMusicStatus() != 0 || g.h().a(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean b(Aweme aweme) {
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        if (aweme == null) {
            return false;
        }
        Music music = aweme.getMusic();
        if ((music == null || music.getMusicStatus() != 0) && ((status = aweme.getStatus()) == null || (videoMuteInfo = status.getVideoMuteInfo()) == null || !videoMuteInfo.isMute())) {
            return false;
        }
        return true;
    }

    public static boolean g(Aweme aweme) {
        Boolean showMask;
        if (aweme == null || aweme.getReportMaskInfo() == null || (showMask = aweme.getReportMaskInfo().getShowMask()) == null || !showMask.booleanValue() || c.a(aweme.getReportMaskInfo().getTitle()) || c.a(aweme.getReportMaskInfo().getCancelMaskLabel())) {
            return false;
        }
        return true;
    }

    public static boolean h(Aweme aweme) {
        Boolean showMask;
        if (aweme == null || aweme.getGeneralMaskInfo() == null || g(aweme) || (showMask = aweme.getGeneralMaskInfo().getShowMask()) == null || !showMask.booleanValue() || c.a(aweme.getGeneralMaskInfo().getTitle()) || c.a(aweme.getGeneralMaskInfo().getContent())) {
            return false;
        }
        return true;
    }

    public static boolean i(Aweme aweme) {
        Boolean showMask;
        if (aweme == null || aweme.getPhotosensitiveMaskInfo() == null || a.d().i() <= 0 || a.d().h() == 2 || g(aweme) || h(aweme) || (showMask = aweme.getPhotosensitiveMaskInfo().getShowMask()) == null || !showMask.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean c(Aweme aweme) {
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.a().configService().shortVideoConfig();
        if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getVideoLength() <= 0) {
            return false;
        }
        if ((((long) aweme.getVideo().getVideoLength()) > shortVideoConfig.maxDuetVideoTime() && !aweme.isSupportGameChallenge()) || !aweme.canDuetVideoType() || aweme.isVr() || aweme.getDuetSetting() == 2) {
            return false;
        }
        if ((aweme.getDuetSetting() != 1 || m.a(aweme)) && !j(aweme) && aweme.getMusic() != null && aweme.getMusic().getPlayUrl() != null && aweme.getMusic().getPlayUrl().getUrlList() != null && !aweme.getMusic().getPlayUrl().getUrlList().isEmpty() && !aweme.isWithPromotionalMusic()) {
            return true;
        }
        return false;
    }

    public static final boolean d(Aweme aweme) {
        l.d(aweme, "");
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.a().configService().shortVideoConfig();
        if (aweme.getVideo() == null) {
            return false;
        }
        Video video = aweme.getVideo();
        l.b(video, "");
        if (video.getVideoLength() <= 0) {
            return false;
        }
        Video video2 = aweme.getVideo();
        l.b(video2, "");
        if (((long) video2.getVideoLength()) > shortVideoConfig.maxStitchVideoTime() || !aweme.canStitchVideoType() || aweme.isVr() || aweme.getStitchSetting() == 2) {
            return false;
        }
        if ((aweme.getStitchSetting() == 1 && !m.a(aweme)) || j(aweme) || aweme.getMusic() == null) {
            return false;
        }
        Music music = aweme.getMusic();
        l.b(music, "");
        if (music.getPlayUrl() == null) {
            return false;
        }
        Music music2 = aweme.getMusic();
        l.b(music2, "");
        UrlModel playUrl = music2.getPlayUrl();
        l.b(playUrl, "");
        if (playUrl.getUrlList() == null) {
            return false;
        }
        Music music3 = aweme.getMusic();
        l.b(music3, "");
        UrlModel playUrl2 = music3.getPlayUrl();
        l.b(playUrl2, "");
        List<String> urlList = playUrl2.getUrlList();
        l.b(urlList, "");
        if (!(!urlList.isEmpty()) || aweme.isWithPromotionalMusic()) {
            return false;
        }
        return true;
    }

    public static final boolean f(Aweme aweme) {
        if (!(aweme == null || aweme.getReportMaskInfo() == null || aweme.getGeneralMaskInfo() == null || aweme.getPhotosensitiveMaskInfo() == null)) {
            Boolean showMask = aweme.getReportMaskInfo().getShowMask();
            if (showMask != null && showMask.booleanValue() && !c.a(aweme.getReportMaskInfo().getTitle()) && !c.a(aweme.getReportMaskInfo().getCancelMaskLabel())) {
                return true;
            }
            Boolean showMask2 = aweme.getGeneralMaskInfo().getShowMask();
            if (showMask2 != null && showMask2.booleanValue() && !c.a(aweme.getGeneralMaskInfo().getTitle()) && !c.a(aweme.getGeneralMaskInfo().getContent())) {
                return true;
            }
            Boolean showMask3 = aweme.getPhotosensitiveMaskInfo().getShowMask();
            if (showMask3 == null || !showMask3.booleanValue() || a.d().i() <= 0 || a.d().h() == 2) {
                return false;
            }
            return true;
        }
        return false;
    }
}
