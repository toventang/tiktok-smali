package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ag extends b {

    /* renamed from: a  reason: collision with root package name */
    private final int f52780a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52781b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52782c;

    static {
        Covode.recordClassIndex(32672);
    }

    ag(int i2, String str, String str2) {
        this.f52780a = i2;
        this.f52781b = str;
        this.f52782c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final int a() {
        return this.f52780a;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String b() {
        return this.f52781b;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String c() {
        return this.f52782c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f52780a == bVar.a() && ((str = this.f52781b) != null ? str.equals(bVar.b()) : bVar.b() == null)) {
                String str2 = this.f52782c;
                String c2 = bVar.c();
                if (str2 != null ? str2.equals(c2) : c2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f52780a ^ 1000003) * 1000003;
        String str = this.f52781b;
        int i3 = 0;
        int hashCode = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f52782c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode ^ i3;
    }

    public final String toString() {
        int i2 = this.f52780a;
        String str = this.f52781b;
        String str2 = this.f52782c;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i2);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
