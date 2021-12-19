package com.ss.android.ugc.aweme.im.sdk.relations.ui.c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.sharer.a.b;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.Objects;

public abstract class a<ITEM> extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public q<? super Integer, ? super Integer, ? super View, z> f103265a;

    /* renamed from: b  reason: collision with root package name */
    public final View f103266b;

    /* renamed from: c  reason: collision with root package name */
    public final AvatarImageView f103267c;

    /* renamed from: d  reason: collision with root package name */
    public final TuxIconView f103268d = ((TuxIconView) this.itemView.findViewById(R.id.fez));

    /* renamed from: e  reason: collision with root package name */
    public final TextView f103269e = ((TextView) this.itemView.findViewById(R.id.csg));

    /* renamed from: f  reason: collision with root package name */
    public final TextView f103270f = ((TextView) this.itemView.findViewById(R.id.al5));

    /* renamed from: g  reason: collision with root package name */
    public final TextView f103271g = ((TextView) this.itemView.findViewById(R.id.bnx));

    /* renamed from: h  reason: collision with root package name */
    public final TuxCheckBox f103272h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f103273i;

    /* renamed from: j  reason: collision with root package name */
    private final int f103274j;

    /* renamed from: k  reason: collision with root package name */
    private final int f103275k;

    static {
        Covode.recordClassIndex(66194);
    }

    public abstract void a(ITEM item, ITEM item2, int i2);

    /* access modifiers changed from: protected */
    public void b() {
        float f2;
        View view = this.itemView;
        l.b(view, "");
        if (this.f103273i) {
            f2 = 0.34f;
        } else {
            f2 = 1.0f;
        }
        view.setAlpha(f2);
    }

    public final void a() {
        TuxCheckBox tuxCheckBox = this.f103272h;
        if (tuxCheckBox != null) {
            ViewGroup.LayoutParams layoutParams = tuxCheckBox.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i2 = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginStart(this.f103274j);
            marginLayoutParams.leftMargin = this.f103274j;
            this.f103272h.setLayoutParams(marginLayoutParams);
        }
    }

    public final void a(boolean z) {
        this.f103273i = z;
        b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        View findViewById = this.itemView.findViewById(R.id.adh);
        this.f103266b = findViewById;
        AvatarImageView avatarImageView = (AvatarImageView) this.itemView.findViewById(R.id.pf);
        this.f103267c = avatarImageView;
        TuxCheckBox tuxCheckBox = (TuxCheckBox) this.itemView.findViewById(R.id.a5_);
        this.f103272h = tuxCheckBox;
        View view2 = this.itemView;
        l.b(view2, "");
        this.f103274j = (int) n.b(view2.getContext(), 16.0f);
        View view3 = this.itemView;
        l.b(view3, "");
        this.f103275k = (int) n.b(view3.getContext(), -24.0f);
        if (findViewById != null) {
            View view4 = this.itemView;
            l.b(view4, "");
            findViewById.setBackground(c.c(view4.getContext()));
            findViewById.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f103276a;

                static {
                    Covode.recordClassIndex(66195);
                }

                {
                    this.f103276a = r1;
                }

                public final void onClick(View view) {
                    q<? super Integer, ? super Integer, ? super View, z> qVar;
                    ClickAgent.onClick(view);
                    if (!b.a(view, 500) && (qVar = this.f103276a.f103265a) != null) {
                        Integer valueOf = Integer.valueOf(this.f103276a.getAdapterPosition());
                        l.b(view, "");
                        qVar.invoke(2, valueOf, view);
                    }
                }
            });
        }
        if (avatarImageView != null) {
            avatarImageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f103277a;

                static {
                    Covode.recordClassIndex(66196);
                }

                {
                    this.f103277a = r1;
                }

                public final void onClick(View view) {
                    q<? super Integer, ? super Integer, ? super View, z> qVar;
                    ClickAgent.onClick(view);
                    if (!b.a(view, 500) && (qVar = this.f103277a.f103265a) != null) {
                        Integer valueOf = Integer.valueOf(this.f103277a.getAdapterPosition());
                        l.b(view, "");
                        qVar.invoke(1, valueOf, view);
                    }
                }
            });
        }
        if (tuxCheckBox != null) {
            tuxCheckBox.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f103278a;

                static {
                    Covode.recordClassIndex(66197);
                }

                {
                    this.f103278a = r1;
                }

                public final void onClick(View view) {
                    q<? super Integer, ? super Integer, ? super View, z> qVar;
                    ClickAgent.onClick(view);
                    if (!b.a(view, 500) && (qVar = this.f103278a.f103265a) != null) {
                        Integer valueOf = Integer.valueOf(this.f103278a.getAdapterPosition());
                        l.b(view, "");
                        qVar.invoke(0, valueOf, view);
                    }
                }
            });
        }
    }
}
