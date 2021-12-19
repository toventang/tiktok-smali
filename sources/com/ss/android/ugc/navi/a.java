package com.ss.android.ugc.navi;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.JsonReader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bt;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.utils.u;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public final class a extends RecyclerView.a<c> {

    /* renamed from: d  reason: collision with root package name */
    public static final C4018a f148628d = new C4018a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<bt> f148629a;

    /* renamed from: b  reason: collision with root package name */
    public final User f148630b;

    /* renamed from: c  reason: collision with root package name */
    public final b f148631c;

    /* renamed from: e  reason: collision with root package name */
    private final int f148632e;

    /* renamed from: f  reason: collision with root package name */
    private final int f148633f = 1;

    /* renamed from: g  reason: collision with root package name */
    private final int f148634g = 2;

    /* renamed from: h  reason: collision with root package name */
    private final Context f148635h;

    public interface b {
        static {
            Covode.recordClassIndex(97955);
        }

        void a(View view);

        void a(View view, String str);

        void d();
    }

    static {
        Covode.recordClassIndex(97953);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ c onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.navi.a$a  reason: collision with other inner class name */
    public static final class C4018a {
        static {
            Covode.recordClassIndex(97954);
        }

        private C4018a() {
        }

        public /* synthetic */ C4018a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<bt> list = this.f148629a;
        if (list != null) {
            return list.size() + 2;
        }
        return 2;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148643a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f148644b;

        static {
            Covode.recordClassIndex(97959);
        }

        d(a aVar, c cVar) {
            this.f148643a = aVar;
            this.f148644b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f148643a.f148631c.a(this.f148644b.f148640e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (i2 == 0) {
            return this.f148634g;
        }
        if (i2 != 1) {
            return this.f148633f;
        }
        return this.f148632e;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bt f148647b;

        static {
            Covode.recordClassIndex(97961);
        }

        f(a aVar, bt btVar) {
            this.f148646a = aVar;
            this.f148647b = btVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b bVar = this.f148646a.f148631c;
            l.b(view, "");
            String a2 = this.f148647b.a();
            if (a2 == null) {
                l.b();
            }
            bVar.a(view, a2);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148645a;

        static {
            Covode.recordClassIndex(97960);
        }

        e(a aVar) {
            this.f148645a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (hk.a(this.f148645a.f148630b.naviId)) {
                b bVar = this.f148645a.f148631c;
                l.b(view, "");
                String str = this.f148645a.f148630b.naviId;
                if (str == null) {
                    l.b();
                }
                bVar.a(view, str);
                return;
            }
            this.f148645a.f148631c.d();
        }
    }

    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final SmartCircleImageView f148636a;

        /* renamed from: b  reason: collision with root package name */
        public final GeckoLottieView f148637b;

        /* renamed from: c  reason: collision with root package name */
        public final View f148638c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f148639d;

        /* renamed from: e  reason: collision with root package name */
        public View f148640e;

        static {
            Covode.recordClassIndex(97956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.ctv);
            l.b(findViewById, "");
            this.f148636a = (SmartCircleImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.cjg);
            l.b(findViewById2, "");
            this.f148637b = (GeckoLottieView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ct0);
            l.b(findViewById3, "");
            this.f148638c = findViewById3;
            View findViewById4 = view.findViewById(R.id.ctw);
            l.b(findViewById4, "");
            ImageView imageView = (ImageView) findViewById4;
            this.f148639d = imageView;
            View findViewById5 = view.findViewById(R.id.ctu);
            l.b(findViewById5, "");
            this.f148640e = findViewById5;
            com.bytedance.tux.c.a a2 = com.bytedance.tux.c.c.a(AnonymousClass1.f148641a);
            Context context = view.getContext();
            l.b(context, "");
            com.bytedance.tux.c.b a3 = a2.a(context);
            com.bytedance.tux.c.e a4 = com.bytedance.tux.c.f.a(AnonymousClass2.f148642a);
            Context context2 = view.getContext();
            l.b(context2, "");
            imageView.setImageDrawable(i.a(a3, a4.a(context2)));
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(11218);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.azw, viewGroup, false);
        l.b(a3, "");
        c cVar = new c(a3);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(11218);
        return cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(c cVar, int i2) {
        c cVar2 = cVar;
        String str = "";
        l.d(cVar2, str);
        if (getItemViewType(i2) == this.f148634g) {
            GeckoLottieView geckoLottieView = cVar2.f148637b;
            l.d("share_navi_create_btn_animation.json", str);
            l.d("navi_lottie", str);
            l.d("share_navi_create_btn_animation_fallback.json", str);
            if (!com.ss.android.ugc.j.a.a()) {
                geckoLottieView.setAnimation("share_navi_create_btn_animation_fallback.json");
            } else {
                l.d("share_navi_create_btn_animation.json", str);
                l.d("navi_lottie", str);
                String b2 = dc.b(com.ss.android.ugc.j.a.f148527b, com.ss.android.ugc.j.a.f148526a);
                if (b2 != null) {
                    if ("navi_lottie".length() == 0) {
                        str = b2 + File.separator + "share_navi_create_btn_animation.json";
                    } else {
                        str = b2 + File.separator + "navi_lottie" + File.separator + "share_navi_create_btn_animation.json";
                    }
                }
                geckoLottieView.a(new JsonReader(new FileReader(str)), str);
            }
            cVar2.f148638c.setVisibility(8);
            cVar2.f148640e.setVisibility(0);
            cVar2.f148640e.setOnClickListener(new d(this, cVar2));
        } else {
            cVar2.f148638c.setVisibility(0);
            cVar2.f148640e.setVisibility(8);
        }
        if (getItemViewType(i2) == this.f148632e) {
            UrlModel avatarVideoUri = this.f148630b.getAvatarVideoUri();
            if (avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
                v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(u.a(this.f148630b)));
                a2.E = cVar2.f148636a;
                a2.c();
            } else {
                v a3 = r.a(Uri.parse(avatarVideoUri.getUrlList().get(0)));
                a3.K = true;
                a3.f39907c = true;
                a3.E = cVar2.f148636a;
                a3.c();
            }
            cVar2.f148639d.setOnClickListener(new e(this));
        }
        if (getItemViewType(i2) == this.f148633f) {
            List<bt> list = this.f148629a;
            if (list == null) {
                l.b();
            }
            bt btVar = list.get(i2 - 2);
            try {
                if (btVar.c() != null) {
                    cVar2.f148636a.setBackgroundColor(Color.parseColor(btVar.c()));
                }
            } catch (Exception unused) {
            }
            String b3 = btVar.b();
            if (b3 != null) {
                v a4 = r.a(Uri.parse(b3));
                a4.E = cVar2.f148636a;
                a4.v = w.CENTER_INSIDE;
                a4.c();
            }
            cVar2.f148639d.setOnClickListener(new f(this, btVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.bt> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, List<? extends bt> list, User user, b bVar) {
        l.d(context, "");
        l.d(user, "");
        l.d(bVar, "");
        this.f148635h = context;
        this.f148629a = list;
        this.f148630b = user;
        this.f148631c = bVar;
    }
}
