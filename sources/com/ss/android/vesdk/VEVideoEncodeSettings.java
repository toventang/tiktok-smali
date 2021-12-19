package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VEVideoEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoEncodeSettings> CREATOR = new Parcelable.Creator<VEVideoEncodeSettings>() {
        /* class com.ss.android.vesdk.VEVideoEncodeSettings.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99233);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoEncodeSettings[] newArray(int i2) {
            return new VEVideoEncodeSettings[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoEncodeSettings createFromParcel(Parcel parcel) {
            return new VEVideoEncodeSettings(parcel);
        }
    };
    boolean banExtraDataLoop;
    public ENCODE_BITRATE_MODE bitrateMode;
    public int bps;
    public COMPILE_TYPE compileType;
    public boolean enableByteVCRemuxVideo;
    public boolean enableHwBufferEncode;
    private boolean enableInterLeave;
    public boolean enableRemuxVideo;
    public boolean enableRemuxVideoForRotation;
    public boolean enableRemuxVideoForShoot;
    private int enableRemuxVideoRes;
    public int encodeProfile;
    public int encodeStandard;
    public String externalSettingsJsonStr;
    public int fps;
    public int gopSize;
    public boolean hasBFrame;
    public boolean isSupportHWEncoder;
    public String mComment;
    public boolean mCompileSoftInfo;
    public String mDescription;
    public int[] mKeyFramePoints;
    public boolean mOptRemuxWithCopy;
    public boolean mReEncodeOpt;
    public boolean mRecordingMp4;
    public int mResolutionAlign;
    public boolean mTransitionKeyframeEnable;
    public VEVideoCompileEncodeSettings mVideoCompileEncodeSetting;
    public VEVideoCompileEncodeSettings mVideoWatermarkCompileEncodeSetting;
    public VEWatermarkParam mWatermarkParam;
    public VESize outputSize;
    public int resizeMode;
    public float resizeX;
    public float resizeY;
    public int rotate;
    public float speed;
    public int swCRF;
    public long swMaxrate;
    public int swPreset;
    public int swQP;
    public double swQPOffset;
    public VESize watermarkSize;

    public int describeContents() {
        return 0;
    }

    public ENCODE_BITRATE_MODE getBitrateMode() {
        return this.bitrateMode;
    }

    public int getBps() {
        return this.bps;
    }

    public String getComment() {
        return this.mComment;
    }

    public COMPILE_TYPE getCompileType() {
        return this.compileType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public int getEncodeProfile() {
        return this.encodeProfile;
    }

    public int getEncodeStandard() {
        return this.encodeStandard;
    }

    public String getExternalSettingsJsonStr() {
        return this.externalSettingsJsonStr;
    }

    public int getFps() {
        return this.fps;
    }

    public int getGopSize() {
        return this.gopSize;
    }

    public int[] getKeyFramePoints() {
        return this.mKeyFramePoints;
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public float getResizeX() {
        return this.resizeX;
    }

    public float getResizeY() {
        return this.resizeY;
    }

    public int getResolutionAlignment() {
        return this.mResolutionAlign;
    }

    public int getRotate() {
        return this.rotate;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int getSwCRF() {
        return this.swCRF;
    }

    public long getSwMaxRate() {
        return this.swMaxrate;
    }

    public int getSwPreset() {
        return this.swPreset;
    }

    public int getSwQP() {
        return this.swQP;
    }

    public VEVideoCompileEncodeSettings getVideoCompileEncodeSetting() {
        return this.mVideoCompileEncodeSetting;
    }

    public VESize getVideoRes() {
        return this.outputSize;
    }

    public VEVideoCompileEncodeSettings getWatermarkCompileEncodeSetting() {
        return this.mVideoWatermarkCompileEncodeSetting;
    }

    public VEWatermarkParam getWatermarkParam() {
        return this.mWatermarkParam;
    }

    public VESize getWatermarkVideoRes() {
        return this.watermarkSize;
    }

    public boolean isBanExtraDataLoop() {
        return this.banExtraDataLoop;
    }

    public boolean isCompileSoftInfo() {
        return this.mCompileSoftInfo;
    }

    public boolean isEnableByteVCRemuxVideo() {
        return this.enableByteVCRemuxVideo;
    }

    public boolean isEnableHwBufferEncode() {
        return this.enableHwBufferEncode;
    }

    public boolean isEnableInterLeave() {
        return this.enableInterLeave;
    }

    public boolean isEnableRemuxVideo() {
        return this.enableRemuxVideo;
    }

    public boolean isEnableRemuxVideoForRotation() {
        return this.enableRemuxVideoForRotation;
    }

    public boolean isEnableRemuxVideoForShoot() {
        return this.enableRemuxVideoForShoot;
    }

    public int isEnableRemuxVideoRes() {
        return this.enableRemuxVideoRes;
    }

    public boolean isHasBFrame() {
        return this.hasBFrame;
    }

    public boolean isOptRemuxWithCopy() {
        return this.mOptRemuxWithCopy;
    }

    public boolean isReEncodeOpt() {
        return this.mReEncodeOpt;
    }

    public boolean isRecordingMp4() {
        return this.mRecordingMp4;
    }

    public boolean isSupportHwEnc() {
        return this.isSupportHWEncoder;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public VEVideoEncodeSettings f150865a;

        /* renamed from: b  reason: collision with root package name */
        private int f150866b;

        /* renamed from: c  reason: collision with root package name */
        private Map<ENCODE_STANDARD, Integer> f150867c = new HashMap();

        static {
            Covode.recordClassIndex(99245);
        }

        public final a a(boolean z, boolean z2) {
            this.f150865a.enableRemuxVideo = z;
            this.f150865a.enableRemuxVideoForRotation = z2;
            return this;
        }

        public final a a(boolean z) {
            this.f150865a.enableRemuxVideoForShoot = z;
            return this;
        }

        public final a a(ENCODE_PROFILE encode_profile) {
            this.f150865a.encodeProfile = encode_profile.ordinal();
            return this;
        }

        public final a a(ENCODE_STANDARD encode_standard) {
            this.f150865a.encodeStandard = encode_standard.ordinal();
            return this;
        }

        public final a a(String str) {
            this.f150865a.externalSettingsJsonStr = str;
            return this;
        }

        public final a a() {
            this.f150865a.resizeX = 0.0f;
            return this;
        }

        public final a b() {
            this.f150865a.resizeY = 0.0f;
            return this;
        }

        public final a c() {
            this.f150865a.mWatermarkParam = null;
            return this;
        }

        public final VEVideoEncodeSettings d() {
            a(this.f150865a);
            if (!TextUtils.isEmpty(this.f150865a.externalSettingsJsonStr)) {
                c(this.f150865a.externalSettingsJsonStr);
            } else {
                e();
            }
            an.a("VEVideoEncodeSettings", "exportVideoEncodeSettings = " + this.f150865a);
            an.a("VEVideoEncodeSettings", "exportVideoEncodeSettings.compile = " + this.f150865a.mVideoCompileEncodeSetting);
            return this.f150865a;
        }

        private void e() {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f150865a.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.useHWEncoder = this.f150865a.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.enableHwBufferEncode = this.f150865a.enableHwBufferEncode;
            if (vEVideoCompileEncodeSettings.useHWEncoder) {
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mBitrate = (long) this.f150865a.bps;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mProfile = this.f150865a.encodeProfile;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mGop = this.f150865a.gopSize;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mCodecType = this.f150865a.encodeStandard;
            } else {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = this.f150865a.bitrateMode.ordinal();
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBps = this.f150865a.bps;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf = this.f150865a.swCRF;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = this.f150865a.swQPOffset;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate = this.f150865a.swMaxrate;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset = this.f150865a.swPreset;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile = this.f150865a.encodeProfile;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop = this.f150865a.gopSize;
            }
            this.f150865a.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            this.f150865a.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings;
        }

        public final a d(boolean z) {
            this.f150865a.mOptRemuxWithCopy = z;
            return this;
        }

        public final a e(int i2) {
            this.f150865a.rotate = i2;
            return this;
        }

        public final a f(int i2) {
            this.f150865a.resizeMode = i2;
            return this;
        }

        public final a g(int i2) {
            this.f150865a.gopSize = i2;
            return this;
        }

        public final a a(int i2) {
            this.f150865a.fps = i2;
            return this;
        }

        public final a b(int i2) {
            this.f150865a.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
            this.f150865a.bps = i2;
            return this;
        }

        public final a c(int i2) {
            this.f150865a.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
            this.f150865a.swCRF = i2;
            return this;
        }

        public final a d(int i2) {
            this.f150865a.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
            this.f150865a.swQP = i2;
            return this;
        }

        public final a e(boolean z) {
            this.f150865a.mRecordingMp4 = z;
            return this;
        }

        public final a c(boolean z) {
            return b(z);
        }

        public final a a(long j2) {
            this.f150865a.swMaxrate = j2;
            return this;
        }

        public final a b(String str) {
            this.f150865a.mDescription = str;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_STANDARD, java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i2) {
            this.f150866b = i2;
            VEVideoEncodeSettings vEVideoEncodeSettings = new VEVideoEncodeSettings();
            this.f150865a = vEVideoEncodeSettings;
            vEVideoEncodeSettings.encodeStandard = ((Integer) u.a().a("ve_compile_codec_type", (Object) 0)).intValue();
            this.f150867c.put(ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1, u.a().a("ve_compile_hw_bytevc1_max_pixel_count", (Object) 8294400));
            this.f150865a.enableByteVCRemuxVideo = ((Boolean) u.a().a("vesdk_use_bytevcremux_in_publish", (Object) false)).booleanValue();
        }

        private void a(VEVideoEncodeSettings vEVideoEncodeSettings) {
            Integer num = this.f150867c.get(ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1);
            an.a("VEVideoEncodeSettings", "hw_bytevc1 objMaxPixelCount= " + num + " settings.encodeStandard= " + vEVideoEncodeSettings.encodeStandard);
            if (vEVideoEncodeSettings.encodeStandard == ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal() && num != null && this.f150865a.outputSize.width * this.f150865a.outputSize.height > num.intValue()) {
                an.a("VEVideoEncodeSettings", "hw_bytevc1 change encode standard outputsize= " + this.f150865a.outputSize.width + " x " + this.f150865a.outputSize.height);
                vEVideoEncodeSettings.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[Catch:{ JSONException -> 0x005b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void c(java.lang.String r7) {
            /*
            // Method dump skipped, instructions count: 120
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.a.c(java.lang.String):void");
        }

        public final a b(boolean z) {
            this.f150865a.isSupportHWEncoder = z;
            return this;
        }

        public final a a(COMPILE_TYPE compile_type) {
            this.f150865a.compileType = compile_type;
            return this;
        }

        private VEVideoCompileEncodeSettings a(JSONObject jSONObject) {
            int i2;
            long j2;
            int i3;
            int i4;
            int i5;
            double d2;
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            try {
                vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f150865a.isSupportHWEncoder;
                vEVideoCompileEncodeSettings.enableHwBufferEncode = this.f150865a.enableHwBufferEncode;
                String string = jSONObject.getString("encode_mode");
                if (!"unknown".equals(string) || this.f150866b != 2) {
                    vEVideoCompileEncodeSettings.useHWEncoder = "hw".equals(string);
                } else {
                    vEVideoCompileEncodeSettings.useHWEncoder = this.f150865a.isSupportHWEncoder;
                }
                vEVideoCompileEncodeSettings.mHWEncodeSetting = b(jSONObject);
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mCodecType = this.f150865a.encodeStandard;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f150866b != 2 || jSONObject.getJSONObject("sw").getInt("crf") != -1) {
                    i2 = jSONObject.getJSONObject("sw").getInt("crf");
                } else if (this.f150865a.isSupportHWEncoder) {
                    i2 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf;
                } else {
                    i2 = this.f150865a.swCRF;
                }
                vEVideoSWEncodeSettings.mCrf = i2;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = 0.0d;
                if (!jSONObject.getJSONObject("sw").isNull("qpoffset")) {
                    VEVideoSWEncodeSettings vEVideoSWEncodeSettings2 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                    if (this.f150866b != 2 || jSONObject.getJSONObject("sw").getDouble("qpoffset") != -1.0d) {
                        d2 = jSONObject.getJSONObject("sw").getDouble("qpoffset");
                    } else if (this.f150865a.isSupportHWEncoder) {
                        d2 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset;
                    } else {
                        d2 = this.f150865a.swQPOffset;
                    }
                    vEVideoSWEncodeSettings2.mQPOffset = d2;
                }
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings3 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f150866b != 2 || jSONObject.getJSONObject("sw").getInt("maxrate") != -1) {
                    j2 = (long) jSONObject.getJSONObject("sw").getInt("maxrate");
                } else if (this.f150865a.isSupportHWEncoder) {
                    j2 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate;
                } else {
                    j2 = this.f150865a.swMaxrate;
                }
                vEVideoSWEncodeSettings3.mMaxRate = j2;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings4 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f150866b != 2 || jSONObject.getJSONObject("sw").getInt("preset") != -1) {
                    i3 = jSONObject.getJSONObject("sw").getInt("preset");
                } else if (this.f150865a.isSupportHWEncoder) {
                    i3 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset;
                } else {
                    i3 = this.f150865a.swPreset;
                }
                vEVideoSWEncodeSettings4.mPreset = i3;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings5 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f150866b != 2 || !"unknown".equals(jSONObject.getJSONObject("sw").getString("profile"))) {
                    i4 = VEVideoEncodeProfile.valueOfString(jSONObject.getJSONObject("sw").getString("profile")).ordinal();
                } else if (this.f150865a.isSupportHWEncoder) {
                    i4 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile;
                } else {
                    i4 = this.f150865a.encodeProfile;
                }
                vEVideoSWEncodeSettings5.mProfile = i4;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings6 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f150866b != 2 || jSONObject.getJSONObject("sw").getInt("gop") != -1) {
                    i5 = jSONObject.getJSONObject("sw").getInt("gop");
                } else if (this.f150865a.isSupportHWEncoder) {
                    i5 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop;
                } else {
                    i5 = this.f150865a.gopSize;
                }
                vEVideoSWEncodeSettings6.mGop = i5;
            } catch (JSONException e2) {
                e2.printStackTrace();
                an.d("VEVideoEncodeSettings", "parseJsonToSetting : external json str parse error : " + e2.getLocalizedMessage());
            }
            return vEVideoCompileEncodeSettings;
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x0250  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0271  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0294  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x02b7  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01f3  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0212  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0231  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.ss.android.vesdk.settings.VEVideoHWEncodeSettings b(org.json.JSONObject r20) {
            /*
            // Method dump skipped, instructions count: 864
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.a.b(org.json.JSONObject):com.ss.android.vesdk.settings.VEVideoHWEncodeSettings");
        }

        public final a a(ENCODE_BITRATE_MODE encode_bitrate_mode) {
            this.f150865a.bitrateMode = encode_bitrate_mode;
            return this;
        }

        public final a a(ENCODE_PRESET encode_preset) {
            this.f150865a.swPreset = encode_preset.ordinal();
            return this;
        }

        public final a a(int i2, int i3) {
            this.f150865a.outputSize.width = i2;
            this.f150865a.outputSize.height = i3;
            return this;
        }

        public final a b(int i2, int i3) {
            this.f150865a.watermarkSize.width = i2;
            this.f150865a.watermarkSize.height = i3;
            return this;
        }

        public final a a(ENCODE_BITRATE_MODE encode_bitrate_mode, int i2) {
            this.f150865a.bitrateMode = encode_bitrate_mode;
            int i3 = AnonymousClass2.f150857a[encode_bitrate_mode.ordinal()];
            if (i3 == 1) {
                this.f150865a.bps = i2;
            } else if (i3 == 2) {
                this.f150865a.swCRF = i2;
            } else if (i3 == 3) {
                this.f150865a.swQP = i2;
            } else if (i3 == 4) {
                this.f150865a.bps = i2;
            } else {
                throw new IllegalStateException("CompileTime BUG. Unhandled enum value " + encode_bitrate_mode.toString());
            }
            return this;
        }
    }

    static {
        Covode.recordClassIndex(99232);
    }

    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_H264,
        ENCODE_STANDARD_ByteVC1,
        ENCODE_STANDARD_MPEG4;
        
        public static final Parcelable.Creator<ENCODE_STANDARD> CREATOR = new Parcelable.Creator<ENCODE_STANDARD>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_STANDARD.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99244);
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
            Covode.recordClassIndex(99243);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    public int getBitrateValue() {
        int i2 = AnonymousClass2.f150857a[this.bitrateMode.ordinal()];
        if (i2 == 1) {
            return getBps();
        }
        if (i2 == 2) {
            return getSwCRF();
        }
        if (i2 == 3) {
            return getSwQP();
        }
        if (i2 == 4) {
            return getBps();
        }
        throw new IllegalStateException("CompileTime BUG by SDK. Unhandled ENCODE_BITRATE_MODE enum value.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f150857a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f150858b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        static {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.AnonymousClass2.<clinit>():void");
        }
    }

    public enum COMPILE_TYPE implements Parcelable {
        COMPILE_TYPE_MP4,
        COMPILE_TYPE_GIF,
        COMPILE_TYPE_HIGH_GIF,
        COMPILE_TYPE_TRANSPARENT_GIF;
        
        public static final Parcelable.Creator<COMPILE_TYPE> CREATOR = new Parcelable.Creator<COMPILE_TYPE>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.COMPILE_TYPE.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99236);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ COMPILE_TYPE[] newArray(int i2) {
                return new COMPILE_TYPE[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ COMPILE_TYPE createFromParcel(Parcel parcel) {
                return COMPILE_TYPE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99235);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    public enum ENCODE_BITRATE_MODE implements Parcelable {
        ENCODE_BITRATE_ABR,
        ENCODE_BITRATE_CRF,
        ENCODE_BITRATE_QP,
        ENCODE_BITRATE_VBR;
        
        public static final Parcelable.Creator<ENCODE_BITRATE_MODE> CREATOR = new Parcelable.Creator<ENCODE_BITRATE_MODE>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99238);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ENCODE_BITRATE_MODE[] newArray(int i2) {
                return new ENCODE_BITRATE_MODE[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ENCODE_BITRATE_MODE createFromParcel(Parcel parcel) {
                return ENCODE_BITRATE_MODE.values()[parcel.readInt()];
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private static final ENCODE_BITRATE_MODE[] f150860a = values();

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99237);
        }

        public static ENCODE_BITRATE_MODE fromInteger(int i2) {
            return f150860a[i2];
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    public enum ENCODE_PROFILE implements Parcelable {
        ENCODE_PROFILE_UNKNOWN,
        ENCODE_PROFILE_BASELINE,
        ENCODE_PROFILE_MAIN,
        ENCODE_PROFILE_HIGH;
        
        public static final Parcelable.Creator<ENCODE_PROFILE> CREATOR = new Parcelable.Creator<ENCODE_PROFILE>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99242);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ENCODE_PROFILE[] newArray(int i2) {
                return new ENCODE_PROFILE[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ENCODE_PROFILE createFromParcel(Parcel parcel) {
                return ENCODE_PROFILE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99241);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    private void initFromVEConfigCenter() {
        boolean z = false;
        if (this.enableHwBufferEncode || ((Boolean) u.a().a("ve_enable_compile_buffer_hw_encode", (Object) false)).booleanValue()) {
            z = true;
        }
        this.enableHwBufferEncode = z;
        an.a("VEVideoEncodeSettings", "KEY_ENABLE_BUFFER_HW_COMPILE: " + this.enableHwBufferEncode);
        this.banExtraDataLoop = ((Boolean) u.a().a("ve_ban_hw_extra_data_loop", (Object) false)).booleanValue();
        an.a("VEVideoEncodeSettings", "AB isBanExtraDataLoop: " + this.banExtraDataLoop);
    }

    public enum ENCODE_PRESET implements Parcelable {
        ENCODE_LEVEL_ULTRAFAST,
        ENCODE_LEVEL_SUPERFAST,
        ENCODE_LEVEL_VERYFAST,
        ENCODE_LEVEL_FASTER,
        ENCODE_LEVEL_FAST,
        ENCODE_LEVEL_MEDIUM,
        ENCODE_LEVEL_SLOW,
        ENCODE_LEVEL_SLOWER,
        ENCODE_LEVEL_VERYSLOW,
        ENCODE_LEVEL_PLACEBO;
        
        public static final Parcelable.Creator<ENCODE_PRESET> CREATOR = new Parcelable.Creator<ENCODE_PRESET>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99240);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ENCODE_PRESET[] newArray(int i2) {
                return new ENCODE_PRESET[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ENCODE_PRESET createFromParcel(Parcel parcel) {
                return ENCODE_PRESET.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99239);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    private VEVideoEncodeSettings() {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.outputSize.width = 576;
        this.outputSize.height = 1024;
        this.watermarkSize.width = -1;
        this.watermarkSize.height = -1;
        this.fps = -1;
        this.bps = 4194304;
        this.isSupportHWEncoder = true;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public String toString() {
        return "VEVideoEncodeSettings{compileType=" + this.compileType + ", rotate=" + this.rotate + ", resizeMode=" + this.resizeMode + ", resizeX=" + this.resizeX + ", resizeY=" + this.resizeY + ", speed=" + this.speed + ", outputSize=" + this.outputSize + ", watermarkSize=" + this.watermarkSize + ", bitrateMode=" + this.bitrateMode + ", bps=" + this.bps + ", swCRF=" + this.swCRF + ", swQPOffset=" + this.swQPOffset + ", swQP=" + this.swQP + ", fps=" + this.fps + ", gopSize=" + this.gopSize + ", swPreset=" + this.swPreset + ", encodeStandard=" + this.encodeStandard + ", encodeProfile=" + this.encodeProfile + ", swMaxrate=" + this.swMaxrate + ", isSupportHWEncoder=" + this.isSupportHWEncoder + ", enableHwBufferEncode=" + this.enableHwBufferEncode + ", enableRemuxVideo=" + this.enableRemuxVideo + ", enableRemuxVideoForRotation=" + this.enableRemuxVideoForRotation + ", enableRemuxVideoForShoot=" + this.enableRemuxVideoForShoot + ", enableByteVCRemuxVideo=" + this.enableByteVCRemuxVideo + ", enableInterLeave=" + this.enableInterLeave + ", hasBFrame=" + this.hasBFrame + ", mWatermarkParam=" + this.mWatermarkParam + ", mVideoWatermarkCompileEncodeSetting=" + this.mVideoWatermarkCompileEncodeSetting + ", mVideoCompileEncodeSetting=" + this.mVideoCompileEncodeSetting + ", mOptRemuxWithCopy=" + this.mOptRemuxWithCopy + ", mReEncodeOpt=" + this.mReEncodeOpt + ", mDescripiton=" + this.mDescription + ", mComment=" + this.mComment + '}';
    }

    public void setCompileType(COMPILE_TYPE compile_type) {
        this.compileType = compile_type;
    }

    public void setEnableInterLeave(boolean z) {
        this.enableInterLeave = z;
    }

    public void setEnableRemuxVideo(boolean z) {
        this.enableRemuxVideo = z;
    }

    public void setEnableRemuxVideoForRotation(boolean z) {
        this.enableRemuxVideoForRotation = z;
    }

    public void setEnableRemuxVideoForShoot(boolean z) {
        this.enableRemuxVideoForShoot = z;
    }

    public void setEnableRemuxVideoRes(int i2) {
        this.enableRemuxVideoRes = i2;
    }

    public void setFps(int i2) {
        this.fps = i2;
    }

    public void setGopSize(int i2) {
        this.gopSize = i2;
    }

    public void setResizeMode(int i2) {
        this.resizeMode = i2;
    }

    public void setResizeX(float f2) {
        this.resizeX = f2;
    }

    public void setResizeY(float f2) {
        this.resizeY = f2;
    }

    public void setRotate(int i2) {
        this.rotate = i2;
    }

    public void setSpeed(float f2) {
        this.speed = f2;
    }

    public void setSupportHwEnc(boolean z) {
        this.isSupportHWEncoder = z;
    }

    public void setBps(int i2) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR;
        this.bps = i2;
    }

    public void setEncodeProfile(ENCODE_PROFILE encode_profile) {
        this.encodeProfile = encode_profile.ordinal();
    }

    public void setQP(int i2) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
        this.swQP = i2;
    }

    public void setSWCRF(int i2) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        this.swCRF = i2;
    }

    public void setSwPreset(ENCODE_PRESET encode_preset) {
        this.swPreset = encode_preset.ordinal();
    }

    public void setVideoSWOptCrf(int i2) {
        this.mVideoCompileEncodeSetting.mSWEncodeSetting.mCrf = i2;
    }

    public boolean setVideoHwEnc(boolean z) {
        if (this.mVideoCompileEncodeSetting.isSupportHWEncoder) {
            this.mVideoCompileEncodeSetting.useHWEncoder = z;
        } else {
            this.mVideoCompileEncodeSetting.useHWEncoder = false;
        }
        return this.mVideoCompileEncodeSetting.useHWEncoder;
    }

    public boolean setWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam == null) {
            this.mWatermarkParam = null;
            return true;
        } else if (vEWatermarkParam.getEntities() == null) {
            return false;
        } else {
            this.mWatermarkParam = vEWatermarkParam;
            return true;
        }
    }

    public void adjustVideoCompileEncodeSetting(int i2) {
        if (i2 == 1) {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = this.mVideoWatermarkCompileEncodeSetting;
            if (vEVideoCompileEncodeSettings != null) {
                this.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            }
            if (this.watermarkSize.isValid()) {
                this.outputSize.width = this.watermarkSize.width;
                this.outputSize.height = this.watermarkSize.height;
            }
        } else if (i2 == 2) {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings2 = this.mVideoCompileEncodeSetting;
            if (vEVideoCompileEncodeSettings2 != null) {
                this.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings2;
            }
            if (this.outputSize.isValid()) {
                this.watermarkSize.width = this.outputSize.width;
                this.watermarkSize.height = this.outputSize.height;
            }
        }
    }

    protected VEVideoEncodeSettings(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        boolean z12 = false;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.compileType = (COMPILE_TYPE) parcel.readParcelable(COMPILE_TYPE.class.getClassLoader());
        this.rotate = parcel.readInt();
        this.resizeMode = parcel.readInt();
        this.resizeX = parcel.readFloat();
        this.resizeY = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.outputSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.watermarkSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.bitrateMode = (ENCODE_BITRATE_MODE) parcel.readParcelable(ENCODE_BITRATE_MODE.class.getClassLoader());
        this.bps = parcel.readInt();
        this.fps = parcel.readInt();
        this.swCRF = parcel.readInt();
        this.swQPOffset = parcel.readDouble();
        this.swQP = parcel.readInt();
        this.gopSize = parcel.readInt();
        this.swPreset = parcel.readInt();
        this.encodeStandard = parcel.readInt();
        this.encodeProfile = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSupportHWEncoder = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.enableRemuxVideo = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.enableRemuxVideoForRotation = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.enableRemuxVideoForShoot = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.enableInterLeave = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.hasBFrame = z6;
        this.swMaxrate = parcel.readLong();
        this.mWatermarkParam = (VEWatermarkParam) parcel.readParcelable(VEWatermarkParam.class.getClassLoader());
        this.mVideoWatermarkCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.mVideoCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.externalSettingsJsonStr = parcel.readString();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.mOptRemuxWithCopy = z7;
        this.mDescription = parcel.readString();
        this.mComment = parcel.readString();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mCompileSoftInfo = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mRecordingMp4 = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.enableHwBufferEncode = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mReEncodeOpt = z11;
        this.mResolutionAlign = parcel.readInt();
        this.banExtraDataLoop = parcel.readByte() != 0 ? true : z12;
    }

    public void setEnableRemuxVideo(boolean z, boolean z2) {
        this.enableRemuxVideo = z;
        this.enableRemuxVideoForRotation = z2;
    }

    public void setVideoRes(int i2, int i3) {
        this.outputSize.width = i2;
        this.outputSize.height = i3;
    }

    public void setWatermarkVideoRes(int i2, int i3) {
        this.watermarkSize.width = i2;
        this.watermarkSize.height = i3;
    }

    public void setVideoBitrate(ENCODE_BITRATE_MODE encode_bitrate_mode, int i2) {
        this.bitrateMode = encode_bitrate_mode;
        int i3 = AnonymousClass2.f150857a[this.bitrateMode.ordinal()];
        if (i3 == 1) {
            this.bps = i2;
        } else if (i3 == 2) {
            this.swCRF = i2;
        } else if (i3 == 3) {
            this.swQP = i2;
        } else if (i3 == 4) {
            this.bps = i2;
        } else {
            throw new IllegalStateException("CompileTime BUG by sdk. Unhandled bitrateMode");
        }
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.compileType, i2);
        parcel.writeInt(this.rotate);
        parcel.writeInt(this.resizeMode);
        parcel.writeFloat(this.resizeX);
        parcel.writeFloat(this.resizeY);
        parcel.writeFloat(this.speed);
        parcel.writeParcelable(this.outputSize, i2);
        parcel.writeParcelable(this.watermarkSize, i2);
        parcel.writeParcelable(this.bitrateMode, i2);
        parcel.writeInt(this.bps);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.swCRF);
        parcel.writeDouble(this.swQPOffset);
        parcel.writeInt(this.swQP);
        parcel.writeInt(this.gopSize);
        parcel.writeInt(this.swPreset);
        parcel.writeInt(this.encodeStandard);
        parcel.writeInt(this.encodeProfile);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideo ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideoForRotation ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideoForShoot ? (byte) 1 : 0);
        parcel.writeByte(this.enableInterLeave ? (byte) 1 : 0);
        parcel.writeByte(this.hasBFrame ? (byte) 1 : 0);
        parcel.writeLong(this.swMaxrate);
        parcel.writeParcelable(this.mWatermarkParam, i2);
        parcel.writeParcelable(this.mVideoWatermarkCompileEncodeSetting, i2);
        parcel.writeParcelable(this.mVideoCompileEncodeSetting, i2);
        parcel.writeString(this.externalSettingsJsonStr);
        parcel.writeByte(this.mOptRemuxWithCopy ? (byte) 1 : 0);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mComment);
        parcel.writeByte(this.mCompileSoftInfo ? (byte) 1 : 0);
        parcel.writeByte(this.mRecordingMp4 ? (byte) 1 : 0);
        parcel.writeByte(this.enableHwBufferEncode ? (byte) 1 : 0);
        parcel.writeByte(this.mReEncodeOpt ? (byte) 1 : 0);
        parcel.writeInt(this.mResolutionAlign);
        parcel.writeByte(this.banExtraDataLoop ? (byte) 1 : 0);
    }

    public float setVideoHWoptBitrate(int i2, float f2, boolean z) {
        long j2;
        float f3;
        float f4 = f2;
        an.a("VEVideoEncodeSettings", "compileProbe setVideoHWoptBitrate start! optBitrate= ".concat(String.valueOf(f4)));
        float f5 = 0.0f;
        if (f4 < 0.0f) {
            an.d("VEVideoEncodeSettings", "compileProbe HW setVideoHWoptBitrate optBitrate error");
            return -1.0f;
        }
        int min = Math.min(this.outputSize.width, this.outputSize.height);
        int abs = Math.abs(i2 - min);
        if (((i2 <= 572 || i2 >= 580) && (i2 <= 716 || i2 >= 724)) || abs <= 8) {
            if (i2 > 1076 && i2 < 1089) {
                if (z) {
                    if (abs > 8) {
                        an.d("VEVideoEncodeSettings", "compileProbe 1080P_HD: output resolution is not as expected");
                        return -1.0f;
                    }
                } else if (abs < 8) {
                    an.d("VEVideoEncodeSettings", "compileProbe 1080P: output resolution is not as expected");
                    return -1.0f;
                }
            }
            if (min <= 716 || min >= 724) {
                if (min <= 572 || min >= 580) {
                    if (min <= 1076 || min >= 1089) {
                        an.d("VEVideoEncodeSettings", "compileProbe output resolution error");
                        return -1.0f;
                    }
                    double d2 = (double) f4;
                    double d3 = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mFullHd_bitrate_ratio;
                    Double.isNaN(d2);
                    f4 = (float) (d2 / d3);
                    j2 = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate;
                } else if (!z) {
                    double d4 = (double) f4;
                    double d5 = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mSd_bitrate_ratio;
                    Double.isNaN(d4);
                    f4 = (float) (d4 / d5);
                    j2 = this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate;
                } else {
                    f4 = ((float) this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate) / 1000.0f;
                    float f6 = f4 * 1000.0f;
                    this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = (long) f6;
                    an.a("VEVideoEncodeSettings", "compileProbe HW setVideoHWoptBitrate end! optBitrate= " + f6 + " diff_bitrate =" + f5);
                    return f5;
                }
                f3 = ((float) j2) / 1000.0f;
            } else {
                f3 = (float) (this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate / 1000);
            }
            f5 = f4 - f3;
            float f62 = f4 * 1000.0f;
            this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = (long) f62;
            an.a("VEVideoEncodeSettings", "compileProbe HW setVideoHWoptBitrate end! optBitrate= " + f62 + " diff_bitrate =" + f5);
            return f5;
        }
        an.d("VEVideoEncodeSettings", "compileProbe 576P || 720P: output resolution is not as expected");
        return -1.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.vesdk.j setVideoHWoptBitrate(com.ss.android.vesdk.VESize r23, com.ss.android.vesdk.s r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.setVideoHWoptBitrate(com.ss.android.vesdk.VESize, com.ss.android.vesdk.s, java.lang.String):com.ss.android.vesdk.j");
    }

    private float[] bitrateRangeSettingsJsonStr(String str, boolean z, float f2, int i2) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = new JSONArray();
            if (716 < i2 && i2 < 724) {
                jSONArray = z ? jSONObject.optJSONArray("720P_HD") : f2 == 7000.0f ? jSONObject.optJSONArray("720P_Base_7Mb") : jSONObject.optJSONArray("720P");
            } else if (1076 < i2 && i2 < 1089) {
                jSONArray = jSONObject.optJSONArray("1080P");
            } else if (572 < i2 && i2 < 580) {
                jSONArray = f2 == 7000.0f ? jSONObject.optJSONArray("576P_Base_7Mb") : jSONObject.optJSONArray("576P");
            }
            if (jSONArray == null) {
                an.d("VEVideoEncodeSettings", "bitrateRange json parse failed");
                return null;
            }
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                fArr[i3] = (float) jSONArray.getDouble(i3);
            }
            return fArr;
        } catch (JSONException e2) {
            e2.printStackTrace();
            an.d("VEVideoEncodeSettings", "bitrateRange json str parse error : " + e2.getLocalizedMessage());
        }
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i2, int i3) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i2;
        this.gopSize = i3;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0208, code lost:
        if (r4 > r2) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0259, code lost:
        if (r4 < r2) goto L_0x020a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.vesdk.ar getHwAdaptiveBitrate(int r27, com.ss.android.vesdk.s r28, float r29, java.lang.String r30, java.lang.String r31) {
        /*
        // Method dump skipped, instructions count: 604
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.getHwAdaptiveBitrate(int, com.ss.android.vesdk.s, float, java.lang.String, java.lang.String):com.ss.android.vesdk.ar");
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i2, int i3, int i4, int i5, boolean z2) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.banExtraDataLoop = false;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i2;
        this.gopSize = i3;
        this.bps = i4;
        this.swPreset = i5;
        this.hasBFrame = z2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    private float get_adaptive_encode_bitrate(int i2, int i3, int i4, int i5, int i6, float f2, float f3, float[] fArr, float f4) {
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float[] fArr6;
        float[] fArr7;
        float f5;
        float f6;
        float f7;
        float f8;
        if (i5 == 17 || i5 == 18) {
            double d2 = (double) (i6 / 1000);
            Double.isNaN(d2);
            int i7 = (int) (d2 * 0.8d);
            an.a("VEVideoEncodeSettings", "compileProbe parameters encode_type =" + i4 + " pre_crf =" + i5 + " pre_maxrate =" + i7 + " pre_bitrate =" + f2 + " pre_psnr =" + f3 + " bitrate_base =" + f4 + " inlength =" + i2 + " outlength =" + i3);
            if (572 < i2 && i2 < 580) {
                fArr2 = new float[]{0.22f, 0.2f, 0.18f, 0.1f, 0.02f, -0.1f};
                fArr3 = new float[]{0.88f, 1.0f, 1.13f, 1.3f};
                fArr4 = new float[]{-0.61f, 0.0f, 0.63f, 1.25f};
                fArr5 = new float[]{1.02f, 1.03f, 1.02f};
                fArr6 = new float[]{0.16f, 0.18f, 0.21f};
                fArr7 = new float[]{2500.0f, 3500.0f, 4500.0f, 5500.0f};
                f5 = 0.0f;
            } else if (716 < i2 && i2 < 724) {
                fArr2 = new float[]{0.2f, 0.18f, 0.15f, 0.013f, 0.02f, -0.1f};
                fArr3 = new float[]{0.89f, 1.0f, 1.13f, 1.28f};
                fArr4 = new float[]{-0.6f, 0.0f, 0.61f, 1.24f};
                fArr5 = new float[]{1.01f, 1.0f, 0.99f};
                fArr6 = new float[]{0.18f, 0.15f, 0.18f};
                fArr7 = new float[]{4000.0f, 5000.0f, 6000.0f, 7000.0f};
                f5 = 6000.0f;
            } else if (1076 >= i2 || i2 >= 1089) {
                an.d("VEVideoEncodeSettings", "compileProbe input resolution error");
                return -1.0f;
            } else {
                fArr2 = new float[]{0.02f, 0.01f, 0.0f, 0.0f, -0.03f, -0.08f};
                fArr3 = new float[]{0.86f, 1.0f, 1.1f, 1.24f};
                fArr4 = new float[]{-0.58f, 0.0f, 0.48f, 1.0f};
                fArr5 = new float[]{1.02f, 1.03f, 1.02f};
                fArr6 = new float[]{0.24f, 0.25f, 0.28f};
                fArr7 = new float[]{8500.0f, 9500.0f, 10500.0f, 11500.0f};
                f5 = 10500.0f;
            }
            float[] fArr8 = {0.0f, 42.0f, 45.0f, 46.0f, 48.0f, 50.0f, 101.0f};
            int i8 = (i5 - 18) + 1;
            float f9 = f2 * fArr3[i8];
            float f10 = f3 + fArr4[i8];
            if (i4 == 1) {
                f9 *= fArr5[i8];
                f10 = Math.min(f10 + fArr6[i8], fArr8[6]);
            }
            an.a("VEVideoEncodeSettings", "compileProbe according to encoder_type the calculation pre_bitrate= " + f9 + " pre_psnr =" + f10);
            int i9 = 0;
            if (Math.abs(i2 - i3) < 8) {
                f6 = fArr[fArr.length - 1];
                f7 = fArr[0];
                f5 = f4;
                fArr7 = fArr;
            } else {
                f6 = fArr7[fArr.length - 1];
                f7 = fArr7[0];
                f9 = Math.min(f9, (float) i7);
            }
            float f11 = (float) i7;
            float f12 = f6 - (((f6 - f7) * (f11 - f9)) / f11);
            int i10 = 0;
            while (true) {
                if (f10 > fArr8[i10] && f10 <= fArr8[i10 + 1]) {
                    f8 = f5 * fArr2[i10];
                    break;
                }
                i10++;
                if (i10 >= 6) {
                    f8 = 0.0f;
                    break;
                }
            }
            an.a("VEVideoEncodeSettings", "compileProbe bitrate_offset= ".concat(String.valueOf(f8)));
            float f13 = f12 + f8;
            an.a("VEVideoEncodeSettings", "compileProbe before trans_bitrate= ".concat(String.valueOf(f13)));
            if (f13 >= fArr7[0]) {
                if (f13 > fArr7[fArr7.length - 1]) {
                    i9 = fArr7.length - 1;
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= fArr7.length - 1) {
                            break;
                        }
                        if (f13 >= fArr7[i11]) {
                            int i12 = i11 + 1;
                            if (f13 < fArr7[i12]) {
                                i9 = f13 - fArr7[i11] < fArr7[i12] - f13 ? i11 : i12;
                            }
                        }
                        i11++;
                    }
                }
            }
            float f14 = fArr[i9];
            an.a("VEVideoEncodeSettings", "compileProbe  trans_bitrate= ".concat(String.valueOf(f14)));
            return f14;
        }
        an.d("VEVideoEncodeSettings", "compileProbe pre_crf illegal");
        return -1.0f;
    }
}
