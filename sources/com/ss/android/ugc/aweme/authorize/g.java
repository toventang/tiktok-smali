package com.ss.android.ugc.aweme.authorize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class g extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    final List<com.ss.android.ugc.aweme.openauthorize.a.g> f67200a = new ArrayList();

    static {
        Covode.recordClassIndex(41391);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f67200a.size();
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final CommonItemView f67203a;

        /* renamed from: b  reason: collision with root package name */
        private final View f67204b;

        static {
            Covode.recordClassIndex(41393);
        }

        static final class a implements DmtSettingSwitch.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.openauthorize.a.g f67206a;

            static {
                Covode.recordClassIndex(41395);
            }

            a(com.ss.android.ugc.aweme.openauthorize.a.g gVar) {
                this.f67206a = gVar;
            }

            @Override // com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch.a
            public final void a(boolean z) {
                this.f67206a.setEnabled(Boolean.valueOf(z));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
            this.f67204b = view;
            View findViewById = view.findViewById(R.id.dsy);
            l.b(findViewById, "");
            CommonItemView commonItemView = (CommonItemView) findViewById;
            this.f67203a = commonItemView;
            commonItemView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.authorize.g.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f67205a;

                static {
                    Covode.recordClassIndex(41394);
                }

                {
                    this.f67205a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f67205a.f67203a.setChecked(!this.f67205a.f67203a.d());
                }
            });
        }
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final TextView f67201a;

        /* renamed from: b  reason: collision with root package name */
        private final View f67202b;

        static {
            Covode.recordClassIndex(41392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
            this.f67202b = view;
            View findViewById = view.findViewById(R.id.dt0);
            l.b(findViewById, "");
            this.f67201a = (TextView) findViewById;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (this.f67200a.get(i2).getScopeRequired() == null || !l.a((Object) this.f67200a.get(i2).getScopeRequired(), (Object) true)) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof a) {
            com.ss.android.ugc.aweme.openauthorize.a.g gVar = this.f67200a.get(i2);
            l.d(gVar, "");
            ((a) viewHolder).f67201a.setText(gVar.getScopeDesc());
            return;
        }
        b bVar = (b) viewHolder;
        com.ss.android.ugc.aweme.openauthorize.a.g gVar2 = this.f67200a.get(i2);
        l.d(gVar2, "");
        bVar.f67203a.setLeftText(gVar2.getScopeDesc());
        if (gVar2.isEnabled() == null) {
            bVar.f67203a.setChecked(true);
        } else {
            CommonItemView commonItemView = bVar.f67203a;
            Boolean isEnabled = gVar2.isEnabled();
            if (isEnabled == null) {
                l.b();
            }
            commonItemView.setChecked(isEnabled.booleanValue());
        }
        DmtSettingSwitch switchRight = bVar.f67203a.getSwitchRight();
        if (switchRight != null) {
            switchRight.setOnCheckedChangeListener(new b.a(gVar2));
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(9766);
        l.d(viewGroup, "");
        if (i2 == 0) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aui, viewGroup, false);
            l.b(a3, "");
            viewHolder = new a(a3);
        } else {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.auj, viewGroup, false);
            l.b(a4, "");
            viewHolder = new b(a4);
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
        MethodCollector.o(9766);
        return viewHolder;
    }
}
