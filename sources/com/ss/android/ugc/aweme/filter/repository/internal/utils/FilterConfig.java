package com.ss.android.ugc.aweme.filter.repository.internal.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class FilterConfig {
    private List<FilterConfigItem> items;
    private String resource;

    static {
        Covode.recordClassIndex(60669);
    }

    public FilterConfig() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterConfig copy$default(FilterConfig filterConfig, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = filterConfig.resource;
        }
        if ((i2 & 2) != 0) {
            list = filterConfig.items;
        }
        return filterConfig.copy(str, list);
    }

    public final String component1() {
        return this.resource;
    }

    public final List<FilterConfigItem> component2() {
        return this.items;
    }

    public final FilterConfig copy(String str, List<FilterConfigItem> list) {
        return new FilterConfig(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterConfig)) {
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) obj;
        return l.a(this.resource, filterConfig.resource) && l.a(this.items, filterConfig.items);
    }

    public final int hashCode() {
        String str = this.resource;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<FilterConfigItem> list = this.items;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FilterConfig(resource=" + this.resource + ", items=" + this.items + ")";
    }

    public static final class FilterConfigItem {
        private int max;
        private int min;
        private String name;
        private String tag;
        private int value;

        static {
            Covode.recordClassIndex(60670);
        }

        public FilterConfigItem() {
            this(0, 0, 0, null, null, 31, null);
        }

        public static /* synthetic */ FilterConfigItem copy$default(FilterConfigItem filterConfigItem, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i2 = filterConfigItem.min;
            }
            if ((i5 & 2) != 0) {
                i3 = filterConfigItem.max;
            }
            if ((i5 & 4) != 0) {
                i4 = filterConfigItem.value;
            }
            if ((i5 & 8) != 0) {
                str = filterConfigItem.tag;
            }
            if ((i5 & 16) != 0) {
                str2 = filterConfigItem.name;
            }
            return filterConfigItem.copy(i2, i3, i4, str, str2);
        }

        public final int component1() {
            return this.min;
        }

        public final int component2() {
            return this.max;
        }

        public final int component3() {
            return this.value;
        }

        public final String component4() {
            return this.tag;
        }

        public final String component5() {
            return this.name;
        }

        public final FilterConfigItem copy(int i2, int i3, int i4, String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            return new FilterConfigItem(i2, i3, i4, str, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterConfigItem)) {
                return false;
            }
            FilterConfigItem filterConfigItem = (FilterConfigItem) obj;
            return this.min == filterConfigItem.min && this.max == filterConfigItem.max && this.value == filterConfigItem.value && l.a(this.tag, filterConfigItem.tag) && l.a(this.name, filterConfigItem.name);
        }

        public final int hashCode() {
            int i2 = ((((this.min * 31) + this.max) * 31) + this.value) * 31;
            String str = this.tag;
            int i3 = 0;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            return hashCode + i3;
        }

        public final String toString() {
            return "FilterConfigItem(min=" + this.min + ", max=" + this.max + ", value=" + this.value + ", tag=" + this.tag + ", name=" + this.name + ")";
        }

        public final int getMax() {
            return this.max;
        }

        public final int getMin() {
            return this.min;
        }

        public final String getName() {
            return this.name;
        }

        public final String getTag() {
            return this.tag;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setMax(int i2) {
            this.max = i2;
        }

        public final void setMin(int i2) {
            this.min = i2;
        }

        public final void setValue(int i2) {
            this.value = i2;
        }

        public final void setName(String str) {
            l.d(str, "");
            this.name = str;
        }

        public final void setTag(String str) {
            l.d(str, "");
            this.tag = str;
        }

        public FilterConfigItem(int i2, int i3, int i4, String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.min = i2;
            this.max = i3;
            this.value = i4;
            this.tag = str;
            this.name = str2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ FilterConfigItem(int r7, int r8, int r9, java.lang.String r10, java.lang.String r11, int r12, h.f.b.g r13) {
            /*
                r6 = this;
                r4 = r10
                r2 = r8
                r1 = r7
                r0 = r12 & 1
                r3 = 0
                if (r0 == 0) goto L_0x0009
                r1 = 0
            L_0x0009:
                r0 = r12 & 2
                if (r0 == 0) goto L_0x000e
                r2 = 0
            L_0x000e:
                r0 = r12 & 4
                if (r0 == 0) goto L_0x0024
            L_0x0012:
                r0 = r12 & 8
                java.lang.String r5 = ""
                if (r0 == 0) goto L_0x0019
                r4 = r5
            L_0x0019:
                r0 = r12 & 16
                if (r0 == 0) goto L_0x0022
            L_0x001d:
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
            L_0x0022:
                r5 = r11
                goto L_0x001d
            L_0x0024:
                r3 = r9
                goto L_0x0012
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfig.FilterConfigItem.<init>(int, int, int, java.lang.String, java.lang.String, int, h.f.b.g):void");
        }
    }

    public final List<FilterConfigItem> getItems() {
        return this.items;
    }

    public final String getResource() {
        return this.resource;
    }

    public final void setItems(List<FilterConfigItem> list) {
        this.items = list;
    }

    public final void setResource(String str) {
        this.resource = str;
    }

    public FilterConfig(String str, List<FilterConfigItem> list) {
        this.resource = str;
        this.items = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterConfig(String str, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list);
    }
}
