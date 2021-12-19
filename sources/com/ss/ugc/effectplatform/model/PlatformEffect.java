package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class PlatformEffect {
    private String file_uri;
    private String hint;
    private String hint_uri;
    private String icon_uri;
    private String name;
    private List<String> requirements;
    private List<String> types;

    static {
        Covode.recordClassIndex(102459);
    }

    public PlatformEffect() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.PlatformEffect */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformEffect copy$default(PlatformEffect platformEffect, String str, String str2, String str3, String str4, List list, String str5, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = platformEffect.name;
        }
        if ((i2 & 2) != 0) {
            str2 = platformEffect.hint;
        }
        if ((i2 & 4) != 0) {
            str3 = platformEffect.file_uri;
        }
        if ((i2 & 8) != 0) {
            str4 = platformEffect.icon_uri;
        }
        if ((i2 & 16) != 0) {
            list = platformEffect.types;
        }
        if ((i2 & 32) != 0) {
            str5 = platformEffect.hint_uri;
        }
        if ((i2 & 64) != 0) {
            list2 = platformEffect.requirements;
        }
        return platformEffect.copy(str, str2, str3, str4, list, str5, list2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.hint;
    }

    public final String component3() {
        return this.file_uri;
    }

    public final String component4() {
        return this.icon_uri;
    }

    public final List<String> component5() {
        return this.types;
    }

    public final String component6() {
        return this.hint_uri;
    }

    public final List<String> component7() {
        return this.requirements;
    }

    public final PlatformEffect copy(String str, String str2, String str3, String str4, List<String> list, String str5, List<String> list2) {
        l.c(str3, "");
        l.c(str4, "");
        l.c(str5, "");
        return new PlatformEffect(str, str2, str3, str4, list, str5, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformEffect)) {
            return false;
        }
        PlatformEffect platformEffect = (PlatformEffect) obj;
        return l.a(this.name, platformEffect.name) && l.a(this.hint, platformEffect.hint) && l.a(this.file_uri, platformEffect.file_uri) && l.a(this.icon_uri, platformEffect.icon_uri) && l.a(this.types, platformEffect.types) && l.a(this.hint_uri, platformEffect.hint_uri) && l.a(this.requirements, platformEffect.requirements);
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hint;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.file_uri;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.icon_uri;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.types;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.hint_uri;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list2 = this.requirements;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "PlatformEffect(name=" + this.name + ", hint=" + this.hint + ", file_uri=" + this.file_uri + ", icon_uri=" + this.icon_uri + ", types=" + this.types + ", hint_uri=" + this.hint_uri + ", requirements=" + this.requirements + ")";
    }

    public final String getFile_uri() {
        return this.file_uri;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getHint_uri() {
        return this.hint_uri;
    }

    public final String getIcon_uri() {
        return this.icon_uri;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getRequirements() {
        return this.requirements;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final void setHint(String str) {
        this.hint = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public final void setFile_uri(String str) {
        l.c(str, "");
        this.file_uri = str;
    }

    public final void setHint_uri(String str) {
        l.c(str, "");
        this.hint_uri = str;
    }

    public final void setIcon_uri(String str) {
        l.c(str, "");
        this.icon_uri = str;
    }

    public final Effect toEffect(List<String> list) {
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 524287, null);
        String str = this.name;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        effect.setName(str);
        String str3 = this.hint;
        if (str3 == null) {
            str3 = str2;
        }
        effect.setHint(str3);
        effect.setFile_url(concatPrefixWithUri(list, this.file_uri));
        List<String> list2 = this.types;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        effect.setTypes(list2);
        effect.setHint_icon(concatPrefixWithUri(list, this.hint_uri));
        effect.setIcon_url(concatPrefixWithUri(list, this.icon_uri));
        List<String> list3 = this.requirements;
        if (list3 == null) {
            list3 = new ArrayList<>();
        }
        effect.setRequirements(list3);
        String str4 = this.file_uri;
        if (str4 != null) {
            str2 = str4;
        }
        effect.setId(str2);
        return effect;
    }

    private final UrlModel concatPrefixWithUri(List<String> list, String str) {
        UrlModel urlModel = new UrlModel(null, null, 3, null);
        urlModel.setUri(str);
        if (list == null) {
            return urlModel;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list.get(i2) + str);
        }
        urlModel.setUrl_list(arrayList);
        return urlModel;
    }

    public PlatformEffect(String str, String str2, String str3, String str4, List<String> list, String str5, List<String> list2) {
        l.c(str3, "");
        l.c(str4, "");
        l.c(str5, "");
        this.name = str;
        this.hint = str2;
        this.file_uri = str3;
        this.icon_uri = str4;
        this.types = list;
        this.hint_uri = str5;
        this.requirements = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PlatformEffect(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13, java.lang.String r14, java.util.List r15, int r16, h.f.b.g r17) {
        /*
            r8 = this;
            r5 = r13
            r1 = r9
            r3 = r11
            r2 = r10
            r4 = r12
            r0 = r16 & 1
            r7 = 0
            if (r0 == 0) goto L_0x000b
            r1 = r7
        L_0x000b:
            r0 = r16 & 2
            if (r0 == 0) goto L_0x0010
            r2 = r7
        L_0x0010:
            r0 = r16 & 4
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0017
            r3 = r6
        L_0x0017:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x001c
            r4 = r6
        L_0x001c:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0021
            r5 = r7
        L_0x0021:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x0030
        L_0x0025:
            r0 = r16 & 64
            if (r0 == 0) goto L_0x002e
        L_0x0029:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x002e:
            r7 = r15
            goto L_0x0029
        L_0x0030:
            r6 = r14
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.PlatformEffect.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, int, h.f.b.g):void");
    }
}
