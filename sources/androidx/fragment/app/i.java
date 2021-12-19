package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class i {

    public interface a {
        static {
            Covode.recordClassIndex(1046);
        }

        String h();
    }

    public static abstract class b {
        static {
            Covode.recordClassIndex(1047);
        }

        public void onFragmentActivityCreated(i iVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(i iVar, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(i iVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(i iVar, Fragment fragment) {
        }

        public void onFragmentDetached(i iVar, Fragment fragment) {
        }

        public void onFragmentPaused(i iVar, Fragment fragment) {
        }

        public void onFragmentPreAttached(i iVar, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(i iVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(i iVar, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(i iVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(i iVar, Fragment fragment) {
        }

        public void onFragmentStopped(i iVar, Fragment fragment) {
        }

        public void onFragmentViewCreated(i iVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(i iVar, Fragment fragment) {
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(1048);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(1045);
    }

    public abstract Fragment.SavedState a(Fragment fragment);

    public abstract Fragment a(int i2);

    public abstract Fragment a(Bundle bundle, String str);

    public abstract Fragment a(String str);

    public abstract n a();

    public abstract void a(Bundle bundle, String str, Fragment fragment);

    public abstract void a(b bVar);

    public abstract void a(b bVar, boolean z);

    public abstract void a(c cVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void b(int i2);

    public abstract void b(c cVar);

    public abstract boolean b();

    public abstract a c(int i2);

    public abstract void c();

    public abstract boolean d();

    public abstract int e();

    public abstract List<Fragment> f();

    public abstract boolean g();

    public abstract boolean h();
}
