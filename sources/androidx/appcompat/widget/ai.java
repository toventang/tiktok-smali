package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ai extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1540a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static ArrayList<WeakReference<ai>> f1541b;

    /* renamed from: c  reason: collision with root package name */
    private final Resources f1542c;

    /* renamed from: d  reason: collision with root package name */
    private final Resources.Theme f1543d;

    public Resources getResources() {
        return this.f1542c;
    }

    public AssetManager getAssets() {
        return this.f1542c.getAssets();
    }

    static {
        Covode.recordClassIndex(467);
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1543d;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    public void setTheme(int i2) {
        Resources.Theme theme = this.f1543d;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }

    private ai(Context context) {
        super(context);
        if (aq.a()) {
            aq aqVar = new aq(this, context.getResources());
            this.f1542c = aqVar;
            Resources.Theme newTheme = aqVar.newTheme();
            this.f1543d = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1542c = new ak(this, context.getResources());
        this.f1543d = null;
    }

    public static Context a(Context context) {
        ai aiVar;
        if ((context instanceof ai) || (context.getResources() instanceof ak) || (context.getResources() instanceof aq) || (Build.VERSION.SDK_INT >= 21 && !aq.a())) {
            return context;
        }
        synchronized (f1540a) {
            ArrayList<WeakReference<ai>> arrayList = f1541b;
            if (arrayList == null) {
                f1541b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<ai> weakReference = f1541b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1541b.remove(size);
                    }
                }
                for (int size2 = f1541b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<ai> weakReference2 = f1541b.get(size2);
                    if (!(weakReference2 == null || (aiVar = weakReference2.get()) == null || aiVar.getBaseContext() != context)) {
                        return aiVar;
                    }
                }
            }
            ai aiVar2 = new ai(context);
            f1541b.add(new WeakReference<>(aiVar2));
            return aiVar2;
        }
    }
}
