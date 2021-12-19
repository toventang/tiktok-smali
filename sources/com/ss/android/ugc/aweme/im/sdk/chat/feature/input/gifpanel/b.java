package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.emoji.emojichoose.p;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ah;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o;
import com.zhiliaoapp.musically.R;
import f.a.n;
import f.a.q;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;
import java.util.List;
import java.util.Objects;

public abstract class b extends t<a> {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b f100739h;

    /* renamed from: i  reason: collision with root package name */
    public Context f100740i;

    /* renamed from: j  reason: collision with root package name */
    public p f100741j;

    /* renamed from: k  reason: collision with root package name */
    public GiphyViewModel f100742k;

    public static final class a extends com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a.a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f100743a = {new y(a.class, "emojiIv", "getEmojiIv()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0)};

        /* renamed from: c  reason: collision with root package name */
        private final d f100744c = new a.C2565a(new a.b());

        static {
            Covode.recordClassIndex(64456);
        }

        public final RemoteImageView a() {
            return (RemoteImageView) this.f100744c.a(this, f100743a[0]);
        }
    }

    static {
        Covode.recordClassIndex(64455);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a8x;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.b$b  reason: collision with other inner class name */
    public static final class C2493b implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100745a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f100746b;

        static {
            Covode.recordClassIndex(64457);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final void a(String str) {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final void a(String str, Throwable th) {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final boolean a() {
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.b$b$a */
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2493b f100747a;

            static {
                Covode.recordClassIndex(64458);
            }

            a(C2493b bVar) {
                this.f100747a = bVar;
            }

            public final void onClick(View view) {
                e eVar;
                String str;
                ClickAgent.onClick(view);
                this.f100747a.f100745a.f100741j.a(this.f100747a.f100746b, b.a(this.f100747a.f100745a.f100739h), 1);
                GiphyViewModel giphyViewModel = this.f100747a.f100745a.f100742k;
                com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b bVar = this.f100747a.f100745a.f100739h;
                l.d(bVar, "");
                com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.a aVar = bVar.f100773e;
                if (!(aVar == null || (eVar = aVar.f100768a) == null || (str = eVar.f100778a) == null || str.length() == 0 || str == null)) {
                    f.a.b b2 = n.a((q) new GiphyViewModel.g(giphyViewModel, str)).b(giphyViewModel.f100714k).b(new GiphyViewModel.f(new GiphyViewModel.h(giphyViewModel.f100712i)));
                    l.b(b2, "");
                    f.a.j.d.a(b2, new GiphyViewModel.j(giphyViewModel), new GiphyViewModel.i(giphyViewModel));
                }
                this.f100747a.f100745a.f100742k.f100709f.postValue(z.f158842a);
            }
        }

        C2493b(b bVar, RemoteImageView remoteImageView) {
            this.f100745a = bVar;
            this.f100746b = remoteImageView;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o
        public final void a(String str, f fVar, Animatable animatable) {
            this.f100746b.setOnClickListener(new a(this));
        }
    }

    public static com.ss.android.ugc.aweme.emoji.b.a a(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b bVar) {
        List<String> list;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.a.a aVar;
        String str;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.a.a aVar2;
        String str2;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.a.a aVar3;
        String str3;
        com.ss.android.ugc.aweme.emoji.g.a aVar4 = new com.ss.android.ugc.aweme.emoji.g.a();
        com.ss.android.ugc.aweme.emoji.b.a aVar5 = new com.ss.android.ugc.aweme.emoji.b.a();
        aVar4.setAnimateType(bVar.f100769a);
        aVar4.setStickerType(3);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.d dVar = bVar.f100771c;
        if (!(dVar == null || (aVar3 = dVar.f100777a) == null || (str3 = aVar3.f100766b) == null)) {
            aVar4.setWidth(Integer.parseInt(str3));
        }
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.d dVar2 = bVar.f100771c;
        if (!(dVar2 == null || (aVar2 = dVar2.f100777a) == null || (str2 = aVar2.f100767c) == null)) {
            aVar4.setHeight(Integer.parseInt(str2));
        }
        aVar4.setDisplayName(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cfz));
        UrlModel urlModel = new UrlModel();
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.d dVar3 = bVar.f100771c;
        if (dVar3 == null || (aVar = dVar3.f100777a) == null || (str = aVar.f100765a) == null) {
            list = null;
        } else {
            list = h.a.n.a(str);
        }
        urlModel.setUrlList(list);
        aVar4.setAnimateUrl(urlModel);
        aVar4.setStickerId(bVar.f100770b);
        aVar5.f89106d = aVar4;
        return aVar5;
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        UrlModel animateUrl;
        l.d(aVar, "");
        com.ss.android.ugc.aweme.emoji.b.a a2 = a(this.f100739h);
        com.ss.android.ugc.aweme.emoji.g.a aVar2 = a2.f89106d;
        l.b(aVar2, "");
        float height = (float) aVar2.getHeight();
        com.ss.android.ugc.aweme.emoji.g.a aVar3 = a2.f89106d;
        l.b(aVar3, "");
        float width = height / ((float) aVar3.getWidth());
        com.ss.android.ugc.aweme.emoji.g.a aVar4 = a2.f89106d;
        if (aVar4 != null && (animateUrl = aVar4.getAnimateUrl()) != null) {
            ViewGroup.LayoutParams layoutParams = aVar.a().getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar5 = (ConstraintLayout.a) layoutParams;
            aVar5.B = "H,1:".concat(String.valueOf(width));
            aVar.a().setLayoutParams(aVar5);
            aVar.a().setContentDescription(this.f100740i.getString(R.string.bmo));
            RemoteImageView a3 = aVar.a();
            a3.setOnClickListener(null);
            ah.a(a3, animateUrl, new C2493b(this, a3), true);
        }
    }

    public b(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b bVar, Context context, p pVar, GiphyViewModel giphyViewModel) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(pVar, "");
        l.d(giphyViewModel, "");
        this.f100739h = bVar;
        this.f100740i = context;
        this.f100741j = pVar;
        this.f100742k = giphyViewModel;
        super.a((CharSequence) bVar.f100770b);
    }
}
