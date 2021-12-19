package com.ss.android.ugc.aweme.commentStickerPanel.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commentStickerPanel.a.d;
import com.ss.android.ugc.aweme.commentStickerPanel.a.e;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.tools.AVApi;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;
import l.b.f;

public final class CommentStickerPanelRequestApi {

    /* renamed from: b */
    public static final a f73255b = new a((byte) 0);

    /* renamed from: d */
    private static final String f73256d;

    /* renamed from: a */
    public List<Integer> f73257a = n.c(-1, -1);

    /* renamed from: c */
    private final Api f73258c;

    public interface Api {
        static {
            Covode.recordClassIndex(45119);
        }

        @f(a = "/tiktok/comment/recommend/v1")
        t<e> getCommentStickerFromNet(@l.b.t(a = "requests") String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45120);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(45118);
        AVApi b2 = AVApiImpl.b();
        l.b(b2, "");
        f73256d = b2.a();
    }

    public CommentStickerPanelRequestApi() {
        au C = g.a().C();
        String str = f73256d;
        l.b(str, "");
        this.f73258c = (Api) C.createRetrofit(str, true, Api.class);
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ CommentStickerPanelRequestApi f73262a;

        /* renamed from: b */
        final /* synthetic */ int f73263b;

        static {
            Covode.recordClassIndex(45122);
        }

        c(CommentStickerPanelRequestApi commentStickerPanelRequestApi, int i2) {
            this.f73262a = commentStickerPanelRequestApi;
            this.f73263b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f73262a.a(this.f73263b, 2);
        }
    }

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ CommentStickerPanelRequestApi f73259a;

        /* renamed from: b */
        final /* synthetic */ int f73260b;

        /* renamed from: c */
        final /* synthetic */ h.f.a.b f73261c;

        static {
            Covode.recordClassIndex(45121);
        }

        b(CommentStickerPanelRequestApi commentStickerPanelRequestApi, int i2, h.f.a.b bVar) {
            this.f73259a = commentStickerPanelRequestApi;
            this.f73260b = i2;
            this.f73261c = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            e eVar = (e) obj;
            Integer num = eVar.f73131a;
            if (num != null && num.intValue() == 0) {
                this.f73259a.a(this.f73260b, 1);
                h.f.a.b bVar = this.f73261c;
                if (bVar != null) {
                    l.b(eVar, "");
                    bVar.invoke(eVar);
                    return;
                }
                return;
            }
            this.f73259a.a(this.f73260b, 2);
        }
    }

    public final void a(int i2, int i3) {
        if (i2 == 1) {
            this.f73257a.set(1, Integer.valueOf(i3));
        } else if (i2 == 2) {
            this.f73257a.set(0, Integer.valueOf(i3));
        } else if (i2 == 3) {
            this.f73257a.set(0, Integer.valueOf(i3));
            this.f73257a.set(1, Integer.valueOf(i3));
        }
    }

    private void a(int i2, int i3, h.f.a.b<? super e, z> bVar, int i4) {
        ArrayList arrayList = new ArrayList();
        if (i4 == com.ss.android.ugc.aweme.commentStickerPanel.a.a.Favorites.getValue()) {
            arrayList.add(new d(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(com.ss.android.ugc.aweme.commentStickerPanel.a.a.Favorites.getValue())));
        } else if (i4 == com.ss.android.ugc.aweme.commentStickerPanel.a.a.Recommended.getValue()) {
            arrayList.add(new d(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(com.ss.android.ugc.aweme.commentStickerPanel.a.a.Recommended.getValue())));
        } else if (i4 == com.ss.android.ugc.aweme.commentStickerPanel.a.a.Both.getValue()) {
            arrayList.add(new d(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(com.ss.android.ugc.aweme.commentStickerPanel.a.a.Favorites.getValue())));
            arrayList.add(new d(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(com.ss.android.ugc.aweme.commentStickerPanel.a.a.Recommended.getValue())));
        }
        a(i4, 0);
        Api api = this.f73258c;
        String b2 = new com.google.gson.f().b(arrayList);
        l.b(b2, "");
        api.getCommentStickerFromNet(b2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, i4, bVar), new c(this, i4));
    }

    public static /* synthetic */ void a(CommentStickerPanelRequestApi commentStickerPanelRequestApi, int i2, int i3, h.f.a.b bVar, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = 30;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        commentStickerPanelRequestApi.a(i2, i3, bVar, i4);
    }
}
