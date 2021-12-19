package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public class LiveCoreSDKData {
    @c(a = "pull_data")
    PullData pullData;

    public static class Quality {
        @c(a = StringSet.name)
        public String name;
        @c(a = "sdk_key")
        public String sdkKey;

        static {
            Covode.recordClassIndex(13655);
        }
    }

    static {
        Covode.recordClassIndex(13652);
    }

    public static class Options {
        @c(a = "default_preview_quality")
        Quality defaultPreviewQuality;
        @c(a = "default_quality")
        Quality defaultQuality;
        @c(a = "qualities")
        List<Quality> qualityList;

        static {
            Covode.recordClassIndex(13653);
        }

        public Quality getDefaultQuality() {
            return this.defaultQuality;
        }

        public List<Quality> getQualityList() {
            return this.qualityList;
        }

        public void setDefaultQuality(Quality quality) {
            this.defaultQuality = quality;
        }

        public void setQualityList(List<Quality> list) {
            this.qualityList = list;
        }
    }

    public static class PullData {
        @c(a = "options")
        Options options;
        @c(a = "stream_data")
        String streamData;

        static {
            Covode.recordClassIndex(13654);
        }

        public Options getOptions() {
            return this.options;
        }

        public String getStreamData() {
            return this.streamData;
        }

        public void setOptions(Options options2) {
            this.options = options2;
        }

        public void setStreamData(String str) {
            this.streamData = str;
        }
    }

    public PullData getPullData() {
        return this.pullData;
    }

    public Quality getDefaultQuality() {
        PullData pullData2 = this.pullData;
        if (pullData2 == null || pullData2.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().defaultQuality;
    }

    public List<Quality> getQualityList() {
        PullData pullData2 = this.pullData;
        if (pullData2 == null || pullData2.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().getQualityList();
    }

    public void setPullData(PullData pullData2) {
        this.pullData = pullData2;
    }
}
