package e.f;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class a extends ConstraintLayout implements e.c.a {

    /* renamed from: g  reason: collision with root package name */
    public e.a.a f157059g;

    /* renamed from: h  reason: collision with root package name */
    public int f157060h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.android.live.e.a.a.a f157061i;

    static {
        Covode.recordClassIndex(104301);
    }

    private int getLayoutResource() {
        return R.layout.ben;
    }

    public final void setOnEmojiSelectListener(com.bytedance.android.live.e.a.a.a aVar) {
        this.f157061i = aVar;
    }

    @Override // e.c.a
    public final void a(com.bytedance.android.live.base.model.emoji.a aVar) {
        com.bytedance.android.live.e.a.a.a aVar2;
        if (aVar != null && (aVar2 = this.f157061i) != null) {
            aVar2.a(aVar);
        }
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(1308);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        MethodCollector.o(1308);
    }
}
