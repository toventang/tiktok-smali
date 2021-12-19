package com.ss.android.ugc.aweme.relation.recommend;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f120409b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final View f120410a;

    static {
        Covode.recordClassIndex(78358);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78359);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
        this.f120410a = view;
        View view2 = this.itemView;
        l.b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        marginLayoutParams.bottomMargin = h.g.a.a(TypedValue.applyDimension(1, 28.0f, system.getDisplayMetrics()));
        View view3 = this.itemView;
        l.b(view3, "");
        view3.setLayoutParams(marginLayoutParams);
    }
}
