package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f61798a = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};
    public static final int[] ar = {2, 0, 1, 3};
    public static final int[] as = {1, 2, 0, 3};
    public int A = 1;
    public int B = 1;
    public Bundle C = new Bundle();
    public byte D = 1;
    public String E = "auto";
    public String F = "0";
    public String G = "-1";
    public d H = new d();
    public boolean I = true;
    public boolean J = false;
    public int K = 0;
    public int L = 0;
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public boolean P = false;
    public int Q = 50;
    public boolean R = false;
    public boolean S = false;
    public boolean T = false;
    public int U = 2500;
    public int V = 0;
    public int W = 30;
    public boolean X = false;
    public boolean Y = false;
    public boolean Z = false;
    public String aa = "";
    public int ab = 0;
    public String ac = "auto";
    public int ad = 1;
    public boolean ae = false;
    public boolean af = false;
    public boolean ag = false;
    public boolean ah = false;
    public final int ai = 5;
    public boolean aj = false;
    public boolean ak = false;
    public boolean al = false;
    public boolean am = false;
    public boolean an = false;
    public boolean ao = false;
    public float ap = -1.0f;
    public float aq = -1.0f;
    public a at = null;

    /* renamed from: b  reason: collision with root package name */
    public Context f61799b;

    /* renamed from: c  reason: collision with root package name */
    public int f61800c = 1;

    /* renamed from: d  reason: collision with root package name */
    public TEFrameRateRange f61801d = new TEFrameRateRange(7, 30);

    /* renamed from: e  reason: collision with root package name */
    public int f61802e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f61803f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f61804g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f61805h = 17;

    /* renamed from: i  reason: collision with root package name */
    public boolean f61806i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f61807j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f61808k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f61809l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f61810m = false;
    public boolean n = false;
    public float o = -1.0f;
    public TEFrameSizei p = new TEFrameSizei(1280, 720);
    public TEFrameSizei q = new TEFrameSizei(1920, 1080);
    public TEFrameSizei r = new TEFrameSizei(1920, 1080);
    public int s = 1;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 1;
    public boolean x = false;
    public boolean y = false;
    public int z = 0;

    public interface b {
        static {
            Covode.recordClassIndex(37990);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(37991);
        }
    }

    public interface e {
        static {
            Covode.recordClassIndex(37993);
        }

        void a(float[] fArr);
    }

    public interface g {
        static {
            Covode.recordClassIndex(37995);
        }
    }

    public interface h {
        static {
            Covode.recordClassIndex(37996);
        }

        void a(int[] iArr);
    }

    public interface i {
        static {
            Covode.recordClassIndex(37997);
        }
    }

    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public int f61828a;

        static {
            Covode.recordClassIndex(37998);
        }
    }

    /* renamed from: com.ss.android.ttvecamera.l$l  reason: collision with other inner class name */
    public interface AbstractC1345l {
        static {
            Covode.recordClassIndex(38000);
        }
    }

    public interface m {
        static {
            Covode.recordClassIndex(38001);
        }
    }

    public interface n {
        static {
            Covode.recordClassIndex(38002);
        }
    }

    public interface o {
        static {
            Covode.recordClassIndex(38003);
        }
    }

    public interface p {
        static {
            Covode.recordClassIndex(38004);
        }

        boolean enableSmooth();

        void onChange(int i2, float f2, boolean z);

        void onZoomSupport(int i2, boolean z, boolean z2, float f2, List<Integer> list);
    }

    public final void a() {
        this.f61799b = null;
        this.C.clear();
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f61823a;

        /* renamed from: b  reason: collision with root package name */
        public int f61824b;

        /* renamed from: c  reason: collision with root package name */
        public int f61825c;

        /* renamed from: d  reason: collision with root package name */
        public float f61826d;

        static {
            Covode.recordClassIndex(37992);
        }

        public final boolean a() {
            if (this.f61823a <= this.f61825c || this.f61826d <= 0.001f) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "ExposureCompensationInfo{max = " + this.f61823a + ", exposure = " + this.f61824b + ", min = " + this.f61825c + ", step = " + this.f61826d + "}";
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public EnumC1344a f61811a = EnumC1344a.DISABLED;

        /* renamed from: b  reason: collision with root package name */
        public b f61812b = b.DISABLED;

        /* renamed from: c  reason: collision with root package name */
        public c f61813c = c.DISABLED;

        /* renamed from: d  reason: collision with root package name */
        public d f61814d = d.FIXED;

        /* renamed from: e  reason: collision with root package name */
        public e f61815e = e.DISABLED;

        /* renamed from: f  reason: collision with root package name */
        public f f61816f = f.DISABLED;

        static {
            Covode.recordClassIndex(37983);
        }

        /* renamed from: com.ss.android.ttvecamera.l$a$a  reason: collision with other inner class name */
        public enum EnumC1344a {
            DISABLED,
            MESH3D;

            static {
                Covode.recordClassIndex(37984);
            }
        }

        public enum b {
            DISABLED,
            ENABLED;

            static {
                Covode.recordClassIndex(37985);
            }
        }

        public enum c {
            DISABLED,
            AUTOMATIC;

            static {
                Covode.recordClassIndex(37986);
            }
        }

        public enum d {
            FIXED,
            AUTO;

            static {
                Covode.recordClassIndex(37987);
            }
        }

        public enum e {
            DISABLED,
            AMBIENT_INTENSITY,
            ENVIRONMENTAL_HDR;

            static {
                Covode.recordClassIndex(37988);
            }
        }

        public enum f {
            DISABLED,
            HORIZONTAL,
            VERTICAL,
            HORIZONTAL_AND_VERTICAL;

            static {
                Covode.recordClassIndex(37989);
            }
        }
    }

    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        private static final Map<String, Class> f61829a;

        static {
            Covode.recordClassIndex(37999);
            HashMap hashMap = new HashMap();
            f61829a = hashMap;
            hashMap.put("enable_body_beauty", Boolean.class);
            hashMap.put("enable_light_soft", Boolean.class);
            hashMap.put("enable_anti_shake", Boolean.class);
            hashMap.put("video_path", String.class);
            hashMap.put("body_beauty_level", Integer.class);
            hashMap.put("enable_dim_light_quality", Boolean.class);
            hashMap.put("enable_ai_night_video", Boolean.class);
            hashMap.put("enable_video_stabilization", Boolean.class);
            hashMap.put("enable_super_Stabilization", Boolean.class);
            hashMap.put("enable_video_hdr", Boolean.class);
        }

        public static boolean a(String str, Object obj) {
            Map<String, Class> map = f61829a;
            if (!map.containsKey(str)) {
                return false;
            }
            if (obj == null || obj.getClass() == map.get(str)) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(37982);
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        static final Map<String, Class> f61827a;

        static {
            Covode.recordClassIndex(37994);
            HashMap hashMap = new HashMap();
            f61827a = hashMap;
            hashMap.put("facing", Integer.class);
            hashMap.put("device_support_wide_angle_mode", Integer.class);
            hashMap.put("device_support_antishake_mode", Integer.class);
            hashMap.put("device_support_ai_night_video", Integer.class);
            hashMap.put("support_light_soft", Boolean.class);
            hashMap.put("device_support_wide_angle", Boolean.class);
            hashMap.put("device_support_anti_shake", Boolean.class);
            hashMap.put("device_support_camera", Boolean.class);
            hashMap.put("device_wide_angle_camera_id", String.class);
            hashMap.put("support_wide_angle", Boolean.class);
            hashMap.put("support_telephoto", Boolean.class);
            hashMap.put("support_body_beauty", Boolean.class);
            hashMap.put("support_anti_shake", Boolean.class);
            hashMap.put("support_fps_480", Boolean.class);
            hashMap.put("support_fps_120", Boolean.class);
            hashMap.put("support_fps_60", Boolean.class);
            hashMap.put("support_preview_sizes", ArrayList.class);
            hashMap.put("support_picture_sizes", ArrayList.class);
            hashMap.put("camera_preview_size", TEFrameSizei.class);
            hashMap.put("camera_focus_parameters", TEFocusParameters.class);
            hashMap.put("camera_torch_supported", Boolean.class);
            hashMap.put("support_video_sizes", ArrayList.class);
            hashMap.put("camera_support_fps_range", ArrayList.class);
            hashMap.put("device_should_use_shader_zoom", Boolean.class);
            hashMap.put("device_support_multicamera_zoom", Boolean.class);
        }
    }

    public l(Context context) {
        this.f61799b = context;
    }

    public l(Context context, int i2) {
        this.f61799b = context;
        this.f61800c = i2;
    }

    public l(Context context, int i2, int i3, int i4) {
        this.f61799b = context;
        this.f61800c = i2;
        this.p.f61374a = i3;
        this.p.f61375b = i4;
    }
}
