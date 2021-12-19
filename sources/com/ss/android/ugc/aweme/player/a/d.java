package com.ss.android.ugc.aweme.player.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.e.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.video.h;
import com.ss.android.ugc.aweme.video.simplayer.f;
import com.ss.android.ugc.playerkit.model.o;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class d {
    public String A;
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public String E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: a  reason: collision with root package name */
    public VideoUrlModel f114960a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f114961b;

    /* renamed from: c  reason: collision with root package name */
    public String f114962c;

    /* renamed from: d  reason: collision with root package name */
    public int f114963d;

    /* renamed from: e  reason: collision with root package name */
    public long f114964e;

    /* renamed from: f  reason: collision with root package name */
    public int f114965f;

    /* renamed from: g  reason: collision with root package name */
    public int f114966g;

    /* renamed from: h  reason: collision with root package name */
    public int f114967h;

    /* renamed from: i  reason: collision with root package name */
    public int f114968i;

    /* renamed from: j  reason: collision with root package name */
    public int f114969j;

    /* renamed from: k  reason: collision with root package name */
    public h f114970k;

    /* renamed from: l  reason: collision with root package name */
    public i f114971l;

    /* renamed from: m  reason: collision with root package name */
    public al f114972m;
    public f n;
    public o o;
    public int p;
    public Context q;
    public com.ss.android.ugc.aweme.video.f.a r;
    public com.ss.android.ugc.aweme.feed.helper.d s;
    public HashMap<String, String> t;
    public int u = -1;
    public boolean v;
    public int w;
    public boolean x;
    public String y;
    public String z = "video_play_quality";

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f114984a;

        /* renamed from: b  reason: collision with root package name */
        public Long f114985b;

        static {
            Covode.recordClassIndex(73924);
        }
    }

    static {
        Covode.recordClassIndex(73921);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f114983a = new d();

        static {
            Covode.recordClassIndex(73923);
        }

        public final a a(String str) {
            this.f114983a.f114962c = str;
            return this;
        }

        public final a a(o oVar) {
            this.f114983a.o = oVar;
            return this;
        }

        public final a a(com.ss.android.ugc.aweme.video.f.a aVar) {
            this.f114983a.r = aVar;
            return this;
        }

        public final a a(boolean z) {
            this.f114983a.v = z;
            return this;
        }

        public final a a(String str, String str2) {
            if (this.f114983a.t == null) {
                this.f114983a.t = new HashMap<>();
            }
            this.f114983a.t.put(str, str2);
            return this;
        }

        public final a a() {
            this.f114983a.f114967h = 0;
            return this;
        }

        public final a b(int i2) {
            this.f114983a.f114965f = i2;
            return this;
        }

        public final a c(int i2) {
            this.f114983a.f114966g = i2;
            return this;
        }

        public final a d(int i2) {
            this.f114983a.f114963d = i2;
            return this;
        }

        public final a e(int i2) {
            this.f114983a.f114968i = i2;
            return this;
        }

        public final a f(int i2) {
            this.f114983a.f114969j = i2;
            return this;
        }

        public final a g(int i2) {
            this.f114983a.p = i2;
            return this;
        }

        public final a h(int i2) {
            this.f114983a.w = i2;
            return this;
        }

        public final a i(int i2) {
            this.f114983a.B = i2;
            return this;
        }

        public final a j(int i2) {
            this.f114983a.C = i2;
            return this;
        }

        public final a k(int i2) {
            this.f114983a.D = i2;
            return this;
        }

        public final a l(int i2) {
            this.f114983a.H = i2;
            return this;
        }

        public final a m(int i2) {
            this.f114983a.I = i2;
            return this;
        }

        public final a a(int i2) {
            this.f114983a.u = i2;
            return this;
        }

        public final a b(String str) {
            this.f114983a.A = str;
            return this;
        }

        public final a c(String str) {
            this.f114983a.E = str;
            return this;
        }

        public final a d(boolean z) {
            this.f114983a.G = z;
            return this;
        }

        public final a a(long j2) {
            this.f114983a.f114964e = j2;
            return this;
        }

        public final a b(boolean z) {
            this.f114983a.x = z;
            return this;
        }

        public final a c(boolean z) {
            this.f114983a.F = z;
            return this;
        }

        public final a a(Context context) {
            this.f114983a.q = context;
            return this;
        }

        public final a a(i iVar) {
            this.f114983a.f114971l = iVar;
            return this;
        }

        public final a a(com.ss.android.ugc.aweme.feed.helper.d dVar) {
            this.f114983a.s = dVar;
            return this;
        }

        public final a a(Aweme aweme) {
            this.f114983a.f114961b = aweme;
            return this;
        }

        public final a a(VideoUrlModel videoUrlModel) {
            this.f114983a.f114960a = videoUrlModel;
            return this;
        }

        public final a a(al alVar) {
            this.f114983a.f114972m = alVar;
            return this;
        }
    }

    public final void a() {
        o oVar;
        Aweme aweme;
        VideoUrlModel videoUrlModel;
        Context context = this.q;
        if (context != null && (oVar = this.o) != null && (aweme = this.f114961b) != null && (videoUrlModel = this.f114960a) != null) {
            a(context, aweme, this.p, this.f114971l, this.f114962c, oVar, videoUrlModel, this.f114970k, this.n);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (Float.MIN_VALUE != r8) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r11) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.a.d.a(org.json.JSONObject):void");
    }

    private void a(final Context context, final Aweme aweme, final int i2, final i iVar, final String str, final o oVar, final VideoUrlModel videoUrlModel, final h hVar, final f fVar) {
        b.i.b(new Callable<Object>() {
            /* class com.ss.android.ugc.aweme.player.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(73922);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:127:0x041c, code lost:
                if (com.ss.android.ugc.aweme.player.e.f115090c.f115011c == 1) goto L_0x041e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:135:0x043c, code lost:
                if (com.ss.android.ugc.aweme.player.c.f115058g != false) goto L_0x043e;
             */
            /* JADX WARNING: Removed duplicated region for block: B:130:0x0422 A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:131:0x0424 A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:134:0x0439 A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:139:0x044e A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:143:0x0476 A[Catch:{ Exception -> 0x064d }] */
            /* JADX WARNING: Removed duplicated region for block: B:153:0x0499 A[Catch:{ Exception -> 0x064d }, LOOP:1: B:151:0x0493->B:153:0x0499, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:158:0x04cf  */
            /* JADX WARNING: Removed duplicated region for block: B:159:0x04dd  */
            /* JADX WARNING: Removed duplicated region for block: B:162:0x04f6  */
            /* JADX WARNING: Removed duplicated region for block: B:165:0x0524  */
            /* JADX WARNING: Removed duplicated region for block: B:170:0x0541 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:173:0x0552 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:176:0x0563 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:179:0x0574 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:185:0x059b A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:188:0x05df A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:190:0x05ec A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:198:0x0616 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:203:0x0631 A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:207:0x063f A[Catch:{ Exception -> 0x0647 }] */
            /* JADX WARNING: Removed duplicated region for block: B:221:0x0689 A[Catch:{ JSONException -> 0x06a4 }] */
            @Override // java.util.concurrent.Callable
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object call() {
                /*
                // Method dump skipped, instructions count: 1709
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.a.d.AnonymousClass1.call():java.lang.Object");
            }
        }, r.a());
    }
}
