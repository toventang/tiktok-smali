package com.ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;

public class LiveInfo {
    public int mixType;

    static {
        Covode.recordClassIndex(100976);
    }

    public int getMixType() {
        return this.mixType;
    }

    public static class Builder {
        public int mixType;

        static {
            Covode.recordClassIndex(100977);
        }

        /* access modifiers changed from: package-private */
        public LiveInfo build() {
            return new LiveInfo(this);
        }

        public Builder setMixType(int i2) {
            this.mixType = i2;
            return this;
        }
    }

    public String toString() {
        return "LiveInfo{mixType=" + this.mixType + '}';
    }

    public void setMixType(int i2) {
        this.mixType = i2;
    }

    public class LiveInfoBuilder {
        public int mixType;

        static {
            Covode.recordClassIndex(100978);
        }

        public LiveInfoBuilder() {
        }
    }

    public LiveInfo(int i2) {
        this.mixType = i2;
    }

    public LiveInfo(Builder builder) {
        this.mixType = builder.mixType;
    }
}
