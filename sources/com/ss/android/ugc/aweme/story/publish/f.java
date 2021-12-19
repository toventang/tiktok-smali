package com.ss.android.ugc.aweme.story.publish;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.ah;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.publish.y;
import com.ss.android.ugc.aweme.utils.in;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    static float f138111a;

    /* renamed from: b  reason: collision with root package name */
    public static List<Aweme> f138112b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    static int f138113c;

    /* renamed from: d  reason: collision with root package name */
    public static int f138114d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f138115e;

    /* renamed from: f  reason: collision with root package name */
    public static List<g> f138116f;

    /* renamed from: g  reason: collision with root package name */
    public static final Map<String, Bitmap> f138117g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public static final f f138118h = new f();

    /* renamed from: i  reason: collision with root package name */
    private static final Map<Object, d> f138119i = new LinkedHashMap();

    private f() {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.a
    public final List<Aweme> a() {
        return f138112b;
    }

    public static float d() {
        return b();
    }

    public static boolean c() {
        List<g> list = f138116f;
        boolean z = false;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f138141b.f138107b == i.FAILED) {
                    z = true;
                }
            }
        }
        return z;
    }

    static {
        Covode.recordClassIndex(90320);
    }

    public static float b() {
        int i2;
        List<g> list = f138116f;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        float f2 = (float) i2;
        float f3 = 0.0f;
        List<g> list2 = f138116f;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                f3 += it.next().f138141b.f138106a;
            }
        }
        return f3 / f2;
    }

    public static final class b extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f138120a;

        static {
            Covode.recordClassIndex(90322);
        }

        b(String str) {
            this.f138120a = str;
        }

        static final class c extends m implements h.f.a.b<d, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f138121a = new c();

            static {
                Covode.recordClassIndex(90325);
            }

            c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(d dVar) {
                d dVar2 = dVar;
                l.d(dVar2, "");
                dVar2.a(f.f138114d);
                return z.f158842a;
            }
        }

        static final class a extends m implements h.f.a.b<d, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.publish.d $result;
            final /* synthetic */ g $schedule;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(90323);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, com.ss.android.ugc.aweme.shortvideo.publish.d dVar, g gVar) {
                super(1);
                this.this$0 = bVar;
                this.$result = dVar;
                this.$schedule = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(d dVar) {
                d dVar2 = dVar;
                l.d(dVar2, "");
                dVar2.b(this.this$0.f138120a, this.$schedule.f138141b);
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.publish.f$b$b  reason: collision with other inner class name */
        static final class C3636b extends m implements h.f.a.b<d, z> {
            final /* synthetic */ z.e $res;

            static {
                Covode.recordClassIndex(90324);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3636b(z.e eVar) {
                super(1);
                this.$res = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(d dVar) {
                d dVar2 = dVar;
                l.d(dVar2, "");
                dVar2.a((i) this.$res.element);
                return h.z.f158842a;
            }
        }

        static final class d extends m implements h.f.a.b<d, h.z> {
            final /* synthetic */ int $progress;
            final /* synthetic */ g $scheduleInfo;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(90326);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(b bVar, int i2, g gVar) {
                super(1);
                this.this$0 = bVar;
                this.$progress = i2;
                this.$scheduleInfo = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(d dVar) {
                d dVar2 = dVar;
                l.d(dVar2, "");
                dVar2.a(f.f138111a);
                dVar2.a(this.this$0.f138120a, this.$scheduleInfo.f138141b);
                return h.z.f158842a;
            }
        }

        public static final class e implements IAVInfoService.IGetInfoCallback<int[]> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f138122a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f138123b;

            static {
                Covode.recordClassIndex(90327);
            }

            static final class a extends m implements h.f.a.b<d, h.z> {
                final /* synthetic */ int[] $result$inlined;
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(90328);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(e eVar, int[] iArr) {
                    super(1);
                    this.this$0 = eVar;
                    this.$result$inlined = iArr;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(d dVar) {
                    d dVar2 = dVar;
                    l.d(dVar2, "");
                    g c2 = f.c(this.this$0.f138122a.f138120a);
                    if (c2 != null) {
                        dVar2.c(this.this$0.f138122a.f138120a, c2.f138141b);
                    }
                    return h.z.f158842a;
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final /* synthetic */ void finish(int[] iArr) {
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int[] iArr2 = iArr;
                String str = this.f138122a.f138120a;
                int i7 = 0;
                int i8 = 0;
                for (T t : f.f138112b) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (TextUtils.equals(str, t2.getScheduleId())) {
                        Video video = new Video();
                        VideoUrlModel videoUrlModel = new VideoUrlModel();
                        if (iArr2 != null) {
                            i2 = iArr2[0];
                        } else {
                            i2 = 0;
                        }
                        videoUrlModel.setWidth(i2);
                        if (iArr2 != null) {
                            i3 = iArr2[1];
                        } else {
                            i3 = 0;
                        }
                        videoUrlModel.setHeight(i3);
                        if (iArr2 != null) {
                            i4 = iArr2[10];
                        } else {
                            i4 = 0;
                        }
                        videoUrlModel.setDuration((double) i4);
                        videoUrlModel.setUri(this.f138123b);
                        videoUrlModel.setUrlList(n.a(videoUrlModel.getUri()));
                        videoUrlModel.setUrlKey(videoUrlModel.getUri());
                        video.setPlayAddr(videoUrlModel);
                        if (iArr2 != null) {
                            i5 = iArr2[0];
                        } else {
                            i5 = 0;
                        }
                        video.setWidth(i5);
                        if (iArr2 != null) {
                            i6 = iArr2[1];
                        } else {
                            i6 = 0;
                        }
                        video.setHeight(i6);
                        if (iArr2 != null) {
                            i7 = iArr2[10];
                        }
                        video.setDuration((double) i7);
                        t2.setVideo(video);
                        f.a(new a(this, iArr2));
                        return;
                    }
                    i8 = i9;
                }
            }

            e(b bVar, String str) {
                this.f138122a = bVar;
                this.f138123b = str;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onProgress(int i2, Object obj) {
            super.onProgress(i2, obj);
            g c2 = f.c(this.f138120a);
            if (c2 != null) {
                c2.f138141b.f138106a = ((float) i2) / 100.0f;
                f.f138111a = f.b();
                f.a(new d(this, i2, c2));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:76:0x013d, code lost:
            if (r4 != false) goto L_0x013f;
         */
        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d r14, java.lang.Object r15) {
            /*
            // Method dump skipped, instructions count: 388
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.publish.f.b.onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d, java.lang.Object):void");
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onStageUpdate(String str, ah ahVar, Object obj) {
            l.d(str, "");
            l.d(ahVar, "");
            super.onStageUpdate(str, ahVar, obj);
            if (TextUtils.equals(str, "STAGE_SYNTHETIC") && (ahVar instanceof ah.a)) {
                ah.a aVar = (ah.a) ahVar;
                if (aVar.f129708a instanceof y.a) {
                    y yVar = aVar.f129708a;
                    Objects.requireNonNull(yVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                    String obj2 = ((y.a) yVar).f129907a.toString();
                    AVExternalServiceImpl.a().abilityService().infoService().videoInfo(obj2, true, new e(this, obj2));
                }
            }
        }
    }

    public static void b(String str) {
        f138117g.remove(str);
    }

    static final class a extends m implements h.f.a.b<Bitmap, h.z> {
        final /* synthetic */ String $scheduleId;

        static {
            Covode.recordClassIndex(90321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.$scheduleId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Bitmap bitmap) {
            if (bitmap != null) {
                f.f138117g.put(this.$scheduleId, bitmap);
            }
            return h.z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<d, h.z> {
        final /* synthetic */ String $scheduleId;

        static {
            Covode.recordClassIndex(90329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$scheduleId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(d dVar) {
            d dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.a(this.$scheduleId);
            return h.z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<d, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f138124a = new d();

        static {
            Covode.recordClassIndex(90330);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(d dVar) {
            d dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.a();
            return h.z.f158842a;
        }
    }

    public static void e(String str) {
        l.d(str, "");
        f138119i.remove(str);
    }

    public static void a(h.f.a.b<? super d, h.z> bVar) {
        for (Map.Entry<Object, d> entry : f138119i.entrySet()) {
            bVar.invoke(entry.getValue());
        }
    }

    public static g c(String str) {
        List<g> list = f138116f;
        if (list == null) {
            return null;
        }
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            if (TextUtils.equals(str, t2.f138140a.getScheduleId())) {
                return t2;
            }
            i2 = i3;
        }
        return null;
    }

    public static boolean d(String str) {
        List<g> list = f138116f;
        if (list == null) {
            return false;
        }
        for (T t : list) {
            if (TextUtils.equals(t.f138140a.getScheduleId(), str)) {
                k kVar = t.f138141b.f138110e;
                if (kVar != null) {
                    h.f138142a.removeCallback(str, kVar);
                }
                List<g> list2 = f138116f;
                if (list2 == null || !list2.remove(t)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static void g(String str) {
        for (T t : f138112b) {
            if (TextUtils.equals(str, t.getScheduleId())) {
                f138112b.remove(t);
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.a
    public final void a(Aweme aweme) {
        l.d(aweme, "");
        if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
            IAwemeService b2 = AwemeService.b();
            if (b2 != null) {
                b2.a(aweme);
            }
            aweme.setScheduleId(aweme.getAid());
            f138112b.add(aweme);
        }
    }

    private static boolean b(Aweme aweme) {
        Story story;
        Story story2;
        if (aweme.getAwemeType() != 40 || aweme.getStory() == null || (story = aweme.getStory()) == null || story.isFaked() || (story2 = aweme.getStory()) == null || story2.isPublishing() || TextUtils.isEmpty(aweme.getAid())) {
            return false;
        }
        return true;
    }

    public static String f(String str) {
        ScheduleInfo scheduleInfo;
        Bundle scheduleParam;
        String string;
        if (str == null) {
            return "";
        }
        List<g> list = f138116f;
        T t = null;
        if (list == null) {
            return "";
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (l.a((Object) next.f138140a.getScheduleId(), (Object) str)) {
                t = next;
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (scheduleInfo = t2.f138140a) == null || (scheduleParam = scheduleInfo.getScheduleParam()) == null || (string = scheduleParam.getString("creation_id")) == null) {
            return "";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.a
    public final void a(String str) {
        l.d(str, "");
        boolean d2 = d(str);
        g(str);
        b(str);
        a(new c(str));
        if (d2) {
            f138114d--;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.a
    public final void a(List<g> list) {
        if (list != null) {
            if (f138116f == null) {
                f138116f = new ArrayList();
            }
            List<g> list2 = f138116f;
            if (list2 != null) {
                for (T t : list2) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        if (TextUtils.equals(t.f138140a.getScheduleId(), list.get(size).f138140a.getScheduleId())) {
                            list.remove(size);
                        }
                    }
                }
            }
            List<g> list3 = f138116f;
            if (list3 != null) {
                list3.addAll(list);
            }
            f138114d = list.size();
            a(d.f138124a);
            f138115e = true;
            int i2 = 0;
            for (T t2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t3 = t2;
                Aweme aweme = new Aweme();
                aweme.setAid(t3.f138140a.getScheduleId());
                aweme.setAwemeType(40);
                aweme.setStory(new Story(0, false, 0, false, 0, false, false, false, true, 255, null));
                aweme.setScheduleId(t3.f138140a.getScheduleId());
                aweme.setAuthor(in.c());
                f138112b.add(aweme);
                t3.f138141b.f138109d = aweme;
                String scheduleId = t3.f138140a.getScheduleId();
                StoryCoverExtractConfig storyCoverExtractConfig = new StoryCoverExtractConfig(0, 0, 0, 7, null);
                a aVar = new a(scheduleId);
                l.d(scheduleId, "");
                l.d(storyCoverExtractConfig, "");
                l.d(aVar, "");
                h.f138142a.getCover(scheduleId, storyCoverExtractConfig, aVar);
                t3.f138141b.f138110e = new b(scheduleId);
                h hVar = h.f138142a;
                k kVar = t3.f138141b.f138110e;
                if (kVar == null) {
                    l.b();
                }
                hVar.addCallback(scheduleId, kVar);
                i2 = i3;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.a
    public final void a(Object obj, d dVar) {
        l.d(obj, "");
        l.d(dVar, "");
        f138119i.put(obj, dVar);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.a
    public final int a(UserStory userStory, boolean z) {
        l.d(userStory, "");
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= f138112b.size()) {
                break;
            }
            Aweme aweme = f138112b.get(i2);
            if (aweme.getCreateTime() != 0 && userStory.getLastStoryCreatedAt() / 1000 < aweme.getCreateTime()) {
                com.ss.android.ugc.aweme.story.j.a.b("PublishManager", "aweme create time: " + aweme.getCreateTime() + ", server last create time: " + (userStory.getLastStoryCreatedAt() / 1000) + ", userStory instance: " + System.identityHashCode(userStory) + ", originTotalCount: " + userStory.getOriginTotalCount());
                break;
            }
            if (b(aweme)) {
                i3++;
                if (z) {
                    f138112b.remove(i2);
                    i2--;
                }
            }
            i2++;
        }
        return i3;
    }
}
