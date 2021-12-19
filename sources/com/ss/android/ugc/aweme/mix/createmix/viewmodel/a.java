package com.ss.android.ugc.aweme.mix.createmix.viewmodel;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.assem.arch.extensions.t;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public String f109884a;

    /* renamed from: b  reason: collision with root package name */
    public final String f109885b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Aweme> f109886c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<String> f109887d;

    /* renamed from: e  reason: collision with root package name */
    public final String f109888e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.a<b> f109889f;

    /* renamed from: g  reason: collision with root package name */
    public final f<b> f109890g;

    /* renamed from: h  reason: collision with root package name */
    public final f<b> f109891h;

    /* renamed from: i  reason: collision with root package name */
    public String f109892i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.assem.arch.extensions.a<Object> f109893j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f109894k;

    static {
        Covode.recordClassIndex(70416);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f109884a, aVar.f109884a) && l.a(this.f109885b, aVar.f109885b) && l.a(this.f109886c, aVar.f109886c) && l.a(this.f109887d, aVar.f109887d) && l.a(this.f109888e, aVar.f109888e) && l.a(this.f109889f, aVar.f109889f) && l.a(this.f109890g, aVar.f109890g) && l.a(this.f109891h, aVar.f109891h) && l.a(this.f109892i, aVar.f109892i) && l.a(this.f109893j, aVar.f109893j) && this.f109894k == aVar.f109894k;
    }

    public final int hashCode() {
        String str = this.f109884a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f109885b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Aweme> list = this.f109886c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ArrayList<String> arrayList = this.f109887d;
        int hashCode4 = (hashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str3 = this.f109888e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<b> aVar = this.f109889f;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        f<b> fVar = this.f109890g;
        int hashCode7 = (hashCode6 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        f<b> fVar2 = this.f109891h;
        int hashCode8 = (hashCode7 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        String str4 = this.f109892i;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<Object> aVar2 = this.f109893j;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        int i3 = (hashCode9 + i2) * 31;
        boolean z = this.f109894k;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "MixCreateState(enterFrom=" + this.f109884a + ", enterMethod=" + this.f109885b + ", mixVideos=" + this.f109886c + ", addedFeedsID=" + this.f109887d + ", mixName=" + this.f109888e + ", nextFragment=" + this.f109889f + ", createRequest=" + this.f109890g + ", addVideoRequest=" + this.f109891h + ", mixId=" + this.f109892i + ", positionChange=" + this.f109893j + ", isCreateFlag=" + this.f109894k + ")";
    }

    public /* synthetic */ a() {
        this("", "", new ArrayList(), new ArrayList(), null, null, t.f25669a, t.f25669a, "", null, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.mix.createmix.viewmodel.b> */
    /* JADX WARN: Multi-variable type inference failed */
    private a(String str, String str2, List<? extends Aweme> list, ArrayList<String> arrayList, String str3, com.bytedance.assem.arch.extensions.a<? extends b> aVar, f<b> fVar, f<b> fVar2, String str4, com.bytedance.assem.arch.extensions.a<Object> aVar2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(fVar, "");
        l.d(fVar2, "");
        l.d(str4, "");
        this.f109884a = str;
        this.f109885b = str2;
        this.f109886c = list;
        this.f109887d = arrayList;
        this.f109888e = str3;
        this.f109889f = aVar;
        this.f109890g = fVar;
        this.f109891h = fVar2;
        this.f109892i = str4;
        this.f109893j = aVar2;
        this.f109894k = z;
    }

    public static /* synthetic */ a a(a aVar, String str, String str2, List list, ArrayList arrayList, String str3, com.bytedance.assem.arch.extensions.a aVar2, f fVar, f fVar2, String str4, com.bytedance.assem.arch.extensions.a aVar3, boolean z, int i2) {
        boolean z2 = z;
        ArrayList arrayList2 = arrayList;
        List list2 = list;
        String str5 = str2;
        String str6 = str;
        String str7 = str3;
        com.bytedance.assem.arch.extensions.a aVar4 = aVar2;
        f fVar3 = fVar;
        f fVar4 = fVar2;
        String str8 = str4;
        com.bytedance.assem.arch.extensions.a aVar5 = aVar3;
        if ((i2 & 1) != 0) {
            str6 = aVar.f109884a;
        }
        if ((i2 & 2) != 0) {
            str5 = aVar.f109885b;
        }
        if ((i2 & 4) != 0) {
            list2 = aVar.f109886c;
        }
        if ((i2 & 8) != 0) {
            arrayList2 = aVar.f109887d;
        }
        if ((i2 & 16) != 0) {
            str7 = aVar.f109888e;
        }
        if ((i2 & 32) != 0) {
            aVar4 = aVar.f109889f;
        }
        if ((i2 & 64) != 0) {
            fVar3 = aVar.f109890g;
        }
        if ((i2 & 128) != 0) {
            fVar4 = aVar.f109891h;
        }
        if ((i2 & 256) != 0) {
            str8 = aVar.f109892i;
        }
        if ((i2 & 512) != 0) {
            aVar5 = aVar.f109893j;
        }
        if ((i2 & 1024) != 0) {
            z2 = aVar.f109894k;
        }
        l.d(str6, "");
        l.d(str5, "");
        l.d(fVar3, "");
        l.d(fVar4, "");
        l.d(str8, "");
        return new a(str6, str5, list2, arrayList2, str7, aVar4, fVar3, fVar4, str8, aVar5, z2);
    }
}
