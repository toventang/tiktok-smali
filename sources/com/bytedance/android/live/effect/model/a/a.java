package com.bytedance.android.live.effect.model.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f9875a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9876b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9877c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9878d;

    /* renamed from: e  reason: collision with root package name */
    public long f9879e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Integer> f9880f;

    /* renamed from: g  reason: collision with root package name */
    public final List<b> f9881g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9882h;

    static {
        Covode.recordClassIndex(5059);
    }

    public final String toString() {
        return "LiveComposerNode(panel='" + this.f9875a + "', effectId='" + this.f9876b + "', path='" + this.f9877c + "', isWithoutFace=" + this.f9878d + ", updateTime=" + this.f9879e + ", coexistGroup=" + this.f9880f + ", tagList=" + this.f9881g + ", use=" + this.f9882h + ')';
    }

    public a(a aVar) {
        l.d(aVar, "");
        ArrayList arrayList = new ArrayList();
        this.f9880f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f9881g = arrayList2;
        this.f9875a = aVar.f9875a;
        this.f9876b = aVar.f9876b;
        this.f9877c = aVar.f9877c;
        this.f9878d = aVar.f9878d;
        this.f9879e = aVar.f9879e;
        this.f9882h = aVar.f9882h;
        arrayList.addAll(aVar.f9880f);
        arrayList2.addAll(aVar.f9881g);
    }

    public a(String str, String str2, String str3, boolean z, long j2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f9880f = new ArrayList();
        this.f9881g = new ArrayList();
        this.f9875a = str;
        this.f9876b = str2;
        this.f9877c = str3;
        this.f9878d = z;
        this.f9879e = j2;
    }
}
