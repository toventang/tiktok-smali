package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public class CategoryEffectModel {
    private List<? extends Effect> bind_effects;
    private String category_key;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private boolean has_more;
    private int sorting_position;
    private String version;

    static {
        Covode.recordClassIndex(102442);
    }

    public CategoryEffectModel() {
        this(null, null, false, 0, 0, null, null, null, 255, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCategory_effects() {
        return this.effects;
    }

    public String getCategory_key() {
        return this.category_key;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getCollection() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public int getSorting_position() {
        return this.sorting_position;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCursor(int i2) {
        this.cursor = i2;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSorting_position(int i2) {
        this.sorting_position = i2;
    }

    public void setBind_effects(List<? extends Effect> list) {
        l.c(list, "");
        this.bind_effects = list;
    }

    public final void setCategory_effects(List<? extends Effect> list) {
        l.c(list, "");
        this.effects = list;
    }

    public void setCategory_key(String str) {
        l.c(str, "");
        this.category_key = str;
    }

    public void setCollection(List<? extends Effect> list) {
        l.c(list, "");
        this.collection = list;
    }

    public void setVersion(String str) {
        l.c(str, "");
        this.version = str;
    }

    public CategoryEffectModel(String str, String str2, boolean z, int i2, int i3, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(list, "");
        l.c(list2, "");
        l.c(list3, "");
        this.category_key = str;
        this.version = str2;
        this.has_more = z;
        this.cursor = i2;
        this.sorting_position = i3;
        this.collection = list;
        this.effects = list2;
        this.bind_effects = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CategoryEffectModel(java.lang.String r11, java.lang.String r12, boolean r13, int r14, int r15, java.util.List r16, java.util.List r17, java.util.List r18, int r19, h.f.b.g r20) {
        /*
            r10 = this;
            r9 = r18
            r8 = r17
            r2 = r11
            r4 = r13
            r7 = r16
            r1 = r19
            r5 = r14
            r0 = r1 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0012
            r2 = r3
        L_0x0012:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0047
        L_0x0016:
            r0 = r1 & 4
            r6 = 0
            if (r0 == 0) goto L_0x001c
            r4 = 0
        L_0x001c:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0021
            r5 = 0
        L_0x0021:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0045
        L_0x0025:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x002e
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x002e:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0037
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0037:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0040:
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0045:
            r6 = r15
            goto L_0x0025
        L_0x0047:
            r3 = r12
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.CategoryEffectModel.<init>(java.lang.String, java.lang.String, boolean, int, int, java.util.List, java.util.List, java.util.List, int, h.f.b.g):void");
    }
}
