package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public class CoreComponentFactory extends AppComponentFactory {

    public interface a {
        static {
            Covode.recordClassIndex(644);
        }

        Object a();
    }

    static {
        Covode.recordClassIndex(643);
    }

    private static <T> T a(T t) {
        T t2;
        if (!(t instanceof a) || (t2 = (T) t.a()) == null) {
            return t;
        }
        return t2;
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
