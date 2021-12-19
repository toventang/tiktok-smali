package com.ss.android.ugc.tools.view.widget.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class e {
    static {
        Covode.recordClassIndex(98906);
    }

    public static final class a extends m implements h.f.a.b<ViewGroup, c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f150375a = new a();

        static {
            Covode.recordClassIndex(98907);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            Context context = viewGroup2.getContext();
            l.b(context, "");
            return new c(context, (byte) 0);
        }
    }

    public static final c a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        l.b(context, "");
        return new c(context, (byte) 0);
    }

    public static final class b extends m implements h.f.a.b<ViewGroup, TextView> {
        final /* synthetic */ h.f.a.b $configureEmptyView = null;

        static {
            Covode.recordClassIndex(98908);
        }

        public b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TextView invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            h.f.a.b bVar = this.$configureEmptyView;
            l.d(viewGroup2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.b3x, viewGroup2, false);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) a2;
            textView.setGravity(17);
            if (bVar != null) {
                bVar.invoke(textView);
            }
            return textView;
        }
    }

    public static final class c extends m implements h.f.a.b<ViewGroup, TextView> {
        final /* synthetic */ h.f.a.b $configureErrorView;

        static {
            Covode.recordClassIndex(98909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.f.a.b bVar) {
            super(1);
            this.$configureErrorView = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ TextView invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            h.f.a.b bVar = this.$configureErrorView;
            l.d(viewGroup2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.b3y, viewGroup2, false);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) a2;
            textView.setText(R.string.cyt);
            textView.setGravity(17);
            if (bVar != null) {
                bVar.invoke(textView);
            }
            return textView;
        }
    }

    public static final View a(ViewGroup viewGroup, h.f.a.m<? super TextView, ? super TextView, z> mVar) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3v, viewGroup, false);
        View findViewById = a2.findViewById(R.id.f9l);
        View findViewById2 = a2.findViewById(R.id.eyc);
        if (mVar != null) {
            l.b(findViewById, "");
            l.b(findViewById2, "");
            mVar.invoke(findViewById, findViewById2);
        }
        l.b(a2, "");
        return a2;
    }

    public static final View a(ViewGroup viewGroup, q<? super TextView, ? super TextView, ? super TextView, z> qVar) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3w, viewGroup, false);
        View findViewById = a2.findViewById(R.id.f9l);
        View findViewById2 = a2.findViewById(R.id.eyc);
        View findViewById3 = a2.findViewById(R.id.ewd);
        if (qVar != null) {
            l.b(findViewById, "");
            l.b(findViewById2, "");
            l.b(findViewById3, "");
            qVar.invoke(findViewById, findViewById2, findViewById3);
        }
        l.b(a2, "");
        return a2;
    }
}
