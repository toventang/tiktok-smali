package com.ss.android.ugc.aweme.ecommerce.review;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import h.f.a.r;
import h.m.p;
import h.z;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class f {

    /* renamed from: k  reason: collision with root package name */
    public static final a f87009k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public float f87010a;

    /* renamed from: b  reason: collision with root package name */
    public int f87011b;

    /* renamed from: c  reason: collision with root package name */
    public String f87012c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f87013d = "return";

    /* renamed from: e  reason: collision with root package name */
    public b f87014e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<String> f87015f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    public long f87016g = SystemClock.elapsedRealtime();

    /* renamed from: h  reason: collision with root package name */
    public final HashSet<String> f87017h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    public boolean f87018i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f87019j;

    static {
        Covode.recordClassIndex(54581);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54582);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(c.a aVar, ReviewItemStruct reviewItemStruct, b bVar) {
            int i2;
            String str;
            int i3;
            String str2;
            long j2;
            int i4;
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(reviewItemStruct, "");
            int i5 = 1;
            aVar.b("is_self", Integer.valueOf(h.f.b.l.a(reviewItemStruct.f87060f, true) ? 1 : 0));
            List<Image> list = reviewItemStruct.f87055a.f87071d;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            aVar.b("photo_cnt", Integer.valueOf(i2));
            aVar.b("rate", reviewItemStruct.f87055a.f87069b);
            if (reviewItemStruct.f87055a.f87075h) {
                str = UGCMonitor.EVENT_COMMENT;
            } else {
                str = "default";
            }
            aVar.b("text_type", str);
            Integer num = reviewItemStruct.f87058d;
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            aVar.b("like_cnt", Integer.valueOf(i3));
            aVar.b("sku_id", reviewItemStruct.f87057c);
            aVar.b("review_id", reviewItemStruct.f87055a.f87068a);
            ReviewItemStruct.User user = reviewItemStruct.f87061g;
            if (user == null || (str2 = user.f87076a) == null) {
                str2 = "";
            }
            aVar.b("review_author_id", str2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            Calendar instance = Calendar.getInstance();
            h.f.b.l.b(instance, "");
            Long g2 = p.g(reviewItemStruct.f87055a.f87072e);
            if (g2 != null) {
                j2 = g2.longValue();
            } else {
                j2 = 0;
            }
            instance.setTimeInMillis(j2);
            h.f.b.l.b(instance, "");
            String format = simpleDateFormat.format(instance.getTime());
            h.f.b.l.b(format, "");
            aVar.b("post_date", format);
            aVar.b("is_anonymous", Integer.valueOf(h.f.b.l.a(reviewItemStruct.f87063i, true) ? 1 : 0));
            if (bVar != null) {
                aVar.b("filter_name", bVar.f87021b);
                aVar.b("filter_id", bVar.f87022c);
            }
            if (reviewItemStruct.f87055a.f87074g != null) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            ReviewItemStruct.AppendReview appendReview = reviewItemStruct.f87055a.f87073f;
            if (!(appendReview == null || appendReview.f87067d == null)) {
                i4++;
            }
            aVar.b("reply_cnt", Integer.valueOf(i4));
            if (reviewItemStruct.f87055a.f87073f == null) {
                i5 = 0;
            }
            aVar.b("has_add_review", Integer.valueOf(i5));
            aVar.b("is_anonymous", Integer.valueOf(h.f.b.l.a(reviewItemStruct.f87063i, true) ? 1 : 0));
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $buttonName;

        static {
            Covode.recordClassIndex(54584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$buttonName = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.b("button_name", this.$buttonName);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ ReviewItemStruct $reviewItemStruct;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.this$0 = fVar;
            this.$reviewItemStruct = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            a.a(aVar2, this.$reviewItemStruct, this.this$0.f87014e);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.b("review_cnt", Integer.valueOf(this.this$0.f87011b));
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $buttonFor;
        final /* synthetic */ ReviewItemStruct $reviewItemStruct;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar, ReviewItemStruct reviewItemStruct, String str) {
            super(1);
            this.this$0 = fVar;
            this.$reviewItemStruct = reviewItemStruct;
            this.$buttonFor = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            a.a(aVar2, this.$reviewItemStruct, this.this$0.f87014e);
            aVar2.b("button_for", this.$buttonFor);
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ ReviewItemStruct $reviewItemStruct;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(f fVar, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.this$0 = fVar;
            this.$reviewItemStruct = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            a.a(aVar2, this.$reviewItemStruct, this.this$0.f87014e);
            return z.f158842a;
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ ReviewItemStruct $reviewItemStruct;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(f fVar, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.this$0 = fVar;
            this.$reviewItemStruct = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            a.a(aVar2, this.$reviewItemStruct, this.this$0.f87014e);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$f  reason: collision with other inner class name */
    static final class C2097f extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ b $selectedFilterInfo;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2097f(f fVar, b bVar) {
            super(1);
            this.this$0 = fVar;
            this.$selectedFilterInfo = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.b("product_id", this.this$0.f87012c);
            aVar2.b("filter_name", this.$selectedFilterInfo.f87021b);
            aVar2.b("filter_id", this.$selectedFilterInfo.f87022c);
            aVar2.b("rank", Integer.valueOf(this.$selectedFilterInfo.f87020a));
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ ReviewFilterStruct $filter;
        final /* synthetic */ int $filterOrder;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, ReviewFilterStruct reviewFilterStruct, int i2) {
            super(1);
            this.this$0 = fVar;
            this.$filter = reviewFilterStruct;
            this.$filterOrder = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            String str;
            String str2;
            c.a aVar2 = aVar;
            String str3 = "";
            h.f.b.l.d(aVar2, str3);
            aVar2.b("product_id", this.this$0.f87012c);
            ReviewFilterStruct reviewFilterStruct = this.$filter;
            if (reviewFilterStruct == null || (str = reviewFilterStruct.f87052b) == null) {
                str = str3;
            }
            aVar2.b("filter_name", str);
            ReviewFilterStruct reviewFilterStruct2 = this.$filter;
            if (!(reviewFilterStruct2 == null || (str2 = reviewFilterStruct2.f87051a) == null)) {
                str3 = str2;
            }
            aVar2.b("filter_id", str3);
            aVar2.b("rank", Integer.valueOf(this.$filterOrder));
            return z.f158842a;
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ int $rank;
        final /* synthetic */ ReviewItemStruct $reviewItemStruct;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(f fVar, int i2, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.this$0 = fVar;
            this.$rank = i2;
            this.$reviewItemStruct = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.b("review_cnt", Integer.valueOf(this.this$0.f87011b));
            aVar2.b("rank", Integer.valueOf(this.$rank));
            a.a(aVar2, this.$reviewItemStruct, this.this$0.f87014e);
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.b("review_cnt", Integer.valueOf(this.this$0.f87011b));
            aVar2.b("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - this.this$0.f87016g));
            aVar2.b("quit_type", this.this$0.f87013d);
            aVar2.b("is_load_data", Integer.valueOf(this.this$0.f87018i ? 1 : 0));
            return z.f158842a;
        }
    }

    public f(Context context) {
        h.f.b.l.d(context, "");
        this.f87019j = context;
    }

    public static final class h extends h.f.b.m implements h.f.a.b<c.a, z> {
        final /* synthetic */ boolean $isSelf;
        final /* synthetic */ String $photoId;
        final /* synthetic */ String $photoOrder;
        final /* synthetic */ String $reviewId;
        final /* synthetic */ String $skuId;
        final /* synthetic */ String $userId;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(f fVar, String str, String str2, String str3, String str4, String str5, boolean z) {
            super(1);
            this.this$0 = fVar;
            this.$photoId = str;
            this.$photoOrder = str2;
            this.$skuId = str3;
            this.$userId = str4;
            this.$reviewId = str5;
            this.$isSelf = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            String str = "";
            h.f.b.l.d(aVar2, str);
            aVar2.b("photo_id", this.$photoId);
            aVar2.b("rank", this.$photoOrder);
            aVar2.b("product_id", this.this$0.f87012c);
            Object obj = this.$skuId;
            if (obj == null) {
                obj = str;
            }
            aVar2.b("sku_id", obj);
            String str2 = this.$userId;
            if (str2 != null) {
                str = str2;
            }
            aVar2.b("review_author_id", str);
            aVar2.b("review_id", this.$reviewId);
            aVar2.b("is_self", Integer.valueOf(this.$isSelf ? 1 : 0));
            return z.f158842a;
        }
    }

    public final void a(ReviewItemStruct reviewItemStruct, String str) {
        h.f.b.l.d(reviewItemStruct, "");
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a(this.f87019j, "tiktokec_report_entrance_click", new j(this, reviewItemStruct, str));
        if (!h.f.b.l.a((Object) str, (Object) "cancel")) {
            com.ss.android.ugc.aweme.ecommerce.track.c.a(this.f87019j, "tiktokec_denounce_review", new k(this, reviewItemStruct));
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f87020a;

        /* renamed from: b  reason: collision with root package name */
        public final String f87021b;

        /* renamed from: c  reason: collision with root package name */
        public final String f87022c;

        static {
            Covode.recordClassIndex(54583);
        }

        public b(int i2, String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            this.f87020a = i2;
            this.f87021b = str;
            this.f87022c = str2;
        }
    }

    public static final class i extends h.f.b.m implements r<ReviewItemStruct.MainReview, String, String, Boolean, z> {
        final /* synthetic */ ReviewItemStruct $reviewItemStruct;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(f fVar, ReviewItemStruct reviewItemStruct) {
            super(4);
            this.this$0 = fVar;
            this.$reviewItemStruct = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(ReviewItemStruct.MainReview mainReview, String str, String str2, Boolean bool) {
            a(mainReview, str, str2, bool.booleanValue());
            return z.f158842a;
        }

        public final void a(final ReviewItemStruct.MainReview mainReview, final String str, final String str2, final boolean z) {
            h.f.b.l.d(mainReview, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (!this.this$0.f87017h.contains(str)) {
                this.this$0.f87017h.add(str);
                com.ss.android.ugc.aweme.ecommerce.track.c.a(this.this$0.f87019j, "tiktokec_photo_show", new h.f.a.b<c.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.review.f.i.AnonymousClass1 */
                    final /* synthetic */ i this$0;

                    static {
                        Covode.recordClassIndex(54591);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(c.a aVar) {
                        String str;
                        c.a aVar2 = aVar;
                        String str2 = "";
                        h.f.b.l.d(aVar2, str2);
                        aVar2.b("photo_id", str);
                        aVar2.b("rank", str2);
                        aVar2.b("review_id", mainReview.f87068a);
                        aVar2.b("sku_id", this.this$0.$reviewItemStruct.f87057c);
                        ReviewItemStruct.User user = this.this$0.$reviewItemStruct.f87061g;
                        if (!(user == null || (str = user.f87076a) == null)) {
                            str2 = str;
                        }
                        aVar2.b("review_author_id", str2);
                        aVar2.b("is_self", Integer.valueOf(z ? 1 : 0));
                        return z.f158842a;
                    }
                });
            }
        }
    }
}
