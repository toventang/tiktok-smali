package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.shortvideo.publish.v;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class bi extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final CommonItemView f131490a;

    /* renamed from: b  reason: collision with root package name */
    final View f131491b;

    static {
        Covode.recordClassIndex(86132);
    }

    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final CommonItemView f131492a;

        /* renamed from: b  reason: collision with root package name */
        final View f131493b;

        static {
            Covode.recordClassIndex(86133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
            View findViewById = this.itemView.findViewById(R.id.aa3);
            l.b(findViewById, "");
            this.f131492a = (CommonItemView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.an3);
            l.b(findViewById2, "");
            this.f131493b = findViewById2;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bi$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC3419a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f131494a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f131495b;

            static {
                Covode.recordClassIndex(86134);
            }

            View$OnClickListenerC3419a(a aVar, v vVar) {
                this.f131494a = aVar;
                this.f131495b = vVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f131495b.f129891c != null && this.f131495b.f129892d) {
                    m<? super View, ? super CommonItemView, z> mVar = this.f131495b.f129891c;
                    if (mVar == null) {
                        l.b();
                    }
                    View view2 = this.f131494a.itemView;
                    l.b(view2, "");
                    mVar.invoke(view2, this.f131494a.f131492a);
                } else if (this.f131495b.f129890b != null) {
                    h.f.a.b<? super View, z> bVar = this.f131495b.f129890b;
                    if (bVar == null) {
                        l.b();
                    }
                    View view3 = this.f131494a.itemView;
                    l.b(view3, "");
                    bVar.invoke(view3);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bi(View view) {
        super(view);
        l.d(view, "");
        View findViewById = this.itemView.findViewById(R.id.aa3);
        l.b(findViewById, "");
        this.f131490a = (CommonItemView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.an3);
        l.b(findViewById2, "");
        this.f131491b = findViewById2;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f131496a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f131497b;

        static {
            Covode.recordClassIndex(86135);
        }

        b(bi biVar, v vVar) {
            this.f131496a = biVar;
            this.f131497b = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f131497b.f129891c == null || !this.f131497b.f129892d) {
                v vVar = this.f131497b;
                vVar.f129898j = !vVar.f129898j;
                this.f131496a.f131490a.setChecked(this.f131497b.f129898j);
                m<? super CommonItemView, ? super Boolean, z> mVar = this.f131497b.f129899k;
                if (mVar != null) {
                    mVar.invoke(this.f131496a.f131490a, Boolean.valueOf(this.f131497b.f129898j));
                }
                h.f.a.b<? super View, z> bVar = this.f131497b.f129890b;
                if (bVar != null) {
                    l.b(view, "");
                    bVar.invoke(view);
                    return;
                }
                return;
            }
            m<? super View, ? super CommonItemView, z> mVar2 = this.f131497b.f129891c;
            if (mVar2 == null) {
                l.b();
            }
            View view2 = this.f131496a.itemView;
            l.b(view2, "");
            mVar2.invoke(view2, this.f131496a.f131490a);
        }
    }
}
