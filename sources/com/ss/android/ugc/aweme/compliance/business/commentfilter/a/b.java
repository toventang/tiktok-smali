package com.ss.android.ugc.aweme.compliance.business.commentfilter.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final TextView f76860a;

    /* renamed from: b  reason: collision with root package name */
    public int f76861b;

    /* renamed from: c  reason: collision with root package name */
    public final View f76862c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f76863d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f76864e;

    static {
        Covode.recordClassIndex(47508);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, Context context, final h.f.a.b<? super Integer, z> bVar) {
        super(view);
        l.d(view, "");
        l.d(context, "");
        l.d(bVar, "");
        this.f76862c = view;
        this.f76863d = context;
        this.f76860a = (TextView) view.findViewById(R.id.ei5);
        ImageView imageView = (ImageView) view.findViewById(R.id.ajp);
        this.f76864e = imageView;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.compliance.business.commentfilter.a.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f76865a;

            static {
                Covode.recordClassIndex(47509);
            }

            {
                this.f76865a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                bVar.invoke(Integer.valueOf(this.f76865a.f76861b));
            }
        });
    }
}
