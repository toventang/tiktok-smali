package com.ss.android.ugc.aweme.commentStickerPanel.net;

import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commentStickerPanel.a.h;
import com.ss.android.ugc.aweme.commentStickerPanel.a.j;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public QuestionStickerPanelRequestApi f73282a = new QuestionStickerPanelRequestApi();

    /* renamed from: b  reason: collision with root package name */
    public List<QaStruct> f73283b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<QaStruct> f73284c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<QaStruct> f73285d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final k<Boolean> f73286e = new k<>();

    static {
        Covode.recordClassIndex(45131);
    }

    public final boolean b() {
        return this.f73285d.isEmpty();
    }

    public final boolean a() {
        if (!this.f73283b.isEmpty() || !this.f73284c.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void a(List<QaStruct> list) {
        l.d(list, "");
        this.f73283b = list;
    }

    public final void b(List<QaStruct> list) {
        l.d(list, "");
        this.f73284c = list;
    }

    public final void c(List<QaStruct> list) {
        l.d(list, "");
        this.f73285d = list;
    }

    public static final class a extends m implements h.f.a.b<j, z> {
        final /* synthetic */ h.f.a.b $callback;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(45132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, h.f.a.b bVar2) {
            super(1);
            this.this$0 = bVar;
            this.$callback = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            this.this$0.a(new ArrayList());
            this.this$0.b(new ArrayList());
            this.this$0.c(new ArrayList());
            for (T t : jVar2.f73144b) {
                int i2 = t.f73134a;
                if (i2 == h.QuestionCollectionRECOMMEND.ordinal()) {
                    this.this$0.b(t.f73135b);
                } else if (i2 == h.QuestionCollectionINVITATION.ordinal()) {
                    this.this$0.a(t.f73135b);
                } else if (i2 == h.QuestionCollectionFAVORITE.ordinal()) {
                    this.this$0.c(t.f73135b);
                }
            }
            h.f.a.b bVar = this.$callback;
            if (bVar != null) {
                bVar.invoke(jVar2);
            }
            return z.f158842a;
        }
    }
}
