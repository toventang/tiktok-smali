package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.io.File;

public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private Context f49196a;

    /* renamed from: b  reason: collision with root package name */
    private int f49197b;

    /* renamed from: c  reason: collision with root package name */
    private c f49198c;

    static {
        Covode.recordClassIndex(30758);
    }

    @Override // com.facebook.soloader.i
    public final String toString() {
        return this.f49198c.toString();
    }

    public final boolean a() {
        try {
            File file = this.f49198c.f49199b;
            Context context = this.f49196a;
            Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            this.f49197b |= 1;
            c cVar = new c(file2, this.f49197b);
            this.f49198c = cVar;
            cVar.a(this.f49197b);
            this.f49196a = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.i
    public final void a(int i2) {
        this.f49198c.a(i2);
    }

    public b(Context context, int i2) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f49196a = applicationContext;
        if (applicationContext == null) {
            this.f49196a = context;
        }
        this.f49197b = i2;
        this.f49198c = new c(new File(this.f49196a.getApplicationInfo().nativeLibraryDir), i2);
    }

    @Override // com.facebook.soloader.i
    public final int a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        return this.f49198c.a(str, i2, threadPolicy);
    }
}
