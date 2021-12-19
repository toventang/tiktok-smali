package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.utils.g;
import com.ss.android.ugc.aweme.discover.model.Layout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class d implements Serializable {
    @c(a = "bullet_schema")
    String bulletSchema;
    @c(a = "height")
    int height;
    private Object key = new Object();
    @c(a = "layout")
    Layout layout;
    @c(a = "aweme_list")
    private List<Aweme> mAwemeList;
    @c(a = "origin_type")
    int originType;
    @c(a = "raw_data")
    String rawData;
    @c(a = "schema")
    String schema;
    @c(a = "width")
    int width;

    static {
        Covode.recordClassIndex(50764);
    }

    public static int com_ss_android_ugc_aweme_discover_mixfeed_DynamicPatch_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2, Throwable th) {
        return 0;
    }

    public List<Aweme> getAwemeList() {
        return this.mAwemeList;
    }

    public String getBulletSchema() {
        return this.bulletSchema;
    }

    public int getHeight() {
        return this.height;
    }

    public Object getKey() {
        return this.key;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public int getOriginType() {
        return this.originType;
    }

    public String getRawData() {
        return this.rawData;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getWidth() {
        return this.width;
    }

    public List<Map<?, ?>> getAwemeListRaw() {
        return a(this.mAwemeList);
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        Layout layout2 = this.layout;
        int i5 = 0;
        if (layout2 != null) {
            i2 = layout2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i2 * 31;
        String str = this.rawData;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.schema;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        String str3 = this.bulletSchema;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return ((((i8 + i5) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        return "DynamicPatch{key=" + this.key + ", layout=" + this.layout + ", rawData='" + this.rawData + '\'' + ", schema='" + this.schema + '\'' + ", bulletSchema='" + this.bulletSchema + '\'' + ", height=" + this.height + ", width=" + this.width + ", originType=" + this.originType + ", mAwemeList=" + this.mAwemeList + '}';
    }

    public void setAwemeList(List<Aweme> list) {
        this.mAwemeList = list;
    }

    public void setBulletSchema(String str) {
        this.bulletSchema = str;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setLayout(Layout layout2) {
        this.layout = layout2;
    }

    public void setOriginType(int i2) {
        this.originType = i2;
    }

    public void setRawData(String str) {
        this.rawData = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public String getAwemeListFirstStr(int i2) {
        List<Aweme> list = this.mAwemeList;
        if (list == null || list.size() <= i2) {
            return null;
        }
        return new f().b(this.mAwemeList.get(i2));
    }

    public List<Map<?, ?>> getAwemeListRawByPosition(int i2) {
        Aweme aweme = this.mAwemeList.get(i2);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(aweme);
        return a(arrayList);
    }

    private static List<Map<?, ?>> a(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Aweme aweme : list) {
                arrayList.add(b.a().a(b.a().b(aweme), Map.class));
            }
        } catch (Exception e2) {
            com_ss_android_ugc_aweme_discover_mixfeed_DynamicPatch_com_ss_android_ugc_aweme_lancet_LogLancet_d("DynamicPatch", "Aweme list gson convert error.", e2);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.height == dVar.height && this.width == dVar.width && g.a(this.layout, dVar.layout) && g.a(this.rawData, dVar.rawData) && g.a(this.mAwemeList, dVar.mAwemeList) && g.a(this.schema, dVar.schema) && g.a(this.bulletSchema, dVar.bulletSchema)) {
            return true;
        }
        return false;
    }
}
