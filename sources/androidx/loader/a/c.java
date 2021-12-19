package androidx.loader.a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c<D> {
    public int n;
    public b<D> o;
    public Context p;
    public boolean q;
    public boolean r;
    public boolean s = true;
    boolean t;
    boolean u;

    public interface b<D> {
        static {
            Covode.recordClassIndex(1358);
        }

        void a(D d2);
    }

    static {
        Covode.recordClassIndex(1356);
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    public final void l() {
        a();
    }

    public final boolean k() {
        return b();
    }

    public final void m() {
        this.q = false;
        h();
    }

    public final void j() {
        this.q = true;
        this.s = false;
        this.r = false;
        g();
    }

    public final void n() {
        i();
        this.s = true;
        this.q = false;
        this.r = false;
        this.t = false;
        this.u = false;
    }

    public void o() {
        if (this.q) {
            a();
        } else {
            this.t = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.g.b.a(this, sb);
        sb.append(" id=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }

    public final class a extends ContentObserver {
        static {
            Covode.recordClassIndex(1357);
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            c.this.o();
        }

        public a() {
            super(new Handler());
        }
    }

    public void b(D d2) {
        b<D> bVar = this.o;
        if (bVar != null) {
            bVar.a(d2);
        }
    }

    public c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.p = applicationContext;
    }

    public static String c(D d2) {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.g.b.a(d2, sb);
        sb.append("}");
        return sb.toString();
    }

    public final void a(b<D> bVar) {
        b<D> bVar2 = this.o;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.o = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.n);
        printWriter.print(" mListener=");
        printWriter.println(this.o);
        if (this.q || this.t || this.u) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.q);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.t);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.u);
        }
        if (this.r || this.s) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.r);
            printWriter.print(" mReset=");
            printWriter.println(this.s);
        }
    }
}
