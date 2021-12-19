package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class ResourceListModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private String icon_uri;
    private String params;
    private List<? extends ResourceListBean> resource_list;
    private List<String> url_prefix;

    public static class a implements Parcelable.Creator {
        static {
            Covode.recordClassIndex(102466);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.c(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(parcel.readParcelable(ResourceListModel.class.getClassLoader()));
                readInt--;
            }
            return new ResourceListModel(arrayList, parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i2) {
            return new ResourceListModel[i2];
        }
    }

    static {
        Covode.recordClassIndex(102463);
    }

    public ResourceListModel() {
        this(null, null, null, null, 15, null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        List<? extends ResourceListBean> list = this.resource_list;
        parcel.writeInt(list.size());
        for (ResourceListBean resourceListBean : list) {
            parcel.writeParcelable(resourceListBean, i2);
        }
        parcel.writeStringList(this.url_prefix);
        parcel.writeString(this.icon_uri);
        parcel.writeString(this.params);
    }

    public static class ResourceListBean implements AndroidParcelable {
        public static final Parcelable.Creator CREATOR = new a();
        private String name;
        private String resource_uri;
        private String value;

        public static class a implements Parcelable.Creator {
            static {
                Covode.recordClassIndex(102465);
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                l.c(parcel, "");
                return new ResourceListBean(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new ResourceListBean[i2];
            }
        }

        static {
            Covode.recordClassIndex(102464);
        }

        public ResourceListBean() {
            this(null, null, null, 7, null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            l.c(parcel, "");
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.resource_uri);
        }

        public String getName() {
            return this.name;
        }

        public String getResource_uri() {
            return this.resource_uri;
        }

        public String getValue() {
            return this.value;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setResource_uri(String str) {
            this.resource_uri = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public ResourceListBean(String str, String str2, String str3) {
            this.name = str;
            this.value = str2;
            this.resource_uri = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResourceListBean(String str, String str2, String str3, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
        }
    }

    public String getIcon_uri() {
        return this.icon_uri;
    }

    public String getParams() {
        return this.params;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean>, java.util.List<com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean> */
    public List<ResourceListBean> getResource_list() {
        return this.resource_list;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setIcon_uri(String str) {
        this.icon_uri = str;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setResource_list(List<? extends ResourceListBean> list) {
        l.c(list, "");
        this.resource_list = list;
    }

    public void setUrl_prefix(List<String> list) {
        l.c(list, "");
        this.url_prefix = list;
    }

    public ResourceListModel(List<? extends ResourceListBean> list, List<String> list2, String str, String str2) {
        l.c(list, "");
        l.c(list2, "");
        this.resource_list = list;
        this.url_prefix = list2;
        this.icon_uri = str;
        this.params = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListModel(List list, List list2, String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2);
    }
}
