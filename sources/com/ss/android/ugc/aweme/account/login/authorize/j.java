package com.ss.android.ugc.aweme.account.login.authorize;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.b;
import com.ss.android.ugc.aweme.account.login.twostep.e;
import com.ss.android.ugc.aweme.account.login.twostep.q;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.List;

public final class j extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f63364a;

    /* renamed from: b  reason: collision with root package name */
    public final l f63365b;

    static {
        Covode.recordClassIndex(39052);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return i2 == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f63364a.size() + 1;
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final View f63366a;

        /* renamed from: b  reason: collision with root package name */
        final TextView f63367b;

        /* renamed from: c  reason: collision with root package name */
        final View f63368c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f63369d;

        static {
            Covode.recordClassIndex(39053);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.j$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC1408a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f63370a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f63371b;

            static {
                Covode.recordClassIndex(39054);
            }

            View$OnClickListenerC1408a(a aVar, e eVar) {
                this.f63370a = aVar;
                this.f63371b = eVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                q.b("device_remove", this.f63370a.f63369d.f63365b.a());
                String a2 = this.f63370a.f63369d.f63365b.a();
                String str = "";
                l.d(a2, str);
                r.a("authorized_logins_click", q.a().a("enter_from", a2).f66730a);
                View view2 = this.f63370a.itemView;
                l.b(view2, str);
                a.C0731a aVar = new a.C0731a(view2.getContext());
                View view3 = this.f63370a.itemView;
                l.b(view3, str);
                Context context = view3.getContext();
                Object[] objArr = new Object[1];
                String device_name = this.f63371b.getDevice_name();
                if (device_name != null) {
                    str = device_name;
                }
                objArr[0] = str;
                aVar.f33402b = context.getString(R.string.fby, objArr);
                aVar.a(R.string.dn, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.account.login.authorize.j.a.View$OnClickListenerC1408a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ View$OnClickListenerC1408a f63372a;

                    static {
                        Covode.recordClassIndex(39055);
                    }

                    {
                        this.f63372a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        q.b("confirm", "device_remove", this.f63372a.f63370a.f63369d.f63365b.a());
                        if (this.f63372a.f63371b.getDevice_id() != null) {
                            this.f63372a.f63370a.f63369d.f63365b.b();
                            String valueOf = String.valueOf(this.f63372a.f63371b.getDevice_id().longValue());
                            l.d(valueOf, "");
                            TwoStepAuthApi.a().removeAuthDevice(valueOf).a(new g(this) {
                                /* class com.ss.android.ugc.aweme.account.login.authorize.j.a.View$OnClickListenerC1408a.AnonymousClass1.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ AnonymousClass1 f63373a;

                                static {
                                    Covode.recordClassIndex(39056);
                                }

                                {
                                    this.f63373a = r1;
                                }

                                @Override // b.g
                                public final Object then(i<b> iVar) {
                                    Integer num;
                                    String str;
                                    this.f63373a.f63372a.f63370a.f63369d.f63365b.d();
                                    if (!ai.a(iVar)) {
                                        this.f63373a.f63372a.f63370a.f63369d.f63365b.a(null, "");
                                        q.a(this.f63373a.f63372a.f63370a.f63369d.f63365b.a(), false);
                                        return null;
                                    }
                                    l.b(iVar, "");
                                    b d2 = iVar.d();
                                    if (!p.a("success", d2.getMessage(), true) || d2.getData() == null) {
                                        b.a data = d2.getData();
                                        if (data != null) {
                                            num = data.getErrorCode();
                                        } else {
                                            num = null;
                                        }
                                        b.a data2 = d2.getData();
                                        if (data2 != null) {
                                            str = data2.getErrorDescription();
                                        } else {
                                            str = null;
                                        }
                                        this.f63373a.f63372a.f63370a.f63369d.f63365b.a(num, str);
                                        q.a(this.f63373a.f63372a.f63370a.f63369d.f63365b.a(), false);
                                        return null;
                                    }
                                    this.f63373a.f63372a.f63370a.f63369d.f63364a.remove(this.f63373a.f63372a.f63371b);
                                    this.f63373a.f63372a.f63370a.f63369d.notifyItemRemoved(this.f63373a.f63372a.f63370a.getAdapterPosition());
                                    if (this.f63373a.f63372a.f63370a.f63369d.f63364a.isEmpty()) {
                                        this.f63373a.f63372a.f63370a.f63369d.f63365b.c();
                                    }
                                    q.a(this.f63373a.f63372a.f63370a.f63369d.f63365b.a(), true);
                                    return z.f158842a;
                                }
                            }, i.f4826c, null);
                        }
                    }
                }, false).b(R.string.g6d, (DialogInterface.OnClickListener) null, false).a().c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, View view) {
            super(view);
            l.d(view, "");
            this.f63369d = jVar;
            this.f63366a = view.findViewById(R.id.ajp);
            this.f63367b = (TextView) view.findViewById(R.id.al8);
            this.f63368c = view.findViewById(R.id.eko);
        }
    }

    public j(List<e> list, l lVar) {
        l.d(list, "");
        l.d(lVar, "");
        this.f63364a = list;
        this.f63365b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        l.d(viewHolder, "");
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            e eVar = aVar.f63369d.f63364a.get(aVar.getAdapterPosition() - 1);
            TextView textView = aVar.f63367b;
            l.b(textView, "");
            String device_name = eVar.getDevice_name();
            if (device_name == null) {
                device_name = "";
            }
            textView.setText(device_name);
            String deviceId = DeviceRegisterManager.getDeviceId();
            Long device_id = eVar.getDevice_id();
            if (device_id != null) {
                str = String.valueOf(device_id.longValue());
            } else {
                str = null;
            }
            if (!TextUtils.equals(deviceId, str) || TextUtils.isEmpty(DeviceRegisterManager.getDeviceId())) {
                View view = aVar.f63368c;
                l.b(view, "");
                view.setVisibility(8);
            } else {
                View view2 = aVar.f63368c;
                l.b(view2, "");
                view2.setVisibility(0);
            }
            aVar.f63366a.setOnClickListener(new a.View$OnClickListenerC1408a(aVar, eVar));
        }
    }

    private static RecyclerView.ViewHolder a(j jVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(9163);
        l.d(viewGroup, "");
        if (i2 == 0) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.fr, viewGroup, false);
            l.b(a3, "");
            viewHolder = new k(a3);
        } else {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.fs, viewGroup, false);
            l.b(a4, "");
            viewHolder = new a(jVar, a4);
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
            com.ss.android.ugc.aweme.profile.ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(9163);
        return viewHolder;
    }
}
