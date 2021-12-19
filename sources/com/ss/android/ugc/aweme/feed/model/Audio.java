package com.ss.android.ugc.aweme.feed.model;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.playerkit.simapicommon.a.d;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class Audio implements Serializable {
    public static final Companion Companion = new Companion(null);
    @c(a = "CdnUrlExpired")
    public long CdnUrlExpired;
    @c(a = "TtsInfos")
    public List<TtsInfos> TtsInfos;

    static {
        Covode.recordClassIndex(59305);
    }

    public Audio() {
    }

    public static int com_ss_android_ugc_aweme_feed_model_Audio_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static final List<d> convertToSimAudio(Video video, Audio audio) {
        return Companion.convertToSimAudio(video, audio);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.Audio */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Audio copy$default(Audio audio, long j2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = audio.CdnUrlExpired;
        }
        if ((i2 & 2) != 0) {
            list = audio.TtsInfos;
        }
        return audio.copy(j2, list);
    }

    public final long component1() {
        return this.CdnUrlExpired;
    }

    public final List<TtsInfos> component2() {
        return this.TtsInfos;
    }

    public final Audio copy(long j2, List<TtsInfos> list) {
        l.d(list, "");
        return new Audio(j2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Audio)) {
            return false;
        }
        Audio audio = (Audio) obj;
        return this.CdnUrlExpired == audio.CdnUrlExpired && l.a(this.TtsInfos, audio.TtsInfos);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_Audio_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_feed_model_Audio_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.CdnUrlExpired) * 31;
        List<TtsInfos> list = this.TtsInfos;
        return com_ss_android_ugc_aweme_feed_model_Audio_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Audio(CdnUrlExpired=" + this.CdnUrlExpired + ", TtsInfos=" + this.TtsInfos + ")";
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59306);
        }

        public static int com_ss_android_ugc_aweme_feed_model_Audio$Companion_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
            return 0;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final List<d> convertToSimAudio(Video video, Audio audio) {
            List<TtsInfos> ttsInfos;
            T t;
            Object obj;
            List<String> urlList;
            String fileCS;
            String urlKey;
            String urlKey2;
            List<String> urlList2;
            BitRate bitRate;
            l.d(video, "");
            ArrayList arrayList = new ArrayList();
            if (!(audio == null || (ttsInfos = audio.getTtsInfos()) == null)) {
                Iterator<T> it = ttsInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (l.a((Object) t.getVoiceType(), (Object) "2")) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null || t2.getPlayAddress() == null) {
                    return null;
                }
                if (l.a((Object) t2.getVoiceType(), (Object) "2")) {
                    d.a aVar = new d.a();
                    String voiceType = t2.getVoiceType();
                    if (voiceType != null) {
                        aVar.f148873a.setVoiceType(voiceType);
                    }
                    List<BitRate> bitRate2 = video.getBitRate();
                    if (!(bitRate2 == null || (bitRate = (BitRate) n.h((List) bitRate2)) == null)) {
                        aVar.f148873a.setBitRate(Integer.valueOf(bitRate.getBitRate()));
                    }
                    String lang = t2.getLang();
                    if (lang != null) {
                        aVar.f148873a.setLang(lang);
                    }
                    PlayAddress playAddress = t2.getPlayAddress();
                    if (!(playAddress == null || (urlList2 = playAddress.getUrlList()) == null)) {
                        aVar.a(urlList2);
                    }
                    PlayAddress playAddress2 = t2.getPlayAddress();
                    if (!(playAddress2 == null || (urlKey2 = playAddress2.getUrlKey()) == null)) {
                        aVar.f148873a.setFileKey(urlKey2);
                    }
                    PlayAddress playAddress3 = t2.getPlayAddress();
                    if (!(playAddress3 == null || (urlKey = playAddress3.getUrlKey()) == null)) {
                        aVar.f148873a.urlKey = urlKey;
                    }
                    aVar.f148873a.setCdnUrlExpired(Long.valueOf(audio.getCdnUrlExpired()));
                    PlayAddress playAddress4 = t2.getPlayAddress();
                    if (!(playAddress4 == null || (fileCS = playAddress4.getFileCS()) == null)) {
                        aVar.a(fileCS);
                    }
                    aVar.f148873a.setInfoId(Integer.valueOf(InfoIdType.TRANSLATED.getInfoId()));
                    try {
                        aVar.f148873a.setLoudness(Float.valueOf((float) new JSONObject(t2.getVolumeInfo()).getDouble("Loudness")));
                    } catch (JSONException unused) {
                        com_ss_android_ugc_aweme_feed_model_Audio$Companion_com_ss_android_ugc_aweme_lancet_LogLancet_d("Audio.kt", "Loudness Exception");
                    }
                    try {
                        aVar.f148873a.setPeak(Float.valueOf((float) new JSONObject(t2.getVolumeInfo()).getDouble("Peak")));
                    } catch (JSONException unused2) {
                        com_ss_android_ugc_aweme_feed_model_Audio$Companion_com_ss_android_ugc_aweme_lancet_LogLancet_d("Audio.kt", "Peak Exception");
                    }
                    aVar.f148873a.setCreateTime(SystemClock.elapsedRealtime());
                    arrayList.add(aVar.f148873a);
                }
                VideoUrlModel videoUrlModel = video.playAddr;
                if (videoUrlModel == null || (urlList = videoUrlModel.getUrlList()) == null) {
                    obj = null;
                } else {
                    obj = n.h((List) urlList);
                }
                if (obj == null) {
                    return null;
                }
                return arrayList;
            }
            return null;
        }
    }

    public enum InfoIdType {
        ORIGINAL(1),
        TRANSLATED(2);
        
        private final int infoId;

        public final int getInfoId() {
            return this.infoId;
        }

        static {
            Covode.recordClassIndex(59307);
        }

        private InfoIdType(int i2) {
            this.infoId = i2;
        }
    }

    public final long getCdnUrlExpired() {
        return this.CdnUrlExpired;
    }

    public final List<TtsInfos> getTtsInfos() {
        return this.TtsInfos;
    }

    public Audio(long j2, List<TtsInfos> list) {
        l.d(list, "");
        this.CdnUrlExpired = j2;
        this.TtsInfos = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Audio(long j2, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? -1 : j2, list);
    }
}
