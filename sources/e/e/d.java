package e.e;

import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import e.c.a;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    a f157055a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f157056b;

    static {
        Covode.recordClassIndex(104299);
    }

    @Override // e.e.a
    public final void a(a aVar) {
        this.f157055a = aVar;
    }

    public d(View view) {
        super(view);
        this.f157056b = (TextView) view.findViewById(R.id.fbq);
    }

    @Override // e.e.a
    public final void a(com.bytedance.android.live.base.model.emoji.a aVar) {
        if (aVar != null) {
            if (!m.a(aVar.f7397a)) {
                this.f157056b.setText(aVar.f7397a);
            }
            this.itemView.setOnClickListener(new e(this, aVar));
        }
    }
}
