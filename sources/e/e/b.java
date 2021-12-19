package e.e;

import android.view.View;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import e.c.a;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    a f157051a;

    /* renamed from: b  reason: collision with root package name */
    private final HSImageView f157052b;

    static {
        Covode.recordClassIndex(104297);
    }

    @Override // e.e.a
    public final void a(a aVar) {
        this.f157051a = aVar;
    }

    public b(View view) {
        super(view);
        this.f157052b = (HSImageView) view.findViewById(R.id.av7);
    }

    @Override // e.e.a
    public final void a(com.bytedance.android.live.base.model.emoji.a aVar) {
        if (aVar != null) {
            if (aVar.f7402f != 0) {
                this.f157052b.setImageResource(aVar.f7402f);
            }
            this.itemView.setOnClickListener(new c(this, aVar));
        }
    }
}
