package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class CompileProbeResult implements Parcelable, Serializable {
    public static final Parcelable.Creator<CompileProbeResult> CREATOR = new a();
    private final ResultData data;
    private final ResultStatus status;

    static {
        Covode.recordClassIndex(83094);
    }

    public static /* synthetic */ CompileProbeResult copy$default(CompileProbeResult compileProbeResult, ResultStatus resultStatus, ResultData resultData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resultStatus = compileProbeResult.status;
        }
        if ((i2 & 2) != 0) {
            resultData = compileProbeResult.data;
        }
        return compileProbeResult.copy(resultStatus, resultData);
    }

    public final ResultStatus component1() {
        return this.status;
    }

    public final ResultData component2() {
        return this.data;
    }

    public final CompileProbeResult copy(ResultStatus resultStatus, ResultData resultData) {
        l.d(resultStatus, "");
        return new CompileProbeResult(resultStatus, resultData);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileProbeResult)) {
            return false;
        }
        CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
        return l.a(this.status, compileProbeResult.status) && l.a(this.data, compileProbeResult.data);
    }

    public final int hashCode() {
        ResultStatus resultStatus = this.status;
        int i2 = 0;
        int hashCode = (resultStatus != null ? resultStatus.hashCode() : 0) * 31;
        ResultData resultData = this.data;
        if (resultData != null) {
            i2 = resultData.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CompileProbeResult(status=" + this.status + ", data=" + this.data + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        this.status.writeToParcel(parcel, 0);
        ResultData resultData = this.data;
        if (resultData != null) {
            parcel.writeInt(1);
            resultData.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static final class ResultData implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResultData> CREATOR = new a();
        private final int crf;
        private final int durationMs;
        private final int encodeHeight;
        private final int encodeWidth;
        private final int encoderType;
        private final int gop;
        private final int maxBitrate;
        private final float optBitrate;
        private final OptBitrateFromVE optBitrateFromVE;
        private final int optimizeCrf;
        private final int preset;
        private final float psnr;
        private final double qpoffset;
        private final int version;
        private final float videoBitrate;

        static {
            Covode.recordClassIndex(83095);
        }

        public static int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
            return i2;
        }

        public static /* synthetic */ ResultData copy$default(ResultData resultData, int i2, float f2, int i3, int i4, int i5, int i6, int i7, float f3, int i8, int i9, double d2, int i10, float f4, OptBitrateFromVE optBitrateFromVE2, int i11, int i12, Object obj) {
            int i13 = i3;
            float f5 = f2;
            int i14 = i2;
            int i15 = i6;
            int i16 = i5;
            int i17 = i4;
            int i18 = i8;
            float f6 = f3;
            int i19 = i7;
            double d3 = d2;
            int i20 = i9;
            float f7 = f4;
            int i21 = i10;
            int i22 = i11;
            OptBitrateFromVE optBitrateFromVE3 = optBitrateFromVE2;
            if ((i12 & 1) != 0) {
                i14 = resultData.optimizeCrf;
            }
            if ((i12 & 2) != 0) {
                f5 = resultData.videoBitrate;
            }
            if ((i12 & 4) != 0) {
                i13 = resultData.encoderType;
            }
            if ((i12 & 8) != 0) {
                i17 = resultData.preset;
            }
            if ((i12 & 16) != 0) {
                i16 = resultData.maxBitrate;
            }
            if ((i12 & 32) != 0) {
                i15 = resultData.encodeWidth;
            }
            if ((i12 & 64) != 0) {
                i19 = resultData.encodeHeight;
            }
            if ((i12 & 128) != 0) {
                f6 = resultData.psnr;
            }
            if ((i12 & 256) != 0) {
                i18 = resultData.crf;
            }
            if ((i12 & 512) != 0) {
                i20 = resultData.gop;
            }
            if ((i12 & 1024) != 0) {
                d3 = resultData.qpoffset;
            }
            if ((i12 & 2048) != 0) {
                i21 = resultData.durationMs;
            }
            if ((i12 & 4096) != 0) {
                f7 = resultData.optBitrate;
            }
            if ((i12 & 8192) != 0) {
                optBitrateFromVE3 = resultData.optBitrateFromVE;
            }
            if ((i12 & 16384) != 0) {
                i22 = resultData.version;
            }
            return resultData.copy(i14, f5, i13, i17, i16, i15, i19, f6, i18, i20, d3, i21, f7, optBitrateFromVE3, i22);
        }

        public final int component1() {
            return this.optimizeCrf;
        }

        public final int component10() {
            return this.gop;
        }

        public final double component11() {
            return this.qpoffset;
        }

        public final int component12() {
            return this.durationMs;
        }

        public final float component13() {
            return this.optBitrate;
        }

        public final OptBitrateFromVE component14() {
            return this.optBitrateFromVE;
        }

        public final int component15() {
            return this.version;
        }

        public final float component2() {
            return this.videoBitrate;
        }

        public final int component3() {
            return this.encoderType;
        }

        public final int component4() {
            return this.preset;
        }

        public final int component5() {
            return this.maxBitrate;
        }

        public final int component6() {
            return this.encodeWidth;
        }

        public final int component7() {
            return this.encodeHeight;
        }

        public final float component8() {
            return this.psnr;
        }

        public final int component9() {
            return this.crf;
        }

        public final ResultData copy(int i2, float f2, int i3, int i4, int i5, int i6, int i7, float f3, int i8, int i9, double d2, int i10, float f4, OptBitrateFromVE optBitrateFromVE2, int i11) {
            l.d(optBitrateFromVE2, "");
            return new ResultData(i2, f2, i3, i4, i5, i6, i7, f3, i8, i9, d2, i10, f4, optBitrateFromVE2, i11);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultData)) {
                return false;
            }
            ResultData resultData = (ResultData) obj;
            return this.optimizeCrf == resultData.optimizeCrf && Float.compare(this.videoBitrate, resultData.videoBitrate) == 0 && this.encoderType == resultData.encoderType && this.preset == resultData.preset && this.maxBitrate == resultData.maxBitrate && this.encodeWidth == resultData.encodeWidth && this.encodeHeight == resultData.encodeHeight && Float.compare(this.psnr, resultData.psnr) == 0 && this.crf == resultData.crf && this.gop == resultData.gop && Double.compare(this.qpoffset, resultData.qpoffset) == 0 && this.durationMs == resultData.durationMs && Float.compare(this.optBitrate, resultData.optBitrate) == 0 && l.a(this.optBitrateFromVE, resultData.optBitrateFromVE) && this.version == resultData.version;
        }

        public final int hashCode() {
            int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((((((((((((((((((com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.optimizeCrf) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.videoBitrate)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.encoderType)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.preset)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxBitrate)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.encodeWidth)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.encodeHeight)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.psnr)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.crf)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gop)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.qpoffset)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.durationMs)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.optBitrate)) * 31;
            OptBitrateFromVE optBitrateFromVE2 = this.optBitrateFromVE;
            return ((com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (optBitrateFromVE2 != null ? optBitrateFromVE2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.version);
        }

        public final String toString() {
            return "ResultData(optimizeCrf=" + this.optimizeCrf + ", videoBitrate=" + this.videoBitrate + ", encoderType=" + this.encoderType + ", preset=" + this.preset + ", maxBitrate=" + this.maxBitrate + ", encodeWidth=" + this.encodeWidth + ", encodeHeight=" + this.encodeHeight + ", psnr=" + this.psnr + ", crf=" + this.crf + ", gop=" + this.gop + ", qpoffset=" + this.qpoffset + ", durationMs=" + this.durationMs + ", optBitrate=" + this.optBitrate + ", optBitrateFromVE=" + this.optBitrateFromVE + ", version=" + this.version + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeInt(this.optimizeCrf);
            parcel.writeFloat(this.videoBitrate);
            parcel.writeInt(this.encoderType);
            parcel.writeInt(this.preset);
            parcel.writeInt(this.maxBitrate);
            parcel.writeInt(this.encodeWidth);
            parcel.writeInt(this.encodeHeight);
            parcel.writeFloat(this.psnr);
            parcel.writeInt(this.crf);
            parcel.writeInt(this.gop);
            parcel.writeDouble(this.qpoffset);
            parcel.writeInt(this.durationMs);
            parcel.writeFloat(this.optBitrate);
            this.optBitrateFromVE.writeToParcel(parcel, 0);
            parcel.writeInt(this.version);
        }

        public final int getCrf() {
            return this.crf;
        }

        public final int getDurationMs() {
            return this.durationMs;
        }

        public final int getEncodeHeight() {
            return this.encodeHeight;
        }

        public final int getEncodeWidth() {
            return this.encodeWidth;
        }

        public final int getEncoderType() {
            return this.encoderType;
        }

        public final int getGop() {
            return this.gop;
        }

        public final int getMaxBitrate() {
            return this.maxBitrate;
        }

        public final float getOptBitrate() {
            return this.optBitrate;
        }

        public final OptBitrateFromVE getOptBitrateFromVE() {
            return this.optBitrateFromVE;
        }

        public final int getOptimizeCrf() {
            return this.optimizeCrf;
        }

        public final int getPreset() {
            return this.preset;
        }

        public final float getPsnr() {
            return this.psnr;
        }

        public final double getQpoffset() {
            return this.qpoffset;
        }

        public final int getVersion() {
            return this.version;
        }

        public final float getVideoBitrate() {
            return this.videoBitrate;
        }

        public static class a implements Parcelable.Creator<ResultData> {
            static {
                Covode.recordClassIndex(83096);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ResultData[] newArray(int i2) {
                return new ResultData[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResultData createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new ResultData(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readInt(), parcel.readFloat(), OptBitrateFromVE.CREATOR.createFromParcel(parcel), parcel.readInt());
            }
        }

        public static int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
            return Float.floatToIntBits(f2);
        }

        public static int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(double d2) {
            long doubleToLongBits = Double.doubleToLongBits(d2);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }

        public ResultData(int i2, float f2, int i3, int i4, int i5, int i6, int i7, float f3, int i8, int i9, double d2, int i10, float f4, OptBitrateFromVE optBitrateFromVE2, int i11) {
            l.d(optBitrateFromVE2, "");
            this.optimizeCrf = i2;
            this.videoBitrate = f2;
            this.encoderType = i3;
            this.preset = i4;
            this.maxBitrate = i5;
            this.encodeWidth = i6;
            this.encodeHeight = i7;
            this.psnr = f3;
            this.crf = i8;
            this.gop = i9;
            this.qpoffset = d2;
            this.durationMs = i10;
            this.optBitrate = f4;
            this.optBitrateFromVE = optBitrateFromVE2;
            this.version = i11;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResultData(int i2, float f2, int i3, int i4, int i5, int i6, int i7, float f3, int i8, int i9, double d2, int i10, float f4, OptBitrateFromVE optBitrateFromVE2, int i11, int i12, g gVar) {
            this(i2, f2, i3, i4, i5, i6, i7, f3, i8, i9, d2, i10, (i12 & 4096) != 0 ? 0.0f : f4, (i12 & 8192) != 0 ? new OptBitrateFromVE(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : optBitrateFromVE2, (i12 & 16384) != 0 ? 1 : i11);
        }
    }

    public static final class ResultStatus implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResultStatus> CREATOR = new a();
        private final String msg;
        private final State state;
        private final int toolsCode;
        private final int veCode;

        static {
            Covode.recordClassIndex(83097);
        }

        public static int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultStatus_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
            return i2;
        }

        public static /* synthetic */ ResultStatus copy$default(ResultStatus resultStatus, State state2, int i2, int i3, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                state2 = resultStatus.state;
            }
            if ((i4 & 2) != 0) {
                i2 = resultStatus.veCode;
            }
            if ((i4 & 4) != 0) {
                i3 = resultStatus.toolsCode;
            }
            if ((i4 & 8) != 0) {
                str = resultStatus.msg;
            }
            return resultStatus.copy(state2, i2, i3, str);
        }

        public final State component1() {
            return this.state;
        }

        public final int component2() {
            return this.veCode;
        }

        public final int component3() {
            return this.toolsCode;
        }

        public final String component4() {
            return this.msg;
        }

        public final ResultStatus copy(State state2, int i2, int i3, String str) {
            l.d(state2, "");
            l.d(str, "");
            return new ResultStatus(state2, i2, i3, str);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultStatus)) {
                return false;
            }
            ResultStatus resultStatus = (ResultStatus) obj;
            return l.a(this.state, resultStatus.state) && this.veCode == resultStatus.veCode && this.toolsCode == resultStatus.toolsCode && l.a(this.msg, resultStatus.msg);
        }

        public final int hashCode() {
            State state2 = this.state;
            int i2 = 0;
            int hashCode = (((((state2 != null ? state2.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultStatus_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.veCode)) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultStatus_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.toolsCode)) * 31;
            String str = this.msg;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "ResultStatus(state=" + this.state + ", veCode=" + this.veCode + ", toolsCode=" + this.toolsCode + ", msg=" + this.msg + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(this.state.name());
            parcel.writeInt(this.veCode);
            parcel.writeInt(this.toolsCode);
            parcel.writeString(this.msg);
        }

        public final String getMsg() {
            return this.msg;
        }

        public final State getState() {
            return this.state;
        }

        public final int getToolsCode() {
            return this.toolsCode;
        }

        public final int getVeCode() {
            return this.veCode;
        }

        public static class a implements Parcelable.Creator<ResultStatus> {
            static {
                Covode.recordClassIndex(83098);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ResultStatus[] newArray(int i2) {
                return new ResultStatus[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResultStatus createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new ResultStatus((State) Enum.valueOf(State.class, parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readString());
            }
        }

        public ResultStatus(State state2, int i2, int i3, String str) {
            l.d(state2, "");
            l.d(str, "");
            this.state = state2;
            this.veCode = i2;
            this.toolsCode = i3;
            this.msg = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResultStatus(State state2, int i2, int i3, String str, int i4, g gVar) {
            this(state2, i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? "" : str);
        }
    }

    public final ResultData getData() {
        return this.data;
    }

    public final ResultStatus getStatus() {
        return this.status;
    }

    public enum State implements Parcelable, Serializable {
        SUCCESS,
        ERROR,
        CANCEL;
        
        public static final Parcelable.Creator<State> CREATOR = new a();

        static {
            Covode.recordClassIndex(83099);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(name());
        }

        public static class a implements Parcelable.Creator<State> {
            static {
                Covode.recordClassIndex(83100);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ State[] newArray(int i2) {
                return new State[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ State createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return Enum.valueOf(State.class, parcel.readString());
            }
        }
    }

    public static class a implements Parcelable.Creator<CompileProbeResult> {
        static {
            Covode.recordClassIndex(83101);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CompileProbeResult[] newArray(int i2) {
            return new CompileProbeResult[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CompileProbeResult createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new CompileProbeResult(ResultStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ResultData.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public CompileProbeResult(ResultStatus resultStatus, ResultData resultData) {
        l.d(resultStatus, "");
        this.status = resultStatus;
        this.data = resultData;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompileProbeResult(ResultStatus resultStatus, ResultData resultData, int i2, g gVar) {
        this(resultStatus, (i2 & 2) != 0 ? null : resultData);
    }
}
