package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f140879a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<MvNetFileBean> f140880b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final h.h f140881c = h.i.a((h.f.a.a) a.f140883a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f140882d = h.i.a((h.f.a.a) e.f140887a);

    static {
        Covode.recordClassIndex(91996);
    }

    public final AfrApi a() {
        return (AfrApi) this.f140881c.getValue();
    }

    public final a b() {
        return (a) this.f140882d.getValue();
    }

    static final class e extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f140887a = new e();

        static {
            Covode.recordClassIndex(92001);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    public static final class j implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140899a;

        static {
            Covode.recordClassIndex(92006);
        }

        public j(c cVar) {
            this.f140899a = cVar;
        }

        @Override // f.a.d.a
        public final void a() {
            f.a.b.b bVar;
            f.a.b.b bVar2 = this.f140899a.f140879a;
            if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f140899a.f140879a) != null) {
                bVar.dispose();
            }
        }
    }

    static final class a extends m implements h.f.a.a<AfrApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f140883a = new a();

        static {
            Covode.recordClassIndex(91997);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AfrApi invoke() {
            String itemName = EffectPlatformFactory.a().getHosts().get(0).getItemName();
            au C = com.ss.android.ugc.aweme.port.in.g.a().C();
            l.b(itemName, "");
            return C.createRetrofit(itemName, true, AfrApi.class);
        }
    }

    public static final class b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f140884a = new b();

        static {
            Covode.recordClassIndex(91998);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            ImageResponse imageResponse = new ImageResponse();
            imageResponse.status_code = -1;
            return imageResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.c$c  reason: collision with other inner class name */
    public static final class C3730c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final C3730c f140885a = new C3730c();

        static {
            Covode.recordClassIndex(91999);
        }

        C3730c() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            ImageResponse imageResponse = new ImageResponse();
            imageResponse.status_code = -1;
            return imageResponse;
        }
    }

    public static final class d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f140886a = new d();

        static {
            Covode.recordClassIndex(92000);
        }

        d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            VideoResponse videoResponse = new VideoResponse();
            videoResponse.status_code = -1;
            return videoResponse;
        }
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140892a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f140893b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f140894c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f140895d;

        static {
            Covode.recordClassIndex(92004);
        }

        public h(c cVar, z.c cVar2, e eVar, z.e eVar2) {
            this.f140892a = cVar;
            this.f140893b = cVar2;
            this.f140894c = eVar;
            this.f140895d = eVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f140893b.element == 0) {
                this.f140894c.a(this.f140892a.f140880b);
            } else {
                this.f140894c.a(this.f140892a.f140880b, this.f140895d.element);
            }
        }
    }

    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f140897b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f140898c;

        static {
            Covode.recordClassIndex(92005);
        }

        public i(c cVar, e eVar, z.e eVar2) {
            this.f140896a = cVar;
            this.f140897b = eVar;
            this.f140898c = eVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.b.b bVar;
            this.f140897b.a(this.f140896a.f140880b, this.f140898c.element);
            f.a.b.b bVar2 = this.f140896a.f140879a;
            if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f140896a.f140879a) != null) {
                bVar.dispose();
            }
        }
    }

    public static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.c f140888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f140889b;

        static {
            Covode.recordClassIndex(92002);
        }

        public f(z.c cVar, z.e eVar) {
            this.f140888a = cVar;
            this.f140889b = eVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            l.d(objArr, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : objArr) {
                if (obj2 instanceof BaseNetResponse) {
                    BaseNetResponse baseNetResponse = (BaseNetResponse) obj2;
                    if (baseNetResponse.status_code == 0) {
                        arrayList.add(obj2);
                    } else {
                        this.f140888a.element++;
                        String str = baseNetResponse.message;
                        if (str != null && str.length() > 0) {
                            z.e eVar = this.f140889b;
                            T t = (T) baseNetResponse.message;
                            if (t == null) {
                                l.b();
                            }
                            eVar.element = t;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static String a(String str) {
        boolean z;
        MethodCollector.i(6887);
        if (str != null) {
            boolean z2 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                byte[] decode = Base64.decode(str, 0);
                String str2 = (com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a("resize_bitmap_tmp") + File.separator) + com.ss.android.ugc.aweme.tools.mvtemplate.e.b.c(".mp4");
                try {
                    File file = new File(str2);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    bufferedOutputStream.write(decode);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                    z2 = false;
                }
                MethodCollector.o(6887);
                if (z2) {
                    return str2;
                }
                return "";
            }
        }
        MethodCollector.o(6887);
        return "";
    }

    public final boolean a(VideoResponse videoResponse) {
        VideoItem videoItem;
        VideoItemInfo data = videoResponse.getData();
        if (data == null || (videoItem = data.getVideoItem()) == null || data.getKey().length() == 0) {
            return true;
        }
        String key = data.getKey();
        String b2 = b().b(key);
        String a2 = a(videoItem.getContent());
        if (a2.length() <= 0 || videoItem.getAlgorithm().length() <= 0 || b2.length() <= 0) {
            return true;
        }
        MvNetFileBean mvNetFileBean = new MvNetFileBean(b2, videoItem.getAlgorithm(), a2, videoItem.getJsonResult());
        b().a(key, videoItem.getAlgorithm(), mvNetFileBean);
        this.f140880b.add(mvNetFileBean);
        return false;
    }

    public static final class g<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f140891b;

        static {
            Covode.recordClassIndex(92003);
        }

        public g(c cVar, z.c cVar2) {
            this.f140890a = cVar;
            this.f140891b = cVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x010d, code lost:
            if (r1 != false) goto L_0x0074;
         */
        @Override // f.a.d.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r17) {
            /*
            // Method dump skipped, instructions count: 306
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.net.c.g.apply(java.lang.Object):java.lang.Object");
        }
    }
}
