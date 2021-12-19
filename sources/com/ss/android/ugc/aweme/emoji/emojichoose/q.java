package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.emoji.b.d;
import com.ss.android.ugc.aweme.emoji.b.f;
import com.ss.android.ugc.aweme.emoji.b.g;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;

public final class q extends RecyclerView.a<d> {

    /* renamed from: a  reason: collision with root package name */
    public g f89289a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f89290b;

    static {
        Covode.recordClassIndex(56111);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ d onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public class a extends d<f> {

        /* renamed from: a  reason: collision with root package name */
        public RemoteImageView f89291a;

        static {
            Covode.recordClassIndex(56112);
        }

        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final void a() {
            this.f89291a = (RemoteImageView) this.itemView.findViewById(R.id.ehd);
        }

        a(View view) {
            super(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final /* synthetic */ void a(f fVar, final int i2) {
            int i3;
            boolean z;
            f fVar2 = fVar;
            if (fVar2.j() == 2) {
                e.b(this.f89291a, fVar2.b(), -1, -1);
            } else if (fVar2.a() > 0) {
                this.f89291a.setImageResource(fVar2.a());
            } else {
                Drawable d2 = fVar2.d();
                if (d2 != null) {
                    this.f89291a.setImageDrawable(d2);
                }
            }
            if (!TextUtils.isEmpty(fVar2.e())) {
                androidx.fragment.app.b.a(this.f89291a, new r(fVar2));
            }
            if (q.this.f89290b) {
                i3 = q.this.f89289a.b().f89285c;
            } else {
                i3 = q.this.f89289a.a().f89279c;
            }
            RemoteImageView remoteImageView = this.f89291a;
            if (i2 == i3) {
                z = true;
            } else {
                z = false;
            }
            remoteImageView.setSelected(z);
            this.f89291a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.emoji.emojichoose.q.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(56113);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (!a.this.f89291a.isSelected()) {
                        q.this.f89289a.a(i2);
                    }
                }
            });
        }
    }

    public class b extends d<f> {

        /* renamed from: a  reason: collision with root package name */
        public TextView f89295a;

        static {
            Covode.recordClassIndex(56114);
        }

        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final void a() {
            this.f89295a = (TextView) this.itemView.findViewById(R.id.ehd);
        }

        b(View view) {
            super(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final /* synthetic */ void a(f fVar, final int i2) {
            int i3;
            f fVar2 = fVar;
            boolean z = false;
            this.f89295a.setPadding(0, 0, 0, 0);
            if (fVar2.j() == 5) {
                this.f89295a.setText(fVar2.c());
            }
            if (!TextUtils.isEmpty(fVar2.e())) {
                androidx.fragment.app.b.a(this.f89295a, new s(fVar2));
            }
            if (q.this.f89290b) {
                i3 = q.this.f89289a.b().f89285c;
            } else {
                i3 = q.this.f89289a.a().f89279c;
            }
            TextView textView = this.f89295a;
            if (i2 == i3) {
                z = true;
            }
            textView.setSelected(z);
            this.f89295a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.emoji.emojichoose.q.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(56115);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (!b.this.f89295a.isSelected()) {
                        q.this.f89289a.a(i2);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (this.f89290b) {
            return this.f89289a.b().c();
        }
        return this.f89289a.a().b();
    }

    public q(g gVar) {
        this.f89289a = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (this.f89290b) {
            return this.f89289a.b().b(i2).j();
        }
        return this.f89289a.a().e(i2).j();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(d dVar, int i2) {
        d dVar2 = dVar;
        if (this.f89290b) {
            dVar2.a(this.f89289a.b().b(i2), i2);
        } else {
            dVar2.a(this.f89289a.a().e(i2), i2);
        }
    }

    private static RecyclerView.ViewHolder a(q qVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(3540);
        if (i2 == 5) {
            viewHolder = new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.yw, viewGroup, false));
        } else {
            viewHolder = new a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.yu, viewGroup, false));
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
        MethodCollector.o(3540);
        return viewHolder;
    }
}
