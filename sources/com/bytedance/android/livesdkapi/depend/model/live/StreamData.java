package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class StreamData {
    @c(a = "data")
    StreamDataContent data;

    public static class StreamDataContent {
        @c(a = "origin")
        StreamDataOrigin defaultQuality;

        static {
            Covode.recordClassIndex(13661);
        }
    }

    public static class StreamDataOrigin {
        @c(a = "main")
        StreamDataOriginMain main;

        static {
            Covode.recordClassIndex(13662);
        }
    }

    public static class StreamDataOriginMain {
        @c(a = "sdk_params")
        String sdkParams;

        static {
            Covode.recordClassIndex(13663);
        }
    }

    static {
        Covode.recordClassIndex(13660);
    }

    public static class StreamDataOriginMainSDKParams {
        @c(a = "resolution")
        String resolution;

        static {
            Covode.recordClassIndex(13664);
        }

        public int getHeight() {
            if (TextUtils.isEmpty(this.resolution)) {
                return 0;
            }
            String[] split = TextUtils.split(this.resolution, "x");
            if (split.length > 0) {
                return Integer.parseInt(split[split.length - 1]);
            }
            return 0;
        }

        public int getWidth() {
            if (!TextUtils.isEmpty(this.resolution)) {
                String[] split = TextUtils.split(this.resolution, "x");
                if (split.length > 0) {
                    return Integer.parseInt(split[0]);
                }
            }
            return 0;
        }
    }

    public String getStreamDataOriginMain() {
        StreamDataContent streamDataContent = this.data;
        if (streamDataContent == null || streamDataContent.defaultQuality == null || this.data.defaultQuality.main == null || this.data.defaultQuality.main.sdkParams == null) {
            return null;
        }
        return this.data.defaultQuality.main.sdkParams;
    }
}
