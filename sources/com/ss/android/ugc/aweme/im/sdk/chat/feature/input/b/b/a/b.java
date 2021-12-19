package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.emoji.b.d;
import com.ss.android.ugc.aweme.emoji.b.f;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends RecyclerView.a<d<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a f100629a;

    static {
        Covode.recordClassIndex(64373);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ d<f> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f100629a.f100642e.c();
    }

    public final class a extends d<f> {

        /* renamed from: a  reason: collision with root package name */
        public RemoteImageView f100630a;

        static {
            Covode.recordClassIndex(64374);
        }

        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final void a() {
            View findViewById = this.itemView.findViewById(R.id.ehd);
            l.b(findViewById, "");
            this.f100630a = (RemoteImageView) findViewById;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$a$b  reason: collision with other inner class name */
        static final class View$OnClickListenerC2485b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f100633a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f100634b;

            static {
                Covode.recordClassIndex(64376);
            }

            View$OnClickListenerC2485b(a aVar, int i2) {
                this.f100633a = aVar;
                this.f100634b = i2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                RemoteImageView remoteImageView = this.f100633a.f100630a;
                if (remoteImageView == null) {
                    l.a("tabIv");
                }
                if (!remoteImageView.isSelected()) {
                    b.this.f100629a.a(this.f100634b);
                }
            }
        }

        public a(View view) {
            super(view);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$a$a  reason: collision with other inner class name */
        static final class C2484a implements androidx.fragment.app.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f100632a;

            static {
                Covode.recordClassIndex(64375);
            }

            C2484a(f fVar) {
                this.f100632a = fVar;
            }

            @Override // androidx.fragment.app.a
            public final void a(View view, androidx.core.h.a.d dVar) {
                l.d(view, "");
                l.d(dVar, "");
                if (!TextUtils.isEmpty(this.f100632a.e())) {
                    view.setContentDescription(this.f100632a.e());
                }
                dVar.a((CharSequence) TextView.class.getName());
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final /* synthetic */ void a(f fVar, int i2) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            RemoteImageView remoteImageView = this.f100630a;
            if (remoteImageView == null) {
                l.a("tabIv");
            }
            boolean z = false;
            remoteImageView.setPadding(0, 0, 0, 0);
            if (fVar2.j() == 2) {
                View view = this.itemView;
                l.b(view, "");
                int b2 = (int) n.b(view.getContext(), 6.0f);
                RemoteImageView remoteImageView2 = this.f100630a;
                if (remoteImageView2 == null) {
                    l.a("tabIv");
                }
                remoteImageView2.setPadding(b2, b2, b2, b2);
                RemoteImageView remoteImageView3 = this.f100630a;
                if (remoteImageView3 == null) {
                    l.a("tabIv");
                }
                e.b(remoteImageView3, fVar2.b(), -1, -1);
            } else {
                if (fVar2.j() == 1) {
                    View view2 = this.itemView;
                    l.b(view2, "");
                    int b3 = (int) n.b(view2.getContext(), 6.0f);
                    RemoteImageView remoteImageView4 = this.f100630a;
                    if (remoteImageView4 == null) {
                        l.a("tabIv");
                    }
                    remoteImageView4.setPadding(b3, b3, b3, b3);
                }
                if (fVar2.a() > 0) {
                    RemoteImageView remoteImageView5 = this.f100630a;
                    if (remoteImageView5 == null) {
                        l.a("tabIv");
                    }
                    remoteImageView5.setImageResource(fVar2.a());
                } else {
                    Drawable d2 = fVar2.d();
                    if (d2 != null) {
                        RemoteImageView remoteImageView6 = this.f100630a;
                        if (remoteImageView6 == null) {
                            l.a("tabIv");
                        }
                        remoteImageView6.setImageDrawable(d2);
                    }
                }
            }
            if (!TextUtils.isEmpty(fVar2.e())) {
                RemoteImageView remoteImageView7 = this.f100630a;
                if (remoteImageView7 == null) {
                    l.a("tabIv");
                }
                androidx.fragment.app.b.a(remoteImageView7, new C2484a(fVar2));
            }
            int i3 = b.this.f100629a.f100642e.f89285c;
            RemoteImageView remoteImageView8 = this.f100630a;
            if (remoteImageView8 == null) {
                l.a("tabIv");
            }
            if (i2 == i3) {
                z = true;
            }
            remoteImageView8.setSelected(z);
            RemoteImageView remoteImageView9 = this.f100630a;
            if (remoteImageView9 == null) {
                l.a("tabIv");
            }
            remoteImageView9.setOnClickListener(new View$OnClickListenerC2485b(this, i2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$b  reason: collision with other inner class name */
    public final class C2486b extends d<f> {

        /* renamed from: a  reason: collision with root package name */
        public TextView f100635a;

        static {
            Covode.recordClassIndex(64377);
        }

        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final void a() {
            View findViewById = this.itemView.findViewById(R.id.ehd);
            l.b(findViewById, "");
            this.f100635a = (TextView) findViewById;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$b$b  reason: collision with other inner class name */
        static final class View$OnClickListenerC2487b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2486b f100638a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f100639b;

            static {
                Covode.recordClassIndex(64379);
            }

            View$OnClickListenerC2487b(C2486b bVar, int i2) {
                this.f100638a = bVar;
                this.f100639b = i2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TextView textView = this.f100638a.f100635a;
                if (textView == null) {
                    l.a("tabIv");
                }
                if (!textView.isSelected()) {
                    b.this.f100629a.a(this.f100639b);
                }
            }
        }

        public C2486b(View view) {
            super(view);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$b$a */
        static final class a implements androidx.fragment.app.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f100637a;

            static {
                Covode.recordClassIndex(64378);
            }

            a(f fVar) {
                this.f100637a = fVar;
            }

            @Override // androidx.fragment.app.a
            public final void a(View view, androidx.core.h.a.d dVar) {
                l.d(view, "");
                l.d(dVar, "");
                if (!TextUtils.isEmpty(this.f100637a.e())) {
                    view.setContentDescription(this.f100637a.e());
                }
                dVar.a((CharSequence) TextView.class.getName());
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final /* synthetic */ void a(f fVar, int i2) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            TextView textView = this.f100635a;
            if (textView == null) {
                l.a("tabIv");
            }
            boolean z = false;
            textView.setPadding(0, 0, 0, 0);
            if (fVar2.j() == 5) {
                TextView textView2 = this.f100635a;
                if (textView2 == null) {
                    l.a("tabIv");
                }
                textView2.setText(fVar2.c());
            }
            if (!TextUtils.isEmpty(fVar2.e())) {
                TextView textView3 = this.f100635a;
                if (textView3 == null) {
                    l.a("tabIv");
                }
                androidx.fragment.app.b.a(textView3, new a(fVar2));
            }
            int i3 = b.this.f100629a.f100642e.f89285c;
            TextView textView4 = this.f100635a;
            if (textView4 == null) {
                l.a("tabIv");
            }
            if (i2 == i3) {
                z = true;
            }
            textView4.setSelected(z);
            TextView textView5 = this.f100635a;
            if (textView5 == null) {
                l.a("tabIv");
            }
            textView5.setOnClickListener(new View$OnClickListenerC2487b(this, i2));
        }
    }

    public b(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a aVar) {
        l.d(aVar, "");
        this.f100629a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f100629a.f100642e.b(i2).j();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(d<f> dVar, int i2) {
        d<f> dVar2 = dVar;
        l.d(dVar2, "");
        dVar2.a(this.f100629a.f100642e.b(i2), i2);
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(5361);
        l.d(viewGroup, "");
        if (i2 == 5) {
            viewHolder = new C2486b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.yx, viewGroup, false));
        } else {
            viewHolder = new a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.yv, viewGroup, false));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
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
        MethodCollector.o(5361);
        return viewHolder;
    }
}
