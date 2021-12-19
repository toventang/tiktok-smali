package com.ss.android.ugc.aweme.dsp.playpage.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.experiment.b;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.b.e;
import com.ss.android.ugc.aweme.dsp.playerservice.b.h;
import com.ss.android.ugc.aweme.dsp.playerservice.b.k;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicPerformer;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f83719a;

    /* renamed from: b  reason: collision with root package name */
    public final h f83720b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83721c;

    /* renamed from: d  reason: collision with root package name */
    private final DspStruct f83722d;

    /* renamed from: e  reason: collision with root package name */
    private final String f83723e;

    /* renamed from: f  reason: collision with root package name */
    private final long f83724f;

    /* renamed from: g  reason: collision with root package name */
    private final String f83725g;

    /* renamed from: h  reason: collision with root package name */
    private final String f83726h;

    /* renamed from: i  reason: collision with root package name */
    private final UrlModel f83727i;

    /* renamed from: j  reason: collision with root package name */
    private final UrlModel f83728j;

    /* renamed from: k  reason: collision with root package name */
    private Integer f83729k;

    /* renamed from: l  reason: collision with root package name */
    private int f83730l;

    /* renamed from: m  reason: collision with root package name */
    private final String f83731m;
    private final String n;
    private e o;
    private final DspStruct p;

    static {
        Covode.recordClassIndex(52238);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final String a() {
        return this.f83719a;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final String b() {
        return this.f83721c;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final DspStruct c() {
        return this.f83722d;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final h d() {
        return this.f83720b;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final String e() {
        return this.f83723e;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final long f() {
        return this.f83724f;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final String h() {
        return this.f83725g;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final String i() {
        return this.f83726h;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final String j() {
        return this.f83731m;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final String k() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final UrlModel l() {
        return this.f83727i;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final int n() {
        Integer collectStatus;
        Dsp dsp = this.p.getAweme().getDsp();
        if (dsp == null || (collectStatus = dsp.getCollectStatus()) == null) {
            return -1;
        }
        return collectStatus.intValue();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final Integer m() {
        List<MusicOwnerInfo> musicOwnerInfos;
        MusicOwnerInfo musicOwnerInfo;
        Music music = this.p.getAweme().getMusic();
        if (music == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) n.h((List) musicOwnerInfos)) == null) {
            return null;
        }
        return musicOwnerInfo.getFollowStatus();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final String g() {
        String str;
        String str2;
        UrlModel coverLarge;
        List<String> urlList;
        String str3;
        UrlModel coverMedium;
        List<String> urlList2;
        UrlModel coverThumb;
        List<String> urlList3;
        Music music = this.p.getAweme().getMusic();
        String str4 = "";
        if (music == null || (coverThumb = music.getCoverThumb()) == null || (urlList3 = coverThumb.getUrlList()) == null || (str = (String) n.h((List) urlList3)) == null) {
            str = str4;
        }
        Music music2 = this.p.getAweme().getMusic();
        if (music2 == null || (coverMedium = music2.getCoverMedium()) == null || (urlList2 = coverMedium.getUrlList()) == null || (str2 = (String) n.h((List) urlList2)) == null) {
            str2 = str4;
        }
        Music music3 = this.p.getAweme().getMusic();
        if (!(music3 == null || (coverLarge = music3.getCoverLarge()) == null || (urlList = coverLarge.getUrlList()) == null || (str3 = (String) n.h((List) urlList)) == null)) {
            str4 = str3;
        }
        if (str4.length() > 0) {
            return str4;
        }
        if (str2.length() > 0) {
            return str2;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final e o() {
        String str;
        k kVar;
        String str2;
        String str3;
        String str4;
        VideoUrlModel playAddr;
        List<String> urlList;
        String str5;
        String str6;
        VideoUrlModel playAddr2;
        List<String> urlList2;
        VideoUrlModel playAddr3;
        List<String> urlList3;
        Video video = this.p.getAweme().getVideo();
        if (video == null || (playAddr3 = video.getPlayAddr()) == null || (urlList3 = playAddr3.getUrlList()) == null || (str = (String) n.h((List) urlList3)) == null) {
            str = "";
        }
        String str7 = null;
        if (!b.a().getEnableRetryPlay()) {
            String b2 = b(this);
            Video video2 = this.p.getAweme().getVideo();
            if (video2 != null) {
                str2 = video2.getMeta();
            } else {
                str2 = null;
            }
            Double c2 = c(str2);
            Video video3 = this.p.getAweme().getVideo();
            if (video3 != null) {
                str7 = video3.getMeta();
            }
            kVar = new k(str, b2, c2, b(str7), 12);
        } else if (System.currentTimeMillis() / 1000 > ((long) a(str))) {
            Video video4 = this.p.getAweme().getVideo();
            if (video4 == null || (playAddr2 = video4.getPlayAddr()) == null || (urlList2 = playAddr2.getUrlList()) == null) {
                str5 = null;
            } else {
                str5 = (String) n.j((List) urlList2);
            }
            String b3 = b(this);
            Video video5 = this.p.getAweme().getVideo();
            if (video5 != null) {
                str6 = video5.getMeta();
            } else {
                str6 = null;
            }
            Double c3 = c(str6);
            Video video6 = this.p.getAweme().getVideo();
            if (video6 != null) {
                str7 = video6.getMeta();
            }
            kVar = new k(str5, b3, c3, b(str7), 12);
        } else {
            Video video7 = this.p.getAweme().getVideo();
            if (video7 == null || (playAddr = video7.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null) {
                str3 = null;
            } else {
                str3 = (String) n.h((List) urlList);
            }
            String b4 = b(this);
            Video video8 = this.p.getAweme().getVideo();
            if (video8 != null) {
                str4 = video8.getMeta();
            } else {
                str4 = null;
            }
            Double c4 = c(str4);
            Video video9 = this.p.getAweme().getVideo();
            if (video9 != null) {
                str7 = video9.getMeta();
            }
            kVar = new k(str3, b4, c4, b(str7), 12);
        }
        this.o = kVar;
        return kVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final void a(e eVar) {
        l.d(eVar, "");
        this.o = eVar;
    }

    private static String b(c cVar) {
        l.d(cVar, "");
        return c.a.a(cVar);
    }

    private static Double b(String str) {
        if (str == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("peak")) {
            return null;
        }
        try {
            String optString = jSONObject.optString("peak");
            l.b(optString, "");
            return p.d(optString);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Double c(String str) {
        if (str == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("loudness")) {
            return null;
        }
        try {
            String optString = jSONObject.optString("loudness");
            l.b(optString, "");
            return p.d(optString);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final void a(int i2) {
        Dsp dsp = this.p.getAweme().getDsp();
        if (dsp != null) {
            dsp.setCollectStatus(Integer.valueOf(i2));
        }
        this.f83730l = i2;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.c
    public final void a(Integer num) {
        List<MusicOwnerInfo> musicOwnerInfos;
        MusicOwnerInfo musicOwnerInfo;
        Music music = this.p.getAweme().getMusic();
        if (!(music == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) n.h((List) musicOwnerInfos)) == null)) {
            musicOwnerInfo.setFollowStatus(num);
        }
        this.f83729k = num;
    }

    private static int a(String str) {
        try {
            Matcher matcher = Pattern.compile("\\/(?<value>[a-zA-Z0-9]+)(\\/video)").matcher(str);
            if (matcher.find()) {
                String group = matcher.group();
                l.b(group, "");
                return Integer.parseInt(p.a(p.a(group, "/video", "", false), "/", "", false), h.m.a.a(16));
            }
            Matcher matcher2 = Pattern.compile("(VExpiration=)(.*?)&").matcher(str);
            if (matcher2.find()) {
                String group2 = matcher2.group();
                l.b(group2, "");
                return Integer.parseInt(p.a(p.a(group2, "VExpiration=", "", false), "&", "", false));
            }
            return -1;
        } catch (Exception unused) {
        }
    }

    public a(DspStruct dspStruct) {
        String str;
        String str2;
        long j2;
        String str3;
        String str4;
        UrlModel urlModel;
        UrlModel urlModel2;
        UrlModel originCover;
        List<String> urlList;
        VideoUrlModel playAddr;
        List<String> urlList2;
        l.d(dspStruct, "");
        this.p = dspStruct;
        String aid = dspStruct.getAweme().getAid();
        this.f83719a = aid == null ? "" : aid;
        Dsp dsp = dspStruct.getAweme().getDsp();
        this.f83721c = (dsp == null || (str = dsp.getFullClipId()) == null) ? "" : str;
        this.f83722d = dspStruct;
        this.f83720b = new h();
        Video video = dspStruct.getAweme().getVideo();
        this.f83723e = (video == null || (playAddr = video.getPlayAddr()) == null || (urlList2 = playAddr.getUrlList()) == null || (str2 = (String) n.h(urlList2)) == null) ? "" : str2;
        Video video2 = dspStruct.getAweme().getVideo();
        if (video2 != null) {
            j2 = ((long) video2.getDuration()) * 1000;
        } else {
            j2 = 0;
        }
        this.f83724f = j2;
        Video video3 = dspStruct.getAweme().getVideo();
        this.f83725g = (video3 == null || (originCover = video3.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || (str3 = (String) n.h(urlList)) == null) ? "" : str3;
        Dsp dsp2 = c().getAweme().getDsp();
        if ((dsp2 == null || (str4 = dsp2.getFullClipTitle()) == null) && (str4 = c().getAweme().getDesc()) == null) {
            str4 = "";
        }
        this.f83726h = str4;
        Music music = dspStruct.getAweme().getMusic();
        this.f83727i = (music == null || (urlModel = music.getCoverMedium()) == null) ? new UrlModel() : urlModel;
        User author = dspStruct.getAweme().getAuthor();
        this.f83728j = (author == null || (urlModel2 = author.getAvatarThumb()) == null) ? new UrlModel() : urlModel2;
        this.f83730l = -1;
        this.f83731m = a(this);
        this.n = "";
    }

    private static String a(c cVar) {
        String fullClipAuthor;
        MatchedSoundInfo matchedSongInfo;
        List<MusicPerformer> performers;
        Music music = cVar.c().getAweme().getMusic();
        if (music == null || (matchedSongInfo = music.getMatchedSongInfo()) == null || (performers = matchedSongInfo.getPerformers()) == null || !(!performers.isEmpty())) {
            Dsp dsp = cVar.c().getAweme().getDsp();
            if (dsp == null || (fullClipAuthor = dsp.getFullClipAuthor()) == null) {
                return "";
            }
            return fullClipAuthor;
        }
        ArrayList arrayList = new ArrayList(n.a((Iterable) performers, 10));
        Iterator<T> it = performers.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
    }
}
