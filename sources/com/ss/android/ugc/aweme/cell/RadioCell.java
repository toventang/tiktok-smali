package com.ss.android.ugc.aweme.cell;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.be.g;
import com.ss.android.ugc.aweme.be.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class RadioCell extends TuxCell<g, c.i> {
    static {
        Covode.recordClassIndex(43060);
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ RadioCell this$0;

        static {
            Covode.recordClassIndex(43062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RadioCell radioCell) {
            super(0);
            this.this$0 = radioCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            View.OnClickListener onClickListener;
            g gVar = (g) this.this$0.f34234d;
            if (!(gVar == null || (onClickListener = gVar.f68598m) == null)) {
                View view = this.this$0.itemView;
                l.b(view, "");
                onClickListener.onClick(view.findViewById(R.id.a3i));
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    public void a(g gVar) {
        l.d(gVar, "");
        super.a((i) gVar);
        c.e eVar = (c.e) ((TuxCell) this).f69833a;
        if (eVar != null) {
            eVar.c(gVar.f68588c);
        }
    }

    /* Return type fixed from 'com.bytedance.tux.table.cell.c$b' to match base method */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final /* synthetic */ c.i a(Context context) {
        l.d(context, "");
        c.i iVar = new c.i(context);
        iVar.a(new a(this));
        iVar.a(new b(this));
        return iVar;
    }

    static final class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RadioCell f69827a;

        static {
            Covode.recordClassIndex(43061);
        }

        a(RadioCell radioCell) {
            this.f69827a = radioCell;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
            g gVar = (g) this.f69827a.f34234d;
            if (gVar != null && (onCheckedChangeListener = gVar.f68589d) != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }
}
