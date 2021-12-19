package com.ss.bytertc.engine.live;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveTranscoding {
    private String action = "";
    private JSONObject advancedConfig;
    private AudioConfig audio;
    private JSONObject authInfo;
    private Layout layout;
    private int mixType;
    private String url;
    private VideoConfig video;

    public static class Layout {
        public String appData;
        public String backgroundColor;
        public Region[] regions;

        static {
            Covode.recordClassIndex(100969);
        }

        public static class Region {
            public double alpha;
            public int contentControl;

            /* renamed from: h  reason: collision with root package name */
            public double f151639h;
            public boolean localUser;
            public int renderMode;
            public String uid;
            public double w;
            public double x;
            public double y;
            public int zorder;

            static {
                Covode.recordClassIndex(100971);
            }

            public boolean isLocalUser() {
                return this.localUser;
            }

            public Region alpha(double d2) {
                this.alpha = d2;
                return this;
            }

            public Region contentControl(int i2) {
                this.contentControl = i2;
                return this;
            }

            public Region renderMode(int i2) {
                this.renderMode = i2;
                return this;
            }

            public Region setLocalUser(boolean z) {
                this.localUser = z;
                return this;
            }

            public Region uid(String str) {
                this.uid = str;
                return this;
            }

            public Region zorder(int i2) {
                this.zorder = i2;
                return this;
            }

            public Region position(double d2, double d3) {
                this.x = d2;
                this.y = d3;
                return this;
            }

            public Region size(double d2, double d3) {
                this.w = d2;
                this.f151639h = d3;
                return this;
            }
        }

        public String getAppData() {
            return this.appData;
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public Region[] getRegions() {
            return this.regions;
        }

        public static class Builder {
            private String appData = "";
            private String backgroundColor = "#000000";
            private ArrayList<Region> regions;

            static {
                Covode.recordClassIndex(100970);
            }

            public Layout builder() {
                Layout layout = new Layout();
                ArrayList<Region> arrayList = this.regions;
                if (arrayList != null) {
                    layout.regions = (Region[]) arrayList.toArray(new Region[arrayList.size()]);
                }
                layout.appData = this.appData;
                layout.backgroundColor = this.backgroundColor;
                return layout;
            }

            public Builder appData(String str) {
                this.appData = str;
                return this;
            }

            public Builder backgroundColor(String str) {
                this.backgroundColor = str;
                return this;
            }

            public Builder addRegoin(Region region) {
                if (this.regions == null) {
                    this.regions = new ArrayList<>();
                }
                this.regions.add(region);
                return this;
            }
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Object jSONObject2 = new JSONObject();
            try {
                Region[] regionArr = this.regions;
                if (regionArr != null) {
                    for (Region region : regionArr) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("uid", region.uid);
                        jSONObject3.put("x", region.x);
                        jSONObject3.put("y", region.y);
                        jSONObject3.put("w", region.w);
                        jSONObject3.put("h", region.f151639h);
                        jSONObject3.put("zorder", region.zorder);
                        jSONObject3.put("alpha", region.alpha);
                        jSONObject3.put("contentControl", region.contentControl);
                        jSONObject3.put("renderMode", region.renderMode);
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject.put("canvas", jSONObject2);
                jSONObject.put("regions", jSONArray);
                jSONObject.put("app_data", this.appData);
                return jSONObject.toString();
            } catch (JSONException e2) {
                LogUtil.w("LiveTranscoding", "create layout json message happen exception", e2);
                return null;
            }
        }

        public void setAppData(String str) {
            this.appData = str;
        }

        public void setBackgroundColor(String str) {
            this.backgroundColor = str;
        }

        public void setRegions(Region[] regionArr) {
            this.regions = regionArr;
        }
    }

    public static class VideoConfig {
        public int bitRate = 500000;
        public String codec = "H264";
        public int fps = 30;
        public int gop = 60;
        public int height = 640;
        public boolean lowLatency = true;
        public int width = 360;

        static {
            Covode.recordClassIndex(100972);
        }

        public enum VideoCodecType {
            VIDEO_CODEC_TYPE_H264("H264"),
            VIDEO_CODEC_TYPE_BYTEVC1("ByteVC1");
            
            private String videoCodecType = "H264";

            public final String getValue() {
                return this.videoCodecType;
            }

            static {
                Covode.recordClassIndex(100973);
            }

            private VideoCodecType(String str) {
                this.videoCodecType = str;
            }
        }

        public VideoConfig setCodec(String str) {
            this.codec = str;
            return this;
        }

        public VideoConfig setFps(int i2) {
            this.fps = i2;
            return this;
        }

        public VideoConfig setGop(int i2) {
            this.gop = i2;
            return this;
        }

        public VideoConfig setHeight(int i2) {
            this.height = i2;
            return this;
        }

        public VideoConfig setLowLatency(boolean z) {
            this.lowLatency = z;
            return this;
        }

        public VideoConfig setWidth(int i2) {
            this.width = i2;
            return this;
        }

        public VideoConfig setKBitRate(int i2) {
            this.bitRate = i2 * 1000;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(100966);
    }

    public enum AACProfile {
        AAC_PROFILE_LC("LC"),
        AAC_PROFILE_MAIN("MAIN"),
        AAC_PROFILE_HEV1("HEv1"),
        AAC_PROFILE_HEV2("HEv2");
        
        private String AacProfile = "LC";

        public final String getValue() {
            return this.AacProfile;
        }

        static {
            Covode.recordClassIndex(100967);
        }

        private AACProfile(String str) {
            this.AacProfile = str;
        }
    }

    public AudioConfig getAudio() {
        return this.audio;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public int getMixType() {
        return this.mixType;
    }

    public String getUrl() {
        return this.url;
    }

    public VideoConfig getVideo() {
        return this.video;
    }

    public static LiveTranscoding getDefualtLiveTranscode() {
        VideoConfig videoConfig = new VideoConfig();
        videoConfig.setCodec("H264").setFps(30).setGop(60).setKBitRate(500).setHeight(640).setWidth(360).setLowLatency(true);
        AudioConfig audioConfig = new AudioConfig();
        audioConfig.setCodec("AAC").setSampleRate(44100).setChannels(1).setKBitRate(16).setAacProfile(AACProfile.AAC_PROFILE_LC);
        Layout.Builder builder = new Layout.Builder();
        builder.backgroundColor("#000000").appData("");
        LiveTranscoding liveTranscoding = new LiveTranscoding();
        liveTranscoding.setAudio(audioConfig);
        liveTranscoding.setVideo(videoConfig);
        liveTranscoding.setLayout(builder.builder());
        liveTranscoding.setUrl(null);
        return liveTranscoding;
    }

    public JSONObject getTranscodeMessage() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        try {
            jSONObject.put("codec", this.video.codec);
            jSONObject.put("fps", this.video.fps);
            jSONObject.put("gop", this.video.gop);
            jSONObject.put("lowLatency", this.video.lowLatency);
            jSONObject.put("bitRate", this.video.bitRate);
            jSONObject.put("width", this.video.width);
            jSONObject.put("height", this.video.height);
            jSONObject2.put("codec", this.audio.codec);
            jSONObject2.put("bitRate", this.audio.bitRate);
            jSONObject2.put("sampleRate", this.audio.sampleRate);
            jSONObject2.put("channels", this.audio.channels);
            jSONObject2.put("profile", this.audio.aacProfile);
            jSONObject4.put("bgnd", this.layout.backgroundColor);
            if (this.layout.regions != null) {
                Layout.Region[] regionArr = this.layout.regions;
                for (Layout.Region region : regionArr) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("uid", region.uid);
                    jSONObject8.put("x", region.x);
                    jSONObject8.put("y", region.y);
                    jSONObject8.put("w", region.w);
                    jSONObject8.put("h", region.f151639h);
                    jSONObject8.put("zorder", region.zorder);
                    jSONObject8.put("alpha", region.alpha);
                    jSONObject8.put("contentControl", region.contentControl);
                    jSONObject8.put("renderMode", region.renderMode);
                    jSONObject8.put("local_user", region.localUser);
                    jSONArray.put(jSONObject8);
                }
            }
            jSONObject3.put("canvas", jSONObject4);
            jSONObject3.put("regions", jSONArray);
            jSONObject3.put("app_data", this.layout.appData);
            jSONObject5.put("url", this.url);
            jSONObject6.put("transcode", jSONObject5);
            jSONObject6.put("video", jSONObject);
            jSONObject6.put(DataType.AUDIO, jSONObject2);
            jSONObject6.put("layout", jSONObject3);
            jSONObject6.put("advancedConfig", this.advancedConfig);
            Object obj = this.authInfo;
            if (obj != null) {
                jSONObject6.put("authInfo", obj);
            }
            jSONObject7.put("mixingType", this.mixType);
            jSONObject7.put(StringSet.type, "transcode");
            jSONObject7.put("action", this.action);
            jSONObject7.put("transcodeMeta", jSONObject6);
            return jSONObject7;
        } catch (JSONException e2) {
            LogUtil.w("LiveTranscoding", "get json message happen exception", e2);
            return null;
        }
    }

    public static class AudioConfig {
        public String aacProfile = AACProfile.AAC_PROFILE_LC.getValue();
        public int bitRate = 16000;
        public int channels = 1;
        public String codec = "AAC";
        public int sampleRate = 44100;

        static {
            Covode.recordClassIndex(100968);
        }

        public AudioConfig setChannels(int i2) {
            this.channels = i2;
            return this;
        }

        public AudioConfig setCodec(String str) {
            this.codec = str;
            return this;
        }

        public AudioConfig setSampleRate(int i2) {
            this.sampleRate = i2;
            return this;
        }

        public AudioConfig setAacProfile(AACProfile aACProfile) {
            this.aacProfile = aACProfile.getValue();
            return this;
        }

        public AudioConfig setKBitRate(int i2) {
            this.bitRate = i2 * 1000;
            return this;
        }
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setAdvancedConfig(JSONObject jSONObject) {
        this.advancedConfig = jSONObject;
    }

    public void setAudio(AudioConfig audioConfig) {
        this.audio = audioConfig;
    }

    public void setAuthInfo(JSONObject jSONObject) {
        this.authInfo = jSONObject;
    }

    public void setLayout(Layout layout2) {
        this.layout = layout2;
    }

    public void setMixType(int i2) {
        this.mixType = i2;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVideo(VideoConfig videoConfig) {
        this.video = videoConfig;
    }
}
