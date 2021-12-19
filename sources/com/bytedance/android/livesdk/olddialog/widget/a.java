package com.bytedance.android.livesdk.olddialog.widget;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.service.c.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a {

    /* renamed from: a  reason: collision with root package name */
    List<u> f20143a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdk.olddialog.viewmodel.a f20144b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC0410a f20145c;

    /* renamed from: d  reason: collision with root package name */
    View f20146d = null;

    /* renamed from: e  reason: collision with root package name */
    int f20147e;

    /* renamed from: f  reason: collision with root package name */
    public DataChannel f20148f = null;

    /* renamed from: com.bytedance.android.livesdk.olddialog.widget.a$a  reason: collision with other inner class name */
    public interface AbstractC0410a {
        static {
            Covode.recordClassIndex(11884);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(11882);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f20143a.size();
    }

    public final int a() {
        List<u> list = this.f20143a;
        if (!(list == null || list.size() == 0)) {
            for (int i2 = 0; i2 < this.f20143a.size(); i2++) {
                if (this.f20143a.get(i2).f20175b == this.f20147e) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f20143a.get(i2).f20175b;
    }

    public final void a(List<u> list) {
        int i2;
        this.f20143a = list;
        com.bytedance.android.livesdk.olddialog.viewmodel.a aVar = this.f20144b;
        if (aVar == null || aVar.f20096b == null || this.f20144b.f20096b.getValue() == null) {
            i2 = 0;
        } else {
            i2 = this.f20144b.f20096b.getValue().intValue();
        }
        this.f20147e = i2;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof v) {
            v vVar = (v) viewHolder;
            vVar.a(this.f20143a.get(i2).f20174a, this.f20143a.get(i2).f20176c);
            vVar.f20178b.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.android.livesdk.olddialog.widget.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(11883);
                }

                public final void onClick(View view) {
                    a aVar = a.this;
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (intValue != aVar.f20147e) {
                        if (aVar.f20146d != null && (aVar.f20146d instanceof TextView)) {
                            ((TextView) aVar.f20146d).setTextColor(Color.parseColor("#88FFFFFF"));
                        }
                        aVar.f20146d = view;
                        if (view instanceof TextView) {
                            ((TextView) view).setTextColor(Color.parseColor("#E6FFFFFF"));
                        }
                        aVar.f20144b.f20096b.setValue(Integer.valueOf(intValue));
                        aVar.f20147e = intValue;
                        if (intValue == 5) {
                            aVar.f20145c.a(false);
                        } else {
                            aVar.f20145c.a(true);
                        }
                        for (u uVar : aVar.f20143a) {
                            if (uVar.f20175b == intValue) {
                                e.b(uVar.f20174a);
                                return;
                            }
                        }
                    }
                }
            });
            if (((Integer) vVar.f20178b.getTag()).intValue() == this.f20147e) {
                this.f20146d = vVar.f20178b;
                vVar.f20178b.setTextColor(Color.parseColor("#E6FFFFFF"));
                return;
            }
            vVar.f20178b.setTextColor(Color.parseColor("#88FFFFFF"));
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(10097);
        LiveTextView liveTextView = new LiveTextView(viewGroup.getContext());
        liveTextView.setTextSize(14.0f);
        liveTextView.setGravity(17);
        liveTextView.setTag(Integer.valueOf(i2));
        RecyclerView.j jVar = new RecyclerView.j(-2, -2);
        jVar.rightMargin = y.a(16.0f);
        liveTextView.setLayoutParams(jVar);
        v vVar = new v(liveTextView);
        try {
            if (vVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(vVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) vVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(vVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = vVar.getClass().getName();
        MethodCollector.o(10097);
        return vVar;
    }
}
