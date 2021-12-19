package com.ss.android.ugc.asve.context;

import android.view.SurfaceHolder;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.asve.b.f;
import com.ss.android.ugc.asve.recorder.e;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.p;
import java.io.File;

public interface h {

    public static final class a {
        static {
            Covode.recordClassIndex(38095);
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$a  reason: collision with other inner class name */
        public static final class C1351a implements c {
            static {
                Covode.recordClassIndex(38097);
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean c() {
                return true;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final int e() {
                return 10;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean f() {
                return false;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final int h() {
                return 0;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final int i() {
                return 2131232056;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final int[] j() {
                return new int[0];
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean k() {
                return false;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final VEDisplaySettings l() {
                return null;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean m() {
                return true;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final boolean n() {
                return false;
            }

            C1351a() {
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final com.ss.android.ugc.asve.b.c a() {
                return com.ss.android.ugc.asve.b.c.AS_CAMERA_LENS_FRONT;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final VECameraSettings.CAMERA_TYPE b() {
                return VECameraSettings.CAMERA_TYPE.TYPE1;
            }

            @Override // com.ss.android.ugc.asve.context.c
            public final byte d() {
                return f.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
            }
        }

        public static final class b implements f {
            static {
                Covode.recordClassIndex(38098);
            }

            @Override // com.ss.android.ugc.asve.context.f
            public final boolean a() {
                return false;
            }

            @Override // com.ss.android.ugc.asve.context.f
            public final String b() {
                return "";
            }

            @Override // com.ss.android.ugc.asve.context.f
            public final String c() {
                return "";
            }

            @Override // com.ss.android.ugc.asve.context.f
            public final int d() {
                return 0;
            }

            @Override // com.ss.android.ugc.asve.context.f
            public final int e() {
                return 0;
            }

            @Override // com.ss.android.ugc.asve.context.f
            public final boolean f() {
                return false;
            }

            b() {
            }
        }

        public static final class d implements g {
            static {
                Covode.recordClassIndex(38100);
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final String a() {
                return "";
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final String b() {
                return "";
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final float c() {
                return 0.66f;
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final boolean d() {
                return true;
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final int e() {
                return R.array.ak;
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final int f() {
                return R.array.aj;
            }

            @Override // com.ss.android.ugc.asve.context.g
            public final int g() {
                return R.drawable.bas;
            }

            d() {
            }
        }

        public static final class e implements com.ss.android.ugc.asve.recorder.e {

            /* renamed from: a  reason: collision with root package name */
            private final File f61954a;

            /* renamed from: b  reason: collision with root package name */
            private final File f61955b;

            /* renamed from: c  reason: collision with root package name */
            private final File f61956c;

            /* renamed from: d  reason: collision with root package name */
            private final File f61957d;

            /* renamed from: e  reason: collision with root package name */
            private final File f61958e;

            static {
                Covode.recordClassIndex(38101);
            }

            @Override // com.ss.android.ugc.asve.recorder.e
            public final File a() {
                return this.f61954a;
            }

            @Override // com.ss.android.ugc.asve.recorder.e
            public final File b() {
                return this.f61955b;
            }

            @Override // com.ss.android.ugc.asve.recorder.e
            public final File c() {
                return this.f61956c;
            }

            @Override // com.ss.android.ugc.asve.recorder.e
            public final File d() {
                return this.f61957d;
            }

            e() {
                File e2 = com.ss.android.ugc.asve.a.a().e();
                this.f61954a = e2;
                File file = new File(com.ss.android.ugc.asve.a.a().e(), "segs");
                this.f61955b = file;
                this.f61956c = new File(file, "video");
                this.f61957d = new File(file, DataType.AUDIO);
                this.f61958e = new File(e2, UGCMonitor.TYPE_PHOTO);
            }
        }

        static final class c extends m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f61953a = new c();

            static {
                Covode.recordClassIndex(38099);
            }

            c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }
    }

    static {
        Covode.recordClassIndex(38094);
    }

    boolean A();

    boolean B();

    boolean a();

    boolean b();

    boolean c();

    SurfaceHolder d();

    e e();

    p<Integer, Integer> f();

    boolean g();

    boolean h();

    boolean i();

    boolean j();

    h.f.a.a<Boolean> k();

    f l();

    g m();

    d n();

    c o();

    boolean p();

    boolean q();

    boolean r();

    long s();

    boolean t();

    int u();

    boolean v();

    boolean w();

    boolean x();

    boolean y();

    boolean z();
}
