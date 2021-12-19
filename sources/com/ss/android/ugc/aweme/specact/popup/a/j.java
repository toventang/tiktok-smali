package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class j {
    @c(a = "task_award_desc")

    /* renamed from: a  reason: collision with root package name */
    public String f134444a;
    @c(a = "task_name")

    /* renamed from: b  reason: collision with root package name */
    public String f134445b;
    @c(a = "task_id")

    /* renamed from: c  reason: collision with root package name */
    public String f134446c;
    @c(a = "bold")

    /* renamed from: d  reason: collision with root package name */
    public boolean f134447d;

    static {
        Covode.recordClassIndex(87884);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f134444a, jVar.f134444a) && l.a(this.f134445b, jVar.f134445b) && l.a(this.f134446c, jVar.f134446c) && this.f134447d == jVar.f134447d;
    }

    public final int hashCode() {
        String str = this.f134444a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f134445b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f134446c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f134447d;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "TaskInfo(taskAwardDesc=" + this.f134444a + ", taskName=" + this.f134445b + ", taskId=" + this.f134446c + ", bold=" + this.f134447d + ")";
    }

    private /* synthetic */ j() {
        this("", "", "");
    }

    private j(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f134444a = str;
        this.f134445b = str2;
        this.f134446c = str3;
        this.f134447d = false;
    }
}
