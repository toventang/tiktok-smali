package com.kakao.util.helper.log;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LoggerConfig {
    public Tag defaultTag;
    public Set<String> ignoreStackSet;
    public int printLoggerLevel;
    public String stackPrefix;

    static {
        Covode.recordClassIndex(34490);
    }

    public static String toSimpleStringLogLevel(int i2) {
        if (i2 == 0) {
            return "DEV";
        }
        switch (i2) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "W";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "E";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "A";
            default:
                return "NONE";
        }
    }

    public Tag getDefaultTag() {
        return this.defaultTag;
    }

    private String getTraceInfo() {
        return getTraceInfo(Thread.currentThread().getStackTrace());
    }

    public static class Builder {
        private Tag defaultTag = Tag.DEFAULT;
        private Set<String> ignoreStackSet = new HashSet();
        private int printLoggerLevel;
        private String stackPrefix;

        static {
            Covode.recordClassIndex(34491);
        }

        public LoggerConfig build() {
            LoggerConfig loggerConfig = new LoggerConfig();
            loggerConfig.defaultTag = this.defaultTag;
            loggerConfig.printLoggerLevel = this.printLoggerLevel;
            loggerConfig.stackPrefix = this.stackPrefix;
            loggerConfig.ignoreStackSet = this.ignoreStackSet;
            return loggerConfig;
        }

        public Builder setDefaultTag(Tag tag) {
            this.defaultTag = tag;
            return this;
        }

        public Builder setPrintLoggerLevel(int i2) {
            this.printLoggerLevel = i2;
            return this;
        }

        public Builder setStackPrefix(String str) {
            this.stackPrefix = str;
            return this;
        }

        public Builder setIgnoreSet(Set<String> set) {
            if (set == null) {
                return this;
            }
            this.ignoreStackSet = set;
            return this;
        }
    }

    public boolean isPrintLoggable(int i2) {
        if (i2 >= this.printLoggerLevel) {
            return true;
        }
        return false;
    }

    private String getMessageWithTrace(String str) {
        String traceInfo = getTraceInfo();
        Object[] objArr = new Object[2];
        if (traceInfo == null) {
            traceInfo = "";
        }
        objArr[0] = traceInfo;
        objArr[1] = str;
        return a.a("%s %s", objArr);
    }

    private String getTraceInfo(StackTraceElement[] stackTraceElementArr) {
        String str;
        String canonicalName = getClass().getCanonicalName();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            if (!this.ignoreStackSet.contains(className) && !className.startsWith(canonicalName) && ((str = this.stackPrefix) == null || className.startsWith(str))) {
                return a.a(Locale.getDefault(), "[%s:%s():%d]", new Object[]{stackTraceElement.getFileName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())});
            }
        }
        return null;
    }

    public String getMessage(boolean z, String str) {
        if (z) {
            return getMessageWithTrace(str);
        }
        return str;
    }
}
