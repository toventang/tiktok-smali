package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class AnchorInfoModel {
    public static final a Companion = new a((byte) 0);
    @c(a = "anchor_lifecycle")
    private final List<String> anchorLifeCycle;
    @c(a = "anchor_page")
    private final String anchorPage;
    @c(a = "anchor_time_delay")
    private final long anchorTimeDelay;
    @c(a = "detection_page")
    private final String detectionPage;
    @c(a = "max_anchor_check_count")
    private final int maxAnchorCheckCount;
    @c(a = "monitor_events")
    private final List<String> monitorEvents;
    @c(a = "remove_task_lifecycle")
    private final List<String> removeTaskLifeCycle;
    @c(a = "skip_anchor_actions")
    private final List<String> skipAnchorActions;

    static {
        Covode.recordClassIndex(17829);
    }

    public AnchorInfoModel() {
        this(null, null, null, 0, 0, null, null, null, 255, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.AnchorInfoModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnchorInfoModel copy$default(AnchorInfoModel anchorInfoModel, String str, List list, List list2, long j2, int i2, String str2, List list3, List list4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = anchorInfoModel.anchorPage;
        }
        if ((i3 & 2) != 0) {
            list = anchorInfoModel.anchorLifeCycle;
        }
        if ((i3 & 4) != 0) {
            list2 = anchorInfoModel.monitorEvents;
        }
        if ((i3 & 8) != 0) {
            j2 = anchorInfoModel.anchorTimeDelay;
        }
        if ((i3 & 16) != 0) {
            i2 = anchorInfoModel.maxAnchorCheckCount;
        }
        if ((i3 & 32) != 0) {
            str2 = anchorInfoModel.detectionPage;
        }
        if ((i3 & 64) != 0) {
            list3 = anchorInfoModel.removeTaskLifeCycle;
        }
        if ((i3 & 128) != 0) {
            list4 = anchorInfoModel.skipAnchorActions;
        }
        return anchorInfoModel.copy(str, list, list2, j2, i2, str2, list3, list4);
    }

    public final String component1() {
        return this.anchorPage;
    }

    public final List<String> component2() {
        return this.anchorLifeCycle;
    }

    public final List<String> component3() {
        return this.monitorEvents;
    }

    public final long component4() {
        return this.anchorTimeDelay;
    }

    public final int component5() {
        return this.maxAnchorCheckCount;
    }

    public final String component6() {
        return this.detectionPage;
    }

    public final List<String> component7() {
        return this.removeTaskLifeCycle;
    }

    public final List<String> component8() {
        return this.skipAnchorActions;
    }

    public final AnchorInfoModel copy(String str, List<String> list, List<String> list2, long j2, int i2, String str2, List<String> list3, List<String> list4) {
        l.c(str, "");
        l.c(list, "");
        l.c(list2, "");
        l.c(str2, "");
        l.c(list3, "");
        l.c(list4, "");
        return new AnchorInfoModel(str, list, list2, j2, i2, str2, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorInfoModel)) {
            return false;
        }
        AnchorInfoModel anchorInfoModel = (AnchorInfoModel) obj;
        return l.a(this.anchorPage, anchorInfoModel.anchorPage) && l.a(this.anchorLifeCycle, anchorInfoModel.anchorLifeCycle) && l.a(this.monitorEvents, anchorInfoModel.monitorEvents) && this.anchorTimeDelay == anchorInfoModel.anchorTimeDelay && this.maxAnchorCheckCount == anchorInfoModel.maxAnchorCheckCount && l.a(this.detectionPage, anchorInfoModel.detectionPage) && l.a(this.removeTaskLifeCycle, anchorInfoModel.removeTaskLifeCycle) && l.a(this.skipAnchorActions, anchorInfoModel.skipAnchorActions);
    }

    public final int hashCode() {
        String str = this.anchorPage;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.anchorLifeCycle;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.monitorEvents;
        int hashCode3 = list2 != null ? list2.hashCode() : 0;
        long j2 = this.anchorTimeDelay;
        int i3 = (((((hashCode2 + hashCode3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.maxAnchorCheckCount) * 31;
        String str2 = this.detectionPage;
        int hashCode4 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list3 = this.removeTaskLifeCycle;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.skipAnchorActions;
        if (list4 != null) {
            i2 = list4.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "AnchorInfoModel(anchorPage=" + this.anchorPage + ", anchorLifeCycle=" + this.anchorLifeCycle + ", monitorEvents=" + this.monitorEvents + ", anchorTimeDelay=" + this.anchorTimeDelay + ", maxAnchorCheckCount=" + this.maxAnchorCheckCount + ", detectionPage=" + this.detectionPage + ", removeTaskLifeCycle=" + this.removeTaskLifeCycle + ", skipAnchorActions=" + this.skipAnchorActions + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17830);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final List<String> getAnchorLifeCycle() {
        return this.anchorLifeCycle;
    }

    public final String getAnchorPage() {
        return this.anchorPage;
    }

    public final long getAnchorTimeDelay() {
        return this.anchorTimeDelay;
    }

    public final String getDetectionPage() {
        return this.detectionPage;
    }

    public final int getMaxAnchorCheckCount() {
        return this.maxAnchorCheckCount;
    }

    public final List<String> getMonitorEvents() {
        return this.monitorEvents;
    }

    public final List<String> getRemoveTaskLifeCycle() {
        return this.removeTaskLifeCycle;
    }

    public final List<String> getSkipAnchorActions() {
        return this.skipAnchorActions;
    }

    public AnchorInfoModel(String str, List<String> list, List<String> list2, long j2, int i2, String str2, List<String> list3, List<String> list4) {
        l.c(str, "");
        l.c(list, "");
        l.c(list2, "");
        l.c(str2, "");
        l.c(list3, "");
        l.c(list4, "");
        this.anchorPage = str;
        this.anchorLifeCycle = list;
        this.monitorEvents = list2;
        this.anchorTimeDelay = j2;
        this.maxAnchorCheckCount = i2;
        this.detectionPage = str2;
        this.removeTaskLifeCycle = list3;
        this.skipAnchorActions = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnchorInfoModel(java.lang.String r12, java.util.List r13, java.util.List r14, long r15, int r17, java.lang.String r18, java.util.List r19, java.util.List r20, int r21, h.f.b.g r22) {
        /*
            r11 = this;
            r10 = r20
            r9 = r19
            r7 = r17
            r2 = r12
            r3 = r13
            r4 = r14
            r1 = r21
            r5 = r15
            r0 = r1 & 1
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0013
            r2 = r8
        L_0x0013:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0019
            h.a.z r3 = h.a.z.INSTANCE
        L_0x0019:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001f
            h.a.z r4 = h.a.z.INSTANCE
        L_0x001f:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0025
            r5 = 3000(0xbb8, double:1.482E-320)
        L_0x0025:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x002a
            r7 = 4
        L_0x002a:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x003f
        L_0x002e:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0034
            h.a.z r9 = h.a.z.INSTANCE
        L_0x0034:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            h.a.z r10 = h.a.z.INSTANCE
        L_0x003a:
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            return
        L_0x003f:
            r8 = r18
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.AnchorInfoModel.<init>(java.lang.String, java.util.List, java.util.List, long, int, java.lang.String, java.util.List, java.util.List, int, h.f.b.g):void");
    }
}
