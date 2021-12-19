package com.bytedance.android.live_settings;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.l;
import java.util.List;

public final class LiveSettingModel {
    @c(a = "businessScope")
    private final ScopeValue businessScope;
    @c(a = "className")
    private final String className;
    @c(a = "defaultValue")
    private final l defaultValue;
    @c(a = "fieldTypeName")
    private final String fieldTypeName;
    @c(a = "groups")
    private final List<Group> groups;
    @c(a = "introduction")
    private final String introduction;
    @c(a = "owner")
    private final String owner;
    private Object serverValue;
    @c(a = "settingsKey")
    private final String settingsKey;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(7356);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.live_settings.LiveSettingModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveSettingModel copy$default(LiveSettingModel liveSettingModel, String str, ScopeValue scopeValue, String str2, String str3, l lVar, String str4, String str5, String str6, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveSettingModel.className;
        }
        if ((i2 & 2) != 0) {
            scopeValue = liveSettingModel.businessScope;
        }
        if ((i2 & 4) != 0) {
            str2 = liveSettingModel.fieldTypeName;
        }
        if ((i2 & 8) != 0) {
            str3 = liveSettingModel.settingsKey;
        }
        if ((i2 & 16) != 0) {
            lVar = liveSettingModel.defaultValue;
        }
        if ((i2 & 32) != 0) {
            str4 = liveSettingModel.introduction;
        }
        if ((i2 & 64) != 0) {
            str5 = liveSettingModel.owner;
        }
        if ((i2 & 128) != 0) {
            str6 = liveSettingModel.title;
        }
        if ((i2 & 256) != 0) {
            list = liveSettingModel.groups;
        }
        return liveSettingModel.copy(str, scopeValue, str2, str3, lVar, str4, str5, str6, list);
    }

    public final String component1() {
        return this.className;
    }

    public final ScopeValue component2() {
        return this.businessScope;
    }

    public final String component3() {
        return this.fieldTypeName;
    }

    public final String component4() {
        return this.settingsKey;
    }

    public final l component5() {
        return this.defaultValue;
    }

    public final String component6() {
        return this.introduction;
    }

    public final String component7() {
        return this.owner;
    }

    public final String component8() {
        return this.title;
    }

    public final List<Group> component9() {
        return this.groups;
    }

    public final LiveSettingModel copy(String str, ScopeValue scopeValue, String str2, String str3, l lVar, String str4, String str5, String str6, List<Group> list) {
        h.f.b.l.c(scopeValue, "");
        h.f.b.l.c(str2, "");
        h.f.b.l.c(str3, "");
        h.f.b.l.c(str5, "");
        h.f.b.l.c(list, "");
        return new LiveSettingModel(str, scopeValue, str2, str3, lVar, str4, str5, str6, list);
    }

    public final String toString() {
        return "LiveSettingModel(className=" + this.className + ", businessScope=" + this.businessScope + ", fieldTypeName=" + this.fieldTypeName + ", settingsKey=" + this.settingsKey + ", defaultValue=" + this.defaultValue + ", introduction=" + this.introduction + ", owner=" + this.owner + ", title=" + this.title + ", groups=" + this.groups + ")";
    }

    public final ScopeValue getBusinessScope() {
        return this.businessScope;
    }

    public final String getClassName() {
        return this.className;
    }

    public final l getDefaultValue() {
        return this.defaultValue;
    }

    public final String getFieldTypeName() {
        return this.fieldTypeName;
    }

    public final List<Group> getGroups() {
        return this.groups;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final Object getServerValue() {
        return this.serverValue;
    }

    public final String getSettingsKey() {
        return this.settingsKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.settingsKey.hashCode();
    }

    public final void setServerValue(Object obj) {
        this.serverValue = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!h.f.b.l.a(getClass(), obj.getClass()))) {
            return false;
        }
        return h.f.b.l.a((Object) this.settingsKey, (Object) ((LiveSettingModel) obj).settingsKey);
    }

    public LiveSettingModel(String str, ScopeValue scopeValue, String str2, String str3, l lVar, String str4, String str5, String str6, List<Group> list) {
        h.f.b.l.c(scopeValue, "");
        h.f.b.l.c(str2, "");
        h.f.b.l.c(str3, "");
        h.f.b.l.c(str5, "");
        h.f.b.l.c(list, "");
        this.className = str;
        this.businessScope = scopeValue;
        this.fieldTypeName = str2;
        this.settingsKey = str3;
        this.defaultValue = lVar;
        this.introduction = str4;
        this.owner = str5;
        this.title = str6;
        this.groups = list;
    }
}
