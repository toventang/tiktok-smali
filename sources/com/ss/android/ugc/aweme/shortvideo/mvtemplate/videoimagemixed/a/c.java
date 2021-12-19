package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.d;
import com.ss.android.ugc.aweme.experiment.fb;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.setting.cj;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.shortvideo.util.be;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public abstract class c extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f129442g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<MvImageChooseAdapter.MyMediaModel> f129443b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<CutSameVideoImageExtraData> f129444c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    int f129445d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f129446e = -1;

    /* renamed from: f  reason: collision with root package name */
    public e f129447f;

    static {
        Covode.recordClassIndex(84979);
    }

    public abstract int a();

    public abstract void a(int i2);

    public abstract void a(ArrayList<CutSameVideoImageExtraData> arrayList);

    public abstract CutSameVideoImageExtraData b();

    public void b(int i2) {
    }

    public Integer c(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        l.d(myMediaModel, "");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84980);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f129443b.size();
    }

    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final ImageView f129448a;

        /* renamed from: b  reason: collision with root package name */
        public final SimpleDraweeView f129449b = ((SimpleDraweeView) this.itemView.findViewById(R.id.ffs));

        /* renamed from: c  reason: collision with root package name */
        public TextView f129450c;

        /* renamed from: d  reason: collision with root package name */
        public final View f129451d;

        /* renamed from: e  reason: collision with root package name */
        public final View f129452e;

        /* renamed from: f  reason: collision with root package name */
        final RelativeLayout f129453f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f129454g;

        /* renamed from: h  reason: collision with root package name */
        private final View f129455h;

        /* renamed from: i  reason: collision with root package name */
        private final View f129456i;

        /* renamed from: j  reason: collision with root package name */
        private final ViewGroup f129457j;

        static {
            Covode.recordClassIndex(84981);
        }

        /* access modifiers changed from: package-private */
        public static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f129458a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f129459b;

            static {
                Covode.recordClassIndex(84982);
            }

            a(b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
                this.f129458a = bVar;
                this.f129459b = myMediaModel;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                e eVar = this.f129458a.f129454g.f129447f;
                if (eVar != null) {
                    eVar.a(this.f129459b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c$b$b  reason: collision with other inner class name */
        public static final class View$OnClickListenerC3372b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f129460a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f129461b;

            static {
                Covode.recordClassIndex(84983);
            }

            View$OnClickListenerC3372b(b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
                this.f129460a = bVar;
                this.f129461b = myMediaModel;
            }

            public final void onClick(View view) {
                e eVar;
                ClickAgent.onClick(view);
                if (!c.d(this.f129461b) && (eVar = this.f129460a.f129454g.f129447f) != null) {
                    eVar.a(this.f129461b, view);
                }
            }
        }

        private void a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            Context context = viewGroup.getContext();
            l.b(context, "");
            int a2 = (int) r.a(context, 64.0f);
            View view = this.itemView;
            l.b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Context context2 = viewGroup.getContext();
            l.b(context2, "");
            layoutParams.width = (int) r.a(context2, 76.0f);
            layoutParams.height = a2;
            View view2 = this.itemView;
            l.b(view2, "");
            view2.setLayoutParams(layoutParams);
            View view3 = this.itemView;
            Context context3 = viewGroup.getContext();
            l.b(context3, "");
            int a3 = (int) r.a(context3, 6.0f);
            Context context4 = viewGroup.getContext();
            l.b(context4, "");
            int a4 = (int) r.a(context4, 0.0f);
            Context context5 = viewGroup.getContext();
            l.b(context5, "");
            int a5 = (int) r.a(context5, 6.0f);
            Context context6 = viewGroup.getContext();
            l.b(context6, "");
            view3.setPadding(a3, a4, a5, (int) r.a(context6, 0.0f));
            View view4 = this.f129452e;
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.width = a2;
            layoutParams3.height = a2;
            view4.setLayoutParams(layoutParams3);
            SimpleDraweeView simpleDraweeView = this.f129449b;
            if (simpleDraweeView != null) {
                ViewGroup.LayoutParams layoutParams4 = simpleDraweeView.getLayoutParams();
                Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                layoutParams5.width = a2;
                layoutParams5.height = a2;
                simpleDraweeView.setLayoutParams(layoutParams5);
            }
            View view5 = this.f129451d;
            ViewGroup.LayoutParams layoutParams6 = view5.getLayoutParams();
            Objects.requireNonNull(layoutParams6, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
            Context context7 = viewGroup.getContext();
            l.b(context7, "");
            layoutParams7.width = (int) r.a(context7, 20.0f);
            Context context8 = viewGroup.getContext();
            l.b(context8, "");
            layoutParams7.height = (int) r.a(context8, 20.0f);
            view5.setLayoutParams(layoutParams7);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abc, viewGroup, false));
            l.d(viewGroup, "");
            this.f129454g = cVar;
            this.f129457j = viewGroup;
            View findViewById = this.itemView.findViewById(R.id.ar9);
            l.b(findViewById, "");
            this.f129450c = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.ajw);
            l.b(findViewById2, "");
            this.f129451d = findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.dxa);
            l.b(findViewById3, "");
            this.f129452e = findViewById3;
            RelativeLayout relativeLayout = (RelativeLayout) this.itemView.findViewById(R.id.dqn);
            this.f129453f = relativeLayout;
            View findViewById4 = this.itemView.findViewById(R.id.ajv);
            l.b(findViewById4, "");
            ImageView imageView = (ImageView) findViewById4;
            this.f129448a = imageView;
            View findViewById5 = this.itemView.findViewById(R.id.d8p);
            l.b(findViewById5, "");
            this.f129455h = findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.bcs);
            l.b(findViewById6, "");
            this.f129456i = findViewById6;
            float b2 = com.ss.android.ttve.utils.b.b(viewGroup.getContext(), 2.0f);
            Drawable a2 = com.ss.android.ugc.tools.view.a.a(0, 1275068416, new float[]{0.0f, 0.0f, b2, b2, 0.0f, 0.0f, b2, b2});
            if (relativeLayout == null) {
                l.b();
            }
            if (com.ss.android.ugc.aweme.tools.c.a(relativeLayout.getContext())) {
                a2 = com.ss.android.ugc.tools.view.a.a(0, 1275068416, new float[]{b2, b2, 0.0f, 0.0f, b2, b2, 0.0f, 0.0f});
            }
            imageView.setBackground(a2);
            Context context = viewGroup.getContext();
            l.b(context, "");
            int i2 = (int) b2;
            findViewById3.setBackground(com.ss.android.ugc.tools.view.a.a(context.getResources().getColor(R.color.bh), 0, i2, i2));
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            layoutParams.height = (int) com.ss.android.ttve.utils.b.b(findViewById2.getContext(), 36.0f);
            layoutParams.width = (int) com.ss.android.ttve.utils.b.b(findViewById2.getContext(), 36.0f);
            findViewById2.setLayoutParams(layoutParams);
        }

        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, b bVar, int i2) {
            int i3;
            l.d(bVar, "");
            int i4 = 0;
            if (myMediaModel != null) {
                if (fb.b()) {
                    a(this.f129457j);
                }
                c.a(bVar, h.d(myMediaModel.f109390b));
                if (myMediaModel.b()) {
                    this.f129450c.setText(c.c(h.g.a.a((((float) myMediaModel.f109396h) * 1.0f) / 1000.0f)));
                    this.f129450c.setVisibility(0);
                    View view = this.f129456i;
                    if (cj.a()) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    view.setVisibility(i3);
                } else {
                    this.f129450c.setVisibility(8);
                    this.f129456i.setVisibility(8);
                }
            }
            this.f129451d.setOnClickListener(new a(this, myMediaModel));
            RelativeLayout relativeLayout = this.f129453f;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new View$OnClickListenerC3372b(this, myMediaModel));
            }
            View view2 = this.f129455h;
            if (this.f129454g.f129446e != i2) {
                i4 = 8;
            }
            view2.setVisibility(i4);
        }
    }

    public static boolean d(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return true;
        }
        if (!TextUtils.isEmpty(myMediaModel.f109390b) || !TextUtils.isEmpty(myMediaModel.f109399k)) {
            return false;
        }
        return true;
    }

    public void b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        l.d(myMediaModel, "");
        notifyItemInserted(getItemCount());
        this.f129443b.add(myMediaModel);
        q.d("VideoImageMixedBaseAdapter addMediaData originIndex " + myMediaModel.u + " selectIndex " + myMediaModel.v);
    }

    public static String c(int i2) {
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            String a2 = com.a.a(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, 2));
            l.b(a2, "");
            return a2;
        }
        String a3 = com.a.a(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)}, 3));
        l.b(a3, "");
        return a3;
    }

    public void a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            int size = this.f129443b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MvImageChooseAdapter.MyMediaModel myMediaModel2 = this.f129443b.get(i2);
                l.b(myMediaModel2, "");
                if (l.a((Object) myMediaModel2.f109390b, (Object) myMediaModel.f109390b)) {
                    notifyItemRemoved(i2);
                    break;
                }
                i2++;
            }
            this.f129443b.remove(myMediaModel);
            q.d("VideoImageMixedBaseAdapter deleteMediaData originIndex " + myMediaModel.u + " selectIndex " + myMediaModel.v + ' ' + be.a());
        }
    }

    public void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        l.d(viewHolder, "");
        l.d(viewHolder2, "");
        a(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        b bVar = (b) viewHolder;
        bVar.a(this.f129443b.get(i2), bVar, i2);
    }

    public final void a(int i2, int i3) {
        int size = this.f129443b.size() - 1;
        if (i2 >= 0 && size >= i2) {
            int size2 = this.f129443b.size() - 1;
            if (i3 >= 0 && size2 >= i3) {
                notifyItemMoved(i2, i3);
                MvImageChooseAdapter.MyMediaModel remove = this.f129443b.remove(i2);
                l.b(remove, "");
                this.f129443b.add(i3, remove);
            }
        }
    }

    public static void a(b bVar, Uri uri) {
        com.facebook.drawee.h.a aVar;
        com.facebook.drawee.f.a aVar2;
        l.d(bVar, "");
        l.d(uri, "");
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(uri);
        a2.f48447d = new d(en.a(56.0d, i.f115645a), en.a(56.0d, i.f115645a));
        REQUEST request = (REQUEST) a2.a();
        e b2 = com.facebook.drawee.a.a.c.b();
        SimpleDraweeView simpleDraweeView = bVar.f129449b;
        if (simpleDraweeView != null) {
            aVar = simpleDraweeView.getController();
        } else {
            aVar = null;
        }
        b2.f47325m = aVar;
        b2.f47315c = request;
        com.facebook.drawee.c.a c2 = b2.e();
        SimpleDraweeView simpleDraweeView2 = bVar.f129449b;
        if (simpleDraweeView2 != null) {
            simpleDraweeView2.setController(c2);
        }
        Drawable a3 = com.ss.android.ugc.tools.view.a.a(0, 135665699, 0, (int) com.ss.android.ttve.utils.b.b(bVar.f129451d.getContext(), 2.0f));
        SimpleDraweeView simpleDraweeView3 = bVar.f129449b;
        if (simpleDraweeView3 != null && (aVar2 = (com.facebook.drawee.f.a) simpleDraweeView3.getHierarchy()) != null) {
            aVar2.a(1, a3);
        }
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        l.d(viewGroup, "");
        b bVar = new b(cVar, viewGroup);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        return bVar;
    }
}
