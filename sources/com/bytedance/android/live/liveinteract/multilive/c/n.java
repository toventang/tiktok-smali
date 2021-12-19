package com.bytedance.android.live.liveinteract.multilive.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;

public final class n {
    @c(a = "layout_type")

    /* renamed from: a  reason: collision with root package name */
    public String f11767a;
    @c(a = "users")

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<o> f11768b;

    static {
        Covode.recordClassIndex(6416);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f11767a, nVar.f11767a) && l.a(this.f11768b, nVar.f11768b);
    }

    public final int hashCode() {
        String str = this.f11767a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<o> arrayList = this.f11768b;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MultiLiveRTCMessageParam(layoutType=" + this.f11767a + ", users=" + this.f11768b + ")";
    }

    public /* synthetic */ n() {
        this("", new ArrayList());
    }

    public final com.bytedance.android.live.liveinteract.api.b.n a() {
        String str = this.f11767a;
        switch (str.hashCode()) {
            case -2111025230:
                if (str.equals("float_fix")) {
                    return com.bytedance.android.live.liveinteract.api.b.n.FLOATING_FIX;
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return com.bytedance.android.live.liveinteract.api.b.n.GRID;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    return com.bytedance.android.live.liveinteract.api.b.n.FLOATING;
                }
                break;
            case 318387100:
                if (str.equals("grid_fix")) {
                    return com.bytedance.android.live.liveinteract.api.b.n.GRID_FIX;
                }
                break;
        }
        return com.bytedance.android.live.liveinteract.api.b.n.NORMAL;
    }

    private n(String str, ArrayList<o> arrayList) {
        l.d(str, "");
        l.d(arrayList, "");
        this.f11767a = str;
        this.f11768b = arrayList;
    }
}
