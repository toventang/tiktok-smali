package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class ComposerBeautyExtraBeautify {
    private List<ItemsBean> items;
    private String resource;

    static {
        Covode.recordClassIndex(42224);
    }

    public ComposerBeautyExtraBeautify() {
        this(null, null, 3, null);
    }

    public static final class ItemsBean {
        private boolean doubleDirection;
        private int max;
        private int min;
        private String name;
        private String tag;
        private int value;

        static {
            Covode.recordClassIndex(42225);
        }

        public ItemsBean() {
            this(false, 0, 0, 0, null, null, 63, null);
        }

        public static /* synthetic */ ItemsBean copy$default(ItemsBean itemsBean, boolean z, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z = itemsBean.doubleDirection;
            }
            if ((i5 & 2) != 0) {
                i2 = itemsBean.min;
            }
            if ((i5 & 4) != 0) {
                i3 = itemsBean.max;
            }
            if ((i5 & 8) != 0) {
                i4 = itemsBean.value;
            }
            if ((i5 & 16) != 0) {
                str = itemsBean.tag;
            }
            if ((i5 & 32) != 0) {
                str2 = itemsBean.name;
            }
            return itemsBean.copy(z, i2, i3, i4, str, str2);
        }

        public final boolean component1() {
            return this.doubleDirection;
        }

        public final int component2() {
            return this.min;
        }

        public final int component3() {
            return this.max;
        }

        public final int component4() {
            return this.value;
        }

        public final String component5() {
            return this.tag;
        }

        public final String component6() {
            return this.name;
        }

        public final ItemsBean copy(boolean z, int i2, int i3, int i4, String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            return new ItemsBean(z, i2, i3, i4, str, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemsBean)) {
                return false;
            }
            ItemsBean itemsBean = (ItemsBean) obj;
            return this.doubleDirection == itemsBean.doubleDirection && this.min == itemsBean.min && this.max == itemsBean.max && this.value == itemsBean.value && l.a(this.tag, itemsBean.tag) && l.a(this.name, itemsBean.name);
        }

        public final int hashCode() {
            boolean z = this.doubleDirection;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = ((((((i2 * 31) + this.min) * 31) + this.max) * 31) + this.value) * 31;
            String str = this.tag;
            int i6 = 0;
            int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i6 = str2.hashCode();
            }
            return hashCode + i6;
        }

        public final String toString() {
            return "ItemsBean(doubleDirection=" + this.doubleDirection + ", min=" + this.min + ", max=" + this.max + ", value=" + this.value + ", tag=" + this.tag + ", name=" + this.name + ")";
        }

        public final boolean getDoubleDirection() {
            return this.doubleDirection;
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

        public final void setDoubleDirection(boolean z) {
            this.doubleDirection = z;
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

        public ItemsBean(boolean z, int i2, int i3, int i4, String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.doubleDirection = z;
            this.min = i2;
            this.max = i3;
            this.value = i4;
            this.tag = str;
            this.name = str2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ItemsBean(boolean r8, int r9, int r10, int r11, java.lang.String r12, java.lang.String r13, int r14, h.f.b.g r15) {
            /*
                r7 = this;
                r5 = r12
                r3 = r10
                r2 = r9
                r1 = r8
                r0 = r14 & 1
                r4 = 0
                if (r0 == 0) goto L_0x000a
                r1 = 0
            L_0x000a:
                r0 = r14 & 2
                if (r0 == 0) goto L_0x000f
                r2 = 0
            L_0x000f:
                r0 = r14 & 4
                if (r0 == 0) goto L_0x0014
                r3 = 0
            L_0x0014:
                r0 = r14 & 8
                if (r0 == 0) goto L_0x002a
            L_0x0018:
                r0 = r14 & 16
                java.lang.String r6 = ""
                if (r0 == 0) goto L_0x001f
                r5 = r6
            L_0x001f:
                r0 = r14 & 32
                if (r0 == 0) goto L_0x0028
            L_0x0023:
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            L_0x0028:
                r6 = r13
                goto L_0x0023
            L_0x002a:
                r4 = r11
                goto L_0x0018
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean.<init>(boolean, int, int, int, java.lang.String, java.lang.String, int, h.f.b.g):void");
        }
    }

    public final List<ItemsBean> getItems() {
        return this.items;
    }

    public final String getResource() {
        return this.resource;
    }

    public final void setItems(List<ItemsBean> list) {
        this.items = list;
    }

    public final void setResource(String str) {
        this.resource = str;
    }

    public ComposerBeautyExtraBeautify(String str, List<ItemsBean> list) {
        this.resource = str;
        this.items = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposerBeautyExtraBeautify(String str, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list);
    }
}
