package com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class b extends a {

    /* renamed from: g  reason: collision with root package name */
    private RecyclerView f100351g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a.a f100352h;

    static {
        Covode.recordClassIndex(64110);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a
    public final List<com.ss.android.ugc.aweme.emoji.g.a> b() {
        return a().getEmojiList();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a
    public final void c() {
        super.c();
        this.f100351g = (RecyclerView) b(R.id.dra);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a.a aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a.a();
        this.f100352h = aVar;
        aVar.f100336a = new a(this);
        RecyclerView recyclerView = this.f100351g;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a.a aVar2 = this.f100352h;
        if (aVar2 == null) {
            l.a("adapter");
        }
        recyclerView.setAdapter(aVar2);
        RecyclerView recyclerView2 = this.f100351g;
        if (recyclerView2 == null) {
            l.a("recyclerView");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(dVar);
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a
    public final void a(boolean z) {
        int i2;
        RecyclerView recyclerView = this.f100351g;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
    }

    static final class a extends m implements h.f.a.m<View, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(View view, Integer num) {
            int intValue = num.intValue();
            l.d(view, "");
            this.this$0.a(intValue);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a
    public final void a(ai aiVar, ai aiVar2, SayHelloContent sayHelloContent, int i2, boolean z) {
        l.d(aiVar, "");
        l.d(sayHelloContent, "");
        super.a(aiVar, aiVar2, sayHelloContent, i2, z);
        a(true);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a.a aVar = this.f100352h;
        if (aVar == null) {
            l.a("adapter");
        }
        aVar.f(a().getEmojiList());
    }
}
