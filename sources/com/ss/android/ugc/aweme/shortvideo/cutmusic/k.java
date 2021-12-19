package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.e;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;

public final class k {

    /* renamed from: f  reason: collision with root package name */
    public static volatile k f126400f = new k();

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap<String, com.ss.android.ugc.aweme.shortvideo.d> f126401g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public static final b f126402h = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f126403a;

    /* renamed from: b  reason: collision with root package name */
    public int f126404b;

    /* renamed from: c  reason: collision with root package name */
    public int f126405c;

    /* renamed from: d  reason: collision with root package name */
    public int f126406d;

    /* renamed from: e  reason: collision with root package name */
    public int f126407e;

    /* renamed from: i  reason: collision with root package name */
    private int f126408i;

    public interface a {
        static {
            Covode.recordClassIndex(82930);
        }

        void a(com.ss.android.ugc.aweme.shortvideo.d dVar);
    }

    public interface c {
        static {
            Covode.recordClassIndex(82934);
        }

        void a(Object obj);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(82931);
        }

        private b() {
        }

        /* access modifiers changed from: package-private */
        public static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f126409a;

            static {
                Covode.recordClassIndex(82932);
            }

            a(String str) {
                this.f126409a = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                TextUtils.isEmpty(this.f126409a);
                String str = this.f126409a;
                if (str == null) {
                    l.b();
                }
                return b.a(str);
            }
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static boolean a(float[] fArr) {
            if (fArr == null || fArr.length == 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.k$b$b  reason: collision with other inner class name */
        public static final class C3287b<TTaskResult, TContinuationResult> implements g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f126410a;

            static {
                Covode.recordClassIndex(82933);
            }

            C3287b(c cVar) {
                this.f126410a = cVar;
            }

            @Override // b.g
            public final Object then(i<com.ss.android.ugc.aweme.shortvideo.d> iVar) {
                c cVar = this.f126410a;
                if (cVar != null) {
                    if (iVar == null) {
                        cVar.a(null);
                    } else {
                        cVar.a(iVar.d());
                    }
                }
                return null;
            }
        }

        public static e.a a(Context context) {
            e.a aVar = new e.a();
            if (context == null) {
                return aVar;
            }
            aVar.f126373c = (int) n.b(context, 16.0f);
            aVar.f126372b = (int) n.b(context, 6.0f);
            aVar.f126371a = (int) n.b(context, 10.0f);
            aVar.f126378h = -1073741824;
            aVar.f126377g = -1;
            aVar.f126375e = (int) n.b(context, 4.0f);
            aVar.f126376f = (int) n.b(context, 2.0f);
            aVar.f126379i = (int) n.b(context, 11.0f);
            aVar.f126374d = (int) n.b(context, 8.0f);
            return aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
            if (r0 <= 0) goto L_0x0035;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ss.android.ugc.aweme.shortvideo.d a(java.lang.String r4) {
            /*
                java.lang.String r0 = ""
                h.f.b.l.d(r4, r0)
                java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.d> r0 = com.ss.android.ugc.aweme.shortvideo.cutmusic.k.f126401g
                java.lang.Object r0 = r0.get(r4)
                com.ss.android.ugc.aweme.shortvideo.d r0 = (com.ss.android.ugc.aweme.shortvideo.d) r0
                if (r0 == 0) goto L_0x0014
                com.ss.android.ugc.aweme.shortvideo.d r0 = com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a(r0)
                return r0
            L_0x0014:
                com.ss.android.ugc.aweme.port.in.aj r0 = com.ss.android.ugc.aweme.port.in.l.f115658a
                com.ss.android.ugc.aweme.port.in.aa r0 = r0.b()
                int r3 = r0.b(r4)
                r1 = 0
                if (r3 >= 0) goto L_0x0022
                return r1
            L_0x0022:
                r0 = 90000(0x15f90, float:1.26117E-40)
                if (r3 <= r0) goto L_0x0028
                return r1
            L_0x0028:
                r2 = 2000(0x7d0, float:2.803E-42)
                if (r3 <= 0) goto L_0x0048
                com.ss.android.ugc.aweme.shortvideo.cutmusic.k r1 = com.ss.android.ugc.aweme.shortvideo.cutmusic.k.f126400f
                r0 = 1
                int r0 = r1.a(r3, r0)
                if (r0 > 0) goto L_0x004a
            L_0x0035:
                r0 = 0
                com.ss.android.ttve.model.VEMusicWaveBean r0 = com.ss.android.vesdk.VEUtils.getMusicWaveData(r4, r0, r2)
                com.ss.android.ugc.aweme.shortvideo.d r2 = com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a(r0)
                java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.d> r1 = com.ss.android.ugc.aweme.shortvideo.cutmusic.k.f126401g
                com.ss.android.ugc.aweme.shortvideo.d r0 = com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a(r2)
                r1.put(r4, r0)
                return r2
            L_0x0048:
                r0 = 2000(0x7d0, float:2.803E-42)
            L_0x004a:
                r2 = r0
                goto L_0x0035
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cutmusic.k.b.a(java.lang.String):com.ss.android.ugc.aweme.shortvideo.d");
        }

        public static String a(long j2) {
            try {
                long j3 = j2 / 1000;
                String a2 = com.a.a(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / 60), Long.valueOf(j3 % 60)}, 2));
                l.b(a2, "");
                return a2;
            } catch (Exception unused) {
                bj.b("cut music duration:".concat(String.valueOf(j2)));
                return "00:00";
            }
        }

        public static void a(VEMusicWaveBean vEMusicWaveBean) {
            float[] waveBean;
            if (!(vEMusicWaveBean == null || (waveBean = vEMusicWaveBean.getWaveBean()) == null)) {
                l.b(waveBean, "");
                if (waveBean.length != 0) {
                    int length = waveBean.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (Float.isNaN(waveBean[i2])) {
                            waveBean[i2] = 0.0f;
                        }
                    }
                }
            }
        }

        public static com.ss.android.ugc.aweme.shortvideo.d a(String str, boolean z, c cVar) {
            if (!z) {
                i.b(new a(str), i.f4824a).a(new C3287b(cVar), i.f4826c, null);
                return null;
            } else if (TextUtils.isEmpty(str)) {
                return null;
            } else {
                if (str == null) {
                    l.b();
                }
                return a(str);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.d dVar, long j2, long j3) {
        if (j2 > 0) {
            this.f126407e = (int) j2;
        }
        int a2 = a((int) j3, false);
        if (dVar != null && b.a(dVar.getMusicWavePointArray()) && a2 > 0) {
            float[] musicWavePointArray = dVar.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                l.b();
            }
            if (musicWavePointArray.length > a2) {
                VEMusicWaveBean resampleMusicWaveData = VEUtils.getResampleMusicWaveData(dVar.getMusicWavePointArray(), 0, a2);
                b.a(resampleMusicWaveData);
                if (resampleMusicWaveData != null && b.a(resampleMusicWaveData.getWaveBean())) {
                    float[] waveBean = resampleMusicWaveData.getWaveBean();
                    l.b(waveBean, "");
                    float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
                    l.b(copyOf, "");
                    dVar.setMusicWavePointArray(copyOf);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(82929);
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f126411a;

        static {
            Covode.recordClassIndex(82935);
        }

        d(a aVar) {
            this.f126411a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.c
        public final void a(Object obj) {
            boolean z;
            StringBuilder sb = new StringBuilder("OLD_DRAFT AudioWaveDataIsNull:");
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            bj.a(sb.append(z).toString());
            a aVar = this.f126411a;
            if (aVar == null) {
                return;
            }
            if (obj == null || !(obj instanceof com.ss.android.ugc.aweme.shortvideo.d)) {
                aVar.a(null);
            } else {
                aVar.a((com.ss.android.ugc.aweme.shortvideo.d) obj);
            }
        }
    }

    public final int b(Context context) {
        l.d(context, "");
        int i2 = this.f126406d;
        return ((n.a(context) - ((int) n.b(context, 20.0f))) + i2) / (i2 + this.f126404b);
    }

    public static com.ss.android.ugc.aweme.shortvideo.d a(VEMusicWaveBean vEMusicWaveBean) {
        if (vEMusicWaveBean == null || !b.a(vEMusicWaveBean.getWaveBean())) {
            return null;
        }
        b.a(vEMusicWaveBean);
        com.ss.android.ugc.aweme.shortvideo.d dVar = new com.ss.android.ugc.aweme.shortvideo.d();
        float[] waveBean = vEMusicWaveBean.getWaveBean();
        l.b(waveBean, "");
        float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
        l.b(copyOf, "");
        dVar.setMusicWavePointArray(copyOf);
        return dVar;
    }

    public static com.ss.android.ugc.aweme.shortvideo.d b(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        if (cVar == null || !b.a(cVar.getMusicWaveData())) {
            return null;
        }
        com.ss.android.ugc.aweme.shortvideo.d dVar = new com.ss.android.ugc.aweme.shortvideo.d();
        float[] musicWaveData = cVar.getMusicWaveData();
        l.b(musicWaveData, "");
        float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
        l.b(copyOf, "");
        dVar.setMusicWavePointArray(copyOf);
        return dVar;
    }

    public static com.ss.android.ugc.aweme.shortvideo.d a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        if (cVar == null || !b.a(cVar.getMusicWaveData())) {
            return null;
        }
        com.ss.android.ugc.aweme.shortvideo.d dVar = new com.ss.android.ugc.aweme.shortvideo.d();
        float[] musicWaveData = cVar.getMusicWaveData();
        l.b(musicWaveData, "");
        float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
        l.b(copyOf, "");
        dVar.setMusicWavePointArray(copyOf);
        dVar.setMusicPath(com.ss.android.ugc.aweme.port.in.l.f115658a.b().b(cVar));
        return dVar;
    }

    public static void b(com.ss.android.ugc.aweme.shortvideo.d dVar) {
        if (dVar != null && b.a(dVar.getMusicWavePointArray())) {
            int length = dVar.getMusicWavePointArray().length;
            for (int i2 = 0; i2 < length; i2++) {
                if (dVar.getMusicWavePointArray()[i2] < 0.1f) {
                    dVar.getMusicWavePointArray()[i2] = 0.1f;
                }
            }
        }
    }

    public static com.ss.android.ugc.aweme.shortvideo.d a(com.ss.android.ugc.aweme.shortvideo.d dVar) {
        if (dVar == null || !b.a(dVar.getMusicWavePointArray())) {
            return dVar;
        }
        com.ss.android.ugc.aweme.shortvideo.d dVar2 = new com.ss.android.ugc.aweme.shortvideo.d();
        float[] musicWavePointArray = dVar.getMusicWavePointArray();
        float[] copyOf = Arrays.copyOf(musicWavePointArray, musicWavePointArray.length);
        l.b(copyOf, "");
        dVar2.setMusicWavePointArray(copyOf);
        dVar2.setMusicPath(dVar.getMusicPath());
        dVar2.setMusicLength(dVar.getMusicLength());
        dVar2.setVideoLenght(dVar.getVideoLenght());
        return dVar2;
    }

    public final int a(long j2) {
        if (j2 <= 0) {
            return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        int i2 = this.f126408i;
        int i3 = this.f126404b;
        return (i2 + i3) / (this.f126403a + i3);
    }

    public final void a(Context context) {
        l.d(context, "");
        this.f126403a = (int) n.b(context, 3.0f);
        this.f126404b = (int) n.b(context, 2.0f);
        this.f126405c = (int) n.b(context, 90.0f);
        this.f126406d = (int) n.b(context, 2.0f);
        this.f126408i = n.a(context) + 0;
    }

    public static void a(String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.a(null);
        } else {
            b.a(str, false, new d(aVar));
        }
    }

    public final int a(int i2, boolean z) {
        int i3 = this.f126407e;
        if (i3 <= 0) {
            return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        int i4 = this.f126408i;
        int i5 = this.f126404b;
        int i6 = (int) (((float) ((i4 + i5) / (this.f126403a + i5))) * 1.0f * ((((float) i2) * 1.0f) / ((float) i3)));
        if (!z || i6 >= 2000) {
            return i6;
        }
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }

    public static void a(com.ss.android.ugc.aweme.shortvideo.d dVar, int i2, int i3, int i4) {
        if (dVar != null) {
            float[] musicWavePointArray = dVar.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                l.b();
            }
            float f2 = (float) i4;
            int length = (int) (((((float) musicWavePointArray.length) * 1.0f) * ((float) i2)) / f2);
            float[] musicWavePointArray2 = dVar.getMusicWavePointArray();
            if (musicWavePointArray2 == null) {
                l.b();
            }
            int length2 = (int) (((((float) musicWavePointArray2.length) * 1.0f) * ((float) i3)) / f2);
            if (length2 > 0) {
                float[] fArr = new float[length2];
                float[] musicWavePointArray3 = dVar.getMusicWavePointArray();
                if (musicWavePointArray3 == null) {
                    l.b();
                }
                int length3 = musicWavePointArray3.length;
                boolean z = false;
                int i5 = length2 + length;
                int i6 = length;
                while (i6 < i5 && i6 < length3) {
                    fArr[i6 - length] = dVar.getMusicWavePointArray()[i6];
                    i6++;
                    z = true;
                }
                if (b.a(fArr) && z) {
                    dVar.setMusicWavePointArray(fArr);
                }
            }
        }
    }
}
