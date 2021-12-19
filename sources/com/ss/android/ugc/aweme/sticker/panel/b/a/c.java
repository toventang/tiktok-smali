package com.ss.android.ugc.aweme.sticker.panel.b.a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.t;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.f;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class c extends com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<Effect> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.panel.a.b f135037a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f135038b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> f135039c;

    /* renamed from: d  reason: collision with root package name */
    private ObjectAnimator f135040d;

    /* renamed from: e  reason: collision with root package name */
    private final SimpleDraweeView f135041e;

    /* renamed from: i  reason: collision with root package name */
    private final ImageView f135042i;

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.types.lock.a f135043j;

    /* renamed from: k  reason: collision with root package name */
    private final o f135044k;

    /* renamed from: l  reason: collision with root package name */
    private final g f135045l;

    static {
        Covode.recordClassIndex(88291);
    }

    public static final class b implements IIsTagNeedUpdatedListener {
        static {
            Covode.recordClassIndex(88293);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedNotUpdate() {
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedUpdate() {
        }

        b() {
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f135046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f135047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f135048c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f135049d;

        static {
            Covode.recordClassIndex(88292);
        }

        a(c cVar, Effect effect, int i2, int i3) {
            this.f135046a = cVar;
            this.f135047b = effect;
            this.f135048c = i2;
            this.f135049d = i3;
        }

        public final void run() {
            View view = this.f135046a.itemView;
            l.b(view, "");
            if (view.getParent() != null) {
                this.f135046a.itemView.performClick();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.c$c  reason: collision with other inner class name */
    static final class C3519c extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(88294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3519c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f135038b.setAlpha(1.0f);
            this.this$0.f135038b.animate().alpha(0.0f).setDuration(150).start();
            return z.f158842a;
        }
    }

    private final void a() {
        ObjectAnimator objectAnimator = this.f135040d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f135042i.setRotation(0.0f);
        ImageView imageView = this.f135042i;
        View view = this.itemView;
        l.b(view, "");
        imageView.setImageDrawable(androidx.core.content.b.a(view.getContext(), 2131231012));
    }

    public final void a(com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar) {
        l.d(bVar, "");
        this.f135039c = bVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a
    public final void a(boolean z) {
        if (z) {
            this.itemView.setOnTouchListener(new t(1.1f, 100, this.f135041e));
        } else {
            this.itemView.setOnTouchListener(null);
        }
    }

    public final void onClick(View view) {
        int adapterPosition;
        ClickAgent.onClick(view);
        DATA data = this.f136354f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            this.f135039c.b(new f<>(data, adapterPosition, this.f136356h, false, false, false, null, null, new C3519c(this), 760));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a
    public final /* synthetic */ void a(Effect effect, int i2) {
        List<String> urlList;
        String str;
        Effect effect2 = effect;
        l.d(effect2, "");
        this.f135038b.setAlpha(0.0f);
        if (com.ss.android.ugc.aweme.sticker.p.g.p(effect2)) {
            UrlModel iconUrl = effect2.getIconUrl();
            if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || (str = (String) n.h((List) urlList)) == null)) {
                this.f135041e.setImageAlpha(128);
                com.ss.android.ugc.tools.c.a.a(this.f135041e, str);
            }
        } else {
            this.f135041e.setImageResource(2131232483);
        }
        this.f135045l.a(effect2, new b());
        View view = this.itemView;
        l.b(view, "");
        view.setContentDescription(effect2.getName());
        int i3 = this.f136356h;
        com.ss.android.ugc.aweme.sticker.panel.a.b bVar = this.f135037a;
        if (bVar != null && bVar.a(effect2, i3, i2)) {
            this.itemView.post(new a(this, effect2, i3, i2));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a
    public final /* synthetic */ void a(Effect effect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
        String str;
        Effect effect2 = effect;
        l.d(effect2, "");
        l.d(cVar, "");
        String effectId = effect2.getEffectId();
        DATA data = this.f136354f;
        if (data != null) {
            str = data.getEffectId();
        } else {
            str = null;
        }
        if (!(!l.a((Object) effectId, (Object) str))) {
            int i2 = d.f135050a[cVar.ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.f135042i.setVisibility(0);
            } else if (i2 == 3) {
                a();
            } else if (i2 == 4) {
                a();
                com.ss.android.ugc.aweme.sticker.types.lock.a aVar = this.f135043j;
                if (aVar != null && !aVar.reallyLockedSticker(this.f136354f)) {
                    this.f135038b.setAlpha(0.0f);
                    this.f135038b.animate().alpha(1.0f).setDuration(150).start();
                }
            } else if (i2 == 5) {
                this.f135042i.setVisibility(0);
                ImageView imageView = this.f135042i;
                View view = this.itemView;
                l.b(view, "");
                imageView.setImageDrawable(androidx.core.content.b.a(view.getContext(), 2131231013));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f135042i, "rotation", 0.0f, 360.0f);
                ofFloat.setDuration(800L);
                ofFloat.setRepeatMode(1);
                ofFloat.setRepeatCount(-1);
                ofFloat.start();
                this.f135040d = ofFloat;
            }
            if (com.ss.android.ugc.aweme.sticker.f.c.b(this.f135044k, effect2)) {
                this.f135038b.animate().alpha(1.0f).setDuration(150).start();
            } else {
                this.f135038b.animate().alpha(0.0f).setDuration(150).start();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, com.ss.android.ugc.aweme.sticker.types.lock.a aVar, o oVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar) {
        super(view);
        l.d(view, "");
        l.d(oVar, "");
        l.d(gVar, "");
        l.d(bVar, "");
        this.f135043j = aVar;
        this.f135044k = oVar;
        this.f135045l = gVar;
        this.f135039c = bVar;
        View findViewById = view.findViewById(R.id.bnf);
        l.b(findViewById, "");
        this.f135041e = (SimpleDraweeView) findViewById;
        View findViewById2 = view.findViewById(R.id.bnh);
        l.b(findViewById2, "");
        this.f135042i = (ImageView) findViewById2;
        view.setOnClickListener(this);
        View findViewById3 = view.findViewById(R.id.bne);
        l.b(findViewById3, "");
        this.f135038b = (ImageView) findViewById3;
    }
}
