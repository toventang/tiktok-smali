package d.a.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.Writer;

public class m implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Writer f156636a;

    static {
        Covode.recordClassIndex(104000);
    }

    @Override // d.a.d.a.k
    public final void a() {
        this.f156636a.close();
    }

    public m(Writer writer) {
        l.c(writer, "");
        this.f156636a = writer;
    }

    public final void a(CharSequence charSequence) {
        l.c(charSequence, "");
        this.f156636a.append(charSequence);
    }

    public final void a(String str) {
        MethodCollector.i(6889);
        l.c(str, "");
        this.f156636a.write(str);
        MethodCollector.o(6889);
    }
}
