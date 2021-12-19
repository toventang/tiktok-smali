package com.ss.android.ugc.playerkit.model;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.g;
import java.util.List;
import java.util.Map;

public class m {
    public boolean A;
    public boolean B;
    public int C;
    public int D = 30;
    public int E = 576;
    public int F = 1024;
    public boolean G;
    public boolean H = true;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M = 2;
    public a N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public List<f> S;

    /* renamed from: a  reason: collision with root package name */
    public Context f148754a;

    /* renamed from: b  reason: collision with root package name */
    public e f148755b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f148756c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.playerkit.a.c f148757d;

    /* renamed from: e  reason: collision with root package name */
    public SparseIntArray f148758e;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray f148759f;

    /* renamed from: g  reason: collision with root package name */
    public b f148760g;

    /* renamed from: h  reason: collision with root package name */
    public int f148761h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f148762i;

    /* renamed from: j  reason: collision with root package name */
    public d f148763j;

    /* renamed from: k  reason: collision with root package name */
    public c f148764k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f148765l = true;

    /* renamed from: m  reason: collision with root package name */
    public int f148766m = 1;
    public int n;
    public boolean o = true;
    public int p;
    public int q;
    public int r;
    public g s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f148767a = 200;

        /* renamed from: b  reason: collision with root package name */
        public int f148768b = 1000;

        /* renamed from: c  reason: collision with root package name */
        public int f148769c = 5000;

        /* renamed from: d  reason: collision with root package name */
        public float f148770d = 9.0f;

        /* renamed from: e  reason: collision with root package name */
        public int f148771e = 200;

        /* renamed from: f  reason: collision with root package name */
        public int f148772f;

        static {
            Covode.recordClassIndex(98003);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f148786a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f148787b;

        static {
            Covode.recordClassIndex(98005);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(98006);
        }

        String a();

        Map<String, String> b();
    }

    static {
        Covode.recordClassIndex(98002);
    }

    public final void a() {
        this.f148761h |= 1;
    }

    public final void b() {
        this.f148761h |= 2;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static int f148773a = 1048576;

        /* renamed from: b  reason: collision with root package name */
        public static int f148774b = 409600;

        /* renamed from: c  reason: collision with root package name */
        public int f148775c = f148773a;

        /* renamed from: d  reason: collision with root package name */
        public int f148776d = f148774b;

        /* renamed from: e  reason: collision with root package name */
        public int f148777e = 1;

        /* renamed from: f  reason: collision with root package name */
        public int f148778f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f148779g = 2;

        /* renamed from: h  reason: collision with root package name */
        public int f148780h;

        /* renamed from: i  reason: collision with root package name */
        public int f148781i;

        /* renamed from: j  reason: collision with root package name */
        public int f148782j = 2;

        /* renamed from: k  reason: collision with root package name */
        public int f148783k = 5000;

        /* renamed from: l  reason: collision with root package name */
        public int f148784l = 10000;

        /* renamed from: m  reason: collision with root package name */
        public int f148785m;
        public int n;
        public int o;
        public int p;

        static {
            Covode.recordClassIndex(98004);
        }
    }

    public enum e {
        Ijk,
        IjkHardware,
        TT,
        EXO,
        TT_IJK_ENGINE,
        TT_HARDWARE,
        LIVE;

        static {
            Covode.recordClassIndex(98007);
        }
    }
}
