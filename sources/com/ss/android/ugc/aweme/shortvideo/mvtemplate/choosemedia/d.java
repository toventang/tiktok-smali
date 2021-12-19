package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;

public final class d extends ConstraintLayout {

    /* renamed from: h  reason: collision with root package name */
    public static final a f129131h = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public h.f.a.a<z> f129132g;

    static {
        Covode.recordClassIndex(84750);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84752);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final int getBottomMargin() {
        if (n.b(1, 4, 2, 5).contains(Integer.valueOf(com.ss.android.ugc.aweme.adaptation.a.f66177a.a()))) {
            return en.a(33.0d, i.f115645a);
        }
        return 0;
    }

    public final void setConfirmCallBack(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f129132g = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        ViewGroup.LayoutParams layoutParams;
        l.d(context, "");
        ConstraintLayout.a aVar = null;
        MethodCollector.i(9853);
        View inflate = LayoutInflater.from(context).inflate(R.layout.cx, this);
        int a2 = (int) (com.ss.android.ugc.aweme.setting.d.a() / 60000);
        View findViewById = inflate.findViewById(R.id.bdl);
        TuxTextView tuxTextView = (TuxTextView) (!(findViewById instanceof TuxTextView) ? null : findViewById);
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(a2) + ":00");
        }
        View findViewById2 = inflate.findViewById(R.id.bdn);
        TuxTextView tuxTextView2 = (TuxTextView) (!(findViewById2 instanceof TuxTextView) ? null : findViewById2);
        if (tuxTextView2 != null) {
            tuxTextView2.setText(context.getResources().getQuantityString(R.plurals.fa, a2, Integer.valueOf(a2)));
        }
        View findViewById3 = inflate.findViewById(R.id.bdm);
        TuxTextView tuxTextView3 = (TuxTextView) (!(findViewById3 instanceof TuxTextView) ? null : findViewById3);
        if (tuxTextView3 != null) {
            tuxTextView3.setText(context.getResources().getQuantityString(R.plurals.f_, a2, Integer.valueOf(a2)));
        }
        View findViewById4 = inflate.findViewById(R.id.bdj);
        TuxButton tuxButton = (TuxButton) (!(findViewById4 instanceof TuxButton) ? null : findViewById4);
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new com.ss.android.ugc.aweme.views.d(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f129133a;

                static {
                    Covode.recordClassIndex(84751);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f129133a = r1;
                }

                @Override // com.ss.android.ugc.aweme.views.d
                public final void a(View view) {
                    h.f.a.a<z> aVar = this.f129133a.f129132g;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            });
        }
        View findViewById5 = inflate.findViewById(R.id.adh);
        ConstraintLayout constraintLayout = (ConstraintLayout) (!(findViewById5 instanceof ConstraintLayout) ? null : findViewById5);
        if (constraintLayout != null) {
            layoutParams = constraintLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ConstraintLayout.a aVar2 = layoutParams instanceof ConstraintLayout.a ? layoutParams : aVar;
        if (aVar2 != null) {
            aVar2.bottomMargin += getBottomMargin();
            constraintLayout.setLayoutParams(aVar2);
        }
        MethodCollector.o(9853);
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }
}
