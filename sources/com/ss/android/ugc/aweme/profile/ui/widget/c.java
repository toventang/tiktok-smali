package com.ss.android.ugc.aweme.profile.ui.widget;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c implements com.bytedance.assem.arch.extensions.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f117394a;

    /* renamed from: b  reason: collision with root package name */
    public final String f117395b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f117396c;

    static {
        Covode.recordClassIndex(75850);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f117394a, cVar.f117394a) && l.a(this.f117395b, cVar.f117395b) && l.a(this.f117396c, cVar.f117396c);
    }

    public final int hashCode() {
        String str = this.f117394a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f117395b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Fragment fragment = this.f117396c;
        if (fragment != null) {
            i2 = fragment.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MyVideoListInitData(userId=" + this.f117394a + ", secUid=" + this.f117395b + ", attachedFragment=" + this.f117396c + ")";
    }

    public c(String str, String str2, Fragment fragment) {
        this.f117394a = str;
        this.f117395b = str2;
        this.f117396c = fragment;
    }
}
