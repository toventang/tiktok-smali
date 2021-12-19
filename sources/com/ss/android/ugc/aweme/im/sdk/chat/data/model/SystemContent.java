package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.Map;

public class SystemContent extends BaseContent {
    @c(a = "fallback_tips")
    String fallbackTips;
    @c(a = "group_tips")
    String groupNoticeTips;
    @c(a = "android_filter_max_version")
    String maxVersion;
    @c(a = "android_filter_min_version")
    String minVersion;
    @c(a = "new_template")
    Key[] newTemplate;
    @c(a = "new_tips")
    String newTips;
    @c(a = "strong_template")
    Key[] strongTemplate;
    @c(a = "strong_tips")
    String strongTips;
    @c(a = "template")
    Key[] template;
    @c(a = "tips")
    String tips;

    static {
        Covode.recordClassIndex(64083);
    }

    public static class Key implements Serializable {
        @c(a = "action")
        int action;
        @c(a = "extra")
        Map<String, String> extra;
        @c(a = "key")
        String key;
        @c(a = "link")
        String link;
        @c(a = StringSet.name)
        String name;

        static {
            Covode.recordClassIndex(64084);
        }

        public int getAction() {
            return this.action;
        }

        public Map<String, String> getExtra() {
            return this.extra;
        }

        public String getKey() {
            return this.key;
        }

        public String getLink() {
            return this.link;
        }

        public String getName() {
            return this.name;
        }

        public void setAction(int i2) {
            this.action = i2;
        }

        public void setExtra(Map<String, String> map) {
            this.extra = map;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setLink(String str) {
            this.link = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public String getFallbackTips() {
        return this.fallbackTips;
    }

    public Key[] getNewTemplate() {
        return this.newTemplate;
    }

    public String getNewTips() {
        return this.newTips;
    }

    public Key[] getStrongTemplate() {
        return this.strongTemplate;
    }

    public String getStrongTips() {
        return this.strongTips;
    }

    public Key[] getTemplate() {
        return this.template;
    }

    public String getTips() {
        return this.tips;
    }

    public long getMaxVersion() {
        return safelyReturnLong(this.maxVersion);
    }

    public long getMinVersion() {
        return safelyReturnLong(this.minVersion);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        if (TextUtils.isEmpty(this.tips)) {
            return this.tips;
        }
        String str = this.tips;
        Key[] keyArr = this.template;
        if (keyArr != null) {
            for (Key key : keyArr) {
                str = str.replace(a.a("{{%s}}", new Object[]{key.getKey()}), key.getName());
            }
        }
        return str;
    }

    public void setTemplate(Key[] keyArr) {
        this.template = keyArr;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    private long safelyReturnLong(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.im.service.m.a.a(e2);
            return 0;
        }
    }

    public static class LinkTypeExtra {
        static {
            Covode.recordClassIndex(64085);
        }

        public static boolean isSafeWarningLink(Key key) {
            if (key != null) {
                try {
                    if (key.getExtra() != null) {
                        return TextUtils.equals(key.extra.get("link_type"), "safe_warning");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return false;
        }
    }
}
