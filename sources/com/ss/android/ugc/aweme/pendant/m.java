package com.ss.android.ugc.aweme.pendant;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class m extends h {
    public static final a u = new a((byte) 0);
    private final SmartImageView A;
    private final SmartImageView B;
    private List<String> v;
    private List<String> w;
    private final SmartImageView x;
    private final SmartImageView y;
    private ValueAnimator z;

    static {
        Covode.recordClassIndex(73814);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73817);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.a
    public final void c() {
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.h, com.ss.android.ugc.aweme.pendant.n
    public final void a(k kVar) {
        l.d(kVar, "");
        super.a(kVar);
        List<String> list = kVar.f114710f;
        if (list == null) {
            list = z.INSTANCE;
        }
        this.v = list;
        List<String> list2 = kVar.f114711g;
        if (list2 == null) {
            list2 = z.INSTANCE;
        }
        this.w = list2;
        List<String> list3 = this.v;
        if (list3 == null) {
            l.a("bigPngUrlList");
        }
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            r.c(r.a((String) it.next()).b());
        }
        List<String> list4 = this.w;
        if (list4 == null) {
            l.a("smallPngUrlList");
        }
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            r.c(r.a((String) it2.next()).b());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, View view3, final i iVar) {
        super(context, view, smartImageView, smartImageView2, view2, view3, iVar);
        l.d(context, "");
        l.d(view, "");
        l.d(smartImageView, "");
        l.d(smartImageView2, "");
        l.d(view2, "");
        l.d(view3, "");
        l.d(iVar, "");
        this.A = smartImageView;
        this.B = smartImageView2;
        View findViewById = view.findViewById(R.id.ta);
        l.b(findViewById, "");
        SmartImageView smartImageView3 = (SmartImageView) findViewById;
        this.x = smartImageView3;
        View findViewById2 = view.findViewById(R.id.e6f);
        l.b(findViewById2, "");
        SmartImageView smartImageView4 = (SmartImageView) findViewById2;
        this.y = smartImageView4;
        smartImageView3.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.pendant.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(73815);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h.f.a.a<h.z> aVar = iVar.f114672c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        smartImageView4.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.pendant.m.AnonymousClass2 */

            static {
                Covode.recordClassIndex(73816);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                h.f.a.a<h.z> aVar = iVar.f114672c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        ValueAnimator ofInt = ValueAnimator.ofInt(0);
        l.b(ofInt, "");
        this.z = ofInt;
    }
}
