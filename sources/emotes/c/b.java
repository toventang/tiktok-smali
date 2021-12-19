package emotes.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class b<D> extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(104329);
    }

    public abstract void a(D d2, int i2);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
    }
}
