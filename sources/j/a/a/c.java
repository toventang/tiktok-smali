package j.a.a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class c<T, VH extends RecyclerView.ViewHolder> {

    /* renamed from: e  reason: collision with root package name */
    public f f158844e;

    static {
        Covode.recordClassIndex(105400);
    }

    /* access modifiers changed from: protected */
    public abstract VH a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public void a(VH vh) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(VH vh, T t);

    public void b(VH vh) {
    }

    public void c(VH vh) {
    }

    public void a(VH vh, T t, List<Object> list) {
        a(vh, t);
    }
}
