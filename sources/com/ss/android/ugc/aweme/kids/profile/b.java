package com.ss.android.ugc.aweme.kids.profile;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.kids.profile.HeaderDetailActivity;
import com.ss.android.ugc.aweme.kids.profile.e;
import com.ss.android.ugc.aweme.kids.profile.utils.a;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class b extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f106745b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    List<e> f106746a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.b<com.ss.android.ugc.aweme.kids.profile.utils.a, z> f106747c;

    static {
        Covode.recordClassIndex(68235);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return i2 != 0 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68236);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f106746a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.b$b  reason: collision with other inner class name */
    public static final class C2735b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final h.f.a.b<com.ss.android.ugc.aweme.kids.profile.utils.a, z> f106750a;

        static {
            Covode.recordClassIndex(68237);
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.profile.b$b$b  reason: collision with other inner class name */
        public static final class C2736b implements IAVInfoService.IGetInfoCallback<Bitmap> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SmartImageView f106753a;

            static {
                Covode.recordClassIndex(68239);
            }

            C2736b(SmartImageView smartImageView) {
                this.f106753a = smartImageView;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final /* synthetic */ void finish(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    this.f106753a.setImageBitmap(bitmap2);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.profile.b$b$a */
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2735b f106751a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c f106752b;

            static {
                Covode.recordClassIndex(68238);
            }

            a(C2735b bVar, com.ss.android.ugc.aweme.draft.model.c cVar) {
                this.f106751a = bVar;
                this.f106752b = cVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h.f.a.b<com.ss.android.ugc.aweme.kids.profile.utils.a, z> bVar = this.f106751a.f106750a;
                View view2 = this.f106751a.itemView;
                l.b(view2, "");
                bVar.invoke(new a.C2738a(view2, this.f106752b));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.kids.profile.utils.a, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2735b(View view, h.f.a.b<? super com.ss.android.ugc.aweme.kids.profile.utils.a, z> bVar) {
            super(view);
            l.d(view, "");
            l.d(bVar, "");
            this.f106750a = bVar;
        }
    }

    public static final class c extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(68240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.d(view, "");
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f106754a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f106755b;

            static {
                Covode.recordClassIndex(68241);
            }

            a(c cVar, a aVar) {
                this.f106754a = cVar;
                this.f106755b = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View view2 = this.f106754a.itemView;
                l.b(view2, "");
                if (view2.getContext() instanceof Activity) {
                    View view3 = this.f106754a.itemView;
                    l.b(view3, "");
                    Context context = view3.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    HeaderDetailActivity.a.a((Activity) context, view, this.f106755b.f106740e);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.kids.profile.utils.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(h.f.a.b<? super com.ss.android.ugc.aweme.kids.profile.utils.a, z> bVar) {
        l.d(bVar, "");
        this.f106747c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if ((viewHolder instanceof c) && (this.f106746a.get(i2) instanceof e.b)) {
            e eVar = this.f106746a.get(i2);
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.profile.ProfileVideoData.KidsProfileHeader");
            c cVar = (c) viewHolder;
            a aVar = ((e.b) eVar).f106782a;
            l.d(aVar, "");
            AvatarImageView avatarImageView = (AvatarImageView) cVar.itemView.findViewById(R.id.bf3);
            com.ss.android.ugc.aweme.base.e.a(avatarImageView, aVar.f106736a);
            avatarImageView.setOnClickListener(new c.a(cVar, aVar));
            View findViewById = cVar.itemView.findViewById(R.id.c44);
            l.b(findViewById, "");
            ((TuxTextView) findViewById).setText(aVar.f106739d);
        } else if ((viewHolder instanceof C2735b) && (this.f106746a.get(i2) instanceof e.a)) {
            e eVar2 = this.f106746a.get(i2);
            Objects.requireNonNull(eVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.profile.ProfileVideoData.DraftVideo");
            C2735b bVar = (C2735b) viewHolder;
            com.ss.android.ugc.aweme.draft.model.c cVar2 = ((e.a) eVar2).f106781a;
            l.d(cVar2, "");
            View findViewById2 = bVar.itemView.findViewById(R.id.agf);
            l.b(findViewById2, "");
            SmartImageView smartImageView = (SmartImageView) findViewById2;
            if (cVar2.k()) {
                String o = cVar2.o();
                if (com.ss.android.ugc.aweme.video.e.b(o)) {
                    v a2 = r.a(new File(o));
                    a2.E = smartImageView;
                    a2.a("DraftBoxViewHolder").c();
                }
            } else if (cVar2.n()) {
                String p = cVar2.p();
                if (com.ss.android.ugc.aweme.video.e.b(p)) {
                    v a3 = r.a(new File(p));
                    a3.E = smartImageView;
                    a3.a("DraftBoxViewHolder").c();
                }
            } else {
                AVExternalServiceImpl.a().abilityService().infoService().videoCover(cVar2, new C2735b.C2736b(smartImageView));
            }
            bVar.itemView.setOnClickListener(new C2735b.a(bVar, cVar2));
        }
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.i(2395);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == 0) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.adv, viewGroup, false);
            l.b(a2, "");
            viewHolder = new c(a2);
        } else if (i2 != 1) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.adr, viewGroup, false);
            l.b(a3, "");
            viewHolder = new C2735b(a3, bVar.f106747c);
        } else {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.adr, viewGroup, false);
            l.b(a4, "");
            viewHolder = new C2735b(a4, bVar.f106747c);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(2395);
        return viewHolder;
    }
}
