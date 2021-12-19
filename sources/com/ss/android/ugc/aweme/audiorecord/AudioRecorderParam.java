package com.ss.android.ugc.aweme.audiorecord;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;
import java.util.Stack;

public final class AudioRecorderParam implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    private int audioRecordIndex;
    @c(a = "audiourl")
    private String audioUrl;
    @c(a = "extraurl")
    private String extraUrl;
    @c(a = "mstack")
    private Stack<Point> mStack;
    private boolean needDel;
    @c(a = "needoriginalsound")
    private boolean needOriginalSound;
    @c(a = "voicevolume")
    private float voiceVolume;

    static {
        Covode.recordClassIndex(41337);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<AudioRecorderParam> {
        static {
            Covode.recordClassIndex(41338);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AudioRecorderParam[] newArray(int i2) {
            return new AudioRecorderParam[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AudioRecorderParam createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new AudioRecorderParam(parcel);
        }
    }

    public final int getAudioRecordIndex() {
        return this.audioRecordIndex;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final String getExtraUrl() {
        return this.extraUrl;
    }

    public final Stack<Point> getMStack() {
        return this.mStack;
    }

    public final boolean getNeedDel() {
        return this.needDel;
    }

    public final boolean getNeedOriginalSound() {
        return this.needOriginalSound;
    }

    public final float getVoiceVolume() {
        return this.voiceVolume;
    }

    public AudioRecorderParam() {
        this.mStack = new Stack<>();
        this.needOriginalSound = true;
        this.audioUrl = "";
        this.extraUrl = "";
        this.audioRecordIndex = -1;
    }

    public final boolean hasRecord() {
        if (TextUtils.isEmpty(this.audioUrl) || this.mStack.empty()) {
            return false;
        }
        return true;
    }

    public final void setAudioRecordIndex(int i2) {
        this.audioRecordIndex = i2;
    }

    public final void setNeedDel(boolean z) {
        this.needDel = z;
    }

    public final void setNeedOriginalSound(boolean z) {
        this.needOriginalSound = z;
    }

    public final void setVoiceVolume(float f2) {
        this.voiceVolume = f2;
    }

    public final void setAudioUrl(String str) {
        l.d(str, "");
        this.audioUrl = str;
    }

    public final void setExtraUrl(String str) {
        l.d(str, "");
        this.extraUrl = str;
    }

    public final void setMStack(Stack<Point> stack) {
        l.d(stack, "");
        this.mStack = stack;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AudioRecorderParam(Parcel parcel) {
        this();
        boolean z;
        String str = "";
        l.d(parcel, str);
        Serializable readSerializable = parcel.readSerializable();
        Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type java.util.Stack<com.ss.android.ugc.aweme.audiorecord.Point>");
        this.mStack = (Stack) readSerializable;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needOriginalSound = z;
        String readString = parcel.readString();
        this.audioUrl = readString == null ? str : readString;
        this.voiceVolume = parcel.readFloat();
        String readString2 = parcel.readString();
        this.extraUrl = readString2 != null ? readString2 : str;
    }

    public final void copyFrom(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam != null) {
            this.voiceVolume = audioRecorderParam.voiceVolume;
            this.needOriginalSound = audioRecorderParam.needOriginalSound;
            this.needDel = audioRecorderParam.needDel;
            this.voiceVolume = audioRecorderParam.voiceVolume;
            this.audioRecordIndex = audioRecorderParam.audioRecordIndex;
            this.audioUrl = audioRecorderParam.audioUrl;
            this.extraUrl = audioRecorderParam.extraUrl;
            this.mStack.clear();
            this.mStack.addAll(audioRecorderParam.mStack);
        }
    }

    public final boolean hasChange(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam != null) {
            Stack stack = new Stack();
            Stack stack2 = new Stack();
            stack.addAll(this.mStack);
            stack2.addAll(audioRecorderParam.mStack);
            if (stack.size() != stack2.size()) {
                return true;
            }
            while (!stack.isEmpty() && !stack2.empty()) {
                Point point = (Point) stack2.pop();
                l.b(point, "");
                if (!((Point) stack.pop()).isEqual(point)) {
                    return true;
                }
            }
            if (this.needOriginalSound != audioRecorderParam.needOriginalSound) {
                return true;
            }
            return false;
        } else if (!this.mStack.empty() || !this.needOriginalSound) {
            return true;
        } else {
            return false;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeSerializable(this.mStack);
        parcel.writeByte(this.needOriginalSound ? (byte) 1 : 0);
        parcel.writeString(this.audioUrl);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeString(this.extraUrl);
    }
}
