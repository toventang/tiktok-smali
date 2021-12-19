package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ResourceCheckModel {
    public static final a Companion = new a((byte) 0);
    @c(a = "check_lifecycle")
    private final List<String> checkLifeCycle;
    @c(a = "check_page")
    private final String checkPage;
    @c(a = "check_time_delay")
    private final long checkTimeDelay;
    @c(a = "check_type")
    private final int checkType;
    @c(a = "max_check_times")
    private final int maxCheckTimes;
    @c(a = "resources")
    private final List<String> resources;
    @c(a = "stop_check_lifecycle")
    private final List<String> stopCheckLifeCycle;

    static {
        Covode.recordClassIndex(17839);
    }

    public ResourceCheckModel() {
        this(null, 0, null, null, null, 0, 0, 127, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.ResourceCheckModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceCheckModel copy$default(ResourceCheckModel resourceCheckModel, String str, int i2, List list, List list2, List list3, long j2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = resourceCheckModel.checkPage;
        }
        if ((i4 & 2) != 0) {
            i2 = resourceCheckModel.checkType;
        }
        if ((i4 & 4) != 0) {
            list = resourceCheckModel.checkLifeCycle;
        }
        if ((i4 & 8) != 0) {
            list2 = resourceCheckModel.stopCheckLifeCycle;
        }
        if ((i4 & 16) != 0) {
            list3 = resourceCheckModel.resources;
        }
        if ((i4 & 32) != 0) {
            j2 = resourceCheckModel.checkTimeDelay;
        }
        if ((i4 & 64) != 0) {
            i3 = resourceCheckModel.maxCheckTimes;
        }
        return resourceCheckModel.copy(str, i2, list, list2, list3, j2, i3);
    }

    public final String component1() {
        return this.checkPage;
    }

    public final int component2() {
        return this.checkType;
    }

    public final List<String> component3() {
        return this.checkLifeCycle;
    }

    public final List<String> component4() {
        return this.stopCheckLifeCycle;
    }

    public final List<String> component5() {
        return this.resources;
    }

    public final long component6() {
        return this.checkTimeDelay;
    }

    public final int component7() {
        return this.maxCheckTimes;
    }

    public final ResourceCheckModel copy(String str, int i2, List<String> list, List<String> list2, List<String> list3, long j2, int i3) {
        l.c(str, "");
        l.c(list, "");
        l.c(list2, "");
        l.c(list3, "");
        return new ResourceCheckModel(str, i2, list, list2, list3, j2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceCheckModel)) {
            return false;
        }
        ResourceCheckModel resourceCheckModel = (ResourceCheckModel) obj;
        return l.a(this.checkPage, resourceCheckModel.checkPage) && this.checkType == resourceCheckModel.checkType && l.a(this.checkLifeCycle, resourceCheckModel.checkLifeCycle) && l.a(this.stopCheckLifeCycle, resourceCheckModel.stopCheckLifeCycle) && l.a(this.resources, resourceCheckModel.resources) && this.checkTimeDelay == resourceCheckModel.checkTimeDelay && this.maxCheckTimes == resourceCheckModel.maxCheckTimes;
    }

    public final int hashCode() {
        String str = this.checkPage;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.checkType) * 31;
        List<String> list = this.checkLifeCycle;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.stopCheckLifeCycle;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.resources;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        long j2 = this.checkTimeDelay;
        return ((((hashCode3 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.maxCheckTimes;
    }

    public final String toString() {
        return "ResourceCheckModel(checkPage=" + this.checkPage + ", checkType=" + this.checkType + ", checkLifeCycle=" + this.checkLifeCycle + ", stopCheckLifeCycle=" + this.stopCheckLifeCycle + ", resources=" + this.resources + ", checkTimeDelay=" + this.checkTimeDelay + ", maxCheckTimes=" + this.maxCheckTimes + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17840);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final List<String> getCheckLifeCycle() {
        return this.checkLifeCycle;
    }

    public final String getCheckPage() {
        return this.checkPage;
    }

    public final long getCheckTimeDelay() {
        return this.checkTimeDelay;
    }

    public final int getCheckType() {
        return this.checkType;
    }

    public final int getMaxCheckTimes() {
        return this.maxCheckTimes;
    }

    public final List<String> getResources() {
        return this.resources;
    }

    public final List<String> getStopCheckLifeCycle() {
        return this.stopCheckLifeCycle;
    }

    public ResourceCheckModel(String str, int i2, List<String> list, List<String> list2, List<String> list3, long j2, int i3) {
        l.c(str, "");
        l.c(list, "");
        l.c(list2, "");
        l.c(list3, "");
        this.checkPage = str;
        this.checkType = i2;
        this.checkLifeCycle = list;
        this.stopCheckLifeCycle = list2;
        this.resources = list3;
        this.checkTimeDelay = j2;
        this.maxCheckTimes = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceCheckModel(String str, int i2, List list, List list2, List list3, long j2, int i3, int i4, g gVar) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? z.INSTANCE : list, (i4 & 8) != 0 ? z.INSTANCE : list2, (i4 & 16) != 0 ? z.INSTANCE : list3, (i4 & 32) != 0 ? 3000 : j2, (i4 & 64) != 0 ? 4 : i3);
    }
}
