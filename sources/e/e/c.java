package e.e;

import android.view.View;
import com.bytedance.android.live.base.model.emoji.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f157053a;

    /* renamed from: b  reason: collision with root package name */
    private final a f157054b;

    static {
        Covode.recordClassIndex(104298);
    }

    c(b bVar, a aVar) {
        this.f157053a = bVar;
        this.f157054b = aVar;
    }

    public final void onClick(View view) {
        b bVar = this.f157053a;
        a aVar = this.f157054b;
        if (bVar.f157051a != null) {
            bVar.f157051a.a(aVar);
        }
    }
}
