package e.e;

import android.view.View;
import com.bytedance.android.live.base.model.emoji.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final d f157057a;

    /* renamed from: b  reason: collision with root package name */
    private final a f157058b;

    static {
        Covode.recordClassIndex(104300);
    }

    e(d dVar, a aVar) {
        this.f157057a = dVar;
        this.f157058b = aVar;
    }

    public final void onClick(View view) {
        d dVar = this.f157057a;
        a aVar = this.f157058b;
        if (dVar.f157055a != null) {
            dVar.f157055a.a(aVar);
        }
    }
}
