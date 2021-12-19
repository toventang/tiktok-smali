package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.r;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;

public class i extends a<CommentContent> {
    private int A = -1;
    private final am B = an.a(bf.f159041b);

    /* renamed from: a  reason: collision with root package name */
    protected TuxTextView f101431a;

    /* renamed from: b  reason: collision with root package name */
    public CommentContent f101432b;
    public Aweme x;
    private RemoteImageView y;
    private ai z;

    static {
        Covode.recordClassIndex(64862);
    }

    /* access modifiers changed from: protected */
    public final TuxTextView i() {
        TuxTextView tuxTextView = this.f101431a;
        if (tuxTextView == null) {
            l.a("titleView");
        }
        return tuxTextView;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        View findViewById = this.itemView.findViewById(R.id.d4o);
        l.b(findViewById, "");
        this.y = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById2, "");
        this.f101431a = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.adh);
        l.b(findViewById3, "");
        this.o = a.C2518a.a(findViewById3);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f101433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f101434b;

        static {
            Covode.recordClassIndex(64864);
        }

        b(i iVar, View.OnClickListener onClickListener) {
            this.f101433a = iVar;
            this.f101434b = onClickListener;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101433a.a(view);
            View.OnClickListener onClickListener = this.f101434b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f101435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f101436b;

        static {
            Covode.recordClassIndex(64865);
        }

        c(i iVar, View.OnClickListener onClickListener) {
            this.f101435a = iVar;
            this.f101436b = onClickListener;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101435a.a(view);
            View.OnClickListener onClickListener = this.f101436b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a(View.OnClickListener onClickListener) {
        super.a(onClickListener);
        RemoteImageView remoteImageView = this.y;
        if (remoteImageView == null) {
            l.a("coverView");
        }
        remoteImageView.setOnClickListener(new b(this, onClickListener));
        this.o.a(new c(this, onClickListener));
    }

    public static final class d extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f101437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f101438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f101439c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f101440d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f101441e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f101442f;

        static {
            Covode.recordClassIndex(64866);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                z.e eVar = this.f101438b;
                Context context = this.f101439c;
                l.b(context, "");
                String str = this.f101440d;
                String str2 = this.f101441e;
                String str3 = this.f101442f;
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                eVar.element = (T) CommentSharePackage.a.a(context, str, str2, str3, bitmap, h.g.a.a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics())));
                this.f101437a.i().setText(this.f101438b.element);
            }
        }

        d(i iVar, z.e eVar, Context context, String str, String str2, String str3) {
            this.f101437a = iVar;
            this.f101438b = eVar;
            this.f101439c = context;
            this.f101440d = str;
            this.f101441e = str2;
            this.f101442f = str3;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {
        final /* synthetic */ int $id = R.raw.icon_bubble_ellipsis_right;

        static {
            Covode.recordClassIndex(64868);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = this.$id;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 19.5f, system2.getDisplayMetrics()));
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        int label;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(64863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = iVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.d dVar = com.ss.android.ugc.aweme.im.sdk.chat.b.c.d.f100192a;
                CommentContent commentContent = this.this$0.f101432b;
                if (commentContent == null) {
                    l.a("mContent");
                }
                this.label = 1;
                obj = dVar.a(commentContent, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Aweme aweme = (Aweme) obj;
            if (aweme != null) {
                this.this$0.x = aweme;
                AwemeService.b().a(this.this$0.x);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<com.bytedance.tux.c.e, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f101443a = new e();

        static {
            Covode.recordClassIndex(64867);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.f159897h);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44782h = h.g.a.a(TypedValue.applyDimension(1, 42.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44781g = h.g.a.a(TypedValue.applyDimension(1, 56.0f, system2.getDisplayMetrics()));
            return h.z.f158842a;
        }
    }

    public final void a(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("position", (long) this.A);
        bundle.putSerializable("currentAweme", this.x);
        if (view != null) {
            view.setTag(50331652, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void a(IMUser iMUser, ai aiVar) {
        l.d(iMUser, "");
        l.d(aiVar, "");
        super.a(iMUser, aiVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bytedance.im.core.d.ai r24, com.bytedance.im.core.d.ai r25, com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent r26, int r27) {
        /*
        // Method dump skipped, instructions count: 588
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.i.a(com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent, int):void");
    }
}
