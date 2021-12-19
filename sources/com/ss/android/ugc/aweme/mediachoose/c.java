package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.mediachoose.g;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.setting.u;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.util.bt;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.v;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    boolean f109358a = true;

    /* renamed from: b  reason: collision with root package name */
    String f109359b = "";

    /* renamed from: c  reason: collision with root package name */
    final boolean f109360c = com.bytedance.ies.abmock.b.a().a(true, "creative_tools_upload_format_ext", false);

    /* renamed from: d  reason: collision with root package name */
    public final Context f109361d;

    /* renamed from: e  reason: collision with root package name */
    private final h f109362e = i.a((h.f.a.a) e.f109379a);

    static {
        Covode.recordClassIndex(70050);
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.g
    public final void a() {
        this.f109358a = false;
    }

    public final ExecutorService b() {
        return (ExecutorService) this.f109362e.getValue();
    }

    static final class e extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f109379a = new e();

        static {
            Covode.recordClassIndex(70059);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            l.a a2 = l.a(o.FIXED);
            a2.f79173b = "videoLegalCheck";
            return g.a(a2.a());
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaModel f109367a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f109368b;

        static {
            Covode.recordClassIndex(70056);
        }

        b(MediaModel mediaModel, z.c cVar) {
            this.f109367a = mediaModel;
            this.f109368b = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int[] iArr = new int[10];
            long currentTimeMillis = System.currentTimeMillis();
            String str = this.f109367a.f109390b;
            h.f.b.l.b(str, "");
            int a2 = com.ss.android.ugc.aweme.tools.c.c.a(str, iArr);
            long currentTimeMillis2 = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) (currentTimeMillis2 - currentTimeMillis));
            q.a("ve_get_video_info_consume_monitor", jSONObject, new ar().a());
            if (a2 == 0) {
                this.f109367a.f109400l = iArr[0];
                this.f109367a.f109401m = iArr[1];
                this.f109368b.element = iArr[8];
            }
            return Integer.valueOf(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.g
    public final void a(String str) {
        h.f.b.l.d(str, "");
        this.f109359b = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$c  reason: collision with other inner class name */
    static final class C2806c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f109369a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f109370b;

        static {
            Covode.recordClassIndex(70057);
        }

        C2806c(h.f.a.m mVar, z.c cVar) {
            this.f109369a = mVar;
            this.f109370b = cVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.a.m mVar = this.f109369a;
            h.f.b.l.b(iVar, "");
            Object d2 = iVar.d();
            h.f.b.l.b(d2, "");
            mVar.invoke(d2, Integer.valueOf(this.f109370b.element));
            return h.z.f158842a;
        }
    }

    public c(Context context) {
        h.f.b.l.d(context, "");
        this.f109361d = context;
    }

    public static final class d implements h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f109371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediaModel f109372b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f109373c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f109374d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f109375e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f109376f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f109377g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f109378h;

        static {
            Covode.recordClassIndex(70058);
        }

        @Override // com.ss.android.ugc.tools.utils.h.b
        public final void a(Object obj) {
            boolean z;
            Object obj2 = obj;
            if (!(obj2 instanceof Boolean)) {
                obj2 = null;
            }
            if (h.f.b.l.a(obj2, (Object) true)) {
                c cVar = this.f109371a;
                MediaModel mediaModel = this.f109372b;
                long j2 = this.f109373c;
                long j3 = this.f109374d;
                long j4 = this.f109375e;
                String str = this.f109376f;
                h.f.a.b bVar = this.f109377g;
                h.f.a.b bVar2 = this.f109378h;
                String str2 = mediaModel.f109398j;
                String str3 = "";
                if (str2 != null) {
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = str2.toLowerCase();
                    h.f.b.l.b(lowerCase, str3);
                    if (lowerCase != null) {
                        str3 = lowerCase;
                    }
                }
                if (TextUtils.isEmpty(mediaModel.f109398j) || !TextUtils.equals("video/mp4", str3)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!cVar.f109360c && !z) {
                    bj.a("LocalVideoLegalChecker ImportVideoTypeError:".concat(String.valueOf(str3)));
                    bVar2.invoke(new f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - j4, str, -2, str3));
                } else if (mediaModel.f109396h < j2) {
                    bVar2.invoke(new f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - j4, str, -1, ""));
                } else if (j3 != -1 && mediaModel.f109396h > j3) {
                    bVar2.invoke(new f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - j4, str, -6, ""));
                } else if (!com.ss.android.ugc.aweme.ftc.a.a(cVar.f109361d, com.ss.android.ugc.tools.utils.h.b(mediaModel), "video_upload")) {
                    if (f.f125945d) {
                        cVar.a("enter_from_single");
                    }
                    boolean equals = TextUtils.equals(cVar.f109359b, "enter_from_multi");
                    a aVar = new a(cVar, mediaModel, j2, j3, bVar, bVar2, j4, str, str3);
                    if (mediaModel.f109400l <= 0 || mediaModel.f109401m <= 0 || (!equals && h.j.h.c(mediaModel.f109400l, mediaModel.f109401m) > 1100)) {
                        z.c cVar2 = new z.c();
                        cVar2.element = 0;
                        b.i.b(new b(mediaModel, cVar2), cVar.b()).a(new C2806c(aVar, cVar2), b.i.f4826c, null);
                        return;
                    }
                    aVar.invoke(0, 0);
                }
            } else {
                this.f109378h.invoke(new f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - this.f109375e, this.f109376f, -4, ""));
            }
        }

        d(c cVar, MediaModel mediaModel, long j2, long j3, long j4, String str, h.f.a.b bVar, h.f.a.b bVar2) {
            this.f109371a = cVar;
            this.f109372b = mediaModel;
            this.f109373c = j2;
            this.f109374d = j3;
            this.f109375e = j4;
            this.f109376f = str;
            this.f109377g = bVar;
            this.f109378h = bVar2;
        }
    }

    static final class a extends m implements h.f.a.m<Integer, Integer, h.z> {
        final /* synthetic */ String $fileSuffix;
        final /* synthetic */ String $lowerCaseMediaMimeType;
        final /* synthetic */ long $maxDuration;
        final /* synthetic */ MediaModel $mediaModel;
        final /* synthetic */ long $minDuration;
        final /* synthetic */ h.f.a.b $onError;
        final /* synthetic */ h.f.a.b $onSuccess;
        final /* synthetic */ long $startTime;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(70051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, MediaModel mediaModel, long j2, long j3, h.f.a.b bVar, h.f.a.b bVar2, long j4, String str, String str2) {
            super(2);
            this.this$0 = cVar;
            this.$mediaModel = mediaModel;
            this.$minDuration = j2;
            this.$maxDuration = j3;
            this.$onSuccess = bVar;
            this.$onError = bVar2;
            this.$startTime = j4;
            this.$fileSuffix = str;
            this.$lowerCaseMediaMimeType = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(Integer num, Integer num2) {
            int i2;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (intValue != 0) {
                a aVar = new a(this.this$0.f109361d);
                aVar.f109328a = this.this$0.f109358a;
                aVar.a(this.$mediaModel, this.$minDuration, this.$maxDuration, this.$onSuccess, this.$onError);
            } else {
                int b2 = h.j.h.b(this.$mediaModel.f109400l, this.$mediaModel.f109401m);
                int c2 = h.j.h.c(this.$mediaModel.f109400l, this.$mediaModel.f109401m);
                boolean z = false;
                if (!bt.a()) {
                    if (c2 > 1100) {
                        this.$onError.invoke(new f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - this.$startTime, this.$fileSuffix, -5, ""));
                    }
                } else if (c2 > 1100) {
                    if (TextUtils.equals(this.this$0.f109359b, "enter_from_multi")) {
                        i2 = -8;
                    } else if (!u.a() && intValue2 != v.a.AV_CODEC_ID_H264.ordinal()) {
                        i2 = -7;
                    } else if (c2 > 2160 || b2 > 4096) {
                        i2 = -5;
                    } else {
                        b.i.b(new Callable(this) {
                            /* class com.ss.android.ugc.aweme.mediachoose.c.a.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ a f109363a;

                            static {
                                Covode.recordClassIndex(70052);
                            }

                            {
                                this.f109363a = r1;
                            }

                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return Integer.valueOf(VEUtils.isCanImport(this.f109363a.$mediaModel.f109390b));
                            }
                        }, this.this$0.b()).a(new b.g(this) {
                            /* class com.ss.android.ugc.aweme.mediachoose.c.a.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ a f109364a;

                            static {
                                Covode.recordClassIndex(70053);
                            }

                            {
                                this.f109364a = r1;
                            }

                            @Override // b.g
                            public final /* synthetic */ Object then(b.i iVar) {
                                h.f.b.l.b(iVar, "");
                                Integer num = (Integer) iVar.d();
                                if (num != null && num.intValue() == 0) {
                                    this.f109364a.$onSuccess.invoke(new f(true, "LocalVideoLegalChecker", System.currentTimeMillis() - this.f109364a.$startTime, this.f109364a.$fileSuffix, 0, ""));
                                } else {
                                    h.f.a.b bVar = this.f109364a.$onError;
                                    long currentTimeMillis = System.currentTimeMillis() - this.f109364a.$startTime;
                                    String str = this.f109364a.$fileSuffix;
                                    Object d2 = iVar.d();
                                    h.f.b.l.b(d2, "");
                                    bVar.invoke(new f(false, "LocalVideoLegalChecker", currentTimeMillis, str, ((Number) d2).intValue(), ""));
                                }
                                return h.z.f158842a;
                            }
                        }, b.i.f4826c, null);
                    }
                    this.$onError.invoke(new f(false, "LocalVideoLegalChecker", System.currentTimeMillis() - this.$startTime, this.$fileSuffix, i2, ""));
                }
                if (TextUtils.equals("video/mp4", this.$lowerCaseMediaMimeType) || TextUtils.equals("video/quicktime", this.$lowerCaseMediaMimeType)) {
                    z = true;
                }
                if (intValue2 != v.a.AV_CODEC_ID_H264.ordinal() || !z) {
                    b.i.b(new Callable(this) {
                        /* class com.ss.android.ugc.aweme.mediachoose.c.a.AnonymousClass3 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f109365a;

                        static {
                            Covode.recordClassIndex(70054);
                        }

                        {
                            this.f109365a = r1;
                        }

                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return Integer.valueOf(VEUtils.isCanImport(this.f109365a.$mediaModel.f109390b));
                        }
                    }, this.this$0.b()).a(new b.g(this) {
                        /* class com.ss.android.ugc.aweme.mediachoose.c.a.AnonymousClass4 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f109366a;

                        static {
                            Covode.recordClassIndex(70055);
                        }

                        {
                            this.f109366a = r1;
                        }

                        @Override // b.g
                        public final /* synthetic */ Object then(b.i iVar) {
                            h.f.b.l.b(iVar, "");
                            Integer num = (Integer) iVar.d();
                            if (num != null && num.intValue() == 0) {
                                this.f109366a.$onSuccess.invoke(new f(true, "LocalVideoLegalChecker", System.currentTimeMillis() - this.f109366a.$startTime, this.f109366a.$fileSuffix, 0, ""));
                            } else {
                                h.f.a.b bVar = this.f109366a.$onError;
                                long currentTimeMillis = System.currentTimeMillis() - this.f109366a.$startTime;
                                String str = this.f109366a.$fileSuffix;
                                Object d2 = iVar.d();
                                h.f.b.l.b(d2, "");
                                bVar.invoke(new f(false, "LocalVideoLegalChecker", currentTimeMillis, str, ((Number) d2).intValue(), ""));
                            }
                            return h.z.f158842a;
                        }
                    }, b.i.f4826c, null);
                } else {
                    this.$onSuccess.invoke(new f(true, "LocalVideoLegalChecker", System.currentTimeMillis() - this.$startTime, this.$fileSuffix, 0, ""));
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.g
    public final void a(MediaModel mediaModel, long j2, long j3, h.f.a.b<? super f, h.z> bVar, h.f.a.b<? super f, h.z> bVar2) {
        h.f.b.l.d(mediaModel, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(bVar2, "");
        com.ss.android.ugc.tools.utils.i.a(mediaModel.f109390b, new d(this, mediaModel, j2, j3, System.currentTimeMillis(), g.a.a(mediaModel.f109392d), bVar, bVar2));
    }
}
