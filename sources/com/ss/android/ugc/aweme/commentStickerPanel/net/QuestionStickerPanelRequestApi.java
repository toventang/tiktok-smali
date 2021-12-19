package com.ss.android.ugc.aweme.commentStickerPanel.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commentStickerPanel.a.h;
import com.ss.android.ugc.aweme.commentStickerPanel.a.i;
import com.ss.android.ugc.aweme.commentStickerPanel.a.j;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.df;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.tools.AVApi;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;
import l.b.f;

public final class QuestionStickerPanelRequestApi {

    /* renamed from: b  reason: collision with root package name */
    public static final a f73264b = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f73265d;

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f73266a = n.c(-1, -1);

    /* renamed from: c  reason: collision with root package name */
    private final Api f73267c;

    public interface Api {
        static {
            Covode.recordClassIndex(45124);
        }

        @f(a = "/tiktok/v1/forum/question/suggest/")
        t<j> getQuestionStickerFromNet(@l.b.t(a = "requests") String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45125);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(45123);
        AVApi b2 = AVApiImpl.b();
        l.b(b2, "");
        f73265d = b2.a();
    }

    public QuestionStickerPanelRequestApi() {
        au C = g.a().C();
        String str = f73265d;
        l.b(str, "");
        this.f73267c = (Api) C.createRetrofit(str, true, Api.class);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionStickerPanelRequestApi f73271a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f73272b;

        static {
            Covode.recordClassIndex(45127);
        }

        c(QuestionStickerPanelRequestApi questionStickerPanelRequestApi, int i2) {
            this.f73271a = questionStickerPanelRequestApi;
            this.f73272b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f73271a.a(this.f73272b, 2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionStickerPanelRequestApi f73268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f73269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f73270c;

        static {
            Covode.recordClassIndex(45126);
        }

        b(QuestionStickerPanelRequestApi questionStickerPanelRequestApi, int i2, h.f.a.b bVar) {
            this.f73268a = questionStickerPanelRequestApi;
            this.f73269b = i2;
            this.f73270c = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            j jVar = (j) obj;
            Integer num = jVar.f73143a;
            if (num != null && num.intValue() == 0) {
                this.f73268a.a(this.f73269b, 1);
                h.f.a.b bVar = this.f73270c;
                l.b(jVar, "");
                bVar.invoke(jVar);
                return;
            }
            this.f73268a.a(this.f73269b, 2);
        }
    }

    public final void a(int i2, int i3) {
        if (i2 == 1) {
            this.f73266a.set(1, Integer.valueOf(i3));
        } else if (i2 == 2) {
            this.f73266a.set(0, Integer.valueOf(i3));
        } else if (i2 == 3) {
            this.f73266a.set(0, Integer.valueOf(i3));
            this.f73266a.set(1, Integer.valueOf(i3));
        }
    }

    public void a(int i2, h.f.a.b<? super j, z> bVar, int i3) {
        l.d(bVar, "");
        ArrayList arrayList = new ArrayList();
        if (i3 == h.All.ordinal()) {
            if (df.d()) {
                arrayList.add(new i(Integer.valueOf(i2), 6, h.QuestionCollectionFAVORITE.ordinal(), 0, 8));
            }
            if (df.c()) {
                arrayList.add(new i(Integer.valueOf(i2), 6, h.QuestionCollectionRECOMMEND.ordinal(), 0, 8));
            }
            if (df.b()) {
                arrayList.add(new i(Integer.valueOf(i2), 6, h.QuestionCollectionINVITATION.ordinal(), 0, 8));
            }
        } else {
            arrayList.add(new i(Integer.valueOf(i2), 6, i3, 0, 8));
        }
        a(i3, 0);
        Api api = this.f73267c;
        String b2 = new com.google.gson.f().b(arrayList);
        l.b(b2, "");
        api.getQuestionStickerFromNet(b2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, i3, bVar), new c(this, i3));
    }
}
