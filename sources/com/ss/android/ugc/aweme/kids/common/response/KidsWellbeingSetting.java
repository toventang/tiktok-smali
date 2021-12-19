package com.ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class KidsWellbeingSetting {
    @c(a = "bed_time_reminder")
    private final b bedTimeReminder;
    @c(a = "day_time_end")
    private final String dayTimeEnd;
    @c(a = "day_time_start")
    private final String dayTimeStart;
    @c(a = "video_playtime_reminders")
    private final List<KidsVideoPlaytimeReminder> playtimeReminder;

    static {
        Covode.recordClassIndex(67771);
    }

    public KidsWellbeingSetting() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KidsWellbeingSetting copy$default(KidsWellbeingSetting kidsWellbeingSetting, String str, String str2, List list, b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = kidsWellbeingSetting.dayTimeStart;
        }
        if ((i2 & 2) != 0) {
            str2 = kidsWellbeingSetting.dayTimeEnd;
        }
        if ((i2 & 4) != 0) {
            list = kidsWellbeingSetting.playtimeReminder;
        }
        if ((i2 & 8) != 0) {
            bVar = kidsWellbeingSetting.bedTimeReminder;
        }
        return kidsWellbeingSetting.copy(str, str2, list, bVar);
    }

    public final String component1() {
        return this.dayTimeStart;
    }

    public final String component2() {
        return this.dayTimeEnd;
    }

    public final List<KidsVideoPlaytimeReminder> component3() {
        return this.playtimeReminder;
    }

    public final b component4() {
        return this.bedTimeReminder;
    }

    public final KidsWellbeingSetting copy(String str, String str2, List<KidsVideoPlaytimeReminder> list, b bVar) {
        return new KidsWellbeingSetting(str, str2, list, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsWellbeingSetting)) {
            return false;
        }
        KidsWellbeingSetting kidsWellbeingSetting = (KidsWellbeingSetting) obj;
        return l.a(this.dayTimeStart, kidsWellbeingSetting.dayTimeStart) && l.a(this.dayTimeEnd, kidsWellbeingSetting.dayTimeEnd) && l.a(this.playtimeReminder, kidsWellbeingSetting.playtimeReminder) && l.a(this.bedTimeReminder, kidsWellbeingSetting.bedTimeReminder);
    }

    public final int hashCode() {
        String str = this.dayTimeStart;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.dayTimeEnd;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<KidsVideoPlaytimeReminder> list = this.playtimeReminder;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        b bVar = this.bedTimeReminder;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "KidsWellbeingSetting(dayTimeStart=" + this.dayTimeStart + ", dayTimeEnd=" + this.dayTimeEnd + ", playtimeReminder=" + this.playtimeReminder + ", bedTimeReminder=" + this.bedTimeReminder + ")";
    }

    public final b getBedTimeReminder() {
        return this.bedTimeReminder;
    }

    public final String getDayTimeEnd() {
        return this.dayTimeEnd;
    }

    public final String getDayTimeStart() {
        return this.dayTimeStart;
    }

    public final List<KidsVideoPlaytimeReminder> getPlaytimeReminder() {
        return this.playtimeReminder;
    }

    public KidsWellbeingSetting(String str, String str2, List<KidsVideoPlaytimeReminder> list, b bVar) {
        this.dayTimeStart = str;
        this.dayTimeEnd = str2;
        this.playtimeReminder = list;
        this.bedTimeReminder = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KidsWellbeingSetting(String str, String str2, List list, b bVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : bVar);
    }
}
