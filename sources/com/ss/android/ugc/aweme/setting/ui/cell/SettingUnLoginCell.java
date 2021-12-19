package com.ss.android.ugc.aweme.setting.ui.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.ss.android.ugc.aweme.setting.ui.b.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SettingUnLoginCell extends BaseCell<c> {
    static {
        Covode.recordClassIndex(80681);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        super.k();
        this.itemView.setOnClickListener(new a(this));
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingUnLoginCell f122899a;

        static {
            Covode.recordClassIndex(80682);
        }

        a(SettingUnLoginCell settingUnLoginCell) {
            this.f122899a = settingUnLoginCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            c cVar = (c) this.f122899a.f34234d;
            if (cVar != null && (onClickListener = cVar.f122855d) != null) {
                onClickListener.onClick(this.f122899a.itemView);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.az1, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}
