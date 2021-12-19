package com.ss.android.ugc.aweme.shortvideo.sticker.c;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a {

    /* renamed from: a  reason: collision with root package name */
    public final g f130230a;

    /* renamed from: l  reason: collision with root package name */
    private View f130231l;

    /* renamed from: m  reason: collision with root package name */
    private final h f130232m;

    static {
        Covode.recordClassIndex(85426);
    }

    private final b c() {
        return (b) this.f130232m.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        return 6;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.a$a  reason: collision with other inner class name */
    static final class C3392a extends m implements h.f.a.a<b> {
        final /* synthetic */ Context $context;
        final /* synthetic */ j $interactStickerParams;
        final /* synthetic */ InteractStickerStruct $stickerStruct;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(85427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3392a(a aVar, Context context, InteractStickerStruct interactStickerStruct, j jVar) {
            super(0);
            this.this$0 = aVar;
            this.$context = context;
            this.$stickerStruct = interactStickerStruct;
            this.$interactStickerParams = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            Context context = this.$context;
            a aVar = this.this$0;
            return new b(context, aVar, this.$stickerStruct, this.$interactStickerParams, aVar.f130230a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(3901);
        View view = new View(this.f130436i);
        MethodCollector.o(3901);
        return view;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final View a() {
        MethodCollector.i(4107);
        if (this.f130231l == null) {
            this.f130231l = new FrameLayout(this.f130436i);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            View view = this.f130231l;
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
        View view2 = this.f130231l;
        MethodCollector.o(4107);
        return view2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return c().a(j2, i2, f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, b bVar) {
        l.d(bVar, "");
        return c().a(j2, i2, f2, f3, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar, g gVar) {
        super(i2, context, view, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(view, "");
        l.d(interactStickerStruct, "");
        this.f130230a = gVar;
        this.f130232m = i.a((h.f.a.a) new C3392a(this, context, interactStickerStruct, jVar));
    }
}
