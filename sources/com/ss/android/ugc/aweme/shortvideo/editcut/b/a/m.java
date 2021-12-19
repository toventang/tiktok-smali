package com.ss.android.ugc.aweme.shortvideo.editcut.b.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.ah;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.n;
import com.ss.android.ugc.tools.view.widget.AVStatusView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;

public final class m extends a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f128176a = {new y(m.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new y(m.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    AVStatusView f128177b;

    /* renamed from: c  reason: collision with root package name */
    final d f128178c = com.bytedance.o.b.a.a(getDiContainer(), n.class);

    /* renamed from: d  reason: collision with root package name */
    private final d f128179d = com.bytedance.o.b.a.a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: e  reason: collision with root package name */
    private final String f128180e = "StickPointStatusScene";

    static {
        Covode.recordClassIndex(84012);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.d
    public final String a() {
        return this.f128180e;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f128181a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f128182b;

        static {
            Covode.recordClassIndex(84014);
        }

        b(m mVar, ViewGroup viewGroup) {
            this.f128181a = mVar;
            this.f128182b = viewGroup;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m mVar = this.f128181a;
            ((n) mVar.f128178c.a(mVar, m.f128176a[0])).x();
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        f.a.b.b unused = ((EditAdjustClipsBottomViewModel) this.f128179d.a(this, f128176a[1])).a(this, n.f128183a, new ah(), new a(this));
    }

    static final class a extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(84013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == -1) {
                AVStatusView aVStatusView = this.this$0.f128177b;
                if (aVStatusView == null) {
                    l.a("statusView");
                }
                aVStatusView.d();
            } else if (intValue == 0) {
                AVStatusView aVStatusView2 = this.this$0.f128177b;
                if (aVStatusView2 == null) {
                    l.a("statusView");
                }
                aVStatusView2.b();
            } else if (intValue == 1) {
                m mVar = this.this$0;
                AVStatusView aVStatusView3 = mVar.f128177b;
                if (aVStatusView3 == null) {
                    l.a("statusView");
                }
                aVStatusView3.a();
                mVar.d();
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar, bVar, R.id.b4i);
        l.d(fVar, "");
        l.d(bVar, "");
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(1630);
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        AVStatusView aVStatusView = new AVStatusView(viewGroup.getContext());
        aVStatusView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View inflate = LayoutInflater.from(this.f42913m).inflate(R.layout.eq, (ViewGroup) null);
        inflate.findViewById(R.id.f61).setOnClickListener(new b(this, viewGroup));
        ((TextView) inflate.findViewById(R.id.f62)).setText(R.string.de2);
        AVStatusView.a a2 = AVStatusView.a.a(viewGroup.getContext()).a(R.string.de2).a(inflate);
        a2.f150227g = 1;
        aVStatusView.setBuilder(a2);
        this.f128177b = aVStatusView;
        MethodCollector.o(1630);
        return aVStatusView;
    }
}
