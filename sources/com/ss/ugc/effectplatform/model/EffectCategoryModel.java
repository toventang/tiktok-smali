package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public class EffectCategoryModel {
    private List<String> effects;
    private String extra;
    private UrlModel icon;
    private UrlModel icon_selected;
    private String id;
    private boolean is_default;
    private String key;
    private String name;
    private List<String> tags;
    private String tags_updated_at;

    static {
        Covode.recordClassIndex(102449);
    }

    public EffectCategoryModel() {
        this(null, null, null, null, null, null, null, null, false, null, 1023, null);
    }

    public List<String> getEffects() {
        return this.effects;
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public UrlModel getIcon_selected() {
        return this.icon_selected;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public boolean is_default() {
        return this.is_default;
    }

    public final boolean checkValued() {
        if (getIcon() == null) {
            setIcon(new UrlModel(null, null, 3, null));
        }
        if (getIcon() == null) {
            return false;
        }
        if (getIcon_selected() == null) {
            setIcon_selected(new UrlModel(null, null, 3, null));
        }
        if (getIcon_selected() != null && !l.a((Object) getId(), (Object) "")) {
            return true;
        }
        return false;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setIcon_selected(UrlModel urlModel) {
        this.icon_selected = urlModel;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void set_default(boolean z) {
        this.is_default = z;
    }

    public void setEffects(List<String> list) {
        l.c(list, "");
        this.effects = list;
    }

    public void setId(String str) {
        l.c(str, "");
        this.id = str;
    }

    public void setKey(String str) {
        l.c(str, "");
        this.key = str;
    }

    public void setName(String str) {
        l.c(str, "");
        this.name = str;
    }

    public void setTags(List<String> list) {
        l.c(list, "");
        this.tags = list;
    }

    public EffectCategoryModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List<String> list, List<String> list2, String str4, boolean z, String str5) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(list, "");
        l.c(list2, "");
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.icon = urlModel;
        this.icon_selected = urlModel2;
        this.effects = list;
        this.tags = list2;
        this.tags_updated_at = str4;
        this.is_default = z;
        this.extra = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EffectCategoryModel(java.lang.String r13, java.lang.String r14, java.lang.String r15, com.ss.ugc.effectplatform.model.UrlModel r16, com.ss.ugc.effectplatform.model.UrlModel r17, java.util.List r18, java.util.List r19, java.lang.String r20, boolean r21, java.lang.String r22, int r23, h.f.b.g r24) {
        /*
            r12 = this;
            r10 = r21
            r9 = r20
            r8 = r19
            r7 = r18
            r2 = r13
            r3 = r14
            r1 = r23
            r5 = r16
            r6 = r17
            r0 = r1 & 1
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x0017
            r2 = r4
        L_0x0017:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x001c
            r3 = r4
        L_0x001c:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0053
        L_0x0020:
            r0 = r1 & 8
            r11 = 0
            if (r0 == 0) goto L_0x0026
            r5 = r11
        L_0x0026:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x002b
            r6 = r11
        L_0x002b:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0034
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0034:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x003d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x003d:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0042
            r9 = r11
        L_0x0042:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0047
            r10 = 0
        L_0x0047:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0050
        L_0x004b:
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0050:
            r11 = r22
            goto L_0x004b
        L_0x0053:
            r4 = r15
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.EffectCategoryModel.<init>(java.lang.String, java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.UrlModel, com.ss.ugc.effectplatform.model.UrlModel, java.util.List, java.util.List, java.lang.String, boolean, java.lang.String, int, h.f.b.g):void");
    }
}
