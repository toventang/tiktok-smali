package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: a  reason: collision with root package name */
    protected final j f50018a;

    static {
        Covode.recordClassIndex(31215);
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
    }

    public void b(Bundle bundle) {
    }

    public void c() {
    }

    public void d() {
    }

    public final Activity a() {
        return this.f50018a.a();
    }

    public LifecycleCallback(j jVar) {
        this.f50018a = jVar;
    }

    private static j getChimeraLifecycleFragmentImpl(i iVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static j a(Activity activity) {
        return a(new i(activity));
    }

    protected static j a(i iVar) {
        if (iVar.f50262a instanceof e) {
            return cz.a((e) iVar.f50262a);
        }
        if (iVar.f50262a instanceof Activity) {
            return cw.a((Activity) iVar.f50262a);
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
