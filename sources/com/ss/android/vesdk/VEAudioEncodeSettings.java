package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class VEAudioEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEAudioEncodeSettings> CREATOR = new Parcelable.Creator<VEAudioEncodeSettings>() {
        /* class com.ss.android.vesdk.VEAudioEncodeSettings.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99091);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioEncodeSettings[] newArray(int i2) {
            return new VEAudioEncodeSettings[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioEncodeSettings createFromParcel(Parcel parcel) {
            return new VEAudioEncodeSettings(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    static final VEAudioEncodeSettings f150676a = new VEAudioEncodeSettings();

    /* renamed from: b  reason: collision with root package name */
    public ENCODE_STANDARD f150677b;

    /* renamed from: c  reason: collision with root package name */
    public int f150678c;

    /* renamed from: d  reason: collision with root package name */
    public int f150679d;

    /* renamed from: e  reason: collision with root package name */
    public int f150680e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f150681f;

    public int describeContents() {
        return 0;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public ENCODE_STANDARD f150683a = ENCODE_STANDARD.ENCODE_STANDARD_WAV;

        /* renamed from: b  reason: collision with root package name */
        public int f150684b = 44100;

        /* renamed from: c  reason: collision with root package name */
        public int f150685c = 131072;

        /* renamed from: d  reason: collision with root package name */
        public int f150686d = 2;

        /* renamed from: e  reason: collision with root package name */
        public boolean f150687e;

        /* renamed from: f  reason: collision with root package name */
        private String f150688f;

        /* renamed from: g  reason: collision with root package name */
        private b f150689g = b.COMPILE;

        static {
            Covode.recordClassIndex(99094);
        }

        public final VEAudioEncodeSettings a() {
            if (this.f150688f != null) {
                b();
            }
            return new VEAudioEncodeSettings(this, (byte) 0);
        }

        private void b() {
            try {
                JSONObject jSONObject = new JSONObject(this.f150688f);
                JSONObject jSONObject2 = null;
                if (this.f150689g.equals(b.COMPILE)) {
                    jSONObject2 = jSONObject.getJSONObject("compile");
                } else if (this.f150689g.equals(b.RECORD)) {
                    jSONObject2 = jSONObject.getJSONObject("record");
                } else if (this.f150689g.equals(b.COMPILE_WATERMARK)) {
                    jSONObject2 = jSONObject.getJSONObject("watermark_compile");
                }
                try {
                    String string = jSONObject2.getString("mCodec");
                    ENCODE_STANDARD encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_AAC;
                    if (string == null) {
                        encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_AAC;
                    } else if ("AAC".equals(string.toUpperCase())) {
                        encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_AAC;
                    } else if ("PCM".equals(string.toUpperCase())) {
                        encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_PCM;
                    } else if ("WAV".equals(string.toUpperCase())) {
                        encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_WAV;
                    }
                    this.f150683a = encode_standard;
                    this.f150684b = jSONObject2.getInt("mSampleRate");
                    this.f150685c = jSONObject2.getInt("mBps");
                    this.f150686d = jSONObject2.getInt("mChannelCount");
                    this.f150687e = jSONObject2.getBoolean("mHwEnc");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    static {
        Covode.recordClassIndex(99090);
    }

    public VEAudioEncodeSettings() {
        this.f150678c = 44100;
        this.f150679d = 131072;
        this.f150680e = 2;
        this.f150678c = 44100;
        this.f150679d = 128000;
        this.f150680e = 2;
    }

    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_WAV,
        ENCODE_STANDARD_PCM,
        ENCODE_STANDARD_AAC;
        
        public static final Parcelable.Creator<ENCODE_STANDARD> CREATOR = new Parcelable.Creator<ENCODE_STANDARD>() {
            /* class com.ss.android.vesdk.VEAudioEncodeSettings.ENCODE_STANDARD.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99093);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ENCODE_STANDARD[] newArray(int i2) {
                return new ENCODE_STANDARD[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ENCODE_STANDARD createFromParcel(Parcel parcel) {
                return ENCODE_STANDARD.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99092);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    public enum b {
        RECORD,
        COMPILE,
        COMPILE_WATERMARK;

        static {
            Covode.recordClassIndex(99095);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"mCodec\":").append(this.f150677b);
        sb.append(",\"mSampleRate\":").append(this.f150678c);
        sb.append(",\"mBps\":").append(this.f150679d);
        sb.append(",\"mChannelCount\":").append(this.f150680e);
        sb.append(",\"mHwEnc\":").append(this.f150681f);
        sb.append('}');
        return sb.toString();
    }

    protected VEAudioEncodeSettings(Parcel parcel) {
        boolean z;
        this.f150678c = 44100;
        this.f150679d = 131072;
        this.f150680e = 2;
        this.f150677b = (ENCODE_STANDARD) parcel.readParcelable(ENCODE_STANDARD.class.getClassLoader());
        this.f150678c = parcel.readInt();
        this.f150679d = parcel.readInt();
        this.f150680e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f150681f = z;
    }

    private VEAudioEncodeSettings(a aVar) {
        this.f150678c = 44100;
        this.f150679d = 131072;
        this.f150680e = 2;
        this.f150677b = aVar.f150683a;
        this.f150678c = aVar.f150684b;
        this.f150679d = aVar.f150685c;
        this.f150680e = aVar.f150686d;
        this.f150681f = aVar.f150687e;
    }

    /* synthetic */ VEAudioEncodeSettings(a aVar, byte b2) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f150677b, i2);
        parcel.writeInt(this.f150678c);
        parcel.writeInt(this.f150679d);
        parcel.writeInt(this.f150680e);
        parcel.writeByte(this.f150681f ? (byte) 1 : 0);
    }
}
