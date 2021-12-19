package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

public final class VideoCaptionUpdateParams {
    public String awemeId;
    public String captionText;
    public int code;
    public int pts;

    static {
        Covode.recordClassIndex(59467);
    }

    public static final class Builder {
        public final VideoCaptionUpdateParams mParams = new VideoCaptionUpdateParams();

        static {
            Covode.recordClassIndex(59468);
        }

        public final Builder setAwemeId(String str) {
            this.mParams.awemeId = str;
            return this;
        }

        public final Builder setCaptionText(String str) {
            this.mParams.captionText = str;
            return this;
        }

        public final Builder setCode(int i2) {
            this.mParams.code = i2;
            return this;
        }

        public final Builder setTimestamp(int i2) {
            this.mParams.pts = i2;
            return this;
        }
    }
}
