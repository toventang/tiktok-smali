package com.bytedance.geckox.settings.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.Common;
import com.google.gson.a.c;

public class SettingsRequestBody {
    @c(a = "common")
    private Common common;
    @c(a = "settings")
    private Settings settings;

    static {
        Covode.recordClassIndex(17449);
    }

    public static class Settings {
        @c(a = "env")
        private int env;
        @c(a = "version")
        private int version;

        static {
            Covode.recordClassIndex(17450);
        }

        public int getEnv() {
            return this.env;
        }

        public int getVersion() {
            return this.version;
        }

        public Settings(int i2, int i3) {
            this.version = i2;
            this.env = i3;
        }
    }

    public Common getCommon() {
        return this.common;
    }

    public Settings getSettings() {
        return this.settings;
    }

    public void setCommon(Common common2) {
        this.common = common2;
    }

    public void setSettings(Settings settings2) {
        this.settings = settings2;
    }
}
