package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.e;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.b;
import h.f.b.l;

public final class c implements e {

    /* renamed from: a */
    public b f127228a;

    /* renamed from: b */
    public InteractStickerStruct f127229b;

    /* renamed from: c */
    public int f127230c;

    /* renamed from: d */
    public int f127231d;

    static {
        Covode.recordClassIndex(83458);
    }

    public c() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f127228a, cVar.f127228a) && l.a(this.f127229b, cVar.f127229b) && this.f127230c == cVar.f127230c && this.f127231d == cVar.f127231d;
    }

    public final int hashCode() {
        b bVar = this.f127228a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        InteractStickerStruct interactStickerStruct = this.f127229b;
        if (interactStickerStruct != null) {
            i2 = interactStickerStruct.hashCode();
        }
        return ((((hashCode + i2) * 31) + this.f127230c) * 31) + this.f127231d;
    }

    public final String toString() {
        return "DonationStickerData(org=" + this.f127228a + ", interactStruct=" + this.f127229b + ", startTime=" + this.f127230c + ", endTime=" + this.f127231d + ")";
    }

    public static /* synthetic */ c a(c cVar) {
        return new c(cVar.f127228a, cVar.f127229b, cVar.f127230c, cVar.f127231d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b bVar, int i2) {
        this((i2 & 1) != 0 ? null : bVar, null, 0, 0);
    }

    private c(b bVar, InteractStickerStruct interactStickerStruct, int i2, int i3) {
        this.f127228a = bVar;
        this.f127229b = interactStickerStruct;
        this.f127230c = i2;
        this.f127231d = i3;
    }
}
