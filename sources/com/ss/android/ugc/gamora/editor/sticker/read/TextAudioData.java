package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class TextAudioData {
    @c(a = "v_str")
    private final String audio;
    @c(a = "s_key")
    private final String key;

    static {
        Covode.recordClassIndex(96708);
    }

    public TextAudioData() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ TextAudioData copy$default(TextAudioData textAudioData, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = textAudioData.key;
        }
        if ((i2 & 2) != 0) {
            str2 = textAudioData.audio;
        }
        return textAudioData.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.audio;
    }

    public final TextAudioData copy(String str, String str2) {
        return new TextAudioData(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAudioData)) {
            return false;
        }
        TextAudioData textAudioData = (TextAudioData) obj;
        return l.a(this.key, textAudioData.key) && l.a(this.audio, textAudioData.audio);
    }

    public final int hashCode() {
        String str = this.key;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.audio;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TextAudioData(key=" + this.key + ", audio=" + this.audio + ")";
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getKey() {
        return this.key;
    }

    public TextAudioData(String str, String str2) {
        this.key = str;
        this.audio = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextAudioData(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }
}
