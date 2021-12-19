package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.n;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import h.f.b.l;

public final class ReadTextState implements af {
    private final n<String, Integer> fetchFailed;
    private final a<TextStickerData> textStickerData;
    private final d<TextStickerData> textStickerDataV2;

    static {
        Covode.recordClassIndex(96697);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReadTextState copy$default(ReadTextState readTextState, a aVar, d dVar, n nVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = readTextState.textStickerData;
        }
        if ((i2 & 2) != 0) {
            dVar = readTextState.textStickerDataV2;
        }
        if ((i2 & 4) != 0) {
            nVar = readTextState.fetchFailed;
        }
        return readTextState.copy(aVar, dVar, nVar);
    }

    public final a<TextStickerData> component1() {
        return this.textStickerData;
    }

    public final d<TextStickerData> component2() {
        return this.textStickerDataV2;
    }

    public final n<String, Integer> component3() {
        return this.fetchFailed;
    }

    public final ReadTextState copy(a<TextStickerData> aVar, d<TextStickerData> dVar, n<String, Integer> nVar) {
        l.d(aVar, "");
        return new ReadTextState(aVar, dVar, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadTextState)) {
            return false;
        }
        ReadTextState readTextState = (ReadTextState) obj;
        return l.a(this.textStickerData, readTextState.textStickerData) && l.a(this.textStickerDataV2, readTextState.textStickerDataV2) && l.a(this.fetchFailed, readTextState.fetchFailed);
    }

    public final int hashCode() {
        a<TextStickerData> aVar = this.textStickerData;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        d<TextStickerData> dVar = this.textStickerDataV2;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        n<String, Integer> nVar = this.fetchFailed;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ReadTextState(textStickerData=" + this.textStickerData + ", textStickerDataV2=" + this.textStickerDataV2 + ", fetchFailed=" + this.fetchFailed + ")";
    }

    public final n<String, Integer> getFetchFailed() {
        return this.fetchFailed;
    }

    public final a<TextStickerData> getTextStickerData() {
        return this.textStickerData;
    }

    public final d<TextStickerData> getTextStickerDataV2() {
        return this.textStickerDataV2;
    }

    public ReadTextState(a<TextStickerData> aVar, d<TextStickerData> dVar, n<String, Integer> nVar) {
        l.d(aVar, "");
        this.textStickerData = aVar;
        this.textStickerDataV2 = dVar;
        this.fetchFailed = nVar;
    }
}
