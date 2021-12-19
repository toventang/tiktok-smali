package com.ss.android.vesdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.vesdk.u;

public class VECameraSettings implements Parcelable {
    public static final Parcelable.Creator<VECameraSettings> CREATOR = new Parcelable.Creator<VECameraSettings>() {
        /* class com.ss.android.vesdk.VECameraSettings.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99107);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VECameraSettings[] newArray(int i2) {
            return new VECameraSettings[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VECameraSettings createFromParcel(Parcel parcel) {
            return new VECameraSettings(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final String f150729a = VECameraSettings.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f150730d = {"auto", "action", "barcode", "beach", "candlelight", "fireworks", "hdr", "landscape", "night", "night-portrait", "party", "portrait", "snow", "sports", "steadyphoto", "sunset", "theatre"};
    public boolean A;
    public float B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public String I;
    public int J;
    public Bundle K;
    public CAMERA_CAPTURE_FLASH_STRATEGY L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    private CAMERA_TYPE U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private boolean ae;

    /* renamed from: b  reason: collision with root package name */
    int[] f150731b;

    /* renamed from: c  reason: collision with root package name */
    int[] f150732c;

    /* renamed from: e  reason: collision with root package name */
    public int f150733e;

    /* renamed from: f  reason: collision with root package name */
    public VESize f150734f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f150735g;

    /* renamed from: h  reason: collision with root package name */
    public CAMERA_HW_LEVEL f150736h;

    /* renamed from: i  reason: collision with root package name */
    public CAMERA_TYPE f150737i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f150738j;

    /* renamed from: k  reason: collision with root package name */
    public CAMERA_TYPE f150739k;

    /* renamed from: l  reason: collision with root package name */
    public CAMERA_FACING_ID f150740l;

    /* renamed from: m  reason: collision with root package name */
    public String f150741m;
    public String n;
    public boolean o;
    public b p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public byte v;
    public VESize w;
    public CAMERA_OUTPUT_MODE x;
    public boolean y;
    public CAMERA_MODE_TYPE z;

    public int describeContents() {
        return 0;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public VECameraSettings f150749a;

        static {
            Covode.recordClassIndex(99122);
        }

        public final a a() {
            this.f150749a.f150738j = true;
            return this;
        }

        public final a b() {
            this.f150749a.B = 1.0f;
            return this;
        }

        public a() {
            this.f150749a = new VECameraSettings((byte) 0);
        }

        public a(VECameraSettings vECameraSettings) {
            this.f150749a = vECameraSettings;
        }

        public final a a(byte b2) {
            this.f150749a.v = b2;
            return this;
        }

        public final a b(int i2) {
            this.f150749a.F = i2;
            return this;
        }

        public final a a(int i2) {
            this.f150749a.E = i2;
            return this;
        }

        public final a b(boolean z) {
            this.f150749a.y = z;
            return this;
        }

        public final a a(CAMERA_FACING_ID camera_facing_id) {
            this.f150749a.f150741m = (String) u.a().a("wide_camera_id", "-1");
            this.f150749a.f150740l = camera_facing_id;
            return this;
        }

        public final a a(CAMERA_OUTPUT_MODE camera_output_mode) {
            this.f150749a.x = camera_output_mode;
            return this;
        }

        public final a a(CAMERA_TYPE camera_type) {
            this.f150749a.f150737i = camera_type;
            this.f150749a.f150738j = false;
            return this;
        }

        public final a a(boolean z) {
            this.f150749a.o = z;
            return this;
        }

        public final a a(int[] iArr) {
            this.f150749a.f150735g = iArr;
            this.f150749a.p = b.DYNAMIC_FRAMERATE_WITHOUT_SELECT;
            return this;
        }

        public final a a(int i2, int i3) {
            this.f150749a.f150734f = new VESize(i2, i3);
            return this;
        }
    }

    public final CAMERA_TYPE a() {
        if (!this.f150738j) {
            return this.f150737i;
        }
        if (this.U == CAMERA_TYPE.NULL) {
            this.U = w();
        }
        return this.U;
    }

    public final boolean h() {
        if (this.ad || ((Boolean) u.a().a("ve_camera_scene_diff_fps_opt", (Object) false)).booleanValue()) {
            return true;
        }
        return false;
    }

    public final int i() {
        int intValue = ((Integer) u.a().a("ve_retry_count", (Object) 0)).intValue();
        if (intValue != 0) {
            this.E = intValue;
        }
        return this.E;
    }

    public final int j() {
        int intValue = ((Integer) u.a().a("ve_retry_start_preview_count", (Object) 0)).intValue();
        if (intValue != 0) {
            this.F = intValue;
        }
        return this.F;
    }

    public final boolean k() {
        boolean z2 = false;
        if (this.R || ((Boolean) u.a().a("ve_enable_refactor_camera_focus", (Object) false)).booleanValue()) {
            z2 = true;
        }
        this.R = z2;
        return z2;
    }

    public final boolean p() {
        boolean booleanValue = ((Boolean) u.a().a("is_use_setrecordinghint", Boolean.valueOf(this.W))).booleanValue();
        this.W = booleanValue;
        return booleanValue;
    }

    public final boolean q() {
        boolean booleanValue = ((Boolean) u.a().a("ve_camera_open_close_sync", Boolean.valueOf(this.X))).booleanValue();
        this.X = booleanValue;
        return booleanValue;
    }

    public final boolean r() {
        boolean booleanValue = ((Boolean) u.a().a("ve_force_close_camera_when_timeout", Boolean.valueOf(this.Y))).booleanValue();
        this.Y = booleanValue;
        return booleanValue;
    }

    public final boolean s() {
        boolean booleanValue = ((Boolean) u.a().a("ve_enable_vboost", Boolean.valueOf(this.Z))).booleanValue();
        this.Z = booleanValue;
        return booleanValue;
    }

    public final int t() {
        int intValue = ((Integer) u.a().a("ve_vboost_timeout", (Object) 500)).intValue();
        this.aa = intValue;
        return intValue;
    }

    public final int u() {
        int intValue = ((Integer) u.a().a("ve_camera_focus_timeout", (Object) 2500)).intValue();
        this.ab = intValue;
        return intValue;
    }

    public final int v() {
        int intValue = ((Integer) u.a().a("ve_enable_gc_for_camera_metadata", (Object) 0)).intValue();
        this.ac = intValue;
        return intValue;
    }

    public enum CAMERA_MODE_TYPE implements Parcelable {
        VIDEO_MODE,
        IMAGE_MODE,
        AR_MODE;
        
        public static final Parcelable.Creator<CAMERA_MODE_TYPE> CREATOR = new Parcelable.Creator<CAMERA_MODE_TYPE>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_MODE_TYPE.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99117);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_MODE_TYPE[] newArray(int i2) {
                return new CAMERA_MODE_TYPE[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_MODE_TYPE createFromParcel(Parcel parcel) {
                return CAMERA_MODE_TYPE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99116);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    public enum b {
        DYNAMIC_FRAMERATE,
        FIXED_FRAMERATE_FOR_ALL,
        FIXED_FRAMERATE_FOR_REAR,
        DYNAMIC_FRAMERATE_WITHOUT_SELECT;

        static {
            Covode.recordClassIndex(99123);
        }
    }

    static {
        Covode.recordClassIndex(99106);
    }

    public static boolean b() {
        u.d a2 = u.a().a("ve_disable_camera_hdr");
        if (a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a2.f151496b).booleanValue();
    }

    public static boolean c() {
        u.d a2 = u.a().a("ve_enable_camera_noise_reduce");
        if (a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a2.f151496b).booleanValue();
    }

    public static boolean d() {
        u.d a2 = u.a().a("ve_enable_camera_vendor_stable");
        if (a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a2.f151496b).booleanValue();
    }

    public static boolean e() {
        u.d a2 = u.a().a("ve_enable_camera_metadata");
        if (a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a2.f151496b).booleanValue();
    }

    public final int g() {
        u.d a2;
        if (this.q == 30 && (a2 = u.a().a("ve_camera_fps_max")) != null && (a2.f151496b instanceof Integer)) {
            this.q = ((Integer) a2.f151496b).intValue();
        }
        return this.q;
    }

    public final boolean l() {
        u.d a2;
        if (!this.r && (a2 = u.a().a("ve_enable_yuv_buffer_capture")) != null && a2.f151496b != null && (a2.f151496b instanceof Boolean) && ((Boolean) a2.f151496b).booleanValue()) {
            this.r = true;
        }
        return this.r;
    }

    public final boolean m() {
        if (!this.u) {
            boolean booleanValue = ((Boolean) u.a().a("ve_enable_face_detection", Boolean.valueOf(this.u))).booleanValue();
            this.u = booleanValue;
            this.K.putBoolean("useCameraFaceDetect", booleanValue);
        }
        return this.u;
    }

    public final boolean n() {
        this.V = ((Boolean) u.a().a("ve_enable_wide_fov_for_samsung", Boolean.valueOf(this.V))).booleanValue();
        an.b(f150729a, "getWideFOV: " + this.V);
        return this.V;
    }

    public enum CAMERA_CAPTURE_FLASH_STRATEGY implements Parcelable {
        PreAndMainStrategy,
        TorchFakeStrategy,
        FlashOnRealStrategy,
        FlashOnSimulatedStrategy;
        
        public static final Parcelable.Creator<CAMERA_CAPTURE_FLASH_STRATEGY> CREATOR = new Parcelable.Creator<CAMERA_CAPTURE_FLASH_STRATEGY>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_CAPTURE_FLASH_STRATEGY.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99109);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_CAPTURE_FLASH_STRATEGY[] newArray(int i2) {
                return new CAMERA_CAPTURE_FLASH_STRATEGY[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_CAPTURE_FLASH_STRATEGY createFromParcel(Parcel parcel) {
                return CAMERA_CAPTURE_FLASH_STRATEGY.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99108);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_FACING_ID implements Parcelable {
        FACING_BACK,
        FACING_FRONT,
        FACING_WIDE_ANGLE,
        FACING_TELEPHOTO,
        FACING_3RD;
        
        public static final Parcelable.Creator<CAMERA_FACING_ID> CREATOR = new Parcelable.Creator<CAMERA_FACING_ID>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99111);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_FACING_ID[] newArray(int i2) {
                return new CAMERA_FACING_ID[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_FACING_ID createFromParcel(Parcel parcel) {
                return CAMERA_FACING_ID.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99110);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_FLASH_MODE implements Parcelable {
        CAMERA_FLASH_OFF,
        CAMERA_FLASH_ON,
        CAMERA_FLASH_TORCH,
        CAMERA_FLASH_AUTO,
        CAMERA_FLASH_RED_EYE;
        
        public static final Parcelable.Creator<CAMERA_FLASH_MODE> CREATOR = new Parcelable.Creator<CAMERA_FLASH_MODE>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_FLASH_MODE.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99113);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_FLASH_MODE[] newArray(int i2) {
                return new CAMERA_FLASH_MODE[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_FLASH_MODE createFromParcel(Parcel parcel) {
                return CAMERA_FLASH_MODE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99112);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_HW_LEVEL implements Parcelable {
        CAMERA_HW_LEVEL_LEGACY,
        CAMERA_HW_LEVEL_LIMITED,
        CAMERA_HW_LEVEL_FULL,
        CAMERA_HW_LEVEL_LEVEL_3;
        
        public static final Parcelable.Creator<CAMERA_HW_LEVEL> CREATOR = new Parcelable.Creator<CAMERA_HW_LEVEL>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_HW_LEVEL.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99115);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_HW_LEVEL[] newArray(int i2) {
                return new CAMERA_HW_LEVEL[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_HW_LEVEL createFromParcel(Parcel parcel) {
                return CAMERA_HW_LEVEL.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99114);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_OUTPUT_MODE implements Parcelable {
        SURFACE,
        FRAME,
        SURFACE_FRAME,
        TWO_SURFACES;
        
        public static final Parcelable.Creator<CAMERA_OUTPUT_MODE> CREATOR = new Parcelable.Creator<CAMERA_OUTPUT_MODE>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99119);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_OUTPUT_MODE[] newArray(int i2) {
                return new CAMERA_OUTPUT_MODE[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_OUTPUT_MODE createFromParcel(Parcel parcel) {
                return CAMERA_OUTPUT_MODE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99118);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    private CAMERA_TYPE w() {
        int i2;
        CAMERA_TYPE camera_type = this.f150739k;
        u.d a2 = u.a().a("ve_camera_type");
        if (a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Integer)) {
            i2 = -1;
        } else {
            i2 = ((Integer) a2.f151496b).intValue();
            if (i2 == 0) {
                u.d a3 = u.a().a("ve_is_in_camera2_blocklist");
                if (!(a3 == null || a3.f151496b == null || !(a3.f151496b instanceof Boolean))) {
                    camera_type = ((Boolean) a3.f151496b).booleanValue() ? CAMERA_TYPE.TYPE1 : CAMERA_TYPE.TYPE2;
                }
            } else {
                camera_type = a(i2);
            }
        }
        an.a(f150729a, "getCameraTypeFromConfigCenter, cameraType = " + i2 + ", realCameraType = " + camera_type);
        return camera_type;
    }

    public final int[] f() {
        int intValue;
        if (!(this.p == b.DYNAMIC_FRAMERATE_WITHOUT_SELECT || this.f150735g[0] != 7 || (intValue = ((Integer) u.a().a("ve_camera_fps_range", (Object) 7)).intValue()) == 0)) {
            this.f150735g[0] = intValue;
        }
        an.a(f150729a, "Camera FpsRange:[" + this.f150735g[0] + ", " + this.f150735g[1] + "]");
        return this.f150735g;
    }

    public final b o() {
        if (this.p == b.DYNAMIC_FRAMERATE) {
            Integer num = (Integer) u.a().a("frame_rate_strategy", (Object) 0);
            if (num.intValue() == 1) {
                this.p = b.FIXED_FRAMERATE_FOR_ALL;
            } else if (num.intValue() == 2) {
                this.p = b.FIXED_FRAMERATE_FOR_REAR;
            } else if (num.intValue() == 3) {
                this.p = b.DYNAMIC_FRAMERATE_WITHOUT_SELECT;
            } else {
                this.p = b.DYNAMIC_FRAMERATE;
            }
        }
        return this.p;
    }

    public enum CAMERA_TYPE implements Parcelable {
        NULL,
        TYPE1,
        TYPE2,
        TYPE_OGXM,
        TYPE_GNOB,
        TYPE_CamKit,
        TYPE_BEWO,
        TYPE_GNOB_Unit,
        TYPE_OGXM_V2,
        TYPE_GNOB_MEDIA,
        TYPE_VENDOR_RDHW,
        TYPE_VENDOR_GNOB;
        
        public static final Parcelable.Creator<CAMERA_TYPE> CREATOR = new Parcelable.Creator<CAMERA_TYPE>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_TYPE.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99121);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ CAMERA_TYPE[] newArray(int i2) {
                return new CAMERA_TYPE[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CAMERA_TYPE createFromParcel(Parcel parcel) {
                return CAMERA_TYPE.values()[parcel.readInt()];
            }
        };

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(99120);
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(ordinal());
        }
    }

    private VECameraSettings() {
        this.f150731b = new int[]{2, 0, 1, 3};
        this.f150732c = new int[]{1, 2, 0, 3};
        this.f150733e = 30;
        this.f150734f = new VESize(720, 1280);
        this.f150735g = new int[]{7, 30};
        this.f150736h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f150737i = CAMERA_TYPE.TYPE1;
        this.U = CAMERA_TYPE.NULL;
        this.f150738j = false;
        this.f150739k = CAMERA_TYPE.TYPE2;
        this.f150740l = CAMERA_FACING_ID.FACING_FRONT;
        this.f150741m = "-1";
        this.n = "auto";
        this.o = false;
        this.p = b.DYNAMIC_FRAMERATE;
        this.V = false;
        this.W = false;
        this.X = true;
        this.Y = false;
        this.Z = false;
        this.aa = 50;
        this.ab = 2500;
        this.ac = 0;
        this.q = 30;
        this.ad = false;
        this.r = false;
        this.s = false;
        this.t = 0;
        this.u = false;
        this.v = 1;
        this.w = new VESize(-1, -1);
        this.x = CAMERA_OUTPUT_MODE.SURFACE;
        this.y = true;
        this.z = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.A = false;
        this.B = -1.0f;
        this.C = false;
        this.D = true;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.H = false;
        this.I = "";
        this.J = 1;
        this.L = CAMERA_CAPTURE_FLASH_STRATEGY.TorchFakeStrategy;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.ae = false;
        this.f150737i = CAMERA_TYPE.TYPE1;
        this.f150740l = CAMERA_FACING_ID.FACING_FRONT;
        this.f150733e = 30;
        this.f150734f.width = 720;
        this.f150734f.height = 1280;
        this.K = new Bundle();
    }

    /* synthetic */ VECameraSettings(byte b2) {
        this();
    }

    private static CAMERA_TYPE a(int i2) {
        switch (i2) {
            case 1:
                return CAMERA_TYPE.TYPE_OGXM;
            case 2:
                return CAMERA_TYPE.TYPE_GNOB;
            case 3:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            default:
                return CAMERA_TYPE.TYPE2;
            case 4:
                return CAMERA_TYPE.TYPE_BEWO;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return CAMERA_TYPE.TYPE_GNOB_MEDIA;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return CAMERA_TYPE.TYPE_VENDOR_RDHW;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return CAMERA_TYPE.TYPE_VENDOR_GNOB;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return CAMERA_TYPE.TYPE_OGXM_V2;
        }
    }

    protected VECameraSettings(Parcel parcel) {
        CAMERA_HW_LEVEL camera_hw_level;
        CAMERA_TYPE camera_type;
        CAMERA_TYPE camera_type2;
        boolean z2;
        CAMERA_FACING_ID camera_facing_id;
        boolean z3;
        b bVar;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        CAMERA_OUTPUT_MODE camera_output_mode;
        boolean z11;
        CAMERA_MODE_TYPE camera_mode_type;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        this.f150731b = new int[]{2, 0, 1, 3};
        this.f150732c = new int[]{1, 2, 0, 3};
        this.f150733e = 30;
        this.f150734f = new VESize(720, 1280);
        this.f150735g = new int[]{7, 30};
        this.f150736h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f150737i = CAMERA_TYPE.TYPE1;
        this.U = CAMERA_TYPE.NULL;
        boolean z22 = false;
        this.f150738j = false;
        this.f150739k = CAMERA_TYPE.TYPE2;
        this.f150740l = CAMERA_FACING_ID.FACING_FRONT;
        this.f150741m = "-1";
        this.n = "auto";
        this.o = false;
        this.p = b.DYNAMIC_FRAMERATE;
        this.V = false;
        this.W = false;
        this.X = true;
        this.Y = false;
        this.Z = false;
        this.aa = 50;
        this.ab = 2500;
        this.ac = 0;
        this.q = 30;
        this.ad = false;
        this.r = false;
        this.s = false;
        this.t = 0;
        this.u = false;
        this.v = 1;
        this.w = new VESize(-1, -1);
        this.x = CAMERA_OUTPUT_MODE.SURFACE;
        this.y = true;
        this.z = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.A = false;
        this.B = -1.0f;
        this.C = false;
        this.D = true;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.H = false;
        this.I = "";
        this.J = 1;
        this.L = CAMERA_CAPTURE_FLASH_STRATEGY.TorchFakeStrategy;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.ae = false;
        this.f150731b = parcel.createIntArray();
        this.f150732c = parcel.createIntArray();
        this.f150733e = parcel.readInt();
        this.f150734f = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.f150735g = parcel.createIntArray();
        int readInt = parcel.readInt();
        CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy = null;
        if (readInt == -1) {
            camera_hw_level = null;
        } else {
            camera_hw_level = CAMERA_HW_LEVEL.values()[readInt];
        }
        this.f150736h = camera_hw_level;
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            camera_type = null;
        } else {
            camera_type = CAMERA_TYPE.values()[readInt2];
        }
        this.f150737i = camera_type;
        int readInt3 = parcel.readInt();
        if (readInt3 == -1) {
            camera_type2 = null;
        } else {
            camera_type2 = CAMERA_TYPE.values()[readInt3];
        }
        this.U = camera_type2;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f150738j = z2;
        int readInt4 = parcel.readInt();
        if (readInt4 == -1) {
            camera_facing_id = null;
        } else {
            camera_facing_id = CAMERA_FACING_ID.values()[readInt4];
        }
        this.f150740l = camera_facing_id;
        this.f150741m = parcel.readString();
        this.n = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.o = z3;
        int readInt5 = parcel.readInt();
        if (readInt5 == -1) {
            bVar = null;
        } else {
            bVar = b.values()[readInt5];
        }
        this.p = bVar;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.V = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.W = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.X = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.Y = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.Z = z8;
        this.aa = parcel.readInt();
        this.ab = parcel.readInt();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.s = z9;
        this.t = parcel.readInt();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.u = z10;
        this.v = parcel.readByte();
        this.w = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        int readInt6 = parcel.readInt();
        if (readInt6 == -1) {
            camera_output_mode = null;
        } else {
            camera_output_mode = CAMERA_OUTPUT_MODE.values()[readInt6];
        }
        this.x = camera_output_mode;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.y = z11;
        int readInt7 = parcel.readInt();
        if (readInt7 == -1) {
            camera_mode_type = null;
        } else {
            camera_mode_type = CAMERA_MODE_TYPE.values()[readInt7];
        }
        this.z = camera_mode_type;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.A = z12;
        this.B = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.C = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.D = z14;
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.G = z15;
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.H = z16;
        this.I = parcel.readString();
        this.J = parcel.readInt();
        this.K = parcel.readBundle();
        int readInt8 = parcel.readInt();
        this.L = readInt8 != -1 ? CAMERA_CAPTURE_FLASH_STRATEGY.values()[readInt8] : camera_capture_flash_strategy;
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.M = z17;
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.N = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.R = z19;
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.S = z20;
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.T = z21;
        this.r = parcel.readByte() != 0 ? true : z22;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int ordinal;
        int ordinal2;
        int ordinal3;
        int ordinal4;
        int ordinal5;
        int ordinal6;
        int ordinal7;
        parcel.writeIntArray(this.f150731b);
        parcel.writeIntArray(this.f150732c);
        parcel.writeInt(this.f150733e);
        parcel.writeParcelable(this.f150734f, i2);
        parcel.writeIntArray(this.f150735g);
        CAMERA_HW_LEVEL camera_hw_level = this.f150736h;
        int i3 = -1;
        if (camera_hw_level == null) {
            ordinal = -1;
        } else {
            ordinal = camera_hw_level.ordinal();
        }
        parcel.writeInt(ordinal);
        CAMERA_TYPE camera_type = this.f150737i;
        if (camera_type == null) {
            ordinal2 = -1;
        } else {
            ordinal2 = camera_type.ordinal();
        }
        parcel.writeInt(ordinal2);
        CAMERA_TYPE camera_type2 = this.U;
        if (camera_type2 == null) {
            ordinal3 = -1;
        } else {
            ordinal3 = camera_type2.ordinal();
        }
        parcel.writeInt(ordinal3);
        parcel.writeByte(this.f150738j ? (byte) 1 : 0);
        CAMERA_FACING_ID camera_facing_id = this.f150740l;
        if (camera_facing_id == null) {
            ordinal4 = -1;
        } else {
            ordinal4 = camera_facing_id.ordinal();
        }
        parcel.writeInt(ordinal4);
        parcel.writeString(this.f150741m);
        parcel.writeString(this.n);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        b bVar = this.p;
        if (bVar == null) {
            ordinal5 = -1;
        } else {
            ordinal5 = bVar.ordinal();
        }
        parcel.writeInt(ordinal5);
        parcel.writeByte(this.V ? (byte) 1 : 0);
        parcel.writeByte(this.W ? (byte) 1 : 0);
        parcel.writeByte(this.X ? (byte) 1 : 0);
        parcel.writeByte(this.Y ? (byte) 1 : 0);
        parcel.writeByte(this.Z ? (byte) 1 : 0);
        parcel.writeInt(this.aa);
        parcel.writeInt(this.ab);
        parcel.writeByte(this.s ? (byte) 1 : 0);
        parcel.writeInt(this.t);
        parcel.writeByte(this.u ? (byte) 1 : 0);
        parcel.writeByte(this.v);
        parcel.writeParcelable(this.w, i2);
        CAMERA_OUTPUT_MODE camera_output_mode = this.x;
        if (camera_output_mode == null) {
            ordinal6 = -1;
        } else {
            ordinal6 = camera_output_mode.ordinal();
        }
        parcel.writeInt(ordinal6);
        parcel.writeByte(this.y ? (byte) 1 : 0);
        CAMERA_MODE_TYPE camera_mode_type = this.z;
        if (camera_mode_type == null) {
            ordinal7 = -1;
        } else {
            ordinal7 = camera_mode_type.ordinal();
        }
        parcel.writeInt(ordinal7);
        parcel.writeByte(this.A ? (byte) 1 : 0);
        parcel.writeFloat(this.B);
        parcel.writeByte(this.C ? (byte) 1 : 0);
        parcel.writeByte(this.D ? (byte) 1 : 0);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeByte(this.G ? (byte) 1 : 0);
        parcel.writeByte(this.H ? (byte) 1 : 0);
        parcel.writeString(this.I);
        parcel.writeInt(this.J);
        parcel.writeBundle(this.K);
        CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy = this.L;
        if (camera_capture_flash_strategy != null) {
            i3 = camera_capture_flash_strategy.ordinal();
        }
        parcel.writeInt(i3);
        parcel.writeByte(this.M ? (byte) 1 : 0);
        parcel.writeByte(this.N ? (byte) 1 : 0);
        parcel.writeByte(this.R ? (byte) 1 : 0);
        parcel.writeByte(this.S ? (byte) 1 : 0);
        parcel.writeByte(this.T ? (byte) 1 : 0);
        parcel.writeByte(this.r ? (byte) 1 : 0);
    }
}
