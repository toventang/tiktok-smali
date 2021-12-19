package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class PublisherConfiguration {
    private JSONObject mJsonObject;

    /* renamed from: com.ss.bytertc.engine.PublisherConfiguration$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(100781);
        }
    }

    static {
        Covode.recordClassIndex(100780);
    }

    public PublisherConfiguration() {
    }

    public static class Builder {
        public PublisherParameters params = new PublisherParameters();

        static {
            Covode.recordClassIndex(100782);
        }

        public PublisherConfiguration build() {
            return new PublisherConfiguration(this, null);
        }

        public Builder audioChannels(int i2) {
            this.params.audiochannels = i2;
            return this;
        }

        public Builder audioKBitrate(int i2) {
            this.params.audioKBitrate = i2 / 1000;
            return this;
        }

        public Builder audioSampleRate(int i2) {
            this.params.audiosamplerate = i2;
            return this;
        }

        public Builder defaultLayout(int i2) {
            this.params.defaultLayout = i2;
            return this;
        }

        public Builder extraInfo(String str) {
            this.params.extraInfo = str;
            return this;
        }

        public Builder frameRate(int i2) {
            this.params.framerate = i2;
            return this;
        }

        public Builder kBitRate(int i2) {
            this.params.kBitrate = i2;
            return this;
        }

        public Builder liftCycle(int i2) {
            this.params.lifecycle = i2;
            return this;
        }

        public Builder owner(boolean z) {
            this.params.owner = z;
            return this;
        }

        public Builder publishUrl(String str) {
            this.params.mosaicStream = str;
            return this;
        }

        public Builder size(int i2, int i3) {
            this.params.width = i2;
            this.params.height = i3;
            return this;
        }
    }

    public boolean validate() {
        if (this.mJsonObject != null) {
            return true;
        }
        return false;
    }

    public String toJsonString() {
        if (validate()) {
            return this.mJsonObject.toString();
        }
        return null;
    }

    private PublisherConfiguration(Builder builder) {
        try {
            JSONObject jSONObject = new JSONObject();
            this.mJsonObject = jSONObject;
            jSONObject.put("owner", builder.params.owner);
            this.mJsonObject.put("lifecycle", builder.params.lifecycle);
            this.mJsonObject.put("defaultLayout", builder.params.defaultLayout);
            this.mJsonObject.put("width", builder.params.width);
            this.mJsonObject.put("height", builder.params.height);
            this.mJsonObject.put("framerate", builder.params.framerate);
            this.mJsonObject.put("bitrate", builder.params.kBitrate);
            this.mJsonObject.put("mosaicStream", builder.params.mosaicStream);
            this.mJsonObject.put("extraInfo", builder.params.extraInfo);
            this.mJsonObject.put("audiosamplerate", builder.params.audiosamplerate);
            this.mJsonObject.put("audiobitrate", builder.params.audioKBitrate * 1000);
            this.mJsonObject.put("audiochannels", builder.params.audiochannels);
        } catch (JSONException unused) {
            this.mJsonObject = null;
            LogUtil.w("PublisherConfiguration", "failed to create PublisherConfiguration");
        }
    }

    /* synthetic */ PublisherConfiguration(Builder builder, AnonymousClass1 r2) {
        this(builder);
    }
}
