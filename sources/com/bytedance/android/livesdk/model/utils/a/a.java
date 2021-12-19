package com.bytedance.android.livesdk.model.utils.a;

import com.bytedance.covode.number.Covode;

public final class a implements c, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final String f19771a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19772b;

    static {
        Covode.recordClassIndex(11718);
    }

    @Override // com.bytedance.android.livesdk.model.utils.a.c
    public final String a() {
        return this.f19771a;
    }

    @Override // com.bytedance.android.livesdk.model.utils.a.c
    public final String b() {
        return this.f19772b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final int hashCode() {
        return com.bytedance.android.livesdk.model.utils.a.a(com.bytedance.android.livesdk.model.utils.a.a(17, this.f19771a), this.f19772b);
    }

    public final String toString() {
        int length = this.f19771a.length();
        String str = this.f19772b;
        if (str != null) {
            length += str.length() + 1;
        }
        b bVar = new b(length);
        bVar.a(this.f19771a);
        if (this.f19772b != null) {
            bVar.a("=");
            bVar.a(this.f19772b);
        }
        return bVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            a aVar = (a) obj;
            if (!this.f19771a.equals(aVar.f19771a) || !com.bytedance.android.livesdk.model.utils.a.a(this.f19772b, aVar.f19772b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public a(String str, String str2) {
        if (str != null) {
            this.f19771a = str;
            this.f19772b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
