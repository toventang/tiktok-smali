package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class EffectCategoryResponse implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private List<? extends Effect> collection_effect;
    private String extra;
    private Effect front_effect;
    private String icon_normal_url;
    private String icon_selected_url;
    private String id;
    private boolean is_default;
    private String key;
    private String name;
    private Effect rear_effect;
    private List<String> tags;
    private String tags_update_time;
    private List<? extends Effect> total_effects;

    public static class a implements Parcelable.Creator {
        static {
            Covode.recordClassIndex(102451);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.c(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Effect effect = (Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader());
            Effect effect2 = (Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(parcel.readParcelable(EffectCategoryResponse.class.getClassLoader()));
                readInt--;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add(parcel.readParcelable(EffectCategoryResponse.class.getClassLoader()));
                readInt2--;
            }
            return new EffectCategoryResponse(readString, readString2, readString3, readString4, readString5, effect, effect2, arrayList, createStringArrayList, readString6, arrayList2, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i2) {
            return new EffectCategoryResponse[i2];
        }
    }

    static {
        Covode.recordClassIndex(102450);
    }

    public EffectCategoryResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.key);
        parcel.writeString(this.icon_normal_url);
        parcel.writeString(this.icon_selected_url);
        parcel.writeParcelable(this.front_effect, i2);
        parcel.writeParcelable(this.rear_effect, i2);
        List<? extends Effect> list = this.total_effects;
        parcel.writeInt(list.size());
        for (Effect effect : list) {
            parcel.writeParcelable(effect, i2);
        }
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tags_update_time);
        List<? extends Effect> list2 = this.collection_effect;
        parcel.writeInt(list2.size());
        for (Effect effect2 : list2) {
            parcel.writeParcelable(effect2, i2);
        }
        parcel.writeInt(this.is_default ? 1 : 0);
        parcel.writeString(this.extra);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getCollection_effect() {
        return this.collection_effect;
    }

    public String getExtra() {
        return this.extra;
    }

    public Effect getFront_effect() {
        return this.front_effect;
    }

    public String getIcon_normal_url() {
        return this.icon_normal_url;
    }

    public String getIcon_selected_url() {
        return this.icon_selected_url;
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

    public Effect getRear_effect() {
        return this.rear_effect;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_update_time() {
        return this.tags_update_time;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getTotal_effects() {
        return this.total_effects;
    }

    public boolean is_default() {
        return this.is_default;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public void setIcon_normal_url(String str) {
        this.icon_normal_url = str;
    }

    public void setIcon_selected_url(String str) {
        this.icon_selected_url = str;
    }

    public void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public void setTags_update_time(String str) {
        this.tags_update_time = str;
    }

    public void set_default(boolean z) {
        this.is_default = z;
    }

    public void setCollection_effect(List<? extends Effect> list) {
        l.c(list, "");
        this.collection_effect = list;
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

    public void setTotal_effects(List<? extends Effect> list) {
        l.c(list, "");
        this.total_effects = list;
    }

    public EffectCategoryResponse(String str, String str2, String str3, String str4, String str5, Effect effect, Effect effect2, List<? extends Effect> list, List<String> list2, String str6, List<? extends Effect> list3, boolean z, String str7) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(list, "");
        l.c(list2, "");
        l.c(list3, "");
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.icon_normal_url = str4;
        this.icon_selected_url = str5;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.total_effects = list;
        this.tags = list2;
        this.tags_update_time = str6;
        this.collection_effect = list3;
        this.is_default = z;
        this.extra = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EffectCategoryResponse(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.ss.ugc.effectplatform.model.Effect r21, com.ss.ugc.effectplatform.model.Effect r22, java.util.List r23, java.util.List r24, java.lang.String r25, java.util.List r26, boolean r27, java.lang.String r28, int r29, h.f.b.g r30) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.EffectCategoryResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.Effect, com.ss.ugc.effectplatform.model.Effect, java.util.List, java.util.List, java.lang.String, java.util.List, boolean, java.lang.String, int, h.f.b.g):void");
    }
}
