package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ff {
    @c(a = "permission_popup_accept_text")

    /* renamed from: a  reason: collision with root package name */
    public String f90031a;
    @c(a = "permission_popup_reject_text")

    /* renamed from: b  reason: collision with root package name */
    public String f90032b;
    @c(a = "permission_popup_facebook_title")

    /* renamed from: c  reason: collision with root package name */
    public String f90033c;
    @c(a = "permission_popup_contact_title")

    /* renamed from: d  reason: collision with root package name */
    public String f90034d;
    @c(a = "permission_popup_sync_facebook_body_text")

    /* renamed from: e  reason: collision with root package name */
    public String f90035e;
    @c(a = "permission_popup_sync_contact_body_text")

    /* renamed from: f  reason: collision with root package name */
    public String f90036f;

    static {
        Covode.recordClassIndex(56505);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        return l.a(this.f90031a, ffVar.f90031a) && l.a(this.f90032b, ffVar.f90032b) && l.a(this.f90033c, ffVar.f90033c) && l.a(this.f90034d, ffVar.f90034d) && l.a(this.f90035e, ffVar.f90035e) && l.a(this.f90036f, ffVar.f90036f);
    }

    public final int hashCode() {
        String str = this.f90031a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f90032b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f90033c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f90034d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f90035e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f90036f;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "PermissionPopUpStyleConfig(primaryButtonStringKey=" + this.f90031a + ", secondaryButtonStringKey=" + this.f90032b + ", fbTitleKey=" + this.f90033c + ", contactTitleKey=" + this.f90034d + ", dialogFBTextKey=" + this.f90035e + ", dialogContactTextKey=" + this.f90036f + ")";
    }

    public /* synthetic */ ff() {
        this("disclosure_continue", "none_close", "access_request_FB_description", "contact_access_disclosure");
    }

    private ff(String str, String str2, String str3, String str4) {
        this.f90031a = str;
        this.f90032b = str2;
        this.f90033c = null;
        this.f90034d = null;
        this.f90035e = str3;
        this.f90036f = str4;
    }
}
