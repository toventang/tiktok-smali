package com.ss.android.ugc.aweme.setting.ui.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class SettingFooterCell extends BaseCell<com.ss.android.ugc.aweme.setting.ui.b.b> {

    /* renamed from: a  reason: collision with root package name */
    public TuxTextView f122894a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f122895b;

    /* renamed from: j  reason: collision with root package name */
    private RelativeLayout f122896j;

    static {
        Covode.recordClassIndex(80678);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        TuxTextView tuxTextView;
        super.k();
        RelativeLayout relativeLayout = this.f122896j;
        TuxTextView tuxTextView2 = null;
        if (relativeLayout != null) {
            tuxTextView = (TuxTextView) relativeLayout.findViewById(R.id.fdd);
        } else {
            tuxTextView = null;
        }
        this.f122894a = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new a(this));
        }
        RelativeLayout relativeLayout2 = this.f122896j;
        if (relativeLayout2 != null) {
            tuxTextView2 = (TuxTextView) relativeLayout2.findViewById(R.id.ff2);
        }
        this.f122895b = tuxTextView2;
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(new b(this));
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingFooterCell f122897a;

        static {
            Covode.recordClassIndex(80679);
        }

        a(SettingFooterCell settingFooterCell) {
            this.f122897a = settingFooterCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.setting.ui.b.b bVar = (com.ss.android.ugc.aweme.setting.ui.b.b) this.f122897a.f34234d;
            if (bVar != null && (onClickListener = bVar.f122846e) != null) {
                onClickListener.onClick(this.f122897a.f122894a);
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingFooterCell f122898a;

        static {
            Covode.recordClassIndex(80680);
        }

        b(SettingFooterCell settingFooterCell) {
            this.f122898a = settingFooterCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.setting.ui.b.b bVar = (com.ss.android.ugc.aweme.setting.ui.b.b) this.f122898a.f34234d;
            if (bVar != null && (onClickListener = bVar.f122847f) != null) {
                onClickListener.onClick(this.f122898a.f122895b);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(com.ss.android.ugc.aweme.setting.ui.b.b bVar) {
        l.d(bVar, "");
        super.a((com.ss.android.ugc.aweme.be.a) bVar);
        RelativeLayout relativeLayout = this.f122896j;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(bVar.f122845d);
        }
        TuxTextView tuxTextView = this.f122894a;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(bVar.f122849h);
        }
        TuxTextView tuxTextView2 = this.f122894a;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(bVar.f122850i);
        }
        TuxTextView tuxTextView3 = this.f122895b;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(bVar.f122848g);
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ayp, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f122896j = (RelativeLayout) a2;
        l.b(a2, "");
        return a2;
    }
}
