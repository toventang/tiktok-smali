package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class HintCell extends PowerCell<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f102757a = new e("No results found");

    /* renamed from: b  reason: collision with root package name */
    public static final a f102758b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(65855);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(65854);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6v, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(e eVar) {
        e eVar2 = eVar;
        l.d(eVar2, "");
        View view = this.itemView;
        l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.aei);
        l.b(tuxTextView, "");
        tuxTextView.setText(eVar2.f102766a);
    }
}
