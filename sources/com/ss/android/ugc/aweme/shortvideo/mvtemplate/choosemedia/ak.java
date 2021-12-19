package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate;
import com.ss.android.ugc.tools.infosticker.view.internal.base.b;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel;
import com.ss.android.ugc.tools.utils.p;
import com.ss.android.ugc.tools.view.style.StyleEditText;
import com.ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.ss.android.ugc.tools.view.widget.j;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class ak extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public static final a f128920f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public s f128921a;

    /* renamed from: b  reason: collision with root package name */
    public ShortVideoContext f128922b;

    /* renamed from: c  reason: collision with root package name */
    final h.h f128923c = h.i.a((h.f.a.a) c.f128933a);

    /* renamed from: d  reason: collision with root package name */
    final h.h f128924d = h.i.a((h.f.a.a) new b(this));

    /* renamed from: e  reason: collision with root package name */
    public MvImageChooseAdapter.c f128925e;

    /* renamed from: g  reason: collision with root package name */
    private ViewGroup f128926g;

    /* renamed from: h  reason: collision with root package name */
    private Context f128927h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.tools.infosticker.view.internal.main.g f128928i;

    /* renamed from: j  reason: collision with root package name */
    private View f128929j;

    /* renamed from: k  reason: collision with root package name */
    private View f128930k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f128931l = h.i.a((h.f.a.a) new h(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f128932m = h.i.a((h.f.a.a) new i(this));
    private final f.a.b.a n = new f.a.b.a();
    private HashMap o;

    static {
        Covode.recordClassIndex(84596);
    }

    public final com.ss.android.ugc.tools.infosticker.view.internal.h<ProviderEffect> a() {
        return (com.ss.android.ugc.tools.infosticker.view.internal.h) this.f128931l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84597);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect>> {
        final /* synthetic */ ak this$0;

        static {
            Covode.recordClassIndex(84604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ak akVar) {
            super(0);
            this.this$0 = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect> invoke() {
            return ak.a(this.this$0);
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.tools.infosticker.a.a.b> {
        final /* synthetic */ ak this$0;

        static {
            Covode.recordClassIndex(84598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ak akVar) {
            super(0);
            this.this$0 = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.infosticker.a.a.b invoke() {
            return ((com.ss.android.ugc.tools.infosticker.a.a.c) this.this$0.f128923c.getValue()).a();
        }
    }

    static final class i extends m implements h.f.a.a<k<ProviderEffect>> {
        final /* synthetic */ ak this$0;

        static {
            Covode.recordClassIndex(84608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ak akVar) {
            super(0);
            this.this$0 = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k<ProviderEffect> invoke() {
            com.ss.android.ugc.tools.infosticker.view.internal.h<ProviderEffect> a2 = this.this$0.a();
            if (!(a2 instanceof k)) {
                return null;
            }
            return a2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.tools.infosticker.a.b.b.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f128933a = new c();

        static {
            Covode.recordClassIndex(84599);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.infosticker.a.b.b.e invoke() {
            Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
            l.b(application, "");
            return new com.ss.android.ugc.tools.infosticker.a.b.b.e(application, AnonymousClass1.f128934a, AnonymousClass2.f128935a, AnonymousClass3.f128936a);
        }
    }

    static final class h extends m implements h.f.a.a<InfoStickerProviderListViewModel> {
        final /* synthetic */ ak this$0;

        static {
            Covode.recordClassIndex(84607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ak akVar) {
            super(0);
            this.this$0 = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InfoStickerProviderListViewModel invoke() {
            ak akVar = this.this$0;
            return new InfoStickerProviderListViewModel(akVar, (com.ss.android.ugc.tools.infosticker.a.a.b) akVar.f128924d.getValue(), new com.ss.android.ugc.aweme.sticker.m.a.d(this.this$0.f128922b));
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f128940a;

        static {
            Covode.recordClassIndex(84606);
        }

        g(Context context) {
            this.f128940a = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            j.a.a(this.f128940a, (int) R.string.bpc, 0).a();
        }
    }

    public static final /* synthetic */ s a(ak akVar) {
        s sVar = akVar.f128921a;
        if (sVar == null) {
            l.a("gifListView");
        }
        return sVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        s sVar = this.f128921a;
        if (sVar == null) {
            l.a("gifListView");
        }
        sVar.cD_();
    }

    static final class d extends m implements h.f.a.b<b.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f128937a = new d();

        static {
            Covode.recordClassIndex(84603);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b.c cVar) {
            b.c cVar2 = cVar;
            l.d(cVar2, "");
            cVar2.f149566b = null;
            cVar2.f149567c = null;
            cVar2.f149568d = null;
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ShortVideoContext shortVideoContext;
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                shortVideoContext = (ShortVideoContext) arguments.getParcelable("key_short_video_context");
            } else {
                shortVideoContext = null;
            }
            this.f128922b = shortVideoContext;
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ak f128938a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f128939b;

        static {
            Covode.recordClassIndex(84605);
        }

        f(ak akVar, Context context) {
            this.f128938a = akVar;
            this.f128939b = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            long j2;
            String size;
            String width;
            String height;
            ProviderEffectTemplate providerEffectTemplate = (ProviderEffectTemplate) obj;
            int i3 = 0;
            if (providerEffectTemplate.getPath() != null) {
                MvImageChooseAdapter.c cVar = this.f128938a.f128925e;
                if (cVar != null) {
                    l.b(providerEffectTemplate, "");
                    MediaModel mediaModel = new MediaModel(providerEffectTemplate.getId());
                    mediaModel.f109390b = providerEffectTemplate.getPath();
                    mediaModel.p = providerEffectTemplate.getUser_name();
                    ProviderEffect.StickerBean sticker_info = providerEffectTemplate.getSticker_info();
                    if (sticker_info == null || (height = sticker_info.getHeight()) == null) {
                        i2 = 0;
                    } else {
                        i2 = Integer.parseInt(height);
                    }
                    mediaModel.f109401m = i2;
                    ProviderEffect.StickerBean sticker_info2 = providerEffectTemplate.getSticker_info();
                    if (!(sticker_info2 == null || (width = sticker_info2.getWidth()) == null)) {
                        i3 = Integer.parseInt(width);
                    }
                    mediaModel.f109400l = i3;
                    ProviderEffect.StickerBean sticker_info3 = providerEffectTemplate.getSticker_info();
                    if (sticker_info3 == null || (size = sticker_info3.getSize()) == null) {
                        j2 = 0;
                    } else {
                        j2 = Long.parseLong(size);
                    }
                    mediaModel.f109397i = j2;
                    mediaModel.o = Uri.parse(providerEffectTemplate.getPath());
                    mediaModel.f109399k = String.valueOf(providerEffectTemplate.getThumbnailSticker());
                    mediaModel.f109395g = 2;
                    cVar.a(mediaModel);
                }
                ak.a(this.f128938a).b();
                return;
            }
            j.a.a(this.f128939b, (int) R.string.bpc, 0).a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(10644);
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.a3d, viewGroup, false);
        if (a2 != null) {
            ViewGroup viewGroup2 = (ViewGroup) a2;
            this.f128926g = viewGroup2;
            if (viewGroup2 == null) {
                l.a("mRootView");
            }
            Context context = viewGroup2.getContext();
            l.b(context, "");
            this.f128927h = context;
            if (context == null) {
                l.a("mContext");
            }
            ViewGroup viewGroup3 = this.f128926g;
            if (viewGroup3 == null) {
                l.a("mRootView");
            }
            View findViewById = viewGroup3.findViewById(R.id.bao);
            l.b(findViewById, "");
            FrameLayout frameLayout = (FrameLayout) findViewById;
            ViewGroup viewGroup4 = this.f128926g;
            if (viewGroup4 == null) {
                l.a("mRootView");
            }
            View findViewById2 = viewGroup4.findViewById(R.id.bap);
            l.b(findViewById2, "");
            RelativeLayout relativeLayout = (RelativeLayout) findViewById2;
            com.ss.android.ugc.tools.infosticker.view.internal.h<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect> a3 = a();
            k kVar = (k) this.f128932m.getValue();
            ViewGroup viewGroup5 = this.f128926g;
            if (viewGroup5 == null) {
                l.a("mRootView");
            }
            s sVar = new s(context, this, a3, kVar, viewGroup5, d.f128937a);
            sVar.s();
            this.f128921a = sVar;
            e eVar = new e(this);
            ViewGroup viewGroup6 = this.f128926g;
            if (viewGroup6 == null) {
                l.a("mRootView");
            }
            Context context2 = viewGroup6.getContext();
            if (!(context2 instanceof Activity)) {
                context2 = null;
            }
            com.ss.android.ugc.tools.infosticker.view.internal.main.g gVar = new com.ss.android.ugc.tools.infosticker.view.internal.main.g(relativeLayout, eVar, frameLayout, (Activity) context2, getString(R.string.c4y), false);
            gVar.a(true);
            this.f128928i = gVar;
            View view = gVar.f149705g;
            if (view == null) {
                l.a("content");
            }
            this.f128930k = view;
            if (view == null) {
                l.a("searchContent");
            }
            com.bytedance.tux.h.i.b(view, 0, Integer.valueOf((int) n.b(getContext(), -3.0f)), 0, Integer.valueOf((int) n.b(getContext(), 12.0f)), false);
            Context context3 = getContext();
            if (context3 != null) {
                View view2 = this.f128930k;
                if (view2 == null) {
                    l.a("searchContent");
                }
                View findViewById3 = view2.findViewById(R.id.c0w);
                l.b(findViewById3, "");
                ((AVAutoRTLImageView) findViewById3).setBackground(androidx.appcompat.a.a.a.b(context3, 2131232421));
                View view3 = this.f128930k;
                if (view3 == null) {
                    l.a("searchContent");
                }
                View findViewById4 = view3.findViewById(R.id.y0);
                l.b(findViewById4, "");
                ((ImageButton) findViewById4).setBackground(androidx.appcompat.a.a.a.b(context3, 2131232420));
                View view4 = this.f128930k;
                if (view4 == null) {
                    l.a("searchContent");
                }
                ((StyleEditText) view4.findViewById(R.id.f6h)).setHintTextColor(androidx.core.content.b.c(context3, R.color.c5));
                View view5 = this.f128930k;
                if (view5 == null) {
                    l.a("searchContent");
                }
                ((StyleEditText) view5.findViewById(R.id.f6h)).setTextColor(androidx.core.content.b.c(context3, R.color.bx));
                View view6 = this.f128930k;
                if (view6 == null) {
                    l.a("searchContent");
                }
                View findViewById5 = view6.findViewById(R.id.dp3);
                l.b(findViewById5, "");
                ((FrameLayout) findViewById5).setBackground(androidx.appcompat.a.a.a.b(context3, R.drawable.a_g));
            }
            s sVar2 = this.f128921a;
            if (sVar2 == null) {
                l.a("gifListView");
            }
            View l2 = sVar2.l();
            this.f128929j = l2;
            if (l2 == null) {
                l.a("gifContent");
            }
            RecyclerView recyclerView = (RecyclerView) l2.findViewById(R.id.eb9);
            l.b(recyclerView, "");
            recyclerView.setVerticalFadingEdgeEnabled(false);
            View view7 = this.f128929j;
            if (view7 == null) {
                l.a("gifContent");
            }
            frameLayout.addView(view7);
            f.a.b.a aVar = this.n;
            s sVar3 = this.f128921a;
            if (sVar3 == null) {
                l.a("gifListView");
            }
            aVar.a(sVar3.g().a(new f(this, context), p.f150012a));
            f.a.b.a aVar2 = this.n;
            s sVar4 = this.f128921a;
            if (sVar4 == null) {
                l.a("gifListView");
            }
            aVar2.a(sVar4.h().a(new g(context), p.f150012a));
            ViewGroup viewGroup7 = this.f128926g;
            if (viewGroup7 == null) {
                l.a("mRootView");
            }
            MethodCollector.o(10644);
            return viewGroup7;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(10644);
        throw nullPointerException;
    }
}
