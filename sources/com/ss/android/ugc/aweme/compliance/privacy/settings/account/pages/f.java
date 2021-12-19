package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.f.b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;

public abstract class f extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f {

    /* renamed from: a  reason: collision with root package name */
    public final g f77716a;

    static {
        Covode.recordClassIndex(48117);
    }

    public abstract void a(TuxTextCell tuxTextCell);

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f
    public final int b() {
        return R.layout.up;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
    public final boolean c() {
        i iVar = this.f77716a.f77733k;
        if (iVar != null) {
            return iVar.c();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
    public final boolean d() {
        i iVar = this.f77716a.f77733k;
        if (iVar != null) {
            return iVar.d();
        }
        return true;
    }

    public f(g gVar) {
        l.d(gVar, "");
        this.f77716a = gVar;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(h hVar, int i2) {
        CharSequence charSequence;
        int i3;
        l.d(hVar, "");
        View view = hVar.itemView;
        l.b(view, "");
        Context context = view.getContext();
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bry);
        String str = this.f77716a.f77724b;
        String str2 = null;
        if (str == null) {
            Integer num = this.f77716a.f77723a;
            if (num != null) {
                str = context.getString(num.intValue());
            } else {
                str = null;
            }
        }
        tuxTextCell.setTitle(str);
        a<? extends CharSequence> aVar = this.f77716a.f77727e;
        if ((aVar == null || (charSequence = (CharSequence) aVar.invoke()) == null) && (charSequence = this.f77716a.f77726d) == null) {
            Integer num2 = this.f77716a.f77725c;
            if (num2 != null) {
                str2 = context.getString(num2.intValue());
            }
            charSequence = str2;
        }
        tuxTextCell.setSubtitle(charSequence);
        if (charSequence instanceof Spannable) {
            View findViewById = tuxTextCell.findViewById(R.id.eej);
            l.b(findViewById, "");
            ((TuxTextView) findViewById).setMovementMethod(b.f45048a);
        }
        l.b(tuxTextCell, "");
        a(tuxTextCell);
        tuxTextCell.setCellEnabled(c());
        if (d()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        tuxTextCell.setVisibility(i3);
    }
}
