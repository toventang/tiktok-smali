package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.a.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.ui.ChecklistItemView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class FtcChecklistItemView extends ChecklistItemView {

    /* renamed from: b  reason: collision with root package name */
    private HashMap f65371b;

    static {
        Covode.recordClassIndex(40189);
    }

    public FtcChecklistItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.account.ui.ChecklistItemView
    public final View a(int i2) {
        if (this.f65371b == null) {
            this.f65371b = new HashMap();
        }
        View view = (View) this.f65371b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f65371b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.ui.ChecklistItemView
    public final void setDesc(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.a5g);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    @Override // com.ss.android.ugc.aweme.account.ui.ChecklistItemView
    public final void setVariant(ChecklistItemView.b bVar) {
        l.d(bVar, "");
        int i2 = b.f65431a[bVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            ((ImageView) a(R.id.a5f)).setImageResource(R.drawable.j5);
            ((TuxTextView) a(R.id.a5g)).setTextColor(f.b(getResources(), R.color.c5, null));
        } else if (i2 == 3) {
            ((ImageView) a(R.id.a5f)).setImageResource(R.drawable.j6);
            ((TuxTextView) a(R.id.a5g)).setTextColor(f.b(getResources(), R.color.bx, null));
        }
    }

    private /* synthetic */ FtcChecklistItemView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FtcChecklistItemView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
